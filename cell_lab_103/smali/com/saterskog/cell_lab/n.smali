.class public final Lcom/saterskog/cell_lab/n;
.super Lcom/saterskog/cell_lab/d;
.source "SourceFile"


# static fields
.field private static y:F


# instance fields
.field p:Lcom/saterskog/cell_lab/CellWorld;

.field q:D

.field r:D

.field s:[F

.field t:Z

.field public u:D

.field v:[Lcom/saterskog/cell_lab/Gene;

.field w:I

.field x:Lcom/saterskog/cell_lab/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 16
    const v0, 0x3f8ccccd    # 1.1f

    sput v0, Lcom/saterskog/cell_lab/n;->y:F

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 10

    .prologue
    const/4 v7, 0x0

    const-wide/high16 v8, 0x3ff0000000000000L    # 1.0

    const/4 v6, 0x1

    const-wide/16 v4, 0x0

    .line 29
    sget v0, Lcom/saterskog/cell_lab/n;->y:F

    invoke-direct {p0, v0, v6, p1}, Lcom/saterskog/cell_lab/d;-><init>(FZLandroid/content/Context;)V

    .line 20
    const/4 v0, 0x3

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    iput-object v0, p0, Lcom/saterskog/cell_lab/n;->s:[F

    .line 22
    iput-wide v4, p0, Lcom/saterskog/cell_lab/n;->u:D

    .line 25
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/saterskog/cell_lab/n;->x:Lcom/saterskog/cell_lab/c;

    .line 31
    new-instance v0, Lcom/saterskog/cell_lab/Environment;

    invoke-direct {v0}, Lcom/saterskog/cell_lab/Environment;-><init>()V

    .line 32
    iput-wide v4, v0, Lcom/saterskog/cell_lab/Environment;->c:D

    .line 33
    iput-wide v4, v0, Lcom/saterskog/cell_lab/Environment;->a:D

    .line 34
    iput-wide v4, v0, Lcom/saterskog/cell_lab/Environment;->f:D

    .line 35
    iput-wide v8, v0, Lcom/saterskog/cell_lab/Environment;->z:D

    .line 36
    iput-wide v4, v0, Lcom/saterskog/cell_lab/Environment;->i:D

    .line 37
    iput-boolean v6, v0, Lcom/saterskog/cell_lab/Environment;->x:Z

    .line 38
    const-wide v2, 0x4052c00000000000L    # 75.0

    iput-wide v2, v0, Lcom/saterskog/cell_lab/Environment;->g:D

    .line 39
    const/4 v1, 0x0

    iput v1, v0, Lcom/saterskog/cell_lab/Environment;->s:I

    .line 40
    const/16 v1, 0x80

    iput v1, v0, Lcom/saterskog/cell_lab/Environment;->r:I

    .line 41
    iput-wide v8, v0, Lcom/saterskog/cell_lab/Environment;->k:D

    .line 42
    new-instance v1, Lcom/saterskog/cell_lab/CellWorld;

    invoke-direct {v1, v6, v0}, Lcom/saterskog/cell_lab/CellWorld;-><init>(ZLcom/saterskog/cell_lab/Environment;)V

    iput-object v1, p0, Lcom/saterskog/cell_lab/n;->p:Lcom/saterskog/cell_lab/CellWorld;

    .line 43
    iput v7, p0, Lcom/saterskog/cell_lab/n;->b:F

    .line 44
    iput v7, p0, Lcom/saterskog/cell_lab/n;->c:F

    .line 45
    const/high16 v0, 0x41000000    # 8.0f

    iput v0, p0, Lcom/saterskog/cell_lab/n;->d:F

    .line 46
    iput-wide v4, p0, Lcom/saterskog/cell_lab/n;->u:D

    .line 47
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/saterskog/cell_lab/n;->e:F

    .line 48
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/n;->b()V

    .line 50
    return-void

    .line 20
    :array_0
    .array-data 4
        0x3f4ccccd    # 0.8f
        0x3f4ccccd    # 0.8f
        0x3f800000    # 1.0f
    .end array-data
.end method


# virtual methods
.method public final a(FF)V
    .locals 2

    .prologue
    .line 202
    iget-boolean v0, p0, Lcom/saterskog/cell_lab/n;->l:Z

    if-nez v0, :cond_0

    .line 207
    :goto_0
    return-void

    .line 203
    :cond_0
    iget v0, p0, Lcom/saterskog/cell_lab/n;->b:F

    iget v1, p0, Lcom/saterskog/cell_lab/n;->a:F

    div-float v1, p1, v1

    sub-float/2addr v0, v1

    iput v0, p0, Lcom/saterskog/cell_lab/n;->b:F

    .line 204
    iget v0, p0, Lcom/saterskog/cell_lab/n;->c:F

    iget v1, p0, Lcom/saterskog/cell_lab/n;->a:F

    div-float v1, p2, v1

    add-float/2addr v0, v1

    iput v0, p0, Lcom/saterskog/cell_lab/n;->c:F

    .line 205
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/n;->b()V

    goto :goto_0
.end method

.method public final a(FFF)V
    .locals 7

    .prologue
    const/high16 v6, 0x3f800000    # 1.0f

    .line 209
    iget-boolean v0, p0, Lcom/saterskog/cell_lab/n;->l:Z

    if-nez v0, :cond_0

    .line 217
    :goto_0
    return-void

    .line 210
    :cond_0
    iget v0, p0, Lcom/saterskog/cell_lab/n;->d:F

    mul-float/2addr v0, p1

    iput v0, p0, Lcom/saterskog/cell_lab/n;->d:F

    .line 212
    iget v0, p0, Lcom/saterskog/cell_lab/n;->b:F

    float-to-double v0, v0

    invoke-virtual {p0, p2}, Lcom/saterskog/cell_lab/n;->a(F)D

    move-result-wide v2

    iget v4, p0, Lcom/saterskog/cell_lab/n;->b:F

    float-to-double v4, v4

    sub-double/2addr v2, v4

    sub-float v4, p1, v6

    float-to-double v4, v4

    mul-double/2addr v2, v4

    add-double/2addr v0, v2

    double-to-float v0, v0

    iput v0, p0, Lcom/saterskog/cell_lab/n;->b:F

    .line 213
    iget v0, p0, Lcom/saterskog/cell_lab/n;->c:F

    float-to-double v0, v0

    invoke-virtual {p0, p3}, Lcom/saterskog/cell_lab/n;->b(F)D

    move-result-wide v2

    iget v4, p0, Lcom/saterskog/cell_lab/n;->c:F

    float-to-double v4, v4

    sub-double/2addr v2, v4

    sub-float v4, p1, v6

    float-to-double v4, v4

    mul-double/2addr v2, v4

    add-double/2addr v0, v2

    double-to-float v0, v0

    iput v0, p0, Lcom/saterskog/cell_lab/n;->c:F

    .line 215
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/n;->b()V

    goto :goto_0
.end method

.method public final a([F)V
    .locals 10

    .prologue
    .line 74
    const v0, 0x3e008081

    const v1, 0x3e008081

    const v2, 0x3e008081

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Landroid/opengl/GLES20;->glClearColor(FFFF)V

    .line 79
    const/4 v0, 0x1

    invoke-static {v0}, Landroid/opengl/GLES20;->glDepthMask(Z)V

    .line 87
    const/16 v0, 0x4100

    invoke-static {v0}, Landroid/opengl/GLES20;->glClear(I)V

    .line 90
    const/16 v0, 0x10

    new-array v4, v0, [F

    const/4 v0, 0x0

    const/high16 v1, 0x40000000    # 2.0f

    iget v2, p0, Lcom/saterskog/cell_lab/n;->f:F

    div-float/2addr v1, v2

    aput v1, v4, v0

    const/4 v0, 0x1

    const/4 v1, 0x0

    aput v1, v4, v0

    const/4 v0, 0x2

    const/4 v1, 0x0

    aput v1, v4, v0

    const/4 v0, 0x3

    const/4 v1, 0x0

    aput v1, v4, v0

    const/4 v0, 0x4

    const/4 v1, 0x0

    aput v1, v4, v0

    const/4 v0, 0x5

    const/high16 v1, 0x40000000    # 2.0f

    iget v2, p0, Lcom/saterskog/cell_lab/n;->g:F

    div-float/2addr v1, v2

    aput v1, v4, v0

    const/4 v0, 0x6

    const/4 v1, 0x0

    aput v1, v4, v0

    const/4 v0, 0x7

    const/4 v1, 0x0

    aput v1, v4, v0

    const/16 v0, 0x8

    const/4 v1, 0x0

    aput v1, v4, v0

    const/16 v0, 0x9

    const/4 v1, 0x0

    aput v1, v4, v0

    const/16 v0, 0xa

    const/high16 v1, 0x3f800000    # 1.0f

    aput v1, v4, v0

    const/16 v0, 0xb

    const/4 v1, 0x0

    aput v1, v4, v0

    const/16 v0, 0xc

    const/high16 v1, -0x40000000    # -2.0f

    iget v2, p0, Lcom/saterskog/cell_lab/n;->b:F

    mul-float/2addr v1, v2

    iget v2, p0, Lcom/saterskog/cell_lab/n;->f:F

    div-float/2addr v1, v2

    aput v1, v4, v0

    const/16 v0, 0xd

    const/high16 v1, -0x40000000    # -2.0f

    iget v2, p0, Lcom/saterskog/cell_lab/n;->c:F

    mul-float/2addr v1, v2

    iget v2, p0, Lcom/saterskog/cell_lab/n;->g:F

    div-float/2addr v1, v2

    aput v1, v4, v0

    const/16 v0, 0xe

    const/4 v1, 0x0

    aput v1, v4, v0

    const/16 v0, 0xf

    const/high16 v1, 0x3f800000    # 1.0f

    aput v1, v4, v0

    .line 96
    const/16 v0, 0x10

    new-array v1, v0, [F

    .line 97
    const/4 v0, 0x0

    move v3, v0

    :goto_0
    const/4 v0, 0x4

    if-ge v3, v0, :cond_2

    .line 98
    const/4 v0, 0x0

    move v2, v0

    :goto_1
    const/4 v0, 0x4

    if-ge v2, v0, :cond_1

    .line 99
    mul-int/lit8 v0, v2, 0x4

    add-int/2addr v0, v3

    const/4 v5, 0x0

    aput v5, v1, v0

    .line 100
    const/4 v0, 0x0

    :goto_2
    const/4 v5, 0x4

    if-ge v0, v5, :cond_0

    .line 101
    mul-int/lit8 v5, v2, 0x4

    add-int/2addr v5, v3

    aget v6, v1, v5

    mul-int/lit8 v7, v2, 0x4

    add-int/2addr v7, v0

    aget v7, v4, v7

    mul-int/lit8 v8, v0, 0x4

    add-int/2addr v8, v3

    aget v8, p1, v8

    mul-float/2addr v7, v8

    add-float/2addr v6, v7

    aput v6, v1, v5

    .line 100
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 98
    :cond_0
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_1

    .line 97
    :cond_1
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_0

    .line 104
    :cond_2
    iget-boolean v0, p0, Lcom/saterskog/cell_lab/n;->t:Z

    if-nez v0, :cond_a

    .line 105
    iget-object v0, p0, Lcom/saterskog/cell_lab/n;->p:Lcom/saterskog/cell_lab/CellWorld;

    invoke-virtual {v0}, Lcom/saterskog/cell_lab/CellWorld;->a()V

    .line 106
    iget-object v0, p0, Lcom/saterskog/cell_lab/n;->v:[Lcom/saterskog/cell_lab/Gene;

    if-eqz v0, :cond_7

    .line 107
    new-instance v2, Lcom/saterskog/cell_lab/Cell;

    invoke-direct {v2}, Lcom/saterskog/cell_lab/Cell;-><init>()V

    .line 108
    iget-object v0, p0, Lcom/saterskog/cell_lab/n;->v:[Lcom/saterskog/cell_lab/Gene;

    iput-object v0, v2, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    .line 109
    const-wide/16 v4, 0x0

    iput-wide v4, v2, Lcom/saterskog/cell_lab/Cell;->b:D

    .line 110
    const-wide/16 v4, 0x0

    iput-wide v4, v2, Lcom/saterskog/cell_lab/Cell;->c:D

    .line 113
    const/4 v0, 0x0

    iput v0, v2, Lcom/saterskog/cell_lab/Cell;->D:I

    .line 114
    const/4 v0, 0x0

    :goto_3
    const/16 v3, 0x28

    if-ge v0, v3, :cond_4

    .line 115
    iget-object v3, v2, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    aget-object v3, v3, v0

    iget-boolean v3, v3, Lcom/saterskog/cell_lab/Gene;->p:Z

    if-eqz v3, :cond_3

    iput v0, v2, Lcom/saterskog/cell_lab/Cell;->D:I

    .line 114
    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    .line 121
    :cond_4
    const-wide v4, 0x3fd26e978d4fdf3bL    # 0.288

    iput-wide v4, v2, Lcom/saterskog/cell_lab/Cell;->w:D

    .line 122
    iget-object v0, v2, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    iget v3, v2, Lcom/saterskog/cell_lab/Cell;->D:I

    aget-object v0, v0, v3

    iget-object v0, v0, Lcom/saterskog/cell_lab/Gene;->s:Lcom/saterskog/cell_lab/h;

    sget-object v3, Lcom/saterskog/cell_lab/h;->e:Lcom/saterskog/cell_lab/h;

    if-ne v0, v3, :cond_5

    const v0, 0x3fe66666    # 1.8f

    iput v0, v2, Lcom/saterskog/cell_lab/Cell;->S:F

    .line 123
    :cond_5
    iget-wide v4, v2, Lcom/saterskog/cell_lab/Cell;->w:D

    const-wide/high16 v6, 0x4079000000000000L    # 400.0

    div-double/2addr v4, v6

    invoke-static {v4, v5}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v4

    iput-wide v4, v2, Lcom/saterskog/cell_lab/Cell;->d:D

    .line 124
    iget-object v0, v2, Lcom/saterskog/cell_lab/Cell;->J:[F

    const/4 v3, 0x0

    iget-object v4, v2, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    iget v5, v2, Lcom/saterskog/cell_lab/Cell;->D:I

    aget-object v4, v4, v5

    iget-object v4, v4, Lcom/saterskog/cell_lab/Gene;->a:[F

    const/4 v5, 0x0

    aget v4, v4, v5

    aput v4, v0, v3

    .line 125
    iget-object v0, v2, Lcom/saterskog/cell_lab/Cell;->J:[F

    const/4 v3, 0x1

    iget-object v4, v2, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    iget v5, v2, Lcom/saterskog/cell_lab/Cell;->D:I

    aget-object v4, v4, v5

    iget-object v4, v4, Lcom/saterskog/cell_lab/Gene;->a:[F

    const/4 v5, 0x1

    aget v4, v4, v5

    aput v4, v0, v3

    .line 126
    iget-object v0, v2, Lcom/saterskog/cell_lab/Cell;->J:[F

    const/4 v3, 0x2

    iget-object v4, v2, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    iget v5, v2, Lcom/saterskog/cell_lab/Cell;->D:I

    aget-object v4, v4, v5

    iget-object v4, v4, Lcom/saterskog/cell_lab/Gene;->a:[F

    const/4 v5, 0x2

    aget v4, v4, v5

    aput v4, v0, v3

    .line 127
    iget-object v0, v2, Lcom/saterskog/cell_lab/Cell;->J:[F

    const/4 v3, 0x3

    const/high16 v4, 0x3f800000    # 1.0f

    aput v4, v0, v3

    .line 128
    const-wide/16 v4, 0x0

    iput-wide v4, v2, Lcom/saterskog/cell_lab/Cell;->e:D

    .line 129
    const-wide/16 v4, 0x0

    iput-wide v4, v2, Lcom/saterskog/cell_lab/Cell;->f:D

    .line 130
    const-wide/16 v4, 0x0

    iput-wide v4, v2, Lcom/saterskog/cell_lab/Cell;->l:D

    .line 131
    const-wide/16 v4, 0x0

    iput-wide v4, v2, Lcom/saterskog/cell_lab/Cell;->n:D

    .line 132
    const-wide/16 v4, 0x0

    iput-wide v4, v2, Lcom/saterskog/cell_lab/Cell;->k:D

    .line 133
    const-wide/16 v4, 0x0

    iput-wide v4, v2, Lcom/saterskog/cell_lab/Cell;->m:D

    .line 134
    const/4 v0, 0x0

    iput v0, v2, Lcom/saterskog/cell_lab/Cell;->C:I

    .line 135
    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    iput-wide v4, v2, Lcom/saterskog/cell_lab/Cell;->p:D

    .line 136
    const/4 v0, -0x1

    iput v0, v2, Lcom/saterskog/cell_lab/Cell;->T:I

    .line 137
    const/4 v0, 0x0

    iput v0, v2, Lcom/saterskog/cell_lab/Cell;->r:F

    .line 138
    const/4 v0, 0x0

    :goto_4
    const/4 v3, 0x4

    if-ge v0, v3, :cond_6

    iget-object v3, v2, Lcom/saterskog/cell_lab/Cell;->U:[F

    const v4, 0x3c23d70a    # 0.01f

    aput v4, v3, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_4

    .line 139
    :cond_6
    const/4 v0, 0x0

    iput-boolean v0, v2, Lcom/saterskog/cell_lab/Cell;->y:Z

    .line 140
    iget-object v0, p0, Lcom/saterskog/cell_lab/n;->p:Lcom/saterskog/cell_lab/CellWorld;

    invoke-virtual {v0, v2}, Lcom/saterskog/cell_lab/CellWorld;->a(Lcom/saterskog/cell_lab/Cell;)Z

    .line 142
    :cond_7
    const/4 v2, 0x0

    .line 143
    iget-object v0, p0, Lcom/saterskog/cell_lab/n;->p:Lcom/saterskog/cell_lab/CellWorld;

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->Y:Lcom/saterskog/b/d;

    .line 5032
    const-wide/16 v4, 0x539

    invoke-virtual {v0, v4, v5}, Lcom/saterskog/b/d;->setSeed(J)V

    .line 144
    const/4 v0, 0x0

    :goto_5
    iget-wide v4, p0, Lcom/saterskog/cell_lab/n;->u:D

    const-wide v6, 0x3f947ae147ae147bL    # 0.02

    div-double/2addr v4, v6

    double-to-int v3, v4

    if-ge v0, v3, :cond_9

    const/16 v3, 0x14

    if-gt v2, v3, :cond_9

    .line 145
    iget-object v3, p0, Lcom/saterskog/cell_lab/n;->p:Lcom/saterskog/cell_lab/CellWorld;

    const/4 v4, 0x0

    const-wide/high16 v6, 0x3ff0000000000000L    # 1.0

    invoke-virtual {v3, v4, v6, v7}, Lcom/saterskog/cell_lab/CellWorld;->a(ZD)V

    .line 146
    iget-object v3, p0, Lcom/saterskog/cell_lab/n;->p:Lcom/saterskog/cell_lab/CellWorld;

    iget v3, v3, Lcom/saterskog/cell_lab/CellWorld;->z:I

    const/16 v4, 0x40

    if-lt v3, v4, :cond_8

    .line 147
    add-int/lit8 v2, v2, 0x1

    .line 144
    :cond_8
    add-int/lit8 v0, v0, 0x1

    goto :goto_5

    .line 149
    :cond_9
    iget-object v0, p0, Lcom/saterskog/cell_lab/n;->p:Lcom/saterskog/cell_lab/CellWorld;

    const/4 v2, 0x1

    const-wide/16 v4, 0x0

    invoke-virtual {v0, v2, v4, v5}, Lcom/saterskog/cell_lab/CellWorld;->a(ZD)V

    .line 150
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/saterskog/cell_lab/n;->t:Z

    .line 153
    :cond_a
    const/16 v0, 0xbe2

    invoke-static {v0}, Landroid/opengl/GLES20;->glDisable(I)V

    .line 154
    const/4 v0, 0x0

    invoke-static {v0}, Landroid/opengl/GLES20;->glDepthMask(Z)V

    .line 156
    const/4 v0, 0x0

    move v6, v0

    :goto_6
    iget-object v0, p0, Lcom/saterskog/cell_lab/n;->p:Lcom/saterskog/cell_lab/CellWorld;

    iget v0, v0, Lcom/saterskog/cell_lab/CellWorld;->z:I

    if-ge v6, v0, :cond_c

    .line 158
    iget-object v0, p0, Lcom/saterskog/cell_lab/n;->p:Lcom/saterskog/cell_lab/CellWorld;

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    aget-object v0, v0, v6

    iget v0, v0, Lcom/saterskog/cell_lab/Cell;->D:I

    iget v2, p0, Lcom/saterskog/cell_lab/n;->w:I

    if-ne v0, v2, :cond_b

    .line 159
    iget-object v0, p0, Lcom/saterskog/cell_lab/n;->p:Lcom/saterskog/cell_lab/CellWorld;

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    aget-object v0, v0, v6

    iget-wide v2, v0, Lcom/saterskog/cell_lab/Cell;->b:D

    double-to-float v2, v2

    iget-object v0, p0, Lcom/saterskog/cell_lab/n;->p:Lcom/saterskog/cell_lab/CellWorld;

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    aget-object v0, v0, v6

    iget-wide v4, v0, Lcom/saterskog/cell_lab/Cell;->c:D

    double-to-float v3, v4

    iget-object v0, p0, Lcom/saterskog/cell_lab/n;->p:Lcom/saterskog/cell_lab/CellWorld;

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    aget-object v0, v0, v6

    iget-wide v4, v0, Lcom/saterskog/cell_lab/Cell;->d:D

    const-wide v8, 0x3f847ae147ae147bL    # 0.01

    add-double/2addr v4, v8

    double-to-float v4, v4

    const v5, 0x3e99999a    # 0.3f

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Lcom/saterskog/cell_lab/n;->a([FFFFF)V

    .line 156
    :cond_b
    add-int/lit8 v0, v6, 0x1

    move v6, v0

    goto :goto_6

    .line 164
    :cond_c
    iget-object v0, p0, Lcom/saterskog/cell_lab/n;->p:Lcom/saterskog/cell_lab/CellWorld;

    iget v2, p0, Lcom/saterskog/cell_lab/n;->b:F

    iget v3, p0, Lcom/saterskog/cell_lab/n;->f:F

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    sub-float/2addr v2, v3

    iget v3, p0, Lcom/saterskog/cell_lab/n;->b:F

    iget v4, p0, Lcom/saterskog/cell_lab/n;->f:F

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    add-float/2addr v3, v4

    iget v4, p0, Lcom/saterskog/cell_lab/n;->c:F

    iget v5, p0, Lcom/saterskog/cell_lab/n;->g:F

    const/high16 v6, 0x40000000    # 2.0f

    div-float/2addr v5, v6

    sub-float/2addr v4, v5

    iget v5, p0, Lcom/saterskog/cell_lab/n;->c:F

    iget v6, p0, Lcom/saterskog/cell_lab/n;->g:F

    const/high16 v7, 0x40000000    # 2.0f

    div-float/2addr v6, v7

    add-float/2addr v5, v6

    invoke-virtual {v0, v2, v3, v4, v5}, Lcom/saterskog/cell_lab/CellWorld;->a(FFFF)V

    .line 165
    iget-object v0, p0, Lcom/saterskog/cell_lab/n;->p:Lcom/saterskog/cell_lab/CellWorld;

    .line 6022
    const/16 v2, 0xb71

    invoke-static {v2}, Landroid/opengl/GLES20;->glDisable(I)V

    .line 6023
    const/4 v2, 0x0

    invoke-static {v2}, Landroid/opengl/GLES20;->glDepthMask(Z)V

    .line 6025
    const/16 v2, 0xbe2

    invoke-static {v2}, Landroid/opengl/GLES20;->glEnable(I)V

    .line 6027
    const/16 v2, 0x302

    const/16 v3, 0x303

    invoke-static {v2, v3}, Landroid/opengl/GLES20;->glBlendFunc(II)V

    .line 6030
    const/16 v2, 0x207

    invoke-static {v2}, Landroid/opengl/GLES20;->glDepthFunc(I)V

    .line 6032
    invoke-virtual {v0, v1}, Lcom/saterskog/cell_lab/CellWorld;->b([F)V

    .line 6033
    const/16 v2, 0xb71

    invoke-static {v2}, Landroid/opengl/GLES20;->glEnable(I)V

    .line 6034
    const/16 v2, 0xbe2

    invoke-static {v2}, Landroid/opengl/GLES20;->glDisable(I)V

    .line 6035
    const/4 v2, 0x1

    invoke-static {v2}, Landroid/opengl/GLES20;->glDepthMask(Z)V

    .line 6038
    invoke-virtual {v0, v1}, Lcom/saterskog/cell_lab/CellWorld;->d([F)V

    .line 6039
    invoke-virtual {v0, v1}, Lcom/saterskog/cell_lab/CellWorld;->c([F)V

    .line 6040
    const/16 v2, 0xb71

    invoke-static {v2}, Landroid/opengl/GLES20;->glEnable(I)V

    .line 6041
    const/16 v2, 0x201

    invoke-static {v2}, Landroid/opengl/GLES20;->glDepthFunc(I)V

    .line 6042
    const/16 v2, 0xbe2

    invoke-static {v2}, Landroid/opengl/GLES20;->glEnable(I)V

    .line 6043
    const/4 v2, 0x0

    invoke-static {v2}, Landroid/opengl/GLES20;->glDepthMask(Z)V

    .line 6044
    invoke-virtual {v0, v1}, Lcom/saterskog/cell_lab/CellWorld;->e([F)V

    .line 171
    return-void
.end method

.method public final onSurfaceCreated(Ljavax/microedition/khronos/opengles/GL10;Ljavax/microedition/khronos/egl/EGLConfig;)V
    .locals 2

    .prologue
    const/high16 v1, 0x3f800000    # 1.0f

    const v0, 0x3f4ccccd    # 0.8f

    .line 57
    invoke-static {v0, v0, v1, v1}, Landroid/opengl/GLES20;->glClearColor(FFFF)V

    .line 59
    iget-object v0, p0, Lcom/saterskog/cell_lab/n;->p:Lcom/saterskog/cell_lab/CellWorld;

    iget-object v1, p0, Lcom/saterskog/cell_lab/n;->h:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/saterskog/cell_lab/CellWorld;->a(Landroid/content/Context;)V

    .line 60
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/n;->a()V

    .line 62
    return-void
.end method
