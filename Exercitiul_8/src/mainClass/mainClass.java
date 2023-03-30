package mainClass;
import java.util.*;

import Hotel.*;
import Turist.*;

public class mainClass 
{
	public static Vector<Hotel> AdaugaTuristi()
	{
		Vector<Hotel> H = new Vector<Hotel>();
		Vector<Turist> VT = new Vector<Turist>();
		{//scope
		Turist T1=new Turist("David");
		VT.add(T1);
		}
		{
		Turist T1=new Turist("Mihai");
		VT.add(T1);
		}
		H.add(new Hotel("A", "Craiova", "1", VT)); //Ana,Mihai
		VT.clear();
		{
			Turist T1=new Turist("Marius");
			VT.add(T1);
		}
		{
			Turist T1=new Turist("Mirela");
			VT.add(T1);
		}
		H.add(new Hotel("B", "Craiova", "2", VT)); //Andreea, Marius
		VT.clear();
		{
			Turist T1=new Turist("Catalin");
			VT.add(T1);
		}
		H.add(new Hotel("C", "Timisoara", "3",VT));
		return H;
	}
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		Set<String> SET = new HashSet<String>();
		Vector<String> aux = new Vector<String>();
		Vector<Hotel> H = new Vector<Hotel>();
		H = AdaugaTuristi();
		
		for (int i = 0; i < H.size(); i++) 
		{
			//afisez toate hotelurile
			//System.out.println(H.get(i).GetNume());
			SET.addAll(H.get(i).GetNumeTurist());
			//System.out.println(H.get(i).GetNumeTurist());
		}
		
		//mut hotelul la o noua adresa
		System.out.println("Introduceti numele hotelului:");
		String m = in.nextLine();
		System.out.println("Introduceti noua adresa:");
		String n = in.nextLine();
		for (int i = 0; i < H.size(); i++) 
		{
			if(H.get(i).GetNume().compareTo(m) == 0)
				{
				H.get(i).SetAdresa(n);
				System.out.println("Adresa schimbata!");
				}
		}
		
		//mut turistul la o noua adresa
		System.out.println("Numele turistului:");
		String o = in.nextLine();
		System.out.println("Hotelul la care se muta:");
		String p = in.nextLine();
			for(int i=0;i<H.size();i++)
				H.get(i).StergereTurist(o);
			for(int i=0;i<H.size();i++)
				if(H.get(i).GetNume().compareTo(p) == 0)
				{
					H.get(i).AdaugareTurist(o);
					break;
				}
		
		
		//afisez toate persoanele
		//pentru ca sunt stocate intr-un set, daca mai multe au acelasi nume, atunci va fi afisat+memorat decat o singura data
		System.out.println("Toate persoanele/turistii:");
			 Iterator itr = SET.iterator();
			while (itr.hasNext())
	            System.out.println(itr.next());
}}
