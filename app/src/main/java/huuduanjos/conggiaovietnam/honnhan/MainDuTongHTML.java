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

public class MainDuTongHTML extends AppCompatActivity {
    WebView webView;

    ImageButton imageButton;
    private AdView mAdView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_du_tong_html);
        webView=findViewById(R.id.webViewDT);
        imageButton =findViewById(R.id.idbacc);

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
                startActivity(new Intent(MainDuTongHTML.this, MainGLDuTong.class));
            }
        });


        int i=getIntent().getIntExtra("story_key_du_tong",0);
        if(i==0){
            webView.loadUrl("file:///android_asset/dutong/huongdan.html");
        }if(i==1){
            webView.loadUrl("file:///android_asset/dutong/modau.html");
        }if(i==2){
            webView.loadUrl("file:///android_asset/dutong/bai1.html");
        }if(i==3){
            webView.loadUrl("file:///android_asset/dutong/bai2.html");
        }if(i==4){
            webView.loadUrl("file:///android_asset/dutong/bai3.html");
        }if(i==5){
            webView.loadUrl("file:///android_asset/dutong/bai4.html");
        }if(i==6){
            webView.loadUrl("file:///android_asset/dutong/bai5.html");
        }if(i==7){
            webView.loadUrl("file:///android_asset/dutong/bai6.html");
        }if(i==8){
            webView.loadUrl("file:///android_asset/dutong/bai7.html");
        }if(i==9){
            webView.loadUrl("file:///android_asset/dutong/bai8.html");
        }if(i==10){
            webView.loadUrl("file:///android_asset/dutong/bai9.html");
        }if(i==11){
            webView.loadUrl("file:///android_asset/dutong/bai10.html");
        }if(i==12){
            webView.loadUrl("file:///android_asset/dutong/bai11.html");
        }if(i==13){
            webView.loadUrl("file:///android_asset/dutong/bai12.html");
        }if(i==14){
            webView.loadUrl("file:///android_asset/dutong/bai13.html");
        }if(i==15){
            webView.loadUrl("file:///android_asset/dutong/bai14.html");
        }if(i==16){
            webView.loadUrl("file:///android_asset/dutong/bai15.html");
        }if(i==17){
            webView.loadUrl("file:///android_asset/dutong/bai16.html");
        }if(i==18){
            webView.loadUrl("file:///android_asset/dutong/bai17.html");
        }if(i==19){
            webView.loadUrl("file:///android_asset/dutong/bai18.html");
        }if(i==20){
            webView.loadUrl("file:///android_asset/dutong/bai19.html");
        }if(i==21){
            webView.loadUrl("file:///android_asset/dutong/bai20.html");
        }if(i==22){
            webView.loadUrl("file:///android_asset/dutong/bai21.html");
        }if(i==23){
            webView.loadUrl("file:///android_asset/dutong/bai22.html");
        }if(i==24){
            webView.loadUrl("file:///android_asset/dutong/bai23.html");
        }if(i==25){
            webView.loadUrl("file:///android_asset/dutong/bai24.html");
        }


    }
}