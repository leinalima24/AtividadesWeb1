package Atividade_Criação_classes_metodos_basicos;

public class CartaoCredito {

    private double limite;
    private double saldoFatura;
    private String nomeCliente;

    public CartaoCredito(String nomeCliente, double limite) {
        this.nomeCliente = nomeCliente;
        this.limite = limite;
        this.saldoFatura = 0;
    }

    public void aumentaLimite(double valor) {
        limite += valor;
    }

    public void diminuiLimite(double valor) {
        limite -= valor;
    }

    public void realizaCompra(double valor) {
        if (saldoFatura + valor <= limite) {
            saldoFatura += valor;
        } else {
            System.out.println("Limite atingido!");
        }
    }

    public void imprimeFatura() {
        System.out.println("Fatura: " + saldoFatura);
    }
}
