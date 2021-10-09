About The Project
	This application sorts the following shapes regarding their Heights, Base Area and Volume:
		Cone
		Cylinder
		Pyramid
		OctagonalPrism
		PentagonalPrism
		SquarePrism
		TriangularPrism
		
	The following algorithms are used:
		Bubble sort
		Selection sort
		Insertion sort
		Merge sort
		Quick sort
		Radix sort (our choice)
	
	It also comes with a time-keeper so that we can see the running time of each algorithm.


Getting Started
	This is an example of how you may give instructions on setting up your project locally. To get a local copy up and running follow these simple example steps.

Usage
	File name F, the compare type and the sort type are provided as parameters ((-f –t –s or -F –T –S) via command line. The program must be order and case insensitive. For example, all examples below are valid inputs:
		java -jar sort.jar –fpolyfor1.txt –Tv –Sb
		java -jar sort.jar –ta –sQ –fpolyfor3.txt
		java -jar sort.jar –tH –Fpolyfor5.txt –sB
	where v is volume, h is height, a is base area, b is bubble, s is selection, i is insertion, m is merge, q is quick, and your choice of sorting algorithm is z.


Complexity analysis for our choice Radix sorting (you'll see more details in mySort.txt) 
	Start with the least significant digit
	Gather the same values and put them together in a bucket
	"Drain" the buckets in order
	For radix sort, it's time complexity is O(n) and space complexity is also O(n).

Completeness of the assignment
	All functions were completed and tested (100%). Also, we have completed all requirements.