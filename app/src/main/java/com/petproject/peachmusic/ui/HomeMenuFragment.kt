package com.petproject.peachmusic.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.petproject.peachmusic.R

class HomeMenuFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home_menu, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val test_button = view.findViewById<Button>(R.id.play_button)

        test_button.setOnClickListener {
            Toast.makeText(requireContext(), "You click on the button!!!", Toast.LENGTH_SHORT).show()
        }
    }
}