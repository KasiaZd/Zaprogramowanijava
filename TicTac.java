package TicTac;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class TicTac extends JFrame implements ItemListener, ActionListener{
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
	
	JButton b[] = new JButton[9];
	JButton reset;		
	Icon ikona1, ikona2, ikona3, ikona4;
	
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
		  
			  
		  }

