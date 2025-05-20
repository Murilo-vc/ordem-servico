package org.example.murilo.ordemservico.gui;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class LoginWindow extends JFrame {

    private static final long serialVersionUID = 1L;

    private JPanel contentPane;
    private JTextField txtUsername;
    private JPasswordField txtSenha;

    public static void main(String[] args) {
        new LoginWindow().setVisible(true);
    }

    public LoginWindow() {
        initComponents();
    }

    public void validarLogin() {

    }

    public void abrirJanelaCadastro() {

    }

    private void initComponents() {
        setResizable(false);
        setTitle("Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 500, 500);
        setLocationRelativeTo(null);

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblLoginText = new JLabel("LOGIN");
        lblLoginText.setHorizontalAlignment(SwingConstants.CENTER);
        lblLoginText.setFont(new Font("Tahoma", Font.BOLD, 24));
        lblLoginText.setBounds(185, 50, 92, 46);
        contentPane.add(lblLoginText);

        JLabel lblUsername = new JLabel("Nome de Usuario");
        lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblUsername.setBounds(104, 143, 110, 14);
        contentPane.add(lblUsername);

        txtUsername = new JTextField();
        txtUsername.setBounds(104, 168, 265, 31);
        contentPane.add(txtUsername);
        txtUsername.setColumns(10);

        JLabel lblSenha = new JLabel("Senha");
        lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblSenha.setBounds(104, 210, 110, 14);
        contentPane.add(lblSenha);

        txtSenha = new JPasswordField();
        txtSenha.setBounds(104, 235, 265, 31);
        contentPane.add(txtSenha);

        JButton btnLogin = new JButton("Entrar");
        btnLogin.addActionListener(e -> validarLogin());
        btnLogin.setBackground(Color.LIGHT_GRAY);
        btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 16));
        btnLogin.setBounds(277, 277, 92, 31);
        contentPane.add(btnLogin);

        JLabel lblCadastro = new JLabel("Não possue uma conta?");
        lblCadastro.setFont(new Font("Tahoma", Font.PLAIN, 13));
        lblCadastro.setBounds(104, 432, 156, 14);
        contentPane.add(lblCadastro);

        JButton btnCadastro = new JButton("Cadastre-se");
        btnCadastro.addActionListener(e -> abrirJanelaCadastro());
        btnCadastro.setForeground(Color.RED);
        btnCadastro.setBackground(Color.WHITE);
        btnCadastro.setFont(new Font("Tahoma", Font.PLAIN, 13));
        btnCadastro.setBounds(248, 426, 110, 26);
        contentPane.add(btnCadastro);
    }
}
