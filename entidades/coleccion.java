package entidades;

/**
*codigo de la clase coleccion
*@author Ricardo Licea
*/

public class coleccion{
	private int idColeccion;	//llave primaria de la coleccion
	public String nombreCol;	//nombre de la coleccion
	public int numCol;			//numero de coleccion
	public int numProg;			//CHECAR	
	public int volumenes;		//numero de volumenes

	/**
	*metodo constructor coleccion para crear el objeto de tipo coleccion
	*@param idColeccion es la <code> llave primaria </code> de la coleccion
	*@param nombreCol es el <code> nombre </code> de la coleccion
	*@param numCol es el <code> numero </code> de la coleccion
	*@param numProg es el <code> CHECAR </code> de la coleccion
	*@param volumenes es el <code> numero de volumenes </code> de la coleccion
	*/
	public coleccion(int idColeccion, String nombreCol, int numCol, 
		int numProg, int volumenes){
		this.idColeccion = idColeccion;
		this.nombreCol = nombreCol;
		this.numCol = numCol;
		this.numProg = numProg;
		this.volumenes = volumenes;
	}
	//metodos modificadores
	/**
	*setNombreCol
	*metodo mofificador que cambia el nombre de la coleccion
	*@param nombre es <code> el nombre </code> de la coleccion
	*/
	public void setNombreCol(String nombre){
		nombreCol = nombre;
	}

	/**
	*setnumCol
	*metodo modificador que cambia el numero de la coleccion
	*@param numC es el <code> numero </code> de la coleccion
	*/
	public void setnumCol(int numC){
		numeroCol = numC;
	}

	/**
	*setNumProg
	*metodo modificador que cambia el CHECAR de la coleccion
	*@param numP es el <code> CHECAR </code> de la coleccion
	*/
	public void setNumProg(int numP){
		numProg = numP;
	}

	/**
	*setVolumenes
	*metodo modificador que cambia el numero de volumenes de la coleccion
	*@param volumenes es el <code> numero de volumenes </code> de la coleccion
	*/
	public void setVolumenes(int volumenes){
		this.volumenes = volumenes;
	}

	//metodos de acceso
	/**
	*getNombreCol
	*metodo de acceso que retorna el nombre de la coleccion
	*@return nombreCol es el <code> nombre </code> de la coleccion
	*/
	public String getNombreCol(){
		return nombreCol;
	}

	/**
	*getNumCol
	*metodo de acceso que retorna el numero de la coleccion
	*@return numCol es el <code> numero </code>de la coleccion
	*/
	public int getNumCol(){
		return numCol;
	}

	/**
	*getNumProg
	*metodo de acceso que retorna el CHECAR de la coleccion
	*@param numProg es el <code> CHECAR</code> de la coleccion
	*/
	public int getNumProg(){
		return numProg;
	}

	/**
	*getVolumenes
	*metodo de acceso que retorna el numero de volumenes de la coleccion
	*@param volumenes es el <code> numero de volumenes </code> de la coleccion
	*/
	public int getVolumenes(){
		return volumenes;
	}

}