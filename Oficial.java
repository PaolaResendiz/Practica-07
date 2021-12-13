/**
 * Clase Oficial
 * Clase que deriva información de la clase Operador
 * @author Brenda Paola Resendiz Mendoza
 * @version 1.0
 */
public class Oficial extends Operador {

    /**
     * Metodo constructor
     * @param nombre REcib el nombre del empleado
     */
    public Oficial(String nombre) {
	super(nombre);
    }

    //Metodo contructor que da el nombre que habiamos puesto en predeterminado
    public Oficial() {
	super();
    }

    /**
     * Metodo trabaja
     * @return devuelve el texto Estoy trabajando
     */
    public String trabaja() {
	return "Estoy trabajando";
	
    }

    /**
     * Metodo toString
     * @return nombre
     */
    public String toString(){
	return "Oficial: " + nombre;
    }
}

