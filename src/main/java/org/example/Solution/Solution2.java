package org.example.Solution;

import java.util.HashMap;
import java.util.Map;

public class Solution2 {
    private Map<Character , Integer> alphabet = new HashMap<Character , Integer>();
    public int lengthOfLongestSubstring(String s){
        int result = 0;
        int len = 0;
        int j = 0;
        for(int i = 0; i < s.length(); i++){
            if(!alphabet.containsKey(s.charAt(i))){
                alphabet.put(s.charAt(i), 1);
                len ++;
                result = Math.max(result, len);
                continue;
            }
            if(alphabet.get(s.charAt(i)) == 0){
                alphabet.merge(s.charAt(i), 1, Integer::sum);
                len ++;
                result = Math.max(result, len);
                continue;
            }
            while(s.charAt(j) != s.charAt(i) && j <= i){
                alphabet.merge(s.charAt(j), -1, Integer::sum);
                len--;
                j++;
            }
            j++;
            result = Math.max(len, result);
        }
        return result;
    }
    public int maximumLengthSubstring2(String s){
        int result = 0;
        int len = 0;
        int j = 0;
        for(int i = 0; i < s.length(); i++){
            if(!alphabet.containsKey(s.charAt(i))){
                alphabet.put(s.charAt(i), 1);
                len ++;
                result = Math.max(result, len);
                continue;
            }
            if(alphabet.get(s.charAt(i)) <= 1){
                alphabet.merge(s.charAt(i), 1, Integer::sum);
                len ++;
                result = Math.max(result, len);
                continue;
            }
            while(s.charAt(j) != s.charAt(i) && j <= i){
                alphabet.merge(s.charAt(j), -1, Integer::sum);
                len--;
                j++;
            }
            j++;
            result = Math.max(len, result);
        }
        return result;
    }
}
