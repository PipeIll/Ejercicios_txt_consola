import java.util.Scanner;
public class TestQuePokeMonEres {
    public static void main(String args[]) {
        Scanner sn = new Scanner(System.in);

        System.out.println(" ¿Que Pokemon eres? ");

        System.out.println("\n¿Como actuas en un conflicto?");
        System.out.println("1. Me lanzo primero, sin pensarlo");
        System.out.println("2. Me escondo y espero el momento perfecto");
        System.out.println("3. Trato de evitarlo, prefiero la calma");
        int p1 = sn.nextInt();

        System.out.println("\n¿Que haces un sabado libre?");
        System.out.println("1. Entrenar o hacer algo fisico");
        System.out.println("2. Explorar lugares raros o ver algo de terror");
        System.out.println("3. Comer y dormir sin culpa");
        int p2 = sn.nextInt();

        System.out.println("\n¿Como te describirian tus amigos?");
        System.out.println("1. Intenso pero leal");
        System.out.println("2. Misterioso y un poco impredecible");
        System.out.println("3. El mas relajado del grupo");
        int p3 = sn.nextInt();

        System.out.println("\n¿Cual es tu mayor defecto?");
        System.out.println("1. Me dejo llevar por el ego");
        System.out.println("2. Puedo ser demasiado sarcastico");
        System.out.println("3. La procrastinacion es mi modo de vida");
        int p4 = sn.nextInt();

        System.out.println("\n¿Que rol tienes en un equipo?");
        System.out.println("1. El que lidera aunque nadie se lo pida");
        System.out.println("2. El estratega que nadie ve venir");
        System.out.println("3. El soporte moral y emocional");
        int p5 = sn.nextInt();

        int total = p1 + p2 + p3 + p4 + p5;

        System.out.println("\n Resultado ");
        if (total <= 8) {
            System.out.println("Eres CHARIZARD: Imponente, apasionado e independiente.");
            System.out.println("Nadie te domina facilmente, pero cuando decides ser leal, eres imparable.");
        } else if (total <= 12) {
            System.out.println("Eres GENGAR: Enigmatico, inteligente y con un humor oscuro.");
            System.out.println("La gente no sabe bien si temerte o adorarte, y eso te encanta.");
        } else {
            System.out.println("Eres SNORLAX: Tranquilo, confiable y con mas sabiduría de la que aparentas.");
            System.out.println("No te mueves por cualquier cosa, pero cuando lo haces, todo el mundo lo nota.");
        }
    }
}
