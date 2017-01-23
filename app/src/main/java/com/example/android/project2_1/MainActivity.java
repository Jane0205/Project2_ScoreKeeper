package com.example.android.project2_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    int Bullsscore = 0;
    int Netsscore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ChicagoBulls(int score) {
        TextView scoreView = (TextView) findViewById(R.id.Bulls_score);
        scoreView.setText(String.valueOf(score));
    }

    public void add3pointforBulls(View view) {
        Bullsscore=Bullsscore+3;
        ChicagoBulls(Bullsscore);
    }

    public void add2pointforBulls(View view) {
        Bullsscore=Bullsscore+2;
        ChicagoBulls(Bullsscore);
    }

    public void add1pointforBulls(View view) {
        Bullsscore=Bullsscore+1;
        ChicagoBulls(Bullsscore);
    }


    public void BrooklynNets(int score) {
        TextView scoreView = (TextView) findViewById(R.id.Nets_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addThreeforNets(View view) {
        Netsscore=Netsscore+3;
        BrooklynNets(Netsscore);
    }

    public void addTwoforNets(View view) {
        Netsscore=Netsscore+2;
        BrooklynNets(Netsscore);
    }

    public void addFreeforNets(View view) {
        Netsscore=Netsscore+1;
        BrooklynNets(Netsscore);
    }

    public void reset(View v) {
        Bullsscore = 0;
        Netsscore = 0;
        ChicagoBulls(Bullsscore);
        BrooklynNets(Netsscore);
    }
}
