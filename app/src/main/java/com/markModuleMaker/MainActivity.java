package com.markModuleMaker;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.mypicker.dialogs.MaterialMonthPicker;
import com.mypicker.dialogs.MaterialMonthYearPicker;

public class MainActivity extends AppCompatActivity {

    private android.widget.TextView txtDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.txtDate = (TextView) findViewById(R.id.txtDate);
        new MaterialMonthYearPicker(MainActivity.this, new MaterialMonthYearPicker.MonthYearSelectionListener() {
            @SuppressLint("DefaultLocale")
            @Override
            public void onMonthYearSelected(String month, int year) {
                txtDate.setText(String.format("%s-%d", month, year));
            }
        });
    }
}
