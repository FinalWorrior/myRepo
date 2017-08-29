package com.algorithms.sort;

import com.algorithms.SortTemplate;

public class Quick3way extends SortTemplate{
    public static void main(String[] args) {
        Integer [] a=new Integer[]{3,5,1,8,3};
        sort(a);
        show(a);
    }
    public static void sort(Comparable[] a){
        sort(a,0,a.length-1);
    }

    private static void sort(Comparable[] a,int lo, int hi){
            if(hi<=lo){
                return;
            }
            int lt=lo;
            int i=lo+1;
            int gt=hi;
            Comparable v=a[lo];
            while(i<=gt){
                int cmp=a[i].compareTo(v);
                if(cmp<0){
                    exch(a,lt++,i++);
                }else if(cmp>0){
                    exch(a,i,gt--);
                }else{
                    i++;
                }
            }//现在 a[lo..lt-1]<v=a[lt..gt]<a[gt+1..hi]成立
            sort(a,lo,lt-1);
            sort(a,gt+1,hi);
    }
}
