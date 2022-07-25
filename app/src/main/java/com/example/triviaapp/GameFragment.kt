package com.example.triviaapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.triviaapp.databinding.FragmentGameBinding
import com.example.triviaapp.databinding.FragmentTitleBinding


class GameFragment : Fragment() {
private lateinit var binding: FragmentGameBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       binding=DataBindingUtil.inflate(inflater,R.layout.fragment_game,container,false)
       //binding.submitbutton.setOnClickListener( Navigation.createNavigateOnClickListener(R.id.action_gameFragment_to_gameOverFragment))
       binding.submitbutton.setOnClickListener { v:View->
           val sub=3
           if(sub==2)
           {
               v.findNavController().navigate(R.id.action_gameFragment_to_gameOverFragment)
           }
           else
           {
              v.findNavController().navigate(R.id.action_gameFragment_to_gameWonFragment)
           }
       }


        return binding.root
    }


}