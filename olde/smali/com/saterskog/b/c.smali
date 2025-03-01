.class public final Lcom/saterskog/b/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private static a(ILjava/lang/String;)I
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 83
    invoke-static {p0}, Landroid/opengl/GLES20;->glCreateShader(I)I

    move-result v1

    .line 84
    if-eqz v1, :cond_0

    .line 85
    invoke-static {v1, p1}, Landroid/opengl/GLES20;->glShaderSource(ILjava/lang/String;)V

    .line 86
    invoke-static {v1}, Landroid/opengl/GLES20;->glCompileShader(I)V

    .line 87
    const/4 v2, 0x1

    new-array v2, v2, [I

    .line 88
    const v3, 0x8b81

    invoke-static {v1, v3, v2, v0}, Landroid/opengl/GLES20;->glGetShaderiv(II[II)V

    .line 89
    aget v2, v2, v0

    if-nez v2, :cond_1

    .line 90
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Could not compile shader "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ":"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/saterskog/b/a;->a(Ljava/lang/String;)V

    .line 91
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Log: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, Landroid/opengl/GLES20;->glGetShaderInfoLog(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/saterskog/b/a;->a(Ljava/lang/String;)V

    .line 92
    invoke-static {v1}, Landroid/opengl/GLES20;->glDeleteShader(I)V

    .line 98
    :goto_0
    return v0

    .line 97
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Could not _create_ shader "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ":"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/saterskog/b/a;->a(Ljava/lang/String;)V

    :cond_1
    move v0, v1

    goto :goto_0
.end method

.method public static a(Landroid/content/Context;II)I
    .locals 7

    .prologue
    const/4 v1, -0x1

    const/4 v6, 0x2

    .line 102
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "vert: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, p1}, Landroid/content/res/Resources;->getResourceEntryName(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ", frag: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, p2}, Landroid/content/res/Resources;->getResourceEntryName(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ": "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 104
    const v0, 0x8b31

    .line 105
    :try_start_0
    invoke-static {p0, p1}, Lcom/saterskog/b/c;->a(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v2

    .line 104
    invoke-static {v0, v2}, Lcom/saterskog/b/c;->a(ILjava/lang/String;)I

    move-result v0

    .line 106
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, "Compile vertex"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    const v2, 0x8b30

    .line 108
    invoke-static {p0, p2}, Lcom/saterskog/b/c;->a(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v4

    .line 107
    invoke-static {v2, v4}, Lcom/saterskog/b/c;->a(ILjava/lang/String;)I

    move-result v2

    .line 109
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "Compile fragment"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move v1, v2

    .line 116
    :goto_0
    const-string v2, ""

    .line 117
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v4

    if-le v4, v6, :cond_0

    sget-object v4, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {v2, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "compiled"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    .line 118
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "vertex shader log: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/saterskog/b/a;->a(Ljava/lang/String;)V

    .line 120
    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v4

    if-le v4, v6, :cond_1

    sget-object v4, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {v2, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "compiled"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    .line 121
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "fragment shader log: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/saterskog/b/a;->a(Ljava/lang/String;)V

    .line 123
    :cond_1
    invoke-static {}, Landroid/opengl/GLES20;->glCreateProgram()I

    move-result v4

    .line 124
    invoke-static {v4, v0}, Landroid/opengl/GLES20;->glAttachShader(II)V

    .line 126
    invoke-static {v4, v1}, Landroid/opengl/GLES20;->glAttachShader(II)V

    .line 128
    invoke-static {v4}, Landroid/opengl/GLES20;->glLinkProgram(I)V

    .line 131
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v0

    if-le v0, v6, :cond_2

    .line 132
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "shader link log: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/saterskog/b/a;->a(Ljava/lang/String;)V

    .line 133
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "link shaders"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    return v4

    .line 112
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    move v0, v1

    .line 114
    goto/16 :goto_0
.end method

.method public static a(Landroid/content/Context;IZ)I
    .locals 7

    .prologue
    const v6, 0x812f

    const/4 v1, 0x1

    const/16 v5, 0xde1

    const/4 v4, 0x0

    .line 20
    new-array v0, v1, [I

    .line 22
    invoke-static {v1, v0, v4}, Landroid/opengl/GLES20;->glGenTextures(I[II)V

    .line 24
    aget v1, v0, v4

    if-eqz v1, :cond_1

    .line 25
    new-instance v1, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v1}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 26
    iput-boolean v4, v1, Landroid/graphics/BitmapFactory$Options;->inScaled:Z

    .line 30
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    .line 29
    invoke-static {v2, p1, v1}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 33
    aget v2, v0, v4

    invoke-static {v5, v2}, Landroid/opengl/GLES20;->glBindTexture(II)V

    .line 36
    const/16 v2, 0x2801

    const/16 v3, 0x2600

    invoke-static {v5, v2, v3}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    .line 38
    const/16 v2, 0x2800

    const/16 v3, 0x2601

    invoke-static {v5, v2, v3}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    .line 41
    if-eqz p2, :cond_0

    .line 43
    const/16 v2, 0x2802

    invoke-static {v5, v2, v6}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    .line 45
    const/16 v2, 0x2803

    invoke-static {v5, v2, v6}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    .line 50
    :cond_0
    invoke-static {v5, v4, v1, v4}, Landroid/opengl/GLUtils;->texImage2D(IILandroid/graphics/Bitmap;I)V

    .line 53
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 56
    :cond_1
    aget v1, v0, v4

    if-nez v1, :cond_2

    .line 57
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Error loading texture."

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 60
    :cond_2
    aget v0, v0, v4

    return v0
.end method

.method private static a(Landroid/content/Context;I)Ljava/lang/String;
    .locals 3

    .prologue
    .line 65
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v0

    .line 67
    new-instance v1, Ljava/io/InputStreamReader;

    invoke-direct {v1, v0}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    .line 69
    new-instance v0, Ljava/io/BufferedReader;

    invoke-direct {v0, v1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 73
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 75
    :goto_0
    invoke-virtual {v0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 76
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    const/16 v2, 0xa

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 80
    :cond_0
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
