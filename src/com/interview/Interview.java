package com.interview;

public class Interview {
	public void smallest(int[] numbers) {
		int i=0;
		int j=0;
		int k=0;
		int length=numbers.length;
		int temp;

		for(i=0;i<length-1;i++)
			for(j=i+1;j<length;j++) {
				if(numbers[i]>numbers[j]) {
					temp=numbers[i];
					numbers[i]=numbers[j];
					numbers[j]=temp;					
				}
//				System.out.println(numbers[i]);
			}
		System.out.println("The least 2 numbers are");
		for(k=0;k<2;k++)
			System.out.println(numbers[k]);

	}
	public static void main(String[] args) {
		Interview intv=new Interview();
		//		int numbers=new
		int numbers[]= {56,45,78,89,12,56,23};
		intv.smallest(numbers);

	}

}
