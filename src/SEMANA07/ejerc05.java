/*
    SE USA ENUM CUANDO SON DATOS CONSTANTES Y NO VAN A CAMBIAR
    A LO LARGO DEL TIEMPO.
 */
package SEMANA07;

/**
 *
 * @author Carlos Jesus Flores Herrera
 */
enum equipos {
    U("UNIVERSITARIO", 5), SP("SPORTING CRISTAL", 3), A("ALIANZA", 7);
    String nombre;
    int puesto;

    private equipos(String n, int p) {
        nombre = n;
        puesto = p;
    }

    String getnombre() {
        return nombre;
    }

    int getpuesto() {
        return puesto;
    }
}
public class ejerc05 {
    public static void main(String[] args) {
        equipos p = equipos.SP;
        System.out.println(p.getnombre());
        System.out.println(p.getpuesto());
    }
}
