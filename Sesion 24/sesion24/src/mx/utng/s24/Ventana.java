package mx.utng.s24;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame {
    private JTextField txtUsuario;
    private JPasswordField txtClave;

    public Ventana(){
        //Invocando al constructor de la clase padre o superclase
        super("Autenticacion de usuario");
        //Dimesiones de la ventana 
        setSize(300, 200);
        //Cuando de click en el boton x se cierre
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        JLabel lblUsuario = new JLabel("Usuario:");
        JLabel lblClave = new JLabel("Clave:");

        txtUsuario = new JTextField(15);
        txtClave = new JPasswordField(15);

        JButton btnLogin = new JButton("Login");
        btnLogin.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String usuario = txtUsuario.getText();
                    char [] charsClave = txtClave.getPassword();
                    String clave = new String(charsClave);

                    if (validarLogin(usuario, clave)) {
                        JOptionPane.showMessageDialog(Ventana.this, "Login Correcto");
                    }else{
                        JOptionPane.showMessageDialog(Ventana.this, "Usuario o Clave Incorrecto");
                    }
                };
                
            }
        );
        //Usuari
        gbc.gridx=0;
        gbc.gridy=0;
        panel.add(lblUsuario, gbc);
        
        gbc.gridx=1;
        gbc.gridy=0;
        panel.add(txtUsuario, gbc);

        //Clave
        gbc.gridx=0;
        gbc.gridy=1;
        panel.add(lblClave, gbc);

        gbc.gridx=1;
        gbc.gridy=1;
        panel.add(txtClave, gbc);

        //Boton
        gbc.gridx=0;
        gbc.gridy=2;
        panel.add(btnLogin, gbc);

        this.add(panel);

        //Venta Centrada
        setLocationRelativeTo(null);


        setVisible(true);

    }

    public static void main(String[] args) {
        new Ventana();
    }

    private boolean validarLogin(String usuario, String clave){
        return usuario.equals("utng") && clave.equals("1234");
}
}