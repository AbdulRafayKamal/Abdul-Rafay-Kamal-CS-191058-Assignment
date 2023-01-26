package com.example.student.ui.addrecord

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.widget.doAfterTextChanged
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.student.databinding.FragmentAddRecordBinding
import kotlin.random.Random

class AddrecordFragment :Fragment() {

    private var _binding :FragmentAddRecordBinding? = null

    private val binding get() =_binding!!
    override fun onCreateView(

        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {

        val AddrecordViewModel = ViewModelProvider(this).get(AddrecordViewModel::class.java)
        _binding = FragmentAddRecordBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val namefield: EditText = binding.nameField
        namefield.doAfterTextChanged {
            AddrecordViewModel.name = it?.toString() ?: ""
        }
        val descfield: EditText = binding.descField
        descfield.doAfterTextChanged {
            AddrecordViewModel.description = it?.toString() ?: ""
        }
        val buttonsubmit: Button = binding.buttonSubmit
        buttonsubmit.setOnClickListener {
            val addName = binding.nameField
            val addDescription = binding.descField

        }

        return root

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}