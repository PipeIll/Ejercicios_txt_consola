import java.util.Scanner;

public class Validar_Edad {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Bienvenido. ¿Como te llamas?");
        String nombre = entrada.nextLine();

        System.out.println("Hola " + nombre + ", ¿en que año naciste?");
        short añoNacimiento = entrada.nextShort();
        short añoActual = 2026;

        byte edad = (byte)(añoActual - añoNacimiento);

        System.out.println("Tienes aproximadamente " + edad + " años.");

        if (edad < 18) {
            System.out.println("Lo sentimos " + nombre + ", debes ser mayor de edad para continuar.");
        } else {
            System.out.println("Acceso permitido. Bienvenid@ " + nombre + ".");
        }
    }
}
