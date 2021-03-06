package com.paad.checkbox;

import android.app.Activity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class MainActivity extends Activity
implements CompoundButton.OnCheckedChangeListener {

	CheckBox cb;

	@Override
	public void onCreate(Bundle icicle) {
		super.onCreate(icicle);
		setContentView(R.layout.activity_main);
		cb=(CheckBox)findViewById(R.id.check);
		cb.setOnCheckedChangeListener(this);
	}

	public void onCheckedChanged(CompoundButton buttonView,
			boolean isChecked) {
		if (isChecked) {
			cb.setText("This checkbox is: checked");
		}
		else {
			cb.setText("This checkbox is: unchecked");
		}
	}

}
