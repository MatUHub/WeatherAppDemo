package com.example.weatherappdemo.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.weatherappdemo.R
import com.example.weatherappdemo.databinding.FragmentMainBinding


class MainFragment : Fragment() {

//при уничтожении активити остается binding в фоне, из-за этого происходит утечка памяти
    var _binding: FragmentMainBinding? = null
    private val binding: FragmentMainBinding
    get() {return _binding!!}
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
      _binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    companion object {
        fun newInstance() = MainFragment()
    }
//прописать для зануления binding
    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}