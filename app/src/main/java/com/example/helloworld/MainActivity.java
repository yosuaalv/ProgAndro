package com.example.layout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText email;
    EditText passwd;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email = findViewById(R.id.emailTxt);
        passwd = findViewById(R.id.passTxt);
        button = findViewById(R.id.loginBtn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        "Selamat Datang Slur", Toast.LENGTH_SHORT).show();
                openActivity2();
            }
        });


    }
    public void openActivity2(){
        Intent intent = new Intent( this, com.example.layout.MainActivity2.class);
        startActivity(intent);

    }
}
