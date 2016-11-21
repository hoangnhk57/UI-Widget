package com.example.jax.clickablewidget;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.tv);
    }

    // Buton, ImageButon
    private void setColor(int color) {
        tv.setBackgroundColor(color);
    }

    public void bt_red(View clicked) {
        setColor(Color.RED);
    }

    public void bt_blue(View clicked) {
        setColor(Color.BLUE);
    }

    public void bt_yellow(View clicked) {
        setColor(Color.YELLOW);
    }

    // Toggle Button
    private void setColorToggle(View toggle, int color) {
        ToggleButton toggleButton = (ToggleButton) toggle;
        if (toggleButton.isChecked()) {
            setColor(color);
        } else {
            setColor(Color.BLACK);
        }
    }

    public void Toggle_bt_red(View toggle) {
        setColorToggle(toggle, Color.RED);
    }

    public void Toggle_bt_blue(View toggle) {
        setColorToggle(toggle, Color.BLUE);
    }

    public void Toggle_bt_yellow(View toggle) {
        setColorToggle(toggle, Color.YELLOW);
    }

    //radio group
    public void ButtonChoseColor(View Clicked) {
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radio1);
        int idChecked = radioGroup.getCheckedRadioButtonId();
        switch (idChecked) {
            case R.id.red_radio:
                setColor(Color.RED);
                break;
            case R.id.yellow_radio:
                setColor(Color.YELLOW);
                break;
            case R.id.blue_radio:
                setColor(Color.BLUE);
                break;
            default:
                setColor(Color.BLACK);
        }
    }
}
