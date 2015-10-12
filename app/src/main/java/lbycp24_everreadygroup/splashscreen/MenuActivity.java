package lbycp24_everreadygroup.splashscreen;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.*;

import lbycp24_everreadygroup.gopink.R;


public class MenuActivity extends Activity {

    String[] main_menu = {
            "Information",
            "News",
            "Testimonies",
            "Help"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, main_menu);
        ListView list = (ListView) findViewById(R.id.listView);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                /*
                switch (position){
                    case 0:
                        Intent goToInformation = new Intent(MenuActivity.this, Information.class);
                        startActivity(goToInformation);
                        break;

                    case 1:
                        Intent goToNews = new Intent(MenuActivity.this, News.class);
                        startActivity(goToNews);
                        break;

                    case 2:
                        Intent goToTestimonies = new Intent(MenuActivity.this, Testimonies.class);
                        startActivity(goToTestimonies);
                        break;

                    case 3:
                        Intent goToHelp = new Intent(MenuActivity.this, Help.class);
                        startActivity(goToHelp);
                        break;
                }*/
            }
        });
    }
}



/*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
            }
        }

*/