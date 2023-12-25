package com.aogaga.arraycode;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyArrayTest {
    MyArray myArray;

    @BeforeEach
    void setUp() {
        myArray = new MyArray();
    }

    @AfterEach
    void tearDown() {}

    @Test
    void removeEven() {
        int[] arr = {1, 2, 4, 5, 10, 6, 3};
        int[] expected = {1, 5, 3};

        int[] result = myArray.removeEven(arr);
        assertArrayEquals(result, expected);
    }

    @Test
    void mergeArrays() {
        int[] arr1 = {1, 3, 4, 5};
        int[] arr2 = {2, 6, 7, 8};
        int[] actual = {1, 2, 3, 4, 5, 6, 7, 8};

        int[] expected = myArray.mergeArrays(arr1, arr2);
        assertEquals(expected.length, actual.length);
        assertArrayEquals(expected, actual);
    }

    @Test
    void findSum() {
        int[] arr = {1, 21, 3, 14, 5, 60, 7, 6};
        int[] expected = {21, 6};
        int value = 27;

        int[] actual = myArray.findSum(arr, value);
        Arrays.sort(expected);
        Arrays.sort(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    void findProduct() {
        int[] arr = {1, 2, 3, 4};
        int[] arrProduct = {24, 12, 8, 6};

        int[] result = myArray.findProduct(arr);
        assertArrayEquals(arrProduct, result, "they are not equal");
    }

    @Test
    void findMinimum() {
        int[] arr = {9, 2, 3, 6};

        int result = myArray.findMinimum(arr);
        assertEquals(2, result);
    }

    @Test
    void findFirstUnique() {
        int[] arr = {9, 2, 3, 2, 6, 6};
        int[] brr = {4, 5, 1, 2, 0, 4};
        int reuslt = myArray.findFirstUnique(arr);
        int reusltb = myArray.findFirstUnique(brr);
        assertEquals(reuslt, 9);
        assertEquals(reusltb, 5);
    }

    @Test
    void findSecondMaximum() {
        int[] arr = {9, 2, 3, 6};

        int result = myArray.findSecondMaximum(arr);
        assertEquals(result, 6);
    }

    @Test
    void rotateArray() {
        int[] arr = {1, 2, 3, 4, 5};
        int[] expected = {5, 1, 2, 3, 4};

        int[] actual = myArray.rotateArray(arr);
        assertArrayEquals(expected, actual);
    }

    @Test
    void reArrange() {
        int[] arr = {10, -1, 20, 4, 5, -9, -6};
        int[] expected = {-1, -9, -6, 10, 20, 4, 5};
        int[] actual = myArray.reArrange(arr);
        assertArrayEquals(expected, actual);
    }

    @Test
    void maxMin() {
        int[] arr = {1, 2, 3, 4, 5};
        int[] actual = {5, 1, 4, 2, 3};

        int[] expected = myArray.maxMin(arr);
        assertArrayEquals(actual, expected);
    }

    @Test
    void findMaxSumSubArray() {
        int[] arr = {1, 7, -2, -5, 10, -1};

        int actual = myArray.findMaxSumSubArray(arr);
        assertEquals(actual, 11);
    }
}
