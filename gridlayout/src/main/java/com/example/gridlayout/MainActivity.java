package com.example.gridlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //findViewbyId

        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.btn1:
                Toast.makeText(MainActivity.this,btn1.getText().toString(),Toast.LENGTH_LONG).show();
                break;
            case R.id.btn2:
                Toast.makeText(MainActivity.this,btn2.getText().toString(),Toast.LENGTH_LONG).show();
                break;
            case R.id.btn3:
                Toast.makeText(MainActivity.this,btn3.getText().toString(),Toast.LENGTH_LONG).show();
                break;
            case R.id.btn4:
                Toast.makeText(MainActivity.this,btn4.getText().toString(),Toast.LENGTH_LONG).show();
                break;
            case R.id.btn5:
                Toast.makeText(MainActivity.this,btn5.getText().toString(),Toast.LENGTH_LONG).show();
                break;
            case R.id.btn6:
                Toast.makeText(MainActivity.this,btn6.getText().toString(),Toast.LENGTH_LONG).show();
                break;
            case R.id.btn7:
                Toast.makeText(MainActivity.this,btn7.getText().toString(),Toast.LENGTH_LONG).show();
                break;
            case R.id.btn8:
                Toast.makeText(MainActivity.this,btn8.getText().toString(),Toast.LENGTH_LONG).show();
                break;
            case R.id.btn9:
                Toast.makeText(MainActivity.this,btn9.getText().toString(),Toast.LENGTH_LONG).show();
                break;

        }


    }
}
