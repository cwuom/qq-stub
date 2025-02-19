/*
 * QAuxiliary - An Xposed module for QQ/TIM
 * Copyright (C) 2019-2023 QAuxiliary developers
 * https://github.com/cinit/QAuxiliary
 *
 * This software is non-free but opensource software: you can redistribute it
 * and/or modify it under the terms of the GNU Affero General Public License
 * as published by the Free Software Foundation; either
 * version 3 of the License, or any later version and our eula as published
 * by QAuxiliary contributors.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * and eula along with this software.  If not, see
 * <https://www.gnu.org/licenses/>
 * <https://github.com/cinit/QAuxiliary/blob/master/LICENSE.md>.
 */

package com.tencent.qqnt.kernel.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.mobileqq.qfix.redirect.PatchRedirectCenter;

/* compiled from: P */
/* loaded from: classes2.dex */
public final class MsgAttributeInfo {
    long attrId;
    int attrType;
    TempChatGameSession gameChatSession;
    GroupHonor groupHonor;
    KingHonor kingHonor;
    PublicAccountAttrs publicAccountAttrs;
    SharedMsgInfo sharedMsgInfo;
    UinInfoAttr uinInfoAttr;
    VASMsgElement vasMsgInfo;
    VASAIOPersonalElement vasPersonalInfo;

    public MsgAttributeInfo() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93552, (short) 1);
        if (redirector != null) {
            redirector.redirect((short) 1, this);
        }
    }

    public long getAttrId() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93552, (short) 4);
        return redirector != null ? ((Long) redirector.redirect((short) 4, this)).longValue() : this.attrId;
    }

    public int getAttrType() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93552, (short) 3);
        return redirector != null ? ((Integer) redirector.redirect((short) 3, this)).intValue() : this.attrType;
    }

    public TempChatGameSession getGameChatSession() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93552, (short) 11);
        return redirector != null ? (TempChatGameSession) redirector.redirect((short) 11, this) : this.gameChatSession;
    }

    public GroupHonor getGroupHonor() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93552, (short) 7);
        return redirector != null ? (GroupHonor) redirector.redirect((short) 7, this) : this.groupHonor;
    }

    public KingHonor getKingHonor() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93552, (short) 8);
        return redirector != null ? (KingHonor) redirector.redirect((short) 8, this) : this.kingHonor;
    }

    public PublicAccountAttrs getPublicAccountAttrs() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93552, (short) 9);
        return redirector != null ? (PublicAccountAttrs) redirector.redirect((short) 9, this) : this.publicAccountAttrs;
    }

    public SharedMsgInfo getSharedMsgInfo() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93552, (short) 10);
        return redirector != null ? (SharedMsgInfo) redirector.redirect((short) 10, this) : this.sharedMsgInfo;
    }

    public UinInfoAttr getUinInfoAttr() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93552, (short) 12);
        return redirector != null ? (UinInfoAttr) redirector.redirect((short) 12, this) : this.uinInfoAttr;
    }

    public VASMsgElement getVasMsgInfo() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93552, (short) 5);
        return redirector != null ? (VASMsgElement) redirector.redirect((short) 5, this) : this.vasMsgInfo;
    }

    public VASAIOPersonalElement getVasPersonalInfo() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93552, (short) 6);
        return redirector != null ? (VASAIOPersonalElement) redirector.redirect((short) 6, this) : this.vasPersonalInfo;
    }

    public String toString() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93552, (short) 13);
        if (redirector != null) {
            return (String) redirector.redirect((short) 13, this);
        }
        return "MsgAttributeInfo{attrType=" + this.attrType + ",attrId=" + this.attrId + ",vasMsgInfo=" + this.vasMsgInfo + ",vasPersonalInfo=" + this.vasPersonalInfo + ",groupHonor=" + this.groupHonor + ",kingHonor=" + this.kingHonor + ",publicAccountAttrs=" + this.publicAccountAttrs + ",sharedMsgInfo=" + this.sharedMsgInfo + ",gameChatSession=" + this.gameChatSession + ",uinInfoAttr=" + this.uinInfoAttr + ",}";
    }

    // For QQ 8.9.63
    public MsgAttributeInfo(int attrType, long attrId, VASMsgElement vASMsgElement, VASAIOPersonalElement vASAIOPersonalElement, GroupHonor groupHonor, KingHonor kingHonor, PublicAccountAttrs publicAccountAttrs, SharedMsgInfo sharedMsgInfo, TempChatGameSession tempChatGameSession, UinInfoAttr uinInfoAttr, LongMsgAttr longMsgAttr) {}

    // For QQ 8.9.68
    public MsgAttributeInfo(int attrType, long attrId, VASMsgElement vASMsgElement, VASAIOPersonalElement vASAIOPersonalElement, GroupHonor groupHonor, KingHonor kingHonor, PublicAccountAttrs publicAccountAttrs, SharedMsgInfo sharedMsgInfo, TempChatGameSession tempChatGameSession, UinInfoAttr uinInfoAttr, LongMsgAttr longMsgAttr, RobotMsgExt robotMsgExt) {}

    // For QQ 8.9.70
    public MsgAttributeInfo(int attrType, long attrId, VASMsgElement vASMsgElement, VASAIOPersonalElement vASAIOPersonalElement, GroupHonor groupHonor, KingHonor kingHonor, PublicAccountAttrs publicAccountAttrs, SharedMsgInfo sharedMsgInfo, TempChatGameSession tempChatGameSession, UinInfoAttr uinInfoAttr, LongMsgAttr longMsgAttr, RobotMsgExt robotMsgExt, ZPlanMsgElement zPlanMsgElement) {}

}
