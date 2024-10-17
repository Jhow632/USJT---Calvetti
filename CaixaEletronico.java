package Trabalho;

import Trabalho.Agencia;
import Trabalho.Cliente;
import Trabalho.ContaCorrente;
import javax.swing.JOptionPane;

@SuppressWarnings("unused")
public class CaixaEletronico {
    public static void main(String[] args) {
        Agencia agencia = new Agencia("Banco do Brasil", 7890, 5);
        ContaCorrente conta = new ContaCorrente(1234, 4, agencia, 150.00);
        Cliente cliente = new Cliente("Ademar Apior", "123231518-12", conta);
    
        while(true){
            int opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção desejada: \n1 - Depositar \n2 - Sacar \n3 - Ver Saldo \n4 - Consultar Dados \n5 - Sair"));
            if (opcao == 1){
                double deposito = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do deposito: "));
                conta.Depositar(deposito);
            }
            else if (opcao == 2){
                double saque = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do saque: "));
                conta.Sacar(saque);
            }
            else if (opcao == 3){
                conta.VerSaldo();
            }
            else if (opcao == 4){
                conta.ConsultarDados();
            }
            else if (opcao == 5){
                break;
            }
        }
    }
}