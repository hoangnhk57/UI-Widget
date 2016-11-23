package com.example.jax.clickablewidget;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    TextView mDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mDisplay = (TextView) findViewById(R.id.tv);
    }

    // Buton, ImageButon
    private void setColor(int color) {
        mDisplay.setBackgroundColor(color);
    }

    public void clickChooseRed(View clicked) {
        setColor(Color.RED);
    }

    public void clickChooseBlue(View clicked) {
        setColor(Color.BLUE);
    }

    public void clickChooseYellow(View clicked) {
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

    public void clickToggleChooseRed(View toggle) {
        setColorToggle(toggle, Color.RED);
    }

    public void clickToggleChooseBlue(View toggle) {
        setColorToggle(toggle, Color.BLUE);
    }

    public void clickToggleChooseYellow(View toggle) {
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
