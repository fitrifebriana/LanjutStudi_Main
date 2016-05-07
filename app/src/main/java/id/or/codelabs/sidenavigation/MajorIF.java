package id.or.codelabs.sidenavigation;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MajorIF extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.major_if);

        final TextView itemMajor = (TextView) findViewById(R.id.major_name);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_back);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        toolbar.setTitle("Teknik Informatika");
        toolbar.inflateMenu(R.menu.menu_major);
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                String msg = "";

                switch (item.getItemId()){
                    case R.id.fav:
                        msg = "Favorite";
                        break;
                }

                Toast.makeText(MajorIF.this, msg + " clicked!",Toast.LENGTH_SHORT).show();
                return true;
            }
        });
    }
}

