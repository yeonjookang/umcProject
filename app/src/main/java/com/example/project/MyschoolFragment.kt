package com.example.project

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.project.databinding.FragmentMyschoolBinding

class MyschoolFragment : Fragment(){
    private lateinit var viewBinding: FragmentMyschoolBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewBinding= FragmentMyschoolBinding.inflate(layoutInflater)
        return viewBinding.root
    }
}