package com.example.collegeapp.features.home.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.collegeapp.R
import com.example.collegeapp.core.ui.CustomSnackBar
import com.example.collegeapp.databinding.FragmentShowArticleBinding
import com.example.collegeapp.features.home.ui.ShowArticleViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ShowArticleFragment : Fragment() {

    companion object {
        const val articleID: String = "article_id"
    }

    private lateinit var binding: FragmentShowArticleBinding
    private val viewModel: ShowArticleViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding =
            DataBindingUtil.inflate(
                inflater,
                R.layout.fragment_show_article,
                container,
                false
            )
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            viewModel = this@ShowArticleFragment.viewModel
            lifecycleOwner = viewLifecycleOwner
            imgBackShowArticleFragment.setOnClickListener {
                findNavController().popBackStack()
            }

            imgBookmarkShowArticleFragment.setOnClickListener {
                CustomSnackBar.Builder(
                    view = view,
                    requiredActivity = requireActivity()
                )
                    .setDescriptionText(
                        view.resources.getString(R.string.label_added_article_to_bookmark)
                    )
                    .build()
                    .showSnackBar()
            }
        }
    }
}