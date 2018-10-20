package cn.uiuang.app

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import cn.uiuang.app.databinding.ActivityMainBinding
import cn.uiuang.app.model.Animal
import cn.uiuang.app.viewmodel.AnimalViewModel

class MainActivity : AppCompatActivity() {
    lateinit var dataBinding: ActivityMainBinding
    lateinit var animalViewModel: AnimalViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dataBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        val animal = Animal("dog", 1)
        animalViewModel = AnimalViewModel(animal)
        dataBinding.vm = animalViewModel
    }
}
