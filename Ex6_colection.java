/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex6_colection;

/**
 *
 * @author pv_he
 */
public class Ex6_colection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Agenda ag = new Agenda();
        Contato cont = new Contato("Pedro",1235678);

        ag.inserir(cont);
        Contato busca = ag.buscar("Pedro");
        System.out.println(busca.getNome());
        ag.remover("Pedro");

        Contato cont2 = new Contato("Renan",32165478);
        ag.inserir(cont2);
        ag.remover(cont2);

        Contato cont3 = new Contato("Everton",74125896);
        ag.inserir(cont3);
        Contato cont4 = new Contato("Predo",58963214);
        ag.inserir(cont4);
        Contato cont5 = new Contato("Certon",452145214);
        ag.inserir(cont5);
        ag.listaContatos();
        int tam = ag.tamanho();
        System.out.println(tam);
    }
    
}
