import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaRelogioSimples extends JFrame {
    private JLabel lblMostrador;
    private JButton btnTicTac, btnHora, btnMinuto;
    private Relogio relogio;

    public TelaRelogioSimples() 
    {
        // Inicializa o objeto Relogio
        relogio = new Relogio();

        // Configurações da tela principal
        setTitle("Relógio Simples");
        setSize(250, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Label para mostrar o horário
        lblMostrador = new JLabel(relogio.mostra());
        lblMostrador.setBounds(80, 10, 100, 25);
        add(lblMostrador);

        // Botão TicTac
        btnTicTac = new JButton("TicTac");
        btnTicTac.setBounds(20, 50, 80, 25);
        btnTicTac.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) {
                relogio.ticTac();
                lblMostrador.setText(relogio.mostra());
            }
        });
        add(btnTicTac);

        // Botão Hora
        btnHora = new JButton("Hora");
        btnHora.setBounds(120, 50, 80, 25);
        btnHora.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) {
                String horaStr = JOptionPane.showInputDialog("Defina a Hora (0 a 23):");
                int hora = Integer.parseInt(horaStr); // Conversão de String para int
                if (hora >= 0 && hora <= 23) {
                    relogio.setHora(hora);
                    lblMostrador.setText(relogio.mostra());
                } else {
                    JOptionPane.showMessageDialog(null, "Hora inválida!");
                }
            }
        });
        add(btnHora);

        // Botão Minuto
        btnMinuto = new JButton("Minuto");
        btnMinuto.setBounds(20, 90, 180, 25);
        btnMinuto.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) {
                String minutoStr = JOptionPane.showInputDialog("Defina o Minuto (0 a 59):");
                int minuto = Integer.parseInt(minutoStr);
                if (minuto >= 0 && minuto <= 59) {
                    relogio.acertaMinuto(minuto);
                    lblMostrador.setText(relogio.mostra());
                } else {
                    JOptionPane.showMessageDialog(null, "Minuto inválido!");
                }
            }
        });
        add(btnMinuto);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TelaRelogioSimples().setVisible(true));
    }
}
