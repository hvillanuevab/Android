package pe.com.android.aprendiendoandroid.fragmets;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import pe.com.android.aprendiendoandroid.PersonaAdapter;
import pe.com.android.aprendiendoandroid.R;
import pe.com.android.aprendiendoandroid.beans.Persona;

public class FragmentDos extends Fragment {

    List<Persona> personaList;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_dos,
                container,false);

        RecyclerView rvLista = view.findViewById(R.id.rvLista);

        RecyclerView.LayoutManager manager= new GridLayoutManager(getActivity(),1);
        rvLista.setLayoutManager(manager);

        inicializar();

        rvLista.setAdapter(new PersonaAdapter(personaList));
        return view;
    }

    private void inicializar(){
        personaList=new ArrayList<>();

        for (int i = 0; i <40 ; i++) {
            personaList.add(new Persona(i+1,"persona "+(i+1),"apellido",""));

        }


    }
}
