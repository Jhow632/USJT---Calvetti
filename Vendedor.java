public class Vendedor extends Empregado {
        
    public Vendedor() {
        super();
    }

    public Vendedor(String nome, String sobrenome, String cpf, double salario) {
        super(nome, sobrenome, cpf, salario);
    }

    public String dados() {
        return super.dados() + "Tipo: Vendedor";
    }
}


