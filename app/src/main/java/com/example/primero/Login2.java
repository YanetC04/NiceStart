package com.example.primero;

import static com.bumptech.glide.load.resource.bitmap.TransformationUtils.circleCrop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;

public class Login2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);

        ImageView mGirl = findViewById(R.id.girl);
        Glide.with(this)
                //.load(R.drawable.girl)
                .load("https://images.unsplash.com/photo-1489424731084-a5d8b219a5bb?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1974&q=80")
           //     .circleCrop() // para poner las imagenes
                .centerCrop()
                .placeholder(new ColorDrawable(this.getResources().getColor(R.color.teal_200)))
                .transition(DrawableTransitionOptions.withCrossFade(2000))
                .into(mGirl);

    }

    public void openMain(View v){
        Intent intent = new Intent(Login2.this, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }

    //Metodo para el boton de registro ( activar el boton)
    public void openSignup(View v){
        Intent intent = new Intent(Login2.this, Register.class);
        startActivity(intent);
    }

}