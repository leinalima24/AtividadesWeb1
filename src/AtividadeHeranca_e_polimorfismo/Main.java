package AtividadeHeranca_e_polimorfismo;

public class Main{

    public static void main(String[] args) {

        Fornecedor f = new Fornecedor("João", "Rua A", "1111", 1000, 300);
        System.out.println("Saldo: " + f.obterSaldo());

    }
}