package net.stack3.buttonsample;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        
        Button normalButton = (Button)findViewById(R.id.normal_button);
        normalButton.setOnClickListener(normalButtonOnClickListener);
    }

    private OnClickListener normalButtonOnClickListener = new OnClickListener() {
        @Override
        public void onClick(View v) {
            Button normalButton = (Button)v;
            normalButton.setText(R.string.clicked);
        }
    };
    
    
}
