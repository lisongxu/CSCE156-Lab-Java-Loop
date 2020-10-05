# Computer Science II
## Lab 2.0 - Conditionals & Loops
### PHP Version

An introduction to using conditionals and loops in the PHP programming 
language.

This is a lab used in Computer Science II (CSCE 156, CSCE 156H) in the [Department of Computer Science & Engineering](https://cse.unl.edu) at the [University of Nebraska-Lincoln](https://unl.edu).

## Overview

### Resources

Prior to lab you should read/review the Control Structures 
section in the PHP Manual: 
http://www.php.net/manual/en/language.control-structures.php

### Lab Objectives & Topics

Following the lab, you should be able to:
* Use `if-else` statements to control the logical flow of the
  program.
* Use `for`, `while` and `foreach` loops to implement repetition 
  statements in a program.
* Write complex programs that require conditional logical statements
  and loops.

### Peer Programming Pair-Up

To encourage collaboration and a team environment, labs will be
structured in a *pair programming* setup.  At the start of
each lab, you may be randomly paired up with another student by
a lab instructor.  One of you will be designated the *driver* 
and the other the *navigator*.  

The navigator will be responsible for reading the instructions 
and telling the driver what is to be done.  The driver will be 
in charge of the keyboard and workstation.  Both driver and 
navigator are responsible for suggesting fixes and solutions 
*together*.  Neither the navigator nor the driver is "in charge."  
Beyond your immediate pairing, you are encouraged to help and 
interact and with other pairs in the lab.

Each week you should try to alternate: if you were a driver 
last week, be a navigator next, etc.  Resolve any issues (you 
were both drivers last week) within your pair.  Ask the lab 
instructor to resolve issues only when you cannot come to a 
consensus.  

Because of the peer programming setup of labs, it is absolutely 
essential that you complete any pre-lab activities and familiarize
yourself with the handouts prior to coming to lab.  Failure to do
so will negatively impact your ability to collaborate and work with 
others which may mean that you will not be able to complete the
lab.  

## 1. Getting Started

Clone this project code for this lab from GitHub using the
URL: https://github.com/cbourke/CSCE156-Lab02. Refer to Lab 1.0 for
instructions on how to clone a project from GitHub. 

## 2. Conditionals & Loops

PHP provides standard control structures for conditionals and
repetition. Specifically, PHP provides the usual if-then-else statements
and while, for, and do-while loops. The syntax for these control
structures should look familiar; some examples:

```php
if($x > 0) {
  //DO SOMETHING
} else if($x < 0) {
  //DO SOMETHING ELSE
} else {
  //OTHERWISE
}

for($i=0; $i<$n; $i++) {
  //DO SOMETHING
}

$i=0;
while($i < $n) {
  //DO SOMETHING
  $i++;
}
```

In addition, PHP provides a `foreach`-loop for iterating over elements in
an array. This is not just for convenience: in PHP arrays are
associative so they are not necessarily indexed 0 thru `n - 1`.  
Arrays may not even be indexed with integers!  Instead, array should 
be considered to be a collection of key-value pairs. The following 
examples demonstrate how to use a `foreach` loop.

```php
foreach($array as $value) {
  print "$value \n";
}

foreach($array as $key => $value) {
  print "The key $key maps to the value $value\n";
}
```

## 3. Activities 

### 3.1 Sum of Natural Numbers

Natural numbers are the usual counting numbers; 1, 2, 3, ... In this
exercise you will write several loops to compute the sum of natural
numbers 1 thru `n` where `n` is read from the command line. You will
also write an enhanced for-loop to iterate over an array and process
data.

1.  Open the `natural.php` source file. The code to read in `n` has 
    already been provided for you. An array mapping integer values 
    1 thru 10 to text representations has also been created for you.

2.  Write a for-loop and a while-loop to compute the sum of natural
    numbers 1 thru `n` and output the answer.

3.  Write a `foreach` loop to iterate over the elements (key/value pairs)
    of the `$oneToTen` array. As you iterate over the elements you should sum the
    keys and concatenate the values to formulate the following string
    (which you should output at the end of the for-loop):

    `zero + one + two + three + four + five + six + seven + eight + nine + ten = 55`

### 3.2 Child Tax Credit 

When filing for federal taxes, a credit is given to tax payers with
dependent children according to the following rules. The first dependent
child younger than 18 is worth a $1,000.00 credit. Each dependent child
younger than 18 after the first child is worth a $500 tax credit each.
You will complete a PHP script to output a table of dependent children,
how much each contributes to a tax credit, and a total child tax credit.
Your table should look something like the following.

```text
Child           Amount
Tommy (14)      $1000.00
Richard (12)    $500.00
Harold (21)     $0.00
Total Credit:   $1500.00
```

1.  Open the `child.php` and `childCredit.php` script files

2.  A `Child` class has already been defined and included in the 
    `childCredit.php` script. Note how the `Child` class is used.
    Several instances of children have been created and placed 
    into an array.

3.  Write code to iterate over the array, compute the child tax credits
    and output a table similar to the one above. Note: to call a method
    on an instance of the `Child` class, use the following syntax:
    `$kid->getAge()`

### 4. Testing, Submitting & Grading

* Test your programs, fix any errors, and completely debug your programs.
* Submit the following files through webhandin:
  * `natural.php`
* Run the grader and verify the output to complete your lab.

### Advanced Activity (Optional)

Modify the Child Tax Credit program to output the data in a
well-formatted HTML table. 





