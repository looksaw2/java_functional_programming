package org.example.Solution;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Solution1 {
    public int sum(int num1 , int num2){
        return num1 + num2;
    }
    public int maxVowels(String s ,int k){
        if(s.length()<k){
            return -1;
        }
        int result  = 0;
        int maxAEIOU = 0;
        //init
        for(int i = 0; i < k ; i++){
            if(isAEIOU(s.charAt(i))){
                maxAEIOU++;
            }
        }
        result = maxAEIOU;
        var j = 0;
        for(int i = k; i < s.length(); i++){
            j = i - k;
            if(isAEIOU(s.charAt(j))){
                maxAEIOU--;
            }
            if(isAEIOU(s.charAt(i))){
                maxAEIOU++;
            }
            result = Math.max(result,maxAEIOU);
        }
        return result;
    }
    private boolean isAEIOU(char c){
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
            return true;
        }
        return false;
    }

    public double findMaxAverage(int[] nums , int k){
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < k; i++){
            sum += nums[i];
        }
        maxSum = Math.max(sum,maxSum);
        int j = 0;
        for(int i = k; i < nums.length; i++){
            j = i - k;
            sum -= nums[j];
            sum += nums[i];
            maxSum = Math.max(sum,maxSum);
        }
        return (double)maxSum / k;
    }

    public int numOfSubarrays(int[] arr , int k , int threshold){
        int result = 0;
        int sum = 0;
        //
        int target = threshold * k;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        if (sum >= target) {
            result++;
        }
        int j = 0;
        for (int i = k; i < arr.length; i++) {
            j = i - k;
            sum -= arr[j];
            sum += arr[i];
            if (sum >= target) {
                result++;
            }
        }
        return result;
    }


    public int[] getAverages(int[] nums , int k){
        if (nums.length < 2 *k + 1){
            int[] result = new int[nums.length];
            Arrays.fill(result,-1);
            return result;
        }
        int nSum = 0;
        for(int i = 0; i < 2 *k ; i++){
            nSum += nums[i];
        }
        int[] result = new int[nums.length];
        for(int i = 0; i < nums.length ; i++){
            var leftBound = i - k;
            var rightBound = i + k;
            if(leftBound < 0 || rightBound >= nums.length){
                result[i] = -1;
                continue;
            }
            nSum += nums[rightBound];
            result[i] = nSum / (2 *k + 1);
            nSum -= nums[leftBound];
        }
        return result;
    }


    public int minimuRecolors(String blocks , int k){
        int numOfWhiteBlocks = 0;
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < k; i++){
            if(blocks.charAt(i) == 'W'){
                numOfWhiteBlocks++;
            }
        }
        result = Math.min(numOfWhiteBlocks, result);
        int j = 0;
        for(int i = k; i < blocks.length(); i++){
            j = i - k;
            if(blocks.charAt(j) == 'W'){
                numOfWhiteBlocks--;
            }
            if(blocks.charAt(i) == 'W'){
                numOfWhiteBlocks++;
            }
            result = Math.min(numOfWhiteBlocks, result);
        }
        return result;
    }

}
