package com.example.lab_week_04

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

// Pair antara Title dan Desc
val CAFE_TABS = listOf(
    Pair(R.string.starbucks_title, R.string.starbucks_desc),
    Pair(R.string.janjijiwa_title, R.string.janjijiwa_desc),
    Pair(R.string.kopikenangan_title, R.string.kopikenangan_desc),
)

class CafeAdapter(private val parentFragment: Fragment) :
    FragmentStateAdapter(parentFragment) {

    override fun getItemCount(): Int = CAFE_TABS.size

    override fun createFragment(position: Int): Fragment {
        val descResId = CAFE_TABS[position].second
        val descText = parentFragment.requireContext().getString(descResId)
        return CafeDetailFragment.newInstance(descText)
    }
}
