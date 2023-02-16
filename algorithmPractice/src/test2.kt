import java.time.DayOfWeek
import java.util.*

fun main(){
   // posTo(-1)
    println(getDOWCountInMonth(Date(),DayOfWeek.MONDAY))
    //-2 : 11/29 11/30
    //-1 : 12/1 ...12/5

}


fun getDOWCountInMonth(date:Date,dow:DayOfWeek):Int{
    var count=0
    val cursor=date

    val instance=Calendar.getInstance()
    instance.setTime(cursor)
    val last=instance.add(Calendar.)

    while(cursor.before(date.changeDate(Calendar.MONTH,1))){
        if(cursor.getDayOfWeek()==dow)count++
        cursor.changeDate(Calendar.DATE,1)
        count++
    }

    return count
}

fun posToWeekOfMonth(pagePos:Int):Triple<Int,Int,Int>{

    val pos=pagePos//-firstPos
    val cal=Calendar.getInstance()
    val weekCount=cal. getActualMaximum(Calendar.WEEK_OF_MONTH)
    val thisWeek=cal.get(Calendar.WEEK_OF_MONTH)

    val yearRes:Int
    val monthRes:Int
    val weekRes:Int

    when{

        pos<0->{
            var mPos=thisWeek+pos
            while(mPos<=0){
                cal.add(Calendar.MONTH,-1)
                mPos+=cal.getActualMaximum(Calendar.WEEK_OF_MONTH)

            }

            weekRes=mPos

        }
        pos>0->{
            var mPos=pos-(weekCount-thisWeek)
            while(mPos>0){
                cal.add(Calendar.MONTH,1)
                mPos-=cal.getActualMaximum(Calendar.WEEK_OF_MONTH)
            }
            weekRes=cal.getActualMaximum(Calendar.WEEK_OF_MONTH)+mPos

        }
        else->{

            weekRes=cal.get(Calendar.WEEK_OF_MONTH)
        }


    }
    yearRes=cal.get(Calendar.YEAR)
    monthRes=cal.get(Calendar.MONTH)

    return Triple(yearRes,monthRes,weekRes)

}

fun getWeeks(year:Int,month:Int,weekCount:Int):List<Date?>{

    val cal=Calendar.getInstance()
    val list= mutableListOf<Date?>()
    cal.set(Calendar.YEAR,year)
    cal.set(Calendar.MONTH,month)
    cal.set(Calendar.WEEK_OF_MONTH,weekCount)
    cal.set(Calendar.DAY_OF_WEEK,Calendar.MONDAY)
    for(i in 0..6){
        if(cal.get(Calendar.MONTH)==month){
            list.add(i,cal.getTime())
        }else{
            list.add(i,null)
        }

        cal.add(Calendar.DATE,1)
    }
    return list
}


//pos를 month/weekCOunt로 바꿔야함
fun posTo(pos:Int){
    val cal=Calendar.getInstance()
    val weekCount=cal. getActualMaximum(Calendar.WEEK_OF_MONTH)
    val thisWeek=cal.get(Calendar.WEEK_OF_MONTH)
    println(weekCount)
    println(thisWeek)
    cal.add(Calendar.WEEK_OF_MONTH,pos)
    val month=cal.get(Calendar.MONTH)
    //이번달 주 개
    //저번달 주개수 다 더해서 찾는게 맞는것같은데
    cal.set(Calendar.DAY_OF_WEEK,2)
    val list= mutableListOf<Date>()
    for(i in 0..6){
        if(cal.get(Calendar.MONTH)==month){
            list.add(cal.getTime())
        }
        cal.add(Calendar.DATE,1)
    }
    println(list.toString())

}