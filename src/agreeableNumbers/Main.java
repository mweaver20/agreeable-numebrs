//Morgan Weaver Gold#3
package agreeableNumbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		int sum1 = 1, sum2 = 1;
		
		System.out.println("Enter two numbers separated by a space:");
		String nums = input.nextLine();
		input.close();
		String[] numbers = nums.split(" ");
		int num1 = Integer.parseInt(numbers[0]);
		int num2 = Integer.parseInt(numbers[1]);
		
		int square1 = (int) Math.sqrt(num1);
		int square2 = (int) Math.sqrt(num2);
		
		for(int i = 2; i <= square1; i++) {
			if (num1 % i == 0) {
				list1.add(i);
				if (i != num1 / i) {
	                list1.add(num1 / i);
	            }
			}
		}
		
		for(int i = 2; i <= square2; i++) {
			if (num2 % i == 0) {
				list2.add(i);
				if (i != num2 / i) {
	                list2.add(num2 / i);
	            }
			}
		}
		for(int number : list1) {
			sum1 += number;
		}
		for(int number : list2) {
			sum2 += number;
		}
		
		if(sum1 != num2 && sum2 != num1) {
			System.out.println("Not agreeable numbers");
		} else {
			System.out.println("Agreeable numbers");
		}
		
	}

}
