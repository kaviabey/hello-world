import scala.collection.mutable.Map


object main{
 
  def  encrypt(name:String,shift:Int,alphabet:String):String =
    {

      var result = ""
      for(i <- name)