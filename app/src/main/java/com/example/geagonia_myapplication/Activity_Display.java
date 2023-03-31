package com.example.geagonia_myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

public class Activity_Display extends AppCompatActivity implements View.OnClickListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        Objects.requireNonNull(getSupportActionBar()).setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.caramel)));

        TextView textName = (TextView) findViewById(R.id.textViewName);
        TextView textGender = (TextView) findViewById(R.id.textViewGender);
        TextView textBdate = (TextView) findViewById(R.id.textViewBdate);
        TextView textEmail = (TextView) findViewById(R.id.textViewEmail);
        TextView textPhone = (TextView) findViewById(R.id.textViewNumber);
        Button ok = (Button) findViewById(R.id.bt_OK);

        Intent intent = getIntent();

        String name = " " + intent.getStringExtra("name_key");
        String gender = " " + intent.getStringExtra("gender_key");
        String bdate = " " + intent.getStringExtra("birthdate_key");
        String email = " " + intent.getStringExtra("email_key");
        String phone = " " + intent.getStringExtra("phone_key");

        textName.setText(name);
        textGender.setText(gender);
        textBdate.setText(bdate);
        textEmail.setText(email);
        textPhone.setText(phone);
    }

    @Override
    public void onClick(View view)
    {
        switch(view.getId())
        {
            case R.id.bt_OK:
                Toast.makeText(this, "OK", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}