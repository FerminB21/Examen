package com.vallescastro.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class Fragments extends AppCompatActivity implements FSuperior.OnFragmentInteractionListener,
        FInferior.OnFragmentInteractionListener{

    FragmentTransaction fragmentTransaction, fragmentTransaction1;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.mnuIn:
                System.out.println("inicio");
                return true;

            case R.id.mnuClose:
                System.out.println("close");
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragments);
        FSuperior fSuperior = new FSuperior();
        FInferior fInferior = new FInferior();
        fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frameSup,fSuperior);
        fragmentTransaction.commit();
        fragmentTransaction1 = getSupportFragmentManager().beginTransaction();
        fragmentTransaction1.replace(R.id.frameInf,fInferior);
        fragmentTransaction1.commit();
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
