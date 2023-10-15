package practik4;

import javax.swing.plaf.IconUIResource;
public class Main {    public static void PrintSeasons (Seasons season) {
    switch (season) {
        case Spring:
        System.out.println("Весна");
        System.out.println("Средняя температура: " + season.getTemperature());
        System.out.println("Описание: " + season.getDescription());
        break;
        case Summer:
            System.out.println("Лето");
            System.out.println("Средняя температура: " + season.getTemperature());                System.out.println("Описание: " + season.getDescription());
            break;
            case Autumn:
            System.out.println("Осень");
            System.out.println("Средняя температура: " + season.getTemperature());
            System.out.println("Описание: " + season.getDescription());
            break;
    }    }
    public static void main(String[] args) {
    Seasons favorite = Seasons.Winter;
        PrintSeasons(favorite);
        System.out.println("мое любимое время года:" + favorite);
        System.out.println("Средняя температура: " + favorite.getTemperature());
        System.out.println("Описание: " + favorite.getDescription());
        Seasons seaAu = Seasons.Autumn;        PrintSeasons (seaAu);
        Seasons seaSp = Seasons.Spring;        PrintSeasons (seaSp);
        Seasons seaSu = Seasons.Summer;        PrintSeasons (seaSu);
    }    }