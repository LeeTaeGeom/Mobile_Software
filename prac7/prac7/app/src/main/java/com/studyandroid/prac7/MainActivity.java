package com.studyandroid.prac7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    TextView text1, text2;
    CheckBox start;
    RadioGroup rgroup;
    RadioButton dog, cat, rabbit;
    Button submit;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("애완동물 사진 보기");

        text1 = (TextView) findViewById(R.id.text1);
        start = (CheckBox) findViewById(R.id.start);
        text2 = (TextView) findViewById(R.id.text2);
        rgroup = (RadioGroup) findViewById(R.id.rgroup);
        dog = (RadioButton) findViewById(R.id.dog);
        cat = (RadioButton) findViewById(R.id.cat);
        rabbit = (RadioButton) findViewById(R.id.rabbit);

        submit = (Button) findViewById(R.id.submit);
        image = (ImageView) findViewById(R.id.image);

        start.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(start.isChecked()){
                    text2.setVisibility(View.VISIBLE);
                    rgroup.setVisibility(View.VISIBLE);
                    submit.setVisibility(View.VISIBLE);
                    image.setVisibility(View.VISIBLE);
                }
                else{
                    text2.setVisibility(View.INVISIBLE);
                    rgroup.setVisibility(View.INVISIBLE);
                    submit.setVisibility(View.INVISIBLE);
                    image.setVisibility(View.INVISIBLE);
                }
            }
        });

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(rgroup.getCheckedRadioButtonId()){
                    case R.id.dog:
                        image.setImageResource(R.drawable.dog);
                        break;
                    case R.id.cat:
                        image.setImageResource(R.drawable.cat);
                        break;
                    case R.id.rabbit:
                        image.setImageResource(R.drawable.rabbit);
                        break;
                    default:
                        Toast.makeText(getApplicationContext(),"동물 먼저 선택하세요",
                                Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}