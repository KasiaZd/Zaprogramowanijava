package TicTac;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class  TicTac extends JFrame implements ItemListener, ActionListener{
	int i, j, ii, jj, x, y, taknie;
	int a[][] = { {10, 1, 2, 3, 11},
				  {10, 1, 4, 7, 11},
				  {10, 1, 5, 9, 11},
				  {10, 2, 5, 8, 11},
				  {10, 3, 5, 7, 11},
				  {10, 3, 6, 9, 11},
				  {10, 4, 5, 6, 11},
				  {10, 7, 8, 9, 11}};

	int akopia[][] = {{10, 1, 2, 3, 11},
					  {10, 1, 4, 7, 11},
					  {10, 1, 5, 9, 11},
					  {10, 2, 5, 8, 11},
					  {10, 3, 5, 7, 11},
					  {10, 3, 6, 9, 11},
					  {10, 4, 5, 6, 11},
					  {10, 7, 8, 9, 11}};
	boolean stan, typ, ustaw; 
	
	Checkbox c1, c2;
	
	JButton b[] = new JButton[9];
	JButton reset;		
	Icon ikona1, ikona2, ikona3, ikona4, icon;
	
	public void ekranGlowny() {
		x = 10; y = 10; j = 0;
		for(i=0; i<=8; i++, x+=100, j++) 
		{
			b[i] = new JButton();
				if (j==3)
					{
						j= 0; y+=100; x=10;
					} 
				b[i].setBounds(x,y,100,100);
				add(b[i]);
				b[i].addActionListener(this);
		}
		
		reset = new JButton("Reset");
		reset.setBounds(100, 350, 100, 50);
		add(reset);
		reset.addActionListener(this);
	}

	public void sprawdz(int num) {
		for(ii=0;ii<=7; ii++)
		{
			for(jj=1; jj<=3; jj++)
			{
				if(a[ii][jj] ==num)
				{
					a[ii][4] = 11;
				}
			}
		}
	}
		
	 public void logika(int numb) {
		  for(i=0;i<=7;i++) 
		  {
			for(j=1;j<=3;j++) 
			{
				if(a[i][j] == numb)
				{
					a[i][0]=11;
					a[i][4] = 10;
				}
			}
		  }
		  for(i=0; i<=7; i++)
		  {
			  ustaw = true;
			  if(a[i][4]==10)
			  {
				  int licz = 0;
				  for(j=1; j<=3; j++)
				  {
					  if(b[(a[i][j]-1)].getIcon()!=null)
					  {
						  licz++;
					  }
					  else 
					  {
						  taknie = a[i][j];
					  }
					  if(licz ==2)
					  {
						  b[taknie -1].setIcon(ikona1);
						  this.sprawdz(taknie);
						  ustaw= false;
						  break;
					  }
				  }
			  }
				  else
					  if(a[i][0]==10)
					  {
						  for(j=1;j<=3;j++)
						  {
							  if(b[(a[i][j]-1)].getIcon()==null)
							  {
								  b[(a[i][j]-1)].setIcon(ikona1);
								  this.sprawdz(a[i][j]);
								  ustaw = false;
								  break;
							  }
						  }
						  if(ustaw == false)
							  break;
					  }
				  if(ustaw == false)
					  break;
			  }
		  }
		  
	TicTac(){
		super("Kółko krzyżyk");
		
		CheckboxGroup cbg = new CheckboxGroup();
		c1 = new Checkbox("vs komputer");
		c2 = new Checkbox("vs człowiek");
		c1.setBounds(120,80,100,40);
		c2.setBounds(120,150,100,40);
		
		add(c1);
		add(c2);
		c1.addItemListener(this);
		c2.addItemListener(this);
		
		stan = true;
		typ = true;
		ustaw = true;
		
		ikona1 = new ImageIcon("ikona1.png");
		ikona2 = new ImageIcon("ikona2.png");
		ikona3 = new ImageIcon("ikona3.png");
		ikona4 = new ImageIcon("ikona4.png");
		
		setLayout(null);
		setSize(400, 450);
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}		  
	
	public void itemStateChanged(ItemEvent e) {
		if(c1.getState())
		{
			typ = false;
		}
		else if (c2.getState()) {
			typ = true; 
	}
	remove(c1); 
	remove(c2);
	repaint(0,0,400, 450);
	ekranGlowny();
}

public void actionPerformed(ActionEvent e)
{
	if(typ == true) //logika dla dwóch osób
	{
		if(e.getSource() == reset){
			for(i=0;i<=8; i++) {
				b[i].setIcon(null);
	}
	}
else {
	for(i=0;i<=8;i++) {
	if(e.getSource() == b[i]) {
		if(b[i].getIcon() == null)
		{
			if(stan == true) {
				icon = ikona2;
				stan = false;
			}
			else 
			{
				icon = ikona1;
				stan = true;
			}
			b[i].setIcon(icon);
		}
	}	
	}
}
}
else if (typ == false) // logika dla gry z komputerem
{
	if(e.getSource() == reset){
		for(i=0;i<=8; i++)
		{
			b[i].setIcon(null);
		}
		for(i=0; i<=7; i++)
		for(j=0;j<=4;j++)
			a[i][j] = akopia[i][j];
	}
	else {
		for(i=0; i<=8; i++) {
			if(e.getSource() == b[i])
			{
				if(b[i].getIcon() == null)
				{
					b[i].setIcon(ikona1);
					if(b[4].getIcon() == null)
					{
						b[4].setIcon(ikona2);
						this.sprawdz(5);
					}
					else
					{
						this.logika(i);
				}
			}
		}
	}
}
}
	
for(i = 0; i<=7; i++)
{
	Icon ikona11 = b[(a[i][1]-1)].getIcon();
	Icon ikona22 = b[(a[i][2]-1)].getIcon();
	Icon ikona33 = b[(a[i][3]-1)].getIcon();
	
		if((ikona11 == ikona22)&&(ikona22 == ikona33)&&(ikona11 != null))
		{
			if(ikona11 == ikona1) {
				b[(a[i][1]-1)].setIcon(ikona3);
				b[(a[i][2]-1)].setIcon(ikona3);
				b[(a[i][3]-1)].setIcon(ikona3);
				JOptionPane.showMessageDialog(TicTac.this, "Wygrałeś, kliknij Reset");
				break;
			}
			else if(ikona11 == ikona2) {
				b[(a[i][1]-1)].setIcon(ikona4);
				b[(a[i][2]-1)].setIcon(ikona4);
				b[(a[i][3]-1)].setIcon(ikona4);
				JOptionPane.showMessageDialog(TicTac.this, "Przegrałeś, kliknij Reset");
				break;

			}
		}
	}
}
	
	
  public static void main(String[] args) {
    new TicTac();
  }
}
