package com.mrt;

public class Main {


    public static void main(String[] args) {

        Circle c1 =new Circle();
        Circle c2 =new Circle(2.0);
        Circle c3 = new Circle(3.0,"Красный");
        
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}
