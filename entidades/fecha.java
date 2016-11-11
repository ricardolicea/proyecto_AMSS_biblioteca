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
public class fecha {
    public int iDia;
    public int iMes;
    public int iAno;
    
    
    /**metodo constructor fecha para crear el objeto tipo fecha
     * 
     * @param iDia es <code> el dia </code> de la fecha
     * @param iMes es <code> el mes</code> de la fecha
     * @param iAno es <code> el anio</code> de la fecha
     */
    public fecha(int iDia, int iMes, int iAno){
        this.iDia = iDia;
        this.iMes = iMes;
        this.iAno = iAno;
    }

    //metodos modificadores
    /**
     * setDia
     * Metodo modificador para cambiar el valor del dia en la fecha
     * @param iDia es el dia en la fecha
     */
    public void setDia(int iDia){
        this.iDia = iDia;
    }
    /**
     * setMes
     * Metodo modificador para cambiar el mes en la fecha
     * @param iMes es el mes en la fecha
     */
    public void setMes(int iMes){
        this.iMes = iMes;
    }
    /**
     * setAno
     * Metodo modificador para cambiar el anio en la fecha
     * @param iAno es el anio en la fecha
     */
    public void setAno(int iAno){
        this.iAno = iAno;
    }
    
    //metodos de acceso
    /**
     * getDia
     * Metodo de acceso para accesar al valor del dia en la fecha
     * @return iDia
     */
    public int getDia(){
        return iDia;
    }
    /**
     * getMes
     * Metodo de acceso para accesar al valor del mes en la fecha
     * @return iMes
     */
    public int getMes(){
        return iMes;
    }
    /**
     * getAno
     * Metodo de acceso para accesar al valor del anio en la fecha
     * @return iAno
     */
    public int getAno(){
        return iAno;
    }
    

}