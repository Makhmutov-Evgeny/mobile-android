package com.first.buttonclicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private Button buttonIdentifier;
    private Button buttonItsNotMe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        buttonIdentifier = findViewById(R.id.buttonIdentifier);
        buttonItsNotMe = findViewById(R.id.buttonItsNotMe);
    }
    public void onButtonIdentifierClick(View view)
    {
        textView.setText("Я 10 по списку");
        // выводим сообщение
        Toast.makeText(this, "Ещё один способ!", Toast.LENGTH_SHORT).show();
    }
    public void onButtonItsNotMeClick(View view)
    {
        textView.setText("Это не я сделал");
        // выводим сообщение
        Toast.makeText(this, "Ещё один способ!", Toast.LENGTH_SHORT).show();
    }
}