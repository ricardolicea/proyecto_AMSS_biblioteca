package entidades;

/**
*codigo de la clase Articulo
*@author Ricardo Licea
*/

public class Articulo{
	private int idArticulo;
	public String nombreArticulo;
	public int paginas;
	public String resena;

	//metodos de la clase
	/**
	*metodo constructor Articulo para crear el objeto de tipo articulo
	*@param idArticulo es la <code> llave primaria </code> del articulo
	*@param nombreArticulo es el <code> nombre </code> del articulo
	*@param paginas es el <code> numero de paginas </code> del articulo
	*@param resena es la <code> resena </code> del articulo
	*/
	public Articulo(int idArticulo, String nombreArticulo, int paginas, String resena){
		this.idArticulo = idArticulo;
		this.nombreArticulo = nombreArticulo;
		this.paginas = paginas;
		this.resena = resena;
	}

	//metodos modificadores
	/**
	*setNombreArticulo
	*metodo modificador para cambiar el nombre del articulo
	*@param nombre es el <code> nombre </code> del articulo
	*/
	public void setNombreArticulo(String nombre){
		nombreArticulo = nombre;
	}

	/**
	*setPaginas
	*metodo modifcador para cambiar el numero de paginas del articulo
	*@param paginas es el <code> numero de paginas </code> del articulo
	*/
	public void setPaginas(int paginas){
		this.paginas = paginas;
	}

	/**
	*setResena
	*metodo modifcador para cambiar la resenia del articulo
	*@param resena es la <code> resena </code> del articulo
	*/
	public void setResena(String resena){
		this.resena = resena;
	}

	//metodos de acceso
	/**
	*getNombreArticulo
	*metodo de acceso que retorna el nombre del articulo
	*@return nombreArticulo es el <code> nombre </code> del articulo
	*/
	public String getNombreArticulo(){
		return nombreArticulo;
	}

	/**
	*getPaginas
	*metodo de acceso que retorna el numero de paginas del articulo
	*@return paginas es el <code> numero de paginas </code> del articulo
	*/
	public int getPaginas(){
		return paginas;
	}

	/**
	*getResena
	*metodo de acceso que retorna las resenas del articulo
	*@return resena es la <code> resena </code> del articulo
	*/
	public String getResena(){
		return resena;
	}
}
