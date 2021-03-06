package puzz;

import java.awt.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class Puzz extends JFrame implements ActionListener{
	JButton but1, but2, but3, but4, but5, but6, but7, but8, but9, but10, but11;
	Icon ikona;

	Icon ikona0 = new ImageIcon("src/konczyna.png");
	Icon ikona99 = new ImageIcon("src/konczyna.png");
	Icon przyk  = new ImageIcon("src/glowny1.png");
	Icon przyk1 = new ImageIcon("src/glowny2");
	Icon ikona1 = new ImageIcon("src/1.png");
	Icon ikona2 = new ImageIcon("src/5.png");
	Icon ikona3 = new ImageIcon("src/2.png");
	Icon ikona4 = new ImageIcon("src/7.png");
	Icon ikona5 = new ImageIcon("src/4.png");
	Icon ikona6 = new ImageIcon("src/6.png");
	Icon ikona7 = new ImageIcon("src/8.png");
	Icon ikona8 = new ImageIcon("src/9.png");
	Icon ikona9 = new ImageIcon("src/3.png");
	
	Icon ikona11 = new ImageIcon("src/11.png");
	Icon ikona12 = new ImageIcon("src/12.png");
	Icon ikona13 = new ImageIcon("src/15.png");
	Icon ikona14 = new ImageIcon("src/10.png");
	Icon ikona15 = new ImageIcon("src/13.png");
	Icon ikona16 = new ImageIcon("src/18.png");
	Icon ikona17 = new ImageIcon("src/16.png");
	Icon ikona18 = new ImageIcon("src/14.png");
	Icon ikona19 = new ImageIcon("src/17.png");

	
	Puzz(){
		
		but1  = new JButton(ikona1);
		but1.setBounds(10,80,100,100);
		but2  = new JButton(ikona2);
		but2.setBounds(110,80,100,100);
		but3  = new JButton(ikona3);
		but3.setBounds(210,80,100,100);
		but4  = new JButton(ikona4);
		but4.setBounds(10,180,100,100);
		but5  = new JButton(ikona5);
		but5.setBounds(110,180,100,100);
		but6  = new JButton(ikona6);
		but6.setBounds(210,180,100,100);
		but7  = new JButton(ikona7);
		but7.setBounds(10,280,100,100);
		but8  = new JButton(ikona8);
		but8.setBounds(110,280,100,100);
		but9  = new JButton(ikona9);
		but9.setBounds(210,280,100,100);
		but10  = new JButton(przyk);
		but10.setBounds(380,220,400,400);
		
		JLabel labelka = new JLabel("Przykład: ");
		labelka.setBounds(330,200,70,20);
		JLabel label2 = new JLabel("Kliknij aby przejść do kolejnego obrazka");
		label2.setBounds(380, 320, 200,20);
		label2.setForeground(Color.black);
		
		but11 = new JButton(ikona0);
		but11.setBounds(330,5,50,50);
		//but11 = but9.getIcon();
		
		add(but1);
		add(but2);
		add(but3);
		add(but4);
		add(but5);
		add(but6);
		add(but7);
		add(but8);
		add(but9);
		add(but10);
		add(but11);
		add(labelka);
		add(label2);		
		
		but1.addActionListener(this);
		but2.addActionListener(this);
		but3.addActionListener(this);
		but4.addActionListener(this);
		but5.addActionListener(this);
		but6.addActionListener(this);
		but7.addActionListener(this);		
		but8.addActionListener(this);		
		but9.addActionListener(this);		
		but10.addActionListener(this);		
		
		setLayout(null);
		setSize(620,530);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == but1)
		{
			Icon i1 = but1.getIcon();
			if(but2.getIcon() == ikona)
			{
				but2.setIcon(i1);
				but1.setIcon(ikona);
			}
			else if(but4.getIcon() == ikona)
			{
				but4.setIcon(i1);
				but1.setIcon(ikona);
			}
		}
		
		if(e.getSource()==but2)
		{
			Icon i1 = but2.getIcon();
			if(but1.getIcon() == ikona)
			{
				but1.setIcon(i1);
				but2.setIcon(ikona);
			}
			else if(but5.getIcon()== ikona)
			{
				but5.setIcon(i1);
				but2.setIcon(ikona);
			}
			else if(but7.getIcon() == ikona)
			{
				but7.setIcon(i1);
				but4.setIcon(ikona);
			}
				
		}
		
		if(e.getSource() == but3)
		{
			Icon i1 = but3.getIcon();
			if(but2.getIcon() == ikona)
			{
				but2.setIcon(i1);
				but3.setIcon(ikona);
			}
			else if(but6.getIcon()== ikona)
			{
				but6.setIcon(i1);
				but3.setIcon(ikona);
			}
		}
		
		if(e.getSource() == but4)
		{
			Icon i1 = but4.getIcon();
			if(but1.getIcon() == ikona)
			{
				but1.setIcon(i1);
				but4.setIcon(ikona);
			}
			else if(but5.getIcon()== ikona)
			{
				but5.setIcon(i1);
				but4.setIcon(ikona);
			}
			else if(but7.getIcon()== ikona)
			{
				but7.setIcon(i1);
				but4.setIcon(ikona);
			}
		}
		
	if(e.getSource() == but5)
	{
		Icon i1 = but5.getIcon();
		if(but2.getIcon() == ikona)
		{
			but2.setIcon(i1);
			but5.setIcon(ikona);
		}
		else if(but4.getIcon()== ikona)
		{
			but4.setIcon(i1);
			but5.setIcon(ikona);
		}
		else if(but6.getIcon()==ikona)
		{
			but6.setIcon(i1);
			but5.setIcon(ikona);
		}
		else if(but8.getIcon() == ikona)
		{
			but8.setIcon(i1);
			but5.setIcon(ikona);
		}
	}
	
	if(e.getSource() == but6)
	{
		Icon i1 = but6.getIcon();
		if(but3.getIcon() == ikona)
		{
			but3.setIcon(i1);
			but6.setIcon(ikona);
		}
		else if(but5.getIcon()== ikona)
		{
			but5.setIcon(i1);
			but6.setIcon(ikona);
		}
		else if(but9.getIcon()==ikona)
		{
			but9.setIcon(i1);
			but6.setIcon(ikona);
		}
	}
	
	if(e.getSource() == but7)
	{
		Icon i1 = but7.getIcon();
		if(but4.getIcon() == ikona)
		{
			but4.setIcon(i1);
			but7.setIcon(ikona);
		}
		else if(but8.getIcon() == ikona)
		{
			but8.setIcon(i1);
			but7.setIcon(ikona);
		}
	}
	if(e.getSource() == but8)
	{
		Icon i1 = but8.getIcon(); 
		if(but7.getIcon() == ikona)
		{
			but7.setIcon(i1);
			but8.setIcon(ikona);
		}
		else if(but5.getIcon() == ikona)
		{
			but5.setIcon(i1);
			but8.setIcon(ikona);
		}
		else if(but9.getIcon() == ikona)
			but9.setIcon(i1);
			but8.setIcon(ikona);
	}
	if(e.getSource() == but9)
	{
		Icon i1 = but9.getIcon();
		if(but8.getIcon() == ikona)
		{
			but8.setIcon(i1);
			but9.setIcon(ikona);
		}
		else if(but6.getIcon()== ikona)
		{
			but6.setIcon(i1);
			but9.setIcon(ikona);
		}
	}

	if(e.getSource() == but10){
	Icon i1 = but10.getIcon();
	if(i1 == przyk)
	{
		but10.setIcon(przyk);
		but1.setIcon(ikona1);
		but2.setIcon(ikona2);
		but3.setIcon(ikona3);
		but4.setIcon(ikona4);
		but5.setIcon(ikona5);
		but6.setIcon(ikona6);
		but7.setIcon(ikona7);
		but8.setIcon(ikona8);
		but9.setIcon(ikona9);
		ikona = but9.getIcon();
		but11.setIcon(przyk);
	}
	else
	{
		but10.setIcon(przyk1);
		but1.setIcon(ikona11);
		but2.setIcon(ikona12);
		but3.setIcon(ikona13);
		but4.setIcon(ikona14);
		but5.setIcon(ikona15);
		but6.setIcon(ikona16);
		but7.setIcon(ikona17);
		but8.setIcon(ikona18);
		but9.setIcon(ikona19);
		ikona = but9.getIcon();
		but11.setIcon(przyk1);
	}
}
}
	public static void main(String Args[])
	{
	 new Puzz();	
	}
 }





















