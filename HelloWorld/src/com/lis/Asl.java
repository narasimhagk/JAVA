package com.lis;

import java.util.Arrays;
import java.util.List;

public class Asl {
    public static void main(String[] args) {
        Integer[] arr={1,2,3,4,5,6,7,8,9};
        List<Integer> li= Arrays.asList(arr);
        System.out.println(li);
        // Lisot.of()
        List<String> l=List.of("way down we go","in my mind");
        System.out.println(l);
    }
}
