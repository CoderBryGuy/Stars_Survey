package com.example.hackeru.starssurvey;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends Activity {

    private String[] s = {"how much do you like the Tel Aviv beach", "how much do you like falafel", "how much do you like bibi"};
    private ArrayList<String> questions = new ArrayList<String>(Arrays.asList(s));
    private LinearLayout linearlayout;
    private TextView textView;
    private ArrayList<CheckBox> checkboxes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linearlayout = (LinearLayout)findViewById(R.id.linearLayout);
        for (int i = 0; i < questions.size() ; i++) {
            textView = new TextView(this);
            textView.setText(questions.get(i));
            linearlayout.addView(textView);

            textView.setOnClickListener();

            for (int j = 0; i < 5; j++) {
                CheckBox chk = new CheckBox(this);
                chk.set
                checkboxes.add();

            }
        }


    }
}
