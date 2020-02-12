package com.julioandherson.ichor.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation

import com.julioandherson.ichor.R
import kotlinx.android.synthetic.main.fragment_profile.view.*

/**
 * A simple [Fragment] subclass.
 */
class ProfileFragment : Fragment(), View.OnClickListener {

    private lateinit var appView: View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        appView = inflater.inflate(R.layout.fragment_profile, container, false)

        return appView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        click()

    }

    private fun click() {
        appView.btnKidney.setOnClickListener(this)
        appView.btnObesity.setOnClickListener(this)
        appView.btnOldMan.setOnClickListener(this)
        appView.btnGastro.setOnClickListener(this)
        appView.btnGynecological.setOnClickListener(this)
        appView.btnOncological.setOnClickListener(this)
    }

    override fun onClick(view: View) {

        when(view.id) {
            R.id.btnKidney -> Navigation.findNavController(view).navigate(R.id.action_profileFragment_to_btnKidney)
            R.id.btnObesity -> Navigation.findNavController(view).navigate(R.id.action_profileFragment_to_btnObesity)
            R.id.btnOldMan -> Navigation.findNavController(view).navigate(R.id.action_profileFragment_to_btnOldMan)
            R.id.btnGastro -> Navigation.findNavController(view).navigate(R.id.action_profileFragment_to_btnGastro)
            R.id.btnGynecological -> Navigation.findNavController(view).navigate(R.id.action_profileFragment_to_btnGynecological)
            R.id.btnOncological -> Navigation.findNavController(view).navigate(R.id.action_profileFragment_to_btnOncological)
        }

    }


}
