import java.util.*;
public class NumberGame
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Guess the Number\nRange=[1,100]");
	    System.out.println("(Note: You have 10 attempts)");
	    System.out.println("Do you want to start the game?");
	    System.out.println("Type 'Yes' to continue the game and 'No' to quit the game");
	    String play=sc.next();
	    int ts=0;
	    while(play.toLowerCase().equals("yes")){
			int num=generate();
			System.out.println("Guess the number: ");
			int count=0,s=0;
			int a[]={100,90,80,75,70,65,60,55,50,45};
			int guess=sc.nextInt();
			count++;
			while(count<10){
				if(guess==num){
					System.out.println("Congrats! Your Guess is correct.");
					break;
				}
				else if(guess<num){
					System.out.println("Your Guess is lesser than the number");
				}
				else{
					System.out.println("Your Guess is greater than the number");
				}
				System.out.println("Take another guess");
				guess=sc.nextInt();
				count++;
			}
			if(count>10){
				System.out.println("Oops! You're out of attempts.");
			}
			if(count==10){
				if(guess==num){
					System.out.println("Congrats! Your Guess is correct.");
				}
				else{
					System.out.println("Wrong answer.\nYou ran out of attempts.");
				}
			}
			if(count==10){
			    s=0;
			}
			else
			s=a[count-1];
			ts+=s;
			System.out.println("Score: "+s);
			System.out.println("Total Score: "+ts);
			System.out.println("Do you want to play again?");
			System.out.println("Type 'Yes' to continue the game and 'No' to quit the game");
			play=sc.next();
		}
	    if(play.toLowerCase().equals("no")){
	        System.out.println("Game Exited");
	    }
	}
	public static int generate(){
	    Random r=new Random();
	    int n=1+r.nextInt(100);
	    return n;
	}
}