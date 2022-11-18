package Katas.BerlinClockKata;

import java.util.*;

public class BerlinClockKata {

    public static void main(String[] args) {
        /*Scanner s = new Scanner(System.in);
        System.out.print("introduce una fecha: ");
        String readData = s.nextLine();*/

        String[] fecha = {"00:00:00", "23:59:59", "16:50:06", "11:37:01"};

        for (int i = 0; i < 4; i++) {
            String[] splitted;
            //splitted = radData.trim().split(":");
            splitted = fecha[i].trim().split(":");

            int hours = Integer.parseInt(splitted[0]);
            int minutes = Integer.parseInt(splitted[1]);
            int seconds = Integer.parseInt(splitted[2]);

            MostrarSegundos(seconds);
            Mostrar5Hour(hours);
            Mostrar1Hour(hours);
            Mostrar5Minutes(minutes);
            Mostrar1Minutes(minutes);


        }
    }

    public static void Mostrar1Minutes(int minutes) {
        int encendidos = minutes % 5;

        switch (encendidos) {
            case 0:
                mostrar("OOOO");
                saltarLinea();
                return;
            case 1:
                mostrar("YOOO");
                saltarLinea();
                return;
            case 2:
                mostrar("YYOO");
                saltarLinea();
                return;
            case 3:
                mostrar("YYYO");
                saltarLinea();
                return;
            case 4:
                mostrar("YYYY");
                saltarLinea();
                return;
        }
    }

    public static void Mostrar5Minutes(int minutes) {
        int encendidos = minutes / 5;

        String casa = "OOOOOOOOOOO";
        String perro = "YYRYYRYYRYY";
        String result = perro.substring(0, encendidos) + casa.substring(encendidos, casa.length());

        mostrar(result);
    }

    public static void Mostrar1Hour(int hours) {
        int encendidos = hours % 5;

        switch (encendidos) {
            case 0:
                mostrar("OOOO");
                return;
            case 1:
                mostrar("ROOO");
                return;
            case 2:
                mostrar("RROO");
                return;
            case 3:
                mostrar("RRRO");
                return;
            case 4:
                mostrar("RRRR");
                return;
        }
    }

    public static void Mostrar5Hour(int hours) {
        int encendidos = hours / 5;

        switch (encendidos) {
            case 0:
                mostrar("OOOO");
                return;
            case 1:
                mostrar("ROOO");
                return;
            case 2:
                mostrar("RROO");
                return;
            case 3:
                mostrar("RRRO");
                return;
            case 4:
                mostrar("RRRR");
                return;
        }
    }

    public static void MostrarSegundos(int seconds) {
        int resultado = seconds % 2;

        switch (resultado) {
            case 0:
                mostrar("Y");
                return;
            case 1:
                mostrar("O");
                return;
        }
    }

    public static void mostrar(String casa) {

        System.out.print(casa);
    }

    public static void saltarLinea() {

        System.out.println();
    }
}
