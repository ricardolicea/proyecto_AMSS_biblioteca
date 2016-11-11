/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entidades;



/**
 *Implementacion de la clase Administrador del catalogo Generales
 * @author ricar
 */
public class Administradores {
    
    //declaracion de atributos
    private int idAdmin; //llave primaria
    public String nombreAdministrador; //nombre del administrador
    public String apellidoPaterno; //apellido paterno
    public String apellidoMaterno; //apellido materno
    public String claveUsuario; //clave del usuario
    public String contrasena; //contrase;a de la clave de usuario
    
    
    //metodos de la clase administradores
    
    /**metodo constructor Administradores para crear el objeto de tipo
    administrador
     * @param idAdmin es  <code>la llave primaria</code> del registro.
     * @param nombreAdministrador es el <code>nombre </code> del objeto.
     * @param apellidoPaterno es el <code>apellido Materno</code> del objeto.
     * @param apellidoMaterno es el <code>aepllido Materno</code> del objeto.
     * @param claveusuario es el <code>uduario</code> del objeto.
     * @param contrasena es la <code> contrasena </code>del usuario
    
    */
    public Administradores(int iAdmin, String nombreAdministrador, 
                String apellidoPaterno, String apellidoMaterno, 
                String claveUsuario, String contrasena) {
        this.idAdmin = iAdmin;
        this.nombreAdministrador = nombreAdministrador;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.claveUsuario = claveUsuario;
        this.contrasena = contrasena;
    }
    
    //Metodos modificadores
    
    /**
     * setNombre
     * 
     * Metodo modificador usado para cambiar el nombre del objeto
     * 
     * @param nom es el <code>nombre x</code> del objeto.
     * 
     */
    public void setNombre(String nom){
        nombreAdministrador = nom;
    }
    /**
     * setApellidoP
     * 
     * Metodo modificador usado para cambiar el apellido paterno del objeto
     * 
     * @param apeP es el <code>apellido paterno</code> del objeto.
     * 
     */
    public void setApellidoP(String apeP){
        apellidoPaterno = apeP;
    }
    /**
     * setApellidoM
     * 
     * Metodo modificador usado para cambiar el apellido materno del objeto
     * 
     * @param apeM es el <code>apellido materno</code> del objeto.
     * 
     */
    public void setApellidoM(String apeM){
        apellidoMaterno = apeM;
    }
    /**
     * setClaveUsuario
     * 
     * Metodo modificador usado para cambiar la clave de usuario del objeto
     * 
     * @param c es la <code>clave de usuario</code> del objeto.
     * 
     */
    public void setClaveUsuario(String c){
        claveUsuario = c;
    }
    /**
     * setContrasena
     * 
     * Metodo modificador usado para cambiar la contrasena del objeto
     * 
     * @param con es la <code>contrasena</code> del objeto.
     * 
     */
    public void setContrasena(String con){
        contrasena = con;
    }
    //Metodos de acceso
    
     /**
     * getNombre
     * 
     * Metodo de acceso que regresa el nombre del objeto 
     * 
     * @return nombreAdministrador es  <code>nombre </code> del objeto.
     * 
     */
    public String getNombre(){
        return nombreAdministrador;
    }
    
     /**
     * getApellidoP
     * 
     * Metodo de acceso que regresa el apellido paterno del objeto 
     * 
     * @return apellidoPaterno es el <code>apellido paterno</code> del objeto.
     * 
     */
    public String getApellidoP(){
        return apellidoPaterno;
    }
    
     /**
     * getApellidoM
     * 
     * Metodo de acceso que regresa el apellido materno del objeto 
     * 
     * @return apellidoMaterno es el <code>apellido materno</code> del objeto.
     * 
     */
    public String getApellidoM(){
        return apellidoMaterno;
    }
    
     /**
     * getClaveUsuario
     * 
     * Metodo de acceso que regresa la clave de usuario del objeto 
     * 
     * @return claveUsuario es la <code>clave de usuario</code> del objeto.
     * 
     */
    public String getClaveUsuario(){
        return claveUsuario;
    }
    
     /**
     * getContrasena
     * 
     * Metodo de acceso que regresa la contrasena del objeto 
     * 
     * @return contrasena es la <code>contrasena</code> del objeto.
     * 
     */
    public String getContrasena(){
        return contrasena;
    }
    
   
   
    
}
