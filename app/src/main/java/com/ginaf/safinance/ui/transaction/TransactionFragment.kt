package com.ginaf.safinance.ui.transaction

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ginaf.safinance.R
import com.google.android.material.appbar.MaterialToolbar

class TransactionFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_transaction, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerView = view.findViewById<RecyclerView>(R.id.rvTransaksi)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

    }

    override fun onResume() {
        super.onResume()
        setupToolbar()
    }

    private fun setupToolbar() {
        val toolbar = requireActivity().findViewById<MaterialToolbar>(R.id.customToolbar)

        toolbar.findViewById<LinearLayout>(R.id.homeToolbarContent).visibility = View.GONE
        toolbar.findViewById<LinearLayout>(R.id.otherToolbarContent).visibility = View.VISIBLE
        toolbar.findViewById<TextView>(R.id.tvTitle).text = getString(R.string.title_transaction)

        toolbar.menu.clear()
        toolbar.inflateMenu(R.menu.action_sort)

        toolbar.setOnMenuItemClickListener { item ->
            when (item.itemId) {
                R.id.action_sort -> {
                    Toast.makeText(requireContext(), "Sort clicked", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.action_filter_date -> {
                    Toast.makeText(requireContext(), "Filter Date clicked", Toast.LENGTH_SHORT).show()
                    true
                }
                else -> false
            }
        }
    }


}

