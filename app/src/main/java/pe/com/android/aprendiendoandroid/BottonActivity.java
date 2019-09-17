package pe.com.android.aprendiendoandroid;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import pe.com.android.aprendiendoandroid.fragmets.FragmentDos;
import pe.com.android.aprendiendoandroid.fragmets.FragmentUno;

public class BottonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.botton_layout);

        BottomNavigationView bottomNavegation=findViewById(R.id.bottomNavegation);

        bottomNavegation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                switch (menuItem.getItemId()){
                    case R.id.itemUno:
                        Fragment fragment_uno = new FragmentUno();
                        FragmentTransaction fragmentTransaction= getSupportFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.frame,fragment_uno,"Usuario");
                        fragmentTransaction.commit();
                        break;
                    case R.id.itemDos:
                        Fragment fragment_dos=new FragmentDos();
                        FragmentTransaction fragmentTransaction1= getSupportFragmentManager().beginTransaction();
                        fragmentTransaction1.replace(R.id.frame,fragment_dos,"Conctatos");
                        fragmentTransaction1.commit();
                        Toast.makeText(BottonActivity.this,
                                "MENÚ CONTACTOS",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.itemTres:
                        break;
                }

                return true;
            }
        });


    }


}
