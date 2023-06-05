package com.example.frag_4_ojs;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.view.View;
public class Activity1 extends AppCompatActivity {

    private Button act1, act2, act3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

        act1 = findViewById(R.id.act1);
        act2 = findViewById(R.id.act2);
        act3 = findViewById(R.id.act3);

        act1.setBackgroundColor(Color.parseColor("#00BFFF"));
        act2.setBackgroundColor(Color.parseColor("#00BFFF"));
        act3.setBackgroundColor(Color.parseColor("#00BFFF"));

        act2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity1.this, Activity2.class);
                startActivity(intent);
            }
        });

        act3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity1.this, Activity3.class);
                startActivity(intent);
            }
        });

    }
}