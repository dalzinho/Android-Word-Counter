package com.codeclan.example.stringsplit;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;

/**
 * Created by user on 27/02/2017.
 */

public class StringSplitter {

    //instance variables
    private String originalString;
    private String[] wordList;
    private HashMap<String, Integer> counter;

    //constructor
    public StringSplitter(String input) {
        this.originalString = input;
    }

    //getters
    public HashMap<String,Integer> getCounter() {
        return counter;
    }

    public String[] getWordList() {
        return wordList;
    }

    //methods

    public String strip(){
        String strippedString = originalString.replaceAll("[^a-zA-z\\s]", "");
        return strippedString.toLowerCase();
    }

    public void splitString() {
        String strippedString = strip();
        wordList = strippedString.split(" ");
    }

    public void countWordsInWordList(){
        counter = new HashMap<>();
        for(String word : wordList){
            if(counter.containsKey(word)){
                counter.put(word, counter.get(word) + 1);
            }
            else {
                counter.put(word, 1);
            }
        }
    }

    public String doStuff(){
        StringBuilder iteratedList = new StringBuilder();

        splitString();
        countWordsInWordList();

        for (String word : counter.keySet()){
            iteratedList.append(word + " | " + counter.get(word) + "\n");
        }
        return iteratedList.toString();
    }
}
