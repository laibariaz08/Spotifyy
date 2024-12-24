package com.example.spotify

import androidx.fragment.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.content.Intent


class SearchFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_search, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val myImageView: ImageView = view.findViewById(R.id.atif_aslam)

        // Set an OnClickListener to open the new activity
        myImageView.setOnClickListener {
            val intent = Intent(activity, musicPlayerActivity::class.java)
            startActivity(intent)
        }
    }


}
