package com.room.manager.p307;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.room.manager.p307.Base.BaseFragment;
import com.room.manager.p307.screen.HomeScreenFragment;

import io.realm.Realm;

public class MainActivity extends AppCompatActivity {

    private Realm realm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        realm = Realm.getDefaultInstance();
        HomeScreenFragment homeScreenFragment = new HomeScreenFragment();
        addFragment(homeScreenFragment);
    }

    public void addFragment(BaseFragment fragment){
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.frame_layout_main,fragment);
        fragmentTransaction.commit();
    }

    public Realm getRealm() {
        return realm;
    }

    public void setRealm(Realm realm) {
        this.realm = realm;
    }

    private String getKey(){
        return "";
    }
}
