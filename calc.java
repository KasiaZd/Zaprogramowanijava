package kalkulator;
import java.io.*;
import javax.swing.JFrame;
import javax.swing.*;

import java.awt.*;
import java.awt.ActiveEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Kalkulator extends JFrame implements ActionListener{
	
	JFrame ramka;
	JTextField poleTextowe;
	JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, mnoz, dziel, plus, minus, wynik, czysc;
	
	double a=0, b=0, wynik2 = 0;
	String operator; 
	
	Kalkulator(){
		ramka = new JFrame();
		poleTextowe = new JTextField();
		b1 = new JButton("1"); 
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");
		b7 = new JButton("7");
		b8 = new JButton("8");
		b9 = new JButton("9");
		b0 = new JButton("0");
		plus = new JButton("+");
		minus = new JButton("-");
		mnoz = new JButton("*");
		dziel = new JButton("/");
		wynik = new JButton("=");
		czysc = new JButton("C");
	
		poleTextowe.setBounds(30,40,280,30);
		b7.setBounds(40,100,50,40);
		b8.setBounds(110,100,50,40);
		b9.setBounds(180,100,50,40);
		plus.setBounds(250,100,50,40);
		
		b4.setBounds(40,170,50,40);
		b5.setBounds(110,170,50,40);
		b6.setBounds(180,170,50,40);
		minus.setBounds(250,170,50,40);
		
		b1.setBounds(40,240,50,40);
		b2.setBounds(110,240,50,40);
		b3.setBounds(180,240,50,40);
		mnoz.setBounds(250,240,50,40);
		
		b0.setBounds(40,310,50,40);
		czysc.setBounds(110,310,50,40);
		wynik.setBounds(180,310,50,40);
		dziel.setBounds(250,310,50,40);
		
		
		ramka.add(poleTextowe);
		ramka.add(b7);
		ramka.add(b8);
		ramka.add(b9);
		ramka.add(dziel);
		ramka.add(b4);
		ramka.add(b5);
		ramka.add(b6);
		ramka.add(mnoz);
		ramka.add(b1);
		ramka.add(b2);
		ramka.add(b3);
		ramka.add(minus);
		ramka.add(plus);
		ramka.add(b0);
		ramka.add(czysc);
		ramka.add(wynik);
		
		
		ramka.setLayout(null);
		ramka.setVisible(true);
		ramka.setSize(350, 500);
		ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ramka.setResizable(false);
		
		b0.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		plus.addActionListener(this);
		minus.addActionListener(this);
		mnoz.addActionListener(this);
		dziel.addActionListener(this);
		wynik.addActionListener(this);
		czysc.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1)
			poleTextowe.setText(poleTextowe.getText().concat("1"));
		
		if(e.getSource()==b2)
			poleTextowe.setText(poleTextowe.getText().concat("2"));
	
		if(e.getSource()==b3)
			poleTextowe.setText(poleTextowe.getText().concat("3"));
			
		if(e.getSource()==b4)
			poleTextowe.setText(poleTextowe.getText().concat("4"));
		
		if(e.getSource()==b5)
			poleTextowe.setText(poleTextowe.getText().concat("5"));
		
		if(e.getSource()==b6)
			poleTextowe.setText(poleTextowe.getText().concat("6"));
		
		if(e.getSource()==b7)
			poleTextowe.setText(poleTextowe.getText().concat("7"));
		
		if(e.getSource()==b8)
			poleTextowe.setText(poleTextowe.getText().concat("8"));
		
		if(e.getSource()==b9)
			poleTextowe.setText(poleTextowe.getText().concat("9"));
		
		if(e.getSource()==b0)
			poleTextowe.setText(poleTextowe.getText().concat("0"));

		if(e.getSource()==plus)
		{
			a = Double.parseDouble(poleTextowe.getText());
			operator = "dodawanie";
			poleTextowe.setText(" ");
			
		}
		if(e.getSource()==minus)
		{
			a = Double.parseDouble(poleTextowe.getText());
			operator = "odejmowanie";
			poleTextowe.setText(" ");
		}
		if(e.getSource()==mnoz)
		{
			a = Double.parseDouble(poleTextowe.getText());
			operator = "mnozenie";
			poleTextowe.setText(" ");
		}	
		if(e.getSource()==dziel)
		{
			a = Double.parseDouble(poleTextowe.getText());
			operator = "dzielenie";
			poleTextowe.setText(" ");
		}
		if(e.getSource() == wynik)
		{
			b = Double.parseDouble(poleTextowe.getText());
			switch(operator) {
			case "dodawanie": wynik2 = a+b;
			break;
			
			case "odejmowanie": wynik2 = a-b;
			break;
			
			case "mnożenie": wynik2 = a*b;
			break;
			
			case "dzielenie": wynik2 = a/b;
			break;
			
		}
			poleTextowe.setText("" + wynik2);
	}
		if(e.getSource() == czysc)
		{
			poleTextowe.setText("");
		}
}	
	
	public static void main(String[] Args) {
	//	Kalkulator k = new Kalkulator();
		new Kalkulator();
	}
}
