import javax.swing.JOptionPane;

public class Usuario {
    public static void main(String[] args) {
        CondicionadorDeAr condicionador = new CondicionadorDeAr();
        condicionador.ligar();

        condicionador.mostrarTemperatura();
        JOptionPane.showInputDialog("Digite 1 para aumentar a temperatura, 2 para diminuir a temperatura ou 3 para sair.");

        int opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para aumentar a temperatura, 2 para diminuir a temperatura ou 3 para sair."));
        while(opcao != 3){
            if(opcao == 1){
                condicionador.aumentarTemperatura();
            }
            else if(opcao == 2){
                condicionador.diminuirTemperatura();
            }
            else{
                System.out.println("Opção inválida.");
            }
            condicionador.mostrarTemperatura();
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para aumentar a temperatura, 2 para diminuir a temperatura ou 3 para sair."));
        }
    }
}