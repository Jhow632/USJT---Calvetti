import javax.swing.JOptionPane;
public class testeTurma {
   public static void main(String[] jho) {
      //Dados Turma
      String nome = JOptionPane.showInputDialog("Nome");
      String curso = JOptionPane.showInputDialog("Curso");
      int quantidadeDeAluno = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de Alunos"));
      int serie = Integer.parseInt(JOptionPane.showInputDialog("Serie"));
      // cria um objeto turma
      turma turma = new turma(nome, curso, quantidadeDeAluno, serie);
      String msg = "Nome: " + turma.getNome() + "\nCurso: "
       + turma.getCurso() + "\nQuantidade de Alunos: " + turma.getQuantidadeDeAluno() + "\nSerie:" + turma.getSerie();
      //Mostrando Turma
      JOptionPane.showMessageDialog(null, msg);
      //Altrerando informações
      quantidadeDeAluno = Integer.parseInt(JOptionPane.showInputDialog("Quantidade De Aluno"));
      serie = Integer.parseInt(JOptionPane.showInputDialog("Serie"));
      //Muda usando os métodos modificadores
      turma.setQuantidadeDeAluno(quantidadeDeAluno);
      turma.setSerie(serie);
      //Montando string de saida chamando os metodos de acesso da Turma
      msg = "Nome: " + turma.getNome() + "\nCurso: "
      + turma.getCurso() + "\nQuantidade de Alunos: " + turma.getQuantidadeDeAluno() + "\nSerie:" + turma.getSerie();
      //Apresentando resultado
      JOptionPane.showMessageDialog(null, msg);
   }
}

