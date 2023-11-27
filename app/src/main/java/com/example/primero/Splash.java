package com.example.primero;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class Splash extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        openApp();
        // la importacion del logo
        ImageView logo = findViewById(R.id.logosplash);

        //    Glide for loading girls
        ImageView mSea = findViewById(R.id.fondo);

        Glide.with(this)
                .load("https://images.unsplash.com/photo-1565214975484-3cfa9e56f914?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1482&q=80")
//                .load(R.drawable.girl)
                //             .transition(DrawableTransitionOptions.withCrossFade(100))
                .centerCrop()
//                .diskCacheStrategy(DiskCacheStrategy.ALL)
                //        .placeholder(new ColorDrawable(this.getResources().getColor(R.color.teal_200)))
//                .circleCrop()
                .into(mSea);

        //Animacion
        Animation a = AnimationUtils.loadAnimation(this, R.anim.blink);
        logo.startAnimation(a);

    }


    private void openApp() {

        Handler handler = new Handler();
        handler.postDelayed(new Runnable()
        {
            @Override
            public void run() {
                Intent intent = new Intent(Splash
                        .this, Login2.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);

            }
        }, 5000);
    }
}



