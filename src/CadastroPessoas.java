import java.util.ArrayList;

public class CadastroPessoas {

    private ArrayList<String> pessoas = new ArrayList<String>();

    public void adicionar(String nome) {
        pessoas.add(nome);
        System.out.println(nome + " adicionado(a) com sucesso!");
    }

    public void listarTodos() {
        System.out.println("Lista de Pessoas Cadastradas:");
        System.out.println(String.join(", ", pessoas));
    }

    public void excluir(String nome) {
        pessoas.remove(nome);
        System.out.println(nome + " excluído(a) com sucesso!");
    }

    public static void main(String[] args) {
        CadastroPessoas cadastro = new CadastroPessoas();
        
        cadastro.adicionar("Beatriz");
        cadastro.adicionar("Carlos");

        cadastro.listarTodos();

        cadastro.excluir("Beatriz");

        cadastro.listarTodos();
    }
}
