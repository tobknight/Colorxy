package com.colorxy.www.colorxy.Library.ui.platter

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.colorxy.www.colorxy.Library.R

class PlatterFragment : Fragment() {

    companion object {
        fun newInstance() = PlatterFragment()
    }

    private lateinit var viewModel: PlatterViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.platter_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(PlatterViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
