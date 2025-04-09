package vista;
import java.util.Scanner;

public class Menu extends MenuTemplate{
     Scanner leer = new Scanner(System.in);
     Double servi;

     String nombre = "Tony Stark";
     String tipoDeCuenta = "Corriente";
     double saldo = 1599.99;

    @Override
    public void consultar() {
        System.out.println("---- Consulta tu saldo ----");
        System.out.println("Saludos " + nombre);
        System.out.println("Cuenta " + tipoDeCuenta);
        System.out.println("El saldo actual es: " + saldo + "$");
    }

    @Override
    public void retirar() {
        System.out.println("---- Retira tu saldo ----");
        System.out.println("Posees: " + saldo + "$, cuanto deseas retirar?");
        servi = leer.nextDouble();
        if (saldo >= servi) {
            saldo -= servi;
            System.out.println("Haz retirado " + servi + "$, te quedan " + saldo + "$");
        } else {
            System.out.println("Saldo insuficiente para realizar el retiro.");
        }
    }

    @Override
    public void depositar() {
        System.out.println("---- Deposita tu saldo ----");
        System.out.println("Posees: " + saldo + "$, cuanto deseas depositar?");
        servi = leer.nextDouble();
        saldo += servi;
        System.out.println("Haz depositado " + servi + "$, tu saldo actual ahora es " + saldo + "$");
    }
}
