package com.example.inf04rzutmoneta

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.inf04rzutmoneta.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        var random = 1
        var random2 = 1
        var random3 = 1

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var moneta1Dostep = true
        binding.moneta1.setOnClickListener {
            moneta1Dostep = !moneta1Dostep
            if(!moneta1Dostep){
                binding.moneta1.alpha = 0.5f
            }
            else{
                binding.moneta1.alpha = 1f

            }
        }
        var moneta2Dostep = true
        binding.moneta2.setOnClickListener {
            moneta2Dostep = !moneta2Dostep
            if(!moneta2Dostep){
                binding.moneta2.alpha = 0.5f
            }
            else{
                binding.moneta2.alpha = 1f

            }
        }
        var moneta3Dostep = true
        binding.moneta3.setOnClickListener {
            moneta3Dostep = !moneta3Dostep
            if(!moneta3Dostep){
                binding.moneta3.alpha = 0.5f
            }
            else{
                binding.moneta3.alpha = 1f

            }
        }
        binding.button2.setOnClickListener {
            var liczbaOrlow = 0
            if(moneta1Dostep){
                random = Random.nextInt(2)
            }
            if(moneta2Dostep) {
                random2 = Random.nextInt(2)
            }
            if(moneta3Dostep) {
                random3 = Random.nextInt(2)
            }
            if(random==0 && moneta1Dostep){
                binding.moneta1.setImageResource(R.drawable.moneta_orzel)
                liczbaOrlow +=1
            }
            if(random==1 && moneta1Dostep){
                binding.moneta1.setImageResource(R.drawable.moneta_reszka)
            }
            if(random2==0 && moneta2Dostep){
                binding.moneta2.setImageResource(R.drawable.moneta_orzel)
                liczbaOrlow +=1
            }
            if(random2==1 && moneta2Dostep){
                binding.moneta2.setImageResource(R.drawable.moneta_reszka)
            }
            if(random3==0 && moneta3Dostep){
                binding.moneta3.setImageResource(R.drawable.moneta_orzel)
                liczbaOrlow +=1
            }
            if(random3==1 && moneta3Dostep){
                binding.moneta3.setImageResource(R.drawable.moneta_reszka)
            }
            binding.textView2.text = liczbaOrlow.toString()
        }
    }
}