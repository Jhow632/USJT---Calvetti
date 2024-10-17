import javax.swing.JOptionPane;
public class TesteAtribuicao {
    public static void main(String[] jho) {
       //Criando Professor e Disciplina
       Professor professor = new Professor("Calvetti", 23);
       Disciplina disciplina = new Disciplina("Ciência da computação", false); 
       Atribuicao atribuicao = new Atribuicao(professor, disciplina);
       //Apresentando resultado 
       JOptionPane.showMessageDialog(null, atribuicao.getDados());
    }
}
