import java.util.Scanner;
public class leerdatos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = teclado.nextLine();
        System.out.println("Hello, " + name + "!");
    
    }
}