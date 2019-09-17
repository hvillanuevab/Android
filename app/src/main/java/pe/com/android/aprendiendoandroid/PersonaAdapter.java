package pe.com.android.aprendiendoandroid;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import pe.com.android.aprendiendoandroid.beans.Persona;

public class PersonaAdapter  extends RecyclerView.Adapter<PersonaAdapter.PersonaItem> {

    private List<Persona> personaList;

    public PersonaAdapter(List<Persona> personaList) {
        this.personaList = personaList;
    }
    @NonNull
    @Override
    public PersonaItem onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemcard_persona,parent,false);
        return new PersonaItem(view);
    }
    @Override
    public void onBindViewHolder(@NonNull PersonaItem holder, int position) {
        Persona persona= personaList.get(position);
        holder.tvNombre.setText(persona.getNombre());
        holder.tvApellido.setText(persona.getApellido());
    }

    @Override
    public int getItemCount() {return personaList.size();}

    public class PersonaItem extends RecyclerView.ViewHolder{
        ImageView ivFoto;
        TextView tvNombre;
        TextView tvApellido;
        public PersonaItem(@NonNull View itemView) {
            super(itemView);
            ivFoto=itemView.findViewById(R.id.ivFoto);
            tvNombre=itemView.findViewById(R.id.tvNombre);
            tvApellido=itemView.findViewById(R.id.tvApellido);
        }
    }
}
