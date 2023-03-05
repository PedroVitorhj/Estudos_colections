/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex4_colection;

/**
 *
 * @author pv_he
 */
public class Ex4_colection {   
    
    
    public static void main(String[] args) {
    
        FilaDePessoas fp = new FilaDePessoas();
        
        if(fp.vazia()){
            
            System.out.println("A fila está vazia!");
            
        }
        
        Pessoa p1 = new Pessoa("Pedro",23,"12345678");
        fp.inserir(p1);
        Pessoa p2 = new Pessoa("Renan",22,"14785236");
        fp.inserir(p2);
        Pessoa p3 = new Pessoa("Everton",32,"32145698");
        fp.inserir(p3);
        
        while(!fp.vazia()){
            
            Pessoa removida = fp.retirar();
            System.out.println("Pessoa removida: " + removida.getNome());
        
        
        }
    
    }
}