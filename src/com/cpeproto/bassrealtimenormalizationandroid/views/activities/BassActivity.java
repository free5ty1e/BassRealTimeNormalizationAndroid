package com.cpeproto.bassrealtimenormalizationandroid.views.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.cpeproto.bassrealtimenormalizationandroid.R;

public class BassActivity extends Activity
{
  /** Called when the activity is first created. */
  @Override
  public void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
//    setContentView(R.layout.main);

    startActivity(new Intent(this, AudioFxDemo.class));
  }
}
