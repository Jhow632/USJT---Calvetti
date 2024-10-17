public class Disciplina {
   //Atributos
   private String nome;
   private boolean pratica;
   //Construtor
   public Disciplina(String nome, boolean pratica) {
    this.nome = nome;
    this.pratica = pratica;
   }
   public Disciplina(String nome2, String professor, int semestre) {
    
}
//Método de acesso
   public String getNome() {
    return nome;
   }
   public boolean getPratica() {
    return pratica;
   }
   //Método modificador
   public void setNome(String nome) {
    this.nome = nome;
   }
   public void setPratica(boolean pratica) {
    this.pratica = pratica;
   }
   //Método getDados
   public String getDados() {
    return "Disciplina= Nome: " + nome + "Pratica: " + pratica;
   }
public String getDisciplina() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getDisciplina'");
}
public String getProfessor() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getProfessor'");
}
public String getSemestre() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getSemestre'");
}
public boolean getOfertada() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getOfertada'");
}
public void setProfessor(String professor) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'setProfessor'");
}
public void setSemestre(int semestre) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'setSemestre'");
}
}
   


     
