/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appexerciciotreze;

import java.util.Scanner;

/**
 *
 * @author HOME
 */
public class AppExercicioTreze {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    double salario,total,aumento;
               
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Digite o salario do funcionario: "); 
        salario = sc.nextDouble();
        aumento = salario + (salario * 0.25);
        
        System.out.println("O novo salario e de: "+aumento);
    
    
    
    
    
    
    
    }
    
}
