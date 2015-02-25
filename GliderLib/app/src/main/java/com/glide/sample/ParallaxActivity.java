package com.glide.sample;

import com.sliderparallaxpager.lib.ParallaxContainer;
import com.viewpagerindicator.lib.CirclePageIndicator;
import com.glide.sample.R;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;

public class ParallaxActivity extends Activity {

	public static ParallaxContainer parallaxContainer;
	
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_parallax);

   parallaxContainer = (ParallaxContainer) findViewById(R.id.parallax_container);

    if (parallaxContainer != null) {
      // specify whether pager will loop
      parallaxContainer.setLooping(false);
      // wrap the inflater and inflate children with custom attributes
    
      CirclePageIndicator cp = (CirclePageIndicator) findViewById(R.id.indicatorx);  
      cp.setContainer(parallaxContainer);
    ViewPager vp = parallaxContainer.setupChildren(getLayoutInflater(),R.raw.ny,cp,
          R.layout.parallax_view_1,
          R.layout.parallax_view_2,
          R.layout.parallax_view_3,
          R.layout.parallax_view_4);
    
    
       
    
      
      
    }
  }
}
