import java.util.Scanner;

public class Hello {
 public static void main (String args []) {
  Scanner sn = new Scanner (System.in);
  System.out.println("Como te llamas?");
  String name = sn.nextLine();
  System.out.println("Hola "+name+" bienvenido a java en consola.");
  }
}
