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
public final class MarkdownElement {
    String content;

    public MarkdownElement() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93338, (short) 1);
        if (redirector != null) {
            redirector.redirect((short) 1, this);
        } else {
            this.content = "";
        }
    }

    public String getContent() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93338, (short) 3);
        return redirector != null ? (String) redirector.redirect((short) 3, this) : this.content;
    }

    public String toString() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93338, (short) 4);
        if (redirector != null) {
            return (String) redirector.redirect((short) 4, this);
        }
        return "MarkdownElement{content=" + this.content + ",}";
    }

    public MarkdownElement(String str) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93338, (short) 2);
        if (redirector != null) {
            redirector.redirect((short) 2, this, str);
            return;
        }
        this.content = "";
        this.content = str;
    }
}
