import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gleichung {

    private JPanel jPanel;
    private JButton buttonRechnen;
    private JButton buttonLoeschen;
    private JLabel variableA;
    private JLabel variableB;
    private JLabel variableE;
    private JLabel variableC;
    private JLabel variableD;
    private JLabel variableF;
    private JTextField textFieldA;
    private JTextField textFieldC;
    private JTextField textFieldB;
    private JTextField textFieldE;
    private JTextField textFieldD;
    private JTextField textFieldF;
    private JLabel loesungY;
    private JLabel loesungX;
    private JLabel ergebnisX;
    private JLabel ergebnisY;
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int x;
    private int y;

    public Gleichung(){
        JFrame frame = new JFrame("Linearer Gleichungsrechner");
        jPanel = new JPanel(new GridLayout(0, 2));
        buttonRechnen = new JButton("Rechnen");
        buttonLoeschen = new JButton("Löschen");
        variableA = new JLabel("var: A");
        variableB = new JLabel("var: B");
        variableC = new JLabel("var: C");
        variableD = new JLabel("var: D");
        variableE = new JLabel("var: E");
        variableF = new JLabel("var: F");
        loesungX = new JLabel("Lösung X");
        loesungY = new JLabel("Lösung Y");
        ergebnisX = new JLabel("");
        ergebnisY = new JLabel("");
        textFieldA = new JTextField();
        textFieldB  = new JTextField();
        textFieldC  = new JTextField();
        textFieldD  = new JTextField();
        textFieldE  = new JTextField();
        textFieldF  = new JTextField();


        //Komponenten dem JPanel hinzufügen
        frame.add(jPanel);
        jPanel.add(variableA);
        jPanel.add(textFieldA);
        jPanel.add(variableB);
        jPanel.add(textFieldB);
        jPanel.add(variableC);
        jPanel.add(textFieldC);
        jPanel.add(variableD);
        jPanel.add(textFieldD);
        jPanel.add(variableE);
        jPanel.add(textFieldE);
        jPanel.add(variableF);
        jPanel.add(textFieldF);
        jPanel.add(buttonLoeschen);
        jPanel.add(buttonRechnen);
        jPanel.add(loesungX);
        jPanel.add(loesungY);
        jPanel.add(ergebnisX);
        jPanel.add(ergebnisY);


        buttonRechnen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gleichungRechnen();
            }
        });

        buttonLoeschen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gleichungLoeschen();
            }
        });

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public void gleichungRechnen(){
        //Werte bekommen
        a = Integer.parseInt(textFieldA.getText());
        b = Integer.parseInt(textFieldB.getText());
        c = Integer.parseInt(textFieldC.getText());
        d = Integer.parseInt(textFieldD.getText());
        e = Integer.parseInt(textFieldE.getText());
        f = Integer.parseInt(textFieldF.getText());

        //Werte für X berechnen
        x = ((e*d)-(f*b)) / ((d*a)-(c*b));
        //Wert für Y berechnen
        y = ((f*a)-(c*e)) / ((d*a)-(c*b));
        ergebnisX.setText(Integer.toString(x));
        ergebnisY.setText(Integer.toString(y));
    }

    public void gleichungLoeschen(){
        ergebnisX.setText("");
        ergebnisY.setText("");
        textFieldA.setText("");
        textFieldB.setText("");
        textFieldC.setText("");
        textFieldD.setText("");
        textFieldE.setText("");
        textFieldF.setText("");
    }



    public static void main(String[] args){
       new Gleichung();

    }

}
