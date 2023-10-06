package com.kristoffer.demo;

public class CaseSensitivity {


    // Case Sensitivity
    int myScore = 150;  // A - GOOD
    int MyScore = 255;  // B - BAD

    public static void theAnswerIsThere() {}
    public static void test() {
        // theAnswerisThere(); // Why doesn't this work?
    }

}
