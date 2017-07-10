package cn.campsg.java.experiment;

public class Student {

	Score score=new Score();
	String name=null;
	 public String getName(){
		  return name;
		  
	  }
	  public void setName(String newname){
		  name=newname;
	  }
	  public Score getScore(){
		  return score;
		  
	  }
	  public void setScore(Score newscore){
		  score=newscore;
	  }
	  
	  Student(){  
	  }
	  
	  public Student(String name,Score score){
		  this.name=name;
		  this.score=score;
		  
	  }
}
