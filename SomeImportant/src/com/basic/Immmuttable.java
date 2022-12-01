package com.basic;

public class Immmuttable {
	
		 private final int id;
		    private final String name;

		    public Immmuttable(int id, String name) {
		        this.name = name;
		        this.id = id;
		    }

		    public int getId() {
		        return id;
		    }

		    public String getName() {
		        return name;
		    }public static void main(String[] args) {
		    	Immmuttable I=new Immmuttable(1, "shan");
		    	System.out.println(I);
		    	//Immmuttable I=new Immmuttable(2, "shannu");
		    	System.out.println(I);
				
			}

}
