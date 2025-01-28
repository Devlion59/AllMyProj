package org.sort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Quick {

    public static int partition(int[] arr, int low, int high) {

        //когда опорное значение берется по середине и далее ставится вконец для отработки алгоритма
        int middle = (high+low)/2;
        //int middle = low + (high-low)/2; либо так определять середину. уточнить
        swap(arr, middle, high);

        //опорная точка берется крайняя
        int index = high;
        int pivot = arr[index];



            for (int i = low; i < index;) {
                if (arr[i] > pivot) {
                    swap(arr, index-1, index);
                    if ((index - i) > 1){
                        swap(arr, i, index);
                    }
                    --index;
                } else
                    ++i;
            }
        return index;


        /*int pivot = arr[high];
        int i = (low);
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }


        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;


        return i;*/
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


    public static void quickSort(int[] arr, int low, int high) {

        if (low < high) {

            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }


    public static void main(String[] args) {
        int[] arr = {17, 14, 15, 28, 30, 8, -6, 1, 43, 18};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }

}
