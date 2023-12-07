package View;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class PrincipalGUI extends JFrame {

    private JTabbedPane jTPane;

    public PrincipalGUI() {
        jTPane = new JTabbedPane();
        add(jTPane);
        // criandos as tabs
        // tab1 carros
        ClientesGUI tab1 = new ClientesGUI();
        jTPane.add("Carros", tab1);
        setBounds(100, 100, 600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // métodos para tornar a janela visível
    public void run() {
        this.setVisible(true);
    }

}