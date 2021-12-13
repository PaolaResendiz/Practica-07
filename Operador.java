/**
 * Clase Operador
 * Clase que deriva informacion de la clase Empleado
 * @author Brenda Paola Resendiz Mendoza
 * @version 1.0
 */


public class Operador extends Empleado {

    /**
     * Metodo constructor 
     * @param nombre Recibe el nombre del empleado
     */
    public Operador(String nombre){
	super(nombre);
    }
    
    //Método constructor que da el nombre que habiamos puesto en predeterminado
    public Operador() {
	super();
    }

    /**
     * Metodo toString modificado
     * @return del nombre
     */
    public String toString() {
	return "Operado: " + nombre;
    }
}


    
	
