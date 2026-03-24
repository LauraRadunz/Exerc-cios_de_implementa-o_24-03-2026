package Biblioteca;

public class Biblioteca {
    private String nomeBibioteca;
    private String endereco;
    private Livro[] livros;

    public Biblioteca(String nomeBibioteca, String endereco) {
        this.nomeBibioteca = nomeBibioteca;
        this.endereco = endereco;
        this.livros = new Livro[100]; // Exemplo de capacidade para 100 livros
    }

    public Biblioteca() {

    }

    public String getNomeBibioteca() {
        return nomeBibioteca;
    }

    public void setNomeBibioteca(String nomeBibioteca) {
        this.nomeBibioteca = nomeBibioteca;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Livro[] getLivros() {
        return livros;
    }

    public void setLivros(Livro[] livros) {
        this.livros = livros;
    }
}
