package com.aogaga.arraycode;

import java.util.HashMap;

public class MyArray {
    int[] removeEven(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                count++;
            }
        }
        int resultIndex = 0;
        int[] result = new int[count];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                result[resultIndex++] = arr[i];
            }
        }
        return result;
    }

    int[] mergeArrays(int[] arr, int[] brr) {
        int len = arr.length + brr.length;
        int[] result = new int[len];
        int a = 0;
        int b = 0;
        int counter = 0;

        while (a < arr.length && b < brr.length) {

            if (arr[a] <= brr[b]) {
                result[counter++] = arr[a++];
            } else {
                result[counter++] = brr[b++];
            }
        }

        while (a < arr.length) {
            result[counter++] = arr[a++];
        }

        while (b < brr.length) {
            result[counter++] = brr[b++];
        }
        return result;
    }

    int[] findSum(int[] arr, int n) {
        int[] result = new int[2];

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {
                if (arr[j] + arr[i] == n) {
                    result[0] = arr[j];
                    result[i] = arr[i];
                    return result;
                }
            }
        }

        return result;
    }

    int[] findProduct(int[] arr) {
        int total = 1;
        for (int i = 0; i < arr.length; i++) {
            total = total * arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = total / arr[i];
        }
        return arr;
    }

    int findMinimum(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    int findFirstUnique(int[] arr) {
        HashMap<Integer, Integer> charMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (charMap.containsKey(arr[i])) {
                int val = charMap.get(arr[i]);
                val++;
                charMap.replace(arr[i], val);
            } else {
                charMap.put(arr[i], 1);
            }
        }

        for (int i = 0; i < arr.length; i++) {

            if (charMap.get(arr[i]) == 1) {
                return arr[i];
            }
        }
        return -1;
    }

    int findSecondMaximum(int[] arr) {
        int max = Integer.MIN_VALUE;
        int max1 = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max && arr[i] > max1) {
                max1 = max;
                max = arr[i];
            } else {
                if (arr[i] > max1 && arr[i] < max) {
                    max1 = arr[i];
                }
            }
        }

        return max1;
    }

    int[] rotateArray(int[] arr) {
        int first = arr[0];
        int previous = arr[arr.length - 1];
        int current = 0;
        for (int i = 0; i < arr.length; i++) {
            current = arr[i];
            arr[i] = previous;
            previous = current;
        }
        return arr;
    }

    int[] reArrange(int[] arr) {
        int[] result = new int[arr.length];
        int resultCounter = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 0){
                result[resultCounter++] = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >= 0){
                result[resultCounter++] = arr[i];
            }
        }

        return result;
    }

    int[] maxMin(int[] arr){
        int mid = arr.length/2;
        int[] result = new int[arr.length];
        int arlen = arr.length -1;
        int counter = 0;
        for(int i = 0; i < mid; i++){
            result[counter++] = arr[arlen - i];
            result[counter++] = arr[i];


        }
        if(arr.length %2 != 0){
            result[counter++] = arr[mid];
        }
        return result;
    }
}
