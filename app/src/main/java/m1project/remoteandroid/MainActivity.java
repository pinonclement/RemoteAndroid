package m1project.remoteandroid;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TableLayout t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TableCreation(4, 4);

    }


    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus) {
            getWindow().getDecorView().setSystemUiVisibility(
                    View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                            | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                            | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                            | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                            | View.SYSTEM_UI_FLAG_FULLSCREEN
                            | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
        }
    }


    public void TableCreation(int nbrow, int nbcolumns) {
        TableLayout tl = (TableLayout) findViewById(R.id.main_table);
        for (int i=1; i<=nbrow; i++){
            TableRow newrow = new TableRow(this);
            newrow.setId(i*10);
            newrow.setLayoutParams(new TableRow.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.FILL_PARENT));

            for (int j=1; j<=nbrow; j++){
                Button btn = new Button(new ContextThemeWrapper(getBaseContext(), R.style.MyButton));
                btn.setId(i*10+j);
                int id_ = btn.getId();
                btn.setText(""+id_+"");
                btn.setTextColor(getResources().getColor(R.color.colorWhite));
                btn.setTextSize(24);
                btn.setLayoutParams(new TableRow.LayoutParams(TableLayout.LayoutParams.FILL_PARENT,     TableLayout.LayoutParams.FILL_PARENT));
                newrow.addView(btn);
            }

            tl.addView(newrow, new TableLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.FILL_PARENT,1
            ));

        }

    }
}
