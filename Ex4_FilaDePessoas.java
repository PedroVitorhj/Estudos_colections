/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex4_colection;

import java.util.LinkedList;

/**
 *
 * @author pv_he
 */
public class FilaDePessoas {
    
    
    LinkedList <Pessoa> lk;
    
    public FilaDePessoas(){
        
        lk = new LinkedList();
        
    }
    
    
    public void inserir(Pessoa pessoa) {

        this.lk.add(pessoa);

    }
    
    public Pessoa retirar() {

        return this.lk.remove(0);

    }
    
    public boolean vazia(){
        
        return this.lk.isEmpty();
        
    }
    
    
    
    
        
    
    
    
    
    
}
