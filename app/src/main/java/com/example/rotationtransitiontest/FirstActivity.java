package com.example.rotationtransitiontest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class FirstActivity extends AppCompatActivity implements View.OnClickListener
{
	private TextView mText;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_first);
		mText = (TextView) findViewById(R.id.text);
		findViewById(R.id.button).setOnClickListener(this);
	}

	@Override
	public void onClick(View view)
	{
		SecondActivity.launch(this, mText);
	}
}