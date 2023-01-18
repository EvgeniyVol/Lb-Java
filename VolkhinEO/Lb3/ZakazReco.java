package VolkhinEO.Lb3;

import java.util.List;
import java.util.Set;

public interface ZakazReco {

    List<Tavar> tavars = null;

    private static void add(){
        Tavar tav = new Tavar(String.valueOf("Пицца"), 1500);
        tavars.add(tav);
        tav = new Tavar(String.valueOf("Пицца"), 1500);
        tavars.add(tav);
        tav = new Tavar(String.valueOf("Ролы"), 1500);
        tavars.add(tav);
        tav = new Tavar(String.valueOf("Суши"), 1500);
        tavars.add(tav);
        tav = new Tavar(String.valueOf("Хлеб"), 1500);
        tavars.add(tav);
        tav = new Tavar(String.valueOf("Мясо"), 1500);
        tavars.add(tav);
    }
}
