# Advanced Programming - Laboratory 4

## Tasks
```text
The Student / High School Admission Problem (SAP)
An instance of SAP involves a set of students and a set of high schools, each student seeking admission to one school, and each school having a number of available places (its capacity). Each student ranks some (acceptable) schools in strict order, and each school ranks its applicants in some order. A matching is a set of pairs (student, school) such that each student is assigned to at most one school and the capacities of the schools are not exceeded. A matching is stable if there is no pair (s, h) such that s is assigned to h' but s prefers h better than h' and h prefers s better than some of its assigned students. We consider the problem of creating a stable matching between students and schools.

Example: 4 students S0,S1,S2,S3, 3 high schools H0,H1,H2, capacity(H0)=1, capacity(H1)=2, capacity(H2)=2.
students preferences
S0: (H0, H1, H2)
S1: (H0, H1, H2)
S2: (H0, H1)
S3: (H0, H2)
schools preferences
H0: (S3, S0, S1, S2)
H1: (S0, S2, S1)
H2: (S0, S1, S3)

```
COMPULSORY
```text
Create an object-oriented model of the problem. You should have at least the following classes: Student, School and the main class.
Create all the objects in the example using streams.
Create a list of students, using LinkedList implementation. Sort the students, using a comparator.
Create a set of schools, using a TreeSet implementation. Make sure that School objects are comparable.
Create two maps (having different implementations) describing the students and the school preferences and print them on the screen.
```
OPTIONAL
```text
Create a class that describes the problem and one that describes a solution (a matching) to this problem.
Using Java Stream API, write queries that display the students who find acceptable a given list of schools, and the schools that have a given student as their top preference.
Use a third-party library in order to generate random fake names for students and schools.
Implement an algorithm for creating a matching, considering that each student has a score obtained at the evaluation exam and the schools rank students based on this score.
Test your algorithm.
```

## Solved tasks

As of today (15.03.2021) I have solved all tasks regarding the compulsory task.
## Build and run

To compile and run my project I have typed the following commands in the terminal:
```bash
javac -classpath . *.java Main.java
java compulsory.Main
```

## Output

The output for the compulsory part is:
```bash
The list of students in order is:
S0 S1 S2 S3
The list of schools in order is:
School{name='H0', capacity=1} School{name='H1', capacity=2} School{name='H2', capacity=2}
Student preferences are:
{Student{nameStudent='S0'}=[School{name='H0', capacity=1}, School{name='H1', capacity=2}, School{name='H2', capacity=2}], Student{nameStudent='S1'}=[School{name='H0', capacity=1}, Scho
ol{name='H1', capacity=2}, School{name='H2', capacity=2}], Student{nameStudent='S2'}=[School{name='H0', capacity=1}, School{name='H1', capacity=2}], Student{nameStudent='S3'}=[School{n
ame='H0', capacity=1}, School{name='H2', capacity=2}]}
School preferences are:
{School{name='H2', capacity=2}=[Student{nameStudent='S0'}, Student{nameStudent='S1'}, Student{nameStudent='S3'}], School{name='H0', capacity=1}=[Student{nameStudent='S3'}, Student{name
Student='S0'}, Student{nameStudent='S1'}, Student{nameStudent='S2'}], School{name='H1', capacity=2}=[Student{nameStudent='S0'}, Student{nameStudent='S2'}, Student{nameStudent='S1'}]}



