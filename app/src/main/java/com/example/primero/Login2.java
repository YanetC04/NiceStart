package com.example.primero;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class Login2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);

        ImageView mGirl = findViewById(R.id.girl);
        Glide.with(this)
                .load(R.drawable.girl)
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