package com.example.lab_02_gravelle;


import android.content.Intent;
//import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {
    private ImageView supermoon;
    private ImageView waterfall;
    private int imageID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout2);

        supermoon = findViewById(R.id.imageView);
        waterfall = findViewById(R.id.imageView2);

        supermoon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "You chose Supermoon", Toast.LENGTH_SHORT).show();
                imageID = R.drawable.supermoon;
                finish();
            }
        });

        waterfall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "You chose Waterfall", Toast.LENGTH_SHORT).show();
                imageID = R.drawable.waterfall;
                finish();
            }
        });
    }
    @Override
    public void finish() {
        Intent intent = new Intent();
        intent.putExtra("imageID", imageID);
        setResult(RESULT_OK, intent);

        super.finish();
    }
}

