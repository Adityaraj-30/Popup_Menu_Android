package in.codingtimes.popup_menu_android;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button;
    ConstraintLayout display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        display = findViewById(R.id.display);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popupMenu = new PopupMenu(MainActivity.this,button);
                popupMenu.getMenuInflater().inflate(R.menu.popup_menu,popupMenu.getMenu());
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        int id = item.getItemId();
                        switch (id){
                            case R.id.Red:
                                display.setBackgroundColor(getResources().getColor(R.color.red));
                                break;
                            case R.id.Blue:
                                display.setBackgroundColor(getResources().getColor(R.color.blue));
                                break;
                            case R.id.Yellow:
                                display.setBackgroundColor(getResources().getColor(R.color.yellow));
                                break;
                        }
                        return true;
                    }
                });
                popupMenu.show();
            }
        });
    }

}