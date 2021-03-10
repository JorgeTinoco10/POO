/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpers;

/**
 *
 * @author TERNURA
 */
public class Lineas extends Forma{
    public Lineas(){
        setNombre("Linea");
        setDato("Largo");
        setCalculo(calculo);
    }
    private void setCalculo(double d) {
        calculo = 25*4;
  }

    public void Dibujar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

}
