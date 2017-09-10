package test;

public class Books {
private String genre; 
	
public Books(String genre){
	this.genre = genre;
}
	
public String  ToString(){
	return ("Genre:"+genre);
}
	public String returnGenre() {
		return genre;
		
	}

}
