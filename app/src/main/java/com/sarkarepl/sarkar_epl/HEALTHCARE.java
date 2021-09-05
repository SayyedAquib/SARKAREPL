package com.sarkarepl.sarkar_epl;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class HEALTHCARE extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_healthcare);

        webView = (WebView) findViewById(R.id.webView);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://sarkarepl.com/health-care-3/");

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if((keyCode == KeyEvent.KEYCODE_BACK) && webView.canGoBack()){
            webView.goBack();
            return true;
        }
        return super.onKeyDown(keyCode,event);
    }
}