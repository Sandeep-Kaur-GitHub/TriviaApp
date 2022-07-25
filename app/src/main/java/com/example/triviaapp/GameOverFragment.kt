package com.example.triviaapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.triviaapp.databinding.FragmentGameOverBinding

class GameOverFragment : Fragment() {
private lateinit var binding: FragmentGameOverBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=DataBindingUtil.inflate(inflater,R.layout.fragment_game_over, container, false)
        binding.tryAgainBtn.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_gameOverFragment_to_gameFragment))
        return binding.root
    }
}