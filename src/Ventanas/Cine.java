/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;
// cuando el usuario seleccione la pelicula, en la tabla, le deberia aparecer la cartelera con varias ventanas para comprar las boletas
import java.io.IOException;

/**
 *
 * @author usuario
 */
public class Cine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Sala1 s= new Sala1();
        s.setVisible(true);
        s.setBounds(12, 12, 700, 400);
        
        
    }
    
}
