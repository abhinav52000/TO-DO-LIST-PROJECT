package com.amvar.todolist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText num1,num2;
    private TextView result;
    private Button button1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1=findViewById(R.id.num1);
        num2=findViewById(R.id.num2);
        button1=findViewById(R.id.sum);
        result=findViewById(R.id.result);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String s1,s2;
                s1=num1.getText().toString();
                s2=num2.getText().toString();
                int a=Integer.parseInt(s1);
                int b=Integer.parseInt(s2);
                int r=a+b;
                result.setText(""+r);

            }
        });



    }
}