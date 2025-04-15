package controllers;
import views.ShowConsole;
import models.Persona;

public class MetodosBusqueda {

    private ShowConsole showConsole;
    private Persona[] people;

    


    public MetodosBusqueda(Persona[] persons){
        showConsole = new ShowConsole();
        this.people = persons;
        showPersonByCode();
    }

    public int busquedaLineal(int[] arreglo, int objetivo){
        for (int i = 0; i<arreglo.length ;  i++){
            if(arreglo[i] == objetivo)
                return i;
            
        }


        return -1;
    }
    /**
     * 
     * return la posicion del valor buscado
     */
    public int findPersonByCode(int code){
        for (int i = 0; i<people.length; i++){
            if(people[i].getCode()==code){
                return i;
            }
        }
        
        return -1;
    }

    public void showPersonByCode(){

        int codeToFind = showConsole.getCode();
        int indexPerson = findPersonByCode(codeToFind);
        if(indexPerson >= 0){
            showConsole.showMessage("Persona encontrada");
            showConsole.showMessage(people[indexPerson].toString());
            
        }else{
            showConsole.showMessage("Persona con codigo" + codeToFind +"no encontrada");
        }
    }
}
