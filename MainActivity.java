package com.example.youareplayer;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends BaseActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title);

        hideSystemUI();

        @SuppressLint("WrongViewCast") AppCompatImageButton btnplay = findViewById(R.id.btnplay);

        findViewById(R.id.btnplay).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Explanation.class);
                startActivity(intent);
            }
        });
        

        EditText txtkey = findViewById(R.id.txtkey);
        txtkey.setHint("Key Wordを入力");

        @SuppressLint("WrongViewCast") AppCompatImageButton input = findViewById(R.id.input);

        findViewById(R.id.input).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputText = txtkey.getText().toString();

                if (inputText.equals("セキチク")) {
                    Intent intent = new Intent(MainActivity.this, AfterWorldEnd.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "Key Wordが間違っています。", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}