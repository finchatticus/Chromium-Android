
// Copyright 2017 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../chrome/browser/vr/ui_unsupported_mode.h

package org.chromium.chrome.browser.vr_shell;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    UiUnsupportedMode.UNHANDLED_CODE_POINT, UiUnsupportedMode.COULD_NOT_ELIDE_URL,
    UiUnsupportedMode.UNHANDLED_PAGE_INFO, UiUnsupportedMode.URL_WITH_STRONG_RTL_CHARS,
    UiUnsupportedMode.COUNT
})
@Retention(RetentionPolicy.SOURCE)
public @interface UiUnsupportedMode {
  int UNHANDLED_CODE_POINT = 0;
  int COULD_NOT_ELIDE_URL = 1;
  int UNHANDLED_PAGE_INFO = 2;
  int URL_WITH_STRONG_RTL_CHARS = 3;
  /**
   * This must be last.
   */
  int COUNT = 4;
}
