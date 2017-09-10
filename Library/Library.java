package Library;

import java.util.ArrayList;

public class Library 
{

	ArrayList <Members> MembersList = new ArrayList <Members> ();
	ArrayList <ReadingMaterial> ReadingList  = new ArrayList <ReadingMaterial> ();
	ArrayList <Resources> ReasourcesList = new ArrayList <Resources> ();
	ArrayList <Maps> MapsList = new ArrayList <Maps> ();
	
	
	public ReadingMaterial r; 
	public Members m;
	public Resources a;
	public Maps b;
	
	
	public void addMember ()
	{
		MembersList.add(m);
	}

	public void addMaterial ()
	{
		ReadingList.add(r); 
	}
	
	public void addResource  ()
	{
		ReasourcesList.add(a); 
	}
	
	public void addMap ()
	{
		MapsList.add(b);
	}
	
	
	public void showMembers ()
	{
		for (Members m : MembersList ) 
		{
		System.out.println(m);
		}
	}
	
	public void showMaterial ()
	{
		for (ReadingMaterial r : ReadingList) 
		{
		System.out.println(r);
		}
	}
	
	public void showResources ()
	{
		for (Resources a : ReasourcesList) 
		{
		System.out.println(a);
		}
	}
	
	public void showMaps ()
	{
		for (Maps b : MapsList) 
		{
		System.out.println(b);
		} 
	}
	
}
