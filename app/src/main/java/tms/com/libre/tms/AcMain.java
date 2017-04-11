package tms.com.libre.tms;

import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.DrawerBuilder;

public class AcMain extends AppCompatActivity implements View.OnClickListener {
    public static Toolbar toolbar;
    public static Drawer drawer;
    private LinearLayout layoutPickUp;
    private LinearLayout layoutOnRoute;
    private LinearLayout layoutDrop;

    private TextView tvPickUp;
    private TextView tvOnRoute;
    private TextView tvDrop;

    private Image imgAva;
    private TextView tvName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ac_main);
        init();

    }

    public void init() {
        setupDrawerLayout();
        initSlideMenuItem();
    }

    public void initSlideMenuItem() {
        layoutPickUp = (LinearLayout) drawer.getDrawerLayout().findViewById(R.id.layoutPickUp);
        layoutPickUp.setOnClickListener(this);
        layoutOnRoute = (LinearLayout) drawer.getDrawerLayout().findViewById(R.id.layoutOnRoute);
        layoutOnRoute.setOnClickListener(this);
        layoutDrop = (LinearLayout) drawer.getDrawerLayout().findViewById(R.id.layoutDrop);
        layoutDrop.setOnClickListener(this);

        tvPickUp = (TextView) drawer.getDrawerLayout().findViewById(R.id.tvPickUp);
        tvOnRoute = (TextView) drawer.getDrawerLayout().findViewById(R.id.tvOnRoute);
        tvDrop = (TextView) drawer.getDrawerLayout().findViewById(R.id.tvDrop);

    }

    //setup drawer layout
    private void setupDrawerLayout() {
        LayoutInflater inflater = getLayoutInflater();
        drawer = new DrawerBuilder()
                .withActivity(this)
                .withCustomView(inflater.inflate(R.layout.slide_menu, null))
                .withTranslucentNavigationBar(true)
                .withOnDrawerListener(new Drawer.OnDrawerListener() {
                    @Override
                    public void onDrawerOpened(View drawerView) {
                    }

                    @Override
                    public void onDrawerClosed(View drawerView) {
                    }

                    @Override
                    public void onDrawerSlide(View drawerView, float slideOffset) {

                    }
                })
                .build();
    }

    public void setupMenu(){

    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.layoutPickUp:
                break;
            case R.id.layoutOnRoute:
                break;
            case R.id.layoutDrop:
                break;
        }

    }
}
