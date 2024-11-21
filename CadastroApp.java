import javax.swing.*;
import java.util.ArrayList;

public class CadastroApp {
    public static void main(String[] args) {
        BancoDeClientes banco = new BancoDeClientes();
        String menu = """
            Escolha uma opção:
            1 - Inserir cliente
            2 - Remover cliente
            3 - Alterar cliente
            4 - Listar dados de um cliente
            5 - Listar todos os clientes
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
                    case "1": // Inserir cliente
                        String idStr = JOptionPane.showInputDialog("Digite o ID do cliente:");
                        String nome = JOptionPane.showInputDialog("Digite o nome do cliente:");
                        String telefone = JOptionPane.showInputDialog("Digite o telefone do cliente:");

                        if (idStr != null && nome != null && telefone != null) {
                            int id = Integer.parseInt(idStr);
                            banco.inserirCliente(new Cliente(id, nome, telefone));
                            JOptionPane.showMessageDialog(null, "Cliente inserido com sucesso!");
                        } else {
                            JOptionPane.showMessageDialog(null, "Todos os campos são obrigatórios.");
                        }
                        break;

                    case "2": // Remover cliente
                        String idRemoverStr = JOptionPane.showInputDialog("Digite o ID do cliente a remover:");
                        if (idRemoverStr != null) {
                            int idRemover = Integer.parseInt(idRemoverStr);
                            if (banco.removerCliente(idRemover)) {
                                JOptionPane.showMessageDialog(null, "Cliente removido com sucesso!");
                            } else {
                                JOptionPane.showMessageDialog(null, "Cliente não encontrado.");
                            }
                        }
                        break;

                    case "3": // Alterar cliente
                        String idAlterarStr = JOptionPane.showInputDialog("Digite o ID do cliente a alterar:");
                        if (idAlterarStr != null) {
                            int idAlterar = Integer.parseInt(idAlterarStr);
                            String novoNome = JOptionPane.showInputDialog("Digite o novo nome do cliente:");
                            String novoFone = JOptionPane.showInputDialog("Digite o novo telefone do cliente:");
                            if (banco.alterarCliente(idAlterar, novoNome, novoFone)) {
                                JOptionPane.showMessageDialog(null, "Cliente alterado com sucesso!");
                            } else {
                                JOptionPane.showMessageDialog(null, "Cliente não encontrado.");
                            }
                        }
                        break;

                    case "4": // Listar dados de um cliente
                        String idBuscarStr = JOptionPane.showInputDialog("Digite o ID do cliente:");
                        if (idBuscarStr != null) {
                            int idBuscar = Integer.parseInt(idBuscarStr);
                            Cliente cliente = banco.buscarCliente(idBuscar);
                            if (cliente != null) {
                                JOptionPane.showMessageDialog(null, cliente.toString());
                            } else {
                                JOptionPane.showMessageDialog(null, "Cliente não encontrado.");
                            }
                        }
                        break;

                    case "5": // Listar todos os clientes
                        ArrayList<Cliente> todosClientes = banco.listarTodosClientes();
                        if (todosClientes.isEmpty()) {
                            JOptionPane.showMessageDialog(null, "Nenhum cliente cadastrado.");
                        } else {
                            StringBuilder resultado = new StringBuilder("Clientes cadastrados:\n");
                            for (Cliente cliente : todosClientes) {
                                resultado.append(cliente).append("\n");
                            }
                            JOptionPane.showMessageDialog(null, resultado.toString());
                        }
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.");
                        break;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida. Insira números onde solicitado.");
            }
        }
    }
}
