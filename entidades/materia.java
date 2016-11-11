package entidades;

/**
*Codigo de la clase materia
*@author Ricardo Licea
*/

public class materia{
	private int idMateria;		//llave primaria de la materia
	public String nombreMateria;//nombre de la materia

	/**
	*metodo constructor materia para crear el objeto de tipo materia
	*@param idMateria es <code> la llave primaria </code> de la materia
	*@param nombreMateria es <code> el nombre </code> de la materia
	*/
	public materia(int idMateria, String nombreMateria){
		this.idMateria = idMateria
		this.nombreMateria = nombreMateria;
	}

	//metodos modificadores
	/**
	*setNombreMateria
	*metodo modificador que cambia el nombre de la materia
	*@param nombre es el <code> nombre </code> de la materia
	*/
	public void setNombreMateria(String nombre){
		nombreMateria = nombre;
	}

	//metodos de acceso
	/**
	*getNombreMateria
	*metodo de acceso que retorna el nombre de la materia
	*@return nombreMateria es el <code> nombre </code> de la materia
	*/
	public String getNombreMateria(){
		return nombreMateria;
	}
}