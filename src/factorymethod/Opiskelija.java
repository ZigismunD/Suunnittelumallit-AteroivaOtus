/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod;

/**
 *
 * @author zigis
 */
public class Opiskelija extends AterioivaOtus {

    @Override
    public Juoma createJuoma() {
        return new Maito();
    }
    
}
