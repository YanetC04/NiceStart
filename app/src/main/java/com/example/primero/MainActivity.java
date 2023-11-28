package com.example.primero;


import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {

    private static final int NUMERO_LIKES = 3; // Actualiza con el número de elementos

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LottieAnimationView[] likeaimagenes = {
                findViewById(R.id.like1),
                findViewById(R.id.like2),
                findViewById(R.id.like3)
        };

        int[] usuarioIds = {R.id.usuario1, R.id.usuario2, R.id.usuario3};
        int[] txtIds = {R.id.txt1, R.id.txt2, R.id.txt3};

        // Configurar la interactividad de los corazones
        seleccion(likeaimagenes, usuarioIds, txtIds, R.raw.hmm);
    }

    private void seleccion(final LottieAnimationView[] likeaimagenes, final int[] usuarioIds, final int[] txtIds, final int animacionId) {
        for (int i = 0; i < likeaimagenes.length; i++) {
            final int currentIndex = i;
            likeaimagenes[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    boolean nuevoEstado = (likeaimagenes[currentIndex].getTag() == null) || !(boolean) likeaimagenes[currentIndex].getTag();
                    animacion(likeaimagenes[currentIndex], animacionId, nuevoEstado);
                    likeaimagenes[currentIndex].setTag(nuevoEstado);
                }
            });
        }
    }

    private void animacion(final LottieAnimationView animacionView, int animacionId, final boolean like) {
        // Verificar el estado actual (like/no like)
        if (like) {
            // Configurar y reproducir la animación de Lottie
            animacionView.setAnimation(animacionId);
            animacionView.playAnimation();
        } else {
            // Detener la animación y mostrar la imagen estática del corazón
            animacionView.clearAnimation(); // Detener la animación actual
            animacionView.setImageResource(R.drawable.corazon);
        }
    }

    public void openNopeople(View v){
        Intent intent = new Intent(MainActivity.this, Nopeople.class);
        startActivity(intent);
    }
    public void openLogin2(View v){
        Intent intent = new Intent(MainActivity.this, Login2.class);
        startActivity(intent);
    }
}
