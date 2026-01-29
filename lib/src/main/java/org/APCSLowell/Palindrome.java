package org.APCSLowell;

public class Palindrome {
    public boolean palindrome(String s) {
        s.toLowerCase();
        String t = new String("");
        for(int i = s.length()-1; i >= 0;i--){
            t = t + s.charAt(i);
        }
        if(t.equals(s)){
            return true;
        }
        return false;
    }
    public String reverse(String s) {
        String n = new String("");
        for(int i = s.length()-1; i >= 0;i--){
            n = n + s.charAt(i);
        }
        return n;
    }
}
