package com.example.apolloslibrary.ui.settings

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import com.example.apolloslibrary.databinding.SettingItemBinding

/**
 * View Adapted user to display more navigation options.
 */
class SettingItemRecyclerViewAdapter(
    private val values: List<SettingItem>
) : RecyclerView.Adapter<SettingItemRecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder(
            SettingItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = values[position]
        holder.contentView.text = item.text
    }

    override fun getItemCount(): Int = values.size

    inner class ViewHolder(binding: SettingItemBinding) : RecyclerView.ViewHolder(binding.root) {
        val contentView: TextView = binding.content

        override fun toString(): String {
            return super.toString() + " '" + contentView.text + "'"
        }
    }

}