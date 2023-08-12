package com.teamaurora.template.core;

import com.teamaurora.borealib.api.base.v1.modloading.ModLoaderService;

public class Template implements ModLoaderService {

    public static final String MOD_ID = "template";

    @Override
    public String id() {
        return MOD_ID;
    }
}
