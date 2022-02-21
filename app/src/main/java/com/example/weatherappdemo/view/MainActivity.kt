package com.example.weatherappdemo.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.weatherappdemo.R
import com.example.weatherappdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //при активации в активити утечек памяти нет ( не нужно прописывать binding = null в onDestroy() как в макете)
    //создаем переменную binding
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //парсим макет activity_main в binding (преобразование макета в набор тегов)
        binding = ActivityMainBinding.inflate(layoutInflater)
        //устанавливаем во View содержимое binding
        setContentView(binding.root)
    }
}
