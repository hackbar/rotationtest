package com.example.rotationtransitiontest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class SecondActivity extends AppCompatActivity
{

	public static void launch(FragmentActivity activity, View sharedView)
	{
		Intent launcher = new Intent(activity, SecondActivity.class);

		ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(
				activity,
				sharedView,
				"transition");

		activity.startActivityForResult(launcher, 0, options.toBundle());
	}

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
	}
}
