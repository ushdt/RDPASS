package com.example.a171y010.rdpass;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Random;

import static java.lang.Math.*;


public class MainActivity extends AppCompatActivity
{
    private Spinner mSpinner;
    public String item;
    String pass;
    private int a;
    String se = "abcdefghijklnmopqrstuvwxyz";
    Random ser;     //seed->25
    int setser;
    String be = "ABCDEFGHIJKLNMOPQRSTUVWXYZ";
    Random ber;     //seed->25
    int setber;
    String num = "1234567890";
    Random numr;    //seed->10
    int setnumr;


    public void PassPop(View view)
    {
        for (int i=0;i<=a;i++)
        {
            ser = new Random();
            setser = ser.nextInt(25) + 1;

            ber = new Random();
            setber = ber.nextInt(25) + 1;

            numr = new Random();
            setnumr = numr.nextInt(10)+1;

            pass = se.substring(setser)+"\n"+be.substring(setber)+"\n"+num.substring(setnumr);
        }
        ((TextView) findViewById(R.id.message)).setText(pass);
    }

    public void Setbord(View view)
    {
        ((TextView) findViewById(R.id.message)).setText("クリップボードにコピーしました");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSpinner= (Spinner) findViewById(R.id.spinner2);

        mSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                // ここにスピナー内のアイテムを選択した際の処理を書く
                 item = (String)mSpinner.getSelectedItem();
                ((TextView) findViewById(R.id.message)).setText(item+"個パスワードを生成します");

                switch (item)
                {
                    case "　1": a=1; break;
                    case "　2": a=2; break;
                    case "　3": a=3; break;
                    case "　4": a=4; break;
                    case "　5": a=5; break;
                    case "　6": a=6; break;
                    case "　7": a=7; break;
                    case "　8": a=8; break;
                    case "　9": a=9; break;
                    case "　10": a=10; break;
                    case "　11": a=11; break;
                    case "　12": a=12; break;
                    case "　13": a=13; break;
                    case "　14": a=14; break;
                    case "　15": a=15; break;
                    case "　16": a=16; break;
                    case "　17": a=17; break;
                    case "　18": a=18; break;
                    case "　19": a=19; break;
                    case "　20": a=20; break;
                    case "　21": a=21; break;
                    case "　22": a=22; break;
                    case "　23": a=23; break;
                    case "　24": a=24; break;
                    case "　25": a=25; break;
                    case "　26": a=26; break;
                    case "　27": a=27; break;
                    case "　28": a=28; break;
                    case "　29": a=29; break;
                    case "　30": a=30; break;
                    case "　31": a=31; break;
                    case "　32": a=32; break;
                    case "　33": a=33; break;
                    case "　34": a=34; break;
                    case "　35": a=35; break;
                    case "　36": a=36; break;
                    case "　37": a=37; break;
                    case "　38": a=38; break;
                    case "　39": a=39; break;
                    case "　40": a=40; break;
                    case "　41": a=41; break;
                    case "　42": a=42; break;
                    case "　43": a=43; break;
                    case "　44": a=44; break;
                    case "　45": a=45; break;
                    case "　46": a=46; break;
                    case "　47": a=47; break;
                    case "　48": a=48; break;
                    case "　49": a=49; break;
                    case "　50": a=50; break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent)
            {
                // スピナーでは使用しない、ただ無いと動かない
            }
        });
    }
}

