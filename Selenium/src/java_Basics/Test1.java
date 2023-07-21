package java_Basics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Test1 {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		String values[]= {"loss","loss","loss","loss","loss", "loss", "loss"};
		List<String > value_list = new ArrayList<String>();
		Collections.addAll(value_list, values);
		System.out.println("List of values  :"+ value_list);
		int size = value_list.size();
		int loss=0;
		int win = 0;
		boolean found_loss =false;
		boolean found_win =false;
		for(int i =0;i<size;i++) {
			if(value_list.get(i).contains("loss")) {
				found_loss=true;
				loss++;
			}
		}
			for(int j =0;j<size;j++) {
				if(value_list.get(j).contains("win")) {
					found_win=true;
					win++;
				}	
		}
		System.out.println("loss count:  "+ loss);	
		System.out.println("win count:  "+ win);
		
		if(loss==0) {
			System.out.println("arjun win all games");
			System.out.println("Grand Master");
		}else if (win>=5) {
			System.out.println("arjun win 5 or morethen 5 gmes");
			System.out.println("Grand Master");
		}else if (win==0) {
			System.out.println("arjun loss all games");
			System.out.println(" Master");	
		}else {
			System.out.println("arjun eaither win 5 or more the 5 games or loos all games");
			System.out.println(" international Master");	
		}
		
		
		
		
	}

}
