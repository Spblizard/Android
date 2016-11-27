package ru.apps.max.calc;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class StringCalcActivity extends AppCompatActivity {
    private TextView answText;
    private EditText editStr;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.string_calc_activity);
        answText = (TextView)findViewById(R.id.AnswText);
        editStr = (EditText)findViewById(R.id.editTextNumb);
    }

    public void onButtonStrCalc(View view) {

        String str, s1, s2; float a, b, c = 0;
        int r = 0;
        str = editStr.getText().toString();
        int line = str.length();
        boolean[] bl = new boolean[line];
        char[] chStr = new char[line];
        char[] ch1 = new char[line];
        char[] ch2 = new char[line];
        char op =' ';
        chStr = str.toCharArray();
        for(int i=0;i<line;i++)
            bl[i] = true;
        for(int i=0;i<line;i++){
            switch (chStr[i]) {
                case '+':
                    bl[i] = false;
                    op = chStr[i];
                    i = line;
                    break;
                case '-':
                    bl[i] = false;
                    op = chStr[i];
                    i = line;
                    break;
                case '*':
                    bl[i] = false;
                    op = chStr[i];
                    i = line;
                    break;
                case '/':
                    bl[i] = false;
                    op = chStr[i];
                    i = line;
                    break;
            }
            r++;
        }
        for(int i=0;i<line;i++){
            if(bl[i]) {
                if (i < r)
                    ch1[i] = chStr[i];
                else if(i > r || i==r)
                    ch2[i-r] = chStr[i];
            }

        }
        s1 = String.valueOf(ch1);
        s2 = String.valueOf(ch2);
        a = Float.parseFloat(s1);
        b = Float.parseFloat(s2);
        switch(op){
            case '+':
                c = a+b;
                break;
            case '-':
                c = a-b;
                break;
            case '*':
                c = a*b;
                break;
            case '/':
                c = a/b;
                break;
        }
        str = Float.toString(c);
        answText.setText(str);
    }
}
