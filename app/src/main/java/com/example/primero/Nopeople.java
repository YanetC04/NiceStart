package com.example.primero;

import androidx.appcompat.app.AppCompatActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Toast;

public class Nopeople extends AppCompatActivity {
    private WebView miVisorWeb;
    private SwipeRefreshLayout miSwipe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nopeople);

        //La vista dentro es un webview
        miVisorWeb = (WebView) findViewById(R.id.vistaweb);
        //scroll
        miSwipe = (SwipeRefreshLayout) findViewById(R.id.myswipe);

        // ESTABLECE UN ESCUCHADOR PARA EL GESTO "SWIPE TO REFRESH"
        miSwipe.setOnRefreshListener(mOnRefreshListener);

        // LA configuracion de WebView
        WebSettings webSettings = miVisorWeb.getSettings();
        //carga General
        webSettings.setLoadWithOverviewMode(true);
        webSettings.setUseWideViewPort(true);
        //carga la Url
        miVisorWeb.loadUrl("https://thispersondoesnotexist.com");
/*
        WebView mycontext = (WebView) findViewById(R.id.vistaweb);
        // swipeLayout.setOnRefreshListener(mOnRefreshListener);
        registerForContextMenu(mycontext);
        // DENTRO del Oncreate
        // cast al Layout SwipeRefresh con el que rodeamos la vista
        // en el xml y le colocamos un listener
        miSwipe = (SwipeRefreshLayout) findViewById(R.id.myswipe);
*/
    }
    // METODO LLAMADO AL REALIZAR EL GESTO
    protected SwipeRefreshLayout.OnRefreshListener mOnRefreshListener = new SwipeRefreshLayout.OnRefreshListener() {
        @Override
        public void onRefresh() {
            // MUESTRA UN TOAST CON UN MENSAJE
            Toast toast = Toast.makeText(Nopeople.this, "Hi there! I dont exist :", Toast.LENGTH_LONG);
            toast.show();
            // RECARGA LA PÁGINA EN WebView
            miVisorWeb.reload();
            // DETIENE LA ANIMACIÓN DE "SWIPE TO REFRESH"
            miSwipe.setRefreshing(false);
        }
    };
}