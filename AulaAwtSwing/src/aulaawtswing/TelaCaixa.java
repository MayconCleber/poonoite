/*
 * Aulas professor Maromo.
 */
package aulaawtswing;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author maromo
 */
public class TelaCaixa extends JFrame implements WindowListener, ActionListener {
    protected Dimension dLabel, dTextField, dFrame, dTextArea, dButton;
    protected Button cmdEntrada, cmdRetirada, cmdConsulta, cmdSair;
    protected TextField txtValor, txtSaldo;
    protected Label lblValor, lblSaldo;
    
    public TelaCaixa(){
        this.setTitle("Movimentação de Caixa");
        dFrame = new Dimension(400,400);
        dLabel = new Dimension(40,20);
        dTextField = new Dimension(150,20);
        dButton = new Dimension(95,20);
        dTextArea = new Dimension(300,140);
        this.setResizable(false);
        this.setLocation(600,200);
        this.setLayout(null);
        this.setSize(dFrame);
        
        lblValor = new Label("Valor: ");
        lblValor.setSize(dLabel);
        lblValor.setLocation(25, 50);
        this.add(lblValor);
        
        txtValor = new TextField(null);
        txtValor.setSize(dTextField);
        txtValor.setLocation(75, 50);
        this.add(txtValor);
        
        cmdSair = new Button("Sair");
        cmdSair.setSize(dButton);
        cmdSair.setLocation(180, 185);
        this.add(cmdSair);
        cmdSair.addActionListener(this);
        
        addWindowListener(this);
        
    }

    @Override
    public void windowOpened(WindowEvent e) {
        
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {
        
    }

    @Override
    public void windowIconified(WindowEvent e) {
       
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
       
    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {
       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==cmdSair){
            JOptionPane.showMessageDialog(null, "Tchau");
            System.exit(0);
        }
    }
    
}
