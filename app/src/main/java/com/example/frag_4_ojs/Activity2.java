package com.example.frag_4_ojs;


import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Activity2 extends AppCompatActivity {

    private Button btn1, btn2, act2_1, act2_2, act2_3;
    private ScrollingFragment scrollfrag;
    private AudioFragment audiofrag;
    private MapsFragment mapfrag;

    private RouletteFragment roulettefrag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        scrollfrag = new ScrollingFragment();
        audiofrag = new AudioFragment();
        mapfrag = new MapsFragment();
        roulettefrag = new RouletteFragment();

        btn1 = findViewById(R.id.button1);
        btn2 = findViewById(R.id.button2);

        act2_1 = findViewById(R.id.act2_1);
        act2_2 = findViewById(R.id.act2_2);
        act2_3 = findViewById(R.id.act2_3);
        act2_1.setBackgroundColor(Color.parseColor("#00BFFF"));
        act2_2.setBackgroundColor(Color.parseColor("#00BFFF"));
        act2_3.setBackgroundColor(Color.parseColor("#00BFFF"));

        act2_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity2.this, Activity1.class);
                startActivity(intent);
            }
        });

        act2_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e("로그","액티비티 시작 맵맵");
                Intent intent = new Intent(Activity2.this, Activity3.class);
                startActivity(intent);
            }
        });

        btn1.setBackgroundColor(Color.parseColor("#00BFFF"));
        btn2.setBackgroundColor(Color.parseColor("#00BFFF"));

        getSupportFragmentManager().beginTransaction().add(R.id.f1, roulettefrag).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.f2, scrollfrag).commit();

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction().replace(R.id.f1, roulettefrag).commit();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction().replace(R.id.f1, mapfrag).commit();
            }
        });
    }
}

