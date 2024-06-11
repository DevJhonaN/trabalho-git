import java.util.ArrayList;

public class CadastroPessoas {

    private ArrayList<String> pessoas = new ArrayList<String>();

    public void adicionar(String nome) {
        pessoas.add(nome);
        System.out.println(nome + " adicionado(a) com sucesso!");
    }

    public static void main(String[] args) {
        CadastroPessoas cadastro = new CadastroPessoas();

        cadastro.adicionar("Beatriz");
        cadastro.adicionar("Carlos");

    }
}
