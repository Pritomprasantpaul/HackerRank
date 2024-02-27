package com.java.basicCertification;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


class Result {

    /*
     * Complete the 'typeCounter' function below.
     *
     * The function accepts STRING sentence as parameter.
     */

    public static void typeCounter(String sentence) {
        int str = 0;
        int in =0;
        int doub = 0;
        boolean d =false;
        String[] sentenceArr = sentence.split(" ");
        for(String sen: sentenceArr){
            if((sen.charAt(0)>='a' && sen.charAt(0)<='z') || (sen.charAt(0)>='A' && sen.charAt(0)<='Z'))
                ++str;
            else {
            	if(sen.charAt(0)>='0' && sen.charAt(0)<='9') {
            		char[] ch = sen.toCharArray();
            		for(char c : ch) {
            			if(c == '.') {
            				++doub;
            				d = true;
            			}	
            		}
            		if(d==false)
            			++in;
            	}
                
            }
        }
        System.out.println("string "+str);
        System.out.println("integer "+in);
        System.out.println("double "+doub);

    }

}
public class TypeCounter {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String sentence = bufferedReader.readLine();

        Result.typeCounter(sentence);

        bufferedReader.close();
    }
}
