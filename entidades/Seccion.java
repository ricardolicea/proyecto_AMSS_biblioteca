package entidades;

/**
*Codigo de la clase Seccion
*@author Ricardo Licea
*/


public class Seccion{
	private int idSeccion;	//llave primaria de la seccion
	public int numSeccion;	//numero de la seccion
	public String nombreSeccion;	//nombre de la seccion

	//metodos de la clase
	/**
	*metodo constructor Seccion para crear el objeto de tipo seccion
	*@param idSeccion es la <code> llave primaria</code> de la seccion
	*@param numSeccion es el <code> numero </code> de la seccion
	*@param nombreSeccion es el <code> nombre </code> de la secciom
	*/
	public Seccion(int idSeccion, int numSeccion, String nombreSeccion){
		this.idSeccion = idSeccion;
		this.numSeccion = numSeccion;
		this.nombreSeccion = nombreSeccion;
	}

	//metodos modificadores
	/**
	*setNumSeccion
	*metodo modificador para cambiar el numero de seccion
	*@param num es el <code> numero </code> de la seccion
	*/
	public void setNumSeccion(int num){
		numSeccion = num;
	}

	/**
	*setNombreSeccion
	*metodo modificador para cambiar el nombre de la seccion
	*@param nombre es el <code> nombre </code> de la seccion
	*/
	public void setNombreSeccion(String nombre){
		nombreSeccion = nombre;
	}

	//metodos de acceso
	/**
	*getNumSeccion
	*metodo de acceso que retorna el numero de la seccion
	*@return numSeccion es el <code> numero </code> de la seccion
	*/
	public int getNumSeccion(){
		return numSeccion;
	}

	/**
	*getNombreSeccion
	*metodo de acceso que retorna el nombre de la seccion
	*@return nombreSeccion es el <code> nombre </code> de la seccion
	*/
	public String getNombreSeccion(){
		return nombreSeccion;
	}
}