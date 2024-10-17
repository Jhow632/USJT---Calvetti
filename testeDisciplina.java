import javax.swing.JOptionPane;
public class testeDisciplina {
   public static void main(String[] jho) {
    String nome = JOptionPane.showInputDialog("Nome: ");
    String professor = JOptionPane.showInputDialog("Professor: ");
    int semestre = Integer.parseInt(JOptionPane.showInputDialog("Semestre: "));
    //Criando objeto Disciplina
    Disciplina disciplina = new Disciplina(nome, professor, semestre);
    String msg = "Nome: " + disciplina.getNome() + "\nProfessor: "
    + disciplina.getProfessor() + "\nSemestre: " + disciplina.getSemestre();
    if(disciplina.getOfertada()) {
     msg +="\nOfertada: não";
    } else {
         msg +="\nOfertada:sim";
     }
        //Apresentando disciplina
        JOptionPane.showMessageDialog(null, msg);
        //Alterando informações
        semestre = Integer.parseInt(JOptionPane.showInputDialog("Semestre:"));
        //Usando métodos modificadores
        disciplina.setNome(nome);
        disciplina.setProfessor(professor);
        disciplina.setSemestre(semestre);
        ///Montando string de saida chamando os metodos de acesso do Produto
        msg = "Nome: " + disciplina.getNome() + "\nProfessor: "
        + disciplina.getProfessor() + "\nSemestre: " + disciplina.getSemestre();
        if(disciplina.getOfertada()) {
        msg +="\nOfertada: não";
        } else {
        msg +="\nOfertada: sim";
        }
        //Apresentando resultado
        JOptionPane.showMessageDialog(null, msg);
   }
}