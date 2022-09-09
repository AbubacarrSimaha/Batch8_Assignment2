package com.tgt.training.batch2.models

object Models {
  //Put all your case classes here
  case class Person(id:Int,first_name:String,last_name:String,email: String,gender:String,ip_address:String,credit_card:String,credit_limit:Int,is_active:Boolean,sector:String,country:String,country_code:String  )
  case class CountryCodeMap(country: String, country_code:String)
  case class PersonWithMemberShip(id:Int,first_name:String,last_name:String,email: String,gender:String,ip_address:String,credit_card:String,credit_limit:Int,is_active:Boolean,sector:String,country:String,country_code:String,membership:Int)
}
