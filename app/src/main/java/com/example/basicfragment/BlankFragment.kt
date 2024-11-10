package com.example.basicfragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class BasicFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("BasicFragment", "onCreateView called")
        return inflater.inflate(R.layout.fragment_basic, container, false)
    }

    override fun onStart() {
        super.onStart()
        Log.d("BasicFragment", "onStart called")
    }

    override fun onResume() {
        super.onResume()
        Log.d("BasicFragment", "onResume called")
    }

    override fun onPause() {
        super.onPause()
        Log.d("BasicFragment", "onPause called")
    }

    override fun onStop() {
        super.onStop()
        Log.d("BasicFragment", "onStop called")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("BasicFragment", "onDestroyView called")
    }
}
