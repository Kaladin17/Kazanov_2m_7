package com.kazanov.kazanov_2m_7;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class SecondActivity extends AppCompatActivity {
    TextView textView;
    MaterialButton button;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        textView = findViewById(R.id.tv_text_sent);
        button = findViewById(R.id.btn_closed);
        button.setOnClickListener(view -> {
            finishAffinity();
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        textView.setText(getIntent().getStringExtra("key"));

    }
}