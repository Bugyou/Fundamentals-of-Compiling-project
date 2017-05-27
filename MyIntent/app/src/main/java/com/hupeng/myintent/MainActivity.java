package com.hupeng.myintent;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.net.URL;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Log.d("aspectin", "onActivityMethodBefore: " + "in");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Button button1=(Button)findViewById(R.id.button_1);
        Button button2=(Button)findViewById(R.id.button_2);
        Button button3=(Button)findViewById(R.id.button_3);
        Button button4=(Button)findViewById(R.id.button_4);

        button1.setOnClickListener(new View.OnClickListener(){
          @Override
          public void onClick(View v) {
              //发送一个显示意图，设置ComponentName参数1:packagename参数 2:Activity路径
              Intent intent = new Intent();
              ComponentName cn = new ComponentName("org.lumicall.android", "org.sipdroid.sipua.ui.PSTN");
              intent.setComponent(cn);
              intent.setData(Uri.parse("s:15624952092"));
              startActivity(intent);
          }
        });

        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent2=new Intent();
                intent2.setAction("android.intent.action.SENDTO");
                intent2.addCategory("android.intent.category.BROWSABLE");
                intent2.setData(Uri.parse("sms:15624952092"));
                startActivity(intent2);
            }
        });

        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent3=new Intent();
                ComponentName cn=new ComponentName("org.moire.opensudoku","org.moire.opensudoku.gui.FileImportActivity");
                intent3.setComponent(cn);
                intent3.setData(Uri.parse("https://pan.baidu.com/share/link?shareid=249335716&uk=1780979501/test.sdm"));
                startActivity(intent3);
            }
        });
    }
}
