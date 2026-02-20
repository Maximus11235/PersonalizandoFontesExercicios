import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Painel extends JFrame{
    JLabel jlabelArial;
    JLabel jlabelComic;
    JLabel jlabelTNR;

    JPanel painel= new JPanel();
    public Painel(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Galeria de Fontes");
        this.setLayout(null);
        this.setSize(400,300);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
        jlabelArial=new JLabel("Arial Negrito - 12");
        jlabelArial.setBounds(20, 10, 400,30);
        jlabelArial.setFont(new Font("Arial",Font.BOLD,12));
        
        jlabelComic=new JLabel("Comic Sans Italico - 16");
        jlabelComic.setBounds(20, 50, 400,30);
        jlabelComic.setFont(new Font("Comic Sans",Font.ITALIC,16));
        
        jlabelTNR=new JLabel("Times New Roman Normal - 20");
        jlabelTNR.setBounds(20, 90, 400,30);
        jlabelTNR.setFont(new Font("Comic Sans",0,20));
        
        this.add(jlabelArial);
        this.add(jlabelComic);
        this.add(jlabelTNR);
        this.setVisible(true);
    }
}
