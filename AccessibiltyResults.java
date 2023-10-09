package accessibility;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class AccessibiltyResults 
{
	private ArrayList<AccessibilityTest> results = new ArrayList<>();
	
	public AccessibiltyResults(String filename)
	{
		try
		{
			File f = new File(filename);
			Scanner sc = new Scanner(f);
			String temp1;
			String temp2;
			String temp3;
			String temp4;
			String temp5;
			String temp6;
			
			while(sc.hasNextLine())
			{
				temp1 = sc.next();
				temp2 = sc.next();
				temp3 = sc.next();
				temp4 = sc.next();
				temp5 = sc.next();
				temp6 = sc.next();
				
				results.add(new AccessibilityTest(temp1, temp2, temp3, temp4, temp5, temp6));
			}
			sc.close();
		}
		catch (FileNotFoundException e)
		{
			System.err.println("File was not found.");
		}
	}
	
	public int numtests()
	{
		return results.size();
	}
	
	@SuppressWarnings("unlikely-arg-type")
	public void showTestResults(String detail)
	{
		int total = 0;
		
		for(int i = 0; i < results.size(); i++)
		{
			if(results.contains(detail))
			{
				System.out.println(results.get(i).toString());
				total++;
			}
		}
		System.out.println("Total Tests Matching: " + total);
	}
}
