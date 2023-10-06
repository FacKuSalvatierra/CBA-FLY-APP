package com.example.cba_fly_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ActWebView extends AppCompatActivity {
    WebView wbvw;
    String urlcba = "https://cbafly-3f52e.web.app/contacto";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_web_view);

        wbvw = (WebView)findViewById(R.id.webViewContc);
        wbvw.setWebViewClient(new WebViewClient());
        wbvw.loadUrl(urlcba);
    }
}