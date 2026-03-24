package FolhaDePagamento;

public class FuncionarioHonorista extends Funcionario {
    private int horasTrabalhadas;
    private double valorPorHora;

    public FuncionarioHonorista(String nome, double salarioBase, int horasTrabalhadas, double valorPorHora) {
        super(nome, salarioBase);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorPorHora = valorPorHora;
    }

    FuncionarioHonorista() {

    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + (horasTrabalhadas * valorPorHora);    
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }
}
