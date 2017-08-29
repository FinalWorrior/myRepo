package com.algorithms.sort;

import com.algorithms.SortTemplate;

public class Quick extends SortTemplate{
    public static void main(String[] args) {
        Integer [] a=new Integer[]{3,5,1,8,3};
        sort(a);
        show(a);
    }
    public static void sort(Comparable[] a){
        sort(a,0,a.length-1);
    }
    public static void sort(Comparable[] a,int lo,int hi){
        if(hi<=lo){
            return;
        }
        int cut=partition(a,lo,hi);
        //j的位置是曾经的v  所以排序j左边和右边的即可
        sort(a,lo,cut-1);
        sort(a,cut+1,hi);
    }
    public static int partition(Comparable[] a,int lo,int hi){
        int i=lo;
        int j=hi+1;
        Comparable v=a[i];
        while(true){
            while(a[++i].compareTo(v)<0){
                if(i>=hi){
                    break;
                }
            }
            while (a[--j].compareTo(v)>0){
                if(j<=lo){
                    break;
                }
            }
            if(i>=j){
                break;
            }
            exch(a,i,j);
        }
        //某次i已经先+了1导致i已经比j大了  所以要返回j而不是i
        exch(a,lo,j);
        return j;

    }
}
