.class public Lcom/saterskog/cell_lab/Gene;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/saterskog/cell_lab/Gene$a;
    }
.end annotation


# static fields
.field public static final A:[F

.field public static final B:[I

.field static final C:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/saterskog/cell_lab/Gene;",
            ">;"
        }
    .end annotation
.end field

.field public static final w:[I

.field public static final x:[F

.field public static final y:[F

.field public static final z:[F


# instance fields
.field public final a:[F

.field public b:F

.field public c:F

.field public d:F

.field public e:F

.field public f:F

.field public g:F

.field public h:F

.field public i:I

.field public j:I

.field public k:I

# MODDED SECTION BEGIN ----------------------------------------------------------------

# Not sure why i made this field. I think im just stupid, maxSplit is stored in mInt[11]
# not on this field.

# .field public enzyme_maxSplit:I

# A value of 20 = infinite splits.
# A value < 20 = value + 1, eg if value = 19 -> value = 20. (due to dropdown list index)

# MODDED SECTION END -------------------------------------------------------------------

.field l:Z

.field m:Z

.field n:Z

.field o:Z

.field p:Z

.field q:Z

.field r:Z

.field public s:Lcom/saterskog/cell_lab/h;

.field public final t:[Lcom/saterskog/cell_lab/Gene$a;

.field public final u:[I

.field public final v:[F


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .prologue
    const/4 v8, 0x6

    const/4 v7, 0x0

    const/4 v1, 0x0

    const/high16 v6, 0x3f800000    # 1.0f

    const/4 v5, 0x4

    .line 69
    const/16 v0, 0xb

    new-array v0, v0, [I

    sput-object v0, Lcom/saterskog/cell_lab/Gene;->w:[I

    .line 70
    const/16 v0, 0xb

    new-array v0, v0, [F

    sput-object v0, Lcom/saterskog/cell_lab/Gene;->x:[F

    .line 71
    const/16 v0, 0xb

    new-array v0, v0, [F

    sput-object v0, Lcom/saterskog/cell_lab/Gene;->y:[F

    .line 72
    const/4 v0, 0x7

    new-array v0, v0, [F

    sput-object v0, Lcom/saterskog/cell_lab/Gene;->z:[F

    .line 73
    const/4 v0, 0x7

    new-array v0, v0, [F

    sput-object v0, Lcom/saterskog/cell_lab/Gene;->A:[F

    .line 75
    new-array v0, v8, [I

    fill-array-data v0, :array_0

    sput-object v0, Lcom/saterskog/cell_lab/Gene;->B:[I

    .line 82
    sget-object v0, Lcom/saterskog/cell_lab/Gene;->w:[I

    const/16 v2, 0x50

    aput v2, v0, v1

    .line 83
    sget-object v0, Lcom/saterskog/cell_lab/Gene;->w:[I

    const/4 v2, 0x1

    const/16 v3, 0x50

    aput v3, v0, v2

    .line 84
    sget-object v0, Lcom/saterskog/cell_lab/Gene;->w:[I

    const/4 v2, 0x2

    aput v5, v0, v2

    .line 85
    sget-object v0, Lcom/saterskog/cell_lab/Gene;->w:[I

    const/4 v2, 0x3

    aput v8, v0, v2

    .line 86
    sget-object v0, Lcom/saterskog/cell_lab/Gene;->w:[I

    const/16 v2, 0xf

    aput v2, v0, v5

    move v0, v1

    .line 88
    :goto_0
    if-ge v0, v5, :cond_0

    .line 89
    sget-object v2, Lcom/saterskog/cell_lab/Gene;->w:[I

    add-int/lit8 v3, v0, 0x5

    aput v5, v2, v3

    .line 88
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 91
    :cond_0
    sget-object v0, Lcom/saterskog/cell_lab/Gene;->w:[I

    const/16 v2, 0x9

    const/16 v3, 0x14

    aput v3, v0, v2

    .line 92
    sget-object v0, Lcom/saterskog/cell_lab/Gene;->w:[I

    const/16 v2, 0xa

    sget-object v3, Lcom/saterskog/cell_lab/Gene;->B:[I

    array-length v3, v3

    aput v3, v0, v2

    .line 94
    sget-object v0, Lcom/saterskog/cell_lab/Gene;->x:[F

    aput v7, v0, v1

    .line 95
    sget-object v0, Lcom/saterskog/cell_lab/Gene;->y:[F

    aput v6, v0, v1

    .line 97
    sget-object v0, Lcom/saterskog/cell_lab/Gene;->x:[F

    const/4 v2, 0x1

    const/high16 v3, -0x3fc00000    # -3.0f

    aput v3, v0, v2

    .line 98
    sget-object v0, Lcom/saterskog/cell_lab/Gene;->y:[F

    const/4 v2, 0x1

    const/high16 v3, 0x40400000    # 3.0f

    aput v3, v0, v2

    .line 100
    sget-object v0, Lcom/saterskog/cell_lab/Gene;->x:[F

    const/4 v2, 0x2

    const/high16 v3, -0x40800000    # -1.0f

    aput v3, v0, v2

    .line 101
    sget-object v0, Lcom/saterskog/cell_lab/Gene;->y:[F

    const/4 v2, 0x2

    aput v6, v0, v2

    .line 103
    sget-object v0, Lcom/saterskog/cell_lab/Gene;->x:[F

    const/4 v2, 0x3

    const/high16 v3, -0x41000000    # -0.5f

    aput v3, v0, v2

    .line 104
    sget-object v0, Lcom/saterskog/cell_lab/Gene;->y:[F

    const/4 v2, 0x3

    const/high16 v3, 0x3f000000    # 0.5f

    aput v3, v0, v2

    .line 106
    sget-object v0, Lcom/saterskog/cell_lab/Gene;->x:[F

    const/high16 v2, -0x40800000    # -1.0f

    aput v2, v0, v5

    .line 107
    sget-object v0, Lcom/saterskog/cell_lab/Gene;->y:[F

    aput v6, v0, v5

    .line 109
    sget-object v0, Lcom/saterskog/cell_lab/Gene;->x:[F

    const/4 v2, 0x5

    const/high16 v3, -0x40800000    # -1.0f

    aput v3, v0, v2

    .line 110
    sget-object v0, Lcom/saterskog/cell_lab/Gene;->y:[F

    const/4 v2, 0x5

    aput v6, v0, v2

    .line 111
    sget-object v0, Lcom/saterskog/cell_lab/Gene;->x:[F

    const/high16 v2, -0x40800000    # -1.0f

    aput v2, v0, v8

    .line 112
    sget-object v0, Lcom/saterskog/cell_lab/Gene;->y:[F

    aput v6, v0, v8

    move v0, v1

    .line 114
    :goto_1
    if-ge v0, v5, :cond_1

    .line 115
    sget-object v2, Lcom/saterskog/cell_lab/Gene;->x:[F

    add-int/lit8 v3, v0, 0x7

    const/high16 v4, -0x3e600000    # -20.0f

    aput v4, v2, v3

    .line 116
    sget-object v2, Lcom/saterskog/cell_lab/Gene;->y:[F

    add-int/lit8 v3, v0, 0x7

    const/high16 v4, 0x41a00000    # 20.0f

    aput v4, v2, v3

    .line 114
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 119
    :cond_1
    sget-object v0, Lcom/saterskog/cell_lab/Gene;->z:[F

    const/high16 v2, -0x3d900000    # -60.0f

    aput v2, v0, v1

    .line 120
    sget-object v0, Lcom/saterskog/cell_lab/Gene;->A:[F

    const/high16 v2, 0x42700000    # 60.0f

    aput v2, v0, v1

    .line 121
    sget-object v0, Lcom/saterskog/cell_lab/Gene;->z:[F

    const/4 v1, 0x1

    aput v7, v0, v1

    .line 122
    sget-object v0, Lcom/saterskog/cell_lab/Gene;->A:[F

    const/4 v1, 0x1

    aput v6, v0, v1

    .line 123
    sget-object v0, Lcom/saterskog/cell_lab/Gene;->z:[F

    const/4 v1, 0x2

    aput v7, v0, v1

    .line 124
    sget-object v0, Lcom/saterskog/cell_lab/Gene;->A:[F

    const/4 v1, 0x2

    aput v6, v0, v1

    .line 125
    sget-object v0, Lcom/saterskog/cell_lab/Gene;->z:[F

    const/4 v1, 0x3

    aput v7, v0, v1

    .line 126
    sget-object v0, Lcom/saterskog/cell_lab/Gene;->A:[F

    const/4 v1, 0x3

    aput v6, v0, v1

    .line 127
    sget-object v0, Lcom/saterskog/cell_lab/Gene;->z:[F

    aput v7, v0, v5

    .line 128
    sget-object v0, Lcom/saterskog/cell_lab/Gene;->A:[F

    const-wide/high16 v2, 0x4008000000000000L    # 3.0

    invoke-static {v2, v3}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v2

    double-to-float v1, v2

    aput v1, v0, v5

    .line 130
    sget-object v0, Lcom/saterskog/cell_lab/Gene;->z:[F

    const/4 v1, 0x5

    aput v7, v0, v1

    .line 131
    sget-object v0, Lcom/saterskog/cell_lab/Gene;->A:[F

    const/4 v1, 0x5

    const v2, 0x3c23d70a    # 0.01f

    aput v2, v0, v1

    .line 132
    sget-object v0, Lcom/saterskog/cell_lab/Gene;->z:[F

    const/high16 v1, 0x3f000000    # 0.5f

    aput v1, v0, v8

    .line 133
    sget-object v0, Lcom/saterskog/cell_lab/Gene;->A:[F

    const/high16 v1, 0x40000000    # 2.0f

    aput v1, v0, v8

    .line 238
    new-instance v0, Lcom/saterskog/cell_lab/Gene$1;

    invoke-direct {v0}, Lcom/saterskog/cell_lab/Gene$1;-><init>()V

    sput-object v0, Lcom/saterskog/cell_lab/Gene;->C:Landroid/os/Parcelable$Creator;

    return-void

    .line 75
    nop

    :array_0
    .array-data 4
        -0x1
        0x5
        0xa
        0x14
        0x28
        0x50
    .end array-data
.end method

.method public constructor <init>()V
    .locals 4

    .prologue
    const/16 v3, 0xb

    .line 185
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    const/4 v0, 0x3

    new-array v0, v0, [F

    iput-object v0, p0, Lcom/saterskog/cell_lab/Gene;->a:[F

    .line 27
    new-array v0, v3, [Lcom/saterskog/cell_lab/Gene$a;

    iput-object v0, p0, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    .line 28
    # MODDED AREA BEGIN--------------------------------------------------------------------------
    # this.mInts = new int[11]; -> this.mInts = new int[13];
    # This function is Constructor() or Gene(). It creates a new empty genome.

    const/16 v3, 0xd

    new-array v0, v3, [I

    iput-object v0, p0, Lcom/saterskog/cell_lab/Gene;->u:[I

    const/16 v3, 0xb

    # MODDED AREA END-----------------------------------------------------------------------------


    .line 29
    const/4 v0, 0x7

    new-array v0, v0, [F

    iput-object v0, p0, Lcom/saterskog/cell_lab/Gene;->v:[F

    .line 186
    sget-object v0, Lcom/saterskog/cell_lab/h;->a:Lcom/saterskog/cell_lab/h;

    iput-object v0, p0, Lcom/saterskog/cell_lab/Gene;->s:Lcom/saterskog/cell_lab/h;

    .line 188
    const/4 v0, 0x0

    :goto_0
    if-ge v0, v3, :cond_0

    iget-object v1, p0, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    new-instance v2, Lcom/saterskog/cell_lab/Gene$a;

    invoke-direct {v2, p0}, Lcom/saterskog/cell_lab/Gene$a;-><init>(Lcom/saterskog/cell_lab/Gene;)V

    aput-object v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 189
    :cond_0
    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 6

    .prologue
    const/4 v5, 0x7

    const/16 v4, 0xb

    const/4 v2, 0x0

    const/4 v1, 0x1

    .line 139
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    const/4 v0, 0x3

    new-array v0, v0, [F

    iput-object v0, p0, Lcom/saterskog/cell_lab/Gene;->a:[F

    .line 27
    new-array v0, v4, [Lcom/saterskog/cell_lab/Gene$a;

    iput-object v0, p0, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    .line 28
    const/16 v4, 0xb

    new-array v0, v4, [I

    iput-object v0, p0, Lcom/saterskog/cell_lab/Gene;->u:[I

    const/16 v4, 0xb

    .line 29
    new-array v0, v5, [F

    iput-object v0, p0, Lcom/saterskog/cell_lab/Gene;->v:[F

    .line 140
    iget-object v0, p0, Lcom/saterskog/cell_lab/Gene;->a:[F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readFloatArray([F)V

    .line 141
    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/Gene;->b:F

    .line 142
    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/Gene;->c:F

    .line 143
    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/Gene;->d:F

    .line 144
    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/Gene;->e:F

    .line 145
    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/Gene;->f:F

    .line 146
    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/Gene;->g:F

    .line 147
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/Gene;->i:I

    .line 148
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/Gene;->j:I

    .line 149
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-ne v0, v1, :cond_0

    move v0, v1

    :goto_0
    iput-boolean v0, p0, Lcom/saterskog/cell_lab/Gene;->l:Z

    .line 150
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-ne v0, v1, :cond_1

    move v0, v1

    :goto_1
    iput-boolean v0, p0, Lcom/saterskog/cell_lab/Gene;->m:Z

    .line 151
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-ne v0, v1, :cond_2

    move v0, v1

    :goto_2
    iput-boolean v0, p0, Lcom/saterskog/cell_lab/Gene;->n:Z

    .line 152
    sget-object v0, Lcom/saterskog/cell_lab/h;->B:[Lcom/saterskog/cell_lab/h;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    aget-object v0, v0, v3

    iput-object v0, p0, Lcom/saterskog/cell_lab/Gene;->s:Lcom/saterskog/cell_lab/h;

    .line 153
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/Gene;->k:I

    .line 154
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-ne v0, v1, :cond_3

    move v0, v1

    :goto_3
    iput-boolean v0, p0, Lcom/saterskog/cell_lab/Gene;->o:Z

    .line 158
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-ne v0, v1, :cond_4

    move v0, v1

    :goto_4
    iput-boolean v0, p0, Lcom/saterskog/cell_lab/Gene;->p:Z

    .line 159
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-ne v0, v1, :cond_5

    move v0, v1

    :goto_5
    iput-boolean v0, p0, Lcom/saterskog/cell_lab/Gene;->q:Z

    .line 160
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-ne v0, v1, :cond_6

    :goto_6
    iput-boolean v1, p0, Lcom/saterskog/cell_lab/Gene;->r:Z

    .line 161
    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/Gene;->h:F

    move v0, v2

    .line 164
    :goto_7
    if-ge v0, v4, :cond_7

    .line 165
    iget-object v1, p0, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    new-instance v3, Lcom/saterskog/cell_lab/Gene$a;

    invoke-direct {v3, p0}, Lcom/saterskog/cell_lab/Gene$a;-><init>(Lcom/saterskog/cell_lab/Gene;)V

    aput-object v3, v1, v0

    .line 166
    iget-object v1, p0, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    aget-object v1, v1, v0

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    int-to-short v3, v3

    iput-short v3, v1, Lcom/saterskog/cell_lab/Gene$a;->d:S

    .line 167
    iget-object v1, p0, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    aget-object v1, v1, v0

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    int-to-short v3, v3

    iput-short v3, v1, Lcom/saterskog/cell_lab/Gene$a;->e:S

    .line 168
    iget-object v1, p0, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    aget-object v1, v1, v0

    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v3

    iput v3, v1, Lcom/saterskog/cell_lab/Gene$a;->a:F

    .line 169
    iget-object v1, p0, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    aget-object v1, v1, v0

    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v3

    iput v3, v1, Lcom/saterskog/cell_lab/Gene$a;->b:F

    .line 170
    iget-object v1, p0, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    aget-object v1, v1, v0

    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v3

    iput v3, v1, Lcom/saterskog/cell_lab/Gene$a;->c:F

    .line 164
    add-int/lit8 v0, v0, 0x1

    goto :goto_7

    :cond_0
    move v0, v2

    .line 149
    goto/16 :goto_0

    :cond_1
    move v0, v2

    .line 150
    goto/16 :goto_1

    :cond_2
    move v0, v2

    .line 151
    goto/16 :goto_2

    :cond_3
    move v0, v2

    .line 154
    goto :goto_3

    :cond_4
    move v0, v2

    .line 158
    goto :goto_4

    :cond_5
    move v0, v2

    .line 159
    goto :goto_5

    :cond_6
    move v1, v2

    .line 160
    goto :goto_6

    :cond_7
    move v0, v2

    const/16 v4, 0xb

    .line 172
    :goto_8
    if-ge v0, v4, :cond_8

    .line 173
    iget-object v1, p0, Lcom/saterskog/cell_lab/Gene;->u:[I

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    aput v3, v1, v0

    .line 172
    add-int/lit8 v0, v0, 0x1

    goto :goto_8

    aput v3, v1, v0

    .line 175
    :cond_8
    :goto_9
    if-ge v2, v5, :cond_9

    .line 176
    iget-object v0, p0, Lcom/saterskog/cell_lab/Gene;->v:[F

    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v1

    aput v1, v0, v2

    .line 175
    add-int/lit8 v2, v2, 0x1

    goto :goto_9

    .line 178
    :cond_9

    # MODDED AREA BEGIN -------------------------------------------------------------------------------
    # Function: 'constructor(Parcel)' or 'gene(Parcel)'.
    # This patch reads mInts[11] & mInts[12] 

    # check if parcel continues
    invoke-virtual {p1}, Landroid/os/Parcel;->dataAvail()I
    move-result v2
    const/16 v0, 0x0

    if-eq v0, v2, :catch_rp0

    iget-object v1, p0, Lcom/saterskog/cell_lab/Gene;->u:[I
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I
    move-result v3
    const/16 v6, 0xb
    aput v3, v1, v6

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I
    move-result v3
    const/16 v6, 0xc
    aput v3, v1, v6

    goto :goto_rp0_modded_end

    :catch_rp0

    .line 180

    iget-object v2, p0, Lcom/saterskog/cell_lab/Gene;->u:[I
    const/16 v3, 0x14
    const/16 v6, 0xb
    aput v3, v2, v6

    const/4 v3, 0x0
    const/16 v6, 0xc
    aput v3, v2, v6

    const-string v0, "Enzyme Debugger"
    const-string v1, "Exception caught at Gene(Parcel). mInts[11-12] set to default."
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 182
    :goto_rp0_modded_end

    # MODDED AREA END ---------------------------------------------------------------------------------

    return-void
.end method

.method public constructor <init>(Lcom/saterskog/cell_lab/Gene;)V
    .locals 4

    .prologue
    const/16 v3, 0xb

    .line 180
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    const/4 v0, 0x3

    new-array v0, v0, [F

    iput-object v0, p0, Lcom/saterskog/cell_lab/Gene;->a:[F

    .line 27
    new-array v0, v3, [Lcom/saterskog/cell_lab/Gene$a;

    iput-object v0, p0, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    .line 28
    # MODDED AREA BEGIN--------------------------------------------------------------------------
    # this.mInts = new int[11]; -> this.mInts = new int[13];
    # This function is constructor(Gene) also known as Gene(Gene). It creates a copy of the argument
    # genome.

    const/16 v3, 0xd
    new-array v0, v3, [I

    iput-object v0, p0, Lcom/saterskog/cell_lab/Gene;->u:[I

    const/16 v3, 0xb

    # MODDED AREA END--------------------------------------------------------------------------

    .line 29
    const/4 v0, 0x7

    new-array v0, v0, [F

    iput-object v0, p0, Lcom/saterskog/cell_lab/Gene;->v:[F

    .line 181
    const/4 v0, 0x0

    :goto_0
    if-ge v0, v3, :cond_0

    iget-object v1, p0, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    new-instance v2, Lcom/saterskog/cell_lab/Gene$a;

    invoke-direct {v2, p0}, Lcom/saterskog/cell_lab/Gene$a;-><init>(Lcom/saterskog/cell_lab/Gene;)V

    aput-object v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 182
    :cond_0
    invoke-virtual {p0, p1}, Lcom/saterskog/cell_lab/Gene;->a(Lcom/saterskog/cell_lab/Gene;)V

    .line 183
    return-void
.end method

.method static a(FFFLcom/saterskog/b/d;)F
    .locals 4

    .prologue
    .line 251
    .line 1017
    const/4 v0, 0x2

    invoke-virtual {p3, v0}, Lcom/saterskog/b/d;->nextInt(I)I

    move-result v0

    .line 252
    if-nez v0, :cond_1

    .line 253
    sub-float v0, p1, p0

    .line 2008
    invoke-virtual {p3}, Lcom/saterskog/b/d;->nextDouble()D

    move-result-wide v2

    .line 253
    double-to-float v1, v2

    mul-float/2addr v0, v1

    add-float p1, p0, v0

    .line 259
    :cond_0
    :goto_0
    return p1

    .line 256
    :cond_1
    sub-float v0, p1, p0

    .line 2014
    invoke-virtual {p3}, Lcom/saterskog/b/d;->nextGaussian()D

    move-result-wide v2

    .line 256
    double-to-float v1, v2

    mul-float/2addr v0, v1

    const v1, 0x3cf5c28f    # 0.03f

    mul-float/2addr v0, v1

    add-float/2addr v0, p2

    .line 257
    cmpg-float v1, v0, p0

    if-gez v1, :cond_2

    move v0, p0

    .line 258
    :cond_2
    cmpl-float v1, v0, p1

    if-gtz v1, :cond_0

    move p1, v0

    goto :goto_0
.end method


# virtual methods
.method public final a(Lcom/saterskog/cell_lab/Gene;)V
    .locals 6

    .prologue
    const/16 v5, 0xb

    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v1, 0x0

    .line 444
    iget-object v0, p0, Lcom/saterskog/cell_lab/Gene;->a:[F

    iget-object v2, p1, Lcom/saterskog/cell_lab/Gene;->a:[F

    aget v2, v2, v1

    aput v2, v0, v1

    .line 445
    iget-object v0, p0, Lcom/saterskog/cell_lab/Gene;->a:[F

    iget-object v2, p1, Lcom/saterskog/cell_lab/Gene;->a:[F

    aget v2, v2, v3

    aput v2, v0, v3

    .line 446
    iget-object v0, p0, Lcom/saterskog/cell_lab/Gene;->a:[F

    iget-object v2, p1, Lcom/saterskog/cell_lab/Gene;->a:[F

    aget v2, v2, v4

    aput v2, v0, v4

    .line 447
    iget v0, p1, Lcom/saterskog/cell_lab/Gene;->b:F

    iput v0, p0, Lcom/saterskog/cell_lab/Gene;->b:F

    .line 448
    iget v0, p1, Lcom/saterskog/cell_lab/Gene;->c:F

    iput v0, p0, Lcom/saterskog/cell_lab/Gene;->c:F

    .line 449
    iget v0, p1, Lcom/saterskog/cell_lab/Gene;->d:F

    iput v0, p0, Lcom/saterskog/cell_lab/Gene;->d:F

    .line 450
    iget v0, p1, Lcom/saterskog/cell_lab/Gene;->e:F

    iput v0, p0, Lcom/saterskog/cell_lab/Gene;->e:F

    .line 451
    iget v0, p1, Lcom/saterskog/cell_lab/Gene;->f:F

    iput v0, p0, Lcom/saterskog/cell_lab/Gene;->f:F

    .line 452
    iget v0, p1, Lcom/saterskog/cell_lab/Gene;->g:F

    iput v0, p0, Lcom/saterskog/cell_lab/Gene;->g:F

    .line 453
    iget v0, p1, Lcom/saterskog/cell_lab/Gene;->i:I

    iput v0, p0, Lcom/saterskog/cell_lab/Gene;->i:I

    .line 454
    iget v0, p1, Lcom/saterskog/cell_lab/Gene;->j:I

    iput v0, p0, Lcom/saterskog/cell_lab/Gene;->j:I

    .line 455
    iget-boolean v0, p1, Lcom/saterskog/cell_lab/Gene;->l:Z

    iput-boolean v0, p0, Lcom/saterskog/cell_lab/Gene;->l:Z

    .line 456
    iget-boolean v0, p1, Lcom/saterskog/cell_lab/Gene;->m:Z

    iput-boolean v0, p0, Lcom/saterskog/cell_lab/Gene;->m:Z

    .line 457
    iget-boolean v0, p1, Lcom/saterskog/cell_lab/Gene;->n:Z

    iput-boolean v0, p0, Lcom/saterskog/cell_lab/Gene;->n:Z

    .line 458
    iget-object v0, p1, Lcom/saterskog/cell_lab/Gene;->s:Lcom/saterskog/cell_lab/h;

    iput-object v0, p0, Lcom/saterskog/cell_lab/Gene;->s:Lcom/saterskog/cell_lab/h;

    .line 459
    iget v0, p1, Lcom/saterskog/cell_lab/Gene;->k:I

    iput v0, p0, Lcom/saterskog/cell_lab/Gene;->k:I

    .line 460
    iget-boolean v0, p1, Lcom/saterskog/cell_lab/Gene;->o:Z

    iput-boolean v0, p0, Lcom/saterskog/cell_lab/Gene;->o:Z

    .line 464
    iget-boolean v0, p1, Lcom/saterskog/cell_lab/Gene;->p:Z

    iput-boolean v0, p0, Lcom/saterskog/cell_lab/Gene;->p:Z

    .line 465
    iget-boolean v0, p1, Lcom/saterskog/cell_lab/Gene;->q:Z

    iput-boolean v0, p0, Lcom/saterskog/cell_lab/Gene;->q:Z

    .line 466
    iget-boolean v0, p1, Lcom/saterskog/cell_lab/Gene;->r:Z

    iput-boolean v0, p0, Lcom/saterskog/cell_lab/Gene;->r:Z

    .line 467
    iget v0, p1, Lcom/saterskog/cell_lab/Gene;->h:F

    iput v0, p0, Lcom/saterskog/cell_lab/Gene;->h:F

    move v0, v1

    .line 470
    :goto_0
    if-ge v0, v5, :cond_0

    .line 471
    iget-object v2, p0, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    aget-object v2, v2, v0

    iget-object v3, p1, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    aget-object v3, v3, v0

    iget-short v3, v3, Lcom/saterskog/cell_lab/Gene$a;->d:S

    iput-short v3, v2, Lcom/saterskog/cell_lab/Gene$a;->d:S

    .line 472
    iget-object v2, p0, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    aget-object v2, v2, v0

    iget-object v3, p1, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    aget-object v3, v3, v0

    iget-short v3, v3, Lcom/saterskog/cell_lab/Gene$a;->e:S

    iput-short v3, v2, Lcom/saterskog/cell_lab/Gene$a;->e:S

    .line 473
    iget-object v2, p0, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    aget-object v2, v2, v0

    iget-object v3, p1, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    aget-object v3, v3, v0

    iget v3, v3, Lcom/saterskog/cell_lab/Gene$a;->a:F

    iput v3, v2, Lcom/saterskog/cell_lab/Gene$a;->a:F

    .line 474
    iget-object v2, p0, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    aget-object v2, v2, v0

    iget-object v3, p1, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    aget-object v3, v3, v0

    iget v3, v3, Lcom/saterskog/cell_lab/Gene$a;->b:F

    iput v3, v2, Lcom/saterskog/cell_lab/Gene$a;->b:F

    .line 475
    iget-object v2, p0, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    aget-object v2, v2, v0

    iget-object v3, p1, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    aget-object v3, v3, v0

    iget v3, v3, Lcom/saterskog/cell_lab/Gene$a;->c:F

    iput v3, v2, Lcom/saterskog/cell_lab/Gene$a;->c:F

    .line 470
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 478
    :cond_0
    iget-object v0, p1, Lcom/saterskog/cell_lab/Gene;->u:[I

    iget-object v2, p0, Lcom/saterskog/cell_lab/Gene;->u:[I

    # MODDED AREA BEGIN------------------------------------------------------------------------
    # The java source equivalent line:
    # System.arraycopy(gene.mInts, 0, this.mInts, 0, v5);
    # v5 is changed from 11 to 12. This will copy all 12 mInts[] elements. Hopefully
    # keeping mInt[11] intact after initialization instead of it being zero'ed out.
    # This function is 'a(Gene)V' also known as 'copyGenome(Gene)'.

    const/16 v5, 0xd

    invoke-static {v0, v1, v2, v1, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    const/16 v5, 0xb

    # MODDED AREA END------------------------------------------------------------------------

    .line 480
    iget-object v0, p1, Lcom/saterskog/cell_lab/Gene;->v:[F

    iget-object v2, p0, Lcom/saterskog/cell_lab/Gene;->v:[F

    const/4 v3, 0x7

    invoke-static {v0, v1, v2, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 482
    return-void
.end method

.method public final a(Ljava/io/ObjectInputStream;I)V # Read from stream
    .locals 12

    .prologue
    const/16 v10, 0x9

    const-wide v6, 0x400921fb54442d18L    # Math.PI

    const/4 v5, 0x1

    const/4 v4, 0x0

    const/4 v1, 0x0

    .line 530
    const/4 v0, 0x2

    if-le p2, v0, :cond_5

    .line 531
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readInt()I

    move-result v0

    move v8, v0

    .line 537
    :goto_0
    const/4 v0, 0x7

    if-ge v8, v0, :cond_9

    .line 538
    iget-object v0, p0, Lcom/saterskog/cell_lab/Gene;->a:[F

    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readFloat()F

    move-result v2

    aput v2, v0, v1

    .line 539
    iget-object v0, p0, Lcom/saterskog/cell_lab/Gene;->a:[F

    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readFloat()F

    move-result v2

    aput v2, v0, v5

    .line 540
    iget-object v0, p0, Lcom/saterskog/cell_lab/Gene;->a:[F

    const/4 v2, 0x2

    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readFloat()F

    move-result v3

    aput v3, v0, v2

    .line 541
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readDouble()D

    move-result-wide v2

    double-to-float v0, v2

    iput v0, p0, Lcom/saterskog/cell_lab/Gene;->b:F

    .line 542
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readDouble()D

    move-result-wide v2

    double-to-float v0, v2

    iput v0, p0, Lcom/saterskog/cell_lab/Gene;->c:F

    .line 543
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readDouble()D

    move-result-wide v2

    double-to-float v0, v2

    iput v0, p0, Lcom/saterskog/cell_lab/Gene;->d:F

    .line 546
    const/4 v0, 0x5

    if-ne v8, v0, :cond_6

    .line 547
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readDouble()D

    move-result-wide v2

    add-double/2addr v2, v6

    double-to-float v0, v2

    iput v0, p0, Lcom/saterskog/cell_lab/Gene;->e:F

    .line 550
    :goto_1
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readDouble()D

    move-result-wide v2

    double-to-float v0, v2

    iput v0, p0, Lcom/saterskog/cell_lab/Gene;->f:F

    .line 552
    if-ge v8, v10, :cond_0

    .line 553
    iget v0, p0, Lcom/saterskog/cell_lab/Gene;->d:F

    float-to-double v2, v0

    add-double/2addr v2, v6

    double-to-float v0, v2

    iput v0, p0, Lcom/saterskog/cell_lab/Gene;->d:F

    .line 554
    iget v0, p0, Lcom/saterskog/cell_lab/Gene;->e:F

    float-to-double v2, v0

    add-double/2addr v2, v6

    double-to-float v0, v2

    iput v0, p0, Lcom/saterskog/cell_lab/Gene;->e:F

    .line 555
    iget v0, p0, Lcom/saterskog/cell_lab/Gene;->f:F

    float-to-double v2, v0

    add-double/2addr v2, v6

    double-to-float v0, v2

    iput v0, p0, Lcom/saterskog/cell_lab/Gene;->f:F

    .line 558
    :cond_0
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readDouble()D

    move-result-wide v2

    double-to-float v0, v2

    iput v0, p0, Lcom/saterskog/cell_lab/Gene;->g:F

    .line 559
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readInt()I

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/Gene;->i:I

    .line 560
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readInt()I

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/Gene;->j:I

    .line 561
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readBoolean()Z

    move-result v0

    iput-boolean v0, p0, Lcom/saterskog/cell_lab/Gene;->l:Z

    .line 562
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readBoolean()Z

    move-result v0

    iput-boolean v0, p0, Lcom/saterskog/cell_lab/Gene;->m:Z

    .line 563
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readBoolean()Z

    move-result v0

    iput-boolean v0, p0, Lcom/saterskog/cell_lab/Gene;->n:Z

    .line 564
    sget-object v0, Lcom/saterskog/cell_lab/h;->B:[Lcom/saterskog/cell_lab/h;

    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readInt()I

    move-result v2

    aget-object v0, v0, v2

    iput-object v0, p0, Lcom/saterskog/cell_lab/Gene;->s:Lcom/saterskog/cell_lab/h;

    .line 565
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readInt()I

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/Gene;->k:I

    .line 566
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readBoolean()Z

    move-result v0

    iput-boolean v0, p0, Lcom/saterskog/cell_lab/Gene;->o:Z

    .line 568
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readDouble()D

    move-result-wide v2

    double-to-float v3, v2

    .line 569
    const/4 v0, 0x3

    if-lt v8, v0, :cond_7

    .line 570
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readInt()I

    move-result v2

    .line 571
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readInt()I

    move-result v0

    .line 576
    :goto_2
    const/4 v6, 0x4

    if-lt v8, v6, :cond_8

    .line 577
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readBoolean()Z

    move-result v6

    iput-boolean v6, p0, Lcom/saterskog/cell_lab/Gene;->p:Z

    .line 578
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readBoolean()Z

    move-result v6

    iput-boolean v6, p0, Lcom/saterskog/cell_lab/Gene;->q:Z

    .line 579
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readBoolean()Z

    move-result v6

    iput-boolean v6, p0, Lcom/saterskog/cell_lab/Gene;->r:Z

    .line 580
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readDouble()D

    move-result-wide v6

    double-to-float v6, v6

    iput v6, p0, Lcom/saterskog/cell_lab/Gene;->h:F

    move v6, v2

    move v7, v3

    move v3, v0

    .line 628
    :goto_3
    const/16 v0, 0x8

    if-ge v8, v0, :cond_c

    .line 629
    const v0, 0x3ecccccd    # 0.4f

    .line 634
    :goto_4
    iget v2, p0, Lcom/saterskog/cell_lab/Gene;->i:I

    const/16 v9, 0x50

    if-lt v2, v9, :cond_1

    iput v1, p0, Lcom/saterskog/cell_lab/Gene;->i:I

    .line 635
    :cond_1
    iget v2, p0, Lcom/saterskog/cell_lab/Gene;->j:I

    const/16 v9, 0x50

    if-lt v2, v9, :cond_2

    iput v1, p0, Lcom/saterskog/cell_lab/Gene;->j:I

    .line 636
    :cond_2
    iget v2, p0, Lcom/saterskog/cell_lab/Gene;->i:I

    if-gez v2, :cond_3

    iput v1, p0, Lcom/saterskog/cell_lab/Gene;->i:I

    .line 637
    :cond_3
    iget v2, p0, Lcom/saterskog/cell_lab/Gene;->j:I

    if-gez v2, :cond_4

    iput v1, p0, Lcom/saterskog/cell_lab/Gene;->j:I

    .line 639
    :cond_4
    if-ge v8, v10, :cond_13

    move v2, v1

    .line 641
    :goto_5
    const/16 v8, 0xb

    if-ge v2, v8, :cond_d

    .line 642
    iget-object v8, p0, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    aget-object v8, v8, v2

    iput-short v1, v8, Lcom/saterskog/cell_lab/Gene$a;->d:S

    .line 643
    iget-object v8, p0, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    aget-object v8, v8, v2

    iput v4, v8, Lcom/saterskog/cell_lab/Gene$a;->a:F

    .line 644
    iget-object v8, p0, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    aget-object v8, v8, v2

    iput v4, v8, Lcom/saterskog/cell_lab/Gene$a;->b:F

    .line 645
    iget-object v8, p0, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    aget-object v8, v8, v2

    iput v4, v8, Lcom/saterskog/cell_lab/Gene$a;->c:F

    .line 641
    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    :cond_5
    move v8, v5

    .line 533
    goto/16 :goto_0

    .line 549
    :cond_6
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readDouble()D

    move-result-wide v2

    double-to-float v0, v2

    iput v0, p0, Lcom/saterskog/cell_lab/Gene;->e:F

    goto/16 :goto_1

    :cond_7
    move v0, v1

    move v2, v1

    .line 574
    goto :goto_2

    .line 582
    :cond_8
    iput-boolean v1, p0, Lcom/saterskog/cell_lab/Gene;->p:Z

    .line 583
    iput-boolean v1, p0, Lcom/saterskog/cell_lab/Gene;->q:Z

    .line 584
    iput-boolean v1, p0, Lcom/saterskog/cell_lab/Gene;->r:Z

    .line 585
    iput v4, p0, Lcom/saterskog/cell_lab/Gene;->h:F

    move v6, v2

    move v7, v3

    move v3, v0

    goto :goto_3

    .line 590
    :cond_9
    iget-object v0, p0, Lcom/saterskog/cell_lab/Gene;->a:[F

    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readFloat()F

    move-result v2

    aput v2, v0, v1

    .line 591
    iget-object v0, p0, Lcom/saterskog/cell_lab/Gene;->a:[F

    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readFloat()F

    move-result v2

    aput v2, v0, v5

    .line 592
    iget-object v0, p0, Lcom/saterskog/cell_lab/Gene;->a:[F

    const/4 v2, 0x2

    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readFloat()F

    move-result v3

    aput v3, v0, v2

    .line 593
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readFloat()F

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/Gene;->b:F

    .line 594
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readFloat()F

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/Gene;->c:F

    .line 595
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readFloat()F

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/Gene;->d:F

    .line 596
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readFloat()F

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/Gene;->e:F

    .line 597
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readFloat()F

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/Gene;->f:F

    .line 599
    if-ge v8, v10, :cond_a

    .line 600
    iget v0, p0, Lcom/saterskog/cell_lab/Gene;->d:F

    float-to-double v2, v0

    add-double/2addr v2, v6

    double-to-float v0, v2

    iput v0, p0, Lcom/saterskog/cell_lab/Gene;->d:F

    .line 601
    iget v0, p0, Lcom/saterskog/cell_lab/Gene;->e:F

    float-to-double v2, v0

    add-double/2addr v2, v6

    double-to-float v0, v2

    iput v0, p0, Lcom/saterskog/cell_lab/Gene;->e:F

    .line 602
    iget v0, p0, Lcom/saterskog/cell_lab/Gene;->f:F

    float-to-double v2, v0

    add-double/2addr v2, v6

    double-to-float v0, v2

    iput v0, p0, Lcom/saterskog/cell_lab/Gene;->f:F

    .line 603
    const/high16 v0, 0x3f800000    # 1.0f

    iget v2, p0, Lcom/saterskog/cell_lab/Gene;->c:F

    sub-float/2addr v0, v2

    iput v0, p0, Lcom/saterskog/cell_lab/Gene;->c:F

    .line 606
    :cond_a
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readFloat()F

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/Gene;->g:F

    .line 607
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readInt()I

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/Gene;->i:I

    .line 608
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readInt()I

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/Gene;->j:I

    .line 609
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readBoolean()Z

    move-result v0

    iput-boolean v0, p0, Lcom/saterskog/cell_lab/Gene;->l:Z

    .line 610
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readBoolean()Z

    move-result v0

    iput-boolean v0, p0, Lcom/saterskog/cell_lab/Gene;->m:Z

    .line 611
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readBoolean()Z

    move-result v0

    iput-boolean v0, p0, Lcom/saterskog/cell_lab/Gene;->n:Z

    .line 612
    sget-object v0, Lcom/saterskog/cell_lab/h;->B:[Lcom/saterskog/cell_lab/h;

    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readInt()I

    move-result v2

    aget-object v0, v0, v2

    iput-object v0, p0, Lcom/saterskog/cell_lab/Gene;->s:Lcom/saterskog/cell_lab/h;

    .line 613
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readInt()I

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/Gene;->k:I

    .line 614
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readBoolean()Z

    move-result v0

    iput-boolean v0, p0, Lcom/saterskog/cell_lab/Gene;->o:Z

    .line 615
    if-ge v8, v10, :cond_35

    .line 616
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readFloat()F

    move-result v3

    .line 617
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readInt()I

    move-result v2

    .line 618
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readInt()I

    move-result v0

    .line 620
    :goto_6
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readBoolean()Z

    move-result v6

    iput-boolean v6, p0, Lcom/saterskog/cell_lab/Gene;->p:Z

    .line 621
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readBoolean()Z

    move-result v6

    iput-boolean v6, p0, Lcom/saterskog/cell_lab/Gene;->q:Z

    .line 622
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readBoolean()Z

    move-result v6

    iput-boolean v6, p0, Lcom/saterskog/cell_lab/Gene;->r:Z

    .line 623
    const/16 v6, 0x10

    if-ge v8, v6, :cond_b

    .line 624
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readFloat()F

    move-result v6

    const/high16 v7, 0x420c0000    # 35.0f

    mul-float/2addr v6, v7

    iput v6, p0, Lcom/saterskog/cell_lab/Gene;->h:F

    move v6, v2

    move v7, v3

    move v3, v0

    goto/16 :goto_3

    .line 626
    :cond_b
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readFloat()F

    move-result v6

    iput v6, p0, Lcom/saterskog/cell_lab/Gene;->h:F

    move v6, v2

    move v7, v3

    move v3, v0

    goto/16 :goto_3

    .line 630
    :cond_c
    const/16 v0, 0x8

    if-ne v8, v0, :cond_34

    .line 631
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readFloat()F

    move-result v0

    goto/16 :goto_4

    :cond_d
    move v2, v1

    .line 647
    :goto_7
    const/16 v8, 0xb

    if-ge v2, v8, :cond_e

    .line 648
    iget-object v8, p0, Lcom/saterskog/cell_lab/Gene;->u:[I

    aput v1, v8, v2

    .line 647
    add-int/lit8 v2, v2, 0x1

    goto :goto_7

    :cond_e
    move v2, v1

    .line 650
    :goto_8
    const/4 v8, 0x7

    if-ge v2, v8, :cond_f

    .line 651
    iget-object v8, p0, Lcom/saterskog/cell_lab/Gene;->v:[F

    aput v4, v8, v2

    .line 650
    add-int/lit8 v2, v2, 0x1

    goto :goto_8

    .line 653
    :cond_f
    iget-object v2, p0, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    aget-object v2, v2, v1

    const/high16 v4, -0x40800000    # -1.0f

    const/high16 v8, 0x40000000    # 2.0f

    sget-object v9, Lcom/saterskog/cell_lab/Gene;->x:[F

    aget v9, v9, v1

    sub-float/2addr v0, v9

    mul-float/2addr v0, v8

    sget-object v8, Lcom/saterskog/cell_lab/Gene;->y:[F

    aget v8, v8, v1

    sget-object v9, Lcom/saterskog/cell_lab/Gene;->x:[F

    aget v9, v9, v1

    sub-float/2addr v8, v9

    div-float/2addr v0, v8

    add-float/2addr v0, v4

    iput v0, v2, Lcom/saterskog/cell_lab/Gene$a;->b:F

    .line 654
    iget-object v0, p0, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    aget-object v0, v0, v5

    const/high16 v2, -0x40800000    # -1.0f

    const/high16 v4, 0x40000000    # 2.0f

    sget-object v8, Lcom/saterskog/cell_lab/Gene;->x:[F

    aget v8, v8, v1

    sub-float/2addr v7, v8

    mul-float/2addr v4, v7

    sget-object v7, Lcom/saterskog/cell_lab/Gene;->y:[F

    aget v7, v7, v1

    sget-object v8, Lcom/saterskog/cell_lab/Gene;->x:[F

    aget v8, v8, v1

    sub-float/2addr v7, v8

    div-float/2addr v4, v7

    add-float/2addr v2, v4

    iput v2, v0, Lcom/saterskog/cell_lab/Gene$a;->b:F

    .line 655
    iget-object v0, p0, Lcom/saterskog/cell_lab/Gene;->u:[I

    aput v6, v0, v1

    .line 656
    iget-object v0, p0, Lcom/saterskog/cell_lab/Gene;->u:[I

    aput v3, v0, v5

    .line 657
    iget-object v0, p0, Lcom/saterskog/cell_lab/Gene;->v:[F

    const/4 v2, 0x6

    const/high16 v3, 0x3f800000    # 1.0f

    aput v3, v0, v2

    .line 658
    iget-object v0, p0, Lcom/saterskog/cell_lab/Gene;->u:[I

    sget-object v2, Lcom/saterskog/cell_lab/Gene;->w:[I

    aget v2, v2, v10

    add-int/lit8 v2, v2, -0x1

    aput v2, v0, v10

    .line 2710
    :cond_10
    iget v0, p0, Lcom/saterskog/cell_lab/Gene;->d:F

    float-to-double v2, v0

    const-wide v6, 0x401921fb54442d18L    # 6.283185307179586

    iget v0, p0, Lcom/saterskog/cell_lab/Gene;->d:F

    float-to-double v8, v0

    const-wide v10, 0x401921fb54442d18L    # 6.283185307179586

    div-double/2addr v8, v10

    invoke-static {v8, v9}, Ljava/lang/Math;->floor(D)D

    move-result-wide v8

    mul-double/2addr v6, v8

    sub-double/2addr v2, v6

    double-to-float v0, v2

    iput v0, p0, Lcom/saterskog/cell_lab/Gene;->d:F

    .line 2711
    iget v0, p0, Lcom/saterskog/cell_lab/Gene;->e:F

    float-to-double v2, v0

    const-wide v6, 0x401921fb54442d18L    # 6.283185307179586

    iget v0, p0, Lcom/saterskog/cell_lab/Gene;->e:F

    float-to-double v8, v0

    const-wide v10, 0x401921fb54442d18L    # 6.283185307179586

    div-double/2addr v8, v10

    invoke-static {v8, v9}, Ljava/lang/Math;->floor(D)D

    move-result-wide v8

    mul-double/2addr v6, v8

    sub-double/2addr v2, v6

    double-to-float v0, v2

    iput v0, p0, Lcom/saterskog/cell_lab/Gene;->e:F

    .line 2712
    iget v0, p0, Lcom/saterskog/cell_lab/Gene;->f:F

    float-to-double v2, v0

    const-wide v6, 0x401921fb54442d18L    # 6.283185307179586

    iget v0, p0, Lcom/saterskog/cell_lab/Gene;->f:F

    float-to-double v8, v0

    const-wide v10, 0x401921fb54442d18L    # 6.283185307179586

    div-double/2addr v8, v10

    invoke-static {v8, v9}, Ljava/lang/Math;->floor(D)D

    move-result-wide v8

    mul-double/2addr v6, v8

    sub-double/2addr v2, v6

    double-to-float v0, v2

    iput v0, p0, Lcom/saterskog/cell_lab/Gene;->f:F

    move v0, v1

    .line 2713
    :goto_9
    const/4 v2, 0x7

    if-ge v0, v2, :cond_1e

    .line 2715
    iget-object v2, p0, Lcom/saterskog/cell_lab/Gene;->v:[F

    aget v2, v2, v0

    sget-object v3, Lcom/saterskog/cell_lab/Gene;->z:[F

    aget v3, v3, v0

    cmpg-float v2, v2, v3

    if-gez v2, :cond_11

    iget-object v2, p0, Lcom/saterskog/cell_lab/Gene;->v:[F

    sget-object v3, Lcom/saterskog/cell_lab/Gene;->z:[F

    aget v3, v3, v0

    aput v3, v2, v0

    .line 2716
    :cond_11
    iget-object v2, p0, Lcom/saterskog/cell_lab/Gene;->v:[F

    aget v2, v2, v0

    sget-object v3, Lcom/saterskog/cell_lab/Gene;->A:[F

    aget v3, v3, v0

    cmpl-float v2, v2, v3

    if-lez v2, :cond_12

    iget-object v2, p0, Lcom/saterskog/cell_lab/Gene;->v:[F

    sget-object v3, Lcom/saterskog/cell_lab/Gene;->A:[F

    aget v3, v3, v0

    aput v3, v2, v0

    .line 2713
    :cond_12
    add-int/lit8 v0, v0, 0x1

    goto :goto_9

    :cond_13
    move v0, v1

    .line 660
    :goto_a
    const/16 v2, 0xb

    if-ge v0, v2, :cond_17

    .line 661
    iget-object v2, p0, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    aget-object v2, v2, v0

    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readShort()S

    move-result v3

    iput-short v3, v2, Lcom/saterskog/cell_lab/Gene$a;->d:S

    .line 662
    const/16 v2, 0x11

    if-lt v8, v2, :cond_14

    .line 663
    iget-object v2, p0, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    aget-object v2, v2, v0

    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readShort()S

    move-result v3

    iput-short v3, v2, Lcom/saterskog/cell_lab/Gene$a;->e:S

    .line 680
    :goto_b
    iget-object v2, p0, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    aget-object v2, v2, v0

    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readFloat()F

    move-result v3

    iput v3, v2, Lcom/saterskog/cell_lab/Gene$a;->a:F

    .line 681
    iget-object v2, p0, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    aget-object v2, v2, v0

    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readFloat()F

    move-result v3

    iput v3, v2, Lcom/saterskog/cell_lab/Gene$a;->b:F

    .line 682
    iget-object v2, p0, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    aget-object v2, v2, v0

    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readFloat()F

    move-result v3

    iput v3, v2, Lcom/saterskog/cell_lab/Gene$a;->c:F

    .line 660
    add-int/lit8 v0, v0, 0x1

    goto :goto_a

    .line 665
    :cond_14
    iget-object v2, p0, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    aget-object v2, v2, v0

    iget-short v2, v2, Lcom/saterskog/cell_lab/Gene$a;->d:S

    const/4 v3, -0x1

    if-ne v2, v3, :cond_15

    .line 666
    iget-object v2, p0, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    aget-object v2, v2, v0

    iput-short v1, v2, Lcom/saterskog/cell_lab/Gene$a;->d:S

    .line 667
    iget-object v2, p0, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    aget-object v2, v2, v0

    iput-short v1, v2, Lcom/saterskog/cell_lab/Gene$a;->e:S

    goto :goto_b

    .line 670
    :cond_15
    iget-object v2, p0, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    aget-object v2, v2, v0

    iget-short v2, v2, Lcom/saterskog/cell_lab/Gene$a;->d:S

    const/4 v3, 0x4

    if-ge v2, v3, :cond_16

    .line 671
    iget-object v2, p0, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    aget-object v2, v2, v0

    iput-short v5, v2, Lcom/saterskog/cell_lab/Gene$a;->e:S

    goto :goto_b

    .line 675
    :cond_16
    iget-object v2, p0, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    aget-object v2, v2, v0

    iget-short v3, v2, Lcom/saterskog/cell_lab/Gene$a;->d:S

    add-int/lit8 v3, v3, -0x4

    int-to-short v3, v3

    iput-short v3, v2, Lcom/saterskog/cell_lab/Gene$a;->d:S

    .line 676
    iget-object v2, p0, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    aget-object v2, v2, v0

    const/4 v3, 0x2

    iput-short v3, v2, Lcom/saterskog/cell_lab/Gene$a;->e:S

    goto :goto_b

    :cond_17
    move v0, v1

    .line 684
    :goto_c
    const/16 v2, 0xb

    if-ge v0, v2, :cond_1b

    .line 685
    const/16 v2, 0xa

    if-ne v8, v2, :cond_18

    const/4 v2, 0x4

    if-ne v0, v2, :cond_18

    iget-object v2, p0, Lcom/saterskog/cell_lab/Gene;->u:[I

    aput v5, v2, v0

    .line 684
    :goto_d
    add-int/lit8 v0, v0, 0x1

    goto :goto_c

    .line 686
    :cond_18
    const/16 v2, 0xf

    if-ge v8, v2, :cond_19

    if-ne v0, v10, :cond_19

    iget-object v2, p0, Lcom/saterskog/cell_lab/Gene;->u:[I

    const/16 v3, 0x12

    aput v3, v2, v0

    goto :goto_d

    .line 687
    :cond_19
    const/16 v2, 0x14

    if-ge v8, v2, :cond_1a

    const/16 v2, 0xa

    if-ne v0, v2, :cond_1a

    iget-object v2, p0, Lcom/saterskog/cell_lab/Gene;->u:[I

    aput v1, v2, v0

    goto :goto_d

    .line 688
    :cond_1a
    iget-object v2, p0, Lcom/saterskog/cell_lab/Gene;->u:[I

    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readInt()I

    move-result v3

    aput v3, v2, v0

    goto :goto_d

    :cond_1b

    move v0, v1

    .line 690
    :goto_e
    const/4 v2, 0x7

    if-ge v0, v2, :cond_10

    .line 691
    const/16 v2, 0xe

    if-ge v8, v2, :cond_1c

    const/4 v2, 0x6

    if-ne v0, v2, :cond_1c

    iget-object v2, p0, Lcom/saterskog/cell_lab/Gene;->v:[F

    const/high16 v3, 0x3f800000    # 1.0f

    aput v3, v2, v0

    .line 690
    :goto_f
    add-int/lit8 v0, v0, 0x1

    goto :goto_e

    .line 692
    :cond_1c
    const/16 v2, 0x10

    if-ge v8, v2, :cond_1d

    const/4 v2, 0x5

    if-ne v0, v2, :cond_1d

    iget-object v2, p0, Lcom/saterskog/cell_lab/Gene;->v:[F

    aput v4, v2, v0

    goto :goto_f

    .line 694
    :cond_1d
    iget-object v2, p0, Lcom/saterskog/cell_lab/Gene;->v:[F

    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readFloat()F

    move-result v3

    aput v3, v2, v0

    goto :goto_f

    :cond_1e
    move v0, v1

    .line 2718
    :goto_10
    const/16 v2, 0xb

    if-ge v0, v2, :cond_21

    .line 2720
    iget-object v2, p0, Lcom/saterskog/cell_lab/Gene;->u:[I

    aget v2, v2, v0

    if-gez v2, :cond_1f

    iget-object v2, p0, Lcom/saterskog/cell_lab/Gene;->u:[I

    aput v1, v2, v0

    .line 2721
    :cond_1f
    iget-object v2, p0, Lcom/saterskog/cell_lab/Gene;->u:[I

    aget v2, v2, v0

    sget-object v3, Lcom/saterskog/cell_lab/Gene;->w:[I

    aget v3, v3, v0

    if-lt v2, v3, :cond_20

    iget-object v2, p0, Lcom/saterskog/cell_lab/Gene;->u:[I

    sget-object v3, Lcom/saterskog/cell_lab/Gene;->w:[I

    aget v3, v3, v0

    add-int/lit8 v3, v3, -0x1

    aput v3, v2, v0

    .line 2718
    :cond_20
    add-int/lit8 v0, v0, 0x1

    goto :goto_10

    :cond_21
    move v0, v1

    .line 2723
    :goto_11
    const/16 v2, 0xb

    if-ge v0, v2, :cond_2c

    .line 2725
    iget-object v2, p0, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    aget-object v2, v2, v0

    iget v2, v2, Lcom/saterskog/cell_lab/Gene$a;->a:F

    const/high16 v3, -0x3f000000    # -8.0f

    cmpg-float v2, v2, v3

    if-gez v2, :cond_22

    iget-object v2, p0, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    aget-object v2, v2, v0

    const/high16 v3, -0x3f000000    # -8.0f

    iput v3, v2, Lcom/saterskog/cell_lab/Gene$a;->a:F

    .line 2726
    :cond_22
    iget-object v2, p0, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    aget-object v2, v2, v0

    iget v2, v2, Lcom/saterskog/cell_lab/Gene$a;->b:F

    const/high16 v3, -0x3f000000    # -8.0f

    cmpg-float v2, v2, v3

    if-gez v2, :cond_23

    iget-object v2, p0, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    aget-object v2, v2, v0

    const/high16 v3, -0x3f000000    # -8.0f

    iput v3, v2, Lcom/saterskog/cell_lab/Gene$a;->b:F

    .line 2727
    :cond_23
    iget-object v2, p0, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    aget-object v2, v2, v0

    iget v2, v2, Lcom/saterskog/cell_lab/Gene$a;->c:F

    const/high16 v3, -0x3f000000    # -8.0f

    cmpg-float v2, v2, v3

    if-gez v2, :cond_24

    iget-object v2, p0, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    aget-object v2, v2, v0

    const/high16 v3, -0x3f000000    # -8.0f

    iput v3, v2, Lcom/saterskog/cell_lab/Gene$a;->c:F

    .line 2729
    :cond_24
    iget-object v2, p0, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    aget-object v2, v2, v0

    iget v2, v2, Lcom/saterskog/cell_lab/Gene$a;->a:F

    const/high16 v3, 0x41000000    # 8.0f

    cmpl-float v2, v2, v3

    if-lez v2, :cond_25

    iget-object v2, p0, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    aget-object v2, v2, v0

    const/high16 v3, 0x41000000    # 8.0f

    iput v3, v2, Lcom/saterskog/cell_lab/Gene$a;->a:F

    .line 2730
    :cond_25
    iget-object v2, p0, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    aget-object v2, v2, v0

    iget v2, v2, Lcom/saterskog/cell_lab/Gene$a;->b:F

    const/high16 v3, 0x41000000    # 8.0f

    cmpl-float v2, v2, v3

    if-lez v2, :cond_26

    iget-object v2, p0, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    aget-object v2, v2, v0

    const/high16 v3, 0x41000000    # 8.0f

    iput v3, v2, Lcom/saterskog/cell_lab/Gene$a;->b:F

    .line 2731
    :cond_26
    iget-object v2, p0, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    aget-object v2, v2, v0

    iget v2, v2, Lcom/saterskog/cell_lab/Gene$a;->c:F

    const/high16 v3, 0x41000000    # 8.0f

    cmpl-float v2, v2, v3

    if-lez v2, :cond_27

    iget-object v2, p0, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    aget-object v2, v2, v0

    const/high16 v3, 0x41000000    # 8.0f

    iput v3, v2, Lcom/saterskog/cell_lab/Gene$a;->c:F

    .line 2733
    :cond_27
    iget-object v2, p0, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    aget-object v2, v2, v0

    iget-short v2, v2, Lcom/saterskog/cell_lab/Gene$a;->e:S

    if-gez v2, :cond_28

    iget-object v2, p0, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    aget-object v2, v2, v0

    iput-short v1, v2, Lcom/saterskog/cell_lab/Gene$a;->e:S

    .line 2734
    :cond_28
    iget-object v2, p0, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    aget-object v2, v2, v0

    iget-short v2, v2, Lcom/saterskog/cell_lab/Gene$a;->e:S

    const/4 v3, 0x2

    if-le v2, v3, :cond_29

    iget-object v2, p0, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    aget-object v2, v2, v0

    const/4 v3, 0x2

    iput-short v3, v2, Lcom/saterskog/cell_lab/Gene$a;->e:S

    .line 2735
    :cond_29
    iget-object v2, p0, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    aget-object v2, v2, v0

    iget-short v2, v2, Lcom/saterskog/cell_lab/Gene$a;->d:S

    if-gez v2, :cond_2a

    iget-object v2, p0, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    aget-object v2, v2, v0

    iput-short v1, v2, Lcom/saterskog/cell_lab/Gene$a;->d:S

    .line 2736
    :cond_2a
    iget-object v2, p0, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    aget-object v2, v2, v0

    iget-short v2, v2, Lcom/saterskog/cell_lab/Gene$a;->d:S

    const/16 v3, 0x8

    if-lt v2, v3, :cond_2b

    iget-object v2, p0, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    aget-object v2, v2, v0

    const/4 v3, 0x7

    iput-short v3, v2, Lcom/saterskog/cell_lab/Gene$a;->d:S

    .line 2723
    :cond_2b
    add-int/lit8 v0, v0, 0x1

    goto/16 :goto_11

    .line 2739
    :cond_2c

    iget v0, p0, Lcom/saterskog/cell_lab/Gene;->c:F

    const v2, 0x3dcccccd    # 0.1f

    cmpg-float v0, v0, v2

    if-gez v0, :cond_2d

    const v0, 0x3dcccccd    # 0.1f

    iput v0, p0, Lcom/saterskog/cell_lab/Gene;->c:F

    .line 2740
    :cond_2d
    iget v0, p0, Lcom/saterskog/cell_lab/Gene;->c:F

    const v2, 0x3f666666    # 0.9f

    cmpl-float v0, v0, v2

    if-lez v0, :cond_2e

    const v0, 0x3f666666    # 0.9f

    iput v0, p0, Lcom/saterskog/cell_lab/Gene;->c:F

    .line 2741
    :cond_2e
    iget v0, p0, Lcom/saterskog/cell_lab/Gene;->g:F

    const/high16 v2, 0x41200000    # 10.0f

    cmpl-float v0, v0, v2

    if-lez v0, :cond_2f

    const/high16 v0, 0x41200000    # 10.0f

    iput v0, p0, Lcom/saterskog/cell_lab/Gene;->g:F

    .line 2742
    :cond_2f
    iget v0, p0, Lcom/saterskog/cell_lab/Gene;->g:F

    const v2, 0x3dcccccd    # 0.1f

    cmpg-float v0, v0, v2

    if-gez v0, :cond_30

    const v0, 0x3dcccccd    # 0.1f

    iput v0, p0, Lcom/saterskog/cell_lab/Gene;->g:F

    .line 2746
    :cond_30
    iget v0, p0, Lcom/saterskog/cell_lab/Gene;->g:F

    const/high16 v2, 0x41200000    # 10.0f

    cmpl-float v0, v0, v2

    if-lez v0, :cond_33

    .line 702
    :cond_31
    :goto_12
    if-nez v1, :cond_32

    .line 703
    const-string v0, "Illegal values, cosmic radiation or cheater.."

    invoke-static {v0}, Lcom/saterskog/b/a;->a(Ljava/lang/String;)V

    .line 706
    :cond_32

    # MODDED AREA BEGIN -------------------------------------------------------------------------------
    # Function: 'a(Stream)' or 'readStream(Stream' or 'loadGeneFromStream(Stream)'
    # This patch reads mInts[11] & mInts[12] around a try-catch for vanilla compatibility


    const/16 v0, 0xbef
    if-eq v0, p2, :cont_0

    goto :catch_rs0

    :cont_0

    iget-object v2, p0, Lcom/saterskog/cell_lab/Gene;->u:[I
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readInt()I
    move-result v3
    const/16 v6, 0xb
    aput v3, v2, v6

    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readInt()I
    move-result v3
    const/16 v6, 0xc
    aput v3, v2, v6


    goto :goto_rs0_modded_end

    :catch_rs0

    iget-object v2, p0, Lcom/saterskog/cell_lab/Gene;->u:[I
    const/16 v3, 0x14
    const/16 v6, 0xb
    aput v3, v2, v6
    const/4 v3, 0x0
    const/16 v6, 0xc
    aput v3, v2, v6

    :goto_rs0_modded_end

    # MODDED AREA END ---------------------------------------------------------------------------------

    return-void

    .line 2747
    :cond_33
    iget v0, p0, Lcom/saterskog/cell_lab/Gene;->g:F

    const v2, 0x3dcccccd    # 0.1f

    cmpg-float v0, v0, v2

    if-ltz v0, :cond_31

    .line 2749
    iget v0, p0, Lcom/saterskog/cell_lab/Gene;->c:F

    const v2, 0x3dcccccd    # 0.1f

    cmpg-float v0, v0, v2

    if-ltz v0, :cond_31

    .line 2750
    iget v0, p0, Lcom/saterskog/cell_lab/Gene;->c:F

    float-to-double v2, v0

    const-wide v6, 0x3feccccccc000000L    # 0.8999999985098839

    cmpl-double v0, v2, v6

    if-gtz v0, :cond_31

    move v1, v5

    .line 2751
    goto :goto_12

    :cond_34
    move v0, v4

    goto/16 :goto_4

    :cond_35
    move v0, v1

    move v2, v1

    move v3, v4

    goto/16 :goto_6
.end method


.method public final a(Ljava/io/ObjectOutputStream;)V # Write to stream
    .locals 4

    .prologue
    const/16 v3, 0xb

    const/4 v0, 0x0

    .line 485
    const/16 v1, 0xbef

    invoke-virtual {p1, v1}, Ljava/io/ObjectOutputStream;->writeInt(I)V

    .line 486
    iget-object v1, p0, Lcom/saterskog/cell_lab/Gene;->a:[F

    aget v1, v1, v0

    invoke-virtual {p1, v1}, Ljava/io/ObjectOutputStream;->writeFloat(F)V

    .line 487
    iget-object v1, p0, Lcom/saterskog/cell_lab/Gene;->a:[F

    const/4 v2, 0x1

    aget v1, v1, v2

    invoke-virtual {p1, v1}, Ljava/io/ObjectOutputStream;->writeFloat(F)V

    .line 488
    iget-object v1, p0, Lcom/saterskog/cell_lab/Gene;->a:[F

    const/4 v2, 0x2

    aget v1, v1, v2

    invoke-virtual {p1, v1}, Ljava/io/ObjectOutputStream;->writeFloat(F)V

    .line 489
    iget v1, p0, Lcom/saterskog/cell_lab/Gene;->b:F

    invoke-virtual {p1, v1}, Ljava/io/ObjectOutputStream;->writeFloat(F)V

    .line 490
    iget v1, p0, Lcom/saterskog/cell_lab/Gene;->c:F

    invoke-virtual {p1, v1}, Ljava/io/ObjectOutputStream;->writeFloat(F)V

    .line 491
    iget v1, p0, Lcom/saterskog/cell_lab/Gene;->d:F

    invoke-virtual {p1, v1}, Ljava/io/ObjectOutputStream;->writeFloat(F)V

    .line 492
    iget v1, p0, Lcom/saterskog/cell_lab/Gene;->e:F

    invoke-virtual {p1, v1}, Ljava/io/ObjectOutputStream;->writeFloat(F)V

    .line 493
    iget v1, p0, Lcom/saterskog/cell_lab/Gene;->f:F

    invoke-virtual {p1, v1}, Ljava/io/ObjectOutputStream;->writeFloat(F)V

    .line 494
    iget v1, p0, Lcom/saterskog/cell_lab/Gene;->g:F

    invoke-virtual {p1, v1}, Ljava/io/ObjectOutputStream;->writeFloat(F)V

    .line 495
    iget v1, p0, Lcom/saterskog/cell_lab/Gene;->i:I

    invoke-virtual {p1, v1}, Ljava/io/ObjectOutputStream;->writeInt(I)V

    .line 496
    iget v1, p0, Lcom/saterskog/cell_lab/Gene;->j:I

    invoke-virtual {p1, v1}, Ljava/io/ObjectOutputStream;->writeInt(I)V

    .line 497
    iget-boolean v1, p0, Lcom/saterskog/cell_lab/Gene;->l:Z

    invoke-virtual {p1, v1}, Ljava/io/ObjectOutputStream;->writeBoolean(Z)V

    .line 498
    iget-boolean v1, p0, Lcom/saterskog/cell_lab/Gene;->m:Z

    invoke-virtual {p1, v1}, Ljava/io/ObjectOutputStream;->writeBoolean(Z)V

    .line 499
    iget-boolean v1, p0, Lcom/saterskog/cell_lab/Gene;->n:Z

    invoke-virtual {p1, v1}, Ljava/io/ObjectOutputStream;->writeBoolean(Z)V

    .line 500
    iget-object v1, p0, Lcom/saterskog/cell_lab/Gene;->s:Lcom/saterskog/cell_lab/h;

    invoke-virtual {v1}, Lcom/saterskog/cell_lab/h;->ordinal()I

    move-result v1

    invoke-virtual {p1, v1}, Ljava/io/ObjectOutputStream;->writeInt(I)V

    .line 501
    iget v1, p0, Lcom/saterskog/cell_lab/Gene;->k:I

    invoke-virtual {p1, v1}, Ljava/io/ObjectOutputStream;->writeInt(I)V

    .line 502
    iget-boolean v1, p0, Lcom/saterskog/cell_lab/Gene;->o:Z

    invoke-virtual {p1, v1}, Ljava/io/ObjectOutputStream;->writeBoolean(Z)V

    .line 506
    iget-boolean v1, p0, Lcom/saterskog/cell_lab/Gene;->p:Z

    invoke-virtual {p1, v1}, Ljava/io/ObjectOutputStream;->writeBoolean(Z)V

    .line 507
    iget-boolean v1, p0, Lcom/saterskog/cell_lab/Gene;->q:Z

    invoke-virtual {p1, v1}, Ljava/io/ObjectOutputStream;->writeBoolean(Z)V

    .line 508
    iget-boolean v1, p0, Lcom/saterskog/cell_lab/Gene;->r:Z

    invoke-virtual {p1, v1}, Ljava/io/ObjectOutputStream;->writeBoolean(Z)V

    .line 509
    iget v1, p0, Lcom/saterskog/cell_lab/Gene;->h:F

    invoke-virtual {p1, v1}, Ljava/io/ObjectOutputStream;->writeFloat(F)V

    move v1, v0

    .line 511
    :goto_0
    if-ge v1, v3, :cond_0

    .line 512
    iget-object v2, p0, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    aget-object v2, v2, v1

    iget-short v2, v2, Lcom/saterskog/cell_lab/Gene$a;->d:S

    invoke-virtual {p1, v2}, Ljava/io/ObjectOutputStream;->writeShort(I)V

    .line 513
    iget-object v2, p0, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    aget-object v2, v2, v1

    iget-short v2, v2, Lcom/saterskog/cell_lab/Gene$a;->e:S

    invoke-virtual {p1, v2}, Ljava/io/ObjectOutputStream;->writeShort(I)V

    .line 514
    iget-object v2, p0, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    aget-object v2, v2, v1

    iget v2, v2, Lcom/saterskog/cell_lab/Gene$a;->a:F

    invoke-virtual {p1, v2}, Ljava/io/ObjectOutputStream;->writeFloat(F)V

    .line 515
    iget-object v2, p0, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    aget-object v2, v2, v1

    iget v2, v2, Lcom/saterskog/cell_lab/Gene$a;->b:F

    invoke-virtual {p1, v2}, Ljava/io/ObjectOutputStream;->writeFloat(F)V

    .line 516
    iget-object v2, p0, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    aget-object v2, v2, v1

    iget v2, v2, Lcom/saterskog/cell_lab/Gene$a;->c:F

    invoke-virtual {p1, v2}, Ljava/io/ObjectOutputStream;->writeFloat(F)V

    .line 511
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    move v1, v0

    .line 518
    :goto_1
    if-ge v1, v3, :cond_1

    .line 519
    iget-object v2, p0, Lcom/saterskog/cell_lab/Gene;->u:[I

    aget v2, v2, v1

    invoke-virtual {p1, v2}, Ljava/io/ObjectOutputStream;->writeInt(I)V

    .line 518
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 521
    :cond_1

    :goto_2
    const/4 v1, 0x7

    if-ge v0, v1, :cond_2

    .line 522
    iget-object v1, p0, Lcom/saterskog/cell_lab/Gene;->v:[F

    aget v1, v1, v0

    invoke-virtual {p1, v1}, Ljava/io/ObjectOutputStream;->writeFloat(F)V

    .line 521
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 524
    :cond_2

    # MODDED AREA BEGIN ----------------------------------------------------------------------------------
    # Function: 'a(Stream)' or 'writeToStream(Stream)' or 'writeGenesToStream(Stream)'
    # This patch writes to the stream mInts[11] & mInts[12]

    const/16 v1, 0xb
    iget-object v2, p0, Lcom/saterskog/cell_lab/Gene;->u:[I
    aget v2, v2, v1
    invoke-virtual {p1, v2}, Ljava/io/ObjectOutputStream;->writeInt(I)V

    const/16 v1, 0xc
    iget-object v2, p0, Lcom/saterskog/cell_lab/Gene;->u:[I
    aget v2, v2, v1
    invoke-virtual {p1, v2}, Ljava/io/ObjectOutputStream;->writeInt(I)V

    # MODDED AREA END ------------------------------------------------------------------------------------

    return-void
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 194
    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    .prologue
    const/16 v3, 0xb

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 199
    iget-object v0, p0, Lcom/saterskog/cell_lab/Gene;->a:[F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloatArray([F)V

    .line 200
    iget v0, p0, Lcom/saterskog/cell_lab/Gene;->b:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    .line 201
    iget v0, p0, Lcom/saterskog/cell_lab/Gene;->c:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    .line 202
    iget v0, p0, Lcom/saterskog/cell_lab/Gene;->d:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    .line 203
    iget v0, p0, Lcom/saterskog/cell_lab/Gene;->e:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    .line 204
    iget v0, p0, Lcom/saterskog/cell_lab/Gene;->f:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    .line 205
    iget v0, p0, Lcom/saterskog/cell_lab/Gene;->g:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    .line 206
    iget v0, p0, Lcom/saterskog/cell_lab/Gene;->i:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 207
    iget v0, p0, Lcom/saterskog/cell_lab/Gene;->j:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 208
    iget-boolean v0, p0, Lcom/saterskog/cell_lab/Gene;->l:Z

    if-eqz v0, :cond_0

    move v0, v1

    :goto_0
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 209
    iget-boolean v0, p0, Lcom/saterskog/cell_lab/Gene;->m:Z

    if-eqz v0, :cond_1

    move v0, v1

    :goto_1
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 210
    iget-boolean v0, p0, Lcom/saterskog/cell_lab/Gene;->n:Z

    if-eqz v0, :cond_2

    move v0, v1

    :goto_2
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 211
    iget-object v0, p0, Lcom/saterskog/cell_lab/Gene;->s:Lcom/saterskog/cell_lab/h;

    invoke-virtual {v0}, Lcom/saterskog/cell_lab/h;->ordinal()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 212
    iget v0, p0, Lcom/saterskog/cell_lab/Gene;->k:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 213
    iget-boolean v0, p0, Lcom/saterskog/cell_lab/Gene;->o:Z

    if-eqz v0, :cond_3

    move v0, v1

    :goto_3
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 217
    iget-boolean v0, p0, Lcom/saterskog/cell_lab/Gene;->p:Z

    if-eqz v0, :cond_4

    move v0, v1

    :goto_4
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 218
    iget-boolean v0, p0, Lcom/saterskog/cell_lab/Gene;->q:Z

    if-eqz v0, :cond_5

    move v0, v1

    :goto_5
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 219
    iget-boolean v0, p0, Lcom/saterskog/cell_lab/Gene;->r:Z

    if-eqz v0, :cond_6

    :goto_6
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 220
    iget v0, p0, Lcom/saterskog/cell_lab/Gene;->h:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    move v0, v2

    .line 223
    :goto_7
    if-ge v0, v3, :cond_7

    .line 224
    iget-object v1, p0, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    aget-object v1, v1, v0

    iget-short v1, v1, Lcom/saterskog/cell_lab/Gene$a;->d:S

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 225
    iget-object v1, p0, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    aget-object v1, v1, v0

    iget-short v1, v1, Lcom/saterskog/cell_lab/Gene$a;->e:S

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 226
    iget-object v1, p0, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    aget-object v1, v1, v0

    iget v1, v1, Lcom/saterskog/cell_lab/Gene$a;->a:F

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeFloat(F)V

    .line 227
    iget-object v1, p0, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    aget-object v1, v1, v0

    iget v1, v1, Lcom/saterskog/cell_lab/Gene$a;->b:F

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeFloat(F)V

    .line 228
    iget-object v1, p0, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    aget-object v1, v1, v0

    iget v1, v1, Lcom/saterskog/cell_lab/Gene$a;->c:F

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeFloat(F)V

    .line 223
    add-int/lit8 v0, v0, 0x1

    goto :goto_7

    :cond_0
    move v0, v2

    .line 208
    goto :goto_0

    :cond_1
    move v0, v2

    .line 209
    goto :goto_1

    :cond_2
    move v0, v2

    .line 210
    goto :goto_2

    :cond_3
    move v0, v2

    .line 213
    goto :goto_3

    :cond_4
    move v0, v2

    .line 217
    goto :goto_4

    :cond_5
    move v0, v2

    .line 218
    goto :goto_5

    :cond_6
    move v1, v2

    .line 219
    goto :goto_6

    :cond_7
    move v0, v2

    .line 230
    :goto_8
    if-ge v0, v3, :cond_8

    .line 231
    iget-object v1, p0, Lcom/saterskog/cell_lab/Gene;->u:[I

    aget v1, v1, v0

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 230
    add-int/lit8 v0, v0, 0x1

    goto :goto_8

    .line 233
    :cond_8

    :goto_9

    :cond_enzyme_wp0

    const/4 v0, 0x7

    if-ge v2, v0, :cond_9

    .line 234
    iget-object v0, p0, Lcom/saterskog/cell_lab/Gene;->v:[F

    aget v0, v0, v2

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    .line 233
    add-int/lit8 v2, v2, 0x1

    goto :goto_9

    .line 236
    :cond_9

    # MODDED AREA BEGIN------------------------------------------------------------------------------
    # Function: writeToParcel(Parcel)
    # This patch writes to the parceleable stream mInts[11] & mInts[12]

    const/16 v0, 0xb
    iget-object v1, p0, Lcom/saterskog/cell_lab/Gene;->u:[I
    aget v1, v1, v0
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    const/16 v0, 0xc
    iget-object v1, p0, Lcom/saterskog/cell_lab/Gene;->u:[I
    aget v1, v1, v0
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    # MODDED AREA END----------------------------------------------------------------------------------

    return-void
.end method
