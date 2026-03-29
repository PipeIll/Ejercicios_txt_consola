import java.time.LocalDate;
public class Futbol{
    public static void main(String args[]){

        Persona p1 = new Persona();
        p1.id = 001;
        p1.name = "Lionel Messi";
        p1.nacionalidad = "Argentina";
        p1.altura = 1.70;
        p1.peso = 72;
        p1.nacimiento = LocalDate.of(1987, 6, 24);

        System.out.print(p1.id);
    }
}