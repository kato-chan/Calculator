package calc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import java.awt.CardLayout;
import java.awt.ComponentOrientation;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Calc implements ActionListener {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextArea textField_3;
	boolean[] function = new boolean[4];
	double[] temporary = {0, 0};
	private JButton button;
	private JButton button_1;
	private JButton button_2;
	private JButton button_3;
	private JButton button_4;
	private JButton button_5;
	private JButton button_6;
	private JButton button_7;
	private JButton button_8;
	private JButton button_9;
	private JButton button_10;
	private JButton button_11;
	private JButton button_12;
	private JButton button_13;
	private JButton button_14;
	private JButton button_15;
	private JButton button_16;
	private JButton btnCe;

		Calc() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 300, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		for(int i = 0; i < 4; i++){
				    function[i] = false;}
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnStart = new JMenu("Start");
		menuBar.add(mnStart);
		
		JMenuItem mntmStart = new JMenuItem("Start");
		mnStart.add(mntmStart);
		
		JMenuItem mntmKoniec = new JMenuItem("Koniec");
		mnStart.add(mntmKoniec);
		
		JMenu mnChangeLayout = new JMenu("Interfejs");
		menuBar.add(mnChangeLayout);
		
		JMenuItem mntmGraficzny = new JMenuItem("Graficzny");
		mnChangeLayout.add(mntmGraficzny);
		
		JMenuItem mntmTekstowy = new JMenuItem("Tekstowy");
		mnChangeLayout.add(mntmTekstowy);
		frame.getContentPane().setLayout(null);
		
		final JPanel karty = new JPanel();
		karty.setBounds(0, 0, 294, 251);
		frame.getContentPane().add(karty);
		karty.setLayout(new CardLayout(0, 0));
		
		final JPanel panel_1 = new JPanel();
		karty.add(panel_1, "name_6030553666647");
		panel_1.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 67, 274, 174);
		panel_1.add(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{54, 54, 54, 54, 54, 0};
		gbl_panel.rowHeights = new int[]{43, 43, 43, 43, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JButton button = new JButton("7");
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.fill = GridBagConstraints.BOTH;
		gbc_button.insets = new Insets(0, 0, 5, 5);
		gbc_button.gridx = 0;
		gbc_button.gridy = 0;
		panel.add(button, gbc_button);
		button.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	textField_3.append("7");
	        }
	        });
		
		JButton button_1 = new JButton("8");
		GridBagConstraints gbc_button_1 = new GridBagConstraints();
		gbc_button_1.fill = GridBagConstraints.BOTH;
		gbc_button_1.insets = new Insets(0, 0, 5, 5);
		gbc_button_1.gridx = 1;
		gbc_button_1.gridy = 0;
		panel.add(button_1, gbc_button_1);
		button_1.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	textField_3.append("8");
	        }
	        });
		
		JButton button_2 = new JButton("9");
		GridBagConstraints gbc_button_2 = new GridBagConstraints();
		gbc_button_2.fill = GridBagConstraints.BOTH;
		gbc_button_2.insets = new Insets(0, 0, 5, 5);
		gbc_button_2.gridx = 2;
		gbc_button_2.gridy = 0;
		panel.add(button_2, gbc_button_2);
		button_2.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	textField_3.append("9");
	        }
	        });
		
		JButton button_15 = new JButton("/");
		GridBagConstraints gbc_button_15 = new GridBagConstraints();
		gbc_button_15.fill = GridBagConstraints.BOTH;
		gbc_button_15.insets = new Insets(0, 0, 5, 5);
		gbc_button_15.gridx = 3;
		gbc_button_15.gridy = 0;
		panel.add(button_15, gbc_button_15);
		button_15.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	 temporary[0] = Double.parseDouble(textField_3.getText());
	 	        function[3] = true;
	 	        textField.setText(textField_3.getText());
	 	        textField_3.setText("");
	        }
	        });
		
		JButton button_16 = new JButton("+/-");
		GridBagConstraints gbc_button_16 = new GridBagConstraints();
		gbc_button_16.fill = GridBagConstraints.BOTH;
		gbc_button_16.insets = new Insets(0, 0, 5, 5);
		gbc_button_16.gridx = 4;
		gbc_button_16.gridy = 0;
		panel.add(button_16, gbc_button_16);
		button_16.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	getPosNeg();
	        }
	        });
		
		JButton btnCe = new JButton("CE");
		GridBagConstraints gbc_btnCe = new GridBagConstraints();
		gbc_btnCe.insets = new Insets(0, 0, 0, 5);
		gbc_btnCe.gridheight = 3;
		gbc_btnCe.fill = GridBagConstraints.BOTH;
		gbc_btnCe.gridx = 4;
		gbc_btnCe.gridy = 1;
		panel.add(btnCe, gbc_btnCe);
		btnCe.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
            	clear();            }
        });
		
		
		JButton button_3 = new JButton("4");
		GridBagConstraints gbc_button_3 = new GridBagConstraints();
		gbc_button_3.fill = GridBagConstraints.BOTH;
		gbc_button_3.insets = new Insets(0, 0, 5, 5);
		gbc_button_3.gridx = 0;
		gbc_button_3.gridy = 1;
		panel.add(button_3, gbc_button_3);
		button_3.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	textField_3.append("4");
	        }
	        });
		
		JButton button_4 = new JButton("5");
		GridBagConstraints gbc_button_4 = new GridBagConstraints();
		gbc_button_4.fill = GridBagConstraints.BOTH;
		gbc_button_4.insets = new Insets(0, 0, 5, 5);
		gbc_button_4.gridx = 1;
		gbc_button_4.gridy = 1;
		panel.add(button_4, gbc_button_4);
		button_4.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	textField_3.append("5");
	        }
	        });
		
		JButton button_5 = new JButton("6");
		GridBagConstraints gbc_button_5 = new GridBagConstraints();
		gbc_button_5.fill = GridBagConstraints.BOTH;
		gbc_button_5.insets = new Insets(0, 0, 5, 5);
		gbc_button_5.gridx = 2;
		gbc_button_5.gridy = 1;
		panel.add(button_5, gbc_button_5);
		button_5.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	textField_3.append("6");
	        }
	        });
		
		JButton button_14 = new JButton("*");
		GridBagConstraints gbc_button_14 = new GridBagConstraints();
		gbc_button_14.fill = GridBagConstraints.BOTH;
		gbc_button_14.insets = new Insets(0, 0, 5, 5);
		gbc_button_14.gridx = 3;
		gbc_button_14.gridy = 1;
		panel.add(button_14, gbc_button_14);
		button_14.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	temporary[0] = Double.parseDouble(textField_3.getText());
		        function[2] = true;
		        textField.setText(textField_3.getText());
		        textField_3.setText("");
	        }
	        });
		
		JButton button_6 = new JButton("1");
		GridBagConstraints gbc_button_6 = new GridBagConstraints();
		gbc_button_6.fill = GridBagConstraints.BOTH;
		gbc_button_6.insets = new Insets(0, 0, 5, 5);
		gbc_button_6.gridx = 0;
		gbc_button_6.gridy = 2;
		panel.add(button_6, gbc_button_6);
		button_6.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	textField_3.append("1");
	        }
	        });
		
		JButton button_7 = new JButton("2");
		GridBagConstraints gbc_button_7 = new GridBagConstraints();
		gbc_button_7.fill = GridBagConstraints.BOTH;
		gbc_button_7.insets = new Insets(0, 0, 5, 5);
		gbc_button_7.gridx = 1;
		gbc_button_7.gridy = 2;
		panel.add(button_7, gbc_button_7);
		button_7.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	textField_3.append("2");
	        }
	        });
		
		JButton button_8 = new JButton("3");
		GridBagConstraints gbc_button_8 = new GridBagConstraints();
		gbc_button_8.fill = GridBagConstraints.BOTH;
		gbc_button_8.insets = new Insets(0, 0, 5, 5);
		gbc_button_8.gridx = 2;
		gbc_button_8.gridy = 2;
		panel.add(button_8, gbc_button_8);
		button_8.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	textField_3.append("3");
	        }
	        });
		
		JButton button_13 = new JButton("-");
		GridBagConstraints gbc_button_13 = new GridBagConstraints();
		gbc_button_13.fill = GridBagConstraints.BOTH;
		gbc_button_13.insets = new Insets(0, 0, 5, 5);
		gbc_button_13.gridx = 3;
		gbc_button_13.gridy = 2;
		panel.add(button_13, gbc_button_13);
		button_13.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	temporary[0] = Double.parseDouble(textField_3.getText());
		        function[1] = true;
		        textField.setText(textField_3.getText());
		        textField_3.setText("");
	        }
	        });
		
		JButton button_9 = new JButton("0");
		GridBagConstraints gbc_button_9 = new GridBagConstraints();
		gbc_button_9.fill = GridBagConstraints.BOTH;
		gbc_button_9.insets = new Insets(0, 0, 0, 5);
		gbc_button_9.gridx = 0;
		gbc_button_9.gridy = 3;
		panel.add(button_9, gbc_button_9);
		button_9.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	textField_3.append("0");
	        }
	        });
		
		JButton button_10 = new JButton(",");
		GridBagConstraints gbc_button_10 = new GridBagConstraints();
		gbc_button_10.fill = GridBagConstraints.BOTH;
		gbc_button_10.insets = new Insets(0, 0, 0, 5);
		gbc_button_10.gridx = 1;
		gbc_button_10.gridy = 3;
		panel.add(button_10, gbc_button_10);
		button_10.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	textField_3.append(".");
	        }
	        });
		
		JButton button_12 = new JButton("+");
		GridBagConstraints gbc_button_12 = new GridBagConstraints();
		gbc_button_12.insets = new Insets(0, 0, 0, 5);
		gbc_button_12.fill = GridBagConstraints.BOTH;
		gbc_button_12.gridx = 2;
		gbc_button_12.gridy = 3;
		panel.add(button_12, gbc_button_12);
		button_12.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	temporary[0] = Double.parseDouble(textField_3.getText());
		        function[0] = true;
		        textField.setText(textField_3.getText());
		        textField_3.setText("");
	        }
	        });
		
		JButton button_11 = new JButton("=");
		GridBagConstraints gbc_button_11 = new GridBagConstraints();
		gbc_button_11.fill = GridBagConstraints.BOTH;
		gbc_button_11.insets = new Insets(0, 0, 0, 5);
		gbc_button_11.gridx = 3;
		gbc_button_11.gridy = 3;
		panel.add(button_11, gbc_button_11);
		button_11.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	textField_1.setText(textField_3.getText());
	        	getResult();
	        }
	        });

		
		textField_3 = new JTextArea();
		textField_3.setFont(new Font("Arial", Font.BOLD, 20));
		textField_3.setBounds(10, 11, 274, 45);
		textField_3.setEditable(false);
		textField_3.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		panel_1.add(textField_3);
		textField_3.setColumns(10);
		
		final JPanel panel_2 = new JPanel();
		karty.add(panel_2, "name_8049167735600");
		panel_2.setLayout(null);
		
		JLabel lblWpiszPierwszaLiczbe = new JLabel("Wpisz pierwsza liczbe:");
		lblWpiszPierwszaLiczbe.setBounds(10, 11, 152, 23);
		panel_2.add(lblWpiszPierwszaLiczbe);
		
		textField = new JTextField();
		textField.setBounds(172, 12, 86, 20);
		panel_2.add(textField);
		textField.setColumns(10);
		textField.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	textField_3.setText(textField.getText());
	        }
	        });
		
		
		JLabel lblWpiszDrugaLiczbe = new JLabel("Wpisz druga liczbe:");
		lblWpiszDrugaLiczbe.setBounds(10, 45, 152, 23);
		panel_2.add(lblWpiszDrugaLiczbe);
		
		textField_1 = new JTextField();
		textField_1.setBounds(172, 46, 86, 20);
		panel_2.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnDodaj = new JButton("Dodaj");
		btnDodaj.setBounds(35, 97, 86, 23);
		panel_2.add(btnDodaj);
		btnDodaj.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	temporary[0] = Double.parseDouble(textField_3.getText());
		        function[0] = true;
		        textField_3.setText(textField_1.getText());
	        }
	        });
		
		JButton btnOdejmij = new JButton("Odejmij");
		btnOdejmij.setBounds(169, 97, 89, 23);
		panel_2.add(btnOdejmij);
		btnOdejmij.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	temporary[0] = Double.parseDouble(textField_3.getText());
		        function[1] = true;
		        textField_3.setText(textField_1.getText());
	        }
	        });
		
		JButton btnPomn = new JButton("Pomn\u00F3\u017C");
		btnPomn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnPomn.setBounds(35, 131, 89, 23);
		panel_2.add(btnPomn);
		btnPomn.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	temporary[0] = Double.parseDouble(textField_3.getText());
		        function[2] = true;
		        textField_3.setText(textField_1.getText());
	        }
	        });
		
		JButton btnPodziel = new JButton("Podziel");
		btnPodziel.setBounds(169, 131, 89, 23);
		panel_2.add(btnPodziel);
		btnPodziel.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	 temporary[0] = Double.parseDouble(textField_3.getText());
	 	        function[3] = true;
	 	       textField_3.setText(textField_1.getText());
	        }
	        });
		
		JLabel lblWynik = new JLabel("Wynik:");
		lblWynik.setBounds(10, 200, 46, 23);
		panel_2.add(lblWynik);
		
		
		textField_2 = new JTextField();
		textField_2.setBounds(54, 201, 204, 20);
		panel_2.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setBounds(169, 165, 89, 23);
		panel_2.add(btnClear);
		btnClear.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
            	clear();            }
        });
		
		JButton btnWynik = new JButton("Wynik");
		btnWynik.setBounds(35, 165, 89, 23);
		panel_2.add(btnWynik);
		btnWynik.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	textField_1.setText(textField_3.getText());
	        	getResult();
	        }
	        });
		
		
		
		mntmGraficzny.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
            	karty.add(panel_2,"Graficzny");
            }
        });
		mntmTekstowy.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
            	karty.add(panel_1,"Tekstowy");
            }
        });
		mntmStart.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
            	clear();
            }
        });
		mntmKoniec.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
            	frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
            }
        });

	}
	
	public void clear() {

	    try {

	        textField_3.setText(""); // Sets the display blank
	        textField_2.setText("");
	        textField_1.setText("");
	        textField.setText("");
	        for(int i = 0; i < 4; i++)
	            function[i] = false; // Sets the functions back to false
	        for(int i = 0; i < 2; i++)
	            temporary[i] = 0; // Sets our temporary variables back to 0
	    } catch(NullPointerException e) {

	    }

	}
	
	public void getPosNeg() {
	    try {
	        double value = Double.parseDouble(textField_3.getText()); // again we create a variable for our current value
	        if(value != 0) { // if the value isn't 0
	            value = value * (-1); // we multiply it by -1 to get it's opposite value
	            textField_3.setText(Double.toString(value)); // set the text to the new value.
	        }
	        else {
	        }
	    } catch(NumberFormatException e) {
	    }
	}

	
	public void getResult() {
	    double result = 0;  // variable for result
	    temporary[1] = Double.parseDouble(textField_3.getText()); //our second temporary number from display
	    String temp0 = Double.toString(temporary[0]); //necessary string for text of first temp
	    String temp1 = Double.toString(temporary[1]); //necessary string for text of second temp
	    try {
	    	if(temp0.contains("-")) { //if first string contains -
	    			            String[] temp00 = temp0.split("-", 2); //split into two strings at -
	    			            temporary[0] = (Double.parseDouble(temp00[1]) * -1); //puts string back in double with the real value.
	    			        }
	        if(temp1.contains("-")) { // same as above with second temporary
	            String[] temp11 = temp1.split("-", 2);
	            temporary[1] = (Double.parseDouble(temp11[1]) * -1);
	        }
	    } catch(ArrayIndexOutOfBoundsException e) {
	    }
	    try {
	        if(function[2] == true)  //we start off with multiplication obviously
	            result = temporary[0] * temporary[1]; //sets result to multiplication of function
	        else if(function[3] == true)  //now division
	            result = temporary[0] / temporary[1];
	        else if(function[0] == true) //now addition
	            result = temporary[0] + temporary[1];
	        else if(function[1] == true) //now subtraction
	            result = temporary[0] - temporary[1];
	        textField_3.setText(Double.toString(result)); //display now has result
	        textField_2.setText(Double.toString(result));
	        for(int i = 0; i < 4; i++)
	            function[i] = false; //set all the functions back to false
	    } catch(NumberFormatException e) {
	    }
	    
	}
	
	 public final void setDesign() {
	        try {
	            UIManager.setLookAndFeel(
	                    "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
	        } catch(Exception e) {   
	        }
	    }
	
	@Override
	public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == button)
	        textField_3.append("7");
	    if(ae.getSource() == button_1)
	    	textField_3.append("8");
	    if(ae.getSource() == button_2)
	    	textField_3.append("9");
	    if(ae.getSource() == button_12) {
	        //add function[0]
	        temporary[0] = Double.parseDouble(textField_3.getText());
	        function[0] = true;
	        textField_3.setText("");
	    }
	    if(ae.getSource() == button_3)
	    	textField_3.append("4");
	    if(ae.getSource() == button_4)
	    	textField_3.append("5");
	    if(ae.getSource() == button_5)
	    	textField_3.append("6");
	    if(ae.getSource() == button_13) {
	        //subtract function[1]
	        temporary[0] = Double.parseDouble(textField_3.getText());
	        function[1] = true;
	        textField_3.setText("");
	    }
	    if(ae.getSource() == button_6)
	    	textField_3.append("1");
	    if(ae.getSource() == button_7)
	    	textField_3.append("2");
	    if(ae.getSource() == button_8)
	    	textField_3.append("3");
	    if(ae.getSource() == button_14) {
	        //multiply function[2]
	        temporary[0] = Double.parseDouble(textField_3.getText());
	        function[2] = true;
	        textField_3.setText("");
	    }
	    if(ae.getSource() == button_10)
	    	textField_3.append(".");
	    if(ae.getSource() == button_15) {
	        //divide function[3]
	        temporary[0] = Double.parseDouble(textField_3.getText());
	        function[3] = true;
	        textField_3.setText("");
	    }
	    if(ae.getSource() == btnCe)
	        clear();
	    if(ae.getSource() == button_16)
	        getPosNeg();
	    if(ae.getSource() == button_11)
	        getResult();
	    if(ae.getSource() == button_9)
	    	textField_3.append("0");
	}


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calc window = new Calc();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
