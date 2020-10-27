
# Syllabys 

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
   -  A .class file does not contain code that is native to your processor; it instead contains bytecodes — the machine language of the Java Virtual Machine1 (Java VM).
   -   The java launcher tool then runs your application with an instance of the Java Virtual Machine.

- Because the Java VM is available on many different operating systems,
    -  the same .class files are capable of running on Microsoft Windows, the Solaris™ Operating System (Solaris OS), Linux, or Mac OS.
    -   Some virtual machines, such as the Java SE HotSpot at a Glance, perform additional steps at runtime to give your application a performance boost. This includes various tasks such as
       -    finding performance bottlenecks and recompiling (to native code) frequently used sections of code.

1. The Java Platform
- A platform is the hardware or software environment in which a program runs.
-  Most platforms can be described as a combination of the operating system and underlying hardware. 
-  The Java platform differs from most other platforms in that it's a software-only platform that runs on top of other hardware-based platforms.

- The Java platform has two components:

    1. **The Java Virtual Machine**
       - it's the base for the Java platform and is ported onto various hardware-based platforms.
    2. **The Java Application Programming Interface (API)**
       - The API is a large collection of ready-made software components that provide many useful capabilities. 
       - It is grouped into libraries of related classes and interfaces; these libraries are known as packages. T

- The API and Java Virtual Machine insulate the program from the underlying hardware.

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
      + JVM (Java virtual machine)

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
> 


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

> man java

> man javac

> man jar

> man java

> man javap
- Disassembles one or more class files.

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
  


3. flow of java 

!['java-code-compilation']()

4. JRE 
!['jre']()


5. compile  classes are created for 
 -  per class in .java file 
 - e.g 
- 1. Interfaces
  2. Classes
  3. Enum


- class, constructor, function overloading, object   


# Day 2 

- **ppt on buzz words in java** 

1. static member function and constructor cant be virtual , all other clases abd member function be virtual
2. older version program can run on later version, features can get deprecated, but still have backward compatibility,
   - this is not in .NET, there Obsolete features are not supported in future version 
3. reflection example is debugger for getting private data member , intellisense  

4. The Java **Remote Method Invocation** (RMI)
  -  system allows an object running in one Java virtual machine to invoke methods on an object running in another Java virtual machine. 
  -  RMI provides for remote communication between programs written in the Java programming language.
  - since java supports RMI, it is distributed prog languauge.

5. **Access Modifier** 
 - 12 types in java   
 - in comparison to c /c++ , 4 types 
 - 

6. **A Wrapper class** 
 - is a class whose object wraps or contains primitive data types. 
 - When we create an object to a wrapper class, it contains a field and in this field, we can store primitive data types. - In other words, we can wrap a primitive value into a wrapper class object.

7. practical demos 
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
    3.  different print methods in printstream class  
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
    - boxing 
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

## to read

1. JVM
> https://www.artima.com/insidejvm/ed2/jvm.html

2. why main method is static? (an swer as what when it is not static)
3.  to compile java program , need atleast one class
4.  Package java.lang
 > https://docs.oracle.com/javase/8/docs/api/

5. can we write helloworld program , without giving semicolon ?? yes