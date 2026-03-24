package Biblioteca;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.setNomeBibioteca("Biblioteca Central");
        biblioteca.setEndereco("Rua Principal, 123");

        Livro livro1 = new Livro();
        livro1.setTitulo("O Senhor dos Anéis");
        livro1.setEdicao("1ª Edição");
        livro1.setAno(1954);
        livro1.setEditora("Editora XYZ");
        livro1.setListaAutores(new String[]{"J.R.R. Tolkien"});
        livro1.setQtdAcervo(5);

        Livro livro2 = new Livro();
        livro2.setTitulo("Harry Potter e a Pedra Filosofal");
        livro2.setEdicao("1ª Edição");
        livro2.setAno(1997);
        livro2.setEditora("Editora ABC");
        livro2.setListaAutores(new String[]{"J.K. Rowling"});
        livro2.setQtdAcervo(3);

        Livro livro3 = new Livro();
        livro3.setTitulo("Percy Jackson e o Ladrão de Raios");
        livro3.setEdicao("1ª Edição");
        livro3.setAno(2005);
        livro3.setEditora("Editora DEF");
        livro3.setListaAutores(new String[]{"Rick Riordan"});
        livro3.setQtdAcervo(2);

        Livro livro4 = new Livro();
        livro4.setTitulo("O Código Da Vinci");
        livro4.setEdicao("1ª Edição");
        livro4.setAno(2003);
        livro4.setEditora("Editora GHI");
        livro4.setListaAutores(new String[]{"Dan Brown"});
        livro4.setQtdAcervo(4);

        Livro livro5 = new Livro();
        livro5.setTitulo("A Culpa é das Estrelas");
        livro5.setEdicao("1ª Edição");
        livro5.setAno(2012);
        livro5.setEditora("Editora JKL");
        livro5.setListaAutores(new String[]{"John Green"});
        livro5.setQtdAcervo(6);

        biblioteca.setLivros(new Livro[]{livro1, livro2, livro3, livro4, livro5});

        System.out.println("Biblioteca: " + biblioteca.getNomeBibioteca());
        System.out.println("Endereço: " + biblioteca.getEndereco());
        System.out.println("Livros na biblioteca:");
        for (Livro livro : biblioteca.getLivros()) {
            System.out.println("- " + livro.getTitulo() + " (" + livro.getAno() + ")");
        }

        Estudante estudante = new Estudante(12345, "Engenharia", 2020, "Maria Silva", "01/01/2000");
        System.out.println("\nEstudante: " + estudante.getNome());
        System.out.println("Curso: " + estudante.getCurso());

        Professor professor = new Professor("Informática", "Dr. João", "15/05/1975");
        System.out.println("\nProfessor: " + professor.getNome());
        System.out.println("Departamento: " + professor.getDepartamento());
    
        Emprestimo emprestimo = new Emprestimo(livro1, estudante, "24/03/2026", "24/04/2026");
        Emprestimo emprestimo2 = new Emprestimo(livro2, professor, "24/03/2026", "24/04/2026");
        System.out.println("\nEmpréstimo 1:");
        System.out.println("Livro: " + emprestimo.getLivro().getTitulo());
        System.out.println("Pessoa: " + emprestimo.getPessoa().getNome());
        System.out.println("Data de Empréstimo: " + emprestimo.getDataEmprestimo());
        System.out.println("Data de Devolução: " + emprestimo.getDataDevolucao());
        System.out.println("\nEmpréstimo 2:");
        System.out.println("Livro: " + emprestimo2.getLivro().getTitulo());
        System.out.println("Pessoa: " + emprestimo2.getPessoa().getNome());
        System.out.println("Data de Empréstimo: " + emprestimo2.getDataEmprestimo());
        System.out.println("Data de Devolução: " + emprestimo2.getDataDevolucao());
    }
}
