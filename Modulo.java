package modulo;

public class Modulo {
    public String nombre;
    public String lenguaje;
    String version;
    boolean terminado;

    public void mostrarInformacion(){
        System.out.println("Acceso de " + nombre + "\nEn tipo de lenguaje: " + lenguaje);
    }

    public void marcarTerminado(){
       terminado = true;
    }

    void mostrarEstado(){
        String estado = terminado? "termino": "no ha terminado";
        System.out.println(nombre+ " " + estado);
    }

    void mostrarVersion(){
        System.out.println("La version es: " + version);
    }
}
