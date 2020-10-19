package rocket_media_Technologies_Pvt_Ltd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count =0;
		Scanner sc = new Scanner(System.in);
		String all = sc.nextLine();
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (String s : all.split(" "))  
		{  
		   al.add(Integer.parseInt(s));  
		}
		Collections.sort(al);
		for(int i =0;i<al.size();i++) {
			for(int j = i+1;j<al.size();j++) {
				if(al.get(i)==al.get(j)) {
					count++;
					al.remove(j);
					break;
				}
			}
		}
		System.out.println(count);
	}
}
