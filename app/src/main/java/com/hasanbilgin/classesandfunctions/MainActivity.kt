package com.hasanbilgin.classesandfunctions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

import android.widget.TextView
import android.widget.Toast
import com.hasanbilgin.classesandfunctions.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //binding tanıtılması
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //başlatılması
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        test()


        //Void - Unit (dörndürmeyen)
        mySum(50, 70)

        //Return
        val result = myMultiply(10, 20)
        binding.denemeTextview.text = "Result: ${result}"

        /*
       binding.tiklaButton.setOnClickListener{
           println("clicked")
       }
       */

        //sınıfu tanımlamak
        var simpson = Simpson(50, "homer simpson", "nucloar")
//        simpson.hiarColor // gelmez
        //object yada Instance
//        simpson.age = 50
//        simpson.job = "nucloar"
//        simpson.name = "homer simpson"

        println(simpson.age.toString() + "/" + simpson.name + "/" + simpson.job)

        //nullability //null durumu
        //nullable(?)(null  olması) && non-null(null olamaz)
        var myString: String
//        println(myString)//böle iken non-nulll dur ondna dolayı hata verirçözümü var

        //? konarak nulla eşitlenebilir yaptık 
        var myString2: String? = null
        println(myString2)

        //bide null ama metota girip atamasını yapçak ama kod görmez onuda böle engelleyebiliriz
        var myAge: Int? = null
//        println(myAge+10) //hata verir
//        o değer değere kavuşçağındna eminsek !! konabilir derler ama hala nul ise hata verir
//        println(myAge!! + 10) //hata verir


        //kodu patlatmamak için
        //1- null safety(emniyet)
        if (myAge != null) {
            println(myAge * 10)   //burda hata yarattmadı kotlin bunu görüyo
        } else {
            println("myAge nulll")
        }

        //2-safe call
        println(myAge?.compareTo(2))
        //?  hata kalkar
        //karşılaştırmak demek

        //3-elvis
        //?: bu null çıkarsa demeke
        //myAge?.compareTo(2) nullsa -100e eşitle demek
        var myResult = myAge?.compareTo(2) ?: -100
        println(myResult)







        

    }

    fun helloKotlin(view: View) {
        binding.denemeTextview.text = "hello kotlin"
    }

    fun test() {
        println("test çalıştı")
    }


    //input- % return
    fun mySum(a: Int, b: Int) {
//        println(a+b)
        binding.denemeTextview.text = "" + (a + b)
        binding.denemeTextview.text = "${a + b + 10}"
    }

    //: Int burda return int döndüreceği anlamına gelir
    fun myMultiply(x: Int, y: Int): Int {
        return x * y
    }
}