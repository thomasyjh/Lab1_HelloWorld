package my.edu.taruc.lab1helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //OnCreate = main(0 function
        super.onCreate(savedInstanceState);
        //Create the UI
        //R = resource class
        setContentView(R.layout.activity_main);

        TextView textViewMessage;  //Create an instance of a class
        textViewMessage = findViewById(R.id.textViewMessage);
        textViewMessage.setText("Hello Yap Jin Hui");
    }

    public void showMessage(View v){

        TextView textViewMessage;  //Create an instance of a class
        textViewMessage = findViewById(R.id.textViewMessage);
        textViewMessage.setText("Hello Yap Jin Hui");
    }
}
