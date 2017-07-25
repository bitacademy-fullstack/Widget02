package com.bit2017.widget02;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    private RadioGroup rg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rg = (RadioGroup)findViewById( R.id.radioGroup );
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int checkedId ) {
                TextView textView = (TextView)findViewById( R.id.radioChecker );


                switch( checkedId ) {
                    case R.id.radio1 :
                        textView.setText( "Female Selected" );
                        break;
                    case R.id.radio2 :
                        textView.setText( "Male Selected" );
                        break;
                    default:
                        Log.e( "MainActivity", "Why Happened?" );
                        break;
                }
            }
        });

        findViewById( R.id.checkbox ).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean isChecked = ((CheckBox)view).isChecked();
                ((TextView)findViewById( R.id.checkboxChecker )).
                        setText( isChecked ? "checked" : "unchecked" );
            }
        });

        findViewById( R.id.toggleButton ).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean isChecked = ((ToggleButton)view).isChecked();
                ((TextView)findViewById( R.id.toggleChecker )).
                        setText( isChecked ? "On" : "Off" );
            }
        });
    }
}
