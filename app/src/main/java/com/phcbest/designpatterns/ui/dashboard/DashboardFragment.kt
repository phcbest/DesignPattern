package com.phcbest.designpatterns.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.phcbest.designpatterns.behaviorPattern.chainOfResponsibility.ChainOfResponsibilityDemo
import com.phcbest.designpatterns.behaviorPattern.command.CommandDemo
import com.phcbest.designpatterns.behaviorPattern.state.StateDemo
import com.phcbest.designpatterns.databinding.FragmentDashboardBinding

class DashboardFragment : Fragment() {

    private var _binding: FragmentDashboardBinding? = null


    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val dashboardViewModel =
            ViewModelProvider(this)[DashboardViewModel::class.java]

        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        _binding?.btnChainOfResponsibility?.setOnClickListener(this::onClickListener)
        _binding?.btnState?.setOnClickListener(this::onClickListener)
        _binding?.btnCommand?.setOnClickListener(this::onClickListener)

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun onClickListener(view: View) {
        when (view) {
            binding.btnChainOfResponsibility -> {
                ChainOfResponsibilityDemo.doChainOfResponsibility(requireContext())
            }
            binding.btnState -> {
                StateDemo.startDemo(requireContext())
            }
            binding.btnCommand -> {
                CommandDemo.doDemo(requireContext())
            }
            else -> {}
        }
    }
}