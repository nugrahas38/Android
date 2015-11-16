package asalamualaikum.com.listview;

import android.app.LauncherActivity;
import android.app.ListActivity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.ListView;
import android.view.View;


public class MainActivity extends ListActivity {

    TextView seleksi;
    String[] pilihan = {
            "Merbabu", "Merapi", "Lawu", "Rinjani",
            "Sumbing","Sindoro", "Krakatau", "Selat Sunda",
            "Selat Bali","Selat Malaka","Kalimantan",
            "Sulawesi", "Jawa" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setListAdapter(new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_single_choice, pilihan));
        seleksi = (TextView) findViewById(R.id.yangDipilih);

    }

    public void onListItemClick (ListView parent, View v, int position , long id) {
        seleksi.setText(pilihan[position]);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
