# Learning-android
There can be multiple entry points to the application first one is through having the intent filter on mainActivity to see the working of the fragment lifecycle and activity.
The other one is to see the viewPager 2 in action that can be viewed by having the mainactivity5 as the initial point.

About the 1st one 
So mainActivity calls the first fragment during it's onCreate() method and while onPause() it creates a new activity i.e. activity4 which in turns calls another fragment fragment2 in its onCreate() calls
this goes in a loop.