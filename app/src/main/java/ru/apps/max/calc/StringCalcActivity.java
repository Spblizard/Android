package ru.apps.max.calc;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class StringCalcActivity extends AppCompatActivity {
    private TextView answText;
    private EditText editStr;
    Calc cl;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.string_calc_activity);
        answText = (TextView)findViewById(R.id.AnswText);
        editStr = (EditText)findViewById(R.id.editTextNumb);
    }

    public void onButtonStrCalc(View view) {
        if(editStr.getText().length() == 0)
            Toast.makeText(this,"Поле пустое",Toast.LENGTH_SHORT).show();
        else {
            cl = new Calc();
            String str;
            float answ;
            str = editStr.getText().toString();
            str = cl.CalcStr(str);
            //str = Float.toString(answ);
            answText.setText(str);
        }
    }

    public void onButtonCopyPasteStr(View view) {
        String s;
        s = answText.getText().toString();
        editStr.setText(s);
    }
}
