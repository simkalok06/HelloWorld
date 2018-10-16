package my.edu.tarc.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textViewMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //on Create = main() function
        super.onCreate(savedInstanceState);

        //To display UI
        //R = resource class
        //layout = folder name
        setContentView(R.layout.activity_main);

        //Linking UI to program
        textViewMsg = findViewById(R.id.textViewMessage);
    }

    //View = class
    //V - an instance o a class
    public void showMessage(View V){
        textViewMsg.setText("Hello, Shorino Kage");
    }

    public void clearScreen(View V){
        textViewMsg.setText("");
    }
}
