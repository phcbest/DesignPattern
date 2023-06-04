package com.phcbest.designpatterns.ui.notifications

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.phcbest.designpatterns.behaviorPattern.chainOfResponsibility.ChainOfResponsibilityDemo
import com.phcbest.designpatterns.behaviorPattern.state.StateDemo
import com.phcbest.designpatterns.databinding.FragmentNotificationsBinding
import com.phcbest.designpatterns.structuralPattern.decorator.DecoratorActivity

class NotificationsFragment : Fragment() {

    private var _binding: FragmentNotificationsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val notificationsViewModel =
            ViewModelProvider(this).get(NotificationsViewModel::class.java)

        _binding = FragmentNotificationsBinding.inflate(inflater, container, false)
        _binding?.btnDecorator?.setOnClickListener(this::onClickListener)

        return binding.root
    }

    private fun onClickListener(view: View?) {
        when (view) {
            binding.btnDecorator -> {
                startActivity(Intent(requireContext(), DecoratorActivity::class.java))
            }

            else -> {}
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}