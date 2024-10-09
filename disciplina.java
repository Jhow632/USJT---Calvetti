public class disciplina {
   private String nome;
   private String professor;
   private int semestre;
   private boolean ofertada;
   //Método contrutor
   public disciplina(String n, String p,  int s, boolean o) {
   nome = n;
   professor = p;
   semestre = s;
   ofertada = true;
   }
   public disciplina(String nome, String professor, int semestre) {
}
//Métodos de acesso
   public String getNome(){
   return nome;
   }
   public String getProfessor() {
   return professor;
   }
   public int getSemestre() {
   return semestre; 
   }
   public boolean getOfertada() {
   return ofertada; 
   }
   //Métodos modificadores
   public void setNome(String n) {
   nome = n; 
   }
   public void setProfessor(String p) {
   professor = p; 
   }
   public void setSemestre(int s) {
   semestre = s; 
   }
   public void setOfertada(boolean t) {
   ofertada = t; 
   }
}
