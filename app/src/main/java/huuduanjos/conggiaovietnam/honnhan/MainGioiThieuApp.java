package huuduanjos.conggiaovietnam.honnhan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MainGioiThieuApp extends AppCompatActivity {
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_gioi_thieu_app);

        webView =findViewById(R.id.idAPP);
        webView.loadUrl("file:///android_asset/gioithieuapp.html");

    }
}