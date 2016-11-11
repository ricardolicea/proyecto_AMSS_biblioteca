/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;
import entidades.fecha;
/**
 *
 * @author ricar
 */
public class libro {
    
    //declaracion de atributos
    private int idLibro;
    public int topografico;
    public String titulo;
    public int ISBN;
    public String tituloOriginal;
    public String subtitulo;
    public String edicion;
    public String lugarPubli;
    public int anoPubli;
    public String notas;
    public int numCopias;
    public int costo;
    public int numPaginas;
    public String proveedor;
    public fecha adquisicion;
    public boolean ilustraciones;
    public boolean graficas;
    public boolean mapas;
    public boolean indices;
    public boolean planas;
    public boolean bibliografia;


    //metodos de la clase libro
     /**
     * setTopografico
     * 
     * Metodo modificador usado para cambiar las topografias  del objeto
     * 
     * @param top es el numero de <code>topografia</code> del objeto.
     * 
     */
    public void setTopografico(int top){
        topografico = top;
    }
     /**
     * setTitulo
     * 
     * Metodo modificador usado para cambiar el titulo del objeto
     * 
     * @param titulo es el <code>titulo</code> del objeto.
     * 
     */
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
     /**
     * setISBN
     * 
     * Metodo modificador usado para cambiar el ISBN del objeto
     * 
     * @param ISBN es el<code>numero ISBN/ISSN</code> del objeto.
     * 
     */
    public void setISBN(int ISBN){
        this.ISBN = ISBN;
    }
     /**
     * setTituloOriginal
     * 
     * Metodo modificador usado para cambiar el titulo original del objeto
     * 
     * @param tituloOr es el <code>tituloOriginal</code> del objeto.
     * 
     */
    public void setTituloOriginal(String tituloOr){
        tituloOriginal = tituloOr;
    }   
     /**
     * setSubtitulo
     * 
     * Metodo modificador usado para cambiar el subtitulo del objeto
     * 
     * @param sub es el <code>subtitulo</code> del objeto.
     * 
     */
    public void setSubtitulo(String sub){
        subtitulo = sub;
    }
     /**
     * setEdicion
     * 
     * Metodo modificador usado para cambiar la edicion del objeto
     * 
     * @param edicion es la <code>edicion</code> del objeto.
     * 
     */
    public void setEdicion(String edicion){
        this.edicion = edicion;
    }
     /**
     * setLugarPubli
     * 
     * Metodo modificador usado para cambiar el lugar de publicacion del objeto
     * 
     * @param lPubli es el <code>lugar de publicacion</code> del objeto.
     * 
     */
    public void setLugarPubli(String lPubli){
        lugarPubli = lPubli;
    }
     /**
     * setAnoPubli
     * 
     * Metodo modificador usado para cambiar el ano de publicacion del objeto
     * 
     * @param aPubli es el<code>ano de publicacion </code> del objeto.
     * 
     */
    public void setAnoPubli(int aPubli){
        anoPubli = aPubli;
    }
     /**
     * setNotas
     * 
     * Metodo modificador usado para cambiar las notas del objeto
     * 
     * @param notas son las <code>notas</code> del objeto.
     * 
     */
    public void setNotas(String notas){
        this.notas = notas;
    }
     /**
     * setNumCopias
     * 
     * Metodo modificador usado para cambiar el numero de copias del objeto
     * 
     * @param copias es el <code>numero de copias</code> del objeto.
     * 
     */
    public void setNumCopias(int copias){
        numCopias = copias;
    }
     /**
     * setCosto
     * 
     * Metodo modificador usado para cambiar el costo del objeto
     * 
     * @param costo es el <code>costo</code> del objeto.
     * 
     */
    public void setCosto(int costo){
        this.costo = costo;
    }
     /**
     * setNumPaginas
     * 
     * Metodo modificador usado para cambiar el numero de paginas del objeto
     * 
     * @param paginas es el <code>numero de paginas</code> del objeto.
     * 
     */
    public void setNumPagina(int paginas){
        numPaginas = paginas;
    }
     /**
     * setProveedor
     * 
     * Metodo modificador usado para cambiar el proveedor del objeto
     * 
     * @param proveedor es el  <code>proveedor</code> del objeto.
     * 
     */
    public void setProveedor(String proveedor){
        this.proveedor = proveedor;
    }
     /**
     * setAdquisicion
     * 
     * Metodo modificador usado para cambiar la fecha de adquisicion del objeto
     * 
     * @param adqui es la <code>fecha de adquisicion</code> del objeto.
     * 
     */
    public void setAdquisicion(fecha adqui){
        adquisicion = adqui;
    }
     /**
     * setIlustraciones
     * 
     * Metodo modificador usado para cambiar si el objeto tiene o no ilustraciones
     * 
     * @param ilustraciones es <code>si tiene o no ilustraciones</code> 
     * 
     */
    public void setIlustracion(boolean ilustraciones){
        this.ilustraciones = ilustraciones;
    }
    /**
     * setGraficas
     * 
     * Metodo modificador usado para cambiar si el objeto tiene o no graficas
     * 
     * @param graficas es <code>si tiene o no graficas</code> 
     * 
     */
    public void setGraficas(boolean graficas){
    this.graficas = graficas;
    }
    /**
     * setMapas
     * 
     * Metodo modificador usado para cambiar si el objeto tiene o no mapas
     * 
     * @param mapas es <code>si tiene o no mapas</code> 
     * 
     */
    public void setMapas(boolean mapas){
        this.mapas = mapas;
    }/**
     * setIndices
     * 
     * Metodo modificador usado para cambiar si el objeto tiene o no indices
     * 
     * @param indices es <code>si tiene o no indices</code> 
     * 
     */
    public void setIndices(boolean indices){
        this.indices = indices;
    }/**
     * setPlanas
     * 
     * Metodo modificador usado para cambiar si el objeto tiene o no planas
     * 
     * @param planas es <code>si tiene o no planas</code> 
     * 
     */
    public void setPlanas(boolean planas){
        this.planas = planas;
    }/**
     * setBibliografia
     * 
     * Metodo modificador usado para cambiar si el objeto tiene o no bibliografia
     * 
     * @param bibliografia es <code>si tiene o no bilbiografia</code> 
     * 
     */
    public void setBibliografia(boolean bibliografia){
        this.bibliografia = bibliografia;
    }
    
    //metodos de acceso
    /**
     * getTopografico
     * 
     * Metodo de acceso que regresa el numero topografico del objeto 
     * 
     * @return topografico es  <code>numero topografico  </code> del objeto.
     * 
     */
    public int getTopografico(){
        return topografico;
    }
    /**
     * getTitulo
     * 
     * Metodo de acceso que regresa el titulo del objeto 
     * 
     * @return titulo es el   <code>titulo </code> del objeto.
     * 
     */
    public String getTitulo(){
        return titulo;
    }
    /**
     * getISBN
     * 
     * Metodo de acceso que regresa el ISBN/ISSN del objeto 
     * 
     * @return ISBN es  <code>el ISBN/ISSN </code> del objeto.
     * 
     */
    public int getISBN(){
        return ISBN;
    }
    /**
     * getTituloOriginal
     * 
     * Metodo de acceso que regresa el titulo original del objeto 
     * 
     * @return tituloOriginal es  <code>el titulo orignal  </code> del objeto.
     * 
     */
    public String getTiuloOriginal(){
        return tituloOriginal;
    }
    /**
     * getSubtitulo
     * 
     * Metodo de acceso que regresa el subtitulo del objeto 
     * 
     * @return subitulo es el <code>subtitulo </code> del objeto.
     * 
     */
    public String getSubtitulo(){
        return subtitulo;
    }
    /**
     * getEdicion
     * 
     * Metodo de acceso que regresa la edicion del objeto 
     * 
     * @return edicion es  <code>el nombre de la edicion </code> del objeto.
     * 
     */
    public String getEdicion(){
        return edicion;
    }
    /**
     * getLugarPubli
     * 
     * Metodo de acceso que regresa el lugar de publicacion del objeto 
     * 
     * @return lugarPubli es el  <code>lugar de publicacion </code> del objeto.
     * 
     */
    public String getLugarPubli(){
        return lugarPubli;
    }
    /**
     * getAnoPubli
     * 
     * Metodo de acceso que regresa el ano de publicacion del objeto 
     * 
     * @return anoPubli es  el <code>ano de publicacion </code> del objeto.
     * 
     */
    public int getAnoPubli(){
        return anoPubli;
    }
    /**
     * getNotas
     * 
     * Metodo de acceso que regresa las notas del objeto 
     * 
     * @return notas son las  <code>notas </code> del objeto.
     * 
     */
    public String getNotas(){
        return notas;
    }
    /**
     * getNumCopias
     * 
     * Metodo de acceso que regresa el numero de copias del objeto 
     * 
     * @return numCopias es el  <code>numero de copias </code> del objeto.
     * 
     */
    public int getNumCopias(){
        return numCopias;
    }
    /**
     * getCosto
     * 
     * Metodo de acceso que regresa el costo del objeto 
     * 
     * @return costo es  <code>el costo en pesos </code> del objeto.
     * 
     */
    public int getCosto(){
        return costo;
    }
    /**
     * getNumPaginas
     * 
     * Metodo de acceso que regresa el numero de paginas del objeto 
     * 
     * @return numPaginas es  <code>el numero de paginas </code> del objeto.
     * 
     */
    public int getNumPaginas(){
        return numPaginas;
    }
    /**
     * getProveedor
     * 
     * Metodo de acceso que regresa el proveedor del objeto 
     * 
     * @return proveedor es  <code>el nombre de proveedor </code> del objeto.
     * 
     */
    public String getProveedor(){
        return proveedor;
    }
    /**
     * getAdquisicion
     * 
     * Metodo de acceso que regresa la fecha de adquisicion del objeto 
     * 
     * @return adquisicion es  <code>fecha de adquisicion </code> del objeto.
     * 
     */
    public fecha getAdquisicion(){
        return adquisicion;
    }
    /**
     * getIlustraciones
     * 
     * Metodo de acceso que regresa si el objeto tiene ilustraciones o no 
     * 
     * @return ilustraciones es  <code>si tiene o no ilustraciones </code> 
     * 
     */
    public boolean getIlustraciones(){
        return ilustraciones;
    }
     /**
     * getIlustraciones
     * getGraficas
     * Metodo de acceso que regresa si el objeto tiene graficas o no 
     * 
     * @return graficas es  <code>si tiene o no graficas </code> 
     * 
     */
    public boolean getGraficas(){
        return graficas;
    }
     /**
     * getMapas
     * 
     * Metodo de acceso que regresa si el objeto tiene mapas o no 
     * 
     * @return mapas es  <code>si tiene o no mapas </code> 
     * 
     */
    public boolean getMapas(){
        return mapas;
    }
     /**
     * getIndices
     * 
     * Metodo de acceso que regresa si el objeto tiene indices o no 
     * 
     * @return indices es  <code>si tiene o no indices </code> 
     * 
     */
    public boolean getIndices(){
        return indices;
    }
     /**
     * getPlanas
     * 
     * Metodo de acceso que regresa si el objeto tiene planas o no 
     * 
     * @return planas es  <code>si tiene o no planas </code> 
     * 
     */
    public boolean getPlanas(){
        return planas;
    }
     /**
     * getBibliografia
     * 
     * Metodo de acceso que regresa si el objeto tiene bibliografia o no 
     * 
     * @return bibliografia es  <code>si tiene o no ilustraciones </code> 
     * 
     */
    public boolean getBibliografia(){
        return bibliografia;
    }
    
}
    
