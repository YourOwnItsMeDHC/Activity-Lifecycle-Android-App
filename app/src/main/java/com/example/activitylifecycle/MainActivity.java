package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "FirstOnCreate", Toast.LENGTH_SHORT).show();

        TextView textView = findViewById(R.id.tvFirstActivity);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //When First Activity get clicked it will get shift to Second Activity
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });

}


    @Override
    protected void onStart() {
    //The super keyword in Java is a reference variable which is used to refer immediate parent class object.
        super.onStart();
        Toast.makeText(this, "FirstOnStart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "FirstOnResume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "FirstOnPause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "FirstOnStop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "FirstOnRestart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "FirstOnDestroy", Toast.LENGTH_SHORT).show();
    }

}

