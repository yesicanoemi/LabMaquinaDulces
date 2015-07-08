/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mdulces;

/**
 *
 * @author EST1659109
 */
public class maquinaDulce {
    
    private Estado estadoMaq;
    
    public maquinaDulce(){
        this.estadoMaq= new EstadoInicial();
             
                }
    public void setEstado(Estado estadoMaq){
        this.estadoMaq = estadoMaq;
    }
       public void cambioEstado(){
        this.estadoMaq.cambioEstado();
    }
    }
   

