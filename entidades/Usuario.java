package entidades;

/**
*codigo de la clase usuario
*@author Ricardo Licea
*/

public class Usuario{
	private int idUsuario;			//llave primaria del usuario
	public String nombreUsuario;	//nombre del usuario
	public String apellidoPaterno;	//apellido paterno del usuario
	public String apellidoMaterno;	//apellido materno del usuario
	public int grado;				//grado del usuairo
	public int periodico;			//
	public String instituto;		//instituto del usuario
	public String calle;			//calle del usuario
	public String colonia;			//colonia del usuario
	public int cp;					//codigo postal del usuario
	public int numero;				//numero de la casa del usuario
	public String ciudad;			//ciudad del usuario
	public String estado;			//estado del usuario
	public int telefono;			//telefono del usuario

	//metodos de la clase
	/**
	*metodo constructor Usuario para crear un objeto de tipo usuario
	*@param idUsuario es la <code> llave primaria </code>del usuario
	*@param nombreUsuario es el <code> nombre </code> del usuario
	*@param apellidoPaterno es el <code> apellido paterno </code> del usuario
	*@param apellidoMaterno es el <code> apellido Materno </code> del usuario
	*@param grado es el <code> grado </code> del usuario
	*@param periodico es el <code> CHECAR </code> del usuario
	*@param instituto es el <code>instituto </code> del usuario
	*@param calle es la <code> calle donde reside </code> el usuario
	*@param colonia es la <code> colonia donde reside </code> el usuario
	*@param cp es el <code> codigo postal </code> del usuario
	*@param numero es el <code> numero donde reside </code> el usuario
	*@param ciudad es la <code> ciudad donde reside </code> el usuario
	*@param estado es el <code> estado donde reside </code> el usuario
	*@param telefono es el <code> numero de telefono </code> del usuario
	*/
	public Usuario(int idUsuario, String nombreUsuario, 
		String apellidoPaterno, String apellidoMaterno, 
		int grado, int periodico, String instituto, 
		String calle, String colonia, int cp, int numero,
		String ciudad, String estado, int telefono){
		this.idUsuario = idUsuario;
		this.nombreUsuario = nombreUsuario;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.grado = grado;
		this.periodico = periodico;
		this.instituto = instituto;
		this.calle = calle;
		this.colonia = colonia;
		this.cp = cp;
		this.numero = numero;
		this.ciudad = ciudad;
		this.estado = estado;
		this.telefono = telefono;
	}

	//metodos modificadores
	/**
	*setNombreUsuario
	*metodo modificador para cambair el nombre del usuario
	*@param nom es el <code> nombre </code> del usuario
	*/
	public void setNombreUsuario(String nom){
		nombreUsuario = nom;
	}

	/**
	*setApellidoPaterno
	*metodo modificador para cambiar el apellido paterno del usuario
	*@param apellidoP es el <code> apellido Paterno </code> del usuario
	*/
	public void setApellidoPaterno(String apellidoP){
		apellidoPaterno = apellidoP;
	}

	/**
	*setApellidoMaterno
	*metodo modificador para cambiar el apellido materno del usuario
	*@param apellidoM es el <code> apellido materno </code> del usuario
	*/
	public void setApellidoMaterno(String apellidoM){
		apellidoMaterno = apellidoM
	}

	/**
	*setGrado
	*metodo modificador pra cambiar el grado del usuario
	*@param grad es el <code> grado </code> del usuario
	*/
	public void setGrado(String grad){
		grado = grad;
	}

	/**
	*setInstituto
	*metodo modificador para cambiar el instituto del usuario
	*@param insitituo es el <code> instituto </code> del usuario
	*/
	public void setInstituto(String instituto){
		this.instituto = instituto;
	}

	/**
	*setCalle
	*metodo modificador para cambiar la calle donde reside el usuario
	*@param cal es la <code> calle donde reside </code> el usuario
	*/
	public void setCalle(String cal){
		calle = cal;
	}

	/**
	*setColonia
	*metodo modificador para cambiar la colonia donde reside el usuario
	*@param col es la <code> colonia donde reside </code> el usuario
	*/
	public void setColonia(String col){
		colonia = col;
	}

	/**
	*setCp
	*metodo modificador para cambiar el codigo postal donde reside el usuario
	*@param cp es el <code> codigo postal donde reside </code> el usuario
	*/
	public void setCp(int cp){
		this.cp = cp;
	}

	/**
	*setNumero
	*metodo modificador para cambiar el numero donde reside el usuario
	*@param num es el <code>numero donde reside </code> el usuario
	*/
	public void setNumero(int num){
		numero = num;
	}

	/**
	*setCiudad
	*metodo modficador para cambiar la ciudad donde reside el usuario
	*@param ciud es la <code> ciudad donde reside </code> el usuario
	*/
	public void setCiudad (String ciud){
		ciudad = ciud;
	}

	/**
	*setEstado 
	*metodo modificador para cambiar el Estado donde reside el usuario
	*@param est es el <code> estado donde reside </code> el usuario
	*/
	public void setEstado(String est){
		estado = est;
	}

	/**
	*setTelefono
	*metodo modificador para cambiar el telefono del usuario
	*@param tel es el <code> telefono </code> del usuario
	*/
	public void setTelefono(int tele){
		telefono = tel;
	}

	//metodos de acceso
	/**
	*getNombreUsuario
	*metodo de acceso que retorna el nombre de usuario
	*@return nombreUsuario es el <code> nombre </code> del usuario
	*/
	public String getNombreUsuario(){
		return nombreUsuario;
	}

	/**
	*getApellidoPaterno
	*metodo de acceso que retorna el apellido paterno del usuario
	*@return apellidoPaterno es el <code> apellido paterno </code> del usuario
	*/
	public String getApellidoPaterno(){
		return apellidoPaterno;
	}

	/**
	*getApellidoMaterno
	*metodo de acceso que retorna el apellido materno del usuario
	*@return apellidoMaterno es el <code> apellido materno </code> del usuario
	*/
	public String getApellidoMaterno(){
		return apellidoMaterno;
	}

	/**
	*getGrado
	*metodo de acceso que retorna el grado del usuario
	*@return grado es el <code> grado </code> del usuario
	*/
	public int getGrado(){
		return grado;
	}

	/**
	*getPeriodico
	*metodo de acceso que retorna el periodico del usuario
	*@return periodico es el <code> periodico CHECAR </code> del usuario
	*/
	public int getPeriodico(){
		return periodico;
	}

	/**
	*getInstituto
	*metodo de acceso que retorna el insitituo del usuario
	*@return instituto es el <code> instituto </code> del usuario
	*/
	public String getInstituto(){
		return instituto;
	}

	/**
	*getCalle
	*metodo de acceso que retorn la calle donde reside el usuario
	*@return calle es la <code> calle donde reside </code> el usuario
	*/
	public String getCalle(){
		return calle;
	}

	/**
	*getColonia
	*metodo de acceso qe3u retorna la colonia del usuario
	*@return colonia es la <code> colonia donde resude </code> el usuario
	*/
	public String getColonia(){
		return colonia;
	}

	/**
	*getCp
	*metodo de acceso que retorna el codigo postal del usuario
	*@return cp es el <code> codigo postal donde reside </code> el usuario
	*/
	public int getCp(){
		return cp;
	}

	/**
	*getNumero
	*metodo de acceso que retorna el numero donde reside el usuario
	*@return numero <code> es el numero donde reside </code> el usuario
	*/
	public int getNumero(){
		return numero;
	}

	/**
	*getCiudad
	*metodo de acceso que retorna la ciudad donde reside el usuario
	*@return ciudad es la <code> ciudad donde reside </code> el usuario
	*/
	public String getCiudad(){
		return ciudad;
	}

	/**
	*getEstado
	*metodo de acceso que retorna el estado donde reside el usuario
	*@return estado es el <code> estado donde reside </code> el usuario
	*/
	public String getEstado(){
		return estado;
	}

	/**
	*getTelefono
	*metodo de acceso que retorna el telefono del usuario
	*@return telefono es el <code> telefono </code> del usuario
	*/
	public int getTelefono(){
		return telefono;
	}