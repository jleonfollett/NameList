package namePrint;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class getNames {
	public static void main (String[] args){
	int numbofnames = 0;
	String stop = "Nope";
	Scanner enter = new Scanner(System.in);
	System.out.println("Enter list of names one at a time.  When done enter 'stop'");
	ArrayList<String> listNames = new ArrayList<String>();
	while (stop.equals("Nope")){
	String names = enter.nextLine();
	if (names.toLowerCase().equals("stop")){
		stop = "Yes";
		System.out.println("You have entered a total of " + numbofnames + " names.");
	}
	else {
		listNames.add(names);
		numbofnames++;
		System.out.println("Enter next.  You have already entered " + numbofnames + " names so far.");
	}
	}
	String[] arrayList = listNames.toArray(new String[listNames.size()]);
	Arrays.sort(arrayList);
	for (int i = 0; i < arrayList.length; i++){
		int x = i;
		int numboftimes = 1;
		if  (x+1 <= arrayList.length - 1){
		if (arrayList[x].equals(arrayList[x+1])){
			boolean inloop = true;
			while (x+1 <= arrayList.length - 1 && inloop == true){
				if (arrayList[x].equals(arrayList[x+1])){
				numboftimes++;
				x++;
				i++;
				}
				else {
					inloop = false;
				}
			}			
		}
		}
		if (numboftimes > 1){
			System.out.print(arrayList[i] + " - " + numboftimes + "\n \n");
		}
		else{
		System.out.print(arrayList[i] + "\n \n");
		}
	}
	enter.close();
	}
}
