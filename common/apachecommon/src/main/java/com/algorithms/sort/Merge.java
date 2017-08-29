package com.algorithms.sort;

import com.algorithms.SortTemplate;

public class Merge extends SortTemplate{
    public static Comparable [] extra=null;
    public static void sort(Comparable[] a){
       extra= new Comparable[a.length];
        sort(a,0,a.length-1);
    }
    public static void sort(Comparable[] a,int lo,int hi){
        if(hi<=lo){
            return;
        }
        int mid=lo+ (hi-lo)/2;
        sort(a,lo,mid);
        sort(a,mid+1,hi);
        merge(a,lo,mid,hi);
    }
    public static void main(String[] args) {
        Integer [] a=new Integer[]{3,5,1,4,8};
        //测试merge
//        merge(a,0,1,4);
        //测试sort
        sort(a);

                show(a);
    }
    public static void merge(Comparable[] arr,int lo, int mid,int hi){
        //左半部分最小数的指针
        int i=lo;
        //右半部分最小数的指针
        int j=mid+1;

        //复制
        for (int k = lo; k < hi+1; k++) {
            extra[k]=arr[k];
        }
        for (int k = lo; k <hi+1; k++) {
//            if(extra[i].compareTo(extra[j])<=0){
//                arr[k]=extra[i++];
//            }else if (extra[i].compareTo(extra[j])>0){
//                arr[k]=extra[j++];
//            }else if(i>mid){
//                arr[k]=extra[j++];
//            }else{
//                arr[k]=extra[i++];
//            }
            if(i>mid){
                arr[k]=extra[j++];
            }else if (j>hi){
                arr[k]=extra[i++];

            }else if(extra[i].compareTo(extra[j])>0){
                arr[k]=extra[j++];
            }else{
                arr[k]=extra[i++];
            }
        }
    }
}
