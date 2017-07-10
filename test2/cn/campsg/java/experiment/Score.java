package cn.campsg.java.experiment;

public class Score {

	 float Experiment;
	 float Project;
	 
	 public float getExperiment(){
		  return Experiment;
		  
	  }
	  public void setExperiment(float nExperiment){
		  Experiment=nExperiment;
	  }
	  public float getProject(){
		  return Project;
		  
	  }
	  public void setProject(float nProject){
		  Project=nProject;
	  }
	  
	  Score(){  
	  }
	  
	  public Score(float Experiment,float Project){
		  this.Experiment=Experiment;
		  this.Project=Project;
		  
	  }
	  

}