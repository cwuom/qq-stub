package QQService;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

/* compiled from: P */
/* loaded from: classes.dex */
public final class ReqGetFace extends JceStruct {
    static ReqHead cache_stHeader;
    static UserCntlData cache_stUserData;
    public int iPageSize;
    public long lUIN;
    public ReqHead stHeader;
    public UserCntlData stUserData;

    public ReqGetFace() {
        throw new RuntimeException("stub");
    }

    @Override // com.qq.taf.jce.JceStruct
    public void readFrom(JceInputStream jceInputStream) {
        throw new RuntimeException("stub");
    }

    @Override // com.qq.taf.jce.JceStruct
    public void writeTo(JceOutputStream jceOutputStream) {
        throw new RuntimeException("stub");
    }

    public ReqGetFace(ReqHead reqHead, long j2, UserCntlData userCntlData, int i2) {
        throw new RuntimeException("stub");
    }
}
