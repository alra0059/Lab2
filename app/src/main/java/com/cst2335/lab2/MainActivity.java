package com.cst2335.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    Button btn;
    Switch sw;
    Snackbar sb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_linear);


        btn = findViewById(R.id.mybtn);
        sw = findViewById(R.id.switch2);
        sw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton cb, boolean b) {

                String onoff = "";

                if (b){
                    onoff = getString(R.string.on);
                }else{
                    onoff = getString(R.string.off);
                }
                Snackbar mySnackbar =  Snackbar.make(findViewById(R.id.content),
                        getString(R.string.switch_text)+ onoff, Snackbar.LENGTH_SHORT);
                mySnackbar.setAction(R.string.undo_string, click -> cb.setChecked(!b));
                mySnackbar.show();
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Here is more information", Toast.LENGTH_SHORT).show();
            }
        });
    }
}