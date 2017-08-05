package com.zsj.soundrecordertext.bean;

/**
 * 创建者     朱胜军
 * 创建时间   2017/8/5 13:54
 * 描述	      ${TODO}
 * <p>
 * 更新者     $Author$
 * 更新时间   $Date$
 * 更新描述   ${TODO}
 */
public class RecordBean {
    private String recordName;
    private String recordAdded;
    private String recordLength;

    public RecordBean(String recordName, String recordAdded, String recordLength) {
        this.recordName = recordName;
        this.recordAdded = recordAdded;
        this.recordLength = recordLength;
    }

    public String getRecordName() {
        return recordName;
    }

    public void setRecordName(String recordName) {
        this.recordName = recordName;
    }

    public String getRecordAdded() {
        return recordAdded;
    }

    public void setRecordAdded(String recordAdded) {
        this.recordAdded = recordAdded;
    }

    public String getRecordLength() {
        return recordLength;
    }

    public void setRecordLength(String recordLength) {
        this.recordLength = recordLength;
    }
}
