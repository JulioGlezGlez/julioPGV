package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ordenarNumeros {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> arrayList=new ArrayList<Integer>();
        for (int i = 0; i <=40 ; i++) {
            arrayList.add(sc.nextInt());
        }
        Collections.sort(arrayList);
        for (int value:arrayList) {
            System.out.println(value);
        }


    }


}
