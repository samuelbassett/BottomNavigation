package com.tc.bottomnavigation.ui.dashboard

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.tc.bottomnavigation.R
import com.tc.bottomnavigation.databinding.ItemDashboardBinding

class DashboardAdapter(private val data: DashboardViewModel) :
    RecyclerView.Adapter<DashboardAdapter.CustomViewHolder>() {

    class CustomViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        private val binding = ItemDashboardBinding.bind(view)
        fun setupUI(titleText: String, descriptionText: String, image: Int) {
            binding.titleTextView.text = titleText
            binding.descriptionTextView.text = descriptionText
            binding.imageView.setImageResource(image)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        return CustomViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_dashboard, parent, false)
        )
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        holder.setupUI(
            data.getTitleList().elementAt(position),
            data.getDescriptionList().elementAt(position),
            data.getImageList().elementAt(position)
        )
    }

    override fun getItemCount() = data.getTitleList().size
}
