package stupid.controller;

import stupid.model.PopupController;
import java.util.List;
import java.util.ArrayList;
import stupid.model.ThirdStupid;

public class ThrowAwayController 
{
	private String[] words  = {"Eli's", "birthday", "is", "on", "Friday."};
	private int [] numbers;
	private ThirdStupid [] stupids;
	
	private PopupController display;

	public ThrowAwayController()
	{
		words = new String[5];
		numbers = new int [10];
	}
	public void start()
	{
		System.out.println("My name is Amber and I am a hipster!");
		System.out.println(words);
		System.out.println(numbers);
		numbers [0] = 1;
		numbers [1] = 2;
		numbers [2] = 3;
		//... keep  going or use a loop
		//words = new String[40];
		words = new String[] { "He", "will", "be", "eight", "years old"};
		
		
		for (int index = 0; index < numbers.length; index += 1)
		{
			numbers[index] = index + 1;
		}
		showLoopWithArray();
	}
	private void showLoopWithArray()
	{
		for (String current : words)
		{
			System.out.println(current);
		
		}
		for (int index = 0; index < numbers.length; index += 1)
		{
			System.out.println(numbers[index]);
		}

	}
}
