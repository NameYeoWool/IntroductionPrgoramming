package edu.skku.school;

public class Test {
	
	public static void main(String[] args) {
		Student s = new Student();
		s.num = 2017001;
		s.name="±èÃ¶¼ö";
		s.score = 50;
		s.study();
		s.study(2);
		s.play(3);
		
		
		Student s2 = new Student();
		s2.num = 2017002;
		s2.name = "¼Ò³ª¹«";
		s2.score =70;
		s2.play(4);
		s2.study();
		
		Student s3 = new Student(2017003, "ÀÌ¿µÈñ",90);
		Student s4 = new Student(2017004, "°­³ª·ç");
		
	}

}
