package _03_More_Algorithms;

import java.util.List;

/*
 * Write your methods in this class
 */
public class Algorithms {
    
    public static String multiply(int num1, int num2) {
        int product = num1 * num2;
    	return num1 + " x " + num2 + " = " + product;
    }
    
    public static Boolean isPrime(int num)
    {
    	for (int i = 2; i <= Math.sqrt(num); i++)
    	{
    		double x = (double)num / (double)i;
    		
    		if (x % 1 == 0)
    		{
    			return false;
    		}
    	}
		return true;
    }
    
    public static Boolean isSquare(int num)
    {
    	if (Math.sqrt(num) % 1 == 0)
    	{
    		return true;
    	}
    	else
    	{
    		return false;
    	}
    }
    
    public static Boolean isCube(int num)
    {
    	for (int i = 0; i <= num; i++)
    	{
    		if (Math.pow(i, 3) == num)
    		{
    			return true;
    		}
    	}
    	return false;
    }
    
    public static int findBrokenEgg(List<String> eggs) {
        for (int i = 0; i < eggs.size(); i ++)
        {
        	if(eggs.get(i) == "cracked")
        	{
        		return i;
        	}
        }
    	return -1;
    }
    
    public static int countPearls(List<Boolean> oysters)
    {
    	int pearls = 0;
    	for (int i = 0; i < oysters.size(); i++)
    	{
    		if (oysters.get(i) == true)
    		{
    			pearls ++;
    		}
    	}
    	return pearls;
    }
    
    public static Double findTallest(List<Double> heights)
    {
    	double maxHeight = 0;
    	for (int i = 0; i < heights.size(); i++)
    	{
    		if (heights.get(i) > maxHeight)
    		{
    			maxHeight = heights.get(i);
    		}
    	}
    	return maxHeight;
    }
    
    public static String findLongestWord(List<String> words)
    {
    	String longestWord = "";
    	for (int i = 0; i < words.size(); i++)
    	{
    		if (words.get(i).length() > longestWord.length())
    		{
    			longestWord = words.get(i);
    		}
    	}
    	return longestWord;
    }
    
    public static Boolean containsSOS(List<String> Message)
    {
    	if (Message.contains("... --- ..."))
    	{
    		return true;
    	}
    	else
    	{
    		return false;
    	}
    }
    
    public static List<Double> sortScores(List<Double> scores)
    {
    	for (int i = 0; i < scores.size(); i++)
    	{
    		for (int j = 0; j < scores.size() - 1; j++)
    		{
    			if (scores.get(j) > scores.get(j + 1))
    			{
    				double temp = scores.get(j);
    				scores.set(j, scores.get(j + 1));
    				scores.set(j + 1, temp);
    			}
    		}
    	}
		return scores;
    }
    
    public static List<String> sortDNA(List<String> DNA)
    {
    	for (int i = 0; i < DNA.size(); i++)
    	{
    		for (int j = 0; j < DNA.size() - 1; j++)
    		{
    			if (DNA.get(j).length() > DNA.get(j + 1).length())
    			{
    				String temp = DNA.get(j);
    				DNA.set(j, DNA.get(j + 1));
    				DNA.set(j + 1, temp);
    			}
    		}
    	}
    	return DNA;
    }
    
    public static List<String> sortWords(List<String> names)
    {
    	for (int i = 0; i < names.size(); i++)
    	{
    		for (int j = 0; j < names.size() - 1; j++)
    		{
    			if (names.get(j).compareTo(names.get(j + 1)) > 0)
    			{
    				String temp = names.get(j);
    				names.set(j, names.get(j + 1));
    				names.set(j + 1, temp);
    			}
    		}
    	}
    	return names;
    }
}
