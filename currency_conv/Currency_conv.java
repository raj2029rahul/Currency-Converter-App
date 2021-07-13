/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package currency_conv;

/**
 *
 * @author rahul
 */
public class Currency_conv {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Currency_converter().setVisible(true);
            }
        }); // TODO code application logic here
    }
    
}
