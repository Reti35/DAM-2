package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Info extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.info, menu);
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        WebView webView = findViewById(R.id.webView);

        webView.loadUrl("file:///android_asset/Index.html");
        
        webView.setWebViewClient(new WebViewClient());

    }

    public void info(View v){

        WebView webView = findViewById(R.id.webView);

        webView.loadUrl("file:///android_asset/Index.html");

        webView.setWebViewClient(new WebViewClient());

    }

    public void videoTutorial(View v){

        WebView webView = findViewById(R.id.webView);

        webView.loadUrl("file:///android_asset/Videotutorial.html");

        webView.setWebViewClient(new WebViewClient());

    }

    public void faq(View v){

        WebView webView = findViewById(R.id.webView);

        webView.loadUrl("file:///android_asset/FAQ.html");

        webView.setWebViewClient(new WebViewClient());

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch ( item.getItemId() )
        {

            case R.id.action_info:
            {

                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent=new Intent(Info.this, MainActivity.class);
                        startActivity(intent);
                        finish();
                    }
                },0);

            }

            break;

            default:

                return super.onOptionsItemSelected(item);
        }
        return true;
    }

}