import java.util.*

fun main(){

    val num=readLine()!!.toInt()

    val lengthComparator=compareBy<String>{it.length}
    val comparator=lengthComparator.thenBy{it}

    val words= mutableSetOf<String>()

    for(i in 0 until num){
        val word=readLine()!!
        words.add(word)
    }

    words.sortedWith(comparator).forEach{
        print("$it\n")
    }
}