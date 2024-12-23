import javax.swing.JOptionPane;

public class TestePessoa {

    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog("Nome");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade"));
        String Endereco = JOptionPane.showInputDialog("Endereco");
        String telefone = JOptionPane.showInputDialog("Telefone");

        Pessoa pessoa = new Pessoa(nome, idade, Endereco, telefone);

        if (!pessoa.isMaiorDeIdade()){
            JOptionPane.showMessageDialog(null, "Você menor de idade");
        }

        if (!pessoa.temTelefone()){
            JOptionPane.showMessageDialog(null, "Seu numero de telefone é invalido");
        }

        JOptionPane.showMessageDialog(null, "Nome: "+pessoa.getNome()+"\n idade: "+pessoa.getIdade()+"\n endereço: "+pessoa.getEndereco()+"\n telefone: "+pessoa.getTelefone() );
    }
}
