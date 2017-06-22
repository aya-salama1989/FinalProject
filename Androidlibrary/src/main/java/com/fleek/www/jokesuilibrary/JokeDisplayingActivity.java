package com.fleek.www.jokesuilibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindView;

public class JokeDisplayingActivity extends AppCompatActivity {

//    @BindView(R.id.tv_joke)
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_displayer);
//        ButterKnife.bind(this);
//TODO: why didn't butterknife work properly in the android library
        textView = (TextView) findViewById(R.id.tv_joke);
        if(getIntent()!=null){
            String joke = getIntent().getStringExtra("joke");
            textView.setText(joke);
        }
    }
}
