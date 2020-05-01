package zyy.math.fjnu.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText helloWorld;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        helloWorld = (EditText) findViewById(R.id.hello_word);
        registerForContextMenu(helloWorld);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.game_menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.plain_item:
                Toast.makeText(this,"你点击了普通菜单", Toast.LENGTH_LONG).show();
                break;
            case R.id.font_10:
                helloWorld.setTextSize(10);
                break;
            case R.id.font_16:
                helloWorld.setTextSize(16);
                break;
            case R.id.font_20:
                helloWorld.setTextSize(20);
                break;
            case R.id.red:
                helloWorld.setTextColor(Color.RED);
                break;
            case R.id.black:
                helloWorld.setTextColor(Color.BLACK);
                break;
        }
        return  super.onOptionsItemSelected(item);
    }
}
