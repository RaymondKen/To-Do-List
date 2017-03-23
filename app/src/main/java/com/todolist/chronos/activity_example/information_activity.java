package com.todolist.chronos.activity_example;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Chronos on 05/02/2017.
 */

public class information_activity extends Activity {

    private Button button;

    @Override
    public void onCreate(Bundle savedInstance)
    {
        super.onCreate(savedInstance);
        setContentView(R.layout.informations);
        onListenerButton();
    }

    public void onListenerButton()
    {
        button = (Button)findViewById(R.id.githuB);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent =
                        new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/RaymondKen/Java_android/"));
                startActivity(browserIntent);
            }
        });
    }
}
