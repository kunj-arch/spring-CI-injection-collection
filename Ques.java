package spring7;

import java.util.Iterator;
import java.util.List;

public class Ques {
	private int id;
	private String name;
	private  List<String> Ans;
	
	public Ques() {}
	public Ques(int id , String name , List<String>Ans) {
		super();
		this.id=id;
		this.name=name;
		this.Ans=Ans;}
		
		public void displayInfo(){  
		    System.out.println(id+" "+name);  
		    System.out.println("answers are:");  
		    Iterator<String> itr=Ans.iterator();  
		    while(itr.hasNext()){  
		        System.out.println(itr.next());  
		
	}

		}
}