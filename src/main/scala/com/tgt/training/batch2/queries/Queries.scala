package com.tgt.training.batch2.queries

import com.tgt.training.batch2.models.Models.{CountryCodeMap, Person,PersonWithMemberShip}
import shapeless.ops.coproduct.FlatMap

object Queries {

  def getCountryWithCode(seq: Seq[Person]): List[CountryCodeMap] = {
    seq.map(x=> CountryCodeMap(x.country,x.country_code)).filter(x=>x.country!=null && x.country_code!=null).distinct.toList
  }

 def flattenList(input: List[Any]): List[Any] = input.flatMap{

     case list: List[Any]=>list
     case i =>List(i)

   //print result1

 }.filter(x=>(x!=null ))

  def getTop5CreditLimit(input: List[Person]): List[Person] = {
    //val zx= input.map(x => Person(x.gender,x.is_active,x.last_name, x.first_name).filter(x=>x.gender=="male" && x.is_active==true ).toList
     print(input)
     val filteredList=input.filter(_.gender=="male").sortBy(_.credit_limit).reverse.take(5).sortBy(x =>(x.last_name, x.first_name))
    print(filteredList)

       filteredList
  }

 def addMemberShipColumn(input: List[Person]): List[PersonWithMemberShip] = {
   input.map(x => PersonWithMemberShip(x.id, x.first_name, x.last_name, x.email, x.gender, x.ip_address, x.credit_card, x.credit_limit, x.is_active, x.sector, x.country, x.country_code, x match {
     case one if((x.credit_limit >=1 && x.credit_limit == 19999) && ( x.credit_card =="jcb" || x.credit_card=="visa")) => 1
     case two if((x.credit_limit >=20000 && x.credit_limit== 49999) ) => 2
     case three if((x.credit_limit >=50000 && x.credit_limit ==70000) && (x.credit_card =="jcb" || x.credit_card=="bankcard" || x.credit_card=="americanexpress" ) )=> 3
     case _ => 4

   }))
 }
/**
  def leftOuterJoinSimulation(leftDF: List[Any],
                             rightDF: List[Any]): List[Any] = {


    val leftOuterJoin = leftDF.map(key => key -> rightDF.find(_._1 == key))

  }**/
}
