package com.example.jabas;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView webView = findViewById(R.id.webview);

        // Obtén las configuraciones del WebView
        WebSettings webSettings = webView.getSettings();

        // Habilita o deshabilita JavaScript según sea necesario
        webSettings.setJavaScriptEnabled(true); // true para habilitar JavaScript, false para deshabilitarlo

        // Carga la URL en el WebView
        webView.loadUrl("https://script.google.com/macros/s/AKfycbzeKN3e2rDwi7UIR4pRYkNFSqOTCETn9kD79qaL55lXnkNhXARLdpjOUyQeNk01P5xoPw/exec");
    }
}
