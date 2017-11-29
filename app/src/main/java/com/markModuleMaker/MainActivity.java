package com.markModuleMaker;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.mypicker.dialogs.MaterialMonthYearPicker;

public class MainActivity extends AppCompatActivity {

    private Button btnText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.btnText = (Button) findViewById(R.id.btnDate);

        btnText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new MaterialMonthYearPicker(MainActivity.this, new MaterialMonthYearPicker.MonthYearSelectionListener() {
                    @SuppressLint("DefaultLocale")
                    @Override
                    public void onMonthYearSelected(String month, int year) {
                        btnText.setText(String.format("%s-%d", month, year));
                    }
                });

            }
        });
    }
}
