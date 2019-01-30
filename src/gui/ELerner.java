package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Toolkit;

public class ELerner extends JFrame {

	private JPanel contentPane;
    int richt = 0;
    int varv = 0;
    int count = 0;
    private JTextField quest;
    private JTextField answ;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ELerner frame = new ELerner();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ELerner() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(ELerner.class.getResource("/com/sun/java/swing/plaf/windows/icons/Question.gif")));
		setResizable(false);
		setTitle("Mathe-Lernen");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 163);
		contentPane = new JPanel();
		contentPane.setBackground(Color.RED);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[grow]", "[][][][][]"));
		
		JLabel lblFrage = new JLabel("Frage:");
		contentPane.add(lblFrage, "cell 0 0");
		
		quest = new JTextField();
		quest.setEditable(false);
		contentPane.add(quest, "cell 0 1,growx");
		quest.setColumns(10);
		
		JLabel lblAntwort = new JLabel("Antwort:");
		contentPane.add(lblAntwort, "cell 0 2");
		
		answ = new JTextField();
		answ.setEditable(false);
		contentPane.add(answ, "cell 0 3,growx");
		answ.setColumns(10);
		
		JButton butt = new JButton("Starten");
		butt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (varv == 1) {
					count++;
					String stris;
					stris = answ.getText();
					if (stris.equals("16")) {
						richt++;
						JOptionPane.showMessageDialog(null, "Super, das ist richtig");
						varv++;
						answ.setText("");
						quest.setText("Was ist 6x7?");						
					}else if(stris.equals("")){
						JOptionPane.showMessageDialog(null, "Bitte geben sie etwas ein!");
					}else {
						JOptionPane.showMessageDialog(null, "Leider ist \""+ stris + "\" Falsch");
						varv++;
						answ.setText("");
						quest.setText("Was ist 6x7?");
					}
					
				}else if(varv == 2){
					count++;
					String stris;
					stris = answ.getText();
					if (stris.equals("42")) {
						richt++;
						JOptionPane.showMessageDialog(null, "Super, das ist richtig");
						varv++;
						answ.setText("");
						quest.setText("Was ist 9x4?");						
					}else if(stris.equals("")){
						JOptionPane.showMessageDialog(null, "Bitte geben sie etwas ein!");
					}else {
						JOptionPane.showMessageDialog(null, "Leider ist \""+ stris + "\" Falsch");
						varv++;
						answ.setText("");
						quest.setText("Was ist 9x4?");
					}
					
				}else if(varv == 3){
					count++;
					String stris;
					stris = answ.getText();
					if (stris.equals("36")) {
						richt++;
						JOptionPane.showMessageDialog(null, "Super, das ist richtig");
						varv++;
						answ.setText("");
						quest.setText("Was ist 7x3+2?");						
					}else if(stris.equals("")){
						JOptionPane.showMessageDialog(null, "Bitte geben sie etwas ein!");
					}else {
						JOptionPane.showMessageDialog(null, "Leider ist \""+ stris + "\" Falsch");
						varv++;
						answ.setText("");
						quest.setText("Was ist 7x3+2?");
					}
					
				}else if(varv == 4){
					count++;
					String stris;
					String aufgab = "Was ist 9+7x4?";
					stris = answ.getText();
					if (stris.equals("23")) {
						richt++;
						JOptionPane.showMessageDialog(null, "Super, das ist richtig");
						varv++;
						answ.setText("");
						quest.setText(aufgab);						
					}else if(stris.equals("")){
						JOptionPane.showMessageDialog(null, "Bitte geben sie etwas ein!");
					}else {
						JOptionPane.showMessageDialog(null, "Leider ist \""+ stris + "\" Falsch");
						varv++;
						answ.setText("");
						quest.setText(aufgab);
					}
					
				}else if (varv == 5){
					count++;
					String stris;
					String aufgab = "Was ist (6-3)+6*4?";//Aufgabe
					stris = answ.getText();
					if (stris.equals("37")) {
						richt++;
						JOptionPane.showMessageDialog(null, "Super, das ist richtig");
						varv++;
						answ.setText("");
						quest.setText(aufgab);						
					}else if(stris.equals("")){//Wenn leer
						JOptionPane.showMessageDialog(null, "Bitte geben sie etwas ein!");
					}else {
						JOptionPane.showMessageDialog(null, "Leider ist \""+ stris + "\" Falsch");
						varv++;
						answ.setText("");
						quest.setText(aufgab);
					}
				}else if(varv == 6){
					count++;
					String stris;
					String aufgab = ("Fertig! Alle aufgaben erledigt");
					
					stris = answ.getText();
					if (stris.equals("23")) {
						richt++;
						JOptionPane.showMessageDialog(null, "Super, das ist richtig");
						answ.setText("");	
					}else {
						JOptionPane.showMessageDialog(null, "Leider ist \""+ stris + "\" Falsch");
						answ.setText("");
					}
					quest.setText(aufgab);
					butt.setText("Zeige Ergebnis");
					answ.setEditable(false);
					varv++;
				}else if(varv == 7){
					//PRÜFE
					answ.setText("Sie haben " + richt + " von " + count + " Richtig!");
					if (richt != count) {
					   butt.setText("Erneut Spielen");
					   varv++;
					}else {
						butt.setText("Quit");
						varv++;
						varv++;
					}
				} else if(varv == 8){
					count = 0;
					richt = 0;
					varv = 0;
					butt.setText("Starten");
					answ.setText("");
				} else if(varv == 9){
					JOptionPane.showMessageDialog(null, "Danke das sie unsere Anwendung benutzt haben!");
					System.exit(0);
				}else {
					varv++;
					butt.setText("Pr\u00FCfe");
					answ.setEditable(true);
					quest.setText("Was ist 8+8?");
				}
			}
		});
		contentPane.add(butt, "cell 0 4,growx");
	}

}
