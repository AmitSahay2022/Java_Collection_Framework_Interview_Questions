# Java_Collection_Framework_Interview_Questions
Q1_How To Create ArrayList Which Will Not Allow Duplicates? <br>
Q2_Create A Final List And Add Items into it? <br>
Q3_why set doesnot allow duplicates <br>
Q4_Set Allow Duplicate Creates Confusion <br>
Q5_Sorting List Using Default_natural_Sorting Comparable(I) ? <br>
Q6_Customize Sorting using Comparator? <br>
Q7 Sort based on name if name is same then sort based on id? <br>
Q8 what is fail-fast and fail-safe iterator? <br>
Q9 ConcurrentHashMap vs HashMap ? <br>
Q10 How HashMap internally works? <br>
Q11 TreeMap ? <br> <br>

(Q) HashTable Vs ConcurrentHashMap ? <br>
(Q) Comparable VS Comparator? <br>
(Q) How to convert List<Entity> to List<EntityDto> ? <br> This is used in almost every project <br>
<br>
Array vs Collection ? <br>
  Array= Fixed in size + no method for sorting, searching, adding, removing etc. <br>
Why it is called Collection Framework? <br>
   beacuse It has lots of ready made methods, Interfaces and classes already available to perform lots of operation of data. <br>
(Q) When we should go for List, Set, Queue and Map? <br>
    List-> Duplicates are allowed <br>
    Set-> Duplicates are not allowed, if we are creating our own custom type object (class) then we must override .equals() and hashcode() <br>
    Queue-> If we want FIFO then. we have LinkedList and many more <br>
    Map-> key value pair <br>
<br><br>
List(I) <br>
   <tab><tab> ArrayList, LinkedList, Vector and Stack are implementation classes<br>
           -----------------------------------------------------------<br>
           ArrayList -> internal Data structure is Resizable Array<br>
           LinkedList -> Double linked list<br>
           Vector -> same as ArrayList but it is Synchronized/Thread-safe.<br> 
           Stack -> LIFO data structure<br>
---------------------------------------------------------------------<br>
Set (I) <br>
      implementation classes are : HashSet, LinkedHashSet, TreeSet <br>
----------------------------------------------------------------------<br>
Map(I) <br>
   HashMap, LinkedHashMap, HashTable, TreeMap etc. <br>
