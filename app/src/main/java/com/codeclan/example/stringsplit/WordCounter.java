package com.codeclan.example.stringsplit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WordCounter extends AppCompatActivity {

    EditText enterText;
    Button submitTextForCounting;
    TextView returnCountedList;
    StringSplitter splitmeister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_counter);

        enterText = (EditText) findViewById(R.id.enter_text_to_be_counted);
        submitTextForCounting = (Button) findViewById(R.id.submit_button);
        returnCountedList = (TextView) findViewById(R.id.counted_words_list);

    }

    public void submitButtonPressed(View button){
        splitmeister = new StringSplitter(enterText.getText().toString());
        returnCountedList.setText(splitmeister.doStuff());
    }
}
