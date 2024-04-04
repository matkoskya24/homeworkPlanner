package com.example.homeworkplanner

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import androidx.navigation.findNavController
import android.view.ViewGroup
import com.example.homeworkplanner.databinding.FragmentHomeScreenBinding
class HomeScreen : Fragment() {
    private var _binding: FragmentHomeScreenBinding? = null //sets up binding
    val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeScreenBinding.inflate(inflater, container, false) //puts value in _binding
        val rootView = binding.root //sets up rootView, replaces original return statement
        binding.homeScreenButton.setOnClickListener {//sets click listener for button in home screen

        }
        return rootView
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}