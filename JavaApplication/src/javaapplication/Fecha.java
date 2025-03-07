/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication;

/**
 *
 * @author User
 */
public class Fecha {
    
    private int dia;
    private int mes;
    private int año;
    
    
    public Fecha(int dia, int mes, int año){
    
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        
    }
    
    
    // DIA
    
    public void setDia(int dia){
        this.dia = dia;
    }
    
    
    public int getDia(){
       return dia;      
    }
    
    
    // MES
    
    public void setMes(int mes){
        this.mes = mes;
    }
    
    
    public int getMes(){
       return mes;      
    }
    
    
    // AÑO
    
    public void setAño(int año){
        this.año = año;
    }
    
    
    public int getAño(){
       return año;      
    }

    // OUTPUT


    public String formatoFecha(){
        return dia + "/" + mes + "/" + año;      
     }


    
  
}
