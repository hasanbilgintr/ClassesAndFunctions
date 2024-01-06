package com.hasanbilgin.classesandfunctions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.hasanbilgin.classesandfunctions.databinding.ActivityMain2Binding
import com.hasanbilgin.classesandfunctions.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {


    //binding tanıtılması
    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        //başlatılması
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)


    }

    fun tikla2(view: View) {
        val name = binding.nameEdittext.text.toString()
        //yazılmayınca yani null bıraklınca toInt() patlatır ondna dolayı
        //toIntOrNull() kullandık  ve Simpson sınıfndakine Ageye ? koyduk   // buşeklde nullda olsa patlamaz androidde yazsa patlamaz sayı yazarsa çevirir yazar 
        var age = binding.ageEdittext.text.toString().toIntOrNull()

        //yada null veya string se 0 yazdırabiliriz
        if(age==null){
            age=0
        }

        val job = binding.jobEdittext.text.toString()
        val simpson = Simpson(age,name,job)
        binding.textView.text = "Name : ${simpson.name}, Age: ${simpson.age}, Job: ${simpson.job}"
    }
}