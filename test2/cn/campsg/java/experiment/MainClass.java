package cn.campsg.java.experiment;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Score a=new Score(60.0f,70.0f);
		Student b=new Student("������",a);
		System.out.print(b.getName()+"��ʵ��ɼ���"+b.getScore().getExperiment()+",��Ŀ�ɼ�:"+b.getScore().getProject());
		

	}

}