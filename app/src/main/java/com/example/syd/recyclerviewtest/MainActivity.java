package com.example.syd.recyclerviewtest;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private RelativeLayout relativeLayout;
    private TextView textViewInt;
    private TextView textViewHex;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initSubViews();
        initDatas();
    }

    private void initSubViews(){
        relativeLayout = (RelativeLayout) findViewById(R.id.activity_main);
        textViewInt = (TextView)findViewById(R.id.tv_colorint);
        textViewHex = (TextView)findViewById(R.id.tv_colorhex);
        imageView = (ImageView)findViewById(R.id.image_color);
    }
    private void initDatas(){
        //setBackgroundColor方法
        relativeLayout.setBackgroundColor(ContextCompat.getColor(this,R.color.colorAccent));
        textViewInt.setBackgroundColor(new  Integer(-12590395));
        textViewHex.setBackgroundColor(Color.parseColor("#3FE2C5"));

        //setImageDrawable方法
        Drawable drawableColor1 = new ColorDrawable(ContextCompat.getColor(this, R.color.colorAccent));//使用colors.xml文件中的颜色【在这里未使用，只是用来说明一种方式】
        Drawable drawableColor2 = new ColorDrawable(new Integer(-2132153879));//使用颜色的int类型值【在这里未使用，只是用来说明一种方式】
        Drawable drawableColor = new ColorDrawable(Color.parseColor("#80e9e9e9"));//使用颜色的16进制类型值
        imageView.setImageDrawable(drawableColor);//设置ImageView控件的src属性值
    }
}
