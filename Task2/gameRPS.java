/*
author: yavuz ;)
*/

import java.util.Scanner;

public class gameRPS {

	public static void main(String[] args) {
		String nickname1=getNickname();
		String nickname2=getNickname();
		
		
	if(game().equals("choosing1")) {
			System.out.println(nickname1 +"is winner");
		}
	else if(game().equals("choosing2")){
		System.out.println(nickname2 +"is winner");
	}

	}

	public static String getNickname() {
	//create a Scanner because we get a nickname.
		Scanner scan = new Scanner(System.in); 
		System.out.println("write a nickname");
		String nickname1=scan.nextLine();
		return nickname1;
	}
		public static String game() {
			//we get numbers by users. and we assign numbers to the variables.

			int choosing1;
			int choosing2;
			String winner ="we have a problem.";
			System.out.println("choose rock(1) or paper(3) or scissors(2)");
			System.out.println("just write a number");
	//create a scanner 
			Scanner scan = new Scanner(System.in);

			System.out.println("choosing1:");
			choosing1 = scan.nextInt();

			System.out.println("choosing2:");
			choosing2 = scan.nextInt();
	//decide winner by comparing user inputs.
			if (choosing1 == choosing2) {
				System.out.println("berabere");
			} else if  (choosing1==1 && choosing2==2) {
				winner="choosing1";
			}
			else if(choosing1==1 && choosing2==3)
		{
			//assigning the winner.
			winner="choosing1";
			}
			else if (choosing1==2 && choosing2==3){
			
			winner="choosing1";
			}
			else if(choosing1==3 && choosing2==1)
			{
				winner="choosing2";
				}
			else if(choosing1==3 && choosing2==2) {
		
					winner="choosing2";
					}
			else if(choosing1==2 && choosing2==1)
					{
						winner="choosing2";
						}
			
			//for using main method.
			return winner ;
		}
		}
	