package vista;

import java.util.Scanner;

public abstract class MenuTemplate {
    Scanner leer = new Scanner(System.in);
    String op;

    public abstract void consultar();
    public abstract void retirar();
    public abstract void depositar();

    public final void iniciarMenu() {
        do {
            System.out.println("---- Menú Principal ----");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Retirar");
            System.out.println("3. Depositar");
            System.out.println("0. Salir");
            System.out.println("Seleccione una opción: ");
            op = leer.nextLine();

            switch (op) {
                case "1":
                    consultar();
                    break;
                case "2":
                    retirar();
                    break;
                case "3":
                    depositar();
                    break;
                case "0":
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Escoge una opcion valida");
                    break;
            }
        } while (op != "0");
    }
}