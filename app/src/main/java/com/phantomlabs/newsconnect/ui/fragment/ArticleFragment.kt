package com.phantomlabs.newsconnect.ui.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.phantomlabs.newsconnect.R
import com.phantomlabs.newsconnect.ui.NewsActivity
import com.phantomlabs.newsconnect.ui.NewsViewModel

class ArticleFragment : Fragment(R.layout.fragment_article) {

    lateinit var viewModel: NewsViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = (activity as NewsActivity).viewModel
    }
}