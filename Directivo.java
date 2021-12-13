/**
 * Clase Directivo
 * Clase que deriva información de la clase Directivo
 * @author Brenda Paola Resendiz Mendoza
 * @version 1.0
 */

public class Directivo extends Empleado {

    /**
     * Metodo constructor
     * @param nombre Recibe el nombre del empleado
     */
    public Directivo(String nombre){
	super(nombre);
    }

    //Método constructor que da el nombre que habiamos puesto en prederterminado
    public Directivo() {
	super();
    }

    /**
     * Método toString modificado
     * @return del nombre
     */
    public String toString() {
	return "Directivo: " + nombre;
    }
}

    
	
