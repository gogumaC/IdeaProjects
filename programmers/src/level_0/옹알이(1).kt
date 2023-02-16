package level_0

fun main(){

    val babbling= arrayOf("ayaye", "uuuma", "ye", "yemawoo", "ayaa")
    var answer:Int=0


    babbling.forEach Break@{it->
        if(checkBabbling(it)) answer++
    }

    print(answer)

}

fun checkBabbling(babbling:String):Boolean{

    val babyBabbling=listOf("aya", "ye", "woo", "ma")
    val splitArr= babbling.split("aya", "ye", "woo", "ma")
    splitArr.forEach{
        if(it!="")return false
    }

    return true
}