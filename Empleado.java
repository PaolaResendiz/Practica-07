/**
 * Clase Empleado
 * Clase que muestra los datos de un empleado
 * @author Brenda Paola Reséndiz Mendoza
 * @version 1.0
 */

public class Empleado{

    //Atributos
    protected String nombre;

    /**
     * Constructor 1
     * Metodo constructor que da el nombre Carlos Sanchez Mendoza
     */
    public Empleado() {
	this.nombre = "Carlos Sanchez Mendoza";
    }

    /**
     * Constructor 2
     * @param nombre Representa el nombre del empleado
     */
    public Empleado (String nombre){
	this.nombre = nombre;
    }

    /**
     * Metodo que devuelve el nombre del empleado
     * @return El nombre del empleado
     */
    public String getNombre() {
	return this.nombre;
    }

    /**
     * Metodo que modifica el nombre del empleado
     * @param nombre string
     */
    public void setNombre (String nombre){
	this.nombre = nombre;
    }

    /**
     * Metodo toString
     * regresa la palabra Empleado y el nombre del mismo
     */
    public String toString() {
	return "Empleado " + nombre;
    }

    //equals
    @Override
    public boolean equals(Object empleado){
	Empleado emple = (Empleado) empleado;
	return this.nombre.equals(emple.getNombre());
    }
}



