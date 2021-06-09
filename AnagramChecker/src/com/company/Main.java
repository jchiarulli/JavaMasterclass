package com.company;

public class Main {

    public static void main(String[] args) {
        String word1 = "night";
        String word2 = "thing";

       boolean result = anagramChecker(word1, word2);

        System.out.println(result);
    }

    public static char[] sortWord(String str) {
        char charArray[] = str.toCharArray();
        char temp;

        for(int i = 0; i < charArray.length; i++) {
            for(int j = i + 1; j < charArray.length; j++) {
                if(charArray[i] > charArray[j]) {
                    temp = charArray[i];
                    charArray[i] = charArray[j];
                    charArray[j] = temp;
                }
            }
        }
        return charArray;
    }

    public static boolean anagramChecker(String word1, String word2) {
        int lengthOfWord1 = word1.length();
        int lengthOfWord2 = word2.length();

        if(lengthOfWord1 != lengthOfWord2) {
            return false;
        }

        char word1CharArray[] = sortWord(word1);
        char word2CharArray[] = sortWord(word2);

        for(int i = 0; i < lengthOfWord1; i++) {
            if(word1CharArray[i] != word2CharArray[i]) {
                return false;
            }
        }
        return true;
    }
}
