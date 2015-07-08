/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mdulces;

/**
 *
 * @author yesica
 */
public class MDulces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        maquinaDulce md = new maquinaDulce ();
        md.cambioEstado();
        
        md.setEstado(new GiroInicial());
        md.cambioEstado();
        
        md.setEstado(new MonedaIn());
        md.cambioEstado();
        
        md.setEstado(new Dulces());
        md.cambioEstado();
        
        md.setEstado(new NoMoneda());
        md.cambioEstado();
        
        md.setEstado(new GeneraDulces());
        md.cambioEstado();
    }
    
}
