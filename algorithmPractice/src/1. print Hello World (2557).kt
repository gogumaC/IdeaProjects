fun main()
{
    var numbers= longArrayOf(7,7)
    var answer=LongArray(numbers.size,{0})
    for( case in numbers.indices){
        answer[case]=checktwo(numbers[case])
        println("${answer[case]}")
    }


}
fun space(num:Long):Long{
    var count=0L
    var checknum=num
    while(true){

        when(checknum){
            1L->{
                count++
                return count
            }
            0L->{
                return count
            }
        }
        if(checknum%2!=0L){
            checknum/=2
            count++}
        else{ checknum/=2}





    }
}

fun checktwo(num:Long):Long{
    var i:Long=num+1
    while(true){
        if(i==num)continue
        val count=space(i xor num)
        if(count<3) return i
        i++
    }
}

