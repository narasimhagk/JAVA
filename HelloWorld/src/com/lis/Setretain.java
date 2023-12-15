package com.lis;

import java.util.HashSet;

public class Setretain {
    public static void main(String[] args) {
        try{
            HashSet<Integer> g=new HashSet<>();
            g.add(9);
            g.add(7);
            g.add(0);
            g.add(3);
            g.add(5);
            HashSet<Integer> h=new HashSet<>();
            h.add(1);
            h.add(9);
            h.add(7);
            h.add(3);
            h.add(0);
            System.out.println("before"+g);
            System.out.println("before"+h);


            g.retainAll(h);
            System.out.println(g);
            HashSet<Integer> j=null;
            System.out.println(j);
            h.retainAll(j);
            System.out.println(h);
        }
        catch(NullPointerException e){
            System.out.println(e);
        }
    }
}
