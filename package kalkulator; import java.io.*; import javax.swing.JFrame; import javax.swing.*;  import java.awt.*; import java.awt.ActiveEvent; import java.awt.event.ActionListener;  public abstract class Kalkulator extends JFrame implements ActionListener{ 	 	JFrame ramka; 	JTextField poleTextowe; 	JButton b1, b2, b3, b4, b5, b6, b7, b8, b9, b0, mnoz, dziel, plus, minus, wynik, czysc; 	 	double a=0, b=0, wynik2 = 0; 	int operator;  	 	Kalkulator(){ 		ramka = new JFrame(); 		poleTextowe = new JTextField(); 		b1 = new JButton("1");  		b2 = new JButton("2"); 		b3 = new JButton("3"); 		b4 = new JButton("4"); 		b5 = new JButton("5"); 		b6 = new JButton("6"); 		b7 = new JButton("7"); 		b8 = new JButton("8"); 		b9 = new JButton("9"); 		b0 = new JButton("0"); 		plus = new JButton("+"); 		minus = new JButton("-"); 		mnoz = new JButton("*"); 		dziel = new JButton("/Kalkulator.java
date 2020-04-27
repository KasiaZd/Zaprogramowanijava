package kalkulator;
import java.io.*;
import javax.swing.JFrame;
import javax.swing.*;

import java.awt.*;
import java.awt.ActiveEvent;
import java.awt.event.ActionListener;

public abstract class Kalkulator extends JFrame implements ActionListener{
	
	JFrame ramka;
	JTextField poleTextowe;
	JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, mnoz, dziel, plus, minus, wynik, czysc;
	
	double a=0, b=0, wynik2 = 0;
	int operator; 
	
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
		
		ramka.setVisible(true);
		ramka.setSize(200, 300);
		ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ramka.setResizable(false);
		
	}
}
