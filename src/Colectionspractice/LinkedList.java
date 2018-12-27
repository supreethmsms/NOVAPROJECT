package Colectionspractice;

import java.util.ArrayList;
import java.util.Iterator;

public class LinkedList {

	private static final boolean Integer = false;

	public static void main(String[] args) {
		

		 
		 ArrayList<Integer> obj1=new ArrayList<Integer>();
		 obj1.add(2);
		 obj1.add(4);
		 obj1.add(7);
		 
		 Iterator<Integer> itr=obj1.iterator();
		 while(itr.hasNext()){
			 System.out.println(itr.next());
			 
		 }
		 
		 
		 // We can print in row wise also 
		 
		// System.out.println("Series of list is"+ obj1);
		 
		 // we can print values through follwing types
		 //1. Forloop
		 //2. Special for loop
		 //3. iterator
		 //4. While 
		 
		// Normal loop
		// for(int i=0;i<=obj1.size();i++){
		//	System.out.println(obj1.get(i));
		//}
		 
		 // Special loop
		  
		// For(Integer str:obj1){
		// system.out.println(obj1)	 
		 
		 //while loop
		// int num=0;
		// while(obj1.size()>num){
		// System.out.println(obj1.get(num));
		//	 num++;
		 }
	     }


