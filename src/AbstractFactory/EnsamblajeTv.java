/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

/**
 *
 * @author elomj
 */
public class EnsamblajeTv {
    
    public EnsamblajeTv(TvAbstractFactory factory) {
        
        Color color = factory.CrearColor();
        
        Tv tv = factory.CrearTv();
        
        color.colorear(tv);
        
    }
    
}
