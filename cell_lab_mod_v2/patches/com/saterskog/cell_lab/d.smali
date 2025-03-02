.class public abstract Lcom/saterskog/cell_lab/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/opengl/GLSurfaceView$Renderer;


# instance fields
.field private A:I

.field private B:I

.field private C:I

.field private D:I

.field private E:Z

.field private F:I

.field private G:I

.field private H:I

.field private I:I

.field protected a:F

.field public b:F

.field public c:F

.field public d:F

.field public e:F

.field public f:F

.field public g:F

.field h:Landroid/content/Context;

.field i:I

.field j:I

.field k:D

.field protected l:Z

.field m:[F

.field n:D

.field o:D

.field private p:[F

.field private q:[F

.field private r:Ljava/nio/FloatBuffer;

.field private s:Ljava/nio/FloatBuffer;

.field private t:I

.field private u:I

.field private v:Ljava/nio/ShortBuffer;

.field private w:I

.field private x:I

.field private y:Z

.field private z:F


# direct methods
.method protected constructor <init>(FZLandroid/content/Context;)V
    .locals 10

    .prologue
    const/4 v0, -0x1

    const-wide/high16 v8, -0x4000000000000000L    # -2.0

    const v7, 0x3f8ccccd    # 1.1f

    const v6, -0x40733333    # -1.1f

    const/4 v1, 0x0

    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    iput-boolean v1, p0, Lcom/saterskog/cell_lab/d;->y:Z

    .line 42
    iput v0, p0, Lcom/saterskog/cell_lab/d;->B:I

    iput v0, p0, Lcom/saterskog/cell_lab/d;->C:I

    iput v0, p0, Lcom/saterskog/cell_lab/d;->D:I

    .line 45
    iput-wide v8, p0, Lcom/saterskog/cell_lab/d;->k:D

    .line 49
    const/16 v0, 0x10

    new-array v0, v0, [F

    iput-object v0, p0, Lcom/saterskog/cell_lab/d;->m:[F

    .line 53
    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    const-wide/high16 v4, 0x4014000000000000L    # 5.0

    invoke-static {v4, v5}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v4

    div-double/2addr v2, v4

    iput-wide v2, p0, Lcom/saterskog/cell_lab/d;->n:D

    .line 54
    const-wide/high16 v2, 0x4000000000000000L    # 2.0

    iget-wide v4, p0, Lcom/saterskog/cell_lab/d;->n:D

    mul-double/2addr v2, v4

    iput-wide v2, p0, Lcom/saterskog/cell_lab/d;->o:D

    .line 60
    iput-object p3, p0, Lcom/saterskog/cell_lab/d;->h:Landroid/content/Context;

    .line 61
    iput-boolean p2, p0, Lcom/saterskog/cell_lab/d;->E:Z

    .line 63
    invoke-static {p3}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 64
    const-string v2, "aa_mode"

    const-string v3, "none"

    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 65
    iput-wide v8, p0, Lcom/saterskog/cell_lab/d;->k:D

    .line 66
    const-string v2, "none"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const-wide/high16 v2, -0x4010000000000000L    # -1.0

    iput-wide v2, p0, Lcom/saterskog/cell_lab/d;->k:D

    .line 67
    :cond_0
    const-string v2, "1.5"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const-wide/high16 v2, 0x3ff8000000000000L    # 1.5

    iput-wide v2, p0, Lcom/saterskog/cell_lab/d;->k:D

    .line 68
    :cond_1
    const-string v2, "2.0"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const-wide/high16 v2, 0x4000000000000000L    # 2.0

    iput-wide v2, p0, Lcom/saterskog/cell_lab/d;->k:D

    .line 69
    :cond_2
    const-string v2, "3.0"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    const-wide/high16 v2, 0x4008000000000000L    # 3.0

    iput-wide v2, p0, Lcom/saterskog/cell_lab/d;->k:D

    .line 70
    :cond_3
    const-string v2, "4.0"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    const-wide/high16 v2, 0x4010000000000000L    # 4.0

    iput-wide v2, p0, Lcom/saterskog/cell_lab/d;->k:D

    .line 71
    :cond_4
    iget-wide v2, p0, Lcom/saterskog/cell_lab/d;->k:D

    cmpl-double v2, v2, v8

    if-nez v2, :cond_5

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Setting aa_mode was: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/saterskog/b/a;->a(Ljava/lang/String;)V

    .line 73
    :cond_5
    iput p1, p0, Lcom/saterskog/cell_lab/d;->z:F

    .line 75
    const/16 v0, 0xc

    new-array v0, v0, [F

    iput-object v0, p0, Lcom/saterskog/cell_lab/d;->p:[F

    .line 76
    iget-object v0, p0, Lcom/saterskog/cell_lab/d;->p:[F

    aput v7, v0, v1

    .line 77
    iget-object v0, p0, Lcom/saterskog/cell_lab/d;->p:[F

    const/4 v2, 0x1

    aput v7, v0, v2

    .line 78
    iget-object v0, p0, Lcom/saterskog/cell_lab/d;->p:[F

    const/4 v2, 0x2

    aput v7, v0, v2

    .line 79
    iget-object v0, p0, Lcom/saterskog/cell_lab/d;->p:[F

    const/4 v2, 0x3

    aput v6, v0, v2

    .line 80
    iget-object v0, p0, Lcom/saterskog/cell_lab/d;->p:[F

    const/4 v2, 0x4

    aput v6, v0, v2

    .line 81
    iget-object v0, p0, Lcom/saterskog/cell_lab/d;->p:[F

    const/4 v2, 0x5

    aput v6, v0, v2

    .line 83
    iget-object v0, p0, Lcom/saterskog/cell_lab/d;->p:[F

    const/4 v2, 0x6

    aput v6, v0, v2

    .line 84
    iget-object v0, p0, Lcom/saterskog/cell_lab/d;->p:[F

    const/4 v2, 0x7

    aput v6, v0, v2

    .line 85
    iget-object v0, p0, Lcom/saterskog/cell_lab/d;->p:[F

    const/16 v2, 0x8

    aput v6, v0, v2

    .line 86
    iget-object v0, p0, Lcom/saterskog/cell_lab/d;->p:[F

    const/16 v2, 0x9

    aput v7, v0, v2

    .line 87
    iget-object v0, p0, Lcom/saterskog/cell_lab/d;->p:[F

    const/16 v2, 0xa

    aput v7, v0, v2

    .line 88
    iget-object v0, p0, Lcom/saterskog/cell_lab/d;->p:[F

    const/16 v2, 0xb

    aput v7, v0, v2

    .line 89
    const/16 v0, 0x30

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 92
    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 93
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->asFloatBuffer()Ljava/nio/FloatBuffer;

    move-result-object v0

    iput-object v0, p0, Lcom/saterskog/cell_lab/d;->r:Ljava/nio/FloatBuffer;

    .line 94
    iget-object v0, p0, Lcom/saterskog/cell_lab/d;->r:Ljava/nio/FloatBuffer;

    iget-object v2, p0, Lcom/saterskog/cell_lab/d;->p:[F

    const/16 v3, 0xc

    invoke-virtual {v0, v2, v1, v3}, Ljava/nio/FloatBuffer;->put([FII)Ljava/nio/FloatBuffer;

    .line 95
    iget-object v0, p0, Lcom/saterskog/cell_lab/d;->r:Ljava/nio/FloatBuffer;

    invoke-virtual {v0, v1}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    .line 100
    const/4 v0, 0x6

    new-array v2, v0, [S

    move v0, v1

    .line 101
    :goto_0
    const/4 v3, 0x6

    if-ge v0, v3, :cond_6

    .line 102
    aput-short v0, v2, v0

    .line 101
    add-int/lit8 v0, v0, 0x1

    int-to-short v0, v0

    goto :goto_0

    .line 104
    :cond_6
    const/16 v0, 0x18

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 105
    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 106
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->asShortBuffer()Ljava/nio/ShortBuffer;

    move-result-object v0

    iput-object v0, p0, Lcom/saterskog/cell_lab/d;->v:Ljava/nio/ShortBuffer;

    .line 107
    iget-object v0, p0, Lcom/saterskog/cell_lab/d;->v:Ljava/nio/ShortBuffer;

    invoke-virtual {v0, v2}, Ljava/nio/ShortBuffer;->put([S)Ljava/nio/ShortBuffer;

    .line 108
    iget-object v0, p0, Lcom/saterskog/cell_lab/d;->v:Ljava/nio/ShortBuffer;

    invoke-virtual {v0, v1}, Ljava/nio/ShortBuffer;->position(I)Ljava/nio/Buffer;

    .line 110
    iput-boolean v1, p0, Lcom/saterskog/cell_lab/d;->l:Z

    .line 111
    return-void
.end method


# virtual methods
.method public final a(F)D
    .locals 6

    .prologue
    .line 323
    iget v0, p0, Lcom/saterskog/cell_lab/d;->b:F

    float-to-double v0, v0

    iget v2, p0, Lcom/saterskog/cell_lab/d;->x:I

    int-to-float v2, v2

    div-float v2, p1, v2

    float-to-double v2, v2

    const-wide/high16 v4, 0x3fe0000000000000L    # 0.5

    sub-double/2addr v2, v4

    iget v4, p0, Lcom/saterskog/cell_lab/d;->f:F

    float-to-double v4, v4

    mul-double/2addr v2, v4

    add-double/2addr v0, v2

    return-wide v0
.end method

.method protected final a()V
    .locals 4

    .prologue
    .line 114
    iget-object v0, p0, Lcom/saterskog/cell_lab/d;->h:Landroid/content/Context;

    const v1, 0x7f0d0022

    const v2, 0x7f0d0021

    invoke-static {v0, v1, v2}, Lcom/saterskog/b/c;->a(Landroid/content/Context;II)I

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/d;->A:I

    .line 115
    iget v0, p0, Lcom/saterskog/cell_lab/d;->A:I

    const-string v1, "vPosition"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetAttribLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/d;->t:I

    .line 116
    iget v0, p0, Lcom/saterskog/cell_lab/d;->A:I

    const-string v1, "vCenter"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetAttribLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/d;->u:I

    .line 118
    iget-wide v0, p0, Lcom/saterskog/cell_lab/d;->k:D

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_0

    .line 120
    iget-object v0, p0, Lcom/saterskog/cell_lab/d;->h:Landroid/content/Context;

    const v1, 0x7f0d0001

    const/high16 v2, 0x7f0d0000

    invoke-static {v0, v1, v2}, Lcom/saterskog/b/c;->a(Landroid/content/Context;II)I

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/d;->F:I

    .line 125
    iget v0, p0, Lcom/saterskog/cell_lab/d;->F:I

    const-string v1, "vPosition"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetAttribLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/d;->G:I

    .line 126
    iget v0, p0, Lcom/saterskog/cell_lab/d;->F:I

    const-string v1, "tex1"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/d;->H:I

    .line 127
    iget v0, p0, Lcom/saterskog/cell_lab/d;->F:I

    const-string v1, "invTexSize"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/d;->I:I

    .line 129
    :cond_0
    return-void
.end method

.method protected abstract a([F)V
.end method

.method protected final a([FFFFF)V
    .locals 10

    .prologue
    const/16 v2, 0x1406

    const/16 v5, 0x18

    const/4 v9, 0x6

    const/4 v8, 0x4

    const/4 v3, 0x0

    .line 356
    new-array v0, v5, [F

    iput-object v0, p0, Lcom/saterskog/cell_lab/d;->p:[F

    move v0, v3

    .line 357
    :goto_0
    if-ge v0, v9, :cond_0

    .line 358
    iget-object v1, p0, Lcom/saterskog/cell_lab/d;->p:[F

    mul-int/lit8 v4, v0, 0x4

    add-int/lit8 v4, v4, 0x0

    aput p2, v1, v4

    .line 359
    iget-object v1, p0, Lcom/saterskog/cell_lab/d;->p:[F

    mul-int/lit8 v4, v0, 0x4

    add-int/lit8 v4, v4, 0x1

    aput p3, v1, v4

    .line 360
    iget-object v1, p0, Lcom/saterskog/cell_lab/d;->p:[F

    mul-int/lit8 v4, v0, 0x4

    add-int/lit8 v4, v4, 0x2

    aput p4, v1, v4

    .line 361
    iget-object v1, p0, Lcom/saterskog/cell_lab/d;->p:[F

    mul-int/lit8 v4, v0, 0x4

    add-int/lit8 v4, v4, 0x3

    aput p5, v1, v4

    .line 357
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 364
    :cond_0
    const/16 v0, 0x60

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 367
    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 368
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->asFloatBuffer()Ljava/nio/FloatBuffer;

    move-result-object v6

    .line 369
    iget-object v0, p0, Lcom/saterskog/cell_lab/d;->p:[F

    invoke-virtual {v6, v0, v3, v5}, Ljava/nio/FloatBuffer;->put([FII)Ljava/nio/FloatBuffer;

    .line 370
    invoke-virtual {v6, v3}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    .line 372
    iget v0, p0, Lcom/saterskog/cell_lab/d;->A:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glUseProgram(I)V

    .line 374
    iget v0, p0, Lcom/saterskog/cell_lab/d;->t:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    .line 375
    iget v0, p0, Lcom/saterskog/cell_lab/d;->u:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    .line 378
    iget v0, p0, Lcom/saterskog/cell_lab/d;->A:I

    const-string v1, "uMVPMatrix"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v7

    .line 381
    iget v0, p0, Lcom/saterskog/cell_lab/d;->t:I

    const/4 v1, 0x2

    const/16 v4, 0x8

    iget-object v5, p0, Lcom/saterskog/cell_lab/d;->r:Ljava/nio/FloatBuffer;

    invoke-static/range {v0 .. v5}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZILjava/nio/Buffer;)V

    .line 382
    iget v0, p0, Lcom/saterskog/cell_lab/d;->u:I

    const/16 v4, 0x10

    move v1, v8

    move-object v5, v6

    invoke-static/range {v0 .. v5}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZILjava/nio/Buffer;)V

    .line 383
    const/4 v0, 0x1

    invoke-static {v7, v0, v3, p1, v3}, Landroid/opengl/GLES20;->glUniformMatrix4fv(IIZ[FI)V

    .line 385
    const/16 v0, 0x1403

    iget-object v1, p0, Lcom/saterskog/cell_lab/d;->v:Ljava/nio/ShortBuffer;

    invoke-static {v8, v9, v0, v1}, Landroid/opengl/GLES20;->glDrawElements(IIILjava/nio/Buffer;)V

    .line 387
    iget v0, p0, Lcom/saterskog/cell_lab/d;->t:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glDisableVertexAttribArray(I)V

    .line 388
    iget v0, p0, Lcom/saterskog/cell_lab/d;->u:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glDisableVertexAttribArray(I)V

    .line 389
    return-void
.end method

.method public final b(F)D
    .locals 6

    .prologue
    .line 326
    iget v0, p0, Lcom/saterskog/cell_lab/d;->c:F

    float-to-double v0, v0

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    iget v4, p0, Lcom/saterskog/cell_lab/d;->w:I

    int-to-float v4, v4

    div-float v4, p1, v4

    float-to-double v4, v4

    sub-double/2addr v2, v4

    iget v4, p0, Lcom/saterskog/cell_lab/d;->g:F

    float-to-double v4, v4

    mul-double/2addr v2, v4

    add-double/2addr v0, v2

    return-wide v0
.end method

.method protected final b()V
    .locals 6

    .prologue
    const/4 v5, 0x1

    const v4, 0x48927c00    # 300000.0f

    const/high16 v2, 0x3f800000    # 1.0f

    const/high16 v3, 0x40000000    # 2.0f

    .line 294
    iget v0, p0, Lcom/saterskog/cell_lab/d;->d:F

    iget v1, p0, Lcom/saterskog/cell_lab/d;->z:F

    div-float v1, v2, v1

    cmpg-float v0, v0, v1

    if-gez v0, :cond_0

    .line 295
    iget v0, p0, Lcom/saterskog/cell_lab/d;->z:F

    div-float v0, v2, v0

    iput v0, p0, Lcom/saterskog/cell_lab/d;->d:F

    .line 296
    :cond_0
    iget v0, p0, Lcom/saterskog/cell_lab/d;->d:F

    cmpl-float v0, v0, v4

    if-lez v0, :cond_1

    .line 297
    iput v4, p0, Lcom/saterskog/cell_lab/d;->d:F

    .line 298
    iget-boolean v0, p0, Lcom/saterskog/cell_lab/d;->y:Z

    if-nez v0, :cond_1

    .line 299
    iget-object v0, p0, Lcom/saterskog/cell_lab/d;->h:Landroid/content/Context;

    iget-object v1, p0, Lcom/saterskog/cell_lab/d;->h:Landroid/content/Context;

    const v2, 0x7f0e019f

    .line 300
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 299
    invoke-static {v0, v1, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    .line 301
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 302
    iput-boolean v5, p0, Lcom/saterskog/cell_lab/d;->y:Z

    .line 305
    :cond_1
    iget v1, p0, Lcom/saterskog/cell_lab/d;->d:F

    iget v0, p0, Lcom/saterskog/cell_lab/d;->x:I

    iget v2, p0, Lcom/saterskog/cell_lab/d;->w:I

    if-ge v0, v2, :cond_6

    iget v0, p0, Lcom/saterskog/cell_lab/d;->x:I

    int-to-float v0, v0

    div-float/2addr v0, v3

    :goto_0
    mul-float/2addr v0, v1

    iput v0, p0, Lcom/saterskog/cell_lab/d;->a:F

    .line 306
    iget v0, p0, Lcom/saterskog/cell_lab/d;->x:I

    int-to-float v0, v0

    iget v1, p0, Lcom/saterskog/cell_lab/d;->a:F

    div-float/2addr v0, v1

    iput v0, p0, Lcom/saterskog/cell_lab/d;->f:F

    .line 307
    iget v0, p0, Lcom/saterskog/cell_lab/d;->w:I

    int-to-float v0, v0

    iget v1, p0, Lcom/saterskog/cell_lab/d;->a:F

    div-float/2addr v0, v1

    iput v0, p0, Lcom/saterskog/cell_lab/d;->g:F

    .line 309
    iget v0, p0, Lcom/saterskog/cell_lab/d;->b:F

    iget v1, p0, Lcom/saterskog/cell_lab/d;->z:F

    neg-float v1, v1

    iget v2, p0, Lcom/saterskog/cell_lab/d;->f:F

    div-float/2addr v2, v3

    add-float/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    neg-float v1, v1

    cmpg-float v0, v0, v1

    if-gez v0, :cond_2

    .line 310
    iget v0, p0, Lcom/saterskog/cell_lab/d;->z:F

    neg-float v0, v0

    iget v1, p0, Lcom/saterskog/cell_lab/d;->f:F

    div-float/2addr v1, v3

    add-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    neg-float v0, v0

    iput v0, p0, Lcom/saterskog/cell_lab/d;->b:F

    .line 311
    :cond_2
    iget v0, p0, Lcom/saterskog/cell_lab/d;->b:F

    iget v1, p0, Lcom/saterskog/cell_lab/d;->z:F

    neg-float v1, v1

    iget v2, p0, Lcom/saterskog/cell_lab/d;->f:F

    div-float/2addr v2, v3

    add-float/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    cmpl-float v0, v0, v1

    if-lez v0, :cond_3

    .line 312
    iget v0, p0, Lcom/saterskog/cell_lab/d;->z:F

    neg-float v0, v0

    iget v1, p0, Lcom/saterskog/cell_lab/d;->f:F

    div-float/2addr v1, v3

    add-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/d;->b:F

    .line 313
    :cond_3
    iget v0, p0, Lcom/saterskog/cell_lab/d;->c:F

    iget v1, p0, Lcom/saterskog/cell_lab/d;->z:F

    neg-float v1, v1

    iget v2, p0, Lcom/saterskog/cell_lab/d;->g:F

    div-float/2addr v2, v3

    add-float/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    neg-float v1, v1

    cmpg-float v0, v0, v1

    if-gez v0, :cond_4

    .line 314
    iget v0, p0, Lcom/saterskog/cell_lab/d;->z:F

    neg-float v0, v0

    iget v1, p0, Lcom/saterskog/cell_lab/d;->g:F

    div-float/2addr v1, v3

    add-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    neg-float v0, v0

    iput v0, p0, Lcom/saterskog/cell_lab/d;->c:F

    .line 315
    :cond_4
    iget v0, p0, Lcom/saterskog/cell_lab/d;->c:F

    iget v1, p0, Lcom/saterskog/cell_lab/d;->z:F

    neg-float v1, v1

    iget v2, p0, Lcom/saterskog/cell_lab/d;->g:F

    div-float/2addr v2, v3

    add-float/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    cmpl-float v0, v0, v1

    if-lez v0, :cond_5

    .line 316
    iget v0, p0, Lcom/saterskog/cell_lab/d;->z:F

    neg-float v0, v0

    iget v1, p0, Lcom/saterskog/cell_lab/d;->g:F

    div-float/2addr v1, v3

    add-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/d;->c:F

    .line 317
    iget-object v0, p0, Lcom/saterskog/cell_lab/d;->h:Landroid/content/Context;

    check-cast v0, Landroid/app/Activity;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, v1, v2}, Lcom/saterskog/cell_lab/t;->b(Landroid/app/Activity;II)V

    .line 321
    :cond_5
    return-void

    .line 305
    :cond_6
    iget v0, p0, Lcom/saterskog/cell_lab/d;->w:I

    int-to-float v0, v0

    div-float/2addr v0, v3

    goto/16 :goto_0
.end method

.method public onDrawFrame(Ljavax/microedition/khronos/opengles/GL10;)V
    .locals 11

    .prologue
    const/4 v10, 0x1

    const/4 v1, 0x4

    const/4 v3, 0x0

    const/high16 v9, 0x3f800000    # 1.0f

    const/4 v8, 0x0

    .line 200
    iget-wide v4, p0, Lcom/saterskog/cell_lab/d;->k:D

    const-wide/16 v6, 0x0

    cmpl-double v0, v4, v6

    if-lez v0, :cond_4

    .line 202
    const v0, 0x8d40

    iget v2, p0, Lcom/saterskog/cell_lab/d;->B:I

    invoke-static {v0, v2}, Landroid/opengl/GLES20;->glBindFramebuffer(II)V

    .line 203
    iget v0, p0, Lcom/saterskog/cell_lab/d;->i:I

    iget v2, p0, Lcom/saterskog/cell_lab/d;->j:I

    invoke-static {v3, v3, v0, v2}, Landroid/opengl/GLES20;->glViewport(IIII)V

    .line 205
    iget-object v0, p0, Lcom/saterskog/cell_lab/d;->m:[F

    iget-wide v4, p0, Lcom/saterskog/cell_lab/d;->o:D

    iget v2, p0, Lcom/saterskog/cell_lab/d;->x:I

    int-to-double v6, v2

    mul-double/2addr v4, v6

    iget-wide v6, p0, Lcom/saterskog/cell_lab/d;->k:D

    mul-double/2addr v4, v6

    iget v2, p0, Lcom/saterskog/cell_lab/d;->i:I

    int-to-double v6, v2

    div-double/2addr v4, v6

    double-to-float v2, v4

    aput v2, v0, v3

    .line 206
    iget-object v0, p0, Lcom/saterskog/cell_lab/d;->m:[F

    iget-wide v4, p0, Lcom/saterskog/cell_lab/d;->n:D

    iget v2, p0, Lcom/saterskog/cell_lab/d;->x:I

    int-to-double v6, v2

    mul-double/2addr v4, v6

    iget-wide v6, p0, Lcom/saterskog/cell_lab/d;->k:D

    mul-double/2addr v4, v6

    iget v2, p0, Lcom/saterskog/cell_lab/d;->j:I

    int-to-double v6, v2

    div-double/2addr v4, v6

    double-to-float v2, v4

    neg-float v2, v2

    aput v2, v0, v10

    .line 207
    iget-object v0, p0, Lcom/saterskog/cell_lab/d;->m:[F

    const/4 v2, 0x2

    aput v8, v0, v2

    .line 208
    iget-object v0, p0, Lcom/saterskog/cell_lab/d;->m:[F

    const/4 v2, 0x3

    aput v8, v0, v2

    .line 209
    iget-object v0, p0, Lcom/saterskog/cell_lab/d;->m:[F

    iget-wide v4, p0, Lcom/saterskog/cell_lab/d;->n:D

    iget v2, p0, Lcom/saterskog/cell_lab/d;->w:I

    int-to-double v6, v2

    mul-double/2addr v4, v6

    iget-wide v6, p0, Lcom/saterskog/cell_lab/d;->k:D

    mul-double/2addr v4, v6

    iget v2, p0, Lcom/saterskog/cell_lab/d;->i:I

    int-to-double v6, v2

    div-double/2addr v4, v6

    double-to-float v2, v4

    aput v2, v0, v1

    .line 210
    iget-object v0, p0, Lcom/saterskog/cell_lab/d;->m:[F

    const/4 v2, 0x5

    iget-wide v4, p0, Lcom/saterskog/cell_lab/d;->o:D

    iget v6, p0, Lcom/saterskog/cell_lab/d;->w:I

    int-to-double v6, v6

    mul-double/2addr v4, v6

    iget-wide v6, p0, Lcom/saterskog/cell_lab/d;->k:D

    mul-double/2addr v4, v6

    iget v6, p0, Lcom/saterskog/cell_lab/d;->j:I

    int-to-double v6, v6

    div-double/2addr v4, v6

    double-to-float v4, v4

    aput v4, v0, v2

    .line 211
    iget-object v0, p0, Lcom/saterskog/cell_lab/d;->m:[F

    const/4 v2, 0x6

    aput v8, v0, v2

    .line 212
    iget-object v0, p0, Lcom/saterskog/cell_lab/d;->m:[F

    const/4 v2, 0x7

    aput v8, v0, v2

    .line 213
    iget-object v0, p0, Lcom/saterskog/cell_lab/d;->m:[F

    const/16 v2, 0x8

    aput v8, v0, v2

    .line 214
    iget-object v0, p0, Lcom/saterskog/cell_lab/d;->m:[F

    const/16 v2, 0x9

    aput v8, v0, v2

    .line 215
    iget-object v0, p0, Lcom/saterskog/cell_lab/d;->m:[F

    const/16 v2, 0xa

    aput v9, v0, v2

    .line 216
    iget-object v0, p0, Lcom/saterskog/cell_lab/d;->m:[F

    const/16 v2, 0xb

    aput v8, v0, v2

    .line 217
    iget-object v0, p0, Lcom/saterskog/cell_lab/d;->m:[F

    const/16 v2, 0xc

    aput v8, v0, v2

    .line 218
    iget-object v0, p0, Lcom/saterskog/cell_lab/d;->m:[F

    const/16 v2, 0xd

    aput v8, v0, v2

    .line 219
    iget-object v0, p0, Lcom/saterskog/cell_lab/d;->m:[F

    const/16 v2, 0xe

    aput v8, v0, v2

    .line 220
    iget-object v0, p0, Lcom/saterskog/cell_lab/d;->m:[F

    const/16 v2, 0xf

    aput v9, v0, v2

    .line 221
    iget-object v0, p0, Lcom/saterskog/cell_lab/d;->m:[F

    invoke-virtual {p0, v0}, Lcom/saterskog/cell_lab/d;->a([F)V

    .line 222
    const v0, 0x8d40

    invoke-static {v0, v3}, Landroid/opengl/GLES20;->glBindFramebuffer(II)V

    .line 223
    iget v0, p0, Lcom/saterskog/cell_lab/d;->x:I

    iget v2, p0, Lcom/saterskog/cell_lab/d;->w:I

    invoke-static {v3, v3, v0, v2}, Landroid/opengl/GLES20;->glViewport(IIII)V

    .line 224
    iget-object v0, p0, Lcom/saterskog/cell_lab/d;->m:[F

    aput v9, v0, v3

    .line 225
    iget-object v0, p0, Lcom/saterskog/cell_lab/d;->m:[F

    aput v8, v0, v10

    .line 226
    iget-object v0, p0, Lcom/saterskog/cell_lab/d;->m:[F

    const/4 v2, 0x2

    aput v8, v0, v2

    .line 227
    iget-object v0, p0, Lcom/saterskog/cell_lab/d;->m:[F

    const/4 v2, 0x3

    aput v8, v0, v2

    .line 228
    iget-object v0, p0, Lcom/saterskog/cell_lab/d;->m:[F

    aput v8, v0, v1

    .line 229
    iget-object v0, p0, Lcom/saterskog/cell_lab/d;->m:[F

    const/4 v2, 0x5

    aput v9, v0, v2

    .line 230
    iget-object v0, p0, Lcom/saterskog/cell_lab/d;->m:[F

    const/4 v2, 0x6

    aput v8, v0, v2

    .line 231
    iget-object v0, p0, Lcom/saterskog/cell_lab/d;->m:[F

    const/4 v2, 0x7

    aput v8, v0, v2

    .line 232
    iget-object v0, p0, Lcom/saterskog/cell_lab/d;->m:[F

    const/16 v2, 0x8

    aput v8, v0, v2

    .line 233
    iget-object v0, p0, Lcom/saterskog/cell_lab/d;->m:[F

    const/16 v2, 0x9

    aput v8, v0, v2

    .line 234
    iget-object v0, p0, Lcom/saterskog/cell_lab/d;->m:[F

    const/16 v2, 0xa

    aput v9, v0, v2

    .line 235
    iget-object v0, p0, Lcom/saterskog/cell_lab/d;->m:[F

    const/16 v2, 0xb

    aput v8, v0, v2

    .line 236
    iget-object v0, p0, Lcom/saterskog/cell_lab/d;->m:[F

    const/16 v2, 0xc

    aput v8, v0, v2

    .line 237
    iget-object v0, p0, Lcom/saterskog/cell_lab/d;->m:[F

    const/16 v2, 0xd

    aput v8, v0, v2

    .line 238
    iget-object v0, p0, Lcom/saterskog/cell_lab/d;->m:[F

    const/16 v2, 0xe

    aput v8, v0, v2

    .line 239
    iget-object v0, p0, Lcom/saterskog/cell_lab/d;->m:[F

    const/16 v2, 0xf

    aput v9, v0, v2

    .line 240
    const/16 v0, 0xb71

    invoke-static {v0}, Landroid/opengl/GLES20;->glDisable(I)V

    .line 241
    const/16 v0, 0xbe2

    invoke-static {v0}, Landroid/opengl/GLES20;->glDisable(I)V

    .line 243
    iget v0, p0, Lcom/saterskog/cell_lab/d;->F:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glUseProgram(I)V

    .line 246
    const v0, 0x84c0

    invoke-static {v0}, Landroid/opengl/GLES20;->glActiveTexture(I)V

    .line 247
    const/16 v0, 0xde1

    iget v2, p0, Lcom/saterskog/cell_lab/d;->C:I

    invoke-static {v0, v2}, Landroid/opengl/GLES20;->glBindTexture(II)V

    .line 250
    iget v0, p0, Lcom/saterskog/cell_lab/d;->H:I

    invoke-static {v0, v3}, Landroid/opengl/GLES20;->glUniform1i(II)V

    .line 255
    iget v0, p0, Lcom/saterskog/cell_lab/d;->F:I

    const-string v2, "uMVPMatrix"

    invoke-static {v0, v2}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v6

    .line 258
    iget v0, p0, Lcom/saterskog/cell_lab/d;->G:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    .line 259
    iget v0, p0, Lcom/saterskog/cell_lab/d;->G:I

    const/16 v2, 0x1406

    const/16 v4, 0x10

    iget-object v5, p0, Lcom/saterskog/cell_lab/d;->s:Ljava/nio/FloatBuffer;

    invoke-static/range {v0 .. v5}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZILjava/nio/Buffer;)V

    .line 260
    iget-object v0, p0, Lcom/saterskog/cell_lab/d;->m:[F

    invoke-static {v6, v10, v3, v0, v3}, Landroid/opengl/GLES20;->glUniformMatrix4fv(IIZ[FI)V

    .line 262
    iget-wide v2, p0, Lcom/saterskog/cell_lab/d;->k:D

    const-wide/high16 v4, 0x3ff8000000000000L    # 1.5

    cmpl-double v0, v2, v4

    if-nez v0, :cond_0

    iget v0, p0, Lcom/saterskog/cell_lab/d;->I:I

    iget v2, p0, Lcom/saterskog/cell_lab/d;->i:I

    int-to-float v2, v2

    div-float v2, v9, v2

    iget v3, p0, Lcom/saterskog/cell_lab/d;->j:I

    int-to-float v3, v3

    div-float v3, v9, v3

    invoke-static {v0, v2, v3}, Landroid/opengl/GLES20;->glUniform2f(IFF)V

    .line 263
    :cond_0
    iget-wide v2, p0, Lcom/saterskog/cell_lab/d;->k:D

    const-wide/high16 v4, 0x4000000000000000L    # 2.0

    cmpl-double v0, v2, v4

    if-nez v0, :cond_1

    iget v0, p0, Lcom/saterskog/cell_lab/d;->I:I

    iget v2, p0, Lcom/saterskog/cell_lab/d;->i:I

    int-to-float v2, v2

    div-float v2, v9, v2

    iget v3, p0, Lcom/saterskog/cell_lab/d;->j:I

    int-to-float v3, v3

    div-float v3, v9, v3

    invoke-static {v0, v2, v3}, Landroid/opengl/GLES20;->glUniform2f(IFF)V

    .line 264
    :cond_1
    iget-wide v2, p0, Lcom/saterskog/cell_lab/d;->k:D

    const-wide/high16 v4, 0x4008000000000000L    # 3.0

    cmpl-double v0, v2, v4

    if-nez v0, :cond_2

    iget v0, p0, Lcom/saterskog/cell_lab/d;->I:I

    const/high16 v2, 0x3fc00000    # 1.5f

    iget v3, p0, Lcom/saterskog/cell_lab/d;->i:I

    int-to-float v3, v3

    div-float/2addr v2, v3

    const/high16 v3, 0x3fc00000    # 1.5f

    iget v4, p0, Lcom/saterskog/cell_lab/d;->j:I

    int-to-float v4, v4

    div-float/2addr v3, v4

    invoke-static {v0, v2, v3}, Landroid/opengl/GLES20;->glUniform2f(IFF)V

    .line 265
    :cond_2
    iget-wide v2, p0, Lcom/saterskog/cell_lab/d;->k:D

    const-wide/high16 v4, 0x4010000000000000L    # 4.0

    cmpl-double v0, v2, v4

    if-nez v0, :cond_3

    iget v0, p0, Lcom/saterskog/cell_lab/d;->I:I

    const/high16 v2, 0x40000000    # 2.0f

    iget v3, p0, Lcom/saterskog/cell_lab/d;->i:I

    int-to-float v3, v3

    div-float/2addr v2, v3

    const/high16 v3, 0x40000000    # 2.0f

    iget v4, p0, Lcom/saterskog/cell_lab/d;->j:I

    int-to-float v4, v4

    div-float/2addr v3, v4

    invoke-static {v0, v2, v3}, Landroid/opengl/GLES20;->glUniform2f(IFF)V

    .line 267
    :cond_3
    const/4 v0, 0x6

    const/16 v2, 0x1403

    iget-object v3, p0, Lcom/saterskog/cell_lab/d;->v:Ljava/nio/ShortBuffer;

    invoke-static {v1, v0, v2, v3}, Landroid/opengl/GLES20;->glDrawElements(IIILjava/nio/Buffer;)V

    .line 269
    iget v0, p0, Lcom/saterskog/cell_lab/d;->G:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glDisableVertexAttribArray(I)V

    .line 290
    :goto_0
    return-void

    .line 272
    :cond_4
    iget-object v0, p0, Lcom/saterskog/cell_lab/d;->m:[F

    aput v9, v0, v3

    .line 273
    iget-object v0, p0, Lcom/saterskog/cell_lab/d;->m:[F

    aput v8, v0, v10

    .line 274
    iget-object v0, p0, Lcom/saterskog/cell_lab/d;->m:[F

    const/4 v2, 0x2

    aput v8, v0, v2

    .line 275
    iget-object v0, p0, Lcom/saterskog/cell_lab/d;->m:[F

    const/4 v2, 0x3

    aput v8, v0, v2

    .line 276
    iget-object v0, p0, Lcom/saterskog/cell_lab/d;->m:[F

    aput v8, v0, v1

    .line 277
    iget-object v0, p0, Lcom/saterskog/cell_lab/d;->m:[F

    const/4 v1, 0x5

    aput v9, v0, v1

    .line 278
    iget-object v0, p0, Lcom/saterskog/cell_lab/d;->m:[F

    const/4 v1, 0x6

    aput v8, v0, v1

    .line 279
    iget-object v0, p0, Lcom/saterskog/cell_lab/d;->m:[F

    const/4 v1, 0x7

    aput v8, v0, v1

    .line 280
    iget-object v0, p0, Lcom/saterskog/cell_lab/d;->m:[F

    const/16 v1, 0x8

    aput v8, v0, v1

    .line 281
    iget-object v0, p0, Lcom/saterskog/cell_lab/d;->m:[F

    const/16 v1, 0x9

    aput v8, v0, v1

    .line 282
    iget-object v0, p0, Lcom/saterskog/cell_lab/d;->m:[F

    const/16 v1, 0xa

    aput v9, v0, v1

    .line 283
    iget-object v0, p0, Lcom/saterskog/cell_lab/d;->m:[F

    const/16 v1, 0xb

    aput v8, v0, v1

    .line 284
    iget-object v0, p0, Lcom/saterskog/cell_lab/d;->m:[F

    const/16 v1, 0xc

    aput v8, v0, v1

    .line 285
    iget-object v0, p0, Lcom/saterskog/cell_lab/d;->m:[F

    const/16 v1, 0xd

    aput v8, v0, v1

    .line 286
    iget-object v0, p0, Lcom/saterskog/cell_lab/d;->m:[F

    const/16 v1, 0xe

    aput v8, v0, v1

    .line 287
    iget-object v0, p0, Lcom/saterskog/cell_lab/d;->m:[F

    const/16 v1, 0xf

    aput v9, v0, v1

    .line 288
    iget-object v0, p0, Lcom/saterskog/cell_lab/d;->m:[F

    invoke-virtual {p0, v0}, Lcom/saterskog/cell_lab/d;->a([F)V

    goto :goto_0
.end method

.method public onSurfaceChanged(Ljavax/microedition/khronos/opengles/GL10;II)V
    .locals 11

    .prologue
    const/4 v10, 0x1

    const/high16 v9, -0x40800000    # -1.0f

    const/16 v0, 0xde1

    const/high16 v8, 0x3f800000    # 1.0f

    const/4 v1, 0x0

    .line 394
    iput p2, p0, Lcom/saterskog/cell_lab/d;->x:I

    .line 395
    iput p3, p0, Lcom/saterskog/cell_lab/d;->w:I

    .line 396
    iput-boolean v10, p0, Lcom/saterskog/cell_lab/d;->l:Z

    .line 397
    iget-wide v2, p0, Lcom/saterskog/cell_lab/d;->k:D

    const-wide/16 v4, 0x0

    cmpl-double v2, v2, v4

    if-lez v2, :cond_1

    .line 408
    iget-wide v2, p0, Lcom/saterskog/cell_lab/d;->o:D

    iget v4, p0, Lcom/saterskog/cell_lab/d;->x:I

    int-to-double v4, v4

    mul-double/2addr v2, v4

    iget-wide v4, p0, Lcom/saterskog/cell_lab/d;->n:D

    iget v6, p0, Lcom/saterskog/cell_lab/d;->w:I

    int-to-double v6, v6

    mul-double/2addr v4, v6

    add-double/2addr v2, v4

    iget-wide v4, p0, Lcom/saterskog/cell_lab/d;->k:D

    mul-double/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-int v2, v2

    iput v2, p0, Lcom/saterskog/cell_lab/d;->i:I

    .line 409
    iget-wide v2, p0, Lcom/saterskog/cell_lab/d;->o:D

    iget v4, p0, Lcom/saterskog/cell_lab/d;->w:I

    int-to-double v4, v4

    mul-double/2addr v2, v4

    iget-wide v4, p0, Lcom/saterskog/cell_lab/d;->n:D

    iget v6, p0, Lcom/saterskog/cell_lab/d;->x:I

    int-to-double v6, v6

    mul-double/2addr v4, v6

    add-double/2addr v2, v4

    iget-wide v4, p0, Lcom/saterskog/cell_lab/d;->k:D

    mul-double/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-int v2, v2

    iput v2, p0, Lcom/saterskog/cell_lab/d;->j:I

    .line 411
    const/16 v2, 0x18

    new-array v2, v2, [F

    iput-object v2, p0, Lcom/saterskog/cell_lab/d;->q:[F

    .line 412
    iget-object v2, p0, Lcom/saterskog/cell_lab/d;->q:[F

    aput v8, v2, v1

    .line 413
    iget-object v2, p0, Lcom/saterskog/cell_lab/d;->q:[F

    aput v8, v2, v10

    .line 414
    iget-object v2, p0, Lcom/saterskog/cell_lab/d;->q:[F

    const/4 v3, 0x2

    aput v8, v2, v3

    .line 415
    iget-object v2, p0, Lcom/saterskog/cell_lab/d;->q:[F

    const/4 v3, 0x3

    iget v4, p0, Lcom/saterskog/cell_lab/d;->x:I

    int-to-double v4, v4

    iget-wide v6, p0, Lcom/saterskog/cell_lab/d;->k:D

    mul-double/2addr v4, v6

    iget-wide v6, p0, Lcom/saterskog/cell_lab/d;->n:D

    mul-double/2addr v4, v6

    double-to-float v4, v4

    iget v5, p0, Lcom/saterskog/cell_lab/d;->j:I

    int-to-float v5, v5

    div-float/2addr v4, v5

    sub-float v4, v8, v4

    aput v4, v2, v3

    .line 417
    iget-object v2, p0, Lcom/saterskog/cell_lab/d;->q:[F

    const/4 v3, 0x4

    aput v8, v2, v3

    .line 418
    iget-object v2, p0, Lcom/saterskog/cell_lab/d;->q:[F

    const/4 v3, 0x5

    aput v9, v2, v3

    .line 419
    iget-object v2, p0, Lcom/saterskog/cell_lab/d;->q:[F

    const/4 v3, 0x6

    iget v4, p0, Lcom/saterskog/cell_lab/d;->w:I

    int-to-double v4, v4

    iget-wide v6, p0, Lcom/saterskog/cell_lab/d;->k:D

    mul-double/2addr v4, v6

    iget-wide v6, p0, Lcom/saterskog/cell_lab/d;->n:D

    mul-double/2addr v4, v6

    double-to-float v4, v4

    iget v5, p0, Lcom/saterskog/cell_lab/d;->i:I

    int-to-float v5, v5

    div-float/2addr v4, v5

    sub-float v4, v8, v4

    aput v4, v2, v3

    .line 420
    iget-object v2, p0, Lcom/saterskog/cell_lab/d;->q:[F

    const/4 v3, 0x7

    const/4 v4, 0x0

    aput v4, v2, v3

    .line 422
    iget-object v2, p0, Lcom/saterskog/cell_lab/d;->q:[F

    const/16 v3, 0x8

    aput v9, v2, v3

    .line 423
    iget-object v2, p0, Lcom/saterskog/cell_lab/d;->q:[F

    const/16 v3, 0x9

    aput v9, v2, v3

    .line 424
    iget-object v2, p0, Lcom/saterskog/cell_lab/d;->q:[F

    const/16 v3, 0xa

    const/4 v4, 0x0

    aput v4, v2, v3

    .line 425
    iget-object v2, p0, Lcom/saterskog/cell_lab/d;->q:[F

    const/16 v3, 0xb

    iget v4, p0, Lcom/saterskog/cell_lab/d;->x:I

    int-to-double v4, v4

    iget-wide v6, p0, Lcom/saterskog/cell_lab/d;->k:D

    mul-double/2addr v4, v6

    iget-wide v6, p0, Lcom/saterskog/cell_lab/d;->n:D

    mul-double/2addr v4, v6

    double-to-float v4, v4

    iget v5, p0, Lcom/saterskog/cell_lab/d;->j:I

    int-to-float v5, v5

    div-float/2addr v4, v5

    aput v4, v2, v3

    .line 427
    iget-object v2, p0, Lcom/saterskog/cell_lab/d;->q:[F

    const/16 v3, 0xc

    aput v9, v2, v3

    .line 428
    iget-object v2, p0, Lcom/saterskog/cell_lab/d;->q:[F

    const/16 v3, 0xd

    aput v9, v2, v3

    .line 429
    iget-object v2, p0, Lcom/saterskog/cell_lab/d;->q:[F

    const/16 v3, 0xe

    const/4 v4, 0x0

    aput v4, v2, v3

    .line 430
    iget-object v2, p0, Lcom/saterskog/cell_lab/d;->q:[F

    const/16 v3, 0xf

    iget v4, p0, Lcom/saterskog/cell_lab/d;->x:I

    int-to-double v4, v4

    iget-wide v6, p0, Lcom/saterskog/cell_lab/d;->k:D

    mul-double/2addr v4, v6

    iget-wide v6, p0, Lcom/saterskog/cell_lab/d;->n:D

    mul-double/2addr v4, v6

    double-to-float v4, v4

    iget v5, p0, Lcom/saterskog/cell_lab/d;->j:I

    int-to-float v5, v5

    div-float/2addr v4, v5

    aput v4, v2, v3

    .line 432
    iget-object v2, p0, Lcom/saterskog/cell_lab/d;->q:[F

    const/16 v3, 0x10

    aput v9, v2, v3

    .line 433
    iget-object v2, p0, Lcom/saterskog/cell_lab/d;->q:[F

    const/16 v3, 0x11

    aput v8, v2, v3

    .line 434
    iget-object v2, p0, Lcom/saterskog/cell_lab/d;->q:[F

    const/16 v3, 0x12

    iget v4, p0, Lcom/saterskog/cell_lab/d;->w:I

    int-to-double v4, v4

    iget-wide v6, p0, Lcom/saterskog/cell_lab/d;->k:D

    mul-double/2addr v4, v6

    iget-wide v6, p0, Lcom/saterskog/cell_lab/d;->n:D

    mul-double/2addr v4, v6

    double-to-float v4, v4

    iget v5, p0, Lcom/saterskog/cell_lab/d;->i:I

    int-to-float v5, v5

    div-float/2addr v4, v5

    aput v4, v2, v3

    .line 435
    iget-object v2, p0, Lcom/saterskog/cell_lab/d;->q:[F

    const/16 v3, 0x13

    aput v8, v2, v3

    .line 437
    iget-object v2, p0, Lcom/saterskog/cell_lab/d;->q:[F

    const/16 v3, 0x14

    aput v8, v2, v3

    .line 438
    iget-object v2, p0, Lcom/saterskog/cell_lab/d;->q:[F

    const/16 v3, 0x15

    aput v8, v2, v3

    .line 439
    iget-object v2, p0, Lcom/saterskog/cell_lab/d;->q:[F

    const/16 v3, 0x16

    aput v8, v2, v3

    .line 440
    iget-object v2, p0, Lcom/saterskog/cell_lab/d;->q:[F

    const/16 v3, 0x17

    iget v4, p0, Lcom/saterskog/cell_lab/d;->x:I

    int-to-double v4, v4

    iget-wide v6, p0, Lcom/saterskog/cell_lab/d;->k:D

    mul-double/2addr v4, v6

    iget-wide v6, p0, Lcom/saterskog/cell_lab/d;->n:D

    mul-double/2addr v4, v6

    double-to-float v4, v4

    iget v5, p0, Lcom/saterskog/cell_lab/d;->j:I

    int-to-float v5, v5

    div-float/2addr v4, v5

    sub-float v4, v8, v4

    aput v4, v2, v3

    .line 441
    const/16 v2, 0x60

    invoke-static {v2}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v2

    .line 444
    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 445
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->asFloatBuffer()Ljava/nio/FloatBuffer;

    move-result-object v2

    iput-object v2, p0, Lcom/saterskog/cell_lab/d;->s:Ljava/nio/FloatBuffer;

    .line 446
    iget-object v2, p0, Lcom/saterskog/cell_lab/d;->s:Ljava/nio/FloatBuffer;

    iget-object v3, p0, Lcom/saterskog/cell_lab/d;->q:[F

    const/16 v4, 0x18

    invoke-virtual {v2, v3, v1, v4}, Ljava/nio/FloatBuffer;->put([FII)Ljava/nio/FloatBuffer;

    .line 447
    iget-object v2, p0, Lcom/saterskog/cell_lab/d;->s:Ljava/nio/FloatBuffer;

    invoke-virtual {v2, v1}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    .line 452
    iget-boolean v2, p0, Lcom/saterskog/cell_lab/d;->E:Z

    .line 1133
    new-array v3, v10, [I

    .line 1135
    invoke-static {v10, v3, v1}, Landroid/opengl/GLES20;->glGenFramebuffers(I[II)V

    .line 1136
    aget v4, v3, v1

    iput v4, p0, Lcom/saterskog/cell_lab/d;->B:I

    .line 1139
    invoke-static {v10, v3, v1}, Landroid/opengl/GLES20;->glGenTextures(I[II)V

    .line 1140
    aget v4, v3, v1

    iput v4, p0, Lcom/saterskog/cell_lab/d;->C:I

    .line 1143
    invoke-static {v10, v3, v1}, Landroid/opengl/GLES20;->glGenRenderbuffers(I[II)V

    .line 1144
    aget v3, v3, v1

    iput v3, p0, Lcom/saterskog/cell_lab/d;->D:I

    .line 1147
    const v3, 0x8d40

    iget v4, p0, Lcom/saterskog/cell_lab/d;->B:I

    invoke-static {v3, v4}, Landroid/opengl/GLES20;->glBindFramebuffer(II)V

    .line 1150
    iget v3, p0, Lcom/saterskog/cell_lab/d;->C:I

    invoke-static {v0, v3}, Landroid/opengl/GLES20;->glBindTexture(II)V

    .line 1153
    if-eqz v2, :cond_2

    .line 1154
    const/16 v2, 0x1908

    iget v3, p0, Lcom/saterskog/cell_lab/d;->i:I

    iget v4, p0, Lcom/saterskog/cell_lab/d;->j:I

    const/16 v6, 0x1908

    const/16 v7, 0x1401

    const/4 v8, 0x0

    move v5, v1

    invoke-static/range {v0 .. v8}, Landroid/opengl/GLES20;->glTexImage2D(IIIIIIIILjava/nio/Buffer;)V

    .line 1157
    :goto_0
    invoke-static {}, Landroid/opengl/GLES20;->glGetError()I

    move-result v2

    if-eqz v2, :cond_3

    .line 1159
    iget-object v2, p0, Lcom/saterskog/cell_lab/d;->h:Landroid/content/Context;

    instance-of v2, v2, Landroid/app/Activity;

    if-eqz v2, :cond_0

    .line 1161
    iget-object v2, p0, Lcom/saterskog/cell_lab/d;->h:Landroid/content/Context;

    check-cast v2, Landroid/app/Activity;

    new-instance v3, Lcom/saterskog/cell_lab/d$1;

    invoke-direct {v3, p0}, Lcom/saterskog/cell_lab/d$1;-><init>(Lcom/saterskog/cell_lab/d;)V

    invoke-virtual {v2, v3}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 1171
    :cond_0
    const-wide/high16 v2, -0x4010000000000000L    # -1.0

    iput-wide v2, p0, Lcom/saterskog/cell_lab/d;->k:D

    .line 1173
    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glBindTexture(II)V

    .line 1174
    const v0, 0x8d41

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glBindRenderbuffer(II)V

    .line 1175
    const v0, 0x8d40

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glBindFramebuffer(II)V

    .line 454
    :cond_1
    :goto_1
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/d;->b()V

    .line 455
    invoke-static {v1, v1, p2, p3}, Landroid/opengl/GLES20;->glViewport(IIII)V

    .line 457
    return-void

    .line 1156
    :cond_2
    const/16 v2, 0x1907

    iget v3, p0, Lcom/saterskog/cell_lab/d;->i:I

    iget v4, p0, Lcom/saterskog/cell_lab/d;->j:I

    const/16 v6, 0x1907

    const/16 v7, 0x1401

    const/4 v8, 0x0

    move v5, v1

    invoke-static/range {v0 .. v8}, Landroid/opengl/GLES20;->glTexImage2D(IIIIIIIILjava/nio/Buffer;)V

    goto :goto_0

    .line 1179
    :cond_3
    const/16 v2, 0x2802

    const v3, 0x812f

    invoke-static {v0, v2, v3}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    .line 1180
    const/16 v2, 0x2803

    const v3, 0x812f

    invoke-static {v0, v2, v3}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    .line 1181
    const/16 v2, 0x2800

    const/16 v3, 0x2601

    invoke-static {v0, v2, v3}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    .line 1183
    const/16 v2, 0x2801

    const/16 v3, 0x2601

    invoke-static {v0, v2, v3}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    .line 1186
    const v2, 0x8d41

    iget v3, p0, Lcom/saterskog/cell_lab/d;->D:I

    invoke-static {v2, v3}, Landroid/opengl/GLES20;->glBindRenderbuffer(II)V

    .line 1187
    const v2, 0x8d41

    const v3, 0x81a5

    iget v4, p0, Lcom/saterskog/cell_lab/d;->i:I

    iget v5, p0, Lcom/saterskog/cell_lab/d;->j:I

    invoke-static {v2, v3, v4, v5}, Landroid/opengl/GLES20;->glRenderbufferStorage(IIII)V

    .line 1189
    const v2, 0x8d40

    const v3, 0x8ce0

    iget v4, p0, Lcom/saterskog/cell_lab/d;->C:I

    invoke-static {v2, v3, v0, v4, v1}, Landroid/opengl/GLES20;->glFramebufferTexture2D(IIIII)V

    .line 1191
    const v2, 0x8d40

    const v3, 0x8d00

    const v4, 0x8d41

    iget v5, p0, Lcom/saterskog/cell_lab/d;->D:I

    invoke-static {v2, v3, v4, v5}, Landroid/opengl/GLES20;->glFramebufferRenderbuffer(IIII)V

    .line 1193
    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glBindTexture(II)V

    .line 1194
    const v0, 0x8d41

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glBindRenderbuffer(II)V

    .line 1195
    const v0, 0x8d40

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glBindFramebuffer(II)V

    goto :goto_1
.end method
