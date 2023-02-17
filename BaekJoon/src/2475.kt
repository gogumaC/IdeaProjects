import kotlin.math.pow

fun main(){
    val input= readLine()!!.split(" ")
    val nums=input.map{
        (it[0]-'0').toDouble()
    }

    var valid=0.0
    nums.forEach{
        valid+=it.pow(2)
    }

    print((valid%10).toInt())
}