package com.example.Calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtbtn;
    float mValueOne , mValueTwo ;
    double a;
    double ans=0;
    boolean mAddition , mSubtract ,mMultiplication ,mDivision,mReminder ,
            mNoPower,istpower2ndno,mSin,mArithmetic,mCos,mTan,mSinH,mCosH,mTanH;
    boolean piecheck=false;
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
            equalbutton,
            xcubebutton,
            squarebutton,
            xfactorialbutton,
            logbutton,
            exponentbutton,
            lnbutton,
            sinbutton,
            cosbutton,
            tanbutton,
            oneoverxbutton,
            sinhbutton,
            coshbutton,
            tanhbutton,
            varpower,
            cuberoot,
            tenexponent,
            piebutton,
            squarerootbutton,
            nasbutton,
            cuberootbutton,
            modulosbutton,
            varNoPower,
            epowerbtn,
            stpower2nd,
            ansbuttton;

    ImageButton home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

        scientific_operation();

    }

    public void scientific_operation(){
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
        button3=(Button) findViewById(R.id.threebtn);
        percentagebutton=(Button) findViewById(R.id.modulousbtn);
        button0=(Button) findViewById(R.id.zerobtn);
        pointbutton=(Button) findViewById(R.id.pointbtn);
        equalbutton=(Button) findViewById(R.id.equalbtn);
        squarebutton=(Button) findViewById(R.id.squarebtn);
        xcubebutton=(Button) findViewById(R.id.xcubebtn);
        oneoverxbutton=(Button) findViewById(R.id.onedividebtn);
        exponentbutton=(Button) findViewById(R.id.expbtn);
        logbutton=(Button) findViewById(R.id.logbtn);
        squarerootbutton=(Button) findViewById(R.id.squarerootbtn);
        xfactorialbutton=(Button) findViewById(R.id.xfactorialbtn);
        sinbutton=(Button) findViewById(R.id.sinbtn);
        cosbutton=(Button) findViewById(R.id.cosbtn);
        tanbutton=(Button)findViewById(R.id.tanbtn);
        sinhbutton=(Button)findViewById(R.id.sinhbtn);
        coshbutton=(Button)findViewById(R.id.coshbtn);
        tanhbutton=(Button)findViewById(R.id.tanhbtn);
        lnbutton=(Button) findViewById(R.id.lnbtn) ;
        ansbuttton=(Button) findViewById(R.id.ansbtn);
        piebutton=(Button) findViewById(R.id.piebtn);
        deletebutton=(Button) findViewById(R.id.deletebtn);
        tenexponent=(Button) findViewById(R.id.tenexponent) ;
        cuberootbutton=(Button)findViewById(R.id.cuberootbtn);
        modulosbutton=(Button)findViewById(R.id.modulousbtn);
        varNoPower=(Button)findViewById(R.id.varpowerbtn);
        epowerbtn=(Button) findViewById(R.id.epowerbtn);
        stpower2nd=(Button) findViewById(R.id.istpower2nd);
        // click


        stpower2nd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    mValueOne = Float.parseFloat(txtbtn.getText() + "");
                    istpower2ndno = true;
                    txtbtn.setText(null);
                }
                catch (Exception e) {
                    // Handle the error/exception
                }
            }
        });
        epowerbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Double n= Double.parseDouble(txtbtn.getText().toString());
                    Double exp = (Double) Math.pow(2.718281828, n);
                    txtbtn.setText(exp+"");
                }
                catch (Exception e){

                }

            }
        });
        varNoPower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                try{
//                    mValueOne = Float.parseFloat(txtbtn.getText() + "");
//                    mNoPower = true;
//                    txtbtn.setText(null);
//                }
//                catch (Exception e) {
//                    // Handle the error/exception
//                }
                Intent intent=new Intent(MainActivity.this,StandardCalculator.class);
                startActivity(intent);

            }
        });
        modulosbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    mValueOne = Float.parseFloat(txtbtn.getText() + "");
                    mReminder = true;
                    txtbtn.setText(null);
                }
                catch (Exception e) {
                    // Handle the error/exception
                }
            }
        });
        cuberootbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    a = Math.cbrt(Double.parseDouble(txtbtn.getText().toString()));
                    txtbtn.setText("");
                    txtbtn.setText(txtbtn.getText().toString() + a);
                }
                catch(Exception e){

                }
            }
        });
        tenexponent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {
                    int n= Integer.parseInt(txtbtn.getText().toString());
                    int exp = (int) Math.pow(10, n);
                    txtbtn.setText(exp+"");
                }
                catch (Exception e){

                }
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
        piebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // if(txtbtn.getText().toString()!=null) {
                //     a=Double.parseDouble(txtbtn.getText().toString()) +Math.PI;
                //     txtbtn.setText("" +a );
                //  }
                //    else {
                txtbtn.setText(Math.PI + "");
                //    }
            }
        });
        lnbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    a = Double.parseDouble(txtbtn.getText().toString());
                    double result = (-Math.log(1-a))/a;
                    txtbtn.setText("");
                    txtbtn.setText(txtbtn.getText().toString() + result);
                }
                catch(Exception e){

                }
            }
        });
        tanhbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                try {
//                    a = Math.tanh(Double.parseDouble(txtbtn.getText().toString()));
//                    txtbtn.setText("");
//                    txtbtn.setText(txtbtn.getText().toString() + a);
//                }
//                catch(Exception e){
//
//                }
                txtbtn.setText("tanh");
                mTanH=true;
            }
        });
        coshbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                try {
//                    a = Math.cosh(Double.parseDouble(txtbtn.getText().toString()));
//                    txtbtn.setText("");
//                    txtbtn.setText(txtbtn.getText().toString() + a);
//                }
//                catch(Exception e){
//
//                }
                txtbtn.setText("cosh");
                mCosH=true;
            }
        });
        sinhbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                try {
//                    a = Math.sinh(Double.parseDouble(txtbtn.getText().toString()));
//                    txtbtn.setText("");
//                    txtbtn.setText(txtbtn.getText().toString() + a);
//                }
//                catch(Exception e){
//
//                }
                txtbtn.setText("sinh");
                mSinH=true;

            }
        });
        sinbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                try {
//                    a = Math.sin(Double.parseDouble(txtbtn.getText().toString()));
//                    txtbtn.setText("");
//                    txtbtn.setText(txtbtn.getText().toString() + a);
//                }
//                catch(Exception e){
//
//                }
                txtbtn.setText("sin");
                mSin=true;
            }
        });
        cosbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                try {
//                    a = Math.cos(Double.parseDouble(txtbtn.getText().toString()));
//                    txtbtn.setText("");
//                    txtbtn.setText(txtbtn.getText().toString() + a);
//                }
//                catch(Exception e){
//
//                }
                txtbtn.setText("cos");
                mCos=true;
            }
        });
        tanbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                try {
//                    a = Math.tan(Double.parseDouble(txtbtn.getText().toString()));
//                    txtbtn.setText("");
//                    txtbtn.setText(txtbtn.getText().toString() + a);
//                }
//                catch(Exception e){
//
//                }
                txtbtn.setText("tan");
                mTan=true;
            }
        });
        xfactorialbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    a = Double.parseDouble(txtbtn.getText().toString());
                    int er = 0; double i, s = 1;
                    if (a< 0) {
                        er = 20;
                    }
                    else {

                        for (i = 2; i <= a; i += 1.0)
                            s *= i;
                    }
                    txtbtn.setText("");
                    txtbtn.setText(txtbtn.getText().toString() + s);
                }
                catch(Exception e){

                }
            }
        });

        squarerootbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    a = Math.sqrt(Double.parseDouble(txtbtn.getText().toString()));
                    txtbtn.setText("");
                    txtbtn.setText(txtbtn.getText().toString() + a);
                }
                catch(Exception e){

                }
            }
        });

        logbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    a = Math.log(Double.parseDouble(txtbtn.getText().toString()));
                    txtbtn.setText("");
                    txtbtn.setText(txtbtn.getText().toString() + a);
                }
                catch(Exception e){

                }
            }
        });
        exponentbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    a = Math.exp(Double.parseDouble(txtbtn.getText().toString()));
                    txtbtn.setText("");
                    txtbtn.setText(txtbtn.getText().toString() + a);
                }
                catch(Exception e){

                }
            }
        });
        oneoverxbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    a = 1 / Double.parseDouble(txtbtn.getText().toString());
                    txtbtn.setText("");
                    txtbtn.setText(txtbtn.getText().toString() + a);
                }
                catch(Exception e){
                }
            }
        });
        squarebutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                try{
                    a = Math.pow(Double.parseDouble(txtbtn.getText().toString()), 2);
                    txtbtn.setText("");
                    txtbtn.setText(txtbtn.getText().toString() + a+"");
                }
                catch (Exception e){

                }
            }
        });
        xcubebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    a = Math.pow(Double.parseDouble(txtbtn.getText().toString()), 3);
                    txtbtn.setText("");
                    txtbtn.setText(txtbtn.getText().toString() + a);
                }
                catch (Exception e){

                }
            }
        });
        clearbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtbtn.setText("");
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

                mArithmetic=true;
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtbtn.setText(txtbtn.getText()+"2");
                mArithmetic=true;
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtbtn.setText(txtbtn.getText()+"3");
                mArithmetic=true;
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtbtn.setText(txtbtn.getText()+"4");
                mArithmetic=true;
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtbtn.setText(txtbtn.getText()+"5");
                mArithmetic=true;
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtbtn.setText(txtbtn.getText()+"6");
                mArithmetic=true;
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtbtn.setText(txtbtn.getText()+"7");
                mArithmetic=true;
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtbtn.setText(txtbtn.getText()+"8");
                mArithmetic=true;
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtbtn.setText(txtbtn.getText()+"9");
                mArithmetic=true;
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtbtn.setText(txtbtn.getText()+"0");
                mArithmetic=true;
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

        equalbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//
                if(mSin==true){
                    if(mArithmetic==true){
                        String str;
                        str=txtbtn.getText().toString();
                        str=str.substring(3);
                        a=Math.sin(Double.parseDouble(str));
                        txtbtn.setText(a+"");
                        mArithmetic=false;
                        mSin=false;
                    }

                }
                if(mCos==true){
                    if(mArithmetic==true){
                        String str;
                        str=txtbtn.getText().toString();
                        str=str.substring(3);
                        a=Math.cos(Double.parseDouble(str));
                        txtbtn.setText(a+"");
                        mArithmetic=false;
                        mCos=false;
                    }
                }
                if(mTan==true){
                    if(mArithmetic==true){
                        String str;
                        str=txtbtn.getText().toString();
                        str=str.substring(3);
                        a=Math.sin(Double.parseDouble(str));
                        txtbtn.setText(a+"");
                        mArithmetic=false;
                        mTan=false;
                    }
                }
                if(mSinH==true){
                    if(mArithmetic==true){
                        String str;
                        str=txtbtn.getText().toString();
                        str=str.substring(4);
                        a=Math.sinh(Double.parseDouble(str));
                        txtbtn.setText(a+"");
                        mArithmetic=false;
                        mSinH=false;
                    }

                }
                if(mCosH==true){
                    if(mArithmetic==true){
                        String str;
                        str=txtbtn.getText().toString();
                        str=str.substring(4);
                        a=Math.cosh(Double.parseDouble(str));
                        txtbtn.setText(a+"");
                        mArithmetic=false;
                        mCosH=false;
                    }

                }
                if(mTanH==true){
                    if(mArithmetic==true){
                        String str;
                        str=txtbtn.getText().toString();
                        str=str.substring(4);
                        a=Math.cosh(Double.parseDouble(str));
                        txtbtn.setText(a+"");
                        mArithmetic=false;
                        mTanH=false;
                    }
                }
                if (istpower2ndno == true){
                    mValueTwo = Float.parseFloat(txtbtn.getText() + "");
                    int exp = (int) Math.pow(mValueOne, mValueTwo);
                    txtbtn.setText(exp+"");
                    istpower2ndno=false;
                }
                if (mAddition == true){
                    mValueTwo = Float.parseFloat(txtbtn.getText() + "");
                    txtbtn.setText(mValueOne + mValueTwo +"");
                    mAddition=false;
                }
                if (mReminder == true){
                    mValueTwo = Float.parseFloat(txtbtn.getText() + "");
                    txtbtn.setText(mValueOne % mValueTwo +"");
                    mReminder=false;
                }
                if(mNoPower==true) {
                    mValueTwo = Float.parseFloat(txtbtn.getText() + "");
                    int exp = (int) Math.pow(mValueOne, mValueTwo);
                    txtbtn.setText(exp+"");
                    mNoPower=false;
                }

                if (mSubtract == true){
                    mValueTwo = Float.parseFloat(txtbtn.getText() + "");
                    txtbtn.setText(mValueOne - mValueTwo+"");
                    mSubtract=false;
                }

                if (mMultiplication == true){
                    mValueTwo = Float.parseFloat(txtbtn.getText() + "");
                    txtbtn.setText(mValueOne * mValueTwo+"");
                    mMultiplication=false;
                }

                if (mDivision == true){
                    mValueTwo = Float.parseFloat(txtbtn.getText() + "");
                    txtbtn.setText(mValueOne / mValueTwo+"");
                    mDivision=false;
                }
                ans=Double.parseDouble(txtbtn.getText().toString());
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
        ansbuttton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtbtn.setText(ans+"");
            }
        });
        ////////////////////
    }
}