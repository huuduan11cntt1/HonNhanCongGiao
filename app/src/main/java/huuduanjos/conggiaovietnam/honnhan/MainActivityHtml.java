package huuduanjos.conggiaovietnam.honnhan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageButton;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class MainActivityHtml extends AppCompatActivity {

    WebView webView;

    ImageButton imageButton;
    private AdView mAdView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_html);
        webView=findViewById(R.id.webView);
        imageButton =findViewById(R.id.idbackkkk);



        AdView adView = new AdView(this);

        adView.setAdSize(AdSize.BANNER);
        adView.setAdUnitId("ca-app-pub-5382625544778444/3332603711");


        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivityHtml.this, MainActivityContent.class));
            }
        });

        int i=getIntent().getIntExtra("story_key",0);

        if(i==0){
            webView.loadUrl("file:///android_asset/bai1.html");
        }if(i==1){
            webView.loadUrl("file:///android_asset/bai2.html");
        }if(i==2){
            webView.loadUrl("file:///android_asset/bai3.html");
        }if(i==3){
            webView.loadUrl("file:///android_asset/bai4.html");
        }if(i==4){
            webView.loadUrl("file:///android_asset/bai5.html");
        }if(i==5){
            webView.loadUrl("file:///android_asset/bai6.html");
        }if(i==6){
            webView.loadUrl("file:///android_asset/bai7.html");
        }if(i==7){
            webView.loadUrl("file:///android_asset/bai8.html");
        }if(i==8){
            webView.loadUrl("file:///android_asset/bai9.html");
        }if(i==9){
            webView.loadUrl("file:///android_asset/bai10.html");
        }if(i==10){
            webView.loadUrl("file:///android_asset/bai11.html");
        }if(i==11){
            webView.loadUrl("file:///android_asset/bai12.html");
        }if(i==12){
            webView.loadUrl("file:///android_asset/bai13.html");
        }if(i==13){
            webView.loadUrl("file:///android_asset/bai14.html");
        }if(i==14){
            webView.loadUrl("file:///android_asset/bai15.html");
        }if(i==15){
            webView.loadUrl("file:///android_asset/bai16.html");
        }if(i==16){
            webView.loadUrl("file:///android_asset/bai17.html");
        }if(i==17){
            webView.loadUrl("file:///android_asset/bai18.html");
        }if(i==18){
            webView.loadUrl("file:///android_asset/bai19.html");
        }if(i==19){
            webView.loadUrl("file:///android_asset/bai20.html");
        }
    }
}