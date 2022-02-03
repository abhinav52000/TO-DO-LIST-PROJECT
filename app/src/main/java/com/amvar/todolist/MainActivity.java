package com.amvar.todolist;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText num1;
    Button button1,button2,button3;
    EditText e1,e2,e3,e4,e5,e6,e7,e8,e9,e10;
    TextView t1,score_text,v1,v2,v3,v4,v5,v6,v7,v8,v9,v10;
    LinearLayout l1,l2;
    int a,score=0;
    TextView k1,k2,k3,k4,k5,k6,k7,k8,k9,k10;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        num1=findViewById(R.id.number);
        button1=findViewById(R.id.table_calc);
        t1=findViewById(R.id.textView);
        e1=findViewById(R.id.editTextNumber1);
        e2=findViewById(R.id.editTextNumber2);
        e3=findViewById(R.id.editTextNumber3);
        e4=findViewById(R.id.editTextNumber4);
        e5=findViewById(R.id.editTextNumber5);
        e6=findViewById(R.id.editTextNumber6);
        e7=findViewById(R.id.editTextNumber7);
        e8=findViewById(R.id.editTextNumber8);
        e9=findViewById(R.id.editTextNumber9);
        e10=findViewById(R.id.editTextNumber10);
        button2=findViewById(R.id.resulttime);
        l1=findViewById(R.id.lay5);
        l2=findViewById(R.id.lay2);
        v1=findViewById(R.id.textView4);
        v2=findViewById(R.id.textView5);
        v3=findViewById(R.id.textView6);
        v4=findViewById(R.id.textView7);
        v5=findViewById(R.id.textView8);
        v6=findViewById(R.id.textView9);
        v7=findViewById(R.id.textView10);
        v8=findViewById(R.id.textView11);
        v9=findViewById(R.id.textView12);
        v10=findViewById(R.id.textView13);
        k1=findViewById(R.id.textView21);
        k2=findViewById(R.id.textView22);
        k3=findViewById(R.id.textView23);
        k4=findViewById(R.id.textView24);
        k5=findViewById(R.id.textView25);
        k6=findViewById(R.id.textView26);
        k7=findViewById(R.id.textView27);
        k8=findViewById(R.id.textView28);
        k9=findViewById(R.id.textView29);
        k10=findViewById(R.id.textView30);
        score_text=findViewById(R.id.textView14);
        button3=findViewById(R.id.tryanother);




        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=num1.getEditableText().toString();
                a=Integer.parseInt(s1);
                score=0;
                l1.setVisibility(View.VISIBLE);

                t1.setText("Your Input");

                k1.setText(s1+" X 1 =");
                k2.setText(s1+" X 2 =");
                k3.setText(s1+" X 3 =");
                k4.setText(s1+" X 4 =");
                k5.setText(s1+" X 5 =");
                k6.setText(s1+" X 6 =");
                k7.setText(s1+" X 7 =");
                k8.setText(s1+" X 8 =");
                k9.setText(s1+" X 9 =");
                k10.setText(s1+" X 10 =");
            }
        });


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                button3.setVisibility(View.VISIBLE);
                l2.setVisibility(View.VISIBLE);
                v1.setText(""+(1*a));
                v2.setText(""+(2*a));
                v3.setText(""+(3*a));
                v4.setText(""+(4*a));
                v5.setText(""+(5*a));
                v6.setText(""+(6*a));
                v7.setText(""+(7*a));
                v8.setText(""+(8*a));
                v9.setText(""+(9*a));
                v10.setText(""+(10*a));



                if((1*a)==Integer.parseInt(e1.getText().toString()))
                {
                        v1.setTextColor(Color.parseColor("#2EE205"));
                        ++score;
                }
                if((2*a)==Integer.parseInt(e2.getText().toString()))
                {
                    v2.setTextColor(Color.parseColor("#2EE205"));
                    ++score;
                }
                if((3*a)==Integer.parseInt(e3.getText().toString()))
                {
                    v3.setTextColor(Color.parseColor("#2EE205"));
                    ++score;
                }
                if((4*a)==Integer.parseInt(e4.getText().toString()))
                {
                    v4.setTextColor(Color.parseColor("#2EE205"));
                    ++score;
                }
                if((5*a)==Integer.parseInt(e5.getText().toString()))
                {
                    v5.setTextColor(Color.parseColor("#2EE205"));
                    ++score;
                }
                if((6*a)==Integer.parseInt(e6.getText().toString()))
                {
                    v6.setTextColor(Color.parseColor("#2EE205"));
                    ++score;
                }
                if((7*a)==Integer.parseInt(e7.getText().toString()))
                {
                    v7.setTextColor(Color.parseColor("#2EE205"));
                    ++score;
                }
                if((8*a)==Integer.parseInt(e8.getText().toString()))
                {
                    v8.setTextColor(Color.parseColor("#2EE205"));
                    ++score;
                }
                if((9*a)==Integer.parseInt(e9.getText().toString()))
                {
                    v9.setTextColor(Color.parseColor("#2EE205"));
                    ++score;
                }
                if((10*a)==Integer.parseInt(e10.getText().toString()))
                {
                    v10.setTextColor(Color.parseColor("#2EE205"));
                    ++score;
                }



                if(score<3)
                {
                    score_text.setText("YOUR SCORE : "+score+"\nVERY BAD 😑");

                }
                else if(score>=3&&score<6)
                {
                    score_text.setText("YOUR SCORE : "+score+"\nBAD 😟");
                }
                else if(score>=6&&score<8)
                {
                    score_text.setText("YOUR SCORE : "+score+"\nGOOD 🙂");
                }
                else if(score==8||score==9)
                {
                    score_text.setText("YOUR SCORE : "+score+"\nVERY GOOD 😊");
                }
                else if(score==10)
                {
                    score_text.setText("YOUR SCORE : "+score+"\nEXCELLENT 😍");
                    score_text.setTextColor(Color.parseColor("#2EE205"));
                }


            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = getBaseContext().getPackageManager()
                        .getLaunchIntentForPackage( getBaseContext().getPackageName() );
                i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(i);
            }
        });



    }
}