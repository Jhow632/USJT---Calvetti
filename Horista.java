public class Horista extends Empregado {
        
    public Horista() {
        super();
    }

    public Horista(String nome, String sobrenome, String cpf, double salario) {
        super(nome, sobrenome, cpf, salario);
    }

    public String dados() {
        return super.dados() + "Tipo: Horista";
    }
}


