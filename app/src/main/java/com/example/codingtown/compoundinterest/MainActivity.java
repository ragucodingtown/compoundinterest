package com.example.codingtown.compoundinterest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity
{
    Button calbt,clearbt;
    EditText at, interst, yer;
    TextView total;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        at = (EditText) findViewById(R.id.t1);
        interst = (EditText) findViewById(R.id.t2);
        yer = (EditText) findViewById(R.id.t3);
        total = (TextView) findViewById(R.id.v1);

        //calbt = (Button) findViewById(R.id.b1);
        clearbt = (Button) findViewById(R.id.b2);

   yer.setOnEditorActionListener(new TextView.OnEditorActionListener() {
    @Override
    public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {

        double amt = Double.parseDouble(at.getText().toString());
        double rate = (Double.parseDouble(interst.getText().toString()));
        //double amra=(amt*rate)/100;
        double yr = Integer.parseInt(yer.getText().toString());
        //double ans=yr*amra;


        double ans = (double) (amt* Math.pow((1 + rate/100),yr));
        total.setText(new DecimalFormat("##.##").format(ans));
        return false;
    }
});

       // calbt.setOnClickListener(new View.OnClickListener() {
           // @Override
           // public void onClick(View v)
           // {





           // }
       // });

        clearbt.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                at.setText("");
                yer.setText("");
                interst.setText("");
                total.setText("");



            }
        });
    }
}
