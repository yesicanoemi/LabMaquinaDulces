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
public class GeneraDulces implements Estado{

    @Override
    public void cambioEstado() {
        System.out.println("Si hay moneda giro, da Dulces estado 4");
    }
    
}
