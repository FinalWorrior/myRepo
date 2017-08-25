package com.algorithms;

public class SortTemplate {
    public static void exch(Comparable[] arr, int a, int b) {
        Comparable temp = arr[b];
        arr[b] = arr[a];
        arr[a] = temp;
    }

    public static void show(Comparable[] a){
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);

        }
    }
}
