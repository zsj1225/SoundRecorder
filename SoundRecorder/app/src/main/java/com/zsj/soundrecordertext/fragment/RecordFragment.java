package com.zsj.soundrecordertext.fragment;

import android.os.Bundle;
import android.os.SystemClock;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Chronometer;
import android.widget.TextView;
import android.widget.Toast;

import com.melnykov.fab.FloatingActionButton;
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
public class RecordFragment extends Fragment implements View.OnClickListener {
    private static final String ARG_POSITION = "ARG_POSITION";
    private int position;
    private FloatingActionButton mBtnRecord;
    private boolean startRecord = true;
    private Chronometer mChronometer;
    private TextView mTvRecordStatus;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        position = arguments.getInt(ARG_POSITION);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_recorder, container, false);

        mBtnRecord = (FloatingActionButton) view.findViewById(R.id.btnRecord);
        mChronometer = (Chronometer) view.findViewById(R.id.chronometer);
        mTvRecordStatus = (TextView) view.findViewById(R.id.recording_status_text);

        mBtnRecord.setOnClickListener(this);


        return view;
    }

    public static RecordFragment newInstance(int position) {
        RecordFragment recorderFragment = new RecordFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(ARG_POSITION, position);
        recorderFragment.setArguments(bundle);
        return recorderFragment;
    }

    public RecordFragment() {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnRecord:
                startRecord(startRecord);
                startRecord = !startRecord;
                break;

            default:
                break;
        }
    }

    private void startRecord(boolean startRecord) {
        if (startRecord) {
            //开始录音
            mBtnRecord.setImageResource(R.drawable.ic_media_stop);
            Toast.makeText(getActivity(), R.string.start_record, Toast.LENGTH_SHORT).show();

            //计时器开始计时
            //复位
            mChronometer.setBase(SystemClock.elapsedRealtime());
            mChronometer.start();

            //改成录音中的状态
            mTvRecordStatus.setText(R.string.recording);

        } else {
            //停止录音
            mBtnRecord.setImageResource(R.drawable.ic_mic_white_36dp);
            Toast.makeText(getActivity(), R.string.stop_record, Toast.LENGTH_SHORT).show();

            //计时器停止计时
            //复位
            mChronometer.setBase(SystemClock.elapsedRealtime());
            mChronometer.stop();

            //改成按下按钮开始录音
            mTvRecordStatus.setText(R.string.record_prompt);
        }
    }
}
