package com.example.triviaapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.triviaapp.databinding.FragmentRuleBinding

class RuleFragment : Fragment() {
    private lateinit var binding:FragmentRuleBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=DataBindingUtil.inflate(inflater,R.layout.fragment_rule, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }
}