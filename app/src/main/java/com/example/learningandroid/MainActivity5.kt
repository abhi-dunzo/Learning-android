package com.example.learningandroid

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2


class Adapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {
    private val fragmentList: ArrayList<Fragment> = ArrayList()
    override fun createFragment(position: Int): Fragment {
        return fragmentList[position]
    }

    fun addFragment(fragment: Fragment) {
        fragmentList.add(fragment)
    }

    override fun getItemCount(): Int {
        return fragmentList.size
    }
}
class MainActivity5 : AppCompatActivity() {
    private var myViewPager2: ViewPager2? = null
    private var myAdapter: Adapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_main5)

        myViewPager2 = findViewById(R.id.viewPager2)
        myAdapter = Adapter(supportFragmentManager, lifecycle)

        // add Fragments in your ViewPagerFragmentAdapter class 
        myAdapter?.addFragment(BlankFragment())
        myAdapter?.addFragment(BlankFragment2())
        myAdapter?.addFragment(BlankFragment3())

        // set Orientation in your ViewPager2
        myViewPager2?.orientation = ViewPager2.ORIENTATION_HORIZONTAL

        myViewPager2?.adapter = this.myAdapter

    }
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        val viewPager = findViewById<ViewPager>(R.id.)
//        viewPager.adapter = PageAdapter(supportFragmentManager)
//
//        val tabLayout = findViewById<TabLayout>(R.id.tabLayout)
//        tabLayout.setupWithViewPager(viewPager)
//    }
}