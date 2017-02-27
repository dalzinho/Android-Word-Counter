package com.codeclan.example.stringsplit;

/**
 * Created by user on 27/02/2017.
 */

public class Runner {
    public static void main(String[] args) {
        String text = "It was a bright cold day in April, and the clocks were striking thirteen.\n" +
                "Winston Smith, his chin nuzzled into his breast in an effort to escape the\n" +
                "vile wind, slipped quickly through the glass doors of Victory Mansions,\n" +
                "though not quickly enough to prevent a swirl of gritty dust from entering\n" +
                "along with him.";
        StringSplitter splitter = new StringSplitter(text);
        splitter.doStuff();
    }
}
