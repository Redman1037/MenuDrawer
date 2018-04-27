package in.eightfolds.menudrawer;

import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

public class MenuDrawer {

    FrameLayout frame_parent, frame_nav_view;
    private AppCompatActivity activity;

    View mainView, contentView, menuView;
    Toolbar toolbar;


    public MenuDrawer() {

    }

    public MenuDrawer attach(AppCompatActivity activity) {

        this.activity = activity;
//        activity.setTheme(R.style.AppTheme_NoActionBar);


        mainView = LayoutInflater.from(activity).inflate(R.layout.activity_menu_drawer, null, false);
        activity.setContentView(mainView);
        frame_parent = mainView.findViewById(R.id.frame_parent);
        frame_nav_view = mainView.findViewById(R.id.frame_nav_view);


        return this;
    }


    public MenuDrawer(AppCompatActivity activity, int contentViewResId, int menuViewResId) {
        attach(activity);
        setContentView(contentViewResId);
        setMenuView(menuViewResId);

    }


    public MenuDrawer setContentView(int contentViewResId) {

        contentView = LayoutInflater.from(activity).inflate(contentViewResId, (ViewGroup) frame_parent, false);
        frame_parent.addView(contentView);
        return this;

    }


    public MenuDrawer setMenuView(int menuViewResId) {

        menuView = LayoutInflater.from(activity).inflate(menuViewResId, (ViewGroup) frame_nav_view, false);
        frame_nav_view.addView(menuView);
        return this;

    }



    public MenuDrawer setToolBar(int toolBarId, String title) {

        toolbar = mainView.findViewById(toolBarId);
        if (toolbar != null) {
            activity.setSupportActionBar(toolbar);
            activity.getSupportActionBar().setTitle(title);
            activity.getSupportActionBar().setDisplayShowHomeEnabled(true);

            setDrawerToggle(toolbar);


        }

        return this;
    }

    public void setDrawerToggle(Toolbar toolbar) {

        DrawerLayout drawer = (DrawerLayout) mainView.findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                activity, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
    }




    public View getContentView() {
        if (contentView == null) {
            throw new NullPointerException("Content view is null, please set the view before trying to get it");
        }
        return contentView;
    }

    public View getMenuView() {
        if (menuView == null) {
            throw new NullPointerException("Menu view is null, please set the view before trying to get it");
        }
        return menuView;
    }

    public void openDrawer() {
        DrawerLayout drawer = (DrawerLayout) mainView.findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        }
    }

    public void closeDrawer() {
        DrawerLayout drawer = (DrawerLayout) mainView.findViewById(R.id.drawer_layout);
        if (!drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.openDrawer(GravityCompat.START);
        }
    }

    public boolean isDrawerOpen() {
        DrawerLayout drawer = (DrawerLayout) mainView.findViewById(R.id.drawer_layout);
        return drawer.isDrawerOpen(GravityCompat.START);
    }


}
