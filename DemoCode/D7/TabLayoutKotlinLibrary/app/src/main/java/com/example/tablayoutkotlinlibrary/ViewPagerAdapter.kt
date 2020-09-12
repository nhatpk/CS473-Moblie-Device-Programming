package com.example.tablayoutkotlinlibrary

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
class ViewPagerAdapter (fm:FragmentManager) : FragmentStatePagerAdapter(fm){
    // Instance fields
    private val mFragmentList = ArrayList<Fragment>()
    private val mFragmentTitleList = ArrayList<String>()
    // return the right fragment tabbed
    override fun getItem(position: Int): Fragment {
        return mFragmentList[position]
    }
    // return the count of tabs
    override fun getCount(): Int {
        return mFragmentList.size
    }
    //
    override fun getPageTitle(position: Int): CharSequence? = mFragmentTitleList[position]

    fun addFragment(fragment: Fragment, title: String) {
        mFragmentList.add(fragment)
        mFragmentTitleList.add(title)
    }
}