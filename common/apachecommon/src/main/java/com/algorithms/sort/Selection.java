package com.algorithms.sort;

import com.algorithms.SortTemplate;

public class Selection extends SortTemplate{

    public static void sort(Comparable[] a){

        for(int i=0;i<a.length;i++){


            int minIndex=i;
            int j;
            for(j=i+1;j<a.length;j++){
                if(a[j].compareTo(a[minIndex])<0){
                    minIndex=j;
                }
            }
            exch(a,i,minIndex);

        }

    }

    public static void main(String[] args) {
        Integer [] a=new Integer[]{3,5,1,8,3};
        sort(a);
        show(a);
    }
}
