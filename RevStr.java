package nuts.NutsAndBolts;

//Reverse the string by implicitly swapping elements in array

//time complexity O(n)
//space complexity O(1)

import java.util.Scanner;

public class RevStr {
	public void reverse(String word)
	{
		char[] arr = word.toCharArray();
		int i=0;
		int j=arr.length - 1;
		while(i<j)
		{
			char a = arr[i];
			arr[i] = arr[j];
			arr[j] = a;
			i++;
			j--;
		}
		for(int k=0; k<arr.length; k++)
		{
			System.out.print(arr[k]);
		}
	}
	public static void main(String args[])
	{
		RevStr obj = new RevStr();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String word = sc.next();
		System.out.println("Reversed String: ");
		obj.reverse(word);	
	}
}
