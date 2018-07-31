package com.example.user.layoutapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // при нажатии на кнопку внизу вызвать wiki
        Button btnWiki = findViewById(R.id.btnWiki);
        btnWiki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                Uri address_wiki = Uri.parse("https://ru.wikipedia.org/wiki/%D0%9C%D0%B8%D0%BD%D1%81%D0%BA");
                Intent openlinkIntent = new Intent(Intent.ACTION_VIEW, address_wiki);
                startActivity(openlinkIntent);
            }
        });
    }

}
