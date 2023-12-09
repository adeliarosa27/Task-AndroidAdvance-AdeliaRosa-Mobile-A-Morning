package com.example.projectandroidadvanced

import android.os.Bundle

import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar


class SearchFragment() : Fragment(){


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_search, container, false)
        val toolbar: Toolbar = view.findViewById(R.id.toolbar)
        (activity as AppCompatActivity).setSupportActionBar(toolbar)
        setHasOptionsMenu(true)
        return view
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.toolbar_menu, menu)
        super.onCreateOptionsMenu(menu, inflater)

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.newgroup -> {
                Toast.makeText(requireContext(), "Create new group", Toast.LENGTH_SHORT).show()
                return true
            }

            R.id.newbroadcast -> {
                Toast.makeText(requireContext(), "Create new broadcast", Toast.LENGTH_SHORT).show()
                return true
            }

            R.id.linkeddevices -> {
                Toast.makeText(requireContext(), "Create linkeddevices", Toast.LENGTH_SHORT).show()
                return true
            }

            R.id.settings -> {
                Toast.makeText(requireContext(), "Create settings", Toast.LENGTH_SHORT).show()
                return true
            }

            else -> return super.onOptionsItemSelected(item)

        }
    }
}