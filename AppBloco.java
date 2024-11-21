import javax.swing.JOptionPane;

public class AppBloco {
    public static void main(String[] args) {
        BlocoDeNotas bloco = new BlocoDeNotas();
        String menu = """
            Escolha uma opção:
            1 - Inserir uma nota
            2 - Remover uma nota
            3 - Alterar uma nota
            4 - Listar todas as notas
            5 - Sair
            """;

        while (true) {
            try {
                String opcao = JOptionPane.showInputDialog(menu);
                if (opcao == null || opcao.equals("5")) {
                    JOptionPane.showMessageDialog(null, "Saindo do sistema.");
                    break;
                }

                switch (opcao) {
                    case "1":
                        String nota = JOptionPane.showInputDialog("Digite a nova nota:");
                        if (nota != null && !nota.trim().isEmpty()) {
                            bloco.adicionarNota(nota);
                            JOptionPane.showMessageDialog(null, "Nota adicionada com sucesso!");
                        } else {
                            JOptionPane.showMessageDialog(null, "Nota inválida.");
                        }
                        break;

                    case "2":
                        String indiceRemover = JOptionPane.showInputDialog("Digite o índice da nota a remover:");
                        if (indiceRemover != null) {
                            int indice = Integer.parseInt(indiceRemover);
                            if (bloco.removerNota(indice)) {
                                JOptionPane.showMessageDialog(null, "Nota removida com sucesso!");
                            } else {
                                JOptionPane.showMessageDialog(null, "Índice inválido.");
                            }
                        }
                        break;

                    case "3":
                        String indiceAlterar = JOptionPane.showInputDialog("Digite o índice da nota a alterar:");
                        if (indiceAlterar != null) {
                            int indice = Integer.parseInt(indiceAlterar);
                            String novaNota = JOptionPane.showInputDialog("Digite a nova nota:");
                            if (novaNota != null && bloco.alterarNota(indice, novaNota)) {
                                JOptionPane.showMessageDialog(null, "Nota alterada com sucesso!");
                            } else {
                                JOptionPane.showMessageDialog(null, "Alteração inválida.");
                            }
                        }
                        break;

                    case "4":
                        JOptionPane.showMessageDialog(null, bloco.listarNotas());
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Opção inválida.");
                        break;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, insira um número válido");
            }
        }
    }
}
