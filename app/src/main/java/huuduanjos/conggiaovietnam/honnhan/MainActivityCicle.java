package huuduanjos.conggiaovietnam.honnhan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.ramotion.circlemenu.CircleMenuView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class MainActivityCicle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_cicle);


        final CircleMenuView menu = findViewById(R.id.circle_menu);
        menu.setEventListener(new CircleMenuView.EventListener(){
            @Override
            public void onMenuOpenAnimationStart(@NonNull CircleMenuView view) {
                Log.d("D","onMenuOpenAnimationStart");
            }
            @Override
            public void onMenuOpenAnimationEnd(@NonNull CircleMenuView view) {
                Log.d("D","onMenuOpenAnimationEnd");
            }
            @Override
            public void onMenuCloseAnimationStart(@NonNull CircleMenuView view) {
                Log.d("D","onMenuCloseAnimationStart");
            }
            @Override
            public void onMenuCloseAnimationEnd(@NonNull CircleMenuView view) {
                Log.d("D","onMenuCloseAnimationEnd");
            }






            // Click Button
            @Override
            public void onButtonClickAnimationStart(@NonNull CircleMenuView view, int index) {
                //Log.d("D","onButtonClickAnimationStart|index: "+index);
                if(index==0){
                   startActivity(new Intent(MainActivityCicle.this,MainActivityContent.class));

                } if(index==1){
                     startActivity(new Intent(MainActivityCicle.this,MainGLDuTong.class));

                } if(index==2){


                } if(index==3){
                   // startActivity(new Intent(MainActivity.this,MainActivity5.class));

                } if(index==4){
                    startActivity(new Intent(MainActivityCicle.this,MainGioiThieuApp.class));

                }

            }
            @Override
            public void onButtonClickAnimationEnd(@NonNull CircleMenuView view, int index) {
                // Log.d("D","onButtonClickAnimationEnd|index: "+index);

            }
            @Override
            public boolean onButtonLongClick(@NonNull CircleMenuView view, int buttonIndex) {
                // Log.d("D","onButtonLongClick|index: "+buttonIndex);
                return false;

            }
            @Override
            public void onButtonLongClickAnimationStart(@NonNull CircleMenuView view, int buttonIndex) {
                // Log.d("D","onButtonLongClickAnimationStart|index: "+buttonIndex);


            }
            @Override
            public void onButtonLongClickAnimationEnd(@NonNull CircleMenuView view, int buttonIndex) {
                //Log.d("D","onButtonLongClickAnimationEnd|index: "+buttonIndex);

            }
        });

    }



}