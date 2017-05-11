package com.acme.csci3130;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

    private EditText copyText, pasteText;
    private ClipboardManager cbm;
    private ClipData cd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        copyText = (EditText) findViewById(R.id.copyText);
        pasteText = (EditText) findViewById(R.id.pasteText);

        cbm = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);

    }

    public void copy (View view){
        String text = copyText.getText().toString();
        cd = ClipData.newPlainText("text", text);
        cbm.setPrimaryClip(cd);
    }

    public void paste (View view){
        ClipData cd2 = cbm.getPrimaryClip();
        ClipData.Item item = cd2.getItemAt(0);
        String copied = item.getText().toString();
        pasteText.setText(copied);
    }

}
