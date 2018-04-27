package in.eightfolds.sampleapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import in.eightfolds.menudrawer.MenuDrawer;

public class MainActivity extends AppCompatActivity {

    MenuDrawer menuDrawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_main);
        menuDrawer = new MenuDrawer().attach(this);
        menuDrawer.setContentView(R.layout.activity_main);
        menuDrawer.setMenuView(R.layout.menu_view);
        menuDrawer.setToolBar(R.id.toolBar, "MainActivity");



    }
}
