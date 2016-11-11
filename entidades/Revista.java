package Revista;
/**
*codigo de la clase revista
*@author Ricardo Licea
*/

public class Revista{
	private int idRevista;		//llave primaria de la revista
	public int topografico;		//numero topografico de la revista
	public String nombreRevista;	//nombre de la revista
	public String periodicidad;		//frecuencia de la periodicidad
	public String notas;			//notas de la revista

	/**
	*metodo constructor Revista que crea el objeto de tipo revista
	*@param idRevista es la <code> llave primaria </code> de la revista
	*@param topografico es el <code> numero topografico </code> de la revist
	*@param nombreRevista es el <code> nombre </code> de la revista
	*@param periodicidad es la <code> frecuencia con que llega </code> la revista
	*@param notas son las <code> notas </code> de la revista
	*/
	public Revista(int idRevista, int topografico, String nombreRevista, 
		String publicidad, String notas){
		this.idRevista = idRevista;
		this.topografico = topografico;
		this.nombreRevista = nombreRevista;
		this.periodicidad = periodicidad;
		this.notas = notas;
	}

	//metodos de la clase
	//metodos modificadores
	/**
	*setTopografico
	*metodo modificador para cambiar el numero topofragico de la revista
	*@param topografico es el <code> numero topografico </code> de la revista
	*/
	public void setTopografico(int topografic0){
		this.topografica = topografico;
	}

	/**
	*setNombreRevista
	*metodo modificador que cambia el nombre de la revista
	*@param nombre es el <code> nombre de la </code> de la revista
	*/
	public void setNombreRevista(String nombre){
		nombreRevista = nombre;
	}

	/**
	*setPeriodicidad 
	*metodo modificador que cambia la periodicidad de la revista
	*@param periodicidad es la <code> frecuencia con la que llega </code> cada revista
	*/
	public void setPeriodicidad(String periodicidad){
		this.periodicidad = periodicidad;
	}

	/**
	*setNotas
	*metodo modificador que cambia las notas de la revista
	*@param notas son las <code> notas </code> de la revista
	*/
	public void setNotas(String notas){
		this.notas = notas;
	}

	//metodos de acceso
	/**
	*getTopografico
	*metodo de acceso que retorna el numero topografico
	*@return topografico
	*/
	public int getTopografico(){
		return topografico;
	}

	/**
	*getNombreRevista
	*metodo de acceso que retorna el nombre de la revista
	*@return nombreRevista
	*/
	public String  getNombreRevista(){
		return nombreRevista;
	}

	/**
	*getPeriodicidad
	*metodo de acceso que retorna la periodicidad de la revista
	*@return periodicidad es la <code> frecuencia con la que llegan </code> las revistas
	*/
	public String getPeriodicidad(){
		return periodicidad;
	}

	/**
	*getNotas
	*metodo de acceso que retorna las notas de la revista 
	*@return notas son las <code> notas </code> de las revistas
	*/
	public String getNotas(){
		return notas;
	}
}