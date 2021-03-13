package com.example.madlibs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //create the layout
        final LinearLayout layout = new LinearLayout(this);

        //this part has all of the textViews
        AppCompatTextView nameView = new AppCompatTextView(this);
        nameView.setText("Name");

        AppCompatTextView schoolView = new AppCompatTextView(this);
        schoolView.setText("School");

        AppCompatTextView carView = new AppCompatTextView(this);
        carView.setText("Car");

        AppCompatTextView shoeView = new AppCompatTextView(this);
        shoeView.setText("Shoe Brand");

        AppCompatTextView colorView = new AppCompatTextView(this);
        colorView.setText("Color");

        //this is where I make it so all the edit text views will extend;
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);

        //this part will have the edit text Views
        final AppCompatEditText nameText = new AppCompatEditText(this);
        nameText.setLayoutParams(params);

        final AppCompatEditText schoolText = new AppCompatEditText(this);
        schoolText.setLayoutParams(params);

        final AppCompatEditText carText = new AppCompatEditText(this);
        carText.setLayoutParams(params);

        final AppCompatEditText shoeText = new AppCompatEditText(this);
        shoeText.setLayoutParams(params);

        final AppCompatEditText colorText = new AppCompatEditText(this);
        colorText.setLayoutParams(params);

        //This part will create the button and put it onto the screen
        final AppCompatTextView storyView = new AppCompatTextView(this);

        final LinearLayout layout2 = new LinearLayout(this);

        AppCompatButton button = new AppCompatButton(this);
        button.setText("Display Story");
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String name = nameText.getText().toString();
                String school = schoolText.getText().toString();
                String car = carText.getText().toString();
                String shoe = shoeText.getText().toString();
                String color = colorText.getText().toString();
                storyView.setText("Hello, my name is " + name + ". I go to " + school + ". I drive an awesome " +
                        color + " " + car + ". all while wearing my favorite " + color + " pair of " + shoe + " shoes");
                layout2.addView(storyView);
                setContentView(layout2);
            }
        });

        //this part is where everything will get displayed
        layout.addView(nameView);
        layout.addView(nameText);
        layout.addView(schoolView);
        layout.addView(schoolText);
        layout.addView(carView);
        layout.addView(carText);
        layout.addView(shoeView);
        layout.addView(shoeText);
        layout.addView(colorView);
        layout.addView(colorText);
        layout.addView(button);

        layout.setOrientation(LinearLayout.VERTICAL);
        setContentView(layout);

    }
}