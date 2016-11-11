package entidades;
import.entidades.fecha;
/**
*codigo de la clase prestamos
*@author Ricardo Licea
*/

public class prestamos{
	private int idPrestamos;	//llave primaria del prestamo
	public fecha prestamo;		//fecha en que se presto
	public fecha vencimiento;	//fecha en que se vence el prestamo

	/**
	*metodo contructor prestamos para crear un objeto de tipo prestamos
	*@param idPrestamos es la <code> llave primaria </code> del prestamo
	*@param prestamo es la <code> fecha de </code> prestamo
	*@param vencimiento es la <code> fecha en que se venze </code> prestamo
	*/
	public prestamos(int idPrestamos, fecha prestamo, fecha vencimiento){
		this.idPrestamos = idPrestamos;
		this.prestamo = prestamo;
		this.vencimiento = vencimiento;
	}

	//metodos modificadores
	/**
	*setPrestamo
	*metodo modificador que cambia la fecha en que se realiza un prestamo
	*@param prestamo es la <code> fecha en que se presta</code> un material
	*/
	public void setPrestamo(fecha prestamo){
		this.prestamo = prestamo;
	}

	/**
	*setVencimiento
	*metodo modificador que cambia la fecha en que se venze un prestamo
	*@param vencimiento es la <code> fecha en que se venze </code> un prestamo
	*/
	public void setVencimiento(fecha vencimiento){
		this.vencimiento = vencimiento;
	}
}