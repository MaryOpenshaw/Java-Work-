
import java.util.ArrayList;

// definind the super class 
public class People {

	// defining variables for all subclasses to have making this a super class
	String name;
	int age;
	String jobTitel;
	
	// build the array list that each person will be entered into
	static ArrayList<People> PeopleList = new ArrayList<>();

	// telling the programe that name is equal to n e.c.t. the
	// paramiters defined under the class are eqaul to that peraminters that
	// will be used by
	// by the person objects that will then be assigned to that object

	public  People (String n, int a, String j) {
		name = n;
		age = a;
		jobTitel = j;

		}
		//returning the infomation
	//converts the location information into a readable string 
		public String toString () {
		return name + age + jobTitel;
		}
	

	// defing the people being entered

	// define that person one's details as defined previously are to be added to
	// the arry list
		 public static void main(String[] args) {
	People p1 = new People ("Joe Bloggs", 19, "Trainee");
	People p2 = new People ("Fred ", 8, " a");
	People p3 = new People ("Piper Halliwell ", 32, " Teacher");
	
	// build the array list that each person will be entered into
	
	{

		PeopleList.add(p1);
		PeopleList.add(p2);
		PeopleList.add(p3);

		for (int i = 0; i < PeopleList.size(); i++) {
			System.out.println(PeopleList.get(i));
		}
	}
 }
}
