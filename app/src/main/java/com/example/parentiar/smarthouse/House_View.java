package com.example.parentiar.smarthouse;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static android.R.attr.button;

public class House_View extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_house__view);
    }

        public void tvpwrclick(View v) {
            Button button=(Button) v;
            ((Button) v).setText("clicked lol");

        }

}
