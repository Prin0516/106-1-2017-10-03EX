import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame {
    private Container cp;
    private JButton jbtn1=new JButton("ADD");
    private JButton jbtn2=new JButton("SUB");
    private JButton jbtn3=new JButton("jbtn3");
    private JButton jbtn4=new JButton("EXIT");
    private JLabel jlb=new JLabel("0");
    private int count=0;
    public MainFrame(){
        init();
    }
    public void init(){
        this.setBounds(10,10,500,500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        cp=this.getContentPane();
        cp.setLayout(new GridLayout(5,1,3,3));
        cp.add(jbtn1);
        cp.add(jbtn2);
        cp.add(jlb);
        cp.add(jbtn3);
        cp.add(jbtn4);
        jlb.setHorizontalAlignment(JLabel.CENTER);
        jbtn1.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                count++;
                jlb.setText(Integer.toString(count));
            }
        });
        jbtn2.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                count--;
                jlb.setText(Integer.toString(count));
            }
        });
        jbtn4.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });





    }
}
