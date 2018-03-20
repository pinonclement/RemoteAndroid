package m1project.remoteandroid.controller;

import android.content.DialogInterface;
import android.graphics.Color;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.ContextThemeWrapper;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import m1project.remoteandroid.R;
import m1project.remoteandroid.model.Ecran;
import m1project.remoteandroid.model.Scenario;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    TableLayout t1;
    Ecran ecran = new Ecran("ec1","1920*1280",false,true);
    Video video=
    Scenario scenario1 = new Scenario()
    View.OnClickListener btnclick = new View.OnClickListener() {

        //gestion d'un clic simple sur un ecran
        @Override
        public void onClick(View view) {

            switch (view.getId()) {
                //case 1:
                    //break;
                //Second button click

                default:
                    AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                    alertDialog.setTitle("Attention");
                    alertDialog.setMessage("Click recu sur le bouton " + view.getId());
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    alertDialog.show();
                    break;
            }

        }
    };

    View.OnLongClickListener btnclicklong = new View.OnLongClickListener() {

        //gestion d'un clic long sur un ecran
        public boolean onLongClick(View view) {
            DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
            switch (view.getId()) {
                case 1:

                    break;
                //Second button click


                default:

                    if (drawer.isDrawerOpen(GravityCompat.END)) {
                        drawer.closeDrawer(GravityCompat.END);
                        return true;
                    } else {
                        drawer.openDrawer(GravityCompat.END);
                        return true;
                    }
            }

            return true;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //remove statusbar
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);


        TableCreation(4, 4);

        /*Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);*/

       /* FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "You have chosen mail option", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        }); */

        final DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        /*
        ImageButton menuLeft = (ImageButton) findViewById(R.id.menuLeft);
        ImageButton menuRight = (ImageButton) findViewById(R.id.menuRight);


        menuLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (drawer.isDrawerOpen(GravityCompat.START)) {
                    drawer.closeDrawer(GravityCompat.START);
                } else {
                    drawer.openDrawer(GravityCompat.START);
                }
            }
        });

        menuRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (drawer.isDrawerOpen(GravityCompat.END)) {
                    drawer.closeDrawer(GravityCompat.END);
                } else {
                    drawer.openDrawer(GravityCompat.END);
                }
            }
        });
        */
        /*ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();*/

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

    /*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    */

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

      /*  //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        */

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        String text = "";
        if (id == R.id.nav_camera) {
            text = "camera";
        } else if (id == R.id.nav_gallery) {
            text = "gallery";
        } else if (id == R.id.nav_slideshow) {
            text = "slideshow";
        } else if (id == R.id.nav_manage) {
            text = "tools";
        } else if (id == R.id.nav_share) {
            text = "share";
        } else if (id == R.id.nav_send) {
            text = "send";
        } else if (id == R.id.nav_home) {
            text = "home";
        } else if (id == R.id.nav_bar) {
            text = "bar";
        } else if (id == R.id.nav_pool) {
            text = "pool";
        }
        Toast.makeText(this, "You have chosen " + text, Toast.LENGTH_LONG).show();
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        drawer.closeDrawer(GravityCompat.END);
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


}
