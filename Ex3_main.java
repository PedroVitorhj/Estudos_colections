public class main {

    public static void main(String[] args) {

        Agenda ag = new Agenda();
        Contato cont = new Contato("Pedro","1235678");

        ag.inserir(cont);
        Contato busca = ag.buscar("Pedro");
        System.out.println(busca.getNome());
        ag.remover("Pedro");

        Contato cont2 = new Contato("Renan","32165478");
        ag.inserir(cont2);
        ag.remover(cont2);

        Contato cont3 = new Contato("Everton","74125896");
        ag.inserir(cont3);
        ag.listaContatos();
        int tam = ag.tamanho();
        System.out.println(tam);


    }
   


    
}
