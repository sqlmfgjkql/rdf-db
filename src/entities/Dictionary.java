package entities;

import java.util.HashMap;

public abstract class Dictionary  {

	static HashMap<String, Integer>  dictionary = new HashMap<String, Integer>();
	
	public static void addResource(String key, int value)
	{
		// mon test		
		dictionary.put(key, value);
	}
	
	public static int getValue(String key)
	{
		return dictionary.get(key);
	}
	
}
