/**
 * Clase Tecnico
 * Clase que deriva información de la clase Operador
 * @author Brenda Paola Resendiz Mendoza
 * @version 1.0
 */

public class Tecnico extends Operador {

    public Tecnico (String nombre) {
	super(nombre);
    } 

    public Tecnico() {
	super();
    }

    public String trabaja() {
	return "Estoy trabajando";
    }

    public String toString() {
	return "Tecnico: " + nombre;
    }
}
