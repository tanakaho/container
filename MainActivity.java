package nhs90139.hal.ac.myradiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.RadioButton;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private TextView aTextView;
    private TextView bTextView;
    private String aText;
    private String bText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        aTextView = (TextView) findViewById(R.id.myTextView);
        bTextView = (TextView) findViewById(R.id.myTextView2);
        aText = "";
        bText = "";
    }



    public void radioMethod(View myRadioButton) {
        RadioButton aRadioButton = (RadioButton) myRadioButton;
        aText = (String) aRadioButton.getText();

    }

    public void radioMethod2(View myRadioButton) {
        RadioButton aRadioButton = (RadioButton) myRadioButton;
        bText = (String) aRadioButton.getText();

    }

    public void ButtonMethod(View myButton) {
        if(aText == "" || bText == ""){
            aText = "NotSelect";
            bText = "NotSelect";
        }else if(aText == ""){
            aText = "NotSelect";
        }else if(bText == ""){
            bText = "NotSelect";
        }
        aTextView.setText(String.format("%s Selected", aText));
        bTextView.setText(String.format("%s Selected", bText));
    }

}
