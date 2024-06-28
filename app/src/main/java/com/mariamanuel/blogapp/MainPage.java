package com.mariamanuel.blogapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainPage extends AppCompatActivity {
AppCompatButton b1,b2,b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main_page);
b1=(AppCompatButton) findViewById(R.id.addbtn);
b2=(AppCompatButton) findViewById(R.id.searchbtn);
b3=(AppCompatButton) findViewById(R.id.deletebtn);
b3.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {


        Intent i=new Intent(getApplicationContext(),DeletePost.class);
        startActivity(i);
    }
});
b2.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent i=new Intent(getApplicationContext(),SearchPost.class);
        startActivity(i);
    }
});
b1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent i=new Intent(getApplicationContext(),Addpost.class);
        startActivity(i);
    }
});
    }
}