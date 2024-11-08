import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Main {
    private JFrame frame;
    private JTextField textUsuario;
    private JTextField textContrasena;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Main window = new Main();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Main() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel lblUsuario = new JLabel("Usuario");
        lblUsuario.setBounds(26, 28, 46, 14);
        frame.getContentPane().add(lblUsuario);

        JLabel lblContrasena = new JLabel("Contraseña");
        lblContrasena.setBounds(26, 53, 71, 14);
        frame.getContentPane().add(lblContrasena);

        textUsuario = new JTextField();
        textUsuario.setForeground(new Color(255, 128, 192));
        textUsuario.setBounds(112, 25, 86, 20);
        frame.getContentPane().add(textUsuario);
        textUsuario.setColumns(10);

        textContrasena = new JTextField();
        textContrasena.setForeground(new Color(0, 0, 0));
        textContrasena.setColumns(10);
        textContrasena.setBounds(112, 50, 86, 20);
        frame.getContentPane().add(textContrasena);

        JLabel lblIntroducir = new JLabel("Introduzca usuario y contraseña");
        lblIntroducir.setForeground(new Color(0, 0, 0));
        lblIntroducir.setBounds(26, 91, 204, 14);
        frame.getContentPane().add(lblIntroducir);

        JButton btnAceptar = new JButton("Aceptar");
        btnAceptar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lblIntroducir.setText("Aceptar pulsado");

                String usuario = textUsuario.getText();
                String clave = textContrasena.getText();

                boolean valido = usuario.equals("administrador") && clave.equals("miclave1234");

                if (valido) {
                    lblIntroducir.setText("¡ Bienvenido ! " + usuario);
                    lblIntroducir.setForeground(Color.red);
                } else {
                    lblIntroducir.setText("Usuario Incorrecto");
                }
            }
        });
        btnAceptar.setBounds(179, 152, 89, 23);
        frame.getContentPane().add(btnAceptar);

        JButton btnReset = new JButton("Reset");
        btnReset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textContrasena.setText(null);
                textUsuario.setText(null);
            }
        });
        btnReset.setBounds(179, 193, 89, 23);
        frame.getContentPane().add(btnReset);

        JButton btnRellenarButton = new JButton("Rellenar");
        btnReset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textContrasena.setText(administrador);
                textUsuario.setText(miclave1234);
            }
        });
        btnRellenarButton.setBounds(250, 193, 89, 23);
        frame.getContentPane().add(btnRellenarButton);
    }
}