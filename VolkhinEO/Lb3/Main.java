package VolkhinEO.Lb3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите режим работы");

        int mod = scanner.nextInt();

        switch (mod) {
            case 1 -> {
                add();
                break;
            }
            case 2 -> {
                remove();
                break;
            }
            case 3 -> {
                becktovar();
                break;
            }
            default -> {

                break;
            }
        }

        System.out.println("Завершение");


    }
    private ZakazReco zakazReco;
    private static void add(){
        Scanner scanner = new Scanner(System.in);
        String name;
        int price;
        System.out.println("Введите количесво товаров");
        name=scanner.nextLine();
        System.out.println("Введите цену");
        price=scanner.nextInt();
        System.out.println("");
    }

    public static void remove(){

    }

    public static void becktovar(){

    }
}
