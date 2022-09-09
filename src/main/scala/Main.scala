import com.datawizards.class2csv._
import com.tgt.training.batch2.io.IO._
import com.tgt.training.batch2.queries.Queries._
import java.io._
object Main {
  def main(args: Array[String]): Unit = {

    /*
    TODO Task 1: Get the unique countrycode, country from the input and write to output/task1.csv.Remove if any empty values are there
    Example:
    BG,Bulgaria
    CO,Colombia

    Note: Leaving partial implementation for reference

     */
    val listPerson = readFile("src/main/resources/MOCK_DATA.csv")
    val resTask1 = getCountryWithCode(listPerson)
     writeCSV(resTask1, "output/task1.csv")


    /*
    TODO Task2: Implement a method to flatten the list of list.
    Example:
    Input: List(2, List(3,5,null,7), List(null), Nil, 10,20)
    Output: List(2,3,5,7,10,20)

    Output of this task to be written to output/task2.txt
     */
    //Write Example:

    val Input:List[Any]=List(2,List(3,5,null,7), List(null), Nil, 10,20)
    val res:List[Any] = flattenList(Input)
    print(res)
    //Write res to file here.
    // writeCSV(res,"output/task2.csv")
   // FileWriter
    val file = new File("output/task2.txt")
    val bw = new BufferedWriter(new FileWriter(file))
    for (line <- res) {
      bw.write(line.toString + " ,")
    }
    bw.close()
    /*
    PS: Do not encapsulate the write in flattenList method,
    it should be done after your call the method as mentioned in Write Example above.
     */
    /*
    TODO Task3: Implement a method to get top 5 credit limit of active males, output should be sorted based on (lastname, firstname)
   Output of this task to be written to output/task3.csv

    Input : src/main/resources/MOCK_DATA.csv
    Output: Refer below Write Example.

   Write Example:
    val res = getTop5CreditLimit(args)
    Write res to file here.

    PS: Do not encapsulate the write in getTop5CreditLimit method,
    it should be done after your call the method as mentioned in Write Example above.
     */
    val resTask3=getTop5CreditLimit(listPerson)
       writeCSV(resTask3,"output/task3.csv")
    /*
    TODO Task4: Implement a method to add a additional column named "membership" to the existing data
      based on the below conditions.
      membership = 1 ( credit_limit -> [1 - 19999]) (credit_card -> jcb , visa)
      membership = 2 (credit_limit -> [20000 - 49999]) (any credit card)
      membership = 3 (credit_limit -> [ 50000 - 70000]) (credit_card -> jcb , bankcard ,americanexpress)
      membership = 4 (credit_limit -> anything else) (any credit_card)

    Input : src/main/resources/MOCK_DATA.csv

    Output: Refer below Write Example.

    Output of this task to be written to output/task4.csv

   Write Example:
    val res = addMemberShipColumn(args)
    Write res to file here.

    PS: Do not encapsulate the write in addMemberShipColumn method,
    it should be done after your call the method as mentioned in Write Example above.

     */

    val resTask4 =  addMemberShipColumn(listPerson)
     writeCSV(resTask4, "output/task4.csv")

    /*
    TODO Task5: Implement a method to simulate Left Outer Join
    Example:
    Input:
    val df1 = List(("a", 1), ("b", 2), ("c", 3),("d", 4))
    val df2 = List(("a", "A"), ("b", "B"))

    Output:
    List((a,1,A), (b,2,B), (c,3,None), (d,4,None))


 Output of this task to be written to output/task5.txt

   Write Example:
    val res = leftOuterJoinSimulation(args)
    Write res to file here.

    PS: Do not encapsulate the write in leftOuterJoinSimulation method,
    it should be done after your call the method as mentioned in Write Example above.
   */
    val df1 = List(("a", 1), ("b", 2), ("c", 3),("d", 4))
    val df2 = List(("a", "A"), ("b", "B"))
    println(df1)
  }
}
