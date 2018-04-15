package com.introlist.djy.androidintrolist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private SimpleAdapter simAdapt;
    private List<Map<String, Object>> data = new ArrayList<Map<String, Object>>();
    private String[] item_name={"00_LifeCycle","01_UserName","02_Layout","03_Button","04_Button_Intent","05_Button_StartActivity"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView);

        for(int i=0;i<item_name.length;i++){
            Map<String, Object> item = new HashMap<String, Object>();
            item.put("name",item_name[i]);
            data.add(item);
        }

        simAdapt = new SimpleAdapter(
                this,
                data,
                R.layout.item_layout,
                new String[] { "name" },
                new int[] { R.id.item_name });
        listView.setAdapter(simAdapt);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent;
                switch (position){
                    case 0:
                        intent = new Intent(MainActivity.this,Intro00Activity.class);
                        startActivity(intent);
                        break;
                    case 1:
                        intent = new Intent(MainActivity.this,Intro01Activity.class);
                        startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(MainActivity.this,Intro02Activity.class);
                        startActivity(intent);
                        break;
                    case 3:
                        intent = new Intent(MainActivity.this,Intro03Activity.class);
                        startActivity(intent);
                        break;
                    case 4:
                        intent = new Intent(MainActivity.this,Intro04Activity.class);
                        startActivity(intent);
                        break;
                    case 5:
                        intent = new Intent(MainActivity.this,Intro05Activity.class);
                        startActivity(intent);
                        break;
                    default:
                        intent=new Intent(MainActivity.this,MainActivity.class);
                        startActivity(intent);
                        finish();
                        break;
                }
            }
        });
    }
}
