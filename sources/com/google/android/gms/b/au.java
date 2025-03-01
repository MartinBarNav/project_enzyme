package com.google.android.gms.b;

import java.util.SortedSet;
import java.util.TreeSet;

final class au {
    private static final au d = new au();
    private SortedSet<a> a = new TreeSet();
    private StringBuilder b = new StringBuilder();
    private boolean c = false;

    public enum a {
        MAP_BUILDER_SET,
        MAP_BUILDER_SET_ALL,
        MAP_BUILDER_GET,
        MAP_BUILDER_SET_CAMPAIGN_PARAMS,
        BLANK_04,
        BLANK_05,
        BLANK_06,
        BLANK_07,
        BLANK_08,
        GET,
        SET,
        SEND,
        BLANK_12,
        BLANK_13,
        BLANK_14,
        BLANK_15,
        BLANK_16,
        BLANK_17,
        BLANK_18,
        BLANK_19,
        BLANK_20,
        BLANK_21,
        BLANK_22,
        BLANK_23,
        BLANK_24,
        BLANK_25,
        BLANK_26,
        BLANK_27,
        BLANK_28,
        BLANK_29,
        SET_EXCEPTION_PARSER,
        GET_EXCEPTION_PARSER,
        CONSTRUCT_TRANSACTION,
        CONSTRUCT_EXCEPTION,
        CONSTRUCT_RAW_EXCEPTION,
        CONSTRUCT_TIMING,
        CONSTRUCT_SOCIAL,
        BLANK_37,
        BLANK_38,
        GET_TRACKER,
        GET_DEFAULT_TRACKER,
        SET_DEFAULT_TRACKER,
        SET_APP_OPT_OUT,
        GET_APP_OPT_OUT,
        DISPATCH,
        SET_DISPATCH_PERIOD,
        BLANK_46,
        REPORT_UNCAUGHT_EXCEPTIONS,
        SET_AUTO_ACTIVITY_TRACKING,
        SET_SESSION_TIMEOUT,
        CONSTRUCT_EVENT,
        CONSTRUCT_ITEM,
        BLANK_52,
        BLANK_53,
        SET_DRY_RUN,
        GET_DRY_RUN,
        SET_LOGGER,
        SET_FORCE_LOCAL_DISPATCH,
        GET_TRACKER_NAME,
        CLOSE_TRACKER,
        EASY_TRACKER_ACTIVITY_START,
        EASY_TRACKER_ACTIVITY_STOP,
        CONSTRUCT_APP_VIEW
    }

    private au() {
    }

    public static au a() {
        return d;
    }

    public final synchronized void a(a aVar) {
        if (!this.c) {
            this.a.add(aVar);
            this.b.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_".charAt(aVar.ordinal()));
        }
    }

    public final synchronized void a(boolean z) {
        this.c = z;
    }

    public final synchronized String b() {
        StringBuilder sb;
        sb = new StringBuilder();
        int i = 6;
        int i2 = 0;
        while (this.a.size() > 0) {
            a first = this.a.first();
            this.a.remove(first);
            int ordinal = first.ordinal();
            while (ordinal >= i) {
                sb.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_".charAt(i2));
                i += 6;
                i2 = 0;
            }
            i2 += 1 << (first.ordinal() % 6);
        }
        if (i2 > 0 || sb.length() == 0) {
            sb.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_".charAt(i2));
        }
        this.a.clear();
        return sb.toString();
    }

    public final synchronized String c() {
        String sb;
        if (this.b.length() > 0) {
            this.b.insert(0, ".");
        }
        sb = this.b.toString();
        this.b = new StringBuilder();
        return sb;
    }
}
