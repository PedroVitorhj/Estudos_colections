/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex6_colection;

/**
 *
 * @author pv_he
 */
public class Contato implements Comparable <Contato> {
    
    private String nome;
    private int telefone;

    public Contato(String nome, int telefone){

        this.nome = nome;
        this.telefone = telefone;

    }

    public String getNome(){

        return this.nome;

    }

    public int getTelefone(){

        return this.telefone;
        
    }
    
    @Override
    public String toString(){
        
        return String.format("%s:%d",nome,telefone);
    }
    
    public int compareTo(Contato outro) {
        
        return this.nome.compareTo(outro.nome);
        
    }

    
}
