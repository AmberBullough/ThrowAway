package stupid.controller;

import stupid.model.PopupController;
import java.util.List;
import java.util.ArrayList;

public class ThrowAwayController 
{
	private String[] words;
	private int [] numbers;
	
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
