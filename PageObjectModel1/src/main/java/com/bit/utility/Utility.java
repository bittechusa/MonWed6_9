package com.bit.utility;

import java.util.Arrays;

import org.junit.Test;

public class Utility 
{
	@Test
	public void breakContinue()
	{
		for(int i=1;i<10;i++)
		{
			if(i==3)
			{
				System.out.println("dont click");
				continue;//it will skip where conditio match
				//break;//it will stop the loop
			}
				System.out.println(i);
			
		}
	}
	
	@Test
	public void whileLoop()
	{
		boolean flag=true;
		while(flag)
		{
			int a=9;
			if(a<9)
			{
				flag=false;
			}
			a++;
		}
		System.out.println("Finish");
		
	}
	
	@Test
	public void arrayDeclare()
	{
		int a=7;
		int c[]= new int[3];//same type and fix size
		c[0]=5;
		c[1]=7;
		c[2]=0;
		//c[3]=6;//it will throw a ArrayOutOfBoundaryException because of size
		System.out.println(c[0]);
	}
	
	@Test
	public void replaceArrayWithAnotherArray()
	{
		int c[]=new int[3];//same type and fix size
		c[0]=5;
		c[1]=7;
		c[2]=0;
				
		int d[]=c.clone();//easy way to copy from one array to another
		//another way to copy
		int x[]=new int[c.length];
		for(int i=0; i<c.length; i++)
		{
			x[i]=c[i];
		}
		//to see print only
		for(int j=0;j<x.length;j++)
		{
			System.out.println(x[j]);
		}
	}
	
	@Test
	public void printMaxNumberFromAnArray()
	{
		//print max num ber from array
				int b[]={4,5,6,3,10,2,123,234,554,6,6,55,6,65,5,7,8,9,7,56,6,7887};
				int max=b[0];
				for(int i=1; i<b.length; i++)
				{
					if(b[i]>max)
					{
						max=b[i];
					}
				}
				System.out.println(max);
	}
	
	@Test
	public void printValueUsingForEachLoop()
	{
		int b[]={4,5,6,3,10,2,123,234,554,6,6,55,6,65,5,7,8,9,7,56,6,7887};
		System.out.println(b[0]);//print first index
		//print array
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		
		//print value using each loop or enhanced loop
		String color[]={"blue","red","black"};
		for(String s:color)
		{
			System.out.println(s);
		}
		
	}
	
	@Test
	public void printArrayInAscendingOrDescendingOrder()
	{
		int b[]={4,5,6,3,10,2,123,234,554,6,6,55,6,65,5,7,8,9,7,56,6,7887};
		
		//print array by accending order
		Arrays.sort(b);//accending order
		
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		
		//print array by descending order
		Arrays.sort(b);
		for(int i=b.length-1; i>=0; i--)
		{
			System.out.println(b[i]);
		}
		
		
	}
	

}
