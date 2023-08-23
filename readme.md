# Computer Science II
## Lab 3.0 - Conditionals & Loops

An introduction to the conditionals and loops in the Java programming language.

This is a lab used in Computer Science II (CSCE 156) for Fall 2023 
in the [School of Computing](https://computing.unl.edu) 
at the [University of Nebraska-Lincoln](https://unl.edu).

## Overview

### Resources

Java tutorial
* `if-else tutorial`:
http://download.oracle.com/javase/tutorial/java/nutsandbolts/if.html
* `for` loop tutorial:
http://download.oracle.com/javase/tutorial/java/nutsandbolts/for.html
* `while` loop tutorial:
http://download.oracle.com/javase/tutorial/java/nutsandbolts/while.html


### Lab Objectives & Topics

Following the lab, you should be able to:
* Use `if-else` statements to control the logical flow of the
  program.
* Use `for` and `while` loops to implement repetition statements in a
  program.
* Write complex programs that require conditional logical statements
  and loops.

### Peer Programming Pair-Up

At the start of
each lab, you may find a team member by yourself or may be randomly paired up with another student by
a lab instructor.  One of you will be designated the *driver* 
and the other the *navigator*. If you prefer to work on this lab by yourself, that is fine too.  
Each week you should try to alternate: if you were a driver 
last week, be a navigator next, etc. 

***Note that, each student must submit the code to CodePost for grading.***


## 1. Getting Started

Clone this project code for this lab from GitHub in Eclipse using the
URL: https://github.com/lisongxu/CSCE156-Lab-Java-Loop. Refer to [Lab 1.0](https://github.com/lisongxu/CSCE156-Lab-Java-Intro) for
instructions on how to clone a project from GitHub.

## 2. Conditionals & Loops

Java provides standard control structures for conditionals and
repetition. Specifically, Java provides the usual `if-else`
statements as well as `for` and `while` loops. The syntax for these
control structures should look familiar.  Some examples:

```java
if(x > 0) {
  //DO SOMETHING
} else if(x < 0) {
  //DO SOMETHING ELSE
} else {
  //OTHERWISE
}

for(int i=0; i<n; i++) {
  //DO SOMETHING
}

int i = 0;
while(i < n) {
  //DO SOMETHING
  i++;
}
```

In addition, Java provides a foreach-loop, also referred to as an
*enhanced for-loop*, for iterating over collections or elements in an 
array.  This feature is mostly for convenience.  The following example
demonstrates how to use this loop.

```java
String arr[] = new String[10];
...
for(String s : arr) {
  System.out.println(s); 
}
```

An enhanced for-loop can be used for `Set` and `List` collections.

## 3. Activities 

### 3.1 Sum of Natural Numbers

Natural numbers are the usual counting numbers; 1, 2, 3, ... In this
exercise you will write several loops to compute the sum of natural
numbers 1 thru `n` where `n` is read from the command line. You will
also write an enhanced for-loop to iterate over an array and process
data.

1.  Open the `Natural.java` source file. The code to read in `n` has been
    provided for you. An array mapping integer values 1 thru 10 to text
    values has also been created for you.

2.  Write a `for`-loop and a `while`-loop in the relevant methods to
    compute the sum of natural numbers 1 thru `n` and return the 
    result.  In the `main` method call your methods and output 
    the result.  
    
3.  Write a an enhanced for-loop to iterate over the elements of the `zeroToTen`
    array. As you iterate over the elements, concatenate each
    string, delimiting each word with a plus sign and the
    result at the end of the loop. Your result should look something
    like the following:
    
    `zero + one + two + three + four + five + six + seven + eight + nine + ten = 55`

### 3.2 Child Tax Credit

When filing for federal taxes, a credit is given to tax payers with
dependent children according to the following rules. The first (not necessarily
the oldest) dependent
child younger than 18 is worth a $1,000.00 credit. Each dependent child
younger than 18 after the first child is worth a $500 tax credit each.
You will complete a Java program to output a table of dependent
children, how much each contributes to a tax credit, and a total child
tax credit. Your table should look something like the following.

```text
Child           Amount
Tommy (14)      $1000.00
Richard (12)    $500.00
Harold (21)     $0.00
Total Credit:   $1500.00
```

1.  Open the `Child.java` and `ChildCredit.java` source files

2.  The `Child` class has already been implemented for you. Note how the 
    `Child` class is used.  Several instances of children have been created 
    and placed into a `List`.

    Similar to an array, a `List` stores elements using 0-indexing. Each one
    can be accessed using the `get` method. For example, `kids.get(i)` gets 
    the i-th kid.  You could also use an *enhanced for loop* to iterate over 
    the elements in the `List`.

3.  Implement the `produceReport` method to compute the child tax credit(s)
    and output a table similar to the one above.  Your method ***should return
    the grand total of the credit***.  
    
    Each child is an *instance* of the `Child` class. Each instance has its own
    variables so that each child can be a different age. To get a
    particular child’s age, you can use a *getter* method. For example,
    to get the age of `tom` you can use the syntax, `tom.getAge()`

### 4. Testing, Submitting & Grading

* Test your programs using the provided JUnit test suite(s).  Fix any
errors and completely debug your programs.
* Submit the following files through webhandin:
  * `Natural.java`
  * `ChildCredit.java`
* Run the grader and verify the output to complete your lab.

### Advanced Activity (Optional)

Use the `String.format()` method to reformat the output of the Child Tax 
Credit program to print every piece of data in its own column.

### 3.1 Testing Locally

Before you submit your lab, you should run the JUnit tests locally to verify 
that your code is correct.  

1. Expand the `src/test/java` directory, then expand the `unl.soc` package, and then double click on the `StatisiticsTests.java` file to open it.   
2. Run the test suite by clicking the usual "Play" button.
3. A report will be presented in a JUnit tab detailing which test cases pass and
which fail along with expected output and the actual output (for 
failed test cases).

### 3.2 Submitting to CodePost

To submit your lab, do the following:

1. Login to https://codepost.io   

2. Click "Upload Assignment" for this lab.

3. Click "Upload files" to upload `Statistics.java`, and then click the "Submit and run test" button.

4. Click on the "View test results" button to
view the test results, and make sure that you pass all tests. 

### 3.3 Grading

For this lab, as long as you pass all the tests on Codepost, you will get full credit for the lab.

