package com.mirea.chubuka_v_a.click_buttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvOut;
    private Button buttonOk;
    private Button buttonCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvOut = (TextView) findViewById(R.id.textView);
        buttonOk = (Button) findViewById(R.id.button3);
        buttonCancel = (Button) findViewById(R.id.button4);

        View.OnClickListener oclBtnOk = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvOut.setText("Нажата кнопка OK");
            }
        };


        buttonOk.setOnClickListener(oclBtnOk);
    }

    public void oclBntCancel(View view) {
        tvOut.setText("Нажата кнопка CANCEL");
    }
}