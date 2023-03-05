package com.example.foodimgmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
        implements View.OnClickListener{

    private TextView output;
    private CheckBox c1,c2,c3,c4,c5;
    private ImageView i1,i2,i3,i4,i5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c1 = (CheckBox) findViewById(R.id.chk1);
        c2 = (CheckBox) findViewById(R.id.chk2);
        c3 = (CheckBox) findViewById(R.id.chk3);
        c4 = (CheckBox) findViewById(R.id.chk4);
        c5 = (CheckBox) findViewById(R.id.chk5);

        c1.setOnClickListener(this);
        c2.setOnClickListener(this);
        c3.setOnClickListener(this);
        c4.setOnClickListener(this);
        c5.setOnClickListener(this);



        i1 = findViewById(R.id.output1);
        i2 = findViewById(R.id.output2);
        i3 = findViewById(R.id.output3);
        i4 = findViewById(R.id.output4);
        i5 = findViewById(R.id.output5);
        output = (TextView) findViewById(R.id.showOrder);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.chk1:
                if (i1.getVisibility() == View.GONE) {
                    i1.setVisibility(view.VISIBLE);
                } else {
                    i1.setVisibility(view.GONE);
                }
                break;
            case R.id.chk2:
                if (i2.getVisibility() == View.GONE) {
                    i2.setVisibility(view.VISIBLE);
                } else {
                    i2.setVisibility(view.GONE);
                }
                break;
            case R.id.chk3:
                if (i3.getVisibility() == View.GONE) {
                    i3.setVisibility(view.VISIBLE);
                } else {
                    i3.setVisibility(view.GONE);
                }
                break;
            case R.id.chk4:
                if (i4.getVisibility() == View.GONE) {
                    i4.setVisibility(view.VISIBLE);
                } else {
                    i4.setVisibility(view.GONE);
                }
                break;
            case R.id.chk5:
                if (i5.getVisibility() == View.GONE) {
                    i5.setVisibility(view.VISIBLE);
                } else {
                    i5.setVisibility(view.GONE);
                }
                break;
        }
        if(i1.getVisibility()==View.VISIBLE||
                i2.getVisibility()==View.VISIBLE||i3.getVisibility()==View.VISIBLE||
                i4.getVisibility()==View.VISIBLE||i5.getVisibility()==View.VISIBLE)
        {
            output.setText("以下為你的餐點");
        }else{
            output.setText("請點餐");
        }
    }

}


