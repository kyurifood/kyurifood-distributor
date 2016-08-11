package com.artivisi.android.kyurifood.distributor.activities;

import android.net.Uri;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.artivisi.android.kyurifood.distributor.R;
import com.artivisi.android.kyurifood.distributor.fragments.DashboardFragment;
import com.artivisi.android.kyurifood.distributor.fragments.KotakMasukFragment;
import com.artivisi.android.kyurifood.distributor.fragments.LaporanFragment;
import com.artivisi.android.kyurifood.distributor.fragments.PesananFragment;
import com.artivisi.android.kyurifood.distributor.fragments.ProdukFragment;

public class DashboardActivity extends AppCompatActivity implements
        DashboardFragment.OnFragmentInteractionListener,
        KotakMasukFragment.OnFragmentInteractionListener,
        LaporanFragment.OnFragmentInteractionListener,
        PesananFragment.OnFragmentInteractionListener,
        ProdukFragment.OnFragmentInteractionListener{

    DashboardFragment dashboardFragment = new DashboardFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.container, dashboardFragment);
        transaction.commit();
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
