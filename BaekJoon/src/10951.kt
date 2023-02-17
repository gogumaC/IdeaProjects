fun main(){

    val inputList= mutableListOf<Pair<Int,Int>>()
    while(true){
        val input:String=readLine() ?:break
        val a=input[0]-'0'
        val b=input[2]-'0'
        inputList.add(a to b)
    }

    inputList.forEach{
        print("${it.first+it.second}\n")
    }
}