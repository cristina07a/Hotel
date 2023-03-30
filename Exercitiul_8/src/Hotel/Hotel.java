package Hotel;
import Turist.*;
import java.util.Vector;

public class Hotel 
{
	String nume;
	String oras;
	String adresa;
	Vector<Turist> T = new Vector<Turist>();
	
	public Hotel(String string, String string2,String string3, Vector<Turist> VT)
	{
		nume=string;
		oras=string2;
		adresa = string3;
		T.addAll(VT);
	}
	
	public void StergereTurist(String o)
	{
		for (int i=0;i< T.size();i++)
			if(T.get(i).GetNume().compareTo(o) == 0)
				T.remove(i);
	}

	
	public void SetAdresa(String adr)
	{
		adresa = adr;
	}
	
	public void SchimbaAdresa(String locatie)
	{
		adresa = locatie;
		System.out.println("Hotelul "+nume + " s-a mutat la adresa" +adresa);
	}
	


	public void dateHotel()
	{
		System.out.println("Nume hotel: " +nume + " Oras: " +oras + "Turisti: ");
		for(int i = 0; i < T.size(); i++)
		{
			System.out.println(T.get(i).GetNume());
		}
	}

	public String GetNume() {
		return nume;
	}

	public Vector<String> GetNumeTurist()
	{
		Vector<String> aux = new Vector<String>();
		for(int i = 0; i < T.size(); i++)
			aux.add(T.get(i).GetNume());
		return aux;
	}

	public void AdaugareTurist(String o) 
	{
		Turist T1= new Turist(o);
		T.add(T1);
	}

}
