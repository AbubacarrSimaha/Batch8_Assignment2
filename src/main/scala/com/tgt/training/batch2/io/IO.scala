package com.tgt.training.batch2.io

import com.datawizards.csv2class.parseCSV
import com.tgt.training.batch2.models.Models.Person

object IO {

  /*
	If the data is malformed, parseCSV returns 0, in such case throw "MalformedDataException",
	you have to create this exception on your own.
	For convenience, the parseCSV is added, you just have to take care of the case class and exception handling for this method.
	Refer : https://index.scala-lang.org/piotr-kalanski/csv2class/csv2class/0.3.3?target=_2.11
	 */
  def readFile(path: String): List[Person] = {
    parseCSV[Person](path, header = false)._1.toList
  }

}
