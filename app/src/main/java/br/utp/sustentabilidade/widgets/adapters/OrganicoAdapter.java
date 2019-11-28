package br.utp.sustentabilidade.widgets.adapters;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import br.utp.sustentabilidade.databinding.ItemOrganicoBinding;
import br.utp.sustentabilidade.models.Organico;

public class OrganicoAdapter extends RecyclerView.Adapter<OrganicoAdapter.OrganicoViewHolder> {

    private final List<Organico> mOrganicos;

    public OrganicoAdapter(List<Organico> organicos) {
        mOrganicos = organicos;
    }

    @NonNull
    @Override
    public OrganicoViewHolder onCreateViewHolder(@NonNull final ViewGroup parent, final int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        ItemOrganicoBinding binding = ItemOrganicoBinding.inflate(layoutInflater, parent, false);
        return new OrganicoViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull final OrganicoViewHolder holder, final int position) {
        holder.bind(mOrganicos.get(position));
    }

    @Override
    public int getItemCount() {
        return mOrganicos.size();
    }

    /**
     * Armazena os dados da view.
     */
    class OrganicoViewHolder extends RecyclerView.ViewHolder {

        private final ItemOrganicoBinding mBinding;

        public OrganicoViewHolder(final ItemOrganicoBinding binding) {
            super(binding.getRoot());
            mBinding = binding;
        }

        public void bind(final Organico organico) {
            mBinding.setOrganico(organico);

            // TODO: Exibir foto

            // TODO: Amarrar eventos
        }
    }
}
