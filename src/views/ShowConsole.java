package views;
import java.util.Scanner;

public class ShowConsole{

    Scanner scanner = new Scanner(System.in);

    public void showMenu(){
        System.out.println("Metodo Busqueda Binaria");

    }
    
    public int getEdad(){
        System.out.println("Ingrese edad: ");
        int edad = scanner.nextInt();
        System.out.println("Edad ingresada: " + edad);
        return edad;
    }

    public void showMessage(String message){
        System.out.println(message);
    }
}