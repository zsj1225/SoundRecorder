package com.zsj.soundrecordertext.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zsj.soundrecordertext.R;

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
        return view;
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
