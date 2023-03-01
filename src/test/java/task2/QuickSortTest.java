package test.java.task2;

import main.java.task2.QuickSort;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QuickSortTest {
    static QuickSort quickSort;

    @BeforeAll
    static void init() {
        quickSort = new QuickSort();
    }

    @Test
    void sort() {
        int[] arr = {5, 2, 7, 3, 9, 8, 1, 6, 4};
        int[] arrSort = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        quickSort.sort(arr, 0, arr.length - 1);
        assertArrayEquals(arrSort, arr);
    }

    @Test
    void negativeSort() {
        int[] arr = {-5, -2, -7, -3, -9, -8, -1, -6, -4};
        int[] arrSort = {-9, -8, -7, -6, -5, -4, -3, -2, -1};
        quickSort.sort(arr, 0, arr.length - 1);
        assertArrayEquals(arrSort, arr);
    }

    @Test
    void checkRepetitions() {
        int[] arr = {1, 2, 1, 0, 0, 0, 1, 2, 1, 1, 94, 1231};
        int[] arrSort = {0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 94, 1231};
        quickSort.sort(arr, 0, arr.length - 1);
        assertArrayEquals(arrSort, arr);
    }

    @Test
    void checkMinAndMaxValue() {
        int[] arr = {5, 2, 7, 3, 9, 8, 1, 6, 4, Integer.MAX_VALUE, Integer.MIN_VALUE};
        int[] arrSort = {Integer.MIN_VALUE, 1, 2, 3, 4, 5, 6, 7, 8, 9, Integer.MAX_VALUE};
        quickSort.sort(arr, 0, arr.length - 1);
        assertArrayEquals(arrSort, arr);
    }

    @Test
    void checkAlreadySortedTest() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arrSort = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        quickSort.sort(arr, 0, arr.length - 1);
        assertArrayEquals(arrSort, arr);
    }

    @Test
    void checkReversedTest() {
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] arrSort = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        quickSort.sort(arr, 0, arr.length - 1);
        assertArrayEquals(arrSort, arr);
    }
}

