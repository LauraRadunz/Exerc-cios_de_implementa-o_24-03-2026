package Biblioteca;
public class Estudante extends Pessoa {
    private int nummatricula;
    private String curso;
    private int anoIngresso;

    Estudante(int nummatricula, String curso, int anoIngresso, String nome, String dataNasc) {
        super(nome, dataNasc);
        this.nummatricula = nummatricula;
        this.curso = curso;
        this.anoIngresso = anoIngresso;
    }
    
    Estudante() {

    }

    public int getNummatricula() {
        return nummatricula;
    }

    public void setNummatricula(int nummatricula) {
        this.nummatricula = nummatricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getAnoIngresso() {
        return anoIngresso;
    }

    public void setAnoIngresso(int anoIngresso) {
        this.anoIngresso = anoIngresso;
    }

    
}
