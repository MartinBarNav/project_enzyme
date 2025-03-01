package com.saterskog.b;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public final class c {
    public static int a(Context context, int i, boolean z) {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        if (iArr[0] != 0) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inScaled = false;
            Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), i, options);
            GLES20.glBindTexture(3553, iArr[0]);
            GLES20.glTexParameteri(3553, 10241, 9728);
            GLES20.glTexParameteri(3553, 10240, 9729);
            if (z) {
                GLES20.glTexParameteri(3553, 10242, 33071);
                GLES20.glTexParameteri(3553, 10243, 33071);
            }
            GLUtils.texImage2D(3553, 0, decodeResource, 0);
            decodeResource.recycle();
        }
        if (iArr[0] != 0) {
            return iArr[0];
        }
        throw new RuntimeException("Error loading texture.");
    }

    private static String a(Context context, int i) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getResources().openRawResource(i)));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return sb.toString();
            }
            sb.append(readLine);
            sb.append(10);
        }
    }

    private static int a(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        if (glCreateShader != 0) {
            GLES20.glShaderSource(glCreateShader, str);
            GLES20.glCompileShader(glCreateShader);
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
            if (iArr[0] == 0) {
                a.a("Could not compile shader " + i + ":");
                a.a("Log: " + GLES20.glGetShaderInfoLog(glCreateShader));
                GLES20.glDeleteShader(glCreateShader);
                return 0;
            }
        } else {
            a.a("Could not _create_ shader " + i + ":");
        }
        return glCreateShader;
    }

    public static int a(Context context, int i, int i2) {
        int i3;
        int i4 = -1;
        String str = "vert: " + context.getResources().getResourceEntryName(i) + ", frag: " + context.getResources().getResourceEntryName(i2) + ": ";
        try {
            i3 = a(35633, a(context, i));
            new StringBuilder().append(str).append("Compile vertex");
            int a = a(35632, a(context, i2));
            new StringBuilder().append(str).append("Compile fragment");
            i4 = a;
        } catch (IOException e) {
            e.printStackTrace();
            i3 = -1;
        }
        if ("".length() > 2 && !"".toLowerCase(Locale.ENGLISH).equals("compiled")) {
            a.a(str + "vertex shader log: " + "");
        }
        if ("".length() > 2 && !"".toLowerCase(Locale.ENGLISH).equals("compiled")) {
            a.a(str + "fragment shader log: " + "");
        }
        int glCreateProgram = GLES20.glCreateProgram();
        GLES20.glAttachShader(glCreateProgram, i3);
        GLES20.glAttachShader(glCreateProgram, i4);
        GLES20.glLinkProgram(glCreateProgram);
        if ("".length() > 2) {
            a.a(str + "shader link log: " + "");
        }
        new StringBuilder().append(str).append("link shaders");
        return glCreateProgram;
    }
}
