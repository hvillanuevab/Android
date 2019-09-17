package pe.com.android.aprendiendoandroid.fragmets;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import pe.com.android.aprendiendoandroid.R;

public class FragmentUno extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

           View view=inflater.inflate(R.layout.fragmet_uno,
                   container,false);
        return view;
    }
}
