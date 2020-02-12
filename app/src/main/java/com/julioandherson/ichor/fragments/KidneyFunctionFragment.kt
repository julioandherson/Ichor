package com.julioandherson.ichor.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.julioandherson.ichor.R

/**
 * A simple [Fragment] subclass.
 */
class KidneyFunctionFragment : Fragment() {

    private lateinit var appView: View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        appView = inflater.inflate(R.layout.fragment_kidney_function, container, false)


        return appView
    }


}
