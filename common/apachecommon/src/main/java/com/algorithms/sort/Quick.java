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
    private static void sort(Comparable[] a,int lo,int hi){
        if(hi<=lo){//lo和high相遇，代表进了这个sort的子集只有一个元素，不需排序，直接返回
            return;
        }
        int cut=partition(a,lo,hi);
        //j的位置是曾经的v  所以排序j左边和右边的即可
        sort(a,lo,cut-1);
        sort(a,cut+1,hi);
    }
    private static int partition(Comparable[] a,int lo,int hi){
        int i=lo;//通过lo初始化左指针
        int j=hi+1;//通过hi初始化右指针 因为要--j  所以这里先+1
        Comparable v=a[i]; //左指针第一个元素作为快速排序的标志数
        while(true){
            while(a[++i].compareTo(v)<0){   //左指针比v小的，略过，移动指针
                if(i>=hi){  //左指针向右移动的右限是hi
                    break; //左指针遇到右限，终止循环
                }
            }
            while (a[--j].compareTo(v)>0){//右指针比v大的，略过
                if(j<=lo){//右指针遇到左限，终止循环
                    break;
                }
            }
            if(i>=j){  //左右指针相遇，终止循环
                break;
            }
            exch(a,i,j);//只剩左边比v大，右边比v小的情况了  交换即可
        }
        //某次i已经先+了1导致i已经比j大了  所以要返回j而不是i
        exch(a,lo,j);
        return j;

    }
}
