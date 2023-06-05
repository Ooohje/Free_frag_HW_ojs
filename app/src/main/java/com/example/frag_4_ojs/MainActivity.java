package com.example.frag_4_ojs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //첫 번째 버튼 클릭시 액티비티 전환
        Button first_btn = (Button) findViewById(R.id.name_first_btn);
        first_btn.setBackgroundColor(Color.parseColor("#00BFFF"));
        first_btn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), Activity1.class);
                startActivity(intent);
            }
        });


        Button second_btn = (Button) findViewById(R.id.name_second_btn);
        second_btn.setBackgroundColor(Color.parseColor("#00BFFF"));
        second_btn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), Activity2.class);
                startActivity(intent);
            }
        });

        Button third_btn = (Button) findViewById(R.id.name_third_btn);
        third_btn.setBackgroundColor(Color.parseColor("#00BFFF"));
        third_btn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), Activity3.class);
                startActivity(intent);
            }
        });
    }
}