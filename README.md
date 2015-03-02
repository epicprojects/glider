# Android Glider

An android library implementing fancy viewpager with gliding animations.

![Alt text](http://i.imgur.com/6e1JiTT.gif "Visual")


Try out the sample application on the [Android Market](https://play.google.com/store/apps/details?id=com.github.epicprojects.glider)


# Usage
* **Use a ParallaxContainer in layout XML**

```java
<com.glider.ParallaxContainer
      android:id="@+id/parallaxcontainer"
      android:layout_width="match_parent"
      android:layout_height="match_parent"/>
```
* **Create gliding layouts (views)**
  
Each page must have its own layout XML file. Use whichever Layouts or Views you like, as usual.

  Ensure this line is added to the Root Element:

  xmlns:app="http://schemas.android.com/apk/res-auto"
  Assign any combination of the following attributes (all floats):

  x_in: as the View enters the screen, it will translate in the horizontal direction along with user swiping, at a rate multiplied by this value. Default is 0.

  x_out: as the View leaves the screen, it will translate in the horizontal direction along with user swiping, at a rate multiplied by this value. Default is 0.

  y_in: as the View enters the screen, it will translate downward as the user swipes right to left, at a rate multiplied by this value. Default is 0.

  y_out: as the View leaves the screen, it will translate upward as the user swipes right to left, at a rate multiplied by this value. Default is 0.

  a_in: as the View enters the screen, it will fade in as the user swipes right to left, at a rate multiplied by this value. Default is 0.

  a_out: as the View leaves the screen, it will fade out as the user swipes right to left, at a rate multiplied by this value. Default is 0. 

```java
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical">

  <TextView
      android:layout_width="wrap_content"
      android:layout_height="wrap_content"
      app:x_in="@dimen/parallax_speed_medium"
      app:x_out="@dimen/parallax_speed_fast"
      app:y_in="@dimen/parallax_speed_medium_rev"
      app:y_out="@dimen/parallax_speed_fast"
      app:a_in="@dimen/parallax_speed_very_fast"
      app:a_out="@dimen/parallax_speed_very_fast"
      android:text="@string/text_1"
      />

  <TextView
      android:layout_width="wrap_content"
      android:layout_height="wrap_content"
      app:x_in="@dimen/parallax_speed_medium_rev"
      app:x_out="@dimen/parallax_speed_fast"
      app:y_in="@dimen/parallax_speed_medium"
      app:y_out="@dimen/parallax_speed_fast_rev"
      app:a_in="@dimen/parallax_speed_very_fast"
      app:a_out="@dimen/parallax_speed_very_fast"
      android:text="@string/text_2"
      />
</LinearLayout>
```

* **Add the attachment code**

```java
ParallaxContainer parallaxContainer;
parallaxContainer = (ParallaxContainer) findViewById(R.id.parallaxcontainer);
ViewPager vp =  parallaxContainer.setupChildren(getLayoutInflater(), R.raw.parallax_background_image,
                        R.layout.view_1,
                        R.layout.view_2,
                        R.layout.view_3);
```

* **[Jake Wharton View Pager Indicator](https://github.com/JakeWharton/ViewPagerIndicator) can also be attached (optional)**

```java
CirclePageIndicator indicator;
indicator = (CirclePageIndicator) findViewById(R.id.indicators);
indicator.setOnPageChangeListener(parallaxContainer); // parallaxContainer is from above code
indicator.setViewPager(vp); //vp is ViewPager from above code
```

# Including In Your Project
Android Glider is presented as an [Android library project](http://developer.android.com/guide/developing/projects/projects-eclipse.html). You can include this project by referencing it as a library project in Eclipse or ant.

If you are a Maven user you can easily include the library by specifying it as a dependency:

```xml
dependencies {
    compile 'com.github.epicprojects.glider:glider:1.0.0.1'
}
```
# Developed by
* Omer Shafiq - http://omershafiq.com

### Credits
   * [Prolific Interactive](https://github.com/prolificinteractive)  Author of [ParallaxPager](https://github.com/prolificinteractive/ParallaxPager)

# License

```xml
Copyright 2015 Omer Shafiq
Copyright 2015 Prolific Interactive


Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
