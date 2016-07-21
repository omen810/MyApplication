package com.example.lsx.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btn_submit,btn_add;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_submit = (Button) findViewById(R.id.button_submit);
        btn_add = (Button) findViewById(R.id.button_add);
        editText=(EditText)findViewById(R.id.edit_name);
//        btn_submit.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "you clicked submit", Toast.LENGTH_SHORT).show();
//            }
//        });
        btn_submit.setOnClickListener(this);
        btn_add.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_submit:
                Toast.makeText(this, "you clicked submit", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_add:
                String inputText=editText.getText().toString();
                Toast.makeText(this, inputText, Toast.LENGTH_SHORT).show();
                /*Log.d("omen","YYYYY");*/
                break;
            default:
                break;
        }
    }
}
