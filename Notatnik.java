package notes; 

import java.applet.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.util.Scanner;


class Notatnik extends JFrame{
	JFrame ramka; 
	JMenuBar wstazka;
	JMenu menu;
	JTextArea poleTextowe;
	JMenu edycja;
	JMenuItem nowyPlik, otworz, zamknij, zapisz;
	JMenuItem cofnij, zaznaczWszystko, wklej;
	JMenu pomoc;
	JMenu plik;

	
	Notatnik()
	{
		ramka = new JFrame("Notatnik");
		plik = new JMenu("Plik");
		edycja = new JMenu("edycja");
		menu = new JMenu("menu");
		pomoc = new JMenu("pomoc");
		
		nowyPlik = new JMenuItem("Nowy");
		otworz = new JMenuItem("Otwóż");
		zapisz = new JMenuItem("Zapisz");
		zamknij = new JMenuItem("Zamknij");
		cofnij = new JMenuItem("Cofnij  ctrl+Z");
		zaznaczWszystko = new JMenuItem("Zaznacz wszystko  ctrl+A");
		wklej = new JMenuItem("Wklej ctrl+V");
				
		ramka.setLayout(new BorderLayout());
		ramka.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		ramka.add(poleTextowe);
		//wstazka.add()
		plik.add(otworz); 
		plik.add(nowyPlik);
		plik.add(zapisz);
		plik.add(zamknij);
		edycja.add(cofnij);
		edycja.add(zaznaczWszystko);
		edycja.add(wklej);
		wstazka.add(plik);
		wstazka.add(edycja);
		wstazka.add(pomoc);
		
		ramka.setJMenuBar(wstazka);
		
		OpenListener ol = new OpenListener();
		NewListener nl = new NewListener();
		SaveListener sl = new SaveListener();
		ExitListener el = new ExitListener();
		otworz.addActionListener(ol);
		nowyPlik.addActionListener(nl);
		zapisz.addActionListener(sl);
		zamknij.addActionListener(el);
		
		ramka.setSize(800, 600);
		ramka.setVisible(true);
	}

	public static void main(String [] Args)
	{
		Notatnik n = new Notatnik();
	}
}
