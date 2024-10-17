public class Atribuicao {
    //Atributos 
    private Professor professor;
    private Disciplina disciplina;
    //Construtor
    public Atribuicao(Professor professor, Disciplina disciplina) {
        this.professor = professor;
        this.disciplina = disciplina;
    }
    //Método de acesso 
    public Professor getProfessor() {
        return professor;
    }
    public Disciplina getDisciplina() {
        return disciplina;
    }
    //Método modificador
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
    // Método para exibir os dados no JOptionPane
    public String getDados() {
        return "Professor: " + professor.getDados() + "\nDisciplina: " + disciplina.getDados();
    }
}


