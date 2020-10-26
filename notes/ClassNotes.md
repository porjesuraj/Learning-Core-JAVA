# Day 1

1. ppt on basic of java 

![sparkles](dissertation ppt 111.odp) 

<hr> 

[link-id] : "gttp://dissertation ppt 111.odp"


1. every language  is a technology
   - but every technology is not language
   - eg. ASP .NET no language of itself
- every technology with syntax is language 

2.   Java is langauge + technology 
   

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
  
In the Java programming language, all source code is first written in plain text files ending with the .java extension. Those source files are then compiled into .class files by the javac compiler. A .class file does not contain code that is native to your processor; it instead contains bytecodes — the machine language of the Java Virtual Machine1 (Java VM). The java launcher tool then runs your application with an instance of the Java Virtual Machine.

Figure showing MyProgram.java, compiler, MyProgram.class, Java VM, and My Program running on a computer.
An overview of the software development process.

Because the Java VM is available on many different operating systems, the same .class files are capable of running on Microsoft Windows, the Solaris™ Operating System (Solaris OS), Linux, or Mac OS. Some virtual machines, such as the Java SE HotSpot at a Glance, perform additional steps at runtime to give your application a performance boost. This includes various tasks such as finding performance bottlenecks and recompiling (to native code) frequently used sections of code.

Figure showing source code, compiler, and Java VM's for Win32, Solaris OS/Linux, and Mac OS
Through the Java VM, the same application is capable of running on multiple platforms.

The Java Platform
A platform is the hardware or software environment in which a program runs. We've already mentioned some of the most popular platforms like Microsoft Windows, Linux, Solaris OS, and Mac OS. Most platforms can be described as a combination of the operating system and underlying hardware. The Java platform differs from most other platforms in that it's a software-only platform that runs on top of other hardware-based platforms.

The Java platform has two components:

The Java Virtual Machine
The Java Application Programming Interface (API)
You've already been introduced to the Java Virtual Machine; it's the base for the Java platform and is ported onto various hardware-based platforms.

The API is a large collection of ready-made software components that provide many useful capabilities. It is grouped into libraries of related classes and interfaces; these libraries are known as packages. The next section, What Can Java Technology Do? highlights some of the functionality provided by the API.

Figure showing MyProgram.java, API, Java Virtual Machine, and Hardware-Based Platform
The API and Java Virtual Machine insulate the program from the underlying hardware.

As a platform-independent environment, the Java platform can be a bit slower than native code. However, advances in compiler and virtual machine technologies are bringing performance close to that of native code without threatening portability.

The terms"Java Virtual Machine" and "JVM" mean a Virtual Machine for the Java platform.


 - Java 11, is LTS 
  
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