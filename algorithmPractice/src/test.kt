package com.apptive.android.polda

fun main(){
    val trans=StickerFormTrans()
    val floatArr= floatArrayOf(-2.5245812f, 0.041843817f, 768.7907f, -0.041843817f,
            -2.5245812f, 892.3619f, 0.0f, 0.0f, 1.0f)
    val stringArr=arrayOf<String>("-2.5245812", "0.041843817", "768.7907", "-0.041843817", "-2.5245812", "892.3619", "0.0", "0.0", "1.0")
    println("float->Arr")
    trans.floatArrayToStringArray(floatArr).forEach{
        print(it+"\t")
    }
    println("\nstring->float")
    trans.stringArrayToFloatArray(stringArr).forEach{
        print(it.toString()+"\t")
    }
}

class StickerFormTrans(){





    fun floatArrayToStringArray(floatArr: FloatArray):Array<String>{
        val stringArr=Array<String>(floatArr.size,{""})
        floatArr.forEachIndexed { index, fl ->
            stringArr[index]=fl.toString()
        }
        return stringArr
    }

    fun stringArrayToFloatArray(strArr:Array<String>):FloatArray{
        val floatArr=FloatArray(strArr.size,{0f})
        strArr.forEachIndexed { index, s ->
            floatArr[index]=s.toFloat()
        }
        return floatArr
    }





}


