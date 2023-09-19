package com.lis;

import java.util.ArrayList;
import java.util.List;

public class Listtoarr {
    public static void main(String[] args) {
        List<Integer> li=new ArrayList<>();
        li.add(3);
        li.add(5);
        li.add(7);
        li.add(9);
        Integer[] arr=new Integer[li.size()];
        arr=li.toArray(arr);
        for(int ele:arr){
            System.out.println(ele);
        }
    }
}
