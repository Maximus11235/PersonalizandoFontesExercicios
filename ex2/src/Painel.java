package src;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Font.*;
import java.io.File;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Painel extends JFrame{
    JLabel texto;
    JPanel painel= new JPanel();
    public Painel(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Fonte Personalizada");
        this.setLayout(null);
        this.setSize(400,300);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
        texto=new JLabel("Fonte de teste criada por Maximus");
        try{
            File arquivoFonte=new File("src/fontes/fonte2.ttf");
            Font fonteBase=Font.createFont(Font.PLAIN,arquivoFonte).deriveFont(24f);
            texto.setFont(fonteBase);
        }catch(IOException|FontFormatException erro){
            erro.printStackTrace();
        }

        texto.setBounds(20, 10, 400,30);
        
        
        this.add(texto);
        this.setVisible(true);
    }
}
