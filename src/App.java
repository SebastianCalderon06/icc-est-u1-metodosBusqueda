import models.Persona;
import views.ShowConsole;
import controllers.MetodosBusquedaBinaria;
import java.util.Scanner;
import controllers.MetodoInsersion;
public class App {

    public static void main(String[] args) throws Exception {

        ShowConsole pan = new ShowConsole();
        int edad;
        Scanner s = new Scanner(System.in);
        Persona[] personas = new Persona[9];
        for (int i = 0; i<personas.length; i++){
            personas[i] = new Persona();
            System.out.println("Ingresar persona " + (i+1) + "\nNombre: ");
            personas[i].setName(s.next()); 
            System.out.println("Edad: ");
            personas[i].setEdad(s.nextInt());
            
            
        
            }

        MetodoInsersion Mi = new MetodoInsersion();

        Mi.ordenarAsd(personas);

        

        MetodosBusquedaBinaria mBB = new MetodosBusquedaBinaria(personas);
        ShowConsole Sc = new ShowConsole();

        Sc.showMenu();
        edad = Sc.getEdad();

        mBB.findPersonByEdad(edad);
        mBB.showPersonByEdad();

    }
}
