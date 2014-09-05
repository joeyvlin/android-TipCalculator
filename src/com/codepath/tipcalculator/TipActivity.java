package com.codepath.tipcalculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class TipActivity extends Activity {
	
	private EditText etAmount;
	private TextView tvTip;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tip);
		etAmount = (EditText) findViewById(R.id.etAmount);
		tvTip = (TextView) findViewById(R.id.tvTip);
	}

	public void onclick10Pct(View v) {
		this.updateTip(etAmount.getText().toString(), 0.1);
	}
	
	public void onclick15Pct(View v) {
		this.updateTip(etAmount.getText().toString(), 0.15);
	}
	
	public void onclick20Pct(View v) {
		this.updateTip(etAmount.getText().toString(), 0.2);
	}
		
	private void updateTip(String amount, double multiplier) {
		if (amount == null || amount.isEmpty()) {
			tvTip.setText("");
			return;
		}
		double tipAmount = Double.parseDouble(amount) * multiplier;
		tvTip.setText("$" + String.format("%.02f", tipAmount));
	}
}
