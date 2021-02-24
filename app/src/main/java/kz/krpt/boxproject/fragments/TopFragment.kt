package kz.krpt.boxproject.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import kz.krpt.boxproject.R
import kz.krpt.boxproject.databinding.FragmentTopBinding


class TopFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = DataBindingUtil.inflate<FragmentTopBinding>(inflater, R.layout.fragment_top, container, false)
        return  binding.root
        //return inflater.inflate(R.layout.fragment_top, container, false)
    }

}