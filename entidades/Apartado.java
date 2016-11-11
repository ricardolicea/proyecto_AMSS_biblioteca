package apartado;
/**
*codigo de la clase apartado
@author Ricardo Licea
*/


public class Apartado{
	private int idApartado;		//llave primaria del apartado
	public String nombreApartado;//nombre del apartado
	public char letra; //letra que identifica el apartado

	//metodos de la clase apartado
	/**
	*metodo constructor Apartado que crea el objeto de tipo apartado
	*@param idApartado es la <code> llave primaria </code> del apartado
	*@param nombreApartado es el <code> nombre </code> apartado
	*@param letra es la <code> letra identificadora </code> del apartado
	*/

	public Apartado(int idApartado, String nombreApartado, char letra){
		this.idApartado = idApartado;
		this.nombreApartado = nombreApartado;
		this. letra = letra;
	}
	/**
	*setNombreApartado
	*Metodo modificador que cambia el nombre del apartado
	*@param nombre es el <code> nombre </code> del apartado
	*/
	public void setNombreApartado(String nombre){
		nombreApartado = nombre;
	}

	/**
	*setLetra
	*Meotodo modificador que cambia la letra identificadora del apartado
	*@param letra es la <code> letra identificadora </code> del apartado
	*/
	public void setLetra(char letra){
		this.letra = letra;
	}

	//metodos de acceso

	/**
	*getnombreApartado
	*metodo de acceso que retorna el nombre del apartado
	*@return nombreApartado es el <code> nombre del </code> apartado
	*/
	public String getNombreApartado(){
		return nombreApartado;
	}

	/**
	*getLetra
	*metodo de acceso que retorna la letra identificadora del apartado
	*@return letra es la <code> letra identificadora </code> del apartado
	*/
	public String getLetra(){
		return letra;
	}
}
