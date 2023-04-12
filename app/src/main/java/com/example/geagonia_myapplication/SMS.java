package com.example.geagonia_myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Objects;

public class SMS extends AppCompatActivity {

    Button bt_Send;
    EditText phoneNumber_txt;
    EditText message_txt;
    String phoneNumber;
    String message;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms);
        Objects.requireNonNull(getSupportActionBar()).setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.caramel)));

        bt_Send = (Button) findViewById(R.id.bt_send);
        phoneNumber_txt = (EditText) findViewById(R.id.editTextPhoneNumber);
        message_txt = (EditText) findViewById(R.id.editTextMessage);

        bt_Send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                phoneNumber = phoneNumber_txt.getText().toString();
                message = message_txt.getText().toString();
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.fromParts("sms", phoneNumber, null));
                intent.putExtra("sms_body", message);
                startActivity(intent);

                Toast.makeText(SMS.this, "Message Sent", Toast.LENGTH_SHORT).show();
            }
        });

    }
}