package ru.skillbranch.devintensive.utils

import android.R

object Utils {
    fun parseFullName(fullName:String?): Pair<String?,String?>{
        if ((fullName == null) or (fullName == "")or (fullName == " ")){
            println("123")
            return Pair(null,null)
        }
        else {
            val parts: List<String>? = fullName?.split(" ")
            val firstName = parts?.getOrNull(0)
            val lastName = parts?.getOrNull(1)
            if ((lastName == null) or (lastName == "")or (lastName == " ")){
            return  Pair(firstName, null)}
            else
                return Pair(firstName, lastName)
        }


    }

    fun transliteration(payload: String, divider:String= " "): String {
        var i:String
        var trans:String=""
        for(char in payload){
            if(char.toString().equals("а"))  trans += "a"
            if(char.toString().equals("б"))  trans += "b"
            if(char.toString().equals("в"))  trans += "v"
            if(char.toString().equals("г"))  trans += "g"
            if(char.toString().equals("д"))  trans += "d"
            if(char.toString().equals("е"))  trans += "e"
            if(char.toString().equals("ё"))  trans += "e"
            if(char.toString().equals("ж"))  trans += "zh"
            if(char.toString().equals("з"))  trans += "z"
            if(char.toString().equals("и"))  trans += "i"
            if(char.toString().equals("й"))  trans += "i"
            if(char.toString().equals("к"))  trans += "k"
            if(char.toString().equals("л"))  trans += "l"
            if(char.toString().equals("м"))  trans += "m"
            if(char.toString().equals("н"))  trans += "n"
            if(char.toString().equals("о"))  trans += "o"
            if(char.toString().equals("п"))  trans += "p"
            if(char.toString().equals("р"))  trans += "r"
            if(char.toString().equals("с"))  trans += "s"
            if(char.toString().equals("т"))  trans += "t"
            if(char.toString().equals("у"))  trans += "u"
            if(char.toString().equals("ф"))  trans += "f"
            if(char.toString().equals("х"))  trans += "h"
            if(char.toString().equals("ц"))  trans += "c"
            if(char.toString().equals("ч"))  trans += "ch"
            if(char.toString().equals("ш"))  trans += "sh"
            if(char.toString().equals("щ"))  trans += "sh"
            if(char.toString().equals("ъ"))  trans += ""
            if(char.toString().equals("ы"))  trans += "i"
            if(char.toString().equals("ь"))  trans += ""
            if(char.toString().equals("э"))  trans += "e"
            if(char.toString().equals("ю"))  trans += "yu"
            if(char.toString().equals("я"))  trans += "ya"

            if(char.toString().equals("А"))  trans += "A"
            if(char.toString().equals("Б"))  trans += "B"
            if(char.toString().equals("В"))  trans += "V"
            if(char.toString().equals("Г"))  trans += "G"
            if(char.toString().equals("Д"))  trans += "D"
            if(char.toString().equals("Е"))  trans += "E"
            if(char.toString().equals("Ё"))  trans += "E"
            if(char.toString().equals("Ж"))  trans += "Zh"
            if(char.toString().equals("З"))  trans += "Z"
            if(char.toString().equals("И"))  trans += "I"
            if(char.toString().equals("Й"))  trans += "I"
            if(char.toString().equals("К"))  trans += "K"
            if(char.toString().equals("Л"))  trans += "L"
            if(char.toString().equals("М"))  trans += "M"
            if(char.toString().equals("Н"))  trans += "N"
            if(char.toString().equals("О"))  trans += "O"
            if(char.toString().equals("П"))  trans += "P"
            if(char.toString().equals("Р"))  trans += "R"
            if(char.toString().equals("С"))  trans += "S"
            if(char.toString().equals("Т"))  trans += "T"
            if(char.toString().equals("У"))  trans += "U"
            if(char.toString().equals("Ф"))  trans += "F"
            if(char.toString().equals("Х"))  trans += "H"
            if(char.toString().equals("Ц"))  trans += "C"
            if(char.toString().equals("Ч"))  trans += "Ch"
            if(char.toString().equals("Ш"))  trans += "Sh"
            if(char.toString().equals("Щ"))  trans += "Sh"
            if(char.toString().equals("Ъ"))  trans += ""
            if(char.toString().equals("Ы"))  trans += "I"
            if(char.toString().equals("Ь"))  trans += ""
            if(char.toString().equals("Э"))  trans += "E"
            if(char.toString().equals("Ю"))  trans += "Yu"
            if(char.toString().equals("Я"))  trans += "Ya"
            if(char.toString().equals(" "))  trans += "$divider"




        }

        return trans

    }

    fun toInitials(firstName: String?, lastName: String?): String? {

        if (firstName != null && lastName!=null && lastName!="") {

            return "${firstName.get(0)}${lastName.get(0)}"
        }
        else
            if (firstName != null && firstName!=" " && firstName!="") {
                return "${firstName.get(0)}"
            }
            else

                if (lastName != null && lastName!=" " && lastName!="") {
                    return "${lastName.get(0)}"
                }
                else

                    return null




    }
}