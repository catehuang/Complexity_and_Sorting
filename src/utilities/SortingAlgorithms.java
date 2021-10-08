package utilities;

import java.util.Comparator;

import problemDomain.Shape;

public class SortingAlgorithms 
{
	/**
	 * @param <T> generic type
	 * @param arr the given array which is manipulated by insert sort
	 * @param comp the way of comparing things
	 */
	public static <T> void insertionSort(Shape[] arr, Comparator<Shape> comp) 
	{
		// j is sorted last element, i is unsorted first element

		for (int i = 1; i < arr.length; i++)
		{
			Shape tmp = arr[i];		
			int j = i - 1;

			while (j > -1 && comp.compare(tmp, arr[j]) > 0)
			{
				arr[j + 1] = arr[j];
				arr[j] = tmp;
				j--;
			}
		}
	}

	/**
	 * @param <T> generic type
	 * @param arr the given array which is manipulated by swap
	 * @param i an index of element which will be exchange for another index in the same array
	 * @param j an index of element which will be exchange for another index in the same array
	 */
	private static <T> void swap(T[] arr, int i, int j) 
	{
		T tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}

	/**
	 * @param <T> generic type
	 * @param arr the given array which is manipulated by selection sort
	 * @param com the way of comparing things
	 */
	public static <T> void selectionSort(Shape[] arr, Comparator<Shape> com) 
	{
		// find minimum for each time and put into right (descending order)
		
		for (int i = 0; i < arr.length; i++)
		{
			int indexMax = i;
			for (int j = i + 1; j < arr.length; j++)
			{
				if (com.compare(arr[j], arr[indexMax]) > 0)
				{
					indexMax = j;
				}		
			}
			swap(arr, indexMax, i);
		}
	}

	/**
	 * @param <T> generic type
	 * @param arr the given array which is manipulated by merge sort
	 * @param com the way of comparing things
	 */
	public static <T> void mergeSort(Shape[] arr, Comparator<Shape> com) 
	{
	
		sort(arr, 0, arr.length - 1, com);
	}

	/**
	 * @param arr the manipulated array
	 * @param left the lowest index of the array
	 * @param right the highest index of the array
	 * @param com the way of comparing things
	 */
	private static void sort(Shape[] arr, int left, int right, Comparator<Shape> com) 
	{
		if (left < right)
		{
			int mid = (left + right)/2;
			// Split elements into subgroups from two top level groups.
			sort(arr, left, mid, com);
			sort(arr, mid + 1, right, com);
			merge(arr, left, mid, right, com);			
		}
	}

	/**
	 * @param arr the manipulated array
	 * @param left the lowest index of the array
	 * @param mid the middle index of the array
	 * @param right the highest index of the array
	 * @param com the way of comparing things
	 */
	private static void merge(Shape[] arr, int left, int mid, int right, Comparator<Shape> com) 
	{
		
		int size_left = mid - left + 1;
		int size_right = right - (mid + 1) + 1;
		
		Shape[] arr_left = new Shape[size_left];
		Shape[] arr_right = new Shape[size_right];
		
		// copy elements to new arrays
		for (int i = 0; i < arr_left.length; i++)
		{
			arr_left[i] = arr[left + i];
		}
		
		for (int i = 0; i < arr_right.length; i++)
		{
			arr_right[i] = arr[mid + 1 + i];
		}
		
		int i = 0; // index of the left sub-array
		int j = 0; // index of the right sub-array
		int k = left; // index of the new array
		
		while (i < (size_left) && j < (size_right))
		{			
			// for descending order
			if(com.compare(arr_left[i] , arr_right[j]) > 0)
			{
				arr[k] = arr_left[i];
				i++;
			} else {
				arr[k] = arr_right[j];
				j++;
			}
			k++;
		}
		
		// maybe some elements are ignored on the one side
		
		while (i < size_left)
		{
			arr[k] = arr_left[i];
			i++;
			k++;
		}
		while (j < size_right)
		{
			arr[k] = arr_right[j];
			j++;
			k++;
		}
	}

	/**
	 * @param <T> generic type
	 * @param arr the given array which is manipulated by quick sort
	 * @param com the way of comparing things
	 */
	public static <T> void quickSort(Shape[] arr, Comparator<Shape> com) {
		// use a pivot to compare the elements of two partitions
		quick(arr, 0, arr.length - 1, com);
	}

	/**
	 * @param arr the manipulated array
	 * @param lowIndex the lowest index of the array
	 * @param highIndex the highest index of the array
	 * @param com the way of comparing things
	 */
	private static void quick(Shape[] arr, int lowIndex, int highIndex, Comparator<Shape> com) {
		if (lowIndex < highIndex)
		{
			int p = partition(arr, lowIndex, highIndex, com);
			quick(arr, lowIndex, p - 1, com);
			quick(arr, p + 1, highIndex, com);
		}
	}

	/**
	 * @param arr the manipulated array
	 * @param lowIndex the lowest index of the array
	 * @param highIndex the highest index of the array
	 * @param com the way of comparing things
	 * @return the index of element to split array into two partitions
	 */
	private static int partition(Shape[] arr, int lowIndex, int highIndex, Comparator<Shape> com) 
	{
		Shape pivot = arr[highIndex]; //choose the last element as the pivot
		
		int i = lowIndex - 1; // greater than pivot and on the right partition
		
		for (int j = lowIndex; j <= highIndex - 1; j++) 
		{
			// less than pivot and on the left side
			if (com.compare(arr[j], pivot) > 0)
			{
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i + 1, highIndex);
		return i + 1;
	}

	/**
	 * @param <T> generic type
	 * @param arr the manipulated array
	 * @param com the way of comparing things
	 */
	public static <T> void bubbleSort(Shape[] arr, Comparator<Shape> com) {
		// compare two items and put smaller one on the right side to make it presenting descending order
		for (int i = 0; i < arr.length - 1; i++)
		{
			for (int j = 0; j < arr.length - i - 1; j++)
			{
				if(com.compare(arr[j], arr[j + 1]) < 0)
				{
					swap(arr, j, j + 1);
				}
			}
		}
	}

	/**
	 * @param <T> generic type
	 * @param arr the manipulated array
	 * @param com the way of comparing things
	 */
	public static <T> void radixSort(Shape[] arr, Comparator<Shape> com) {
		// Radix sort
		
		// find the maximum value
		Shape max = arr[0];
		for (int i = 1; i < arr.length; i++)
		{
			if (com.compare(arr[i], max) > 0)
			{
				max = arr[i];
			}
		}
		
		int total_digits;
		String s;
		
		// we need to know how many iterations in the following process
		if (com.getClass().getName().contains("Area"))
		{
			s = "a";
			total_digits = max_number_of_digits(arr, com, s);
		} 
		else if (com.getClass().getName().contains("Volume"))
		{
			s = "v";
			total_digits = max_number_of_digits(arr, com, s);
		} 
		else // com.getClass().getName().contains("Height")
		{
			s = "h";
			total_digits = max_number_of_digits(arr, com, s);
		}	

		sortBuckets(arr, com, total_digits, s);
	}

	/**
	 * @param arr the manipulated array
	 * @param com the way of comparing things
	 * @param s the way of comparing things
	 * @return the max number of digits
	 */
	private static int max_number_of_digits(Shape[] arr, Comparator<Shape> com, String s) {
		// find the maximum value
		Shape max = arr[0];
		for (int i = 1; i < arr.length; i++)
		{
			if (com.compare(arr[i], max) > 0)
			{
				max = arr[i];
			}
		}
		
		double val = 0.0;
		// how many digits for the max value
		if (s == "a")
		{
			val = max.calcBaseArea();
		} 
		else if (s == "v")
		{
			val = max.calcVolume();
		}
		else // s == "h"
		{
			val = max.getHeight();
		}	
		
		int count = 0;
		
		while (val > 0)
		{
			val = (long) val / 10;	//must be long or it's not enough to store digits
			++count;
		}

		//System.out.println(count);
		return count;
		
	}

	/**
	 * @param arr the manipulated array
	 * @param com the way of comparing things
	 * @param total_digits the total number of digits
	 * @param s the way of comparing things
	 */
	private static void sortBuckets(Shape[] arr, Comparator<Shape> com, int total_digits, String s) {
		int significant_digit; // significant digit
		int index;		// store the index of array
		
		for (int n_digit = 0; n_digit < total_digits; n_digit++) 
		{
			// Create ten buckets (0-9) to collect numbers 
			Shape[][] buckets = new Shape[10][arr.length];
			
			//System.out.println((total_digits - n_digit) + "th digit");
			long divisor = (long) Math.pow(10, n_digit);
			
			// Gather the same values based on the significant digit (from right to left)
			for (Shape a : arr) 
			{
				if (s == "h")
				{
					significant_digit = (int) ((a.getHeight()/divisor) % 10);
				}
				else if (s == "a")
				{
					significant_digit = (int) ((a.calcBaseArea()/divisor) % 10);
				}
				else	// s== "v"
				{
					significant_digit = (int) ((a.calcVolume()/divisor) % 10);
				}
				
				
				index = 0;
				
				while (index < arr.length && buckets[significant_digit][index] != null)
				{
					index++;
				}

				buckets[significant_digit][index] = a;	// put into the corresponding bucket
				//System.out.println("buckets[" + significant_digit + "][" +index + "]= " + buckets[significant_digit][index]);
			}
			
			// Drain the buckets in order
			int count = 0;
			for(int i = 9; i > -1; i--)
			{
				for (int j = 0; j < buckets[i].length ; j++)
				{
					if(buckets[i][j] != null)
					{
						// System.out.println("arr[" + count + "]= " + buckets[i][j]);
						arr[count] = buckets[i][j];
						count++;
					}
				}
			}		
		}
	}
}
