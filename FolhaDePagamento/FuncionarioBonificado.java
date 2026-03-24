package FolhaDePagamento;

public class FuncionarioBonificado extends FuncionarioComissionado{
    private double bonus;
    
    public FuncionarioBonificado(String nome, double salarioBase, double vendasMensais, double percentualComissao, double bonus) {
        super(nome, salarioBase, vendasMensais, percentualComissao);
        this.bonus = bonus;
    }

    FuncionarioBonificado() {

    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
