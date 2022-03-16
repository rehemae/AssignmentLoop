fun main(){
var x =intergersArray(arrayOf(3,4,51,))
    println(x)

    var add=sumInterger(arrayOf(2,12.4,4.5,1,4,3.5))
    println(add)

    var z=arrayVowel(arrayOf('a','b','c','e','i','o','u'))
    println(z)
}
fun intergersArray(num:Array<Int>):Int {
    var product = 1
    num.forEach { multiply->
        product*=multiply

    }
   return product
}
fun sumInterger(mixedArr:Array<Any>):Double{
    var x=0.0
   mixedArr.forEach {a ->
       if (a is Double)
           x+=a

}
    return x
}
fun arrayVowel(mixedArr: Array<Char>):Int {
    var s = 0
    mixedArr.forEach { vowel ->
        if (vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u') {
            s++

        }
    }
    return s
}