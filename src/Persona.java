
public class Persona {

    private int id;
    private String nombre;

    public Persona(String nombre) {
        this.id = (int) (Math.random()*1000);
        this.nombre = nombre;
    }

    public String toString() {
     return "{ El nombre de la bendi es: "+nombre+" y tiene el id: "+id+" }";
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }
}
