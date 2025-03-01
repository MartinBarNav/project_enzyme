// 
// Decompiled by Procyon v0.5.36
// 

package com.saterskog.b;

import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import android.graphics.Bitmap;
import android.opengl.GLUtils;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory$Options;
import java.io.IOException;
import java.util.Locale;
import android.content.Context;
import android.opengl.GLES20;

public final class c
{
    private static int a(int n, final String s) {
        final int n2 = 0;
        final int glCreateShader = GLES20.glCreateShader(n);
        if (glCreateShader == 0) {
            a.a("Could not _create_ shader " + n + ":");
            return glCreateShader;
        }
        GLES20.glShaderSource(glCreateShader, s);
        GLES20.glCompileShader(glCreateShader);
        final int[] array = { 0 };
        GLES20.glGetShaderiv(glCreateShader, 35713, array, 0);
        if (array[0] != 0) {
            return glCreateShader;
        }
        a.a("Could not compile shader " + n + ":");
        a.a("Log: " + GLES20.glGetShaderInfoLog(glCreateShader));
        GLES20.glDeleteShader(glCreateShader);
        n = n2;
        return n;
        n = glCreateShader;
        return n;
    }
    
    public static int a(final Context context, int a, int n) {
        int glCreateProgram = -1;
        final String string = "vert: " + context.getResources().getResourceEntryName(a) + ", frag: " + context.getResources().getResourceEntryName(n) + ": ";
        while (true) {
            try {
                final int a2 = a(35633, a(context, a));
                new StringBuilder().append(string).append("Compile vertex");
                a = a(35632, a(context, n));
                new StringBuilder().append(string).append("Compile fragment");
                n = a2;
                if ("".length() > 2 && !"".toLowerCase(Locale.ENGLISH).equals("compiled")) {
                    a.a(string + "vertex shader log: " + "");
                }
                if ("".length() > 2 && !"".toLowerCase(Locale.ENGLISH).equals("compiled")) {
                    a.a(string + "fragment shader log: " + "");
                }
                glCreateProgram = GLES20.glCreateProgram();
                GLES20.glAttachShader(glCreateProgram, n);
                GLES20.glAttachShader(glCreateProgram, a);
                GLES20.glLinkProgram(glCreateProgram);
                if ("".length() > 2) {
                    a.a(string + "shader link log: " + "");
                }
                new StringBuilder().append(string).append("link shaders");
                return glCreateProgram;
            }
            catch (IOException ex) {
                ex.printStackTrace();
                n = -1;
                a = glCreateProgram;
                continue;
            }
            break;
        }
    }
    
    public static int a(final Context context, final int n, final boolean b) {
        final int[] array = { 0 };
        GLES20.glGenTextures(1, array, 0);
        if (array[0] != 0) {
            final BitmapFactory$Options bitmapFactory$Options = new BitmapFactory$Options();
            bitmapFactory$Options.inScaled = false;
            final Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), n, bitmapFactory$Options);
            GLES20.glBindTexture(3553, array[0]);
            GLES20.glTexParameteri(3553, 10241, 9728);
            GLES20.glTexParameteri(3553, 10240, 9729);
            if (b) {
                GLES20.glTexParameteri(3553, 10242, 33071);
                GLES20.glTexParameteri(3553, 10243, 33071);
            }
            GLUtils.texImage2D(3553, 0, decodeResource, 0);
            decodeResource.recycle();
        }
        if (array[0] == 0) {
            throw new RuntimeException("Error loading texture.");
        }
        return array[0];
    }
    
    private static String a(final Context context, final int n) {
        final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getResources().openRawResource(n)));
        final StringBuilder sb = new StringBuilder();
        while (true) {
            final String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            sb.append(line);
            sb.append('\n');
        }
        return sb.toString();
    }
}
