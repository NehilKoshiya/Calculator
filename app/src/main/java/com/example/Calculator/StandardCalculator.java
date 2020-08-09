package com.example.Calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class StandardCalculator extends AppCompatActivity {

    TextView txtbtn;
    float mValueOne , mValueTwo ;
    double a;
    boolean mAddition , mSubtract ,mMultiplication ,mDivision ,mReminder;
    Button clearbutton,
            dividebutton,
            multiplybutton,
            deletebutton,
            button7,
            button8,
            button9,
            minusbutton,
            button4,
            button5,
            button6,
            plusbutton,
            button1,
            button2,
            button3,
            percentagebutton,
            button0,
            pointbutton,
            equalbutton;
    ImageButton home;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standard_calculator);
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_IMMERSIVE
                        // Set the content to appear under the system bars so that the
                        // content doesn't resize when the system bars hide and show.
                        | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        // Hide the nav bar and status bar
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN);
        operation();

    }
    public void operation(){
        home=findViewById(R.id.home);
        txtbtn=(TextView) findViewById(R.id.txt);
        clearbutton=(Button) findViewById(R.id.clearrbtn);
        dividebutton=(Button) findViewById(R.id.dividebtn);
        multiplybutton=(Button) findViewById(R.id.multiplybtn);
        deletebutton=(Button) findViewById(R.id.deletebtn);
        button7=(Button) findViewById(R.id.sevenbtn);
        button8=(Button) findViewById(R.id.eightbtn);
        button9=(Button) findViewById(R.id.ninebtn);
        minusbutton=(Button) findViewById(R.id.minusbtn);
        button4=(Button) findViewById(R.id.fourbtn);
        button5=(Button) findViewById(R.id.fivebtn);
        button6=(Button) findViewById(R.id.sixbtn);
        plusbutton=(Button) findViewById(R.id.plusbtn);
        button1=(Button) findViewById(R.id.onebtn);
        button2=(Button) findViewById(R.id.twobtn);
        button3=(Button) findViewById(R.id.three);
        percentagebutton=(Button) findViewById(R.id.percentbtn);
        button0=(Button) findViewById(R.id.zerobtn);
        pointbutton=(Button) findViewById(R.id.pointbtn);
        equalbutton=(Button) findViewById(R.id.equalbtn);

        // click functions



        clearbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtbtn.setText(""+3);
            }
        });
        dividebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtbtn.setText(null);
            }
        });

        //////////////
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtbtn.setText(txtbtn.getText()+"1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtbtn.setText(txtbtn.getText()+"2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtbtn.setText(txtbtn.getText()+"3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtbtn.setText(txtbtn.getText()+"4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtbtn.setText(txtbtn.getText()+"5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtbtn.setText(txtbtn.getText()+"6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtbtn.setText(txtbtn.getText()+"7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtbtn.setText(txtbtn.getText()+"8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtbtn.setText(txtbtn.getText()+"9");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtbtn.setText(txtbtn.getText()+"0");
            }
        });

        plusbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try{
                    mValueOne = Float.parseFloat(txtbtn.getText() + "");
                    mAddition = true;
                    txtbtn.setText(null);
                }
                catch (Exception e) {
                    // Handle the error/exception
                }
            }
        });

        minusbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    mValueOne = Float.parseFloat(txtbtn.getText() + "");
                    mSubtract = true;
                    txtbtn.setText(null);
                }
                catch (Exception e) {
                    // Handle the error/exception
                }
            }
        });

        multiplybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    mValueOne = Float.parseFloat(txtbtn.getText() + "");
                    mMultiplication = true;
                    txtbtn.setText(null);
                }
                catch (Exception e) {
                    // Handle the error/exception
                }
            }
        });

        dividebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    mValueOne = Float.parseFloat(txtbtn.getText() + "");
                    mDivision = true;
                    txtbtn.setText(null);
                }
                catch (Exception e) {
                    // Handle the error/exception
                }
            }
        });

        percentagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                try {
//                    mValueOne = Float.parseFloat(txtbtn.getText() + "");
//                    mReminder = true;
//                    txtbtn.setText(null);
//                }
//                catch (Exception e) {
//                    // Handle the error/exception
//                }
                Intent intent=new Intent(StandardCalculator.this,MainActivity.class);
                startActivity(intent);
            }
        });
        equalbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Float.parseFloat(txtbtn.getText() + "");
                if (mAddition == true){

                    txtbtn.setText(mValueOne + mValueTwo +"");
                    mAddition=false;
                }
                if (mReminder == true){

                    txtbtn.setText(mValueOne % mValueTwo +"");
                    mReminder=false;
                }

                if (mSubtract == true){
                    txtbtn.setText(mValueOne - mValueTwo+"");
                    mSubtract=false;
                }

                if (mMultiplication == true){
                    txtbtn.setText(mValueOne * mValueTwo+"");
                    mMultiplication=false;
                }

                if (mDivision == true){
                    txtbtn.setText(mValueOne / mValueTwo+"");
                    mDivision=false;
                }
            }
        });

        clearbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtbtn.setText(null);
                // a = Math.sin(Double.parseDouble(txtbtn.getText()+""));
                //   txtbtn.setText(""+a);
            }
        });

        pointbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtbtn.setText(txtbtn.getText()+".");
            }
        });
        deletebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String str;
                    str = txtbtn.getText().toString();
                    str = str.substring(0, str.length() - 1);
                    txtbtn.setText(str);
                }
                catch (Exception e){

                }
            }
        });
    }
}