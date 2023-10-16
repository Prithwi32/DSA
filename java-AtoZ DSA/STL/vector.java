  package STL;
  import java.io.*;
  import java.util.*;

  class vector{

    public static void main(String args[]){
/*
        int n =5;
// Declaring the Vector with initial size n
        Vector<Integer> v = new Vector<Integer>(n);

// Appending new elements at the end of the vector
    for(int i=1; i<=n; i++){
        v.add(i);
    }
    System.out.println(v);

// Remove element at index 3
    v.remove(3);

// Displaying the vector after deletion
System.out.println(v);

// iterating over vector elements using for loop
for(int i=0; i<v.size(); i++){

// Printing elements one by one
  System.out.print(v.get(i) + " ");
}
*/

// Performing Various Operations on Vector class in Java

// Operation 1: Adding Elements , using add() method
// Creating a default vector
Vector  v1 = new Vector();
v1.add(2);
v1.add(4);
v1.add("Hello");
v1.add(8);
System.out.println(v1);


// Creating generic vector
Vector<Integer> v2 = new Vector<Integer>();
v2.add(1);
v2.add(1,3);
v2.add(5);
System.out.println(v2);


// Operation 2: Updating Elements
// If we wish to change the element, it can be done using the set() method
v1.set(2,6);
System.out.println(v1);

v2.set(2,7);
System.out.println(v2);


// Operation 3: Removing Elements
// In order to remove an element from a Vector, we can use the remove() method.
// remove(Object):used to remove an object from the Vector. If there are multiple such objects, then the first occurrence of the object is removed.
// remove(int index): Since a Vector is indexed, this method takes an integer value which simply removes the element present at that specific index in the Vector.
// After removing the element, all the elements are moved to the left to fill the space and the indices of the objects are updated.
v2.remove(2);
System.out.println(v2);

// Operation 4: Iterating the Vector
// The most famous ways are by using the basic for loop in combination with a get() method to get the element at a specific index and the advanced for a loop.
Vector<String> v3 = new Vector<String>();
v3.add("Say");
v3.add("World");
v3.add(1," Hello ");

// Using the Get method and the for loop
for(int i=0; i<v3.size(); i++){
  System.out.print(v3.get(i) + " ");
}

System.out.println();

// For each loop:
for(String str : v3){
  System.out.print(str + " ");
}

// eg:
		// Create a new vector
		Vector<Integer> v = new Vector<>(3, 2);
    System.out.println(v);

		// Add elements to the vector
		v.addElement(1);
		v.addElement(2);
		v.addElement(3);
    System.out.println(v);

		// Insert an element at index 1
		v.insertElementAt(0, 1);
    System.out.println(v);

		// Remove the element at index 2
		v.removeElementAt(2);
    System.out.println(v);

		// Print the elements of the vector
		for (int i : v) {
			System.out.println(i);
		}
	}
}

// Book : “Java Collections” by Naftalin and Wadler. 









