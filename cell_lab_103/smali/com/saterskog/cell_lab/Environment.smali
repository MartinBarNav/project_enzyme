.class public Lcom/saterskog/cell_lab/Environment;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field static final A:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/saterskog/cell_lab/Environment;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field a:D

.field b:D

.field c:D

.field d:D

.field e:D

.field f:D

.field g:D

.field h:D

.field i:D

.field j:D

.field k:D

.field l:D

.field m:D

.field n:F

.field o:F

.field p:D

.field q:D

.field r:I

.field s:I

.field t:[Z

.field u:Z

.field v:Z

.field w:Z

.field x:Z

.field y:Z

.field z:D


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 248
    new-instance v0, Lcom/saterskog/cell_lab/Environment$1;

    invoke-direct {v0}, Lcom/saterskog/cell_lab/Environment$1;-><init>()V

    sput-object v0, Lcom/saterskog/cell_lab/Environment;->A:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .prologue
    const-wide/16 v0, 0x0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-wide v0, p0, Lcom/saterskog/cell_lab/Environment;->l:D

    iput-wide v0, p0, Lcom/saterskog/cell_lab/Environment;->m:D

    .line 26
    sget-object v0, Lcom/saterskog/cell_lab/h;->B:[Lcom/saterskog/cell_lab/h;

    array-length v0, v0

    new-array v0, v0, [Z

    iput-object v0, p0, Lcom/saterskog/cell_lab/Environment;->t:[Z

    .line 27
    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 6

    .prologue
    const-wide/16 v4, 0x0

    const/4 v1, 0x0

    const/4 v3, 0x1

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-wide v4, p0, Lcom/saterskog/cell_lab/Environment;->l:D

    iput-wide v4, p0, Lcom/saterskog/cell_lab/Environment;->m:D

    .line 29
    invoke-virtual {p1}, Landroid/os/Parcel;->readDouble()D

    move-result-wide v4

    iput-wide v4, p0, Lcom/saterskog/cell_lab/Environment;->a:D

    .line 30
    invoke-virtual {p1}, Landroid/os/Parcel;->readDouble()D

    move-result-wide v4

    iput-wide v4, p0, Lcom/saterskog/cell_lab/Environment;->b:D

    .line 31
    invoke-virtual {p1}, Landroid/os/Parcel;->readDouble()D

    move-result-wide v4

    iput-wide v4, p0, Lcom/saterskog/cell_lab/Environment;->c:D

    .line 32
    invoke-virtual {p1}, Landroid/os/Parcel;->readDouble()D

    move-result-wide v4

    iput-wide v4, p0, Lcom/saterskog/cell_lab/Environment;->d:D

    .line 33
    invoke-virtual {p1}, Landroid/os/Parcel;->readDouble()D

    move-result-wide v4

    iput-wide v4, p0, Lcom/saterskog/cell_lab/Environment;->e:D

    .line 34
    invoke-virtual {p1}, Landroid/os/Parcel;->readDouble()D

    move-result-wide v4

    iput-wide v4, p0, Lcom/saterskog/cell_lab/Environment;->f:D

    .line 36
    invoke-virtual {p1}, Landroid/os/Parcel;->readDouble()D

    move-result-wide v4

    iput-wide v4, p0, Lcom/saterskog/cell_lab/Environment;->g:D

    .line 37
    sget-object v0, Lcom/saterskog/cell_lab/h;->B:[Lcom/saterskog/cell_lab/h;

    array-length v0, v0

    new-array v0, v0, [Z

    iput-object v0, p0, Lcom/saterskog/cell_lab/Environment;->t:[Z

    move v0, v1

    .line 38
    :goto_0
    sget-object v2, Lcom/saterskog/cell_lab/h;->B:[Lcom/saterskog/cell_lab/h;

    array-length v2, v2

    if-ge v0, v2, :cond_1

    .line 39
    iget-object v4, p0, Lcom/saterskog/cell_lab/Environment;->t:[Z

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    if-eqz v2, :cond_0

    move v2, v3

    :goto_1
    aput-boolean v2, v4, v0

    .line 38
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    move v2, v1

    .line 39
    goto :goto_1

    .line 40
    :cond_1
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_2

    move v0, v3

    :goto_2
    iput-boolean v0, p0, Lcom/saterskog/cell_lab/Environment;->w:Z

    .line 41
    invoke-virtual {p1}, Landroid/os/Parcel;->readDouble()D

    move-result-wide v4

    iput-wide v4, p0, Lcom/saterskog/cell_lab/Environment;->i:D

    .line 42
    invoke-virtual {p1}, Landroid/os/Parcel;->readDouble()D

    move-result-wide v4

    iput-wide v4, p0, Lcom/saterskog/cell_lab/Environment;->h:D

    .line 43
    invoke-virtual {p1}, Landroid/os/Parcel;->readDouble()D

    move-result-wide v4

    iput-wide v4, p0, Lcom/saterskog/cell_lab/Environment;->j:D

    .line 44
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_3

    move v0, v3

    :goto_3
    iput-boolean v0, p0, Lcom/saterskog/cell_lab/Environment;->x:Z

    .line 46
    invoke-virtual {p1}, Landroid/os/Parcel;->readDouble()D

    move-result-wide v4

    iput-wide v4, p0, Lcom/saterskog/cell_lab/Environment;->z:D

    .line 47
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/Environment;->r:I

    .line 48
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/Environment;->s:I

    .line 49
    invoke-virtual {p1}, Landroid/os/Parcel;->readDouble()D

    move-result-wide v4

    iput-wide v4, p0, Lcom/saterskog/cell_lab/Environment;->k:D

    .line 50
    invoke-virtual {p1}, Landroid/os/Parcel;->readDouble()D

    move-result-wide v4

    iput-wide v4, p0, Lcom/saterskog/cell_lab/Environment;->m:D

    .line 51
    invoke-virtual {p1}, Landroid/os/Parcel;->readDouble()D

    move-result-wide v4

    iput-wide v4, p0, Lcom/saterskog/cell_lab/Environment;->l:D

    .line 52
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-ne v0, v3, :cond_4

    move v0, v3

    :goto_4
    iput-boolean v0, p0, Lcom/saterskog/cell_lab/Environment;->u:Z

    .line 53
    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/Environment;->n:F

    .line 54
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-ne v0, v3, :cond_5

    move v0, v3

    :goto_5
    iput-boolean v0, p0, Lcom/saterskog/cell_lab/Environment;->v:Z

    .line 55
    invoke-virtual {p1}, Landroid/os/Parcel;->readDouble()D

    move-result-wide v4

    iput-wide v4, p0, Lcom/saterskog/cell_lab/Environment;->p:D

    .line 56
    invoke-virtual {p1}, Landroid/os/Parcel;->readDouble()D

    move-result-wide v4

    iput-wide v4, p0, Lcom/saterskog/cell_lab/Environment;->q:D

    .line 57
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-ne v0, v3, :cond_6

    :goto_6
    iput-boolean v3, p0, Lcom/saterskog/cell_lab/Environment;->y:Z

    .line 58
    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/Environment;->o:F

    .line 59
    return-void

    :cond_2
    move v0, v1

    .line 40
    goto :goto_2

    :cond_3
    move v0, v1

    .line 44
    goto :goto_3

    :cond_4
    move v0, v1

    .line 52
    goto :goto_4

    :cond_5
    move v0, v1

    .line 54
    goto :goto_5

    :cond_6
    move v3, v1

    .line 57
    goto :goto_6
.end method


# virtual methods
.method public final a(Lcom/saterskog/cell_lab/Environment;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 61
    iget-wide v0, p1, Lcom/saterskog/cell_lab/Environment;->a:D

    iput-wide v0, p0, Lcom/saterskog/cell_lab/Environment;->a:D

    .line 62
    iget-wide v0, p1, Lcom/saterskog/cell_lab/Environment;->b:D

    iput-wide v0, p0, Lcom/saterskog/cell_lab/Environment;->b:D

    .line 63
    iget-wide v0, p1, Lcom/saterskog/cell_lab/Environment;->c:D

    iput-wide v0, p0, Lcom/saterskog/cell_lab/Environment;->c:D

    .line 64
    iget-wide v0, p1, Lcom/saterskog/cell_lab/Environment;->d:D

    iput-wide v0, p0, Lcom/saterskog/cell_lab/Environment;->d:D

    .line 65
    iget-wide v0, p1, Lcom/saterskog/cell_lab/Environment;->e:D

    iput-wide v0, p0, Lcom/saterskog/cell_lab/Environment;->e:D

    .line 68
    iget-wide v0, p1, Lcom/saterskog/cell_lab/Environment;->g:D

    iput-wide v0, p0, Lcom/saterskog/cell_lab/Environment;->g:D

    .line 69
    iget-wide v0, p1, Lcom/saterskog/cell_lab/Environment;->f:D

    iput-wide v0, p0, Lcom/saterskog/cell_lab/Environment;->f:D

    .line 70
    iget-object v0, p1, Lcom/saterskog/cell_lab/Environment;->t:[Z

    iget-object v1, p0, Lcom/saterskog/cell_lab/Environment;->t:[Z

    sget-object v2, Lcom/saterskog/cell_lab/h;->B:[Lcom/saterskog/cell_lab/h;

    array-length v2, v2

    invoke-static {v0, v3, v1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 71
    iget-boolean v0, p1, Lcom/saterskog/cell_lab/Environment;->w:Z

    iput-boolean v0, p0, Lcom/saterskog/cell_lab/Environment;->w:Z

    .line 72
    iget-wide v0, p1, Lcom/saterskog/cell_lab/Environment;->i:D

    iput-wide v0, p0, Lcom/saterskog/cell_lab/Environment;->i:D

    .line 73
    iget-wide v0, p1, Lcom/saterskog/cell_lab/Environment;->h:D

    iput-wide v0, p0, Lcom/saterskog/cell_lab/Environment;->h:D

    .line 74
    iget-wide v0, p1, Lcom/saterskog/cell_lab/Environment;->j:D

    iput-wide v0, p0, Lcom/saterskog/cell_lab/Environment;->j:D

    .line 75
    iget-boolean v0, p1, Lcom/saterskog/cell_lab/Environment;->x:Z

    iput-boolean v0, p0, Lcom/saterskog/cell_lab/Environment;->x:Z

    .line 76
    iget-wide v0, p1, Lcom/saterskog/cell_lab/Environment;->z:D

    iput-wide v0, p0, Lcom/saterskog/cell_lab/Environment;->z:D

    .line 77
    iget v0, p1, Lcom/saterskog/cell_lab/Environment;->r:I

    iput v0, p0, Lcom/saterskog/cell_lab/Environment;->r:I

    .line 78
    iget v0, p1, Lcom/saterskog/cell_lab/Environment;->s:I

    iput v0, p0, Lcom/saterskog/cell_lab/Environment;->s:I

    .line 79
    iget-wide v0, p1, Lcom/saterskog/cell_lab/Environment;->k:D

    iput-wide v0, p0, Lcom/saterskog/cell_lab/Environment;->k:D

    .line 80
    iget-wide v0, p1, Lcom/saterskog/cell_lab/Environment;->m:D

    iput-wide v0, p0, Lcom/saterskog/cell_lab/Environment;->m:D

    .line 81
    iget-wide v0, p1, Lcom/saterskog/cell_lab/Environment;->l:D

    iput-wide v0, p0, Lcom/saterskog/cell_lab/Environment;->l:D

    .line 82
    iget-boolean v0, p1, Lcom/saterskog/cell_lab/Environment;->u:Z

    iput-boolean v0, p0, Lcom/saterskog/cell_lab/Environment;->u:Z

    .line 83
    iget v0, p1, Lcom/saterskog/cell_lab/Environment;->n:F

    iput v0, p0, Lcom/saterskog/cell_lab/Environment;->n:F

    .line 84
    iget-boolean v0, p1, Lcom/saterskog/cell_lab/Environment;->v:Z

    iput-boolean v0, p0, Lcom/saterskog/cell_lab/Environment;->v:Z

    .line 85
    iget-wide v0, p1, Lcom/saterskog/cell_lab/Environment;->p:D

    iput-wide v0, p0, Lcom/saterskog/cell_lab/Environment;->p:D

    .line 86
    iget-wide v0, p1, Lcom/saterskog/cell_lab/Environment;->q:D

    iput-wide v0, p0, Lcom/saterskog/cell_lab/Environment;->q:D

    .line 87
    iget-boolean v0, p1, Lcom/saterskog/cell_lab/Environment;->y:Z

    iput-boolean v0, p0, Lcom/saterskog/cell_lab/Environment;->y:Z

    .line 88
    iget v0, p1, Lcom/saterskog/cell_lab/Environment;->o:F

    iput v0, p0, Lcom/saterskog/cell_lab/Environment;->o:F

    .line 89
    return-void
.end method

.method public final a(Ljava/io/ObjectInputStream;)V
    .locals 14

    .prologue
    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    const-wide v12, 0x3fc3333333333333L    # 0.15

    const/4 v10, 0x1

    const-wide/16 v6, 0x0

    const/4 v1, 0x0

    .line 166
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readInt()I

    move-result v8

    .line 167
    const/16 v0, 0x5f

    if-gt v8, v0, :cond_0

    if-gtz v8, :cond_1

    .line 168
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Incompatible environment format"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 170
    :cond_1
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readDouble()D

    move-result-wide v2

    iput-wide v2, p0, Lcom/saterskog/cell_lab/Environment;->a:D

    .line 171
    if-ne v8, v10, :cond_2

    .line 172
    iget-wide v2, p0, Lcom/saterskog/cell_lab/Environment;->a:D

    mul-double/2addr v2, v12

    iput-wide v2, p0, Lcom/saterskog/cell_lab/Environment;->a:D

    .line 173
    :cond_2
    if-le v8, v10, :cond_4

    .line 174
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readDouble()D

    move-result-wide v2

    iput-wide v2, p0, Lcom/saterskog/cell_lab/Environment;->b:D

    .line 177
    :goto_0
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readDouble()D

    move-result-wide v2

    iput-wide v2, p0, Lcom/saterskog/cell_lab/Environment;->c:D

    .line 178
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readDouble()D

    move-result-wide v2

    iput-wide v2, p0, Lcom/saterskog/cell_lab/Environment;->d:D

    .line 179
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readDouble()D

    move-result-wide v2

    iput-wide v2, p0, Lcom/saterskog/cell_lab/Environment;->e:D

    .line 180
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readDouble()D

    move-result-wide v2

    iput-wide v2, p0, Lcom/saterskog/cell_lab/Environment;->f:D

    .line 181
    const/16 v0, 0x17

    if-gt v8, v0, :cond_3

    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readDouble()D

    .line 182
    :cond_3
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readDouble()D

    move-result-wide v2

    iput-wide v2, p0, Lcom/saterskog/cell_lab/Environment;->g:D

    .line 183
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readInt()I

    move-result v2

    move v0, v1

    .line 184
    :goto_1
    sget-object v3, Lcom/saterskog/cell_lab/h;->B:[Lcom/saterskog/cell_lab/h;

    array-length v3, v3

    if-ge v0, v3, :cond_5

    .line 185
    iget-object v3, p0, Lcom/saterskog/cell_lab/Environment;->t:[Z

    aput-boolean v1, v3, v0

    .line 184
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 176
    :cond_4
    iput-wide v12, p0, Lcom/saterskog/cell_lab/Environment;->b:D

    goto :goto_0

    :cond_5
    move v0, v1

    .line 186
    :goto_2
    if-ge v0, v2, :cond_6

    .line 187
    iget-object v3, p0, Lcom/saterskog/cell_lab/Environment;->t:[Z

    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readBoolean()Z

    move-result v9

    aput-boolean v9, v3, v0

    .line 186
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 188
    :cond_6
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readBoolean()Z

    move-result v0

    iput-boolean v0, p0, Lcom/saterskog/cell_lab/Environment;->w:Z

    .line 189
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readDouble()D

    move-result-wide v2

    iput-wide v2, p0, Lcom/saterskog/cell_lab/Environment;->i:D

    .line 190
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readDouble()D

    move-result-wide v2

    iput-wide v2, p0, Lcom/saterskog/cell_lab/Environment;->h:D

    .line 191
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readDouble()D

    move-result-wide v2

    iput-wide v2, p0, Lcom/saterskog/cell_lab/Environment;->j:D

    .line 192
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readBoolean()Z

    move-result v0

    iput-boolean v0, p0, Lcom/saterskog/cell_lab/Environment;->x:Z

    .line 193
    const/16 v0, 0x14

    if-le v8, v0, :cond_7

    .line 194
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readDouble()D

    move-result-wide v2

    move-object v0, p0

    .line 196
    :goto_3
    iput-wide v2, v0, Lcom/saterskog/cell_lab/Environment;->z:D

    .line 197
    const/4 v0, 0x3

    if-ge v8, v0, :cond_9

    .line 199
    const/16 v0, 0x320

    iput v0, p0, Lcom/saterskog/cell_lab/Environment;->r:I

    .line 200
    const/16 v0, 0xdac

    iput v0, p0, Lcom/saterskog/cell_lab/Environment;->s:I

    .line 201
    iput-wide v4, p0, Lcom/saterskog/cell_lab/Environment;->k:D

    .line 210
    :goto_4
    const/16 v0, 0x9

    if-ge v8, v0, :cond_a

    .line 212
    iput-wide v6, p0, Lcom/saterskog/cell_lab/Environment;->m:D

    .line 213
    iput-wide v6, p0, Lcom/saterskog/cell_lab/Environment;->l:D

    .line 214
    iput-boolean v1, p0, Lcom/saterskog/cell_lab/Environment;->u:Z

    .line 222
    :goto_5
    const/16 v0, 0xa

    if-ge v8, v0, :cond_b

    .line 223
    const v0, 0x3e99999a    # 0.3f

    iput v0, p0, Lcom/saterskog/cell_lab/Environment;->n:F

    .line 227
    :goto_6
    const/16 v0, 0xe

    if-lt v8, v0, :cond_c

    .line 228
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readBoolean()Z

    move-result v0

    iput-boolean v0, p0, Lcom/saterskog/cell_lab/Environment;->v:Z

    .line 229
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readDouble()D

    move-result-wide v2

    iput-wide v2, p0, Lcom/saterskog/cell_lab/Environment;->p:D

    .line 230
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readDouble()D

    move-result-wide v2

    iput-wide v2, p0, Lcom/saterskog/cell_lab/Environment;->q:D

    .line 237
    :goto_7
    const/16 v0, 0x16

    if-lt v8, v0, :cond_d

    .line 238
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readBoolean()Z

    move-result v0

    iput-boolean v0, p0, Lcom/saterskog/cell_lab/Environment;->y:Z

    .line 239
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readFloat()F

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/Environment;->o:F

    .line 245
    :goto_8
    return-void

    .line 196
    :cond_7
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readBoolean()Z

    move-result v0

    if-eqz v0, :cond_8

    move-wide v2, v4

    move-object v0, p0

    goto :goto_3

    :cond_8
    move-wide v2, v6

    move-object v0, p0

    goto :goto_3

    .line 205
    :cond_9
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readInt()I

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/Environment;->r:I

    .line 206
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readInt()I

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/Environment;->s:I

    .line 207
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readDouble()D

    move-result-wide v2

    iput-wide v2, p0, Lcom/saterskog/cell_lab/Environment;->k:D

    goto :goto_4

    .line 218
    :cond_a
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readDouble()D

    move-result-wide v2

    iput-wide v2, p0, Lcom/saterskog/cell_lab/Environment;->m:D

    .line 219
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readDouble()D

    move-result-wide v2

    iput-wide v2, p0, Lcom/saterskog/cell_lab/Environment;->l:D

    .line 220
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readBoolean()Z

    move-result v0

    iput-boolean v0, p0, Lcom/saterskog/cell_lab/Environment;->u:Z

    goto :goto_5

    .line 225
    :cond_b
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readFloat()F

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/Environment;->n:F

    goto :goto_6

    .line 233
    :cond_c
    iput-boolean v10, p0, Lcom/saterskog/cell_lab/Environment;->v:Z

    .line 234
    iput-wide v6, p0, Lcom/saterskog/cell_lab/Environment;->p:D

    .line 235
    const-wide v2, 0x3f847ae140000000L    # 0.009999999776482582

    iput-wide v2, p0, Lcom/saterskog/cell_lab/Environment;->q:D

    goto :goto_7

    .line 242
    :cond_d
    iput-boolean v1, p0, Lcom/saterskog/cell_lab/Environment;->y:Z

    .line 243
    const/4 v0, 0x0

    iput v0, p0, Lcom/saterskog/cell_lab/Environment;->o:F

    goto :goto_8
.end method

.method public final a(Ljava/io/ObjectOutputStream;)V
    .locals 2

    .prologue
    .line 129
    const/16 v0, 0x5f

    invoke-virtual {p1, v0}, Ljava/io/ObjectOutputStream;->writeInt(I)V

    .line 130
    iget-wide v0, p0, Lcom/saterskog/cell_lab/Environment;->a:D

    invoke-virtual {p1, v0, v1}, Ljava/io/ObjectOutputStream;->writeDouble(D)V

    .line 131
    iget-wide v0, p0, Lcom/saterskog/cell_lab/Environment;->b:D

    invoke-virtual {p1, v0, v1}, Ljava/io/ObjectOutputStream;->writeDouble(D)V

    .line 132
    iget-wide v0, p0, Lcom/saterskog/cell_lab/Environment;->c:D

    invoke-virtual {p1, v0, v1}, Ljava/io/ObjectOutputStream;->writeDouble(D)V

    .line 133
    iget-wide v0, p0, Lcom/saterskog/cell_lab/Environment;->d:D

    invoke-virtual {p1, v0, v1}, Ljava/io/ObjectOutputStream;->writeDouble(D)V

    .line 134
    iget-wide v0, p0, Lcom/saterskog/cell_lab/Environment;->e:D

    invoke-virtual {p1, v0, v1}, Ljava/io/ObjectOutputStream;->writeDouble(D)V

    .line 135
    iget-wide v0, p0, Lcom/saterskog/cell_lab/Environment;->f:D

    invoke-virtual {p1, v0, v1}, Ljava/io/ObjectOutputStream;->writeDouble(D)V

    .line 137
    iget-wide v0, p0, Lcom/saterskog/cell_lab/Environment;->g:D

    invoke-virtual {p1, v0, v1}, Ljava/io/ObjectOutputStream;->writeDouble(D)V

    .line 138
    sget-object v0, Lcom/saterskog/cell_lab/h;->B:[Lcom/saterskog/cell_lab/h;

    array-length v0, v0

    invoke-virtual {p1, v0}, Ljava/io/ObjectOutputStream;->writeInt(I)V

    .line 139
    const/4 v0, 0x0

    :goto_0
    sget-object v1, Lcom/saterskog/cell_lab/h;->B:[Lcom/saterskog/cell_lab/h;

    array-length v1, v1

    if-ge v0, v1, :cond_0

    .line 140
    iget-object v1, p0, Lcom/saterskog/cell_lab/Environment;->t:[Z

    aget-boolean v1, v1, v0

    invoke-virtual {p1, v1}, Ljava/io/ObjectOutputStream;->writeBoolean(Z)V

    .line 139
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 141
    :cond_0
    iget-boolean v0, p0, Lcom/saterskog/cell_lab/Environment;->w:Z

    invoke-virtual {p1, v0}, Ljava/io/ObjectOutputStream;->writeBoolean(Z)V

    .line 142
    iget-wide v0, p0, Lcom/saterskog/cell_lab/Environment;->i:D

    invoke-virtual {p1, v0, v1}, Ljava/io/ObjectOutputStream;->writeDouble(D)V

    .line 143
    iget-wide v0, p0, Lcom/saterskog/cell_lab/Environment;->h:D

    invoke-virtual {p1, v0, v1}, Ljava/io/ObjectOutputStream;->writeDouble(D)V

    .line 144
    iget-wide v0, p0, Lcom/saterskog/cell_lab/Environment;->j:D

    invoke-virtual {p1, v0, v1}, Ljava/io/ObjectOutputStream;->writeDouble(D)V

    .line 145
    iget-boolean v0, p0, Lcom/saterskog/cell_lab/Environment;->x:Z

    invoke-virtual {p1, v0}, Ljava/io/ObjectOutputStream;->writeBoolean(Z)V

    .line 147
    iget-wide v0, p0, Lcom/saterskog/cell_lab/Environment;->z:D

    invoke-virtual {p1, v0, v1}, Ljava/io/ObjectOutputStream;->writeDouble(D)V

    .line 149
    iget v0, p0, Lcom/saterskog/cell_lab/Environment;->r:I

    invoke-virtual {p1, v0}, Ljava/io/ObjectOutputStream;->writeInt(I)V

    .line 151
    iget v0, p0, Lcom/saterskog/cell_lab/Environment;->s:I

    invoke-virtual {p1, v0}, Ljava/io/ObjectOutputStream;->writeInt(I)V

    .line 152
    iget-wide v0, p0, Lcom/saterskog/cell_lab/Environment;->k:D

    invoke-virtual {p1, v0, v1}, Ljava/io/ObjectOutputStream;->writeDouble(D)V

    .line 154
    iget-wide v0, p0, Lcom/saterskog/cell_lab/Environment;->m:D

    invoke-virtual {p1, v0, v1}, Ljava/io/ObjectOutputStream;->writeDouble(D)V

    .line 155
    iget-wide v0, p0, Lcom/saterskog/cell_lab/Environment;->l:D

    invoke-virtual {p1, v0, v1}, Ljava/io/ObjectOutputStream;->writeDouble(D)V

    .line 156
    iget-boolean v0, p0, Lcom/saterskog/cell_lab/Environment;->u:Z

    invoke-virtual {p1, v0}, Ljava/io/ObjectOutputStream;->writeBoolean(Z)V

    .line 157
    iget v0, p0, Lcom/saterskog/cell_lab/Environment;->n:F

    invoke-virtual {p1, v0}, Ljava/io/ObjectOutputStream;->writeFloat(F)V

    .line 158
    iget-boolean v0, p0, Lcom/saterskog/cell_lab/Environment;->v:Z

    invoke-virtual {p1, v0}, Ljava/io/ObjectOutputStream;->writeBoolean(Z)V

    .line 159
    iget-wide v0, p0, Lcom/saterskog/cell_lab/Environment;->p:D

    invoke-virtual {p1, v0, v1}, Ljava/io/ObjectOutputStream;->writeDouble(D)V

    .line 160
    iget-wide v0, p0, Lcom/saterskog/cell_lab/Environment;->q:D

    invoke-virtual {p1, v0, v1}, Ljava/io/ObjectOutputStream;->writeDouble(D)V

    .line 161
    iget-boolean v0, p0, Lcom/saterskog/cell_lab/Environment;->y:Z

    invoke-virtual {p1, v0}, Ljava/io/ObjectOutputStream;->writeBoolean(Z)V

    .line 162
    iget v0, p0, Lcom/saterskog/cell_lab/Environment;->o:F

    invoke-virtual {p1, v0}, Ljava/io/ObjectOutputStream;->writeFloat(F)V

    .line 163
    return-void
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 93
    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 6

    .prologue
    const/4 v3, 0x1

    const/4 v1, 0x0

    .line 97
    iget-wide v4, p0, Lcom/saterskog/cell_lab/Environment;->a:D

    invoke-virtual {p1, v4, v5}, Landroid/os/Parcel;->writeDouble(D)V

    .line 98
    iget-wide v4, p0, Lcom/saterskog/cell_lab/Environment;->b:D

    invoke-virtual {p1, v4, v5}, Landroid/os/Parcel;->writeDouble(D)V

    .line 99
    iget-wide v4, p0, Lcom/saterskog/cell_lab/Environment;->c:D

    invoke-virtual {p1, v4, v5}, Landroid/os/Parcel;->writeDouble(D)V

    .line 100
    iget-wide v4, p0, Lcom/saterskog/cell_lab/Environment;->d:D

    invoke-virtual {p1, v4, v5}, Landroid/os/Parcel;->writeDouble(D)V

    .line 101
    iget-wide v4, p0, Lcom/saterskog/cell_lab/Environment;->e:D

    invoke-virtual {p1, v4, v5}, Landroid/os/Parcel;->writeDouble(D)V

    .line 102
    iget-wide v4, p0, Lcom/saterskog/cell_lab/Environment;->f:D

    invoke-virtual {p1, v4, v5}, Landroid/os/Parcel;->writeDouble(D)V

    .line 104
    iget-wide v4, p0, Lcom/saterskog/cell_lab/Environment;->g:D

    invoke-virtual {p1, v4, v5}, Landroid/os/Parcel;->writeDouble(D)V

    move v0, v1

    .line 105
    :goto_0
    sget-object v2, Lcom/saterskog/cell_lab/h;->B:[Lcom/saterskog/cell_lab/h;

    array-length v2, v2

    if-ge v0, v2, :cond_1

    .line 106
    iget-object v2, p0, Lcom/saterskog/cell_lab/Environment;->t:[Z

    aget-boolean v2, v2, v0

    if-eqz v2, :cond_0

    move v2, v3

    :goto_1
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 105
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    move v2, v1

    .line 106
    goto :goto_1

    .line 107
    :cond_1
    iget-boolean v0, p0, Lcom/saterskog/cell_lab/Environment;->w:Z

    if-eqz v0, :cond_2

    move v0, v3

    :goto_2
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 108
    iget-wide v4, p0, Lcom/saterskog/cell_lab/Environment;->i:D

    invoke-virtual {p1, v4, v5}, Landroid/os/Parcel;->writeDouble(D)V

    .line 109
    iget-wide v4, p0, Lcom/saterskog/cell_lab/Environment;->h:D

    invoke-virtual {p1, v4, v5}, Landroid/os/Parcel;->writeDouble(D)V

    .line 110
    iget-wide v4, p0, Lcom/saterskog/cell_lab/Environment;->j:D

    invoke-virtual {p1, v4, v5}, Landroid/os/Parcel;->writeDouble(D)V

    .line 111
    iget-boolean v0, p0, Lcom/saterskog/cell_lab/Environment;->x:Z

    if-eqz v0, :cond_3

    move v0, v3

    :goto_3
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 113
    iget-wide v4, p0, Lcom/saterskog/cell_lab/Environment;->z:D

    invoke-virtual {p1, v4, v5}, Landroid/os/Parcel;->writeDouble(D)V

    .line 114
    iget v0, p0, Lcom/saterskog/cell_lab/Environment;->r:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 115
    iget v0, p0, Lcom/saterskog/cell_lab/Environment;->s:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 116
    iget-wide v4, p0, Lcom/saterskog/cell_lab/Environment;->k:D

    invoke-virtual {p1, v4, v5}, Landroid/os/Parcel;->writeDouble(D)V

    .line 117
    iget-wide v4, p0, Lcom/saterskog/cell_lab/Environment;->m:D

    invoke-virtual {p1, v4, v5}, Landroid/os/Parcel;->writeDouble(D)V

    .line 118
    iget-wide v4, p0, Lcom/saterskog/cell_lab/Environment;->l:D

    invoke-virtual {p1, v4, v5}, Landroid/os/Parcel;->writeDouble(D)V

    .line 119
    iget-boolean v0, p0, Lcom/saterskog/cell_lab/Environment;->u:Z

    if-eqz v0, :cond_4

    move v0, v3

    :goto_4
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 120
    iget v0, p0, Lcom/saterskog/cell_lab/Environment;->n:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    .line 121
    iget-boolean v0, p0, Lcom/saterskog/cell_lab/Environment;->v:Z

    if-eqz v0, :cond_5

    move v0, v3

    :goto_5
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 122
    iget-wide v4, p0, Lcom/saterskog/cell_lab/Environment;->p:D

    invoke-virtual {p1, v4, v5}, Landroid/os/Parcel;->writeDouble(D)V

    .line 123
    iget-wide v4, p0, Lcom/saterskog/cell_lab/Environment;->q:D

    invoke-virtual {p1, v4, v5}, Landroid/os/Parcel;->writeDouble(D)V

    .line 124
    iget-boolean v0, p0, Lcom/saterskog/cell_lab/Environment;->y:Z

    if-eqz v0, :cond_6

    :goto_6
    invoke-virtual {p1, v3}, Landroid/os/Parcel;->writeInt(I)V

    .line 125
    iget v0, p0, Lcom/saterskog/cell_lab/Environment;->o:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    .line 126
    return-void

    :cond_2
    move v0, v1

    .line 107
    goto :goto_2

    :cond_3
    move v0, v1

    .line 111
    goto :goto_3

    :cond_4
    move v0, v1

    .line 119
    goto :goto_4

    :cond_5
    move v0, v1

    .line 121
    goto :goto_5

    :cond_6
    move v3, v1

    .line 124
    goto :goto_6
.end method
