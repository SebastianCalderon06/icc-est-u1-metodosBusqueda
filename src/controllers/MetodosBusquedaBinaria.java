package controllers;
import models.Persona;
import views.ShowConsole;

public class MetodosBusquedaBinaria {

    private ShowConsole pantalla;
    private Persona[] people;

    public MetodosBusquedaBinaria(Persona[] personas){

        this.people = personas;
        this.pantalla = new ShowConsole();
        pantalla.showMessage("Metodos de Busqueda Binaria");
        showPersonByCode();

    }

    public int findPersonByCode(int code) {
        int bajo = 0;
        int alto = people.length-1;

        while (bajo <= alto){
            int central = bajo + (alto-bajo)/2;

            if(people[central].getCode()== code){///si es igual}
                return central;
            }

            if(people[central].getCode()<code){
                bajo = central + 1;
            
            }else{
                alto = central - 1;
            }


        }
        
        return -1;
    }

    public void showPersonByCode(){
        int codeToFind = pantalla.getCode();
        int indexPerson = findPersonByCode(codeToFind);
        if(indexPerson == -1){
            pantalla.showMessage("No hay la persona con ese codigo");
        }else{
            pantalla.showMessage("Persona con codigo " + codeToFind +" encontrada");
            pantalla.showMessage(people[indexPerson].toString());
        }
    }

    private int findPersonByName(String name){
        
        
        int bajo = 0;
        int alto = people.length-1;

        while (bajo <= alto){
            int central = bajo + (alto-bajo)/2;

            if(people[central].getName()== name){///si es igual}
                return central;
            }

            if(people[central].getName()<name){
                bajo = central + 1;
            
            }else{
                alto = central - 1;
            }


        }

        return -1;
    }


}
