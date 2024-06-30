package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GProRobotImageInfo.class */
public final class GProRobotImageInfo {
    public String desc;
    public String url;

    public GProRobotImageInfo() {
        this.url = "";
        this.desc = "";
    }

    public String getDesc() {
        return this.desc;
    }

    public String getUrl() {
        return this.url;
    }

    public String toString() {
        return "GProRobotImageInfo{url=" + this.url + ",desc=" + this.desc + ",}";
    }

    public GProRobotImageInfo(String str, String str2) {
        this.url = "";
        this.desc = "";
        this.url = str;
        this.desc = str2;
    }
}
