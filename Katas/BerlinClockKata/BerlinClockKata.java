package Katas.BerlinClockKata;

import java.util.*;

public class BerlinClockKata {

    public static void main(String[] args) {
        /*Scanner s = new Scanner(System.in);
        System.out.print("introduce una fecha: ");
        String readData = s.nextLine();*/

        String[] fecha = {"00:00:00", "23:59:59", "12:04:00", "12:23:00", "12:35:00"};

        for (int i = 0; i < 5; i++) {
            String[] splitted;
            //splitted = radData.trim().split(":");
            splitted = fecha[i].trim().split(":");

            //int hours = Integer.parseInt(splitted[0]);
            int minutes = Integer.parseInt(splitted[1]);
            //int seconds = Integer.parseInt(splitted[2]);

            int moduloMinute = minutes % 5;
            //Mostrar1Minutes(moduloMinute);

            int moduloMinutes = minutes / 5;
            //Mostrar5Minutes(moduloMinutes);

        }
    }

    public static void Mostrar1Minutes(int encendidos) {
        switch (encendidos) {
            case 0:
                mostrar("0000");
                return;
            case 1:
                mostrar("Y000");
                return;
            case 2:
                mostrar("YY00");
                return;
            case 3:
                mostrar("YYY0");
                return;
            case 4:
                mostrar("YYYY");
                return;
        }
    }

    public static void Mostrar5Minutes(int encendidos) {
        String casa = "OOOOOOOOOOO";
        String perro = "YYRYYRYYRYY";
        String result = perro.substring(0, encendidos) + casa.substring(encendidos, casa.length());

        mostrar(result);
    }

    public static void mostrar(String casa) {

        System.out.println(casa);
    }
}
