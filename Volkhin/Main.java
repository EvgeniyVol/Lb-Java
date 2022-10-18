package Volkhin;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);
        Double t, rovn, a, q, x, A, r, R;
        t=6.0;
        a=10.0;
        rovn = (Math.sqrt(Math.abs(t))+Math.pow(a,3)*t)/(t*Math.abs(Math.sin(a/2)));
        System.out.println(rovn);
        x= 15.0;
        q = (Math.sin(Math.PI)+x)/(x+Math.sqrt(Math.abs((3*Math.PI)/2)+x));
        System.out.println(q);
        System.out.println("A=");
        A = In.nextDouble();
        Double p;
        p= 3* A /2;
        r = Math.sqrt((p-A)*(p-A)*(p-A)/p);
        System.out.println("r= "+r);
        R=A*Math.sqrt(3)/3;
        System.out.println("R= "+R);
    }
}