import java.util.*;
public class StudentGradeCalculator
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int a[]=new int[6];
	    int tm=0;
	    System.out.println("Enter Marks obtained in each subject(out of 100):");
	    for(int i=0;i<6;i++){
	        tm+=sc.nextInt();
	    }
	    float avg=tm/6;
	    String grade;
	    if(avg>90 && avg<=100)
	    grade="O";
	    else if(avg>80 && avg<=90)
	    grade="A+";
	    else if(avg>70 && avg<=80)
	    grade="A";
	    else if(avg>60 && avg<=70)
	    grade="B+";
	    else if(avg>50 && avg<=60)
	    grade="B";
	    else if(avg>40 && avg<=50)
	    grade="C";
	    else
	    grade="Fail";
		System.out.println("Total Marks: "+tm);
		System.out.println("Average Percentage: "+avg);
		System.out.println("Grade: "+grade);
	}
}