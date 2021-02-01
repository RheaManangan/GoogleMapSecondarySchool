package com.example.mapactivity2;

import androidx.fragment.app.FragmentActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // StoTomas --APVNHS--Manangan
        LatLng StoTomas = new LatLng(15.870465, 120.571128);
        mMap.addMarker(new MarkerOptions().position(StoTomas).title("Santo Tomas"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(StoTomas));

        LatLng Apv = new LatLng(15.877838556713254, 120.58145435445837);
        mMap.addMarker(new MarkerOptions().position(Apv).title("Antonio P. Villar National "));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Apv));

        // StoTomas --APVNHS--Ramos
        LatLng StoTomas2 = new LatLng(15.870490, 120.571155);
        mMap.addMarker(new MarkerOptions().position(StoTomas2).title("Santo Tomas"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(StoTomas2));

        LatLng Apv2 = new LatLng(15.877838556713254, 120.58145435445837);
        mMap.addMarker(new MarkerOptions().position(Apv2).title("Antonio P. Villar National "));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Apv2));

        // Cayambanan --ucnhs--Obina
        LatLng cayambanan = new LatLng(15.9955, 120.5941);
        mMap.addMarker(new MarkerOptions().position(cayambanan).title("Cayambanan"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(cayambanan));


        LatLng Ucnhs = new LatLng(15.978707479524926, 120.56320614252176);
        mMap.addMarker(new MarkerOptions().position(Ucnhs).title("Urdaneta City National High School "));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Ucnhs));


    }
}
