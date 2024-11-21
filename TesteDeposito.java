import javax.swing.*;
import java.util.ArrayList;

public class TesteDeposito {
    public static void main(String[] args) {
        Deposito deposito = new Deposito();
        String menu = """
            Escolha uma opção:
            1 - Adicionar caixa
            2 - Remover caixa por dono
            3 - Procurar posição de uma caixa pelo dono
            4 - Alterar corredor e posição de uma caixa
            5 - Listar caixas com peso maior que 10.0
            6 - Sair
            """;

        while (true) {
            try {
                String opcao = JOptionPane.showInputDialog(menu);
                if (opcao == null || opcao.equals("6")) {
                    JOptionPane.showMessageDialog(null, "Sistema encerrado.");
                    break;
                }

                switch (opcao) {
                    case "1": // Adicionar caixa
                        String corredor = JOptionPane.showInputDialog("Digite o corredor da caixa:");
                        String posicaoStr = JOptionPane.showInputDialog("Digite a posição da caixa:");
                        String pesoStr = JOptionPane.showInputDialog("Digite o peso da caixa:");
                        String dono = JOptionPane.showInputDialog("Digite o nome do dono da caixa:");

                        if (corredor != null && posicaoStr != null && pesoStr != null && dono != null) {
                            int posicao = Integer.parseInt(posicaoStr);
                            double peso = Double.parseDouble(pesoStr);
                            deposito.adicionarCaixa(new Caixa(corredor, posicao, peso, dono));
                            JOptionPane.showMessageDialog(null, "Caixa adicionada com sucesso!");
                        } else {
                            JOptionPane.showMessageDialog(null, "Todos os campos são obrigatórios.");
                        }
                        break;

                    case "2": // Remover caixa por dono
                        String donoRemover = JOptionPane.showInputDialog("Digite o nome do dono da caixa a remover:");
                        if (deposito.removerCaixaPorDono(donoRemover)) {
                            JOptionPane.showMessageDialog(null, "Caixa(s) do dono " + donoRemover + " removida(s) com sucesso.");
                        } else {
                            JOptionPane.showMessageDialog(null, "Nenhuma caixa encontrada para o dono informado.");
                        }
                        break;

                    case "3": // Procurar posição de uma caixa pelo dono
                        String donoBuscar = JOptionPane.showInputDialog("Digite o nome do dono da caixa:");
                        int posicao = deposito.encontrarCaixaPorDono(donoBuscar);
                        if (posicao != -1) {
                            JOptionPane.showMessageDialog(null, "Caixa do dono " + donoBuscar + " está na posição " + posicao + ".");
                        } else {
                            JOptionPane.showMessageDialog(null, "Nenhuma caixa encontrada para o dono informado.");
                        }
                        break;

                    case "4": // Alterar corredor e posição de uma caixa
                        String donoAlterar = JOptionPane.showInputDialog("Digite o nome do dono da caixa:");
                        String novoCorredor = JOptionPane.showInputDialog("Digite o novo corredor:");
                        String novaPosicaoStr = JOptionPane.showInputDialog("Digite a nova posição:");

                        if (novaPosicaoStr != null) {
                            int novaPosicao = Integer.parseInt(novaPosicaoStr);
                            if (deposito.mudarLocalizacaoCaixa(donoAlterar, novoCorredor, novaPosicao)) {
                                JOptionPane.showMessageDialog(null, "Localização da caixa alterada com sucesso!");
                            } else {
                                JOptionPane.showMessageDialog(null, "Nenhuma caixa encontrada para o dono informado.");
                            }
                        }
                        break;

                    case "5": // Listar caixas com peso maior que 10.0
                        ArrayList<Caixa> caixasPesadas = deposito.caixasComPesoMaiorQue(10.0);
                        if (caixasPesadas.isEmpty()) {
                            JOptionPane.showMessageDialog(null, "Nenhuma caixa com peso maior que 10.0.");
                        } else {
                            StringBuilder resultado = new StringBuilder("Caixas com peso maior que 10.0:\n");
                            for (Caixa caixa : caixasPesadas) {
                                resultado.append(caixa).append("\n");
                            }
                            JOptionPane.showMessageDialog(null, resultado.toString());
                        }
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.");
                        break;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, insira valores numéricos onde solicitado.");
            }
        }
    }
}
