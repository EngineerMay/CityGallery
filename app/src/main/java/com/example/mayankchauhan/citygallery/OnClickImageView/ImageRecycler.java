package com.example.mayankchauhan.citygallery.OnClickImageView;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.mayankchauhan.citygallery.R;

import java.util.List;

/**
 * Created by mayankchauhan on 01/02/17.
 */

public class ImageRecycler extends RecyclerView.Adapter<ImageRecycler.ViewHold> {

    private LayoutInflater inflater;
    private List<ImageList> listdata;

    public ImageRecycler(List<ImageList> listdata, Context c) {
        this.listdata = listdata;
        inflater = LayoutInflater.from(c);
    }

    @Override
    public ViewHold onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.image_layout,parent,false);

        return new ViewHold(view);
    }

    @Override
    public void onBindViewHolder(ViewHold holder, int position) {

        ImageList l = listdata.get(position);
        holder.imageView.setImageResource(l.getImgages());

    }

    @Override
    public int getItemCount() {
        return listdata.size();
    }

    static class ViewHold extends RecyclerView.ViewHolder {

        private ImageView imageView;
        public ViewHold(View itemView) {
            super(itemView);

            imageView = (ImageView) itemView.findViewById(R.id.image_lay);
        }
    }
}
