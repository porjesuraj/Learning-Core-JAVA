
Slogan of java: write once,run anywhere
Slogan of .net : run once ,run always
# Syllabus 

1. Java intro : 1 day  
2.  Datatype : 1 day
3.  JDBC : 2 days
4. Annotation and reflection : 1 day
5. Multithreading : 2 days
6. FIle handling and socket : 2 day
7. Functional programming : 1 day 
8. Collection framework : 2 day
9. Interface : 1 day
10. Abstract class and generics : 1 day
11. Exception Handing : 1 day
12.  Package and Array : 1 day
13.  Enum, Association ,inheritence : 1 day





# Day 1

1. **ppt on basic of java**
# Java introduction

1. Java technology is both a programming language and a platform.
2. developed by James Gosling in 1991, at Sun Microsystems 
3. slogen "Write once , run anywhere"

4. The Java programming language is a high-level language that can be characterized by all of the following buzzwords:

- Simple
- Object oriented
- Distributed
- Multithreaded
- Dynamic
- Architecture neutral
- Portable
- High performance
- Robust
- Secure
  
- In the Java programming language, all source code is first written in plain text files ending with the .java extension.    
   - Those source files are then compiled into .class files by the javac compiler.
   -  A .class file does not contain code that is native to your processor; it instead contains bytecodes — the machine language of the JVM1 (Java VM).
   -   The java launcher tool then runs your application with an instance of the JVM.

- Because the Java VM is available on many different operating systems,
    -  the same .class files are capable of running on Microsoft Windows, the Solaris™ Operating System (Solaris OS), Linux, or Mac OS.
    -   Some virtual machines, such as the Java SE HotSpot at a Glance, perform additional steps at runtime to give your application a performance boost. This includes various tasks such as
       -    finding performance bottlenecks and recompiling (to native code) frequently used sections of code.

5. **The Java Platform**
- A platform is the hardware or software environment in which a program runs.
-  Most platforms can be described as a combination of the operating system and underlying hardware. 
-  The Java platform differs from most other platforms in that it's a software-only platform that runs on top of other hardware-based platforms.

- The Java platform has two components:

    1. **The JVM**
       - it's the base for the Java platform and is ported onto various hardware-based platforms.
    2. **The Java Application Programming Interface (API)**
       - The API is a large collection of ready-made software components that provide many useful capabilities. 
       - It is grouped into libraries of related classes and interfaces; these libraries are known as packages. T

- The API and JVM insulate the program from the underlying hardware.

- As a platform-independent environment, the Java platform can be a bit slower than native code.
-  However, advances in compiler and virtual machine technologies are bringing performance close to that of native code without threatening portability.
 
# requirement for JAVA  : 

- developer need for java development 
     1. **SDK (Software development kit)** 
      + development tools
      + runtime environment
      + Documentation
      + SUpprting libraries
    - 
     1.  **Java Software developmnt kit (JDK)**

      + Java Developmetn tools 
      + Java APi Docs (Application programming runtime)
      + rt.jar [its supporting libraries]
         - same as .NET MSCORLIB file   
         - core java logic kept as  compiled library files
      + JVM (JVM)

     2. JRE(Java Runtime Environtment) = **[rt.jar + JVM]**
      - now JDK  = 
          + Java Development tools 
          + Java APi Docs 
          + JRE 

### JDK Directory folders

1. bin  
- Contains Java language Developement tools
- we are gonna use
   - java,javadoc,javah,javac
2. Include folder contains header file to use JNI  
 -  JNI = Java Native Interface 
  - Native code = C,C++ code 
  -  we can use JNI to write code in native language and run in java app

3. lib
- contains the files used by development tools
- contains jar files   
-  JAR (Java ARchive) is a package file format typically used to aggregate many Java class files and associated metadata and resources (text, images, etc.) into one file for distribution. 
-  JAR files are archive files that include a Java-specific manifest file. 
  
4. src
 - it is a zip file 
 - .java is extension of java source file
 - contain source code of JAVA API

5. docs
- contains documentation of java api
- i.e html files 

6. jre 
- root directory for java runtime Environmrnt
7. man 
 - contians  documentation of java developemnt tools

### Java Package 
 -  contains 
1. Interfaces
2. Classes
3. Enum
4. Exceptions
5. Errors
6. Annotation Types
7. Sub classes 
8. 
### command to open java manual 
```
> man java

> man javac

> man jar

> man java

> man javap
- Disassembles one or more class files.
```
### Java program 

1. first program
- hello world program
```java
class Program{
 
 public static void main(String[] args){
//c
//printf("Hello world \n");
// C++
//cout<<"Hello world"<<endl;
//c#
//Console.Readline("Hello world");


  System.out.println("Hello World");
 }



}

```

2. **command to compile and run java files**


- to compile  .java file 
  >javac Program.java 

- it creates a .class file, now to run the java file 
> java Program  


1. flow of java 
2. JRE 
3. compile  classes as output are created for 
 -  per class in .java file 
 - e.g 
- 1. Interfaces
  2. Classes
  3. Enum
   

# Day 2 

-  (reference) **ppt on Buzz words in java** 
- these are design goals of java: 
- ten principle of sun microsystem :
1. **Simple**
 - java is derived from C/C++ 
 - it is simple in comparison on C and C++
   - on basis of  syntax
 - has constructor chaining

2. **Object Oriented**
 - 
3. **Architecture Neutral**
4. **Portable**
5. **Robust**
6. **Multithreaded**
7. **Dynamic**
8. **Secure** 
9. **High Performance**
10. **Distributed**
 
 ### class  notes
1. static member function and constructor cant be virtual , all other clases abd member function be virtual
2. older version program can run on later version, features can get deprecated, but still have backward compatibility,
   - this is not in .NET, there Obsolete features are not supported in future version 
3. reflection example is debugger for getting private data member , intellisense  

4. The Java **Remote Method Invocation** (RMI)
  -  system allows an object running in one JVM to invoke methods on an object running in another JVM. 
  -  RMI provides for remote communication between programs written in the Java programming language.
  - since java supports RMI, it is distributed prog languauge.

5. **Access Modifier** 
 - 12 types in java   
 - in comparison to c /c++ , 4 types 
 - 

6. **A Wrapper class** 
 - is a class whose object wraps or contains primitive data types. 
 - When we create an object to a wrapper class, it contains a field and in this field, we can store primitive data types. - In other words, we can wrap a primitive value into a wrapper class object.

### **practical demos** 
1. in java we can overload main method (also call one main to another), in other language ??
    ```c#
     public static void main(String[] args) {
		
		System.out.println("Hello ");  
		
		//Program::main(10,20); c++
		Program.main(1, 2);
		main(10,20);
	}

   // in java we can overload main method
   public static void main(int num1,int num2)
   {
	   System.out.println("Num1 :" + num1);
	   System.out.println("Num2 : " + num2);
   }

    ```
 2. we can write , main method per class, but only one will be starting main method in it , we need to select it
    - calling main method job of main thread .
      ```c#
          package test;
          {}

             class A
             {
             public static void main(String[] args) {
             		
             		System.out.println("A.main ");  
             		
             	}
             }
             
             public class Program {
             
                public static void main(String[] args) {
             		
             		System.out.println("Program.main ");  
             		
             	}
          }
      ```
    3. different print methods in printstream class  
    ```c#
    public static void main3(String[] args) {
		
		String name = "suraj porje";
		int empid = 26;
		float salary = 90000.45f;
		//System.out.println(name + " " + empid + " " + salary);
		
		System.out.printf("%-25s%-5d%-10.2f \n",name,empid,salary);
		name = "sallu";
		 empid = 36;
		 salary = 60000.45f;
		 System.out.printf("%-25s%-5d%-10.2f \n",name,empid,salary);
		// System.out.println(name + " " + empid + " " + salary);
	    }
	
        public static void main2(String[] args) {
 		
		   System.out.println("DAC,"); // new line print 
	
	   }
	
	
	      public static void main1(String[] args) {
		
		   System.out.print("DAC,"); // same line print 
	
	   }

    ```



    4. when both primitive datatype need conversion  , use c type casting 
     - widening conversion, smaller data type to large datatype conversionm, not required explicit casting 
     -  narrowing conversion,  large datatype conversion to smaller data type, explicitely casting in required
    ```c#
    public static void main(String[] args) {
		
		double num1 = 10.5; //Initialization
	    int  num2 ; // narrowing
		num2 = (int) num1;
		System.out.println("Num2 : " + num2);
		}
	
	
	public static void main2(String[] args) {
		
		int num1 = 10; //Initialization
		double num2 = (double)num1; //wideening 
		System.out.println("Num2 : " + num2);
		
		}
	
     public static void main1(String[] args) {
		
	   int num1 = 10; //Initialization
     // C/C++ type casting 
	   double num2 = (double) num1 ; // Initialization 
	
	    System.out.println("Num2 : " + num2);
	
	
	}


    ```
5.  primitive type are itself not classes, so need wrapper class
 boxing 
    - conversion of primitive type to non primitive type by method it is caleed boxing 
    - e.g for string can use ,method 
     - toString()
     - valueOf
            
 ```c#
     public class Program{
	public static void main(String[] args) {
		String str = "1a2b5"; // Non primitive
		
		int number = Integer.parseInt(str); // Primitive : Unboxing
		
		System.out.println("number : " + number);
		//error : seen in stack trace
	}
	
	
	public static void main4(String[] args) {
		String str = "125"; // Non primitive
		
		int number = Integer.parseInt(str); // Primitive : Unboxing
		
		System.out.println("number : " + number);
	}
	
	public static void main3(String[] args) {
		double number = 10.5;
		String strNumber = Double.toString(number);//Non Primitive : Boxing
		System.out.println(strNumber);
	}
	public static void main2(String[] args) {
		int number = 10;	//Primitive
		//String strNumber = Integer.toString(number); //Non Primitive : Boxing
		String strNumber = String.valueOf(number);//Non Primitive : Boxing
		System.out.println("Number	:	"+strNumber);
	}
		
}

```

  6.    use of scanner class to take input from user, demo 
```c#
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Name : ");
		String name = sc.nextLine();
				
		System.out.print(" Roll no : ");
		int rollNumber = sc.nextInt();
		System.out.print(" Marks : ");
		float marks = sc.nextFloat();
		
		System.out.println(" Name : " + name + " roll no : " + rollNumber + " marks : " + marks);
		
	}


```

### to read 

1. JVM
> https://www.artima.com/insidejvm/ed2/jvm.html

### Answer to What is a JVM ?

1. The JVM is called "virtual" because it is an abstract computer defined by a specification.
   -  To run a Java program, you need a concrete implementation of the abstract specification. 
   - here we describe primarily the abstract specification of the JVM.
   -  To illustrate the abstract definition of certain features,  also  various ways in which those features could be implemented.


2.  when you say **"JVM."** You may be speaking of:

    1. the abstract specification,
       - described in detail in the book: The JVM Specification
    2. a concrete implementation
       -  it exist on many platforms and come from many vendors, are either all software or a combination of hardware and software.
    3. a runtime instance.
       -  A runtime instance hosts a single running Java application.
        
3.  Each Java application runs inside a runtime instance of some concrete implementation of the abstract specification of the JVM.


4. **The Lifetime of a JVM**
- A runtime instance of the JVM has a clear mission in life:
   -  to run one Java application. 
-  When a Java application starts, a runtime instance is born.
-   When the application completes, the instance dies. 
-   If you start three Java applications at the same time, on the same computer, using the same concrete implementation, you'll get three JVM instances. 
-   Each Java application runs inside its own JVM.

- A JVM instance starts running its solitary application by invoking the main() method of some initial class. 
- The main() method must be public, static, return void, and accept one parameter: a String array. 

1. Inside the JVM, threads come in two flavors:
-  daemon and non- daemon. 
    -  **A daemon thread** is ordinarily a thread used by the virtual machine itself, **such as a thread that performs garbage collection.** The application, however, can mark any threads it creates as daemon threads. 
    -  The initial thread of an application--the **one that begins at main()--is a non- daemon thread**.

    - A Java application continues to execute (the virtual machine instance continues to live) as long as any non-daemon threads are still running.
    -  When all non-daemon threads of a Java application terminate, the virtual machine instance will exit. 
    -  If permitted by the security manager, the application can also cause its own demise by invoking the exit() method of class Runtime or System.
  

###  The Architecture of the JVM
- In the JVM specification, 
  - the behavior of a virtual machine instance is described in terms of
     -  subsystems
     -   memory areas
     -    data types,
     -    and instructions
  -  These components describe an abstract inner architecture for the abstract JVM. 
  -  The purpose of these components 
        -    is more to provide a way to strictly define the external behavior of implementations. 
  -   The specification defines the required behavior of any JVM implementation in terms of these abstract components and their interactions.

- the major subsystems and memory areas described in the specification , each JVM has 
   1. a class loader subsystem:
    -  a mechanism for loading types (classes and interfaces). 
   2. a execution engine: 
   - a mechanism responsible for executing the instructions contained in the methods of loaded classes.

!['jvm_arch'](jvm-arch.gif)

Figure 5-1. The internal architecture of the JVM.
- The JVM organizes the memory it needs to execute a program into several runtime data areas.

- Although the same runtime data areas exist in some form in every JVM implementation, their specification is quite abstract. 
- The abstract nature of the specification of the runtime data areas helps make it easier to implement the JVM on a wide variety of computers and devices.

-  Each instance of the JVM has one method area and one heap. 
-  These areas are shared by all threads running inside the virtual machine. 
-  When the virtual machine loads a class file, it parses information about a type from the binary data contained in the class file. 
-  It places this type information into the method area. 
-  As the program runs, the virtual machine places all objects the program instantiates onto the heap. S

!['runtime-data-areas-shared-among-threads'](runtime-data-areas-shared-among-threads.gif)
Figure 5-2. Runtime data areas shared among all threads.

- The JVM has no registers to hold intermediate data values.
-  The instruction set uses the Java stack for storage of intermediate data values. 
-  This approach was taken by Java's designers to keep the JVM's instruction set compact and to facilitate implementation on architectures with few or irregular general purpose registers.
-   In addition, the stack-based architecture of the JVM's instruction set
    -  facilitates the code optimization work done by just-in-time and dynamic compilers that operate at run-time in some virtual machine implementations.

!['runtime-data-eare-exclusive-toeach-thread'](runtime-data-eare-exclusive.gif)

### Data Types
The JVM computes by performing operations on certain types of data.
 Both the data types and operations are strictly defined by the JVM specification.
  The data types can be divided into a set of
  1. **primitive types** 
    -  Variables of the primitive types hold primitive values
    -  Primitive values, do not refer to anything. They are the actual data themselves.
    1. All the primitive types of the Java programming language are primitive types of the JVM. 
    2. Although boolean qualifies as a primitive type of the JVM, the instruction set has very limited support for it.
- compiler  uses ints or bytes to represent booleans. **In the JVM, false is represented by integer zero and true by any non-zero integer.** Operations involving boolean values use ints. 

    3. The numeric types are divided between 
         - the integral types: byte, short, int, long, and char, and 
         - the floating- point types: float and double. 
         - As with the Java programming language, the primitive types of the JVM have the same range everywhere. 
         - A long in the JVM always  a 64-bit number, independent of the underlying host platform.

    4. The JVM works with one other primitive type that is unavailable to the Java programmer:
       -  the returnAddress type.
          -  This primitive type is used to implement finally clauses of Java programs. 

  2. **a reference type.**
   - variables of the reference type hold reference values. 
   -  Reference values refer to objects, but are not objects themselves. 
    1. The reference type of the JVM is cleverly named reference.
    2.  Values of type reference come in three flavors:
	-  the class type, 
	-  the interface type,
	-   and the array type. 
	3. All three types have values that are references to dynamically created objects.
	-  The class type's values are references to class instances.
	-  The array type's values are references to arrays, which are full-fledged objects in the JVM.
	-  The interface type's values are references to class instances that implement an interface. 
	4. One other reference value is the null value, which indicates the reference variable doesn't refer to any object.


!['datatypesofJVM'](datatypesofJVM.gif)

!['datatypes'](datatypes.jpg)
-  Ranges of the JVM's data types

### Word Size
1. The basic unit of size for data values in the JVM is the word--a fixed size chosen by the designer of each JVM implementation. 

2. The specification of many of the JVM's runtime data areas are based upon this abstract concept of a word.
3.  For example:
  -  two sections of a Java stack frame--the local variables and operand stack-- are defined in terms of words. 
  -  These areas can contain values of any of the virtual machine's data types. 
  -  When placed into the local variables or operand stack, a value occupies either one or two words.

4. The word size does not affect the behavior of a program. It is only an internal attribute of a virtual machine implementation.


2. why main method is static? (an swer as what when it is not static)
3.  to compile java program , need atleast one class
4.  Package java.lang
 > https://docs.oracle.com/javase/8/docs/api/

5. can we write helloworld program , without giving semicolon ?? yes 





# Day3 
- **reference for demo**
!['day3.1'](day3.1.png)

!['day3.2'](day3.2.png)

### demo on java 
- 1. JOptionPane 
```java


import javax.swing.JOptionPane;



public static void main1(String[] args) {
		String name = JOptionPane.showInputDialog("Enter Name");
		int empid = Integer.parseInt( JOptionPane.showInputDialog("Enter Empid") );
		float salary = Float.parseFloat(JOptionPane.showInputDialog("Enter Salary"));
		
		System.out.println("Name	:	"+name);
		System.out.println("Empid	:	"+empid);
		System.out.println("Salary	:	"+salary);
	}

```

-  2. BufferedReader and InputStreamReader 
```java

 import java.io.BufferedReader;
import java.io.InputStreamReader;
public static void main3(String[] args)throws Exception {
		BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
		
		System.out.print("Name	:	");
		String name = reader.readLine();
		System.out.print("Roll Number	:	");
		int number = Integer.parseInt( reader.readLine() );
		System.out.print("Marks	:	");
		float marks = Float.parseFloat(reader.readLine());
		
		System.out.println("Name	:	"+name);
		System.out.println("Number	:	"+number);
		System.out.println("Marks	:	"+marks);
	}

```
- 3.  scanner 
```java
import java.util.Scanner;
public static void main4(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)){
			System.out.print("Name	:	");
			String name = sc.nextLine();
			System.out.print("Number	:	");
			int number = sc.nextInt();
			System.out.print("Balance	:	");
			float balance = sc.nextFloat();
			
			System.out.println("Name	:	"+name);
			System.out.println("Number	:	"+number);
			System.out.println("Balance	:	"+balance);
		}
	}

```
- 4. demo:  Anonymous Instance
- if we create instance without refrence is anonymous instance
   use when 
     - 1. when we want to use instance only once
       - to pass method as a argument
       ```java
         Person p = new Person();
         p.setName("suraj");
         p.setBirthDate(new Date(23,7,1994));


       ``` 
     - 2. if we want to use any instance as a method argument or if want to use any instance as  a exception then it should by anonymous


```c#

class Accounts{
	//Field // default -> package level private
  private int number; // 0
  private String type; // null
  private float balance; // 0.0
}

main(){
new Accounts(); //instance without name, is anonymous instance
}
```
- 5. Constructor chaining
  -  this it, to achieve constructor reusability, we can call constructor from another constructor
  - for CC we should we this statement inside constructor body 
     - this statement must be first statment in constructor body 
```java
public Account() {
		this(1105, "Current", 85000);	//Constructor Chaining
	}
	public Account(int number, String type, float balance) {
		this.number = number;
		this.type = type;
		this.balance = balance;
	}
```
- 6. Null Object
- 1.  Literal (constant value) in Java: 
- literal  : datatype

1. true :      boolean
2. 'A' :       char
3. 12345 :     int 
4. 3.142 :     double
5. "Sunbeam" : String
6. new Date(): Date
7. null :      reference variable

```java
---

in C/C++
//here null is a macro ,
int *ptr = NULL;
---

in java 

// null is a literal, to initialize an object
Account account = null;

//if refernece value contains null value , it its called as null object/null reference variable
// gives error : NullPointerException
   //Calling the instance method of a null object.

to solve two methods 
1. 
		 if(acc1 != null) { acc1.printRecord(); }
2. 	acc1 = new Accounts(); //instantiation
```
- 7.  **Creating refrence(instance)**
     -  if we want to perform operations on instance then it is neccessary to create  reference to it.

```java

Account acc1; // in C++ : object
Account acc2; // in java: Reference
Account acc3 = new Account(); // in java: acc3: Reference
```

- consider following statement
```java
    Accounts a1 = new Accounts(1001,"Saving",45000);
	Accounts a2 = a1;
   Account a3 = new Account(1002,"Saving",45000);
```
- answer : 2 instance, 3 reference 

- 8.  Comments in java 

```java

1. //Single line comment
2. /* Multi line comment */
3. /** Java doc comment **/


```

- 9. in class ,
  - right click,
  - select source --> generate getter/setter
  
- 10. menu driver program, for account class
```java
public class Program {
	static Scanner sc = new Scanner(System.in);

	public static void acceptRecord(Account account) {
		System.out.print("Number	:	");
		account.setNumber(sc.nextInt());
		System.out.print("Type	:	");
		sc.nextLine();
		account.setType(sc.nextLine());
		System.out.print("Balance	:	");
		account.setBalance(sc.nextFloat());
	}

	public static void printRecord(Account account) {
		System.out.println("Number	:	" + account.getNumber());
		System.out.println("Type	:	" + account.getType());
		System.out.println("Balance	:	" + account.getBalance());
	}

	public static int menuList() {
		System.out.println("0.Exit");
		System.out.println("1.Accept Record");
		System.out.println("2.Print Record");
		System.out.print("Enter choice	:	");
		int choice = sc.nextInt();
		return choice;
	}

	public static void main(String[] args) {
		int choice;
		Account account = new Account();
		while ((choice = Program.menuList()) != 0) {
			switch (choice) {
			case 1:
				Program.acceptRecord(account);
				break;
			case 2:
				Program.printRecord(account);
				break;
			}
		}
	}

	public static void main1(String[] args) {
		Account account = new Account();

		Program.acceptRecord(account);

		Program.printRecord(account);
	}
}


```

- 11. modular approach 
  - using 3 class files
   1. Class (contain class data member,cons,getter/setter) 
   2. ClassTest(contains method of class to implement, with menuList method )
   3. Program (contains menu driver logic )


### class Notes : 


!['day3.3'](day3.3.png)

!['day3.4'](day3.4.png)

!['day3.5-class'](day3.5.png)

  !['day3.6'](day3.6.png)

 !['day3.7'](day3.7.png)

 !['day3.8'](day3.8.png)

 ### extra points
1. in java has no structure and union 
2. in java ,object is called as instance 

### reading 

> https://www.artima.com/insidejvm/ed2/jvm4.html


1. The Class Loader Subsystem
The part of a Java virtual machine implementation that takes care of finding and loading types is the class loader subsystem. Chapter 1, "Introduction to Java's Architecture," gives an overview of this subsystem. Chapter 3, "Security," shows how the subsystem fits into Java's security model. This chapter describes the class loader subsystem in more detail and show how it relates to the other components of the virtual machine's internal architecture.

As mentioned in Chapter 1, the Java virtual machine contains two kinds of class loaders: a bootstrap class loader and user-defined class loaders. The bootstrap class loader is a part of the virtual machine implementation, and user-defined class loaders are part of the running Java application. Classes loaded by different class loaders are placed into separate name spaces inside the Java virtual machine.

The class loader subsystem involves many other parts of the Java virtual machine and several classes from the java.lang library. For example, user-defined class loaders are regular Java objects whose class descends from java.lang.ClassLoader. The methods of class ClassLoader allow Java applications to access the virtual machine's class loading machinery. Also, for every type a Java virtual machine loads, it creates an instance of class java.lang.Class to represent that type. Like all objects, user-defined class loaders and instances of class Class reside on the heap. Data for loaded types resides in the method area.

Loading, Linking and Initialization
The class loader subsystem is responsible for more than just locating and importing the binary data for classes. It must also verify the correctness of imported classes, allocate and initialize memory for class variables, and assist in the resolution of symbolic references. These activities are performed in a strict order:

Loading: finding and importing the binary data for a type
Linking: performing verification, preparation, and (optionally) resolution
Verification: ensuring the correctness of the imported type
Preparation: allocating memory for class variables and initializing the memory to default values
Resolution: transforming symbolic references from the type into direct references.
Initialization: invoking Java code that initializes class variables to their proper starting values.
The details of these processes are given Chapter 7, "The Lifetime of a Type."
The Bootstrap Class Loader
Java virtual machine implementations must be able to recognize and load classes and interfaces stored in binary files that conform to the Java class file format. An implementation is free to recognize other binary forms besides class files, but it must recognize class files.

Every Java virtual machine implementation has a bootstrap class loader, which knows how to load trusted classes, including the classes of the Java API. The Java virtual machine specification doesn't define how the bootstrap loader should locate classes. That is another decision the specification leaves to implementation designers.

Given a fully qualified type name, the bootstrap class loader must in some way attempt to produce the data that defines the type. One common approach is demonstrated by the Java virtual machine implementation in Sun's 1.1 JDK on Windows98. This implementation searches a user-defined directory path stored in an environment variable named CLASSPATH. The bootstrap loader looks in each directory, in the order the directories appear in the CLASSPATH, until it finds a file with the appropriate name: the type's simple name plus ".class". Unless the type is part of the unnamed package, the bootstrap loader expects the file to be in a subdirectory of one the directories in the CLASSPATH. The path name of the subdirectory is built from the package name of the type. For example, if the bootstrap class loader is searching for class java.lang.Object, it will look for Object.class in the java\lang subdirectory of each CLASSPATH directory.

In 1.2, the bootstrap class loader of Sun's Java 2 SDK only looks in the directory in which the system classes (the class files of the Java API) were installed. The bootstrap class loader of the implementation of the Java virtual machine from Sun's Java 2 SDK does not look on the CLASSPATH. In Sun's Java 2 SDK virtual machine, searching the class path is the job of the system class loader, a user-defined class loader that is created automatically when the virtual machine starts up. More information on the class loading scheme of Sun's Java 2 SDK is given in Chapter 8, "The Linking Model."

User-Defined Class Loaders
Although user-defined class loaders themselves are part of the Java application, four of the methods in class ClassLoader are gateways into the Java virtual machine:

// Four of the methods declared in class java.lang.ClassLoader:
protected final Class defineClass(String name, byte data[],
    int offset, int length);
protected final Class defineClass(String name, byte data[],
    int offset, int length, ProtectionDomain protectionDomain);
protected final Class findSystemClass(String name);
protected final void resolveClass(Class c);
Any Java virtual machine implementation must take care to connect these methods of class ClassLoader to the internal class loader subsystem.

The two overloaded defineClass() methods accept a byte array, data[], as input. Starting at position offset in the array and continuing for length bytes, class ClassLoader expects binary data conforming to the Java class file format--binary data that represents a new type for the running application -- with the fully qualified name specified in name. The type is assigned to either a default protection domain, if the first version of defineClass() is used, or to the protection domain object referenced by the protectionDomain parameter. Every Java virtual machine implementation must make sure the defineClass() method of class ClassLoader can cause a new type to be imported into the method area.

The findSystemClass() method accepts a String representing a fully qualified name of a type. When a user-defined class loader invokes this method in version 1.0 and 1.1, it is requesting that the virtual machine attempt to load the named type via its bootstrap class loader. If the bootstrap class loader has already loaded or successfully loads the type, it returns a reference to the Class object representing the type. If it can't locate the binary data for the type, it throws ClassNotFoundException. In version 1.2, the findSystemClass() method attempts to load the requested type from the system class loader. Every Java virtual machine implementation must make sure the findSystemClass() method can invoke the bootstrap (if version 1.0 or 1.1) or system (if version 1.2 or later) class loader in this way.

The resolveClass() method accepts a reference to a Class instance. This method causes the type represented by the Class instance to be linked (if it hasn't already been linked). The defineClass() method, described previous, only takes care of loading. (See the previous section, "Loading, Linking, and Initialization" for definitions of these terms.) When defineClass() returns a Class instance, the binary file for the type has definitely been located and imported into the method area, but not necessarily linked and initialized. Java virtual machine implementations make sure the resolveClass() method of class ClassLoader can cause the class loader subsystem to perform linking.

The details of how a Java virtual machine performs class loading, linking, and initialization, with user- defined class loaders is given in Chapter 8, "The Linking Model."

Name Spaces
As mentioned in Chapter 3, "Security," each class loader maintains its own name space populated by the types it has loaded. Because each class loader has its own name space, a single Java application can load multiple types with the same fully qualified name. A type's fully qualified name, therefore, is not always enough to uniquely identify it inside a Java virtual machine instance. If multiple types of that same name have been loaded into different name spaces, the identity of the class loader that loaded the type (the identity of the name space it is in) will also be needed to uniquely identify that type.

Name spaces arise inside a Java virtual machine instance as a result of the process of resolution. As part of the data for each loaded type, the Java virtual machine keeps track of the class loader that imported the type. When the virtual machine needs to resolve a symbolic reference from one class to another, it requests the referenced class from the same class loader that loaded the referencing class. This process is described in detail in Chapter 8, "The Linking Model." 



# Day4

!['day4.1'](day4.1.png)
!['day4.2'](day4.2.png)
!['day4.3'](day4.3.png)
!['day4.4'](day4.4.png)
!['day4.5'](day4.5.png)
!['day4.6'](day4.6.png)
!['day4.7'](day4.7.png)


1. Hashcode
 - it is a logical integer number. 
  - that can be generated by using state of an object
  - 





## demo 

1. create a date object
```java
class Date{	
}
class Employee{
	int empid;
	private Date birthDate;
	public Employee() {
		this.birthDate = new Date();
	}
}
public class Program {
	public static void main(String[] args) {
		Date birthDate = new Date();
		
		Employee emp = new Employee( );
	}
}


```
2. demo best practice to override  toString method for object

  - to override use annotation over toString method
```java
@Override // annotation for overriding method
	public String toString() {
		
		
	}
```


- demo to override toString ,generated by using source 

```java
import java.util.Date;

class Employee{
	private String name;
	private int empid;
	private String department;
	private String designation;
	private float salary;

	// generated by using source 
	@Override
	public String toString() {
		return "Employee [name=" + name + ", empid=" + empid + ", salary=" + salary + "]";
	}
	

}
public class Program {
	public static void main(String[] args) {
		Employee emp = new Employee("Sandeep", 33, "Training", "Teacher", 25000.45f);
		String str = emp.toString();
		System.out.println(str);
	}	
	
}

            


```

3.  to compile java program from src folder and get .class file in bin folder
  - 1. PATH
    -  is OS platform environment variable which is used to locate java language development tools.
```bash
export PATH=/usr/bin   (optional ) -- tu include java development tools
javac -d ./bin/  ./src/Program.java

```
- to execute the .class file in bin
- 2. CLASSPATH 
   - is java platform's environment variable which is used to locate .class file /.jarfile
```bash
// when class file is in other file ,to give its location
   export CLASSPATH=./bin/  
   java Program
```
- locate javac
```bash
whereis is javac
```

4. type in java is referring to 
  - class, interface
 -  if we define any type(class) outside a package
 - it is member of global package i.e in java called default package  
 - so we cant access it directly, 
    + as we cannot import default package, as it has no name, hence it is impossible to use unpackaged type inside package type.  
+  demo on default package class


5. Command to be used while dealing with packages in compilation and execution
    - 1. using package p1 class Complex in package p2 class Program file
	  - while compiling  
	```java
          -- in Complex.java 
          package p1;

           public class Complex{ // Packaged class }

		 -- in Program.java
		    package p2;
            import p1.Complex;
             public class Program{// Packaged class }

    ```

	-  need to use command when in a project package to use is different and needed for compilation 
	- command for compilation
        1. >  javac -d ./bin ./src/Complex.java
        2. >  export PACKAGEPATH=./bin/p1
        3. >  export CLASSPATH=./bin/
        4. >  javac -d ./bin/ ./src/Program.java

    
	  - while executing need to use package name . file name  
      > java p2.Program;

    - 2.  using package p1 class Complex in package p1 class Program file
    ```java

	  -- in Complex.java 
          package p1;

           public class Complex{ // Packaged class }

		 -- in Program.java
		    package p1;
           
             public class Program{// Packaged class }

	```
     - command for compilation
        1. >  javac -d ./bin ./src/Complex.java
        2. >  export CLASSPATH=./bin/
        3. >  javac -d ./bin/ ./src/Program.java

    
	  - while executing need to use package name . file name  
      > java p1.Program;

    - 3. how to import static method in a java file 
    ```java
	--- Test class
	package test;

     class Test{

    public static void print()
    {
       System.out.println("hello from test");
    }
	 
	--- Program class
	      package test;
          import static test.Test.print;
           public class Program{

         public static void main(String[] args) {
       
         System.out.println("Hello ");
      
            print();
          }  
        }
	 
	```
     - command for compilation
        1. >  javac -d ./bin ./src/Test.java
        2. > export PACKAGEPATH=./bin/test
		3. >  export CLASSPATH=./bin/
        4. >  javac -d ./bin/ ./src/Program.java

    
	  - while executing need to use package name . file name  
      > java test.Program;

6. demo for importing static class, static method and variable of package class

```java

import static java.lang.Math.PI;
import static java.lang.Math.pow;
// import static java.lang.Math.*;
public class Program{

    public static void main(String[] args) {
       
      
        float radius = 10;
  
        float area = (float) (PI * pow(radius,2));
    
        System.out.println("Area : " + area);
  
      }

```
 - 3. how to import static method in a java file 
    ```java
	--- Test class
	package test;

     class Test{

    public static void print()
    {
       System.out.println("hello from test");
    }
	 
	--- Program class
	      package test;
          import static test.Test.print;
           public class Program{

         public static void main(String[] args) {
       
         System.out.println("Hello ");
      
            print();
          }  
        }
	 
	```
     - command for compilation
        1. >  javac -d ./bin ./src/Test.java
        2. > export PACKAGEPATH=./bin/test
		3. >  export CLASSPATH=./bin/
        4. >  javac -d ./bin/ ./src/Program.java

    
	  - while executing need to use package name . file name  
      > java test.Program;

### read
1. can we define multiple classes in single java file?
  - NO , as classname and .java file name should be same
  
2. java.lang.Object 
- what are the methods in object ?
- using this command on terminal we can get methods in java Object
  > javap javaObject
!['answer']()  