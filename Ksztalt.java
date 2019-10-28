package starter;
import java.util.*;
import java.io.*;
import java.lang.*;

abstract class Ksztalt
{
	private String nazwa;

	  public Ksztalt() {
	    this.nazwa = "Kształt";
	  }

	  public Ksztalt(String nazwa) {
	    this.nazwa = nazwa;
	  }

	  public String getNazwa() {
	    return this.nazwa;
	  }

	  public void setNazwa(String nazwa) {
	    this.nazwa = nazwa;
	  }

	  public abstract void rysuj();
	  
	  public abstract double getPole();

	  public abstract double getParametr();
	}
