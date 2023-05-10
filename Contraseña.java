import java.util.Scanner;

public class Contraseña
{
    Scanner scanner = new Scanner(System.in);
    String password;

    public void Ejercicio3()
    {
    do {
    System.out.print("Ingrese su contraseña: ");
    password = scanner.nextLine();
    } while (!password.equals("contraseña123"));
    
    System.out.println("¡Contraseña correcta!");
    }

    public static void main(String[] args) {
        Contraseña rune = new Contraseña();
        rune.Ejercicio3();
    }
}