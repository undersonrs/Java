/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposprimitivos;

/**
 *
 * @author AndersonRodrigues
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome = "Anderson";
        float nota = 8.5f;
        System.out.println("A nota final é : " + nota); // resultado concatenado
        System.out.printf("A nota final é : %.2f \n", nota); // contra barra + n quebra de linha
        System.out.printf("A nota final de %s é : %.4f \n", nome, nota); // concatenar string com float
        System.out.format("A nota final de %s é : %.4f \n", nome, nota);   // Saida de dados usando format
        
    }
    
}
