package com.example.utils;

import com.example.geometry.circle;
import com.example.geometry.rectangle;

public class calculator {
    public static void main(String[] args) {
        circle cir = new circle(5.5);
        rectangle rect = new rectangle(10,5);
        double cirArea = Math.PI * Math.pow(cir.radius,2);
        double rectArea = rect.length * rect.breath;
        System.out.println("area of circle is: " + cirArea + " area of rectangle is: " + rectArea);
    }
}
