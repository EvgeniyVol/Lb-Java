package VolkhinEO.Lb1;

import java.util.Scanner;

public class Zadanie_2 {
    void Go(){
        Scanner In = new Scanner(System.in);
        ////////////////2 задание
        double A, r, R, p;
        System.out.println("A=");
        A = In.nextDouble();
        p= 3* A /2;
        r = Math.sqrt((p-A)*(p-A)*(p-A)/p);
        System.out.println("r= "+r);
        R=A*Math.sqrt(3)/3;
        System.out.println("R= "+R);
    }
}