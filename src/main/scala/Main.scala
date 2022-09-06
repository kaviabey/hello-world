import scala.collection.mutable.Map


object main{
 
  

  def decipher(letter:Char,shift:Int,Alphabet:String):Char = {
     
     if ((Alphabet.indexOf(letter.toUpper) - shift)%(Alphabet.length) < 0)
         return Alphabet(((Alphabet.indexOf(letter.toUpper) - shift)%(Alphabet.length))+Alphabet.length)
     
    
      else 
         return Alphabet((Alphabet.indexOf(letter.toUpper) - shift))
 
  }

 val cipher = (letter:Char,shift:Int,alphabet:String) => alphabet((alphabet.indexOf(letter.toUpper) + shift)%alphabet.length)
 val decrypt = (algo:(Char,Int,String) => Char,name:String,shift:Int,Alphabet:String) => name.map(algo(_,shift,Alphabet))
 val encrypt = (algo:(Char,Int,String) => Char,name:String,shift:Int,Alphabet:String) => name.map(algo(_,shift,Alphabet))
     
   
  def main(args:Array[String]):Unit =  {

    var Alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    var t = "Hello"
    print(encrypt(cipher,"aer",2,Alphabet))
    print(decrypt(decipher,"aer",2,Alphabet))

}


}