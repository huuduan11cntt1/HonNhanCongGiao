package huuduanjos.conggiaovietnam.honnhan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;

import com.google.android.material.navigation.NavigationView;

public class MainGLDuTong extends AppCompatActivity {
    Toolbar toolbar;
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    ListView listView;
    MenuAdapter adapter;
    ListView listView2;
    ImageButton button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_gldu_tong);
        anhXa();

        String[] storyNames=getResources().getStringArray(R.array.stories_du_tong);
        ArrayAdapter<String> adapter2=new ArrayAdapter<>(this,R.layout.row_item,R.id.row_txt,storyNames);
        listView2.setAdapter(adapter2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainGLDuTong.this,MainActivityCicle.class));
            }
        });
        listView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent=new Intent(MainGLDuTong.this,MainDuTongHTML.class);
                intent.putExtra("story_key_du_tong",i);
                startActivity(intent);
            }
        });
    }





    private void anhXa() {
        listView2=findViewById(R.id.listViewDuTong);
        button=findViewById(R.id.backkkk);
    }
}