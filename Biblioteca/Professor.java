package Biblioteca;
public class Professor extends Pessoa {
    private String departamento;

    Professor (String departamento, String nome, String dataNasc) {
        super(nome, dataNasc);
        this.departamento = departamento;
    }
    
    Professor() {

    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
