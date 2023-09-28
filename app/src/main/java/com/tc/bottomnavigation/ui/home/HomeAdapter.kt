package com.tc.bottomnavigation.ui.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.content.res.AppCompatResources
import androidx.recyclerview.widget.RecyclerView
import com.tc.bottomnavigation.R
import com.tc.bottomnavigation.databinding.ItemUserBinding

class HomeAdapter(private val userList: List<String>) :
    RecyclerView.Adapter<HomeAdapter.CustomViewHolder>() {

    class CustomViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        private val binding = ItemUserBinding.bind(view)

        fun setupUI(userName: String, position: Int) {
            binding.textView.text = userName

            if (position % 2 == 0) {
                binding.textView.setBackgroundResource(R.color.purple_200)
            } else {
                binding.textView.setBackgroundResource(R.color.teal_200)
            }
        }

    }

    // Will be called whenever we create a new ITEM
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        return CustomViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_user, parent, false)
        )
    }

    // Gives a total count of the list items
    override fun getItemCount() = userList.size

    // Reference to current ITEM / POSITION within the List
    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        holder.setupUI(userList[position], position)
    }
}