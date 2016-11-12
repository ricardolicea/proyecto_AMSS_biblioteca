package entidades;
import.entidades.fecha;

/**
*codigo de la clase Ejemplar
*@author Ricardo Licea
*/

public class Ejemplar {
	private int idEjemplar;		//llave primaria del ejemplar
	public int progresivo;		//numero progresivo del ejemplar
	public int numEjemplar;		//numero de ejemplar
	public int ano;			//anio de publicacion
	public int iISBN;			//ISBN/ISSN del ejemplar
	public String periodicidad;	//periodicidad(frecuencia) del ejemplar
	public String mes;			//mes de publicacion

	//metodos de la clase
	/**
	*metodo constructor Ejemplar que crea el objeto de tipo Ejemplar
	*@param idEjemplar es la <code> llave primaria </code> del ejemplar
	*@param progresivo es el <code> numero progresivo </code> del ejemplar
	*@param numEjemplar es el <code> numero </code> del ejemplar
	*@param precio es el <code> precio </code> del ejemplar
	*@param iISBN es el <code> ISBN/ISSN </code> del ejemplar
	*@param periodicidad es la <code> periodicidad </code> del ejemplar
	*@param mes es el <code> mes </code> del ejemplar
	*/
	//metodos de la clase
	public Ejemplar(int idEjemplar, int progresivo, 
		int numEjemplar, int precio, int ano, 
		int iISBN, String periodicidad, String mes){
		this.idEjemplar = idEjemplar;
		this.progresivo = progresivo;
		this.numEjemplar = numEjemplar;
		this.precio = precio;
		this.ano = ano;
		this.iISBN = iISBN;
		this.periodicidad = periodicidad;
		this.mes = mes;
	} 

	
	//metodos modificadores
	/**
	*setProgresivo
	*metodo modificador que cambia el numero progresivo del ejemplar
	*@param prog es el <code> numero progresivo </code> del ejemplar
	*/
	public void setProgresivo(int prog){
		progresivo = prog;
	}

	/**
	*setNumEjemplar
	*metodo modificador que cambia el numero de ejemplar
	*@param num es el <code> numero de ejemplar </code>
	*/
	public void setNumEjemplar(int num){
		numEjemplar = num;
	}

	/**
	*setPrecio
	*metodo modificador que cambia el precio del ejemplar
	*@param precio es el <code> precio </code> del ejemplar
	*/
	public void setPrecio(int precio){
		this.precio = precio;
	}

	/**
	*setAno
	*metodo modificador que cambia el ano del ejemplar
	*@param ano es el <code> anio de publicacion </code> del ejemplar
	*/
	public void setAno(int ano){
		this.ano = ano;
	}

	/**
	*setISBN
	*metodo modificador que cambia el ISBN/ISSN del ejemplar
	*@param iISBN es el <code> ISBN/ISSN </code> del ejemplar
	*/
	public void setISBN(int iISBN){
		this.iISBN = iISBN;
	}

	/**
	*setPeriodicidad
	*metodo modificador que cambia la periodicidad del ejemplar
	*@param periodicidad es la <code> periodicidad </code> del ejemplar
	*/
	public void setPeriodicidad(String periodicidad){
		this.periodicidad = periodicidad;
	}
	/**
	*setMes 
	*metodo modificador que cambia el mes de publicacion del ejemplar
	*@param mes es el <code> mes </code> del ejemplar
	*/
	public void setMes(String mes){
		this.mes = mes;
	}

	//metodos de acceso
	/**
	*getProgresivo
	*metodo de acceso que retorna el numero progresivo del ejemplar
	*@return progresivo es el <code> numero progresivo </code> del ejemplar
	*/
	public int getProgresivo(){
		return progresivo;
	}

	/**
	*getNumEjemplar
	*metodo de acceso que retorna el numero de ejemplar
	*@return numEjemplar es el <code> numero </code> del ejemplar
	*/
	public int getNumEjemplar(){
		return numEjemplar;
	}

	/**
	*getPrecio
	*metodo de acceso que retorna el precio del ejemplar
	*@return precio es el <code> precio </code> del ejemplar
	*/
	public int getPrecio(){
		return precio;
	}

	/**
	*getAno
	*metodo de acceso que retorna el anio de publicacion del ejemplar
	*@return ano es el <code> anio de  publicacion </code> del ejemplar
	*/
	public int getAno(){
		return ano;
	}

	/**
	*getISBN
	*metodo de acceso que retorna el ISBN/ISSN del ejemplar
	*@return iISBN es el <code> ISBN/ISSN </code> del ejemplar
	*/
	public int getISBN(){
		return iISBN;
	}

	/**
	*getPublicidad
	*metodo de acceso que retorna la publicidad del ejemplar
	*@return publicidad es la <code> frecuencia de publicidad </code> del ejemplar
	*/
	public String getPublicidad(){
		return publicidad;
	}

	/**
	*getMes
	*metodo de acceso que retorna el mes de publicacion del ejemplar
	*@return mes es el <code> mes de publicacion </code> del ejemplar
	*/
	public String getMes(){
		return mes;
	}


}