package com.example.geagonia_myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button bt_Activity1, bt_Activity2, bt_Activity3, bt_Activity4, bt_Activity5;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Objects.requireNonNull(getSupportActionBar()).setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.caramel)));

        bt_Activity1 = (Button) findViewById(R.id.bt_Activity1);
        bt_Activity2 = (Button) findViewById(R.id.bt_Activity2);
        bt_Activity3 = (Button) findViewById(R.id.bt_Activity3);
        bt_Activity4 = (Button) findViewById(R.id.bt_Activity4);
        bt_Activity5 = (Button) findViewById(R.id.bt_Activity5);

        bt_Activity1.setOnClickListener(this);
        bt_Activity2.setOnClickListener(this);
        bt_Activity3.setOnClickListener(this);
        bt_Activity4.setOnClickListener(this);
        bt_Activity5.setOnClickListener(this);

    }

    @Override
    public void onClick(View view)
    {
        switch(view.getId())
        {
            case R.id.bt_Activity1:
                Toast.makeText(this, "Activity 1 button is clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.bt_Activity2:
                Toast.makeText(this, "Activity 2 button is clicked", Toast.LENGTH_SHORT).show();
                Intent intent2 = new Intent(this, MainActivity2_Menu.class);
                startActivity(intent2);
                break;
            case R.id.bt_Activity3:
                Toast.makeText(this, "Activity 3 button is clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.bt_Activity4:
                Toast.makeText(this, "Activity 4 button is clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.bt_Activity5:
                Toast.makeText(this, "Activity 5 button is clicked", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}