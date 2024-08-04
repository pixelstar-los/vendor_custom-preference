/*
 * Copyright (C) 2020 crDroid Android Project
 * SPDX-License-Identifier: Apache-2.0
 */

package com.android.settings.custom.colorpicker;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.provider.Settings;

import com.everest.support.preferences.SystemSettingsStore;

public class SystemSettingColorPickerPreference extends ColorPickerPreference {

    public SystemSettingColorPickerPreference(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        setPreferenceDataStore(new SystemSettingsStore(context.getContentResolver()));
    }

    public SystemSettingColorPickerPreference(Context context, AttributeSet attrs) {
        super(context, attrs);
        setPreferenceDataStore(new SystemSettingsStore(context.getContentResolver()));
    }

    public SystemSettingColorPickerPreference(Context context) {
        super(context, null);
        setPreferenceDataStore(new SystemSettingsStore(context.getContentResolver()));
    }
}
