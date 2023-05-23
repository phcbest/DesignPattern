package com.phcbest.designpatterns.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.phcbest.designpatterns.createPattern.builder.BuilderDemo
import com.phcbest.designpatterns.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        _binding?.btnBuilder?.setOnClickListener(this::onClickListener)

        return binding.root
    }

    private fun onClickListener(view: View) {
        when (view) {
            binding.btnBuilder -> {
                BuilderDemo.doDemoInline(requireContext())
            }
            else -> {}
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}