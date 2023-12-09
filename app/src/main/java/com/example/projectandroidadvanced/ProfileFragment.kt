package com.example.projectandroidadvanced

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

private lateinit var recyclerView: RecyclerView
private lateinit var datalist: ArrayList<DataClass>
lateinit var imagelist:Array<Int>
lateinit var titlelist:Array<String>

class ProfileFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var datalist: ArrayList<DataClass>
    private lateinit var imagelist: Array<Int>
    private lateinit var titlelist: Array<String>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_profile, container, false)

        imagelist = arrayOf(
            R.drawable.baseline_mode_edit_24,
            R.drawable.baseline_work_history_24,
            R.drawable.baseline_schedule_send_24,
            R.drawable.baseline_local_activity_24,
            R.drawable.baseline_save_as_24,
            R.drawable.baseline_language_24,
            R.drawable.baseline_privacy_tip_24,
            R.drawable.baseline_password_24,
            R.drawable.baseline_help_center_24
        )

        titlelist = arrayOf("Edit Profile","Work History", "schedule", "activity", "Saved", "language", "privacy and security", "Change Password", "Help Center")

        recyclerView = view.findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.setHasFixedSize(true)

        datalist = arrayListOf()
        getData()

        return view
    }

    private fun getData() {
        for (i in imagelist.indices) {
            val dataClass = DataClass(imagelist[i], titlelist[i])
            datalist.add(dataClass)
        }
        recyclerView.adapter = AdapterClass(datalist)
    }
}