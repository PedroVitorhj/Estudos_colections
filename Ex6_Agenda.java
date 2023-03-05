/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex6_colection;

import java.util.Iterator;
import java.util.TreeSet;



/**
 *
 * @author pv_he
 */
public class Agenda {
    
    TreeSet <Contato> contato ;


    public Agenda() {
        
        contato = new TreeSet<Contato>();

    }

    public void inserir(Contato contato) {

        this.contato.add(contato);

    }

    public Contato buscar(String nome) {

        for(Contato ele: contato){
            
            if(ele.getNome().equals(nome)){
            
            return ele;
            
            }            
        } 
        return null;

    }

    public void remover(String nome) {

        Contato con = this.buscar(nome);

        if (con != null) {

            this.contato.remove(con);

        }

    }

    public void remover(Contato contato) {

        this.contato.remove(contato);

    }

    public void listaContatos() {

        int iterator = 0;
        for (Contato field : this.contato) {
            System.out.println("Nome Pessoa " + iterator + 1 + ": " + field.getNome());
            System.out.println("Telefone Pessoa " + iterator + 1 + ": " + field.getTelefone());
            iterator++;
        }
    }

    public int tamanho(){

        return this.contato.size();

    }
    
    @Override
    public String toString(){
        
        return contato.toString();
        
    }
    
}
