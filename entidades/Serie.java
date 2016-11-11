package entidades;

/**
*codigo de la clase Serie
*@author Ricardo Licea
*/


public class Serie{
	private int idSerie;	//llave primaria de la serie
	public int numSerie;	//numero de la serie
	public String nombreSerie;	//nombre de la serie

	//metodos de la clase
	/**
	*metodo constructor Serie para crear el objeto tipo Serie
	*@param idSerie es la <code> llave primaria </code> de la serie
	*@param numSerie es el <code> numero </code> de la serie
	*@param nombreSerie es el <code> nombre </code> de la serie
	*/
	public Serie(int idSerie, int numSerie, String nombreSerie){
		this.idSerie = idSerie;
		this.numSerie = numSerie;
		this.nombreSerie = nombreSerie;
	}
	//metodos modificadores
	/**
	*setNumSerie
	*metodo modificador para cambiar el numero de serie
	*@param num es el <code> numero de serie </code>
	*/
	public void setNumSerie(int num){
		numSerie = num;
	}

	/**
	*setNombreSerie
	*metodo modificador para cambiar el nombre de serie
	*@param nombre es el <code> nombre </code> de la serie
	*/
	public void setNombreSerie(int nombre){
		nombreSerie = nombre;
	}
	//metodos de acceso
	/**
	*getNumSerie
	*metodo de acceso que retorna el numero de serie
	*@return numSerie es el <code> numero </code> de la serie
	*/
	public int getNumSerie(){
		return numSerie;
	}

	/**
	*getNombreSerie
	*metodo de acceso que retorna el nombre de la serie
	*@return nombreSerie es el <code> nombre </code> de la serie
	*/
	public String getNombreSerie(){
		return nombreSerie;
	}
}