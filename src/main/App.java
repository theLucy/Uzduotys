package main;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();

        Map<String, String> kombinacijos = Map.of(
                "12", "Pralaimejote",
                "13", "Laimejote",
                "21", "Laimejote",
                "23", "Pralaimejote",
                "31", "Pralaimejote",
                "32", "Laimejote"
        );

        for (; ; ) {
            System.out.println("""
                    Koki zenkla mesite?
                    1 - Akmuo
                    2 - Popierius
                    3 - Zirkles
                    4 - Nebenoriu zaisti
                    """);
            String zaidejas = in.nextLine();

            if (zaidejas.equals("4")) break;

            String kompiuteris = String.valueOf(rnd.nextInt(1, 4));

            if (zaidejas.equals(kompiuteris))
                System.out.println("Lygiosios!");
            else
                System.out.println(kombinacijos.getOrDefault(zaidejas + kompiuteris,
                        "Pasirinkote neteisinga zenkla!"));

        }

        System.out.println("Aciu kad zaidete, zaidimas uzdaromas!");
        in.close();
    }
}