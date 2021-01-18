package com.example.set_ops;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView set1;
    TextView set2;
    Button button;
    TextView output;
    TextView output2;
    TextView output3;
    private Object Arrays;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button)findViewById(R.id.button);
        set1=(TextView) findViewById(R.id.textView);
        set2=(TextView) findViewById(R.id.textView2);
        output=(TextView) findViewById(R.id.textView3);
        output2=(TextView) findViewById(R.id.textView4);
        output3=(TextView) findViewById(R.id.textView5);

        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String inpt = set1.getText().toString();
        String inpt2 = set2.getText().toString();
        Set<String> st = new HashSet<>(java.util.Arrays.asList(inpt.split("\\s*,\\s*")));
        Set<String> st2 = new HashSet<>(java.util.Arrays.asList(inpt2.split("\\s*,\\s*")));
        Set<String> temp = new HashSet<>(st);
        Set<String> temp2 = new HashSet<>(st);
        Set<String> temp3 = new HashSet<>(st);
        temp.retainAll(st2);
        temp2.addAll(st2);
        temp3.removeAll(st2);
        output.setText(String.valueOf(temp));
        output2.setText(String.valueOf(temp2));
        output3.setText(String.valueOf(temp3));


    }
}