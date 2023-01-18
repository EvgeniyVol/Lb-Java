package VolkhinEO.Lb2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число элементов множества");
        int n = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Введите элементы");
        for (int i = 0; i<n; i++){
            list.add(scanner.nextInt());
        }
        System.out.println(list);

        while (list.size() > 1) {
            System.out.println(list);
            list=sum(list);
        }
        System.out.println(list);

    }

    public static ArrayList<Integer> sum(ArrayList<Integer> list) {
        ArrayList<Integer> newlist = new ArrayList<>();
        for (int i=0;i<(int) Math.round(list.size() / 2.0);i++){
            newlist.add(0);
        }
        for (int i = 0; i < list.size(); i++) {
            newlist.set(i/2,newlist.get(i/2)+list.get(i));
        }
        return newlist;
    }

}
