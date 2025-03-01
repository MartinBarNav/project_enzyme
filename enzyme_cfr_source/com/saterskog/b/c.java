/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.Bitmap
 *  android.graphics.BitmapFactory
 *  android.graphics.BitmapFactory$Options
 *  android.opengl.GLES20
 *  android.opengl.GLUtils
 */
package com.saterskog.b;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import com.saterskog.b.a;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public final class c {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static int a(int n2, String object) {
        int n3 = 0;
        int n4 = GLES20.glCreateShader((int)n2);
        if (n4 != 0) {
            GLES20.glShaderSource((int)n4, (String)object);
            GLES20.glCompileShader((int)n4);
            object = new int[1];
            GLES20.glGetShaderiv((int)n4, (int)35713, (int[])object, (int)0);
            if (object[0] != false) return n4;
            a.a("Could not compile shader " + n2 + ":");
            a.a("Log: " + GLES20.glGetShaderInfoLog((int)n4));
            GLES20.glDeleteShader((int)n4);
            return n3;
        }
        a.a("Could not _create_ shader " + n2 + ":");
        return n4;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static int a(Context object, int n2, int n3) {
        int n4 = -1;
        String string = "vert: " + object.getResources().getResourceEntryName(n2) + ", frag: " + object.getResources().getResourceEntryName(n3) + ": ";
        try {
            int n5 = c.a(35633, c.a((Context)object, n2));
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string).append("Compile vertex");
            n2 = c.a(35632, c.a((Context)object, n3));
            object = new StringBuilder();
            ((StringBuilder)object).append(string).append("Compile fragment");
            n3 = n5;
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            n3 = -1;
            n2 = n4;
        }
        if ("".length() > 2 && !"".toLowerCase(Locale.ENGLISH).equals("compiled")) {
            a.a(string + "vertex shader log: " + "");
        }
        if ("".length() > 2 && !"".toLowerCase(Locale.ENGLISH).equals("compiled")) {
            a.a(string + "fragment shader log: " + "");
        }
        n4 = GLES20.glCreateProgram();
        GLES20.glAttachShader((int)n4, (int)n3);
        GLES20.glAttachShader((int)n4, (int)n2);
        GLES20.glLinkProgram((int)n4);
        if ("".length() > 2) {
            a.a(string + "shader link log: " + "");
        }
        new StringBuilder().append(string).append("link shaders");
        return n4;
    }

    public static int a(Context context, int n2, boolean bl) {
        int[] arrn = new int[1];
        GLES20.glGenTextures((int)1, (int[])arrn, (int)0);
        if (arrn[0] != 0) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inScaled = false;
            context = BitmapFactory.decodeResource((Resources)context.getResources(), (int)n2, (BitmapFactory.Options)options);
            GLES20.glBindTexture((int)3553, (int)arrn[0]);
            GLES20.glTexParameteri((int)3553, (int)10241, (int)9728);
            GLES20.glTexParameteri((int)3553, (int)10240, (int)9729);
            if (bl) {
                GLES20.glTexParameteri((int)3553, (int)10242, (int)33071);
                GLES20.glTexParameteri((int)3553, (int)10243, (int)33071);
            }
            GLUtils.texImage2D((int)3553, (int)0, (Bitmap)context, (int)0);
            context.recycle();
        }
        if (arrn[0] == 0) {
            throw new RuntimeException("Error loading texture.");
        }
        return arrn[0];
    }

    private static String a(Context object, int n2) {
        String string;
        object = new BufferedReader(new InputStreamReader(object.getResources().openRawResource(n2)));
        StringBuilder stringBuilder = new StringBuilder();
        while ((string = ((BufferedReader)object).readLine()) != null) {
            stringBuilder.append(string);
            stringBuilder.append('\n');
        }
        return stringBuilder.toString();
    }
}

