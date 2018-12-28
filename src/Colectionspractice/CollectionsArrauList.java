package Colectionspractice;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionsArrauList {

	public static <E> void main(String[] args) {
		int a[]=new int[2]; // Static array
	//	a[0]=1; 
	//	a[1]=9;  
	//  a[2]=10;// Array out of index error (Run time) to over come this we will use collection		
		
		// Dynamic array
	// 1. can contain duplicate values
	// 2. Maintains insertion order
	// 3. Synchorized 
	// 4. Alow random accedd to fetch the element 
		
		//	Create Array list object 
		ArrayList obj=new  ArrayList();
		obj.add(1);
		obj.add(2);
		obj.add("string");
		obj.add("supreeth");
		obj.add("TEST");
	    System.out.println(obj.size());
	    
	// Again add
	    obj.add("SUPPY");
	    System.out.println(obj.size());
	    
	// Duplicate array list also can add
	    obj.add("SUPPY");
	    System.out.println(obj.size());
	    
	// Access the perticular array through index
	    System.out.println(obj.get(1));
	    
	// To print all arrays list we can use 2 options 
	    
	//    1. For loop
	//    2. Iterator
	    
	     for(int i=0;i<=obj.size();i++){
	    	System.out.println(obj.get(i));
	     }
	    
	// Genaric and non genaric 
	     
	     // NOTE: Yellow is displaying we are not defined genaric <>
	     
	     //before jdk 1.8 it is not allowing genarics 
	     
	 // Below are the example for genaric function 
	    ArrayList<Integer> obj1=new ArrayList<Integer>();
	    obj1.add(2);
	    //obj1.add("SUPREETH")  Run time error
	    
	    ArrayList<String> obj2=new ArrayList<String>();
	    obj2.add("SUHAS");
	    // obj2.add(2); Run Time Error 
	    
	   ArrayList<E> obj3=new ArrayList<E>();
	   
	    
	   
	   //Some time what we can do we can place the user defined class object in the array list 
	   
	   ArrayListExample E1=new ArrayListExample("SUP",23,"SUH1");
	   ArrayListExample E2=new ArrayListExample("SUP1",43,"SUH3");
	 //  ArrayListExample E3=new ArrayListExample("SUP2",63,"SUH"4);
	   
	   ArrayList<ArrayListExample> obj4=new ArrayList<ArrayListExample>();
	   obj4.add(E1);
	   obj4.add(E2);
	   
	   //using iterator to display the value
	   
	   
	 
	   
	   Iterator<ArrayListExample>  it= obj4.iterator();
	   while(it.hasNext()){
		   ArrayListExample result=it.next();
		   System.out.println(result.name);
		   System.out.println(result.age);		   
	   }	    

	   // Adding one list to other
	   
	   obj.addAll(obj2);
	   for(int i=0;i<=obj.size();i++){
		   System.out.println(obj.get(i));
	   }
	  //Add all , one list to other
	  // Remove all , it will remove common 
	  //Retain all , Common will get print 
	// Set(Index , value): replaceing the value 
			 // Add
			 // Remove(index) : Removing the kist 	
			  
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	}
}
