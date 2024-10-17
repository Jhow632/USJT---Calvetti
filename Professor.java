public class Professor {
   //Atributos 
   private String nome;
   private int idade;
   //Construtor
   public Professor(String nome, int idade) {
      this.nome = nome;
      this.idade = idade;
   }
    //Método de acesso 
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    //Método modificador
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    //Método getDados
    public String getDados() {
        return "Professor= Nome: " + nome + ", Idade: " + idade;
    }
    public String getProfessor() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getProfessor'");
    }
}