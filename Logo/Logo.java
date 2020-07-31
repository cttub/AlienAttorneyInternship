public class Logo{

	//Logo Properties
	private String position;
	private String shape;
	private String color;
	

	//contructor
	public Logo(String p,String s,String c){
		this.position = p;
		this.shape = s;
		this.color = c;
	}

//getters
public String getPosition(){
	return this.position;
}

public String getShape(){
	return this.shape;
}

public String getColor(){
	return this.color;
}

//setters
public void setPosition(String p){
	this.position = p;
}

public void setShape(String s){
	this.shape = s;
}

public void setColor(String c){
	this.color = c;
}
//prints out shape
public void print(){
	System.out.println("Your Logo is: \nShape: "+this.shape+"\nColor: "+this.color+"\nPosition: "+this.position);
}

}//end of class