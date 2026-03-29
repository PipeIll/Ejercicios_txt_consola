import java.util.Scanner;
public class Tabla2 {
 public static void main (String args []) {
  Scanner leer = new Scanner (System.in);
  System.out.println("Como te llamas?");
  String name = leer.nextLine();
  System.out.println("Hola "+name+" bienvenido a java en consola.");
  Scanner sn = new Scanner (System.in);
  System.out.println("ingrese el numero que desea multiplicar: ");
  int num = sn.nextInt();
  System.out.println("¿Hasta que numero quieres la tabla?");
  int rango = sn.nextInt();
  System.out.println("Esta es la tabla del: "+num);
  for (int i = 1; i <= rango; i++) {
   System.out.println(num+" x "+i+" = "+(num*i));
  }
 }
}
