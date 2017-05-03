package gerenciarcaixa;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;

public class TelaMovimento extends JFrame implements WindowListener, ActionListener {
    protected Dimension dFrame, dButton, dLabel, dTextField, dTextArea;
    protected Label lblValor, lblSaldo;
    protected TextField txtValor, txtSaldo;
    protected Button cmdEntrada, cmdRetirada, cmdConsulta, cmdSair;
    protected TextArea txtMsg;
    public Caixa caixa;
    
    public TelaMovimento(){
        //Inicializa uma conta Caixa
        caixa = new Caixa();
        //Modelando a janela
        dFrame = new Dimension(400,400);
        dLabel = new Dimension(40,20);
        dTextField = new Dimension(150,20);
        dTextArea = new Dimension(300,140);
        dButton = new Dimension(95,20);
        //Definindo as propriedades da janela (this)
        this.setSize(dFrame);
        this.setTitle("Controle de Caixa");
        this.setLayout(null);
        this.setResizable(false);
        //Primeiro label
        lblValor = new Label("Valor: ");
        lblValor.setSize(dLabel);
        lblValor.setLocation(25, 50);
        this.add(lblValor);
        
        lblSaldo = new Label("Saldo: ");
        lblSaldo.setSize(dLabel);
        lblSaldo.setLocation(25, 80);
        this.add(lblSaldo);
        
        //Primeiro TextField
        txtValor = new TextField(null);
        txtValor.setSize(dTextField);
        txtValor.setLocation(75, 50);
        this.add(txtValor);
        
        txtSaldo = new TextField(null);
        txtSaldo.setSize(dTextField);
        txtSaldo.setLocation(75, 80);
        this.add(txtSaldo);
        
        //Botões
        cmdEntrada = new Button("Entrada");
        cmdEntrada.setSize(dButton);
        cmdEntrada.setLocation(25, 150);
        cmdEntrada.addActionListener(this);
        this.add(cmdEntrada);
        
        cmdConsulta = new Button("Consulta");
        cmdConsulta.setSize(dButton);
        cmdConsulta.setLocation(25, 185);
        cmdConsulta.addActionListener(this);
        this.add(cmdConsulta);
        
        cmdRetirada = new Button("Retirada");
        cmdRetirada.setSize(dButton);
        cmdRetirada.setLocation(180, 150);
        cmdRetirada.addActionListener(this);
        this.add(cmdRetirada);
        
        cmdSair = new Button("Sair");
        cmdSair.setSize(dButton);
        cmdSair.setLocation(180, 185);
        cmdSair.addActionListener(this);
        this.add(cmdSair);
        
        txtMsg = new TextArea(null);
        txtMsg.setSize(dTextArea);
        txtMsg.setLocation(25,220);
        this.add(txtMsg);
        this.addWindowListener(this); //Preparada para ouvir eventos de janela
    }//Fim do construtor

    @Override
    public void windowOpened(WindowEvent e) {
        
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0); //Fechar a Aplicação
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
            System.exit(0);
        }
        //Entrada
        if(e.getSource()==cmdEntrada){
            double valor = Double.parseDouble(txtValor.getText());
            String transacao;
            transacao = caixa.depositar(valor);
            txtMsg.append(transacao + "\n");
            txtValor.setText(null);
            txtValor.requestFocus(); // Coloca o foco no controle
        }
        if(e.getSource()==cmdRetirada){
            double valor = Double.parseDouble(txtValor.getText());
            String transacao;
            transacao = caixa.sacar(valor);
            txtMsg.append(transacao + "\n");
            txtValor.setText(null);
            txtValor.requestFocus(); // Coloca o foco no controle
        }
        if(e.getSource()==cmdConsulta){
            txtSaldo.setText(String.valueOf(caixa.getSaldo()));
            txtValor.setText(null);
            txtValor.requestFocus();
        }
    }
    
    
}//Fim da Classe
