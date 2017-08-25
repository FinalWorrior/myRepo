package com.algorithms.search;

public class BinarySearch {
    public static void main(String[] args) {
        int [] a=new int[]{0,2,3,5,25,4245,4245252};
        System.out.println(sort(a,4245));

    }

    public static int sort(int [] array,int elem){

        int head=0;
        int tail=array.length-1;

        while(head<=tail){
            int mIndex=(head+tail)/2;
            if(array[mIndex]>elem){
                tail=mIndex-1;
            }else if(array[mIndex]<elem){
                head=mIndex+1;
            }else{
                return mIndex;
            }



        }
        return -1;
    }
//    public void exch(int [] arr,int a,int b){
//        int temp=arr[b];
//        arr[b]=arr[a];
//        arr[a]=temp;
//    }
}
