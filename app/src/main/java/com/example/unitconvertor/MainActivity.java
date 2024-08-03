package com.example.unitconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView2;
    private EditText editTextNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        editTextNumber = findViewById(R.id.editTextNumber);
        textView2 = findViewById(R.id.textView2);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//           public void onClick(View v) {
//                String s = editTextNumber.getText().toString();
//                int kg = Integer.parseInt(s);
//                double pound = 2.205 * kg;
//                textView2.setText("The corresponding value in Pounds is " + pound);
//            }
//        });
    }
    public void calculate(View view){
        String s = editTextNumber.getText().toString();
        int kg = Integer.parseInt(s);
        double pound = 2.205 * kg;
        textView2.setText("The corresponding value in Pounds is " + pound);
        Toast.makeText(this, "Thanks for using this app", Toast.LENGTH_SHORT).show();
    }
}