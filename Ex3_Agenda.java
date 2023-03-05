import java.util.ArrayList;
import java.util.List;

public class Agenda {

    List<Contato> contato;

    public Agenda() {

        contato = new ArrayList<Contato>();

    }

    public void inserir(Contato contato) {

        this.contato.add(contato);

    }

    public Contato buscar(String nome) {

        for (int i = 0; i < contato.size(); i++) {

            if (contato.get(i).getNome().contains(nome)) {

                return contato.get(i);
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

}
