package com.example.task2_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText login = findViewById(R.id.login);
        final EditText email = findViewById(R.id.email);
        final TextView result = findViewById(R.id.textResult);

        Button buttonOk = findViewById(R.id.buttonOk);
        buttonOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String lg = login.getText().toString();
                String em = email.getText().toString();
                String resultText = "Подписка на рассылку успешно оформлена для пользователя " + lg + " на электронный адрес " + em;
                result.setText(resultText);
            }
        });
        Button buttonClean = findViewById(R.id.buttonClean);
        buttonClean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("");
                login.setText("");
                email.setText("");
            }
        });
    }
}