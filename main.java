import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("¡Hola, mundo!");
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bienvenido al programa de Java.\n Que quieres hacer: 1. Horas a minutos 2. Minutos a segundos 3. Días a horas 4. Semanas a días");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.print("Introduce el número de horas: ");
                int horas = scanner.nextInt();
                int minutos = horas * 60;
                System.out.println(horas + " horas son " + minutos + " minutos.");
                break;
            case 2:
                System.out.print("Introduce el número de minutos: ");
                int minutosEntrada = scanner.nextInt();
                int segundos = minutosEntrada * 60;
                System.out.println(minutosEntrada + " minutos son " + segundos + " segundos.");
                break;
            case 3:
                System.out.print("Introduce el número de días: ");
                int dias = scanner.nextInt();
                int horasTotales = dias * 24;
                System.out.println(dias + " días son " + horasTotales + " horas.");
                break;
            case 4:
                System.out.print("Introduce el número de semanas: ");
                int semanas = scanner.nextInt();
                int diasTotales = semanas * 7;
                System.out.println(semanas + " semanas son " + diasTotales + " días.");
                break;
            default:
                System.out.println("Opción no válida.");

        }
    }
}