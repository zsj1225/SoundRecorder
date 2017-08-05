package com.zsj.soundrecordertext.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zsj.soundrecordertext.R;
import com.zsj.soundrecordertext.adapter.FileViewAdapter;
import com.zsj.soundrecordertext.bean.RecordBean;

import java.util.ArrayList;

/**
 * 创建者     朱胜军
 * 创建时间   2017/8/4 23:36
 * 描述	      ${TODO}
 * <p>
 * 更新者     $Author$
 * 更新时间   $Date$
 * 更新描述   ${TODO}
 */
public class FileViewerFragment extends Fragment {
    private static final String ARG_POSITION = "ARG_POSITION";
    private int position;
    private RecyclerView mRecyclerView;
    private ArrayList<RecordBean> mData = new ArrayList<>();

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        position = arguments.getInt(ARG_POSITION);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_recorder_file, container, false);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        initData();
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        mRecyclerView.setAdapter(new FileViewAdapter(mData));
        return view;
    }


    private void initData() {
        for (int i = 0; i < 10; i++) {
            mData.add(new RecordBean("录音文件" + i, "2017-8-5", "1M"));
        }
    }

    public static FileViewerFragment newInstance(int position) {
        FileViewerFragment recorderFragment = new FileViewerFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(ARG_POSITION, position);
        recorderFragment.setArguments(bundle);
        return recorderFragment;
    }

    public FileViewerFragment() {

    }

}
