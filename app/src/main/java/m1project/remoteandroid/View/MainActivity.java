package m1project.remoteandroid.View;

import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.ContextThemeWrapper;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.Toast;

import m1project.remoteandroid.R;
import m1project.remoteandroid.controller.FileHelper;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    TableLayout t1;
    int selectid = 0;
    Toast toast;
    //pas de popup
    // ajouter etat a a chaque ecran
    View.OnClickListener btnclick = new View.OnClickListener() {

        //gestion d'un clic simple sur un ecran
        @Override
        public void onClick(View view) {

            switch (view.getId()) {
                //case 1:
                //break;
                //Second button click

                default:
                    Toast toast;
                    toast = Toast.makeText(getApplicationContext(), "Play/Pause sur l'ecran " +(view.getId()) , Toast.LENGTH_SHORT);
                    toast.show();
                    String text=new java.util.Date() +" Play/Pause sur l'ecran " +(view.getId());
                    FileHelper.saveToFile(text.toString());
                    break;
            }

        }
    };


    View.OnClickListener btnclickdrawer = new View.OnClickListener() {

        //gestion d'un clic simple sur un ecran
        @Override
        public void onClick(View view) {
            Toast toast;
            String text;

            switch (view.getId()) {

                case 100:
                    if (selectid!=0){
                    toast = Toast.makeText(getApplicationContext(), "Play/Pause sur l'écran " + selectid , Toast.LENGTH_SHORT);
                     text=new java.util.Date() +"Play/Pause sur l'écran " + selectid ;}
                    else{
                        toast = Toast.makeText(getApplicationContext(), "Play/Pause sur tous les écrans ", Toast.LENGTH_SHORT);
                         text=new java.util.Date() +"Play/Pause sur tous les écrans " ;}
                    toast.show();
                    FileHelper.saveToFile(text.toString());
                    break;
                case 101:
                    if (selectid!=0){
                        toast = Toast.makeText(getApplicationContext(), "Stop sur l'ecran " + selectid , Toast.LENGTH_SHORT);
                         text=new java.util.Date() +"Stop sur l'écran " + selectid ;}
                    else{
                        toast = Toast.makeText(getApplicationContext(), "Stop sur tous les écrans ", Toast.LENGTH_SHORT);
                         text=new java.util.Date() +"Stop sur tous les écrans " ;}
                    toast.show();
                    FileHelper.saveToFile(text.toString());
                    break;
                case 102:
                    if (selectid!=0){
                        toast = Toast.makeText(getApplicationContext(), "Plein écran sur l'écran " + selectid , Toast.LENGTH_SHORT);
                         text=new java.util.Date() +"Plein écran sur l'écran ";}
                    else{
                        toast = Toast.makeText(getApplicationContext(), "Commande indisponible ", Toast.LENGTH_SHORT);
                         text=new java.util.Date() +"Commande indisponible " ;}
                    toast.show();
                    FileHelper.saveToFile(text.toString());
                    break;
                case 103:
                    if (selectid!=0){
                        toast = Toast.makeText(getApplicationContext(), "Commande indisponible", Toast.LENGTH_SHORT);
                         text=new java.util.Date() +"Commande indisponible " ;}
                    else{
                        toast = Toast.makeText(getApplicationContext(), "Mute sur tous les écrans", Toast.LENGTH_SHORT);
                         text=new java.util.Date() +"Mute sur tous les écrans " ;}
                    toast.show();
                    FileHelper.saveToFile(text.toString());
                    break;
                //break;
                //Second button click

                default:

                    break;
            }

            selectid=0;
            DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);

            if (drawer.isDrawerOpen(GravityCompat.START)) {
                drawer.closeDrawer(GravityCompat.START);

            } else {
                drawer.openDrawer(GravityCompat.START);

            }

        }
    };

    View.OnLongClickListener btnclicklong = new View.OnLongClickListener() {

        //gestion d'un clic long sur un ecran
        public boolean onLongClick(View view) {
            DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);

            selectid=view.getId();
            if (drawer.isDrawerOpen(GravityCompat.START)) {
                drawer.closeDrawer(GravityCompat.START);
                return true;
            } else {
                drawer.openDrawer(GravityCompat.START);
                return true;
            }


        }
    };

    View.OnClickListener scenarioclick = new View.OnClickListener() {

        //gestion d'un clic simple sur un ecran
        @Override
        public void onClick(View view) {
            Toast toast;
            String text;

            switch (view.getId()) {

                case 200:
                    toast = Toast.makeText(getApplicationContext(), "Scénario 1 choisi", Toast.LENGTH_SHORT);
                    toast.show();
                    text=new java.util.Date() +"Scénario 1 choisi";
                    FileHelper.saveToFile(text.toString());
                    break;
                case 201:
                    toast = Toast.makeText(getApplicationContext(), "Scénario 2 choisi", Toast.LENGTH_SHORT);
                    toast.show();
                    text=new java.util.Date() +"Scénario 2 choisi";
                    FileHelper.saveToFile(text.toString());
                    break;


                default:

                    break;
            }

            DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);

            if (drawer.isDrawerOpen(GravityCompat.END)) {
                drawer.closeDrawer(GravityCompat.END);
            } else {
                drawer.openDrawer(GravityCompat.END);
            }

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);

        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);


        TableCreation(4, 4);
        ButtonDrawer();
        ScenarioDrawer();


        NavigationView navigationView1 = (NavigationView) findViewById(R.id.nav_view);
        NavigationView navigationView2 = (NavigationView) findViewById(R.id.nav_view2);
        navigationView1.setNavigationItemSelectedListener(this);
        navigationView2.setNavigationItemSelectedListener(this);

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else if (drawer.isDrawerOpen(GravityCompat.END)) {
            drawer.closeDrawer(GravityCompat.END);
        } else {
            super.onBackPressed();
        }
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.

        return true;
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
        int first_id = 1;
        for (int i = 1; i <= nbrow; i++) {
            TableRow newrow = new TableRow(this);
            newrow.setId(i * 10);
            newrow.setLayoutParams(new TableRow.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.FILL_PARENT));

            for (int j = 1; j <= nbrow; j++) {
                Button btn = new Button(new ContextThemeWrapper(getBaseContext(), R.style.MyButton));
                btn.setId(first_id);
                int id_ = btn.getId();
                btn.setText("" + id_ + "");
                btn.setTextColor(getResources().getColor(R.color.colorWhite));
                btn.setTextSize(24);
                btn.setOnClickListener(btnclick);
                btn.setOnLongClickListener(btnclicklong);
                btn.setLayoutParams(new TableRow.LayoutParams(TableLayout.LayoutParams.FILL_PARENT, TableLayout.LayoutParams.FILL_PARENT));
                newrow.addView(btn);
                first_id++;
            }

            tl.addView(newrow, new TableLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.FILL_PARENT, 1
            ));

        }

    }

    public void ButtonDrawer() {
        TableLayout tl = (TableLayout) findViewById(R.id.tablelayoutdrawer);
        int first_id = 100;
        for (int i = 1; i <= 4; i++) {
            TableRow newrow = new TableRow(this);
            newrow.setId(i * 10);
            newrow.setLayoutParams(new TableRow.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 50));
            ImageButton btn = new ImageButton(new ContextThemeWrapper(getBaseContext(), R.style.MyButton));
            btn.setId(first_id);
            int id_ = btn.getId();

            switch (i) {
                case 1:
                    //if state = play show pause else show play
                    btn.setImageResource(R.drawable.ic_play_white);
                    break;
                case 2:
                    btn.setImageResource(R.drawable.ic_stop_white);
                    break;
                case 3:
                    btn.setImageResource(R.drawable.ic_fit_to_width_white);
                    break;
                case 4:
                    btn.setImageResource(R.drawable.ic_no_sound);
            }
                    btn.setOnClickListener(btnclickdrawer);

                    btn.setLayoutParams(new TableRow.LayoutParams(TableLayout.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
                    newrow.addView(btn);
                    first_id++;
                    tl.addView(newrow, new TableLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT, 1
                    ));

            }

        }
    public void ScenarioDrawer() {
        TableLayout tl = (TableLayout) findViewById(R.id.tablelayoutdrawer2);
        int first_id = 200;
        for (int i = 1; i <= 2; i++) {
            TableRow newrow = new TableRow(this);
            newrow.setId(i * 10);
            newrow.setLayoutParams(new TableRow.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 50));
            Button btn = new Button(new ContextThemeWrapper(getBaseContext(), R.style.MyButton));
            btn.setId(first_id);
            btn.setText("Scénario " + i);
            btn.setTextColor(getResources().getColor(R.color.colorWhite));
            btn.setTextSize(15);
            btn.setOnClickListener(scenarioclick);
            btn.setLayoutParams(new TableRow.LayoutParams(TableLayout.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
            newrow.addView(btn);
            first_id++;
            tl.addView(newrow, new TableLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT, 1
            ));

        }

    }


    }

