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
public class Triangulo extends Forma{
    
    public Triangulo(){
       setNombre("Triangulo");
       setDato("Angulo");
       setCalculo(calculo);

    }
    private void setCalculo(double d) {
        calculo = 60+60+60;
  }

    public void Dibujar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
