package com.example.learningandroid

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2



class MainActivity5 : AppCompatActivity() {
     var myViewPager2: ViewPager2? = null
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
        var i = myAdapter?.itemCount
        Log.d("ViewPager2 " , "hi from activity 5 $i")

        }

    override fun onPause() {
        super.onPause()
//        var button :Button = this.findViewById(R.id.button)
//        var btnColor = resources.getColor(R.color.purple_500)
//        button.setBackgroundColor(btnColor)
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