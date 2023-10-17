package com.lightfeather.islamicapplication.quran.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import com.lightfeather.islamicapplication.R
import com.lightfeather.islamicapplication.databinding.FragmentQuranPagesBinding
import kotlinx.coroutines.NonDisposableHandle.parent
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import org.koin.android.ext.android.get
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel


class QuranPagesFragment : Fragment() {

    private lateinit var binding: FragmentQuranPagesBinding

    private val viewModel: QuranPagesViewModel by viewModel()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentQuranPagesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding) {
            viewLifecycleOwner.lifecycleScope.launch {
                viewModel.quranPages.collect {
                    quranPages.adapter = QuranPageAdapter(it)
                }
            }
        }
    }

}