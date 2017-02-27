package com.codeclan.example.stringsplit;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;

/**
 * Created by user on 27/02/2017.
 */

public class TestStringSplit {

    StringSplitter splitter;
    int wordCount;

    @Before
    public void before() {
        splitter = new StringSplitter("The cat sat on the mat.");
    }

    @Test
    public void testStripperStripsStrings(){
        assertEquals("the cat sat on the mat", splitter.strip());
    }

    @Test
    public void testStringSplitterReturnsArray(){
        splitter.splitString();
        assertEquals(6, splitter.getWordList().length);
    }

    @Test
    public void testWordListCounterCountsSingleItems(){
        splitter.splitString();
        splitter.countWordsInWordList();
        wordCount = splitter.getCounter().get("mat");
    }

    @Test
    public void testWordListCountsMultiples() {
        splitter.splitString();
        splitter.countWordsInWordList();
        wordCount = splitter.getCounter().get("the");
        assertEquals(2, wordCount);
    }
}
