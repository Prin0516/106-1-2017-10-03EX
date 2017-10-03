import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private Container cp;
    private JButton jbtn1=new JButton("Example");
    private JButton jbtn2=new JButton("Encrypt");
    private JButton jbtn3=new JButton("Clear");
    private JButton jbtn4=new JButton("Exit");
    private JLabel jlb=new JLabel("Key");
    private JTextField jtf=new JTextField("0");
    private JPanel jpn=new JPanel(new GridLayout(6,1,3,3));
    private JTextArea jtaR=new JTextArea();
    private JTextArea jtaL=new JTextArea();
    private JScrollPane jspR=new JScrollPane(jtaR);
    private JScrollPane jspL=new JScrollPane(jtaL);
    private int count=0;
    public MainFrame(){
        init();
    }
    public void init(){
        this.setBounds(10,10,500,400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        cp=this.getContentPane();
        cp.setLayout(new BorderLayout(3,3));
        jtaL.setPreferredSize(new Dimension(200,400));
        jtaR.setPreferredSize(new Dimension(200,400));
        jtaR.setLineWrap(true);
        jtaL.setLineWrap(true);
        jtaR.setEditable(false);
        jpn.add(jbtn1);
        jpn.add(jbtn2);
        jpn.add(jlb);
        jpn.add(jtf);
        jpn.add(jbtn3);
        jpn.add(jbtn4);
        cp.add(jspL,BorderLayout.WEST);
        cp.add(jpn,BorderLayout.CENTER);
        cp.add(jspR,BorderLayout.EAST);
        jlb.setHorizontalAlignment(JLabel.CENTER);

        jbtn1.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                jtaL.setText("The Department of Computer Science and Information Engineering, formerly the Department of Information Technology, was established in 2001. The department first offered a Master program only. In 2002, the undergraduate program was established. The Doctoral program was established in 2006. Each year the department admits about 80 undergraduates, 15 graduate students and 3 Ph.D. students.");
            }
        });
        jbtn2.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                char data[]=jtaL.getText().toCharArray();
                int len =data.length,key=Integer.parseInt(jtf.getText());
                for(int i=0;i<len;i++){
                    data[i]+=key;
                }
                jtaR.setText(new String(data));
            }
        });
        jbtn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                jtf.setText("0");
                jtaL.setText("");
                jtaR.setText("");
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
