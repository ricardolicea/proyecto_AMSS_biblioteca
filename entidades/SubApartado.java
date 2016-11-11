package entidades;

/**
*codigo de la clase subApartado
*@author Ricardo Licea
*/

public class SubApartado{
	private int idSubApartado;	//llave primaria del subApartado
	public int numProg;			//numero progresivo del subApartado
	public String nombreSubApartado;	//nombre del subapartado

	//metodos de la clase
	/**
	*metodo constructor SubApartado que crea el objeto de tipo SubApartado
	*@param idSubApartado es la <code> llave primaria </code> del subapartado
	*@param numProg es el <code> numero progresivo </code> del subapartado
	*@param nombreSubApartado es el <code> nombre </code> del subapartado
	*/
	public SubApartado(int idSubApartado, int numProg, String nombreSubApartado){
		this.idSubApartado = idSubApartado;
		this.numProg = numProg;
		this.nombreSubApartado = nombreSubApartado;
	}

	//metodos modificadores
	/**
	*setNumProg
	*metodo modificador que cambia el numero progresivo
	*@param numP es el <code> numero progresivo</code> del subapartado
	*/
	public void setNumProg(int numP){
		numProg = numP;
	}

	/**
	*setNombreSubApartado
	*metodo modificador que cambia el nombre del subapartado
	*@param nombre es el <code> nombre del </code> subapartado
	*/
	public void setNombreSubApartado(String nombre){
		nombreSubApartado = nombre;
	}

	//metodos de acceso
	/**
	*getNumPRog
	*metodo de acceso que retorna el numero progresivo del subapartado
	*@return numProg es el <code> numero progresivo </code> del subapartado
	*/
	public int getNumProg(){
		return numProg;
	}

	/**
	*getNombreSubApartado
	*metodo de acceso qeu retorna el nombre del subapartado
	*@return nombreSubApartado es el <code> nombre </code> del subapartado
	*/
	public String getNombreSubApartado(){
		return nombreSubApartado;
	}
}