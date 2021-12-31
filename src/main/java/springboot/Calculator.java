package com.launchclub.springboot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Calculator {
	public List<String> cal(int Month, int Day)
	{
		String[] m=new String[]{"jan","Feb","March","April","may","June","July","August","sep","Öct","Nov","Dec"};
	    String[] d=new String[]{"sunday","Monday","tuesday","wednesday","thursday","Friday","saturday"};
	    int i;
	    List<String> date = new ArrayList<String>();
	    System.out.print("Input");
	    int month = Month;
	    int day = Day;
	    for(i=0;i<=12;i++)
	    {
	        if(i==month)
	        {
	            date.add(m[i-1]);
	        }
	    }
	    for(i=0;i<=7;i++)
	    {
	        if(i==day)
	        {
	            date.add(" " +d[i-1]);
	        }
	    }
	    System.out.println(date);
		return date;
		
	}
}
