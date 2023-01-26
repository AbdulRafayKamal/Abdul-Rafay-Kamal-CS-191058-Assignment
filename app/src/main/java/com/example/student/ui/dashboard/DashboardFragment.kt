package com.example.student.ui.dashboard

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.student.R
import com.example.student.databinding.FragmentDashboardBinding
import com.example.student.model.datamodel.Record
import kotlinx.coroutines.launch
import java.io.Serializable


class DashboardFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View
    {
        // Lookup the recyclerview in activity layout
        val view: View = inflater.inflate(R.layout.fragment_dashboard, container, false)
        val rvRecords = view.findViewById(R.id.rv_record) as RecyclerView







        return view
    }


}
