package com.kazanov.kazanov_2m_7;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.kazanov.kazanov_2m_7.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private Integer x, equal, substract, plus, multiplay, divite, change, percent;
    private boolean isOperationClick;
    private String operations;

    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;
    Button btnSent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        textView = findViewById(R.id.text_view);
        btnSent = findViewById(R.id.btn_sent);
    }

    protected void onStart() {
        super.onStart();
        btnSent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("key", textView.getText().toString());
                startActivity(intent);
            }
        });
    }

    public void onNumberClick(View view) {
        switch (view.getId()) {
            case R.id.btn_clear:
                x = 0;
                change = 0;
                substract = 0;
                percent = 0;
                multiplay = 0;
                divite = 0;
                plus = 0;
                textView.setText("0");
                break;
            case R.id.btn_one:
                if (textView.getText().toString().equals("0") || isOperationClick) {
                    textView.setText("1");
                } else {
                    textView.append("1");
                }
                break;
            case R.id.btn_two:
                if (textView.getText().toString().equals("0") || isOperationClick) {
                    textView.setText("2");
                } else {
                    textView.append("2");
                }
                break;
            case R.id.btn_three:
                if (textView.getText().toString().equals("0") || isOperationClick) {
                    textView.setText("3");
                } else {
                    textView.append("3");
                }
                break;
            case R.id.btn_four:
                if (textView.getText().toString().equals("0") || isOperationClick) {
                    textView.setText("4");
                } else {
                    textView.append("4");
                }
                break;
            case R.id.btn_five:
                if (textView.getText().toString().equals("0") || isOperationClick) {
                    textView.setText("5");
                } else {
                    textView.append("5");
                }
                break;
            case R.id.btn_six:
                if (textView.getText().toString().equals("0") || isOperationClick) {
                    textView.setText("6");
                } else {
                    textView.append("6");
                }
                break;
            case R.id.btn_seven:
                if (textView.getText().toString().equals("0") || isOperationClick) {
                    textView.setText("7");
                } else {
                    textView.append("7");
                }
                break;
            case R.id.btn_eight:
                if (textView.getText().toString().equals("0") || isOperationClick) {
                    textView.setText("8");
                } else {
                    textView.append("8");
                }
                break;
            case R.id.btn_nine:
                if (textView.getText().toString().equals("0") || isOperationClick) {
                    textView.setText("9");
                } else {
                    textView.append("9");
                }
                break;
            case R.id.btn_zero:
                if (textView.getText().toString().equals("0") || isOperationClick) {
                    textView.setText("0");
                } else {
                    textView.append("0");
                }
                break;
            case R.id.btn_dot:
                if (isOperationClick) {
                    textView.setText("0.");
                } else {
                    textView.append(".");
                }

                break;

        }
        isOperationClick = false;
        btnSent.setVisibility(View.GONE);

    }

    public void onOperationClick(View view) {
        switch (view.getId()) {
            case R.id.btn_equal:
                x = Integer.valueOf(textView.getText().toString());
                switch (operations) {
                    case "+":
                        equal = x + plus;
                        break;
                    case "-":
                        equal = substract - x;
                        break;
                    case "/":
                        equal = divite / x;
                        break;
                    case "*":
                        equal = x * multiplay;
                        break;
                    case "%":
                        equal = percent * 100 / x;
                        break;
                }
                textView.setText(equal.toString());
                btnSent.setVisibility(View.VISIBLE);
                break;

            case R.id.btn_plus:
                plus = Integer.valueOf(textView.getText().toString());
                operations = "+";
                break;
            case R.id.btn_subtract:
                substract = Integer.valueOf(textView.getText().toString());
                operations = "-";
                break;
            case R.id.btn_divite:
                divite = Integer.valueOf(textView.getText().toString());
                operations = "/";
                break;
            case R.id.btn_multiplay:
                multiplay = Integer.valueOf(textView.getText().toString());
                operations = "*";
                break;
            case R.id.btn_change:
                change = -1 * Integer.valueOf(textView.getText().toString());
                textView.setText(change.toString());
                operations = "+/-";
                break;
            case R.id.btn_percent:
                percent = Integer.valueOf(textView.getText().toString());
                operations = "%";
                break;
        }
        isOperationClick = true;

    }

}