package com.lightfeather.islamicapplication.quran.view

import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.lightfeather.islamicapplication.databinding.ItemQuranPageBinding
import com.lightfeather.islamicapplication.quran.model.UiQuranPage

class QuranPageAdapter(private val items: List<UiQuranPage>) : RecyclerView.Adapter<QuranPageAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemQuranPageBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) = holder.bind(items[position])


    class ViewHolder(private val binding: ItemQuranPageBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(quranPage: UiQuranPage) {
            val image = Drawable.createFromStream(quranPage.pageImage, null)
            binding.quranPage.setImageDrawable(image)
        }

    }
}