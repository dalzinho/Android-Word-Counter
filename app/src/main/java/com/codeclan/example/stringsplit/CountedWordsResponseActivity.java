package com.codeclan.example.stringsplit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class CountedWordsResponseActivity extends AppCompatActivity {

    TextView answerTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counted_words_response);

        answerTextView = (TextView)findViewById(R.id.counted_words_list);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String answer = extras.getString("key_counted_words");

        answerTextView.setText(answer);
    }
}
