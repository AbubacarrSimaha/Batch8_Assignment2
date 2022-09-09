# ScalaAssignment-Batch2

__Please read the below before starting__ : 

# All tasks are to be done only using Scala, and not Spark for this assignment.

This repo has a template of the tasks to be completed as part of Scala Training - Batch2

Fork the repo, clone it to your local and start implementing the tasks.

The tasks are mentioned already as comments under ```Main.scala```

An __OVERVIEW__ of method signatures are already there to give you an idea of how to implement the methods.
Each tasks has been defined as a methods under ```com.tgt.training.batch2.queries```
Feel free to change the method signatures if needed.

__Limitations/Enforcements__:
* __Avoid using for loops, try catch.__, try using ```HOFs, Option, Try```

* __Variable names should be meaningful and follow camelCase__. 
* __Your variable name should convey what value is referenced by that variable__

Example:
* __Don't__:  ```df1, df2, df_table ,a, b```
* __Do__   :  ```leftDF, rightDF, dfTable, listWithPerson, listAsPersonMemberShip```

__Data__ is available under ```src/main/resources```(_MOCK_DATA.csv_) for __Tasks 1,3,4__.
When creating ```case class Person``` use the schema under ```src/main/resources/schema.txt``` as reference. The schema string is in order of the actual schema of the data provided ```(src/main/resources/MOCK_DATA.csv)```

For reading CSV use we are using https://index.scala-lang.org/piotr-kalanski/csv2class/csv2class/0.3.3?target=_2.11


# Test Cases:
## The methods you implement should accompany with test cases. Test cases carry 30% of weightage.This is an important aspect to be covered as part of the training.

* We can use  ```https://www.scalatest.org/``` for tests. Choose whichever style you need.

```Main.scala```  is your execution point, from where you will call all your task methods, so that file doesn't have to covered as part of your test cases.
```scala
  def getCountryWithCode(seq: Seq[Person]): List[CountryCodeMap] = ???
  def flattenList(input: List[Any]): List[Any] = ???
  def getTop5CreditLimit(input: List[Person]): List[Person] = ???
  def addMemberShipColumn(input: List[Person]): List[PersonWithMemberShip] = ???
  def leftOuterJoinSimulation(leftDF: List[Any], rightDF: List[Any]): List[Any] = ???
  def readFile(path: String): List[Person] = ???
  ```
The above methods are what you need to make sure the test cases are in place. Apart from this if you add other extra methods you need to write tests for that as well. 
  
* If you see the above method signatures, ```Person, CountryCodeMap, PersonWithMemberShip ``` are declared but not implemented, you need to implement those.
* When implementing the case classes make sure you declare with proper types.
* __Understand why a case class is declared there and needed in such places__.
 
## Coverage:
* Once you have implemented the test cases, you need to have a report on the coverage of your code.
* There are many coverage tools available with sbt support, Some are listed here,
```
https://github.com/sbt/sbt-jacoco
https://github.com/scoverage/sbt-scoverage
```
You can choose any of the above.

## Exception Handling:
Feel free to add your own exceptions if needed, your code should cover corner cases.
Say, in place of ```List[Int]```, if I pass an empty List how is your code handling should be covered.

## Do not hesitate to ask doubts in #sparklearningchannel.
