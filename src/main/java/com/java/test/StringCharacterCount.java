package com.java.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Find the count of each characters
 *
 */
public class StringCharacterCount
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String input = scan.nextLine();
        Map<Character, Integer> result = findCharacterCount(input);
        for(Map.Entry<Character, Integer> e : result.entrySet()) {
            System.out.println("Count of " + e.getKey() + " is " + e.getValue());
        }
    }

    /**
     * Find the count of each characters and add each of them into the map by character as key and the count as value.
     * @param input
     * @return
     */
    public static Map<Character, Integer> findCharacterCount(String input) {
        Map<Character, Integer> result = new HashMap();
        char ch[] = input.toCharArray();
        for(char c: ch) {
            if(result.containsKey(c)) {
                result.put(c, result.get(c) + 1);
            } else {
                result.put(c, 1);
            }
        }
        return result;
    }
}
