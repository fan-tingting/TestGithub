package cn.campsg.java.experiment;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Score a=new Score(60.0f,70.0f);
		Student b=new Student("黄世仁",a);
		System.out.print(b.getName()+"的实验成绩："+b.getScore().getExperiment()+",项目成绩:"+b.getScore().getProject());
		

	}

}