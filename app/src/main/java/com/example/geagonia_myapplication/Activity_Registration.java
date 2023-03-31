package com.example.geagonia_myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.Objects;

public class Activity_Registration extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        Objects.requireNonNull(getSupportActionBar()).setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.caramel)));

        EditText editFirstName = (EditText) findViewById(R.id.editTextFirstName);
        EditText editLastName = (EditText) findViewById(R.id.editTextLastName);

        RadioGroup rd_Gender = (RadioGroup) findViewById(R.id.radioGroupGender);
       /* RadioButton rdbt_Male = (RadioButton) findViewById(R.id.radioButtonMale);
        RadioButton rdbt_Female = (RadioButton) findViewById(R.id.radioButtonFemale);*/

        EditText editBirthday = (EditText) findViewById(R.id.editBirthDate);
        EditText editEmail = (EditText) findViewById(R.id.editTextEmailAddress);
        EditText editNumber = (EditText) findViewById(R.id.editTextNumber);

        Button bt_Submit = (Button) findViewById(R.id.bt_Submit);

        bt_Submit.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String firstName = editFirstName.getText().toString();
                String lastName = editLastName.getText().toString();
                String fullName = firstName + " " + lastName;
                String gender = null;

                int selectedId = rd_Gender.getCheckedRadioButtonId();
                RadioButton rdbt_Gender = (RadioButton) findViewById(selectedId);
                if(selectedId==-1){
                    Toast.makeText(getApplicationContext(),"Nothing selected", Toast.LENGTH_SHORT).show();
                }
                else{
                    //Toast.makeText(getApplicationContext(),rdbt_Gender.getText(), Toast.LENGTH_SHORT).show();
                    gender = rdbt_Gender.getText().toString();
                }

                String bdate = editBirthday.getText().toString();
                String email = editEmail.getText().toString();
                String phone = editNumber.getText().toString();


                Intent intent = new Intent(getApplicationContext(), Activity_Display.class);
                intent.putExtra("name_key",fullName);
                intent.putExtra("gender_key", gender);
                intent.putExtra("birthdate_key", bdate);
                intent.putExtra("email_key", email);
                intent.putExtra("phone_key", phone);

                startActivity(intent);
            }
        });
    }

}