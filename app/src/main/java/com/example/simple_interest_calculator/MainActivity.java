package com.example.simple_interest_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText num1,num2;
    Button add,sub,mul,div;
    TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1=findViewById(R.id.firstEditText);
        num2=findViewById(R.id.secondEditText);
        add=findViewById(R.id.add);
        sub=findViewById(R.id.subtract);
        mul=findViewById(R.id.multiply);
        div=findViewById(R.id.divide);
        output=findViewById(R.id.result);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstNum=Integer.parseInt(num1.getText().toString());
                int secondNum=Integer.parseInt(num2.getText().toString());
                int sum=firstNum+secondNum;
                output.setText(String.valueOf(sum));
                Toast.makeText(MainActivity.this, ""+String.valueOf(sum), Toast.LENGTH_SHORT).show();
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstNum=Integer.parseInt(num1.getText().toString());
                int secondNum=Integer.parseInt(num2.getText().toString());
                int sum=firstNum-secondNum;
                output.setText(String.valueOf(sum));
                Toast.makeText(MainActivity.this, ""+String.valueOf(sum), Toast.LENGTH_SHORT).show();
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstNum=Integer.parseInt(num1.getText().toString());
                int secondNum=Integer.parseInt(num2.getText().toString());
                int multiply=firstNum*secondNum;
                output.setText(String.valueOf(multiply));
                Toast.makeText(MainActivity.this, ""+String.valueOf(multiply), Toast.LENGTH_SHORT).show();
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstNum=Integer.parseInt(num1.getText().toString());
                int secondNum=Integer.parseInt(num2.getText().toString());
                double n1=firstNum;
                double n2=secondNum;
                double multiply=n1/n2;

               if(Double.isInfinite(multiply)){
                   Toast.makeText(MainActivity.this, "Cannot divide by zero", Toast.LENGTH_SHORT).show();
                    output.setText("");
               }
               else {
                   output.setText(String.valueOf(multiply));
                   Toast.makeText(MainActivity.this, ""+String.valueOf(multiply), Toast.LENGTH_SHORT).show();
               }


            }
        });



    }


}