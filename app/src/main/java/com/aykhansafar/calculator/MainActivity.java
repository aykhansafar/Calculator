package com.aykhansafar.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText ay ;
    EditText kh ;
    TextView an;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ay = findViewById(R.id.editText1);
        kh = findViewById(R.id.editText2);
        an = findViewById(R.id.textView2);
    }
    public void sum(View view){
if(ay.getText().toString().matches("") || kh.getText().toString().matches("")){
an.setText("Please enter number");
}
else
{
       int number1 = Integer.parseInt(ay.getText().toString());
       int number2 = Integer.parseInt(kh.getText().toString());
int result = number1 + number2;
an.setText("Result : "+ result);
    }
    }
    public void subtraction(View view){
        if(ay.getText().toString().matches("") || kh.getText().toString().matches("")){
            an.setText("Please enter number");
        }
        else
        {
int number1 = Integer.parseInt(ay.getText().toString());
int number2 = Integer.parseInt(kh.getText().toString());
int result =number1 - number2;
an.setText("Result : "+ result);

    }
    }
    public void multiply(View view) {
        if (ay.getText().toString().matches("") || kh.getText().toString().matches("")) {
            an.setText("Please enter number");
        } else
        {
            int number1 = Integer.parseInt(ay.getText().toString());
            int number2 = Integer.parseInt(kh.getText().toString());
            int result = number1 * number2;
            an.setText("Result : " + result);

        }
    }
public void divide(View view){
        if(ay.getText().toString().matches("") ||kh.getText().toString().matches("")){
            an.setText("Please enter number");
        }
        else
        {
float number1 = Integer.parseInt(ay.getText().toString());
float number2 = Integer.parseInt(kh.getText().toString());
float result =number1/number2;
an.setText("Result : "+result);

    }
    }

}