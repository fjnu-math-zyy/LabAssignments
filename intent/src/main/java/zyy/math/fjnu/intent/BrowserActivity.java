package zyy.math.fjnu.intent;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

import java.net.URL;

public class BrowserActivity extends AppCompatActivity {
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browser);
        webView = findViewById(R.id.webViwe);
        webView.getSettings().setJavaScriptEnabled(true);

        Intent intent = getIntent();
        Uri data = intent.getData();
        URL url = null;
        try{
            url = new URL(data.getScheme(), data.getHost(), data.getPath());
        }catch (Exception e){
            e.printStackTrace();
        }

        webView.loadUrl(url.toString());
        webView.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                //返回值是true的时候控制去WebView打开，为false调用系统浏览器或第三方浏览器
                view.loadUrl(url);
                return true;
            }
        });
    }
}
