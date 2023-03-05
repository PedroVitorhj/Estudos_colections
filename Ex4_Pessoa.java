/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex4_colection;

/**
 *
 * @author pv_he
 */
public class Pessoa {
    
    private String nome;
    private int idade;
    private String telefone;
    
    public Pessoa(String nome, int idade, String telefone){
        
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
        
    }
    
    public String getNome(){
        
        return this.nome;
        
    }
    
    public int getIdade(){
        
        return this.idade;
        
    }
    
    public String getTelefone(){
        
        return this.telefone;
        
    }
    
}
