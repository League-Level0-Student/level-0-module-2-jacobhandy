//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {

		// 1. OPTIONAL: Watch the first 2 minutes of this movie: http://vimeo.com/2485018
		
		int randomNumber = new Random().nextInt(5);
		
		// 2. On paper, write all the numbers that get printed when you run this class 10 times
		//4,2,1,1,3,0,2,2,1,1
		System.out.println(randomNumber);

		// 3. Use each value of randomNumber to give the user a random compliment.
Random gen = new Random();
int r = gen.nextInt(10);
if(r==1) JOptionPane.showMessageDialog(null, "If you prefer Star Wars over Star Trek, look in a mirror. Then you will see a legendary human.");
if(r==2) JOptionPane.showMessageDialog(null, "If you prefer Star Trek over Star Wars, then I feel bad for you and your family.");
if(r==3) JOptionPane.showMessageDialog(null, "Good job surrviving!"); 
if(r==4) JOptionPane.showMessageDialog(null, "If you were a movie, then RottenTomatoes would give you a 100%"); 
if(r==5) JOptionPane.showMessageDialog(null, "YeEeEEEEEEeeeeeEEEEeEEeeEEEEeeEeEeE33333EEEEeee!"); 
if(r==6) JOptionPane.showMessageDialog(null, "You are good"); 
if(r==7) JOptionPane.showMessageDialog(null, "If you are reading this, you have won 5 billion dollars!"); 
if(r==8) JOptionPane.showMessageDialog(null, "Remember that message about the 5 billion dollars, that was actually a mistake. That was supposed to go to me. JKLOLOLOLOLOLOLOLOLOLOLXDXDXDXDXD"); 
if(r==9) JOptionPane.showMessageDialog(null, "You are 10/10."); 
if(r==10) JOptionPane.showMessageDialog(null, "I ran out of things to say."); 
		// 4. Repeat all the code above 10 times
		
		// 5. Find someone to test out your program. They will like it :)
	}
}
