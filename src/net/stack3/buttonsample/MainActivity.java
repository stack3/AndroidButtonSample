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
        setContentView(R.layout.activity_main);
        
        Button button = (Button)findViewById(R.id.button1);
        button.setOnClickListener(buttonOnClickListener);
    }

    private OnClickListener buttonOnClickListener = new OnClickListener() {
        @Override
        public void onClick(View v) {
            Button button = (Button)v;
            button.setText(R.string.title_button_was_clicked);
        }
    };
}
