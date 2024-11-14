import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora extends JFrame 
{
    private JTextField display;  
    private StringBuilder input;  
    private int resultado;  
    private String operador;  

    public Calculadora() 
    {
        setTitle("Calculadora");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        input = new StringBuilder();
        operador = "";

        // Mostrador da tela
        display = new JTextField();
        display.setFont(new Font("Arial", Font.PLAIN, 30));
        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.RIGHT);
        add(display, BorderLayout.NORTH);

        // Painel de botões
        JPanel painel = new JPanel();
        painel.setLayout(new GridLayout(5, 4));

        // Botões de 0 a 9
        String[] botoes = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", "C", "=", "+"
        };

        for (String texto : botoes) {
            JButton botao = new JButton(texto);
            botao.setFont(new Font("Arial", Font.PLAIN, 30));
            botao.addActionListener(new BotaoClickListener());
            painel.add(botao);
        }

        add(painel, BorderLayout.CENTER);
    }

    // Classe para tratar os cliques nos botões
    private class BotaoClickListener implements ActionListener 
    {
        @Override
        public void actionPerformed(ActionEvent e) 
        {
            String comando = e.getActionCommand();

            if (comando.equals("C")) {
                // Limpa a entrada
                input.setLength(0);
                display.setText("");
                resultado = 0;
                operador = "";
            } else if (comando.equals("=")) {
                // Realiza a operação
                if (operador.isEmpty()) {
                    return;
                }
                calcularResultado();
                display.setText(String.valueOf(resultado));
                input.setLength(0);
            } else if (comando.equals("+") || comando.equals("-") || comando.equals("*") || comando.equals("/")) {
                // Define o operador
                if (input.length() > 0) {
                    calcularResultado();
                    operador = comando;
                    input.setLength(0);
                }
            } else {
                // Adiciona os números ou operadores ao mostrador
                input.append(comando);
                display.setText(input.toString());
            }
        }

        private void calcularResultado() 
        {
            try {
                int numeroAtual = Integer.parseInt(input.toString());

                switch (operador) {
                    case "+":
                        resultado += numeroAtual;
                        break;
                    case "-":
                        resultado -= numeroAtual;
                        break;
                    case "*":
                        resultado *= numeroAtual;
                        break;
                    case "/":
                        if (numeroAtual != 0) {
                            resultado /= numeroAtual;
                        } else {
                            display.setText("Erro");
                            input.setLength(0);
                            return;
                        }
                        break;
                    default:
                        resultado = numeroAtual;
                }
            } catch (NumberFormatException ex) {
                display.setText("Erro");
                input.setLength(0);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Calculadora().setVisible(true);
        });
    }
}
