package com.example.learningandroid

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [BlankFragment3.newInstance] factory method to
 * create an instance of this fragment.
 */
class BlankFragment3 : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null


    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("Fragment State ","Hi from onAttach() fragment3")

    }
    override fun onStart() {
        super.onStart()
        Log.d("Fragment State ","Hi from onStart fragment3")
    }
    override fun onResume() {
        super.onResume()
        Log.d("Fragment State ","Hi form onResume fragment3")
    }
    override fun onPause() {
        super.onPause()
        Log.d("Fragment State ","Hi from onPause() fragment3")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Fragment State ","Hi from onDestroy() fragment3")

    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("Fragment State ","Hi from onDestroyView() fragment3")

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("Fragment State ","Hi from onCreate() fragment3")

        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank3, container, false)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment BlankFragment3.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            BlankFragment3().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}