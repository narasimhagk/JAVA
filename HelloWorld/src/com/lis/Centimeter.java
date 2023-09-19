package com.lis;

public class Centimeter {
    public static double inchestoCentimeter(int inches){
        return inches*2.54;
    }
    public static double inchestoCentimeter(int feet,int inches){
//        return inchestoCentimeter(((feet*12)+inches));
        int feetToinches=feet*12;
        int totalInches=feetToinches+inches;
        double result=inchestoCentimeter(totalInches);
        return result;
    }
    public static void main(String[] args) {
        System.out.println(inchestoCentimeter(68));
        System.out.println(inchestoCentimeter(5,7));

    }
}
