package com.example.frag_4_ojs;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.View;
import android.widget.Button;
public class Activity3 extends AppCompatActivity {

    private ScrollingFragment scrollfrag;

    private StepCounterFragment stepcountfrag;

    private PlayFragment playfrag;
    private Button act3_1, act3_2, act3_3;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        act3_1 = findViewById(R.id.act3_1);
        act3_2 = findViewById(R.id.act3_2);
        act3_3 = findViewById(R.id.act3_3);
        act3_1.setBackgroundColor(Color.parseColor("#00BFFF"));
        act3_2.setBackgroundColor(Color.parseColor("#00BFFF"));
        act3_3.setBackgroundColor(Color.parseColor("#00BFFF"));

        act3_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity3.this, Activity1.class);
                startActivity(intent);
            }
        });

        act3_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e("로그","액티비티 시작 맵맵");
                Intent intent = new Intent(Activity3.this, Activity2.class);
                startActivity(intent);
            }
        });

        stepcountfrag = new StepCounterFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.f3, stepcountfrag).commit();

        //scrollfrag = new ScrollingFragment();
        //getSupportFragmentManager().beginTransaction().add(R.id.f4, scrollfrag).commit();

        playfrag = new PlayFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.f4, playfrag).commit();



    }
}