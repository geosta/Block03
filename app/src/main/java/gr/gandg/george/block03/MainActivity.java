package gr.gandg.george.block03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showClicked(View v) {
        Button buttonPressed = (Button)v;
        Toast.makeText(getApplicationContext(), "You pressed: " + buttonPressed.getText(), Toast.LENGTH_SHORT).show();
    }
}
