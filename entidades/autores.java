
package entidades;
import.entidades.fecha;
/**
*codigo de la clase Autores
*@author ricar
*
*/

public class autores {
	private int idAutor;	//llave primaria del autor
	public String nombreAutor;	//nombre del autor
	public String apellidoP;	//apellido paterno del auotr
	public String apellidoM;	//apellido materno del autor
	public fecha nacimiento;	//fecha de nacimiento del autor
	public String nacionalidad;	//nacionalidad del autor


	/**
	*metodo constructor autores para crear el objeto tipo autor
	*@param idAutor es la <code> llave primaria del </code> autor
	*@param nomnreAutor es el <code> nombre del </code> autor
	*@param apelliodP es el <code> apellido paterno del </code> autor
	*@param apellidoM es el <code> apellido materno del </code> autor
	*@param nacimiento es la <code> fecha de nacimiento del </code> autor
	*@param nacionalidad es la <code> nacionalidad del </code> autor
	*/
	public autores(int idAutor, String nombreAutor, String apellidoP, 
		String apellidoM, fecha nacimiento, String nacionalidad){
		this.idAutor = idAutor;
		this.nombreAutor = nombreAutor;
		this.apellidoP = apellidoP;
		this.apellidoM = apellidoM;
		this.nacimiento = nacimiento;
		this.nacionalidad = nacionalidad;
	}

	//metodos modificadores
	/**
	*setNombreAutor
	*metodo modificador que cambia el nombre del autor
	*@param nomnreAutor es el <code> nombre del </code> autor
	*/
	public void setNombreAutor(String nombre){
		nombreAutor = nombre;
	}

	/**
	*setApellidoP
	*metodo modificador que cambia el apellido paterno del autor
	*@param apelliodP es el <code> apellido paterno del </code> autor
	*/
	public void setApellidoP(String apP){
		apellidoP = apP;
	}

	/**
	*setApellidoM
	*metodo modificador que cambia el apellido materno del autor
	*@param apellidoM es el <code> apellido materno del </code> autor
	*/
	public void setApellidoM(String apM){
		apellidoM = apM;
	}

	/**
	*setNacimiento
	*metodo modificador que cambia la fecha de nacimiento del autor
	*@param nacimiento es la <code> fecha de nacimiento del </code> autor
	*/
	public void setNacimiento(fecha nacim){
		nacimiento = nacim;
	}

	/**
	*setNacionalidad
	*metodo modificador que cambia la nacionalidad del autor
	*@param nacionalidad es la <code> nacionalidad del </code> autor
	*/
	public void setNacionalidad(String nac){
		nacionalidad = nac;
	}

	//metodos de acceso
	/**
	*getNombreAutor
	*metodo de acceso que retorna el nomnbre del autor
	*@return nombreAutor que es el <code> nmombre </code> del autor
	*/
	public String getNombreAutor(){
		return nombreAutor;
	}

	/**
	*getApellidoP
	*metodo de acceso que retorna el apellido paterno del autor
	*@return apellidoP es el <codeo> apellido paterno </code> del autor
	*/
	public String getApellidoP(){
		return apellidoP;
	}

	/**
	*getApellidoM
	*metodo de acceso que retorna el apelldio materno del autor
	*@return apellidoM es el <code> apellido materno </code> del autor
	*/
	public String getApellidoM(){
		return apellidoM;
	}

	/**
	*getNacimiento
	*metodo de acceso que retorna la fecha de nacimiento del autor
	*@return nacimiento es la <code> fecha de nacimiento </code> del autor
	*/
	public fecha getNacimiento(){
		return nacimiento;
	}

	/**
	*getNacionalidad
	*metodo de acceso que retorna la nacionalidad del autor
	*@return nacionalidad es el <code> lugar de nacimiento </code> del autor
	*/
	public String getNacionalidad(){
		return nacionalidad;
	}

}