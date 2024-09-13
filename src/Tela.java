import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Tela {
    boolean ligado = false;
    public boolean getLigado() {
        return ligado;
    }
    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    JTextField texto;


    public Tela() {
    JFrame tela = new JFrame("Carro");
    tela.setSize(400, 400);
    tela.setResizable(false);
    tela.setLocationRelativeTo(null);
    tela.setDefaultCloseOperation(tela.EXIT_ON_CLOSE);
    
    tela.setLayout(null);
    JButton botao1 = new JButton("Acelerar");
    botao1.setBounds(10, 10, 150, 50);
    botao1.setBackground(new Color(54, 90, 63));
    botao1.setForeground(new Color(255, 255, 255));

    JButton botao2 = new JButton("Frear");
    botao2.setBounds(10, 80, 150, 50);
    botao2.setBackground(new Color(243, 12, 12));
    botao2.setForeground(new Color(255, 255, 255));

    JCheckBox checkbox = new JCheckBox("LIGAR MOTOR!");
    checkbox.setBounds(10, 160, 150, 50);

    texto = new JTextField(" ");
    texto.setBounds(10, 250, 350, 50);
    texto.setFont(new Font("ARIAL", Font.BOLD, 25));

    tela.add(texto);
    tela.add(botao2);
    tela.add(botao1);
    tela.add(checkbox);

      
    checkbox.addActionListener(this::ligar);
    botao1.addActionListener(this::acelerar);
    botao2.addActionListener(this::frear);
    tela.setVisible(true);
    }

    
    
    private void acelerar(ActionEvent e) {
        if (this.getLigado() == true){
            texto.setText("ACELERANDO VRUM, VRUM");
        }
        else {
            texto.setText("CARRO DESLIGADO.");
        }
    
    }

    private void frear(ActionEvent e) {
        if (this.getLigado() == true){
            texto.setText("FREANDO!");
        }
        else {
            texto.setText("CARRO DESLIGADO.");
        }
    
    }

    private void ligar(ActionEvent e) {
        if (this.getLigado() == false){
            this.setLigado(true);
        }
        else {
            this.setLigado(false);
        }
        System.out.println("MOTOR =  " + this.getLigado());
    }



  
}
