package controllers;
import models.Persona;

public class MetodoInsersion {

    public void ordenarAsd(Persona[] personas)
    {
        int aux = 0;
        Persona per;
        int tam = personas.length;
        for (int i = 1; i<tam ; i++)
        {
            aux = personas[i].getEdad();
            per = personas[i];
            int j = i-1;
            while (j>=0 && aux<personas[j].getEdad())
            {
                personas[j+1] = personas[j];
                j = j-1;
                personas[j+1] = per;

            }
        }}
        
    }
