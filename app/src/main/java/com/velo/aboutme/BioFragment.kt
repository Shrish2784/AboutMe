package com.velo.aboutme

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.velo.aboutme.databinding.FragmentBioBinding

class BioFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentBioBinding>(
            inflater,
            R.layout.fragment_bio,
            container,
            false
        );
        return binding.root;
    }
}
