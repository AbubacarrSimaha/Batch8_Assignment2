//Task1
//Create a sequence from 1 to 10. (seq1)
val seq1:Seq[Int]= Seq(1,2,3,4,5,6,7,8,9,10)
//Convert the seq1 to List. (list1)
val list1:List[Int]=seq1.toList
//Add 0 to the beginning of the list2. (list3)
val list2= 0 +: list1
//Add 11 to list1 at the end. (list2)
val list3= list2 :+ 11
//Take 5th element from list3 and append to end of List list3. (list4)
val list4=  list3 :+ list3(5)
//Create a array from 12 to 99.(arr1)
val arr1 = (12 to 99).toArray
//Convert arr1 to List (list5)
val list5= arr1.toList
//Concatenate list2 and list4 (resultOfTask1)
val resultOfTask1=  list2 ++ (list4)

//Task2
//Create a List from 1 to 100.(listA)
val listA :List[Int]=(1 to 100).toList

//Multiply all the elements with 2.(listB)
val listB= listA.map(x => x * 2)

//Get all the numbers that are divisible by 5 from listB.(listC)
val listC=listB.filter(x => x % 5==0)

//From list3, find the maximum, minimum, average, number of elements in the list, sum of all elements in the list ;
// Return the result as Tuple in the format
// "(bigger, smaller, average, number of elements, sum)".(resultOfTask2)

  val maximum = listC.max
  val minimum = listC.min
  val average = listC.sum/listC.size
  val number_Of_Element = listC.size
  val sum=listC.sum
  val resultOfTask2:(Int, Int, Int, Int, Int)=(maximum,minimum,average,number_Of_Element,sum)
//Task3
//Find the "AND" and "OR" of all the values in the list. Return the result as Tuple of format
// ("AND" result, "OR" result) .Assign the result to  (resultOfTask3).

val booleanList: List[Boolean] = List(true, false, true, false, true)
val ans:Boolean=booleanList(0) && booleanList(1) && booleanList(2) && booleanList(3) && booleanList(4)
val ans1: Boolean=booleanList(0) || booleanList(1) || booleanList(2) || booleanList(3) || booleanList(4)
val resultOfTask3:(Boolean, Boolean)=(ans, ans1)
//Task4
//Create a Map, with key as integers and their respective string representation for numbers 1 to 10.(map1)
val map1:Map[Int,String]= Map(1->"One", 2->"two",3->"Three",4->"Four",5->"Five",6->"Six",7->"Seven",8->"Eight",9->"Nine",10->"Ten")

//Add (20, "twenty") to map1.(map2)
val map2=map1 + (20->"twenty")
//Remove ("3", "three") from map2.(map3)
val map3= map2-3
//Get all the even keys from map3 in separate list.(resultOfTask4)
val resultOfResult=map3.keys.filter(x=>x%2==0)
