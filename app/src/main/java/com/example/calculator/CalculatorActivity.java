package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.app.Activity;

public class CalculatorActivity extends Activity  implements OnClickListener{

    //声明一些控件
    Button ac_btn=null;
    Button sq_btn=null;
    Button cube_btn=null;
    Button percent_btn=null;
    Button plus_btn=null;
    Button minus_btn=null;
    Button multiply_btn=null;
    Button divide_btn=null;
    Button one_btn=null;
    Button two_btn=null;
    Button three_btn=null;
    Button four_btn=null;
    Button five_btn=null;
    Button six_btn=null;
    Button seven_btn=null;
    Button eight_btn=null;
    Button nine_btn=null;
    Button zero_btn=null;
    Button back_btn=null;
    Button equal_btn=null;
    Button sin_btn=null;
    Button cos_btn=null;
    Button jinzhi_btn=null;
    Button bajinzhi_btn=null;
    Button spot_btn=null;
    TextView show=null;
    //声明两个参数。接收show前后的值
    double num1=0,num2=0;
    double Result=0;//计算结果
    int n=0;//判断操作数，
    boolean isClickEqu=false;//判断是否按了“=”按钮

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        //从布局文件中获取控件，
        ac_btn=(Button)findViewById(R.id.ac_btn);
        sq_btn=(Button)findViewById(R.id.sq_btn);
        cube_btn=(Button)findViewById(R.id.cube_btn);
        percent_btn=(Button)findViewById(R.id.percent_btn);
        plus_btn=(Button)findViewById(R.id.plus_btn);
        minus_btn=(Button)findViewById(R.id.minus_btn);
        multiply_btn=(Button)findViewById(R.id.multiply_btn);
        divide_btn=(Button)findViewById(R.id.divide_btn);
        one_btn=(Button)findViewById(R.id.one_btn);
        two_btn=(Button)findViewById(R.id.two_btn);
        three_btn=(Button)findViewById(R.id.three_btn);
        four_btn=(Button)findViewById(R.id.four_btn);
        five_btn=(Button)findViewById(R.id.five_btn);
        six_btn=(Button)findViewById(R.id.six_btn);
        seven_btn=(Button)findViewById(R.id.seven_btn);
        eight_btn=(Button)findViewById(R.id.eight_btn);
        nine_btn=(Button)findViewById(R.id.nine_btn);
        zero_btn=(Button)findViewById(R.id.zero_btn);
        back_btn=(Button)findViewById(R.id.back_btn);
        sin_btn=(Button)findViewById(R.id.sin_btn);
        cos_btn=(Button)findViewById(R.id.cos_btn);
        bajinzhi_btn=(Button)findViewById(R.id.bajinzhi_btn);
        jinzhi_btn=(Button)findViewById(R.id.jinzhi_btn);
        spot_btn=(Button)findViewById(R.id.spot_btn);
        equal_btn=(Button)findViewById(R.id.equal_btn);
        show=(TextView)findViewById(R.id.show);

        //添加监听\
        back_btn.setOnClickListener(this);
        ac_btn.setOnClickListener(this);

        zero_btn.setOnClickListener(this);
        one_btn.setOnClickListener(this);
        two_btn.setOnClickListener(this);
        three_btn.setOnClickListener(this);
        four_btn.setOnClickListener(this);
        five_btn.setOnClickListener(this);
        six_btn.setOnClickListener(this);
        seven_btn.setOnClickListener(this);
        eight_btn.setOnClickListener(this);
        nine_btn.setOnClickListener(this);

        percent_btn.setOnClickListener(this);
        plus_btn.setOnClickListener(this);
        minus_btn.setOnClickListener(this);
        multiply_btn.setOnClickListener(this);
        divide_btn.setOnClickListener(this);
        equal_btn.setOnClickListener(this);
        sq_btn.setOnClickListener(this);
        cube_btn.setOnClickListener(this);
        sin_btn.setOnClickListener(this);
        cos_btn.setOnClickListener(this);
        jinzhi_btn.setOnClickListener(this);
        bajinzhi_btn.setOnClickListener(this);
        spot_btn.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            //back和AC--------------------
            case R.id.back_btn:
                String myStr=show.getText().toString();
                try {
                    show.setText(myStr.substring(0, myStr.length() - 1));
                } catch (Exception e) {
                    show.setText("");
                }

                break;
            case R.id.ac_btn:
                show.setText(null);
                break;

            //btn0--9---------------------------
            case R.id.zero_btn:
                if(isClickEqu)
            {
                show.setText(null);
                isClickEqu=false;
            }
            String myString=show.getText().toString();
            myString+="0";
            show.setText(myString);
            break;
            case R.id.one_btn:
                if(isClickEqu)
                {
                    show.setText(null);
                    isClickEqu=false;
                }
                String myString1=show.getText().toString();
                myString1+="1";
                show.setText(myString1);
                break;
            case R.id.two_btn:
                if(isClickEqu)
                {
                    show.setText(null);
                    isClickEqu=false;
                }
                String myString2=show.getText().toString();
                myString2+="2";
                show.setText(myString2);
                break;
            case R.id.three_btn:
                if(isClickEqu)
                {
                    show.setText(null);
                    isClickEqu=false;
                }
                String myString3=show.getText().toString();
                myString3+="3";
                show.setText(myString3);
                break;
            case R.id.four_btn:
                if(isClickEqu)
                {
                    show.setText(null);
                    isClickEqu=false;
                }
                String myString4=show.getText().toString();
                myString4+="4";
                show.setText(myString4);
                break;
            case R.id.five_btn:
                if(isClickEqu)
                {
                    five_btn.setText(null);
                    isClickEqu=false;
                }
                String myString5=show.getText().toString();
                myString5+="5";
                show.setText(myString5);
                break;
            case R.id.six_btn:
                if(isClickEqu)
                {
                    show.setText(null);
                    isClickEqu=false;
                }
                String myString6=show.getText().toString();
                myString6+="6";
                show.setText(myString6);
                break;
            case R.id.seven_btn:
                if(isClickEqu)
                {
                    show.setText(null);
                    isClickEqu=false;
                }
                String myString7=show.getText().toString();
                myString7+="7";
                show.setText(myString7);
                break;
            case R.id.eight_btn:
                if(isClickEqu)
                {
                    show.setText(null);
                    isClickEqu=false;
                }
                String myString8=show.getText().toString();
                myString8+="8";
                show.setText(myString8);
                break;
            case R.id.nine_btn:
                if(isClickEqu)
                {
                    show.setText(null);
                    isClickEqu=false;
                }
                String myString9=show.getText().toString();
                myString9+="9";
                show.setText(myString9);
                break;
            case R.id.spot_btn:
                if(isClickEqu)
                {
                    show.setText(null);
                    isClickEqu=false;
                }
                String myStringspot=show.getText().toString();
                myStringspot+=".";
                show.setText(myStringspot);
                break;

            //btn+-*/=--------------------------------
            case R.id.plus_btn:     //加
                String myStringAdd=show.getText().toString();
                if(myStringAdd.equals(null))
                {
                    return;
                }
                num1=Double.valueOf(myStringAdd);
                show.setText(null);
                n=1;
                isClickEqu=false;
                break;

            case R.id.minus_btn:     //减
                String myStringSub=show.getText().toString();
                if(myStringSub.equals(null))
                {
                    return;
                }
                num1=Double.valueOf(myStringSub);
                show.setText(null);
                n=2;
                isClickEqu=false;
                break;
            case R.id.multiply_btn:     //乘
                String myStringMul=show.getText().toString();
                if(myStringMul.equals(null))
                {
                    return;
                }
                num1=Double.valueOf(myStringMul);
                show.setText(null);
                n=3;
                isClickEqu=false;
                break;
            case R.id.divide_btn:      //除
                String myStringDiv=show.getText().toString();
                if(myStringDiv.equals(null))
                {
                    return;
                }
                num1=Double.valueOf(myStringDiv);
                show.setText(null);
                n=4;
                isClickEqu=false;
                break;
            case R.id.percent_btn:    //%
                String myStringPer=show.getText().toString();
                num1=Double.valueOf(myStringPer);
                num1=num1/100;
                String show3=String.valueOf(num1);
                show.setText(show3);
                isClickEqu=true;
                break;
            case R.id.sq_btn:      //平方
                String myStringsq=show.getText().toString();
                num1=Double.valueOf(myStringsq);
                double num2=num1*num1;
                String show1=String.valueOf(num2);
                show.setText(show1);
                isClickEqu=true;
                break;
            case R.id.cube_btn:    //立方
                String myStringcube=show.getText().toString();
                num1=Double.valueOf(myStringcube);
                double numCube=num1*num1*num1;
                String show2=String.valueOf(numCube);
                show.setText(show2);
                isClickEqu=true;
                break;
            case R.id.sin_btn:   //sin
                String myStringsin=show.getText().toString();
                num1=Double.valueOf(myStringsin);
                double numsin=Math.sin(num1);
                String showsin=String.valueOf(numsin);
                show.setText(showsin);
                isClickEqu=true;
                break;
            case R.id.cos_btn:    //cos
                String myStringcos=show.getText().toString();
                num1=Double.valueOf(myStringcos);
                double numcos=Math.cos(num1);
                String showcos=String.valueOf(numcos);
                show.setText(showcos);
                isClickEqu=true;
                break;
            case R.id.jinzhi_btn:     //二进制
                String myStringjinzhi=show.getText().toString();
                num1= Integer.parseInt(myStringjinzhi);
                String numjinzhi=Integer.toBinaryString((int) num1);
                String showjinzhi=String.valueOf(numjinzhi);
                show.setText(showjinzhi);
                isClickEqu=true;
                break;
            case R.id.bajinzhi_btn:   //八进制
                String myStringbajinzhi=show.getText().toString();
                num1= Integer.parseInt(myStringbajinzhi);
                String numbajinzhi=Integer.toOctalString((int) num1);
                String showbajinzhi=String.valueOf(numbajinzhi);
                show.setText(showbajinzhi);
                isClickEqu=true;
                break;
            case R.id.equal_btn:  //=
                String myStringEqu=show.getText().toString();
                if(myStringEqu.equals(null))
                {
                    return;
                }
                num2=Double.valueOf(myStringEqu);
                show.setText(null);
                switch (n) {
                    case 0:
                        Result=num2;
                        break;
                    case 1:
                        Result=num1+num2;
                        break;
                    case 2:
                        Result=num1-num2;
                        break;
                    case 3:
                        Result=num1*num2;
                        break;
                    case 4:
                        Result=num1/num2;
                        break;
                    default:
                        Result=0;
                        break;
                }
                show.setText(String.valueOf(Result));
                isClickEqu=true;
                break;

            default:
                break;
        }
    }
}
