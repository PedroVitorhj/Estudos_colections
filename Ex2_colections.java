/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2_colections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author pv_he
 */
public class Ex2_colections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
          int saida = 0;
        int i = 0;
        String fim = "fim";
        
        TreeSet <String> nome = new TreeSet <String> ();
        Scanner sc = new Scanner(System.in);
        
           
        while(saida == 0){
            
           System.out.println("Digite algo, caso queira sair digite 'fim':  ");     
           String c = sc.next();
           nome.add(c);
            
           if(c.equals(fim)){
                
                saida = 1;
                
            }
            i++;
                  
        }
        
        
        
        System.out.println(nome);
    }
    
}
