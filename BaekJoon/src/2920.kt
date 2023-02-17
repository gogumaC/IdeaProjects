fun main(){
    val input = readLine()
    print(checkScaleType(input!!))
}

fun checkScaleType(scales:String):String{

    val ascending="1 2 3 4 5 6 7 8"
    val descending="8 7 6 5 4 3 2 1"

    return when(scales){
        ascending-> "ascending"
        descending-> "descending"
        else-> "mixed"

    }

}