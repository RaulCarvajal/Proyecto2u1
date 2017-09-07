package com.example.chapa.proyecto2u1;

import android.support.annotation.IntegerRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv;
    private float v1,v2;
    private int op;
    private boolean flag=false;
    /*
    0 +
    1 -
    2 *
    3 /
    */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv=(TextView)findViewById(R.id.textView);

        //1
        findViewById(R.id.btn1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                retFlag();
                tv.append("1");
            }
        });
        //2
        findViewById(R.id.btn2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                retFlag();
                tv.append("2");
            }
        });
        //3
        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                retFlag();
                tv.append("3");
            }
        });
        //4
        findViewById(R.id.button5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                retFlag();
                tv.append("4");
            }
        });
        //5
        findViewById(R.id.button6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                retFlag();
                tv.append("5");
            }
        });
        //6
        findViewById(R.id.button7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                retFlag();
                tv.append("6");
            }
        });
        //7
        findViewById(R.id.button10).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                retFlag();
                tv.append("7");
            }
        });
        //8
        findViewById(R.id.button11).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                retFlag();
                tv.append("8");
            }
        });
        //9
        findViewById(R.id.button9).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                retFlag();
                tv.append("9");
            }
        });
        //0
        findViewById(R.id.button15).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                retFlag();
                tv.append("0");
            }
        });

        //+
        findViewById(R.id.button4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1= Float.parseFloat(tv.getText().toString());
                tv.setText("");
                op=0;
            }
        });
        //-
        findViewById(R.id.button8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1= Float.parseFloat(tv.getText().toString());
                tv.setText("");
                op=1;
            }
        });
        //*
        findViewById(R.id.button12).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1= Float.parseFloat(tv.getText().toString());
                tv.setText("");
                op=2;
            }
        });
        // /
        findViewById(R.id.button14).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1= Float.parseFloat(tv.getText().toString());
                tv.setText("");
                op=3;
            }
        });
        // +/-
        findViewById(R.id.button17).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        // =
        findViewById(R.id.button16).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v2=Float.parseFloat(tv.getText().toString());
                tv.setText(calcular(v1,v2,op)+"");
                flag=true;
            }
        });

        //+/-
        findViewById(R.id.button17).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(""+(-1*(Float.parseFloat(tv.getText().toString()))));
            }
        });
    }

    private float calcular(float n1,float n2, int o){
        float r=0;
        switch (o){
            case 0:
                r=n1+n2;
                break;
            case 1:
                r=n1-n2;
                break;
            case 2:
                r=n1*n2;
                break;
            case 3:
                r=n1/n2;
                break;
            default:
                r=0;
                break;
        }

        return r;
    }

    private void retFlag(){
        if(flag==true){
            tv.setText("");
            flag=false;
        }
    }
}
