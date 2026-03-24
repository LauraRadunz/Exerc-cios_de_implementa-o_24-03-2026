package FolhaDePagamento;

public class Main {
    public static void main(String[] args) {
        FuncionarioHonorista fH = new FuncionarioHonorista("João", 2000.0, 20, 50.0);
        FuncionarioComissionado fC = new FuncionarioComissionado("Maria", 1500.0, 10000.0, 10.0);
        FuncionarioBonificado fB = new FuncionarioBonificado("Carlos", 1800.0, 8000.0, 10.0, 500.0);

        System.out.println("Salário de " + fH.getNome() + ": " + fH.calcularSalario());
        System.out.println("Salário de " + fC.getNome() + ": " + fC.calcularSalario());
        System.out.println("Salário de " + fB.getNome() + ": " + fB.calcularSalario());
    }
}
