package com.example.mayankchauhan.citygallery.FirstRecycler;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mayankchauhan.citygallery.Ahmedabad.AhmedabadMain;
import com.example.mayankchauhan.citygallery.Banglore.BangloreMain;
import com.example.mayankchauhan.citygallery.Camera.CameraMain;
import com.example.mayankchauhan.citygallery.Chennai.ChennaiMain;
import com.example.mayankchauhan.citygallery.Delhi.DelhiMain;
import com.example.mayankchauhan.citygallery.Hyderabad.HyderabadMain;
import com.example.mayankchauhan.citygallery.Kolkata.KolkataMain;
import com.example.mayankchauhan.citygallery.Lucknow.LucknowMain;
import com.example.mayankchauhan.citygallery.Mumbai.MumbaiMain;
import com.example.mayankchauhan.citygallery.R;

import java.util.List;

/**
 * Created by mayankchauhan on 31/01/17.
 */

public class RecyclerAdapterCity extends RecyclerView.Adapter<RecyclerAdapterCity.VHolder> {

    private List<CityList> listdata;
    private LayoutInflater inflater;
    Context c;

    public RecyclerAdapterCity(List<CityList> listdata, Context c) {
        this.listdata = listdata;
        this.inflater = LayoutInflater.from(c);
        this.c = c;
    }

    @Override
    public VHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.single_row,parent,false);
        VHolder vh = new VHolder(view,c,listdata);
        return vh;
    }

    @Override
    public void onBindViewHolder(VHolder holder, int position) {

        CityList list = listdata.get(position);
        holder.imageView.setImageResource(list.getImgres());
        holder.textView.setText(list.getCityname());
    }

    @Override
    public int getItemCount()
    {
        return listdata.size();
    }

    public static class VHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private TextView textView;
        private ImageView imageView;
        private View container;
        Context ctx;
        List<CityList> listd;

        public VHolder(View itemView,Context ctx,List<CityList> listd) {
            super(itemView);

            this.listd = listd;
            this.ctx = ctx;
            itemView.setOnClickListener(this);
            textView = (TextView) itemView.findViewById(R.id.textView);
            imageView = (ImageView) itemView.findViewById(R.id.imageView);
            container = itemView.findViewById(R.id.root_item);
        }

        @Override
        public void onClick(View v) {

            Intent intent;
            int position = getAdapterPosition();
            switch (position){
                case 0:
                     intent = new Intent(this.ctx, DelhiMain.class);
                    this.ctx.startActivity(intent);
                    break;
                case 1:
                    intent = new Intent(this.ctx, MumbaiMain.class);
                    this.ctx.startActivity(intent);
                    break;
                case 2:
                    intent = new Intent(this.ctx, ChennaiMain.class);
                    this.ctx.startActivity(intent);
                    break;
                case 3:
                     intent = new Intent(this.ctx, BangloreMain.class);
                    this.ctx.startActivity(intent);
                    break;
                case 4:
                     intent = new Intent(this.ctx, KolkataMain.class);
                    this.ctx.startActivity(intent);
                    break;
                case 5:
                     intent = new Intent(this.ctx, AhmedabadMain.class);
                    this.ctx.startActivity(intent);
                    break;
                case 6:
                     intent = new Intent(this.ctx, LucknowMain.class);
                    this.ctx.startActivity(intent);
                    break;
                case 7:
                     intent = new Intent(this.ctx, HyderabadMain.class);
                    this.ctx.startActivity(intent);
                    break;
                case 8:
                    intent = new Intent(this.ctx, CameraMain.class);
                    this.ctx.startActivity(intent);
                    break;
                default:
                    break;
            }
        }
    }
}
