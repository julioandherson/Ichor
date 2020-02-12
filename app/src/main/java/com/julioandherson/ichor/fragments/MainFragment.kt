package com.julioandherson.ichor.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.julioandherson.ichor.R
import kotlinx.android.synthetic.main.fragment_main.view.*

/**
 * A simple [Fragment] subclass.
 */
class MainFragment : Fragment(), View.OnClickListener {

    private lateinit var appView: View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        appView = inflater.inflate(R.layout.fragment_main, container, false)

        return appView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        click()

    }

    private fun click() {
        appView.btnNo.setOnClickListener(this)
        appView.btnYes.setOnClickListener(this)
    }

    override fun onClick(view: View) {

        when (view.id) {
            R.id.btnNo -> Navigation.findNavController(view).navigate(R.id.action_mainFragment_to_profileFragment)
            R.id.btnYes -> true //Navigation.findNavController(view).navigate(R.id.action_profileFragment_to_btnObesity)

        }
    }
}
