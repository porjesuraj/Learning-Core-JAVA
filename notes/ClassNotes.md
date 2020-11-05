
Slogan of java: write once,run anywhere
Slogan of .net : run once ,run always
# Syllabus  Java Technologies-I( Core Java)
```
Data Types, Operators and Language, Constructs, Inner Classes and Inheritance, Interface and Package, Exceptions, Collections, Threads, Java.lang, Java.util,  Java.io , Java Persistent, Servlets, Java Virtual Machine
```

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

# Day4

!['day4.1'](day4.1.png)

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
- reference is always on java stack, instance is always on heap section 
!['day4.2'](day4.2.png)
1. create a date object, as a date member of Employee class ,so birthDate is a reference 
 - in C ++ this use of date class as data member of Employee is called Association , i.e tight coupling 
 - here emp is reference stored on java stack
 - instance of Employee containing(empid,bithdate) stored on heap section
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


# Day5

## notes 
1. Non static data member declared inside class is called instance variable.
2. Non static member function declared inside a class is called instance method.
3. in java Object is called as instance. 
- Ex: 
```java 
 Complex c1 = new Complex(); // c: refrence /object reference
```
4. Instance member are designed to access using object reference
- Instance member = {Instance variable ,instance method}
```java
class Test{
   int num = 10; // in java and C# we can initializa at time on 
   public  void print(){
      System.out.println(num);
   }

   main(){

      Test t1 = null;
      t1 = new Test();
      t1.num = 10; 
      t1.print();
   }
}


```

5. Instance variable gets space once per instance according their declaration inside class.
6. to initialize instance variable,we should use constructor,and
 - constructor get called once per instance.
7. Static :
- Static data member declared inside class,is called class level variable.
- Static member function declared inside class is called class level method
- class level members are designed to access using class name and dot(.) operator

```java
class Test
{
   static int number;
   public static void print()
   {
      System.out.println(Test.number);
   }
}

main( ) 
{
Test.number = 10;
Test.print();
}
```
- if we want to share value of field in all the instance of same class then we should declare such field static.
- non static field do not get space inside instance.
- static member get space once per classs during class loading on method area.
- eg. for every instance of class A static member in called only once in first instance , on method area
```java
class A{
   static int num;
}
// static variable get called once per class
class B{
   static int num;
}

```
- **in C# static is a constructor (static,)??**
- if we want to initialize static fileds of the class then we should use static initialiser block.
```java

static { //static member initiasize
        }

```
!['']()


```java
class Test{
	private int num1;
	private int num2;
	private static int num3;
	static
	{
		System.out.println("Inside static initializer block of class test");
	  Test.num3 = 500;	
	}
	public Test( int num1, int num2 ) {
		this.num1 = num1;
		this.num2 = num2;
		System.out.println("Inside test constructor block" );
		
	}
	
	public void print()
	{
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2 );
		System.out.println("num3 = " +  num3);
	}
	
	
}
public class Program {
	
	static {
		System.out.println("inside static initializer block of program");
	}
	
	public static void main(String[] args) {
		
		System.out.println("inside static block of program main");
		
		Test t1 = new Test( 10, 20 );
		Test t2 = new Test( 30, 40 );
		Test t3 = new Test( 50, 60 );
		
		t1.print();
		t2.print();
		t3.print();
	  
	}
}


```
### this refrence for static and non-static
- non static method are caleed by instance of classm so it gets this refrence/pointer
- static method are called by class name, so it does not this refrence/pointer
- this refrence  is link between not static member and nobn static method
- (#) using instance we can refer non static variable in static method
- tatic variable can directly be reffered in static method

- method not containing this refrence ,should be static method

```java
public class Program {
	
	private int num1 = 10;
	private static int num2 = 20;
	
	public static void main(String[] args) {
		
		
		 (#) // System.out.println("Num1 : " + num1); // Not Ok
		
		Program p1 = new Program();
		System.out.println("Num1 : " + p1.num1);
		
		
		
		System.out.println("Num2 : " + num2); // 20
		
		
	  
	}
}

```

- 1. when to make static
  - if in method , no need for **this reference** , then declare it static

```java
class Test{
	//no need of this reference 
	public static int square(int number)
	{
		return number * number;
	}
	
	
}
public class Program {
	
	int number = Test.square(5);
    
}

```


- 2. cant declare local variable as static variable 
  - as static is class level , it cant be local level 

```java
public class Program {
	
	private static int count;
	public static void print( ) {
	(#)	//int count = 0; // NOT OK
		
		count = count + 1;
		System.out.println("Count	:	"+count);
	}
	public static void main(String[] args) {
		Program.print();	//1
		Program.print();	//1
		Program.print();	//1
	}
}
	

        
```

- 3.**what is  singleton class? write code?**
-  create  instance of singleton class using reflection ?


```java
class Singleton{
	
	private int number;
	
	private Singleton()
	{
		this.number = 0;
		System.out.println("Inside constructor");
	}

	public int getNumber() 
	{
		return number;
	}

	public void setNumber(int number)
	{
		this.number = number;
	}
	private static Singleton instance = null;
	public static Singleton getInstance() {
		
		if(instance == null)
		instance = new Singleton();
	     return instance;	
	}
	
}

public class Program {
	
	
	public static void main(String[] args) {
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();
	}
}

```

- 4. final /cosntant
   - read only variable,
   - not mandetory to inilializing , after declaration 
   - but once initilize ,cant change the value
   - we can take final value at run time , using scanner, also assign at compile time 

```java
public static void main1(String[] args) {
		final int number = 10;
		//number = number + 1;
		System.out.println("Number : " + number);
   }
   
   public static void main(String[] args) {
		final int number;
		number = 10;
		System.out.println("Number : " + number);
   }
   
   public static void main(String[] args) {
		final int number = 10;//OK
		//number = 20; // Not OK
		System.out.println("Number : " + number);
   }
   
   public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int number = 10;//OK
		//number = 20; // Not OK
		System.out.println("Number : " + number);
		
		System.out.println("Num2 : ");
		
		final int number2 = sc.nextInt();
		
		System.out.println("Number : " + number);
	}

```

- 5.  to make a variablee constant , for every instance, and avoid memory loss, by giving static memory is given once

```java
class Test{
	
	final int num1;
	
  public static final int num2 = 20;
	
	public Test()
	{
		this.num1 = 10;
	}
	public void print()
	{
		System.out.println("num1 : " + this.num1);
		System.out.println("num1 : " + this.num2);
	}
	
}

```

- 6. when final  is used at refrence of instance , 
 - here refrence is final (c1) , instance is not final 
- so qwe cannot declare instance final 
```java

class Complex{
	private int real;
   private int imag;
}

public static void main(String[] args) {
		
		// (#)
		final Complex c1 = new Complex(10,20);
		
		System.out.println(c1.toString());
		c1.setReal(100);
		c1.setImag(200);
		// c1 = new Complex(30,40);
		System.out.println(c1.toString());
	}
	

```

- 7. refernce type 
1. 4 types : 
    - 1. Array
      - it is arefence type 
      -  , in other word to create a array it is neccesary to use new operator
    - 2. class
    - 3. enum
    - 4. Interface
2. Array 
- there are three type of Array : 
    - 1. Single dimensional array
    - 2. multi dimensional array
    - 3. Ragged array
      - jagged array is not in java
- if we want to process element of array ,then 
   - we should use method declared in java.util.Arrays class   
3. Single D Array:
- for array of primitive type ,default value of datatype
- for arrray of reference type , default value null
-  array refrence , get spack on java stack
     
  - 7. .1 create Single D array in java

```java

int arr[]; //OK
		int [] arr2 ; //OK
		//int [arr3]; // Not OK

		int[] arr = null;
		arr = new int[3];//OK
   
   -- method to use
      int[] arr2 = new int[3];
      
		//int arr3[] = new int[3];
	
	int[] arr1 = new int[-3]; // NOT OK // Negative array size exception
		

```
- printing array, with exception handling for null
```java
public static void printArray(int[] arr)
 {
	 if(arr != null)
	 {
		 for (int i = 0; i < arr.length; i++) {
				
				System.out.println(arr[i]);
			}
		 
	 }
	
 }

public static void main(String[] args) {
		
	int[] arr1 = new int[3]; 
		
		Program.printArray(arr1);
	 	
int[] arr2 = new int[5]; 
		
	//	Program.printArray(arr2);
		
Program.printArray(null);
	}
```   
- how to declare array initializer list
```java
public static void main(String[] args) {
		//int[] arr = new int[ 3 ] { 10, 20, 30 };	//Not OK // cannot provide dimension , with array initializer list
      int[] arr2 = new int[ ] { 10, 20, 30 };	//OK
      int[] arr3 = new int[ ]; //Not Ok
		int[] arr3 = new int[ 1];	//OK
		Program.printArray(arr);
	}
``` 

- how to accept and print array
```java
private static void acceptArray(int[] arr) {
		if( arr != null ) {
			for( int index = 0; index < arr.length; ++ index ) {
				System.out.print("arr[ "+index+" ]	:	");
				arr[ index ] = sc.nextInt();
			}
		}
   }
   
	private static void printArray(int[] arr) {
		if( arr != null ) {
			for( int index = 0; index < arr.length; ++ index )
				System.out.println(arr[ index ] );
		}
	}
	
	public static void main7(String[] args) {
		int[] arr = new int[ 3 ];
		Program.acceptArray(arr);
		Program.printArray(arr);
	}

```
- how to use methods to manipulate array
```java
int[] arr = new int[] {50,10,20,30,40};
		Program.printArray(arr);
	
		Arrays.sort(arr);
      Program.printArray(arr);
      

```
- how to foreach  loop in java
    - forward only and read only loop 
```java
 public static void main(String[] args) {
			
			int[] arr = new int[] {50,10,20,30,40};
			// for each n java
			for(int element : arr)  // forward only and read only loop
			{
	        System.out.println(element);
         }
			
			
			
		}

```
- how to call toString on array 
```java
 public static void main(String[] args) {
			
			int[] arr = new int[] {50,10,20,30,40};
			// for each n java
		System.out.println(arr.toString()); // output: [I@677327b6 // NOT OK
			
		System.out.println(Arrays.toString(arr)); //[50, 10, 20, 30, 40] //OK
			
		}

```


- 8. Multi Dimensional Array [MDA]

- how to declare MDA
```java
       int arr[] []; //OK
		int[] arr1[]; //ok
		int [] [] arr3; //ok
		int[][] arr4 = null; //ok
      arr4 = new int[4][3];//ok
```
- how to accept and  print MDA
```java
static Scanner sc = new Scanner(System.in);
	
	private static void acceptArray(int[][] arr) {
		if( arr != null ) {
			for( int row = 0; row < arr.length; ++ row ) {
				for( int col = 0; col < arr[ row ].length; ++ col ) {
					System.out.print("arr[ "+row+" ][ "+col+" ]	:	");
					arr[ row ][ col ] = sc.nextInt();
				}
			}
		}
	}
	private static void printArray(int[][] arr) {
		if( arr != null ) {
			for( int row = 0; row < arr.length; ++ row ) {
				for( int col = 0; col < arr[ row ].length; ++ col ) {
					System.out.print(arr[ row ][ col ]+"	");
				}
				System.out.println();
			}
		}
   }
   
   public static void main2(String[] args) {
		
	int [][] arr = new int[4][3];
	
	Program.acceptArray(arr);
	
	Program.printArray(arr);
		
	}



```
- how to initialize MDA, using array initializing list
```java
     public static void main3(String[] args) {
		
		int [][] arr = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		int[][] arr2 = {{1,2,3},{4,5,6},{7,8,9}};
		//int [][] arr = new int[4][3];
		
		Program.acceptArray(arr);
		
		Program.printArray(arr);
			
		}

```

- how to use toString method on MDA
```java
public static void main4(String[] args) {
		
		int [][] arr = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		for (int row = 0; row < arr.length; row++) {
				
			System.err.println(Arrays.toString(arr[row]));
		}
			
		}

```





- 9. Ragged array (for java) (in C# jagged array)
   - it is array of arrays such that member arrays can be of different sizes, i.e., 
       - we can create a 2-D arrays but with variable number of columns in each row.
       -  These type of arrays are also known as Jagged arrays.
       -  A Jagged or also called Ragged array is a n-dimensional array that need not the be reactangular
- how to declare a ragged
```java
public static void main(String[] args) {	
		int [][] arr = new int[4][];
		
		arr[0] = new int[] {1,2,3};
		arr[1] = new int[] {4,5};
		arr[2] = new int[] {6,7,8,9};
		arr[3] = new int[] {10};		
}	

```

- how to initialize ragged array using array inilializer list
```java
public static void main(String[] args) {
		
		int [][] arr = new int[4][];
		
		arr[0] = new int[] {1,2,3};
		arr[1] = new int[] {4,5};
		arr[2] = new int[] {6,7,8,9};
		arr[3] = new int[] {10};
		
		
		
}	

```

- 10. array of primitive type 

- how to 
```java
public static void main(String[] args) {
		
		double[] arr = new double[3]; //array of primitive type
		
		System.out.println(Arrays.toString(arr));//
	}
public static void main2(String[] args) {
	
		int[] arr = new int[3]; //array of primitive type
		
		System.out.println(Arrays.toString(arr));//
	}
	public static void main1(String[] args) {
		
		
		boolean[] arr = new boolean[3]; //array of primitive type
		
		System.out.println(Arrays.toString(arr));//[false, false, false]
		
		
		
	}

```

- 11.  array of non-primitive/reference type 
 
- how to declare array of referencssa
    - here it is array of referneces ,as out shows 
```java

class Complex{}

public static void main(String[] args) {
		
		Complex[] complex = new Complex[3];
		
		System.out.println(Arrays.toString(complex));//[null, null, null]
		
		
	}
```
- how to declare array of instances/object
```java
public static void main(String[] args) {
	
		Complex[] complex = new Complex[3];
		
		for (int i = 0; i < complex.length; i++) {
			complex[i] = new Complex(); //aray of objects
		}
		
		System.out.println(Arrays.toString(complex));//[Complex [real=10, imag=20], Complex [real=10, imag=20], Complex [real=10, imag=20]]
	}

```

- 12. ways to pass value to function 
    - 1. C -  2 ways, value/address
    - 2. C++ - 3 ways , value/address/reference
    - 3. C# - using unsafe keyword (i.e pointer can be used to pass to function as argument)
    - 4. Java -
        - no concept of pass by reference
        - each argument is passed to function by value in java
        - so how to pass by reference is if required ? e.g (for swap function)
        - answer: can be done using array, it will update values in array , of varailbe we want to pass by reference
```java
private static void swap(int a,int b) //NOT WORKING
	{
		int temp = a;
		a = b;
		
		b = temp;
	}
	private static void swap(int[] arr ) // WORKING
	{
		int temp =arr[0];
		arr[0] = arr[1];
		
		arr[1] = temp;
	}
   public static void main(String[] args)// WORKING
    {
		
		int a = 10;
		int b = 20;
		
		int[] arr = new int[] {a,b}; 
		Program.swap(arr);
		
		a = arr[0];
		b = arr[1];
		System.out.println("a :" +  a);
		System.out.println("b :" +  b);
		
		}
public static void main1(String[] args) //NOT WORKING
 {
		
	int a = 10;
	int b = 20;
	//Program.swap(a, b);
	
	System.out.println("a :" +  a);
	System.out.println("b :" +  b);
	
	}

```

### Slides

!['Day5.1'](day5.1.png)
!['Day5.2'](day5.2.png)
!['Day5.3'](day5.3.png)
!['Day5.4'](day5.4.png)
!['Day5.5'](day5.5.png)
!['Day5.6'](day5.6.png)
!['Day5.7'](day5.7.png)
!['Day5.8'](day5.8.png)
!['Day5.9'](day5.9.png)

### READ


1. **what is  singleton class? write code?**
  -  create  instance of singleton class using reflection ?

2. for sorting The sorting algorithm is a <u>Dual-Pivot Quicksort</u> by Vladimir Yaroslavskiy, Jon Bentley, and Joshua Bloch







# Day6

### to read
1. Hierarchy
2. assembly info.css file contains attribute on assembly level in .NET
3. calling method on null object , gives  nullpointer exception
4. classpath/runtime class path/build path
### notes

!['Day6.1'](day6.1.png)
!['Day6.2'](day6.2.png)
!['Day6.3'](day6.3.png)
!['Day6.4'](day6.4.png)
!['Day6.5'](day6.5.png)
!['Day6.6'](day6.6.png)
!['Day6.7'](day6.7.png)
!['Day6.8'](day6.8.png)

### myNotes


1. Hierarchy
- level of abstraction is called hierarchy
- types of hierarchy:
1. Is-a : Inheritence
2. Has-a : Association
3. Use - a : Dependency
4. Creates-a  :  Instantiation
- 

2. Association 
- if "has-a" relation between two class, then use Association 
- here reference of class ,get memory in object instance 
- asso: object part of another object
   - physically only reference to associated object is there in objects instance, so it is 
   - object outside object.
   - so if we want to ignore the asso object ,set it as null
- so,in java Instance can oontain object reference, but instance cannot contain another instance
   


3. Java ARchive (JAR)
- to create  a lib

4. inheritence(extends)
- it is a process of acquiring properties and behaviour of super class by the sub class.
- when to use inheritence 
    1. without modifying implementation of existing class,if we want to extend meaning of that class then ,use
- to extend the class we should use extends keyword.
- using super statement  we can use members of superclass inside method of sub class.
- Using super statement, we can call constructor of super class from constructor of sub class.
- in java any class can extend only one class.
- for every class is extended from Object
- java do not support multi class inheritence
- Except Constructor, all members of super class of any access modifier inherit into sub class.
- super statement must be first statement inside constructor body
- Example : Employee is a Person
```java

class Person extends Object{}
class Employee extends Person{}

```

5. upcasting : process of converting of reference of sub class to reference of super class
 - it helps us to reduce maintenance of system
6. 

### demo 

1. How to declare dynamic arguments (to get multiple values as argument)
```java
public static void sum( int... arguments ) {
		int result = 0;
		for( int element : arguments )
			result = result + element;
		System.out.println("Result	:	"+result);
	}
	public static void main2(String[] args) {
		Program.sum( );
		Program.sum( 0 );
		Program.sum( 10, 20 );
		Program.sum( 10, 20, 30, 40, 50  );
		Program.sum( 10, 20, 30, 40, 50, 60, 70, 80  );
	}

```
2. Auto unboxing 
```java
public static void main(String[] args) {
		Integer n1 = new Integer("125");
		//int n2 = n1.intValue();	//UnBoxing
	
		int n3 = n1;	//Auto-UnBoxing
		//int n3 = n1.intValue();		
		System.out.println(n3);
	}

```
3. Enum decalaration, calling method using Enum  name, enum object, use of name,ordinal,valueOF methods
```java
enum Color{
	RED, GREEN, BLUE
}

static Scanner sc = new Scanner(System.in);

// using scanner to print ordinal value 
	public static void main(String[] args) {
		System.out.print("Name	:	");
		String str = sc.nextLine(); //RED,GREEN, BLUE
		
		Color color = Color.valueOf(str.toUpperCase());
		String name = color.name();
		int ordinal = color.ordinal();
		
		System.out.printf("%-10s%-5d\n", name, ordinal);
	}
	//using values method to instantiate enum array
	public static void main5(String[] args) {
		Color[] colors = Color.values();
		for (Color color : colors) {
			String name = color.name();
			int ordinal = color.ordinal();
			System.out.printf("%-10s%-5d\n", name, ordinal);	
		}
	}
// using instance of enum to call name,ordinal method
	public static void main4(String[] args) {
		//Color color = Color.RED;
		//Color color = Color.GREEN;
		Color color = Color.BLUE;
		String name = color.name();
		int ordinal = color.ordinal();
		System.out.printf("%-10s%-5d\n", name, ordinal);
	}
	
	// using className to call name,ordinal method
	public static void main1(String[] args) {
		String name = Color.RED.name();
		int ordinal = Color.RED.ordinal();
		System.out.printf("%-10s%-5d\n", name, ordinal);
	}


```
4. Enum constructor, getter,setter,toString 
```java
enum Day{
	//SUN,MON,TUES; //OK
	SUN(1,"Sunday"),MON(2,"Monday"),TUE(3,"Tuesday"); //Hint : consider these are objects like C++
private int dayNumber;	
private String dayName;

	/* individual constructor
	 * private Day(int dayNumber) { this.dayNumber = dayNumber; }
	 *  private Day(String dayName) { this.dayName = dayName; }
	 */
private Day(int dayNumber,String DayName)
{
	this.dayNumber = dayNumber;
	this.dayName = DayName;
}

public int getDayNumber() {return dayNumber;}

public void setDayNumber(int dayNumber) {
	this.dayNumber = dayNumber;
}


public String getDayName() {return dayName;}



public void setDayName(String dayName) {this.dayName = dayName;}

@Override
public String toString()
{
	return String.format("%-10s%-5d", this.dayName,this.dayNumber);
}

}

public static void main(String[] args) {
		Day[] days = Day.values();
		for (Day day : days) {
			String name = day.name();
			int ordinal = day.ordinal();
			System.out.println(name+"	"+ordinal+"	"+day.toString());
		}
	}
```

5. using methods of java.util class 
- 1. Calender
```java

public static void main1(String[] args) {
		Calendar c = Calendar.getInstance();
		
		int day = c.get(Calendar.DATE);
		int month = c.get(Calendar.MONTH)  + 1;
		int year = c.get(Calendar.YEAR);
		
		System.out.println(day + "/" + month + "/" + year);	
		
		}
public static void main2(String[] args) {
		// to find system date
		
		Calendar c = Calendar.getInstance();
	
		//Date time = c.getTime(); 
		
		int hour = c.get(Calendar.HOUR);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		int millisecond = c.get(Calendar.MILLISECOND);
		
		
		System.out.println(hour + ":" + minute + ":" + second + ":" + millisecond);	
		
		}
	

```
- 2.   java.time package classes localtime,localdate
  - java.Date class is depricated
```java
public static void main(String[] args) {
		// to find system date
		
		LocalTime lt = LocalTime.now();
	
		//Date time = c.getTime(); 
		
		int hour = lt.getHour();
		int minute = lt.getMinute();
		int second = lt.getSecond();
		int nanosecond = lt.getNano();
		
		
		System.out.println(hour + ":" + minute + ":" + second + ":" + nanosecond);	
		
		}
	public static void main3(String[] args) {
		// to find local date

		LocalDate ld = LocalDate.now();
		
		int day = ld.getDayOfMonth();
		int month = ld.getMonthValue();
		int year = ld.getYear();
		
		System.out.println(day + "/" + month + "/" + year);	
		
		
		
		}

```

- 3. java.util.Date class demo, but mostly depricated, not to use

```java
public class Program {
	public static void main(String[] args) {
		Date date = new Date();
		
		int day = date.getDay();
		int month = date.getMonth();
		int year = date.getYear();
		
		System.out.println(day + "/" + month + "/" + year);	
		
		
		
		}
```

6. **inheritence in java, using super keyword** 
- default mode of inheritence is public 
- in java, except constructor,all member(static,not static,private) of superclass inherit in sub class
- using super keyword we can access member of super class in method of sub class
```java
class Person{
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void printRecord()
	{
		System.out.println("Name: " + this.name);
		System.out.println("Age : " + this.age);
	}	
}

class Employee extends Person{
	
	
	private int empid;
	private float salary;
	
	public Employee() {
		this.empid = 0;
		this.salary = 0;
		System.out.println("Employeee cont");
	}
	
	public Employee(String name,int age,int empid,float salary) {
         // in c++ , constructor base initializing list   
		super(name,age); 
		this.empid = empid;
		this.salary = salary;
		System.out.println("Employeee cont");
	}
	
	public void printRecord()
	{// using super keyword we can access member of super class in method of sub class
		super.printRecord();
		
		System.out.println("emp id: " + this.empid);
		System.out.println("Salary : " + this.salary);
		
	}
	
	public static void main(String[] args) {
		
		Employee emp = new Employee("suraj",26,1,23);
		emp.printRecord();
		// output Name: suraj Age : 26 empid  : 1Salary : 23.0
       // ie.base class method also implemented
		
			
		}
}



```

7.  **upcasting and downcasting in java**
- upcasting : process of asigning/converting of reference of sub class to reference of super class
- Downcasting : process of converting reference of super class into reference of sub class is called
- Exception :**ClassCastException**:
Thrown to indicate that the code has attempted to cast an object to a subclass of which it is not an instance
```java
public static void main1(String[] args) {
		Employee emp = new Employee("suraj",26,1,23;
		emp.printRecord();	
		Employee emp2 = emp; //Shallow copy			
		}

public static void main2(String[] args) {
		Employee emp = new Employee("suraj",26,1,23;
		Person p = emp;  //OK //UPcasting 	
		}

	public static void main4(String[] args) {
		Person p1 = null;
		
		Employee emp = (Employee) p1; //downcasting
		System.out.println(p1);
		System.out.println(emp);
			}	

	public static void main5(String[] args) {	
		Person p1 = new Employee();// upcasting
		Employee emp = (Employee) p1;//downcasting
		System.out.println(p1);
		System.out.println(emp);
			}	
public static void main(String[] args) {		
Person p1 = new Person();		
Employee emp = (Employee) p1;
// ClassCastException
	}			

```

8. How to 
- runtime polymorphism in c++, in java we have 
- **Dynamic method dispatch**
   - it is a process of calling method of sub class using reference of super class 
-  it works on method printRecord in demo, showing
   - in java, method are by default virtual

```java
class Person{
	private String name;
	private int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void printRecord( ) {
		System.out.println("Name	:	"+this.name;
		System.out.println("Age	:	"+this.age);
	}
}
class Employee extends Person{
	private int empid;
	private float salary;
	public Employee(String name, int age, int empid, float salary){
		super( name, age );
		this.empid = empid;
		this.salary = salary;
	}
	public void printRecord( ) {
		super.printRecord();
		System.out.println("Empid	:	"+this.empid);
		System.out.println("Salary	:	"+this.salary);
	}
}


public static void main(String[] args) {
		
		// Dynamic method dispatch
		// in java, method are by default virtual
		Person p = new Employee(); //upcasting 
		
		p.printRecord();
	}
```

9. How to make a jar(Java ARchieve) file
- make a project ,and write your code in package class, mostly methofs,no main method 
- right click on project
   + go to export ---> java---> Jar file(select it)
   + give destination folder for jar file , done 

10. How to refer/import a jar file from a folder
- right click on project in which you want to refer the jar file
   + click on build path ---> Add external jar files , done   

# Day7 

### to read 
1. difference between error and exception 
2. types of exception , diff between , designed for java compiler, for jVM all re just exception .
3. stack trace: message we get after exception 
4. DRY = Do not Repeat Yourself
- 1. DRY stand for "Don't Repeat Yourself,"
-  a basic principle of software development aimed at reducing repetition of information.
-   The DRY principle is stated as, "Every piece of knowledge or logic must have a single, unambiguous representation within a system."
- 2.  how to achieve it 
-  divide your system into pieces.
-   Divide your code and logic into smaller reusable units and use that code by calling it where you want. 
-   Don't write lengthy methods, but divide logic and try to use the existing piece in your method.


5. KISS
- 1.  KISS: Keep It Simple, Stupid
- 2. The KISS principle is descriptive to keep the code simple and clear, making it easy to understand.
-  Keep your methods small. 
-  Each method should never be more than 40-50 lines.
- Each method should only solve one small problem, not many use cases.
-  If you have a lot of conditions in the method, break these out into smaller methods. 
-  It will not only be easier to read and maintain, but it can help find bugs a lot faster.
-  3. how to achieve it 
- Think of many solutions for your problem, then choose the best, simplest one and transform that into your code.
-  Whenever you find lengthy code, divide that into multiple methods
-   — right-click and refactor in the editor. Try to write small blocks of code that do a single task.

6. page 8 and 9
7. **Assertion**  in java docs 
> https://docs.oracle.com/javase/8/docs/technotes/guides/language/assert.html

- 1. An assertion is a statement in the Java programming language that enables you to test your assumptions about your program. 

- 2. Each assertion contains a boolean expression that you believe will be true when the assertion executes.
     -   If it is not true,
     - the system will throw an error.   
  - By verifying that the boolean expression is indeed true, the assertion confirms your assumptions about the behavior of your program, increasing your confidence that the program is free of errors.
  
 - 3. benifits of using Assertion:
1. it is one of the quickest and most effective ways to detect and correct bugs. 
2. assertions serve to document the inner workings of your program, enhancing maintainability.   
- syntax
- the assertion statement has two forms : 
- where, 
     - Expression1 is a boolean expression.
     - Expression2 is an expression that has a value. 
- When the system runs the assertion, it evaluates Expression1 and if it is false throws an AssertionError with no detail message.
```java 
assert Expression1 ;

assert Expression1 : Expression2 ;

```



### tommorow 
1. final,abstract,instance,generics
2. c++ template, c# generics 
### notes

1. any class that implements AutoClossable interface ,
  -  class is called  resource type 
  -  class instance is called Resource
- Non Java resource /OS resources(unmanaged resources) 
  - 1. File
  - 2. Thread
  - 3. Socket 
  - 4. Network Connection
  - 5. IO devices  
- if we want to manage os resources carefully in java application then we should use exception handling
- if we want to handle exception , then we should use 5 keywords:
1. try
2. catch 
3. throw
4. throws
5. finally

2. what is Exception?
- Runtime error is called as exception 
- **Exception is an instance** which is used to send notification to the end user of the system if any exceptional condition occurs in the program .

3.      java.lang.Object(class)
             |
       java .lang.Throwable  (class)
          |                  |
(class)	java.lang.Error     java.lang.Exception (class)

4. Exception Handing in java
- The Throwable class is the superclass of all errors and exceptions in the Java language. 
- Only objects that are instances of this class (or one of its subclasses) are thrown by the Java Virtual Machine or can be thrown by the Java throw statement. 
- Similarly, only this class or one of its subclasses can be the argument type in a catch clause.

5. Error
- it is an class defined in java.lang package.
- it is a subclass of java.lang.Throwable that indicates serious problems that a reasonable application should not try to catch. 
- Most such errors are abnormal conditions. 

- Example :
- VirtualMachineError
     - Thrown to indicate that the Java Virtual Machine is broken or has run out of resources necessary for it to continue operating.
- OutOfMemoryError
     - Thrown when the Java Virtual Machine cannot allocate an object because it is out of memory, and no more memory could be made available by the garbage collector. 
-  StackOverflowError

- Thrown when a stack overflow occurs because an application recurses too deeply.
 
- ERROR
1. we can write try-catch block to handle errors but we should avoid it. 
2. we can not recover from error hence we should not write try-catch block  
3. generated by environmental condition 

## **EXCEPTION**
1. it is a class declared in java.lang package
2. it is sub class of java.lang.Throwable class
3. Exception gets generated due to applications
4. Example
 - 1. NumerFormatException
 - 2. NullPointerException
 - 3. ArrayIndexOutOfBoundException
5. we can recover from exception, by handling it
 - to handle exception , we should use try=catch block 
6. there are two types of exception ,designed for java compiler, not jVM:
- 1. Checked
- 2. Unchecked
- JVM do not distinguish between checked and unchecked exception.these types are designed for java compiler. 
 
7. Unchecked Exception
- java.lang.RuntimeException and all its sub classes are considered as unchecked exception
- for this, handling unchecked exception is not mandetory.(its optional)
- Example : 
- 1. NumberFormatException
- 2. NullPointerException
- 3. ArrayStoreException
- 4. ClassCastException
- 5. IllegalArgumentException

8. Checked Exception
- java.lang.Exception and all its subclasses except java.lang.RuntimeException and all its sub classses are called as checked exception.
- it is mandetory to handle checked exception , or compiler gives compile time error
- 3. Example 
- 1. CloneNotSupportedException
- 2. InterruptedException
- 3. CLassNotFoundException

### Demo 

-  throw statement in Java
```java
public static void main(String[] args) {
		// Throwable();
	Throwable th1 = new Throwable();
	//Throwable(String message)
	Throwable th2 = new Throwable("this is exception demo");
	//	Throwable(String message, Throwable cause)
	Throwable cause = new Throwable("this is exception");
	Throwable th3 = new Throwable(cause);
	
	//	Throwable(String message, Throwable cause, boolean enableSuppression,
	Throwable cause2 = new Throwable();
	Throwable th4 = new Throwable("this is exception",cause);
		
	}
	public static void main1(String[] args) {
		
		Test t = new Test();
		//throw t; not ok
	}

```

9. Try
- it is a kryword in java. 
- if we want to keep watch on statement then we should use try block/handler.
- we  cannot define try block after catch/finally block.
- in java try block must have atleast one
  - catch block
  - finally block
  - resource 

```java

try{

// try catch
}catch(NullPointerException ex){
ex.printStackTrace();
}

//try finally
---
try{

}finally {

}



//try resource syntax
---
try(Scanner sc = new Scanner(System.in)){


}


```

10. Catch 
- it is a keyword in java.
- tf we want to handle exception then we should use catch block/handler.
- we should define catch block after try and before finally block 
- Single try block may have multiple catch blocks.
- catch block can handle exception thrown from try block only . 

- During arithmetic operation if any exception situation occurs then JVM throws ArithmeticException
```java
		try {
		System.out.println("Num 1 : ");
		int num1 = sc.nextInt();
		
		System.out.println("Num 2 : ");
		int num2 = sc.nextInt();

		
			int result = num1/num2 ;
			
			System.out.println("Result : " + result);
		}
		catch(ArithmeticException ex)
		{
			
			ex.printStackTrace();
		}
		catch(InputMismatchException ex)
		{
			System.out.println("InputMisMatchException");
			ex.printStackTrace();
		}


```
- multi catch block 
- it can handle multiple specific exception 
```java
try {
		System.out.println("Num 1 : ");
		int num1 = sc.nextInt();
		
		System.out.println("Num 2 : ");
		int num2 = sc.nextInt();

		
			int result = num1/num2 ;
			
			System.out.println("Result : " + result);
		}
		catch(ArithmeticException | InputMismatchException ex)
		{ // Multi catch block 
			
			ex.printStackTrace();
		}

```
- EXCEPTION class 
-  reference of java.lang.Exception class can contain reference of instance of any checked as well as unckecked exception, hence to write generic catch block you should use Exception class

```java

// generic catch syntax

try{

} catch(Exception ex)
{ex.printStacktrace();
}

// reason for use of exception 
public static void main(String[] args) {
		
		InterruptedException ex1 = new InterruptedException("Interrupted");
		
		Exception ex2 = new InterruptedException("Interrupted"); // upcasting
		
	   Exception ex3 = new NullPointerException("null pointer exc"); // upcasting
		}
	public static void main1(String[] args) {
		
	NullPointerException ex1 = new NullPointerException("Null pointer Exception");
	
   RuntimeException ex2 = new NullPointerException("null pointer exc"); // upcasting
   
   Exception ex3 = new NullPointerException("null pointer exc"); // upcasting	
	}

```

   - CATCH block sequence, in case of inherited exception  
 - if inheritence exist between exception types then it is mandetory to handle all sub type exception first.
 ```java
 	
	try {
Scanner sc =new Scanner(System.in);
		
		System.out.println("Num1  :");
		int num1 = sc.nextInt();
		System.out.println("Num2  :");
		int num2 = sc.nextInt();
	   
		
		int result = num1 / num2;
	}
	catch(ArithmeticException ex)
	{
	 System.out.println(" arithmetic Exception");	
	}
	catch(RuntimeException ex)
	{
	 System.out.println("Runtimee Exception");	
	}
	
	catch(Exception ex)
	{
	 System.out.println("Exception");	
	}
	

 ```

 - so we can use generic catch block for all exception 
```java

		try {
	Scanner sc =new Scanner(System.in);
			
			System.out.println("Num1  :");
			int num1 = sc.nextInt();
			System.out.println("Num2  :");
			int num2 = sc.nextInt();
		   
			
			int result = num1 / num2;
		}
		catch(Exception   ex)
		{
		 System.out.println(" arithmetic Exception");	
		}

```

11. throw
- it is a keyword in java
- to generate new exception, we must use throw keyword
- Using throw keyword,we can throw instance of sub class of throwable only.
- throw statement is a jump statement, as it takes control to catch block 
```java
Scanner sc =new Scanner(System.in);
		try {
			System.out.println("Num1  :");
			int num1 = sc.nextInt();
			System.out.println("Num2  :");
			int num2 = sc.nextInt();
		   if(num2 == 0)
		    throw new ArithmeticException("divide by zero exception"); // throw 		   
			int result = num1 / num2;
		}
		catch(Exception ex)
		{
		 System.out.println(ex.getMessage());	
		}
			sc.close();
				
			}

```
- 
12.   Finally 
- it is a keyword in java
- we can not define finally  block before try and catch block 
- try block can contain only obne finally block 
- if we want to release local resources then we should use finally block 
- JVM always execute finally block
- before control is coming to finally block,if we forcefully terminate JVM then , the finally block will not get executed
```java
Scanner sc = null ; // Local
		try {

			System.out.println("Inside try");
			 sc = new Scanner(System.in);
			System.out.println("Num1  :");
			int num1 = sc.nextInt();
			System.out.println("Num2  :");
			int num2 = sc.nextInt();
		   if(num2 == 0)
		    throw new ArithmeticException("divide by zero exception");
		   
			
			int result = num1 / num2;
			
			System.out.println(" result : " + result);
		//	System.exit(0); // forcefull termination 
		}
		catch(Exception ex)
		{System.out.println("Inside catch");
		 System.out.println(ex.getMessage());	
		
		}
		finally {
			System.out.println("Inside final");
			sc.close();
		}
				
```

13.  try with resource
```java
	try(Scanner sc = new Scanner(System.in))
		{
			System.out.println("Num1  :");
			int num1 = sc.nextInt();
			System.out.println("Num2  :");
			int num2 = sc.nextInt();
			int result = num1 / num2;
			System.out.println(" result : " + result);
			System.exit(0);
		}
		catch(Exception ex) {
		 System.out.println(ex.getMessage());	
		
		}
```

 
14.  throws 
- if we want to delegate exception from one method to another method ,we use throws clause
-  exception should be handled centraly , in main method

```java
public static void showRecord() 
	{
		try {System.out.println(Thread.currentThread());
		for (int count = 0; count <= 10; count++) {
		System.out.println("Coutn : " + count);	
		
		Thread.sleep(250);
			
		     }
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
			
		
	}
	public static void displayRecord() throws InterruptedException
	{
		System.out.println(Thread.currentThread());
		for (int count = 0; count <= 10; count++) {
		System.out.println("Coutn : " + count);	
		
		Thread.sleep(250);
			
		}
	}
	public static void main(String[] args)  {
		
		//Program.showRecord();
		// exception should be handled centraly , in amin method
		try {
			Program.displayRecord();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

```

- unchecked exception 
```java
public static int parseInt(String s )  throws NumberFormat Exc

public static void main(String[] args)  {
	
		String str = "125";
		
		int number = Integer.parseInt(str); // no need for try catch as unchecked
		
		System.out.println("Number : " + number);

		
	}

```
- check exception 
```java

public static native void sleep(long time) throws Interrupted Exception (checked)

	public static void main(String[] args)  {
		
		for (int count = 0; count <= 10; count++) {
			
			System.out.println("Count :" + count);
			
			try {
				Thread.sleep(250);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		}
```


15. Custom Excepton
- JVM cannot understand exceptional conditions generated in business logic 
- to handle it we should use user defined/custom exception class.

- 1.  Custom Unchecked Exception class
   ```java
   class StackOverFlowExcption extends RuntimeException{}
   ```
- 2.  Custom Unchecked Exception class
   ```java
   class StackOverFlowExcption extends Exception{}
   ```


16. Method Overriding 
- process of redefining method of super class inside method of sub class is caleed method overriding
- Rules of Method Overridiing -
- 1. Access modifier, of SUB class method should be same or ot should be wider
- 2. return type of sub class method should be same or it should be sub type ,in other word
- 3.  Name of method,number of parameters and type of parameters of sub class method 
- 4. 
- 5. During overriding unchecked exception are not considered.

17. if runtime error(nullpointer,Arrayoutofbound error) get generated due to developers mistake, it is called bug in exception handling case ,
- for this we should not use try catch case

18. Exception : runtime  error due to user/client mistake, so we need to use try catch case
- so all checked exception are generated by user/client mistake
- if runtime error ,came due to environmental reason , we cant recover from it, so dont write try catch for it.  

19. demo on custom exception 

```java
@SuppressWarnings("serial")
public class StackOverflowException extends Exception{
	public StackOverflowException(String message) {
		super(message);
	}
}

SuppressWarnings("serial")
public class StackunderflowException extends Exception{
	public StackunderflowException(String message) {
		super(message);
	}
}

```


20. demo on implementation of stack with custom exception 

```java
package utils;

import exceptions.StackOverflowException;
import exceptions.StackUnderflowException;

public class Stack {
	private int top = -1;
	private int[] arr;
	public Stack(  ) {
		this( 5 );
	}
	public Stack( int size ) {
		this.arr = new int[ size ];
	}
	public boolean empty( ) {
		return this.top == -1;
	}
	public boolean full( ) {
		return this.top == this.arr.length - 1;
	}
	public void push( int element ) throws StackOverflowException {
		if( this.full())
			throw new StackOverflowException("Stack is full");
		this.arr[ ++ this.top ] = element;
	}
	public int peek( ) throws StackUnderflowException {
		if( this.empty())
			throw new StackUnderflowException("Stack is empty");
		return this.arr[ this.top ];
	}
	public void pop( ) throws StackUnderflowException {
		if( this.empty())
			throw new StackUnderflowException("Stack is empty");
		-- this.top;
	}
}


```


21. demo on main program on stack implement using enum

```java
public enum IOOperation {
	EXIT, PUSH, POP
}

public class Program {
	static Scanner sc = new Scanner(System.in);

	public static void acceptRecord( int[] element ) {
		if( element != null ) {
			System.out.print("Enter element	:	");
			element[ 0 ] = sc.nextInt();
		}
	}
	public static void printRecord( int[] element ) {
		if( element != null ) 
			System.out.println("Popped element is "+element[0]);
	}
	public static IOOperation menuList() {
		System.out.println("0.Exit");
		System.out.println("1.Push");
		System.out.println("2.Pop");
		System.out.print("Enter choice	:	");
		return IOOperation.values()[ sc.nextInt() ];
	}
	@SuppressWarnings("incomplete-switch")
	public static void main(String[] args) {
		IOOperation choice;
		int[] element = new int[ 1 ];
		Stack stk = new  Stack();
		while ((choice = Program.menuList()) != IOOperation.EXIT) {
			try {
				switch (choice) {
				case PUSH:
					Program.acceptRecord( element );
					stk.push(element[0]);
					break;
				case POP:
					element[ 0 ] = stk.peek();
					Program.printRecord(element);
					stk.pop();
					break;
				}
			} catch (StackOverflowException | StackUnderflowException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}


```
22. demo on exception classes accepting sub classes of exception as throw object

```java

class A extends Exception{	}
class B extends Exception{	}
class C extends Exception{	}
public class Program {
	//public void print( String str ) throws A, B, C {
	public static void print( String str ) throws Exception {
		if( str == null )
			throw new A( );
		if( str == " ")
			throw new B( );
		if( str == "empty")
			throw new C( );
		System.out.println(str);
	}
	public static void main(String[] args) {
		try {
			Program.print("DAC");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}


```
23. demo on Exception chaining 
- in case a interfaced method has checked exception in sub class , but not in interface class, so 
- - in methods catch we can throw another exception method i.e unchecked
   - we can pass the checked Exception as  a object in unchecked exception(runtime exception)
   - and implement try catch in main to catch and handle it 
- this is known as Exception chaining . 

```java
interface A{
	void print( );
}
class B implements A{
	public void print()throws RuntimeException {
		try {
			for( int count = 1; count <= 10; ++ count ) {
				System.out.println("Count	:	"+count);
				Thread.sleep(250);
			}
		} catch (InterruptedException cause) {
			throw new RuntimeException(cause); //Exception Chaining
		}
	}
}
public class Program {
	public static void main(String[] args) {
		try {
			A a = new B( );	//Upcasting
			a.print();
		} catch (RuntimeException e) {
			//Throwable t = e.getCause();
			e.printStackTrace();
		}
	}
}


```

### slides

!['Day7.1'](day7.1.png)
!['Day7.2'](day7.2.png)
!['Day7.3'](day7.3.png)
!['Day7.4'](day7.4.png)
!['Day7.5'](day7.5.png)
!['Day7.6'](day7.6.png)
!['Day7.7'](day7.7.png)
!['Day7.8'](day7.8.png)
!['Day7.9'](day7.9.png)




# Day8

### to read
1. only in case of upcasting , we declare method virtual
- as static member are not designed to call of pointer, it cant be virtual.
```
Shape *ptr = new Rectange();
ptr->calArea();
```
2. what is difference between final,finally,finalize
- 1. final is used with variable, class, method ,we  cannot override anything that is final
- 2. finally - it is a block , in exception handling , after catch,  used to release local resources
- 3. finalize - it is a protected method, it is used to release class level resources

3. Why generics?  
4. 
### slides
!['Day8.1'](day8.1.png)
!['Day8.3'](day8.3.png)
!['Day8.4'](day8.4.png)
!['Day8.5'](day8.5.png)
!['Day8.6'](day8.6.png)
!['Day8.7'](day8.7.png)
!['Day8.8'](day8.8.png)




### demos

1. method overriding annotation 

```java
package test;
class A{
	public void print( int number ) {
		System.out.println("A.print");
	}
}
class B extends A{
	@Override
	public void print( int number ) {
		System.out.println("B.print");
	}
}
public class Program {
	public static void main(String[] args) {
		A a = new B();
		a.print(10);
		
		B b = new B( );
		b.print( 20 );
	}
}
            
```

2. final method
-  if implementation of super class method is logically 100% complete then,
  - we should declare super class method final
- final method is concrete method that we cannot override it in subclass. 
- final method get inherited in sub class, hence we can call it on instance of 
  - super class as well as sub class.  
```java
class A{
	// if implementation of super class method is logically complete, then we should declare method final
	public final void f1() {

		System.out.println("A.f1");
	}
}

class B extends A{
	/* @Override public final void f1() { System.out.println("A.f1"); }
	 */	 // NOT OK 
}

public class Program {
	public static void main(String[] args) {		
B b = new B();
b.f1();// final method get inherited in sub class
	}
}

```
- we can declare overrided method as final 
- example
- 1. name() : Enum
- 2. orninal ( ) : Enum
- 3. getClass() : Object
- 4. wait(): Object
- 5. notify(): Object
- 6. notifyAll() : Object

```java
class A{
	public void f2() {
		System.out.println("A.f2");
	}
}

class B extends A{
	@Override
	public final void f2() {
		super.f2();	
	}
}

class C extends B{
}
public class Program {
	public static void main(String[] args) {		
B b = new B();
b.f1();
// final method get inherited in sub class
C c = new C();



	}

}
```
3. Abstract Method  
- Abstract is keyword in java
-  Dynamic method dispatch : method declare in super class, implemented in sub class
- method should be declared abstract, when in super class implementation of method is 100% logically incomplete
- abstract method do not contain body
- if we declare method abstract, then it is mandetory to declare class abstract.
- f super calss contains abstract method , then 
 - 1. Either we should override it in sub class
 - 2. Or we should declare sub class abstract
 - Without declaring method abstract, we can declare class abstract
 - Example of abstract class : 
 - 1. Number class;
   - 1.abstract int intValue();
   - 2.abstract float floatValue();
   - 3.abstract double doubleValue();
 - 2. Enum class 
   - without declaring method abstract, class is abstract
 - 3. abstract class Calendar
   - protected abstract void computeFields()  
```java
abstract class A{

	// if implementation of super class method is logically complete, then we should declare method final
	public final void f1() {
		System.out.println("A.f1");
	}
	public abstract void f3();
}

class B extends A{
	/*
	 * @Override public final void f1() { System.out.println("A.f1"); }
	 */
	
	@Override
	public void f3() {
		System.out.println("A.f3");
		
	}
	
}

```

4. Abstract Class
- 1. if "is-a" relationship exist between two types 
   - and if we want to use same method design in all sub classes 
   - then we should declare class Abstract
- 2. we cannot instantiate abstract class but we can create reference of it.
- 3. Abstract class can contain - 
   - 1. Field(static as well as non static)
   - 2. Constructor
   - 3. Method(concrete/abstract)(static as well as non static)
   - 4. Nested Type  
- 4. Example : 
   - 1. java.lang.Number
   - 2. java.lang.Enum 
   - 3. java.util.Calender
   - 4. java.util.Dictonary     
```java
abstract class Test{
	private int num1;
	private static int num2 = 20;
	public Test() {
		this.num1 =10;
	}
	public int getNum1() {
		return num1;
	}
	public static int getNum2() {
		return num2;
	}
	public abstract void print( );
}
class TestImpl extends Test{
	
	@Override
	public void print() {
		System.out.println("Num1	:	"+this.getNum1());
		System.out.println("Num2	:	"+Test.getNum2());
	}
}
public class Program {
	public static void main(String[] args) {
		Test test = new TestImpl(); // reference of abstract class, instance of concrete sub class
		test.print();
	}
}

            
```
5. Final class
- 1. if implementation of any class is logically 100% complete then we should declare such class final 
- 2. Final class is a concrete class i.e we can instantiate it.
- 3. we cannot extend final class i.e we can not create sub class of final class.
- 4. Final class can have super class.
- 5. Example
   - 1. java,lang,System
   - 2. java.lang.Math
   - 3. java.lang.String/StringBuffer/StringBuilder
   - 4. All wrapper class
   - 5. java.util.Scanner
   - 6. User Defined enum()
- 6. we cannot override following method in sub class:
   - 1. Constructor
   - 2. private method
   - 3. Static method
   - 4. final Method    
- 7. we cannot use final and abstract keyword together. 
- 8. if super class constructor is private, and we use abstract, it gives error   
```java

abstract class A{

	
	public final void f1() {
		System.out.println("A.f1");
	}
	public void f2() {
		System.out.println("A.f2");
	}

	public abstract void f3();
}

class B extends A{

	@Override
	public void f3() {
		System.out.println("B.f3");
		
	}
	
}

final class C extends B{
	
}
//class D extends C{}// not ok 

public class Program {

	
	public static void main(String[] args) {
		
		C c = new C();
		
		c.f1();
		c.f2();
		c.f3();
	}

}

```

- 8. if super class constructor is private, and we use abstract, it gives error   
```java
abstract class A{

	private int num1;
	
	private A() {
		this.num1 = 10;
	}
	public A(int num1) {
		this.num1 = num1;
	}
	
	
}

class B extends A{

	private int num2;
	public B(int num1, int num2) {
		// TODO Auto-generated constructor stub
		super(num1);
		this.num2 = num2;
	}
	
}


```

6. Sole Constructor 
-  abstract class constructor  designed for invocation from (extended) sub class constructor
-  constructor of super class ,whcih is designed to call from constructor of sub class only is called sole Constructor
```java
abstract class A{

	private int num1;
	private int num2;
	public A(int num1, int num2) //sole constructor
	{
		
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public void print() {
		System.out.println("Num1 : " + this.num1);
		System.out.println("Num2 : " + this.num2);
	}
}

class B extends A{

	private int num3;

	public B(int num1, int num2,int num3) {
		super(num1, num2);
		
		this.num3 = num3;
	}
	
	public void print() {
		System.out.println("Num3 : " + this.num3);
	}
	
	
}


public class Program {

	
	public static void main(String[] args) {
		
		B b = new B(1,2,3);
		
		b.print();
        A a = new B(1,2,3);
		
		a.print();


	}

```

7. In case of upcasting (there is object slicing )
 - Example : Shape sh = new Rectangle()
 - using super class reference : 
   - 1. we can access fileds of super class
   - 2. we can access methods of super class
   - 3. we cannot access fields of sub class
   - 4. we cannot access non overriden methods of sub class
   - 5. we can access overriden methods of sub class
- InstanceOf operator used to get type of object 

```java
abstract class Shape{
	
	protected float area;
	public Shape() {
		// TODO Auto-generated constructor stub
	}
	public float getArea() {
		return this.area;
	}
	
	public abstract void calculateArea();
	
}



class Rectangle extends Shape{
	
	private float length;
	private float breadth;
	
	public void calculateArea() {
		this.area = this.length * this.breadth;
	}
}

class Circle extends Shape{
	
	
	private float radius;
	
	public Circle() {
		// TODO Auto-generated constructor stub
	}

	public void calculateArea()
	{
		this.area = (float) (Math.PI * Math.pow(this.radius, 2));
	}
	
	
}

public class Program {
	
	static Scanner sc = new Scanner(System.in);
	
	public static int menuList()
	{
		System.out.println("0. Exit \n 1. Rectangle \n 2. CIrcle \n  Enter choice ");
	  
		int choice = sc.nextInt();
		
		return choice;
	}
	private static void acceptRecord(Shape shape) {
		if( shape instanceof Rectangle) // instance of 
		{
			Rectangle rect = (Rectangle) shape; // downcasting
			System.out.println("Length : ");
			rect.setLength(sc.nextFloat());
			System.out.println("Breadth : ");
			rect.setBreadth(sc.nextFloat());
			
			
		}else {
			
			Circle c = (Circle) shape; 
			System.out.println("radius : ");
			c.setRadius(sc.nextFloat());
			
		}
		
	}
	private static void printRecord(Shape shape) {
		String className = shape.getClass().getSimpleName();	
		System.out.println("Area of instance of calss " + className + " is : " + shape.getArea());
	}
	
public static void main(String[] args) {
		
		
		
	int choice = 0;
	
	while((choice = Program.menuList()) != 0)
	{
		Shape shape = null;
		
		switch (choice) {
		case 1:
			shape = new Rectangle();
			break;
		case 2:
			shape = new Circle();
			break;

		}
		
		if(shape != null)
		{
			
			Program.acceptRecord(shape); 
			
			shape.calculateArea();
			Program.printRecord(shape);
			
		}
		
	}
	
	}
	
}



```
8. reflection for classname
```java
private static void printRecord(Shape shape) {
		
		String className = shape.getClass().getSimpleName();
		
		System.out.println("Area of instance of calss " + className + " is : " + shape.getArea());
	}

```
9. use instanceof 
```java
	if (shape instanceof Rectangle) {

	}
```
10. tester code
```java
class ShapeTest {
	private Shape shape = null;

	public void setShape(Shape shape) {
		this.shape = shape;
	}

	static Scanner sc = new Scanner(System.in);

	public void acceptRecord() {
		if (this.shape != null) {
			if (shape instanceof Rectangle) {
				Rectangle rect = (Rectangle) shape; // Downcasting
				System.out.print("Length	:	");
				rect.setLength(sc.nextFloat());
				System.out.print("Breadth	:	");
				rect.setBreadth(sc.nextFloat());
			} else {
				Circle c = (Circle) shape; // Downcasting
				System.out.print("Radius	:	");
				c.setRadius(sc.nextFloat());
			}
		}
	}

	public void printRecord() {
		if( this.shape != null ) {
			String className = shape.getClass().getSimpleName();
			System.out.println("Area of instance of class " + className + " is : " + shape.getArea());
		}
	}
	public static int menuList() {
		System.out.println("0.Exit");
		System.out.println("1.Rectangle");
		System.out.println("2.Circle");
		System.out.print("Enter choice	:	");
		return sc.nextInt();
	}
}

public class Program {

	public static void main(String[] args) {
		int choice;
		ShapeTest test = new ShapeTest();
		while ((choice = ShapeTest.menuList( ) )  != 0) {
			test.setShape(ShapeFactory.getInstance(choice));
			test.acceptRecord();
			test.printRecord();
		}
	}
}


```
11. 
```java

```
12. Generics 
-  if we want to write generic code in java then we can use: 
    - 1. Either java.lang.Object class
    - 2.  Or Generics

13. using Object class
   ```java
   class Box{
	private Object object;
	
	public Box(Object object) {
		this.object = object;
	}

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}	
    }

    ```
   -  2. type safety 
      - typecasting done from any primitiva/non primitive type to object, 
      - now downcasting must be done back to same primitive /non primitive type , this is type safety feature 
      ```java
      public static void main(String[] args)
	   {
		Box b4 = new Box();
		
		//Date date = new Date();
		b4.setObject(new Date()); //anonymous object
		
		// String str = b4.getObject(); // ClassCast Exception
		
		Date date = (Date) b4.getObject(); //type safe code 
		System.out.println(date.toString());
		
	     }
        -- example2 
       public static void main(String[] args)
	   {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Dac");
		
		String str = list.get(0);
		
		System.out.println(str);
		
	    }

       ```
14. using Generics
- 1. 
```java
// specific class, have data type in class data member 
// parametirzed class/Type : Generics
import java.util.ArrayList;
import java.util.Date;

class Box<T>{  // T : Type Parameter
	private T object;
	public Box() {
}

	public Object getObject() {
		return object;
	}

	public void setObject(T object) {
		this.object = object;
	}
	
}


public class Program{

	public static void main(String[] args)
	{
		//Box b4 = new Box();
		Box<Date> b4 = new Box<Date>(); // Date: Type Argument, for type safety
	
		b4.setObject(new Date()); //anonymous object
	
		
		Date date =  (Date) b4.getObject(); //type safe code 
		System.out.println(date.toString());
		
	}
}
	

```
15. **Why generics?**
1.  Generics gives us stronger type checking at compile time 
-  in other words,using generics we can write type safe generic code
2. it completely eliminates need fo expilicit typecasting 
3. it helps us to implement generic data structure and algorithm 

- 1. type inference :
- ability of compiler ,to detect/infer the type of an argument , and return type of argument , 
```java
Box<Date> b4 = new Box<>(); /
```

- 2.  raw type 
```java

Box b4 = new Box();  //Raw type : parameteriezed class object,used without parameterized type 
Box<Date> b4 = new Box<>(); // Date: Type Argument, for type safety

```
- 3. use of wrapper class
```java
public static void main(String[] args)
	{
		//Box<int> box = new Box<>(); //in generics type argument must be referenced type 
		// so we need wrapper class in generics
		Box<Integer> box = new Box<>();
		
		box.setObject(10);
		
		Integer number = box.getObject();
	}

```
- 4. Frequenty used type parameter names: 
     - 1. T : Type 
     - 2. E : Element
     - 3. N : Number
     - 4. K = Key
     - 5. V = Value 
     - 6. U,S = Second ZType Parameter Names
- demo on parameter names
```java
interface Entry<K,V>{
	K getKey();
	V getValue();	
}

class Pairs<K,V> implements Entry<K,V>{
	
	private K key;
	private V value;
	@Override
	public K getKey() {
		
		return this.key;
	}
	@Override
	public V getValue() {
		// TODO Auto-generated method stub
		return this.value;
	}
	public Pairs(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}	
}

public class Program{	
	public static void main(String[] args)
	{
		Entry<Integer,String> e = new Pairs(1, "Dac");
		Integer key = e.getKey();
		String value = e.getValue();	
		System.out.println("Key : " + key + " \n value : " + value);	
		
	}
}
	

```
- 5. if we want to put restriction on data type that can be used as a type argument, then , 
  - we should specify **Bounded Type Parameter.**
- to put restriction on type argument ,
- need to put restriction on type parameter, need to use bounded type parameter
- Specifying bounded type parameter is job of class implementor 
```java
class Box<T extends Number>// bounded type parameter
{}

public static void main(String[] args) {
		Box<Number> b1 = new Box<>();//  ok 
		
		
		Box<Integer> b2 = new Box<>();//  ok 
		
		
		Box<Double> b3 = new Box<>();// ok 
		
		
		Box<Character> b4 = new Box<>(); // not ok 
		
		Box<String> b5 = new Box<>();// not ok 
		
		
		Box<Date> b6 = new Box<>();// not ok 
		
	}
```

# Day9
### to read

1. https://unicode-table.com/en/#basic-latin
- read about unicode
2. rules to define immutable class in java
3. Regular expression (how to validate)
- what is regualar expression for validation of
- 1.  email, 
- 2. pincode,
- 3. full name, 
- 4. ten digit phone number
4. restriction on generics 


### slides

!['Day9.1'](day9.1.png)
!['Day9.2'](day9.2.png)
!['Day9.3'](day9.3.png)
!['Day9.4'](day9.4.png)
!['Day9.5'](day9.5.png)
!['Day9.6'](day9.6.png)
!['Day9.7'](day9.7.png)
!['Day9.8'](day9.8.png)
!['Day9.9'](day9.9.png)
!['Day9.10'](day9.10.png)
!['Day9.11'](day9.11.png)
!['Day9.12'](day9.12.png)
!['Day9.13'](day9.13.png)
!['Day9.14'](day9.14.png)

### notes 


1. in java, c, c++, string is not built in datatype , so it gets memory on heap
2. Serializable is an interface in java.io package , it
 - is empty interface ,given to generate meta data, it is called marking interface 
3. java.lang.string/stringBuffer




















### demo
1. Demo on generics declaration , solving no reference type for method argument issue in java
```java
public class Program {
	private static ArrayList< Integer > getIntegerList( ){
		ArrayList<Integer> list = new ArrayList<>();
		list.add( 10 );
		list.add( 20 );
		list.add( 30 );
		return list;
	}
	
	private static void showList(ArrayList<Integer> list) {
		if( list != null ) {
			for( Integer element : list )
				System.out.println(element);
		}
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> intList = Program.getIntegerList();
		Program.showList( intList );
	
	}
	public static void main1(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add( 10 );
		list.add( 20 );
		list.add( 30 ); // input
		
		for( Integer element : list )
			System.out.println(element); //output
	}
}


```
2. demo on using wild card 
- 1. Unbounded wild card <?>
- can accept anytype of element in generics 
- need to downcast for use 
```java
private static void printList(ArrayList<?> list) {
		if( list != null ) {
			for( Object element : list )
				System.out.println(element);
		}
	}


```
- 2. Upper bounded wild card <? extends className>
```java
private static void printList(ArrayList<? extends Number> list) {
		if( list != null ) {
			for( Object element : list )
				System.out.println(element);
		}
	}
	public static void main(String[] args) {
		ArrayList<Integer> intList = Program.getIntegerList();
		Program.printList( intList );	//OK
		
		ArrayList<Double> doubleList = Program.getDoubleList();
		Program.printList( doubleList );	//OK
		
		ArrayList<String> stringList = Program.getStringList( );
		//Program.printList( stringList );	//Not OK
	}

```

- 3. Lower Bounded wild card <? super className>

```java
private static void printList(ArrayList<? super Integer> list)
{
	if(list != null)
	{
		
		for(Object element : list)
		{
			System.out.println(element);
		}
	}
}



	public static void main(String[] args) {
		
		ArrayList<Integer> list = Program.getIntegerList();
		
		Program.printList(list); // ok 
		
		ArrayList<Double> list2 = Program.getDoubleList();
		
		//Program.printList(list2); // not ok 

		ArrayList<String> list3 = Program.getStringList();
	//	Program.printList(list3); not ok 
			
	}
}

```

3. demo on linked list
```java
class Node{
	int data;
	Node next; //null
	
	public Node(int data) {
		this.data = data; 
	}
}
public class LinkedList {

	Node head;
	Node tail;
	
	public boolean empty() {
		
		return this.head == null; 
	}
	
	public void addLast(int element)
	{
		Node newNode = new Node(element);
		if(this.empty())
		 this.head = newNode;
	  else
	this.tail.next = newNode;
this.tail = newNode; 
	}	
	public void printList() {
		Node trav = this.head;
		while(trav != null)
		{
			System.out.println(trav.data + " ");
			trav = trav.next;
		}
		System.out.println();
	}	
}

public static void main(String[] args) {
	LinkedList list = new LinkedList();
	    list.addLast(10);
		list.addLast(20);
		list.addLast(30);	
		list.printList();	
	}


```
4. methods for comparing primitive type in java
- cannot invoke equals method on primitive data type
```java
int num1 = 10;
	int num2 = 10; 
	
	if(num1 == num2)
	System.out.println("equal");

	else
	System.out.println("not equal");
	
	// output: equal 
		


```
5. comparing references(emp1,emp2) of reference type object
- as refernce are on java stack, at different location, comparing them gives they are unequal.
```java
Employee emp1 = new Employee("suraj", 1, 100);
		
		Employee emp2 = new Employee("suraj", 1, 100);
		
		if(emp1 == emp2)//OK : Compares state of references 
			System.out.println("Equal");
		else
		System.out.println("not equal");

		//output : not equal
		
	}

```
6. comparing states of instance  of reference type object
```java
Employee emp1 = new Employee("Sandeep", 33, 45000);
		Employee emp2 = new Employee("Sandeep", 33, 45000);
		
		if( emp1.equals(emp2) )	//OK : Compares state of references 
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
		//Output : Not Equal

```
7. to compare state of instance of reference type, 
-  we need to overide equals method, and write compare code here
-  now we can compare states of instance of object
```java
// Employee this = emp1;
	//Object obj = emp2 ; //upcasting
	@Override
	public boolean equals(Object obj) {
		if(obj != null)
		{
			Employee other = (Employee) obj; //downcasting		
			if(this.empid == other.empid)
				return true;	
		}
		return false;		
	}

	public static void main(String[] args) {

		Employee emp1 = new Employee("suraj", 1, 100);
		
		Employee emp2 = new Employee("suraj", 1, 100);
		
		if(emp1.equals(emp2))//OK : Compares state of references 
			System.out.println("Equal");
		else
		System.out.println("not equal");

		//output :  equal
		
	}

```

8. String  constructors 
- 1. string decalaration using new opertor
    -  String in java, doesnt end with null 

```java
public static void main(String[] args) {
		//public String()
		String s1 = new String( );
		//String s1;	//Object reference: Java Stack
		//new String( );	//String instance : Heap
		System.out.println(s1.isEmpty()+"	"+s1.length());
			
		}

```

- 2. string declaration without new operator
- converting string to byte 
```java
public static void main(String[] args) {
		//public String()
	String s1 = "ABC";
	
	byte[] bs = s1.getBytes();
	
	//byte : 1 byte : -128 to 127
	System.out.println(Arrays.toString(bs));
	// [65, 66, 67]

			
		}
	

```
- 3. using String(byte[]) constructor
```java
public static void main(String[] args) {
	byte[] bs = new byte[] {65,66,67};
	String str = new String(bs); 
	//byte : 1 byte : -128 to 127
	System.out.println(str);
	// [65, 66, 67]
		
		}
	

```
- 4.  using String(char[]) constructor
```java
public static void main(String[] args) {
		//public String(char[] value)
		char[] data = new char[ ] {'D','A','C'};
		String str = new String( data );
		System.out.println(str);
	}

```
- 5. using public String(String original) constructor
```java
public static void main6(String[] args) {
		//public String(String original)
		String str1 = new String("SunBeam");
		String str2 = new String( str1 );
	}

```
- 6. using public String(StringBuffer buffer)constructor
```java
	public static void main7(String[] args) {
		//public String(StringBuffer buffer)
		StringBuffer sb = new StringBuffer("SunBeam");
		String str = new String(sb);
	}

```
- 7. using public String(StringBuilder builder) constructor
```java
	public static void main(String[] args) {
		//public String(StringBuilder builder)
		StringBuilder sb = new StringBuilder("SunBeam");
		String str = new String(sb);
	}
```
9. String memory allocated based on type of decalration  
- String Instanced : Heap 
- String constant / Literal : String Constant/Literal Pool area (in heap )
```java
public static void main1(String[] args) {
		String s1 = new String("SunBeam"); //new String("SunBeam"); : String Instance
		//String Instanced : Heap 
		
		String s2 = "SunBeam";	//"SunBeam" : String constant / Literal
		//String constant / Literal : String Constant/Literal Pool
	}

```


10. String comparison in case of String constant/literal 
 - 1. equals methods works 
 - 2.  also comparing  reference of string method works ,
  - as literal area store all same object ,as single reference, managed by jvm by hash table
    - so both string has same reference
```java
public static void main(String[] args) {
		String s1 = "SunBeam";
		String s2 = "SunBeam";
		if( s1 == s2)
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
		//Output : Equal
	}
	
	public static void main5(String[] args) {
		String s1 = "SunBeam";
		String s2 = "SunBeam";
		if( s1.equals(s2))
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
		//Output : Equal
	}
```
11.  as concat creates new instance of string, so new reference is created, so boh string have different reference
- with concat, only string objects/constants can be added ,and new string is created
```java
public static void main(String[] args) {
		String s1 = "Sun";
		System.out.println(s1);	//Sun
		
		String s2 = s1.concat("Beam");
		System.out.println(s2);	//SunBeam
		
		if( s1 == s2 )
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
		//Output :  Not Equal
	}
```
12.  string (+) concetination operator can be used to add any object to string
```java
public static void main(String[] args) {
		String str = "Pune-";
		str = str + new Date();
		System.out.println(str);	//OK
	}
	public static void main3(String[] args) {
		String str = "Pune-";
		str = str + "India";
		System.out.println(str);	//OK
	}
	public static void main2(String[] args) {
		String str = "Pune-";
		str = str + 411056;
		System.out.println(str);	//OK
	}
```
13. comparison in case on constant Strings, i.e
    - value assigned at compile time itself
```java
public static void main8(String[] args) {
		String s1 = "SunBeam";
		String s2 = "Sun"+"Beam";	//"SunBeam"
		if( s1.equals(s2) )
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
		//Output : Equal
	}
	
	public static void main7(String[] args) {
		String s1 = "SunBeam";
		String s2 = "Sun"+"Beam";	//"SunBeam"
		if( s1 == s2 )
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
		//Output : Equal
	}

```
14. comparison in case on non constant Strings i.e,
  - - value assigned at run time 
  - in this case using equals method, checkes state gies equal if both string are same
```java

```
15.  in case of Intern() method, on non constant string , reference comparison , gives equal 
- 1. public String intern()
  - A pool of strings, initially empty, is maintained privately by the class String.
  - When the intern method is invoked, 
1. if the pool already contains a string equal to this String object as determined by the equals(Object) method, then the string from the pool is returned.
2.  Otherwise, this String object is added to the pool and a reference to this String object is returned.
- here same refernce for s1 and s3 
```java
public static void main11(String[] args) {
		String s1 = "SunBeam";
		String s2 = "Sun";
		String s3 = ( s2 + "Beam" ).intern();
		if( s1 == s3 ) 
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
		//Output : Equal
	}
```


16. 

```java

```

17. 

```java

```
18. 

```java

```
19. 

```java

```




