package VolkhinEO.Lb1;

import VolkhinEO.Lb1.Zadanie_2;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ////////////////1 задание
        ////////////////6.1
        double t, rovn, a;
        t = 6.0;
        a = 10.0;
        System.out.println("Входные данные: t = " + t);
        System.out.println("a = " + a);
        rovn = (Math.sqrt(Math.abs(t))+Math.pow(a,3)*t)/(t*Math.abs(Math.sin(a/2)));
        System.out.println("Результат: rovn = " + rovn);
        ////////////////6.2
        double Q, x;
        x = 15.0;
        System.out.println("Входные данные: x = " + x);
        Q = (Math.sin(Math.PI)+x)/(x+Math.sqrt(Math.abs((3*Math.PI)/2)+x));
        System.out.println("Результат: Q = " + Q);
        ////////////////10.1
        double j;
        j = 10.0;
        a = 10.0;
        x = 10.0;
        System.out.println("Входные данные: j = " + j);
        System.out.println("a = " + a);
        System.out.println("x = " + x);
        rovn = (Math.pow(a,2) * j + Math.pow(Math.cos(x),4))/(Math.cbrt(Math.abs(j+1)));
        System.out.println("Результат: rovn = " + rovn);
        ////////////////10.2
        double Z, y, k, m, n;
        y = 10.0;
        k = 10.0;
        m = 10.0;
        n = 10.0;
        t = 10.0;
        x = 10.0;
        System.out.println("Входные данные: y = " + y);
        System.out.println("k = " + k);
        System.out.println("m = " + m);
        System.out.println("n = " + n);
        System.out.println("t = " + t);
        System.out.println("x = " + x);
        Z = ((t-Math.pow(k,2))/(Math.pow(m,4)-n))+Math.sqrt(Math.abs((Math.sqrt(x)+y)/(12-x)+4));
        System.out.println("Результат: Z = " + Z);
        ////////////////15.1
        double w;
        w = 10.0;
        x = 10.0;
        y = 10.0;
        System.out.println("Входные данные: w = " + w);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        rovn = (Math.pow(Math.E,Math.sqrt(Math.abs(w+1)))*Math.tan(x) * (-Math.sin(w)))/(1.85 * w + Math.cbrt(Math.pow(y,2)));
        System.out.println("Результат: rovn = " + rovn);
        ////////////////15.2
        double W;
        x = 10.0;
        y = 10.0;
        System.out.println("Входные данные: x = " + x);
        System.out.println("y = " + y);
        W = (Math.abs(x)-Math.pow(Math.sin(x),3))/(1+Math.abs(x*y));
        System.out.println("Результат: W = " + W);
        ////////////////20.1
        double c;
        c = 10.0;
        x = 10.0;
        a = 10.0;
        System.out.println("Входные данные: c = " + c);
        System.out.println("x = " + x);
        System.out.println("a = " + a);
        rovn = (Math.sqrt(Math.abs(Math.cos(x)))+Math.pow(Math.E,Math.sqrt(Math.abs(x))))/(Math.log10(x)*(Math.sqrt(Math.abs(c))+Math.sqrt(Math.abs(a))));
        System.out.println("Результат: rovn = " + rovn);
        ////////////////20.2
        double T;
        x = 1.0;
        System.out.println("Входные данные: x = " + x);
        T = 5-Math.pow(Math.sin(x),2) + Math.pow(Math.E,(Math.pow(x,3)-1));
        System.out.println("Результат: T = " + T);
        /////Задание 2
        Zadanie_2 Z2 = new Zadanie_2();
        Z2.Go();
    }
}