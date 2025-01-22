package org.example.jan22;

import java.util.*;


public class ReverseStringSkippingSpecialChars {
    public static void main(String[] args) {
        String a="1#S45%KL@9";
        String b=reverseStringWithoutSpecialChar(a);
        System.out.println("input :  "+a);
        System.out.println("output : "+b);
    }

    public static String reverseString(String input){
      List<String> charList = Arrays.asList(input.split(""));
        Collections.reverse(charList);
        return String.join("", charList);
    }

    public static String reverseStringWithoutSpecialChar(String input){

        List<Character> nonSpecial =new ArrayList<>();
        for (char c:input.toCharArray()){
            if (Character.isLetterOrDigit(c)){
                nonSpecial.add(c);
            }
        }
        Collections.reverse(nonSpecial);

        int i =0;
        StringBuilder sb =new StringBuilder();
        for (char c:input.toCharArray()){
            if (Character.isLetterOrDigit(c)){
                sb.append(nonSpecial.get(i++));
            }else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
