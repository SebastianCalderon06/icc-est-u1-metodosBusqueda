import models.Persona;
import controllers.MetodosBusqueda;
public class App {
    public static void main(String[] args) throws Exception {
        Persona [] personas = new Persona[7];
        personas[0] = new Persona("Juan",101);
        personas[1] = new Persona("Maria",102);
        personas[2] = new Persona("Carlos",103);
        personas[3] = new Persona("Ana",104);
        personas[4] = new Persona("Luis",105);
        personas[5] = new Persona("Sofia",106);
        personas[6] = new Persona("Pedro",107);
        MetodosBusqueda mB = new MetodosBusqueda(personas);
    }
}
