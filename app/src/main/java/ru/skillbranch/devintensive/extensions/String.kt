package ru.skillbranch.devintensive.extensions

fun String.truncate(value: Int=16) : String{
    var s1:String=this
    var s:String=""
    var x=0
    s1=this.trim()

    if(s1.length>value) {

        while (x < value) {
            s += this[x]
            x++
        }
        if (s[value-1].toString()==" "){
            s=s.substring(0,s.length-1)
            s+="..."
        }
        else {
            s += "..."
        }
    }
    else {s=s1}

    return s
}