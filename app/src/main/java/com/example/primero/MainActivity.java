package com.example.primero;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    //  seleccion(R.id.like1, R.id.usuario1, R.id.txt1, R.raw.hmm);

    }
    private void openNopeople(){
        Intent intent = new Intent(MainActivity.this, Nopeople.class);
        startActivity(intent);
    }
/*
    private void seleccion(int i, int usId, int txtId, final int animacionId){
        final boolean[] like = {false};
        final LottieAnimationView likeaimagen = findViewById(i);
        final ImageView usuario = findViewById(usId);
        final TextView txt =  findViewById(txtId);

        final LinearLayout l = findViewById(usId);
        l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                like[0] = animacion(likeaimagen, animacionId, like[0]);
            }
        });
    }

    private boolean animacion(final LottieAnimationView imagen, int ai, final boolean like){
        if (!like){
            imagen.setAnimation(ai);
            imagen.playAnimation();
        }else{
            imagen.animate()
                    .alpha(0f)
                    .setDuration(200)
                    .setListener(new Animator.AnimatorListener() {
                        @Override
                        public void onAnimationStart(@NonNull Animator animation) {
                            imagen.setImageResource(R.drawable.corazon);
                            imagen.setAlpha(1f);
                        }

                        @Override
                        public void onAnimationEnd(@NonNull Animator animation) {

                        }

                        @Override
                        public void onAnimationCancel(@NonNull Animator animation) {

                        }

                        @Override
                        public void onAnimationRepeat(@NonNull Animator animation) {

                        }
                    });
        }
        return !like;
    }
*/

}