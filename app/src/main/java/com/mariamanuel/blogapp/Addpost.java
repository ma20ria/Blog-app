package com.mariamanuel.blogapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Addpost extends AppCompatActivity {
    EditText e1,e2,e3;
    AppCompatButton b1,b2,b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_addpost);
        e1=(EditText)findViewById(R.id.pname);
        e2=(EditText)findViewById(R.id.details);
        e3=(EditText)findViewById(R.id.prepname);
        b1=(AppCompatButton)findViewById(R.id.postbtn);
        b2=(AppCompatButton)findViewById(R.id.menubtn);
        b3=(AppCompatButton)findViewById(R.id.lodbtn);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SharedPreferences preference=getSharedPreferences("Logapp",MODE_PRIVATE);
                SharedPreferences.Editor editor=preference.edit();
                editor.clear();
                editor.apply();
                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),MainPage.class);
                startActivity(i);

            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getTitle=e1.getText().toString();
                Toast.makeText(getApplicationContext(), getTitle+" "+"Posted Successfully", Toast.LENGTH_SHORT).show();

            }
        });
    }
}