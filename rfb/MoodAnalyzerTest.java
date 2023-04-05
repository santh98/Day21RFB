package com.bridgelabz.rfb;

public class MoodAnalyzerTest {
    static MoodAnalyzer moodAnalyzer;
    @Test
    public void testAnalyseAbilityMethod_thenAssertionHappy() {
        moodAnalyzer = new MoodAnalyzer("I am in Happy Mood");
        assertEquals("HAPPY", moodAnalyzer.analyseability());
        System.out.println("UC1: Test Case For Happy Passed");
    }

    @Test
    public void testAnalyseAbilityMethod_thenAssertionSad() {
        moodAnalyzer = new MoodAnalyzer("I am in Sad Mood");
        assertEquals("SAD", moodAnalyzer.analyseability());
        System.out.println("UC1: Test Case For Sad Passed");

    }
    @Test
    public void testgivenNullMoodShouldReturnHaappy_thenAssertionHappy() {
        moodAnalyzer = new MoodAnalyzer();
        assertEquals("HAPPY", moodAnalyzer.analyseability());
        System.out.println("UC2: Null PointerException Handling Test Case Passed");
    }

}
