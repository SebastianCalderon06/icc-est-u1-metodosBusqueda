package controllers;
import models.Persona;
import views.ShowConsole;

public class MetodosBusquedaBinaria {

    private ShowConsole pantalla;
    private Persona[] people;
    private String name;

    public MetodosBusquedaBinaria(Persona[] personas){

        this.people = personas;
        this.pantalla = new ShowConsole();
        pantalla.showMessage("Metodos de Busqueda Binaria");
        showPersonByEdad();

    }

    public int findPersonByEdad(int Edad) {
        int bajo = 0;
        int alto = people.length-1;

        while (bajo <= alto){
            int central = bajo + (alto-bajo)/2;
            int valorCentro = people[central].getEdad();

            System.out.print("\n");

            if(people[central].getEdad()== Edad){///si es igual}
                for (int i = bajo; i<=alto;i++){

                
                    System.out.print(people[i].getEdad());
                    System.out.print(" | ");
                }
                System.out.print("\nbajo=" + bajo);
                System.out.print("\talto=" + alto);
                System.out.print("\tcentro=" + central);
                System.out.print("\tvalorCentro=" + valorCentro);
                System.out.print("\t\t--> ENCONTRADO");
                name = people[central].getName();
                return central;
                
            }

            if(people[central].getEdad()<Edad){
                for (int i = bajo; i<=alto;i++){

                
                    System.out.print(people[i].getEdad());
                    System.out.print(" | ");
                }
                System.out.print("\nbajo=" + bajo);
                System.out.print("\talto=" + alto);
                System.out.print("\tcentro=" + central);
                System.out.print("\tvalorCentro=" + valorCentro);
                bajo = central + 1;

                System.out.print("\t\t--> DERECHA\n\n");
            
            }else{
                for (int i = bajo; i<=alto;i++){

                
                    System.out.print(people[i].getEdad());
                    System.out.print(" | ");
                }
                System.out.print("\nbajo=" + bajo);
                System.out.print("\talto=" + alto);
                System.out.print("\tcentro=" + central);
                System.out.print("\tvalorCentro=" + valorCentro);
                alto = central - 1;
                System.out.print("\t\t--> IZQUIERDA\n\n");
            }


        }
        
        return -1;
    }

    public void showPersonByEdad(){
        int edadToFind = pantalla.getEdad();
        int indexPerson = findPersonByEdad(edadToFind);
        if(indexPerson == -1){
            pantalla.showMessage("\n\nNo hay la persona con esa edad");
        }else{
            pantalla.showMessage("\n\nLa persona con la edad " + edadToFind + " es " + name);
        }
    }

}
