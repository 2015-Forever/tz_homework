package com.tz.layout;

import android.app.Activity;
import android.os.Bundle;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class CodeActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		// Layout
		LinearLayout ll = new LinearLayout(this);
		ll.setOrientation(LinearLayout.VERTICAL);
		LayoutParams params = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
		ll.setLayoutParams(params);
		
		// 布局参数: match_parent,wrap_content
		LinearLayout.LayoutParams itemParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.WRAP_CONTENT);
		
		// editText
		EditText et = new EditText(this);
		et.setLayoutParams(itemParams);
		et.setHint("电话");
		
		// Button
		Button btn = new Button(this);
		btn.setLayoutParams(itemParams);
		btn.setText("拨打");
		
		// 将子控件加入布局
		ll.addView(et);
		ll.addView(btn);
		
		setContentView(ll);
	}

}
