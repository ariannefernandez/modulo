package modulo;

public class MainModulo {
    static void main() {
        Modulo Login = new Modulo();
        Modulo Inventario = new Modulo();
        Modulo Reportes = new Modulo();

        Login.nombre = "Login";
        Login.lenguaje = "JAVA";
        Login.version = "27";
        Login.terminado = true;

        Inventario.nombre = "Inventario";
        Inventario.lenguaje = "C++";
        Inventario.version = "15.23";
        Inventario.terminado = false;

        Reportes.nombre = "Reportes";
        Reportes.lenguaje = "C";
        Reportes.version = "2026";
        Reportes.terminado = false;

        Login.mostrarInformacion();
        Login.mostrarVersion();
        Login.mostrarEstado();

        Inventario.mostrarInformacion();
        Inventario.mostrarVersion();
        Inventario.mostrarEstado();

        Reportes.mostrarInformacion();
        Reportes.mostrarVersion();
        Reportes.mostrarEstado();
    }

}
