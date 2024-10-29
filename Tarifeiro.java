public class Tarifeiro extends Empregado {
        
    public Tarifeiro(String string, String string2, String string3, double d) {
        super();
    }

    public Tarifeiro(String nome, String sobrenome, double d, double salario) {
        super(nome, sobrenome, d, salario);
    }

    public String dados() {
        return super.dados() + "Tipo: Tarifeiro";
    }
}


