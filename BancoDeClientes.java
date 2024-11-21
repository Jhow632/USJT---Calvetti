import java.util.ArrayList;

public class BancoDeClientes {
    private ArrayList<Cliente> clientes;

    public BancoDeClientes() {
        this.clientes = new ArrayList<>();
    }

    public void inserirCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public boolean removerCliente(int id) {
        return clientes.removeIf(cliente -> cliente.getId() == id);
    }

    public Cliente buscarCliente(int id) {
        for (Cliente cliente : clientes) {
            if (cliente.getId() == id) {
                return cliente;
            }
        }
        return null;
    }

    public boolean alterarCliente(int id, String novoNome, String novoFone) {
        Cliente cliente = buscarCliente(id);
        if (cliente != null) {
            cliente.setNome(novoNome);
            cliente.setFone(novoFone);
            return true;
        }
        return false;
    }

    public ArrayList<Cliente> listarTodosClientes() {
        return clientes;
    }
}
