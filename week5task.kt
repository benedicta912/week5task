fun main(){
    println(removeVowels("Kotlin Programming Language"))
}

fun removeVowels(str: String): String{
  val re = StringBuilder()
    for(b in str){
        if(b!= 'A' && b!= 'a'
        && b!= 'E' && b!= 'e'
                && b!= 'I' && b!= 'i'
                && b!= 'O' && b!= 'o'
                && b!= 'U' && b!= 'u'){
            re.append(b)
        }
    }
    return re.toString()
}