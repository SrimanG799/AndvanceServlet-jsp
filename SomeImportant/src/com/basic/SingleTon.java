package com.basic;

public class SingleTon {
	private static SingleTon singleTon=null;
	private SingleTon()
	{
		
	}
	public static SingleTon getInstance() {
		if(singleTon==null)
		{
			singleTon=new SingleTon();
		}
		return singleTon;
		
	}

}
class Test{
	public static void main(String[] args) {
		SingleTon s=SingleTon.getInstance();
		SingleTon s1=SingleTon.getInstance();
		SingleTon s2=SingleTon.getInstance();
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
			
	}
}
