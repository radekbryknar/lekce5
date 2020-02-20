package com.engeto;

import java.sql.SQLOutput;

public class ShortCircuit {
    public static void main( String[] args){
        int i = 10;
        System.out.println(i++); //print 10, i 11
        System.out.println(++i); //print 12, i 12

        if (i > 5 || ++i < 30){
            System.out.println();
        }
        System.out.println(i);
    }
}
