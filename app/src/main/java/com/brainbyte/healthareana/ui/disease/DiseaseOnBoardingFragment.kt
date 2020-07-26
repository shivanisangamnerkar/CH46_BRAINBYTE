package com.brainbyte.healthareana.ui.disease

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.brainbyte.healthareana.databinding.FragmentDiseaseOnBoardBinding

class DiseaseOnBoardingFragment : Fragment() {
    private lateinit var binding: FragmentDiseaseOnBoardBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDiseaseOnBoardBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.apply {
            fab.setOnClickListener {
                findNavController().navigate(
                    DiseaseOnBoardingFragmentDirections.actionDiseaseOnBoardingFragmentToDiseasePickerFragment()
                )
            }
        }
    }
}