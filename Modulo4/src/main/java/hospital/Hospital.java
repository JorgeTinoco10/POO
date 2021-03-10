/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;


/**
 *
 * @author TERNURA
 */
public class Hospital {
    
    
       public static void main(String[] args) {
        // TODO code application logic here
           Honduras a= new Honduras();
           Guatemala b= new Guatemala();
           Mexico c= new Mexico();

            System.out.println(a.getHospital() + a.getDirector() );
            System.out.println(b.getHospital() + b.getDirector() );
            System.out.println(c.getHospital() + c.getDirector() );




    }
}
