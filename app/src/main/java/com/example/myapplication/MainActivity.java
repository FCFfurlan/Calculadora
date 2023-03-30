package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import expr.Expr;
import expr.Parser;
import expr.SyntaxException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView textView3 = (TextView) findViewById(R.id.textView3);

        Button button7 = (Button) findViewById(R.id.sete);
        button7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textView3.setText(textView3.getText() + "7");
            }
        });


        Button button8 = (Button) findViewById(R.id.oito);
        button8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textView3.setText(textView3.getText() + "8");
            }
        });
        Button button9 = (Button) findViewById(R.id.nove);
        button9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textView3.setText(textView3.getText() + "9");
            }
        });
        Button button4 = (Button) findViewById(R.id.quatro);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textView3.setText(textView3.getText() + "4");
            }
        });
        Button button5 = (Button) findViewById(R.id.cinco);
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textView3.setText(textView3.getText() + "5");
            }
        });
        Button button6 = (Button) findViewById(R.id.seis);
        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textView3.setText(textView3.getText() + "6");
            }
        });
        Button button1 = (Button) findViewById(R.id.um);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textView3.setText(textView3.getText() + "1");
            }
        });
        Button button2 = (Button) findViewById(R.id.dois);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textView3.setText(textView3.getText() + "2");
            }
        });
        Button button3 = (Button) findViewById(R.id.tres);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textView3.setText(textView3.getText() + "3");
            }
        });
        Button button0 = (Button) findViewById(R.id.zero);
        button0.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textView3.setText(textView3.getText() + "0");
            }
        });
        Button buttonp1 = (Button) findViewById(R.id.p1);
        buttonp1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textView3.setText(textView3.getText() + "(");
            }
        });
        Button buttonp2 = (Button) findViewById(R.id.p2);
        buttonp2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textView3.setText(textView3.getText() + ")");
            }
        });
        Button buttonpot = (Button) findViewById(R.id.pot);
        buttonpot.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textView3.setText(textView3.getText() + "^");
            }
        });
        Button buttondiv = (Button) findViewById(R.id.div);
        buttondiv.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textView3.setText(textView3.getText() + "/");
            }
        });
        Button buttonmult = (Button) findViewById(R.id.mult);
        buttonmult.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textView3.setText(textView3.getText() + "*");
            }
        });
        Button buttonsub = (Button) findViewById(R.id.sub);
        buttonsub.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textView3.setText(textView3.getText() + "-");
            }
        });
        Button buttonmais = (Button) findViewById(R.id.mais);
        buttonmais.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textView3.setText(textView3.getText() + "+");
            }
        });
        Button buttonvir = (Button) findViewById(R.id.vir);
        buttonvir.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textView3.setText(textView3.getText() + ".");
            }
        });
        Button buttonc = (Button) findViewById(R.id.c);
        buttonc.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textView3.setText(" ");
            }
        });
        Button buttonigual = (Button) findViewById(R.id.igual);
        buttonigual.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Expr expr = null;
                try {
                    expr = Parser.parse(textView3.getText().toString());
                    TextView textView4 = (TextView) findViewById(R.id.textView4);
                    textView4.setText(expr.value() + "");
                } catch (SyntaxException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}