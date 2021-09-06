package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {
    private MediaPlayer mMediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<Word> Words = new ArrayList<>();

        Words.add(new Word("one", "lutti",R.drawable.number_one,R.raw.number_one));
        Words.add(new Word("two", "otiiko",R.drawable.number_two,R.raw.number_two));
        Words.add(new Word("three", "tolookosu",R.drawable.number_three,R.raw.number_three));
        Words.add(new Word("four", "oyyisa",R.drawable.number_four,R.raw.number_four));
        Words.add(new Word("five", "massokka",R.drawable.number_five,R.raw.number_five));
        Words.add(new Word("six", "temmokka",R.drawable.number_six,R.raw.number_six));
        Words.add(new Word("seven", "kenekaku",R.drawable.number_seven,R.raw.number_seven));
        Words.add(new Word("eight", "kawinta",R.drawable.number_eight,R.raw.number_eight));
        Words.add(new Word("nine", "wo’e",R.drawable.number_nine,R.raw.number_nine));
        Words.add(new Word("ten", "na’aacha",R.drawable.number_ten,R.raw.number_ten));

        WordAdapter adapter = new WordAdapter(this, Words, R.color.category_numbers);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word word = Words.get(position);
                mMediaPlayer = MediaPlayer.create(NumbersActivity.this,word.getAudioResourseId());
                mMediaPlayer.start();
            }
        });
    }
}