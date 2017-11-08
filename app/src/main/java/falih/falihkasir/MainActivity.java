package falih.falihkasir;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String nilai1,nilai2,nilai3,nilai4,nilai5,nilai6,nilai7;

    TextView nil1,nil2,nil3,nil4,nil5,nil6,nil7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nil1= (TextView) findViewById(R.id.nil1);
        nil2= (TextView) findViewById(R.id.nil2);
        nil3= (TextView) findViewById(R.id.nil3);
        nil4= (TextView) findViewById(R.id.nil4);
        nil5= (TextView) findViewById(R.id.nil5);
        nil6= (TextView) findViewById(R.id.nil6);
        nil7= (TextView) findViewById(R.id.nil7);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id==R.id.setHarga){
            startActivity(new Intent(this, SettingHarga.class));
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void doPesan(View view) {
        Intent it = new Intent(this, StrukPembelian.class);
        nilai1=nil1.getText().toString();
        nilai2=nil2.getText().toString();
        nilai3=nil3.getText().toString();
        nilai4=nil4.getText().toString();
        nilai5=nil5.getText().toString();
        nilai6=nil6.getText().toString();
        nilai7=nil7.getText().toString();
        it.putExtra("nilai1",nilai1);
        it.putExtra("nilai2",nilai2);
        it.putExtra("nilai3",nilai3);
        it.putExtra("nilai4",nilai4);
        it.putExtra("nilai5",nilai5);
        it.putExtra("nilai6",nilai6);
        it.putExtra("nilai7",nilai7);
        startActivity(it);

    }

}
