package com.example.mayankchauhan.citygallery.OnClickFamousView;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mayankchauhan.citygallery.R;

import java.util.List;

/**
 * Created by mayankchauhan on 01/02/17.
 */

public class FamousRecycler extends RecyclerView.Adapter<FamousRecycler.ViHolder> {

    private LayoutInflater inflater;
    private List<FamousPlacesList> listdata;

    public FamousRecycler(List<FamousPlacesList> listdata, Context c) {
        this.listdata = listdata;
        inflater = LayoutInflater.from(c);
    }

    @Override
    public ViHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.famous_layout,parent,false);
        return new ViHolder(view);
    }

    @Override
    public void onBindViewHolder(ViHolder holder, int position) {

        FamousPlacesList l = listdata.get(position);
        holder.textt.setText(l.getTitle());
        holder.textd.setText(l.getDescription());
        holder.imv.setImageResource(l.getImg());
    }

    @Override
    public int getItemCount() {
        return listdata.size();
    }

    static class ViHolder extends RecyclerView.ViewHolder {

        private TextView textt;
        private TextView textd;
        private ImageView imv;

        public ViHolder(View itemView) {
            super(itemView);

            textt = (TextView) itemView.findViewById(R.id.textt);
            textd = (TextView) itemView.findViewById(R.id.textd);
            imv = (ImageView) itemView.findViewById(R.id.imv);
        }
    }
}
