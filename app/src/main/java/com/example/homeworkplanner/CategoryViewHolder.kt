package com.example.homeworkplanner

import android.annotation.SuppressLint
import androidx.recyclerview.widget.RecyclerView
import com.example.homeworkplanner.databinding.FragmentCategoryBinding

class CategoryViewHolder(val binding: FragmentCategoryBinding ):
    RecyclerView.ViewHolder(binding.root)   {
        private lateinit var currentCategory: ItemCategory
        @SuppressLint("ResourceAsColor") //allows color resources to be read in from resource file
        fun bindCategory(itemCategory: ItemCategory){
            currentCategory = itemCategory
            binding.categoryButton.text = currentCategory.categoryName
            if(currentCategory.isClicked){ //changes appearance of button if clicked
                binding.categoryButton.setBackgroundColor(R.color.black)
                binding.categoryButton.setTextColor(R.color.white)
                binding.separator.setBackgroundColor(R.color.black)
            }
        }
    init{
        binding.categoryButton.setOnClickListener {
            currentCategory.isClicked = true
        }
    }
}