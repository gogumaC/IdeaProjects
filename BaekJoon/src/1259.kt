fun main(){

    while(true){
        val input= readLine()
        if(input=="0") break
        when(checkPalindrome(input!!)){
            true->print("yes\n")
            false->print("no\n")
        }

    }
}

fun checkPalindrome(input:String):Boolean{
    val length=input.length

    for(i in 0 until length){
        if(input[i]!=input[length-i-1]) return false
    }
    return true
}