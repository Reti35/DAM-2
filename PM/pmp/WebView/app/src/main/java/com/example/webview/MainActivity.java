package com.example.webview;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView visor = findViewById(R.id.visor);
        visor.loadUrl("https://www.google.es");
        visor.setWebViewClient(new WebViewClient());

    }

    public void cargar(View v){

        WebView visor = findViewById(R.id.visor);
        EditText et = findViewById(R.id.enlace);

        String url = String.valueOf(et.getText());

        url = url.trim();

        if (url.equalsIgnoreCase("")) {

            url = "https://www.google.es";

        } if (url.startsWith("!git ")) {

            url = "https://www.github.com/" + url.trim().substring(5);

        } if(url.startsWith("!git")) {

            url = "https://www.github.com/" + url.trim().substring(4);

        } if (url.startsWith("!pint ")){

            url = "https://www.pinterest.com/search/pins/?q=" + url.trim().substring(6);

        } if(url.startsWith("!pint")) {

            url = "https://www.pinterest.com/search/pins/?q=" + url.trim().substring(5);

        } if (url.startsWith("!flv ")) {

            url = "https://www.animeflv.net/browse?q=" + url.trim().substring(5);

        } if(url.startsWith("!flv")) {

            url = "https://www.animeflv.net/browse?q=" + url.trim().substring(4);

        } if(url.startsWith("!g ")) {

            url = "https://www.google.es/search?q=" + url.trim().substring(2);

        } if(url.startsWith("!g")) {

            url = "https://www.google.es/search?q=" + url.trim().substring(2);

        } if (url.startsWith("!y ")) {

            url = "https://www.youtube.com/results?sp=mAEB&search_query=" + url.trim().substring(2);

        } if (url.startsWith("!y")) {

            url = "https://www.youtube.com/results?sp=mAEB&search_query=" + url.trim().substring(2);

        } if (url.startsWith("www.")) {

            url = url.substring(4);
            url = "https://www." + url.trim();

        } if (url.startsWith("www")) {

            url = url.substring(3);
            url = "https://www." + url.trim();

        }
        if (url.startsWith("http:")) {

            url = url.substring(5);

            url = "https:" + url.trim();

        } if (!url.startsWith("https://www.")) {

            url = "https://www." + url.trim();

        }

        visor.setWebViewClient(new WebViewClient());
        WebSettings ws = visor.getSettings();
        ws.setJavaScriptEnabled(true);

        visor.loadUrl(url);

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
                        Intent intent=new Intent(MainActivity.this, Info.class);
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