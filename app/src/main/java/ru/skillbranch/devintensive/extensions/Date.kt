package ru.skillbranch.devintensive.extensions

import java.text.SimpleDateFormat
import java.util.*
import java.util.concurrent.TimeUnit

//import jdk.nashorn.internal.objects.NativeDate.getTime



const val SECOND = 1000L
const val MINUTE = 60 * SECOND
const val HOUR = 60 * MINUTE
const val DAY = 24 * HOUR
fun Date.format(pattern: String="HH:mm:ss dd.MM.yy"):String{
    val dateFormat= SimpleDateFormat(pattern, Locale("ru"))
    return dateFormat.format(this)
}
fun Date.add(value:Int, units: TimeUnits ): Date{
    var time = this.time
    time +=when(units){
        TimeUnits.SECOND->value* SECOND
        TimeUnits.MINUTE->value* MINUTE
        TimeUnits.HOUR->value* HOUR
        TimeUnits.DAY->value* DAY
    }
    this.time = time
    return this
}
fun Date.humanizeDiff(date:Date = Date()):String{
    var diffInMillies = date.getTime() - this.getTime()

    if (diffInMillies>0) {
        var timeSecond = Math.ceil(diffInMillies.toDouble() / 1000)
        var timeMinute = timeSecond.toInt() / 60
        var timeHour = timeMinute / 60
        var timeDay = timeHour / 24
        var timeWeek = timeDay / 7
        var timeMounth = timeDay / 30
        if (timeDay == 1) {
            return "$timeDay день назад"
        } else
            if (timeDay > 1 && timeDay < 5) {
                return "$timeDay дня назад"
            } else
                if (timeDay > 4 && timeDay < 7) {
                    return "$timeDay дней назад"
                } else
                    if (timeWeek == 1) {
                        return "$timeWeek неделю назад"
                    } else
                        if (timeWeek > 1 && timeWeek < 4) {
                            return "$timeWeek недели назад"
                        } else
                            if (timeMounth == 1) {
                                return "$timeMounth месяц назад"
                            } else
                                if (timeMounth > 1 && timeMounth < 5) {
                                    return "$timeMounth месяца назад"
                                } else
                                    if (timeMounth > 4 && timeMounth < 12) {
                                        return "$timeMounth месяцев назад"
                                    } else
                                        if (timeMounth > 11) {
                                            return "более года назад"
                                        } else
                                            if ((timeHour == 1) or
                                                (timeHour == 21)
                                            ) {
                                                return " $timeHour час назад"
                                            } else
                                                if ((timeHour > 1 && timeHour < 5) or
                                                    (timeHour > 21 && timeHour < 24)
                                                ) {
                                                    return " $timeHour часа назад"
                                                } else
                                                    if (timeHour > 4 && timeHour < 21) {
                                                        return " $timeHour часов назад"
                                                    } else
                                                        if (timeSecond < 60) {
                                                            return "несколько секунд назад"
                                                        }
        if ((timeMinute == 1) or
            (timeMinute == 21) or
            (timeMinute == 31) or
            (timeMinute == 41) or
            (timeMinute == 51)
        ) {
            return " $timeMinute минуту назад"
        } else
            if ((timeMinute > 1 && timeMinute < 5) or
                (timeMinute > 21 && timeMinute < 25) or
                (timeMinute > 31 && timeMinute < 35) or
                (timeMinute > 41 && timeMinute < 45) or
                (timeMinute > 51 && timeMinute < 55)
            ) {
                return "${timeMinute} минуты назад"
            } else
                if ((timeMinute > 4 && timeMinute < 21) or
                    (timeMinute > 24 && timeMinute < 31) or
                    (timeMinute > 34 && timeMinute < 41) or
                    (timeMinute > 44 && timeMinute < 51) or
                    (timeMinute > 55 && timeMinute < 60)
                ) {
                    return "${timeMinute} минут назад"
                }
                else
                    return "ошибка"

    }
    else
        if(diffInMillies<0){

            diffInMillies=diffInMillies*-1

            var timeSecond =Math.ceil(diffInMillies.toDouble()/ 1000)
            var timeMinute = timeSecond.toInt() / 60
            var timeHour = timeMinute / 60

            var timeDay = timeHour / 24
            var timeWeek = timeDay / 7
            var timeMounth = timeDay / 30
            if (timeDay == 1) {
                return "через $timeDay день"
            } else
                if (timeDay > 1 && timeDay < 5) {
                    return "через $timeDay дня"
                } else
                    if (timeDay > 4 && timeDay < 7) {
                        return "через $timeDay дней"
                    } else
                        if (timeWeek == 1) {
                            return "через $timeWeek неделю"
                        } else
                            if (timeWeek > 1 && timeWeek < 4) {
                                return "через $timeWeek недели"
                            } else
                                if (timeMounth == 1) {
                                    return "через $timeMounth месяц"
                                } else
                                    if (timeMounth > 1 && timeMounth < 5) {
                                        return "через $timeMounth месяца"
                                    } else
                                        if (timeMounth > 4 && timeMounth < 12) {
                                            return "через $timeMounth месяцев"
                                        } else
                                            if (timeMounth > 11) {
                                                return "более чем через  год"
                                            } else
                                                if ((timeHour == 1) or
                                                    (timeHour == 21)
                                                ) {
                                                    return "через $timeHour час"
                                                } else
                                                    if ((timeHour > 1 && timeHour < 5) or
                                                        (timeHour > 21 && timeHour < 24)
                                                    ) {
                                                        return "через $timeHour часа"
                                                    } else
                                                        if (timeHour > 4 && timeHour < 21) {
                                                            return "через $timeHour часов"
                                                        } else
                                                            if (timeSecond < 60) {
                                                                return "менее чем через минуту"
                                                            }
                                                            else
                                                                if ((timeMinute == 1) or
                                                                    (timeMinute == 21) or
                                                                    (timeMinute == 31) or
                                                                    (timeMinute == 41) or
                                                                    (timeMinute == 51)
                                                                ) {
                                                                    return "через $timeMinute минуту"
                                                                } else
                                                                    if ((timeMinute > 1 && timeMinute < 5) or
                                                                        (timeMinute > 21 && timeMinute < 25) or
                                                                        (timeMinute > 31 && timeMinute < 35) or
                                                                        (timeMinute > 41 && timeMinute < 45) or
                                                                        (timeMinute > 51 && timeMinute < 55)
                                                                    ) {
                                                                        return "через ${timeMinute} минуты"
                                                                    } else
                                                                        if ((timeMinute > 4 && timeMinute < 21) or
                                                                            (timeMinute > 24 && timeMinute < 31) or
                                                                            (timeMinute > 34 && timeMinute < 41) or
                                                                            (timeMinute > 44 && timeMinute < 51) or
                                                                            (timeMinute > 55 && timeMinute < 60)
                                                                        ) {
                                                                            return "через ${timeMinute} минут"
                                                                        }
                                                                        else
                                                                            return "ошибка"

        }
        else
            return "ошибка"

}

enum class TimeUnits {
    SECOND,
    MINUTE,
    HOUR,
    DAY;
    fun plural(value:Int): String {
        var j= value % 100
        if (j in 11..19){
            when (this){
                SECOND->return "$value секунд"
                MINUTE->return "$value минут"
                HOUR->return "$value часов"
                DAY->return "$value дней"
            }}else{
            j= value % 10
            println(j)
            if(j in 1..1){
                when (this){
                    SECOND->return "$value секунду"
                    MINUTE->return "$value минуту"
                    HOUR->return "$value час"
                    DAY->return "$value день"
                }}
            else
                if(j in 2..4){
                    when (this){
                        SECOND->return "$value секунды"
                        MINUTE->return "$value минуты"
                        HOUR->return "$value часа"
                        DAY->return "$value дня"
                    }}
                else{
                    when (this){
                        SECOND->return "$value секунд"
                        MINUTE->return "$value минут"
                        HOUR->return "$value часов"
                        DAY->return "$value дней"
                    }}}




        /*  when(this){
              SECOND->when(value){
                  1,21,31,41,51->return "$value секунду"
                  2,3,4,22,23,24,32,33,34,42,43,44,52,53,54-> return "$value секунды"
                  in 5..20->return "$value секунд"
                  25,26,27,28,29,30,35,36,37,38,39,40,45,46,47,48,49,50,55,56,57,58,59,60->return "$value секунд"
              }
              MINUTE->when(value){
                  1,21,31,41,51->return "$value минуту"
                  2,3,4,22,23,24,32,33,34,42,43,44,52,53,54-> return "$value минуты"
                  in 5..20->return "$value минут"
                  25,26,27,28,29,30,35,36,37,38,39,40,45,46,47,48,49,50,55,56,57,58,59,60->return "$value минут"
              }
              HOUR->when(value){
                  1,21,31,41,51->return "$value час"
                  2,3,4,22,23,24-> return "$value часа"
                  in 5..20->return "$value часов"
              }
              DAY->when(value){
                  1,21,31,41,51->return "$value час"
                  2,3,4,22,23,24-> return "$value часа"
                  in 5..20->return "$value часов"
                  25,26,27,28,29,30,35,36,37,38,39,40,45,46,47,48,49,50,55,56,57,58,59,60->return "$value минут"
              }
              else -> return "2"

           }*/
    }
}