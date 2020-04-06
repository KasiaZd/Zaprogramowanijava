package notes; 

import java.applet.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.util.Scanner;
import java.io.PrintWriter;


class Notatnik extends JFrame{
	private static final long serialVersionUID = 1L;
	
	JFrame ramka; 
	JMenuBar wstazka;
	JMenu menu;
	JTextArea poleTextowe;
	JMenu edycja;
	JMenuItem nowyPlik, otworz, zamknij, zapisz;
	JMenuItem cofnij, zaznaczWszystko, wklej;
	JMenu pomoc;
	JMenu plik;
	JFileChooser fileChooser;

	
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
	
	class OpenListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (JFileChooser.APPROVE_OPTION == fileChooser.showOpenDialog(ramka)) {
				File plik = fileChooser.getSelectedFile();
				poleTextowe.setText("");
				Scanner in = null;
				try {
					in = new Scanner(plik);
					while(in.hasNext()) {
						String line = in.nextLine();
						poleTextowe.append(line+"\n");
						
					}
				}
				catch (Exception ex)
				{
					ex.printStackTrace();
				}
				finally
				{
					in.close();
				}
			}
				
		}
	}
	

	 class SaveListener implements ActionListener{
		public void actionPerformer(ActionEvent e) {
			if(JFileChooser.APPROVE_OPTION == fileChooser.showSaveDialog(ramka)) {
				File plik = fileChooser.getSelectedFile();
				PrintWriter out = null;
				
				try {
					out = new PrintWriter(plik);
					String output = poleTextowe.getText();
					System.out.println(output);
					out.println(output);
				}
				catch(Exception ex) {
					ex.printStackTrace();
				}
				finally {
					try 
					{
						out.flush();
					}catch(Exception ex1)
					{
						
					}
					try {
						out.close();
					} catch(Exception ex1) {
				}
			}
		}
	}

}
		class NewListener implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				poleTextowe.setText("");
			}
		}
		
	class ExitListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	}
	
	
		
	public static void main(String [] Args)
	{
		Notatnik n = new Notatnik();
	}
}
