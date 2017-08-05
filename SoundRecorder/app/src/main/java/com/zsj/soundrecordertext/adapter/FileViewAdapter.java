package com.zsj.soundrecordertext.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.zsj.soundrecordertext.R;

import java.util.ArrayList;

/**
 * 创建者     朱胜军
 * 创建时间   2017/8/5 12:19
 * 描述	      ${TODO}
 * <p>
 * 更新者     $Author$
 * 更新时间   $Date$
 * 更新描述   ${TODO}
 */
public class FileViewAdapter extends RecyclerView.Adapter<FileViewAdapter.MyViewHolder> {

    private ArrayList mData;

    public FileViewAdapter(ArrayList data) {
        this.mData = data;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view, parent, false);
        MyViewHolder viewHolder = new MyViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private final TextView mTvAdd;
        private TextView mTvLength;
        private TextView mTvName;

        public MyViewHolder(View itemView) {
            super(itemView);
            mTvName = (TextView) itemView.findViewById(R.id.file_name_text);
            mTvLength = (TextView) itemView.findViewById(R.id.file_length_text);
            mTvAdd = (TextView) itemView.findViewById(R.id.file_date_added_text);

        }
    }
}
