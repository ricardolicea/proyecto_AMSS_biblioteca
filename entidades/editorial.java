/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author ricar
 */
public class editorial {
    //declaracion de atributos
    private int idEditorial;
    public String nombre;
    public String calle;
    public int numero;
    public int cp;
    public String colonia;
    public String ciudad;
    public String estado;
    public String pais;
    
    //metodos
    /**
     * Metodo constructor con parametros de la clase editorial
     * @param nombre es el nombre de la editorial
     * @param calle es la calle del editorial
     * @param numero es el numero de la editorial
     * @param cp es el codigo postal de la editorial
     * @param colonia es la colonia de la editorial
     * @param ciudad es la ciudad de la editorial
     * @param estado es el estado de la editorial
     * @param pais es el pais de la editorial
     */
    public editorial(String nombre, String calle, int numero,
            int cp, String colonia, String ciudad, String estado, String pais){
        this.nombre = nombre;
        this.calle = calle;
        this.numero = numero;
        this.cp = cp;
        this.colonia = colonia;
        this.ciudad = ciudad;
        this.estado = estado;
        this.pais = pais;
        
    }
    //metodos modificadores
    /**
     * setNombre
     * Metodo modificador<code> para cambiar el nombre</code> de la editorial
     * @param nombre 
     */
    public void setNombre(String nombre){
        
    }
    /**
     * setCalle
     * metodo modificador para<code> cambiar la calle</code> de la editorial
     * @param calle 
     */
    public void setCalle(String calle){
        
    }
    /**
     * setNumero
     * metodo modificador para <code>cambiar el numero de la direccion</code> de la editorial
     * @param numero 
     */
    public void setNumero(int numero){
        
    }
    /**
     * setCp
     * Metodo modificador para <code>cambiar el codigo postal de</code> la editorial
     * @param cp 
     */
    public void setCp(int cp){
        
    }
    /**
     * setColonia
     * Metodo modificador<code> para cambiar la colonia de</code> la editorial
     * @param col 
     */
    public void setColonia(String col){
        
    }
    /**
     * setColonia 
     * metodo modificador<code> para cambiar la ciudad </code>de la editorial
     * @param ciudad 
     */
    public void setCiudad(String ciudad){
        
    }
    /**
     * setEstado
     * metodo modificador para<code> cambiar el estado</code> de la editorial
     * @param estado 
     */
    public void setEstado(String estado){
        
    }
    /**
     * setPais
     * metodo modificador<code> para cambiar el pais </code> de la editorial
     * @param pais 
     */
    public void setPais(String pais){
        
    }
    //metodos de acceso
    
    /**
     * getNombre
     * metodo de acceso que<code> retorna el valor del nombre</code> de la editorial
     * @return nombre
     */
    public String getNombre(){
     return nombre;   
    }
    /**
     * getCalle
     * metodo de acceso que <code> retorna el valor de la calle </code> de la editorial
     * @return calle
     */
    public String getCalle(){
        return calle;
    }
    /**
     * getNumero
     * metodo de acceso que <code> retorna el valor del numero </code> de la editorial
     * @return numero
     */
    public int getNumero(){
       return numero; 
    }
    /**
     * getCp
     * metodo de acceso que <code> retorna el valor del codigo postal</code> de la editorial
     * @return cp
     */
    public int getCp(){
        return cp;
    }
    /**
     * getColonia
     * metodo de acceso que <code>retorna el valor de la colonia</code> de la editorial
     * @return colonia
     */
    public String getColonia(){
        return colonia;
    }
    /**
     * getCiudad
     * metodo de acceso que <code> retorna el valor de la ciudad</code> de la editorial
     * @return ciudad
     */
    public String getCiudad(){
        return ciudad;
    }
    /**
     * getEstado
     * metodo de acceso que <code> retorna el valor del estado</code> de la editorial
     * @return estado
     */
    public String getEstado(){
        return estado;
    }
    /**
     * getPais
     * metodo de acceso que <code> retorna el valor del pais </code> de la editorial
     * @return pais
     */
    public String getPais(){
        return pais;
    }
}
