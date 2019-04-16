package com.example.lab_02_gravelle;

import android.app.Activity;
import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public static final int BACKGROUND_REQUEST = 1;
    private Button myButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myButton = findViewById(R.id.button);

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Activity2.class);
                startActivityForResult(i, BACKGROUND_REQUEST);
            }
        });
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        if (requestCode == BACKGROUND_REQUEST && resultCode == Activity.RESULT_OK) {
            Bundle extras = data.getExtras();
            if (extras != null) {
                int imageID = extras.getInt("imageID");
                ConstraintLayout currentLayout = findViewById(R.id.ActivityLayout);
                currentLayout.setBackground(getDrawable(imageID));
            }
        }
    }
}