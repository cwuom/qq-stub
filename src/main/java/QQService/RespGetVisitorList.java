package QQService;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: P */
/* loaded from: classes.dex */
public final class RespGetVisitorList extends JceStruct {
    static RespHead cache_stHeader;
    static UserCntlData cache_stUserData;
    static ArrayList<UserProfile> cache_vEncounterInfos;
    public long RespTime;
    public RespHead stHeader;
    public UserCntlData stUserData;
    public ArrayList<UserProfile> vEncounterInfos;

    public RespGetVisitorList() {
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

    public RespGetVisitorList(RespHead respHead, long j2, ArrayList<UserProfile> arrayList, UserCntlData userCntlData) {
        throw new RuntimeException("stub");
    }
}
