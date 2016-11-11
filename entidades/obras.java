package entidades;

/**
*
*codigo de la clase obras
*@author Ricardo Licea
*/


public class obras{
	private int idObra;		//llave primaria de la obra
	public int numeroObra;	//numero de la obra
	public String nombreObra;//nombre de la obra
	public int numeroTomas;	//numero de tomas

	//metodos de la clase
	/**
	*metodo constructor obras para crear el objeto tipo obras
	*@param idObra es la <code> llave primaria </code> de la obra
	*@param numeroObra es el <code> numero de obra </code> de la obra
	*@param nombreObra es el <code> nombre </code> de la obra
	*@param numeroTomas es el<code> numero de tomas </code> de la obra
	*/
	public obras(int idObras, int numeroObra, String nombreObra, int numeroTomas){
		this.idObras = idObras;
		this.nombreObra = nombreObra;
		this.numeroObra = numeroObra;
		this.numeroTomas = numeroTomas;
	}

	//metodos modificadores
	/**
	*setNumeroObra
	*metodo modificador para cambiar el numero de obra
	*@param num es el <code> numero de obra </code>
	*/
	public void setNumeroObra(int num){
		numeroObra = num;
	}

	/**
	*setNombreObra
	*metodo modificador para cambiar el nombre de obra
	*@param nombre es el <code> nombre </code> de la obra
	*/
	public void setNombreObra(String nombre){
		nombreObra = nombre;
	}

	/**
	*setNumeroTomas
	*metodo modificador para cambiar el numero de tomas de la obra
	*@param num es el <code> numero de tomas de </code> de la obra
	*/
	public void setNumeroTomas(int num){
		numeroTomas = num;
	}

	//metodos de acceso
	/**
	*getnumeroObra
	*metodo de acceso que retorna el numero de obra
	*@return numeroObra es el <code> numero </code> de la obra
	*/
	public int getNumeroObra(){
		return numeroObra;
	}

	/**
	*getNombreObra
	*metodo de acceso que retorna el nombre de la obra
	*@return nombreObra es el <code> nombre </code> de la obra
	*/
	public String getNombreObra(){
		return nombreObra;
	}

	/**
	*getNumeroTomas
	*metodo de acceso que retorna el numero de tomas de la obra
	*@return numeroTomas es el <code> numero de tomas </code> de la obra
	*/
	public int getNumeroTomas(){
		return numeroTomas;
	}
}