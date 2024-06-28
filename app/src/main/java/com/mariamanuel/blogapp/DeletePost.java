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

public class DeletePost extends AppCompatActivity {
    EditText e1;
    AppCompatButton b1,b2,b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_delete_post);
        e1=(EditText)findViewById(R.id.blogname);
        b1= (AppCompatButton) findViewById(R.id.deletebtn);
        b2= (AppCompatButton) findViewById(R.id.menuuubtn);
        b3= (AppCompatButton) findViewById(R.id.loginbtn);
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
                String getDelete=e1.getText().toString();
                Toast.makeText(getApplicationContext(),  getDelete+" "+"Deleted", Toast.LENGTH_SHORT).show();
            }
        });
    }
}