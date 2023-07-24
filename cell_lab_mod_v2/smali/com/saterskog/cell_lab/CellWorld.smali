.class public Lcom/saterskog/cell_lab/CellWorld;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/saterskog/cell_lab/CellWorld;",
            ">;"
        }
    .end annotation
.end field

.field static final a:D

.field static final b:D

.field static final c:D


# instance fields
.field A:[Lcom/saterskog/cell_lab/Food;

.field B:I

.field C:I

.field D:[[I

.field E:[I

.field public F:F

.field public G:F

.field public H:F

.field public I:Z

.field final J:[Lcom/saterskog/cell_lab/Link;

.field final K:[I

.field public L:Z

.field M:D

.field N:D

.field O:D

.field P:D

.field Q:D

.field R:I

.field S:I

.field T:D

.field U:Z

.field public V:I

.field public W:I

.field X:I

.field public Y:Lcom/saterskog/b/d;

.field private final Z:I

.field private aA:[I

.field private aB:[I

.field private aC:I

.field private aD:I

.field private aE:I

.field private aF:I

.field private aG:I

.field private aH:I

.field private aI:I

.field private aJ:I

.field private aK:I

.field private aL:I

.field private aM:I

.field private aN:I

.field private aO:I

.field private aP:I

.field private aQ:[I

.field private aR:I

.field private aS:I

.field private aT:I

.field private aU:I

.field private aV:[[I

.field private aW:[I

.field private aX:I

.field private aY:[I

.field private aZ:[I

.field private final aa:I

.field private ab:I

.field private ac:I

.field private final ad:[F

.field private final ae:[F

.field private final af:[F

.field private final ag:[F

.field private final ah:[F

.field private final ai:[F

.field private final aj:[F

.field private final ak:[F

.field private final al:[F

.field private final am:[F

.field private final an:[F

.field private final ao:[F

.field private ap:I

.field private final aq:[S

.field private ar:I

.field private as:I

.field private at:I

.field private au:[I

.field private av:[I

.field private aw:[I

.field private ax:[I

.field private ay:[I

.field private az:[I

.field private ba:[[I

.field private bb:[[S

.field private bc:[I

.field private final bd:I

.field private be:I

.field private bf:I

.field private bg:Z

.field private bh:I

.field private bi:I

.field final d:I

.field final e:Lcom/saterskog/cell_lab/Environment;

.field f:Ljava/nio/ByteBuffer;

.field g:Ljava/nio/ByteBuffer;

.field h:Ljava/nio/ByteBuffer;

.field i:Ljava/nio/ByteBuffer;

.field j:Ljava/nio/ByteBuffer;

.field k:Ljava/nio/FloatBuffer;

.field l:Ljava/nio/FloatBuffer;

.field m:Ljava/nio/FloatBuffer;

.field n:Ljava/nio/FloatBuffer;

.field o:Ljava/nio/FloatBuffer;

.field p:Ljava/nio/ShortBuffer;

.field final q:[[I

.field final r:[[I

.field final s:[[I

.field final t:[[I

.field final u:[I

.field final v:[D

.field final w:[D

.field x:[Lcom/saterskog/cell_lab/Cell;

.field y:[Lcom/saterskog/cell_lab/e;

.field z:I


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .prologue
    const-wide/high16 v4, 0x4000000000000000L    # 2.0

    .line 28
    invoke-static {v4, v5}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    sput-wide v0, Lcom/saterskog/cell_lab/CellWorld;->a:D

    const-wide/high16 v0, 0x4008000000000000L    # 3.0

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    const-wide/high16 v2, 0x4010000000000000L    # 4.0

    div-double/2addr v0, v2

    sput-wide v0, Lcom/saterskog/cell_lab/CellWorld;->b:D

    .line 29
    invoke-static {v4, v5}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    add-double/2addr v0, v4

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    div-double v0, v4, v0

    sput-wide v0, Lcom/saterskog/cell_lab/CellWorld;->c:D

    .line 4353
    new-instance v0, Lcom/saterskog/cell_lab/CellWorld$1;

    invoke-direct {v0}, Lcom/saterskog/cell_lab/CellWorld$1;-><init>()V

    sput-object v0, Lcom/saterskog/cell_lab/CellWorld;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 377
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-ne v1, v0, :cond_0

    move v1, v0

    :goto_0
    const-class v0, Lcom/saterskog/cell_lab/Environment;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/saterskog/cell_lab/Environment;

    invoke-direct {p0, v1, v0}, Lcom/saterskog/cell_lab/CellWorld;-><init>(ZLcom/saterskog/cell_lab/Environment;)V

    .line 378
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/CellWorld;->z:I

    .line 379
    sget-object v0, Lcom/saterskog/cell_lab/Cell;->ad:Landroid/os/Parcelable$Creator;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->createTypedArray(Landroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/saterskog/cell_lab/Cell;

    iput-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    .line 380
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/CellWorld;->B:I

    .line 381
    sget-object v0, Lcom/saterskog/cell_lab/Food;->g:Landroid/os/Parcelable$Creator;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->createTypedArray(Landroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/saterskog/cell_lab/Food;

    iput-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->A:[Lcom/saterskog/cell_lab/Food;

    .line 382
    invoke-virtual {p1}, Landroid/os/Parcel;->readDouble()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/saterskog/cell_lab/CellWorld;->M:D

    .line 383
    invoke-virtual {p1}, Landroid/os/Parcel;->readDouble()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/saterskog/cell_lab/CellWorld;->O:D

    .line 385
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/CellWorld;->V:I

    .line 386
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/CellWorld;->W:I

    .line 388
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/CellWorld;->S:I

    .line 389
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/CellWorld;->R:I

    .line 390
    return-void

    .line 377
    :cond_0
    const/4 v0, 0x0

    move v1, v0

    goto :goto_0
.end method

.method public constructor <init>(ZLcom/saterskog/cell_lab/Environment;)V
    .locals 13

    .prologue
    const/16 v12, 0xc9

    const v11, 0x3f8ccccd    # 1.1f

    const v10, -0x40733333    # -1.1f

    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 182
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 54
    new-instance v0, Lcom/saterskog/cell_lab/Environment;

    invoke-direct {v0}, Lcom/saterskog/cell_lab/Environment;-><init>()V

    iput-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    .line 66
    const/16 v0, 0xca

    iput v0, p0, Lcom/saterskog/cell_lab/CellWorld;->ac:I

    .line 97
    const/16 v0, 0x9

    new-array v0, v0, [D

    iput-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->v:[D

    .line 98
    const/16 v0, 0x9

    new-array v0, v0, [D

    iput-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->w:[D

    .line 107
    sget-object v0, Lcom/saterskog/cell_lab/h;->B:[Lcom/saterskog/cell_lab/h;

    array-length v0, v0

    add-int/lit8 v0, v0, 0x1

    new-array v0, v0, [[I

    iput-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->D:[[I

    .line 108
    sget-object v0, Lcom/saterskog/cell_lab/h;->B:[Lcom/saterskog/cell_lab/h;

    array-length v0, v0

    add-int/lit8 v0, v0, 0x1

    new-array v0, v0, [I

    iput-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->E:[I

    .line 110
    const/high16 v0, -0x40800000    # -1.0f

    iput v0, p0, Lcom/saterskog/cell_lab/CellWorld;->H:F

    .line 111
    iput-boolean v1, p0, Lcom/saterskog/cell_lab/CellWorld;->I:Z

    .line 126
    const/16 v0, 0x14

    new-array v0, v0, [Lcom/saterskog/cell_lab/Link;

    iput-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->J:[Lcom/saterskog/cell_lab/Link;

    .line 128
    iput v1, p0, Lcom/saterskog/cell_lab/CellWorld;->be:I

    iput v1, p0, Lcom/saterskog/cell_lab/CellWorld;->bf:I

    .line 132
    const-wide/16 v4, 0x0

    iput-wide v4, p0, Lcom/saterskog/cell_lab/CellWorld;->N:D

    const-wide v4, 0x3ff921fb54442d18L    # 1.5707963267948966

    iput-wide v4, p0, Lcom/saterskog/cell_lab/CellWorld;->O:D

    .line 140
    new-instance v0, Lcom/saterskog/b/d;

    invoke-direct {v0}, Lcom/saterskog/b/d;-><init>()V

    iput-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->Y:Lcom/saterskog/b/d;

    .line 183
    iput-boolean p1, p0, Lcom/saterskog/cell_lab/CellWorld;->bg:Z

    .line 184
    if-nez p1, :cond_3

    .line 185
    iget v0, p2, Lcom/saterskog/cell_lab/Environment;->r:I

    iput v0, p0, Lcom/saterskog/cell_lab/CellWorld;->d:I

    .line 186
    iget v0, p2, Lcom/saterskog/cell_lab/Environment;->s:I

    iput v0, p0, Lcom/saterskog/cell_lab/CellWorld;->aa:I

    .line 187
    iget v0, p0, Lcom/saterskog/cell_lab/CellWorld;->d:I

    div-int/lit8 v0, v0, 0xa

    iput v0, p0, Lcom/saterskog/cell_lab/CellWorld;->ab:I

    .line 192
    :goto_0
    iget v0, p0, Lcom/saterskog/cell_lab/CellWorld;->d:I

    add-int/lit8 v0, v0, 0x3

    div-int/lit8 v0, v0, 0x4

    iput v0, p0, Lcom/saterskog/cell_lab/CellWorld;->ac:I

    .line 5370
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    if-nez v0, :cond_0

    .line 5371
    const-string v0, "changeEnvironment: env is null"

    invoke-static {v0}, Lcom/saterskog/b/a;->a(Ljava/lang/String;)V

    .line 5372
    :cond_0
    if-nez p2, :cond_1

    .line 5373
    const-string v0, "changeEnvironment: e is null"

    invoke-static {v0}, Lcom/saterskog/b/a;->a(Ljava/lang/String;)V

    .line 5374
    :cond_1
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    invoke-virtual {v0, p2}, Lcom/saterskog/cell_lab/Environment;->a(Lcom/saterskog/cell_lab/Environment;)V

    .line 195
    const/16 v0, 0xce

    iget-object v3, p0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v4, v3, Lcom/saterskog/cell_lab/Environment;->k:D

    const-wide v6, 0x3f9eb851eb851eb8L    # 0.03

    div-double/2addr v4, v6

    const-wide v6, 0x3fb999999999999aL    # 0.1

    sub-double/2addr v4, v6

    double-to-int v3, v4

    invoke-static {v0, v3}, Ljava/lang/Math;->min(II)I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    mul-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/saterskog/cell_lab/CellWorld;->Z:I

    .line 196
    const/16 v0, 0xcf

    const-wide/high16 v4, 0x4000000000000000L    # 2.0

    iget-object v3, p0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v6, v3, Lcom/saterskog/cell_lab/Environment;->k:D

    mul-double/2addr v4, v6

    const-wide v6, 0x3fd70a3d70a3d70aL    # 0.36

    div-double/2addr v4, v6

    double-to-int v3, v4

    invoke-static {v0, v3}, Ljava/lang/Math;->min(II)I

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/CellWorld;->bd:I

    .line 198
    const-wide v4, 0x3faeb851eb851eb8L    # 0.06

    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v6, v0, Lcom/saterskog/cell_lab/Environment;->k:D

    const-wide/high16 v8, 0x4000000000000000L    # 2.0

    mul-double/2addr v6, v8

    iget v0, p0, Lcom/saterskog/cell_lab/CellWorld;->Z:I

    int-to-double v8, v0

    div-double/2addr v6, v8

    cmpl-double v0, v4, v6

    if-ltz v0, :cond_2

    .line 199
    const-string v0, "skit:Too large Cell.MAX_R for grid."

    invoke-static {v0}, Lcom/saterskog/b/a;->a(Ljava/lang/String;)V

    .line 200
    :cond_2
    iget v0, p0, Lcom/saterskog/cell_lab/CellWorld;->d:I

    add-int/lit8 v0, v0, 0x3

    new-array v0, v0, [I

    iput-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->K:[I

    .line 201
    iget v0, p0, Lcom/saterskog/cell_lab/CellWorld;->d:I

    new-array v0, v0, [Lcom/saterskog/cell_lab/Cell;

    iput-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    move v0, v1

    .line 204
    :goto_1
    iget v3, p0, Lcom/saterskog/cell_lab/CellWorld;->d:I

    if-ge v0, v3, :cond_4

    .line 206
    iget-object v3, p0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    new-instance v4, Lcom/saterskog/cell_lab/Cell;

    invoke-direct {v4}, Lcom/saterskog/cell_lab/Cell;-><init>()V

    aput-object v4, v3, v0

    .line 204
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 189
    :cond_3
    const/16 v0, 0x64

    iput v0, p0, Lcom/saterskog/cell_lab/CellWorld;->d:I

    .line 190
    iput v1, p0, Lcom/saterskog/cell_lab/CellWorld;->aa:I

    goto/16 :goto_0

    .line 209
    :cond_4
    iput v1, p0, Lcom/saterskog/cell_lab/CellWorld;->z:I

    .line 214
    if-eqz p1, :cond_6

    .line 215
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->A:[Lcom/saterskog/cell_lab/Food;

    .line 221
    :cond_5
    iput v1, p0, Lcom/saterskog/cell_lab/CellWorld;->B:I

    .line 223
    iget v0, p0, Lcom/saterskog/cell_lab/CellWorld;->ac:I

    new-array v0, v0, [Lcom/saterskog/cell_lab/e;

    iput-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->y:[Lcom/saterskog/cell_lab/e;

    move v0, v1

    .line 224
    :goto_2
    iget v3, p0, Lcom/saterskog/cell_lab/CellWorld;->ac:I

    if-ge v0, v3, :cond_7

    .line 225
    iget-object v3, p0, Lcom/saterskog/cell_lab/CellWorld;->y:[Lcom/saterskog/cell_lab/e;

    new-instance v4, Lcom/saterskog/cell_lab/e;

    invoke-direct {v4}, Lcom/saterskog/cell_lab/e;-><init>()V

    aput-object v4, v3, v0

    .line 224
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 217
    :cond_6
    iget v0, p0, Lcom/saterskog/cell_lab/CellWorld;->aa:I

    new-array v0, v0, [Lcom/saterskog/cell_lab/Food;

    iput-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->A:[Lcom/saterskog/cell_lab/Food;

    move v0, v1

    .line 218
    :goto_3
    iget v3, p0, Lcom/saterskog/cell_lab/CellWorld;->aa:I

    if-ge v0, v3, :cond_5

    .line 219
    iget-object v3, p0, Lcom/saterskog/cell_lab/CellWorld;->A:[Lcom/saterskog/cell_lab/Food;

    new-instance v4, Lcom/saterskog/cell_lab/Food;

    invoke-direct {v4}, Lcom/saterskog/cell_lab/Food;-><init>()V

    aput-object v4, v3, v0

    .line 218
    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    .line 226
    :cond_7
    iput v1, p0, Lcom/saterskog/cell_lab/CellWorld;->C:I

    .line 227
    const-wide/16 v4, 0x0

    iput-wide v4, p0, Lcom/saterskog/cell_lab/CellWorld;->M:D

    move v0, v1

    .line 228
    :goto_4
    const/16 v3, 0x14

    if-ge v0, v3, :cond_8

    .line 229
    iget-object v3, p0, Lcom/saterskog/cell_lab/CellWorld;->J:[Lcom/saterskog/cell_lab/Link;

    new-instance v4, Lcom/saterskog/cell_lab/Link;

    invoke-direct {v4}, Lcom/saterskog/cell_lab/Link;-><init>()V

    aput-object v4, v3, v0

    .line 228
    add-int/lit8 v0, v0, 0x1

    goto :goto_4

    .line 230
    :cond_8
    iget v0, p0, Lcom/saterskog/cell_lab/CellWorld;->Z:I

    add-int/lit8 v0, v0, 0x2

    iget v3, p0, Lcom/saterskog/cell_lab/CellWorld;->Z:I

    add-int/lit8 v3, v3, 0x2

    mul-int/2addr v0, v3

    new-array v0, v0, [[I

    iput-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->aV:[[I

    .line 231
    iget v0, p0, Lcom/saterskog/cell_lab/CellWorld;->Z:I

    add-int/lit8 v0, v0, 0x2

    iget v3, p0, Lcom/saterskog/cell_lab/CellWorld;->Z:I

    add-int/lit8 v3, v3, 0x2

    mul-int/2addr v0, v3

    new-array v0, v0, [I

    iput-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->aW:[I

    move v0, v1

    .line 232
    :goto_5
    iget v3, p0, Lcom/saterskog/cell_lab/CellWorld;->Z:I

    add-int/lit8 v3, v3, 0x2

    iget v4, p0, Lcom/saterskog/cell_lab/CellWorld;->Z:I

    add-int/lit8 v4, v4, 0x2

    mul-int/2addr v3, v4

    if-ge v0, v3, :cond_9

    .line 233
    iget-object v3, p0, Lcom/saterskog/cell_lab/CellWorld;->aV:[[I

    const/16 v4, 0xcb

    new-array v4, v4, [I

    aput-object v4, v3, v0

    .line 234
    iget-object v3, p0, Lcom/saterskog/cell_lab/CellWorld;->aW:[I

    aput v1, v3, v0

    .line 232
    add-int/lit8 v0, v0, 0x1

    goto :goto_5

    .line 236
    :cond_9
    iget v0, p0, Lcom/saterskog/cell_lab/CellWorld;->bd:I

    add-int/lit8 v0, v0, 0x2

    iget v3, p0, Lcom/saterskog/cell_lab/CellWorld;->bd:I

    add-int/lit8 v3, v3, 0x2

    mul-int/2addr v0, v3

    new-array v0, v0, [[I

    iput-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->ba:[[I

    .line 237
    iget v0, p0, Lcom/saterskog/cell_lab/CellWorld;->bd:I

    add-int/lit8 v0, v0, 0x2

    iget v3, p0, Lcom/saterskog/cell_lab/CellWorld;->bd:I

    add-int/lit8 v3, v3, 0x2

    mul-int/2addr v0, v3

    new-array v0, v0, [[S

    iput-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->bb:[[S

    .line 238
    iget v0, p0, Lcom/saterskog/cell_lab/CellWorld;->bd:I

    add-int/lit8 v0, v0, 0x2

    iget v3, p0, Lcom/saterskog/cell_lab/CellWorld;->bd:I

    add-int/lit8 v3, v3, 0x2

    mul-int/2addr v0, v3

    new-array v0, v0, [I

    iput-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->bc:[I

    move v0, v1

    .line 239
    :goto_6
    iget v3, p0, Lcom/saterskog/cell_lab/CellWorld;->bd:I

    add-int/lit8 v3, v3, 0x2

    iget v4, p0, Lcom/saterskog/cell_lab/CellWorld;->bd:I

    add-int/lit8 v4, v4, 0x2

    mul-int/2addr v3, v4

    if-ge v0, v3, :cond_a

    .line 240
    iget-object v3, p0, Lcom/saterskog/cell_lab/CellWorld;->ba:[[I

    const/16 v4, 0x194

    new-array v4, v4, [I

    aput-object v4, v3, v0

    .line 241
    iget-object v3, p0, Lcom/saterskog/cell_lab/CellWorld;->bb:[[S

    const/16 v4, 0x194

    new-array v4, v4, [S

    aput-object v4, v3, v0

    .line 242
    iget-object v3, p0, Lcom/saterskog/cell_lab/CellWorld;->bc:[I

    aput v1, v3, v0

    .line 239
    add-int/lit8 v0, v0, 0x1

    goto :goto_6

    .line 245
    :cond_a
    iget v0, p0, Lcom/saterskog/cell_lab/CellWorld;->d:I

    mul-int/lit8 v0, v0, 0x14

    new-array v0, v0, [I

    iput-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->aY:[I

    .line 246
    iget v0, p0, Lcom/saterskog/cell_lab/CellWorld;->d:I

    mul-int/lit8 v0, v0, 0x14

    new-array v0, v0, [I

    iput-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->aZ:[I

    .line 250
    iget-boolean v0, p0, Lcom/saterskog/cell_lab/CellWorld;->bg:Z

    if-eqz v0, :cond_b

    const/4 v0, 0x2

    .line 251
    :goto_7
    iget v3, p0, Lcom/saterskog/cell_lab/CellWorld;->d:I

    mul-int/lit8 v3, v3, 0x1c

    mul-int/lit8 v3, v3, 0x4

    mul-int/2addr v3, v0

    new-array v3, v3, [F

    iput-object v3, p0, Lcom/saterskog/cell_lab/CellWorld;->ad:[F

    .line 254
    iget v3, p0, Lcom/saterskog/cell_lab/CellWorld;->d:I

    mul-int/lit8 v3, v3, 0x38

    mul-int/lit8 v3, v3, 0x4

    mul-int/2addr v3, v0

    new-array v3, v3, [F

    iput-object v3, p0, Lcom/saterskog/cell_lab/CellWorld;->ae:[F

    .line 255
    iget v3, p0, Lcom/saterskog/cell_lab/CellWorld;->d:I

    mul-int/lit8 v3, v3, 0x1c

    mul-int/lit8 v3, v3, 0x4

    mul-int/2addr v3, v0

    new-array v3, v3, [F

    iput-object v3, p0, Lcom/saterskog/cell_lab/CellWorld;->af:[F

    .line 256
    iget v3, p0, Lcom/saterskog/cell_lab/CellWorld;->d:I

    mul-int/lit8 v3, v3, 0x38

    mul-int/lit8 v3, v3, 0x4

    mul-int/2addr v3, v0

    new-array v3, v3, [F

    iput-object v3, p0, Lcom/saterskog/cell_lab/CellWorld;->ag:[F

    .line 257
    iget v3, p0, Lcom/saterskog/cell_lab/CellWorld;->d:I

    mul-int/lit8 v3, v3, 0x15

    mul-int/lit8 v3, v3, 0x4

    mul-int/2addr v0, v3

    new-array v0, v0, [S

    iput-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->aq:[S

    .line 259
    iget v0, p0, Lcom/saterskog/cell_lab/CellWorld;->aa:I

    mul-int/lit8 v0, v0, 0x6

    mul-int/lit8 v0, v0, 0x2

    new-array v0, v0, [F

    iput-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->ah:[F

    .line 260
    iget v0, p0, Lcom/saterskog/cell_lab/CellWorld;->aa:I

    mul-int/lit8 v0, v0, 0x6

    mul-int/lit8 v0, v0, 0x2

    new-array v0, v0, [F

    iput-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->ai:[F

    .line 261
    iget v0, p0, Lcom/saterskog/cell_lab/CellWorld;->aa:I

    mul-int/lit8 v0, v0, 0x6

    mul-int/lit8 v0, v0, 0x4

    new-array v0, v0, [F

    iput-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->aj:[F

    .line 263
    iget v0, p0, Lcom/saterskog/cell_lab/CellWorld;->ac:I

    mul-int/lit8 v0, v0, 0x6

    mul-int/lit8 v0, v0, 0x4

    new-array v0, v0, [F

    iput-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->ak:[F

    .line 264
    iget v0, p0, Lcom/saterskog/cell_lab/CellWorld;->ac:I

    mul-int/lit8 v0, v0, 0x6

    mul-int/lit8 v0, v0, 0x2

    new-array v0, v0, [F

    iput-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->al:[F

    .line 265
    iget v0, p0, Lcom/saterskog/cell_lab/CellWorld;->ac:I

    mul-int/lit8 v0, v0, 0x6

    mul-int/lit8 v0, v0, 0x4

    new-array v0, v0, [F

    iput-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->am:[F

    .line 268
    iget v0, p0, Lcom/saterskog/cell_lab/CellWorld;->d:I

    mul-int/lit8 v0, v0, 0xc

    mul-int/lit8 v0, v0, 0x7

    new-array v0, v0, [F

    iput-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->an:[F

    .line 269
    iget v0, p0, Lcom/saterskog/cell_lab/CellWorld;->d:I

    mul-int/lit8 v0, v0, 0x6

    mul-int/lit8 v0, v0, 0x7

    new-array v0, v0, [F

    iput-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->ao:[F

    .line 280
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->ad:[F

    array-length v0, v0

    iget-object v3, p0, Lcom/saterskog/cell_lab/CellWorld;->ah:[F

    array-length v3, v3

    iget-object v4, p0, Lcom/saterskog/cell_lab/CellWorld;->ak:[F

    array-length v4, v4

    iget-object v5, p0, Lcom/saterskog/cell_lab/CellWorld;->an:[F

    array-length v5, v5

    invoke-static {v4, v5}, Ljava/lang/Math;->max(II)I

    move-result v4

    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    move-result v3

    invoke-static {v0, v3}, Ljava/lang/Math;->max(II)I

    move-result v0

    mul-int/lit8 v0, v0, 0x4

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v0

    iput-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->f:Ljava/nio/ByteBuffer;

    .line 281
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->f:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->asFloatBuffer()Ljava/nio/FloatBuffer;

    move-result-object v0

    iput-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->l:Ljava/nio/FloatBuffer;

    .line 283
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->af:[F

    array-length v0, v0

    iget-object v3, p0, Lcom/saterskog/cell_lab/CellWorld;->ai:[F

    array-length v3, v3

    iget-object v4, p0, Lcom/saterskog/cell_lab/CellWorld;->al:[F

    array-length v4, v4

    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    move-result v3

    invoke-static {v0, v3}, Ljava/lang/Math;->max(II)I

    move-result v0

    mul-int/lit8 v0, v0, 0x4

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v0

    iput-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->g:Ljava/nio/ByteBuffer;

    .line 284
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->g:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->asFloatBuffer()Ljava/nio/FloatBuffer;

    move-result-object v0

    iput-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->m:Ljava/nio/FloatBuffer;

    .line 286
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->ae:[F

    array-length v0, v0

    iget-object v3, p0, Lcom/saterskog/cell_lab/CellWorld;->ao:[F

    array-length v3, v3

    invoke-static {v0, v3}, Ljava/lang/Math;->max(II)I

    move-result v0

    mul-int/lit8 v0, v0, 0x4

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v0

    iput-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->h:Ljava/nio/ByteBuffer;

    .line 287
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->h:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->asFloatBuffer()Ljava/nio/FloatBuffer;

    move-result-object v0

    iput-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->n:Ljava/nio/FloatBuffer;

    .line 289
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->ag:[F

    array-length v0, v0

    iget-object v3, p0, Lcom/saterskog/cell_lab/CellWorld;->am:[F

    array-length v3, v3

    iget-object v4, p0, Lcom/saterskog/cell_lab/CellWorld;->aj:[F

    array-length v4, v4

    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    move-result v3

    invoke-static {v0, v3}, Ljava/lang/Math;->max(II)I

    move-result v0

    mul-int/lit8 v0, v0, 0x4

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v0

    iput-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->i:Ljava/nio/ByteBuffer;

    .line 290
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->i:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->asFloatBuffer()Ljava/nio/FloatBuffer;

    move-result-object v0

    iput-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->o:Ljava/nio/FloatBuffer;

    .line 292
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->aq:[S

    array-length v0, v0

    mul-int/lit8 v0, v0, 0x2

    .line 293
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v0

    iput-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->j:Ljava/nio/ByteBuffer;

    .line 294
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->j:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->asShortBuffer()Ljava/nio/ShortBuffer;

    move-result-object v0

    iput-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->p:Ljava/nio/ShortBuffer;

    .line 296
    sget-object v0, Lcom/saterskog/cell_lab/h;->B:[Lcom/saterskog/cell_lab/h;

    array-length v3, v0

    iget-boolean v0, p0, Lcom/saterskog/cell_lab/CellWorld;->bg:Z

    if-eqz v0, :cond_c

    move v0, v2

    :goto_8
    add-int/2addr v0, v3

    new-array v0, v0, [I

    iput-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->u:[I

    .line 297
    sget-object v0, Lcom/saterskog/cell_lab/h;->B:[Lcom/saterskog/cell_lab/h;

    array-length v3, v0

    iget-boolean v0, p0, Lcom/saterskog/cell_lab/CellWorld;->bg:Z

    if-eqz v0, :cond_d

    move v0, v2

    :goto_9
    add-int/2addr v0, v3

    new-array v0, v0, [[I

    iput-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->q:[[I

    .line 298
    sget-object v0, Lcom/saterskog/cell_lab/h;->B:[Lcom/saterskog/cell_lab/h;

    array-length v3, v0

    iget-boolean v0, p0, Lcom/saterskog/cell_lab/CellWorld;->bg:Z

    if-eqz v0, :cond_e

    move v0, v2

    :goto_a
    add-int/2addr v0, v3

    new-array v0, v0, [[I

    iput-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->r:[[I

    .line 299
    sget-object v0, Lcom/saterskog/cell_lab/h;->B:[Lcom/saterskog/cell_lab/h;

    array-length v3, v0

    iget-boolean v0, p0, Lcom/saterskog/cell_lab/CellWorld;->bg:Z

    if-eqz v0, :cond_f

    move v0, v2

    :goto_b
    add-int/2addr v0, v3

    new-array v0, v0, [[I

    iput-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->s:[[I

    .line 300
    sget-object v0, Lcom/saterskog/cell_lab/h;->B:[Lcom/saterskog/cell_lab/h;

    array-length v3, v0

    iget-boolean v0, p0, Lcom/saterskog/cell_lab/CellWorld;->bg:Z

    if-eqz v0, :cond_10

    move v0, v2

    :goto_c
    add-int/2addr v0, v3

    new-array v0, v0, [[I

    iput-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->t:[[I

    move v0, v1

    .line 301
    :goto_d
    sget-object v3, Lcom/saterskog/cell_lab/h;->B:[Lcom/saterskog/cell_lab/h;

    array-length v4, v3

    iget-boolean v3, p0, Lcom/saterskog/cell_lab/CellWorld;->bg:Z

    if-eqz v3, :cond_11

    move v3, v2

    :goto_e
    add-int/2addr v3, v4

    if-ge v0, v3, :cond_12

    .line 302
    iget-object v3, p0, Lcom/saterskog/cell_lab/CellWorld;->q:[[I

    new-array v4, v12, [I

    aput-object v4, v3, v0

    .line 303
    iget-object v3, p0, Lcom/saterskog/cell_lab/CellWorld;->r:[[I

    new-array v4, v12, [I

    aput-object v4, v3, v0

    .line 304
    iget-object v3, p0, Lcom/saterskog/cell_lab/CellWorld;->s:[[I

    new-array v4, v12, [I

    aput-object v4, v3, v0

    .line 305
    iget-object v3, p0, Lcom/saterskog/cell_lab/CellWorld;->t:[[I

    new-array v4, v12, [I

    aput-object v4, v3, v0

    .line 301
    add-int/lit8 v0, v0, 0x1

    goto :goto_d

    :cond_b
    move v0, v2

    .line 250
    goto/16 :goto_7

    :cond_c
    move v0, v1

    .line 296
    goto :goto_8

    :cond_d
    move v0, v1

    .line 297
    goto :goto_9

    :cond_e
    move v0, v1

    .line 298
    goto :goto_a

    :cond_f
    move v0, v1

    .line 299
    goto :goto_b

    :cond_10
    move v0, v1

    .line 300
    goto :goto_c

    :cond_11
    move v3, v1

    .line 301
    goto :goto_e

    .line 308
    :cond_12
    const/16 v0, 0xc

    new-array v0, v0, [F

    .line 309
    aput v11, v0, v1

    .line 310
    aput v11, v0, v2

    .line 311
    const/4 v3, 0x2

    aput v11, v0, v3

    .line 312
    const/4 v3, 0x3

    aput v10, v0, v3

    .line 313
    const/4 v3, 0x4

    aput v10, v0, v3

    .line 314
    const/4 v3, 0x5

    aput v10, v0, v3

    .line 316
    const/4 v3, 0x6

    aput v10, v0, v3

    .line 317
    const/4 v3, 0x7

    aput v10, v0, v3

    .line 318
    const/16 v3, 0x8

    aput v10, v0, v3

    .line 319
    const/16 v3, 0x9

    aput v11, v0, v3

    .line 320
    const/16 v3, 0xa

    aput v11, v0, v3

    .line 321
    const/16 v3, 0xb

    aput v11, v0, v3

    .line 322
    const/16 v3, 0x30

    invoke-static {v3}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v3

    .line 325
    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 326
    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->asFloatBuffer()Ljava/nio/FloatBuffer;

    move-result-object v3

    iput-object v3, p0, Lcom/saterskog/cell_lab/CellWorld;->k:Ljava/nio/FloatBuffer;

    .line 327
    iget-object v3, p0, Lcom/saterskog/cell_lab/CellWorld;->k:Ljava/nio/FloatBuffer;

    const/16 v4, 0xc

    invoke-virtual {v3, v0, v1, v4}, Ljava/nio/FloatBuffer;->put([FII)Ljava/nio/FloatBuffer;

    .line 328
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->k:Ljava/nio/FloatBuffer;

    invoke-virtual {v0, v1}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    .line 329
    iput v1, p0, Lcom/saterskog/cell_lab/CellWorld;->aU:I

    .line 330
    iput-boolean v1, p0, Lcom/saterskog/cell_lab/CellWorld;->L:Z

    move v0, v1

    .line 332
    :goto_f
    sget-object v3, Lcom/saterskog/cell_lab/h;->B:[Lcom/saterskog/cell_lab/h;

    array-length v4, v3

    if-eqz p1, :cond_13

    move v3, v2

    :goto_10
    add-int/2addr v3, v4

    if-ge v0, v3, :cond_14

    .line 333
    iget-object v3, p0, Lcom/saterskog/cell_lab/CellWorld;->E:[I

    aput v1, v3, v0

    .line 334
    iget-object v3, p0, Lcom/saterskog/cell_lab/CellWorld;->D:[[I

    iget v4, p0, Lcom/saterskog/cell_lab/CellWorld;->d:I

    new-array v4, v4, [I

    aput-object v4, v3, v0

    .line 332
    add-int/lit8 v0, v0, 0x1

    goto :goto_f

    :cond_13
    move v3, v1

    goto :goto_10

    .line 361
    :cond_14
    const-wide v0, 0x3f2797cc39ffd60eL    # 1.7999999999999998E-4

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    iget-object v3, p0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v4, v3, Lcom/saterskog/cell_lab/Environment;->g:D

    mul-double/2addr v0, v4

    const-wide v4, 0x3fb26e978d4fdf3bL    # 0.072

    div-double/2addr v0, v4

    const-wide v4, 0x3f947ae147ae147bL    # 0.02

    mul-double/2addr v0, v4

    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    cmpl-double v0, v0, v4

    if-lez v0, :cond_15

    .line 362
    const-string v0, "skit:Too large timestep, close to unstable simulation."

    invoke-static {v0}, Lcom/saterskog/b/a;->a(Ljava/lang/String;)V

    .line 365
    :cond_15
    const-wide/16 v0, 0x0

    invoke-virtual {p0, v2, v0, v1}, Lcom/saterskog/cell_lab/CellWorld;->a(ZD)V

    .line 367
    return-void
.end method

.method public static a(Lcom/saterskog/cell_lab/Environment;)J
    .locals 12

    .prologue
    .line 154
    const/16 v0, 0xce

    iget-wide v2, p0, Lcom/saterskog/cell_lab/Environment;->k:D

    const-wide v4, 0x3f9eb851eb851eb8L    # 0.03

    div-double/2addr v2, v4

    const-wide v4, 0x3fb999999999999aL    # 0.1

    sub-double/2addr v2, v4

    double-to-int v1, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    mul-int/lit8 v0, v0, 0x2

    int-to-long v0, v0

    .line 155
    const-wide/16 v2, 0x2

    add-long/2addr v2, v0

    const-wide/16 v4, 0x2

    add-long/2addr v0, v4

    mul-long/2addr v0, v2

    const-wide/16 v2, 0xcb

    mul-long/2addr v0, v2

    const-wide/16 v2, 0x4

    mul-long/2addr v0, v2

    .line 156
    const/16 v2, 0xcf

    const-wide/high16 v4, 0x4000000000000000L    # 2.0

    iget-wide v6, p0, Lcom/saterskog/cell_lab/Environment;->k:D

    mul-double/2addr v4, v6

    const-wide v6, 0x3fd70a3d70a3d70aL    # 0.36

    div-double/2addr v4, v6

    double-to-int v3, v4

    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v2

    int-to-long v2, v2

    .line 157
    const-wide/16 v4, 0x2

    add-long/2addr v4, v2

    const-wide/16 v6, 0x2

    add-long/2addr v2, v6

    mul-long/2addr v2, v4

    const-wide/16 v4, 0x194

    mul-long/2addr v2, v4

    const-wide/16 v4, 0x6

    mul-long/2addr v2, v4

    .line 161
    const-wide/16 v4, 0x1c

    iget v6, p0, Lcom/saterskog/cell_lab/Environment;->r:I

    int-to-long v6, v6

    mul-long/2addr v4, v6

    const-wide/16 v6, 0x4

    mul-long/2addr v4, v6

    .line 164
    const-wide/16 v6, 0x38

    iget v8, p0, Lcom/saterskog/cell_lab/Environment;->r:I

    int-to-long v8, v8

    mul-long/2addr v6, v8

    const-wide/16 v8, 0x4

    mul-long/2addr v6, v8

    add-long/2addr v4, v6

    .line 165
    const-wide/16 v6, 0x1c

    iget v8, p0, Lcom/saterskog/cell_lab/Environment;->r:I

    int-to-long v8, v8

    mul-long/2addr v6, v8

    const-wide/16 v8, 0x4

    mul-long/2addr v6, v8

    add-long/2addr v4, v6

    .line 166
    const-wide/16 v6, 0x38

    iget v8, p0, Lcom/saterskog/cell_lab/Environment;->r:I

    int-to-long v8, v8

    mul-long/2addr v6, v8

    const-wide/16 v8, 0x4

    mul-long/2addr v6, v8

    add-long/2addr v4, v6

    .line 167
    const-wide/16 v6, 0x15

    iget v8, p0, Lcom/saterskog/cell_lab/Environment;->r:I

    int-to-long v8, v8

    mul-long/2addr v6, v8

    const-wide/16 v8, 0x4

    mul-long/2addr v6, v8

    add-long/2addr v4, v6

    .line 169
    iget v6, p0, Lcom/saterskog/cell_lab/Environment;->s:I

    mul-int/lit8 v6, v6, 0x6

    mul-int/lit8 v6, v6, 0x2

    int-to-long v6, v6

    add-long/2addr v4, v6

    .line 170
    iget v6, p0, Lcom/saterskog/cell_lab/Environment;->s:I

    mul-int/lit8 v6, v6, 0x6

    mul-int/lit8 v6, v6, 0x2

    int-to-long v6, v6

    add-long/2addr v4, v6

    .line 171
    iget v6, p0, Lcom/saterskog/cell_lab/Environment;->s:I

    mul-int/lit8 v6, v6, 0x6

    mul-int/lit8 v6, v6, 0x4

    int-to-long v6, v6

    add-long/2addr v4, v6

    .line 172
    iget v6, p0, Lcom/saterskog/cell_lab/Environment;->r:I

    div-int/lit8 v6, v6, 0x4

    .line 173
    mul-int/lit8 v7, v6, 0x6

    mul-int/lit8 v7, v7, 0x4

    int-to-long v8, v7

    add-long/2addr v4, v8

    .line 174
    mul-int/lit8 v7, v6, 0x6

    mul-int/lit8 v7, v7, 0x2

    int-to-long v8, v7

    add-long/2addr v4, v8

    .line 175
    mul-int/lit8 v6, v6, 0x6

    mul-int/lit8 v6, v6, 0x4

    int-to-long v6, v6

    add-long/2addr v4, v6

    .line 176
    iget v6, p0, Lcom/saterskog/cell_lab/Environment;->r:I

    mul-int/lit8 v6, v6, 0xc

    int-to-long v6, v6

    const-wide/16 v8, 0x7

    mul-long/2addr v6, v8

    add-long/2addr v4, v6

    .line 177
    iget v6, p0, Lcom/saterskog/cell_lab/Environment;->r:I

    mul-int/lit8 v6, v6, 0x6

    int-to-long v6, v6

    const-wide/16 v8, 0x7

    mul-long/2addr v6, v8

    add-long/2addr v4, v6

    .line 178
    const-wide/16 v6, 0x8

    mul-long/2addr v4, v6

    .line 180
    iget v6, p0, Lcom/saterskog/cell_lab/Environment;->r:I

    int-to-long v6, v6

    const-wide/16 v8, 0x5f00

    mul-long/2addr v6, v8

    iget v8, p0, Lcom/saterskog/cell_lab/Environment;->s:I

    int-to-long v8, v8

    const-wide/16 v10, 0x50

    mul-long/2addr v8, v10

    add-long/2addr v6, v8

    add-long/2addr v0, v6

    add-long/2addr v0, v2

    add-long/2addr v0, v4

    return-wide v0
.end method

.method private b(D)V
    .locals 19

    .prologue
    .line 944
    move-wide/from16 v0, p1

    double-to-float v2, v0

    const/high16 v3, 0x40800000    # 4.0f

    div-float v8, v2, v3

    .line 945
    const/4 v6, 0x4

    const/4 v3, 0x0

    .line 946
    const/4 v2, 0x0

    move v5, v2

    move v7, v6

    move v6, v3

    :goto_0
    const/4 v2, 0x4

    if-ge v5, v2, :cond_e

    .line 947
    const/4 v2, 0x0

    :goto_1
    move-object/from16 v0, p0

    iget v3, v0, Lcom/saterskog/cell_lab/CellWorld;->z:I

    if-ge v2, v3, :cond_d

    .line 948
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    aget-object v9, v3, v2

    .line 949
    if-nez v5, :cond_2

    .line 950
    iget-wide v10, v9, Lcom/saterskog/cell_lab/Cell;->Q:D

    invoke-static {v10, v11}, Ljava/lang/Double;->isNaN(D)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 952
    const-string v3, "NaN final"

    invoke-static {v3}, Lcom/saterskog/b/a;->b(Ljava/lang/String;)V

    .line 953
    const-wide/16 v10, 0x0

    iput-wide v10, v9, Lcom/saterskog/cell_lab/Cell;->Q:D

    .line 954
    const/4 v3, 0x0

    move-object/from16 v0, p0

    invoke-virtual {v0, v2, v3}, Lcom/saterskog/cell_lab/CellWorld;->a(IZ)V

    .line 955
    add-int/lit8 v2, v2, -0x1

    .line 947
    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 958
    :cond_1
    iget-wide v10, v9, Lcom/saterskog/cell_lab/Cell;->Q:D

    iput-wide v10, v9, Lcom/saterskog/cell_lab/Cell;->w:D

    .line 960
    iget v3, v9, Lcom/saterskog/cell_lab/Cell;->Z:F

    iput v3, v9, Lcom/saterskog/cell_lab/Cell;->X:F

    .line 961
    iget-wide v10, v9, Lcom/saterskog/cell_lab/Cell;->R:D

    iput-wide v10, v9, Lcom/saterskog/cell_lab/Cell;->p:D

    .line 963
    :cond_2
    iget-object v3, v9, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    iget v4, v9, Lcom/saterskog/cell_lab/Cell;->D:I

    aget-object v10, v3, v4

    .line 965
    iget-object v3, v10, Lcom/saterskog/cell_lab/Gene;->s:Lcom/saterskog/cell_lab/h;

    sget-object v4, Lcom/saterskog/cell_lab/h;->n:Lcom/saterskog/cell_lab/h;

    if-ne v3, v4, :cond_6

    .line 966
    const/4 v3, 0x0

    :goto_2
    const/4 v4, 0x4

    if-ge v3, v4, :cond_3

    .line 967
    iget-object v4, v9, Lcom/saterskog/cell_lab/Cell;->W:[F

    const/4 v11, 0x0

    aput v11, v4, v3

    .line 966
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 968
    :cond_3
    const/4 v3, 0x0

    move v4, v3

    :goto_3
    const/4 v3, 0x4

    if-ge v4, v3, :cond_6

    .line 979
    add-int/lit8 v3, v4, 0x7

    invoke-virtual {v9, v3, v6}, Lcom/saterskog/cell_lab/Cell;->a(II)F

    move-result v3

    .line 981
    const/high16 v11, -0x3e600000    # -20.0f

    cmpg-float v11, v3, v11

    if-gez v11, :cond_4

    const/high16 v3, -0x3e600000    # -20.0f

    .line 982
    :cond_4
    const/high16 v11, 0x41a00000    # 20.0f

    cmpl-float v11, v3, v11

    if-lez v11, :cond_5

    const/high16 v3, 0x41a00000    # 20.0f

    .line 983
    :cond_5
    iget-object v11, v9, Lcom/saterskog/cell_lab/Cell;->W:[F

    iget-object v12, v10, Lcom/saterskog/cell_lab/Gene;->u:[I

    add-int/lit8 v13, v4, 0x5

    aget v12, v12, v13

    aget v13, v11, v12

    add-float/2addr v3, v13

    aput v3, v11, v12

    .line 968
    add-int/lit8 v3, v4, 0x1

    move v4, v3

    goto :goto_3

    .line 987
    :cond_6
    const/4 v3, 0x0

    :goto_4
    const/4 v4, 0x4

    if-ge v3, v4, :cond_8

    .line 988
    iget-object v4, v9, Lcom/saterskog/cell_lab/Cell;->U:[F

    add-int v11, v7, v3

    iget-object v12, v9, Lcom/saterskog/cell_lab/Cell;->U:[F

    add-int v13, v6, v3

    aget v12, v12, v13

    iget-object v13, v9, Lcom/saterskog/cell_lab/Cell;->W:[F

    aget v13, v13, v3

    const/high16 v14, 0x40a00000    # 5.0f

    iget-object v15, v9, Lcom/saterskog/cell_lab/Cell;->U:[F

    add-int v16, v6, v3

    aget v15, v15, v16

    mul-float/2addr v14, v15

    sub-float/2addr v13, v14

    mul-float/2addr v13, v8

    add-float/2addr v12, v13

    aput v12, v4, v11

    .line 989
    const/4 v4, 0x3

    if-ne v5, v4, :cond_7

    .line 990
    iget-object v4, v9, Lcom/saterskog/cell_lab/Cell;->V:[F

    iget-object v11, v9, Lcom/saterskog/cell_lab/Cell;->W:[F

    aget v11, v11, v3

    aput v11, v4, v3

    .line 991
    iget-object v4, v9, Lcom/saterskog/cell_lab/Cell;->W:[F

    const/4 v11, 0x0

    aput v11, v4, v3

    .line 987
    :cond_7
    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    .line 995
    :cond_8
    const/4 v3, 0x0

    :goto_5
    iget v4, v9, Lcom/saterskog/cell_lab/Cell;->C:I

    if-ge v3, v4, :cond_a

    .line 996
    iget-object v4, v9, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    aget-object v4, v4, v3

    iget v4, v4, Lcom/saterskog/cell_lab/Link;->a:I

    if-ltz v4, :cond_9

    .line 997
    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    iget-object v11, v9, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    aget-object v11, v11, v3

    iget v11, v11, Lcom/saterskog/cell_lab/Link;->a:I

    aget-object v11, v4, v11

    .line 998
    iget-object v4, v10, Lcom/saterskog/cell_lab/Gene;->s:Lcom/saterskog/cell_lab/h;

    sget-object v12, Lcom/saterskog/cell_lab/h;->e:Lcom/saterskog/cell_lab/h;

    if-eq v4, v12, :cond_9

    iget-object v4, v11, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    iget v12, v11, Lcom/saterskog/cell_lab/Cell;->D:I

    aget-object v4, v4, v12

    iget-object v4, v4, Lcom/saterskog/cell_lab/Gene;->s:Lcom/saterskog/cell_lab/h;

    sget-object v12, Lcom/saterskog/cell_lab/h;->e:Lcom/saterskog/cell_lab/h;

    if-eq v4, v12, :cond_9

    .line 999
    const/4 v4, 0x0

    :goto_6
    const/4 v12, 0x4

    if-ge v4, v12, :cond_9

    .line 1000
    iget-object v12, v9, Lcom/saterskog/cell_lab/Cell;->U:[F

    add-int v13, v7, v4

    aget v14, v12, v13

    const/high16 v15, 0x40a00000    # 5.0f

    iget-object v0, v11, Lcom/saterskog/cell_lab/Cell;->U:[F

    move-object/from16 v16, v0

    add-int v17, v6, v4

    aget v16, v16, v17

    iget-object v0, v9, Lcom/saterskog/cell_lab/Cell;->U:[F

    move-object/from16 v17, v0

    add-int v18, v6, v4

    aget v17, v17, v18

    sub-float v16, v16, v17

    mul-float v15, v15, v16

    mul-float/2addr v15, v8

    add-float/2addr v14, v15

    aput v14, v12, v13

    .line 999
    add-int/lit8 v4, v4, 0x1

    goto :goto_6

    .line 995
    :cond_9
    add-int/lit8 v3, v3, 0x1

    goto :goto_5

    .line 1005
    :cond_a
    const/4 v3, 0x0

    :goto_7
    const/4 v4, 0x4

    if-ge v3, v4, :cond_0

    .line 1007
    iget-object v4, v9, Lcom/saterskog/cell_lab/Cell;->U:[F

    add-int v10, v7, v3

    aget v4, v4, v10

    const/high16 v10, -0x40800000    # -1.0f

    cmpg-float v4, v4, v10

    if-gez v4, :cond_b

    iget-object v4, v9, Lcom/saterskog/cell_lab/Cell;->U:[F

    add-int v10, v7, v3

    const/high16 v11, -0x40800000    # -1.0f

    aput v11, v4, v10

    .line 1008
    :cond_b
    iget-object v4, v9, Lcom/saterskog/cell_lab/Cell;->U:[F

    add-int v10, v7, v3

    aget v4, v4, v10

    const/high16 v10, 0x3f800000    # 1.0f

    cmpl-float v4, v4, v10

    if-lez v4, :cond_c

    iget-object v4, v9, Lcom/saterskog/cell_lab/Cell;->U:[F

    add-int v10, v7, v3

    const/high16 v11, 0x3f800000    # 1.0f

    aput v11, v4, v10

    .line 1005
    :cond_c
    add-int/lit8 v3, v3, 0x1

    goto :goto_7

    .line 1013
    :cond_d
    rsub-int/lit8 v3, v6, 0x4

    .line 946
    add-int/lit8 v2, v5, 0x1

    move v5, v2

    move v7, v6

    move v6, v3

    goto/16 :goto_0

    .line 1015
    :cond_e
    return-void
.end method

.method private b(DD)V
    .locals 11

    .prologue
    .line 575
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/saterskog/cell_lab/CellWorld;->a(Lcom/saterskog/cell_lab/Cell;)Z

    move-result v0

    if-eqz v0, :cond_e

    .line 576
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    iget v1, p0, Lcom/saterskog/cell_lab/CellWorld;->z:I

    add-int/lit8 v1, v1, -0x1

    aget-object v2, v0, v1

    .line 577
    iput-wide p1, v2, Lcom/saterskog/cell_lab/Cell;->b:D

    .line 578
    iput-wide p3, v2, Lcom/saterskog/cell_lab/Cell;->c:D

    .line 579
    const-wide v0, 0x3fcba5e353f7ced8L    # 0.21599999999999997

    iput-wide v0, v2, Lcom/saterskog/cell_lab/Cell;->w:D

    .line 580
    iget-wide v0, v2, Lcom/saterskog/cell_lab/Cell;->w:D

    const-wide/high16 v4, 0x4079000000000000L    # 400.0

    div-double/2addr v0, v4

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    iput-wide v0, v2, Lcom/saterskog/cell_lab/Cell;->d:D

    .line 581
    const/4 v0, 0x2

    iput v0, v2, Lcom/saterskog/cell_lab/Cell;->E:I

    .line 582
    const/4 v0, 0x0

    iput v0, v2, Lcom/saterskog/cell_lab/Cell;->F:I

    .line 583
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    iput-wide v0, v2, Lcom/saterskog/cell_lab/Cell;->p:D

    .line 584
    const/4 v0, -0x1

    iput v0, v2, Lcom/saterskog/cell_lab/Cell;->T:I

    .line 585
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->Y:Lcom/saterskog/b/d;

    .line 7017
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/saterskog/b/d;->nextInt(I)I

    move-result v0

    .line 585
    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    const/4 v0, 0x1

    :goto_0
    iput-boolean v0, v2, Lcom/saterskog/cell_lab/Cell;->y:Z

    .line 587
    const/4 v0, 0x0

    move v1, v0

    :goto_1
    const/16 v0, 0x50

    if-ge v1, v0, :cond_c

    .line 588
    iget-object v0, v2, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    aget-object v0, v0, v1

    const-wide v4, 0x3fb26e978d4fdf3bL    # 0.072

    iget-object v3, p0, Lcom/saterskog/cell_lab/CellWorld;->Y:Lcom/saterskog/b/d;

    .line 8008
    invoke-virtual {v3}, Lcom/saterskog/b/d;->nextDouble()D

    move-result-wide v6

    .line 588
    const-wide v8, 0x3fd26e978d4fdf3bL    # 0.288

    mul-double/2addr v6, v8

    add-double/2addr v4, v6

    double-to-float v3, v4

    iput v3, v0, Lcom/saterskog/cell_lab/Gene;->b:F

    .line 589
    iget-object v0, v2, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    aget-object v0, v0, v1

    iget-object v0, v0, Lcom/saterskog/cell_lab/Gene;->a:[F

    const/4 v3, 0x0

    iget-object v4, p0, Lcom/saterskog/cell_lab/CellWorld;->Y:Lcom/saterskog/b/d;

    .line 9008
    invoke-virtual {v4}, Lcom/saterskog/b/d;->nextDouble()D

    move-result-wide v4

    .line 589
    double-to-float v4, v4

    aput v4, v0, v3

    .line 590
    iget-object v0, v2, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    aget-object v0, v0, v1

    iget-object v0, v0, Lcom/saterskog/cell_lab/Gene;->a:[F

    const/4 v3, 0x1

    iget-object v4, p0, Lcom/saterskog/cell_lab/CellWorld;->Y:Lcom/saterskog/b/d;

    .line 10008
    invoke-virtual {v4}, Lcom/saterskog/b/d;->nextDouble()D

    move-result-wide v4

    .line 590
    double-to-float v4, v4

    aput v4, v0, v3

    .line 591
    iget-object v0, v2, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    aget-object v0, v0, v1

    iget-object v0, v0, Lcom/saterskog/cell_lab/Gene;->a:[F

    const/4 v3, 0x2

    iget-object v4, p0, Lcom/saterskog/cell_lab/CellWorld;->Y:Lcom/saterskog/b/d;

    .line 11008
    invoke-virtual {v4}, Lcom/saterskog/b/d;->nextDouble()D

    move-result-wide v4

    .line 591
    double-to-float v4, v4

    aput v4, v0, v3

    .line 592
    iget-object v0, v2, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    aget-object v0, v0, v1

    iget-object v3, p0, Lcom/saterskog/cell_lab/CellWorld;->Y:Lcom/saterskog/b/d;

    .line 12008
    invoke-virtual {v3}, Lcom/saterskog/b/d;->nextDouble()D

    move-result-wide v4

    .line 592
    const-wide/high16 v6, 0x4000000000000000L    # 2.0

    mul-double/2addr v4, v6

    const-wide v6, 0x400921fb54442d18L    # Math.PI

    mul-double/2addr v4, v6

    double-to-float v3, v4

    iput v3, v0, Lcom/saterskog/cell_lab/Gene;->d:F

    .line 593
    iget-object v0, v2, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    aget-object v0, v0, v1

    const-wide/high16 v4, 0x3fe0000000000000L    # 0.5

    iget-object v3, p0, Lcom/saterskog/cell_lab/CellWorld;->Y:Lcom/saterskog/b/d;

    invoke-virtual {v3}, Lcom/saterskog/b/d;->b()D

    move-result-wide v6

    const-wide v8, 0x3fc999999999999aL    # 0.2

    mul-double/2addr v6, v8

    add-double/2addr v4, v6

    double-to-float v3, v4

    iput v3, v0, Lcom/saterskog/cell_lab/Gene;->c:F

    .line 594
    iget-object v0, v2, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    aget-object v0, v0, v1

    iget-object v3, p0, Lcom/saterskog/cell_lab/CellWorld;->Y:Lcom/saterskog/b/d;

    .line 13008
    invoke-virtual {v3}, Lcom/saterskog/b/d;->nextDouble()D

    move-result-wide v4

    .line 594
    const-wide/high16 v6, 0x4000000000000000L    # 2.0

    mul-double/2addr v4, v6

    const-wide v6, 0x400921fb54442d18L    # Math.PI

    mul-double/2addr v4, v6

    double-to-float v3, v4

    iput v3, v0, Lcom/saterskog/cell_lab/Gene;->e:F

    .line 595
    iget-object v0, v2, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    aget-object v0, v0, v1

    iget-object v3, p0, Lcom/saterskog/cell_lab/CellWorld;->Y:Lcom/saterskog/b/d;

    .line 14008
    invoke-virtual {v3}, Lcom/saterskog/b/d;->nextDouble()D

    move-result-wide v4

    .line 595
    const-wide/high16 v6, 0x4000000000000000L    # 2.0

    mul-double/2addr v4, v6

    const-wide v6, 0x400921fb54442d18L    # Math.PI

    mul-double/2addr v4, v6

    double-to-float v3, v4

    iput v3, v0, Lcom/saterskog/cell_lab/Gene;->f:F

    .line 596
    iget-object v0, v2, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    aget-object v0, v0, v1

    const-wide/high16 v4, 0x4024000000000000L    # 10.0

    iget-object v3, p0, Lcom/saterskog/cell_lab/CellWorld;->Y:Lcom/saterskog/b/d;

    invoke-virtual {v3}, Lcom/saterskog/b/d;->b()D

    move-result-wide v6

    const-wide/high16 v8, 0x4008000000000000L    # 3.0

    mul-double/2addr v6, v8

    add-double/2addr v4, v6

    double-to-float v3, v4

    iput v3, v0, Lcom/saterskog/cell_lab/Gene;->g:F

    .line 598
    :cond_0
    iget-object v0, v2, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    aget-object v0, v0, v1

    sget-object v3, Lcom/saterskog/cell_lab/h;->B:[Lcom/saterskog/cell_lab/h;

    iget-object v4, p0, Lcom/saterskog/cell_lab/CellWorld;->Y:Lcom/saterskog/b/d;

    sget-object v5, Lcom/saterskog/cell_lab/h;->B:[Lcom/saterskog/cell_lab/h;

    array-length v5, v5

    .line 14017
    invoke-virtual {v4, v5}, Lcom/saterskog/b/d;->nextInt(I)I

    move-result v4

    .line 598
    aget-object v3, v3, v4

    iput-object v3, v0, Lcom/saterskog/cell_lab/Gene;->s:Lcom/saterskog/cell_lab/h;

    .line 599
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-object v0, v0, Lcom/saterskog/cell_lab/Environment;->t:[Z

    iget-object v3, v2, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    aget-object v3, v3, v1

    iget-object v3, v3, Lcom/saterskog/cell_lab/Gene;->s:Lcom/saterskog/cell_lab/h;

    invoke-virtual {v3}, Lcom/saterskog/cell_lab/h;->ordinal()I

    move-result v3

    aget-boolean v0, v0, v3

    if-eqz v0, :cond_0

    .line 600
    iget-object v0, v2, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    aget-object v0, v0, v1

    iget-object v3, p0, Lcom/saterskog/cell_lab/CellWorld;->Y:Lcom/saterskog/b/d;

    .line 15017
    const/16 v4, 0x50

    invoke-virtual {v3, v4}, Lcom/saterskog/b/d;->nextInt(I)I

    move-result v3

    .line 600
    iput v3, v0, Lcom/saterskog/cell_lab/Gene;->i:I

    .line 601
    iget-object v0, v2, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    aget-object v0, v0, v1

    iget-object v3, p0, Lcom/saterskog/cell_lab/CellWorld;->Y:Lcom/saterskog/b/d;

    .line 16017
    const/16 v4, 0x50

    invoke-virtual {v3, v4}, Lcom/saterskog/b/d;->nextInt(I)I

    move-result v3

    .line 601
    iput v3, v0, Lcom/saterskog/cell_lab/Gene;->j:I

    .line 602
    iget-object v0, v2, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    aget-object v3, v0, v1

    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->Y:Lcom/saterskog/b/d;

    invoke-virtual {v0}, Lcom/saterskog/b/d;->b()D

    move-result-wide v4

    const-wide/16 v6, 0x0

    cmpl-double v0, v4, v6

    if-lez v0, :cond_3

    const/4 v0, 0x1

    :goto_2
    iput-boolean v0, v3, Lcom/saterskog/cell_lab/Gene;->l:Z

    .line 603
    iget-object v0, v2, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    aget-object v3, v0, v1

    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->Y:Lcom/saterskog/b/d;

    invoke-virtual {v0}, Lcom/saterskog/b/d;->b()D

    move-result-wide v4

    const-wide/16 v6, 0x0

    cmpl-double v0, v4, v6

    if-lez v0, :cond_4

    const/4 v0, 0x1

    :goto_3
    iput-boolean v0, v3, Lcom/saterskog/cell_lab/Gene;->m:Z

    .line 604
    iget-object v0, v2, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    aget-object v3, v0, v1

    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->Y:Lcom/saterskog/b/d;

    invoke-virtual {v0}, Lcom/saterskog/b/d;->b()D

    move-result-wide v4

    const-wide/16 v6, 0x0

    cmpl-double v0, v4, v6

    if-lez v0, :cond_5

    const/4 v0, 0x1

    :goto_4
    iput-boolean v0, v3, Lcom/saterskog/cell_lab/Gene;->n:Z

    .line 609
    iget-object v0, v2, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    aget-object v0, v0, v1

    iget-object v3, p0, Lcom/saterskog/cell_lab/CellWorld;->Y:Lcom/saterskog/b/d;

    .line 17008
    invoke-virtual {v3}, Lcom/saterskog/b/d;->nextDouble()D

    move-result-wide v4

    .line 609
    double-to-float v3, v4

    const/high16 v4, 0x420c0000    # 35.0f

    mul-float/2addr v3, v4

    iput v3, v0, Lcom/saterskog/cell_lab/Gene;->h:F

    .line 610
    iget-object v0, v2, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    aget-object v3, v0, v1

    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->Y:Lcom/saterskog/b/d;

    .line 17017
    const/4 v4, 0x1

    invoke-virtual {v0, v4}, Lcom/saterskog/b/d;->nextInt(I)I

    move-result v0

    .line 610
    const/4 v4, 0x1

    if-ne v0, v4, :cond_6

    const/4 v0, 0x1

    :goto_5
    iput-boolean v0, v3, Lcom/saterskog/cell_lab/Gene;->q:Z

    .line 611
    iget-object v0, v2, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    aget-object v3, v0, v1

    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->Y:Lcom/saterskog/b/d;

    .line 18017
    const/4 v4, 0x1

    invoke-virtual {v0, v4}, Lcom/saterskog/b/d;->nextInt(I)I

    move-result v0

    .line 611
    const/4 v4, 0x1

    if-ne v0, v4, :cond_7

    const/4 v0, 0x1

    :goto_6
    iput-boolean v0, v3, Lcom/saterskog/cell_lab/Gene;->r:Z

    .line 613
    const/4 v0, 0x0

    :goto_7
    const/16 v3, 0xb

    if-ge v0, v3, :cond_9

    .line 615
    iget-object v3, p0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-object v3, v3, Lcom/saterskog/cell_lab/Environment;->t:[Z

    sget-object v4, Lcom/saterskog/cell_lab/h;->n:Lcom/saterskog/cell_lab/h;

    invoke-virtual {v4}, Lcom/saterskog/cell_lab/h;->ordinal()I

    move-result v4

    aget-boolean v3, v3, v4

    if-nez v3, :cond_1

    iget-object v3, p0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-object v3, v3, Lcom/saterskog/cell_lab/Environment;->t:[Z

    sget-object v4, Lcom/saterskog/cell_lab/h;->l:Lcom/saterskog/cell_lab/h;

    .line 616
    invoke-virtual {v4}, Lcom/saterskog/cell_lab/h;->ordinal()I

    move-result v4

    aget-boolean v3, v3, v4

    if-nez v3, :cond_1

    iget-object v3, p0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-object v3, v3, Lcom/saterskog/cell_lab/Environment;->t:[Z

    sget-object v4, Lcom/saterskog/cell_lab/h;->k:Lcom/saterskog/cell_lab/h;

    .line 617
    invoke-virtual {v4}, Lcom/saterskog/cell_lab/h;->ordinal()I

    move-result v4

    aget-boolean v3, v3, v4

    if-eqz v3, :cond_8

    .line 618
    :cond_1
    iget-object v3, v2, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    aget-object v3, v3, v1

    iget-object v3, v3, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    aget-object v3, v3, v0

    iget-object v4, p0, Lcom/saterskog/cell_lab/CellWorld;->Y:Lcom/saterskog/b/d;

    .line 19017
    const/4 v5, 0x2

    invoke-virtual {v4, v5}, Lcom/saterskog/b/d;->nextInt(I)I

    move-result v4

    .line 618
    add-int/lit8 v4, v4, 0x1

    int-to-short v4, v4

    iput-short v4, v3, Lcom/saterskog/cell_lab/Gene$a;->e:S

    .line 619
    iget-object v3, v2, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    aget-object v3, v3, v1

    iget-object v3, v3, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    aget-object v3, v3, v0

    iget-object v4, p0, Lcom/saterskog/cell_lab/CellWorld;->Y:Lcom/saterskog/b/d;

    .line 20017
    const/16 v5, 0x8

    invoke-virtual {v4, v5}, Lcom/saterskog/b/d;->nextInt(I)I

    move-result v4

    .line 619
    int-to-short v4, v4

    iput-short v4, v3, Lcom/saterskog/cell_lab/Gene$a;->d:S

    .line 620
    iget-object v3, v2, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    aget-object v3, v3, v1

    iget-object v3, v3, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    aget-object v3, v3, v0

    iget-object v4, p0, Lcom/saterskog/cell_lab/CellWorld;->Y:Lcom/saterskog/b/d;

    invoke-virtual {v4}, Lcom/saterskog/b/d;->b()D

    move-result-wide v4

    double-to-float v4, v4

    const/high16 v5, 0x41000000    # 8.0f

    mul-float/2addr v4, v5

    iput v4, v3, Lcom/saterskog/cell_lab/Gene$a;->b:F

    .line 621
    iget-object v3, v2, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    aget-object v3, v3, v1

    iget-object v3, v3, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    aget-object v3, v3, v0

    iget-object v4, p0, Lcom/saterskog/cell_lab/CellWorld;->Y:Lcom/saterskog/b/d;

    invoke-virtual {v4}, Lcom/saterskog/b/d;->b()D

    move-result-wide v4

    double-to-float v4, v4

    const/high16 v5, 0x41000000    # 8.0f

    mul-float/2addr v4, v5

    iput v4, v3, Lcom/saterskog/cell_lab/Gene$a;->a:F

    .line 622
    iget-object v3, v2, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    aget-object v3, v3, v1

    iget-object v3, v3, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    aget-object v3, v3, v0

    iget-object v4, p0, Lcom/saterskog/cell_lab/CellWorld;->Y:Lcom/saterskog/b/d;

    invoke-virtual {v4}, Lcom/saterskog/b/d;->b()D

    move-result-wide v4

    double-to-float v4, v4

    const/high16 v5, 0x41000000    # 8.0f

    mul-float/2addr v4, v5

    iput v4, v3, Lcom/saterskog/cell_lab/Gene$a;->c:F

    .line 613
    :goto_8
    add-int/lit8 v0, v0, 0x1

    goto/16 :goto_7

    .line 585
    :cond_2
    const/4 v0, 0x0

    goto/16 :goto_0

    .line 602
    :cond_3
    const/4 v0, 0x0

    goto/16 :goto_2

    .line 603
    :cond_4
    const/4 v0, 0x0

    goto/16 :goto_3

    .line 604
    :cond_5
    const/4 v0, 0x0

    goto/16 :goto_4

    .line 610
    :cond_6
    const/4 v0, 0x0

    goto/16 :goto_5

    .line 611
    :cond_7
    const/4 v0, 0x0

    goto/16 :goto_6

    .line 626
    :cond_8
    iget-object v3, v2, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    aget-object v3, v3, v1

    iget-object v3, v3, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    aget-object v3, v3, v0

    const/4 v4, 0x0

    iput-short v4, v3, Lcom/saterskog/cell_lab/Gene$a;->e:S

    .line 627
    iget-object v3, v2, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    aget-object v3, v3, v1

    iget-object v3, v3, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    aget-object v3, v3, v0

    iget-object v4, p0, Lcom/saterskog/cell_lab/CellWorld;->Y:Lcom/saterskog/b/d;

    .line 21017
    const/16 v5, 0x8

    invoke-virtual {v4, v5}, Lcom/saterskog/b/d;->nextInt(I)I

    move-result v4

    .line 627
    int-to-short v4, v4

    iput-short v4, v3, Lcom/saterskog/cell_lab/Gene$a;->d:S

    .line 628
    iget-object v3, v2, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    aget-object v3, v3, v1

    iget-object v3, v3, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    aget-object v3, v3, v0

    iget-object v4, p0, Lcom/saterskog/cell_lab/CellWorld;->Y:Lcom/saterskog/b/d;

    invoke-virtual {v4}, Lcom/saterskog/b/d;->b()D

    move-result-wide v4

    double-to-float v4, v4

    iput v4, v3, Lcom/saterskog/cell_lab/Gene$a;->b:F

    .line 629
    iget-object v3, v2, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    aget-object v3, v3, v1

    iget-object v3, v3, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    aget-object v3, v3, v0

    const/4 v4, 0x0

    iput v4, v3, Lcom/saterskog/cell_lab/Gene$a;->a:F

    .line 630
    iget-object v3, v2, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    aget-object v3, v3, v1

    iget-object v3, v3, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    aget-object v3, v3, v0

    const/4 v4, 0x0

    iput v4, v3, Lcom/saterskog/cell_lab/Gene$a;->c:F

    goto :goto_8

    .line 634
    :cond_9
    const/4 v0, 0x0

    :goto_9
    const/16 v3, 0xb

    if-ge v0, v3, :cond_a

    .line 636
    iget-object v3, v2, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    aget-object v3, v3, v1

    iget-object v3, v3, Lcom/saterskog/cell_lab/Gene;->u:[I

    iget-object v4, p0, Lcom/saterskog/cell_lab/CellWorld;->Y:Lcom/saterskog/b/d;

    sget-object v5, Lcom/saterskog/cell_lab/Gene;->w:[I

    aget v5, v5, v0

    .line 22017
    invoke-virtual {v4, v5}, Lcom/saterskog/b/d;->nextInt(I)I

    move-result v4

    .line 636
    aput v4, v3, v0

    .line 634
    add-int/lit8 v0, v0, 0x1

    goto :goto_9

    .line 638
    :cond_a
    const/4 v0, 0x0

    :goto_a
    const/4 v3, 0x7

    if-ge v0, v3, :cond_b

    .line 641
    iget-object v3, v2, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    aget-object v3, v3, v1

    iget-object v3, v3, Lcom/saterskog/cell_lab/Gene;->v:[F

    sget-object v4, Lcom/saterskog/cell_lab/Gene;->z:[F

    aget v4, v4, v0

    iget-object v5, p0, Lcom/saterskog/cell_lab/CellWorld;->Y:Lcom/saterskog/b/d;

    .line 23008
    invoke-virtual {v5}, Lcom/saterskog/b/d;->nextDouble()D

    move-result-wide v6

    .line 641
    double-to-float v5, v6

    sget-object v6, Lcom/saterskog/cell_lab/Gene;->A:[F

    aget v6, v6, v0

    sget-object v7, Lcom/saterskog/cell_lab/Gene;->z:[F

    aget v7, v7, v0

    sub-float/2addr v6, v7

    mul-float/2addr v5, v6

    add-float/2addr v4, v5

    aput v4, v3, v0

    .line 638
    add-int/lit8 v0, v0, 0x1

    goto :goto_a

    .line 643
    :cond_b
    iget-object v0, v2, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    aget-object v0, v0, v1

    iget-object v0, v0, Lcom/saterskog/cell_lab/Gene;->v:[F

    const/4 v3, 0x5

    iget-object v4, p0, Lcom/saterskog/cell_lab/CellWorld;->Y:Lcom/saterskog/b/d;

    .line 24008
    invoke-virtual {v4}, Lcom/saterskog/b/d;->nextDouble()D

    move-result-wide v4

    .line 643
    const-wide/high16 v6, 0x4008000000000000L    # 3.0

    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v4

    double-to-float v4, v4

    sget-object v5, Lcom/saterskog/cell_lab/Gene;->A:[F

    const/4 v6, 0x5

    aget v5, v5, v6

    mul-float/2addr v4, v5

    aput v4, v0, v3

    .line 587
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto/16 :goto_1

    .line 645
    :cond_c
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->Y:Lcom/saterskog/b/d;

    .line 24017
    const/16 v1, 0x50

    invoke-virtual {v0, v1}, Lcom/saterskog/b/d;->nextInt(I)I

    move-result v0

    .line 645
    iput v0, v2, Lcom/saterskog/cell_lab/Cell;->D:I

    .line 647
    iget-object v0, v2, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    iget v1, v2, Lcom/saterskog/cell_lab/Cell;->D:I

    aget-object v0, v0, v1

    iget-object v0, v0, Lcom/saterskog/cell_lab/Gene;->s:Lcom/saterskog/cell_lab/h;

    sget-object v1, Lcom/saterskog/cell_lab/h;->e:Lcom/saterskog/cell_lab/h;

    if-ne v0, v1, :cond_d

    .line 648
    const v0, 0x3fe66666    # 1.8f

    iget-object v1, p0, Lcom/saterskog/cell_lab/CellWorld;->Y:Lcom/saterskog/b/d;

    .line 25008
    invoke-virtual {v1}, Lcom/saterskog/b/d;->nextDouble()D

    move-result-wide v4

    .line 648
    double-to-float v1, v4

    mul-float/2addr v0, v1

    iput v0, v2, Lcom/saterskog/cell_lab/Cell;->S:F

    .line 649
    :cond_d
    iget-object v0, v2, Lcom/saterskog/cell_lab/Cell;->J:[F

    const/4 v1, 0x0

    iget-object v3, v2, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    iget v4, v2, Lcom/saterskog/cell_lab/Cell;->D:I

    aget-object v3, v3, v4

    iget-object v3, v3, Lcom/saterskog/cell_lab/Gene;->a:[F

    const/4 v4, 0x0

    aget v3, v3, v4

    aput v3, v0, v1

    .line 650
    iget-object v0, v2, Lcom/saterskog/cell_lab/Cell;->J:[F

    const/4 v1, 0x1

    iget-object v3, v2, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    iget v4, v2, Lcom/saterskog/cell_lab/Cell;->D:I

    aget-object v3, v3, v4

    iget-object v3, v3, Lcom/saterskog/cell_lab/Gene;->a:[F

    const/4 v4, 0x1

    aget v3, v3, v4

    aput v3, v0, v1

    .line 651
    iget-object v0, v2, Lcom/saterskog/cell_lab/Cell;->J:[F

    const/4 v1, 0x2

    iget-object v3, v2, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    iget v4, v2, Lcom/saterskog/cell_lab/Cell;->D:I

    aget-object v3, v3, v4

    iget-object v3, v3, Lcom/saterskog/cell_lab/Gene;->a:[F

    const/4 v4, 0x2

    aget v3, v3, v4

    aput v3, v0, v1

    .line 652
    iget-object v0, v2, Lcom/saterskog/cell_lab/Cell;->J:[F

    const/4 v1, 0x3

    const/high16 v3, 0x3f800000    # 1.0f

    aput v3, v0, v1

    .line 653
    const-wide/16 v0, 0x0

    iput-wide v0, v2, Lcom/saterskog/cell_lab/Cell;->e:D

    .line 654
    const-wide/16 v0, 0x0

    iput-wide v0, v2, Lcom/saterskog/cell_lab/Cell;->f:D

    .line 655
    const/4 v0, 0x0

    iput-boolean v0, v2, Lcom/saterskog/cell_lab/Cell;->x:Z

    .line 656
    const-wide/16 v0, 0x0

    iput-wide v0, v2, Lcom/saterskog/cell_lab/Cell;->l:D

    .line 657
    const-wide/16 v0, 0x0

    iput-wide v0, v2, Lcom/saterskog/cell_lab/Cell;->n:D

    .line 658
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->Y:Lcom/saterskog/b/d;

    invoke-virtual {v0}, Lcom/saterskog/b/d;->b()D

    move-result-wide v0

    const-wide v4, 0x400921fb54442d18L    # Math.PI

    mul-double/2addr v0, v4

    iput-wide v0, v2, Lcom/saterskog/cell_lab/Cell;->k:D

    .line 659
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->Y:Lcom/saterskog/b/d;

    invoke-virtual {v0}, Lcom/saterskog/b/d;->b()D

    move-result-wide v0

    const-wide v4, 0x400921fb54442d18L    # Math.PI

    mul-double/2addr v0, v4

    iput-wide v0, v2, Lcom/saterskog/cell_lab/Cell;->m:D

    .line 660
    const/4 v0, 0x0

    iput v0, v2, Lcom/saterskog/cell_lab/Cell;->C:I

    .line 661
    const-wide/16 v0, 0x0

    iput-wide v0, v2, Lcom/saterskog/cell_lab/Cell;->o:D

    .line 662
    const/4 v0, 0x0

    iput v0, v2, Lcom/saterskog/cell_lab/Cell;->G:I

    .line 664
    :cond_e
    return-void
.end method

.method private b(FFFF)V
    .locals 14

    .prologue
    .line 3661
    const/4 v1, 0x0

    .line 3662
    const v0, 0x3be56042    # 0.007f

    sub-float v5, p1, v0

    .line 3663
    const v0, 0x3be56042    # 0.007f

    add-float v6, p2, v0

    .line 3664
    const v0, 0x3be56042    # 0.007f

    sub-float v7, p3, v0

    .line 3665
    const v0, 0x3be56042    # 0.007f

    add-float v8, p4, v0

    .line 3667
    const/4 v0, 0x0

    :goto_0
    iget v2, p0, Lcom/saterskog/cell_lab/CellWorld;->B:I

    if-ge v0, v2, :cond_2

    .line 3668
    iget-object v2, p0, Lcom/saterskog/cell_lab/CellWorld;->A:[Lcom/saterskog/cell_lab/Food;

    aget-object v9, v2, v0

    .line 3669
    iget v2, v9, Lcom/saterskog/cell_lab/Food;->a:F

    cmpg-float v2, v2, v5

    if-ltz v2, :cond_0

    iget v2, v9, Lcom/saterskog/cell_lab/Food;->a:F

    cmpl-float v2, v2, v6

    if-gtz v2, :cond_0

    iget v2, v9, Lcom/saterskog/cell_lab/Food;->b:F

    cmpg-float v2, v2, v7

    if-ltz v2, :cond_0

    iget v2, v9, Lcom/saterskog/cell_lab/Food;->b:F

    cmpl-float v2, v2, v8

    if-gtz v2, :cond_0

    .line 3671
    const-wide v2, 0x3f7cac0840000000L    # 0.007000000216066837

    iget v4, v9, Lcom/saterskog/cell_lab/Food;->c:F

    float-to-double v10, v4

    const-wide v12, 0x3ff26e978d4fdf3bL    # 1.152

    div-double/2addr v10, v12

    invoke-static {v10, v11}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v10

    mul-double/2addr v2, v10

    double-to-float v10, v2

    .line 3676
    iget v2, v9, Lcom/saterskog/cell_lab/Food;->f:F

    const/4 v3, 0x0

    cmpg-float v2, v2, v3

    if-gtz v2, :cond_1

    .line 3677
    const v4, 0x3f19999a    # 0.6f

    .line 3678
    const v3, 0x3ecccccd    # 0.4f

    .line 3679
    const v2, 0x3e4ccccd    # 0.2f

    .line 3690
    :goto_1
    iget-object v11, p0, Lcom/saterskog/cell_lab/CellWorld;->ah:[F

    const/high16 v12, 0x3f800000    # 1.0f

    aput v12, v11, v1

    .line 3691
    iget-object v11, p0, Lcom/saterskog/cell_lab/CellWorld;->ah:[F

    add-int/lit8 v12, v1, 0x1

    const/high16 v13, 0x3f800000    # 1.0f

    aput v13, v11, v12

    .line 3692
    iget-object v11, p0, Lcom/saterskog/cell_lab/CellWorld;->ah:[F

    add-int/lit8 v12, v1, 0x2

    const/high16 v13, 0x3f800000    # 1.0f

    aput v13, v11, v12

    .line 3693
    iget-object v11, p0, Lcom/saterskog/cell_lab/CellWorld;->ah:[F

    add-int/lit8 v12, v1, 0x3

    const/high16 v13, -0x40800000    # -1.0f

    aput v13, v11, v12

    .line 3694
    iget-object v11, p0, Lcom/saterskog/cell_lab/CellWorld;->ah:[F

    add-int/lit8 v12, v1, 0x4

    const/high16 v13, -0x40800000    # -1.0f

    aput v13, v11, v12

    .line 3695
    iget-object v11, p0, Lcom/saterskog/cell_lab/CellWorld;->ah:[F

    add-int/lit8 v12, v1, 0x5

    const/high16 v13, -0x40800000    # -1.0f

    aput v13, v11, v12

    .line 3697
    iget-object v11, p0, Lcom/saterskog/cell_lab/CellWorld;->ai:[F

    iget v12, v9, Lcom/saterskog/cell_lab/Food;->a:F

    add-float/2addr v12, v10

    aput v12, v11, v1

    .line 3698
    iget-object v11, p0, Lcom/saterskog/cell_lab/CellWorld;->ai:[F

    add-int/lit8 v12, v1, 0x1

    iget v13, v9, Lcom/saterskog/cell_lab/Food;->b:F

    add-float/2addr v13, v10

    aput v13, v11, v12

    .line 3699
    iget-object v11, p0, Lcom/saterskog/cell_lab/CellWorld;->ai:[F

    add-int/lit8 v12, v1, 0x2

    iget v13, v9, Lcom/saterskog/cell_lab/Food;->a:F

    add-float/2addr v13, v10

    aput v13, v11, v12

    .line 3700
    iget-object v11, p0, Lcom/saterskog/cell_lab/CellWorld;->ai:[F

    add-int/lit8 v12, v1, 0x3

    iget v13, v9, Lcom/saterskog/cell_lab/Food;->b:F

    sub-float/2addr v13, v10

    aput v13, v11, v12

    .line 3701
    iget-object v11, p0, Lcom/saterskog/cell_lab/CellWorld;->ai:[F

    add-int/lit8 v12, v1, 0x4

    iget v13, v9, Lcom/saterskog/cell_lab/Food;->a:F

    sub-float/2addr v13, v10

    aput v13, v11, v12

    .line 3702
    iget-object v11, p0, Lcom/saterskog/cell_lab/CellWorld;->ai:[F

    add-int/lit8 v12, v1, 0x5

    iget v13, v9, Lcom/saterskog/cell_lab/Food;->b:F

    sub-float/2addr v13, v10

    aput v13, v11, v12

    .line 3704
    iget-object v11, p0, Lcom/saterskog/cell_lab/CellWorld;->aj:[F

    mul-int/lit8 v12, v1, 0x2

    add-int/lit8 v12, v12, 0x0

    aput v4, v11, v12

    .line 3705
    iget-object v11, p0, Lcom/saterskog/cell_lab/CellWorld;->aj:[F

    mul-int/lit8 v12, v1, 0x2

    add-int/lit8 v12, v12, 0x1

    aput v3, v11, v12

    .line 3706
    iget-object v11, p0, Lcom/saterskog/cell_lab/CellWorld;->aj:[F

    mul-int/lit8 v12, v1, 0x2

    add-int/lit8 v12, v12, 0x2

    aput v2, v11, v12

    .line 3707
    iget-object v11, p0, Lcom/saterskog/cell_lab/CellWorld;->aj:[F

    mul-int/lit8 v12, v1, 0x2

    add-int/lit8 v12, v12, 0x3

    const v13, 0x3ecccccd    # 0.4f

    aput v13, v11, v12

    .line 3709
    iget-object v11, p0, Lcom/saterskog/cell_lab/CellWorld;->aj:[F

    mul-int/lit8 v12, v1, 0x2

    add-int/lit8 v12, v12, 0x4

    aput v4, v11, v12

    .line 3710
    iget-object v11, p0, Lcom/saterskog/cell_lab/CellWorld;->aj:[F

    mul-int/lit8 v12, v1, 0x2

    add-int/lit8 v12, v12, 0x5

    aput v3, v11, v12

    .line 3711
    iget-object v11, p0, Lcom/saterskog/cell_lab/CellWorld;->aj:[F

    mul-int/lit8 v12, v1, 0x2

    add-int/lit8 v12, v12, 0x6

    aput v2, v11, v12

    .line 3712
    iget-object v11, p0, Lcom/saterskog/cell_lab/CellWorld;->aj:[F

    mul-int/lit8 v12, v1, 0x2

    add-int/lit8 v12, v12, 0x7

    const v13, 0x3ecccccd    # 0.4f

    aput v13, v11, v12

    .line 3714
    iget-object v11, p0, Lcom/saterskog/cell_lab/CellWorld;->aj:[F

    mul-int/lit8 v12, v1, 0x2

    add-int/lit8 v12, v12, 0x8

    aput v4, v11, v12

    .line 3715
    iget-object v11, p0, Lcom/saterskog/cell_lab/CellWorld;->aj:[F

    mul-int/lit8 v12, v1, 0x2

    add-int/lit8 v12, v12, 0x9

    aput v3, v11, v12

    .line 3716
    iget-object v11, p0, Lcom/saterskog/cell_lab/CellWorld;->aj:[F

    mul-int/lit8 v12, v1, 0x2

    add-int/lit8 v12, v12, 0xa

    aput v2, v11, v12

    .line 3717
    iget-object v11, p0, Lcom/saterskog/cell_lab/CellWorld;->aj:[F

    mul-int/lit8 v12, v1, 0x2

    add-int/lit8 v12, v12, 0xb

    const v13, 0x3ecccccd    # 0.4f

    aput v13, v11, v12

    .line 3719
    add-int/lit8 v1, v1, 0x6

    .line 3721
    iget-object v11, p0, Lcom/saterskog/cell_lab/CellWorld;->ah:[F

    const/high16 v12, -0x40800000    # -1.0f

    aput v12, v11, v1

    .line 3722
    iget-object v11, p0, Lcom/saterskog/cell_lab/CellWorld;->ah:[F

    add-int/lit8 v12, v1, 0x1

    const/high16 v13, -0x40800000    # -1.0f

    aput v13, v11, v12

    .line 3723
    iget-object v11, p0, Lcom/saterskog/cell_lab/CellWorld;->ah:[F

    add-int/lit8 v12, v1, 0x2

    const/high16 v13, -0x40800000    # -1.0f

    aput v13, v11, v12

    .line 3724
    iget-object v11, p0, Lcom/saterskog/cell_lab/CellWorld;->ah:[F

    add-int/lit8 v12, v1, 0x3

    const/high16 v13, 0x3f800000    # 1.0f

    aput v13, v11, v12

    .line 3725
    iget-object v11, p0, Lcom/saterskog/cell_lab/CellWorld;->ah:[F

    add-int/lit8 v12, v1, 0x4

    const/high16 v13, 0x3f800000    # 1.0f

    aput v13, v11, v12

    .line 3726
    iget-object v11, p0, Lcom/saterskog/cell_lab/CellWorld;->ah:[F

    add-int/lit8 v12, v1, 0x5

    const/high16 v13, 0x3f800000    # 1.0f

    aput v13, v11, v12

    .line 3728
    iget-object v11, p0, Lcom/saterskog/cell_lab/CellWorld;->ai:[F

    iget v12, v9, Lcom/saterskog/cell_lab/Food;->a:F

    sub-float/2addr v12, v10

    aput v12, v11, v1

    .line 3729
    iget-object v11, p0, Lcom/saterskog/cell_lab/CellWorld;->ai:[F

    add-int/lit8 v12, v1, 0x1

    iget v13, v9, Lcom/saterskog/cell_lab/Food;->b:F

    sub-float/2addr v13, v10

    aput v13, v11, v12

    .line 3730
    iget-object v11, p0, Lcom/saterskog/cell_lab/CellWorld;->ai:[F

    add-int/lit8 v12, v1, 0x2

    iget v13, v9, Lcom/saterskog/cell_lab/Food;->a:F

    sub-float/2addr v13, v10

    aput v13, v11, v12

    .line 3731
    iget-object v11, p0, Lcom/saterskog/cell_lab/CellWorld;->ai:[F

    add-int/lit8 v12, v1, 0x3

    iget v13, v9, Lcom/saterskog/cell_lab/Food;->b:F

    add-float/2addr v13, v10

    aput v13, v11, v12

    .line 3732
    iget-object v11, p0, Lcom/saterskog/cell_lab/CellWorld;->ai:[F

    add-int/lit8 v12, v1, 0x4

    iget v13, v9, Lcom/saterskog/cell_lab/Food;->a:F

    add-float/2addr v13, v10

    aput v13, v11, v12

    .line 3733
    iget-object v11, p0, Lcom/saterskog/cell_lab/CellWorld;->ai:[F

    add-int/lit8 v12, v1, 0x5

    iget v9, v9, Lcom/saterskog/cell_lab/Food;->b:F

    add-float/2addr v9, v10

    aput v9, v11, v12

    .line 3735
    iget-object v9, p0, Lcom/saterskog/cell_lab/CellWorld;->aj:[F

    mul-int/lit8 v10, v1, 0x2

    add-int/lit8 v10, v10, 0x0

    aput v4, v9, v10

    .line 3736
    iget-object v9, p0, Lcom/saterskog/cell_lab/CellWorld;->aj:[F

    mul-int/lit8 v10, v1, 0x2

    add-int/lit8 v10, v10, 0x1

    aput v3, v9, v10

    .line 3737
    iget-object v9, p0, Lcom/saterskog/cell_lab/CellWorld;->aj:[F

    mul-int/lit8 v10, v1, 0x2

    add-int/lit8 v10, v10, 0x2

    aput v2, v9, v10

    .line 3738
    iget-object v9, p0, Lcom/saterskog/cell_lab/CellWorld;->aj:[F

    mul-int/lit8 v10, v1, 0x2

    add-int/lit8 v10, v10, 0x3

    const v11, 0x3ecccccd    # 0.4f

    aput v11, v9, v10

    .line 3740
    iget-object v9, p0, Lcom/saterskog/cell_lab/CellWorld;->aj:[F

    mul-int/lit8 v10, v1, 0x2

    add-int/lit8 v10, v10, 0x4

    aput v4, v9, v10

    .line 3741
    iget-object v9, p0, Lcom/saterskog/cell_lab/CellWorld;->aj:[F

    mul-int/lit8 v10, v1, 0x2

    add-int/lit8 v10, v10, 0x5

    aput v3, v9, v10

    .line 3742
    iget-object v9, p0, Lcom/saterskog/cell_lab/CellWorld;->aj:[F

    mul-int/lit8 v10, v1, 0x2

    add-int/lit8 v10, v10, 0x6

    aput v2, v9, v10

    .line 3743
    iget-object v9, p0, Lcom/saterskog/cell_lab/CellWorld;->aj:[F

    mul-int/lit8 v10, v1, 0x2

    add-int/lit8 v10, v10, 0x7

    const v11, 0x3ecccccd    # 0.4f

    aput v11, v9, v10

    .line 3745
    iget-object v9, p0, Lcom/saterskog/cell_lab/CellWorld;->aj:[F

    mul-int/lit8 v10, v1, 0x2

    add-int/lit8 v10, v10, 0x8

    aput v4, v9, v10

    .line 3746
    iget-object v4, p0, Lcom/saterskog/cell_lab/CellWorld;->aj:[F

    mul-int/lit8 v9, v1, 0x2

    add-int/lit8 v9, v9, 0x9

    aput v3, v4, v9

    .line 3747
    iget-object v3, p0, Lcom/saterskog/cell_lab/CellWorld;->aj:[F

    mul-int/lit8 v4, v1, 0x2

    add-int/lit8 v4, v4, 0xa

    aput v2, v3, v4

    .line 3748
    iget-object v2, p0, Lcom/saterskog/cell_lab/CellWorld;->aj:[F

    mul-int/lit8 v3, v1, 0x2

    add-int/lit8 v3, v3, 0xb

    const v4, 0x3ecccccd    # 0.4f

    aput v4, v2, v3

    .line 3750
    add-int/lit8 v1, v1, 0x6

    .line 3667
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto/16 :goto_0

    .line 3684
    :cond_1
    const v2, 0x3f4ccccd    # 0.8f

    const v3, 0x3e4ccccd    # 0.2f

    iget v4, v9, Lcom/saterskog/cell_lab/Food;->f:F

    mul-float/2addr v3, v4

    add-float v4, v2, v3

    .line 3685
    const v2, 0x3ecccccd    # 0.4f

    const/high16 v3, 0x3f800000    # 1.0f

    iget v11, v9, Lcom/saterskog/cell_lab/Food;->f:F

    sub-float/2addr v3, v11

    mul-float/2addr v3, v2

    .line 3686
    const v2, 0x3e4ccccd    # 0.2f

    const/high16 v11, 0x3f800000    # 1.0f

    iget v12, v9, Lcom/saterskog/cell_lab/Food;->f:F

    sub-float/2addr v11, v12

    mul-float/2addr v2, v11

    goto/16 :goto_1

    .line 3752
    :cond_2
    div-int/lit8 v0, v1, 0x2

    iput v0, p0, Lcom/saterskog/cell_lab/CellWorld;->be:I

    .line 3753
    iget v0, p0, Lcom/saterskog/cell_lab/CellWorld;->be:I

    mul-int/lit8 v0, v0, 0x2

    iget-object v1, p0, Lcom/saterskog/cell_lab/CellWorld;->ai:[F

    array-length v1, v1

    if-le v0, v1, :cond_3

    .line 3754
    const-string v0, "skit2centerCoordsF"

    invoke-static {v0}, Lcom/saterskog/b/a;->a(Ljava/lang/String;)V

    .line 3755
    :cond_3
    iget v0, p0, Lcom/saterskog/cell_lab/CellWorld;->be:I

    mul-int/lit8 v0, v0, 0x2

    iget-object v1, p0, Lcom/saterskog/cell_lab/CellWorld;->ah:[F

    array-length v1, v1

    if-le v0, v1, :cond_4

    .line 3756
    const-string v0, "skit2triCoordsF"

    invoke-static {v0}, Lcom/saterskog/b/a;->a(Ljava/lang/String;)V

    .line 3758
    :cond_4
    iget v0, p0, Lcom/saterskog/cell_lab/CellWorld;->be:I

    mul-int/lit8 v0, v0, 0x4

    iget-object v1, p0, Lcom/saterskog/cell_lab/CellWorld;->aj:[F

    array-length v1, v1

    if-le v0, v1, :cond_5

    .line 3759
    const-string v0, "skit2foodColor"

    invoke-static {v0}, Lcom/saterskog/b/a;->a(Ljava/lang/String;)V

    .line 3760
    :cond_5
    return-void
.end method

.method private c(DD)D
    .locals 11

    .prologue
    const-wide/high16 v8, 0x3ff0000000000000L    # 1.0

    .line 4419
    iget-wide v0, p0, Lcom/saterskog/cell_lab/CellWorld;->P:D

    mul-double/2addr v0, p1

    iget-wide v2, p0, Lcom/saterskog/cell_lab/CellWorld;->Q:D

    mul-double/2addr v2, p3

    add-double/2addr v0, v2

    iget-object v2, p0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v2, v2, Lcom/saterskog/cell_lab/Environment;->k:D

    div-double/2addr v0, v2

    .line 4420
    iget-object v2, p0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v2, v2, Lcom/saterskog/cell_lab/Environment;->f:D

    sub-double v2, v8, v2

    mul-double v4, p1, p1

    mul-double v6, p3, p3

    add-double/2addr v4, v6

    invoke-static {v4, v5}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v4

    iget-object v6, p0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v6, v6, Lcom/saterskog/cell_lab/Environment;->k:D

    div-double/2addr v4, v6

    sub-double v4, v8, v4

    mul-double/2addr v2, v4

    iget-object v4, p0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v4, v4, Lcom/saterskog/cell_lab/Environment;->f:D

    div-double/2addr v2, v4

    add-double/2addr v2, v8

    .line 4421
    iget-object v4, p0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v4, v4, Lcom/saterskog/cell_lab/Environment;->d:D

    iget-object v6, p0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v6, v6, Lcom/saterskog/cell_lab/Environment;->f:D

    sub-double v6, v8, v6

    mul-double/2addr v0, v6

    iget-object v6, p0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v6, v6, Lcom/saterskog/cell_lab/Environment;->f:D

    add-double/2addr v0, v6

    mul-double/2addr v0, v4

    mul-double/2addr v2, v2

    div-double/2addr v0, v2

    const-wide/16 v2, 0x0

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(DD)D

    move-result-wide v0

    return-wide v0
.end method

.method private c(D)V
    .locals 31

    .prologue
    .line 1038
    move-object/from16 v0, p0

    iget v7, v0, Lcom/saterskog/cell_lab/CellWorld;->z:I

    .line 1039
    const/4 v2, 0x0

    move v6, v2

    :goto_0
    if-ge v6, v7, :cond_a

    .line 1040
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    aget-object v8, v2, v6

    .line 1045
    iget-wide v2, v8, Lcom/saterskog/cell_lab/Cell;->w:D

    .line 1048
    iget-wide v4, v8, Lcom/saterskog/cell_lab/Cell;->w:D

    iget-wide v10, v8, Lcom/saterskog/cell_lab/Cell;->d:D

    mul-double/2addr v4, v10

    iget-wide v10, v8, Lcom/saterskog/cell_lab/Cell;->d:D

    mul-double/2addr v4, v10

    const-wide v10, 0x3fe6666666666666L    # 0.7

    mul-double/2addr v10, v4

    .line 1049
    iget-wide v4, v8, Lcom/saterskog/cell_lab/Cell;->g:D

    div-double/2addr v4, v2

    mul-double v4, v4, p1

    .line 1050
    iget-wide v12, v8, Lcom/saterskog/cell_lab/Cell;->h:D

    div-double v2, v12, v2

    mul-double v12, v2, p1

    .line 1052
    iget-wide v2, v8, Lcom/saterskog/cell_lab/Cell;->j:D

    mul-double v2, v2, p1

    div-double v14, v2, v10

    .line 1054
    iget-wide v2, v8, Lcom/saterskog/cell_lab/Cell;->q:D

    iget-wide v0, v8, Lcom/saterskog/cell_lab/Cell;->i:D

    move-wide/from16 v16, v0

    mul-double v16, v16, p1

    const-wide/high16 v18, 0x4024000000000000L    # 10.0

    mul-double v16, v16, v18

    add-double v2, v2, v16

    iput-wide v2, v8, Lcom/saterskog/cell_lab/Cell;->q:D

    .line 1055
    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    iget-wide v0, v8, Lcom/saterskog/cell_lab/Cell;->q:D

    move-wide/from16 v16, v0

    const-wide/high16 v18, 0x4008000000000000L    # 3.0

    mul-double v16, v16, v18

    sub-double v2, v2, v16

    .line 1056
    const-wide/16 v16, 0x0

    cmpg-double v9, v2, v16

    if-gez v9, :cond_0

    const-wide/16 v2, 0x0

    .line 1057
    :cond_0
    const-wide/high16 v16, 0x4010000000000000L    # 4.0

    cmpl-double v9, v2, v16

    if-lez v9, :cond_1

    const-wide/high16 v2, 0x4010000000000000L    # 4.0

    .line 1058
    :cond_1
    iget-wide v0, v8, Lcom/saterskog/cell_lab/Cell;->w:D

    move-wide/from16 v16, v0

    mul-double v16, v16, v2

    .line 1059
    iget-boolean v2, v8, Lcom/saterskog/cell_lab/Cell;->z:Z

    if-eqz v2, :cond_3

    .line 1060
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v2, v2, Lcom/saterskog/cell_lab/Environment;->l:D

    mul-double v2, v2, v16

    .line 1061
    mul-double v18, v4, v4

    mul-double v20, v12, v12

    add-double v18, v18, v20

    mul-double v20, v2, v2

    mul-double v20, v20, p1

    mul-double v20, v20, p1

    cmpl-double v9, v18, v20

    if-gtz v9, :cond_2

    invoke-static {v14, v15}, Ljava/lang/Math;->abs(D)D

    move-result-wide v18

    mul-double v2, v2, p1

    const-wide v20, 0x3fe5555555555555L    # 0.6666666666666666

    mul-double v2, v2, v20

    cmpl-double v2, v18, v2

    if-lez v2, :cond_3

    .line 1062
    :cond_2
    const/4 v2, 0x0

    iput-boolean v2, v8, Lcom/saterskog/cell_lab/Cell;->z:Z

    .line 1065
    :cond_3
    iget-boolean v2, v8, Lcom/saterskog/cell_lab/Cell;->z:Z

    if-nez v2, :cond_6

    .line 1068
    iget-wide v2, v8, Lcom/saterskog/cell_lab/Cell;->e:D

    add-double v18, v2, v4

    .line 1069
    iget-wide v2, v8, Lcom/saterskog/cell_lab/Cell;->f:D

    add-double/2addr v12, v2

    .line 1070
    iget-wide v2, v8, Lcom/saterskog/cell_lab/Cell;->l:D

    add-double/2addr v14, v2

    .line 1071
    mul-double v2, v18, v18

    mul-double v4, v12, v12

    add-double/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v20

    .line 1073
    iget-wide v2, v8, Lcom/saterskog/cell_lab/Cell;->l:D

    const-wide/16 v4, 0x0

    cmpl-double v2, v2, v4

    if-eqz v2, :cond_7

    .line 1074
    iget-wide v2, v8, Lcom/saterskog/cell_lab/Cell;->d:D

    iget-wide v4, v8, Lcom/saterskog/cell_lab/Cell;->l:D

    invoke-static {v4, v5}, Ljava/lang/Math;->abs(D)D

    move-result-wide v4

    mul-double/2addr v2, v4

    div-double v2, v20, v2

    .line 1075
    mul-double v22, v2, v2

    .line 1076
    const-wide v4, 0x3fb999999999999aL    # 0.1

    mul-double/2addr v4, v2

    add-double v4, v4, v22

    const-wide v24, 0x3fb999999999999aL    # 0.1

    mul-double v24, v24, v2

    add-double v24, v24, v22

    const-wide v26, 0x3fc3333333333333L    # 0.15

    add-double v24, v24, v26

    div-double v4, v4, v24

    .line 1077
    const-wide v24, 0x3fe4cccccccccccdL    # 0.65

    const-wide/high16 v26, 0x3ff0000000000000L    # 1.0

    add-double v28, v22, v2

    add-double v2, v2, v22

    const-wide/high16 v22, 0x4014000000000000L    # 5.0

    add-double v2, v2, v22

    div-double v2, v28, v2

    sub-double v2, v26, v2

    mul-double v2, v2, v24

    .line 1078
    invoke-static {v4, v5}, Ljava/lang/Double;->isNaN(D)Z

    move-result v9

    if-nez v9, :cond_4

    invoke-static {v2, v3}, Ljava/lang/Double;->isNaN(D)Z

    move-result v9

    if-eqz v9, :cond_5

    :cond_4
    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    const-wide/16 v2, 0x0

    .line 1088
    :cond_5
    :goto_1
    move-object/from16 v0, p0

    iget-object v9, v0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v0, v9, Lcom/saterskog/cell_lab/Environment;->m:D

    move-wide/from16 v22, v0

    mul-double v4, v4, v22

    mul-double v4, v4, v16

    .line 1089
    move-object/from16 v0, p0

    iget-object v9, v0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v0, v9, Lcom/saterskog/cell_lab/Environment;->m:D

    move-wide/from16 v16, v0

    mul-double v2, v2, v16

    iget-wide v0, v8, Lcom/saterskog/cell_lab/Cell;->w:D

    move-wide/from16 v16, v0

    mul-double v2, v2, v16

    .line 1092
    iget-wide v0, v8, Lcom/saterskog/cell_lab/Cell;->w:D

    move-wide/from16 v16, v0

    div-double v4, v4, v16

    mul-double v4, v4, p1

    .line 1093
    div-double/2addr v2, v10

    mul-double v10, v2, p1

    .line 1094
    const/4 v2, 0x0

    .line 1095
    mul-double v16, v18, v18

    mul-double v22, v12, v12

    add-double v16, v16, v22

    mul-double v22, v4, v4

    cmpg-double v3, v16, v22

    if-gtz v3, :cond_8

    .line 1097
    const-wide/16 v2, 0x0

    iput-wide v2, v8, Lcom/saterskog/cell_lab/Cell;->e:D

    .line 1098
    const-wide/16 v2, 0x0

    iput-wide v2, v8, Lcom/saterskog/cell_lab/Cell;->f:D

    .line 1099
    const/4 v2, 0x1

    .line 1112
    :goto_2
    invoke-static {v14, v15}, Ljava/lang/Math;->abs(D)D

    move-result-wide v4

    cmpg-double v3, v4, v10

    if-gtz v3, :cond_9

    .line 1114
    const-wide/16 v4, 0x0

    iput-wide v4, v8, Lcom/saterskog/cell_lab/Cell;->l:D

    .line 1115
    if-eqz v2, :cond_6

    const/4 v2, 0x1

    iput-boolean v2, v8, Lcom/saterskog/cell_lab/Cell;->z:Z

    .line 1129
    :cond_6
    :goto_3
    iget-wide v2, v8, Lcom/saterskog/cell_lab/Cell;->e:D

    iput-wide v2, v8, Lcom/saterskog/cell_lab/Cell;->g:D

    .line 1130
    iget-wide v2, v8, Lcom/saterskog/cell_lab/Cell;->f:D

    iput-wide v2, v8, Lcom/saterskog/cell_lab/Cell;->h:D

    .line 1131
    iget-wide v2, v8, Lcom/saterskog/cell_lab/Cell;->l:D

    iput-wide v2, v8, Lcom/saterskog/cell_lab/Cell;->j:D

    .line 1039
    add-int/lit8 v2, v6, 0x1

    move v6, v2

    goto/16 :goto_0

    .line 1082
    :cond_7
    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    .line 1083
    const-wide/16 v2, 0x0

    goto :goto_1

    .line 1102
    :cond_8
    mul-double v16, v18, v4

    div-double v16, v16, v20

    sub-double v16, v18, v16

    move-wide/from16 v0, v16

    iput-wide v0, v8, Lcom/saterskog/cell_lab/Cell;->e:D

    .line 1103
    mul-double/2addr v4, v12

    div-double v4, v4, v20

    sub-double v4, v12, v4

    iput-wide v4, v8, Lcom/saterskog/cell_lab/Cell;->f:D

    goto :goto_2

    .line 1118
    :cond_9
    iget-wide v2, v8, Lcom/saterskog/cell_lab/Cell;->l:D

    invoke-static {v2, v3}, Ljava/lang/Math;->signum(D)D

    move-result-wide v2

    mul-double/2addr v2, v10

    sub-double v2, v14, v2

    iput-wide v2, v8, Lcom/saterskog/cell_lab/Cell;->l:D

    goto :goto_3

    .line 1133
    :cond_a
    return-void
.end method

.method private c(FFFF)V
    .locals 14

    .prologue
    .line 3763
    const/4 v1, 0x0

    .line 3764
    const v0, 0x3d814057    # 0.063111f

    sub-float v2, p1, v0

    .line 3765
    const v0, 0x3d814057    # 0.063111f

    add-float v3, p2, v0

    .line 3766
    const v0, 0x3d814057    # 0.063111f

    sub-float v4, p3, v0

    .line 3767
    const v0, 0x3d814057    # 0.063111f

    add-float v5, p4, v0

    .line 3769
    const/4 v0, 0x0

    :goto_0
    iget v6, p0, Lcom/saterskog/cell_lab/CellWorld;->C:I

    if-ge v0, v6, :cond_1

    .line 3770
    iget-object v6, p0, Lcom/saterskog/cell_lab/CellWorld;->y:[Lcom/saterskog/cell_lab/e;

    aget-object v6, v6, v0

    .line 3771
    iget-wide v8, v6, Lcom/saterskog/cell_lab/e;->a:D

    float-to-double v10, v2

    cmpg-double v7, v8, v10

    if-ltz v7, :cond_0

    iget-wide v8, v6, Lcom/saterskog/cell_lab/e;->a:D

    float-to-double v10, v3

    cmpl-double v7, v8, v10

    if-gtz v7, :cond_0

    iget-wide v8, v6, Lcom/saterskog/cell_lab/e;->b:D

    float-to-double v10, v4

    cmpg-double v7, v8, v10

    if-ltz v7, :cond_0

    iget-wide v8, v6, Lcom/saterskog/cell_lab/e;->b:D

    float-to-double v10, v5

    cmpl-double v7, v8, v10

    if-gtz v7, :cond_0

    .line 3773
    const v7, 0x3d814057    # 0.063111f

    iget-wide v8, v6, Lcom/saterskog/cell_lab/e;->c:D

    const-wide v10, 0x3f9eb851eb851eb8L    # 0.03

    div-double/2addr v8, v10

    double-to-float v8, v8

    mul-float/2addr v7, v8

    .line 3774
    iget-wide v8, v6, Lcom/saterskog/cell_lab/e;->d:D

    invoke-static {v8, v9}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v8

    double-to-float v8, v8

    .line 3775
    iget-object v9, p0, Lcom/saterskog/cell_lab/CellWorld;->ak:[F

    mul-int/lit8 v10, v1, 0x2

    aput v7, v9, v10

    .line 3776
    iget-object v9, p0, Lcom/saterskog/cell_lab/CellWorld;->ak:[F

    mul-int/lit8 v10, v1, 0x2

    add-int/lit8 v10, v10, 0x1

    aput v7, v9, v10

    .line 3777
    iget-object v9, p0, Lcom/saterskog/cell_lab/CellWorld;->ak:[F

    mul-int/lit8 v10, v1, 0x2

    add-int/lit8 v10, v10, 0x2

    aput v8, v9, v10

    .line 3778
    iget-object v9, p0, Lcom/saterskog/cell_lab/CellWorld;->ak:[F

    mul-int/lit8 v10, v1, 0x2

    add-int/lit8 v10, v10, 0x3

    const/4 v11, 0x0

    aput v11, v9, v10

    .line 3779
    iget-object v9, p0, Lcom/saterskog/cell_lab/CellWorld;->ak:[F

    mul-int/lit8 v10, v1, 0x2

    add-int/lit8 v10, v10, 0x4

    aput v7, v9, v10

    .line 3780
    iget-object v9, p0, Lcom/saterskog/cell_lab/CellWorld;->ak:[F

    mul-int/lit8 v10, v1, 0x2

    add-int/lit8 v10, v10, 0x5

    neg-float v11, v7

    aput v11, v9, v10

    .line 3781
    iget-object v9, p0, Lcom/saterskog/cell_lab/CellWorld;->ak:[F

    mul-int/lit8 v10, v1, 0x2

    add-int/lit8 v10, v10, 0x6

    aput v8, v9, v10

    .line 3782
    iget-object v9, p0, Lcom/saterskog/cell_lab/CellWorld;->ak:[F

    mul-int/lit8 v10, v1, 0x2

    add-int/lit8 v10, v10, 0x7

    const/4 v11, 0x0

    aput v11, v9, v10

    .line 3783
    iget-object v9, p0, Lcom/saterskog/cell_lab/CellWorld;->ak:[F

    mul-int/lit8 v10, v1, 0x2

    add-int/lit8 v10, v10, 0x8

    neg-float v11, v7

    aput v11, v9, v10

    .line 3784
    iget-object v9, p0, Lcom/saterskog/cell_lab/CellWorld;->ak:[F

    mul-int/lit8 v10, v1, 0x2

    add-int/lit8 v10, v10, 0x9

    neg-float v11, v7

    aput v11, v9, v10

    .line 3785
    iget-object v9, p0, Lcom/saterskog/cell_lab/CellWorld;->ak:[F

    mul-int/lit8 v10, v1, 0x2

    add-int/lit8 v10, v10, 0xa

    aput v8, v9, v10

    .line 3786
    iget-object v9, p0, Lcom/saterskog/cell_lab/CellWorld;->ak:[F

    mul-int/lit8 v10, v1, 0x2

    add-int/lit8 v10, v10, 0xb

    const/4 v11, 0x0

    aput v11, v9, v10

    .line 3788
    iget-object v9, p0, Lcom/saterskog/cell_lab/CellWorld;->al:[F

    iget-wide v10, v6, Lcom/saterskog/cell_lab/e;->a:D

    double-to-float v10, v10

    aput v10, v9, v1

    .line 3789
    iget-object v9, p0, Lcom/saterskog/cell_lab/CellWorld;->al:[F

    add-int/lit8 v10, v1, 0x1

    iget-wide v12, v6, Lcom/saterskog/cell_lab/e;->b:D

    double-to-float v11, v12

    aput v11, v9, v10

    .line 3790
    iget-object v9, p0, Lcom/saterskog/cell_lab/CellWorld;->al:[F

    add-int/lit8 v10, v1, 0x2

    iget-wide v12, v6, Lcom/saterskog/cell_lab/e;->a:D

    double-to-float v11, v12

    aput v11, v9, v10

    .line 3791
    iget-object v9, p0, Lcom/saterskog/cell_lab/CellWorld;->al:[F

    add-int/lit8 v10, v1, 0x3

    iget-wide v12, v6, Lcom/saterskog/cell_lab/e;->b:D

    double-to-float v11, v12

    aput v11, v9, v10

    .line 3792
    iget-object v9, p0, Lcom/saterskog/cell_lab/CellWorld;->al:[F

    add-int/lit8 v10, v1, 0x4

    iget-wide v12, v6, Lcom/saterskog/cell_lab/e;->a:D

    double-to-float v11, v12

    aput v11, v9, v10

    .line 3793
    iget-object v9, p0, Lcom/saterskog/cell_lab/CellWorld;->al:[F

    add-int/lit8 v10, v1, 0x5

    iget-wide v12, v6, Lcom/saterskog/cell_lab/e;->b:D

    double-to-float v11, v12

    aput v11, v9, v10

    .line 3795
    iget-object v9, p0, Lcom/saterskog/cell_lab/CellWorld;->am:[F

    mul-int/lit8 v10, v1, 0x2

    iget-object v11, v6, Lcom/saterskog/cell_lab/e;->e:[F

    const/4 v12, 0x0

    aget v11, v11, v12

    aput v11, v9, v10

    .line 3796
    iget-object v9, p0, Lcom/saterskog/cell_lab/CellWorld;->am:[F

    mul-int/lit8 v10, v1, 0x2

    add-int/lit8 v10, v10, 0x1

    iget-object v11, v6, Lcom/saterskog/cell_lab/e;->e:[F

    const/4 v12, 0x1

    aget v11, v11, v12

    aput v11, v9, v10

    .line 3797
    iget-object v9, p0, Lcom/saterskog/cell_lab/CellWorld;->am:[F

    mul-int/lit8 v10, v1, 0x2

    add-int/lit8 v10, v10, 0x2

    iget-object v11, v6, Lcom/saterskog/cell_lab/e;->e:[F

    const/4 v12, 0x2

    aget v11, v11, v12

    aput v11, v9, v10

    .line 3798
    iget-object v9, p0, Lcom/saterskog/cell_lab/CellWorld;->am:[F

    mul-int/lit8 v10, v1, 0x2

    add-int/lit8 v10, v10, 0x3

    iget-wide v12, v6, Lcom/saterskog/cell_lab/e;->c:D

    double-to-float v11, v12

    aput v11, v9, v10

    .line 3799
    iget-object v9, p0, Lcom/saterskog/cell_lab/CellWorld;->am:[F

    mul-int/lit8 v10, v1, 0x2

    add-int/lit8 v10, v10, 0x4

    iget-object v11, v6, Lcom/saterskog/cell_lab/e;->e:[F

    const/4 v12, 0x0

    aget v11, v11, v12

    aput v11, v9, v10

    .line 3800
    iget-object v9, p0, Lcom/saterskog/cell_lab/CellWorld;->am:[F

    mul-int/lit8 v10, v1, 0x2

    add-int/lit8 v10, v10, 0x5

    iget-object v11, v6, Lcom/saterskog/cell_lab/e;->e:[F

    const/4 v12, 0x1

    aget v11, v11, v12

    aput v11, v9, v10

    .line 3801
    iget-object v9, p0, Lcom/saterskog/cell_lab/CellWorld;->am:[F

    mul-int/lit8 v10, v1, 0x2

    add-int/lit8 v10, v10, 0x6

    iget-object v11, v6, Lcom/saterskog/cell_lab/e;->e:[F

    const/4 v12, 0x2

    aget v11, v11, v12

    aput v11, v9, v10

    .line 3802
    iget-object v9, p0, Lcom/saterskog/cell_lab/CellWorld;->am:[F

    mul-int/lit8 v10, v1, 0x2

    add-int/lit8 v10, v10, 0x7

    iget-wide v12, v6, Lcom/saterskog/cell_lab/e;->c:D

    double-to-float v11, v12

    aput v11, v9, v10

    .line 3803
    iget-object v9, p0, Lcom/saterskog/cell_lab/CellWorld;->am:[F

    mul-int/lit8 v10, v1, 0x2

    add-int/lit8 v10, v10, 0x8

    iget-object v11, v6, Lcom/saterskog/cell_lab/e;->e:[F

    const/4 v12, 0x0

    aget v11, v11, v12

    aput v11, v9, v10

    .line 3804
    iget-object v9, p0, Lcom/saterskog/cell_lab/CellWorld;->am:[F

    mul-int/lit8 v10, v1, 0x2

    add-int/lit8 v10, v10, 0x9

    iget-object v11, v6, Lcom/saterskog/cell_lab/e;->e:[F

    const/4 v12, 0x1

    aget v11, v11, v12

    aput v11, v9, v10

    .line 3805
    iget-object v9, p0, Lcom/saterskog/cell_lab/CellWorld;->am:[F

    mul-int/lit8 v10, v1, 0x2

    add-int/lit8 v10, v10, 0xa

    iget-object v11, v6, Lcom/saterskog/cell_lab/e;->e:[F

    const/4 v12, 0x2

    aget v11, v11, v12

    aput v11, v9, v10

    .line 3806
    iget-object v9, p0, Lcom/saterskog/cell_lab/CellWorld;->am:[F

    mul-int/lit8 v10, v1, 0x2

    add-int/lit8 v10, v10, 0xb

    iget-wide v12, v6, Lcom/saterskog/cell_lab/e;->c:D

    double-to-float v11, v12

    aput v11, v9, v10

    .line 3807
    add-int/lit8 v1, v1, 0x6

    .line 3809
    iget-object v9, p0, Lcom/saterskog/cell_lab/CellWorld;->ak:[F

    mul-int/lit8 v10, v1, 0x2

    neg-float v11, v7

    aput v11, v9, v10

    .line 3810
    iget-object v9, p0, Lcom/saterskog/cell_lab/CellWorld;->ak:[F

    mul-int/lit8 v10, v1, 0x2

    add-int/lit8 v10, v10, 0x1

    neg-float v11, v7

    aput v11, v9, v10

    .line 3811
    iget-object v9, p0, Lcom/saterskog/cell_lab/CellWorld;->ak:[F

    mul-int/lit8 v10, v1, 0x2

    add-int/lit8 v10, v10, 0x2

    aput v8, v9, v10

    .line 3812
    iget-object v9, p0, Lcom/saterskog/cell_lab/CellWorld;->ak:[F

    mul-int/lit8 v10, v1, 0x2

    add-int/lit8 v10, v10, 0x3

    const/4 v11, 0x0

    aput v11, v9, v10

    .line 3813
    iget-object v9, p0, Lcom/saterskog/cell_lab/CellWorld;->ak:[F

    mul-int/lit8 v10, v1, 0x2

    add-int/lit8 v10, v10, 0x4

    neg-float v11, v7

    aput v11, v9, v10

    .line 3814
    iget-object v9, p0, Lcom/saterskog/cell_lab/CellWorld;->ak:[F

    mul-int/lit8 v10, v1, 0x2

    add-int/lit8 v10, v10, 0x5

    aput v7, v9, v10

    .line 3815
    iget-object v9, p0, Lcom/saterskog/cell_lab/CellWorld;->ak:[F

    mul-int/lit8 v10, v1, 0x2

    add-int/lit8 v10, v10, 0x6

    aput v8, v9, v10

    .line 3816
    iget-object v9, p0, Lcom/saterskog/cell_lab/CellWorld;->ak:[F

    mul-int/lit8 v10, v1, 0x2

    add-int/lit8 v10, v10, 0x7

    const/4 v11, 0x0

    aput v11, v9, v10

    .line 3817
    iget-object v9, p0, Lcom/saterskog/cell_lab/CellWorld;->ak:[F

    mul-int/lit8 v10, v1, 0x2

    add-int/lit8 v10, v10, 0x8

    aput v7, v9, v10

    .line 3818
    iget-object v9, p0, Lcom/saterskog/cell_lab/CellWorld;->ak:[F

    mul-int/lit8 v10, v1, 0x2

    add-int/lit8 v10, v10, 0x9

    aput v7, v9, v10

    .line 3819
    iget-object v7, p0, Lcom/saterskog/cell_lab/CellWorld;->ak:[F

    mul-int/lit8 v9, v1, 0x2

    add-int/lit8 v9, v9, 0xa

    aput v8, v7, v9

    .line 3820
    iget-object v7, p0, Lcom/saterskog/cell_lab/CellWorld;->ak:[F

    mul-int/lit8 v8, v1, 0x2

    add-int/lit8 v8, v8, 0xb

    const/4 v9, 0x0

    aput v9, v7, v8

    .line 3822
    iget-object v7, p0, Lcom/saterskog/cell_lab/CellWorld;->al:[F

    iget-wide v8, v6, Lcom/saterskog/cell_lab/e;->a:D

    double-to-float v8, v8

    aput v8, v7, v1

    .line 3823
    iget-object v7, p0, Lcom/saterskog/cell_lab/CellWorld;->al:[F

    add-int/lit8 v8, v1, 0x1

    iget-wide v10, v6, Lcom/saterskog/cell_lab/e;->b:D

    double-to-float v9, v10

    aput v9, v7, v8

    .line 3824
    iget-object v7, p0, Lcom/saterskog/cell_lab/CellWorld;->al:[F

    add-int/lit8 v8, v1, 0x2

    iget-wide v10, v6, Lcom/saterskog/cell_lab/e;->a:D

    double-to-float v9, v10

    aput v9, v7, v8

    .line 3825
    iget-object v7, p0, Lcom/saterskog/cell_lab/CellWorld;->al:[F

    add-int/lit8 v8, v1, 0x3

    iget-wide v10, v6, Lcom/saterskog/cell_lab/e;->b:D

    double-to-float v9, v10

    aput v9, v7, v8

    .line 3826
    iget-object v7, p0, Lcom/saterskog/cell_lab/CellWorld;->al:[F

    add-int/lit8 v8, v1, 0x4

    iget-wide v10, v6, Lcom/saterskog/cell_lab/e;->a:D

    double-to-float v9, v10

    aput v9, v7, v8

    .line 3827
    iget-object v7, p0, Lcom/saterskog/cell_lab/CellWorld;->al:[F

    add-int/lit8 v8, v1, 0x5

    iget-wide v10, v6, Lcom/saterskog/cell_lab/e;->b:D

    double-to-float v9, v10

    aput v9, v7, v8

    .line 3829
    iget-object v7, p0, Lcom/saterskog/cell_lab/CellWorld;->am:[F

    mul-int/lit8 v8, v1, 0x2

    iget-object v9, v6, Lcom/saterskog/cell_lab/e;->e:[F

    const/4 v10, 0x0

    aget v9, v9, v10

    aput v9, v7, v8

    .line 3830
    iget-object v7, p0, Lcom/saterskog/cell_lab/CellWorld;->am:[F

    mul-int/lit8 v8, v1, 0x2

    add-int/lit8 v8, v8, 0x1

    iget-object v9, v6, Lcom/saterskog/cell_lab/e;->e:[F

    const/4 v10, 0x1

    aget v9, v9, v10

    aput v9, v7, v8

    .line 3831
    iget-object v7, p0, Lcom/saterskog/cell_lab/CellWorld;->am:[F

    mul-int/lit8 v8, v1, 0x2

    add-int/lit8 v8, v8, 0x2

    iget-object v9, v6, Lcom/saterskog/cell_lab/e;->e:[F

    const/4 v10, 0x2

    aget v9, v9, v10

    aput v9, v7, v8

    .line 3832
    iget-object v7, p0, Lcom/saterskog/cell_lab/CellWorld;->am:[F

    mul-int/lit8 v8, v1, 0x2

    add-int/lit8 v8, v8, 0x3

    iget-wide v10, v6, Lcom/saterskog/cell_lab/e;->c:D

    double-to-float v9, v10

    aput v9, v7, v8

    .line 3833
    iget-object v7, p0, Lcom/saterskog/cell_lab/CellWorld;->am:[F

    mul-int/lit8 v8, v1, 0x2

    add-int/lit8 v8, v8, 0x4

    iget-object v9, v6, Lcom/saterskog/cell_lab/e;->e:[F

    const/4 v10, 0x0

    aget v9, v9, v10

    aput v9, v7, v8

    .line 3834
    iget-object v7, p0, Lcom/saterskog/cell_lab/CellWorld;->am:[F

    mul-int/lit8 v8, v1, 0x2

    add-int/lit8 v8, v8, 0x5

    iget-object v9, v6, Lcom/saterskog/cell_lab/e;->e:[F

    const/4 v10, 0x1

    aget v9, v9, v10

    aput v9, v7, v8

    .line 3835
    iget-object v7, p0, Lcom/saterskog/cell_lab/CellWorld;->am:[F

    mul-int/lit8 v8, v1, 0x2

    add-int/lit8 v8, v8, 0x6

    iget-object v9, v6, Lcom/saterskog/cell_lab/e;->e:[F

    const/4 v10, 0x2

    aget v9, v9, v10

    aput v9, v7, v8

    .line 3836
    iget-object v7, p0, Lcom/saterskog/cell_lab/CellWorld;->am:[F

    mul-int/lit8 v8, v1, 0x2

    add-int/lit8 v8, v8, 0x7

    iget-wide v10, v6, Lcom/saterskog/cell_lab/e;->c:D

    double-to-float v9, v10

    aput v9, v7, v8

    .line 3837
    iget-object v7, p0, Lcom/saterskog/cell_lab/CellWorld;->am:[F

    mul-int/lit8 v8, v1, 0x2

    add-int/lit8 v8, v8, 0x8

    iget-object v9, v6, Lcom/saterskog/cell_lab/e;->e:[F

    const/4 v10, 0x0

    aget v9, v9, v10

    aput v9, v7, v8

    .line 3838
    iget-object v7, p0, Lcom/saterskog/cell_lab/CellWorld;->am:[F

    mul-int/lit8 v8, v1, 0x2

    add-int/lit8 v8, v8, 0x9

    iget-object v9, v6, Lcom/saterskog/cell_lab/e;->e:[F

    const/4 v10, 0x1

    aget v9, v9, v10

    aput v9, v7, v8

    .line 3839
    iget-object v7, p0, Lcom/saterskog/cell_lab/CellWorld;->am:[F

    mul-int/lit8 v8, v1, 0x2

    add-int/lit8 v8, v8, 0xa

    iget-object v9, v6, Lcom/saterskog/cell_lab/e;->e:[F

    const/4 v10, 0x2

    aget v9, v9, v10

    aput v9, v7, v8

    .line 3840
    iget-object v7, p0, Lcom/saterskog/cell_lab/CellWorld;->am:[F

    mul-int/lit8 v8, v1, 0x2

    add-int/lit8 v8, v8, 0xb

    iget-wide v10, v6, Lcom/saterskog/cell_lab/e;->c:D

    double-to-float v6, v10

    aput v6, v7, v8

    .line 3842
    add-int/lit8 v1, v1, 0x6

    .line 3769
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto/16 :goto_0

    .line 3844
    :cond_1
    div-int/lit8 v0, v1, 0x2

    iput v0, p0, Lcom/saterskog/cell_lab/CellWorld;->bf:I

    .line 3845
    iget v0, p0, Lcom/saterskog/cell_lab/CellWorld;->bf:I

    mul-int/lit8 v0, v0, 0x2

    iget-object v1, p0, Lcom/saterskog/cell_lab/CellWorld;->al:[F

    array-length v1, v1

    if-le v0, v1, :cond_2

    .line 3846
    const-string v0, "skit2centerCoordsdc"

    invoke-static {v0}, Lcom/saterskog/b/a;->a(Ljava/lang/String;)V

    .line 3847
    :cond_2
    iget v0, p0, Lcom/saterskog/cell_lab/CellWorld;->bf:I

    mul-int/lit8 v0, v0, 0x4

    iget-object v1, p0, Lcom/saterskog/cell_lab/CellWorld;->ak:[F

    array-length v1, v1

    if-le v0, v1, :cond_3

    .line 3848
    const-string v0, "skit2triCoordsdc"

    invoke-static {v0}, Lcom/saterskog/b/a;->a(Ljava/lang/String;)V

    .line 3849
    :cond_3
    iget v0, p0, Lcom/saterskog/cell_lab/CellWorld;->bf:I

    mul-int/lit8 v0, v0, 0x4

    iget-object v1, p0, Lcom/saterskog/cell_lab/CellWorld;->am:[F

    array-length v1, v1

    if-le v0, v1, :cond_4

    .line 3850
    const-string v0, "skit2colordc"

    invoke-static {v0}, Lcom/saterskog/b/a;->a(Ljava/lang/String;)V

    .line 3851
    :cond_4
    return-void
.end method

.method private c(ZD)V
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 2013
    iput-wide p2, p0, Lcom/saterskog/cell_lab/CellWorld;->T:D

    .line 2014
    iput-boolean p1, p0, Lcom/saterskog/cell_lab/CellWorld;->U:Z

    .line 2015
    iput v0, p0, Lcom/saterskog/cell_lab/CellWorld;->aX:I

    .line 2018
    :goto_0
    iget v1, p0, Lcom/saterskog/cell_lab/CellWorld;->z:I

    if-ge v0, v1, :cond_0

    .line 2019
    invoke-direct {p0, v0}, Lcom/saterskog/cell_lab/CellWorld;->d(I)V

    .line 2018
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 2064
    :cond_0
    return-void
.end method

.method private d(DD)D
    .locals 13

    .prologue
    .line 4425
    iget-wide v0, p0, Lcom/saterskog/cell_lab/CellWorld;->P:D

    mul-double/2addr v0, p1

    iget-wide v2, p0, Lcom/saterskog/cell_lab/CellWorld;->Q:D

    mul-double v2, v2, p3

    add-double/2addr v0, v2

    iget-object v2, p0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v2, v2, Lcom/saterskog/cell_lab/Environment;->k:D

    div-double/2addr v0, v2

    .line 4426
    mul-double v2, p1, p1

    mul-double v4, p3, p3

    add-double/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v2

    .line 4427
    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    const-wide/high16 v6, 0x3ff0000000000000L    # 1.0

    iget-object v8, p0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v8, v8, Lcom/saterskog/cell_lab/Environment;->f:D

    sub-double/2addr v6, v8

    const-wide/high16 v8, 0x3ff0000000000000L    # 1.0

    iget-object v10, p0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v10, v10, Lcom/saterskog/cell_lab/Environment;->k:D

    div-double v10, v2, v10

    sub-double/2addr v8, v10

    mul-double/2addr v6, v8

    iget-object v8, p0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v8, v8, Lcom/saterskog/cell_lab/Environment;->f:D

    div-double/2addr v6, v8

    add-double/2addr v4, v6

    .line 4429
    iget-object v6, p0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v6, v6, Lcom/saterskog/cell_lab/Environment;->d:D

    const-wide/high16 v8, 0x3ff0000000000000L    # 1.0

    iget-object v10, p0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v10, v10, Lcom/saterskog/cell_lab/Environment;->f:D

    sub-double/2addr v8, v10

    mul-double/2addr v0, v8

    iget-object v8, p0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v8, v8, Lcom/saterskog/cell_lab/Environment;->f:D

    add-double/2addr v0, v8

    mul-double/2addr v0, v6

    mul-double/2addr v4, v4

    div-double/2addr v0, v4

    const-wide/16 v4, 0x0

    cmpg-double v0, v0, v4

    if-gez v0, :cond_0

    .line 4430
    const-wide/16 v0, 0x0

    .line 4431
    :goto_0
    return-wide v0

    :cond_0
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Environment;->d:D

    const-wide/high16 v4, -0x4010000000000000L    # -1.0

    iget-object v6, p0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v6, v6, Lcom/saterskog/cell_lab/Environment;->f:D

    add-double/2addr v4, v6

    mul-double/2addr v0, v4

    iget-object v4, p0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v4, v4, Lcom/saterskog/cell_lab/Environment;->f:D

    mul-double/2addr v0, v4

    iget-object v4, p0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v4, v4, Lcom/saterskog/cell_lab/Environment;->f:D

    mul-double/2addr v0, v4

    iget-object v4, p0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v4, v4, Lcom/saterskog/cell_lab/Environment;->k:D

    mul-double/2addr v0, v4

    iget-wide v4, p0, Lcom/saterskog/cell_lab/CellWorld;->P:D

    iget-wide v6, p0, Lcom/saterskog/cell_lab/CellWorld;->P:D

    iget-object v8, p0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v8, v8, Lcom/saterskog/cell_lab/Environment;->f:D

    mul-double/2addr v6, v8

    sub-double/2addr v4, v6

    mul-double/2addr v4, v2

    mul-double/2addr v4, v2

    iget-wide v6, p0, Lcom/saterskog/cell_lab/CellWorld;->P:D

    mul-double/2addr v6, v2

    iget-object v8, p0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v8, v8, Lcom/saterskog/cell_lab/Environment;->k:D

    mul-double/2addr v6, v8

    add-double/2addr v4, v6

    const-wide/high16 v6, 0x4000000000000000L    # 2.0

    iget-object v8, p0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v8, v8, Lcom/saterskog/cell_lab/Environment;->f:D

    mul-double/2addr v6, v8

    iget-object v8, p0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v8, v8, Lcom/saterskog/cell_lab/Environment;->k:D

    mul-double/2addr v6, v8

    mul-double/2addr v6, p1

    add-double/2addr v4, v6

    const-wide/high16 v6, 0x4000000000000000L    # 2.0

    const-wide/high16 v8, -0x4010000000000000L    # -1.0

    iget-object v10, p0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v10, v10, Lcom/saterskog/cell_lab/Environment;->f:D

    add-double/2addr v8, v10

    mul-double/2addr v6, v8

    iget-wide v8, p0, Lcom/saterskog/cell_lab/CellWorld;->Q:D

    mul-double/2addr v6, v8

    mul-double/2addr v6, p1

    mul-double v6, v6, p3

    sub-double/2addr v4, v6

    const-wide/high16 v6, 0x4000000000000000L    # 2.0

    iget-wide v8, p0, Lcom/saterskog/cell_lab/CellWorld;->P:D

    mul-double/2addr v6, v8

    const-wide/high16 v8, -0x4010000000000000L    # -1.0

    iget-object v10, p0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v10, v10, Lcom/saterskog/cell_lab/Environment;->f:D

    add-double/2addr v8, v10

    mul-double/2addr v6, v8

    mul-double v6, v6, p3

    mul-double v6, v6, p3

    add-double/2addr v4, v6

    mul-double/2addr v0, v4

    const-wide/high16 v4, -0x4010000000000000L    # -1.0

    iget-object v6, p0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v6, v6, Lcom/saterskog/cell_lab/Environment;->f:D

    add-double/2addr v4, v6

    mul-double/2addr v4, v2

    iget-object v6, p0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v6, v6, Lcom/saterskog/cell_lab/Environment;->k:D

    add-double/2addr v4, v6

    const-wide/high16 v6, 0x4008000000000000L    # 3.0

    .line 4436
    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v4

    mul-double/2addr v2, v4

    div-double/2addr v0, v2

    neg-double v0, v0

    .line 4431
    goto :goto_0
.end method

.method private d(D)V
    .locals 27

    .prologue
    .line 2166
    const/4 v2, 0x0

    :goto_0
    move-object/from16 v0, p0

    iget v3, v0, Lcom/saterskog/cell_lab/CellWorld;->B:I

    if-ge v2, v3, :cond_11

    .line 2167
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/saterskog/cell_lab/CellWorld;->A:[Lcom/saterskog/cell_lab/Food;

    aget-object v10, v3, v2

    .line 2168
    iget v6, v10, Lcom/saterskog/cell_lab/Food;->d:F

    .line 2169
    iget v5, v10, Lcom/saterskog/cell_lab/Food;->e:F

    .line 2170
    iget v3, v10, Lcom/saterskog/cell_lab/Food;->c:F

    float-to-double v8, v3

    const-wide v12, 0x3f789374bc6a7efaL    # 0.006

    mul-double v12, v12, p1

    sub-double/2addr v8, v12

    double-to-float v3, v8

    iput v3, v10, Lcom/saterskog/cell_lab/Food;->c:F

    .line 2171
    iget v3, v10, Lcom/saterskog/cell_lab/Food;->c:F

    const/4 v4, 0x0

    cmpg-float v3, v3, v4

    if-gez v3, :cond_1

    .line 2172
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/saterskog/cell_lab/CellWorld;->A:[Lcom/saterskog/cell_lab/Food;

    move-object/from16 v0, p0

    iget v4, v0, Lcom/saterskog/cell_lab/CellWorld;->B:I

    add-int/lit8 v4, v4, -0x1

    aget-object v3, v3, v4

    invoke-virtual {v10, v3}, Lcom/saterskog/cell_lab/Food;->a(Lcom/saterskog/cell_lab/Food;)V

    .line 2173
    move-object/from16 v0, p0

    iget v3, v0, Lcom/saterskog/cell_lab/CellWorld;->B:I

    add-int/lit8 v3, v3, -0x1

    move-object/from16 v0, p0

    iput v3, v0, Lcom/saterskog/cell_lab/CellWorld;->B:I

    .line 2174
    add-int/lit8 v6, v2, -0x1

    .line 2166
    :cond_0
    :goto_1
    add-int/lit8 v2, v6, 0x1

    goto :goto_0

    .line 2178
    :cond_1
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v8, v3, Lcom/saterskog/cell_lab/Environment;->k:D

    iget v3, v10, Lcom/saterskog/cell_lab/Food;->a:F

    float-to-double v12, v3

    add-double/2addr v8, v12

    const-wide/high16 v12, 0x4000000000000000L    # 2.0

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v14, v3, Lcom/saterskog/cell_lab/Environment;->k:D

    mul-double/2addr v12, v14

    div-double/2addr v8, v12

    move-object/from16 v0, p0

    iget v3, v0, Lcom/saterskog/cell_lab/CellWorld;->bd:I

    int-to-double v12, v3

    mul-double/2addr v8, v12

    const-wide/high16 v12, 0x3ff0000000000000L    # 1.0

    add-double/2addr v8, v12

    double-to-int v3, v8

    .line 2179
    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v8, v4, Lcom/saterskog/cell_lab/Environment;->k:D

    iget v4, v10, Lcom/saterskog/cell_lab/Food;->b:F

    float-to-double v12, v4

    add-double/2addr v8, v12

    const-wide/high16 v12, 0x4000000000000000L    # 2.0

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v14, v4, Lcom/saterskog/cell_lab/Environment;->k:D

    mul-double/2addr v12, v14

    div-double/2addr v8, v12

    move-object/from16 v0, p0

    iget v4, v0, Lcom/saterskog/cell_lab/CellWorld;->bd:I

    int-to-double v12, v4

    mul-double/2addr v8, v12

    const-wide/high16 v12, 0x3ff0000000000000L    # 1.0

    add-double/2addr v8, v12

    double-to-int v4, v8

    .line 2181
    move-object/from16 v0, p0

    iget v7, v0, Lcom/saterskog/cell_lab/CellWorld;->bd:I

    add-int/lit8 v7, v7, 0x2

    mul-int/2addr v4, v7

    add-int/2addr v3, v4

    .line 2182
    if-ltz v3, :cond_2

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/saterskog/cell_lab/CellWorld;->bc:[I

    array-length v4, v4

    if-ge v3, v4, :cond_2

    .line 2183
    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/saterskog/cell_lab/CellWorld;->bc:[I

    aget v4, v4, v3

    .line 2184
    const/16 v7, 0x194

    if-ge v4, v7, :cond_5

    .line 2185
    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/saterskog/cell_lab/CellWorld;->ba:[[I

    aget-object v7, v7, v3

    aput v2, v7, v4

    .line 2186
    iget v7, v10, Lcom/saterskog/cell_lab/Food;->f:F

    const/4 v8, 0x0

    cmpg-float v7, v7, v8

    if-gtz v7, :cond_4

    .line 2187
    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/saterskog/cell_lab/CellWorld;->bb:[[S

    aget-object v7, v7, v3

    const/4 v8, 0x1

    aput-short v8, v7, v4

    .line 2190
    :goto_2
    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/saterskog/cell_lab/CellWorld;->bc:[I

    aget v7, v4, v3

    add-int/lit8 v7, v7, 0x1

    aput v7, v4, v3

    .line 2194
    :cond_2
    :goto_3
    iget v3, v10, Lcom/saterskog/cell_lab/Food;->a:F

    float-to-double v8, v3

    iget v3, v10, Lcom/saterskog/cell_lab/Food;->b:F

    float-to-double v12, v3

    .line 27447
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v14, v3, Lcom/saterskog/cell_lab/Environment;->k:D

    add-double/2addr v8, v14

    const-wide/high16 v14, 0x4000000000000000L    # 2.0

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v0, v3, Lcom/saterskog/cell_lab/Environment;->k:D

    move-wide/from16 v16, v0

    mul-double v14, v14, v16

    div-double/2addr v8, v14

    move-object/from16 v0, p0

    iget v3, v0, Lcom/saterskog/cell_lab/CellWorld;->Z:I

    int-to-double v14, v3

    mul-double/2addr v8, v14

    double-to-int v3, v8

    .line 27448
    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v8, v4, Lcom/saterskog/cell_lab/Environment;->k:D

    add-double/2addr v8, v12

    const-wide/high16 v12, 0x4000000000000000L    # 2.0

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v14, v4, Lcom/saterskog/cell_lab/Environment;->k:D

    mul-double/2addr v12, v14

    div-double/2addr v8, v12

    move-object/from16 v0, p0

    iget v4, v0, Lcom/saterskog/cell_lab/CellWorld;->Z:I

    int-to-double v12, v4

    mul-double/2addr v8, v12

    double-to-int v4, v8

    .line 27450
    add-int/lit8 v3, v3, 0x1

    add-int/lit8 v4, v4, 0x1

    move-object/from16 v0, p0

    iget v7, v0, Lcom/saterskog/cell_lab/CellWorld;->Z:I

    add-int/lit8 v7, v7, 0x2

    mul-int/2addr v4, v7

    add-int v11, v3, v4

    .line 2195
    if-ltz v11, :cond_3

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/saterskog/cell_lab/CellWorld;->aW:[I

    array-length v3, v3

    if-lt v11, v3, :cond_6

    .line 2196
    :cond_3
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "x:"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v3, v10, Lcom/saterskog/cell_lab/Food;->a:F

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " y:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, v10, Lcom/saterskog/cell_lab/Food;->b:F

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " r:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v4, v3, Lcom/saterskog/cell_lab/Environment;->k:D

    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/saterskog/b/a;->b(Ljava/lang/String;)V

    .line 2197
    new-instance v2, Ljava/lang/RuntimeException;

    const-string v3, "sadfae"

    invoke-direct {v2, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 2189
    :cond_4
    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/saterskog/cell_lab/CellWorld;->bb:[[S

    aget-object v7, v7, v3

    const/4 v8, 0x2

    aput-short v8, v7, v4

    goto/16 :goto_2

    .line 2192
    :cond_5
    const-string v3, "smellGridnMAX exhausted, food"

    invoke-static {v3}, Lcom/saterskog/b/a;->a(Ljava/lang/String;)V

    goto/16 :goto_3

    .line 2199
    :cond_6
    const/4 v4, 0x0

    .line 2200
    const/4 v3, 0x0

    move/from16 v26, v3

    move v3, v4

    move v4, v5

    move v5, v6

    move v6, v2

    move/from16 v2, v26

    :goto_4
    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/saterskog/cell_lab/CellWorld;->aW:[I

    aget v7, v7, v11

    if-ge v2, v7, :cond_e

    .line 2201
    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/saterskog/cell_lab/CellWorld;->aV:[[I

    aget-object v8, v8, v11

    aget v8, v8, v2

    aget-object v12, v7, v8

    .line 2202
    iget-wide v8, v12, Lcom/saterskog/cell_lab/Cell;->b:D

    iget v7, v10, Lcom/saterskog/cell_lab/Food;->a:F

    float-to-double v14, v7

    sub-double/2addr v8, v14

    iget-wide v14, v12, Lcom/saterskog/cell_lab/Cell;->b:D

    iget v7, v10, Lcom/saterskog/cell_lab/Food;->a:F

    float-to-double v0, v7

    move-wide/from16 v16, v0

    sub-double v14, v14, v16

    mul-double/2addr v8, v14

    iget-wide v14, v12, Lcom/saterskog/cell_lab/Cell;->c:D

    iget v7, v10, Lcom/saterskog/cell_lab/Food;->b:F

    float-to-double v0, v7

    move-wide/from16 v16, v0

    sub-double v14, v14, v16

    iget-wide v0, v12, Lcom/saterskog/cell_lab/Cell;->c:D

    move-wide/from16 v16, v0

    iget v7, v10, Lcom/saterskog/cell_lab/Food;->b:F

    float-to-double v0, v7

    move-wide/from16 v18, v0

    sub-double v16, v16, v18

    mul-double v14, v14, v16

    add-double/2addr v14, v8

    .line 2203
    iget-wide v8, v12, Lcom/saterskog/cell_lab/Cell;->d:D

    const-wide v16, 0x3f7cac0840000000L    # 0.007000000216066837

    add-double v8, v8, v16

    iget-wide v0, v12, Lcom/saterskog/cell_lab/Cell;->d:D

    move-wide/from16 v16, v0

    const-wide v18, 0x3f7cac0840000000L    # 0.007000000216066837

    add-double v16, v16, v18

    mul-double v8, v8, v16

    cmpg-double v7, v14, v8

    if-gez v7, :cond_a

    .line 2204
    iget-object v7, v12, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    iget v8, v12, Lcom/saterskog/cell_lab/Cell;->D:I

    aget-object v7, v7, v8

    iget-object v13, v7, Lcom/saterskog/cell_lab/Gene;->s:Lcom/saterskog/cell_lab/h;

    .line 2205
    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-boolean v7, v7, Lcom/saterskog/cell_lab/Environment;->y:Z

    if-eqz v7, :cond_8

    .line 2206
    sget-object v7, Lcom/saterskog/cell_lab/h;->r:Lcom/saterskog/cell_lab/h;

    if-ne v13, v7, :cond_7

    .line 2207
    invoke-static {v14, v15}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v8

    .line 2208
    iget v7, v10, Lcom/saterskog/cell_lab/Food;->a:F

    float-to-double v0, v7

    move-wide/from16 v16, v0

    iget-wide v0, v12, Lcom/saterskog/cell_lab/Cell;->b:D

    move-wide/from16 v18, v0

    sub-double v16, v16, v18

    div-double v16, v16, v8

    .line 2209
    iget v7, v10, Lcom/saterskog/cell_lab/Food;->b:F

    float-to-double v0, v7

    move-wide/from16 v18, v0

    iget-wide v0, v12, Lcom/saterskog/cell_lab/Cell;->c:D

    move-wide/from16 v20, v0

    sub-double v18, v18, v20

    div-double v18, v18, v8

    .line 2210
    iget-wide v8, v12, Lcom/saterskog/cell_lab/Cell;->k:D

    invoke-static {v8, v9}, Ljava/lang/Math;->cos(D)D

    move-result-wide v8

    .line 2211
    iget-wide v0, v12, Lcom/saterskog/cell_lab/Cell;->k:D

    move-wide/from16 v20, v0

    invoke-static/range {v20 .. v21}, Ljava/lang/Math;->sin(D)D

    move-result-wide v20

    .line 2212
    mul-double v8, v8, v18

    mul-double v20, v20, v16

    sub-double v8, v8, v20

    .line 2215
    const-wide/16 v20, 0x0

    cmpg-double v7, v20, v8

    if-gez v7, :cond_b

    const/4 v7, 0x1

    :goto_5
    iget-boolean v0, v12, Lcom/saterskog/cell_lab/Cell;->y:Z

    move/from16 v20, v0

    move/from16 v0, v20

    if-eq v7, v0, :cond_c

    .line 2216
    const-wide v20, 0x3fb3333333333333L    # 0.075

    mul-double v8, v8, v20

    const/4 v7, 0x2

    const/16 v20, 0x0

    move/from16 v0, v20

    invoke-virtual {v12, v7, v0}, Lcom/saterskog/cell_lab/Cell;->a(II)F

    move-result v7

    float-to-double v0, v7

    move-wide/from16 v20, v0

    mul-double v8, v8, v20

    .line 2220
    :goto_6
    const-wide/high16 v20, 0x4044000000000000L    # 40.0

    iget v7, v10, Lcom/saterskog/cell_lab/Food;->d:F

    float-to-double v0, v7

    move-wide/from16 v22, v0

    iget-wide v0, v12, Lcom/saterskog/cell_lab/Cell;->e:D

    move-wide/from16 v24, v0

    sub-double v22, v22, v24

    mul-double v22, v22, v18

    sub-double v8, v8, v22

    iget v7, v10, Lcom/saterskog/cell_lab/Food;->e:F

    float-to-double v0, v7

    move-wide/from16 v22, v0

    iget-wide v0, v12, Lcom/saterskog/cell_lab/Cell;->f:D

    move-wide/from16 v24, v0

    sub-double v22, v22, v24

    mul-double v22, v22, v16

    add-double v8, v8, v22

    iget-wide v0, v12, Lcom/saterskog/cell_lab/Cell;->l:D

    move-wide/from16 v22, v0

    iget-wide v0, v12, Lcom/saterskog/cell_lab/Cell;->d:D

    move-wide/from16 v24, v0

    mul-double v22, v22, v24

    sub-double v8, v8, v22

    mul-double v8, v8, v20

    .line 2223
    float-to-double v0, v5

    move-wide/from16 v20, v0

    const-wide v22, -0x404147ae147ae148L    # -0.12

    mul-double v22, v22, v16

    mul-double v24, v18, v8

    add-double v22, v22, v24

    mul-double v22, v22, p1

    add-double v20, v20, v22

    move-wide/from16 v0, v20

    double-to-float v5, v0

    .line 2224
    float-to-double v0, v4

    move-wide/from16 v20, v0

    const-wide v22, -0x404147ae147ae148L    # -0.12

    mul-double v18, v18, v22

    mul-double v8, v8, v16

    sub-double v8, v18, v8

    mul-double v8, v8, p1

    add-double v8, v8, v20

    double-to-float v4, v8

    .line 2226
    :cond_7
    iget-wide v8, v12, Lcom/saterskog/cell_lab/Cell;->d:D

    iget-wide v0, v12, Lcom/saterskog/cell_lab/Cell;->d:D

    move-wide/from16 v16, v0

    mul-double v8, v8, v16

    cmpg-double v7, v14, v8

    if-gez v7, :cond_8

    .line 2228
    invoke-static {v14, v15}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v8

    .line 2231
    const-wide v14, 0x407f400000000000L    # 500.0

    iget-wide v0, v12, Lcom/saterskog/cell_lab/Cell;->d:D

    move-wide/from16 v16, v0

    sub-double v16, v16, v8

    mul-double v14, v14, v16

    const-wide/high16 v16, 0x4008000000000000L    # 3.0

    mul-double v14, v14, v16

    .line 2232
    div-double v8, v14, v8

    .line 2233
    iget v7, v10, Lcom/saterskog/cell_lab/Food;->a:F

    float-to-double v14, v7

    iget-wide v0, v12, Lcom/saterskog/cell_lab/Cell;->b:D

    move-wide/from16 v16, v0

    sub-double v14, v14, v16

    mul-double/2addr v14, v8

    .line 2234
    iget v7, v10, Lcom/saterskog/cell_lab/Food;->b:F

    float-to-double v0, v7

    move-wide/from16 v16, v0

    iget-wide v0, v12, Lcom/saterskog/cell_lab/Cell;->c:D

    move-wide/from16 v18, v0

    sub-double v16, v16, v18

    mul-double v8, v8, v16

    .line 2238
    float-to-double v0, v5

    move-wide/from16 v16, v0

    mul-double v14, v14, p1

    add-double v14, v14, v16

    double-to-float v5, v14

    .line 2239
    float-to-double v14, v4

    mul-double v8, v8, p1

    add-double/2addr v8, v14

    double-to-float v4, v8

    .line 2242
    :cond_8
    sget-object v7, Lcom/saterskog/cell_lab/h;->o:Lcom/saterskog/cell_lab/h;

    if-ne v13, v7, :cond_9

    .line 2243
    const/4 v7, 0x4

    invoke-virtual {v12, v7}, Lcom/saterskog/cell_lab/Cell;->b(I)I

    move-result v7

    const/4 v8, 0x2

    if-ne v7, v8, :cond_9

    .line 2244
    iget v7, v10, Lcom/saterskog/cell_lab/Food;->f:F

    float-to-double v8, v7

    sub-double v8, v8, p1

    double-to-float v7, v8

    iput v7, v10, Lcom/saterskog/cell_lab/Food;->f:F

    .line 2246
    :cond_9
    iget v7, v10, Lcom/saterskog/cell_lab/Food;->f:F

    const/4 v8, 0x0

    cmpg-float v7, v7, v8

    if-gtz v7, :cond_a

    sget-object v7, Lcom/saterskog/cell_lab/h;->a:Lcom/saterskog/cell_lab/h;

    if-ne v13, v7, :cond_a

    .line 2247
    iget v7, v10, Lcom/saterskog/cell_lab/Food;->c:F

    float-to-double v8, v7

    const-wide v14, 0x3fd70a3d70a3d70aL    # 0.36

    iget-wide v0, v12, Lcom/saterskog/cell_lab/Cell;->w:D

    move-wide/from16 v16, v0

    sub-double v14, v14, v16

    invoke-static {v8, v9, v14, v15}, Ljava/lang/Math;->min(DD)D

    move-result-wide v8

    .line 2248
    const-wide/high16 v14, 0x3ff0000000000000L    # 1.0

    mul-double v14, v14, p1

    .line 2249
    cmpg-double v7, v14, v8

    if-gez v7, :cond_d

    .line 2251
    iget-wide v8, v12, Lcom/saterskog/cell_lab/Cell;->e:D

    iget-wide v0, v12, Lcom/saterskog/cell_lab/Cell;->w:D

    move-wide/from16 v16, v0

    mul-double v8, v8, v16

    iput-wide v8, v12, Lcom/saterskog/cell_lab/Cell;->e:D

    .line 2252
    iget-wide v8, v12, Lcom/saterskog/cell_lab/Cell;->f:D

    iget-wide v0, v12, Lcom/saterskog/cell_lab/Cell;->w:D

    move-wide/from16 v16, v0

    mul-double v8, v8, v16

    iput-wide v8, v12, Lcom/saterskog/cell_lab/Cell;->f:D

    .line 2253
    iget-wide v8, v12, Lcom/saterskog/cell_lab/Cell;->w:D

    add-double/2addr v8, v14

    iput-wide v8, v12, Lcom/saterskog/cell_lab/Cell;->w:D

    .line 2254
    iget-wide v8, v12, Lcom/saterskog/cell_lab/Cell;->e:D

    iget-wide v0, v12, Lcom/saterskog/cell_lab/Cell;->w:D

    move-wide/from16 v16, v0

    div-double v8, v8, v16

    iput-wide v8, v12, Lcom/saterskog/cell_lab/Cell;->e:D

    .line 2255
    iget-wide v8, v12, Lcom/saterskog/cell_lab/Cell;->f:D

    iget-wide v0, v12, Lcom/saterskog/cell_lab/Cell;->w:D

    move-wide/from16 v16, v0

    div-double v8, v8, v16

    iput-wide v8, v12, Lcom/saterskog/cell_lab/Cell;->f:D

    .line 2256
    iget v7, v10, Lcom/saterskog/cell_lab/Food;->c:F

    float-to-double v8, v7

    sub-double/2addr v8, v14

    double-to-float v7, v8

    iput v7, v10, Lcom/saterskog/cell_lab/Food;->c:F

    .line 2200
    :cond_a
    :goto_7
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_4

    .line 2215
    :cond_b
    const/4 v7, 0x0

    goto/16 :goto_5

    .line 2218
    :cond_c
    const-wide v20, 0x3fb3333333333333L    # 0.075

    mul-double v8, v8, v20

    const/4 v7, 0x4

    const/16 v20, 0x0

    move/from16 v0, v20

    invoke-virtual {v12, v7, v0}, Lcom/saterskog/cell_lab/Cell;->a(II)F

    move-result v7

    float-to-double v0, v7

    move-wide/from16 v20, v0

    mul-double v8, v8, v20

    goto/16 :goto_6

    .line 2259
    :cond_d
    iget-wide v14, v12, Lcom/saterskog/cell_lab/Cell;->e:D

    iget-wide v0, v12, Lcom/saterskog/cell_lab/Cell;->w:D

    move-wide/from16 v16, v0

    mul-double v14, v14, v16

    iput-wide v14, v12, Lcom/saterskog/cell_lab/Cell;->e:D

    .line 2260
    iget-wide v14, v12, Lcom/saterskog/cell_lab/Cell;->f:D

    iget-wide v0, v12, Lcom/saterskog/cell_lab/Cell;->w:D

    move-wide/from16 v16, v0

    mul-double v14, v14, v16

    iput-wide v14, v12, Lcom/saterskog/cell_lab/Cell;->f:D

    .line 2261
    iget-wide v14, v12, Lcom/saterskog/cell_lab/Cell;->w:D

    add-double/2addr v14, v8

    iput-wide v14, v12, Lcom/saterskog/cell_lab/Cell;->w:D

    .line 2262
    iget-wide v14, v12, Lcom/saterskog/cell_lab/Cell;->e:D

    iget-wide v0, v12, Lcom/saterskog/cell_lab/Cell;->w:D

    move-wide/from16 v16, v0

    div-double v14, v14, v16

    iput-wide v14, v12, Lcom/saterskog/cell_lab/Cell;->e:D

    .line 2263
    iget-wide v14, v12, Lcom/saterskog/cell_lab/Cell;->f:D

    iget-wide v0, v12, Lcom/saterskog/cell_lab/Cell;->w:D

    move-wide/from16 v16, v0

    div-double v14, v14, v16

    iput-wide v14, v12, Lcom/saterskog/cell_lab/Cell;->f:D

    .line 2264
    iget v7, v10, Lcom/saterskog/cell_lab/Food;->c:F

    float-to-double v12, v7

    sub-double v8, v12, v8

    double-to-float v7, v8

    iput v7, v10, Lcom/saterskog/cell_lab/Food;->c:F

    .line 2265
    iget v7, v10, Lcom/saterskog/cell_lab/Food;->c:F

    float-to-double v8, v7

    const-wide/16 v12, 0x0

    cmpg-double v7, v8, v12

    if-gtz v7, :cond_a

    .line 2266
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/CellWorld;->A:[Lcom/saterskog/cell_lab/Food;

    move-object/from16 v0, p0

    iget v3, v0, Lcom/saterskog/cell_lab/CellWorld;->B:I

    add-int/lit8 v3, v3, -0x1

    aget-object v2, v2, v3

    invoke-virtual {v10, v2}, Lcom/saterskog/cell_lab/Food;->a(Lcom/saterskog/cell_lab/Food;)V

    .line 2267
    move-object/from16 v0, p0

    iget v2, v0, Lcom/saterskog/cell_lab/CellWorld;->B:I

    add-int/lit8 v2, v2, -0x1

    move-object/from16 v0, p0

    iput v2, v0, Lcom/saterskog/cell_lab/CellWorld;->B:I

    .line 2268
    add-int/lit8 v6, v6, -0x1

    .line 2269
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/CellWorld;->aW:[I

    aget v2, v2, v11

    .line 2270
    const/4 v3, 0x1

    goto :goto_7

    .line 2277
    :cond_e
    if-nez v3, :cond_0

    .line 2280
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-boolean v2, v2, Lcom/saterskog/cell_lab/Environment;->y:Z

    if-eqz v2, :cond_0

    .line 2281
    float-to-double v2, v5

    const-wide v8, 0x3fc999999999999aL    # 0.2

    iget v5, v10, Lcom/saterskog/cell_lab/Food;->d:F

    float-to-double v12, v5

    mul-double/2addr v8, v12

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v12, v5, Lcom/saterskog/cell_lab/Environment;->g:D

    mul-double/2addr v8, v12

    mul-double v8, v8, p1

    sub-double/2addr v2, v8

    double-to-float v3, v2

    .line 2282
    float-to-double v4, v4

    const-wide v8, 0x3fc999999999999aL    # 0.2

    iget v2, v10, Lcom/saterskog/cell_lab/Food;->e:F

    float-to-double v12, v2

    mul-double/2addr v8, v12

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v12, v2, Lcom/saterskog/cell_lab/Environment;->g:D

    mul-double/2addr v8, v12

    mul-double v8, v8, p1

    sub-double/2addr v4, v8

    double-to-float v2, v4

    .line 2283
    iget v4, v10, Lcom/saterskog/cell_lab/Food;->a:F

    float-to-double v4, v4

    float-to-double v8, v3

    mul-double v8, v8, p1

    add-double/2addr v4, v8

    double-to-float v4, v4

    iput v4, v10, Lcom/saterskog/cell_lab/Food;->a:F

    .line 2284
    iget v4, v10, Lcom/saterskog/cell_lab/Food;->b:F

    float-to-double v4, v4

    float-to-double v8, v2

    mul-double v8, v8, p1

    add-double/2addr v4, v8

    double-to-float v4, v4

    iput v4, v10, Lcom/saterskog/cell_lab/Food;->b:F

    .line 2285
    iget v4, v10, Lcom/saterskog/cell_lab/Food;->a:F

    iget v5, v10, Lcom/saterskog/cell_lab/Food;->a:F

    mul-float/2addr v4, v5

    iget v5, v10, Lcom/saterskog/cell_lab/Food;->b:F

    iget v7, v10, Lcom/saterskog/cell_lab/Food;->b:F

    mul-float/2addr v5, v7

    add-float/2addr v4, v5

    float-to-double v4, v4

    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v8, v7, Lcom/saterskog/cell_lab/Environment;->k:D

    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v12, v7, Lcom/saterskog/cell_lab/Environment;->k:D

    mul-double/2addr v8, v12

    cmpl-double v4, v4, v8

    if-ltz v4, :cond_10

    .line 2287
    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-boolean v4, v4, Lcom/saterskog/cell_lab/Environment;->x:Z

    if-eqz v4, :cond_f

    .line 2288
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/CellWorld;->A:[Lcom/saterskog/cell_lab/Food;

    move-object/from16 v0, p0

    iget v3, v0, Lcom/saterskog/cell_lab/CellWorld;->B:I

    add-int/lit8 v3, v3, -0x1

    aget-object v2, v2, v3

    invoke-virtual {v10, v2}, Lcom/saterskog/cell_lab/Food;->a(Lcom/saterskog/cell_lab/Food;)V

    .line 2289
    move-object/from16 v0, p0

    iget v2, v0, Lcom/saterskog/cell_lab/CellWorld;->B:I

    add-int/lit8 v2, v2, -0x1

    move-object/from16 v0, p0

    iput v2, v0, Lcom/saterskog/cell_lab/CellWorld;->B:I

    .line 2290
    add-int/lit8 v6, v6, -0x1

    .line 2291
    goto/16 :goto_1

    .line 2295
    :cond_f
    iget v4, v10, Lcom/saterskog/cell_lab/Food;->a:F

    iget v5, v10, Lcom/saterskog/cell_lab/Food;->a:F

    mul-float/2addr v4, v5

    iget v5, v10, Lcom/saterskog/cell_lab/Food;->b:F

    iget v7, v10, Lcom/saterskog/cell_lab/Food;->b:F

    mul-float/2addr v5, v7

    add-float/2addr v4, v5

    float-to-double v4, v4

    invoke-static {v4, v5}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v4

    double-to-float v4, v4

    .line 2296
    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v8, v5, Lcom/saterskog/cell_lab/Environment;->k:D

    double-to-float v5, v8

    iget v7, v10, Lcom/saterskog/cell_lab/Food;->a:F

    mul-float/2addr v5, v7

    div-float/2addr v5, v4

    iput v5, v10, Lcom/saterskog/cell_lab/Food;->a:F

    .line 2297
    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v8, v5, Lcom/saterskog/cell_lab/Environment;->k:D

    double-to-float v5, v8

    iget v7, v10, Lcom/saterskog/cell_lab/Food;->b:F

    mul-float/2addr v5, v7

    div-float/2addr v5, v4

    iput v5, v10, Lcom/saterskog/cell_lab/Food;->b:F

    .line 2298
    const/high16 v5, 0x40000000    # 2.0f

    iget v7, v10, Lcom/saterskog/cell_lab/Food;->a:F

    mul-float/2addr v7, v3

    iget v8, v10, Lcom/saterskog/cell_lab/Food;->b:F

    mul-float/2addr v8, v2

    add-float/2addr v7, v8

    mul-float/2addr v5, v7

    mul-float/2addr v4, v4

    div-float v4, v5, v4

    .line 2299
    iget v5, v10, Lcom/saterskog/cell_lab/Food;->a:F

    mul-float/2addr v5, v4

    sub-float/2addr v3, v5

    .line 2300
    iget v5, v10, Lcom/saterskog/cell_lab/Food;->b:F

    mul-float/2addr v4, v5

    sub-float/2addr v2, v4

    .line 2303
    :cond_10
    iput v3, v10, Lcom/saterskog/cell_lab/Food;->d:F

    .line 2304
    iput v2, v10, Lcom/saterskog/cell_lab/Food;->e:F

    goto/16 :goto_1

    .line 2309
    :cond_11
    return-void
.end method

.method private d(I)V
    .locals 46

    .prologue
    .line 1241
    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    aget-object v20, v4, p1

    .line 1242
    move-object/from16 v0, v20

    iget-object v4, v0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    move-object/from16 v0, v20

    iget v5, v0, Lcom/saterskog/cell_lab/Cell;->D:I

    aget-object v4, v4, v5

    iget-object v0, v4, Lcom/saterskog/cell_lab/Gene;->s:Lcom/saterskog/cell_lab/h;

    move-object/from16 v21, v0

    .line 1243
    sget-object v4, Lcom/saterskog/cell_lab/h;->k:Lcom/saterskog/cell_lab/h;

    move-object/from16 v0, v21

    if-eq v0, v4, :cond_0

    sget-object v4, Lcom/saterskog/cell_lab/h;->l:Lcom/saterskog/cell_lab/h;

    move-object/from16 v0, v21

    if-ne v0, v4, :cond_15

    .line 1244
    :cond_0
    const-wide/16 v6, 0x0

    .line 1245
    const-wide/16 v4, 0x0

    .line 1246
    sget-object v8, Lcom/saterskog/cell_lab/h;->k:Lcom/saterskog/cell_lab/h;

    move-object/from16 v0, v21

    if-ne v0, v8, :cond_1

    .line 1248
    move-object/from16 v0, v20

    iget-wide v4, v0, Lcom/saterskog/cell_lab/Cell;->k:D

    invoke-static {v4, v5}, Ljava/lang/Math;->cos(D)D

    move-result-wide v6

    .line 1249
    move-object/from16 v0, v20

    iget-wide v4, v0, Lcom/saterskog/cell_lab/Cell;->k:D

    invoke-static {v4, v5}, Ljava/lang/Math;->sin(D)D

    move-result-wide v4

    .line 1251
    :cond_1
    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v8, v8, Lcom/saterskog/cell_lab/Environment;->k:D

    move-object/from16 v0, v20

    iget-wide v10, v0, Lcom/saterskog/cell_lab/Cell;->b:D

    add-double/2addr v8, v10

    const-wide/high16 v10, 0x4000000000000000L    # 2.0

    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v12, v12, Lcom/saterskog/cell_lab/Environment;->k:D

    mul-double/2addr v10, v12

    div-double/2addr v8, v10

    move-object/from16 v0, p0

    iget v10, v0, Lcom/saterskog/cell_lab/CellWorld;->bd:I

    int-to-double v10, v10

    mul-double/2addr v8, v10

    const-wide/high16 v10, 0x3ff0000000000000L    # 1.0

    add-double/2addr v8, v10

    double-to-int v0, v8

    move/from16 v22, v0

    .line 1252
    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v8, v8, Lcom/saterskog/cell_lab/Environment;->k:D

    move-object/from16 v0, v20

    iget-wide v10, v0, Lcom/saterskog/cell_lab/Cell;->c:D

    add-double/2addr v8, v10

    const-wide/high16 v10, 0x4000000000000000L    # 2.0

    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v12, v12, Lcom/saterskog/cell_lab/Environment;->k:D

    mul-double/2addr v10, v12

    div-double/2addr v8, v10

    move-object/from16 v0, p0

    iget v10, v0, Lcom/saterskog/cell_lab/CellWorld;->bd:I

    int-to-double v10, v10

    mul-double/2addr v8, v10

    const-wide/high16 v10, 0x3ff0000000000000L    # 1.0

    add-double/2addr v8, v10

    double-to-int v0, v8

    move/from16 v23, v0

    .line 1253
    const/4 v8, 0x0

    .line 1254
    move-object/from16 v0, v20

    iget-object v9, v0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    move-object/from16 v0, v20

    iget v10, v0, Lcom/saterskog/cell_lab/Cell;->D:I

    aget-object v9, v9, v10

    iget-object v9, v9, Lcom/saterskog/cell_lab/Gene;->u:[I

    const/4 v10, 0x3

    aget v9, v9, v10

    const/4 v10, 0x3

    if-ne v9, v10, :cond_2

    .line 1256
    sget-object v8, Lcom/saterskog/cell_lab/h;->l:Lcom/saterskog/cell_lab/h;

    move-object/from16 v0, v21

    if-ne v0, v8, :cond_7

    .line 1257
    const-wide/16 v8, 0x0

    move-object/from16 v0, v20

    iget-wide v10, v0, Lcom/saterskog/cell_lab/Cell;->b:D

    move-object/from16 v0, v20

    iget-wide v12, v0, Lcom/saterskog/cell_lab/Cell;->c:D

    move-object/from16 v0, p0

    invoke-direct {v0, v10, v11, v12, v13}, Lcom/saterskog/cell_lab/CellWorld;->c(DD)D

    move-result-wide v10

    const-wide v12, 0x3fc999999999999aL    # 0.2

    mul-double/2addr v10, v12

    add-double/2addr v8, v10

    double-to-float v8, v8

    .line 1261
    :cond_2
    :goto_0
    move-object/from16 v0, v20

    iget-object v9, v0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    move-object/from16 v0, v20

    iget v10, v0, Lcom/saterskog/cell_lab/Cell;->D:I

    aget-object v9, v9, v10

    iget-object v9, v9, Lcom/saterskog/cell_lab/Gene;->u:[I

    const/4 v10, 0x3

    aget v9, v9, v10

    const/4 v10, 0x4

    if-ne v9, v10, :cond_3

    .line 1263
    sget-object v9, Lcom/saterskog/cell_lab/h;->l:Lcom/saterskog/cell_lab/h;

    move-object/from16 v0, v21

    if-ne v0, v9, :cond_8

    .line 1264
    float-to-double v8, v8

    move-object/from16 v0, v20

    iget-wide v10, v0, Lcom/saterskog/cell_lab/Cell;->e:D

    move-object/from16 v0, v20

    iget-wide v12, v0, Lcom/saterskog/cell_lab/Cell;->e:D

    mul-double/2addr v10, v12

    move-object/from16 v0, v20

    iget-wide v12, v0, Lcom/saterskog/cell_lab/Cell;->f:D

    move-object/from16 v0, v20

    iget-wide v14, v0, Lcom/saterskog/cell_lab/Cell;->f:D

    mul-double/2addr v12, v14

    add-double/2addr v10, v12

    invoke-static {v10, v11}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v10

    const-wide/high16 v12, 0x4008000000000000L    # 3.0

    mul-double/2addr v10, v12

    add-double/2addr v8, v10

    double-to-float v8, v8

    .line 1268
    :cond_3
    :goto_1
    move-object/from16 v0, v20

    iget-object v9, v0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    move-object/from16 v0, v20

    iget v10, v0, Lcom/saterskog/cell_lab/Cell;->D:I

    aget-object v9, v9, v10

    iget-object v9, v9, Lcom/saterskog/cell_lab/Gene;->u:[I

    const/4 v10, 0x3

    aget v9, v9, v10

    const/4 v10, 0x5

    if-ne v9, v10, :cond_4

    .line 1271
    move-object/from16 v0, v20

    iget-wide v10, v0, Lcom/saterskog/cell_lab/Cell;->b:D

    move-object/from16 v0, v20

    iget-wide v12, v0, Lcom/saterskog/cell_lab/Cell;->b:D

    mul-double/2addr v10, v12

    move-object/from16 v0, v20

    iget-wide v12, v0, Lcom/saterskog/cell_lab/Cell;->c:D

    move-object/from16 v0, v20

    iget-wide v14, v0, Lcom/saterskog/cell_lab/Cell;->c:D

    mul-double/2addr v12, v14

    add-double/2addr v10, v12

    invoke-static {v10, v11}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v10

    .line 1272
    const-wide/high16 v12, 0x3ff0000000000000L    # 1.0

    const-wide/high16 v14, 0x3ff0000000000000L    # 1.0

    move-object/from16 v0, p0

    iget-object v9, v0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v0, v9, Lcom/saterskog/cell_lab/Environment;->k:D

    move-wide/from16 v16, v0

    sub-double v16, v16, v10

    const-wide v18, 0x3fd147ae147ae148L    # 0.27

    div-double v16, v16, v18

    sub-double v14, v14, v16

    invoke-static {v12, v13, v14, v15}, Ljava/lang/Math;->min(DD)D

    move-result-wide v12

    const-wide/16 v14, 0x0

    invoke-static {v12, v13, v14, v15}, Ljava/lang/Math;->max(DD)D

    move-result-wide v12

    .line 1273
    sget-object v9, Lcom/saterskog/cell_lab/h;->l:Lcom/saterskog/cell_lab/h;

    move-object/from16 v0, v21

    if-ne v0, v9, :cond_9

    .line 1274
    float-to-double v8, v8

    add-double/2addr v8, v12

    double-to-float v8, v8

    .line 1277
    :cond_4
    :goto_2
    move-object/from16 v0, v20

    iget-object v9, v0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    move-object/from16 v0, v20

    iget v10, v0, Lcom/saterskog/cell_lab/Cell;->D:I

    aget-object v9, v9, v10

    iget-object v9, v9, Lcom/saterskog/cell_lab/Gene;->u:[I

    const/4 v10, 0x3

    aget v9, v9, v10

    if-eqz v9, :cond_5

    move-object/from16 v0, v20

    iget-object v9, v0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    move-object/from16 v0, v20

    iget v10, v0, Lcom/saterskog/cell_lab/Cell;->D:I

    aget-object v9, v9, v10

    iget-object v9, v9, Lcom/saterskog/cell_lab/Gene;->u:[I

    const/4 v10, 0x3

    aget v9, v9, v10

    const/4 v10, 0x1

    if-eq v9, v10, :cond_5

    move-object/from16 v0, v20

    iget-object v9, v0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    move-object/from16 v0, v20

    iget v10, v0, Lcom/saterskog/cell_lab/Cell;->D:I

    aget-object v9, v9, v10

    iget-object v9, v9, Lcom/saterskog/cell_lab/Gene;->u:[I

    const/4 v10, 0x3

    aget v9, v9, v10

    const/4 v10, 0x2

    if-eq v9, v10, :cond_5

    move-object/from16 v0, v20

    iget-object v9, v0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    move-object/from16 v0, v20

    iget v10, v0, Lcom/saterskog/cell_lab/Cell;->D:I

    aget-object v9, v9, v10

    iget-object v9, v9, Lcom/saterskog/cell_lab/Gene;->u:[I

    const/4 v10, 0x3

    aget v9, v9, v10

    const/4 v10, 0x3

    if-eq v9, v10, :cond_5

    move-object/from16 v0, v20

    iget-object v9, v0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    move-object/from16 v0, v20

    iget v10, v0, Lcom/saterskog/cell_lab/Cell;->D:I

    aget-object v9, v9, v10

    iget-object v9, v9, Lcom/saterskog/cell_lab/Gene;->u:[I

    const/4 v10, 0x3

    aget v9, v9, v10

    const/4 v10, 0x5

    if-ne v9, v10, :cond_13

    .line 1278
    :cond_5
    const/4 v9, -0x1

    move/from16 v19, v9

    :goto_3
    const/4 v9, 0x2

    move/from16 v0, v19

    if-ge v0, v9, :cond_13

    .line 1279
    const/4 v9, -0x1

    move/from16 v18, v9

    move v9, v8

    :goto_4
    const/4 v8, 0x2

    move/from16 v0, v18

    if-ge v0, v8, :cond_12

    .line 1280
    add-int v8, v22, v19

    .line 1281
    add-int v10, v23, v18

    .line 1282
    if-ltz v8, :cond_11

    move-object/from16 v0, p0

    iget v11, v0, Lcom/saterskog/cell_lab/CellWorld;->bd:I

    add-int/lit8 v11, v11, 0x2

    if-ge v8, v11, :cond_11

    if-ltz v10, :cond_11

    move-object/from16 v0, p0

    iget v11, v0, Lcom/saterskog/cell_lab/CellWorld;->bd:I

    add-int/lit8 v11, v11, 0x2

    if-ge v10, v11, :cond_11

    .line 1283
    move-object/from16 v0, p0

    iget v11, v0, Lcom/saterskog/cell_lab/CellWorld;->bd:I

    add-int/lit8 v11, v11, 0x2

    mul-int/2addr v10, v11

    add-int v24, v8, v10

    .line 1284
    const/4 v8, 0x0

    :goto_5
    move-object/from16 v0, p0

    iget-object v10, v0, Lcom/saterskog/cell_lab/CellWorld;->bc:[I

    aget v10, v10, v24

    if-ge v8, v10, :cond_11

    .line 1286
    move-object/from16 v0, p0

    iget-object v10, v0, Lcom/saterskog/cell_lab/CellWorld;->bb:[[S

    aget-object v10, v10, v24

    aget-short v10, v10, v8

    move-object/from16 v0, v20

    iget-object v11, v0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    move-object/from16 v0, v20

    iget v12, v0, Lcom/saterskog/cell_lab/Cell;->D:I

    aget-object v11, v11, v12

    iget-object v11, v11, Lcom/saterskog/cell_lab/Gene;->u:[I

    const/4 v12, 0x3

    aget v11, v11, v12

    if-ne v10, v11, :cond_6

    .line 1287
    move-object/from16 v0, p0

    iget-object v10, v0, Lcom/saterskog/cell_lab/CellWorld;->ba:[[I

    aget-object v10, v10, v24

    aget v10, v10, v8

    move/from16 v0, p1

    if-eq v10, v0, :cond_6

    .line 1288
    move-object/from16 v0, v20

    iget-object v10, v0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    move-object/from16 v0, v20

    iget v11, v0, Lcom/saterskog/cell_lab/Cell;->D:I

    aget-object v10, v10, v11

    iget-object v10, v10, Lcom/saterskog/cell_lab/Gene;->u:[I

    const/4 v11, 0x3

    aget v10, v10, v11

    if-nez v10, :cond_b

    .line 1290
    move-object/from16 v0, p0

    iget-object v10, v0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    move-object/from16 v0, p0

    iget-object v11, v0, Lcom/saterskog/cell_lab/CellWorld;->ba:[[I

    aget-object v11, v11, v24

    aget v11, v11, v8

    aget-object v10, v10, v11

    .line 1291
    move-object/from16 v0, v20

    iget-object v11, v0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    move-object/from16 v0, v20

    iget v12, v0, Lcom/saterskog/cell_lab/Cell;->D:I

    aget-object v11, v11, v12

    iget-object v11, v11, Lcom/saterskog/cell_lab/Gene;->v:[F

    const/4 v12, 0x1

    aget v11, v11, v12

    iget-object v12, v10, Lcom/saterskog/cell_lab/Cell;->J:[F

    const/4 v13, 0x0

    aget v12, v12, v13

    sub-float/2addr v11, v12

    .line 1292
    move-object/from16 v0, v20

    iget-object v12, v0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    move-object/from16 v0, v20

    iget v13, v0, Lcom/saterskog/cell_lab/Cell;->D:I

    aget-object v12, v12, v13

    iget-object v12, v12, Lcom/saterskog/cell_lab/Gene;->v:[F

    const/4 v13, 0x2

    aget v12, v12, v13

    iget-object v13, v10, Lcom/saterskog/cell_lab/Cell;->J:[F

    const/4 v14, 0x1

    aget v13, v13, v14

    sub-float/2addr v12, v13

    .line 1293
    move-object/from16 v0, v20

    iget-object v13, v0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    move-object/from16 v0, v20

    iget v14, v0, Lcom/saterskog/cell_lab/Cell;->D:I

    aget-object v13, v13, v14

    iget-object v13, v13, Lcom/saterskog/cell_lab/Gene;->v:[F

    const/4 v14, 0x3

    aget v13, v13, v14

    iget-object v14, v10, Lcom/saterskog/cell_lab/Cell;->J:[F

    const/4 v15, 0x2

    aget v14, v14, v15

    sub-float/2addr v13, v14

    .line 1294
    move-object/from16 v0, v20

    iget-object v14, v0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    move-object/from16 v0, v20

    iget v15, v0, Lcom/saterskog/cell_lab/Cell;->D:I

    aget-object v14, v14, v15

    iget-object v14, v14, Lcom/saterskog/cell_lab/Gene;->v:[F

    const/4 v15, 0x4

    aget v14, v14, v15

    .line 1295
    mul-float/2addr v11, v11

    mul-float/2addr v12, v12

    add-float/2addr v11, v12

    mul-float v12, v13, v13

    add-float/2addr v11, v12

    mul-float v12, v14, v14

    cmpg-float v11, v11, v12

    if-gez v11, :cond_6

    .line 1297
    move-object/from16 v0, v20

    iget-wide v12, v0, Lcom/saterskog/cell_lab/Cell;->b:D

    iget-wide v14, v10, Lcom/saterskog/cell_lab/Cell;->b:D

    sub-double/2addr v12, v14

    .line 1298
    move-object/from16 v0, v20

    iget-wide v14, v0, Lcom/saterskog/cell_lab/Cell;->c:D

    iget-wide v0, v10, Lcom/saterskog/cell_lab/Cell;->c:D

    move-wide/from16 v16, v0

    sub-double v14, v14, v16

    .line 1299
    mul-double v16, v12, v12

    mul-double v26, v14, v14

    add-double v16, v16, v26

    invoke-static/range {v16 .. v17}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v16

    .line 1300
    const-wide/16 v26, 0x0

    cmpl-double v11, v16, v26

    if-lez v11, :cond_6

    .line 1301
    sget-object v11, Lcom/saterskog/cell_lab/h;->l:Lcom/saterskog/cell_lab/h;

    move-object/from16 v0, v21

    if-ne v0, v11, :cond_a

    .line 1302
    float-to-double v12, v9

    iget-wide v10, v10, Lcom/saterskog/cell_lab/Cell;->w:D

    const-wide v14, 0x3fb70a3d70a3d70aL    # 0.09

    div-double v14, v16, v14

    invoke-static {v14, v15}, Lcom/saterskog/b/b;->a(D)D

    move-result-wide v14

    mul-double/2addr v10, v14

    const-wide/high16 v14, 0x4024000000000000L    # 10.0

    mul-double/2addr v10, v14

    add-double/2addr v10, v12

    double-to-float v9, v10

    .line 1284
    :cond_6
    :goto_6
    add-int/lit8 v8, v8, 0x1

    goto/16 :goto_5

    .line 1259
    :cond_7
    const-wide/16 v8, 0x0

    move-object/from16 v0, v20

    iget-wide v10, v0, Lcom/saterskog/cell_lab/Cell;->b:D

    move-object/from16 v0, v20

    iget-wide v12, v0, Lcom/saterskog/cell_lab/Cell;->c:D

    move-object/from16 v0, p0

    invoke-direct {v0, v10, v11, v12, v13}, Lcom/saterskog/cell_lab/CellWorld;->d(DD)D

    move-result-wide v10

    mul-double/2addr v10, v4

    move-object/from16 v0, v20

    iget-wide v12, v0, Lcom/saterskog/cell_lab/Cell;->b:D

    move-object/from16 v0, v20

    iget-wide v14, v0, Lcom/saterskog/cell_lab/Cell;->c:D

    move-object/from16 v0, p0

    invoke-direct {v0, v12, v13, v14, v15}, Lcom/saterskog/cell_lab/CellWorld;->e(DD)D

    move-result-wide v12

    mul-double/2addr v12, v6

    sub-double/2addr v10, v12

    neg-double v10, v10

    const-wide v12, 0x3fc999999999999aL    # 0.2

    mul-double/2addr v10, v12

    add-double/2addr v8, v10

    double-to-float v8, v8

    goto/16 :goto_0

    .line 1266
    :cond_8
    float-to-double v8, v8

    move-object/from16 v0, v20

    iget-wide v10, v0, Lcom/saterskog/cell_lab/Cell;->e:D

    mul-double/2addr v10, v4

    move-object/from16 v0, v20

    iget-wide v12, v0, Lcom/saterskog/cell_lab/Cell;->f:D

    mul-double/2addr v12, v6

    sub-double/2addr v10, v12

    const-wide/high16 v12, 0x4008000000000000L    # 3.0

    mul-double/2addr v10, v12

    add-double/2addr v8, v10

    double-to-float v8, v8

    goto/16 :goto_1

    .line 1275
    :cond_9
    const-wide/16 v14, 0x0

    cmpl-double v9, v10, v14

    if-eqz v9, :cond_4

    float-to-double v8, v8

    neg-double v12, v12

    move-object/from16 v0, v20

    iget-wide v14, v0, Lcom/saterskog/cell_lab/Cell;->b:D

    mul-double/2addr v14, v4

    move-object/from16 v0, v20

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->c:D

    move-wide/from16 v16, v0

    mul-double v16, v16, v6

    sub-double v14, v14, v16

    mul-double/2addr v12, v14

    div-double v10, v12, v10

    add-double/2addr v8, v10

    double-to-float v8, v8

    goto/16 :goto_2

    .line 1304
    :cond_a
    float-to-double v0, v9

    move-wide/from16 v26, v0

    iget-wide v10, v10, Lcom/saterskog/cell_lab/Cell;->w:D

    const-wide v28, 0x3fb70a3d70a3d70aL    # 0.09

    div-double v28, v16, v28

    invoke-static/range {v28 .. v29}, Lcom/saterskog/b/b;->b(D)D

    move-result-wide v28

    mul-double v10, v10, v28

    mul-double/2addr v12, v4

    mul-double/2addr v14, v6

    sub-double/2addr v12, v14

    mul-double/2addr v10, v12

    div-double v10, v10, v16

    const-wide/high16 v12, 0x4024000000000000L    # 10.0

    mul-double/2addr v10, v12

    add-double v10, v10, v26

    double-to-float v9, v10

    goto :goto_6

    .line 1313
    :cond_b
    move-object/from16 v0, p0

    iget-object v10, v0, Lcom/saterskog/cell_lab/CellWorld;->ba:[[I

    aget-object v10, v10, v24

    aget v10, v10, v8

    if-gez v10, :cond_d

    .line 1315
    move-object/from16 v0, p0

    iget-object v10, v0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    move-object/from16 v0, p0

    iget-object v11, v0, Lcom/saterskog/cell_lab/CellWorld;->ba:[[I

    aget-object v11, v11, v24

    aget v11, v11, v8

    add-int/lit8 v11, v11, 0x1

    neg-int v11, v11

    aget-object v10, v10, v11

    .line 1317
    move-object/from16 v0, v20

    iget-wide v12, v0, Lcom/saterskog/cell_lab/Cell;->b:D

    iget-wide v14, v10, Lcom/saterskog/cell_lab/Cell;->b:D

    sub-double/2addr v12, v14

    const-wide/high16 v14, 0x3fd0000000000000L    # 0.25

    mul-double/2addr v14, v12

    .line 1318
    move-object/from16 v0, v20

    iget-wide v12, v0, Lcom/saterskog/cell_lab/Cell;->c:D

    iget-wide v0, v10, Lcom/saterskog/cell_lab/Cell;->c:D

    move-wide/from16 v16, v0

    sub-double v12, v12, v16

    const-wide/high16 v16, 0x3fd0000000000000L    # 0.25

    mul-double v12, v12, v16

    .line 1319
    mul-double v16, v14, v14

    mul-double v26, v12, v12

    add-double v16, v16, v26

    invoke-static/range {v16 .. v17}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v16

    .line 1320
    iget-wide v10, v10, Lcom/saterskog/cell_lab/Cell;->w:D

    const-wide/high16 v26, 0x4024000000000000L    # 10.0

    mul-double v10, v10, v26

    .line 1336
    :cond_c
    :goto_7
    const-wide/16 v26, 0x0

    cmpl-double v25, v16, v26

    if-lez v25, :cond_6

    .line 1337
    sget-object v25, Lcom/saterskog/cell_lab/h;->l:Lcom/saterskog/cell_lab/h;

    move-object/from16 v0, v21

    move-object/from16 v1, v25

    if-ne v0, v1, :cond_10

    .line 1338
    float-to-double v12, v9

    const-wide v14, 0x3fb70a3d70a3d70aL    # 0.09

    div-double v14, v16, v14

    invoke-static {v14, v15}, Lcom/saterskog/b/b;->a(D)D

    move-result-wide v14

    mul-double/2addr v10, v14

    add-double/2addr v10, v12

    double-to-float v9, v10

    goto/16 :goto_6

    .line 1323
    :cond_d
    move-object/from16 v0, p0

    iget-object v10, v0, Lcom/saterskog/cell_lab/CellWorld;->A:[Lcom/saterskog/cell_lab/Food;

    move-object/from16 v0, p0

    iget-object v11, v0, Lcom/saterskog/cell_lab/CellWorld;->ba:[[I

    aget-object v11, v11, v24

    aget v11, v11, v8

    aget-object v25, v10, v11

    .line 1324
    const-wide/16 v10, 0x0

    .line 1325
    const-wide/16 v16, 0x0

    .line 1326
    const-wide/16 v14, 0x0

    .line 1327
    const-wide/16 v12, 0x0

    .line 1328
    move-object/from16 v0, v25

    iget v0, v0, Lcom/saterskog/cell_lab/Food;->f:F

    move/from16 v26, v0

    const/16 v27, 0x0

    cmpg-float v26, v26, v27

    if-gtz v26, :cond_e

    move-object/from16 v0, v20

    iget-object v0, v0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    move-object/from16 v26, v0

    move-object/from16 v0, v20

    iget v0, v0, Lcom/saterskog/cell_lab/Cell;->D:I

    move/from16 v27, v0

    aget-object v26, v26, v27

    move-object/from16 v0, v26

    iget-object v0, v0, Lcom/saterskog/cell_lab/Gene;->u:[I

    move-object/from16 v26, v0

    const/16 v27, 0x3

    aget v26, v26, v27

    const/16 v27, 0x1

    move/from16 v0, v26

    move/from16 v1, v27

    if-eq v0, v1, :cond_f

    :cond_e
    move-object/from16 v0, v25

    iget v0, v0, Lcom/saterskog/cell_lab/Food;->f:F

    move/from16 v26, v0

    const/16 v27, 0x0

    cmpl-float v26, v26, v27

    if-lez v26, :cond_c

    move-object/from16 v0, v20

    iget-object v0, v0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    move-object/from16 v26, v0

    move-object/from16 v0, v20

    iget v0, v0, Lcom/saterskog/cell_lab/Cell;->D:I

    move/from16 v27, v0

    aget-object v26, v26, v27

    move-object/from16 v0, v26

    iget-object v0, v0, Lcom/saterskog/cell_lab/Gene;->u:[I

    move-object/from16 v26, v0

    const/16 v27, 0x3

    aget v26, v26, v27

    const/16 v27, 0x2

    move/from16 v0, v26

    move/from16 v1, v27

    if-ne v0, v1, :cond_c

    .line 1330
    :cond_f
    move-object/from16 v0, v20

    iget-wide v10, v0, Lcom/saterskog/cell_lab/Cell;->b:D

    move-object/from16 v0, v25

    iget v12, v0, Lcom/saterskog/cell_lab/Food;->a:F

    float-to-double v12, v12

    sub-double v14, v10, v12

    .line 1331
    move-object/from16 v0, v20

    iget-wide v10, v0, Lcom/saterskog/cell_lab/Cell;->c:D

    move-object/from16 v0, v25

    iget v12, v0, Lcom/saterskog/cell_lab/Food;->b:F

    float-to-double v12, v12

    sub-double v12, v10, v12

    .line 1332
    mul-double v10, v14, v14

    mul-double v16, v12, v12

    add-double v10, v10, v16

    invoke-static {v10, v11}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v16

    .line 1333
    move-object/from16 v0, v25

    iget v10, v0, Lcom/saterskog/cell_lab/Food;->c:F

    const/high16 v11, 0x41200000    # 10.0f

    mul-float/2addr v10, v11

    float-to-double v10, v10

    goto/16 :goto_7

    .line 1340
    :cond_10
    float-to-double v0, v9

    move-wide/from16 v26, v0

    const-wide v28, 0x3fb70a3d70a3d70aL    # 0.09

    div-double v28, v16, v28

    invoke-static/range {v28 .. v29}, Lcom/saterskog/b/b;->b(D)D

    move-result-wide v28

    mul-double v10, v10, v28

    mul-double/2addr v14, v4

    mul-double/2addr v12, v6

    sub-double v12, v14, v12

    mul-double/2addr v10, v12

    div-double v10, v10, v16

    add-double v10, v10, v26

    double-to-float v9, v10

    goto/16 :goto_6

    .line 1279
    :cond_11
    add-int/lit8 v8, v18, 0x1

    move/from16 v18, v8

    goto/16 :goto_4

    .line 1278
    :cond_12
    add-int/lit8 v8, v19, 0x1

    move/from16 v19, v8

    move v8, v9

    goto/16 :goto_3

    .line 1348
    :cond_13
    sget-object v4, Lcom/saterskog/cell_lab/h;->k:Lcom/saterskog/cell_lab/h;

    move-object/from16 v0, v21

    if-ne v0, v4, :cond_14

    .line 1349
    move-object/from16 v0, v20

    iget-boolean v4, v0, Lcom/saterskog/cell_lab/Cell;->y:Z

    if-eqz v4, :cond_17

    const/4 v4, -0x1

    :goto_8
    int-to-float v4, v4

    mul-float/2addr v8, v4

    .line 1350
    :cond_14
    move-object/from16 v0, v20

    iget-object v4, v0, Lcom/saterskog/cell_lab/Cell;->W:[F

    const/4 v5, 0x2

    move-object/from16 v0, v20

    invoke-virtual {v0, v5}, Lcom/saterskog/cell_lab/Cell;->b(I)I

    move-result v5

    aget v6, v4, v5

    move-object/from16 v0, v20

    iget-object v7, v0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    move-object/from16 v0, v20

    iget v9, v0, Lcom/saterskog/cell_lab/Cell;->D:I

    aget-object v7, v7, v9

    iget-object v7, v7, Lcom/saterskog/cell_lab/Gene;->v:[F

    const/4 v9, 0x0

    aget v7, v7, v9

    mul-float/2addr v7, v8

    const/high16 v8, 0x41a00000    # 20.0f

    invoke-static {v7, v8}, Ljava/lang/Math;->min(FF)F

    move-result v7

    const/high16 v8, -0x3e600000    # -20.0f

    invoke-static {v7, v8}, Ljava/lang/Math;->max(FF)F

    move-result v7

    add-float/2addr v6, v7

    aput v6, v4, v5

    .line 1355
    :cond_15
    const/4 v4, 0x0

    :goto_9
    move-object/from16 v0, v20

    iget v5, v0, Lcom/saterskog/cell_lab/Cell;->C:I

    if-ge v4, v5, :cond_21

    .line 1356
    move-object/from16 v0, v20

    iget-object v5, v0, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    aget-object v5, v5, v4

    .line 1357
    iget v6, v5, Lcom/saterskog/cell_lab/Link;->a:I

    move/from16 v0, p1

    if-gt v6, v0, :cond_16

    .line 1360
    iget v6, v5, Lcom/saterskog/cell_lab/Link;->a:I

    const/4 v7, -0x1

    if-ne v6, v7, :cond_19

    .line 1362
    move-object/from16 v0, v20

    iget-wide v6, v0, Lcom/saterskog/cell_lab/Cell;->k:D

    move-object/from16 v0, v20

    iget-object v8, v0, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    aget-object v8, v8, v4

    iget-wide v8, v8, Lcom/saterskog/cell_lab/Link;->c:D

    add-double/2addr v6, v8

    invoke-static {v6, v7}, Ljava/lang/Math;->cos(D)D

    move-result-wide v6

    .line 1363
    move-object/from16 v0, v20

    iget-wide v8, v0, Lcom/saterskog/cell_lab/Cell;->k:D

    move-object/from16 v0, v20

    iget-object v10, v0, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    aget-object v10, v10, v4

    iget-wide v10, v10, Lcom/saterskog/cell_lab/Link;->c:D

    add-double/2addr v8, v10

    invoke-static {v8, v9}, Ljava/lang/Math;->sin(D)D

    move-result-wide v8

    .line 1364
    move-object/from16 v0, v20

    iget-wide v10, v0, Lcom/saterskog/cell_lab/Cell;->d:D

    sget-wide v12, Lcom/saterskog/cell_lab/Cell;->a:D

    sub-double/2addr v10, v12

    mul-double/2addr v10, v6

    const-wide v12, 0x3fe999999999999aL    # 0.8

    mul-double/2addr v10, v12

    double-to-float v10, v10

    iput v10, v5, Lcom/saterskog/cell_lab/Link;->g:F

    .line 1365
    move-object/from16 v0, v20

    iget-wide v10, v0, Lcom/saterskog/cell_lab/Cell;->d:D

    sget-wide v12, Lcom/saterskog/cell_lab/Cell;->a:D

    sub-double/2addr v10, v12

    mul-double/2addr v10, v8

    const-wide v12, 0x3fe999999999999aL    # 0.8

    mul-double/2addr v10, v12

    double-to-float v10, v10

    iput v10, v5, Lcom/saterskog/cell_lab/Link;->h:F

    .line 1366
    move-object/from16 v0, v20

    iget-wide v10, v0, Lcom/saterskog/cell_lab/Cell;->d:D

    const-wide v12, 0x3fe3333333333333L    # 0.6

    mul-double/2addr v10, v12

    mul-double/2addr v6, v10

    .line 1367
    move-object/from16 v0, v20

    iget-wide v10, v0, Lcom/saterskog/cell_lab/Cell;->d:D

    const-wide v12, 0x3fe3333333333333L    # 0.6

    mul-double/2addr v10, v12

    mul-double/2addr v8, v10

    .line 1368
    iget-wide v10, v5, Lcom/saterskog/cell_lab/Link;->e:D

    sub-double/2addr v10, v6

    move-object/from16 v0, v20

    iget-wide v12, v0, Lcom/saterskog/cell_lab/Cell;->b:D

    sub-double/2addr v10, v12

    iget-wide v12, v5, Lcom/saterskog/cell_lab/Link;->e:D

    sub-double/2addr v12, v6

    move-object/from16 v0, v20

    iget-wide v14, v0, Lcom/saterskog/cell_lab/Cell;->b:D

    sub-double/2addr v12, v14

    mul-double/2addr v10, v12

    iget-wide v12, v5, Lcom/saterskog/cell_lab/Link;->f:D

    sub-double/2addr v12, v8

    move-object/from16 v0, v20

    iget-wide v14, v0, Lcom/saterskog/cell_lab/Cell;->c:D

    sub-double/2addr v12, v14

    iget-wide v14, v5, Lcom/saterskog/cell_lab/Link;->f:D

    sub-double/2addr v14, v8

    move-object/from16 v0, v20

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->c:D

    move-wide/from16 v16, v0

    sub-double v14, v14, v16

    mul-double/2addr v12, v14

    add-double/2addr v10, v12

    move-object/from16 v0, v20

    iget-wide v12, v0, Lcom/saterskog/cell_lab/Cell;->d:D

    move-object/from16 v0, v20

    iget-wide v14, v0, Lcom/saterskog/cell_lab/Cell;->d:D

    mul-double/2addr v12, v14

    const-wide/high16 v14, 0x4000000000000000L    # 2.0

    mul-double/2addr v12, v14

    const-wide/high16 v14, 0x4000000000000000L    # 2.0

    mul-double/2addr v12, v14

    cmpl-double v10, v10, v12

    if-lez v10, :cond_18

    .line 1371
    move-object/from16 v0, v20

    iget-object v5, v0, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    aget-object v5, v5, v4

    move-object/from16 v0, v20

    iget-object v6, v0, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    move-object/from16 v0, v20

    iget v7, v0, Lcom/saterskog/cell_lab/Cell;->C:I

    add-int/lit8 v7, v7, -0x1

    aget-object v6, v6, v7

    invoke-virtual {v5, v6}, Lcom/saterskog/cell_lab/Link;->a(Lcom/saterskog/cell_lab/Link;)V

    .line 1372
    move-object/from16 v0, v20

    iget v5, v0, Lcom/saterskog/cell_lab/Cell;->C:I

    add-int/lit8 v5, v5, -0x1

    move-object/from16 v0, v20

    iput v5, v0, Lcom/saterskog/cell_lab/Cell;->C:I

    .line 1373
    add-int/lit8 v4, v4, -0x1

    .line 1355
    :cond_16
    :goto_a
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_9

    .line 1349
    :cond_17
    const/4 v4, 0x1

    goto/16 :goto_8

    .line 1375
    :cond_18
    move-object/from16 v0, v20

    iget-wide v10, v0, Lcom/saterskog/cell_lab/Cell;->e:D

    move-object/from16 v0, v20

    iget-wide v12, v0, Lcom/saterskog/cell_lab/Cell;->l:D

    neg-double v14, v8

    mul-double/2addr v12, v14

    add-double/2addr v10, v12

    .line 1376
    move-object/from16 v0, v20

    iget-wide v12, v0, Lcom/saterskog/cell_lab/Cell;->f:D

    move-object/from16 v0, v20

    iget-wide v14, v0, Lcom/saterskog/cell_lab/Cell;->l:D

    mul-double/2addr v14, v6

    add-double/2addr v12, v14

    .line 1379
    const-wide/high16 v14, 0x4049000000000000L    # 50.0

    move-object/from16 v0, v20

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->d:D

    move-wide/from16 v16, v0

    mul-double v14, v14, v16

    .line 1380
    const-wide/high16 v16, 0x3ff0000000000000L    # 1.0

    const-wide/high16 v18, 0x3ff0000000000000L    # 1.0

    move-object/from16 v0, p0

    iget-wide v0, v0, Lcom/saterskog/cell_lab/CellWorld;->T:D

    move-wide/from16 v22, v0

    mul-double v18, v18, v22

    mul-double v18, v18, v14

    const-wide/high16 v22, 0x3fe0000000000000L    # 0.5

    mul-double v18, v18, v22

    move-object/from16 v0, v20

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->w:D

    move-wide/from16 v22, v0

    div-double v18, v18, v22

    sub-double v16, v16, v18

    mul-double v14, v14, v16

    .line 1381
    iget-wide v0, v5, Lcom/saterskog/cell_lab/Link;->e:D

    move-wide/from16 v16, v0

    sub-double v16, v16, v6

    move-object/from16 v0, v20

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->b:D

    move-wide/from16 v18, v0

    sub-double v16, v16, v18

    const-wide/high16 v18, 0x403e000000000000L    # 30.0

    mul-double v16, v16, v18

    const-wide/high16 v18, 0x4008000000000000L    # 3.0

    mul-double v16, v16, v18

    const-wide/16 v18, 0x0

    sub-double v10, v18, v10

    mul-double/2addr v10, v14

    add-double v10, v10, v16

    .line 1382
    iget-wide v0, v5, Lcom/saterskog/cell_lab/Link;->f:D

    move-wide/from16 v16, v0

    sub-double v16, v16, v8

    move-object/from16 v0, v20

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->c:D

    move-wide/from16 v18, v0

    sub-double v16, v16, v18

    const-wide/high16 v18, 0x403e000000000000L    # 30.0

    mul-double v16, v16, v18

    const-wide/high16 v18, 0x4008000000000000L    # 3.0

    mul-double v16, v16, v18

    const-wide/16 v18, 0x0

    sub-double v12, v18, v12

    mul-double/2addr v12, v14

    add-double v12, v12, v16

    .line 1383
    move-object/from16 v0, v20

    iget-wide v14, v0, Lcom/saterskog/cell_lab/Cell;->g:D

    add-double/2addr v14, v10

    move-object/from16 v0, v20

    iput-wide v14, v0, Lcom/saterskog/cell_lab/Cell;->g:D

    .line 1384
    move-object/from16 v0, v20

    iget-wide v14, v0, Lcom/saterskog/cell_lab/Cell;->h:D

    add-double/2addr v14, v12

    move-object/from16 v0, v20

    iput-wide v14, v0, Lcom/saterskog/cell_lab/Cell;->h:D

    .line 1385
    move-object/from16 v0, v20

    iget-wide v14, v0, Lcom/saterskog/cell_lab/Cell;->j:D

    neg-double v10, v10

    mul-double/2addr v8, v10

    mul-double/2addr v6, v12

    add-double/2addr v6, v8

    add-double/2addr v6, v14

    move-object/from16 v0, v20

    iput-wide v6, v0, Lcom/saterskog/cell_lab/Cell;->j:D

    goto/16 :goto_a

    .line 1391
    :cond_19
    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    iget v7, v5, Lcom/saterskog/cell_lab/Link;->a:I

    aget-object v18, v6, v7

    .line 1393
    move-object/from16 v0, v20

    iget-wide v6, v0, Lcom/saterskog/cell_lab/Cell;->d:D

    move-object/from16 v0, v18

    iget-wide v8, v0, Lcom/saterskog/cell_lab/Cell;->d:D

    invoke-static {v6, v7, v8, v9}, Ljava/lang/Math;->min(DD)D

    move-result-wide v12

    .line 1394
    move-object/from16 v0, v20

    iget-wide v6, v0, Lcom/saterskog/cell_lab/Cell;->d:D

    move-object/from16 v0, v18

    iget-wide v8, v0, Lcom/saterskog/cell_lab/Cell;->d:D

    invoke-static {v6, v7, v8, v9}, Ljava/lang/Math;->max(DD)D

    move-result-wide v22

    .line 1395
    const-wide v6, 0x3fd999999999999aL    # 0.4

    mul-double v10, v12, v6

    .line 1397
    move-object/from16 v0, v20

    iget-object v6, v0, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    aget-object v6, v6, v4

    iget-wide v8, v6, Lcom/saterskog/cell_lab/Link;->c:D

    .line 1398
    move-object/from16 v0, v20

    iget-object v6, v0, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    aget-object v6, v6, v4

    iget-wide v14, v6, Lcom/saterskog/cell_lab/Link;->d:D

    .line 1401
    move-object/from16 v0, v20

    iget-wide v6, v0, Lcom/saterskog/cell_lab/Cell;->q:D

    neg-double v6, v6

    move-object/from16 v0, v18

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->q:D

    move-wide/from16 v16, v0

    add-double v6, v6, v16

    .line 1403
    move-object/from16 v0, v20

    iget-object v0, v0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    move-object/from16 v16, v0

    move-object/from16 v0, v20

    iget v0, v0, Lcom/saterskog/cell_lab/Cell;->D:I

    move/from16 v17, v0

    aget-object v16, v16, v17

    move-object/from16 v0, v16

    iget-object v0, v0, Lcom/saterskog/cell_lab/Gene;->s:Lcom/saterskog/cell_lab/h;

    move-object/from16 v16, v0

    sget-object v17, Lcom/saterskog/cell_lab/h;->m:Lcom/saterskog/cell_lab/h;

    move-object/from16 v0, v16

    move-object/from16 v1, v17

    if-ne v0, v1, :cond_1a

    .line 1404
    invoke-static {v8, v9}, Ljava/lang/Math;->cos(D)D

    move-result-wide v16

    .line 1405
    move-object/from16 v0, v20

    iget v0, v0, Lcom/saterskog/cell_lab/Cell;->ac:F

    move/from16 v19, v0

    move/from16 v0, v19

    float-to-double v0, v0

    move-wide/from16 v24, v0

    mul-double v24, v24, v16

    sub-double v6, v6, v24

    .line 1406
    mul-double v24, v16, v16

    move-object/from16 v0, v20

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->d:D

    move-wide/from16 v26, v0

    mul-double v24, v24, v26

    move-object/from16 v0, v20

    iget v0, v0, Lcom/saterskog/cell_lab/Cell;->aa:F

    move/from16 v19, v0

    move/from16 v0, v19

    float-to-double v0, v0

    move-wide/from16 v26, v0

    mul-double v24, v24, v26

    add-double v10, v10, v24

    .line 1407
    move-object/from16 v0, v20

    iget v0, v0, Lcom/saterskog/cell_lab/Cell;->ab:F

    move/from16 v19, v0

    move/from16 v0, v19

    float-to-double v0, v0

    move-wide/from16 v24, v0

    mul-double v16, v16, v24

    add-double v8, v8, v16

    .line 1410
    :cond_1a
    move-object/from16 v0, v18

    iget-object v0, v0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    move-object/from16 v16, v0

    move-object/from16 v0, v18

    iget v0, v0, Lcom/saterskog/cell_lab/Cell;->D:I

    move/from16 v17, v0

    aget-object v16, v16, v17

    move-object/from16 v0, v16

    iget-object v0, v0, Lcom/saterskog/cell_lab/Gene;->s:Lcom/saterskog/cell_lab/h;

    move-object/from16 v16, v0

    sget-object v17, Lcom/saterskog/cell_lab/h;->m:Lcom/saterskog/cell_lab/h;

    move-object/from16 v0, v16

    move-object/from16 v1, v17

    if-ne v0, v1, :cond_6e

    .line 1411
    invoke-static {v14, v15}, Ljava/lang/Math;->cos(D)D

    move-result-wide v24

    .line 1412
    move-object/from16 v0, v18

    iget v0, v0, Lcom/saterskog/cell_lab/Cell;->ac:F

    move/from16 v16, v0

    move/from16 v0, v16

    float-to-double v0, v0

    move-wide/from16 v16, v0

    mul-double v16, v16, v24

    add-double v6, v6, v16

    .line 1413
    mul-double v16, v24, v24

    move-object/from16 v0, v18

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->d:D

    move-wide/from16 v26, v0

    mul-double v16, v16, v26

    move-object/from16 v0, v18

    iget v0, v0, Lcom/saterskog/cell_lab/Cell;->aa:F

    move/from16 v19, v0

    move/from16 v0, v19

    float-to-double v0, v0

    move-wide/from16 v26, v0

    mul-double v16, v16, v26

    add-double v16, v16, v10

    .line 1414
    move-object/from16 v0, v18

    iget v10, v0, Lcom/saterskog/cell_lab/Cell;->ab:F

    float-to-double v10, v10

    mul-double v10, v10, v24

    add-double/2addr v10, v14

    move-wide v14, v10

    move-wide v10, v6

    move-wide/from16 v6, v16

    .line 1417
    :goto_b
    const-wide/16 v16, 0x0

    mul-double v16, v16, v12

    const-wide v24, 0x3fd999999999999aL    # 0.4

    mul-double v16, v16, v24

    cmpg-double v16, v6, v16

    if-gez v16, :cond_1b

    const-wide/16 v6, 0x0

    mul-double/2addr v6, v12

    const-wide v16, 0x3fd999999999999aL    # 0.4

    mul-double v6, v6, v16

    .line 1418
    :cond_1b
    cmpl-double v16, v6, v12

    if-lez v16, :cond_1c

    move-wide v6, v12

    .line 1420
    :cond_1c
    move-object/from16 v0, v20

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->k:D

    move-wide/from16 v16, v0

    add-double v16, v16, v8

    invoke-static/range {v16 .. v17}, Ljava/lang/Math;->cos(D)D

    move-result-wide v16

    .line 1421
    move-object/from16 v0, v20

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->k:D

    move-wide/from16 v24, v0

    add-double v8, v8, v24

    invoke-static {v8, v9}, Ljava/lang/Math;->sin(D)D

    move-result-wide v8

    .line 1422
    move-object/from16 v0, v18

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->k:D

    move-wide/from16 v24, v0

    add-double v24, v24, v14

    invoke-static/range {v24 .. v25}, Ljava/lang/Math;->cos(D)D

    move-result-wide v24

    .line 1423
    move-object/from16 v0, v18

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->k:D

    move-wide/from16 v26, v0

    add-double v14, v14, v26

    invoke-static {v14, v15}, Ljava/lang/Math;->sin(D)D

    move-result-wide v14

    .line 1425
    move-object/from16 v0, v20

    iget-object v0, v0, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    move-object/from16 v19, v0

    aget-object v19, v19, v4

    move-object/from16 v0, v20

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->d:D

    move-wide/from16 v26, v0

    sget-wide v28, Lcom/saterskog/cell_lab/Cell;->a:D

    sub-double v26, v26, v28

    mul-double v26, v26, v16

    const-wide v28, 0x3fe999999999999aL    # 0.8

    mul-double v26, v26, v28

    move-wide/from16 v0, v26

    double-to-float v0, v0

    move/from16 v26, v0

    move/from16 v0, v26

    move-object/from16 v1, v19

    iput v0, v1, Lcom/saterskog/cell_lab/Link;->g:F

    .line 1426
    move-object/from16 v0, v20

    iget-object v0, v0, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    move-object/from16 v19, v0

    aget-object v19, v19, v4

    move-object/from16 v0, v20

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->d:D

    move-wide/from16 v26, v0

    sget-wide v28, Lcom/saterskog/cell_lab/Cell;->a:D

    sub-double v26, v26, v28

    mul-double v26, v26, v8

    const-wide v28, 0x3fe999999999999aL    # 0.8

    mul-double v26, v26, v28

    move-wide/from16 v0, v26

    double-to-float v0, v0

    move/from16 v26, v0

    move/from16 v0, v26

    move-object/from16 v1, v19

    iput v0, v1, Lcom/saterskog/cell_lab/Link;->h:F

    .line 1427
    move-object/from16 v0, v20

    iget-object v0, v0, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    move-object/from16 v19, v0

    aget-object v19, v19, v4

    move-object/from16 v0, v18

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->d:D

    move-wide/from16 v26, v0

    sget-wide v28, Lcom/saterskog/cell_lab/Cell;->a:D

    sub-double v26, v26, v28

    mul-double v26, v26, v24

    const-wide v28, 0x3fe999999999999aL    # 0.8

    mul-double v26, v26, v28

    move-wide/from16 v0, v26

    double-to-float v0, v0

    move/from16 v26, v0

    move/from16 v0, v26

    move-object/from16 v1, v19

    iput v0, v1, Lcom/saterskog/cell_lab/Link;->i:F

    .line 1428
    move-object/from16 v0, v20

    iget-object v0, v0, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    move-object/from16 v19, v0

    aget-object v19, v19, v4

    move-object/from16 v0, v18

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->d:D

    move-wide/from16 v26, v0

    sget-wide v28, Lcom/saterskog/cell_lab/Cell;->a:D

    sub-double v26, v26, v28

    mul-double v26, v26, v14

    const-wide v28, 0x3fe999999999999aL    # 0.8

    mul-double v26, v26, v28

    move-wide/from16 v0, v26

    double-to-float v0, v0

    move/from16 v26, v0

    move/from16 v0, v26

    move-object/from16 v1, v19

    iput v0, v1, Lcom/saterskog/cell_lab/Link;->j:F

    .line 1429
    move-object/from16 v0, v20

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->d:D

    move-wide/from16 v26, v0

    sub-double v26, v26, v6

    iget v0, v5, Lcom/saterskog/cell_lab/Link;->l:F

    move/from16 v19, v0

    move/from16 v0, v19

    float-to-double v0, v0

    move-wide/from16 v28, v0

    add-double v26, v26, v28

    mul-double v16, v16, v26

    .line 1430
    move-object/from16 v0, v20

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->d:D

    move-wide/from16 v26, v0

    sub-double v26, v26, v6

    iget v0, v5, Lcom/saterskog/cell_lab/Link;->l:F

    move/from16 v19, v0

    move/from16 v0, v19

    float-to-double v0, v0

    move-wide/from16 v28, v0

    add-double v26, v26, v28

    mul-double v8, v8, v26

    .line 1431
    move-object/from16 v0, v18

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->d:D

    move-wide/from16 v26, v0

    sub-double v26, v26, v6

    iget v0, v5, Lcom/saterskog/cell_lab/Link;->l:F

    move/from16 v19, v0

    move/from16 v0, v19

    float-to-double v0, v0

    move-wide/from16 v28, v0

    add-double v26, v26, v28

    mul-double v24, v24, v26

    .line 1432
    move-object/from16 v0, v18

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->d:D

    move-wide/from16 v26, v0

    sub-double v6, v26, v6

    iget v0, v5, Lcom/saterskog/cell_lab/Link;->l:F

    move/from16 v19, v0

    move/from16 v0, v19

    float-to-double v0, v0

    move-wide/from16 v26, v0

    add-double v6, v6, v26

    mul-double/2addr v14, v6

    .line 1434
    move-object/from16 v0, v18

    iget-wide v6, v0, Lcom/saterskog/cell_lab/Cell;->b:D

    add-double v6, v6, v24

    move-object/from16 v0, v20

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->b:D

    move-wide/from16 v26, v0

    sub-double v6, v6, v26

    sub-double v6, v6, v16

    move-object/from16 v0, v18

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->b:D

    move-wide/from16 v26, v0

    add-double v26, v26, v24

    move-object/from16 v0, v20

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->b:D

    move-wide/from16 v28, v0

    sub-double v26, v26, v28

    sub-double v26, v26, v16

    mul-double v6, v6, v26

    move-object/from16 v0, v18

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->c:D

    move-wide/from16 v26, v0

    add-double v26, v26, v14

    move-object/from16 v0, v20

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->c:D

    move-wide/from16 v28, v0

    sub-double v26, v26, v28

    sub-double v26, v26, v8

    move-object/from16 v0, v18

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->c:D

    move-wide/from16 v28, v0

    add-double v28, v28, v14

    move-object/from16 v0, v20

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->c:D

    move-wide/from16 v30, v0

    sub-double v28, v28, v30

    sub-double v28, v28, v8

    mul-double v26, v26, v28

    add-double v6, v6, v26

    mul-double v22, v22, v22

    const-wide/high16 v26, 0x4000000000000000L    # 2.0

    mul-double v22, v22, v26

    const-wide/high16 v26, 0x4000000000000000L    # 2.0

    mul-double v22, v22, v26

    cmpl-double v6, v6, v22

    if-lez v6, :cond_1f

    .line 1435
    const/4 v5, 0x0

    :goto_c
    move-object/from16 v0, v18

    iget v6, v0, Lcom/saterskog/cell_lab/Cell;->C:I

    if-ge v5, v6, :cond_1d

    .line 1436
    move-object/from16 v0, v18

    iget-object v6, v0, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    aget-object v6, v6, v5

    iget v6, v6, Lcom/saterskog/cell_lab/Link;->a:I

    move/from16 v0, p1

    if-ne v6, v0, :cond_1e

    .line 1437
    move-object/from16 v0, v18

    iget-object v6, v0, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    aget-object v5, v6, v5

    move-object/from16 v0, v18

    iget-object v6, v0, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    move-object/from16 v0, v18

    iget v7, v0, Lcom/saterskog/cell_lab/Cell;->C:I

    add-int/lit8 v7, v7, -0x1

    aget-object v6, v6, v7

    invoke-virtual {v5, v6}, Lcom/saterskog/cell_lab/Link;->a(Lcom/saterskog/cell_lab/Link;)V

    .line 1438
    move-object/from16 v0, v18

    iget v5, v0, Lcom/saterskog/cell_lab/Cell;->C:I

    add-int/lit8 v5, v5, -0x1

    move-object/from16 v0, v18

    iput v5, v0, Lcom/saterskog/cell_lab/Cell;->C:I

    .line 1442
    :cond_1d
    move-object/from16 v0, v20

    iget-object v5, v0, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    aget-object v5, v5, v4

    move-object/from16 v0, v20

    iget-object v6, v0, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    move-object/from16 v0, v20

    iget v7, v0, Lcom/saterskog/cell_lab/Cell;->C:I

    add-int/lit8 v7, v7, -0x1

    aget-object v6, v6, v7

    invoke-virtual {v5, v6}, Lcom/saterskog/cell_lab/Link;->a(Lcom/saterskog/cell_lab/Link;)V

    .line 1443
    move-object/from16 v0, v20

    iget v5, v0, Lcom/saterskog/cell_lab/Cell;->C:I

    add-int/lit8 v5, v5, -0x1

    move-object/from16 v0, v20

    iput v5, v0, Lcom/saterskog/cell_lab/Cell;->C:I

    .line 1444
    add-int/lit8 v4, v4, -0x1

    goto/16 :goto_a

    .line 1435
    :cond_1e
    add-int/lit8 v5, v5, 0x1

    goto :goto_c

    .line 1446
    :cond_1f
    move-object/from16 v0, v20

    iget-wide v6, v0, Lcom/saterskog/cell_lab/Cell;->e:D

    move-object/from16 v0, v20

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->l:D

    move-wide/from16 v22, v0

    neg-double v0, v8

    move-wide/from16 v26, v0

    mul-double v22, v22, v26

    add-double v22, v22, v6

    .line 1447
    move-object/from16 v0, v20

    iget-wide v6, v0, Lcom/saterskog/cell_lab/Cell;->f:D

    move-object/from16 v0, v20

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->l:D

    move-wide/from16 v26, v0

    mul-double v26, v26, v16

    add-double v26, v26, v6

    .line 1448
    move-object/from16 v0, v18

    iget-wide v6, v0, Lcom/saterskog/cell_lab/Cell;->e:D

    move-object/from16 v0, v18

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->l:D

    move-wide/from16 v28, v0

    neg-double v0, v14

    move-wide/from16 v30, v0

    mul-double v28, v28, v30

    add-double v28, v28, v6

    .line 1449
    move-object/from16 v0, v18

    iget-wide v6, v0, Lcom/saterskog/cell_lab/Cell;->f:D

    move-object/from16 v0, v18

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->l:D

    move-wide/from16 v30, v0

    mul-double v30, v30, v24

    add-double v30, v30, v6

    .line 1451
    const-wide/high16 v6, 0x4039000000000000L    # 25.0

    move-object/from16 v0, v20

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->w:D

    move-wide/from16 v32, v0

    mul-double v6, v6, v32

    move-object/from16 v0, v18

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->w:D

    move-wide/from16 v32, v0

    mul-double v6, v6, v32

    move-object/from16 v0, v20

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->w:D

    move-wide/from16 v32, v0

    move-object/from16 v0, v18

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->w:D

    move-wide/from16 v34, v0

    add-double v32, v32, v34

    div-double v6, v6, v32

    .line 1452
    move-object/from16 v0, v20

    iget v0, v0, Lcom/saterskog/cell_lab/Cell;->C:I

    move/from16 v19, v0

    move-object/from16 v0, v18

    iget v0, v0, Lcom/saterskog/cell_lab/Cell;->C:I

    move/from16 v32, v0

    move/from16 v0, v19

    move/from16 v1, v32

    if-le v0, v1, :cond_20

    move-object/from16 v0, v20

    iget v0, v0, Lcom/saterskog/cell_lab/Cell;->C:I

    move/from16 v19, v0

    move/from16 v0, v19

    int-to-double v0, v0

    move-wide/from16 v32, v0

    div-double v6, v6, v32

    .line 1455
    :goto_d
    move-object/from16 v0, v18

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->b:D

    move-wide/from16 v32, v0

    add-double v32, v32, v24

    sub-double v32, v32, v16

    move-object/from16 v0, v20

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->b:D

    move-wide/from16 v34, v0

    sub-double v32, v32, v34

    .line 1456
    move-object/from16 v0, v18

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->c:D

    move-wide/from16 v34, v0

    add-double v34, v34, v14

    sub-double v34, v34, v8

    move-object/from16 v0, v20

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->c:D

    move-wide/from16 v36, v0

    sub-double v34, v34, v36

    .line 1457
    const-wide/high16 v36, 0x3ff0000000000000L    # 1.0

    const-wide/high16 v38, 0x4000000000000000L    # 2.0

    mul-double v40, v32, v32

    mul-double v42, v34, v34

    add-double v40, v40, v42

    mul-double v38, v38, v40

    const-wide v40, 0x3f6d7dbf487fcb92L    # 0.0036

    div-double v38, v38, v40

    add-double v36, v36, v38

    .line 1458
    const-wide/high16 v38, 0x403e000000000000L    # 30.0

    sget-wide v40, Lcom/saterskog/cell_lab/Cell;->a:D

    mul-double v38, v38, v40

    sget-wide v40, Lcom/saterskog/cell_lab/Cell;->a:D

    const/high16 v19, 0x40000000    # 2.0f

    iget v5, v5, Lcom/saterskog/cell_lab/Link;->l:F

    mul-float v5, v5, v19

    float-to-double v0, v5

    move-wide/from16 v42, v0

    add-double v40, v40, v42

    div-double v38, v38, v40

    .line 1459
    mul-double v32, v32, v36

    mul-double v32, v32, v38

    sub-double v22, v28, v22

    mul-double v22, v22, v6

    add-double v22, v22, v32

    .line 1460
    mul-double v28, v34, v36

    mul-double v28, v28, v38

    sub-double v26, v30, v26

    mul-double v6, v6, v26

    add-double v6, v6, v28

    .line 1461
    move-object/from16 v0, v20

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->g:D

    move-wide/from16 v26, v0

    add-double v26, v26, v22

    move-wide/from16 v0, v26

    move-object/from16 v2, v20

    iput-wide v0, v2, Lcom/saterskog/cell_lab/Cell;->g:D

    .line 1462
    move-object/from16 v0, v20

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->h:D

    move-wide/from16 v26, v0

    add-double v26, v26, v6

    move-wide/from16 v0, v26

    move-object/from16 v2, v20

    iput-wide v0, v2, Lcom/saterskog/cell_lab/Cell;->h:D

    .line 1463
    move-object/from16 v0, v20

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->i:D

    move-wide/from16 v26, v0

    add-double v26, v26, v10

    move-wide/from16 v0, v26

    move-object/from16 v2, v20

    iput-wide v0, v2, Lcom/saterskog/cell_lab/Cell;->i:D

    .line 1464
    move-object/from16 v0, v18

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->g:D

    move-wide/from16 v26, v0

    sub-double v26, v26, v22

    move-wide/from16 v0, v26

    move-object/from16 v2, v18

    iput-wide v0, v2, Lcom/saterskog/cell_lab/Cell;->g:D

    .line 1465
    move-object/from16 v0, v18

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->h:D

    move-wide/from16 v26, v0

    sub-double v26, v26, v6

    move-wide/from16 v0, v26

    move-object/from16 v2, v18

    iput-wide v0, v2, Lcom/saterskog/cell_lab/Cell;->h:D

    .line 1466
    move-object/from16 v0, v18

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->i:D

    move-wide/from16 v26, v0

    sub-double v10, v26, v10

    move-object/from16 v0, v18

    iput-wide v10, v0, Lcom/saterskog/cell_lab/Cell;->i:D

    .line 1467
    const-wide/high16 v10, 0x3fe0000000000000L    # 0.5

    move-object/from16 v0, v20

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->b:D

    move-wide/from16 v26, v0

    add-double v26, v26, v16

    move-object/from16 v0, v18

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->b:D

    move-wide/from16 v28, v0

    add-double v26, v26, v28

    add-double v26, v26, v24

    mul-double v10, v10, v26

    .line 1468
    const-wide/high16 v26, 0x3fe0000000000000L    # 0.5

    move-object/from16 v0, v20

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->c:D

    move-wide/from16 v28, v0

    add-double v28, v28, v8

    move-object/from16 v0, v18

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->c:D

    move-wide/from16 v30, v0

    add-double v28, v28, v30

    add-double v28, v28, v14

    mul-double v26, v26, v28

    .line 1469
    move-object/from16 v0, v20

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->j:D

    move-wide/from16 v28, v0

    move-wide/from16 v0, v22

    neg-double v0, v0

    move-wide/from16 v30, v0

    move-object/from16 v0, v20

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->c:D

    move-wide/from16 v32, v0

    sub-double v32, v26, v32

    mul-double v30, v30, v32

    move-object/from16 v0, v20

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->b:D

    move-wide/from16 v32, v0

    sub-double v32, v10, v32

    mul-double v32, v32, v6

    add-double v30, v30, v32

    add-double v28, v28, v30

    move-wide/from16 v0, v28

    move-object/from16 v2, v20

    iput-wide v0, v2, Lcom/saterskog/cell_lab/Cell;->j:D

    .line 1470
    move-object/from16 v0, v18

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->j:D

    move-wide/from16 v28, v0

    move-wide/from16 v0, v22

    neg-double v0, v0

    move-wide/from16 v22, v0

    move-object/from16 v0, v18

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->c:D

    move-wide/from16 v30, v0

    sub-double v26, v26, v30

    mul-double v22, v22, v26

    move-object/from16 v0, v18

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->b:D

    move-wide/from16 v26, v0

    sub-double v10, v10, v26

    mul-double/2addr v6, v10

    add-double v6, v6, v22

    sub-double v6, v28, v6

    move-object/from16 v0, v18

    iput-wide v6, v0, Lcom/saterskog/cell_lab/Cell;->j:D

    .line 1475
    mul-double v6, v8, v24

    mul-double v8, v16, v14

    sub-double/2addr v6, v8

    .line 1476
    invoke-static {v6, v7}, Ljava/lang/Math;->signum(D)D

    move-result-wide v8

    invoke-static {v6, v7}, Ljava/lang/Math;->abs(D)D

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v6

    mul-double/2addr v6, v8

    mul-double/2addr v6, v12

    move-object/from16 v0, v20

    iget-object v5, v0, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    aget-object v5, v5, v4

    iget v5, v5, Lcom/saterskog/cell_lab/Link;->k:F

    float-to-double v8, v5

    mul-double/2addr v6, v8

    .line 1477
    move-object/from16 v0, v20

    iget-wide v8, v0, Lcom/saterskog/cell_lab/Cell;->j:D

    add-double/2addr v8, v6

    move-object/from16 v0, v20

    iput-wide v8, v0, Lcom/saterskog/cell_lab/Cell;->j:D

    .line 1478
    move-object/from16 v0, v18

    iget-wide v8, v0, Lcom/saterskog/cell_lab/Cell;->j:D

    sub-double v6, v8, v6

    move-object/from16 v0, v18

    iput-wide v6, v0, Lcom/saterskog/cell_lab/Cell;->j:D

    goto/16 :goto_a

    .line 1452
    :cond_20
    move-object/from16 v0, v18

    iget v0, v0, Lcom/saterskog/cell_lab/Cell;->C:I

    move/from16 v19, v0

    move/from16 v0, v19

    int-to-double v0, v0

    move-wide/from16 v32, v0

    div-double v6, v6, v32

    goto/16 :goto_d

    .line 1482
    :cond_21
    const/4 v5, 0x0

    .line 1484
    const/4 v4, 0x0

    move v9, v4

    :goto_e
    const/4 v4, 0x4

    if-ge v9, v4, :cond_29

    .line 1485
    const/4 v4, -0x1

    .line 1486
    if-nez v9, :cond_22

    .line 1487
    move-object/from16 v0, v20

    iget v4, v0, Lcom/saterskog/cell_lab/Cell;->K:I

    .line 1488
    :cond_22
    const/4 v6, 0x1

    if-ne v9, v6, :cond_23

    .line 1489
    move-object/from16 v0, v20

    iget v4, v0, Lcom/saterskog/cell_lab/Cell;->L:I

    .line 1490
    :cond_23
    const/4 v6, 0x2

    if-ne v9, v6, :cond_24

    .line 1491
    move-object/from16 v0, v20

    iget v4, v0, Lcom/saterskog/cell_lab/Cell;->M:I

    .line 1492
    :cond_24
    const/4 v6, 0x3

    if-ne v9, v6, :cond_6d

    .line 1493
    move-object/from16 v0, v20

    iget v4, v0, Lcom/saterskog/cell_lab/Cell;->N:I

    move v8, v4

    .line 1494
    :goto_f
    const/4 v4, -0x1

    if-eq v8, v4, :cond_28

    .line 1496
    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/saterskog/cell_lab/CellWorld;->aV:[[I

    aget-object v10, v4, v8

    .line 1497
    const/4 v4, 0x0

    :goto_10
    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/saterskog/cell_lab/CellWorld;->aW:[I

    aget v6, v6, v8

    if-ge v4, v6, :cond_28

    .line 1498
    aget v11, v10, v4

    .line 1499
    move/from16 v0, p1

    if-le v11, v0, :cond_26

    .line 1501
    const/4 v6, 0x1

    .line 1502
    const/4 v7, 0x0

    :goto_11
    if-ge v7, v5, :cond_25

    .line 1503
    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/saterskog/cell_lab/CellWorld;->K:[I

    aget v12, v12, v7

    if-ne v12, v11, :cond_27

    .line 1504
    const/4 v6, 0x0

    .line 1507
    :cond_25
    if-eqz v6, :cond_26

    .line 1508
    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/saterskog/cell_lab/CellWorld;->K:[I

    aput v11, v6, v5

    .line 1509
    add-int/lit8 v5, v5, 0x1

    .line 1497
    :cond_26
    add-int/lit8 v4, v4, 0x1

    goto :goto_10

    .line 1502
    :cond_27
    add-int/lit8 v7, v7, 0x1

    goto :goto_11

    .line 1484
    :cond_28
    add-int/lit8 v4, v9, 0x1

    move v9, v4

    goto :goto_e

    .line 1513
    :cond_29
    move-object/from16 v0, v20

    iget-wide v12, v0, Lcom/saterskog/cell_lab/Cell;->b:D

    .line 1514
    move-object/from16 v0, v20

    iget-wide v14, v0, Lcom/saterskog/cell_lab/Cell;->c:D

    .line 1516
    sget-object v4, Lcom/saterskog/cell_lab/h;->f:Lcom/saterskog/cell_lab/h;

    move-object/from16 v0, v21

    if-ne v0, v4, :cond_45

    const/4 v6, 0x1

    .line 1517
    :goto_12
    if-nez v6, :cond_6c

    .line 1518
    const/4 v4, 0x0

    :goto_13
    move-object/from16 v0, v20

    iget v7, v0, Lcom/saterskog/cell_lab/Cell;->C:I

    if-ge v4, v7, :cond_6c

    .line 1519
    move-object/from16 v0, v20

    iget-object v7, v0, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    aget-object v7, v7, v4

    iget v7, v7, Lcom/saterskog/cell_lab/Link;->a:I

    if-ltz v7, :cond_46

    .line 1520
    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    move-object/from16 v0, v20

    iget-object v8, v0, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    aget-object v8, v8, v4

    iget v8, v8, Lcom/saterskog/cell_lab/Link;->a:I

    aget-object v7, v7, v8

    .line 1521
    iget-object v8, v7, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    iget v7, v7, Lcom/saterskog/cell_lab/Cell;->D:I

    aget-object v7, v8, v7

    iget-object v7, v7, Lcom/saterskog/cell_lab/Gene;->s:Lcom/saterskog/cell_lab/h;

    sget-object v8, Lcom/saterskog/cell_lab/h;->f:Lcom/saterskog/cell_lab/h;

    if-ne v7, v8, :cond_46

    .line 1522
    const/4 v4, 0x1

    .line 1528
    :goto_14
    const/4 v6, 0x0

    move v10, v6

    :goto_15
    if-ge v10, v5, :cond_5e

    .line 1529
    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/saterskog/cell_lab/CellWorld;->K:[I

    aget v11, v6, v10

    .line 1530
    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    aget-object v16, v6, v11

    .line 1531
    move-object/from16 v0, v16

    iget-object v6, v0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    move-object/from16 v0, v16

    iget v7, v0, Lcom/saterskog/cell_lab/Cell;->D:I

    aget-object v6, v6, v7

    iget-object v0, v6, Lcom/saterskog/cell_lab/Gene;->s:Lcom/saterskog/cell_lab/h;

    move-object/from16 v17, v0

    .line 1532
    move-object/from16 v0, v16

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->b:D

    move-wide/from16 v18, v0

    .line 1533
    move-object/from16 v0, v16

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->c:D

    move-wide/from16 v22, v0

    .line 1534
    sub-double v6, v12, v18

    sub-double v8, v12, v18

    mul-double/2addr v6, v8

    sub-double v8, v14, v22

    sub-double v24, v14, v22

    mul-double v8, v8, v24

    add-double/2addr v8, v6

    .line 1536
    move-object/from16 v0, v20

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->d:D

    move-wide/from16 v24, v0

    .line 1537
    move-object/from16 v0, v16

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->d:D

    move-wide/from16 v26, v0

    .line 1538
    add-double v6, v24, v26

    .line 1539
    mul-double/2addr v6, v6

    cmpg-double v6, v8, v6

    if-gez v6, :cond_5d

    const-wide/16 v6, 0x0

    cmpl-double v6, v8, v6

    if-eqz v6, :cond_5d

    .line 1553
    move-object/from16 v0, v20

    iget-boolean v6, v0, Lcom/saterskog/cell_lab/Cell;->x:Z

    if-nez v6, :cond_5d

    move-object/from16 v0, v16

    iget-boolean v6, v0, Lcom/saterskog/cell_lab/Cell;->x:Z

    if-nez v6, :cond_5d

    .line 1554
    invoke-static {v8, v9}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v28

    .line 1555
    move-wide/from16 v0, v28

    neg-double v6, v0

    add-double v6, v6, v24

    sub-double v6, v6, v26

    move-wide/from16 v0, v28

    neg-double v0, v0

    move-wide/from16 v30, v0

    sub-double v30, v30, v24

    add-double v30, v30, v26

    mul-double v6, v6, v30

    move-wide/from16 v0, v28

    neg-double v0, v0

    move-wide/from16 v30, v0

    add-double v30, v30, v24

    add-double v30, v30, v26

    mul-double v6, v6, v30

    add-double v30, v28, v24

    add-double v30, v30, v26

    mul-double v6, v6, v30

    div-double/2addr v6, v8

    .line 1556
    mul-double v30, v28, v28

    mul-double v32, v26, v26

    sub-double v30, v30, v32

    mul-double v32, v24, v24

    add-double v30, v30, v32

    const-wide/high16 v32, 0x4000000000000000L    # 2.0

    mul-double v32, v32, v28

    div-double v30, v30, v32

    .line 1557
    sub-double v32, v18, v12

    div-double v32, v32, v28

    .line 1558
    sub-double v34, v22, v14

    div-double v34, v34, v28

    .line 1559
    mul-double v36, v30, v32

    .line 1560
    mul-double v30, v30, v34

    .line 1561
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lcom/saterskog/cell_lab/CellWorld;->U:Z

    move/from16 v38, v0

    if-eqz v38, :cond_2b

    .line 1562
    move-object/from16 v0, v20

    iget v0, v0, Lcom/saterskog/cell_lab/Cell;->B:I

    move/from16 v38, v0

    const/16 v39, 0x14

    move/from16 v0, v38

    move/from16 v1, v39

    if-ge v0, v1, :cond_2a

    move-object/from16 v0, v16

    iget v0, v0, Lcom/saterskog/cell_lab/Cell;->B:I

    move/from16 v38, v0

    const/16 v39, 0x14

    move/from16 v0, v38

    move/from16 v1, v39

    if-lt v0, v1, :cond_47

    .line 1563
    :cond_2a
    new-instance v30, Ljava/lang/StringBuilder;

    const-string v31, "skit: Cell touches too many neighbors (>"

    invoke-direct/range {v30 .. v31}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/16 v31, 0x14

    .line 1564
    invoke-static/range {v31 .. v31}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v31

    invoke-virtual/range {v30 .. v31}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v30

    const-string v31, "), not supposed to normally happen and programmer was lazy enough to not gracefully handle this case."

    invoke-virtual/range {v30 .. v31}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v30

    invoke-virtual/range {v30 .. v30}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v30

    .line 1563
    invoke-static/range {v30 .. v30}, Lcom/saterskog/b/a;->a(Ljava/lang/String;)V

    .line 1612
    :cond_2b
    :goto_16
    sget-object v30, Lcom/saterskog/cell_lab/h;->r:Lcom/saterskog/cell_lab/h;

    move-object/from16 v0, v21

    move-object/from16 v1, v30

    if-eq v0, v1, :cond_2c

    sget-object v30, Lcom/saterskog/cell_lab/h;->r:Lcom/saterskog/cell_lab/h;

    move-object/from16 v0, v17

    move-object/from16 v1, v30

    if-ne v0, v1, :cond_2e

    .line 1622
    :cond_2c
    move-wide/from16 v0, v28

    neg-double v6, v0

    add-double v6, v6, v24

    sub-double v6, v6, v26

    move-wide/from16 v0, v28

    neg-double v0, v0

    move-wide/from16 v30, v0

    sub-double v30, v30, v24

    add-double v30, v30, v26

    mul-double v6, v6, v30

    move-wide/from16 v0, v28

    neg-double v0, v0

    move-wide/from16 v30, v0

    add-double v30, v30, v24

    add-double v30, v30, v26

    mul-double v6, v6, v30

    add-double v24, v24, v28

    add-double v24, v24, v26

    mul-double v6, v6, v24

    div-double v8, v6, v8

    .line 1623
    move-object/from16 v0, v20

    iget-wide v6, v0, Lcom/saterskog/cell_lab/Cell;->w:D

    move-object/from16 v0, v16

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->w:D

    move-wide/from16 v24, v0

    mul-double v6, v6, v24

    move-object/from16 v0, v20

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->w:D

    move-wide/from16 v24, v0

    move-object/from16 v0, v16

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->w:D

    move-wide/from16 v26, v0

    add-double v24, v24, v26

    div-double v6, v6, v24

    .line 1624
    move-object/from16 v0, v16

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->e:D

    move-wide/from16 v24, v0

    move-object/from16 v0, v20

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->e:D

    move-wide/from16 v26, v0

    sub-double v24, v24, v26

    mul-double v24, v24, v6

    const-wide v26, 0x3f947ae147ae147bL    # 0.02

    div-double v24, v24, v26

    const-wide v26, 0x3fc999999999999aL    # 0.2

    mul-double v24, v24, v26

    .line 1625
    move-object/from16 v0, v16

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->f:D

    move-wide/from16 v26, v0

    move-object/from16 v0, v20

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->f:D

    move-wide/from16 v30, v0

    sub-double v26, v26, v30

    mul-double v6, v6, v26

    const-wide v26, 0x3f947ae147ae147bL    # 0.02

    div-double v6, v6, v26

    const-wide v26, 0x3fc999999999999aL    # 0.2

    mul-double v6, v6, v26

    .line 1626
    mul-double v24, v24, v32

    mul-double v6, v6, v34

    add-double v6, v6, v24

    .line 1627
    mul-double v24, v32, v6

    .line 1628
    mul-double v6, v6, v34

    .line 1629
    move-object/from16 v0, v20

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->g:D

    move-wide/from16 v26, v0

    add-double v26, v26, v24

    move-wide/from16 v0, v26

    move-object/from16 v2, v20

    iput-wide v0, v2, Lcom/saterskog/cell_lab/Cell;->g:D

    .line 1630
    move-object/from16 v0, v20

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->h:D

    move-wide/from16 v26, v0

    add-double v26, v26, v6

    move-wide/from16 v0, v26

    move-object/from16 v2, v20

    iput-wide v0, v2, Lcom/saterskog/cell_lab/Cell;->h:D

    .line 1631
    move-object/from16 v0, v16

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->g:D

    move-wide/from16 v26, v0

    sub-double v24, v26, v24

    move-wide/from16 v0, v24

    move-object/from16 v2, v16

    iput-wide v0, v2, Lcom/saterskog/cell_lab/Cell;->g:D

    .line 1632
    move-object/from16 v0, v16

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->h:D

    move-wide/from16 v24, v0

    sub-double v6, v24, v6

    move-object/from16 v0, v16

    iput-wide v6, v0, Lcom/saterskog/cell_lab/Cell;->h:D

    .line 1634
    const/4 v7, 0x1

    .line 1635
    const/4 v6, 0x0

    :goto_17
    move-object/from16 v0, v20

    iget v0, v0, Lcom/saterskog/cell_lab/Cell;->C:I

    move/from16 v24, v0

    move/from16 v0, v24

    if-ge v6, v0, :cond_6b

    .line 1636
    move-object/from16 v0, v20

    iget-object v0, v0, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    move-object/from16 v24, v0

    aget-object v24, v24, v6

    move-object/from16 v0, v24

    iget v0, v0, Lcom/saterskog/cell_lab/Link;->a:I

    move/from16 v24, v0

    move/from16 v0, v24

    if-ne v0, v11, :cond_48

    const/4 v6, 0x0

    .line 1638
    :goto_18
    if-eqz v6, :cond_2d

    .line 1639
    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/saterskog/cell_lab/CellWorld;->aY:[I

    move-object/from16 v0, p0

    iget v7, v0, Lcom/saterskog/cell_lab/CellWorld;->aX:I

    aput p1, v6, v7

    .line 1640
    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/saterskog/cell_lab/CellWorld;->aZ:[I

    move-object/from16 v0, p0

    iget v7, v0, Lcom/saterskog/cell_lab/CellWorld;->aX:I

    aput v11, v6, v7

    .line 1641
    move-object/from16 v0, p0

    iget v6, v0, Lcom/saterskog/cell_lab/CellWorld;->aX:I

    add-int/lit8 v6, v6, 0x1

    move-object/from16 v0, p0

    iput v6, v0, Lcom/saterskog/cell_lab/CellWorld;->aX:I

    :cond_2d
    move-wide v6, v8

    .line 1690
    :cond_2e
    const-wide v8, 0x407f400000000000L    # 500.0

    mul-double/2addr v6, v8

    const-wide/high16 v8, 0x3fe0000000000000L    # 0.5

    const/16 v24, 0x6

    move-object/from16 v0, v20

    move/from16 v1, v24

    invoke-virtual {v0, v1}, Lcom/saterskog/cell_lab/Cell;->a(I)F

    move-result v24

    move/from16 v0, v24

    float-to-double v0, v0

    move-wide/from16 v24, v0

    div-double v8, v8, v24

    const-wide/high16 v24, 0x3fe0000000000000L    # 0.5

    const/16 v26, 0x6

    move-object/from16 v0, v16

    move/from16 v1, v26

    invoke-virtual {v0, v1}, Lcom/saterskog/cell_lab/Cell;->a(I)F

    move-result v26

    move/from16 v0, v26

    float-to-double v0, v0

    move-wide/from16 v26, v0

    div-double v24, v24, v26

    add-double v8, v8, v24

    div-double/2addr v6, v8

    .line 1691
    div-double v6, v6, v28

    .line 1692
    sget-object v8, Lcom/saterskog/cell_lab/h;->q:Lcom/saterskog/cell_lab/h;

    move-object/from16 v0, v21

    if-ne v0, v8, :cond_2f

    sget-object v8, Lcom/saterskog/cell_lab/h;->q:Lcom/saterskog/cell_lab/h;

    move-object/from16 v0, v17

    if-ne v0, v8, :cond_2f

    move-object/from16 v0, v20

    iget-wide v8, v0, Lcom/saterskog/cell_lab/Cell;->o:D

    const-wide/high16 v24, 0x3fe0000000000000L    # 0.5

    cmpl-double v8, v8, v24

    if-lez v8, :cond_2f

    move-object/from16 v0, v16

    iget-wide v8, v0, Lcom/saterskog/cell_lab/Cell;->o:D

    const-wide/high16 v24, 0x3fe0000000000000L    # 0.5

    cmpl-double v8, v8, v24

    if-lez v8, :cond_2f

    .line 1693
    move-object/from16 v0, v20

    iget v8, v0, Lcom/saterskog/cell_lab/Cell;->D:I

    const/4 v9, 0x1

    move-object/from16 v0, v16

    invoke-virtual {v0, v9}, Lcom/saterskog/cell_lab/Cell;->b(I)I

    move-result v9

    if-ne v8, v9, :cond_49

    const/4 v8, 0x1

    move-object/from16 v0, v20

    invoke-virtual {v0, v8}, Lcom/saterskog/cell_lab/Cell;->b(I)I

    move-result v8

    move-object/from16 v0, v16

    iget v9, v0, Lcom/saterskog/cell_lab/Cell;->D:I

    if-ne v8, v9, :cond_49

    .line 1694
    const-wide v8, -0x401ccccccccccccdL    # -0.6

    mul-double/2addr v6, v8

    .line 1699
    :cond_2f
    :goto_19
    sub-double v8, v12, v18

    mul-double/2addr v8, v6

    .line 1700
    sub-double v18, v14, v22

    mul-double v6, v6, v18

    .line 1701
    move-object/from16 v0, v20

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->g:D

    move-wide/from16 v18, v0

    add-double v18, v18, v8

    move-wide/from16 v0, v18

    move-object/from16 v2, v20

    iput-wide v0, v2, Lcom/saterskog/cell_lab/Cell;->g:D

    .line 1702
    move-object/from16 v0, v20

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->h:D

    move-wide/from16 v18, v0

    add-double v18, v18, v6

    move-wide/from16 v0, v18

    move-object/from16 v2, v20

    iput-wide v0, v2, Lcom/saterskog/cell_lab/Cell;->h:D

    .line 1703
    move-object/from16 v0, v16

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->g:D

    move-wide/from16 v18, v0

    sub-double v8, v18, v8

    move-object/from16 v0, v16

    iput-wide v8, v0, Lcom/saterskog/cell_lab/Cell;->g:D

    .line 1704
    move-object/from16 v0, v16

    iget-wide v8, v0, Lcom/saterskog/cell_lab/Cell;->h:D

    sub-double v6, v8, v6

    move-object/from16 v0, v16

    iput-wide v6, v0, Lcom/saterskog/cell_lab/Cell;->h:D

    .line 1707
    sget-object v6, Lcom/saterskog/cell_lab/h;->f:Lcom/saterskog/cell_lab/h;

    move-object/from16 v0, v17

    if-ne v0, v6, :cond_4b

    const/4 v7, 0x1

    .line 1708
    :goto_1a
    if-nez v7, :cond_6a

    .line 1709
    const/4 v6, 0x0

    :goto_1b
    move-object/from16 v0, v16

    iget v8, v0, Lcom/saterskog/cell_lab/Cell;->C:I

    if-ge v6, v8, :cond_6a

    .line 1710
    move-object/from16 v0, v16

    iget-object v8, v0, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    aget-object v8, v8, v6

    iget v8, v8, Lcom/saterskog/cell_lab/Link;->a:I

    if-ltz v8, :cond_4c

    .line 1711
    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    move-object/from16 v0, v16

    iget-object v9, v0, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    aget-object v9, v9, v6

    iget v9, v9, Lcom/saterskog/cell_lab/Link;->a:I

    aget-object v8, v8, v9

    .line 1712
    iget-object v9, v8, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    iget v8, v8, Lcom/saterskog/cell_lab/Cell;->D:I

    aget-object v8, v9, v8

    iget-object v8, v8, Lcom/saterskog/cell_lab/Gene;->s:Lcom/saterskog/cell_lab/h;

    sget-object v9, Lcom/saterskog/cell_lab/h;->f:Lcom/saterskog/cell_lab/h;

    if-ne v8, v9, :cond_4c

    .line 1713
    const/4 v6, 0x1

    .line 1719
    :goto_1c
    move-object/from16 v0, p0

    iget-boolean v7, v0, Lcom/saterskog/cell_lab/CellWorld;->bg:Z

    if-nez v7, :cond_37

    .line 1720
    sget-object v7, Lcom/saterskog/cell_lab/h;->i:Lcom/saterskog/cell_lab/h;

    move-object/from16 v0, v21

    if-ne v0, v7, :cond_33

    if-nez v6, :cond_33

    .line 1721
    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/saterskog/cell_lab/CellWorld;->Y:Lcom/saterskog/b/d;

    invoke-virtual {v7}, Lcom/saterskog/b/d;->a()D

    move-result-wide v8

    move-object/from16 v0, p0

    iget-wide v0, v0, Lcom/saterskog/cell_lab/CellWorld;->T:D

    move-wide/from16 v18, v0

    const-wide/high16 v22, 0x4014000000000000L    # 5.0

    mul-double v18, v18, v22

    cmpg-double v7, v8, v18

    if-gez v7, :cond_33

    .line 1724
    move-object/from16 v0, v16

    iget v7, v0, Lcom/saterskog/cell_lab/Cell;->E:I

    const/4 v8, 0x1

    if-ne v7, v8, :cond_30

    .line 1725
    const/4 v7, 0x4

    move-object/from16 v0, v16

    iput v7, v0, Lcom/saterskog/cell_lab/Cell;->E:I

    .line 1726
    :cond_30
    move-object/from16 v0, v16

    iget v7, v0, Lcom/saterskog/cell_lab/Cell;->E:I

    if-nez v7, :cond_31

    .line 1727
    const/4 v7, 0x3

    move-object/from16 v0, v16

    iput v7, v0, Lcom/saterskog/cell_lab/Cell;->E:I

    .line 1728
    :cond_31
    move-object/from16 v0, v16

    iget v7, v0, Lcom/saterskog/cell_lab/Cell;->E:I

    const/4 v8, 0x2

    if-ne v7, v8, :cond_32

    .line 1729
    const/4 v7, 0x5

    move-object/from16 v0, v16

    iput v7, v0, Lcom/saterskog/cell_lab/Cell;->E:I

    .line 1731
    :cond_32
    const/4 v7, 0x0

    move-object/from16 v0, v20

    invoke-virtual {v0, v7}, Lcom/saterskog/cell_lab/Cell;->b(I)I

    move-result v7

    .line 1733
    sub-int v8, v7, v7

    add-int/lit8 v8, v8, 0x50

    .line 1735
    move-object/from16 v0, v20

    iget-object v9, v0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    aget-object v9, v9, v7

    .line 1736
    move-object/from16 v0, v16

    iget-object v0, v0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    move-object/from16 v18, v0

    aget-object v7, v18, v7

    invoke-virtual {v7, v9}, Lcom/saterskog/cell_lab/Gene;->a(Lcom/saterskog/cell_lab/Gene;)V

    .line 1738
    move-object/from16 v0, v16

    iget-object v7, v0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    iget v0, v9, Lcom/saterskog/cell_lab/Gene;->i:I

    move/from16 v18, v0

    add-int v18, v18, v8

    rem-int/lit8 v18, v18, 0x50

    aget-object v7, v7, v18

    move-object/from16 v0, v20

    iget-object v0, v0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    move-object/from16 v18, v0

    iget v0, v9, Lcom/saterskog/cell_lab/Gene;->i:I

    move/from16 v19, v0

    aget-object v18, v18, v19

    move-object/from16 v0, v18

    invoke-virtual {v7, v0}, Lcom/saterskog/cell_lab/Gene;->a(Lcom/saterskog/cell_lab/Gene;)V

    .line 1739
    move-object/from16 v0, v16

    iget-object v7, v0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    iget v0, v9, Lcom/saterskog/cell_lab/Gene;->j:I

    move/from16 v18, v0

    add-int v18, v18, v8

    rem-int/lit8 v18, v18, 0x50

    aget-object v7, v7, v18

    move-object/from16 v0, v20

    iget-object v0, v0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    move-object/from16 v18, v0

    iget v0, v9, Lcom/saterskog/cell_lab/Gene;->j:I

    move/from16 v19, v0

    aget-object v18, v18, v19

    move-object/from16 v0, v18

    invoke-virtual {v7, v0}, Lcom/saterskog/cell_lab/Gene;->a(Lcom/saterskog/cell_lab/Gene;)V

    .line 1741
    move-object/from16 v0, v20

    iget-object v7, v0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    iget v0, v9, Lcom/saterskog/cell_lab/Gene;->i:I

    move/from16 v18, v0

    aget-object v7, v7, v18

    .line 1742
    move-object/from16 v0, v16

    iget-object v0, v0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    move-object/from16 v18, v0

    iget v0, v7, Lcom/saterskog/cell_lab/Gene;->i:I

    move/from16 v19, v0

    add-int v19, v19, v8

    rem-int/lit8 v19, v19, 0x50

    aget-object v18, v18, v19

    move-object/from16 v0, v20

    iget-object v0, v0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    move-object/from16 v19, v0

    iget v0, v7, Lcom/saterskog/cell_lab/Gene;->i:I

    move/from16 v22, v0

    aget-object v19, v19, v22

    invoke-virtual/range {v18 .. v19}, Lcom/saterskog/cell_lab/Gene;->a(Lcom/saterskog/cell_lab/Gene;)V

    .line 1743
    move-object/from16 v0, v16

    iget-object v0, v0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    move-object/from16 v18, v0

    iget v0, v7, Lcom/saterskog/cell_lab/Gene;->j:I

    move/from16 v19, v0

    add-int v19, v19, v8

    rem-int/lit8 v19, v19, 0x50

    aget-object v18, v18, v19

    move-object/from16 v0, v20

    iget-object v0, v0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    move-object/from16 v19, v0

    iget v7, v7, Lcom/saterskog/cell_lab/Gene;->j:I

    aget-object v7, v19, v7

    move-object/from16 v0, v18

    invoke-virtual {v0, v7}, Lcom/saterskog/cell_lab/Gene;->a(Lcom/saterskog/cell_lab/Gene;)V

    .line 1745
    move-object/from16 v0, v20

    iget-object v7, v0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    iget v9, v9, Lcom/saterskog/cell_lab/Gene;->j:I

    aget-object v7, v7, v9

    .line 1746
    move-object/from16 v0, v16

    iget-object v9, v0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    iget v0, v7, Lcom/saterskog/cell_lab/Gene;->i:I

    move/from16 v18, v0

    add-int v18, v18, v8

    rem-int/lit8 v18, v18, 0x50

    aget-object v9, v9, v18

    move-object/from16 v0, v20

    iget-object v0, v0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    move-object/from16 v18, v0

    iget v0, v7, Lcom/saterskog/cell_lab/Gene;->i:I

    move/from16 v19, v0

    aget-object v18, v18, v19

    move-object/from16 v0, v18

    invoke-virtual {v9, v0}, Lcom/saterskog/cell_lab/Gene;->a(Lcom/saterskog/cell_lab/Gene;)V

    .line 1747
    move-object/from16 v0, v16

    iget-object v9, v0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    iget v0, v7, Lcom/saterskog/cell_lab/Gene;->j:I

    move/from16 v18, v0

    add-int v8, v8, v18

    rem-int/lit8 v8, v8, 0x50

    aget-object v8, v9, v8

    move-object/from16 v0, v20

    iget-object v9, v0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    iget v7, v7, Lcom/saterskog/cell_lab/Gene;->j:I

    aget-object v7, v9, v7

    invoke-virtual {v8, v7}, Lcom/saterskog/cell_lab/Gene;->a(Lcom/saterskog/cell_lab/Gene;)V

    .line 1750
    :cond_33
    sget-object v7, Lcom/saterskog/cell_lab/h;->i:Lcom/saterskog/cell_lab/h;

    move-object/from16 v0, v17

    if-ne v0, v7, :cond_37

    if-nez v4, :cond_37

    .line 1751
    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/saterskog/cell_lab/CellWorld;->Y:Lcom/saterskog/b/d;

    invoke-virtual {v7}, Lcom/saterskog/b/d;->a()D

    move-result-wide v8

    move-object/from16 v0, p0

    iget-wide v0, v0, Lcom/saterskog/cell_lab/CellWorld;->T:D

    move-wide/from16 v18, v0

    const-wide/high16 v22, 0x4014000000000000L    # 5.0

    mul-double v18, v18, v22

    cmpg-double v7, v8, v18

    if-gez v7, :cond_37

    .line 1754
    move-object/from16 v0, v20

    iget v7, v0, Lcom/saterskog/cell_lab/Cell;->E:I

    const/4 v8, 0x1

    if-ne v7, v8, :cond_34

    .line 1755
    const/4 v7, 0x4

    move-object/from16 v0, v20

    iput v7, v0, Lcom/saterskog/cell_lab/Cell;->E:I

    .line 1756
    :cond_34
    move-object/from16 v0, v20

    iget v7, v0, Lcom/saterskog/cell_lab/Cell;->E:I

    if-nez v7, :cond_35

    .line 1757
    const/4 v7, 0x3

    move-object/from16 v0, v20

    iput v7, v0, Lcom/saterskog/cell_lab/Cell;->E:I

    .line 1758
    :cond_35
    move-object/from16 v0, v20

    iget v7, v0, Lcom/saterskog/cell_lab/Cell;->E:I

    const/4 v8, 0x2

    if-ne v7, v8, :cond_36

    .line 1759
    const/4 v7, 0x5

    move-object/from16 v0, v20

    iput v7, v0, Lcom/saterskog/cell_lab/Cell;->E:I

    .line 1761
    :cond_36
    const/4 v7, 0x0

    move-object/from16 v0, v16

    invoke-virtual {v0, v7}, Lcom/saterskog/cell_lab/Cell;->b(I)I

    move-result v7

    .line 1763
    sub-int v8, v7, v7

    add-int/lit8 v8, v8, 0x50

    .line 1765
    move-object/from16 v0, v16

    iget-object v9, v0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    aget-object v9, v9, v7

    .line 1766
    move-object/from16 v0, v20

    iget-object v0, v0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    move-object/from16 v18, v0

    aget-object v7, v18, v7

    invoke-virtual {v7, v9}, Lcom/saterskog/cell_lab/Gene;->a(Lcom/saterskog/cell_lab/Gene;)V

    .line 1768
    move-object/from16 v0, v20

    iget-object v7, v0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    iget v0, v9, Lcom/saterskog/cell_lab/Gene;->i:I

    move/from16 v18, v0

    add-int v18, v18, v8

    rem-int/lit8 v18, v18, 0x50

    aget-object v7, v7, v18

    move-object/from16 v0, v16

    iget-object v0, v0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    move-object/from16 v18, v0

    iget v0, v9, Lcom/saterskog/cell_lab/Gene;->i:I

    move/from16 v19, v0

    aget-object v18, v18, v19

    move-object/from16 v0, v18

    invoke-virtual {v7, v0}, Lcom/saterskog/cell_lab/Gene;->a(Lcom/saterskog/cell_lab/Gene;)V

    .line 1769
    move-object/from16 v0, v20

    iget-object v7, v0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    iget v0, v9, Lcom/saterskog/cell_lab/Gene;->j:I

    move/from16 v18, v0

    add-int v18, v18, v8

    rem-int/lit8 v18, v18, 0x50

    aget-object v7, v7, v18

    move-object/from16 v0, v16

    iget-object v0, v0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    move-object/from16 v18, v0

    iget v0, v9, Lcom/saterskog/cell_lab/Gene;->j:I

    move/from16 v19, v0

    aget-object v18, v18, v19

    move-object/from16 v0, v18

    invoke-virtual {v7, v0}, Lcom/saterskog/cell_lab/Gene;->a(Lcom/saterskog/cell_lab/Gene;)V

    .line 1771
    move-object/from16 v0, v16

    iget-object v7, v0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    iget v0, v9, Lcom/saterskog/cell_lab/Gene;->i:I

    move/from16 v18, v0

    aget-object v7, v7, v18

    .line 1772
    move-object/from16 v0, v20

    iget-object v0, v0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    move-object/from16 v18, v0

    iget v0, v7, Lcom/saterskog/cell_lab/Gene;->i:I

    move/from16 v19, v0

    add-int v19, v19, v8

    rem-int/lit8 v19, v19, 0x50

    aget-object v18, v18, v19

    move-object/from16 v0, v16

    iget-object v0, v0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    move-object/from16 v19, v0

    iget v0, v7, Lcom/saterskog/cell_lab/Gene;->i:I

    move/from16 v22, v0

    aget-object v19, v19, v22

    invoke-virtual/range {v18 .. v19}, Lcom/saterskog/cell_lab/Gene;->a(Lcom/saterskog/cell_lab/Gene;)V

    .line 1773
    move-object/from16 v0, v20

    iget-object v0, v0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    move-object/from16 v18, v0

    iget v0, v7, Lcom/saterskog/cell_lab/Gene;->j:I

    move/from16 v19, v0

    add-int v19, v19, v8

    rem-int/lit8 v19, v19, 0x50

    aget-object v18, v18, v19

    move-object/from16 v0, v16

    iget-object v0, v0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    move-object/from16 v19, v0

    iget v7, v7, Lcom/saterskog/cell_lab/Gene;->j:I

    aget-object v7, v19, v7

    move-object/from16 v0, v18

    invoke-virtual {v0, v7}, Lcom/saterskog/cell_lab/Gene;->a(Lcom/saterskog/cell_lab/Gene;)V

    .line 1775
    move-object/from16 v0, v16

    iget-object v7, v0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    iget v9, v9, Lcom/saterskog/cell_lab/Gene;->j:I

    aget-object v7, v7, v9

    .line 1776
    move-object/from16 v0, v20

    iget-object v9, v0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    iget v0, v7, Lcom/saterskog/cell_lab/Gene;->i:I

    move/from16 v18, v0

    add-int v18, v18, v8

    rem-int/lit8 v18, v18, 0x50

    aget-object v9, v9, v18

    move-object/from16 v0, v16

    iget-object v0, v0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    move-object/from16 v18, v0

    iget v0, v7, Lcom/saterskog/cell_lab/Gene;->i:I

    move/from16 v19, v0

    aget-object v18, v18, v19

    move-object/from16 v0, v18

    invoke-virtual {v9, v0}, Lcom/saterskog/cell_lab/Gene;->a(Lcom/saterskog/cell_lab/Gene;)V

    .line 1777
    move-object/from16 v0, v20

    iget-object v9, v0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    iget v0, v7, Lcom/saterskog/cell_lab/Gene;->j:I

    move/from16 v18, v0

    add-int v8, v8, v18

    rem-int/lit8 v8, v8, 0x50

    aget-object v8, v9, v8

    move-object/from16 v0, v16

    iget-object v9, v0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    iget v7, v7, Lcom/saterskog/cell_lab/Gene;->j:I

    aget-object v7, v9, v7

    invoke-virtual {v8, v7}, Lcom/saterskog/cell_lab/Gene;->a(Lcom/saterskog/cell_lab/Gene;)V

    .line 1780
    :cond_37
    sget-object v7, Lcom/saterskog/cell_lab/h;->h:Lcom/saterskog/cell_lab/h;

    move-object/from16 v0, v21

    if-ne v0, v7, :cond_38

    move-object/from16 v0, v20

    iget v7, v0, Lcom/saterskog/cell_lab/Cell;->C:I

    const/4 v8, 0x5

    if-ge v7, v8, :cond_38

    if-eqz v6, :cond_39

    :cond_38
    move-object/from16 v0, v16

    iget-object v7, v0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    move-object/from16 v0, v16

    iget v8, v0, Lcom/saterskog/cell_lab/Cell;->D:I

    aget-object v7, v7, v8

    iget-object v7, v7, Lcom/saterskog/cell_lab/Gene;->s:Lcom/saterskog/cell_lab/h;

    sget-object v8, Lcom/saterskog/cell_lab/h;->h:Lcom/saterskog/cell_lab/h;

    if-ne v7, v8, :cond_3a

    move-object/from16 v0, v16

    iget v7, v0, Lcom/saterskog/cell_lab/Cell;->C:I

    const/4 v8, 0x5

    if-ge v7, v8, :cond_3a

    if-nez v4, :cond_3a

    :cond_39
    move-object/from16 v0, v20

    iget v7, v0, Lcom/saterskog/cell_lab/Cell;->C:I

    const/16 v8, 0x14

    if-ge v7, v8, :cond_3a

    move-object/from16 v0, v16

    iget v7, v0, Lcom/saterskog/cell_lab/Cell;->C:I

    const/16 v8, 0x14

    if-ge v7, v8, :cond_3a

    move-object/from16 v0, v20

    iget-wide v8, v0, Lcom/saterskog/cell_lab/Cell;->o:D

    const-wide v18, 0x3fb999999999999aL    # 0.1

    cmpl-double v7, v8, v18

    if-ltz v7, :cond_3a

    move-object/from16 v0, v16

    iget-wide v8, v0, Lcom/saterskog/cell_lab/Cell;->o:D

    const-wide v18, 0x3fb999999999999aL    # 0.1

    cmpl-double v7, v8, v18

    if-ltz v7, :cond_3a

    .line 1786
    const/4 v8, 0x1

    .line 1787
    const/4 v7, 0x0

    :goto_1d
    move-object/from16 v0, v20

    iget v9, v0, Lcom/saterskog/cell_lab/Cell;->C:I

    if-ge v7, v9, :cond_69

    .line 1788
    move-object/from16 v0, v20

    iget-object v9, v0, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    aget-object v9, v9, v7

    iget v9, v9, Lcom/saterskog/cell_lab/Link;->a:I

    if-ne v9, v11, :cond_4d

    .line 1789
    const/4 v7, 0x0

    .line 1792
    :goto_1e
    if-eqz v7, :cond_3a

    .line 1793
    move-object/from16 v0, v20

    iget-object v7, v0, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    move-object/from16 v0, v20

    iget v8, v0, Lcom/saterskog/cell_lab/Cell;->C:I

    aget-object v7, v7, v8

    .line 1794
    move-object/from16 v0, v16

    iget-object v8, v0, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    move-object/from16 v0, v16

    iget v9, v0, Lcom/saterskog/cell_lab/Cell;->C:I

    aget-object v8, v8, v9

    .line 1795
    const/4 v9, 0x0

    iput-boolean v9, v7, Lcom/saterskog/cell_lab/Link;->b:Z

    .line 1796
    const/4 v9, 0x0

    iput-boolean v9, v8, Lcom/saterskog/cell_lab/Link;->b:Z

    .line 1797
    iput v11, v7, Lcom/saterskog/cell_lab/Link;->a:I

    .line 1798
    move/from16 v0, p1

    iput v0, v8, Lcom/saterskog/cell_lab/Link;->a:I

    .line 1799
    move-object/from16 v0, v16

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->c:D

    move-wide/from16 v18, v0

    move-object/from16 v0, v20

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->c:D

    move-wide/from16 v22, v0

    sub-double v18, v18, v22

    move-object/from16 v0, v16

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->b:D

    move-wide/from16 v22, v0

    move-object/from16 v0, v20

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->b:D

    move-wide/from16 v24, v0

    sub-double v22, v22, v24

    move-wide/from16 v0, v18

    move-wide/from16 v2, v22

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v18

    .line 1800
    move-object/from16 v0, v20

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->k:D

    move-wide/from16 v22, v0

    sub-double v22, v18, v22

    move-wide/from16 v0, v22

    iput-wide v0, v8, Lcom/saterskog/cell_lab/Link;->d:D

    move-wide/from16 v0, v22

    iput-wide v0, v7, Lcom/saterskog/cell_lab/Link;->c:D

    .line 1801
    const-wide v22, 0x400921fb54442d18L    # Math.PI

    add-double v18, v18, v22

    move-object/from16 v0, v16

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->k:D

    move-wide/from16 v22, v0

    sub-double v18, v18, v22

    move-wide/from16 v0, v18

    iput-wide v0, v7, Lcom/saterskog/cell_lab/Link;->d:D

    move-wide/from16 v0, v18

    iput-wide v0, v8, Lcom/saterskog/cell_lab/Link;->c:D

    .line 1802
    const/high16 v9, 0x3f000000    # 0.5f

    iput v9, v7, Lcom/saterskog/cell_lab/Link;->k:F

    .line 1803
    const/high16 v9, 0x3f000000    # 0.5f

    iput v9, v8, Lcom/saterskog/cell_lab/Link;->k:F

    .line 1804
    const/4 v9, 0x0

    iput v9, v7, Lcom/saterskog/cell_lab/Link;->l:F

    .line 1805
    const/4 v7, 0x0

    iput v7, v8, Lcom/saterskog/cell_lab/Link;->l:F

    .line 1806
    move-object/from16 v0, v20

    iget v7, v0, Lcom/saterskog/cell_lab/Cell;->C:I

    add-int/lit8 v7, v7, 0x1

    move-object/from16 v0, v20

    iput v7, v0, Lcom/saterskog/cell_lab/Cell;->C:I

    .line 1807
    move-object/from16 v0, v16

    iget v7, v0, Lcom/saterskog/cell_lab/Cell;->C:I

    add-int/lit8 v7, v7, 0x1

    move-object/from16 v0, v16

    iput v7, v0, Lcom/saterskog/cell_lab/Cell;->C:I

    .line 1811
    :cond_3a
    sget-object v7, Lcom/saterskog/cell_lab/h;->d:Lcom/saterskog/cell_lab/h;

    move-object/from16 v0, v21

    if-ne v0, v7, :cond_3c

    .line 1813
    if-nez v6, :cond_3c

    .line 1814
    const-wide v8, 0x3fe70a3d70a3d70aL    # 0.72

    move-object/from16 v0, p0

    iget-wide v0, v0, Lcom/saterskog/cell_lab/CellWorld;->T:D

    move-wide/from16 v18, v0

    mul-double v8, v8, v18

    .line 1815
    move-object/from16 v0, v16

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->w:D

    move-wide/from16 v18, v0

    const-wide v22, 0x3fa26e978d4fdf3bL    # 0.036

    sub-double v18, v18, v22

    cmpl-double v7, v8, v18

    if-lez v7, :cond_3b

    move-object/from16 v0, v16

    iget-wide v8, v0, Lcom/saterskog/cell_lab/Cell;->w:D

    const-wide v18, 0x3fa26e978d4fdf3bL    # 0.036

    sub-double v8, v8, v18

    .line 1816
    :cond_3b
    move-object/from16 v0, v20

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->w:D

    move-wide/from16 v18, v0

    add-double v18, v18, v8

    move-wide/from16 v0, v18

    move-object/from16 v2, v20

    iput-wide v0, v2, Lcom/saterskog/cell_lab/Cell;->w:D

    .line 1817
    move-object/from16 v0, v16

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->w:D

    move-wide/from16 v18, v0

    sub-double v18, v18, v8

    move-wide/from16 v0, v18

    move-object/from16 v2, v16

    iput-wide v0, v2, Lcom/saterskog/cell_lab/Cell;->w:D

    .line 1818
    move-object/from16 v0, v20

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->p:D

    move-wide/from16 v18, v0

    move-object/from16 v0, v16

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->p:D

    move-wide/from16 v22, v0

    mul-double v22, v22, v8

    move-object/from16 v0, v16

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->w:D

    move-wide/from16 v24, v0

    div-double v22, v22, v24

    add-double v18, v18, v22

    move-wide/from16 v0, v18

    move-object/from16 v2, v20

    iput-wide v0, v2, Lcom/saterskog/cell_lab/Cell;->p:D

    .line 1819
    move-object/from16 v0, v16

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->p:D

    move-wide/from16 v18, v0

    move-object/from16 v0, v16

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->p:D

    move-wide/from16 v22, v0

    mul-double v22, v22, v8

    move-object/from16 v0, v16

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->w:D

    move-wide/from16 v24, v0

    div-double v22, v22, v24

    sub-double v18, v18, v22

    move-wide/from16 v0, v18

    move-object/from16 v2, v16

    iput-wide v0, v2, Lcom/saterskog/cell_lab/Cell;->p:D

    .line 1820
    move-object/from16 v0, v20

    iget v7, v0, Lcom/saterskog/cell_lab/Cell;->X:F

    float-to-double v0, v7

    move-wide/from16 v18, v0

    move-object/from16 v0, v16

    iget v7, v0, Lcom/saterskog/cell_lab/Cell;->X:F

    float-to-double v0, v7

    move-wide/from16 v22, v0

    mul-double v22, v22, v8

    move-object/from16 v0, v16

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->w:D

    move-wide/from16 v24, v0

    div-double v22, v22, v24

    add-double v18, v18, v22

    move-wide/from16 v0, v18

    double-to-float v7, v0

    move-object/from16 v0, v20

    iput v7, v0, Lcom/saterskog/cell_lab/Cell;->X:F

    .line 1821
    move-object/from16 v0, v16

    iget v7, v0, Lcom/saterskog/cell_lab/Cell;->X:F

    float-to-double v0, v7

    move-wide/from16 v18, v0

    move-object/from16 v0, v16

    iget v7, v0, Lcom/saterskog/cell_lab/Cell;->X:F

    float-to-double v0, v7

    move-wide/from16 v22, v0

    mul-double v8, v8, v22

    move-object/from16 v0, v16

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->w:D

    move-wide/from16 v22, v0

    div-double v8, v8, v22

    sub-double v8, v18, v8

    double-to-float v7, v8

    move-object/from16 v0, v16

    iput v7, v0, Lcom/saterskog/cell_lab/Cell;->X:F

    .line 1824
    :cond_3c
    sget-object v7, Lcom/saterskog/cell_lab/h;->d:Lcom/saterskog/cell_lab/h;

    move-object/from16 v0, v17

    if-ne v0, v7, :cond_3e

    .line 1826
    if-nez v4, :cond_3e

    .line 1827
    const-wide v8, 0x3fe70a3d70a3d70aL    # 0.72

    move-object/from16 v0, p0

    iget-wide v0, v0, Lcom/saterskog/cell_lab/CellWorld;->T:D

    move-wide/from16 v18, v0

    mul-double v8, v8, v18

    .line 1828
    move-object/from16 v0, v20

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->w:D

    move-wide/from16 v18, v0

    const-wide v22, 0x3fa26e978d4fdf3bL    # 0.036

    sub-double v18, v18, v22

    cmpl-double v7, v8, v18

    if-lez v7, :cond_3d

    move-object/from16 v0, v20

    iget-wide v8, v0, Lcom/saterskog/cell_lab/Cell;->w:D

    const-wide v18, 0x3fa26e978d4fdf3bL    # 0.036

    sub-double v8, v8, v18

    .line 1829
    :cond_3d
    move-object/from16 v0, v16

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->w:D

    move-wide/from16 v18, v0

    add-double v18, v18, v8

    move-wide/from16 v0, v18

    move-object/from16 v2, v16

    iput-wide v0, v2, Lcom/saterskog/cell_lab/Cell;->w:D

    .line 1830
    move-object/from16 v0, v20

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->w:D

    move-wide/from16 v18, v0

    sub-double v18, v18, v8

    move-wide/from16 v0, v18

    move-object/from16 v2, v20

    iput-wide v0, v2, Lcom/saterskog/cell_lab/Cell;->w:D

    .line 1831
    move-object/from16 v0, v16

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->p:D

    move-wide/from16 v18, v0

    move-object/from16 v0, v20

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->p:D

    move-wide/from16 v22, v0

    mul-double v22, v22, v8

    move-object/from16 v0, v20

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->w:D

    move-wide/from16 v24, v0

    div-double v22, v22, v24

    add-double v18, v18, v22

    move-wide/from16 v0, v18

    move-object/from16 v2, v16

    iput-wide v0, v2, Lcom/saterskog/cell_lab/Cell;->p:D

    .line 1832
    move-object/from16 v0, v20

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->p:D

    move-wide/from16 v18, v0

    move-object/from16 v0, v20

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->p:D

    move-wide/from16 v22, v0

    mul-double v22, v22, v8

    move-object/from16 v0, v20

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->w:D

    move-wide/from16 v24, v0

    div-double v22, v22, v24

    sub-double v18, v18, v22

    move-wide/from16 v0, v18

    move-object/from16 v2, v20

    iput-wide v0, v2, Lcom/saterskog/cell_lab/Cell;->p:D

    .line 1833
    move-object/from16 v0, v16

    iget v7, v0, Lcom/saterskog/cell_lab/Cell;->X:F

    float-to-double v0, v7

    move-wide/from16 v18, v0

    move-object/from16 v0, v20

    iget v7, v0, Lcom/saterskog/cell_lab/Cell;->X:F

    float-to-double v0, v7

    move-wide/from16 v22, v0

    mul-double v22, v22, v8

    move-object/from16 v0, v20

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->w:D

    move-wide/from16 v24, v0

    div-double v22, v22, v24

    add-double v18, v18, v22

    move-wide/from16 v0, v18

    double-to-float v7, v0

    move-object/from16 v0, v16

    iput v7, v0, Lcom/saterskog/cell_lab/Cell;->X:F

    .line 1834
    move-object/from16 v0, v20

    iget v7, v0, Lcom/saterskog/cell_lab/Cell;->X:F

    float-to-double v0, v7

    move-wide/from16 v18, v0

    move-object/from16 v0, v20

    iget v7, v0, Lcom/saterskog/cell_lab/Cell;->X:F

    float-to-double v0, v7

    move-wide/from16 v22, v0

    mul-double v8, v8, v22

    move-object/from16 v0, v20

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->w:D

    move-wide/from16 v22, v0

    div-double v8, v8, v22

    sub-double v8, v18, v8

    double-to-float v7, v8

    move-object/from16 v0, v20

    iput v7, v0, Lcom/saterskog/cell_lab/Cell;->X:F

    .line 1837
    :cond_3e
    sget-object v7, Lcom/saterskog/cell_lab/h;->o:Lcom/saterskog/cell_lab/h;

    move-object/from16 v0, v21

    if-ne v0, v7, :cond_52

    move-object/from16 v0, v20

    iget-wide v8, v0, Lcom/saterskog/cell_lab/Cell;->p:D

    const-wide v18, 0x3fc999999999999aL    # 0.2

    cmpl-double v7, v8, v18

    if-ltz v7, :cond_52

    .line 1838
    move-object/from16 v0, v20

    iget-object v7, v0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    move-object/from16 v0, v20

    iget v8, v0, Lcom/saterskog/cell_lab/Cell;->D:I

    aget-object v7, v7, v8

    iget-object v7, v7, Lcom/saterskog/cell_lab/Gene;->u:[I

    const/4 v8, 0x4

    aget v8, v7, v8

    .line 1839
    const/4 v7, 0x1

    if-ne v8, v7, :cond_40

    if-nez v6, :cond_40

    sget-object v6, Lcom/saterskog/cell_lab/h;->o:Lcom/saterskog/cell_lab/h;

    move-object/from16 v0, v17

    if-ne v0, v6, :cond_3f

    const/4 v6, 0x4

    move-object/from16 v0, v16

    invoke-virtual {v0, v6}, Lcom/saterskog/cell_lab/Cell;->b(I)I

    move-result v6

    const/4 v7, 0x1

    if-eq v6, v7, :cond_40

    .line 1840
    :cond_3f
    move-object/from16 v0, v16

    iget v6, v0, Lcom/saterskog/cell_lab/Cell;->X:F

    float-to-double v6, v6

    const-wide/high16 v18, 0x404e000000000000L    # 60.0

    move-object/from16 v0, p0

    iget-wide v0, v0, Lcom/saterskog/cell_lab/CellWorld;->T:D

    move-wide/from16 v22, v0

    mul-double v18, v18, v22

    add-double v6, v6, v18

    double-to-float v6, v6

    move-object/from16 v0, v16

    iput v6, v0, Lcom/saterskog/cell_lab/Cell;->X:F

    .line 1841
    :cond_40
    const/4 v6, 0x2

    if-ne v8, v6, :cond_42

    sget-object v6, Lcom/saterskog/cell_lab/h;->f:Lcom/saterskog/cell_lab/h;

    move-object/from16 v0, v17

    if-eq v0, v6, :cond_42

    .line 1842
    sget-object v6, Lcom/saterskog/cell_lab/h;->o:Lcom/saterskog/cell_lab/h;

    move-object/from16 v0, v17

    if-ne v0, v6, :cond_41

    const/4 v6, 0x4

    move-object/from16 v0, v16

    invoke-virtual {v0, v6}, Lcom/saterskog/cell_lab/Cell;->b(I)I

    move-result v6

    const/4 v7, 0x2

    if-eq v6, v7, :cond_42

    .line 1843
    :cond_41
    move-object/from16 v0, v16

    iget v6, v0, Lcom/saterskog/cell_lab/Cell;->Y:F

    float-to-double v6, v6

    const-wide v18, 0x3fb99999a0000000L    # 0.10000000149011612

    move-object/from16 v0, p0

    iget-wide v0, v0, Lcom/saterskog/cell_lab/CellWorld;->T:D

    move-wide/from16 v22, v0

    mul-double v18, v18, v22

    add-double v6, v6, v18

    double-to-float v6, v6

    move-object/from16 v0, v16

    iput v6, v0, Lcom/saterskog/cell_lab/Cell;->Y:F

    .line 1844
    :cond_42
    const/4 v6, 0x3

    if-ne v8, v6, :cond_50

    move-object/from16 v0, v20

    iget-wide v6, v0, Lcom/saterskog/cell_lab/Cell;->o:D

    const-wide/high16 v18, 0x3fe0000000000000L    # 0.5

    cmpl-double v6, v6, v18

    if-lez v6, :cond_50

    .line 1846
    const/4 v6, 0x0

    :goto_1f
    move-object/from16 v0, v16

    iget v7, v0, Lcom/saterskog/cell_lab/Cell;->C:I

    if-ge v6, v7, :cond_50

    .line 1848
    move-object/from16 v0, v16

    iget-object v7, v0, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    aget-object v7, v7, v6

    iget v7, v7, Lcom/saterskog/cell_lab/Link;->a:I

    const/4 v9, -0x1

    if-ne v7, v9, :cond_4e

    .line 1849
    move-object/from16 v0, v20

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->b:D

    move-wide/from16 v18, v0

    const-wide/16 v22, 0x0

    sub-double v18, v18, v22

    move-object/from16 v0, v20

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->b:D

    move-wide/from16 v22, v0

    const-wide/16 v24, 0x0

    sub-double v22, v22, v24

    mul-double v18, v18, v22

    move-object/from16 v0, v20

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->c:D

    move-wide/from16 v22, v0

    const-wide/16 v24, 0x0

    sub-double v22, v22, v24

    move-object/from16 v0, v20

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->c:D

    move-wide/from16 v24, v0

    const-wide/16 v26, 0x0

    sub-double v24, v24, v26

    mul-double v22, v22, v24

    add-double v18, v18, v22

    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v0, v7, Lcom/saterskog/cell_lab/Environment;->k:D

    move-wide/from16 v22, v0

    move-object/from16 v0, v20

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->d:D

    move-wide/from16 v24, v0

    sub-double v22, v22, v24

    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v0, v7, Lcom/saterskog/cell_lab/Environment;->k:D

    move-wide/from16 v24, v0

    move-object/from16 v0, v20

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->d:D

    move-wide/from16 v26, v0

    sub-double v24, v24, v26

    mul-double v22, v22, v24

    cmpl-double v7, v18, v22

    if-ltz v7, :cond_44

    .line 1850
    move-object/from16 v0, v16

    iget v7, v0, Lcom/saterskog/cell_lab/Cell;->C:I

    add-int/lit8 v7, v7, -0x1

    move-object/from16 v0, v16

    iput v7, v0, Lcom/saterskog/cell_lab/Cell;->C:I

    .line 1851
    move-object/from16 v0, v16

    iget-object v7, v0, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    aget-object v7, v7, v6

    move-object/from16 v0, v16

    iget-object v9, v0, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    move-object/from16 v0, v16

    iget v0, v0, Lcom/saterskog/cell_lab/Cell;->C:I

    move/from16 v18, v0

    aget-object v9, v9, v18

    invoke-virtual {v7, v9}, Lcom/saterskog/cell_lab/Link;->a(Lcom/saterskog/cell_lab/Link;)V

    .line 1866
    :cond_43
    add-int/lit8 v6, v6, -0x1

    .line 1846
    :cond_44
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_1f

    .line 1516
    :cond_45
    const/4 v6, 0x0

    goto/16 :goto_12

    .line 1518
    :cond_46
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_13

    .line 1568
    :cond_47
    invoke-static {v6, v7}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v38

    .line 1569
    move-object/from16 v0, v20

    iget-object v0, v0, Lcom/saterskog/cell_lab/Cell;->A:[Lcom/saterskog/cell_lab/u;

    move-object/from16 v40, v0

    move-object/from16 v0, v20

    iget v0, v0, Lcom/saterskog/cell_lab/Cell;->B:I

    move/from16 v41, v0

    aget-object v40, v40, v41

    .line 1570
    move-object/from16 v0, v20

    iget v0, v0, Lcom/saterskog/cell_lab/Cell;->B:I

    move/from16 v41, v0

    add-int/lit8 v41, v41, 0x1

    move/from16 v0, v41

    move-object/from16 v1, v20

    iput v0, v1, Lcom/saterskog/cell_lab/Cell;->B:I

    .line 1571
    move-object/from16 v0, v16

    iget-object v0, v0, Lcom/saterskog/cell_lab/Cell;->A:[Lcom/saterskog/cell_lab/u;

    move-object/from16 v41, v0

    move-object/from16 v0, v16

    iget v0, v0, Lcom/saterskog/cell_lab/Cell;->B:I

    move/from16 v42, v0

    aget-object v41, v41, v42

    .line 1572
    move-object/from16 v0, v16

    iget v0, v0, Lcom/saterskog/cell_lab/Cell;->B:I

    move/from16 v42, v0

    add-int/lit8 v42, v42, 0x1

    move/from16 v0, v42

    move-object/from16 v1, v16

    iput v0, v1, Lcom/saterskog/cell_lab/Cell;->B:I

    .line 1573
    const-wide/high16 v42, 0x4000000000000000L    # 2.0

    mul-double v42, v42, v28

    div-double v38, v38, v42

    .line 1574
    sub-double v42, v22, v14

    mul-double v42, v42, v38

    add-double v42, v42, v36

    move-wide/from16 v0, v42

    move-object/from16 v2, v40

    iput-wide v0, v2, Lcom/saterskog/cell_lab/u;->a:D

    .line 1575
    sub-double v42, v18, v12

    mul-double v42, v42, v38

    sub-double v42, v30, v42

    move-wide/from16 v0, v42

    move-object/from16 v2, v40

    iput-wide v0, v2, Lcom/saterskog/cell_lab/u;->b:D

    .line 1576
    sub-double v42, v22, v14

    mul-double v42, v42, v38

    sub-double v36, v36, v42

    move-wide/from16 v0, v36

    move-object/from16 v2, v40

    iput-wide v0, v2, Lcom/saterskog/cell_lab/u;->c:D

    .line 1577
    sub-double v36, v18, v12

    mul-double v36, v36, v38

    add-double v30, v30, v36

    move-wide/from16 v0, v30

    move-object/from16 v2, v40

    iput-wide v0, v2, Lcom/saterskog/cell_lab/u;->d:D

    .line 1580
    move-object/from16 v0, v40

    iput v11, v0, Lcom/saterskog/cell_lab/u;->g:I

    .line 1581
    move/from16 v0, p1

    move-object/from16 v1, v41

    iput v0, v1, Lcom/saterskog/cell_lab/u;->g:I

    .line 1582
    const/16 v30, 0x0

    move/from16 v0, v30

    move-object/from16 v1, v40

    iput-boolean v0, v1, Lcom/saterskog/cell_lab/u;->e:Z

    .line 1583
    const/16 v30, 0x0

    move/from16 v0, v30

    move-object/from16 v1, v40

    iput-boolean v0, v1, Lcom/saterskog/cell_lab/u;->f:Z

    .line 1585
    move-object/from16 v0, v40

    iget-wide v0, v0, Lcom/saterskog/cell_lab/u;->c:D

    move-wide/from16 v30, v0

    add-double v30, v30, v12

    sub-double v30, v30, v18

    move-wide/from16 v0, v30

    move-object/from16 v2, v41

    iput-wide v0, v2, Lcom/saterskog/cell_lab/u;->a:D

    .line 1586
    move-object/from16 v0, v40

    iget-wide v0, v0, Lcom/saterskog/cell_lab/u;->d:D

    move-wide/from16 v30, v0

    add-double v30, v30, v14

    sub-double v30, v30, v22

    move-wide/from16 v0, v30

    move-object/from16 v2, v41

    iput-wide v0, v2, Lcom/saterskog/cell_lab/u;->b:D

    .line 1587
    move-object/from16 v0, v40

    iget-wide v0, v0, Lcom/saterskog/cell_lab/u;->a:D

    move-wide/from16 v30, v0

    add-double v30, v30, v12

    sub-double v30, v30, v18

    move-wide/from16 v0, v30

    move-object/from16 v2, v41

    iput-wide v0, v2, Lcom/saterskog/cell_lab/u;->c:D

    .line 1588
    move-object/from16 v0, v40

    iget-wide v0, v0, Lcom/saterskog/cell_lab/u;->b:D

    move-wide/from16 v30, v0

    add-double v30, v30, v14

    sub-double v30, v30, v22

    move-wide/from16 v0, v30

    move-object/from16 v2, v41

    iput-wide v0, v2, Lcom/saterskog/cell_lab/u;->d:D

    .line 1590
    const/16 v30, 0x0

    move/from16 v0, v30

    move-object/from16 v1, v41

    iput-boolean v0, v1, Lcom/saterskog/cell_lab/u;->e:Z

    .line 1591
    const/16 v30, 0x0

    move/from16 v0, v30

    move-object/from16 v1, v41

    iput-boolean v0, v1, Lcom/saterskog/cell_lab/u;->f:Z

    goto/16 :goto_16

    .line 1635
    :cond_48
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_17

    .line 1696
    :cond_49
    move-object/from16 v0, v20

    iget v8, v0, Lcom/saterskog/cell_lab/Cell;->D:I

    const/4 v9, 0x1

    move-object/from16 v0, v16

    invoke-virtual {v0, v9}, Lcom/saterskog/cell_lab/Cell;->b(I)I

    move-result v9

    if-eq v8, v9, :cond_4a

    const/4 v8, 0x1

    move-object/from16 v0, v20

    invoke-virtual {v0, v8}, Lcom/saterskog/cell_lab/Cell;->b(I)I

    move-result v8

    move-object/from16 v0, v16

    iget v9, v0, Lcom/saterskog/cell_lab/Cell;->D:I

    if-ne v8, v9, :cond_2f

    .line 1697
    :cond_4a
    const-wide/16 v8, 0x0

    mul-double/2addr v6, v8

    goto/16 :goto_19

    .line 1707
    :cond_4b
    const/4 v7, 0x0

    goto/16 :goto_1a

    .line 1709
    :cond_4c
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_1b

    .line 1787
    :cond_4d
    add-int/lit8 v7, v7, 0x1

    goto/16 :goto_1d

    .line 1856
    :cond_4e
    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    move-object/from16 v0, v16

    iget-object v9, v0, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    aget-object v9, v9, v6

    iget v9, v9, Lcom/saterskog/cell_lab/Link;->a:I

    aget-object v9, v7, v9

    .line 1857
    move-object/from16 v0, v20

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->b:D

    move-wide/from16 v18, v0

    iget-wide v0, v9, Lcom/saterskog/cell_lab/Cell;->b:D

    move-wide/from16 v22, v0

    sub-double v18, v18, v22

    move-object/from16 v0, v20

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->b:D

    move-wide/from16 v22, v0

    iget-wide v0, v9, Lcom/saterskog/cell_lab/Cell;->b:D

    move-wide/from16 v24, v0

    sub-double v22, v22, v24

    mul-double v18, v18, v22

    move-object/from16 v0, v20

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->c:D

    move-wide/from16 v22, v0

    iget-wide v0, v9, Lcom/saterskog/cell_lab/Cell;->c:D

    move-wide/from16 v24, v0

    sub-double v22, v22, v24

    move-object/from16 v0, v20

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->c:D

    move-wide/from16 v24, v0

    iget-wide v0, v9, Lcom/saterskog/cell_lab/Cell;->c:D

    move-wide/from16 v26, v0

    sub-double v24, v24, v26

    mul-double v22, v22, v24

    add-double v18, v18, v22

    move-object/from16 v0, v20

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->d:D

    move-wide/from16 v22, v0

    iget-wide v0, v9, Lcom/saterskog/cell_lab/Cell;->d:D

    move-wide/from16 v24, v0

    add-double v22, v22, v24

    move-object/from16 v0, v20

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->d:D

    move-wide/from16 v24, v0

    iget-wide v0, v9, Lcom/saterskog/cell_lab/Cell;->d:D

    move-wide/from16 v26, v0

    add-double v24, v24, v26

    mul-double v22, v22, v24

    cmpg-double v7, v18, v22

    if-gtz v7, :cond_44

    .line 1858
    move-object/from16 v0, v16

    iget v7, v0, Lcom/saterskog/cell_lab/Cell;->C:I

    add-int/lit8 v7, v7, -0x1

    move-object/from16 v0, v16

    iput v7, v0, Lcom/saterskog/cell_lab/Cell;->C:I

    .line 1859
    move-object/from16 v0, v16

    iget-object v7, v0, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    aget-object v7, v7, v6

    move-object/from16 v0, v16

    iget-object v0, v0, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    move-object/from16 v18, v0

    move-object/from16 v0, v16

    iget v0, v0, Lcom/saterskog/cell_lab/Cell;->C:I

    move/from16 v19, v0

    aget-object v18, v18, v19

    move-object/from16 v0, v18

    invoke-virtual {v7, v0}, Lcom/saterskog/cell_lab/Link;->a(Lcom/saterskog/cell_lab/Link;)V

    .line 1860
    const/4 v7, 0x0

    :goto_20
    iget v0, v9, Lcom/saterskog/cell_lab/Cell;->C:I

    move/from16 v18, v0

    move/from16 v0, v18

    if-ge v7, v0, :cond_43

    .line 1861
    iget-object v0, v9, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    move-object/from16 v18, v0

    aget-object v18, v18, v7

    move-object/from16 v0, v18

    iget v0, v0, Lcom/saterskog/cell_lab/Link;->a:I

    move/from16 v18, v0

    move/from16 v0, v18

    if-ne v0, v11, :cond_4f

    .line 1862
    iget v0, v9, Lcom/saterskog/cell_lab/Cell;->C:I

    move/from16 v18, v0

    add-int/lit8 v18, v18, -0x1

    move/from16 v0, v18

    iput v0, v9, Lcom/saterskog/cell_lab/Cell;->C:I

    .line 1863
    iget-object v0, v9, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    move-object/from16 v18, v0

    aget-object v18, v18, v7

    iget-object v0, v9, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    move-object/from16 v19, v0

    iget v0, v9, Lcom/saterskog/cell_lab/Cell;->C:I

    move/from16 v22, v0

    aget-object v19, v19, v22

    invoke-virtual/range {v18 .. v19}, Lcom/saterskog/cell_lab/Link;->a(Lcom/saterskog/cell_lab/Link;)V

    .line 1860
    :cond_4f
    add-int/lit8 v7, v7, 0x1

    goto :goto_20

    .line 1871
    :cond_50
    const/4 v6, 0x7

    if-gt v6, v8, :cond_51

    const/16 v6, 0xb

    if-ge v8, v6, :cond_51

    sget-object v6, Lcom/saterskog/cell_lab/h;->e:Lcom/saterskog/cell_lab/h;

    move-object/from16 v0, v17

    if-eq v0, v6, :cond_51

    .line 1872
    move-object/from16 v0, v16

    iget-object v6, v0, Lcom/saterskog/cell_lab/Cell;->U:[F

    add-int/lit8 v7, v8, -0x7

    aget v9, v6, v7

    float-to-double v0, v9

    move-wide/from16 v18, v0

    const-wide/high16 v22, 0x404e000000000000L    # 60.0

    move-object/from16 v0, p0

    iget-wide v0, v0, Lcom/saterskog/cell_lab/CellWorld;->T:D

    move-wide/from16 v24, v0

    mul-double v22, v22, v24

    sub-double v18, v18, v22

    move-wide/from16 v0, v18

    double-to-float v9, v0

    aput v9, v6, v7

    .line 1873
    :cond_51
    const/16 v6, 0xb

    if-gt v6, v8, :cond_52

    const/16 v6, 0xf

    if-ge v8, v6, :cond_52

    sget-object v6, Lcom/saterskog/cell_lab/h;->e:Lcom/saterskog/cell_lab/h;

    move-object/from16 v0, v17

    if-eq v0, v6, :cond_52

    .line 1874
    move-object/from16 v0, v16

    iget-object v6, v0, Lcom/saterskog/cell_lab/Cell;->U:[F

    add-int/lit8 v7, v8, -0x7

    add-int/lit8 v7, v7, -0x4

    aget v8, v6, v7

    float-to-double v8, v8

    const-wide/high16 v18, 0x404e000000000000L    # 60.0

    move-object/from16 v0, p0

    iget-wide v0, v0, Lcom/saterskog/cell_lab/CellWorld;->T:D

    move-wide/from16 v22, v0

    mul-double v18, v18, v22

    add-double v8, v8, v18

    double-to-float v8, v8

    aput v8, v6, v7

    .line 1876
    :cond_52
    sget-object v6, Lcom/saterskog/cell_lab/h;->o:Lcom/saterskog/cell_lab/h;

    move-object/from16 v0, v17

    if-ne v0, v6, :cond_5d

    move-object/from16 v0, v16

    iget-wide v6, v0, Lcom/saterskog/cell_lab/Cell;->p:D

    const-wide v8, 0x3fc999999999999aL    # 0.2

    cmpl-double v6, v6, v8

    if-ltz v6, :cond_5d

    .line 1877
    move-object/from16 v0, v16

    iget-object v6, v0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    move-object/from16 v0, v16

    iget v7, v0, Lcom/saterskog/cell_lab/Cell;->D:I

    aget-object v6, v6, v7

    iget-object v6, v6, Lcom/saterskog/cell_lab/Gene;->u:[I

    const/4 v7, 0x4

    aget v8, v6, v7

    .line 1878
    const/4 v6, 0x1

    if-ne v8, v6, :cond_54

    if-nez v4, :cond_54

    sget-object v6, Lcom/saterskog/cell_lab/h;->o:Lcom/saterskog/cell_lab/h;

    move-object/from16 v0, v21

    if-ne v0, v6, :cond_53

    const/4 v6, 0x4

    move-object/from16 v0, v20

    invoke-virtual {v0, v6}, Lcom/saterskog/cell_lab/Cell;->b(I)I

    move-result v6

    const/4 v7, 0x1

    if-eq v6, v7, :cond_54

    .line 1879
    :cond_53
    move-object/from16 v0, v20

    iget v6, v0, Lcom/saterskog/cell_lab/Cell;->X:F

    float-to-double v6, v6

    const-wide/high16 v18, 0x404e000000000000L    # 60.0

    move-object/from16 v0, p0

    iget-wide v0, v0, Lcom/saterskog/cell_lab/CellWorld;->T:D

    move-wide/from16 v22, v0

    mul-double v18, v18, v22

    add-double v6, v6, v18

    double-to-float v6, v6

    move-object/from16 v0, v20

    iput v6, v0, Lcom/saterskog/cell_lab/Cell;->X:F

    .line 1880
    :cond_54
    const/4 v6, 0x2

    if-ne v8, v6, :cond_56

    sget-object v6, Lcom/saterskog/cell_lab/h;->f:Lcom/saterskog/cell_lab/h;

    move-object/from16 v0, v21

    if-eq v0, v6, :cond_56

    .line 1881
    sget-object v6, Lcom/saterskog/cell_lab/h;->o:Lcom/saterskog/cell_lab/h;

    move-object/from16 v0, v21

    if-ne v0, v6, :cond_55

    const/4 v6, 0x4

    move-object/from16 v0, v20

    invoke-virtual {v0, v6}, Lcom/saterskog/cell_lab/Cell;->b(I)I

    move-result v6

    const/4 v7, 0x2

    if-eq v6, v7, :cond_56

    .line 1882
    :cond_55
    move-object/from16 v0, v20

    iget v6, v0, Lcom/saterskog/cell_lab/Cell;->Y:F

    float-to-double v6, v6

    const-wide v18, 0x3fb99999a0000000L    # 0.10000000149011612

    move-object/from16 v0, p0

    iget-wide v0, v0, Lcom/saterskog/cell_lab/CellWorld;->T:D

    move-wide/from16 v22, v0

    mul-double v18, v18, v22

    add-double v6, v6, v18

    double-to-float v6, v6

    move-object/from16 v0, v20

    iput v6, v0, Lcom/saterskog/cell_lab/Cell;->Y:F

    .line 1883
    :cond_56
    const/4 v6, 0x3

    if-ne v8, v6, :cond_5b

    move-object/from16 v0, v16

    iget-wide v6, v0, Lcom/saterskog/cell_lab/Cell;->o:D

    const-wide/high16 v18, 0x3fe0000000000000L    # 0.5

    cmpl-double v6, v6, v18

    if-lez v6, :cond_5b

    .line 1885
    const/4 v6, 0x0

    :goto_21
    move-object/from16 v0, v20

    iget v7, v0, Lcom/saterskog/cell_lab/Cell;->C:I

    if-ge v6, v7, :cond_5b

    .line 1887
    move-object/from16 v0, v20

    iget-object v7, v0, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    aget-object v7, v7, v6

    iget v7, v7, Lcom/saterskog/cell_lab/Link;->a:I

    const/4 v9, -0x1

    if-ne v7, v9, :cond_59

    .line 1888
    move-object/from16 v0, v16

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->b:D

    move-wide/from16 v18, v0

    const-wide/16 v22, 0x0

    sub-double v18, v18, v22

    move-object/from16 v0, v16

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->b:D

    move-wide/from16 v22, v0

    const-wide/16 v24, 0x0

    sub-double v22, v22, v24

    mul-double v18, v18, v22

    move-object/from16 v0, v16

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->c:D

    move-wide/from16 v22, v0

    const-wide/16 v24, 0x0

    sub-double v22, v22, v24

    move-object/from16 v0, v16

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->c:D

    move-wide/from16 v24, v0

    const-wide/16 v26, 0x0

    sub-double v24, v24, v26

    mul-double v22, v22, v24

    add-double v18, v18, v22

    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v0, v7, Lcom/saterskog/cell_lab/Environment;->k:D

    move-wide/from16 v22, v0

    move-object/from16 v0, v16

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->d:D

    move-wide/from16 v24, v0

    sub-double v22, v22, v24

    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v0, v7, Lcom/saterskog/cell_lab/Environment;->k:D

    move-wide/from16 v24, v0

    move-object/from16 v0, v16

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->d:D

    move-wide/from16 v26, v0

    sub-double v24, v24, v26

    mul-double v22, v22, v24

    cmpl-double v7, v18, v22

    if-ltz v7, :cond_58

    .line 1889
    move-object/from16 v0, v20

    iget v7, v0, Lcom/saterskog/cell_lab/Cell;->C:I

    add-int/lit8 v7, v7, -0x1

    move-object/from16 v0, v20

    iput v7, v0, Lcom/saterskog/cell_lab/Cell;->C:I

    .line 1890
    move-object/from16 v0, v20

    iget-object v7, v0, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    aget-object v7, v7, v6

    move-object/from16 v0, v20

    iget-object v9, v0, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    move-object/from16 v0, v20

    iget v11, v0, Lcom/saterskog/cell_lab/Cell;->C:I

    aget-object v9, v9, v11

    invoke-virtual {v7, v9}, Lcom/saterskog/cell_lab/Link;->a(Lcom/saterskog/cell_lab/Link;)V

    .line 1905
    :cond_57
    add-int/lit8 v6, v6, -0x1

    .line 1885
    :cond_58
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_21

    .line 1895
    :cond_59
    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    move-object/from16 v0, v20

    iget-object v9, v0, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    aget-object v9, v9, v6

    iget v9, v9, Lcom/saterskog/cell_lab/Link;->a:I

    aget-object v9, v7, v9

    .line 1896
    move-object/from16 v0, v20

    iget-object v7, v0, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    aget-object v7, v7, v6

    iget v7, v7, Lcom/saterskog/cell_lab/Link;->a:I

    move/from16 v0, p1

    if-eq v7, v0, :cond_58

    move-object/from16 v0, v16

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->b:D

    move-wide/from16 v18, v0

    iget-wide v0, v9, Lcom/saterskog/cell_lab/Cell;->b:D

    move-wide/from16 v22, v0

    sub-double v18, v18, v22

    move-object/from16 v0, v16

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->b:D

    move-wide/from16 v22, v0

    iget-wide v0, v9, Lcom/saterskog/cell_lab/Cell;->b:D

    move-wide/from16 v24, v0

    sub-double v22, v22, v24

    mul-double v18, v18, v22

    move-object/from16 v0, v16

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->c:D

    move-wide/from16 v22, v0

    iget-wide v0, v9, Lcom/saterskog/cell_lab/Cell;->c:D

    move-wide/from16 v24, v0

    sub-double v22, v22, v24

    move-object/from16 v0, v16

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->c:D

    move-wide/from16 v24, v0

    iget-wide v0, v9, Lcom/saterskog/cell_lab/Cell;->c:D

    move-wide/from16 v26, v0

    sub-double v24, v24, v26

    mul-double v22, v22, v24

    add-double v18, v18, v22

    move-object/from16 v0, v16

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->d:D

    move-wide/from16 v22, v0

    iget-wide v0, v9, Lcom/saterskog/cell_lab/Cell;->d:D

    move-wide/from16 v24, v0

    add-double v22, v22, v24

    move-object/from16 v0, v16

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->d:D

    move-wide/from16 v24, v0

    iget-wide v0, v9, Lcom/saterskog/cell_lab/Cell;->d:D

    move-wide/from16 v26, v0

    add-double v24, v24, v26

    mul-double v22, v22, v24

    cmpg-double v7, v18, v22

    if-gtz v7, :cond_58

    .line 1897
    move-object/from16 v0, v20

    iget v7, v0, Lcom/saterskog/cell_lab/Cell;->C:I

    add-int/lit8 v7, v7, -0x1

    move-object/from16 v0, v20

    iput v7, v0, Lcom/saterskog/cell_lab/Cell;->C:I

    .line 1898
    move-object/from16 v0, v20

    iget-object v7, v0, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    aget-object v7, v7, v6

    move-object/from16 v0, v20

    iget-object v11, v0, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    move-object/from16 v0, v20

    iget v0, v0, Lcom/saterskog/cell_lab/Cell;->C:I

    move/from16 v17, v0

    aget-object v11, v11, v17

    invoke-virtual {v7, v11}, Lcom/saterskog/cell_lab/Link;->a(Lcom/saterskog/cell_lab/Link;)V

    .line 1899
    const/4 v7, 0x0

    :goto_22
    iget v11, v9, Lcom/saterskog/cell_lab/Cell;->C:I

    if-ge v7, v11, :cond_57

    .line 1900
    iget-object v11, v9, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    aget-object v11, v11, v7

    iget v11, v11, Lcom/saterskog/cell_lab/Link;->a:I

    move/from16 v0, p1

    if-ne v11, v0, :cond_5a

    .line 1901
    iget v11, v9, Lcom/saterskog/cell_lab/Cell;->C:I

    add-int/lit8 v11, v11, -0x1

    iput v11, v9, Lcom/saterskog/cell_lab/Cell;->C:I

    .line 1902
    iget-object v11, v9, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    aget-object v11, v11, v7

    iget-object v0, v9, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    move-object/from16 v17, v0

    iget v0, v9, Lcom/saterskog/cell_lab/Cell;->C:I

    move/from16 v18, v0

    aget-object v17, v17, v18

    move-object/from16 v0, v17

    invoke-virtual {v11, v0}, Lcom/saterskog/cell_lab/Link;->a(Lcom/saterskog/cell_lab/Link;)V

    .line 1899
    :cond_5a
    add-int/lit8 v7, v7, 0x1

    goto :goto_22

    .line 1910
    :cond_5b
    const/4 v6, 0x7

    if-gt v6, v8, :cond_5c

    const/16 v6, 0xb

    if-ge v8, v6, :cond_5c

    sget-object v6, Lcom/saterskog/cell_lab/h;->e:Lcom/saterskog/cell_lab/h;

    move-object/from16 v0, v21

    if-eq v0, v6, :cond_5c

    .line 1911
    move-object/from16 v0, v20

    iget-object v6, v0, Lcom/saterskog/cell_lab/Cell;->U:[F

    add-int/lit8 v7, v8, -0x7

    aget v9, v6, v7

    float-to-double v0, v9

    move-wide/from16 v16, v0

    const-wide/high16 v18, 0x404e000000000000L    # 60.0

    move-object/from16 v0, p0

    iget-wide v0, v0, Lcom/saterskog/cell_lab/CellWorld;->T:D

    move-wide/from16 v22, v0

    mul-double v18, v18, v22

    sub-double v16, v16, v18

    move-wide/from16 v0, v16

    double-to-float v9, v0

    aput v9, v6, v7

    .line 1912
    :cond_5c
    const/16 v6, 0xb

    if-gt v6, v8, :cond_5d

    const/16 v6, 0xf

    if-ge v8, v6, :cond_5d

    sget-object v6, Lcom/saterskog/cell_lab/h;->e:Lcom/saterskog/cell_lab/h;

    move-object/from16 v0, v21

    if-eq v0, v6, :cond_5d

    .line 1913
    move-object/from16 v0, v20

    iget-object v6, v0, Lcom/saterskog/cell_lab/Cell;->U:[F

    add-int/lit8 v7, v8, -0x7

    add-int/lit8 v7, v7, -0x4

    aget v8, v6, v7

    float-to-double v8, v8

    const-wide/high16 v16, 0x404e000000000000L    # 60.0

    move-object/from16 v0, p0

    iget-wide v0, v0, Lcom/saterskog/cell_lab/CellWorld;->T:D

    move-wide/from16 v18, v0

    mul-double v16, v16, v18

    add-double v8, v8, v16

    double-to-float v8, v8

    aput v8, v6, v7

    .line 1528
    :cond_5d
    add-int/lit8 v6, v10, 0x1

    move v10, v6

    goto/16 :goto_15

    .line 1919
    :cond_5e
    move-object/from16 v0, v20

    iget-wide v4, v0, Lcom/saterskog/cell_lab/Cell;->b:D

    move-object/from16 v0, v20

    iget-wide v6, v0, Lcom/saterskog/cell_lab/Cell;->b:D

    mul-double/2addr v4, v6

    move-object/from16 v0, v20

    iget-wide v6, v0, Lcom/saterskog/cell_lab/Cell;->c:D

    move-object/from16 v0, v20

    iget-wide v8, v0, Lcom/saterskog/cell_lab/Cell;->c:D

    mul-double/2addr v6, v8

    add-double/2addr v4, v6

    .line 1920
    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v6, v6, Lcom/saterskog/cell_lab/Environment;->k:D

    move-object/from16 v0, v20

    iget-wide v8, v0, Lcom/saterskog/cell_lab/Cell;->d:D

    sub-double/2addr v6, v8

    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v8, v8, Lcom/saterskog/cell_lab/Environment;->k:D

    move-object/from16 v0, v20

    iget-wide v10, v0, Lcom/saterskog/cell_lab/Cell;->d:D

    sub-double/2addr v8, v10

    mul-double/2addr v6, v8

    cmpl-double v6, v4, v6

    if-ltz v6, :cond_61

    .line 1921
    invoke-static {v4, v5}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v6

    .line 1922
    move-object/from16 v0, v20

    iget-wide v4, v0, Lcom/saterskog/cell_lab/Cell;->d:D

    .line 1923
    neg-double v8, v6

    add-double/2addr v8, v4

    move-object/from16 v0, p0

    iget-object v10, v0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v10, v10, Lcom/saterskog/cell_lab/Environment;->k:D

    sub-double/2addr v8, v10

    neg-double v10, v6

    sub-double/2addr v10, v4

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    move-object/from16 v16, v0

    move-object/from16 v0, v16

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Environment;->k:D

    move-wide/from16 v16, v0

    add-double v10, v10, v16

    mul-double/2addr v8, v10

    neg-double v10, v6

    add-double/2addr v10, v4

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    move-object/from16 v16, v0

    move-object/from16 v0, v16

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Environment;->k:D

    move-wide/from16 v16, v0

    add-double v10, v10, v16

    mul-double/2addr v8, v10

    add-double v10, v6, v4

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    move-object/from16 v16, v0

    move-object/from16 v0, v16

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Environment;->k:D

    move-wide/from16 v16, v0

    add-double v10, v10, v16

    mul-double/2addr v8, v10

    invoke-static {v8, v9}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v8

    div-double/2addr v8, v6

    .line 1924
    move-object/from16 v0, p0

    iget-boolean v10, v0, Lcom/saterskog/cell_lab/CellWorld;->U:Z

    if-eqz v10, :cond_5f

    .line 1925
    move-object/from16 v0, v20

    iget v10, v0, Lcom/saterskog/cell_lab/Cell;->B:I

    const/16 v11, 0x14

    if-lt v10, v11, :cond_63

    .line 1926
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "skit: Cell touches too many neighbors (border in this case) (>"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/16 v5, 0x14

    .line 1927
    invoke-static {v5}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "), not supposed to normally happen and programmer was lazy enough to not gracefully handle this case."

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 1926
    invoke-static {v4}, Lcom/saterskog/b/a;->a(Ljava/lang/String;)V

    .line 1948
    :cond_5f
    :goto_23
    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-boolean v4, v4, Lcom/saterskog/cell_lab/Environment;->x:Z

    if-nez v4, :cond_61

    .line 1950
    const-wide v4, 0x407f400000000000L    # 500.0

    div-double/2addr v4, v6

    mul-double/2addr v4, v8

    mul-double/2addr v4, v8

    const-wide/high16 v8, 0x4000000000000000L    # 2.0

    mul-double/2addr v4, v8

    const/4 v8, 0x6

    move-object/from16 v0, v20

    invoke-virtual {v0, v8}, Lcom/saterskog/cell_lab/Cell;->a(I)F

    move-result v8

    float-to-double v8, v8

    mul-double/2addr v4, v8

    .line 1951
    move-object/from16 v0, v20

    iget-wide v8, v0, Lcom/saterskog/cell_lab/Cell;->g:D

    move-object/from16 v0, v20

    iget-wide v10, v0, Lcom/saterskog/cell_lab/Cell;->b:D

    mul-double/2addr v10, v4

    sub-double/2addr v8, v10

    move-object/from16 v0, v20

    iput-wide v8, v0, Lcom/saterskog/cell_lab/Cell;->g:D

    .line 1952
    move-object/from16 v0, v20

    iget-wide v8, v0, Lcom/saterskog/cell_lab/Cell;->h:D

    move-object/from16 v0, v20

    iget-wide v10, v0, Lcom/saterskog/cell_lab/Cell;->c:D

    mul-double/2addr v4, v10

    sub-double v4, v8, v4

    move-object/from16 v0, v20

    iput-wide v4, v0, Lcom/saterskog/cell_lab/Cell;->h:D

    .line 1954
    sget-object v4, Lcom/saterskog/cell_lab/h;->h:Lcom/saterskog/cell_lab/h;

    move-object/from16 v0, v21

    if-ne v0, v4, :cond_60

    move-object/from16 v0, v20

    iget v4, v0, Lcom/saterskog/cell_lab/Cell;->C:I

    const/4 v5, 0x5

    if-ge v4, v5, :cond_60

    move-object/from16 v0, v20

    iget v4, v0, Lcom/saterskog/cell_lab/Cell;->C:I

    const/16 v5, 0x14

    if-ge v4, v5, :cond_60

    .line 1955
    const/4 v5, 0x1

    .line 1956
    const/4 v4, 0x0

    :goto_24
    move-object/from16 v0, v20

    iget v8, v0, Lcom/saterskog/cell_lab/Cell;->C:I

    if-ge v4, v8, :cond_68

    .line 1957
    move-object/from16 v0, v20

    iget-object v8, v0, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    aget-object v8, v8, v4

    iget v8, v8, Lcom/saterskog/cell_lab/Link;->a:I

    const/4 v9, -0x1

    if-ne v8, v9, :cond_64

    .line 1958
    const/4 v4, 0x0

    .line 1961
    :goto_25
    if-eqz v4, :cond_60

    .line 1962
    move-object/from16 v0, v20

    iget-object v4, v0, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    move-object/from16 v0, v20

    iget v5, v0, Lcom/saterskog/cell_lab/Cell;->C:I

    aget-object v4, v4, v5

    .line 1963
    const/4 v5, 0x0

    iput-boolean v5, v4, Lcom/saterskog/cell_lab/Link;->b:Z

    .line 1964
    const/4 v5, -0x1

    iput v5, v4, Lcom/saterskog/cell_lab/Link;->a:I

    .line 1965
    move-object/from16 v0, v20

    iget-wide v8, v0, Lcom/saterskog/cell_lab/Cell;->c:D

    move-object/from16 v0, v20

    iget-wide v10, v0, Lcom/saterskog/cell_lab/Cell;->b:D

    invoke-static {v8, v9, v10, v11}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v8

    .line 1967
    move-object/from16 v0, v20

    iget-wide v10, v0, Lcom/saterskog/cell_lab/Cell;->k:D

    sub-double/2addr v8, v10

    iput-wide v8, v4, Lcom/saterskog/cell_lab/Link;->c:D

    .line 1968
    move-object/from16 v0, v20

    iget-wide v8, v0, Lcom/saterskog/cell_lab/Cell;->b:D

    div-double/2addr v8, v6

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v10, v5, Lcom/saterskog/cell_lab/Environment;->k:D

    sget-wide v12, Lcom/saterskog/cell_lab/Cell;->a:D

    const-wide v14, 0x3fd999999999999aL    # 0.4

    mul-double/2addr v12, v14

    add-double/2addr v10, v12

    mul-double/2addr v8, v10

    iput-wide v8, v4, Lcom/saterskog/cell_lab/Link;->e:D

    .line 1969
    move-object/from16 v0, v20

    iget-wide v8, v0, Lcom/saterskog/cell_lab/Cell;->c:D

    div-double v6, v8, v6

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v8, v5, Lcom/saterskog/cell_lab/Environment;->k:D

    sget-wide v10, Lcom/saterskog/cell_lab/Cell;->a:D

    const-wide v12, 0x3fd999999999999aL    # 0.4

    mul-double/2addr v10, v12

    add-double/2addr v8, v10

    mul-double/2addr v6, v8

    iput-wide v6, v4, Lcom/saterskog/cell_lab/Link;->f:D

    .line 1970
    const/high16 v5, 0x3f000000    # 0.5f

    iput v5, v4, Lcom/saterskog/cell_lab/Link;->k:F

    .line 1971
    const/4 v5, 0x0

    iput v5, v4, Lcom/saterskog/cell_lab/Link;->l:F

    .line 1972
    move-object/from16 v0, v20

    iget v4, v0, Lcom/saterskog/cell_lab/Cell;->C:I

    add-int/lit8 v4, v4, 0x1

    move-object/from16 v0, v20

    iput v4, v0, Lcom/saterskog/cell_lab/Cell;->C:I

    .line 1975
    :cond_60
    sget-object v4, Lcom/saterskog/cell_lab/h;->r:Lcom/saterskog/cell_lab/h;

    move-object/from16 v0, v21

    if-ne v0, v4, :cond_61

    .line 1977
    const/4 v5, 0x1

    .line 1978
    const/4 v4, 0x0

    :goto_26
    move-object/from16 v0, v20

    iget v6, v0, Lcom/saterskog/cell_lab/Cell;->C:I

    if-ge v4, v6, :cond_67

    .line 1979
    move-object/from16 v0, v20

    iget-object v6, v0, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    aget-object v6, v6, v4

    iget v6, v6, Lcom/saterskog/cell_lab/Link;->a:I

    const/4 v7, -0x1

    if-ne v6, v7, :cond_65

    const/4 v4, 0x0

    .line 1981
    :goto_27
    if-eqz v4, :cond_61

    .line 1982
    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/saterskog/cell_lab/CellWorld;->aY:[I

    move-object/from16 v0, p0

    iget v5, v0, Lcom/saterskog/cell_lab/CellWorld;->aX:I

    aput p1, v4, v5

    .line 1983
    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/saterskog/cell_lab/CellWorld;->aZ:[I

    move-object/from16 v0, p0

    iget v5, v0, Lcom/saterskog/cell_lab/CellWorld;->aX:I

    const/4 v6, -0x1

    aput v6, v4, v5

    .line 1984
    move-object/from16 v0, p0

    iget v4, v0, Lcom/saterskog/cell_lab/CellWorld;->aX:I

    add-int/lit8 v4, v4, 0x1

    move-object/from16 v0, p0

    iput v4, v0, Lcom/saterskog/cell_lab/CellWorld;->aX:I

    .line 1989
    :cond_61
    move-object/from16 v0, v20

    iget-wide v4, v0, Lcom/saterskog/cell_lab/Cell;->d:D

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v6, v6, Lcom/saterskog/cell_lab/Environment;->g:D

    mul-double/2addr v4, v6

    .line 1990
    const-wide/high16 v6, 0x3ff0000000000000L    # 1.0

    const-wide/high16 v8, 0x3ff0000000000000L    # 1.0

    move-object/from16 v0, p0

    iget-wide v10, v0, Lcom/saterskog/cell_lab/CellWorld;->T:D

    mul-double/2addr v8, v10

    mul-double/2addr v8, v4

    const-wide/high16 v10, 0x3fe0000000000000L    # 0.5

    mul-double/2addr v8, v10

    move-object/from16 v0, v20

    iget-wide v10, v0, Lcom/saterskog/cell_lab/Cell;->w:D

    div-double/2addr v8, v10

    sub-double/2addr v6, v8

    mul-double/2addr v4, v6

    .line 1991
    move-object/from16 v0, v20

    iget-wide v6, v0, Lcom/saterskog/cell_lab/Cell;->g:D

    move-object/from16 v0, v20

    iget-wide v8, v0, Lcom/saterskog/cell_lab/Cell;->e:D

    mul-double/2addr v8, v4

    sub-double/2addr v6, v8

    move-object/from16 v0, v20

    iput-wide v6, v0, Lcom/saterskog/cell_lab/Cell;->g:D

    .line 1992
    move-object/from16 v0, v20

    iget-wide v6, v0, Lcom/saterskog/cell_lab/Cell;->h:D

    move-object/from16 v0, v20

    iget-wide v8, v0, Lcom/saterskog/cell_lab/Cell;->f:D

    mul-double/2addr v4, v8

    sub-double v4, v6, v4

    move-object/from16 v0, v20

    iput-wide v4, v0, Lcom/saterskog/cell_lab/Cell;->h:D

    .line 2003
    move-object/from16 v0, p0

    iget-boolean v4, v0, Lcom/saterskog/cell_lab/CellWorld;->bg:Z

    if-nez v4, :cond_62

    .line 2005
    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v4, v4, Lcom/saterskog/cell_lab/Environment;->h:D

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v6, v6, Lcom/saterskog/cell_lab/Environment;->j:D

    move-object/from16 v0, v20

    iget-wide v8, v0, Lcom/saterskog/cell_lab/Cell;->c:D

    mul-double/2addr v6, v8

    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v8, v8, Lcom/saterskog/cell_lab/Environment;->k:D

    div-double/2addr v6, v8

    add-double/2addr v6, v4

    .line 2006
    move-object/from16 v0, v20

    iget-wide v8, v0, Lcom/saterskog/cell_lab/Cell;->h:D

    move-object/from16 v0, v20

    iget-wide v10, v0, Lcom/saterskog/cell_lab/Cell;->w:D

    move-object/from16 v0, v20

    iget-object v4, v0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    move-object/from16 v0, v20

    iget v5, v0, Lcom/saterskog/cell_lab/Cell;->D:I

    aget-object v4, v4, v5

    iget-object v4, v4, Lcom/saterskog/cell_lab/Gene;->s:Lcom/saterskog/cell_lab/h;

    sget-object v5, Lcom/saterskog/cell_lab/h;->g:Lcom/saterskog/cell_lab/h;

    if-ne v4, v5, :cond_66

    const/4 v4, 0x1

    const/4 v5, 0x0

    .line 2007
    move-object/from16 v0, v20

    invoke-virtual {v0, v4, v5}, Lcom/saterskog/cell_lab/Cell;->a(II)F

    move-result v4

    :goto_28
    float-to-double v4, v4

    sub-double/2addr v4, v6

    mul-double/2addr v4, v10

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v6, v6, Lcom/saterskog/cell_lab/Environment;->i:D

    mul-double/2addr v4, v6

    sub-double v4, v8, v4

    move-object/from16 v0, v20

    iput-wide v4, v0, Lcom/saterskog/cell_lab/Cell;->h:D

    .line 2010
    :cond_62
    move-object/from16 v0, v20

    iget-wide v4, v0, Lcom/saterskog/cell_lab/Cell;->j:D

    move-object/from16 v0, v20

    iget-wide v6, v0, Lcom/saterskog/cell_lab/Cell;->l:D

    move-object/from16 v0, v20

    iget-wide v8, v0, Lcom/saterskog/cell_lab/Cell;->d:D

    mul-double/2addr v6, v8

    move-object/from16 v0, v20

    iget-wide v8, v0, Lcom/saterskog/cell_lab/Cell;->d:D

    mul-double/2addr v6, v8

    move-object/from16 v0, v20

    iget-wide v8, v0, Lcom/saterskog/cell_lab/Cell;->d:D

    mul-double/2addr v6, v8

    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v8, v8, Lcom/saterskog/cell_lab/Environment;->g:D

    mul-double/2addr v6, v8

    const-wide/high16 v8, 0x3fe0000000000000L    # 0.5

    mul-double/2addr v6, v8

    sub-double/2addr v4, v6

    move-object/from16 v0, v20

    iput-wide v4, v0, Lcom/saterskog/cell_lab/Cell;->j:D

    .line 2011
    return-void

    .line 1931
    :cond_63
    mul-double v10, v6, v6

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    move-object/from16 v16, v0

    move-object/from16 v0, v16

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Environment;->k:D

    move-wide/from16 v16, v0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    move-object/from16 v18, v0

    move-object/from16 v0, v18

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Environment;->k:D

    move-wide/from16 v18, v0

    mul-double v16, v16, v18

    sub-double v10, v10, v16

    mul-double/2addr v4, v4

    add-double/2addr v4, v10

    const-wide/high16 v10, 0x4000000000000000L    # 2.0

    mul-double/2addr v10, v6

    div-double/2addr v4, v10

    .line 1933
    const-wide/16 v10, 0x0

    sub-double/2addr v10, v12

    mul-double/2addr v10, v4

    div-double/2addr v10, v6

    .line 1934
    const-wide/16 v16, 0x0

    sub-double v16, v16, v14

    mul-double v4, v4, v16

    div-double/2addr v4, v6

    .line 1935
    move-object/from16 v0, v20

    iget-object v0, v0, Lcom/saterskog/cell_lab/Cell;->A:[Lcom/saterskog/cell_lab/u;

    move-object/from16 v16, v0

    move-object/from16 v0, v20

    iget v0, v0, Lcom/saterskog/cell_lab/Cell;->B:I

    move/from16 v17, v0

    aget-object v16, v16, v17

    .line 1936
    move-object/from16 v0, v20

    iget v0, v0, Lcom/saterskog/cell_lab/Cell;->B:I

    move/from16 v17, v0

    add-int/lit8 v17, v17, 0x1

    move/from16 v0, v17

    move-object/from16 v1, v20

    iput v0, v1, Lcom/saterskog/cell_lab/Cell;->B:I

    .line 1937
    const-wide/16 v18, 0x0

    sub-double v18, v18, v14

    mul-double v18, v18, v8

    const-wide/high16 v22, 0x4000000000000000L    # 2.0

    mul-double v22, v22, v6

    div-double v18, v18, v22

    add-double v18, v18, v10

    move-wide/from16 v0, v18

    move-object/from16 v2, v16

    iput-wide v0, v2, Lcom/saterskog/cell_lab/u;->c:D

    .line 1938
    const-wide/16 v18, 0x0

    sub-double v18, v18, v12

    mul-double v18, v18, v8

    const-wide/high16 v22, 0x4000000000000000L    # 2.0

    mul-double v22, v22, v6

    div-double v18, v18, v22

    sub-double v18, v4, v18

    move-wide/from16 v0, v18

    move-object/from16 v2, v16

    iput-wide v0, v2, Lcom/saterskog/cell_lab/u;->d:D

    .line 1939
    const-wide/16 v18, 0x0

    sub-double v14, v18, v14

    mul-double/2addr v14, v8

    const-wide/high16 v18, 0x4000000000000000L    # 2.0

    mul-double v18, v18, v6

    div-double v14, v14, v18

    sub-double/2addr v10, v14

    move-object/from16 v0, v16

    iput-wide v10, v0, Lcom/saterskog/cell_lab/u;->a:D

    .line 1940
    const-wide/16 v10, 0x0

    sub-double/2addr v10, v12

    mul-double/2addr v10, v8

    const-wide/high16 v12, 0x4000000000000000L    # 2.0

    mul-double/2addr v12, v6

    div-double/2addr v10, v12

    add-double/2addr v4, v10

    move-object/from16 v0, v16

    iput-wide v4, v0, Lcom/saterskog/cell_lab/u;->b:D

    .line 1942
    const/4 v4, -0x1

    move-object/from16 v0, v16

    iput v4, v0, Lcom/saterskog/cell_lab/u;->g:I

    .line 1944
    const/4 v4, 0x0

    move-object/from16 v0, v16

    iput-boolean v4, v0, Lcom/saterskog/cell_lab/u;->e:Z

    .line 1945
    const/4 v4, 0x0

    move-object/from16 v0, v16

    iput-boolean v4, v0, Lcom/saterskog/cell_lab/u;->f:Z

    goto/16 :goto_23

    .line 1956
    :cond_64
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_24

    .line 1978
    :cond_65
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_26

    .line 2007
    :cond_66
    const/4 v4, 0x0

    goto/16 :goto_28

    :cond_67
    move v4, v5

    goto/16 :goto_27

    :cond_68
    move v4, v5

    goto/16 :goto_25

    :cond_69
    move v7, v8

    goto/16 :goto_1e

    :cond_6a
    move v6, v7

    goto/16 :goto_1c

    :cond_6b
    move v6, v7

    goto/16 :goto_18

    :cond_6c
    move v4, v6

    goto/16 :goto_14

    :cond_6d
    move v8, v4

    goto/16 :goto_f

    :cond_6e
    move-wide/from16 v44, v6

    move-wide v6, v10

    move-wide/from16 v10, v44

    goto/16 :goto_b
.end method

.method private e(DD)D
    .locals 19

    .prologue
    .line 4440
    move-object/from16 v0, p0

    iget-wide v2, v0, Lcom/saterskog/cell_lab/CellWorld;->P:D

    mul-double v2, v2, p1

    move-object/from16 v0, p0

    iget-wide v4, v0, Lcom/saterskog/cell_lab/CellWorld;->Q:D

    mul-double v4, v4, p3

    add-double/2addr v2, v4

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v4, v4, Lcom/saterskog/cell_lab/Environment;->k:D

    div-double/2addr v2, v4

    .line 4441
    mul-double v4, p1, p1

    mul-double v6, p3, p3

    add-double/2addr v4, v6

    invoke-static {v4, v5}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v4

    .line 4442
    const-wide/high16 v6, 0x3ff0000000000000L    # 1.0

    const-wide/high16 v8, 0x3ff0000000000000L    # 1.0

    move-object/from16 v0, p0

    iget-object v10, v0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v10, v10, Lcom/saterskog/cell_lab/Environment;->f:D

    sub-double/2addr v8, v10

    const-wide/high16 v10, 0x3ff0000000000000L    # 1.0

    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v12, v12, Lcom/saterskog/cell_lab/Environment;->k:D

    div-double v12, v4, v12

    sub-double/2addr v10, v12

    mul-double/2addr v8, v10

    move-object/from16 v0, p0

    iget-object v10, v0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v10, v10, Lcom/saterskog/cell_lab/Environment;->f:D

    div-double/2addr v8, v10

    add-double/2addr v6, v8

    .line 4444
    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v8, v8, Lcom/saterskog/cell_lab/Environment;->d:D

    const-wide/high16 v10, 0x3ff0000000000000L    # 1.0

    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v12, v12, Lcom/saterskog/cell_lab/Environment;->f:D

    sub-double/2addr v10, v12

    mul-double/2addr v2, v10

    move-object/from16 v0, p0

    iget-object v10, v0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v10, v10, Lcom/saterskog/cell_lab/Environment;->f:D

    add-double/2addr v2, v10

    mul-double/2addr v2, v8

    mul-double/2addr v6, v6

    div-double/2addr v2, v6

    const-wide/16 v6, 0x0

    cmpg-double v2, v2, v6

    if-gez v2, :cond_0

    .line 4445
    const-wide/16 v2, 0x0

    .line 4446
    :goto_0
    return-wide v2

    :cond_0
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v2, v2, Lcom/saterskog/cell_lab/Environment;->d:D

    const-wide/high16 v6, -0x4010000000000000L    # -1.0

    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v8, v8, Lcom/saterskog/cell_lab/Environment;->f:D

    add-double/2addr v6, v8

    mul-double/2addr v2, v6

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v6, v6, Lcom/saterskog/cell_lab/Environment;->f:D

    mul-double/2addr v2, v6

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v6, v6, Lcom/saterskog/cell_lab/Environment;->f:D

    mul-double/2addr v2, v6

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v6, v6, Lcom/saterskog/cell_lab/Environment;->k:D

    mul-double/2addr v2, v6

    const-wide/high16 v6, -0x4010000000000000L    # -1.0

    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v8, v8, Lcom/saterskog/cell_lab/Environment;->f:D

    add-double/2addr v6, v8

    mul-double/2addr v6, v4

    mul-double/2addr v6, v4

    move-object/from16 v0, p0

    iget-wide v8, v0, Lcom/saterskog/cell_lab/CellWorld;->Q:D

    mul-double/2addr v6, v8

    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v8, v8, Lcom/saterskog/cell_lab/Environment;->k:D

    mul-double/2addr v8, v4

    move-object/from16 v0, p0

    iget-wide v10, v0, Lcom/saterskog/cell_lab/CellWorld;->Q:D

    mul-double/2addr v8, v10

    add-double/2addr v6, v8

    const-wide/high16 v8, 0x4000000000000000L    # 2.0

    mul-double v8, v8, p3

    move-object/from16 v0, p0

    iget-wide v10, v0, Lcom/saterskog/cell_lab/CellWorld;->P:D

    mul-double v10, v10, p1

    move-object/from16 v0, p0

    iget-wide v12, v0, Lcom/saterskog/cell_lab/CellWorld;->Q:D

    mul-double v12, v12, p3

    add-double/2addr v10, v12

    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v12, v12, Lcom/saterskog/cell_lab/Environment;->f:D

    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v14, v14, Lcom/saterskog/cell_lab/Environment;->k:D

    move-object/from16 v0, p0

    iget-wide v0, v0, Lcom/saterskog/cell_lab/CellWorld;->P:D

    move-wide/from16 v16, v0

    mul-double v16, v16, p1

    sub-double v14, v14, v16

    move-object/from16 v0, p0

    iget-wide v0, v0, Lcom/saterskog/cell_lab/CellWorld;->Q:D

    move-wide/from16 v16, v0

    mul-double v16, v16, p3

    sub-double v14, v14, v16

    mul-double/2addr v12, v14

    add-double/2addr v10, v12

    mul-double/2addr v8, v10

    add-double/2addr v6, v8

    mul-double/2addr v2, v6

    const-wide/high16 v6, -0x4010000000000000L    # -1.0

    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v8, v8, Lcom/saterskog/cell_lab/Environment;->f:D

    add-double/2addr v6, v8

    mul-double/2addr v6, v4

    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v8, v8, Lcom/saterskog/cell_lab/Environment;->k:D

    add-double/2addr v6, v8

    const-wide/high16 v8, 0x4008000000000000L    # 3.0

    .line 4452
    invoke-static {v6, v7, v8, v9}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v6

    mul-double/2addr v4, v6

    div-double/2addr v2, v4

    neg-double v2, v2

    .line 4446
    goto/16 :goto_0
.end method

.method private e(D)V
    .locals 43

    .prologue
    .line 2313
    const/4 v2, 0x0

    :goto_0
    move-object/from16 v0, p0

    iget v3, v0, Lcom/saterskog/cell_lab/CellWorld;->z:I

    if-ge v2, v3, :cond_25

    .line 2314
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    aget-object v18, v3, v2

    .line 2315
    move-object/from16 v0, v18

    iget-wide v4, v0, Lcom/saterskog/cell_lab/Cell;->w:D

    .line 2316
    move-object/from16 v0, v18

    iget-object v3, v0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    move-object/from16 v0, v18

    iget v6, v0, Lcom/saterskog/cell_lab/Cell;->D:I

    aget-object v3, v3, v6

    iget-object v3, v3, Lcom/saterskog/cell_lab/Gene;->s:Lcom/saterskog/cell_lab/h;

    sget-object v6, Lcom/saterskog/cell_lab/h;->e:Lcom/saterskog/cell_lab/h;

    if-ne v3, v6, :cond_0

    .line 2317
    const-wide v4, 0x3fb26e978d4fdf3bL    # 0.072

    move-object/from16 v0, v18

    iget-wide v6, v0, Lcom/saterskog/cell_lab/Cell;->w:D

    move-object/from16 v0, v18

    iget v3, v0, Lcom/saterskog/cell_lab/Cell;->S:F

    float-to-double v8, v3

    add-double/2addr v6, v8

    const-wide v8, 0x3fb26e978d4fdf3bL    # 0.072

    sub-double/2addr v6, v8

    const-wide v8, 0x4000b4395810624eL    # 2.088

    div-double/2addr v6, v8

    const-wide v8, 0x3fd26e978d4fdf3bL    # 0.288

    mul-double/2addr v6, v8

    add-double/2addr v4, v6

    .line 2318
    :cond_0

# MODDED AREA BEGIN -----------------------------------------------------------------------------
    # Aparently some register just can't be touched or else shit breaks.
    # If it crashes or acts in unexpected ways just take a look at the registers.
    # Too lazy to tell you which ones crash, you'll have to figure that out.


    # Cell object moved from v18 -> v0
    move-object/from16 v0, v18

    #v3 = cell.genes[cell.gene]
    iget-object v3, v0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;
    move-object/from16 v0, v18
    iget v6, v0, Lcom/saterskog/cell_lab/Cell;->D:I
    aget-object v3, v3, v6

    # v6 = cell.genes[cell.gene].mInts[11]
    iget-object v9, v3, Lcom/saterskog/cell_lab/Gene;->u:[I
    const/16 v1, 0xb
    aget v9, v9, v1

    # if v6 < 21
    const/16 v1, 0x14
    if-lt v9, v1, :modded_cond_checkLimit

    # this means maxSplit = infinite, ignore other check and continue to vanilla code.
    goto :cond_modded_reproduce

    :modded_cond_checkLimit
    # maxSplit is not infinite, must check cell's splitCount before proceding
    # cell.enzyme_splitCount
    move-object/from16 v0, v18
    iget v1, v0, Lcom/saterskog/cell_lab/Cell;->enzyme_splitCount:I
    add-int/lit8 v9, v9, 1
    if-ge v1,v9, :cond_22
    goto :cond_modded_reproduce

# MODDED AREA END -----------------------------------------------------------------------------

    :cond_modded_reproduce

    move-object/from16 v0, v18

    iget-object v3, v0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    move-object/from16 v0, v18

    iget v6, v0, Lcom/saterskog/cell_lab/Cell;->D:I

    aget-object v3, v3, v6

    iget v3, v3, Lcom/saterskog/cell_lab/Gene;->b:F

    float-to-double v6, v3

    cmpl-double v3, v4, v6

    if-lez v3, :cond_22

    move-object/from16 v0, v18

    iget-wide v4, v0, Lcom/saterskog/cell_lab/Cell;->o:D

    const-wide/high16 v6, 0x3fe0000000000000L    # 0.5

    cmpl-double v3, v4, v6

    if-lez v3, :cond_22

    move-object/from16 v0, v18

    iget v3, v0, Lcom/saterskog/cell_lab/Cell;->P:I

    move-object/from16 v0, v18

    iget-object v4, v0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    move-object/from16 v0, v18

    iget v5, v0, Lcom/saterskog/cell_lab/Cell;->D:I

    aget-object v4, v4, v5

    iget-object v4, v4, Lcom/saterskog/cell_lab/Gene;->u:[I

    const/16 v5, 0x9

    aget v4, v4, v5

    if-gt v3, v4, :cond_22

    move-object/from16 v0, v18

    iget-wide v4, v0, Lcom/saterskog/cell_lab/Cell;->p:D

    const-wide v6, 0x3fc999999999999aL    # 0.2

    cmpl-double v3, v4, v6

    if-lez v3, :cond_22

    move-object/from16 v0, v18

    iget-boolean v3, v0, Lcom/saterskog/cell_lab/Cell;->x:Z

    if-nez v3, :cond_22

    move-object/from16 v0, v18

    iget-object v3, v0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    move-object/from16 v0, v18

    iget v4, v0, Lcom/saterskog/cell_lab/Cell;->D:I

    aget-object v3, v3, v4

    iget-object v3, v3, Lcom/saterskog/cell_lab/Gene;->s:Lcom/saterskog/cell_lab/h;

    sget-object v4, Lcom/saterskog/cell_lab/h;->q:Lcom/saterskog/cell_lab/h;

    if-eq v3, v4, :cond_22

    .line 2319
    const/4 v3, 0x0

    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lcom/saterskog/cell_lab/CellWorld;->a(Lcom/saterskog/cell_lab/Cell;)Z

    move-result v3

    if-eqz v3, :cond_22

    .line 2320
    move-object/from16 v0, p0

    iget v3, v0, Lcom/saterskog/cell_lab/CellWorld;->S:I

    add-int/lit8 v3, v3, 0x1

    move-object/from16 v0, p0

    iput v3, v0, Lcom/saterskog/cell_lab/CellWorld;->S:I

    .line 2323
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    move-object/from16 v0, p0

    iget v4, v0, Lcom/saterskog/cell_lab/CellWorld;->z:I

    add-int/lit8 v4, v4, -0x1

    aget-object v19, v3, v4

    .line 2324
    move-object/from16 v0, p0

    iget-boolean v3, v0, Lcom/saterskog/cell_lab/CellWorld;->bg:Z

    if-nez v3, :cond_2

    move-object/from16 v0, p0

    iget-boolean v3, v0, Lcom/saterskog/cell_lab/CellWorld;->I:Z

    if-eqz v3, :cond_2

    .line 2326
    move-object/from16 v0, v18

    iget-wide v4, v0, Lcom/saterskog/cell_lab/Cell;->b:D

    double-to-float v3, v4

    move-object/from16 v0, p0

    iget v4, v0, Lcom/saterskog/cell_lab/CellWorld;->F:F

    sub-float/2addr v3, v4

    .line 2327
    move-object/from16 v0, v18

    iget-wide v4, v0, Lcom/saterskog/cell_lab/Cell;->c:D

    double-to-float v4, v4

    move-object/from16 v0, p0

    iget v5, v0, Lcom/saterskog/cell_lab/CellWorld;->G:F

    sub-float/2addr v4, v5

    .line 2328
    mul-float/2addr v3, v3

    mul-float/2addr v4, v4

    add-float/2addr v3, v4

    .line 2329
    move-object/from16 v0, p0

    iget v4, v0, Lcom/saterskog/cell_lab/CellWorld;->H:F

    const/4 v5, 0x0

    cmpg-float v4, v4, v5

    if-ltz v4, :cond_1

    move-object/from16 v0, p0

    iget v4, v0, Lcom/saterskog/cell_lab/CellWorld;->H:F

    cmpg-float v4, v3, v4

    if-gez v4, :cond_2

    :cond_1
    move-object/from16 v0, p0

    iput v3, v0, Lcom/saterskog/cell_lab/CellWorld;->H:F

    .line 2331
    :cond_2
    const/4 v3, 0x0

    move-object/from16 v0, v18

    iput v3, v0, Lcom/saterskog/cell_lab/Cell;->O:I

    .line 2332
    const/4 v3, 0x0

    move-object/from16 v0, v19

    iput v3, v0, Lcom/saterskog/cell_lab/Cell;->O:I

# MODDED SECTION BEGIN -----------------------------------------------------------------------------
    # Upon splitting, only child mode 1 will have it's splitcount increased

    # cell2.splitCount++ (For child 2, it will not inherit a split.
    # child 2 cells will begin fresh with a split count of 0.
    # move-object/from16 v0, v19
    # iget v1, v0, Lcom/saterskog/cell_lab/Cell;->enzyme_splitCount:I
    # add-int/lit8 v1, v1, 0x1
    # iput v1, v0, Lcom/saterskog/cell_lab/Cell;->enzyme_splitCount:I

    #cell.splitCount++

    move-object/from16 v0, v18
    iget v1, v0, Lcom/saterskog/cell_lab/Cell;->enzyme_splitCount:I
    add-int/lit8 v1, v1, 0x1
    iput v1, v0, Lcom/saterskog/cell_lab/Cell;->enzyme_splitCount:I

# MODDED SECTION END ------------------------------------------------------------------------------

    .line 2333
    const/4 v3, 0x0

    move-object/from16 v0, v19

    iput v3, v0, Lcom/saterskog/cell_lab/Cell;->B:I

    .line 2334
    move-object/from16 v0, v19

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Lcom/saterskog/cell_lab/Cell;->a(Lcom/saterskog/cell_lab/Cell;)V

    .line 2335
    const/4 v3, 0x0

    move-object/from16 v0, v19

    iput v3, v0, Lcom/saterskog/cell_lab/Cell;->F:I

    .line 2336
    move-object/from16 v0, v18

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->k:D

    move-wide/from16 v20, v0

    .line 2337
    move-object/from16 v0, v18

    iget-object v3, v0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    move-object/from16 v0, v18

    iget v4, v0, Lcom/saterskog/cell_lab/Cell;->D:I

    aget-object v3, v3, v4

    iget v3, v3, Lcom/saterskog/cell_lab/Gene;->d:F

    float-to-double v6, v3

    move-object/from16 v0, v18

    iget-boolean v3, v0, Lcom/saterskog/cell_lab/Cell;->y:Z

    if-eqz v3, :cond_4

    const-wide/high16 v4, -0x4010000000000000L    # -1.0

    :goto_1
    mul-double/2addr v4, v6

    add-double v22, v20, v4

    .line 2338
    move-object/from16 v0, v18

    iget-wide v4, v0, Lcom/saterskog/cell_lab/Cell;->d:D

    const-wide v6, 0x3fa999999999999aL    # 0.05

    mul-double/2addr v4, v6

    const-wide/high16 v6, 0x4000000000000000L    # 2.0

    mul-double/2addr v4, v6

    .line 2339
    invoke-static/range {v22 .. v23}, Ljava/lang/Math;->cos(D)D

    move-result-wide v24

    .line 2340
    invoke-static/range {v22 .. v23}, Ljava/lang/Math;->sin(D)D

    move-result-wide v26

    .line 2341
    move-object/from16 v0, v18

    iget-wide v6, v0, Lcom/saterskog/cell_lab/Cell;->e:D

    const-wide/16 v8, 0x0

    mul-double v8, v8, v24

    sub-double/2addr v6, v8

    move-object/from16 v0, v18

    iput-wide v6, v0, Lcom/saterskog/cell_lab/Cell;->e:D

    .line 2342
    move-object/from16 v0, v18

    iget-wide v6, v0, Lcom/saterskog/cell_lab/Cell;->f:D

    const-wide/16 v8, 0x0

    mul-double v8, v8, v26

    sub-double/2addr v6, v8

    move-object/from16 v0, v18

    iput-wide v6, v0, Lcom/saterskog/cell_lab/Cell;->f:D

    .line 2344
    move-object/from16 v0, v18

    iget-wide v6, v0, Lcom/saterskog/cell_lab/Cell;->b:D

    mul-double v8, v24, v4

    move-object/from16 v0, p0

    iget v3, v0, Lcom/saterskog/cell_lab/CellWorld;->z:I

    int-to-double v10, v3

    const-wide v12, 0x4024ae147ae147aeL    # 10.34

    mul-double/2addr v10, v12

    const-wide v12, 0x4045800000000000L    # 43.0

    add-double/2addr v10, v12

    invoke-static {v10, v11}, Ljava/lang/Math;->sin(D)D

    move-result-wide v10

    const-wide v12, 0x3e7ad7f29abcaf48L    # 1.0E-7

    mul-double/2addr v10, v12

    add-double/2addr v8, v10

    sub-double/2addr v6, v8

    move-object/from16 v0, v18

    iput-wide v6, v0, Lcom/saterskog/cell_lab/Cell;->b:D

    .line 2345
    move-object/from16 v0, v18

    iget-wide v6, v0, Lcom/saterskog/cell_lab/Cell;->c:D

    mul-double v8, v26, v4

    move-object/from16 v0, p0

    iget v3, v0, Lcom/saterskog/cell_lab/CellWorld;->z:I

    int-to-double v10, v3

    const-wide v12, 0x4031570a3d70a3d7L    # 17.34

    mul-double/2addr v10, v12

    const-wide v12, 0x4061200000000000L    # 137.0

    add-double/2addr v10, v12

    invoke-static {v10, v11}, Ljava/lang/Math;->sin(D)D

    move-result-wide v10

    const-wide v12, 0x3e7ad7f29abcaf48L    # 1.0E-7

    mul-double/2addr v10, v12

    add-double/2addr v8, v10

    sub-double/2addr v6, v8

    move-object/from16 v0, v18

    iput-wide v6, v0, Lcom/saterskog/cell_lab/Cell;->c:D

    .line 2346
    move-object/from16 v0, v19

    iget-wide v6, v0, Lcom/saterskog/cell_lab/Cell;->e:D

    const-wide/16 v8, 0x0

    mul-double v8, v8, v24

    add-double/2addr v6, v8

    move-object/from16 v0, v19

    iput-wide v6, v0, Lcom/saterskog/cell_lab/Cell;->e:D

    .line 2347
    move-object/from16 v0, v19

    iget-wide v6, v0, Lcom/saterskog/cell_lab/Cell;->f:D

    const-wide/16 v8, 0x0

    mul-double v8, v8, v26

    add-double/2addr v6, v8

    move-object/from16 v0, v19

    iput-wide v6, v0, Lcom/saterskog/cell_lab/Cell;->f:D

    .line 2348
    move-object/from16 v0, v19

    iget-wide v6, v0, Lcom/saterskog/cell_lab/Cell;->b:D

    mul-double v8, v24, v4

    move-object/from16 v0, p0

    iget v3, v0, Lcom/saterskog/cell_lab/CellWorld;->z:I

    int-to-double v10, v3

    const-wide v12, 0x4028ae147ae147aeL    # 12.34

    mul-double/2addr v10, v12

    const-wide v12, 0x402acccccccccccdL    # 13.4

    add-double/2addr v10, v12

    invoke-static {v10, v11}, Ljava/lang/Math;->sin(D)D

    move-result-wide v10

    const-wide v12, 0x3e7ad7f29abcaf48L    # 1.0E-7

    mul-double/2addr v10, v12

    add-double/2addr v8, v10

    add-double/2addr v6, v8

    move-object/from16 v0, v19

    iput-wide v6, v0, Lcom/saterskog/cell_lab/Cell;->b:D

    .line 2349
    move-object/from16 v0, v19

    iget-wide v6, v0, Lcom/saterskog/cell_lab/Cell;->c:D

    mul-double v4, v4, v26

    move-object/from16 v0, p0

    iget v3, v0, Lcom/saterskog/cell_lab/CellWorld;->z:I

    int-to-double v8, v3

    const-wide v10, 0x4033570a3d70a3d7L    # 19.34

    mul-double/2addr v8, v10

    const-wide v10, 0x404f800000000000L    # 63.0

    add-double/2addr v8, v10

    invoke-static {v8, v9}, Ljava/lang/Math;->sin(D)D

    move-result-wide v8

    const-wide v10, 0x3e7ad7f29abcaf48L    # 1.0E-7

    mul-double/2addr v8, v10

    add-double/2addr v4, v8

    add-double/2addr v4, v6

    move-object/from16 v0, v19

    iput-wide v4, v0, Lcom/saterskog/cell_lab/Cell;->c:D

    .line 2350
    move-object/from16 v0, v18

    iget-wide v4, v0, Lcom/saterskog/cell_lab/Cell;->w:D

    .line 2351
    move-object/from16 v0, v18

    iget-object v3, v0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    move-object/from16 v0, v18

    iget v6, v0, Lcom/saterskog/cell_lab/Cell;->D:I

    aget-object v3, v3, v6

    iget-object v3, v3, Lcom/saterskog/cell_lab/Gene;->s:Lcom/saterskog/cell_lab/h;

    sget-object v6, Lcom/saterskog/cell_lab/h;->e:Lcom/saterskog/cell_lab/h;

    if-ne v3, v6, :cond_3

    .line 2352
    move-object/from16 v0, v18

    iget v3, v0, Lcom/saterskog/cell_lab/Cell;->S:F

    float-to-double v6, v3

    add-double/2addr v4, v6

    .line 2353
    :cond_3
    move-object/from16 v0, v18

    iget-object v3, v0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    move-object/from16 v0, v18

    iget v6, v0, Lcom/saterskog/cell_lab/Cell;->D:I

    aget-object v3, v3, v6

    iget v3, v3, Lcom/saterskog/cell_lab/Gene;->c:F

    float-to-double v6, v3

    mul-double/2addr v6, v4

    move-object/from16 v0, v18

    iget-object v3, v0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    move-object/from16 v0, v18

    iget-object v8, v0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    move-object/from16 v0, v18

    iget v9, v0, Lcom/saterskog/cell_lab/Cell;->D:I

    aget-object v8, v8, v9

    iget v8, v8, Lcom/saterskog/cell_lab/Gene;->j:I

    aget-object v3, v3, v8

    iget-object v3, v3, Lcom/saterskog/cell_lab/Gene;->s:Lcom/saterskog/cell_lab/h;

    iget-wide v8, v3, Lcom/saterskog/cell_lab/h;->v:D

    sub-double/2addr v6, v8

    move-object/from16 v0, v19

    iput-wide v6, v0, Lcom/saterskog/cell_lab/Cell;->w:D

    .line 2354
    const/high16 v3, 0x3f800000    # 1.0f

    move-object/from16 v0, v18

    iget-object v6, v0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    move-object/from16 v0, v18

    iget v7, v0, Lcom/saterskog/cell_lab/Cell;->D:I

    aget-object v6, v6, v7

    iget v6, v6, Lcom/saterskog/cell_lab/Gene;->c:F

    sub-float/2addr v3, v6

    float-to-double v6, v3

    mul-double/2addr v4, v6

    move-object/from16 v0, v18

    iget-object v3, v0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    move-object/from16 v0, v18

    iget-object v6, v0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    move-object/from16 v0, v18

    iget v7, v0, Lcom/saterskog/cell_lab/Cell;->D:I

    aget-object v6, v6, v7

    iget v6, v6, Lcom/saterskog/cell_lab/Gene;->i:I

    aget-object v3, v3, v6

    iget-object v3, v3, Lcom/saterskog/cell_lab/Gene;->s:Lcom/saterskog/cell_lab/h;

    iget-wide v6, v3, Lcom/saterskog/cell_lab/h;->v:D

    sub-double/2addr v4, v6

    move-object/from16 v0, v18

    iput-wide v4, v0, Lcom/saterskog/cell_lab/Cell;->w:D

    .line 2355
    move-object/from16 v0, v18

    iget-wide v4, v0, Lcom/saterskog/cell_lab/Cell;->w:D

    const/4 v3, 0x0

    move-object/from16 v0, v18

    iget-object v6, v0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    move-object/from16 v0, v18

    iget-object v7, v0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    move-object/from16 v0, v18

    iget v8, v0, Lcom/saterskog/cell_lab/Cell;->D:I

    aget-object v7, v7, v8

    iget v7, v7, Lcom/saterskog/cell_lab/Gene;->i:I

    aget-object v6, v6, v7

    iget-object v6, v6, Lcom/saterskog/cell_lab/Gene;->v:[F

    const/4 v7, 0x6

    aget v6, v6, v7

    const/high16 v7, 0x3f800000    # 1.0f

    sub-float/2addr v6, v7

    invoke-static {v3, v6}, Ljava/lang/Math;->max(FF)F

    move-result v3

    const v6, 0x3d5d2f1c    # 0.054000005f

    mul-float/2addr v3, v6

    float-to-double v6, v3

    sub-double/2addr v4, v6

    move-object/from16 v0, v18

    iput-wide v4, v0, Lcom/saterskog/cell_lab/Cell;->w:D

    .line 2356
    move-object/from16 v0, v19

    iget-wide v4, v0, Lcom/saterskog/cell_lab/Cell;->w:D

    const/4 v3, 0x0

    move-object/from16 v0, v18

    iget-object v6, v0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    move-object/from16 v0, v18

    iget-object v7, v0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    move-object/from16 v0, v18

    iget v8, v0, Lcom/saterskog/cell_lab/Cell;->D:I

    aget-object v7, v7, v8

    iget v7, v7, Lcom/saterskog/cell_lab/Gene;->j:I

    aget-object v6, v6, v7

    iget-object v6, v6, Lcom/saterskog/cell_lab/Gene;->v:[F

    const/4 v7, 0x6

    aget v6, v6, v7

    const/high16 v7, 0x3f800000    # 1.0f

    sub-float/2addr v6, v7

    invoke-static {v3, v6}, Ljava/lang/Math;->max(FF)F

    move-result v3

    const v6, 0x3d5d2f1c    # 0.054000005f

    mul-float/2addr v3, v6

    float-to-double v6, v3

    sub-double/2addr v4, v6

    move-object/from16 v0, v19

    iput-wide v4, v0, Lcom/saterskog/cell_lab/Cell;->w:D

    .line 2359
    const/4 v3, 0x0

    :goto_2
    const/4 v4, 0x4

    if-ge v3, v4, :cond_5

    .line 2360
    move-object/from16 v0, v18

    iget-object v4, v0, Lcom/saterskog/cell_lab/Cell;->U:[F

    aget v4, v4, v3

    .line 2361
    move-object/from16 v0, v18

    iget-object v5, v0, Lcom/saterskog/cell_lab/Cell;->U:[F

    move-object/from16 v0, v18

    iget-object v6, v0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    move-object/from16 v0, v18

    iget v7, v0, Lcom/saterskog/cell_lab/Cell;->D:I

    aget-object v6, v6, v7

    iget v6, v6, Lcom/saterskog/cell_lab/Gene;->c:F

    mul-float/2addr v6, v4

    const v7, 0x38d1b717    # 1.0E-4f

    add-float/2addr v6, v7

    aput v6, v5, v3

    .line 2362
    move-object/from16 v0, v19

    iget-object v5, v0, Lcom/saterskog/cell_lab/Cell;->U:[F

    const/high16 v6, 0x3f800000    # 1.0f

    move-object/from16 v0, v18

    iget-object v7, v0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    move-object/from16 v0, v18

    iget v8, v0, Lcom/saterskog/cell_lab/Cell;->D:I

    aget-object v7, v7, v8

    iget v7, v7, Lcom/saterskog/cell_lab/Gene;->c:F

    sub-float/2addr v6, v7

    mul-float/2addr v4, v6

    const v6, 0x38d1b717    # 1.0E-4f

    add-float/2addr v4, v6

    aput v4, v5, v3

    .line 2359
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 2337
    :cond_4
    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    goto/16 :goto_1

    .line 2364
    :cond_5
    const/4 v3, 0x0

    move-object/from16 v0, v18

    iput v3, v0, Lcom/saterskog/cell_lab/Cell;->S:F

    .line 2365
    const/4 v3, 0x0

    move-object/from16 v0, v19

    iput v3, v0, Lcom/saterskog/cell_lab/Cell;->S:F

    .line 2366
    move-object/from16 v0, v18

    iget v3, v0, Lcom/saterskog/cell_lab/Cell;->X:F

    const/high16 v4, 0x3f800000    # 1.0f

    move-object/from16 v0, v18

    iget-object v5, v0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    move-object/from16 v0, v18

    iget v6, v0, Lcom/saterskog/cell_lab/Cell;->D:I

    aget-object v5, v5, v6

    iget v5, v5, Lcom/saterskog/cell_lab/Gene;->c:F

    sub-float/2addr v4, v5

    mul-float/2addr v3, v4

    move-object/from16 v0, v19

    iput v3, v0, Lcom/saterskog/cell_lab/Cell;->X:F

    .line 2367
    move-object/from16 v0, v18

    iget v3, v0, Lcom/saterskog/cell_lab/Cell;->X:F

    move-object/from16 v0, v18

    iget-object v4, v0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    move-object/from16 v0, v18

    iget v5, v0, Lcom/saterskog/cell_lab/Cell;->D:I

    aget-object v4, v4, v5

    iget v4, v4, Lcom/saterskog/cell_lab/Gene;->c:F

    mul-float/2addr v3, v4

    move-object/from16 v0, v18

    iput v3, v0, Lcom/saterskog/cell_lab/Cell;->X:F

    .line 2368
    move-object/from16 v0, v18

    iget v3, v0, Lcom/saterskog/cell_lab/Cell;->Y:F

    const/high16 v4, 0x3f800000    # 1.0f

    move-object/from16 v0, v18

    iget-object v5, v0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    move-object/from16 v0, v18

    iget v6, v0, Lcom/saterskog/cell_lab/Cell;->D:I

    aget-object v5, v5, v6

    iget v5, v5, Lcom/saterskog/cell_lab/Gene;->c:F

    sub-float/2addr v4, v5

    mul-float/2addr v3, v4

    move-object/from16 v0, v19

    iput v3, v0, Lcom/saterskog/cell_lab/Cell;->Y:F

    .line 2369
    move-object/from16 v0, v18

    iget v3, v0, Lcom/saterskog/cell_lab/Cell;->Y:F

    move-object/from16 v0, v18

    iget-object v4, v0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    move-object/from16 v0, v18

    iget v5, v0, Lcom/saterskog/cell_lab/Cell;->D:I

    aget-object v4, v4, v5

    iget v4, v4, Lcom/saterskog/cell_lab/Gene;->c:F

    mul-float/2addr v3, v4

    move-object/from16 v0, v18

    iput v3, v0, Lcom/saterskog/cell_lab/Cell;->Y:F

    .line 2370
    const-wide/high16 v4, 0x3fe0000000000000L    # 0.5

    move-object/from16 v0, v18

    iget-wide v6, v0, Lcom/saterskog/cell_lab/Cell;->p:D

    mul-double/2addr v4, v6

    move-object/from16 v0, v19

    iput-wide v4, v0, Lcom/saterskog/cell_lab/Cell;->p:D

    .line 2371
    const-wide/high16 v4, 0x3fe0000000000000L    # 0.5

    move-object/from16 v0, v18

    iget-wide v6, v0, Lcom/saterskog/cell_lab/Cell;->p:D

    mul-double/2addr v4, v6

    move-object/from16 v0, v18

    iput-wide v4, v0, Lcom/saterskog/cell_lab/Cell;->p:D

    .line 2372
    const-wide/16 v4, 0x0

    move-object/from16 v0, v19

    iput-wide v4, v0, Lcom/saterskog/cell_lab/Cell;->o:D

    .line 2373
    const-wide/16 v4, 0x0

    move-object/from16 v0, v18

    iput-wide v4, v0, Lcom/saterskog/cell_lab/Cell;->o:D

    .line 2374
    move-object/from16 v0, v18

    iget-object v3, v0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    move-object/from16 v0, v18

    iget v4, v0, Lcom/saterskog/cell_lab/Cell;->D:I

    aget-object v3, v3, v4

    iget v3, v3, Lcom/saterskog/cell_lab/Gene;->e:F

    float-to-double v6, v3

    move-object/from16 v0, v18

    iget-boolean v3, v0, Lcom/saterskog/cell_lab/Cell;->y:Z

    if-eqz v3, :cond_7

    const-wide/high16 v4, -0x4010000000000000L    # -1.0

    :goto_3
    mul-double/2addr v4, v6

    add-double v4, v4, v22

    move-object/from16 v0, v18

    iput-wide v4, v0, Lcom/saterskog/cell_lab/Cell;->k:D

    .line 2375
    move-object/from16 v0, v18

    iget-object v3, v0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    move-object/from16 v0, v18

    iget v4, v0, Lcom/saterskog/cell_lab/Cell;->D:I

    aget-object v3, v3, v4

    iget v3, v3, Lcom/saterskog/cell_lab/Gene;->f:F

    float-to-double v6, v3

    move-object/from16 v0, v18

    iget-boolean v3, v0, Lcom/saterskog/cell_lab/Cell;->y:Z

    if-eqz v3, :cond_8

    const-wide/high16 v4, -0x4010000000000000L    # -1.0

    :goto_4
    mul-double/2addr v4, v6

    add-double v4, v4, v22

    move-object/from16 v0, v19

    iput-wide v4, v0, Lcom/saterskog/cell_lab/Cell;->k:D

    .line 2376
    move-object/from16 v0, v18

    iget-boolean v3, v0, Lcom/saterskog/cell_lab/Cell;->y:Z

    move-object/from16 v0, v18

    iget-object v4, v0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    move-object/from16 v0, v18

    iget v5, v0, Lcom/saterskog/cell_lab/Cell;->D:I

    aget-object v4, v4, v5

    iget-boolean v4, v4, Lcom/saterskog/cell_lab/Gene;->r:Z

    if-eq v3, v4, :cond_9

    const/4 v3, 0x1

    :goto_5
    move-object/from16 v0, v19

    iput-boolean v3, v0, Lcom/saterskog/cell_lab/Cell;->y:Z

    .line 2377
    move-object/from16 v0, v18

    iget-boolean v3, v0, Lcom/saterskog/cell_lab/Cell;->y:Z

    move-object/from16 v0, v18

    iget-object v4, v0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    move-object/from16 v0, v18

    iget v5, v0, Lcom/saterskog/cell_lab/Cell;->D:I

    aget-object v4, v4, v5

    iget-boolean v4, v4, Lcom/saterskog/cell_lab/Gene;->q:Z

    if-eq v3, v4, :cond_a

    const/4 v3, 0x1

    :goto_6
    move-object/from16 v0, v18

    iput-boolean v3, v0, Lcom/saterskog/cell_lab/Cell;->y:Z

    .line 2378
    move-object/from16 v0, v18

    iget-wide v4, v0, Lcom/saterskog/cell_lab/Cell;->m:D

    const-wide/high16 v6, 0x3ff0000000000000L    # 1.0

    add-double/2addr v4, v6

    move-object/from16 v0, v18

    iput-wide v4, v0, Lcom/saterskog/cell_lab/Cell;->m:D

    .line 2379
    move-object/from16 v0, v19

    iget-wide v4, v0, Lcom/saterskog/cell_lab/Cell;->m:D

    const-wide/high16 v6, 0x3ff0000000000000L    # 1.0

    sub-double/2addr v4, v6

    move-object/from16 v0, v19

    iput-wide v4, v0, Lcom/saterskog/cell_lab/Cell;->m:D

    .line 2380
    const/4 v3, 0x0

    :goto_7
    move-object/from16 v0, v18

    iget v4, v0, Lcom/saterskog/cell_lab/Cell;->C:I

    if-ge v3, v4, :cond_c

    .line 2381
    move-object/from16 v0, v18

    iget-object v4, v0, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    aget-object v4, v4, v3

    iget v4, v4, Lcom/saterskog/cell_lab/Link;->a:I

    const/4 v5, -0x1

    if-eq v4, v5, :cond_6

    .line 2382
    const/4 v4, 0x0

    :goto_8
    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    move-object/from16 v0, v18

    iget-object v6, v0, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    aget-object v6, v6, v3

    iget v6, v6, Lcom/saterskog/cell_lab/Link;->a:I

    aget-object v5, v5, v6

    iget v5, v5, Lcom/saterskog/cell_lab/Cell;->C:I

    if-ge v4, v5, :cond_6

    .line 2383
    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    move-object/from16 v0, v18

    iget-object v6, v0, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    aget-object v6, v6, v3

    iget v6, v6, Lcom/saterskog/cell_lab/Link;->a:I

    aget-object v5, v5, v6

    iget-object v5, v5, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    aget-object v5, v5, v4

    iget v5, v5, Lcom/saterskog/cell_lab/Link;->a:I

    if-ne v5, v2, :cond_b

    .line 2384
    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    move-object/from16 v0, v18

    iget-object v6, v0, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    aget-object v6, v6, v3

    iget v6, v6, Lcom/saterskog/cell_lab/Link;->a:I

    aget-object v5, v5, v6

    iget-object v5, v5, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    aget-object v4, v5, v4

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    move-object/from16 v0, v18

    iget-object v6, v0, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    aget-object v6, v6, v3

    iget v6, v6, Lcom/saterskog/cell_lab/Link;->a:I

    aget-object v5, v5, v6

    iget-object v5, v5, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    move-object/from16 v0, v18

    iget-object v7, v0, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    aget-object v7, v7, v3

    iget v7, v7, Lcom/saterskog/cell_lab/Link;->a:I

    aget-object v6, v6, v7

    iget v6, v6, Lcom/saterskog/cell_lab/Cell;->C:I

    add-int/lit8 v6, v6, -0x1

    aget-object v5, v5, v6

    invoke-virtual {v4, v5}, Lcom/saterskog/cell_lab/Link;->a(Lcom/saterskog/cell_lab/Link;)V

    .line 2385
    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    move-object/from16 v0, v18

    iget-object v5, v0, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    aget-object v5, v5, v3

    iget v5, v5, Lcom/saterskog/cell_lab/Link;->a:I

    aget-object v4, v4, v5

    iget v5, v4, Lcom/saterskog/cell_lab/Cell;->C:I

    add-int/lit8 v5, v5, -0x1

    iput v5, v4, Lcom/saterskog/cell_lab/Cell;->C:I

    .line 2390
    :cond_6
    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/saterskog/cell_lab/CellWorld;->J:[Lcom/saterskog/cell_lab/Link;

    aget-object v4, v4, v3

    move-object/from16 v0, v18

    iget-object v5, v0, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    aget-object v5, v5, v3

    invoke-virtual {v4, v5}, Lcom/saterskog/cell_lab/Link;->a(Lcom/saterskog/cell_lab/Link;)V

    .line 2380
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_7

    .line 2374
    :cond_7
    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    goto/16 :goto_3

    .line 2375
    :cond_8
    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    goto/16 :goto_4

    .line 2376
    :cond_9
    const/4 v3, 0x0

    goto/16 :goto_5

    .line 2377
    :cond_a
    const/4 v3, 0x0

    goto/16 :goto_6

    .line 2382
    :cond_b
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_8

    .line 2392
    :cond_c
    move-object/from16 v0, v18

    iget v0, v0, Lcom/saterskog/cell_lab/Cell;->C:I

    move/from16 v28, v0

    .line 2393
    const/4 v3, 0x0

    move-object/from16 v0, v18

    iput v3, v0, Lcom/saterskog/cell_lab/Cell;->C:I

    .line 2394
    const/4 v3, 0x0

    move-object/from16 v0, v19

    iput v3, v0, Lcom/saterskog/cell_lab/Cell;->C:I

    .line 2395
    const/4 v3, 0x0

    move-object/from16 v0, v18

    iput-boolean v3, v0, Lcom/saterskog/cell_lab/Cell;->x:Z

    .line 2396
    const/4 v3, 0x0

    move-object/from16 v0, v19

    iput-boolean v3, v0, Lcom/saterskog/cell_lab/Cell;->x:Z

    .line 2397
    move-object/from16 v0, v18

    iget v3, v0, Lcom/saterskog/cell_lab/Cell;->T:I

    const/4 v4, -0x1

    if-eq v3, v4, :cond_d

    .line 2398
    move-object/from16 v0, v18

    iget v3, v0, Lcom/saterskog/cell_lab/Cell;->T:I

    add-int/lit8 v3, v3, -0x1

    move-object/from16 v0, v18

    iput v3, v0, Lcom/saterskog/cell_lab/Cell;->T:I

    .line 2399
    move-object/from16 v0, v19

    iget v3, v0, Lcom/saterskog/cell_lab/Cell;->T:I

    add-int/lit8 v3, v3, -0x1

    move-object/from16 v0, v19

    iput v3, v0, Lcom/saterskog/cell_lab/Cell;->T:I

    .line 2400
    move-object/from16 v0, v18

    iget v3, v0, Lcom/saterskog/cell_lab/Cell;->T:I

    if-gtz v3, :cond_d

    .line 2402
    const/4 v3, 0x1

    move-object/from16 v0, v18

    iput-boolean v3, v0, Lcom/saterskog/cell_lab/Cell;->x:Z

    .line 2403
    const/4 v3, 0x1

    move-object/from16 v0, v19

    iput-boolean v3, v0, Lcom/saterskog/cell_lab/Cell;->x:Z

    .line 2409
    :cond_d
    const/4 v3, -0x1

    .line 2410
    const-wide/high16 v4, -0x4010000000000000L    # -1.0

    .line 2411
    const-wide/high16 v8, 0x3ff0000000000000L    # 1.0

    .line 2414
    move-object/from16 v0, v18

    iget-object v6, v0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    move-object/from16 v0, v18

    iget v7, v0, Lcom/saterskog/cell_lab/Cell;->D:I

    aget-object v6, v6, v7

    iget-boolean v6, v6, Lcom/saterskog/cell_lab/Gene;->m:Z

    if-nez v6, :cond_e

    move-object/from16 v0, v18

    iget-object v6, v0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    move-object/from16 v0, v18

    iget v7, v0, Lcom/saterskog/cell_lab/Cell;->D:I

    aget-object v6, v6, v7

    iget-boolean v6, v6, Lcom/saterskog/cell_lab/Gene;->n:Z

    if-eqz v6, :cond_17

    .line 2415
    :cond_e
    const/4 v14, 0x0

    move-wide v10, v8

    move-wide v12, v4

    move v15, v3

    move/from16 v16, v3

    move/from16 v17, v3

    :goto_9
    move/from16 v0, v28

    if-ge v14, v0, :cond_12

    .line 2416
    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/saterskog/cell_lab/CellWorld;->J:[Lcom/saterskog/cell_lab/Link;

    aget-object v6, v6, v14

    iget v6, v6, Lcom/saterskog/cell_lab/Link;->a:I

    const/4 v7, -0x1

    if-eq v6, v7, :cond_26

    .line 2417
    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/saterskog/cell_lab/CellWorld;->J:[Lcom/saterskog/cell_lab/Link;

    aget-object v6, v6, v14

    iget-wide v6, v6, Lcom/saterskog/cell_lab/Link;->c:D

    add-double v6, v6, v20

    invoke-static {v6, v7}, Ljava/lang/Math;->cos(D)D

    move-result-wide v30

    .line 2418
    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/saterskog/cell_lab/CellWorld;->J:[Lcom/saterskog/cell_lab/Link;

    aget-object v6, v6, v14

    iget-wide v6, v6, Lcom/saterskog/cell_lab/Link;->c:D

    add-double v6, v6, v20

    invoke-static {v6, v7}, Ljava/lang/Math;->sin(D)D

    move-result-wide v32

    .line 2419
    mul-double v6, v24, v30

    mul-double v34, v26, v32

    add-double v6, v6, v34

    const-wide/high16 v34, 0x4000000000000000L    # 2.0

    const-wide/high16 v36, 0x3fe0000000000000L    # 0.5

    invoke-virtual/range {v18 .. v18}, Lcom/saterskog/cell_lab/Cell;->b()Lcom/saterskog/cell_lab/Gene;

    move-result-object v29

    move-object/from16 v0, v29

    iget v0, v0, Lcom/saterskog/cell_lab/Gene;->c:F

    move/from16 v29, v0

    move/from16 v0, v29

    float-to-double v0, v0

    move-wide/from16 v38, v0

    sub-double v36, v36, v38

    mul-double v34, v34, v36

    sub-double v6, v6, v34

    .line 2420
    const-wide v34, 0x3fc999999999999aL    # 0.2

    cmpl-double v29, v6, v34

    if-gtz v29, :cond_26

    const-wide v34, -0x4036666666666666L    # -0.2

    cmpg-double v6, v6, v34

    if-ltz v6, :cond_26

    .line 2422
    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/saterskog/cell_lab/CellWorld;->J:[Lcom/saterskog/cell_lab/Link;

    aget-object v7, v7, v14

    iget v7, v7, Lcom/saterskog/cell_lab/Link;->a:I

    aget-object v6, v6, v7

    iget-wide v6, v6, Lcom/saterskog/cell_lab/Cell;->b:D

    move-object/from16 v0, v18

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->b:D

    move-wide/from16 v34, v0

    sub-double v6, v6, v34

    mul-double v6, v6, v24

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    move-object/from16 v29, v0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->J:[Lcom/saterskog/cell_lab/Link;

    move-object/from16 v34, v0

    aget-object v34, v34, v14

    move-object/from16 v0, v34

    iget v0, v0, Lcom/saterskog/cell_lab/Link;->a:I

    move/from16 v34, v0

    aget-object v29, v29, v34

    move-object/from16 v0, v29

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->c:D

    move-wide/from16 v34, v0

    move-object/from16 v0, v18

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->c:D

    move-wide/from16 v36, v0

    sub-double v34, v34, v36

    mul-double v34, v34, v26

    add-double v6, v6, v34

    .line 2423
    move-wide/from16 v0, v26

    neg-double v0, v0

    move-wide/from16 v34, v0

    mul-double v30, v30, v34

    mul-double v32, v32, v24

    add-double v30, v30, v32

    .line 2424
    const-wide/16 v32, 0x0

    cmpl-double v29, v30, v32

    if-lez v29, :cond_10

    .line 2425
    cmpl-double v29, v6, v12

    if-lez v29, :cond_f

    move-wide v12, v6

    move/from16 v17, v14

    .line 2429
    :cond_f
    cmpg-double v29, v6, v10

    if-gez v29, :cond_26

    move-wide v10, v12

    move v12, v15

    move v13, v14

    move/from16 v15, v17

    move-wide/from16 v40, v8

    move-wide v8, v6

    move-wide/from16 v6, v40

    .line 2415
    :goto_a
    add-int/lit8 v14, v14, 0x1

    move/from16 v16, v13

    move/from16 v17, v15

    move v15, v12

    move-wide v12, v10

    move-wide v10, v8

    move-wide v8, v6

    goto/16 :goto_9

    .line 2434
    :cond_10
    cmpg-double v29, v6, v8

    if-gez v29, :cond_11

    move-wide v8, v6

    move v15, v14

    .line 2438
    :cond_11
    cmpl-double v29, v6, v4

    if-lez v29, :cond_26

    move-wide v4, v6

    move v3, v14

    move-wide v6, v8

    move-wide v8, v10

    move-wide v10, v12

    move v12, v15

    move/from16 v13, v16

    move/from16 v15, v17

    .line 2440
    goto :goto_a

    .line 2445
    :cond_12
    const/4 v4, 0x0

    :goto_b
    move/from16 v0, v28

    if-ge v4, v0, :cond_17

    .line 2446
    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/saterskog/cell_lab/CellWorld;->J:[Lcom/saterskog/cell_lab/Link;

    aget-object v5, v5, v4

    iget v5, v5, Lcom/saterskog/cell_lab/Link;->a:I

    const/4 v6, -0x1

    if-eq v5, v6, :cond_16

    .line 2461
    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/saterskog/cell_lab/CellWorld;->J:[Lcom/saterskog/cell_lab/Link;

    aget-object v5, v5, v4

    iget-wide v6, v5, Lcom/saterskog/cell_lab/Link;->c:D

    add-double v6, v6, v20

    invoke-static {v6, v7}, Ljava/lang/Math;->cos(D)D

    move-result-wide v6

    mul-double v6, v6, v24

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/saterskog/cell_lab/CellWorld;->J:[Lcom/saterskog/cell_lab/Link;

    aget-object v5, v5, v4

    iget-wide v8, v5, Lcom/saterskog/cell_lab/Link;->c:D

    add-double v8, v8, v20

    invoke-static {v8, v9}, Ljava/lang/Math;->sin(D)D

    move-result-wide v8

    mul-double v8, v8, v26

    add-double/2addr v6, v8

    const-wide/high16 v8, 0x4000000000000000L    # 2.0

    const-wide/high16 v10, 0x3fe0000000000000L    # 0.5

    invoke-virtual/range {v18 .. v18}, Lcom/saterskog/cell_lab/Cell;->b()Lcom/saterskog/cell_lab/Gene;

    move-result-object v5

    iget v5, v5, Lcom/saterskog/cell_lab/Gene;->c:F

    float-to-double v12, v5

    sub-double/2addr v10, v12

    mul-double/2addr v8, v10

    sub-double/2addr v6, v8

    .line 2463
    move-object/from16 v0, v18

    iget-object v5, v0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    move-object/from16 v0, v18

    iget v8, v0, Lcom/saterskog/cell_lab/Cell;->D:I

    aget-object v5, v5, v8

    iget-boolean v5, v5, Lcom/saterskog/cell_lab/Gene;->n:Z

    if-eqz v5, :cond_14

    .line 2465
    const-wide v8, 0x3fc999999999999aL    # 0.2

    cmpl-double v5, v6, v8

    if-gtz v5, :cond_13

    const-wide v8, -0x4036666666666666L    # -0.2

    cmpl-double v5, v6, v8

    if-lez v5, :cond_14

    move/from16 v0, v17

    if-eq v4, v0, :cond_13

    if-ne v4, v3, :cond_14

    .line 2467
    :cond_13
    move-object/from16 v0, v19

    iget v5, v0, Lcom/saterskog/cell_lab/Cell;->C:I

    const/16 v8, 0x14

    if-ge v5, v8, :cond_14

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/saterskog/cell_lab/CellWorld;->J:[Lcom/saterskog/cell_lab/Link;

    aget-object v8, v8, v4

    iget v8, v8, Lcom/saterskog/cell_lab/Link;->a:I

    aget-object v5, v5, v8

    iget v5, v5, Lcom/saterskog/cell_lab/Cell;->C:I

    const/16 v8, 0x14

    if-ge v5, v8, :cond_14

    .line 2469
    move-object/from16 v0, v19

    iget-object v5, v0, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    move-object/from16 v0, v19

    iget v8, v0, Lcom/saterskog/cell_lab/Cell;->C:I

    aget-object v5, v5, v8

    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/saterskog/cell_lab/CellWorld;->J:[Lcom/saterskog/cell_lab/Link;

    aget-object v8, v8, v4

    invoke-virtual {v5, v8}, Lcom/saterskog/cell_lab/Link;->a(Lcom/saterskog/cell_lab/Link;)V

    .line 2470
    move-object/from16 v0, v19

    iget-object v5, v0, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    move-object/from16 v0, v19

    iget v8, v0, Lcom/saterskog/cell_lab/Cell;->C:I

    aget-object v5, v5, v8

    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/saterskog/cell_lab/CellWorld;->J:[Lcom/saterskog/cell_lab/Link;

    aget-object v8, v8, v4

    iget-wide v8, v8, Lcom/saterskog/cell_lab/Link;->c:D

    add-double v8, v8, v20

    move-object/from16 v0, v19

    iget-wide v10, v0, Lcom/saterskog/cell_lab/Cell;->k:D

    sub-double/2addr v8, v10

    iput-wide v8, v5, Lcom/saterskog/cell_lab/Link;->c:D

    .line 2471
    move-object/from16 v0, v19

    iget-object v5, v0, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    move-object/from16 v0, v19

    iget v8, v0, Lcom/saterskog/cell_lab/Cell;->C:I

    aget-object v5, v5, v8

    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/saterskog/cell_lab/CellWorld;->J:[Lcom/saterskog/cell_lab/Link;

    aget-object v8, v8, v4

    iget-wide v8, v8, Lcom/saterskog/cell_lab/Link;->d:D

    iput-wide v8, v5, Lcom/saterskog/cell_lab/Link;->d:D

    .line 2477
    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/saterskog/cell_lab/CellWorld;->J:[Lcom/saterskog/cell_lab/Link;

    aget-object v8, v8, v4

    iget v8, v8, Lcom/saterskog/cell_lab/Link;->a:I

    aget-object v5, v5, v8

    iget-object v5, v5, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    move-object/from16 v0, p0

    iget-object v9, v0, Lcom/saterskog/cell_lab/CellWorld;->J:[Lcom/saterskog/cell_lab/Link;

    aget-object v9, v9, v4

    iget v9, v9, Lcom/saterskog/cell_lab/Link;->a:I

    aget-object v8, v8, v9

    iget v8, v8, Lcom/saterskog/cell_lab/Cell;->C:I

    aget-object v5, v5, v8

    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/saterskog/cell_lab/CellWorld;->J:[Lcom/saterskog/cell_lab/Link;

    aget-object v8, v8, v4

    invoke-virtual {v5, v8}, Lcom/saterskog/cell_lab/Link;->a(Lcom/saterskog/cell_lab/Link;)V

    .line 2478
    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/saterskog/cell_lab/CellWorld;->J:[Lcom/saterskog/cell_lab/Link;

    aget-object v8, v8, v4

    iget v8, v8, Lcom/saterskog/cell_lab/Link;->a:I

    aget-object v5, v5, v8

    iget-object v5, v5, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    move-object/from16 v0, p0

    iget-object v9, v0, Lcom/saterskog/cell_lab/CellWorld;->J:[Lcom/saterskog/cell_lab/Link;

    aget-object v9, v9, v4

    iget v9, v9, Lcom/saterskog/cell_lab/Link;->a:I

    aget-object v8, v8, v9

    iget v8, v8, Lcom/saterskog/cell_lab/Cell;->C:I

    aget-object v5, v5, v8

    move-object/from16 v0, p0

    iget v8, v0, Lcom/saterskog/cell_lab/CellWorld;->z:I

    add-int/lit8 v8, v8, -0x1

    iput v8, v5, Lcom/saterskog/cell_lab/Link;->a:I

    .line 2479
    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/saterskog/cell_lab/CellWorld;->J:[Lcom/saterskog/cell_lab/Link;

    aget-object v8, v8, v4

    iget v8, v8, Lcom/saterskog/cell_lab/Link;->a:I

    aget-object v5, v5, v8

    iget-object v5, v5, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    move-object/from16 v0, p0

    iget-object v9, v0, Lcom/saterskog/cell_lab/CellWorld;->J:[Lcom/saterskog/cell_lab/Link;

    aget-object v9, v9, v4

    iget v9, v9, Lcom/saterskog/cell_lab/Link;->a:I

    aget-object v8, v8, v9

    iget v8, v8, Lcom/saterskog/cell_lab/Cell;->C:I

    aget-object v5, v5, v8

    move-object/from16 v0, v19

    iget-object v8, v0, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    move-object/from16 v0, v19

    iget v9, v0, Lcom/saterskog/cell_lab/Cell;->C:I

    aget-object v8, v8, v9

    iget-wide v8, v8, Lcom/saterskog/cell_lab/Link;->d:D

    iput-wide v8, v5, Lcom/saterskog/cell_lab/Link;->c:D

    .line 2480
    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/saterskog/cell_lab/CellWorld;->J:[Lcom/saterskog/cell_lab/Link;

    aget-object v8, v8, v4

    iget v8, v8, Lcom/saterskog/cell_lab/Link;->a:I

    aget-object v5, v5, v8

    iget-object v5, v5, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    move-object/from16 v0, p0

    iget-object v9, v0, Lcom/saterskog/cell_lab/CellWorld;->J:[Lcom/saterskog/cell_lab/Link;

    aget-object v9, v9, v4

    iget v9, v9, Lcom/saterskog/cell_lab/Link;->a:I

    aget-object v8, v8, v9

    iget v8, v8, Lcom/saterskog/cell_lab/Cell;->C:I

    aget-object v5, v5, v8

    move-object/from16 v0, v19

    iget-object v8, v0, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    move-object/from16 v0, v19

    iget v9, v0, Lcom/saterskog/cell_lab/Cell;->C:I

    aget-object v8, v8, v9

    iget-wide v8, v8, Lcom/saterskog/cell_lab/Link;->c:D

    iput-wide v8, v5, Lcom/saterskog/cell_lab/Link;->d:D

    .line 2482
    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/saterskog/cell_lab/CellWorld;->J:[Lcom/saterskog/cell_lab/Link;

    aget-object v8, v8, v4

    iget v8, v8, Lcom/saterskog/cell_lab/Link;->a:I

    aget-object v5, v5, v8

    iget v8, v5, Lcom/saterskog/cell_lab/Cell;->C:I

    add-int/lit8 v8, v8, 0x1

    iput v8, v5, Lcom/saterskog/cell_lab/Cell;->C:I

    .line 2483
    move-object/from16 v0, v19

    iget v5, v0, Lcom/saterskog/cell_lab/Cell;->C:I

    add-int/lit8 v5, v5, 0x1

    move-object/from16 v0, v19

    iput v5, v0, Lcom/saterskog/cell_lab/Cell;->C:I

    .line 2487
    :cond_14
    move-object/from16 v0, v18

    iget-object v5, v0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    move-object/from16 v0, v18

    iget v8, v0, Lcom/saterskog/cell_lab/Cell;->D:I

    aget-object v5, v5, v8

    iget-boolean v5, v5, Lcom/saterskog/cell_lab/Gene;->m:Z

    if-eqz v5, :cond_16

    .line 2488
    const-wide v8, -0x4036666666666666L    # -0.2

    cmpg-double v5, v6, v8

    if-ltz v5, :cond_15

    const-wide v8, 0x3fc999999999999aL    # 0.2

    cmpg-double v5, v6, v8

    if-gez v5, :cond_16

    move/from16 v0, v16

    if-eq v4, v0, :cond_15

    if-ne v4, v15, :cond_16

    .line 2489
    :cond_15
    move-object/from16 v0, v18

    iget v5, v0, Lcom/saterskog/cell_lab/Cell;->C:I

    const/16 v6, 0x14

    if-ge v5, v6, :cond_16

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/saterskog/cell_lab/CellWorld;->J:[Lcom/saterskog/cell_lab/Link;

    aget-object v6, v6, v4

    iget v6, v6, Lcom/saterskog/cell_lab/Link;->a:I

    aget-object v5, v5, v6

    iget v5, v5, Lcom/saterskog/cell_lab/Cell;->C:I

    const/16 v6, 0x14

    if-ge v5, v6, :cond_16

    .line 2491
    move-object/from16 v0, v18

    iget-object v5, v0, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    move-object/from16 v0, v18

    iget v6, v0, Lcom/saterskog/cell_lab/Cell;->C:I

    aget-object v5, v5, v6

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/saterskog/cell_lab/CellWorld;->J:[Lcom/saterskog/cell_lab/Link;

    aget-object v6, v6, v4

    invoke-virtual {v5, v6}, Lcom/saterskog/cell_lab/Link;->a(Lcom/saterskog/cell_lab/Link;)V

    .line 2492
    move-object/from16 v0, v18

    iget-object v5, v0, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    move-object/from16 v0, v18

    iget v6, v0, Lcom/saterskog/cell_lab/Cell;->C:I

    aget-object v5, v5, v6

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/saterskog/cell_lab/CellWorld;->J:[Lcom/saterskog/cell_lab/Link;

    aget-object v6, v6, v4

    iget-wide v6, v6, Lcom/saterskog/cell_lab/Link;->c:D

    add-double v6, v6, v20

    move-object/from16 v0, v18

    iget-wide v8, v0, Lcom/saterskog/cell_lab/Cell;->k:D

    sub-double/2addr v6, v8

    iput-wide v6, v5, Lcom/saterskog/cell_lab/Link;->c:D

    .line 2493
    move-object/from16 v0, v18

    iget-object v5, v0, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    move-object/from16 v0, v18

    iget v6, v0, Lcom/saterskog/cell_lab/Cell;->C:I

    aget-object v5, v5, v6

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/saterskog/cell_lab/CellWorld;->J:[Lcom/saterskog/cell_lab/Link;

    aget-object v6, v6, v4

    iget-wide v6, v6, Lcom/saterskog/cell_lab/Link;->d:D

    iput-wide v6, v5, Lcom/saterskog/cell_lab/Link;->d:D

    .line 2498
    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/saterskog/cell_lab/CellWorld;->J:[Lcom/saterskog/cell_lab/Link;

    aget-object v6, v6, v4

    iget v6, v6, Lcom/saterskog/cell_lab/Link;->a:I

    aget-object v5, v5, v6

    iget-object v5, v5, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/saterskog/cell_lab/CellWorld;->J:[Lcom/saterskog/cell_lab/Link;

    aget-object v7, v7, v4

    iget v7, v7, Lcom/saterskog/cell_lab/Link;->a:I

    aget-object v6, v6, v7

    iget v6, v6, Lcom/saterskog/cell_lab/Cell;->C:I

    aget-object v5, v5, v6

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/saterskog/cell_lab/CellWorld;->J:[Lcom/saterskog/cell_lab/Link;

    aget-object v6, v6, v4

    invoke-virtual {v5, v6}, Lcom/saterskog/cell_lab/Link;->a(Lcom/saterskog/cell_lab/Link;)V

    .line 2499
    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/saterskog/cell_lab/CellWorld;->J:[Lcom/saterskog/cell_lab/Link;

    aget-object v6, v6, v4

    iget v6, v6, Lcom/saterskog/cell_lab/Link;->a:I

    aget-object v5, v5, v6

    iget-object v5, v5, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/saterskog/cell_lab/CellWorld;->J:[Lcom/saterskog/cell_lab/Link;

    aget-object v7, v7, v4

    iget v7, v7, Lcom/saterskog/cell_lab/Link;->a:I

    aget-object v6, v6, v7

    iget v6, v6, Lcom/saterskog/cell_lab/Cell;->C:I

    aget-object v5, v5, v6

    iput v2, v5, Lcom/saterskog/cell_lab/Link;->a:I

    .line 2500
    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/saterskog/cell_lab/CellWorld;->J:[Lcom/saterskog/cell_lab/Link;

    aget-object v6, v6, v4

    iget v6, v6, Lcom/saterskog/cell_lab/Link;->a:I

    aget-object v5, v5, v6

    iget-object v5, v5, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/saterskog/cell_lab/CellWorld;->J:[Lcom/saterskog/cell_lab/Link;

    aget-object v7, v7, v4

    iget v7, v7, Lcom/saterskog/cell_lab/Link;->a:I

    aget-object v6, v6, v7

    iget v6, v6, Lcom/saterskog/cell_lab/Cell;->C:I

    aget-object v5, v5, v6

    move-object/from16 v0, v18

    iget-object v6, v0, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    move-object/from16 v0, v18

    iget v7, v0, Lcom/saterskog/cell_lab/Cell;->C:I

    aget-object v6, v6, v7

    iget-wide v6, v6, Lcom/saterskog/cell_lab/Link;->d:D

    iput-wide v6, v5, Lcom/saterskog/cell_lab/Link;->c:D

    .line 2501
    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/saterskog/cell_lab/CellWorld;->J:[Lcom/saterskog/cell_lab/Link;

    aget-object v6, v6, v4

    iget v6, v6, Lcom/saterskog/cell_lab/Link;->a:I

    aget-object v5, v5, v6

    iget-object v5, v5, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/saterskog/cell_lab/CellWorld;->J:[Lcom/saterskog/cell_lab/Link;

    aget-object v7, v7, v4

    iget v7, v7, Lcom/saterskog/cell_lab/Link;->a:I

    aget-object v6, v6, v7

    iget v6, v6, Lcom/saterskog/cell_lab/Cell;->C:I

    aget-object v5, v5, v6

    move-object/from16 v0, v18

    iget-object v6, v0, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    move-object/from16 v0, v18

    iget v7, v0, Lcom/saterskog/cell_lab/Cell;->C:I

    aget-object v6, v6, v7

    iget-wide v6, v6, Lcom/saterskog/cell_lab/Link;->c:D

    iput-wide v6, v5, Lcom/saterskog/cell_lab/Link;->d:D

    .line 2502
    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/saterskog/cell_lab/CellWorld;->J:[Lcom/saterskog/cell_lab/Link;

    aget-object v6, v6, v4

    iget v6, v6, Lcom/saterskog/cell_lab/Link;->a:I

    aget-object v5, v5, v6

    iget v6, v5, Lcom/saterskog/cell_lab/Cell;->C:I

    add-int/lit8 v6, v6, 0x1

    iput v6, v5, Lcom/saterskog/cell_lab/Cell;->C:I

    .line 2503
    move-object/from16 v0, v18

    iget v5, v0, Lcom/saterskog/cell_lab/Cell;->C:I

    add-int/lit8 v5, v5, 0x1

    move-object/from16 v0, v18

    iput v5, v0, Lcom/saterskog/cell_lab/Cell;->C:I

    .line 2445
    :cond_16
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_b

    .line 2513
    :cond_17
    move-object/from16 v0, v18

    iget-object v3, v0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    move-object/from16 v0, v18

    iget v4, v0, Lcom/saterskog/cell_lab/Cell;->D:I

    aget-object v3, v3, v4

    iget-boolean v3, v3, Lcom/saterskog/cell_lab/Gene;->l:Z

    if-eqz v3, :cond_18

    const/16 v3, 0x14

    move-object/from16 v0, v18

    iget v4, v0, Lcom/saterskog/cell_lab/Cell;->C:I

    if-le v3, v4, :cond_18

    const/16 v3, 0x14

    move-object/from16 v0, v19

    iget v4, v0, Lcom/saterskog/cell_lab/Cell;->C:I

    if-le v3, v4, :cond_18

    .line 2514
    move-object/from16 v0, v18

    iget-object v3, v0, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    move-object/from16 v0, v18

    iget v4, v0, Lcom/saterskog/cell_lab/Cell;->C:I

    aget-object v3, v3, v4

    .line 2515
    move-object/from16 v0, v19

    iget-object v4, v0, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    move-object/from16 v0, v19

    iget v5, v0, Lcom/saterskog/cell_lab/Cell;->C:I

    aget-object v4, v4, v5

    .line 2516
    const/4 v5, 0x1

    iput-boolean v5, v3, Lcom/saterskog/cell_lab/Link;->b:Z

    .line 2517
    const/4 v5, 0x1

    iput-boolean v5, v4, Lcom/saterskog/cell_lab/Link;->b:Z

    .line 2518
    move-object/from16 v0, p0

    iget v5, v0, Lcom/saterskog/cell_lab/CellWorld;->z:I

    add-int/lit8 v5, v5, -0x1

    iput v5, v3, Lcom/saterskog/cell_lab/Link;->a:I

    .line 2519
    iput v2, v4, Lcom/saterskog/cell_lab/Link;->a:I

    .line 2520
    move-object/from16 v0, v18

    iget-wide v6, v0, Lcom/saterskog/cell_lab/Cell;->k:D

    sub-double v6, v22, v6

    iput-wide v6, v3, Lcom/saterskog/cell_lab/Link;->c:D

    iput-wide v6, v4, Lcom/saterskog/cell_lab/Link;->d:D

    .line 2521
    const-wide v6, 0x400921fb54442d18L    # Math.PI

    add-double v6, v6, v22

    move-object/from16 v0, v19

    iget-wide v8, v0, Lcom/saterskog/cell_lab/Cell;->k:D

    sub-double/2addr v6, v8

    iput-wide v6, v4, Lcom/saterskog/cell_lab/Link;->c:D

    iput-wide v6, v3, Lcom/saterskog/cell_lab/Link;->d:D

    .line 2522
    move-object/from16 v0, v18

    iget-object v5, v0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    move-object/from16 v0, v18

    iget v6, v0, Lcom/saterskog/cell_lab/Cell;->D:I

    aget-object v5, v5, v6

    iget v5, v5, Lcom/saterskog/cell_lab/Gene;->h:F

    iput v5, v3, Lcom/saterskog/cell_lab/Link;->k:F

    iput v5, v4, Lcom/saterskog/cell_lab/Link;->k:F

    .line 2523
    const/4 v5, 0x5

    move-object/from16 v0, v18

    invoke-virtual {v0, v5}, Lcom/saterskog/cell_lab/Cell;->a(I)F

    move-result v5

    iput v5, v3, Lcom/saterskog/cell_lab/Link;->l:F

    iput v5, v4, Lcom/saterskog/cell_lab/Link;->l:F

    .line 2524
    move-object/from16 v0, v18

    iget v3, v0, Lcom/saterskog/cell_lab/Cell;->C:I

    add-int/lit8 v3, v3, 0x1

    move-object/from16 v0, v18

    iput v3, v0, Lcom/saterskog/cell_lab/Cell;->C:I

    .line 2525
    move-object/from16 v0, v19

    iget v3, v0, Lcom/saterskog/cell_lab/Cell;->C:I

    add-int/lit8 v3, v3, 0x1

    move-object/from16 v0, v19

    iput v3, v0, Lcom/saterskog/cell_lab/Cell;->C:I

    .line 2527
    :cond_18
    move-object/from16 v0, v18

    iget-object v3, v0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    move-object/from16 v0, v18

    iget v4, v0, Lcom/saterskog/cell_lab/Cell;->D:I

    aget-object v3, v3, v4

    iget v3, v3, Lcom/saterskog/cell_lab/Gene;->j:I

    move-object/from16 v0, v19

    iput v3, v0, Lcom/saterskog/cell_lab/Cell;->D:I

    .line 2528
    move-object/from16 v0, v18

    iget-object v3, v0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    move-object/from16 v0, v18

    iget v4, v0, Lcom/saterskog/cell_lab/Cell;->D:I

    aget-object v3, v3, v4

    iget v3, v3, Lcom/saterskog/cell_lab/Gene;->i:I

    move-object/from16 v0, v18

    iput v3, v0, Lcom/saterskog/cell_lab/Cell;->D:I

    .line 2532
    move-object/from16 v0, v18

    iget-object v3, v0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    move-object/from16 v0, v18

    iget v4, v0, Lcom/saterskog/cell_lab/Cell;->D:I

    aget-object v3, v3, v4

    iget-object v3, v3, Lcom/saterskog/cell_lab/Gene;->s:Lcom/saterskog/cell_lab/h;

    sget-object v4, Lcom/saterskog/cell_lab/h;->e:Lcom/saterskog/cell_lab/h;

    if-ne v3, v4, :cond_1c

    .line 2533
    move-object/from16 v0, v18

    iget-wide v4, v0, Lcom/saterskog/cell_lab/Cell;->w:D

    const-wide v6, 0x3fd70a3d70a3d70aL    # 0.36

    cmpl-double v3, v4, v6

    if-lez v3, :cond_19

    .line 2535
    move-object/from16 v0, v18

    iget-wide v4, v0, Lcom/saterskog/cell_lab/Cell;->w:D

    const-wide v6, 0x3fd70a3d70a3d70aL    # 0.36

    sub-double/2addr v4, v6

    double-to-float v3, v4

    move-object/from16 v0, v18

    iput v3, v0, Lcom/saterskog/cell_lab/Cell;->S:F

    .line 2536
    const-wide v4, 0x3fd70a3d70a3d70aL    # 0.36

    move-object/from16 v0, v18

    iput-wide v4, v0, Lcom/saterskog/cell_lab/Cell;->w:D

    .line 2540
    :cond_19
    :goto_c
    move-object/from16 v0, v19

    iget-object v3, v0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    move-object/from16 v0, v19

    iget v4, v0, Lcom/saterskog/cell_lab/Cell;->D:I

    aget-object v3, v3, v4

    iget-object v3, v3, Lcom/saterskog/cell_lab/Gene;->s:Lcom/saterskog/cell_lab/h;

    sget-object v4, Lcom/saterskog/cell_lab/h;->e:Lcom/saterskog/cell_lab/h;

    if-ne v3, v4, :cond_1d

    .line 2541
    move-object/from16 v0, v19

    iget-wide v4, v0, Lcom/saterskog/cell_lab/Cell;->w:D

    const-wide v6, 0x3fd70a3d70a3d70aL    # 0.36

    cmpl-double v3, v4, v6

    if-lez v3, :cond_1a

    .line 2543
    move-object/from16 v0, v19

    iget-wide v4, v0, Lcom/saterskog/cell_lab/Cell;->w:D

    const-wide v6, 0x3fd70a3d70a3d70aL    # 0.36

    sub-double/2addr v4, v6

    double-to-float v3, v4

    move-object/from16 v0, v19

    iput v3, v0, Lcom/saterskog/cell_lab/Cell;->S:F

    .line 2544
    const-wide v4, 0x3fd70a3d70a3d70aL    # 0.36

    move-object/from16 v0, v19

    iput-wide v4, v0, Lcom/saterskog/cell_lab/Cell;->w:D

    .line 2548
    :cond_1a
    :goto_d
    move-object/from16 v0, v18

    iget-object v3, v0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    move-object/from16 v0, v18

    iget v4, v0, Lcom/saterskog/cell_lab/Cell;->D:I

    aget-object v3, v3, v4

    iget-object v3, v3, Lcom/saterskog/cell_lab/Gene;->s:Lcom/saterskog/cell_lab/h;

    sget-object v4, Lcom/saterskog/cell_lab/h;->b:Lcom/saterskog/cell_lab/h;

    if-ne v3, v4, :cond_1e

    .line 2549
    const/4 v3, 0x0

    :goto_e
    move-object/from16 v0, v18

    iget v4, v0, Lcom/saterskog/cell_lab/Cell;->C:I

    if-ge v3, v4, :cond_1e

    .line 2550
    move-object/from16 v0, v18

    iget-object v4, v0, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    aget-object v4, v4, v3

    iget-wide v4, v4, Lcom/saterskog/cell_lab/Link;->c:D

    invoke-static {v4, v5}, Ljava/lang/Math;->cos(D)D

    move-result-wide v4

    const-wide v6, -0x4016666666666666L    # -0.8

    cmpg-double v4, v4, v6

    if-gez v4, :cond_1b

    .line 2551
    const/4 v4, 0x1

    move-object/from16 v0, v18

    iput-boolean v4, v0, Lcom/saterskog/cell_lab/Cell;->x:Z

    .line 2549
    :cond_1b
    add-int/lit8 v3, v3, 0x1

    goto :goto_e

    .line 2538
    :cond_1c
    move-object/from16 v0, v18

    iget-wide v4, v0, Lcom/saterskog/cell_lab/Cell;->w:D

    const-wide v6, 0x3fd70a3d70a3d70aL    # 0.36

    cmpl-double v3, v4, v6

    if-lez v3, :cond_19

    const-wide v4, 0x3fd70a3d70a3d70aL    # 0.36

    move-object/from16 v0, v18

    iput-wide v4, v0, Lcom/saterskog/cell_lab/Cell;->w:D

    goto :goto_c

    .line 2546
    :cond_1d
    move-object/from16 v0, v19

    iget-wide v4, v0, Lcom/saterskog/cell_lab/Cell;->w:D

    const-wide v6, 0x3fd70a3d70a3d70aL    # 0.36

    cmpl-double v3, v4, v6

    if-lez v3, :cond_1a

    const-wide v4, 0x3fd70a3d70a3d70aL    # 0.36

    move-object/from16 v0, v19

    iput-wide v4, v0, Lcom/saterskog/cell_lab/Cell;->w:D

    goto :goto_d

    .line 2555
    :cond_1e
    move-object/from16 v0, v19

    iget-object v3, v0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    move-object/from16 v0, v19

    iget v4, v0, Lcom/saterskog/cell_lab/Cell;->D:I

    aget-object v3, v3, v4

    iget-object v3, v3, Lcom/saterskog/cell_lab/Gene;->s:Lcom/saterskog/cell_lab/h;

    sget-object v4, Lcom/saterskog/cell_lab/h;->b:Lcom/saterskog/cell_lab/h;

    if-ne v3, v4, :cond_20

    .line 2556
    const/4 v3, 0x0

    :goto_f
    move-object/from16 v0, v19

    iget v4, v0, Lcom/saterskog/cell_lab/Cell;->C:I

    if-ge v3, v4, :cond_20

    .line 2557
    move-object/from16 v0, v19

    iget-object v4, v0, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    aget-object v4, v4, v3

    iget-wide v4, v4, Lcom/saterskog/cell_lab/Link;->c:D

    invoke-static {v4, v5}, Ljava/lang/Math;->cos(D)D

    move-result-wide v4

    const-wide v6, -0x4016666666666666L    # -0.8

    cmpg-double v4, v4, v6

    if-gez v4, :cond_1f

    .line 2558
    const/4 v4, 0x1

    move-object/from16 v0, v19

    iput-boolean v4, v0, Lcom/saterskog/cell_lab/Cell;->x:Z

    .line 2556
    :cond_1f
    add-int/lit8 v3, v3, 0x1

    goto :goto_f

    .line 2562
    :cond_20
    move-object/from16 v0, v19

    iget-wide v4, v0, Lcom/saterskog/cell_lab/Cell;->w:D

    const-wide/16 v6, 0x0

    cmpg-double v3, v4, v6

    if-gtz v3, :cond_21

    .line 2563
    move-object/from16 v0, p0

    iget v3, v0, Lcom/saterskog/cell_lab/CellWorld;->z:I

    add-int/lit8 v3, v3, -0x1

    const/4 v4, 0x0

    move-object/from16 v0, p0

    invoke-virtual {v0, v3, v4}, Lcom/saterskog/cell_lab/CellWorld;->a(IZ)V

    .line 2565
    :cond_21
    move-object/from16 v0, v18

    iget-wide v4, v0, Lcom/saterskog/cell_lab/Cell;->w:D

    const-wide/16 v6, 0x0

    cmpg-double v3, v4, v6

    if-gtz v3, :cond_22

    .line 2566
    const/4 v3, 0x0

    move-object/from16 v0, p0

    invoke-virtual {v0, v2, v3}, Lcom/saterskog/cell_lab/CellWorld;->a(IZ)V

    add-int/lit8 v2, v2, -0x1

    .line 2570
    :cond_22
    const-wide/16 v4, 0x0

    move-object/from16 v0, v18

    iput-wide v4, v0, Lcom/saterskog/cell_lab/Cell;->j:D

    move-object/from16 v0, v18

    iput-wide v4, v0, Lcom/saterskog/cell_lab/Cell;->h:D

    move-object/from16 v0, v18

    iput-wide v4, v0, Lcom/saterskog/cell_lab/Cell;->g:D

    .line 2571
    move-object/from16 v0, v18

    iget-wide v4, v0, Lcom/saterskog/cell_lab/Cell;->q:D

    neg-double v4, v4

    const-wide v6, 0x3fd3333340000000L    # 0.30000001192092896

    mul-double/2addr v4, v6

    move-object/from16 v0, v18

    iput-wide v4, v0, Lcom/saterskog/cell_lab/Cell;->i:D

    .line 2572
    move-object/from16 v0, v18

    iget-object v3, v0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    move-object/from16 v0, v18

    iget v4, v0, Lcom/saterskog/cell_lab/Cell;->D:I

    aget-object v3, v3, v4

    iget-object v3, v3, Lcom/saterskog/cell_lab/Gene;->s:Lcom/saterskog/cell_lab/h;

    sget-object v4, Lcom/saterskog/cell_lab/h;->b:Lcom/saterskog/cell_lab/h;

    if-ne v3, v4, :cond_24

    .line 2573
    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object/from16 v0, v18

    invoke-virtual {v0, v3, v4}, Lcom/saterskog/cell_lab/Cell;->a(II)F

    move-result v3

    .line 2574
    move-object/from16 v0, v18

    iget v4, v0, Lcom/saterskog/cell_lab/Cell;->r:F

    float-to-double v4, v4

    float-to-double v6, v3

    mul-double v6, v6, p1

    add-double/2addr v4, v6

    double-to-float v4, v4

    move-object/from16 v0, v18

    iput v4, v0, Lcom/saterskog/cell_lab/Cell;->r:F

    .line 2575
    :goto_10
    move-object/from16 v0, v18

    iget v4, v0, Lcom/saterskog/cell_lab/Cell;->r:F

    float-to-double v4, v4

    const-wide v6, 0x405c200000000000L    # 112.5

    mul-double/2addr v4, v6

    const-wide v6, 0x404f6a7a2955385eL    # 62.83185307179586

    cmpl-double v4, v4, v6

    if-lez v4, :cond_23

    move-object/from16 v0, v18

    iget v4, v0, Lcom/saterskog/cell_lab/Cell;->r:F

    float-to-double v4, v4

    const-wide v6, 0x3fe1df46a2529d39L    # 0.5585053606381855

    sub-double/2addr v4, v6

    double-to-float v4, v4

    move-object/from16 v0, v18

    iput v4, v0, Lcom/saterskog/cell_lab/Cell;->r:F

    goto :goto_10

    .line 2576
    :cond_23
    move-object/from16 v0, p0

    iget-boolean v4, v0, Lcom/saterskog/cell_lab/CellWorld;->bg:Z

    if-nez v4, :cond_24

    .line 2577
    move-object/from16 v0, v18

    iget-wide v4, v0, Lcom/saterskog/cell_lab/Cell;->g:D

    move-object/from16 v0, v18

    iget-wide v6, v0, Lcom/saterskog/cell_lab/Cell;->k:D

    invoke-static {v6, v7}, Ljava/lang/Math;->cos(D)D

    move-result-wide v6

    float-to-double v8, v3

    mul-double/2addr v6, v8

    add-double/2addr v4, v6

    move-object/from16 v0, v18

    iput-wide v4, v0, Lcom/saterskog/cell_lab/Cell;->g:D

    .line 2578
    move-object/from16 v0, v18

    iget-wide v4, v0, Lcom/saterskog/cell_lab/Cell;->h:D

    move-object/from16 v0, v18

    iget-wide v6, v0, Lcom/saterskog/cell_lab/Cell;->k:D

    invoke-static {v6, v7}, Ljava/lang/Math;->sin(D)D

    move-result-wide v6

    float-to-double v8, v3

    mul-double/2addr v6, v8

    add-double/2addr v4, v6

    move-object/from16 v0, v18

    iput-wide v4, v0, Lcom/saterskog/cell_lab/Cell;->h:D

    .line 2313
    :cond_24
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    .line 2582
    :cond_25
    return-void

    :cond_26
    move-wide v6, v8

    move-wide v8, v10

    move-wide v10, v12

    move v12, v15

    move/from16 v13, v16

    move/from16 v15, v17

    goto/16 :goto_a
.end method

.method private f(D)V
    .locals 9

    .prologue
    .line 2599
    const/4 v0, 0x0

    :goto_0
    iget v1, p0, Lcom/saterskog/cell_lab/CellWorld;->z:I

    if-ge v0, v1, :cond_8

    .line 2600
    iget-object v1, p0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    aget-object v1, v1, v0

    .line 2602
    iget-wide v2, v1, Lcom/saterskog/cell_lab/Cell;->o:D

    const-wide/high16 v4, 0x4014000000000000L    # 5.0

    mul-double/2addr v4, p1

    cmpl-double v2, v2, v4

    if-lez v2, :cond_0

    .line 2604
    iget-wide v2, v1, Lcom/saterskog/cell_lab/Cell;->d:D

    iget-wide v4, v1, Lcom/saterskog/cell_lab/Cell;->w:D

    const-wide/high16 v6, 0x4079000000000000L    # 400.0

    div-double/2addr v4, v6

    iget-wide v6, v1, Lcom/saterskog/cell_lab/Cell;->d:D

    div-double/2addr v4, v6

    iget-wide v6, v1, Lcom/saterskog/cell_lab/Cell;->d:D

    sub-double/2addr v4, v6

    const-wide/high16 v6, 0x3fe0000000000000L    # 0.5

    mul-double/2addr v4, v6

    const-wide/high16 v6, 0x4024000000000000L    # 10.0

    mul-double/2addr v4, v6

    mul-double/2addr v4, p1

    add-double/2addr v2, v4

    iput-wide v2, v1, Lcom/saterskog/cell_lab/Cell;->d:D

    .line 2605
    iget-wide v2, v1, Lcom/saterskog/cell_lab/Cell;->d:D

    const-wide v4, 0x3f9eb851eb851eb8L    # 0.03

    cmpl-double v2, v2, v4

    if-lez v2, :cond_0

    .line 2606
    const-wide v2, 0x3f9eb851eb851eb8L    # 0.03

    iput-wide v2, v1, Lcom/saterskog/cell_lab/Cell;->d:D

    .line 2622
    :cond_0
    iget-wide v2, v1, Lcom/saterskog/cell_lab/Cell;->d:D

    const-wide v4, 0x3f9eb851eb851eb8L    # 0.03

    cmpl-double v2, v2, v4

    if-gtz v2, :cond_1

    iget-wide v2, v1, Lcom/saterskog/cell_lab/Cell;->d:D

    sget-wide v4, Lcom/saterskog/cell_lab/Cell;->a:D

    cmpg-double v2, v2, v4

    if-ltz v2, :cond_1

    iget-wide v2, v1, Lcom/saterskog/cell_lab/Cell;->w:D

    const-wide v4, 0x3fb26e978d4fdf3bL    # 0.072

    cmpg-double v2, v2, v4

    if-ltz v2, :cond_1

    iget v2, v1, Lcom/saterskog/cell_lab/Cell;->Y:F

    const/high16 v3, 0x3f800000    # 1.0f

    cmpl-float v2, v2, v3

    if-lez v2, :cond_2

    .line 2624
    :cond_1
    const/4 v2, 0x1

    iput-boolean v2, v1, Lcom/saterskog/cell_lab/Cell;->x:Z

    .line 2628
    :cond_2
    iget v2, v1, Lcom/saterskog/cell_lab/Cell;->F:I

    const/16 v3, 0x64

    if-ge v2, v3, :cond_3

    .line 2629
    iget-wide v2, v1, Lcom/saterskog/cell_lab/Cell;->b:D

    iget-wide v4, v1, Lcom/saterskog/cell_lab/Cell;->e:D

    mul-double/2addr v4, p1

    add-double/2addr v2, v4

    iput-wide v2, v1, Lcom/saterskog/cell_lab/Cell;->b:D

    .line 2630
    iget-wide v2, v1, Lcom/saterskog/cell_lab/Cell;->c:D

    iget-wide v4, v1, Lcom/saterskog/cell_lab/Cell;->f:D

    mul-double/2addr v4, p1

    add-double/2addr v2, v4

    iput-wide v2, v1, Lcom/saterskog/cell_lab/Cell;->c:D

    .line 2631
    iget-wide v2, v1, Lcom/saterskog/cell_lab/Cell;->k:D

    iget-wide v4, v1, Lcom/saterskog/cell_lab/Cell;->l:D

    mul-double/2addr v4, p1

    add-double/2addr v2, v4

    iput-wide v2, v1, Lcom/saterskog/cell_lab/Cell;->k:D

    .line 2633
    :cond_3
    iget-wide v2, v1, Lcom/saterskog/cell_lab/Cell;->m:D

    iget-wide v4, v1, Lcom/saterskog/cell_lab/Cell;->n:D

    mul-double/2addr v4, p1

    add-double/2addr v2, v4

    iput-wide v2, v1, Lcom/saterskog/cell_lab/Cell;->m:D

    .line 2634
    iget-wide v2, v1, Lcom/saterskog/cell_lab/Cell;->k:D

    const-wide v4, 0x400921fb54442d18L    # Math.PI

    cmpl-double v2, v2, v4

    if-lez v2, :cond_4

    .line 2635
    iget-wide v2, v1, Lcom/saterskog/cell_lab/Cell;->k:D

    const-wide v4, 0x401921fb54442d18L    # 6.283185307179586

    sub-double/2addr v2, v4

    iput-wide v2, v1, Lcom/saterskog/cell_lab/Cell;->k:D

    .line 2636
    :cond_4
    iget-wide v2, v1, Lcom/saterskog/cell_lab/Cell;->k:D

    const-wide v4, -0x3ff6de04abbbd2e8L    # -3.141592653589793

    cmpg-double v2, v2, v4

    if-gez v2, :cond_5

    .line 2637
    iget-wide v2, v1, Lcom/saterskog/cell_lab/Cell;->k:D

    const-wide v4, 0x401921fb54442d18L    # 6.283185307179586

    add-double/2addr v2, v4

    iput-wide v2, v1, Lcom/saterskog/cell_lab/Cell;->k:D

    .line 2638
    :cond_5
    iget-wide v2, v1, Lcom/saterskog/cell_lab/Cell;->m:D

    const-wide v4, 0x401921fb54442d18L    # 6.283185307179586

    cmpl-double v2, v2, v4

    if-lez v2, :cond_6

    .line 2639
    iget-wide v2, v1, Lcom/saterskog/cell_lab/Cell;->m:D

    const-wide v4, 0x402921fb54442d18L    # 12.566370614359172

    sub-double/2addr v2, v4

    iput-wide v2, v1, Lcom/saterskog/cell_lab/Cell;->m:D

    .line 2640
    :cond_6
    iget-wide v2, v1, Lcom/saterskog/cell_lab/Cell;->m:D

    const-wide v4, -0x3fe6de04abbbd2e8L    # -6.283185307179586

    cmpg-double v2, v2, v4

    if-gez v2, :cond_7

    .line 2641
    iget-wide v2, v1, Lcom/saterskog/cell_lab/Cell;->m:D

    const-wide v4, 0x402921fb54442d18L    # 12.566370614359172

    add-double/2addr v2, v4

    iput-wide v2, v1, Lcom/saterskog/cell_lab/Cell;->m:D

    .line 2643
    :cond_7
    const/4 v2, 0x0

    iput v2, v1, Lcom/saterskog/cell_lab/Cell;->B:I

    .line 2644
    iget v2, v1, Lcom/saterskog/cell_lab/Cell;->C:I

    iput v2, v1, Lcom/saterskog/cell_lab/Cell;->P:I

    .line 2599
    add-int/lit8 v0, v0, 0x1

    goto/16 :goto_0

    .line 2646
    :cond_8
    return-void
.end method

.method private g()V
    .locals 12

    .prologue
    .line 453
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/saterskog/cell_lab/CellWorld;->aW:[I

    array-length v1, v1

    if-ge v0, v1, :cond_0

    .line 455
    iget-object v1, p0, Lcom/saterskog/cell_lab/CellWorld;->aW:[I

    const/4 v2, 0x0

    aput v2, v1, v0

    .line 453
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 458
    :cond_0
    const/4 v0, 0x0

    :goto_1
    iget-object v1, p0, Lcom/saterskog/cell_lab/CellWorld;->bc:[I

    array-length v1, v1

    if-ge v0, v1, :cond_1

    .line 459
    iget-object v1, p0, Lcom/saterskog/cell_lab/CellWorld;->bc:[I

    const/4 v2, 0x0

    aput v2, v1, v0

    .line 458
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 461
    :cond_1
    iget v1, p0, Lcom/saterskog/cell_lab/CellWorld;->z:I

    .line 462
    const/4 v0, 0x0

    :goto_2
    if-ge v0, v1, :cond_10

    .line 463
    iget-object v2, p0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    aget-object v2, v2, v0

    .line 466
    iget-object v3, p0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v4, v3, Lcom/saterskog/cell_lab/Environment;->k:D

    iget-wide v6, v2, Lcom/saterskog/cell_lab/Cell;->b:D

    add-double/2addr v4, v6

    const-wide/high16 v6, 0x4000000000000000L    # 2.0

    iget-object v3, p0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v8, v3, Lcom/saterskog/cell_lab/Environment;->k:D

    mul-double/2addr v6, v8

    div-double/2addr v4, v6

    iget v3, p0, Lcom/saterskog/cell_lab/CellWorld;->bd:I

    int-to-double v6, v3

    mul-double/2addr v4, v6

    const-wide/high16 v6, 0x3ff0000000000000L    # 1.0

    add-double/2addr v4, v6

    double-to-int v3, v4

    .line 467
    iget-object v4, p0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v4, v4, Lcom/saterskog/cell_lab/Environment;->k:D

    iget-wide v6, v2, Lcom/saterskog/cell_lab/Cell;->c:D

    add-double/2addr v4, v6

    const-wide/high16 v6, 0x4000000000000000L    # 2.0

    iget-object v8, p0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v8, v8, Lcom/saterskog/cell_lab/Environment;->k:D

    mul-double/2addr v6, v8

    div-double/2addr v4, v6

    iget v6, p0, Lcom/saterskog/cell_lab/CellWorld;->bd:I

    int-to-double v6, v6

    mul-double/2addr v4, v6

    const-wide/high16 v6, 0x3ff0000000000000L    # 1.0

    add-double/2addr v4, v6

    double-to-int v4, v4

    .line 469
    iget v5, p0, Lcom/saterskog/cell_lab/CellWorld;->bd:I

    add-int/lit8 v5, v5, 0x2

    mul-int/2addr v4, v5

    add-int/2addr v3, v4

    .line 470
    iget-object v4, p0, Lcom/saterskog/cell_lab/CellWorld;->bc:[I

    aget v4, v4, v3

    .line 471
    const/16 v5, 0x194

    if-ge v4, v5, :cond_8

    .line 472
    iget-object v5, p0, Lcom/saterskog/cell_lab/CellWorld;->ba:[[I

    aget-object v5, v5, v3

    aput v0, v5, v4

    .line 473
    iget-object v5, p0, Lcom/saterskog/cell_lab/CellWorld;->bb:[[S

    aget-object v5, v5, v3

    const/4 v6, 0x0

    aput-short v6, v5, v4

    .line 474
    iget-object v5, p0, Lcom/saterskog/cell_lab/CellWorld;->bc:[I

    aget v6, v5, v3

    add-int/lit8 v6, v6, 0x1

    aput v6, v5, v3

    .line 476
    iget-object v5, v2, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    iget v6, v2, Lcom/saterskog/cell_lab/Cell;->D:I

    aget-object v5, v5, v6

    iget-object v5, v5, Lcom/saterskog/cell_lab/Gene;->s:Lcom/saterskog/cell_lab/h;

    sget-object v6, Lcom/saterskog/cell_lab/h;->o:Lcom/saterskog/cell_lab/h;

    if-ne v5, v6, :cond_5

    iget-wide v6, v2, Lcom/saterskog/cell_lab/Cell;->p:D

    const-wide v8, 0x3fc999999999999aL    # 0.2

    cmpl-double v5, v6, v8

    if-ltz v5, :cond_5

    .line 478
    iget-object v5, v2, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    iget v6, v2, Lcom/saterskog/cell_lab/Cell;->D:I

    aget-object v5, v5, v6

    iget-object v5, v5, Lcom/saterskog/cell_lab/Gene;->u:[I

    const/4 v6, 0x4

    aget v5, v5, v6

    if-nez v5, :cond_2

    .line 479
    iget-object v5, p0, Lcom/saterskog/cell_lab/CellWorld;->ba:[[I

    aget-object v5, v5, v3

    rsub-int/lit8 v6, v0, -0x1

    aput v6, v5, v4

    .line 480
    iget-object v5, p0, Lcom/saterskog/cell_lab/CellWorld;->bb:[[S

    aget-object v5, v5, v3

    const/4 v6, 0x1

    aput-short v6, v5, v4

    .line 481
    iget-object v5, p0, Lcom/saterskog/cell_lab/CellWorld;->bc:[I

    aget v6, v5, v3

    add-int/lit8 v6, v6, 0x1

    aput v6, v5, v3

    .line 483
    :cond_2
    iget-object v5, v2, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    iget v6, v2, Lcom/saterskog/cell_lab/Cell;->D:I

    aget-object v5, v5, v6

    iget-object v5, v5, Lcom/saterskog/cell_lab/Gene;->u:[I

    const/4 v6, 0x4

    aget v5, v5, v6

    const/4 v6, 0x4

    if-ne v5, v6, :cond_3

    .line 484
    iget-object v5, p0, Lcom/saterskog/cell_lab/CellWorld;->ba:[[I

    aget-object v5, v5, v3

    rsub-int/lit8 v6, v0, -0x1

    aput v6, v5, v4

    .line 485
    iget-object v5, p0, Lcom/saterskog/cell_lab/CellWorld;->bb:[[S

    aget-object v5, v5, v3

    const/4 v6, 0x2

    aput-short v6, v5, v4

    .line 486
    iget-object v5, p0, Lcom/saterskog/cell_lab/CellWorld;->bc:[I

    aget v6, v5, v3

    add-int/lit8 v6, v6, 0x1

    aput v6, v5, v3

    .line 488
    :cond_3
    iget-object v5, v2, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    iget v6, v2, Lcom/saterskog/cell_lab/Cell;->D:I

    aget-object v5, v5, v6

    iget-object v5, v5, Lcom/saterskog/cell_lab/Gene;->u:[I

    const/4 v6, 0x4

    aget v5, v5, v6

    const/4 v6, 0x5

    if-ne v5, v6, :cond_4

    .line 489
    iget-object v5, p0, Lcom/saterskog/cell_lab/CellWorld;->ba:[[I

    aget-object v5, v5, v3

    rsub-int/lit8 v6, v0, -0x1

    aput v6, v5, v4

    .line 490
    iget-object v5, p0, Lcom/saterskog/cell_lab/CellWorld;->bb:[[S

    aget-object v5, v5, v3

    const/4 v6, 0x3

    aput-short v6, v5, v4

    .line 491
    iget-object v5, p0, Lcom/saterskog/cell_lab/CellWorld;->bc:[I

    aget v6, v5, v3

    add-int/lit8 v6, v6, 0x1

    aput v6, v5, v3

    .line 493
    :cond_4
    iget-object v5, v2, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    iget v6, v2, Lcom/saterskog/cell_lab/Cell;->D:I

    aget-object v5, v5, v6

    iget-object v5, v5, Lcom/saterskog/cell_lab/Gene;->u:[I

    const/4 v6, 0x4

    aget v5, v5, v6

    const/4 v6, 0x6

    if-ne v5, v6, :cond_5

    .line 494
    iget-object v5, p0, Lcom/saterskog/cell_lab/CellWorld;->ba:[[I

    aget-object v5, v5, v3

    rsub-int/lit8 v6, v0, -0x1

    aput v6, v5, v4

    .line 495
    iget-object v5, p0, Lcom/saterskog/cell_lab/CellWorld;->bb:[[S

    aget-object v5, v5, v3

    const/4 v6, 0x5

    aput-short v6, v5, v4

    .line 496
    iget-object v4, p0, Lcom/saterskog/cell_lab/CellWorld;->bc:[I

    aget v5, v4, v3

    add-int/lit8 v5, v5, 0x1

    aput v5, v4, v3

    .line 503
    :cond_5
    :goto_3
    iget-object v3, p0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v4, v3, Lcom/saterskog/cell_lab/Environment;->k:D

    iget-wide v6, v2, Lcom/saterskog/cell_lab/Cell;->b:D

    add-double/2addr v4, v6

    iget-wide v6, v2, Lcom/saterskog/cell_lab/Cell;->d:D

    sub-double/2addr v4, v6

    const-wide/high16 v6, 0x4000000000000000L    # 2.0

    iget-object v3, p0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v8, v3, Lcom/saterskog/cell_lab/Environment;->k:D

    mul-double/2addr v6, v8

    div-double/2addr v4, v6

    iget v3, p0, Lcom/saterskog/cell_lab/CellWorld;->Z:I

    int-to-double v6, v3

    mul-double/2addr v4, v6

    const-wide/high16 v6, 0x3ff0000000000000L    # 1.0

    add-double/2addr v4, v6

    double-to-int v3, v4

    .line 504
    iget-object v4, p0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v4, v4, Lcom/saterskog/cell_lab/Environment;->k:D

    iget-wide v6, v2, Lcom/saterskog/cell_lab/Cell;->c:D

    add-double/2addr v4, v6

    iget-wide v6, v2, Lcom/saterskog/cell_lab/Cell;->d:D

    sub-double/2addr v4, v6

    const-wide/high16 v6, 0x4000000000000000L    # 2.0

    iget-object v8, p0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v8, v8, Lcom/saterskog/cell_lab/Environment;->k:D

    mul-double/2addr v6, v8

    div-double/2addr v4, v6

    iget v6, p0, Lcom/saterskog/cell_lab/CellWorld;->Z:I

    int-to-double v6, v6

    mul-double/2addr v4, v6

    const-wide/high16 v6, 0x3ff0000000000000L    # 1.0

    add-double/2addr v4, v6

    double-to-int v4, v4

    .line 506
    iget v5, p0, Lcom/saterskog/cell_lab/CellWorld;->Z:I

    add-int/lit8 v5, v5, 0x2

    mul-int/2addr v4, v5

    add-int/2addr v4, v3

    iput v4, v2, Lcom/saterskog/cell_lab/Cell;->K:I

    .line 507
    iget-object v4, p0, Lcom/saterskog/cell_lab/CellWorld;->aW:[I

    iget v5, v2, Lcom/saterskog/cell_lab/Cell;->K:I

    aget v4, v4, v5

    const/16 v5, 0xcb

    if-ge v4, v5, :cond_9

    .line 508
    iget-object v4, p0, Lcom/saterskog/cell_lab/CellWorld;->aV:[[I

    iget v5, v2, Lcom/saterskog/cell_lab/Cell;->K:I

    aget-object v4, v4, v5

    iget-object v5, p0, Lcom/saterskog/cell_lab/CellWorld;->aW:[I

    iget v6, v2, Lcom/saterskog/cell_lab/Cell;->K:I

    aget v5, v5, v6

    aput v0, v4, v5

    .line 509
    iget-object v4, p0, Lcom/saterskog/cell_lab/CellWorld;->aW:[I

    iget v5, v2, Lcom/saterskog/cell_lab/Cell;->K:I

    aget v6, v4, v5

    add-int/lit8 v6, v6, 0x1

    aput v6, v4, v5

    .line 514
    :goto_4
    iget-object v4, p0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v4, v4, Lcom/saterskog/cell_lab/Environment;->k:D

    iget-wide v6, v2, Lcom/saterskog/cell_lab/Cell;->c:D

    add-double/2addr v4, v6

    iget-wide v6, v2, Lcom/saterskog/cell_lab/Cell;->d:D

    add-double/2addr v4, v6

    const-wide/high16 v6, 0x4000000000000000L    # 2.0

    iget-object v8, p0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v8, v8, Lcom/saterskog/cell_lab/Environment;->k:D

    mul-double/2addr v6, v8

    div-double/2addr v4, v6

    iget v6, p0, Lcom/saterskog/cell_lab/CellWorld;->Z:I

    int-to-double v6, v6

    mul-double/2addr v4, v6

    const-wide/high16 v6, 0x3ff0000000000000L    # 1.0

    add-double/2addr v4, v6

    double-to-int v4, v4

    .line 515
    iget v5, p0, Lcom/saterskog/cell_lab/CellWorld;->Z:I

    add-int/lit8 v5, v5, 0x2

    mul-int/2addr v5, v4

    add-int/2addr v3, v5

    iput v3, v2, Lcom/saterskog/cell_lab/Cell;->L:I

    .line 516
    iget v3, v2, Lcom/saterskog/cell_lab/Cell;->L:I

    iget v5, v2, Lcom/saterskog/cell_lab/Cell;->K:I

    if-ne v3, v5, :cond_a

    .line 517
    const/4 v3, -0x1

    iput v3, v2, Lcom/saterskog/cell_lab/Cell;->L:I

    .line 528
    :goto_5
    iget-object v3, p0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v6, v3, Lcom/saterskog/cell_lab/Environment;->k:D

    iget-wide v8, v2, Lcom/saterskog/cell_lab/Cell;->b:D

    add-double/2addr v6, v8

    iget-wide v8, v2, Lcom/saterskog/cell_lab/Cell;->d:D

    add-double/2addr v6, v8

    const-wide/high16 v8, 0x4000000000000000L    # 2.0

    iget-object v3, p0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v10, v3, Lcom/saterskog/cell_lab/Environment;->k:D

    mul-double/2addr v8, v10

    div-double/2addr v6, v8

    iget v3, p0, Lcom/saterskog/cell_lab/CellWorld;->Z:I

    int-to-double v8, v3

    mul-double/2addr v6, v8

    const-wide/high16 v8, 0x3ff0000000000000L    # 1.0

    add-double/2addr v6, v8

    double-to-int v3, v6

    .line 529
    iget v5, p0, Lcom/saterskog/cell_lab/CellWorld;->Z:I

    add-int/lit8 v5, v5, 0x2

    mul-int/2addr v4, v5

    add-int/2addr v4, v3

    iput v4, v2, Lcom/saterskog/cell_lab/Cell;->M:I

    .line 530
    iget v4, v2, Lcom/saterskog/cell_lab/Cell;->M:I

    iget v5, v2, Lcom/saterskog/cell_lab/Cell;->K:I

    if-eq v4, v5, :cond_6

    iget v4, v2, Lcom/saterskog/cell_lab/Cell;->M:I

    iget v5, v2, Lcom/saterskog/cell_lab/Cell;->L:I

    if-ne v4, v5, :cond_c

    .line 531
    :cond_6
    const/4 v4, -0x1

    iput v4, v2, Lcom/saterskog/cell_lab/Cell;->M:I

    .line 542
    :goto_6
    iget-object v4, p0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v4, v4, Lcom/saterskog/cell_lab/Environment;->k:D

    iget-wide v6, v2, Lcom/saterskog/cell_lab/Cell;->c:D

    add-double/2addr v4, v6

    iget-wide v6, v2, Lcom/saterskog/cell_lab/Cell;->d:D

    sub-double/2addr v4, v6

    const-wide/high16 v6, 0x4000000000000000L    # 2.0

    iget-object v8, p0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v8, v8, Lcom/saterskog/cell_lab/Environment;->k:D

    mul-double/2addr v6, v8

    div-double/2addr v4, v6

    iget v6, p0, Lcom/saterskog/cell_lab/CellWorld;->Z:I

    int-to-double v6, v6

    mul-double/2addr v4, v6

    const-wide/high16 v6, 0x3ff0000000000000L    # 1.0

    add-double/2addr v4, v6

    double-to-int v4, v4

    .line 543
    iget v5, p0, Lcom/saterskog/cell_lab/CellWorld;->Z:I

    add-int/lit8 v5, v5, 0x2

    mul-int/2addr v4, v5

    add-int/2addr v3, v4

    iput v3, v2, Lcom/saterskog/cell_lab/Cell;->N:I

    .line 544
    iget v3, v2, Lcom/saterskog/cell_lab/Cell;->N:I

    iget v4, v2, Lcom/saterskog/cell_lab/Cell;->K:I

    if-eq v3, v4, :cond_7

    iget v3, v2, Lcom/saterskog/cell_lab/Cell;->N:I

    iget v4, v2, Lcom/saterskog/cell_lab/Cell;->L:I

    if-eq v3, v4, :cond_7

    iget v3, v2, Lcom/saterskog/cell_lab/Cell;->N:I

    iget v4, v2, Lcom/saterskog/cell_lab/Cell;->M:I

    if-ne v3, v4, :cond_e

    .line 545
    :cond_7
    const/4 v3, -0x1

    iput v3, v2, Lcom/saterskog/cell_lab/Cell;->N:I

    .line 462
    :goto_7
    add-int/lit8 v0, v0, 0x1

    goto/16 :goto_2

    .line 501
    :cond_8
    const-string v3, "smellGridnMAX exhausted"

    invoke-static {v3}, Lcom/saterskog/b/a;->a(Ljava/lang/String;)V

    goto/16 :goto_3

    .line 512
    :cond_9
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "gridnMAX exhausted: 203, "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v5, v2, Lcom/saterskog/cell_lab/Cell;->K:I

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/saterskog/b/a;->a(Ljava/lang/String;)V

    goto/16 :goto_4

    .line 520
    :cond_a
    iget-object v3, p0, Lcom/saterskog/cell_lab/CellWorld;->aW:[I

    iget v5, v2, Lcom/saterskog/cell_lab/Cell;->L:I

    aget v3, v3, v5

    const/16 v5, 0xcb

    if-ge v3, v5, :cond_b

    .line 521
    iget-object v3, p0, Lcom/saterskog/cell_lab/CellWorld;->aV:[[I

    iget v5, v2, Lcom/saterskog/cell_lab/Cell;->L:I

    aget-object v3, v3, v5

    iget-object v5, p0, Lcom/saterskog/cell_lab/CellWorld;->aW:[I

    iget v6, v2, Lcom/saterskog/cell_lab/Cell;->L:I

    aget v5, v5, v6

    aput v0, v3, v5

    .line 522
    iget-object v3, p0, Lcom/saterskog/cell_lab/CellWorld;->aW:[I

    iget v5, v2, Lcom/saterskog/cell_lab/Cell;->L:I

    aget v6, v3, v5

    add-int/lit8 v6, v6, 0x1

    aput v6, v3, v5

    goto/16 :goto_5

    .line 525
    :cond_b
    const-string v3, "gridnMAX exhausted: 203"

    invoke-static {v3}, Lcom/saterskog/b/a;->a(Ljava/lang/String;)V

    goto/16 :goto_5

    .line 534
    :cond_c
    iget-object v4, p0, Lcom/saterskog/cell_lab/CellWorld;->aW:[I

    iget v5, v2, Lcom/saterskog/cell_lab/Cell;->M:I

    aget v4, v4, v5

    const/16 v5, 0xcb

    if-ge v4, v5, :cond_d

    .line 535
    iget-object v4, p0, Lcom/saterskog/cell_lab/CellWorld;->aV:[[I

    iget v5, v2, Lcom/saterskog/cell_lab/Cell;->M:I

    aget-object v4, v4, v5

    iget-object v5, p0, Lcom/saterskog/cell_lab/CellWorld;->aW:[I

    iget v6, v2, Lcom/saterskog/cell_lab/Cell;->M:I

    aget v5, v5, v6

    aput v0, v4, v5

    .line 536
    iget-object v4, p0, Lcom/saterskog/cell_lab/CellWorld;->aW:[I

    iget v5, v2, Lcom/saterskog/cell_lab/Cell;->M:I

    aget v6, v4, v5

    add-int/lit8 v6, v6, 0x1

    aput v6, v4, v5

    goto/16 :goto_6

    .line 539
    :cond_d
    const-string v4, "gridnMAX exhausted: 203"

    invoke-static {v4}, Lcom/saterskog/b/a;->a(Ljava/lang/String;)V

    goto/16 :goto_6

    .line 548
    :cond_e
    iget-object v3, p0, Lcom/saterskog/cell_lab/CellWorld;->aW:[I

    iget v4, v2, Lcom/saterskog/cell_lab/Cell;->N:I

    aget v3, v3, v4

    const/16 v4, 0xcb

    if-ge v3, v4, :cond_f

    .line 549
    iget-object v3, p0, Lcom/saterskog/cell_lab/CellWorld;->aV:[[I

    iget v4, v2, Lcom/saterskog/cell_lab/Cell;->N:I

    aget-object v3, v3, v4

    iget-object v4, p0, Lcom/saterskog/cell_lab/CellWorld;->aW:[I

    iget v5, v2, Lcom/saterskog/cell_lab/Cell;->N:I

    aget v4, v4, v5

    aput v0, v3, v4

    .line 550
    iget-object v3, p0, Lcom/saterskog/cell_lab/CellWorld;->aW:[I

    iget v2, v2, Lcom/saterskog/cell_lab/Cell;->N:I

    aget v4, v3, v2

    add-int/lit8 v4, v4, 0x1

    aput v4, v3, v2

    goto/16 :goto_7

    .line 553
    :cond_f
    const-string v2, "gridnMAX exhausted: 203"

    invoke-static {v2}, Lcom/saterskog/b/a;->a(Ljava/lang/String;)V

    goto/16 :goto_7

    .line 557
    :cond_10
    return-void
.end method

.method private g(D)V
    .locals 27

    .prologue
    .line 2648
    const/4 v6, 0x0

    :goto_0
    move-object/from16 v0, p0

    iget v7, v0, Lcom/saterskog/cell_lab/CellWorld;->z:I

    if-ge v6, v7, :cond_3f

    .line 2649
    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    aget-object v12, v7, v6

    .line 2650
    invoke-virtual {v12}, Lcom/saterskog/cell_lab/Cell;->b()Lcom/saterskog/cell_lab/Gene;

    move-result-object v13

    .line 2651
    iget-wide v8, v12, Lcom/saterskog/cell_lab/Cell;->w:D

    iput-wide v8, v12, Lcom/saterskog/cell_lab/Cell;->Q:D

    .line 2656
    iget v7, v12, Lcom/saterskog/cell_lab/Cell;->X:F

    const v8, 0x3d4ccccd    # 0.05f

    iget v9, v12, Lcom/saterskog/cell_lab/Cell;->X:F

    mul-float/2addr v8, v9

    move-wide/from16 v0, p1

    double-to-float v9, v0

    mul-float/2addr v8, v9

    sub-float/2addr v7, v8

    iput v7, v12, Lcom/saterskog/cell_lab/Cell;->Z:F

    .line 2657
    iget v7, v12, Lcom/saterskog/cell_lab/Cell;->Y:F

    float-to-double v8, v7

    iget v7, v12, Lcom/saterskog/cell_lab/Cell;->X:F

    const/high16 v10, 0x41200000    # 10.0f

    invoke-static {v7, v10}, Ljava/lang/Math;->min(FF)F

    move-result v7

    iget v10, v12, Lcom/saterskog/cell_lab/Cell;->Y:F

    sub-float/2addr v7, v10

    const v10, 0x3d4ccccd    # 0.05f

    mul-float/2addr v7, v10

    float-to-double v10, v7

    mul-double v10, v10, p1

    add-double/2addr v8, v10

    double-to-float v7, v8

    iput v7, v12, Lcom/saterskog/cell_lab/Cell;->Y:F

    .line 2660
    iget-wide v8, v12, Lcom/saterskog/cell_lab/Cell;->p:D

    iput-wide v8, v12, Lcom/saterskog/cell_lab/Cell;->R:D

    .line 2663
    iget-wide v8, v12, Lcom/saterskog/cell_lab/Cell;->p:D

    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v10, v7, Lcom/saterskog/cell_lab/Environment;->z:D

    cmpg-double v7, v8, v10

    if-gez v7, :cond_0

    .line 2664
    iget-wide v8, v12, Lcom/saterskog/cell_lab/Cell;->R:D

    const-wide v10, 0x3ff3333333333333L    # 1.2

    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v14, v7, Lcom/saterskog/cell_lab/Environment;->z:D

    iget-wide v0, v12, Lcom/saterskog/cell_lab/Cell;->p:D

    move-wide/from16 v16, v0

    sub-double v14, v14, v16

    mul-double/2addr v10, v14

    mul-double v10, v10, p1

    add-double/2addr v8, v10

    iput-wide v8, v12, Lcom/saterskog/cell_lab/Cell;->R:D

    .line 2666
    :cond_0
    move-object/from16 v0, p0

    iget-boolean v7, v0, Lcom/saterskog/cell_lab/CellWorld;->bg:Z

    if-eqz v7, :cond_1

    .line 2667
    iget-object v7, v13, Lcom/saterskog/cell_lab/Gene;->s:Lcom/saterskog/cell_lab/h;

    iget-boolean v7, v7, Lcom/saterskog/cell_lab/h;->s:Z

    if-eqz v7, :cond_1

    .line 2668
    iget-wide v8, v12, Lcom/saterskog/cell_lab/Cell;->Q:D

    const-wide v10, 0x4071800000000000L    # 280.0

    iget-wide v14, v12, Lcom/saterskog/cell_lab/Cell;->d:D

    mul-double/2addr v10, v14

    iget-wide v14, v12, Lcom/saterskog/cell_lab/Cell;->d:D

    mul-double/2addr v10, v14

    mul-double v10, v10, p1

    add-double/2addr v8, v10

    iput-wide v8, v12, Lcom/saterskog/cell_lab/Cell;->Q:D

    .line 2671
    :cond_1
    move-object/from16 v0, p0

    iget-object v11, v0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    .line 28139
    invoke-virtual {v12}, Lcom/saterskog/cell_lab/Cell;->b()Lcom/saterskog/cell_lab/Gene;

    move-result-object v7

    .line 28140
    iget-object v8, v7, Lcom/saterskog/cell_lab/Gene;->s:Lcom/saterskog/cell_lab/h;

    .line 28141
    iget-wide v14, v12, Lcom/saterskog/cell_lab/Cell;->o:D

    add-double v14, v14, p1

    iput-wide v14, v12, Lcom/saterskog/cell_lab/Cell;->o:D

    .line 28143
    sget-object v9, Lcom/saterskog/cell_lab/Cell$2;->a:[I

    invoke-virtual {v8}, Lcom/saterskog/cell_lab/h;->ordinal()I

    move-result v10

    aget v9, v9, v10

    packed-switch v9, :pswitch_data_0

    :cond_2
    :goto_1
    move-object v7, v8

    .line 28217
    :goto_2
    iget-wide v8, v12, Lcom/saterskog/cell_lab/Cell;->Q:D

    iget-wide v14, v7, Lcom/saterskog/cell_lab/h;->u:D

    const-wide v16, 0x3ff62be2be2b9759L    # 1.38571428571

    const-wide v18, 0x3ff492492491fdbfL    # 1.28571428571

    iget v7, v11, Lcom/saterskog/cell_lab/Environment;->n:F

    float-to-double v0, v7

    move-wide/from16 v20, v0

    mul-double v18, v18, v20

    sub-double v16, v16, v18

    mul-double v14, v14, v16

    const-wide/high16 v16, 0x4079000000000000L    # 400.0

    mul-double v14, v14, v16

    iget-wide v0, v12, Lcom/saterskog/cell_lab/Cell;->d:D

    move-wide/from16 v16, v0

    const-wide v18, 0x3f7eb851eb851eb8L    # 0.0075

    add-double v16, v16, v18

    mul-double v14, v14, v16

    iget-wide v0, v12, Lcom/saterskog/cell_lab/Cell;->d:D

    move-wide/from16 v16, v0

    mul-double v14, v14, v16

    mul-double v14, v14, p1

    sub-double/2addr v8, v14

    iput-wide v8, v12, Lcom/saterskog/cell_lab/Cell;->Q:D

    .line 28227
    iget-boolean v7, v11, Lcom/saterskog/cell_lab/Environment;->v:Z

    if-eqz v7, :cond_3

    iget-wide v8, v12, Lcom/saterskog/cell_lab/Cell;->o:D

    const-wide/high16 v14, 0x406e000000000000L    # 240.0

    cmpl-double v7, v8, v14

    if-lez v7, :cond_3

    .line 28228
    const/4 v7, 0x1

    iput-boolean v7, v12, Lcom/saterskog/cell_lab/Cell;->x:Z

    .line 28229
    :cond_3
    iget-wide v8, v12, Lcom/saterskog/cell_lab/Cell;->b:D

    iget-wide v14, v12, Lcom/saterskog/cell_lab/Cell;->b:D

    cmpl-double v7, v8, v14

    if-nez v7, :cond_4

    iget-wide v8, v12, Lcom/saterskog/cell_lab/Cell;->c:D

    iget-wide v14, v12, Lcom/saterskog/cell_lab/Cell;->c:D

    cmpl-double v7, v8, v14

    if-nez v7, :cond_4

    iget-wide v8, v12, Lcom/saterskog/cell_lab/Cell;->w:D

    iget-wide v14, v12, Lcom/saterskog/cell_lab/Cell;->w:D

    cmpl-double v7, v8, v14

    if-eqz v7, :cond_5

    .line 28230
    :cond_4
    const/4 v7, 0x1

    iput-boolean v7, v12, Lcom/saterskog/cell_lab/Cell;->x:Z

    .line 28233
    :cond_5
    iget v7, v12, Lcom/saterskog/cell_lab/Cell;->O:I

    add-int/lit8 v7, v7, 0x1

    iput v7, v12, Lcom/saterskog/cell_lab/Cell;->O:I

    .line 28234
    iget v7, v12, Lcom/saterskog/cell_lab/Cell;->O:I

    const/16 v8, 0xf

    if-ne v7, v8, :cond_2e

    .line 28235
    const/4 v7, 0x0

    iput v7, v12, Lcom/saterskog/cell_lab/Cell;->O:I

    .line 28237
    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/saterskog/cell_lab/CellWorld;->Y:Lcom/saterskog/b/d;

    .line 29008
    invoke-virtual {v7}, Lcom/saterskog/b/d;->nextDouble()D

    move-result-wide v8

    .line 28237
    iget-wide v14, v11, Lcom/saterskog/cell_lab/Environment;->c:D

    mul-double v14, v14, p1

    const-wide/high16 v16, 0x4044000000000000L    # 40.0

    mul-double v14, v14, v16

    const-wide/high16 v16, 0x402e000000000000L    # 15.0

    mul-double v14, v14, v16

    const-wide/high16 v16, 0x4008000000000000L    # 3.0

    div-double v14, v14, v16

    cmpg-double v7, v8, v14

    if-gez v7, :cond_2e

    .line 28239
    const/4 v7, 0x0

    move v10, v7

    :goto_3
    const/4 v7, 0x3

    if-ge v10, v7, :cond_2e

    .line 28240
    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/saterskog/cell_lab/CellWorld;->Y:Lcom/saterskog/b/d;

    .line 29017
    const/4 v8, 0x5

    invoke-virtual {v7, v8}, Lcom/saterskog/b/d;->nextInt(I)I

    move-result v7

    .line 28240
    if-eqz v7, :cond_23

    .line 28241
    iget v7, v12, Lcom/saterskog/cell_lab/Cell;->G:I

    add-int/lit8 v7, v7, 0x1

    iput v7, v12, Lcom/saterskog/cell_lab/Cell;->G:I

    .line 28242
    iget-object v7, v12, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/saterskog/cell_lab/CellWorld;->Y:Lcom/saterskog/b/d;

    .line 30017
    const/16 v9, 0x50

    invoke-virtual {v8, v9}, Lcom/saterskog/b/d;->nextInt(I)I

    move-result v8

    .line 28242
    aget-object v8, v7, v8

    move-object/from16 v0, p0

    iget-object v9, v0, Lcom/saterskog/cell_lab/CellWorld;->Y:Lcom/saterskog/b/d;

    .line 30264
    iget-boolean v14, v11, Lcom/saterskog/cell_lab/Environment;->u:Z

    .line 31017
    const/16 v7, 0xbee

    invoke-virtual {v9, v7}, Lcom/saterskog/b/d;->nextInt(I)I

    move-result v15

    .line 30268
    packed-switch v15, :pswitch_data_1

    .line 30388
    :cond_6
    :goto_4
    :pswitch_0
    const/16 v7, 0x16

    if-lt v15, v7, :cond_7

    const/16 v7, 0x21

    if-ge v15, v7, :cond_7

    .line 30390
    add-int/lit8 v7, v15, -0x16

    .line 30391
    if-nez v14, :cond_7

    .line 30392
    const/16 v16, 0xa

    move/from16 v0, v16

    if-eq v7, v0, :cond_7

    .line 30393
    iget-object v0, v8, Lcom/saterskog/cell_lab/Gene;->u:[I

    move-object/from16 v16, v0

    sget-object v17, Lcom/saterskog/cell_lab/Gene;->w:[I

    aget v17, v17, v7

    .line 41017
    move/from16 v0, v17

    invoke-virtual {v9, v0}, Lcom/saterskog/b/d;->nextInt(I)I

    move-result v17

    .line 30393
    aput v17, v16, v7

    .line 30398
    :cond_7
    const/16 v7, 0x21

    if-lt v15, v7, :cond_8

    const/16 v7, 0x2c

    if-ge v15, v7, :cond_8

    .line 30399
    add-int/lit8 v7, v15, -0x21

    .line 30400
    if-nez v14, :cond_8

    .line 30401
    iget-object v0, v8, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    move-object/from16 v16, v0

    aget-object v7, v16, v7

    .line 42017
    const/16 v16, 0x8

    move/from16 v0, v16

    invoke-virtual {v9, v0}, Lcom/saterskog/b/d;->nextInt(I)I

    move-result v16

    .line 30401
    move/from16 v0, v16

    int-to-short v0, v0

    move/from16 v16, v0

    move/from16 v0, v16

    iput-short v0, v7, Lcom/saterskog/cell_lab/Gene$a;->d:S

    .line 30405
    :cond_8
    const/16 v7, 0x2c

    if-lt v15, v7, :cond_9

    const/16 v7, 0x37

    if-ge v15, v7, :cond_9

    .line 30406
    add-int/lit8 v7, v15, -0x2c

    .line 30407
    if-nez v14, :cond_9

    .line 30408
    iget-object v14, v8, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    aget-object v7, v14, v7

    .line 43017
    const/4 v14, 0x3

    invoke-virtual {v9, v14}, Lcom/saterskog/b/d;->nextInt(I)I

    move-result v14

    .line 30408
    int-to-short v14, v14

    iput-short v14, v7, Lcom/saterskog/cell_lab/Gene$a;->e:S

    .line 30412
    :cond_9
    const/16 v7, 0x37

    if-lt v15, v7, :cond_a

    const/16 v7, 0x42

    if-ge v15, v7, :cond_a

    .line 30413
    add-int/lit8 v7, v15, -0x37

    .line 30414
    iget-object v14, v8, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    aget-object v14, v14, v7

    const/high16 v16, -0x3f000000    # -8.0f

    const/high16 v17, 0x41000000    # 8.0f

    iget-object v0, v8, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    move-object/from16 v18, v0

    aget-object v7, v18, v7

    iget v7, v7, Lcom/saterskog/cell_lab/Gene$a;->a:F

    move/from16 v0, v16

    move/from16 v1, v17

    invoke-static {v0, v1, v7, v9}, Lcom/saterskog/cell_lab/Gene;->a(FFFLcom/saterskog/b/d;)F

    move-result v7

    iput v7, v14, Lcom/saterskog/cell_lab/Gene$a;->a:F

    .line 30419
    :cond_a
    const/16 v7, 0x42

    if-lt v15, v7, :cond_b

    const/16 v7, 0x4d

    if-ge v15, v7, :cond_b

    .line 30420
    add-int/lit8 v7, v15, -0x42

    .line 30421
    iget-object v14, v8, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    aget-object v14, v14, v7

    const/high16 v16, -0x3f000000    # -8.0f

    const/high16 v17, 0x41000000    # 8.0f

    iget-object v0, v8, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    move-object/from16 v18, v0

    aget-object v7, v18, v7

    iget v7, v7, Lcom/saterskog/cell_lab/Gene$a;->b:F

    move/from16 v0, v16

    move/from16 v1, v17

    invoke-static {v0, v1, v7, v9}, Lcom/saterskog/cell_lab/Gene;->a(FFFLcom/saterskog/b/d;)F

    move-result v7

    iput v7, v14, Lcom/saterskog/cell_lab/Gene$a;->b:F

    .line 30426
    :cond_b
    const/16 v7, 0x4d

    if-lt v15, v7, :cond_c

    const/16 v7, 0x58

    if-ge v15, v7, :cond_c

    .line 30427
    add-int/lit8 v7, v15, -0x4d

    .line 30428
    iget-object v14, v8, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    aget-object v14, v14, v7

    const/high16 v16, -0x3f000000    # -8.0f

    const/high16 v17, 0x41000000    # 8.0f

    iget-object v0, v8, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    move-object/from16 v18, v0

    aget-object v7, v18, v7

    iget v7, v7, Lcom/saterskog/cell_lab/Gene$a;->c:F

    move/from16 v0, v16

    move/from16 v1, v17

    invoke-static {v0, v1, v7, v9}, Lcom/saterskog/cell_lab/Gene;->a(FFFLcom/saterskog/b/d;)F

    move-result v7

    iput v7, v14, Lcom/saterskog/cell_lab/Gene$a;->c:F

    .line 30433
    :cond_c
    const/16 v7, 0x58

    if-lt v15, v7, :cond_d

    const/16 v7, 0xbee

    if-ge v15, v7, :cond_d

    .line 30434
    add-int/lit8 v7, v15, -0x58

    .line 30435
    iget-object v14, v8, Lcom/saterskog/cell_lab/Gene;->v:[F

    sget-object v15, Lcom/saterskog/cell_lab/Gene;->z:[F

    aget v15, v15, v7

    sget-object v16, Lcom/saterskog/cell_lab/Gene;->A:[F

    aget v16, v16, v7

    iget-object v8, v8, Lcom/saterskog/cell_lab/Gene;->v:[F

    aget v8, v8, v7

    move/from16 v0, v16

    invoke-static {v15, v0, v8, v9}, Lcom/saterskog/cell_lab/Gene;->a(FFFLcom/saterskog/b/d;)F

    move-result v8

    aput v8, v14, v7

    .line 28239
    :cond_d
    :goto_5
    add-int/lit8 v7, v10, 0x1

    move v10, v7

    goto/16 :goto_3

    .line 28145
    :pswitch_1
    const/4 v7, 0x0

    const/4 v9, 0x0

    invoke-virtual {v12, v7, v9}, Lcom/saterskog/cell_lab/Cell;->a(II)F

    move-result v7

    .line 28146
    iget-wide v14, v12, Lcom/saterskog/cell_lab/Cell;->Q:D

    float-to-double v0, v7

    move-wide/from16 v16, v0

    const-wide v18, 0x3f80624dd2f1a9fcL    # 0.008

    float-to-double v0, v7

    move-wide/from16 v20, v0

    const-wide v22, 0x3fa4fac0fbde3250L    # 0.0409756

    mul-double v20, v20, v22

    add-double v18, v18, v20

    mul-double v16, v16, v18

    mul-double v16, v16, p1

    sub-double v14, v14, v16

    iput-wide v14, v12, Lcom/saterskog/cell_lab/Cell;->Q:D

    move-object v7, v8

    .line 28147
    goto/16 :goto_2

    .line 28149
    :pswitch_2
    iget-wide v14, v12, Lcom/saterskog/cell_lab/Cell;->o:D

    const-wide/high16 v16, 0x3fe0000000000000L    # 0.5

    cmpl-double v9, v14, v16

    if-lez v9, :cond_2

    .line 28150
    const/4 v9, 0x5

    const/4 v10, 0x0

    invoke-virtual {v12, v9, v10}, Lcom/saterskog/cell_lab/Cell;->a(II)F

    move-result v9

    const/high16 v10, 0x3f000000    # 0.5f

    cmpl-float v9, v9, v10

    if-lez v9, :cond_e

    .line 28151
    const/4 v8, 0x0

    invoke-virtual {v12, v8}, Lcom/saterskog/cell_lab/Cell;->b(I)I

    move-result v8

    iput v8, v12, Lcom/saterskog/cell_lab/Cell;->D:I

    .line 28152
    iget-object v7, v7, Lcom/saterskog/cell_lab/Gene;->s:Lcom/saterskog/cell_lab/h;

    .line 28153
    const-wide/16 v8, 0x0

    iput-wide v8, v12, Lcom/saterskog/cell_lab/Cell;->o:D

    goto/16 :goto_2

    .line 28156
    :cond_e
    const/4 v9, 0x6

    const/4 v10, 0x0

    invoke-virtual {v12, v9, v10}, Lcom/saterskog/cell_lab/Cell;->a(II)F

    move-result v9

    const/high16 v10, 0x3f000000    # 0.5f

    cmpl-float v9, v9, v10

    if-lez v9, :cond_2

    .line 28157
    const/4 v8, 0x1

    invoke-virtual {v12, v8}, Lcom/saterskog/cell_lab/Cell;->b(I)I

    move-result v8

    iput v8, v12, Lcom/saterskog/cell_lab/Cell;->D:I

    .line 28158
    iget-object v7, v7, Lcom/saterskog/cell_lab/Gene;->s:Lcom/saterskog/cell_lab/h;

    .line 28159
    const-wide/16 v8, 0x0

    iput-wide v8, v12, Lcom/saterskog/cell_lab/Cell;->o:D

    goto/16 :goto_2

    .line 28165
    :pswitch_3
    const-wide/16 v14, 0x0

    cmpl-double v7, p1, v14

    if-eqz v7, :cond_2

    .line 28166
    const/4 v7, 0x3

    const/4 v9, 0x0

    invoke-virtual {v12, v7, v9}, Lcom/saterskog/cell_lab/Cell;->a(II)F

    move-result v9

    .line 28167
    const/4 v7, 0x2

    const/4 v10, 0x0

    invoke-virtual {v12, v7, v10}, Lcom/saterskog/cell_lab/Cell;->a(II)F

    move-result v10

    iget-boolean v7, v12, Lcom/saterskog/cell_lab/Cell;->y:Z

    if-eqz v7, :cond_f

    const/4 v7, -0x1

    :goto_6
    int-to-float v7, v7

    mul-float/2addr v7, v10

    .line 28168
    const/4 v10, 0x4

    const/4 v14, 0x0

    invoke-virtual {v12, v10, v14}, Lcom/saterskog/cell_lab/Cell;->a(II)F

    move-result v10

    .line 28169
    iget-wide v14, v12, Lcom/saterskog/cell_lab/Cell;->Q:D

    const-wide v16, 0x3f14f8b580000000L    # 7.999999797903001E-5

    div-double v16, v16, p1

    iget v0, v12, Lcom/saterskog/cell_lab/Cell;->aa:F

    move/from16 v18, v0

    sub-float v18, v9, v18

    iget v0, v12, Lcom/saterskog/cell_lab/Cell;->aa:F

    move/from16 v19, v0

    sub-float v19, v9, v19

    mul-float v18, v18, v19

    iget v0, v12, Lcom/saterskog/cell_lab/Cell;->ab:F

    move/from16 v19, v0

    sub-float v19, v7, v19

    iget v0, v12, Lcom/saterskog/cell_lab/Cell;->ab:F

    move/from16 v20, v0

    sub-float v20, v7, v20

    mul-float v19, v19, v20

    add-float v18, v18, v19

    iget v0, v12, Lcom/saterskog/cell_lab/Cell;->ac:F

    move/from16 v19, v0

    sub-float v19, v10, v19

    iget v0, v12, Lcom/saterskog/cell_lab/Cell;->ac:F

    move/from16 v20, v0

    sub-float v20, v10, v20

    mul-float v19, v19, v20

    add-float v18, v18, v19

    move/from16 v0, v18

    float-to-double v0, v0

    move-wide/from16 v18, v0

    mul-double v16, v16, v18

    sub-double v14, v14, v16

    iput-wide v14, v12, Lcom/saterskog/cell_lab/Cell;->Q:D

    .line 28170
    iput v9, v12, Lcom/saterskog/cell_lab/Cell;->aa:F

    .line 28171
    iput v7, v12, Lcom/saterskog/cell_lab/Cell;->ab:F

    .line 28172
    iput v10, v12, Lcom/saterskog/cell_lab/Cell;->ac:F

    move-object v7, v8

    .line 28173
    goto/16 :goto_2

    .line 28167
    :cond_f
    const/4 v7, 0x1

    goto :goto_6

    .line 28176
    :pswitch_4
    const-wide/high16 v14, 0x3ff0000000000000L    # 1.0

    iput-wide v14, v12, Lcom/saterskog/cell_lab/Cell;->R:D

    move-object v7, v8

    .line 28177
    goto/16 :goto_2

    .line 28179
    :pswitch_5
    iget-wide v14, v12, Lcom/saterskog/cell_lab/Cell;->Q:D

    const-wide/high16 v16, 0x4079000000000000L    # 400.0

    iget-wide v0, v12, Lcom/saterskog/cell_lab/Cell;->b:D

    move-wide/from16 v18, v0

    iget-wide v0, v12, Lcom/saterskog/cell_lab/Cell;->c:D

    move-wide/from16 v20, v0

    move-object/from16 v0, p0

    move-wide/from16 v1, v18

    move-wide/from16 v3, v20

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/saterskog/cell_lab/CellWorld;->c(DD)D

    move-result-wide v18

    mul-double v16, v16, v18

    iget-wide v0, v12, Lcom/saterskog/cell_lab/Cell;->d:D

    move-wide/from16 v18, v0

    mul-double v16, v16, v18

    iget-wide v0, v12, Lcom/saterskog/cell_lab/Cell;->d:D

    move-wide/from16 v18, v0

    mul-double v16, v16, v18

    mul-double v16, v16, p1

    add-double v14, v14, v16

    iput-wide v14, v12, Lcom/saterskog/cell_lab/Cell;->Q:D

    .line 28183
    :pswitch_6
    iget-wide v14, v12, Lcom/saterskog/cell_lab/Cell;->n:D

    iget-wide v0, v12, Lcom/saterskog/cell_lab/Cell;->l:D

    move-wide/from16 v16, v0

    iget-wide v0, v12, Lcom/saterskog/cell_lab/Cell;->n:D

    move-wide/from16 v18, v0

    sub-double v16, v16, v18

    iget-wide v0, v12, Lcom/saterskog/cell_lab/Cell;->l:D

    move-wide/from16 v18, v0

    iget-wide v0, v12, Lcom/saterskog/cell_lab/Cell;->n:D

    move-wide/from16 v20, v0

    sub-double v18, v18, v20

    invoke-static/range {v18 .. v19}, Ljava/lang/Math;->abs(D)D

    move-result-wide v18

    mul-double v16, v16, v18

    const-wide/high16 v18, 0x3ff0000000000000L    # 1.0

    mul-double v16, v16, v18

    mul-double v16, v16, p1

    add-double v14, v14, v16

    iput-wide v14, v12, Lcom/saterskog/cell_lab/Cell;->n:D

    move-object v7, v8

    .line 28184
    goto/16 :goto_2

    :pswitch_7
    move-object v7, v8

    .line 28188
    goto/16 :goto_2

    .line 28190
    :pswitch_8
    iget-wide v14, v12, Lcom/saterskog/cell_lab/Cell;->t:D

    iget-wide v0, v12, Lcom/saterskog/cell_lab/Cell;->l:D

    move-wide/from16 v16, v0

    move-wide/from16 v0, v16

    neg-double v0, v0

    move-wide/from16 v16, v0

    iget-wide v0, v12, Lcom/saterskog/cell_lab/Cell;->d:D

    move-wide/from16 v18, v0

    mul-double v16, v16, v18

    iget-wide v0, v12, Lcom/saterskog/cell_lab/Cell;->t:D

    move-wide/from16 v18, v0

    const-wide/high16 v20, 0x4059000000000000L    # 100.0

    mul-double v18, v18, v20

    iget-wide v0, v12, Lcom/saterskog/cell_lab/Cell;->t:D

    move-wide/from16 v20, v0

    invoke-static/range {v20 .. v21}, Ljava/lang/Math;->abs(D)D

    move-result-wide v20

    mul-double v18, v18, v20

    sub-double v16, v16, v18

    mul-double v16, v16, p1

    add-double v14, v14, v16

    iput-wide v14, v12, Lcom/saterskog/cell_lab/Cell;->t:D

    .line 28191
    iget-wide v14, v12, Lcom/saterskog/cell_lab/Cell;->u:D

    iget-wide v0, v12, Lcom/saterskog/cell_lab/Cell;->u:D

    move-wide/from16 v16, v0

    mul-double v14, v14, v16

    iget-wide v0, v12, Lcom/saterskog/cell_lab/Cell;->v:D

    move-wide/from16 v16, v0

    iget-wide v0, v12, Lcom/saterskog/cell_lab/Cell;->v:D

    move-wide/from16 v18, v0

    mul-double v16, v16, v18

    add-double v14, v14, v16

    invoke-static {v14, v15}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v14

    .line 28192
    iget-wide v0, v12, Lcom/saterskog/cell_lab/Cell;->u:D

    move-wide/from16 v16, v0

    iget-wide v0, v12, Lcom/saterskog/cell_lab/Cell;->e:D

    move-wide/from16 v18, v0

    move-wide/from16 v0, v18

    neg-double v0, v0

    move-wide/from16 v18, v0

    iget-wide v0, v12, Lcom/saterskog/cell_lab/Cell;->u:D

    move-wide/from16 v20, v0

    const-wide/high16 v22, 0x4059000000000000L    # 100.0

    mul-double v20, v20, v22

    mul-double v20, v20, v14

    sub-double v18, v18, v20

    mul-double v18, v18, p1

    add-double v16, v16, v18

    move-wide/from16 v0, v16

    iput-wide v0, v12, Lcom/saterskog/cell_lab/Cell;->u:D

    .line 28193
    iget-wide v0, v12, Lcom/saterskog/cell_lab/Cell;->v:D

    move-wide/from16 v16, v0

    iget-wide v0, v12, Lcom/saterskog/cell_lab/Cell;->f:D

    move-wide/from16 v18, v0

    move-wide/from16 v0, v18

    neg-double v0, v0

    move-wide/from16 v18, v0

    iget-wide v0, v12, Lcom/saterskog/cell_lab/Cell;->v:D

    move-wide/from16 v20, v0

    const-wide/high16 v22, 0x4059000000000000L    # 100.0

    mul-double v20, v20, v22

    mul-double v14, v14, v20

    sub-double v14, v18, v14

    mul-double v14, v14, p1

    add-double v14, v14, v16

    iput-wide v14, v12, Lcom/saterskog/cell_lab/Cell;->v:D

    move-object v7, v8

    .line 28194
    goto/16 :goto_2

    .line 28196
    :pswitch_9
    const/4 v7, 0x2

    const/4 v9, 0x0

    invoke-virtual {v12, v7, v9}, Lcom/saterskog/cell_lab/Cell;->a(II)F

    move-result v7

    float-to-double v14, v7

    mul-double v14, v14, p1

    .line 28197
    const/4 v7, 0x4

    const/4 v9, 0x0

    invoke-virtual {v12, v7, v9}, Lcom/saterskog/cell_lab/Cell;->a(II)F

    move-result v7

    float-to-double v0, v7

    move-wide/from16 v16, v0

    mul-double v16, v16, p1

    .line 28198
    iget-wide v0, v12, Lcom/saterskog/cell_lab/Cell;->Q:D

    move-wide/from16 v18, v0

    invoke-static {v14, v15}, Ljava/lang/Math;->abs(D)D

    move-result-wide v20

    invoke-static/range {v16 .. v17}, Ljava/lang/Math;->abs(D)D

    move-result-wide v22

    add-double v20, v20, v22

    const-wide v22, 0x3f50624dd2f1a9fcL    # 0.001

    mul-double v20, v20, v22

    sub-double v18, v18, v20

    move-wide/from16 v0, v18

    iput-wide v0, v12, Lcom/saterskog/cell_lab/Cell;->Q:D

    .line 28199
    iget v7, v12, Lcom/saterskog/cell_lab/Cell;->r:F

    float-to-double v0, v7

    move-wide/from16 v18, v0

    const-wide v20, 0x3fd3333333333333L    # 0.3

    mul-double v14, v14, v20

    add-double v14, v14, v18

    double-to-float v7, v14

    iput v7, v12, Lcom/saterskog/cell_lab/Cell;->r:F

    .line 28200
    iget v7, v12, Lcom/saterskog/cell_lab/Cell;->s:F

    float-to-double v14, v7

    const-wide v18, 0x3fd3333333333333L    # 0.3

    mul-double v16, v16, v18

    add-double v14, v14, v16

    double-to-float v7, v14

    iput v7, v12, Lcom/saterskog/cell_lab/Cell;->s:F

    .line 28201
    :goto_7
    iget v7, v12, Lcom/saterskog/cell_lab/Cell;->r:F

    float-to-double v14, v7

    const-wide v16, 0x405c200000000000L    # 112.5

    mul-double v14, v14, v16

    const-wide v16, 0x404f6a7a2955385eL    # 62.83185307179586

    cmpl-double v7, v14, v16

    if-lez v7, :cond_10

    iget v7, v12, Lcom/saterskog/cell_lab/Cell;->r:F

    float-to-double v14, v7

    const-wide v16, 0x3fe1df46a2529d39L    # 0.5585053606381855

    sub-double v14, v14, v16

    double-to-float v7, v14

    iput v7, v12, Lcom/saterskog/cell_lab/Cell;->r:F

    goto :goto_7

    .line 28202
    :cond_10
    :goto_8
    iget v7, v12, Lcom/saterskog/cell_lab/Cell;->r:F

    float-to-double v14, v7

    const-wide v16, 0x405c200000000000L    # 112.5

    mul-double v14, v14, v16

    const-wide v16, -0x3fb09585d6aac7a2L    # -62.83185307179586

    cmpg-double v7, v14, v16

    if-gez v7, :cond_11

    iget v7, v12, Lcom/saterskog/cell_lab/Cell;->r:F

    float-to-double v14, v7

    const-wide v16, 0x3fe1df46a2529d39L    # 0.5585053606381855

    add-double v14, v14, v16

    double-to-float v7, v14

    iput v7, v12, Lcom/saterskog/cell_lab/Cell;->r:F

    goto :goto_8

    .line 28203
    :cond_11
    :goto_9
    iget v7, v12, Lcom/saterskog/cell_lab/Cell;->s:F

    float-to-double v14, v7

    const-wide v16, 0x405c200000000000L    # 112.5

    mul-double v14, v14, v16

    const-wide v16, 0x404f6a7a2955385eL    # 62.83185307179586

    cmpl-double v7, v14, v16

    if-lez v7, :cond_12

    iget v7, v12, Lcom/saterskog/cell_lab/Cell;->s:F

    float-to-double v14, v7

    const-wide v16, 0x3fe1df46a2529d39L    # 0.5585053606381855

    sub-double v14, v14, v16

    double-to-float v7, v14

    iput v7, v12, Lcom/saterskog/cell_lab/Cell;->s:F

    goto :goto_9

    .line 28204
    :cond_12
    :goto_a
    iget v7, v12, Lcom/saterskog/cell_lab/Cell;->s:F

    float-to-double v14, v7

    const-wide v16, 0x405c200000000000L    # 112.5

    mul-double v14, v14, v16

    const-wide v16, -0x3fb09585d6aac7a2L    # -62.83185307179586

    cmpg-double v7, v14, v16

    if-gez v7, :cond_2

    iget v7, v12, Lcom/saterskog/cell_lab/Cell;->s:F

    float-to-double v14, v7

    const-wide v16, 0x3fe1df46a2529d39L    # 0.5585053606381855

    add-double v14, v14, v16

    double-to-float v7, v14

    iput v7, v12, Lcom/saterskog/cell_lab/Cell;->s:F

    goto :goto_a

    .line 28208
    :pswitch_a
    iget-wide v14, v12, Lcom/saterskog/cell_lab/Cell;->R:D

    const-wide/high16 v16, 0x3fd0000000000000L    # 0.25

    cmpl-double v7, v14, v16

    if-lez v7, :cond_13

    .line 28209
    iget-wide v14, v12, Lcom/saterskog/cell_lab/Cell;->R:D

    const-wide v16, 0x3fdcccccccccccccL    # 0.44999999999999996

    mul-double v16, v16, p1

    sub-double v14, v14, v16

    iput-wide v14, v12, Lcom/saterskog/cell_lab/Cell;->R:D

    .line 28210
    iget-wide v14, v12, Lcom/saterskog/cell_lab/Cell;->R:D

    const-wide/high16 v16, 0x3fd0000000000000L    # 0.25

    cmpg-double v7, v14, v16

    if-gez v7, :cond_13

    const-wide/high16 v14, 0x3fd0000000000000L    # 0.25

    iput-wide v14, v12, Lcom/saterskog/cell_lab/Cell;->R:D

    .line 28212
    :cond_13
    iget-wide v14, v12, Lcom/saterskog/cell_lab/Cell;->R:D

    const-wide v16, 0x3fc999999999999aL    # 0.2

    cmpl-double v7, v14, v16

    if-ltz v7, :cond_2

    .line 28213
    iget v7, v12, Lcom/saterskog/cell_lab/Cell;->r:F

    float-to-double v14, v7

    add-double v14, v14, p1

    double-to-float v7, v14

    iput v7, v12, Lcom/saterskog/cell_lab/Cell;->r:F

    goto/16 :goto_1

    .line 30270
    :pswitch_b
    const/4 v7, 0x0

    :goto_b
    const/16 v16, 0x3

    move/from16 v0, v16

    if-ge v7, v0, :cond_6

    .line 30271
    iget-object v0, v8, Lcom/saterskog/cell_lab/Gene;->a:[F

    move-object/from16 v16, v0

    aget v17, v16, v7

    move/from16 v0, v17

    float-to-double v0, v0

    move-wide/from16 v18, v0

    .line 32014
    invoke-virtual {v9}, Lcom/saterskog/b/d;->nextGaussian()D

    move-result-wide v20

    .line 30271
    const-wide v22, 0x3fc3333333333333L    # 0.15

    mul-double v20, v20, v22

    add-double v18, v18, v20

    move-wide/from16 v0, v18

    double-to-float v0, v0

    move/from16 v17, v0

    aput v17, v16, v7

    .line 30272
    iget-object v0, v8, Lcom/saterskog/cell_lab/Gene;->a:[F

    move-object/from16 v16, v0

    aget v16, v16, v7

    const/16 v17, 0x0

    cmpg-float v16, v16, v17

    if-gez v16, :cond_14

    .line 30273
    iget-object v0, v8, Lcom/saterskog/cell_lab/Gene;->a:[F

    move-object/from16 v16, v0

    const/16 v17, 0x0

    aput v17, v16, v7

    .line 30274
    :cond_14
    iget-object v0, v8, Lcom/saterskog/cell_lab/Gene;->a:[F

    move-object/from16 v16, v0

    aget v16, v16, v7

    const/high16 v17, 0x3f800000    # 1.0f

    cmpl-float v16, v16, v17

    if-lez v16, :cond_15

    .line 30275
    iget-object v0, v8, Lcom/saterskog/cell_lab/Gene;->a:[F

    move-object/from16 v16, v0

    const/high16 v17, 0x3f800000    # 1.0f

    aput v17, v16, v7

    .line 30270
    :cond_15
    add-int/lit8 v7, v7, 0x1

    goto :goto_b

    .line 30279
    :pswitch_c
    iget v7, v8, Lcom/saterskog/cell_lab/Gene;->d:F

    float-to-double v0, v7

    move-wide/from16 v16, v0

    .line 33014
    invoke-virtual {v9}, Lcom/saterskog/b/d;->nextGaussian()D

    move-result-wide v18

    .line 30279
    add-double v16, v16, v18

    move-wide/from16 v0, v16

    double-to-float v7, v0

    iput v7, v8, Lcom/saterskog/cell_lab/Gene;->d:F

    .line 30280
    :goto_c
    iget v7, v8, Lcom/saterskog/cell_lab/Gene;->d:F

    const/16 v16, 0x0

    cmpg-float v7, v7, v16

    if-gez v7, :cond_16

    .line 30281
    iget v7, v8, Lcom/saterskog/cell_lab/Gene;->d:F

    float-to-double v0, v7

    move-wide/from16 v16, v0

    const-wide v18, 0x401921fb54442d18L    # 6.283185307179586

    add-double v16, v16, v18

    move-wide/from16 v0, v16

    double-to-float v7, v0

    iput v7, v8, Lcom/saterskog/cell_lab/Gene;->d:F

    goto :goto_c

    .line 30282
    :cond_16
    :goto_d
    iget v7, v8, Lcom/saterskog/cell_lab/Gene;->d:F

    float-to-double v0, v7

    move-wide/from16 v16, v0

    const-wide v18, 0x401921fb54442d18L    # 6.283185307179586

    cmpl-double v7, v16, v18

    if-lez v7, :cond_6

    .line 30283
    iget v7, v8, Lcom/saterskog/cell_lab/Gene;->d:F

    float-to-double v0, v7

    move-wide/from16 v16, v0

    const-wide v18, 0x401921fb54442d18L    # 6.283185307179586

    sub-double v16, v16, v18

    move-wide/from16 v0, v16

    double-to-float v7, v0

    iput v7, v8, Lcom/saterskog/cell_lab/Gene;->d:F

    goto :goto_d

    .line 30286
    :pswitch_d
    iget v7, v8, Lcom/saterskog/cell_lab/Gene;->e:F

    float-to-double v0, v7

    move-wide/from16 v16, v0

    .line 34014
    invoke-virtual {v9}, Lcom/saterskog/b/d;->nextGaussian()D

    move-result-wide v18

    .line 30286
    add-double v16, v16, v18

    move-wide/from16 v0, v16

    double-to-float v7, v0

    iput v7, v8, Lcom/saterskog/cell_lab/Gene;->e:F

    .line 30287
    :goto_e
    iget v7, v8, Lcom/saterskog/cell_lab/Gene;->e:F

    const/16 v16, 0x0

    cmpg-float v7, v7, v16

    if-gez v7, :cond_17

    .line 30288
    iget v7, v8, Lcom/saterskog/cell_lab/Gene;->e:F

    float-to-double v0, v7

    move-wide/from16 v16, v0

    const-wide v18, 0x401921fb54442d18L    # 6.283185307179586

    add-double v16, v16, v18

    move-wide/from16 v0, v16

    double-to-float v7, v0

    iput v7, v8, Lcom/saterskog/cell_lab/Gene;->e:F

    goto :goto_e

    .line 30289
    :cond_17
    :goto_f
    iget v7, v8, Lcom/saterskog/cell_lab/Gene;->e:F

    float-to-double v0, v7

    move-wide/from16 v16, v0

    const-wide v18, 0x401921fb54442d18L    # 6.283185307179586

    cmpl-double v7, v16, v18

    if-lez v7, :cond_6

    .line 30290
    iget v7, v8, Lcom/saterskog/cell_lab/Gene;->e:F

    float-to-double v0, v7

    move-wide/from16 v16, v0

    const-wide v18, 0x401921fb54442d18L    # 6.283185307179586

    sub-double v16, v16, v18

    move-wide/from16 v0, v16

    double-to-float v7, v0

    iput v7, v8, Lcom/saterskog/cell_lab/Gene;->e:F

    goto :goto_f

    .line 30293
    :pswitch_e
    iget v7, v8, Lcom/saterskog/cell_lab/Gene;->f:F

    float-to-double v0, v7

    move-wide/from16 v16, v0

    .line 35014
    invoke-virtual {v9}, Lcom/saterskog/b/d;->nextGaussian()D

    move-result-wide v18

    .line 30293
    add-double v16, v16, v18

    move-wide/from16 v0, v16

    double-to-float v7, v0

    iput v7, v8, Lcom/saterskog/cell_lab/Gene;->f:F

    .line 30294
    :goto_10
    iget v7, v8, Lcom/saterskog/cell_lab/Gene;->f:F

    const/16 v16, 0x0

    cmpg-float v7, v7, v16

    if-gez v7, :cond_18

    .line 30295
    iget v7, v8, Lcom/saterskog/cell_lab/Gene;->f:F

    float-to-double v0, v7

    move-wide/from16 v16, v0

    const-wide v18, 0x401921fb54442d18L    # 6.283185307179586

    add-double v16, v16, v18

    move-wide/from16 v0, v16

    double-to-float v7, v0

    iput v7, v8, Lcom/saterskog/cell_lab/Gene;->f:F

    goto :goto_10

    .line 30296
    :cond_18
    :goto_11
    iget v7, v8, Lcom/saterskog/cell_lab/Gene;->f:F

    float-to-double v0, v7

    move-wide/from16 v16, v0

    const-wide v18, 0x401921fb54442d18L    # 6.283185307179586

    cmpl-double v7, v16, v18

    if-lez v7, :cond_6

    .line 30297
    iget v7, v8, Lcom/saterskog/cell_lab/Gene;->f:F

    float-to-double v0, v7

    move-wide/from16 v16, v0

    const-wide v18, 0x401921fb54442d18L    # 6.283185307179586

    sub-double v16, v16, v18

    move-wide/from16 v0, v16

    double-to-float v7, v0

    iput v7, v8, Lcom/saterskog/cell_lab/Gene;->f:F

    goto :goto_11

    .line 30300
    :pswitch_f
    iget v7, v8, Lcom/saterskog/cell_lab/Gene;->g:F

    float-to-double v0, v7

    move-wide/from16 v16, v0

    .line 36014
    invoke-virtual {v9}, Lcom/saterskog/b/d;->nextGaussian()D

    move-result-wide v18

    .line 30300
    const-wide/high16 v20, 0x4000000000000000L    # 2.0

    div-double v18, v18, v20

    invoke-static/range {v18 .. v19}, Ljava/lang/Math;->exp(D)D

    move-result-wide v18

    mul-double v16, v16, v18

    move-wide/from16 v0, v16

    double-to-float v7, v0

    iput v7, v8, Lcom/saterskog/cell_lab/Gene;->g:F

    .line 30301
    iget v7, v8, Lcom/saterskog/cell_lab/Gene;->g:F

    const/high16 v16, 0x41200000    # 10.0f

    cmpl-float v7, v7, v16

    if-lez v7, :cond_19

    .line 30302
    const/high16 v7, 0x41200000    # 10.0f

    iput v7, v8, Lcom/saterskog/cell_lab/Gene;->g:F

    .line 30303
    :cond_19
    iget v7, v8, Lcom/saterskog/cell_lab/Gene;->g:F

    const v16, 0x3dcccccd    # 0.1f

    cmpg-float v7, v7, v16

    if-gez v7, :cond_6

    .line 30304
    const v7, 0x3dcccccd    # 0.1f

    iput v7, v8, Lcom/saterskog/cell_lab/Gene;->g:F

    goto/16 :goto_4

    .line 30307
    :pswitch_10
    iget v7, v8, Lcom/saterskog/cell_lab/Gene;->b:F

    float-to-double v0, v7

    move-wide/from16 v16, v0

    .line 37014
    invoke-virtual {v9}, Lcom/saterskog/b/d;->nextGaussian()D

    move-result-wide v18

    .line 30307
    const-wide/high16 v20, 0x4000000000000000L    # 2.0

    div-double v18, v18, v20

    invoke-static/range {v18 .. v19}, Ljava/lang/Math;->exp(D)D

    move-result-wide v18

    mul-double v16, v16, v18

    move-wide/from16 v0, v16

    double-to-float v7, v0

    iput v7, v8, Lcom/saterskog/cell_lab/Gene;->b:F

    .line 30308
    iget v7, v8, Lcom/saterskog/cell_lab/Gene;->b:F

    const v16, 0x3ebc01a3    # 0.3672f

    cmpl-float v7, v7, v16

    if-lez v7, :cond_1a

    .line 30309
    const v7, 0x3ebc01a3    # 0.3672f

    iput v7, v8, Lcom/saterskog/cell_lab/Gene;->b:F

    .line 30310
    :cond_1a
    iget v7, v8, Lcom/saterskog/cell_lab/Gene;->b:F

    const v16, 0x3d84b5dd    # 0.0648f

    cmpg-float v7, v7, v16

    if-gez v7, :cond_6

    .line 30311
    const v7, 0x3d84b5dd    # 0.0648f

    iput v7, v8, Lcom/saterskog/cell_lab/Gene;->b:F

    goto/16 :goto_4

    .line 30314
    :pswitch_11
    iget v7, v8, Lcom/saterskog/cell_lab/Gene;->c:F

    float-to-double v0, v7

    move-wide/from16 v16, v0

    .line 38014
    invoke-virtual {v9}, Lcom/saterskog/b/d;->nextGaussian()D

    move-result-wide v18

    .line 30314
    const-wide v20, 0x3fc999999999999aL    # 0.2

    mul-double v18, v18, v20

    add-double v16, v16, v18

    move-wide/from16 v0, v16

    double-to-float v7, v0

    iput v7, v8, Lcom/saterskog/cell_lab/Gene;->c:F

    .line 30315
    iget v7, v8, Lcom/saterskog/cell_lab/Gene;->c:F

    const v16, 0x3dcccccd    # 0.1f

    cmpg-float v7, v7, v16

    if-gez v7, :cond_1b

    .line 30316
    const v7, 0x3dcccccd    # 0.1f

    iput v7, v8, Lcom/saterskog/cell_lab/Gene;->c:F

    .line 30317
    :cond_1b
    iget v7, v8, Lcom/saterskog/cell_lab/Gene;->c:F

    const v16, 0x3f666666    # 0.9f

    cmpl-float v7, v7, v16

    if-lez v7, :cond_6

    .line 30318
    const v7, 0x3f666666    # 0.9f

    iput v7, v8, Lcom/saterskog/cell_lab/Gene;->c:F

    goto/16 :goto_4

    .line 30329
    :pswitch_12
    if-nez v14, :cond_6

    .line 38017
    const/16 v7, 0x50

    invoke-virtual {v9, v7}, Lcom/saterskog/b/d;->nextInt(I)I

    move-result v7

    .line 30330
    iput v7, v8, Lcom/saterskog/cell_lab/Gene;->i:I

    goto/16 :goto_4

    .line 30333
    :pswitch_13
    if-nez v14, :cond_6

    .line 39017
    const/16 v7, 0x50

    invoke-virtual {v9, v7}, Lcom/saterskog/b/d;->nextInt(I)I

    move-result v7

    .line 30334
    iput v7, v8, Lcom/saterskog/cell_lab/Gene;->j:I

    goto/16 :goto_4

    .line 30337
    :pswitch_14
    if-nez v14, :cond_6

    .line 30338
    iget-boolean v7, v8, Lcom/saterskog/cell_lab/Gene;->l:Z

    if-nez v7, :cond_1c

    const/4 v7, 0x1

    :goto_12
    iput-boolean v7, v8, Lcom/saterskog/cell_lab/Gene;->l:Z

    goto/16 :goto_4

    :cond_1c
    const/4 v7, 0x0

    goto :goto_12

    .line 30341
    :pswitch_15
    if-nez v14, :cond_6

    .line 30342
    iget-boolean v7, v8, Lcom/saterskog/cell_lab/Gene;->m:Z

    if-nez v7, :cond_1d

    const/4 v7, 0x1

    :goto_13
    iput-boolean v7, v8, Lcom/saterskog/cell_lab/Gene;->m:Z

    goto/16 :goto_4

    :cond_1d
    const/4 v7, 0x0

    goto :goto_13

    .line 30345
    :pswitch_16
    if-nez v14, :cond_6

    .line 30346
    iget-boolean v7, v8, Lcom/saterskog/cell_lab/Gene;->n:Z

    if-nez v7, :cond_1e

    const/4 v7, 0x1

    :goto_14
    iput-boolean v7, v8, Lcom/saterskog/cell_lab/Gene;->n:Z

    goto/16 :goto_4

    :cond_1e
    const/4 v7, 0x0

    goto :goto_14

    .line 30349
    :pswitch_17
    if-nez v14, :cond_6

    .line 30351
    :cond_1f
    sget-object v7, Lcom/saterskog/cell_lab/h;->B:[Lcom/saterskog/cell_lab/h;

    sget-object v16, Lcom/saterskog/cell_lab/h;->B:[Lcom/saterskog/cell_lab/h;

    move-object/from16 v0, v16

    array-length v0, v0

    move/from16 v16, v0

    .line 40017
    move/from16 v0, v16

    invoke-virtual {v9, v0}, Lcom/saterskog/b/d;->nextInt(I)I

    move-result v16

    .line 30351
    aget-object v7, v7, v16

    iput-object v7, v8, Lcom/saterskog/cell_lab/Gene;->s:Lcom/saterskog/cell_lab/h;

    .line 30352
    iget-object v7, v11, Lcom/saterskog/cell_lab/Environment;->t:[Z

    iget-object v0, v8, Lcom/saterskog/cell_lab/Gene;->s:Lcom/saterskog/cell_lab/h;

    move-object/from16 v16, v0

    invoke-virtual/range {v16 .. v16}, Lcom/saterskog/cell_lab/h;->ordinal()I

    move-result v16

    aget-boolean v7, v7, v16

    if-eqz v7, :cond_1f

    goto/16 :goto_4

    .line 30358
    :pswitch_18
    iget-boolean v7, v8, Lcom/saterskog/cell_lab/Gene;->o:Z

    if-nez v7, :cond_20

    const/4 v7, 0x1

    :goto_15
    iput-boolean v7, v8, Lcom/saterskog/cell_lab/Gene;->o:Z

    goto/16 :goto_4

    :cond_20
    const/4 v7, 0x0

    goto :goto_15

    .line 30372
    :pswitch_19
    iget-boolean v7, v8, Lcom/saterskog/cell_lab/Gene;->q:Z

    if-nez v7, :cond_21

    const/4 v7, 0x1

    :goto_16
    iput-boolean v7, v8, Lcom/saterskog/cell_lab/Gene;->q:Z

    goto/16 :goto_4

    :cond_21
    const/4 v7, 0x0

    goto :goto_16

    .line 30375
    :pswitch_1a
    iget-boolean v7, v8, Lcom/saterskog/cell_lab/Gene;->r:Z

    if-nez v7, :cond_22

    const/4 v7, 0x1

    :goto_17
    iput-boolean v7, v8, Lcom/saterskog/cell_lab/Gene;->r:Z

    goto/16 :goto_4

    :cond_22
    const/4 v7, 0x0

    goto :goto_17

    .line 30378
    :pswitch_1b
    const/4 v7, 0x0

    const/high16 v16, 0x420c0000    # 35.0f

    iget v0, v8, Lcom/saterskog/cell_lab/Gene;->h:F

    move/from16 v17, v0

    move/from16 v0, v16

    move/from16 v1, v17

    invoke-static {v7, v0, v1, v9}, Lcom/saterskog/cell_lab/Gene;->a(FFFLcom/saterskog/b/d;)F

    move-result v7

    iput v7, v8, Lcom/saterskog/cell_lab/Gene;->h:F

    goto/16 :goto_4

    .line 28246
    :cond_23
    iget-boolean v7, v11, Lcom/saterskog/cell_lab/Environment;->u:Z

    if-nez v7, :cond_d

    .line 28247
    iget v7, v12, Lcom/saterskog/cell_lab/Cell;->G:I

    add-int/lit8 v7, v7, 0x1

    iput v7, v12, Lcom/saterskog/cell_lab/Cell;->G:I

    .line 28248
    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/saterskog/cell_lab/CellWorld;->Y:Lcom/saterskog/b/d;

    .line 44017
    const/16 v8, 0x50

    invoke-virtual {v7, v8}, Lcom/saterskog/b/d;->nextInt(I)I

    move-result v8

    move v9, v8

    .line 28250
    :goto_18
    if-ne v8, v9, :cond_24

    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/saterskog/cell_lab/CellWorld;->Y:Lcom/saterskog/b/d;

    .line 45017
    const/16 v9, 0x50

    invoke-virtual {v7, v9}, Lcom/saterskog/b/d;->nextInt(I)I

    move-result v7

    move v9, v7

    .line 28250
    goto :goto_18

    .line 28251
    :cond_24
    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/saterskog/cell_lab/CellWorld;->Y:Lcom/saterskog/b/d;

    .line 46017
    const/4 v14, 0x3

    invoke-virtual {v7, v14}, Lcom/saterskog/b/d;->nextInt(I)I

    move-result v7

    .line 28252
    if-nez v7, :cond_25

    .line 28253
    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/saterskog/cell_lab/CellWorld;->Y:Lcom/saterskog/b/d;

    .line 47017
    const/4 v15, 0x2

    invoke-virtual {v14, v15}, Lcom/saterskog/b/d;->nextInt(I)I

    move-result v14

    .line 28253
    if-nez v14, :cond_28

    .line 28257
    iget-object v14, v12, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    aget-object v14, v14, v9

    iget-object v15, v12, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    iget-object v0, v12, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    move-object/from16 v16, v0

    aget-object v16, v16, v8

    move-object/from16 v0, v16

    iget v0, v0, Lcom/saterskog/cell_lab/Gene;->i:I

    move/from16 v16, v0

    aget-object v15, v15, v16

    invoke-virtual {v14, v15}, Lcom/saterskog/cell_lab/Gene;->a(Lcom/saterskog/cell_lab/Gene;)V

    .line 28258
    iget-object v14, v12, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    aget-object v14, v14, v8

    iput v9, v14, Lcom/saterskog/cell_lab/Gene;->i:I

    .line 28265
    :cond_25
    :goto_19
    const/4 v14, 0x1

    if-ne v7, v14, :cond_26

    .line 28267
    iget-object v14, v12, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    aget-object v14, v14, v9

    const/4 v15, 0x1

    iput-boolean v15, v14, Lcom/saterskog/cell_lab/Gene;->l:Z

    .line 28268
    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/saterskog/cell_lab/CellWorld;->Y:Lcom/saterskog/b/d;

    .line 48017
    const/4 v15, 0x2

    invoke-virtual {v14, v15}, Lcom/saterskog/b/d;->nextInt(I)I

    move-result v14

    .line 28268
    if-nez v14, :cond_29

    .line 28269
    iget-object v14, v12, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    aget-object v14, v14, v9

    iget-object v15, v12, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    aget-object v15, v15, v8

    iget v15, v15, Lcom/saterskog/cell_lab/Gene;->i:I

    iput v15, v14, Lcom/saterskog/cell_lab/Gene;->i:I

    .line 28270
    iget-object v14, v12, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    aget-object v14, v14, v9

    iget-object v15, v12, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    aget-object v15, v15, v8

    iget v15, v15, Lcom/saterskog/cell_lab/Gene;->i:I

    iput v15, v14, Lcom/saterskog/cell_lab/Gene;->j:I

    .line 28271
    iget-object v14, v12, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    aget-object v14, v14, v8

    iput v9, v14, Lcom/saterskog/cell_lab/Gene;->i:I

    .line 28277
    :cond_26
    :goto_1a
    const/4 v14, 0x2

    if-ne v7, v14, :cond_d

    move v7, v8

    .line 28280
    :goto_1b
    if-eq v7, v8, :cond_27

    if-ne v7, v9, :cond_2a

    :cond_27
    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/saterskog/cell_lab/CellWorld;->Y:Lcom/saterskog/b/d;

    .line 49017
    const/16 v14, 0x50

    invoke-virtual {v7, v14}, Lcom/saterskog/b/d;->nextInt(I)I

    move-result v7

    goto :goto_1b

    .line 28261
    :cond_28
    iget-object v14, v12, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    aget-object v14, v14, v9

    iget-object v15, v12, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    iget-object v0, v12, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    move-object/from16 v16, v0

    aget-object v16, v16, v8

    move-object/from16 v0, v16

    iget v0, v0, Lcom/saterskog/cell_lab/Gene;->j:I

    move/from16 v16, v0

    aget-object v15, v15, v16

    invoke-virtual {v14, v15}, Lcom/saterskog/cell_lab/Gene;->a(Lcom/saterskog/cell_lab/Gene;)V

    .line 28262
    iget-object v14, v12, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    aget-object v14, v14, v8

    iput v9, v14, Lcom/saterskog/cell_lab/Gene;->j:I

    goto :goto_19

    .line 28273
    :cond_29
    iget-object v14, v12, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    aget-object v14, v14, v9

    iget-object v15, v12, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    aget-object v15, v15, v8

    iget v15, v15, Lcom/saterskog/cell_lab/Gene;->j:I

    iput v15, v14, Lcom/saterskog/cell_lab/Gene;->i:I

    .line 28274
    iget-object v14, v12, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    aget-object v14, v14, v9

    iget-object v15, v12, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    aget-object v15, v15, v8

    iget v15, v15, Lcom/saterskog/cell_lab/Gene;->j:I

    iput v15, v14, Lcom/saterskog/cell_lab/Gene;->j:I

    .line 28275
    iget-object v14, v12, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    aget-object v14, v14, v8

    iput v9, v14, Lcom/saterskog/cell_lab/Gene;->j:I

    goto :goto_1a

    .line 28286
    :cond_2a
    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/saterskog/cell_lab/CellWorld;->Y:Lcom/saterskog/b/d;

    .line 50017
    const/4 v15, 0x2

    invoke-virtual {v14, v15}, Lcom/saterskog/b/d;->nextInt(I)I

    move-result v14

    .line 28286
    if-nez v14, :cond_2c

    .line 28288
    iget-object v14, v12, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    aget-object v14, v14, v8

    iget v14, v14, Lcom/saterskog/cell_lab/Gene;->j:I

    .line 28289
    iget-object v15, v12, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    aget-object v8, v15, v8

    iput v9, v8, Lcom/saterskog/cell_lab/Gene;->j:I

    .line 28290
    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/saterskog/cell_lab/CellWorld;->Y:Lcom/saterskog/b/d;

    .line 50018
    const/4 v15, 0x2

    invoke-virtual {v8, v15}, Lcom/saterskog/b/d;->nextInt(I)I

    move-result v8

    .line 28290
    if-nez v8, :cond_2b

    .line 28292
    iget-object v8, v12, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    aget-object v8, v8, v9

    iput v7, v8, Lcom/saterskog/cell_lab/Gene;->i:I

    .line 28293
    iget-object v7, v12, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    aget-object v7, v7, v9

    iput v14, v7, Lcom/saterskog/cell_lab/Gene;->j:I

    goto/16 :goto_5

    .line 28297
    :cond_2b
    iget-object v8, v12, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    aget-object v8, v8, v9

    iput v14, v8, Lcom/saterskog/cell_lab/Gene;->i:I

    .line 28298
    iget-object v8, v12, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    aget-object v8, v8, v9

    iput v7, v8, Lcom/saterskog/cell_lab/Gene;->j:I

    goto/16 :goto_5

    .line 28303
    :cond_2c
    iget-object v14, v12, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    aget-object v14, v14, v8

    iget v14, v14, Lcom/saterskog/cell_lab/Gene;->i:I

    .line 28304
    iget-object v15, v12, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    aget-object v8, v15, v8

    iput v9, v8, Lcom/saterskog/cell_lab/Gene;->i:I

    .line 28305
    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/saterskog/cell_lab/CellWorld;->Y:Lcom/saterskog/b/d;

    .line 50019
    const/4 v15, 0x2

    invoke-virtual {v8, v15}, Lcom/saterskog/b/d;->nextInt(I)I

    move-result v8

    .line 28305
    if-nez v8, :cond_2d

    .line 28307
    iget-object v8, v12, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    aget-object v8, v8, v9

    iput v7, v8, Lcom/saterskog/cell_lab/Gene;->i:I

    .line 28308
    iget-object v7, v12, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    aget-object v7, v7, v9

    iput v14, v7, Lcom/saterskog/cell_lab/Gene;->j:I

    goto/16 :goto_5

    .line 28312
    :cond_2d
    iget-object v8, v12, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    aget-object v8, v8, v9

    iput v14, v8, Lcom/saterskog/cell_lab/Gene;->i:I

    .line 28313
    iget-object v8, v12, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    aget-object v8, v8, v9

    iput v7, v8, Lcom/saterskog/cell_lab/Gene;->j:I

    goto/16 :goto_5

    .line 28325
    :cond_2e
    const/4 v7, 0x0

    :goto_1c
    const/4 v8, 0x3

    if-ge v7, v8, :cond_2f

    .line 28326
    iget-object v8, v12, Lcom/saterskog/cell_lab/Cell;->J:[F

    aget v9, v8, v7

    float-to-double v10, v9

    iget-object v9, v12, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    iget v14, v12, Lcom/saterskog/cell_lab/Cell;->D:I

    aget-object v9, v9, v14

    iget-object v9, v9, Lcom/saterskog/cell_lab/Gene;->a:[F

    aget v9, v9, v7

    iget-object v14, v12, Lcom/saterskog/cell_lab/Cell;->J:[F

    aget v14, v14, v7

    sub-float/2addr v9, v14

    float-to-double v14, v9

    const-wide/high16 v16, 0x4020000000000000L    # 8.0

    mul-double v14, v14, v16

    mul-double v14, v14, p1

    add-double/2addr v10, v14

    double-to-float v9, v10

    aput v9, v8, v7

    .line 28325
    add-int/lit8 v7, v7, 0x1

    goto :goto_1c

    .line 2672
    :cond_2f
    invoke-virtual {v12}, Lcom/saterskog/cell_lab/Cell;->a()D

    move-result-wide v14

    .line 2673
    iget v7, v13, Lcom/saterskog/cell_lab/Gene;->g:F

    float-to-double v8, v7

    .line 2675
    iget v7, v13, Lcom/saterskog/cell_lab/Gene;->b:F

    float-to-double v10, v7

    const-wide v16, 0x3fd70a3d70a3d70aL    # 0.36

    cmpl-double v7, v10, v16

    if-lez v7, :cond_30

    const-wide v10, 0x3fd61e4f765fd8adL    # 0.34559999999999996

    cmpl-double v7, v14, v10

    if-lez v7, :cond_30

    .line 2676
    const-wide/16 v8, 0x0

    .line 2679
    :cond_30
    iget-boolean v7, v13, Lcom/saterskog/cell_lab/Gene;->o:Z

    if-eqz v7, :cond_31

    iget-wide v10, v12, Lcom/saterskog/cell_lab/Cell;->w:D

    const-wide v16, 0x3fb7f62b6ae7d567L    # 0.0936

    cmpg-double v7, v10, v16

    if-gez v7, :cond_31

    .line 2680
    const-wide v10, 0x407cef684bda12f3L    # 462.96296296296276

    const-wide v16, 0x3fb7f62b6ae7d567L    # 0.0936

    iget-wide v0, v12, Lcom/saterskog/cell_lab/Cell;->w:D

    move-wide/from16 v18, v0

    sub-double v16, v16, v18

    mul-double v10, v10, v16

    add-double/2addr v8, v10

    .line 2682
    :cond_31
    const/4 v7, 0x0

    :goto_1d
    iget v10, v12, Lcom/saterskog/cell_lab/Cell;->C:I

    if-ge v7, v10, :cond_39

    .line 2683
    iget-object v10, v12, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    aget-object v10, v10, v7

    iget v10, v10, Lcom/saterskog/cell_lab/Link;->a:I

    const/4 v11, -0x1

    if-eq v10, v11, :cond_38

    .line 2691
    move-object/from16 v0, p0

    iget-object v10, v0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    iget-object v11, v12, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    aget-object v11, v11, v7

    iget v11, v11, Lcom/saterskog/cell_lab/Link;->a:I

    aget-object v16, v10, v11

    .line 2692
    move-object/from16 v0, v16

    iget-object v10, v0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    move-object/from16 v0, v16

    iget v11, v0, Lcom/saterskog/cell_lab/Cell;->D:I

    aget-object v10, v10, v11

    iget v10, v10, Lcom/saterskog/cell_lab/Gene;->g:F

    float-to-double v10, v10

    .line 2693
    invoke-virtual/range {v16 .. v16}, Lcom/saterskog/cell_lab/Cell;->a()D

    move-result-wide v18

    .line 2694
    move-object/from16 v0, v16

    iget-object v0, v0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    move-object/from16 v17, v0

    move-object/from16 v0, v16

    iget v0, v0, Lcom/saterskog/cell_lab/Cell;->D:I

    move/from16 v20, v0

    aget-object v17, v17, v20

    move-object/from16 v0, v17

    iget v0, v0, Lcom/saterskog/cell_lab/Gene;->b:F

    move/from16 v17, v0

    move/from16 v0, v17

    float-to-double v0, v0

    move-wide/from16 v20, v0

    const-wide v22, 0x3fd70a3d70a3d70aL    # 0.36

    cmpl-double v17, v20, v22

    if-lez v17, :cond_32

    const-wide v20, 0x3fd61e4f765fd8adL    # 0.34559999999999996

    cmpl-double v17, v18, v20

    if-lez v17, :cond_32

    .line 2695
    const-wide/16 v10, 0x0

    .line 2698
    :cond_32
    move-object/from16 v0, v16

    iget-object v0, v0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    move-object/from16 v17, v0

    move-object/from16 v0, v16

    iget v0, v0, Lcom/saterskog/cell_lab/Cell;->D:I

    move/from16 v20, v0

    aget-object v17, v17, v20

    move-object/from16 v0, v17

    iget-boolean v0, v0, Lcom/saterskog/cell_lab/Gene;->o:Z

    move/from16 v17, v0

    if-eqz v17, :cond_33

    move-object/from16 v0, v16

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->w:D

    move-wide/from16 v20, v0

    const-wide v22, 0x3fb7f62b6ae7d567L    # 0.0936

    cmpg-double v17, v20, v22

    if-gez v17, :cond_33

    .line 2699
    const-wide v20, 0x407cef684bda12f3L    # 462.96296296296276

    const-wide v22, 0x3fb7f62b6ae7d567L    # 0.0936

    move-object/from16 v0, v16

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->w:D

    move-wide/from16 v24, v0

    sub-double v22, v22, v24

    mul-double v20, v20, v22

    add-double v10, v10, v20

    .line 2701
    :cond_33
    mul-double/2addr v10, v14

    mul-double v18, v18, v8

    sub-double v10, v10, v18

    .line 2708
    const-wide v18, 0x3fb999999999999aL    # 0.1

    cmpl-double v17, v10, v18

    if-lez v17, :cond_34

    .line 2709
    const-wide v10, 0x3fb999999999999aL    # 0.1

    .line 2710
    :cond_34
    const-wide v18, -0x4046666666666666L    # -0.1

    cmpg-double v17, v10, v18

    if-gez v17, :cond_35

    .line 2711
    const-wide v10, -0x4046666666666666L    # -0.1

    .line 2713
    :cond_35
    iget-wide v0, v12, Lcom/saterskog/cell_lab/Cell;->Q:D

    move-wide/from16 v18, v0

    mul-double v10, v10, p1

    sub-double v10, v18, v10

    iput-wide v10, v12, Lcom/saterskog/cell_lab/Cell;->Q:D

    .line 2714
    iget-wide v10, v12, Lcom/saterskog/cell_lab/Cell;->p:D

    move-object/from16 v0, v16

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->p:D

    move-wide/from16 v18, v0

    sub-double v10, v10, v18

    .line 2715
    const-wide v18, 0x3fe3333333333333L    # 0.6

    cmpl-double v17, v10, v18

    if-lez v17, :cond_36

    .line 2716
    const-wide v10, 0x3fe3333333333333L    # 0.6

    .line 2717
    :cond_36
    const-wide v18, -0x401ccccccccccccdL    # -0.6

    cmpg-double v17, v10, v18

    if-gez v17, :cond_37

    .line 2718
    const-wide v10, -0x401ccccccccccccdL    # -0.6

    .line 2719
    :cond_37
    iget-wide v0, v12, Lcom/saterskog/cell_lab/Cell;->R:D

    move-wide/from16 v18, v0

    mul-double v10, v10, p1

    sub-double v10, v18, v10

    iput-wide v10, v12, Lcom/saterskog/cell_lab/Cell;->R:D

    .line 2725
    iget v10, v12, Lcom/saterskog/cell_lab/Cell;->Z:F

    float-to-double v10, v10

    const/high16 v17, 0x40400000    # 3.0f

    move-object/from16 v0, v16

    iget v0, v0, Lcom/saterskog/cell_lab/Cell;->X:F

    move/from16 v16, v0

    iget v0, v12, Lcom/saterskog/cell_lab/Cell;->X:F

    move/from16 v18, v0

    sub-float v16, v16, v18

    mul-float v16, v16, v17

    move/from16 v0, v16

    float-to-double v0, v0

    move-wide/from16 v16, v0

    mul-double v16, v16, p1

    add-double v10, v10, v16

    double-to-float v10, v10

    iput v10, v12, Lcom/saterskog/cell_lab/Cell;->Z:F

    .line 2682
    :cond_38
    add-int/lit8 v7, v7, 0x1

    goto/16 :goto_1d

    .line 2727
    :cond_39
    iget-object v7, v13, Lcom/saterskog/cell_lab/Gene;->s:Lcom/saterskog/cell_lab/h;

    sget-object v8, Lcom/saterskog/cell_lab/h;->e:Lcom/saterskog/cell_lab/h;

    if-ne v7, v8, :cond_3e

    .line 2728
    iget-wide v8, v12, Lcom/saterskog/cell_lab/Cell;->Q:D

    const-wide v10, 0x3fd70a3d70a3d70aL    # 0.36

    cmpl-double v7, v8, v10

    if-lez v7, :cond_3d

    .line 2729
    iget v7, v12, Lcom/saterskog/cell_lab/Cell;->S:F

    float-to-double v8, v7

    iget-wide v10, v12, Lcom/saterskog/cell_lab/Cell;->Q:D

    const-wide v14, 0x3fd70a3d70a3d70aL    # 0.36

    sub-double/2addr v10, v14

    add-double/2addr v8, v10

    double-to-float v7, v8

    iput v7, v12, Lcom/saterskog/cell_lab/Cell;->S:F

    .line 2730
    const-wide v8, 0x3fd70a3d70a3d70aL    # 0.36

    iput-wide v8, v12, Lcom/saterskog/cell_lab/Cell;->Q:D

    .line 2731
    iget v7, v12, Lcom/saterskog/cell_lab/Cell;->S:F

    const v8, 0x3fe66666    # 1.8f

    cmpl-float v7, v7, v8

    if-lez v7, :cond_3a

    .line 2732
    const v7, 0x3fe66666    # 1.8f

    iput v7, v12, Lcom/saterskog/cell_lab/Cell;->S:F

    .line 2745
    :cond_3a
    :goto_1e
    iget-wide v8, v12, Lcom/saterskog/cell_lab/Cell;->R:D

    const-wide/high16 v10, 0x3ff0000000000000L    # 1.0

    cmpl-double v7, v8, v10

    if-lez v7, :cond_3b

    const-wide/high16 v8, 0x3ff0000000000000L    # 1.0

    iput-wide v8, v12, Lcom/saterskog/cell_lab/Cell;->R:D

    .line 2746
    :cond_3b
    iget-wide v8, v12, Lcom/saterskog/cell_lab/Cell;->p:D

    const-wide v10, 0x3fb999999999999aL    # 0.1

    cmpg-double v7, v8, v10

    if-gez v7, :cond_3c

    const/4 v7, 0x1

    iput-boolean v7, v12, Lcom/saterskog/cell_lab/Cell;->x:Z

    .line 2648
    :cond_3c
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_0

    .line 2735
    :cond_3d
    iget v7, v12, Lcom/saterskog/cell_lab/Cell;->S:F

    const/4 v8, 0x0

    cmpl-float v7, v7, v8

    if-lez v7, :cond_3a

    .line 2736
    iget v7, v12, Lcom/saterskog/cell_lab/Cell;->S:F

    float-to-double v8, v7

    const-wide v10, 0x3fd70a3d70a3d70aL    # 0.36

    iget-wide v14, v12, Lcom/saterskog/cell_lab/Cell;->Q:D

    sub-double/2addr v10, v14

    invoke-static {v8, v9, v10, v11}, Ljava/lang/Math;->min(DD)D

    move-result-wide v8

    .line 2737
    iget-wide v10, v12, Lcom/saterskog/cell_lab/Cell;->Q:D

    add-double/2addr v10, v8

    iput-wide v10, v12, Lcom/saterskog/cell_lab/Cell;->Q:D

    .line 2738
    iget v7, v12, Lcom/saterskog/cell_lab/Cell;->S:F

    float-to-double v10, v7

    sub-double v8, v10, v8

    double-to-float v7, v8

    iput v7, v12, Lcom/saterskog/cell_lab/Cell;->S:F

    goto :goto_1e

    .line 2742
    :cond_3e
    iget-wide v8, v12, Lcom/saterskog/cell_lab/Cell;->Q:D

    const-wide v10, 0x3fd70a3d70a3d70aL    # 0.36

    cmpl-double v7, v8, v10

    if-lez v7, :cond_3a

    .line 2743
    const-wide v8, 0x3fd70a3d70a3d70aL    # 0.36

    iput-wide v8, v12, Lcom/saterskog/cell_lab/Cell;->Q:D

    goto :goto_1e

    .line 2754
    :cond_3f
    return-void

    .line 28143
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_6
        :pswitch_7
        :pswitch_8
        :pswitch_9
        :pswitch_a
    .end packed-switch

    .line 30268
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_b
        :pswitch_c
        :pswitch_d
        :pswitch_e
        :pswitch_f
        :pswitch_10
        :pswitch_11
        :pswitch_12
        :pswitch_13
        :pswitch_14
        :pswitch_15
        :pswitch_16
        :pswitch_17
        :pswitch_0
        :pswitch_18
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_19
        :pswitch_1a
        :pswitch_1b
    .end packed-switch
.end method

.method private h()V
    .locals 36

    .prologue
    .line 1135
    const/4 v4, 0x0

    :goto_0
    move-object/from16 v0, p0

    iget v5, v0, Lcom/saterskog/cell_lab/CellWorld;->aX:I

    if-ge v4, v5, :cond_b

    .line 1136
    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/saterskog/cell_lab/CellWorld;->aY:[I

    aget v6, v6, v4

    aget-object v22, v5, v6

    const/4 v5, 0x0

    .line 1138
    move-object/from16 v0, v22

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->b:D

    move-wide/from16 v24, v0

    .line 1139
    move-object/from16 v0, v22

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->c:D

    move-wide/from16 v26, v0

    .line 1140
    move-object/from16 v0, v22

    iget-wide v6, v0, Lcom/saterskog/cell_lab/Cell;->d:D

    .line 1142
    const-wide/16 v20, 0x0

    .line 1143
    const-wide/16 v18, 0x0

    .line 1147
    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/saterskog/cell_lab/CellWorld;->aZ:[I

    aget v8, v8, v4

    const/4 v9, -0x1

    if-ne v8, v9, :cond_5

    .line 1148
    mul-double v6, v24, v24

    mul-double v8, v26, v26

    add-double/2addr v6, v8

    .line 1149
    invoke-static {v6, v7}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v8

    .line 1150
    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v6, v6, Lcom/saterskog/cell_lab/Environment;->k:D

    sub-double/2addr v6, v8

    .line 1151
    div-double v12, v24, v8

    .line 1152
    div-double v10, v26, v8

    .line 1153
    mul-double v16, v6, v12

    .line 1154
    mul-double v14, v6, v10

    .line 1177
    :goto_1
    move-object/from16 v0, v22

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->g:D

    move-wide/from16 v24, v0

    move-object/from16 v0, v22

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->j:D

    move-wide/from16 v26, v0

    mul-double v14, v14, v26

    sub-double v14, v24, v14

    sub-double v14, v14, v20

    .line 1178
    move-object/from16 v0, v22

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->h:D

    move-wide/from16 v20, v0

    move-object/from16 v0, v22

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->j:D

    move-wide/from16 v24, v0

    mul-double v16, v16, v24

    add-double v16, v16, v20

    sub-double v16, v16, v18

    .line 1181
    mul-double v18, v12, v14

    mul-double v20, v10, v16

    add-double v18, v18, v20

    .line 1182
    mul-double v20, v12, v18

    sub-double v20, v14, v20

    .line 1183
    mul-double v14, v10, v18

    sub-double v18, v16, v14

    .line 1184
    const-wide/16 v14, 0x0

    .line 1185
    move-object/from16 v0, v22

    iget-object v0, v0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    move-object/from16 v16, v0

    move-object/from16 v0, v22

    iget v0, v0, Lcom/saterskog/cell_lab/Cell;->D:I

    move/from16 v17, v0

    aget-object v16, v16, v17

    move-object/from16 v0, v16

    iget-object v0, v0, Lcom/saterskog/cell_lab/Gene;->s:Lcom/saterskog/cell_lab/h;

    move-object/from16 v16, v0

    sget-object v17, Lcom/saterskog/cell_lab/h;->r:Lcom/saterskog/cell_lab/h;

    move-object/from16 v0, v16

    move-object/from16 v1, v17

    if-ne v0, v1, :cond_1

    .line 1187
    move-object/from16 v0, v22

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->k:D

    move-wide/from16 v16, v0

    invoke-static/range {v16 .. v17}, Ljava/lang/Math;->cos(D)D

    move-result-wide v16

    .line 1188
    move-object/from16 v0, v22

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->k:D

    move-wide/from16 v24, v0

    invoke-static/range {v24 .. v25}, Ljava/lang/Math;->sin(D)D

    move-result-wide v24

    .line 1189
    mul-double v16, v16, v10

    mul-double v24, v24, v12

    sub-double v16, v16, v24

    .line 1190
    const-wide v24, -0x4036666666666666L    # -0.2

    cmpg-double v23, v16, v24

    if-ltz v23, :cond_0

    const-wide v24, 0x3fc999999999999aL    # 0.2

    cmpl-double v23, v16, v24

    if-lez v23, :cond_1

    .line 1191
    :cond_0
    const-wide/16 v14, 0x0

    cmpg-double v14, v14, v16

    if-gez v14, :cond_6

    const/4 v14, 0x1

    :goto_2
    move-object/from16 v0, v22

    iget-boolean v15, v0, Lcom/saterskog/cell_lab/Cell;->y:Z

    if-eq v14, v15, :cond_7

    .line 1192
    const-wide/16 v14, 0x0

    const-wide v24, 0x3fb3333333333333L    # 0.075

    mul-double v16, v16, v24

    const/16 v23, 0x2

    const/16 v24, 0x0

    invoke-virtual/range {v22 .. v24}, Lcom/saterskog/cell_lab/Cell;->a(II)F

    move-result v23

    move/from16 v0, v23

    float-to-double v0, v0

    move-wide/from16 v24, v0

    mul-double v16, v16, v24

    add-double v14, v14, v16

    .line 1197
    :cond_1
    :goto_3
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->aZ:[I

    move-object/from16 v16, v0

    aget v16, v16, v4

    const/16 v17, -0x1

    move/from16 v0, v16

    move/from16 v1, v17

    if-eq v0, v1, :cond_3

    .line 1198
    iget-object v0, v5, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    move-object/from16 v16, v0

    iget v0, v5, Lcom/saterskog/cell_lab/Cell;->D:I

    move/from16 v17, v0

    aget-object v16, v16, v17

    move-object/from16 v0, v16

    iget-object v0, v0, Lcom/saterskog/cell_lab/Gene;->s:Lcom/saterskog/cell_lab/h;

    move-object/from16 v16, v0

    sget-object v17, Lcom/saterskog/cell_lab/h;->r:Lcom/saterskog/cell_lab/h;

    move-object/from16 v0, v16

    move-object/from16 v1, v17

    if-ne v0, v1, :cond_3

    .line 1200
    iget-wide v0, v5, Lcom/saterskog/cell_lab/Cell;->k:D

    move-wide/from16 v16, v0

    invoke-static/range {v16 .. v17}, Ljava/lang/Math;->cos(D)D

    move-result-wide v16

    .line 1201
    iget-wide v0, v5, Lcom/saterskog/cell_lab/Cell;->k:D

    move-wide/from16 v24, v0

    invoke-static/range {v24 .. v25}, Ljava/lang/Math;->sin(D)D

    move-result-wide v24

    .line 1202
    neg-double v0, v10

    move-wide/from16 v26, v0

    mul-double v16, v16, v26

    mul-double v24, v24, v12

    add-double v24, v24, v16

    .line 1203
    const-wide v16, -0x4036666666666666L    # -0.2

    cmpg-double v16, v24, v16

    if-ltz v16, :cond_2

    const-wide v16, 0x3fc999999999999aL    # 0.2

    cmpl-double v16, v24, v16

    if-lez v16, :cond_3

    .line 1204
    :cond_2
    const-wide/16 v16, 0x0

    cmpg-double v16, v16, v24

    if-gez v16, :cond_8

    const/16 v16, 0x1

    :goto_4
    iget-boolean v0, v5, Lcom/saterskog/cell_lab/Cell;->y:Z

    move/from16 v17, v0

    move/from16 v0, v16

    move/from16 v1, v17

    if-eq v0, v1, :cond_9

    .line 1205
    const-wide v16, 0x3fb3333333333333L    # 0.075

    mul-double v16, v16, v24

    const/16 v23, 0x2

    const/16 v24, 0x0

    move/from16 v0, v23

    move/from16 v1, v24

    invoke-virtual {v5, v0, v1}, Lcom/saterskog/cell_lab/Cell;->a(II)F

    move-result v23

    move/from16 v0, v23

    float-to-double v0, v0

    move-wide/from16 v24, v0

    mul-double v16, v16, v24

    add-double v14, v14, v16

    .line 1211
    :cond_3
    :goto_5
    mul-double v16, v10, v14

    add-double v20, v20, v16

    .line 1212
    mul-double/2addr v14, v12

    sub-double v18, v18, v14

    .line 1213
    move-object/from16 v0, v22

    iget-wide v14, v0, Lcom/saterskog/cell_lab/Cell;->w:D

    move-object/from16 v0, v22

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->d:D

    move-wide/from16 v16, v0

    mul-double v14, v14, v16

    move-object/from16 v0, v22

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->d:D

    move-wide/from16 v16, v0

    mul-double v14, v14, v16

    const-wide v16, 0x3fe6666666666666L    # 0.7

    mul-double v24, v14, v16

    .line 1216
    const-wide/16 v14, 0x0

    .line 1217
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->aZ:[I

    move-object/from16 v16, v0

    aget v16, v16, v4

    const/16 v17, -0x1

    move/from16 v0, v16

    move/from16 v1, v17

    if-ne v0, v1, :cond_a

    .line 1218
    const-wide/high16 v16, 0x3ff0000000000000L    # 1.0

    const-wide/high16 v26, 0x3ff0000000000000L    # 1.0

    move-object/from16 v0, v22

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->w:D

    move-wide/from16 v28, v0

    div-double v26, v26, v28

    const-wide/high16 v28, 0x3ff0000000000000L    # 1.0

    mul-double v30, v6, v6

    div-double v30, v30, v24

    mul-double v28, v28, v30

    add-double v26, v26, v28

    div-double v16, v16, v26

    const-wide v26, 0x3f947ae147ae147bL    # 0.02

    div-double v16, v16, v26

    const-wide v26, 0x3feccccccccccccdL    # 0.9

    mul-double v16, v16, v26

    .line 1225
    :goto_6
    move-wide/from16 v0, v20

    neg-double v0, v0

    move-wide/from16 v20, v0

    mul-double v20, v20, v16

    .line 1226
    move-wide/from16 v0, v18

    neg-double v0, v0

    move-wide/from16 v18, v0

    mul-double v16, v16, v18

    .line 1228
    move-object/from16 v0, v22

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->e:D

    move-wide/from16 v18, v0

    const-wide v26, 0x3f947ae147ae147bL    # 0.02

    mul-double v26, v26, v20

    move-object/from16 v0, v22

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->w:D

    move-wide/from16 v28, v0

    div-double v26, v26, v28

    add-double v18, v18, v26

    move-wide/from16 v0, v18

    move-object/from16 v2, v22

    iput-wide v0, v2, Lcom/saterskog/cell_lab/Cell;->e:D

    .line 1229
    move-object/from16 v0, v22

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->f:D

    move-wide/from16 v18, v0

    const-wide v26, 0x3f947ae147ae147bL    # 0.02

    mul-double v26, v26, v16

    move-object/from16 v0, v22

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->w:D

    move-wide/from16 v28, v0

    div-double v26, v26, v28

    add-double v18, v18, v26

    move-wide/from16 v0, v18

    move-object/from16 v2, v22

    iput-wide v0, v2, Lcom/saterskog/cell_lab/Cell;->f:D

    .line 1230
    move-object/from16 v0, v22

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->l:D

    move-wide/from16 v18, v0

    const-wide/high16 v26, 0x3ff0000000000000L    # 1.0

    mul-double v26, v26, v6

    move-wide/from16 v0, v20

    neg-double v0, v0

    move-wide/from16 v28, v0

    mul-double v28, v28, v10

    mul-double v30, v16, v12

    add-double v28, v28, v30

    mul-double v26, v26, v28

    const-wide v28, 0x3f947ae147ae147bL    # 0.02

    mul-double v26, v26, v28

    div-double v24, v26, v24

    add-double v18, v18, v24

    move-wide/from16 v0, v18

    move-object/from16 v2, v22

    iput-wide v0, v2, Lcom/saterskog/cell_lab/Cell;->l:D

    .line 1232
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->aZ:[I

    move-object/from16 v18, v0

    aget v18, v18, v4

    const/16 v19, -0x1

    move/from16 v0, v18

    move/from16 v1, v19

    if-eq v0, v1, :cond_4

    .line 1233
    iget-wide v0, v5, Lcom/saterskog/cell_lab/Cell;->e:D

    move-wide/from16 v18, v0

    const-wide v22, 0x3f947ae147ae147bL    # 0.02

    mul-double v22, v22, v20

    iget-wide v0, v5, Lcom/saterskog/cell_lab/Cell;->w:D

    move-wide/from16 v24, v0

    div-double v22, v22, v24

    sub-double v18, v18, v22

    move-wide/from16 v0, v18

    iput-wide v0, v5, Lcom/saterskog/cell_lab/Cell;->e:D

    .line 1234
    iget-wide v0, v5, Lcom/saterskog/cell_lab/Cell;->f:D

    move-wide/from16 v18, v0

    const-wide v22, 0x3f947ae147ae147bL    # 0.02

    mul-double v22, v22, v16

    iget-wide v0, v5, Lcom/saterskog/cell_lab/Cell;->w:D

    move-wide/from16 v24, v0

    div-double v22, v22, v24

    sub-double v18, v18, v22

    move-wide/from16 v0, v18

    iput-wide v0, v5, Lcom/saterskog/cell_lab/Cell;->f:D

    .line 1235
    iget-wide v0, v5, Lcom/saterskog/cell_lab/Cell;->l:D

    move-wide/from16 v18, v0

    const-wide/high16 v22, 0x3ff0000000000000L    # 1.0

    sub-double v6, v8, v6

    mul-double v6, v6, v22

    move-wide/from16 v0, v20

    neg-double v8, v0

    mul-double/2addr v8, v10

    mul-double v10, v16, v12

    add-double/2addr v8, v10

    mul-double/2addr v6, v8

    const-wide v8, 0x3f947ae147ae147bL    # 0.02

    mul-double/2addr v6, v8

    div-double/2addr v6, v14

    add-double v6, v6, v18

    iput-wide v6, v5, Lcom/saterskog/cell_lab/Cell;->l:D

    .line 1135
    :cond_4
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_0

    .line 1160
    :cond_5
    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/saterskog/cell_lab/CellWorld;->aZ:[I

    aget v8, v8, v4

    aget-object v5, v5, v8

    .line 1161
    iget-wide v0, v5, Lcom/saterskog/cell_lab/Cell;->b:D

    move-wide/from16 v18, v0

    .line 1162
    iget-wide v0, v5, Lcom/saterskog/cell_lab/Cell;->c:D

    move-wide/from16 v20, v0

    .line 1163
    sub-double v8, v24, v18

    sub-double v10, v24, v18

    mul-double/2addr v8, v10

    sub-double v10, v26, v20

    sub-double v12, v26, v20

    mul-double/2addr v10, v12

    add-double/2addr v8, v10

    .line 1164
    iget-wide v10, v5, Lcom/saterskog/cell_lab/Cell;->d:D

    .line 1166
    invoke-static {v8, v9}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v8

    .line 1167
    mul-double v12, v8, v8

    mul-double/2addr v10, v10

    sub-double v10, v12, v10

    mul-double/2addr v6, v6

    add-double/2addr v6, v10

    const-wide/high16 v10, 0x4000000000000000L    # 2.0

    mul-double/2addr v10, v8

    div-double/2addr v6, v10

    .line 1168
    sub-double v10, v18, v24

    div-double v12, v10, v8

    .line 1169
    sub-double v10, v20, v26

    div-double/2addr v10, v8

    .line 1170
    mul-double v16, v6, v12

    .line 1171
    mul-double v14, v6, v10

    .line 1172
    iget-wide v0, v5, Lcom/saterskog/cell_lab/Cell;->g:D

    move-wide/from16 v28, v0

    iget-wide v0, v5, Lcom/saterskog/cell_lab/Cell;->j:D

    move-wide/from16 v30, v0

    add-double v26, v26, v14

    sub-double v20, v26, v20

    mul-double v20, v20, v30

    sub-double v20, v28, v20

    .line 1173
    iget-wide v0, v5, Lcom/saterskog/cell_lab/Cell;->h:D

    move-wide/from16 v26, v0

    iget-wide v0, v5, Lcom/saterskog/cell_lab/Cell;->j:D

    move-wide/from16 v28, v0

    add-double v24, v24, v16

    sub-double v18, v24, v18

    mul-double v18, v18, v28

    add-double v18, v18, v26

    goto/16 :goto_1

    .line 1191
    :cond_6
    const/4 v14, 0x0

    goto/16 :goto_2

    .line 1194
    :cond_7
    const-wide/16 v14, 0x0

    const-wide v24, 0x3fb3333333333333L    # 0.075

    mul-double v16, v16, v24

    const/16 v23, 0x4

    const/16 v24, 0x0

    invoke-virtual/range {v22 .. v24}, Lcom/saterskog/cell_lab/Cell;->a(II)F

    move-result v23

    move/from16 v0, v23

    float-to-double v0, v0

    move-wide/from16 v24, v0

    mul-double v16, v16, v24

    add-double v14, v14, v16

    goto/16 :goto_3

    .line 1204
    :cond_8
    const/16 v16, 0x0

    goto/16 :goto_4

    .line 1207
    :cond_9
    const-wide v16, 0x3fb3333333333333L    # 0.075

    mul-double v16, v16, v24

    const/16 v23, 0x4

    const/16 v24, 0x0

    move/from16 v0, v23

    move/from16 v1, v24

    invoke-virtual {v5, v0, v1}, Lcom/saterskog/cell_lab/Cell;->a(II)F

    move-result v23

    move/from16 v0, v23

    float-to-double v0, v0

    move-wide/from16 v24, v0

    mul-double v16, v16, v24

    add-double v14, v14, v16

    goto/16 :goto_5

    .line 1221
    :cond_a
    iget-wide v14, v5, Lcom/saterskog/cell_lab/Cell;->w:D

    iget-wide v0, v5, Lcom/saterskog/cell_lab/Cell;->d:D

    move-wide/from16 v16, v0

    mul-double v14, v14, v16

    iget-wide v0, v5, Lcom/saterskog/cell_lab/Cell;->d:D

    move-wide/from16 v16, v0

    mul-double v14, v14, v16

    const-wide v16, 0x3fe6666666666666L    # 0.7

    mul-double v14, v14, v16

    .line 1222
    const-wide/high16 v16, 0x3ff0000000000000L    # 1.0

    const-wide/high16 v26, 0x3ff0000000000000L    # 1.0

    move-object/from16 v0, v22

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->w:D

    move-wide/from16 v28, v0

    div-double v26, v26, v28

    const-wide/high16 v28, 0x3ff0000000000000L    # 1.0

    iget-wide v0, v5, Lcom/saterskog/cell_lab/Cell;->w:D

    move-wide/from16 v30, v0

    div-double v28, v28, v30

    add-double v26, v26, v28

    const-wide/high16 v28, 0x3ff0000000000000L    # 1.0

    mul-double v30, v6, v6

    div-double v30, v30, v24

    sub-double v32, v8, v6

    sub-double v34, v8, v6

    mul-double v32, v32, v34

    div-double v32, v32, v14

    add-double v30, v30, v32

    mul-double v28, v28, v30

    add-double v26, v26, v28

    div-double v16, v16, v26

    const-wide v26, 0x3f947ae147ae147bL    # 0.02

    div-double v16, v16, v26

    const-wide v26, 0x3feccccccccccccdL    # 0.9

    mul-double v16, v16, v26

    goto/16 :goto_6

    .line 1239
    :cond_b
    return-void
.end method

.method private h(D)V
    .locals 11

    .prologue
    const/4 v10, 0x3

    const/4 v9, 0x2

    const/4 v8, 0x1

    const/4 v1, 0x0

    .line 2756
    move v0, v1

    :goto_0
    iget v2, p0, Lcom/saterskog/cell_lab/CellWorld;->C:I

    if-ge v0, v2, :cond_1

    .line 2758
    iget-object v2, p0, Lcom/saterskog/cell_lab/CellWorld;->y:[Lcom/saterskog/cell_lab/e;

    aget-object v2, v2, v0

    iget-wide v4, v2, Lcom/saterskog/cell_lab/e;->d:D

    const-wide/high16 v6, 0x3fe0000000000000L    # 0.5

    mul-double/2addr v6, p1

    add-double/2addr v4, v6

    iput-wide v4, v2, Lcom/saterskog/cell_lab/e;->d:D

    .line 2759
    iget-object v2, p0, Lcom/saterskog/cell_lab/CellWorld;->y:[Lcom/saterskog/cell_lab/e;

    aget-object v2, v2, v0

    iget-wide v2, v2, Lcom/saterskog/cell_lab/e;->c:D

    const-wide v4, 0x3f9eb851eb851eb8L    # 0.03

    div-double/2addr v2, v4

    .line 2760
    iget-object v4, p0, Lcom/saterskog/cell_lab/CellWorld;->y:[Lcom/saterskog/cell_lab/e;

    aget-object v4, v4, v0

    iget-wide v4, v4, Lcom/saterskog/cell_lab/e;->d:D

    const-wide/high16 v6, 0x3ff0000000000000L    # 1.0

    mul-double/2addr v6, v2

    mul-double/2addr v2, v6

    cmpl-double v2, v4, v2

    if-lez v2, :cond_0

    .line 2762
    iget-object v2, p0, Lcom/saterskog/cell_lab/CellWorld;->y:[Lcom/saterskog/cell_lab/e;

    aget-object v2, v2, v0

    iget-object v3, p0, Lcom/saterskog/cell_lab/CellWorld;->y:[Lcom/saterskog/cell_lab/e;

    iget v4, p0, Lcom/saterskog/cell_lab/CellWorld;->C:I

    add-int/lit8 v4, v4, -0x1

    aget-object v3, v3, v4

    .line 50020
    iget-wide v4, v3, Lcom/saterskog/cell_lab/e;->a:D

    iput-wide v4, v2, Lcom/saterskog/cell_lab/e;->a:D

    .line 50021
    iget-wide v4, v3, Lcom/saterskog/cell_lab/e;->b:D

    iput-wide v4, v2, Lcom/saterskog/cell_lab/e;->b:D

    .line 50022
    iget-wide v4, v3, Lcom/saterskog/cell_lab/e;->c:D

    iput-wide v4, v2, Lcom/saterskog/cell_lab/e;->c:D

    .line 50023
    iget-wide v4, v3, Lcom/saterskog/cell_lab/e;->d:D

    iput-wide v4, v2, Lcom/saterskog/cell_lab/e;->d:D

    .line 50024
    iget-object v4, v2, Lcom/saterskog/cell_lab/e;->e:[F

    iget-object v5, v3, Lcom/saterskog/cell_lab/e;->e:[F

    aget v5, v5, v1

    aput v5, v4, v1

    .line 50025
    iget-object v4, v2, Lcom/saterskog/cell_lab/e;->e:[F

    iget-object v5, v3, Lcom/saterskog/cell_lab/e;->e:[F

    aget v5, v5, v8

    aput v5, v4, v8

    .line 50026
    iget-object v4, v2, Lcom/saterskog/cell_lab/e;->e:[F

    iget-object v5, v3, Lcom/saterskog/cell_lab/e;->e:[F

    aget v5, v5, v9

    aput v5, v4, v9

    .line 50027
    iget-object v2, v2, Lcom/saterskog/cell_lab/e;->e:[F

    iget-object v3, v3, Lcom/saterskog/cell_lab/e;->e:[F

    aget v3, v3, v10

    aput v3, v2, v10

    .line 2763
    iget v2, p0, Lcom/saterskog/cell_lab/CellWorld;->C:I

    add-int/lit8 v2, v2, -0x1

    iput v2, p0, Lcom/saterskog/cell_lab/CellWorld;->C:I

    .line 2764
    add-int/lit8 v0, v0, -0x1

    .line 2756
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 2767
    :cond_1
    return-void
.end method

.method private i()V
    .locals 22

    .prologue
    .line 2067
    const/4 v2, 0x0

    :goto_0
    move-object/from16 v0, p0

    iget v3, v0, Lcom/saterskog/cell_lab/CellWorld;->z:I

    if-ge v2, v3, :cond_11

    .line 2068
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    aget-object v6, v3, v2

    .line 2069
    const/4 v3, 0x0

    iput v3, v6, Lcom/saterskog/cell_lab/Cell;->B:I

    .line 2070
    const/4 v3, 0x0

    move v10, v3

    :goto_1
    const/4 v3, 0x4

    if-ge v10, v3, :cond_10

    .line 2071
    const/4 v3, -0x1

    .line 2072
    if-nez v10, :cond_0

    .line 2073
    iget v3, v6, Lcom/saterskog/cell_lab/Cell;->K:I

    .line 2074
    :cond_0
    const/4 v4, 0x1

    if-ne v10, v4, :cond_1

    .line 2075
    iget v3, v6, Lcom/saterskog/cell_lab/Cell;->L:I

    .line 2076
    :cond_1
    const/4 v4, 0x2

    if-ne v10, v4, :cond_2

    .line 2077
    iget v3, v6, Lcom/saterskog/cell_lab/Cell;->M:I

    .line 2078
    :cond_2
    const/4 v4, 0x3

    if-ne v10, v4, :cond_13

    .line 2079
    iget v3, v6, Lcom/saterskog/cell_lab/Cell;->N:I

    move v9, v3

    .line 2080
    :goto_2
    const/4 v3, -0x1

    if-eq v9, v3, :cond_f

    .line 2082
    const/4 v3, 0x0

    :goto_3
    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/saterskog/cell_lab/CellWorld;->aW:[I

    aget v4, v4, v9

    if-ge v3, v4, :cond_f

    .line 2083
    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/saterskog/cell_lab/CellWorld;->aV:[[I

    aget-object v4, v4, v9

    aget v4, v4, v3

    .line 2084
    if-le v4, v2, :cond_e

    .line 2086
    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    aget-object v5, v5, v4

    .line 2087
    iget-wide v12, v6, Lcom/saterskog/cell_lab/Cell;->b:D

    iget-wide v14, v5, Lcom/saterskog/cell_lab/Cell;->b:D

    sub-double/2addr v12, v14

    iget-wide v14, v6, Lcom/saterskog/cell_lab/Cell;->b:D

    iget-wide v0, v5, Lcom/saterskog/cell_lab/Cell;->b:D

    move-wide/from16 v16, v0

    sub-double v14, v14, v16

    mul-double/2addr v12, v14

    iget-wide v14, v6, Lcom/saterskog/cell_lab/Cell;->c:D

    iget-wide v0, v5, Lcom/saterskog/cell_lab/Cell;->c:D

    move-wide/from16 v16, v0

    sub-double v14, v14, v16

    iget-wide v0, v6, Lcom/saterskog/cell_lab/Cell;->c:D

    move-wide/from16 v16, v0

    iget-wide v0, v5, Lcom/saterskog/cell_lab/Cell;->c:D

    move-wide/from16 v18, v0

    sub-double v16, v16, v18

    mul-double v14, v14, v16

    add-double/2addr v12, v14

    .line 2088
    iget-wide v14, v6, Lcom/saterskog/cell_lab/Cell;->d:D

    .line 2089
    iget-wide v0, v5, Lcom/saterskog/cell_lab/Cell;->d:D

    move-wide/from16 v16, v0

    .line 2090
    add-double v18, v14, v16

    .line 2091
    mul-double v18, v18, v18

    cmpg-double v4, v12, v18

    if-gez v4, :cond_e

    const-wide/16 v18, 0x0

    cmpl-double v4, v12, v18

    if-eqz v4, :cond_e

    .line 2092
    mul-double/2addr v14, v14

    mul-double v16, v16, v16

    sub-double v14, v14, v16

    .line 2099
    cmpl-double v4, v14, v12

    if-lez v4, :cond_3

    .line 2100
    const/4 v4, 0x1

    iput-boolean v4, v5, Lcom/saterskog/cell_lab/Cell;->x:Z

    .line 2103
    :cond_3
    neg-double v0, v14

    move-wide/from16 v16, v0

    cmpl-double v4, v16, v12

    if-lez v4, :cond_4

    .line 2104
    const/4 v4, 0x1

    iput-boolean v4, v6, Lcom/saterskog/cell_lab/Cell;->x:Z

    .line 2106
    :cond_4
    const/4 v8, 0x0

    .line 2107
    const/4 v7, 0x0

    const/4 v4, 0x0

    .line 2108
    sget-wide v16, Lcom/saterskog/cell_lab/Cell;->a:D

    sget-wide v18, Lcom/saterskog/cell_lab/Cell;->a:D

    mul-double v16, v16, v18

    const-wide v18, 0x3f847ae147ae147bL    # 0.01

    mul-double v16, v16, v18

    sub-double v16, v12, v16

    cmpl-double v11, v14, v16

    if-lez v11, :cond_6

    .line 2109
    iget-object v11, v6, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    iget v0, v6, Lcom/saterskog/cell_lab/Cell;->D:I

    move/from16 v16, v0

    aget-object v11, v11, v16

    iget-object v11, v11, Lcom/saterskog/cell_lab/Gene;->s:Lcom/saterskog/cell_lab/h;

    sget-object v16, Lcom/saterskog/cell_lab/h;->q:Lcom/saterskog/cell_lab/h;

    move-object/from16 v0, v16

    if-ne v11, v0, :cond_6

    iget-object v11, v5, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    iget v0, v5, Lcom/saterskog/cell_lab/Cell;->D:I

    move/from16 v16, v0

    aget-object v11, v11, v16

    iget-object v11, v11, Lcom/saterskog/cell_lab/Gene;->s:Lcom/saterskog/cell_lab/h;

    sget-object v16, Lcom/saterskog/cell_lab/h;->q:Lcom/saterskog/cell_lab/h;

    move-object/from16 v0, v16

    if-ne v11, v0, :cond_6

    iget-wide v0, v6, Lcom/saterskog/cell_lab/Cell;->o:D

    move-wide/from16 v16, v0

    const-wide/high16 v18, 0x3fe0000000000000L    # 0.5

    cmpl-double v11, v16, v18

    if-lez v11, :cond_6

    iget-wide v0, v5, Lcom/saterskog/cell_lab/Cell;->o:D

    move-wide/from16 v16, v0

    const-wide/high16 v18, 0x3fe0000000000000L    # 0.5

    cmpl-double v11, v16, v18

    if-lez v11, :cond_6

    .line 2110
    const/4 v4, 0x1

    .line 2111
    cmpl-double v7, v14, v12

    if-gtz v7, :cond_5

    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/saterskog/cell_lab/CellWorld;->Y:Lcom/saterskog/b/d;

    .line 25017
    const/4 v8, 0x2

    invoke-virtual {v7, v8}, Lcom/saterskog/b/d;->nextInt(I)I

    move-result v7

    .line 2111
    if-nez v7, :cond_c

    :cond_5
    move-object v7, v5

    move v8, v4

    move-object v4, v6

    .line 2122
    :cond_6
    :goto_4
    neg-double v0, v14

    move-wide/from16 v16, v0

    sget-wide v18, Lcom/saterskog/cell_lab/Cell;->a:D

    sget-wide v20, Lcom/saterskog/cell_lab/Cell;->a:D

    mul-double v18, v18, v20

    const-wide v20, 0x3f847ae147ae147bL    # 0.01

    mul-double v18, v18, v20

    sub-double v18, v12, v18

    cmpl-double v11, v16, v18

    if-lez v11, :cond_12

    .line 2123
    iget-object v11, v6, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    iget v0, v6, Lcom/saterskog/cell_lab/Cell;->D:I

    move/from16 v16, v0

    aget-object v11, v11, v16

    iget-object v11, v11, Lcom/saterskog/cell_lab/Gene;->s:Lcom/saterskog/cell_lab/h;

    sget-object v16, Lcom/saterskog/cell_lab/h;->q:Lcom/saterskog/cell_lab/h;

    move-object/from16 v0, v16

    if-ne v11, v0, :cond_12

    iget-object v11, v5, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    iget v0, v5, Lcom/saterskog/cell_lab/Cell;->D:I

    move/from16 v16, v0

    aget-object v11, v11, v16

    iget-object v11, v11, Lcom/saterskog/cell_lab/Gene;->s:Lcom/saterskog/cell_lab/h;

    sget-object v16, Lcom/saterskog/cell_lab/h;->q:Lcom/saterskog/cell_lab/h;

    move-object/from16 v0, v16

    if-ne v11, v0, :cond_12

    iget-wide v0, v6, Lcom/saterskog/cell_lab/Cell;->o:D

    move-wide/from16 v16, v0

    const-wide/high16 v18, 0x3fe0000000000000L    # 0.5

    cmpl-double v11, v16, v18

    if-lez v11, :cond_12

    iget-wide v0, v5, Lcom/saterskog/cell_lab/Cell;->o:D

    move-wide/from16 v16, v0

    const-wide/high16 v18, 0x3fe0000000000000L    # 0.5

    cmpl-double v11, v16, v18

    if-lez v11, :cond_12

    .line 2124
    const/4 v8, 0x1

    .line 2125
    neg-double v14, v14

    cmpl-double v4, v14, v12

    if-gtz v4, :cond_7

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/saterskog/cell_lab/CellWorld;->Y:Lcom/saterskog/b/d;

    .line 26017
    const/4 v7, 0x2

    invoke-virtual {v4, v7}, Lcom/saterskog/b/d;->nextInt(I)I

    move-result v4

    .line 2125
    if-nez v4, :cond_d

    :cond_7
    move-object v7, v6

    .line 2137
    :goto_5
    if-eqz v8, :cond_e

    .line 2139
    const/4 v4, 0x1

    iput-boolean v4, v7, Lcom/saterskog/cell_lab/Cell;->x:Z

    .line 2140
    const-wide/16 v12, 0x0

    iput-wide v12, v5, Lcom/saterskog/cell_lab/Cell;->o:D

    .line 2141
    iget-wide v12, v5, Lcom/saterskog/cell_lab/Cell;->w:D

    iget-wide v14, v7, Lcom/saterskog/cell_lab/Cell;->w:D

    add-double/2addr v12, v14

    iput-wide v12, v5, Lcom/saterskog/cell_lab/Cell;->w:D

    .line 2142
    const-wide/16 v12, 0x0

    iput-wide v12, v7, Lcom/saterskog/cell_lab/Cell;->w:D

    .line 2143
    sget-object v4, Lcom/saterskog/cell_lab/Gene;->B:[I

    const/16 v8, 0xa

    invoke-virtual {v5, v8}, Lcom/saterskog/cell_lab/Cell;->b(I)I

    move-result v8

    aget v4, v4, v8

    iput v4, v5, Lcom/saterskog/cell_lab/Cell;->T:I

    .line 2145
    iget-wide v12, v5, Lcom/saterskog/cell_lab/Cell;->p:D

    iget-wide v14, v7, Lcom/saterskog/cell_lab/Cell;->p:D

    add-double/2addr v12, v14

    iput-wide v12, v5, Lcom/saterskog/cell_lab/Cell;->p:D

    .line 2147
    const/4 v4, 0x0

    invoke-virtual {v5, v4}, Lcom/saterskog/cell_lab/Cell;->b(I)I

    move-result v4

    iput v4, v5, Lcom/saterskog/cell_lab/Cell;->D:I

    .line 2149
    iget v4, v7, Lcom/saterskog/cell_lab/Cell;->E:I

    iget v8, v5, Lcom/saterskog/cell_lab/Cell;->E:I

    if-eq v4, v8, :cond_8

    .line 2150
    const/4 v4, 0x6

    iput v4, v5, Lcom/saterskog/cell_lab/Cell;->E:I

    .line 2153
    :cond_8
    iget-wide v12, v5, Lcom/saterskog/cell_lab/Cell;->w:D

    const-wide v14, 0x3fd70a3d70a3d70aL    # 0.36

    cmpl-double v4, v12, v14

    if-lez v4, :cond_9

    const-wide v12, 0x3fd70a3d70a3d70aL    # 0.36

    iput-wide v12, v5, Lcom/saterskog/cell_lab/Cell;->w:D

    .line 2154
    :cond_9
    iget-wide v12, v5, Lcom/saterskog/cell_lab/Cell;->p:D

    const-wide/high16 v14, 0x3ff0000000000000L    # 1.0

    cmpl-double v4, v12, v14

    if-lez v4, :cond_a

    const-wide/high16 v12, 0x3ff0000000000000L    # 1.0

    iput-wide v12, v5, Lcom/saterskog/cell_lab/Cell;->p:D

    .line 2155
    :cond_a
    const/4 v4, 0x0

    :goto_6
    const/16 v8, 0x50

    if-ge v4, v8, :cond_e

    .line 2157
    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/saterskog/cell_lab/CellWorld;->Y:Lcom/saterskog/b/d;

    .line 27017
    const/4 v11, 0x2

    invoke-virtual {v8, v11}, Lcom/saterskog/b/d;->nextInt(I)I

    move-result v8

    .line 2157
    const/4 v11, 0x1

    if-ne v8, v11, :cond_b

    iget-object v8, v5, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    aget-object v8, v8, v4

    iget-object v11, v7, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    aget-object v11, v11, v4

    invoke-virtual {v8, v11}, Lcom/saterskog/cell_lab/Gene;->a(Lcom/saterskog/cell_lab/Gene;)V

    .line 2155
    :cond_b
    add-int/lit8 v4, v4, 0x1

    goto :goto_6

    :cond_c
    move-object v7, v6

    move v8, v4

    move-object v4, v5

    .line 2118
    goto/16 :goto_4

    :cond_d
    move-object v7, v5

    move-object v5, v6

    .line 2132
    goto :goto_5

    .line 2082
    :cond_e
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_3

    .line 2070
    :cond_f
    add-int/lit8 v3, v10, 0x1

    move v10, v3

    goto/16 :goto_1

    .line 2067
    :cond_10
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    .line 2164
    :cond_11
    return-void

    :cond_12
    move-object v5, v4

    goto/16 :goto_5

    :cond_13
    move v9, v3

    goto/16 :goto_2
.end method

.method private i(D)V
    .locals 19

    .prologue
    .line 2801
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/CellWorld;->Y:Lcom/saterskog/b/d;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v4, v3, Lcom/saterskog/cell_lab/Environment;->a:D

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v6, v3, Lcom/saterskog/cell_lab/Environment;->k:D

    mul-double/2addr v4, v6

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v6, v3, Lcom/saterskog/cell_lab/Environment;->k:D

    mul-double/2addr v4, v6

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v6, v3, Lcom/saterskog/cell_lab/Environment;->b:D

    div-double/2addr v4, v6

    const-wide/high16 v6, 0x3ff0000000000000L    # 1.0

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v8, v3, Lcom/saterskog/cell_lab/Environment;->p:D

    add-double/2addr v6, v8

    div-double/2addr v4, v6

    mul-double v4, v4, p1

    invoke-virtual {v2, v4, v5}, Lcom/saterskog/b/d;->a(D)I

    move-result v13

    .line 2802
    const/4 v2, 0x0

    move v12, v2

    :goto_0
    if-ge v12, v13, :cond_3

    .line 2805
    :cond_0
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/CellWorld;->Y:Lcom/saterskog/b/d;

    invoke-virtual {v2}, Lcom/saterskog/b/d;->b()D

    move-result-wide v2

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v4, v4, Lcom/saterskog/cell_lab/Environment;->k:D

    mul-double v14, v2, v4

    .line 2806
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/CellWorld;->Y:Lcom/saterskog/b/d;

    invoke-virtual {v2}, Lcom/saterskog/b/d;->b()D

    move-result-wide v2

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v4, v4, Lcom/saterskog/cell_lab/Environment;->k:D

    mul-double v16, v2, v4

    .line 2807
    mul-double v2, v14, v14

    mul-double v4, v16, v16

    add-double/2addr v2, v4

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v4, v4, Lcom/saterskog/cell_lab/Environment;->k:D

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v6, v6, Lcom/saterskog/cell_lab/Environment;->k:D

    mul-double/2addr v4, v6

    cmpl-double v2, v2, v4

    if-gtz v2, :cond_0

    .line 2808
    const/4 v2, 0x1

    .line 2809
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v4, v3, Lcom/saterskog/cell_lab/Environment;->p:D

    const-wide/16 v6, 0x0

    cmpl-double v3, v4, v6

    if-lez v3, :cond_1

    .line 2810
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/CellWorld;->Y:Lcom/saterskog/b/d;

    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v6, v3, Lcom/saterskog/cell_lab/Environment;->p:D

    add-double/2addr v4, v6

    invoke-virtual {v2, v4, v5}, Lcom/saterskog/b/d;->a(D)I

    move-result v2

    .line 2811
    :cond_1
    const/4 v3, 0x0

    move v11, v3

    :goto_1
    if-ge v11, v2, :cond_2

    .line 2812
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/saterskog/cell_lab/CellWorld;->Y:Lcom/saterskog/b/d;

    .line 50030
    invoke-virtual {v3}, Lcom/saterskog/b/d;->nextGaussian()D

    move-result-wide v4

    .line 2812
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v6, v3, Lcom/saterskog/cell_lab/Environment;->q:D

    mul-double/2addr v4, v6

    add-double/2addr v4, v14

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/saterskog/cell_lab/CellWorld;->Y:Lcom/saterskog/b/d;

    .line 50031
    invoke-virtual {v3}, Lcom/saterskog/b/d;->nextGaussian()D

    move-result-wide v6

    .line 2812
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v8, v3, Lcom/saterskog/cell_lab/Environment;->q:D

    mul-double/2addr v6, v8

    add-double v6, v6, v16

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v8, v3, Lcom/saterskog/cell_lab/Environment;->b:D

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget v10, v3, Lcom/saterskog/cell_lab/Environment;->o:F

    move-object/from16 v3, p0

    invoke-virtual/range {v3 .. v10}, Lcom/saterskog/cell_lab/CellWorld;->a(DDDF)V

    .line 2811
    add-int/lit8 v3, v11, 0x1

    move v11, v3

    goto :goto_1

    .line 2802
    :cond_2
    add-int/lit8 v2, v12, 0x1

    move v12, v2

    goto/16 :goto_0

    .line 2815
    :cond_3
    return-void
.end method

.method private j()V
    .locals 12

    .prologue
    const/4 v3, 0x1

    const/4 v1, 0x0

    .line 2584
    move v0, v1

    :goto_0
    iget v2, p0, Lcom/saterskog/cell_lab/CellWorld;->z:I

    if-ge v0, v2, :cond_2

    .line 2585
    iget-object v2, p0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    aget-object v4, v2, v0

    .line 2587
    iget-wide v6, v4, Lcom/saterskog/cell_lab/Cell;->b:D

    iget-wide v8, v4, Lcom/saterskog/cell_lab/Cell;->b:D

    mul-double/2addr v6, v8

    iget-wide v8, v4, Lcom/saterskog/cell_lab/Cell;->c:D

    iget-wide v10, v4, Lcom/saterskog/cell_lab/Cell;->c:D

    mul-double/2addr v8, v10

    add-double/2addr v6, v8

    iget-object v2, p0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v8, v2, Lcom/saterskog/cell_lab/Environment;->k:D

    iget-object v2, p0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v10, v2, Lcom/saterskog/cell_lab/Environment;->k:D

    mul-double/2addr v8, v10

    cmpl-double v2, v6, v8

    if-ltz v2, :cond_3

    .line 2588
    iput-boolean v3, v4, Lcom/saterskog/cell_lab/Cell;->x:Z

    move v2, v3

    .line 2592
    :goto_1
    iget-boolean v4, v4, Lcom/saterskog/cell_lab/Cell;->x:Z

    if-eqz v4, :cond_0

    .line 2593
    if-nez v2, :cond_1

    iget-boolean v2, p0, Lcom/saterskog/cell_lab/CellWorld;->bg:Z

    if-nez v2, :cond_1

    move v2, v3

    :goto_2
    invoke-virtual {p0, v0, v2}, Lcom/saterskog/cell_lab/CellWorld;->a(IZ)V

    .line 2594
    add-int/lit8 v0, v0, -0x1

    .line 2584
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    move v2, v1

    .line 2593
    goto :goto_2

    .line 2597
    :cond_2
    return-void

    :cond_3
    move v2, v1

    goto :goto_1
.end method

.method private k()V
    .locals 10

    .prologue
    const/4 v0, 0x0

    .line 2769
    iget-object v1, p0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-boolean v1, v1, Lcom/saterskog/cell_lab/Environment;->w:Z

    if-eqz v1, :cond_1

    .line 2771
    iget-object v1, p0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-object v2, v1, Lcom/saterskog/cell_lab/Environment;->t:[Z

    array-length v3, v2

    move v1, v0

    :goto_0
    if-ge v1, v3, :cond_0

    aget-boolean v4, v2, v1

    .line 2773
    if-eqz v4, :cond_2

    const/4 v0, 0x1

    .line 2775
    :cond_0
    if-nez v0, :cond_3

    .line 2794
    :cond_1
    :goto_1
    return-void

    .line 2771
    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 2776
    :cond_3
    :goto_2
    iget v0, p0, Lcom/saterskog/cell_lab/CellWorld;->z:I

    iget v1, p0, Lcom/saterskog/cell_lab/CellWorld;->ab:I

    if-ge v0, v1, :cond_5

    .line 2779
    :cond_4
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->Y:Lcom/saterskog/b/d;

    invoke-virtual {v0}, Lcom/saterskog/b/d;->b()D

    move-result-wide v0

    iget-object v2, p0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v2, v2, Lcom/saterskog/cell_lab/Environment;->k:D

    mul-double/2addr v0, v2

    .line 2780
    iget-object v2, p0, Lcom/saterskog/cell_lab/CellWorld;->Y:Lcom/saterskog/b/d;

    invoke-virtual {v2}, Lcom/saterskog/b/d;->b()D

    move-result-wide v2

    iget-object v4, p0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v4, v4, Lcom/saterskog/cell_lab/Environment;->k:D

    mul-double/2addr v2, v4

    .line 2781
    mul-double v4, v0, v0

    mul-double v6, v2, v2

    add-double/2addr v4, v6

    iget-object v6, p0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v6, v6, Lcom/saterskog/cell_lab/Environment;->k:D

    iget-object v8, p0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v8, v8, Lcom/saterskog/cell_lab/Environment;->k:D

    mul-double/2addr v6, v8

    cmpl-double v4, v4, v6

    if-gtz v4, :cond_4

    .line 2782
    invoke-direct {p0, v0, v1, v2, v3}, Lcom/saterskog/cell_lab/CellWorld;->b(DD)V

    goto :goto_2

    .line 2784
    :cond_5
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->Y:Lcom/saterskog/b/d;

    .line 50029
    const/16 v1, 0xf

    invoke-virtual {v0, v1}, Lcom/saterskog/b/d;->nextInt(I)I

    move-result v0

    .line 2784
    if-nez v0, :cond_1

    .line 2787
    :cond_6
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->Y:Lcom/saterskog/b/d;

    invoke-virtual {v0}, Lcom/saterskog/b/d;->b()D

    move-result-wide v0

    iget-object v2, p0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v2, v2, Lcom/saterskog/cell_lab/Environment;->k:D

    mul-double/2addr v0, v2

    .line 2788
    iget-object v2, p0, Lcom/saterskog/cell_lab/CellWorld;->Y:Lcom/saterskog/b/d;

    invoke-virtual {v2}, Lcom/saterskog/b/d;->b()D

    move-result-wide v2

    iget-object v4, p0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v4, v4, Lcom/saterskog/cell_lab/Environment;->k:D

    mul-double/2addr v2, v4

    .line 2789
    mul-double v4, v0, v0

    mul-double v6, v2, v2

    add-double/2addr v4, v6

    iget-object v6, p0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v6, v6, Lcom/saterskog/cell_lab/Environment;->k:D

    iget-object v8, p0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v8, v8, Lcom/saterskog/cell_lab/Environment;->k:D

    mul-double/2addr v6, v8

    cmpl-double v4, v4, v6

    if-gtz v4, :cond_6

    .line 2790
    invoke-direct {p0, v0, v1, v2, v3}, Lcom/saterskog/cell_lab/CellWorld;->b(DD)V

    goto :goto_1
.end method

.method private l()V
    .locals 29

    .prologue
    .line 2818
    move-object/from16 v0, p0

    iget-boolean v2, v0, Lcom/saterskog/cell_lab/CellWorld;->L:Z

    if-nez v2, :cond_1

    .line 2820
    const-string v2, "ctdextras:Tried to construct primitives for not yet calculated geometry"

    invoke-static {v2}, Lcom/saterskog/b/a;->b(Ljava/lang/String;)V

    .line 3075
    :cond_0
    return-void

    .line 2824
    :cond_1
    sget-object v2, Lcom/saterskog/cell_lab/h;->B:[Lcom/saterskog/cell_lab/h;

    array-length v8, v2

    .line 2825
    move-object/from16 v0, p0

    iget-boolean v2, v0, Lcom/saterskog/cell_lab/CellWorld;->bg:Z

    if-eqz v2, :cond_2

    const/4 v2, 0x1

    :goto_0
    add-int v9, v8, v2

    .line 2826
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/CellWorld;->aw:[I

    add-int/lit8 v3, v9, -0x1

    aget v2, v2, v3

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/saterskog/cell_lab/CellWorld;->av:[I

    add-int/lit8 v4, v9, -0x1

    aget v3, v3, v4

    add-int/2addr v3, v2

    .line 2828
    const/4 v2, 0x0

    move v7, v2

    :goto_1
    if-ge v7, v8, :cond_0

    .line 2830
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/CellWorld;->D:[[I

    aget-object v10, v2, v7

    .line 2831
    sget-object v2, Lcom/saterskog/cell_lab/h;->B:[Lcom/saterskog/cell_lab/h;

    aget-object v11, v2, v7

    .line 2832
    iget v2, v11, Lcom/saterskog/cell_lab/h;->y:I

    const/4 v4, -0x1

    if-ne v2, v4, :cond_3

    .line 2834
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/CellWorld;->aw:[I

    add-int v4, v9, v7

    aput v3, v2, v4

    .line 2835
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/CellWorld;->av:[I

    add-int v4, v9, v7

    const/4 v5, 0x0

    aput v5, v2, v4

    .line 2828
    :goto_2
    add-int/lit8 v2, v7, 0x1

    move v7, v2

    goto :goto_1

    .line 2825
    :cond_2
    const/4 v2, 0x0

    goto :goto_0

    .line 2843
    :cond_3
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/CellWorld;->aw:[I

    add-int v4, v9, v7

    aput v3, v2, v4

    .line 2844
    iget-boolean v2, v11, Lcom/saterskog/cell_lab/h;->t:Z

    if-eqz v2, :cond_4

    .line 2847
    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    iget-wide v12, v11, Lcom/saterskog/cell_lab/h;->A:D

    const-wide v14, 0x4040aaaaaaaaaaabL    # 33.333333333333336

    mul-double/2addr v12, v14

    div-double/2addr v4, v12

    .line 2848
    const-wide/high16 v12, 0x3ff0000000000000L    # 1.0

    mul-double v14, v4, v4

    sub-double/2addr v12, v14

    invoke-static {v12, v13}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v12

    .line 2850
    const/4 v2, 0x0

    :goto_3
    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/saterskog/cell_lab/CellWorld;->E:[I

    aget v6, v6, v7

    if-ge v2, v6, :cond_b

    .line 2852
    aget v6, v10, v2

    .line 2854
    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    aget-object v6, v14, v6

    .line 2856
    iget-object v14, v6, Lcom/saterskog/cell_lab/Cell;->J:[F

    const/4 v15, 0x0

    aget v14, v14, v15

    iget v15, v6, Lcom/saterskog/cell_lab/Cell;->X:F

    const v16, 0x3dcccccd    # 0.1f

    mul-float v15, v15, v16

    add-float/2addr v14, v15

    .line 2857
    iget-object v15, v6, Lcom/saterskog/cell_lab/Cell;->J:[F

    const/16 v16, 0x1

    aget v15, v15, v16

    iget v0, v6, Lcom/saterskog/cell_lab/Cell;->Y:F

    move/from16 v16, v0

    add-float v15, v15, v16

    .line 2858
    iget-object v0, v6, Lcom/saterskog/cell_lab/Cell;->J:[F

    move-object/from16 v16, v0

    const/16 v17, 0x2

    aget v16, v16, v17

    .line 2865
    iget-wide v0, v6, Lcom/saterskog/cell_lab/Cell;->k:D

    move-wide/from16 v18, v0

    invoke-static/range {v18 .. v19}, Ljava/lang/Math;->sin(D)D

    move-result-wide v18

    iget-wide v0, v6, Lcom/saterskog/cell_lab/Cell;->d:D

    move-wide/from16 v20, v0

    mul-double v18, v18, v20

    .line 2866
    iget-wide v0, v6, Lcom/saterskog/cell_lab/Cell;->k:D

    move-wide/from16 v20, v0

    invoke-static/range {v20 .. v21}, Ljava/lang/Math;->cos(D)D

    move-result-wide v20

    iget-wide v0, v6, Lcom/saterskog/cell_lab/Cell;->d:D

    move-wide/from16 v22, v0

    mul-double v20, v20, v22

    .line 2870
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ad:[F

    move-object/from16 v17, v0

    mul-int/lit8 v22, v3, 0x2

    move-wide/from16 v0, v18

    neg-double v0, v0

    move-wide/from16 v24, v0

    mul-double v24, v24, v12

    mul-double v26, v20, v4

    sub-double v24, v24, v26

    move-wide/from16 v0, v24

    double-to-float v0, v0

    move/from16 v23, v0

    aput v23, v17, v22

    .line 2871
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ad:[F

    move-object/from16 v17, v0

    mul-int/lit8 v22, v3, 0x2

    add-int/lit8 v22, v22, 0x1

    mul-double v24, v20, v12

    mul-double v26, v18, v4

    sub-double v24, v24, v26

    move-wide/from16 v0, v24

    double-to-float v0, v0

    move/from16 v23, v0

    aput v23, v17, v22

    .line 2872
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ad:[F

    move-object/from16 v17, v0

    mul-int/lit8 v22, v3, 0x2

    add-int/lit8 v22, v22, 0x2

    mul-double v24, v18, v12

    mul-double v26, v20, v4

    sub-double v24, v24, v26

    move-wide/from16 v0, v24

    double-to-float v0, v0

    move/from16 v23, v0

    aput v23, v17, v22

    .line 2873
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ad:[F

    move-object/from16 v17, v0

    mul-int/lit8 v22, v3, 0x2

    add-int/lit8 v22, v22, 0x3

    move-wide/from16 v0, v20

    neg-double v0, v0

    move-wide/from16 v24, v0

    mul-double v24, v24, v12

    mul-double v26, v18, v4

    sub-double v24, v24, v26

    move-wide/from16 v0, v24

    double-to-float v0, v0

    move/from16 v23, v0

    aput v23, v17, v22

    .line 2874
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ad:[F

    move-object/from16 v17, v0

    mul-int/lit8 v22, v3, 0x2

    add-int/lit8 v22, v22, 0x4

    iget-wide v0, v11, Lcom/saterskog/cell_lab/h;->A:D

    move-wide/from16 v24, v0

    move-wide/from16 v0, v24

    neg-double v0, v0

    move-wide/from16 v24, v0

    mul-double v20, v20, v24

    const-wide v24, 0x4040aaaaaaaaaaabL    # 33.333333333333336

    mul-double v20, v20, v24

    move-wide/from16 v0, v20

    double-to-float v0, v0

    move/from16 v20, v0

    aput v20, v17, v22

    .line 2875
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ad:[F

    move-object/from16 v17, v0

    mul-int/lit8 v20, v3, 0x2

    add-int/lit8 v20, v20, 0x5

    iget-wide v0, v11, Lcom/saterskog/cell_lab/h;->A:D

    move-wide/from16 v22, v0

    move-wide/from16 v0, v22

    neg-double v0, v0

    move-wide/from16 v22, v0

    mul-double v18, v18, v22

    const-wide v22, 0x4040aaaaaaaaaaabL    # 33.333333333333336

    mul-double v18, v18, v22

    move-wide/from16 v0, v18

    double-to-float v0, v0

    move/from16 v18, v0

    aput v18, v17, v20

    .line 2877
    iget v0, v6, Lcom/saterskog/cell_lab/Cell;->r:F

    move/from16 v17, v0

    .line 2878
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ae:[F

    move-object/from16 v18, v0

    mul-int/lit8 v19, v3, 0x4

    double-to-float v0, v4

    move/from16 v20, v0

    aput v20, v18, v19

    .line 2879
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ae:[F

    move-object/from16 v18, v0

    mul-int/lit8 v19, v3, 0x4

    add-int/lit8 v19, v19, 0x1

    double-to-float v0, v12

    move/from16 v20, v0

    aput v20, v18, v19

    .line 2880
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ae:[F

    move-object/from16 v18, v0

    mul-int/lit8 v19, v3, 0x4

    add-int/lit8 v19, v19, 0x2

    aput v17, v18, v19

    .line 2881
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ae:[F

    move-object/from16 v18, v0

    mul-int/lit8 v19, v3, 0x4

    add-int/lit8 v19, v19, 0x3

    const/16 v20, 0x0

    aput v20, v18, v19

    .line 2883
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ae:[F

    move-object/from16 v18, v0

    mul-int/lit8 v19, v3, 0x4

    add-int/lit8 v19, v19, 0x4

    double-to-float v0, v4

    move/from16 v20, v0

    aput v20, v18, v19

    .line 2884
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ae:[F

    move-object/from16 v18, v0

    mul-int/lit8 v19, v3, 0x4

    add-int/lit8 v19, v19, 0x5

    neg-double v0, v12

    move-wide/from16 v20, v0

    move-wide/from16 v0, v20

    double-to-float v0, v0

    move/from16 v20, v0

    aput v20, v18, v19

    .line 2885
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ae:[F

    move-object/from16 v18, v0

    mul-int/lit8 v19, v3, 0x4

    add-int/lit8 v19, v19, 0x6

    aput v17, v18, v19

    .line 2886
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ae:[F

    move-object/from16 v18, v0

    mul-int/lit8 v19, v3, 0x4

    add-int/lit8 v19, v19, 0x7

    const/16 v20, 0x0

    aput v20, v18, v19

    .line 2888
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ae:[F

    move-object/from16 v18, v0

    mul-int/lit8 v19, v3, 0x4

    add-int/lit8 v19, v19, 0x8

    iget-wide v0, v11, Lcom/saterskog/cell_lab/h;->A:D

    move-wide/from16 v20, v0

    const-wide v22, 0x4040aaaaaaaaaaabL    # 33.333333333333336

    mul-double v20, v20, v22

    move-wide/from16 v0, v20

    double-to-float v0, v0

    move/from16 v20, v0

    aput v20, v18, v19

    .line 2889
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ae:[F

    move-object/from16 v18, v0

    mul-int/lit8 v19, v3, 0x4

    add-int/lit8 v19, v19, 0x9

    const/16 v20, 0x0

    aput v20, v18, v19

    .line 2890
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ae:[F

    move-object/from16 v18, v0

    mul-int/lit8 v19, v3, 0x4

    add-int/lit8 v19, v19, 0xa

    aput v17, v18, v19

    .line 2891
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ae:[F

    move-object/from16 v17, v0

    mul-int/lit8 v18, v3, 0x4

    add-int/lit8 v18, v18, 0xb

    const/16 v19, 0x0

    aput v19, v17, v18

    .line 2893
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ag:[F

    move-object/from16 v17, v0

    mul-int/lit8 v18, v3, 0x4

    aput v14, v17, v18

    .line 2894
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ag:[F

    move-object/from16 v17, v0

    mul-int/lit8 v18, v3, 0x4

    add-int/lit8 v18, v18, 0x1

    aput v15, v17, v18

    .line 2895
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ag:[F

    move-object/from16 v17, v0

    mul-int/lit8 v18, v3, 0x4

    add-int/lit8 v18, v18, 0x2

    aput v16, v17, v18

    .line 2896
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ag:[F

    move-object/from16 v17, v0

    mul-int/lit8 v18, v3, 0x4

    add-int/lit8 v18, v18, 0x3

    iget-wide v0, v6, Lcom/saterskog/cell_lab/Cell;->d:D

    move-wide/from16 v20, v0

    move-wide/from16 v0, v20

    double-to-float v0, v0

    move/from16 v19, v0

    aput v19, v17, v18

    .line 2898
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ag:[F

    move-object/from16 v17, v0

    mul-int/lit8 v18, v3, 0x4

    add-int/lit8 v18, v18, 0x4

    aput v14, v17, v18

    .line 2899
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ag:[F

    move-object/from16 v17, v0

    mul-int/lit8 v18, v3, 0x4

    add-int/lit8 v18, v18, 0x5

    aput v15, v17, v18

    .line 2900
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ag:[F

    move-object/from16 v17, v0

    mul-int/lit8 v18, v3, 0x4

    add-int/lit8 v18, v18, 0x6

    aput v16, v17, v18

    .line 2901
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ag:[F

    move-object/from16 v17, v0

    mul-int/lit8 v18, v3, 0x4

    add-int/lit8 v18, v18, 0x7

    iget-wide v0, v6, Lcom/saterskog/cell_lab/Cell;->d:D

    move-wide/from16 v20, v0

    move-wide/from16 v0, v20

    double-to-float v0, v0

    move/from16 v19, v0

    aput v19, v17, v18

    .line 2903
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ag:[F

    move-object/from16 v17, v0

    mul-int/lit8 v18, v3, 0x4

    add-int/lit8 v18, v18, 0x8

    aput v14, v17, v18

    .line 2904
    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/saterskog/cell_lab/CellWorld;->ag:[F

    mul-int/lit8 v17, v3, 0x4

    add-int/lit8 v17, v17, 0x9

    aput v15, v14, v17

    .line 2905
    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/saterskog/cell_lab/CellWorld;->ag:[F

    mul-int/lit8 v15, v3, 0x4

    add-int/lit8 v15, v15, 0xa

    aput v16, v14, v15

    .line 2906
    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/saterskog/cell_lab/CellWorld;->ag:[F

    mul-int/lit8 v15, v3, 0x4

    add-int/lit8 v15, v15, 0xb

    iget-wide v0, v6, Lcom/saterskog/cell_lab/Cell;->d:D

    move-wide/from16 v16, v0

    move-wide/from16 v0, v16

    double-to-float v0, v0

    move/from16 v16, v0

    aput v16, v14, v15

    .line 2908
    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/saterskog/cell_lab/CellWorld;->af:[F

    mul-int/lit8 v15, v3, 0x4

    iget-wide v0, v6, Lcom/saterskog/cell_lab/Cell;->b:D

    move-wide/from16 v16, v0

    move-wide/from16 v0, v16

    double-to-float v0, v0

    move/from16 v16, v0

    aput v16, v14, v15

    .line 2909
    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/saterskog/cell_lab/CellWorld;->af:[F

    mul-int/lit8 v15, v3, 0x4

    add-int/lit8 v15, v15, 0x1

    iget-wide v0, v6, Lcom/saterskog/cell_lab/Cell;->c:D

    move-wide/from16 v16, v0

    move-wide/from16 v0, v16

    double-to-float v0, v0

    move/from16 v16, v0

    aput v16, v14, v15

    .line 2910
    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/saterskog/cell_lab/CellWorld;->af:[F

    mul-int/lit8 v15, v3, 0x4

    add-int/lit8 v15, v15, 0x2

    const/16 v16, 0x0

    aput v16, v14, v15

    .line 2911
    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/saterskog/cell_lab/CellWorld;->af:[F

    mul-int/lit8 v15, v3, 0x4

    add-int/lit8 v15, v15, 0x3

    const/16 v16, 0x0

    aput v16, v14, v15

    .line 2913
    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/saterskog/cell_lab/CellWorld;->af:[F

    mul-int/lit8 v15, v3, 0x4

    add-int/lit8 v15, v15, 0x4

    iget-wide v0, v6, Lcom/saterskog/cell_lab/Cell;->b:D

    move-wide/from16 v16, v0

    move-wide/from16 v0, v16

    double-to-float v0, v0

    move/from16 v16, v0

    aput v16, v14, v15

    .line 2914
    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/saterskog/cell_lab/CellWorld;->af:[F

    mul-int/lit8 v15, v3, 0x4

    add-int/lit8 v15, v15, 0x5

    iget-wide v0, v6, Lcom/saterskog/cell_lab/Cell;->c:D

    move-wide/from16 v16, v0

    move-wide/from16 v0, v16

    double-to-float v0, v0

    move/from16 v16, v0

    aput v16, v14, v15

    .line 2915
    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/saterskog/cell_lab/CellWorld;->af:[F

    mul-int/lit8 v15, v3, 0x4

    add-int/lit8 v15, v15, 0x6

    const/16 v16, 0x0

    aput v16, v14, v15

    .line 2916
    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/saterskog/cell_lab/CellWorld;->af:[F

    mul-int/lit8 v15, v3, 0x4

    add-int/lit8 v15, v15, 0x7

    const/16 v16, 0x0

    aput v16, v14, v15

    .line 2918
    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/saterskog/cell_lab/CellWorld;->af:[F

    mul-int/lit8 v15, v3, 0x4

    add-int/lit8 v15, v15, 0x8

    iget-wide v0, v6, Lcom/saterskog/cell_lab/Cell;->b:D

    move-wide/from16 v16, v0

    move-wide/from16 v0, v16

    double-to-float v0, v0

    move/from16 v16, v0

    aput v16, v14, v15

    .line 2919
    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/saterskog/cell_lab/CellWorld;->af:[F

    mul-int/lit8 v15, v3, 0x4

    add-int/lit8 v15, v15, 0x9

    iget-wide v0, v6, Lcom/saterskog/cell_lab/Cell;->c:D

    move-wide/from16 v16, v0

    move-wide/from16 v0, v16

    double-to-float v6, v0

    aput v6, v14, v15

    .line 2920
    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/saterskog/cell_lab/CellWorld;->af:[F

    mul-int/lit8 v14, v3, 0x4

    add-int/lit8 v14, v14, 0xa

    const/4 v15, 0x0

    aput v15, v6, v14

    .line 2921
    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/saterskog/cell_lab/CellWorld;->af:[F

    mul-int/lit8 v14, v3, 0x4

    add-int/lit8 v14, v14, 0xb

    const/4 v15, 0x0

    aput v15, v6, v14

    .line 2922
    add-int/lit8 v3, v3, 0x3

    .line 2850
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_3

    .line 2928
    :cond_4
    const/4 v2, 0x0

    :goto_4
    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/saterskog/cell_lab/CellWorld;->E:[I

    aget v4, v4, v7

    if-ge v2, v4, :cond_b

    .line 2930
    aget v4, v10, v2

    .line 2932
    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    aget-object v12, v5, v4

    .line 2940
    iget-object v4, v12, Lcom/saterskog/cell_lab/Cell;->J:[F

    const/4 v5, 0x0

    aget v4, v4, v5

    iget v5, v12, Lcom/saterskog/cell_lab/Cell;->X:F

    const v6, 0x3dcccccd    # 0.1f

    mul-float/2addr v5, v6

    add-float v13, v4, v5

    .line 2941
    iget-object v4, v12, Lcom/saterskog/cell_lab/Cell;->J:[F

    const/4 v5, 0x1

    aget v4, v4, v5

    iget v5, v12, Lcom/saterskog/cell_lab/Cell;->Y:F

    add-float v14, v4, v5

    .line 2942
    iget-object v4, v12, Lcom/saterskog/cell_lab/Cell;->J:[F

    const/4 v5, 0x2

    aget v15, v4, v5

    .line 2944
    iget-wide v4, v12, Lcom/saterskog/cell_lab/Cell;->k:D

    invoke-static {v4, v5}, Ljava/lang/Math;->cos(D)D

    move-result-wide v4

    iget-wide v0, v12, Lcom/saterskog/cell_lab/Cell;->d:D

    move-wide/from16 v16, v0

    iget-wide v0, v11, Lcom/saterskog/cell_lab/h;->A:D

    move-wide/from16 v18, v0

    add-double v16, v16, v18

    mul-double v4, v4, v16

    double-to-float v0, v4

    move/from16 v16, v0

    .line 2945
    iget-wide v4, v12, Lcom/saterskog/cell_lab/Cell;->k:D

    invoke-static {v4, v5}, Ljava/lang/Math;->sin(D)D

    move-result-wide v4

    iget-wide v0, v12, Lcom/saterskog/cell_lab/Cell;->d:D

    move-wide/from16 v18, v0

    iget-wide v0, v11, Lcom/saterskog/cell_lab/h;->A:D

    move-wide/from16 v20, v0

    add-double v18, v18, v20

    mul-double v4, v4, v18

    double-to-float v0, v4

    move/from16 v17, v0

    .line 2946
    move/from16 v0, v17

    neg-float v0, v0

    move/from16 v18, v0

    .line 2950
    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v5, 0x0

    .line 2951
    sget-object v19, Lcom/saterskog/cell_lab/h;->k:Lcom/saterskog/cell_lab/h;

    move-object/from16 v0, v19

    if-eq v11, v0, :cond_5

    sget-object v19, Lcom/saterskog/cell_lab/h;->l:Lcom/saterskog/cell_lab/h;

    move-object/from16 v0, v19

    if-eq v11, v0, :cond_5

    sget-object v19, Lcom/saterskog/cell_lab/h;->o:Lcom/saterskog/cell_lab/h;

    move-object/from16 v0, v19

    if-ne v11, v0, :cond_6

    :cond_5
    iget-wide v0, v12, Lcom/saterskog/cell_lab/Cell;->k:D

    move-wide/from16 v20, v0

    move-wide/from16 v0, v20

    double-to-float v4, v0

    .line 2953
    :cond_6
    sget-object v19, Lcom/saterskog/cell_lab/h;->h:Lcom/saterskog/cell_lab/h;

    move-object/from16 v0, v19

    if-ne v11, v0, :cond_7

    .line 2954
    iget-wide v0, v12, Lcom/saterskog/cell_lab/Cell;->u:D

    move-wide/from16 v20, v0

    move-wide/from16 v0, v20

    double-to-float v6, v0

    .line 2955
    iget-wide v0, v12, Lcom/saterskog/cell_lab/Cell;->v:D

    move-wide/from16 v20, v0

    move-wide/from16 v0, v20

    double-to-float v5, v0

    .line 2957
    :cond_7
    sget-object v19, Lcom/saterskog/cell_lab/h;->r:Lcom/saterskog/cell_lab/h;

    move-object/from16 v0, v19

    if-ne v11, v0, :cond_c

    .line 2958
    iget-boolean v5, v12, Lcom/saterskog/cell_lab/Cell;->y:Z

    if-eqz v5, :cond_9

    iget v5, v12, Lcom/saterskog/cell_lab/Cell;->s:F

    .line 2959
    :goto_5
    iget-boolean v6, v12, Lcom/saterskog/cell_lab/Cell;->y:Z

    if-eqz v6, :cond_a

    iget v6, v12, Lcom/saterskog/cell_lab/Cell;->r:F

    .line 2961
    :goto_6
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ad:[F

    move-object/from16 v19, v0

    mul-int/lit8 v20, v3, 0x2

    add-int/lit8 v20, v20, 0x0

    move/from16 v0, v16

    neg-float v0, v0

    move/from16 v21, v0

    add-float v21, v21, v18

    aput v21, v19, v20

    .line 2962
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ad:[F

    move-object/from16 v19, v0

    mul-int/lit8 v20, v3, 0x2

    add-int/lit8 v20, v20, 0x1

    move/from16 v0, v17

    neg-float v0, v0

    move/from16 v21, v0

    add-float v21, v21, v16

    aput v21, v19, v20

    .line 2964
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ad:[F

    move-object/from16 v19, v0

    mul-int/lit8 v20, v3, 0x2

    add-int/lit8 v20, v20, 0x2

    sub-float v21, v16, v18

    aput v21, v19, v20

    .line 2965
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ad:[F

    move-object/from16 v19, v0

    mul-int/lit8 v20, v3, 0x2

    add-int/lit8 v20, v20, 0x3

    sub-float v21, v17, v16

    aput v21, v19, v20

    .line 2967
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ad:[F

    move-object/from16 v19, v0

    mul-int/lit8 v20, v3, 0x2

    add-int/lit8 v20, v20, 0x4

    add-float v21, v16, v18

    aput v21, v19, v20

    .line 2968
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ad:[F

    move-object/from16 v19, v0

    mul-int/lit8 v20, v3, 0x2

    add-int/lit8 v20, v20, 0x5

    add-float v21, v17, v16

    aput v21, v19, v20

    .line 2970
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ad:[F

    move-object/from16 v19, v0

    mul-int/lit8 v20, v3, 0x2

    add-int/lit8 v20, v20, 0x6

    move/from16 v0, v16

    neg-float v0, v0

    move/from16 v21, v0

    add-float v21, v21, v18

    aput v21, v19, v20

    .line 2971
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ad:[F

    move-object/from16 v19, v0

    mul-int/lit8 v20, v3, 0x2

    add-int/lit8 v20, v20, 0x7

    move/from16 v0, v17

    neg-float v0, v0

    move/from16 v21, v0

    add-float v21, v21, v16

    aput v21, v19, v20

    .line 2973
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ad:[F

    move-object/from16 v19, v0

    mul-int/lit8 v20, v3, 0x2

    add-int/lit8 v20, v20, 0x8

    move/from16 v0, v16

    neg-float v0, v0

    move/from16 v21, v0

    sub-float v21, v21, v18

    aput v21, v19, v20

    .line 2974
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ad:[F

    move-object/from16 v19, v0

    mul-int/lit8 v20, v3, 0x2

    add-int/lit8 v20, v20, 0x9

    move/from16 v0, v17

    neg-float v0, v0

    move/from16 v21, v0

    sub-float v21, v21, v16

    aput v21, v19, v20

    .line 2976
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ad:[F

    move-object/from16 v19, v0

    mul-int/lit8 v20, v3, 0x2

    add-int/lit8 v20, v20, 0xa

    sub-float v18, v16, v18

    aput v18, v19, v20

    .line 2977
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ad:[F

    move-object/from16 v18, v0

    mul-int/lit8 v19, v3, 0x2

    add-int/lit8 v19, v19, 0xb

    sub-float v16, v17, v16

    aput v16, v18, v19

    .line 2979
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ae:[F

    move-object/from16 v16, v0

    mul-int/lit8 v17, v3, 0x4

    const/high16 v18, -0x40800000    # -1.0f

    aput v18, v16, v17

    .line 2980
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ae:[F

    move-object/from16 v16, v0

    mul-int/lit8 v17, v3, 0x4

    add-int/lit8 v17, v17, 0x1

    const/high16 v18, 0x3f800000    # 1.0f

    aput v18, v16, v17

    .line 2981
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ae:[F

    move-object/from16 v16, v0

    mul-int/lit8 v17, v3, 0x4

    add-int/lit8 v17, v17, 0x2

    aput v5, v16, v17

    .line 2982
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ae:[F

    move-object/from16 v16, v0

    mul-int/lit8 v17, v3, 0x4

    add-int/lit8 v17, v17, 0x3

    aput v6, v16, v17

    .line 2984
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ae:[F

    move-object/from16 v16, v0

    mul-int/lit8 v17, v3, 0x4

    add-int/lit8 v17, v17, 0x4

    const/high16 v18, 0x3f800000    # 1.0f

    aput v18, v16, v17

    .line 2985
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ae:[F

    move-object/from16 v16, v0

    mul-int/lit8 v17, v3, 0x4

    add-int/lit8 v17, v17, 0x5

    const/high16 v18, -0x40800000    # -1.0f

    aput v18, v16, v17

    .line 2986
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ae:[F

    move-object/from16 v16, v0

    mul-int/lit8 v17, v3, 0x4

    add-int/lit8 v17, v17, 0x6

    aput v5, v16, v17

    .line 2987
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ae:[F

    move-object/from16 v16, v0

    mul-int/lit8 v17, v3, 0x4

    add-int/lit8 v17, v17, 0x7

    aput v6, v16, v17

    .line 2989
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ae:[F

    move-object/from16 v16, v0

    mul-int/lit8 v17, v3, 0x4

    add-int/lit8 v17, v17, 0x8

    const/high16 v18, 0x3f800000    # 1.0f

    aput v18, v16, v17

    .line 2990
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ae:[F

    move-object/from16 v16, v0

    mul-int/lit8 v17, v3, 0x4

    add-int/lit8 v17, v17, 0x9

    const/high16 v18, 0x3f800000    # 1.0f

    aput v18, v16, v17

    .line 2991
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ae:[F

    move-object/from16 v16, v0

    mul-int/lit8 v17, v3, 0x4

    add-int/lit8 v17, v17, 0xa

    aput v5, v16, v17

    .line 2992
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ae:[F

    move-object/from16 v16, v0

    mul-int/lit8 v17, v3, 0x4

    add-int/lit8 v17, v17, 0xb

    aput v6, v16, v17

    .line 2994
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ae:[F

    move-object/from16 v16, v0

    mul-int/lit8 v17, v3, 0x4

    add-int/lit8 v17, v17, 0xc

    const/high16 v18, -0x40800000    # -1.0f

    aput v18, v16, v17

    .line 2995
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ae:[F

    move-object/from16 v16, v0

    mul-int/lit8 v17, v3, 0x4

    add-int/lit8 v17, v17, 0xd

    const/high16 v18, 0x3f800000    # 1.0f

    aput v18, v16, v17

    .line 2996
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ae:[F

    move-object/from16 v16, v0

    mul-int/lit8 v17, v3, 0x4

    add-int/lit8 v17, v17, 0xe

    aput v5, v16, v17

    .line 2997
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ae:[F

    move-object/from16 v16, v0

    mul-int/lit8 v17, v3, 0x4

    add-int/lit8 v17, v17, 0xf

    aput v6, v16, v17

    .line 2999
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ae:[F

    move-object/from16 v16, v0

    mul-int/lit8 v17, v3, 0x4

    add-int/lit8 v17, v17, 0x10

    const/high16 v18, -0x40800000    # -1.0f

    aput v18, v16, v17

    .line 3000
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ae:[F

    move-object/from16 v16, v0

    mul-int/lit8 v17, v3, 0x4

    add-int/lit8 v17, v17, 0x11

    const/high16 v18, -0x40800000    # -1.0f

    aput v18, v16, v17

    .line 3001
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ae:[F

    move-object/from16 v16, v0

    mul-int/lit8 v17, v3, 0x4

    add-int/lit8 v17, v17, 0x12

    aput v5, v16, v17

    .line 3002
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ae:[F

    move-object/from16 v16, v0

    mul-int/lit8 v17, v3, 0x4

    add-int/lit8 v17, v17, 0x13

    aput v6, v16, v17

    .line 3004
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ae:[F

    move-object/from16 v16, v0

    mul-int/lit8 v17, v3, 0x4

    add-int/lit8 v17, v17, 0x14

    const/high16 v18, 0x3f800000    # 1.0f

    aput v18, v16, v17

    .line 3005
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ae:[F

    move-object/from16 v16, v0

    mul-int/lit8 v17, v3, 0x4

    add-int/lit8 v17, v17, 0x15

    const/high16 v18, -0x40800000    # -1.0f

    aput v18, v16, v17

    .line 3006
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ae:[F

    move-object/from16 v16, v0

    mul-int/lit8 v17, v3, 0x4

    add-int/lit8 v17, v17, 0x16

    aput v5, v16, v17

    .line 3007
    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/saterskog/cell_lab/CellWorld;->ae:[F

    mul-int/lit8 v16, v3, 0x4

    add-int/lit8 v16, v16, 0x17

    aput v6, v5, v16

    .line 3009
    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/saterskog/cell_lab/CellWorld;->ag:[F

    mul-int/lit8 v6, v3, 0x4

    aput v13, v5, v6

    .line 3010
    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/saterskog/cell_lab/CellWorld;->ag:[F

    mul-int/lit8 v6, v3, 0x4

    add-int/lit8 v6, v6, 0x1

    aput v14, v5, v6

    .line 3011
    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/saterskog/cell_lab/CellWorld;->ag:[F

    mul-int/lit8 v6, v3, 0x4

    add-int/lit8 v6, v6, 0x2

    aput v15, v5, v6

    .line 3012
    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/saterskog/cell_lab/CellWorld;->ag:[F

    mul-int/lit8 v6, v3, 0x4

    add-int/lit8 v6, v6, 0x3

    iget-wide v0, v12, Lcom/saterskog/cell_lab/Cell;->d:D

    move-wide/from16 v16, v0

    move-wide/from16 v0, v16

    double-to-float v0, v0

    move/from16 v16, v0

    aput v16, v5, v6

    .line 3014
    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/saterskog/cell_lab/CellWorld;->ag:[F

    mul-int/lit8 v6, v3, 0x4

    add-int/lit8 v6, v6, 0x4

    aput v13, v5, v6

    .line 3015
    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/saterskog/cell_lab/CellWorld;->ag:[F

    mul-int/lit8 v6, v3, 0x4

    add-int/lit8 v6, v6, 0x5

    aput v14, v5, v6

    .line 3016
    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/saterskog/cell_lab/CellWorld;->ag:[F

    mul-int/lit8 v6, v3, 0x4

    add-int/lit8 v6, v6, 0x6

    aput v15, v5, v6

    .line 3017
    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/saterskog/cell_lab/CellWorld;->ag:[F

    mul-int/lit8 v6, v3, 0x4

    add-int/lit8 v6, v6, 0x7

    iget-wide v0, v12, Lcom/saterskog/cell_lab/Cell;->d:D

    move-wide/from16 v16, v0

    move-wide/from16 v0, v16

    double-to-float v0, v0

    move/from16 v16, v0

    aput v16, v5, v6

    .line 3019
    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/saterskog/cell_lab/CellWorld;->ag:[F

    mul-int/lit8 v6, v3, 0x4

    add-int/lit8 v6, v6, 0x8

    aput v13, v5, v6

    .line 3020
    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/saterskog/cell_lab/CellWorld;->ag:[F

    mul-int/lit8 v6, v3, 0x4

    add-int/lit8 v6, v6, 0x9

    aput v14, v5, v6

    .line 3021
    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/saterskog/cell_lab/CellWorld;->ag:[F

    mul-int/lit8 v6, v3, 0x4

    add-int/lit8 v6, v6, 0xa

    aput v15, v5, v6

    .line 3022
    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/saterskog/cell_lab/CellWorld;->ag:[F

    mul-int/lit8 v6, v3, 0x4

    add-int/lit8 v6, v6, 0xb

    iget-wide v0, v12, Lcom/saterskog/cell_lab/Cell;->d:D

    move-wide/from16 v16, v0

    move-wide/from16 v0, v16

    double-to-float v0, v0

    move/from16 v16, v0

    aput v16, v5, v6

    .line 3024
    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/saterskog/cell_lab/CellWorld;->ag:[F

    mul-int/lit8 v6, v3, 0x4

    add-int/lit8 v6, v6, 0xc

    aput v13, v5, v6

    .line 3025
    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/saterskog/cell_lab/CellWorld;->ag:[F

    mul-int/lit8 v6, v3, 0x4

    add-int/lit8 v6, v6, 0xd

    aput v14, v5, v6

    .line 3026
    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/saterskog/cell_lab/CellWorld;->ag:[F

    mul-int/lit8 v6, v3, 0x4

    add-int/lit8 v6, v6, 0xe

    aput v15, v5, v6

    .line 3027
    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/saterskog/cell_lab/CellWorld;->ag:[F

    mul-int/lit8 v6, v3, 0x4

    add-int/lit8 v6, v6, 0xf

    iget-wide v0, v12, Lcom/saterskog/cell_lab/Cell;->d:D

    move-wide/from16 v16, v0

    move-wide/from16 v0, v16

    double-to-float v0, v0

    move/from16 v16, v0

    aput v16, v5, v6

    .line 3029
    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/saterskog/cell_lab/CellWorld;->ag:[F

    mul-int/lit8 v6, v3, 0x4

    add-int/lit8 v6, v6, 0x10

    aput v13, v5, v6

    .line 3030
    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/saterskog/cell_lab/CellWorld;->ag:[F

    mul-int/lit8 v6, v3, 0x4

    add-int/lit8 v6, v6, 0x11

    aput v14, v5, v6

    .line 3031
    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/saterskog/cell_lab/CellWorld;->ag:[F

    mul-int/lit8 v6, v3, 0x4

    add-int/lit8 v6, v6, 0x12

    aput v15, v5, v6

    .line 3032
    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/saterskog/cell_lab/CellWorld;->ag:[F

    mul-int/lit8 v6, v3, 0x4

    add-int/lit8 v6, v6, 0x13

    iget-wide v0, v12, Lcom/saterskog/cell_lab/Cell;->d:D

    move-wide/from16 v16, v0

    move-wide/from16 v0, v16

    double-to-float v0, v0

    move/from16 v16, v0

    aput v16, v5, v6

    .line 3034
    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/saterskog/cell_lab/CellWorld;->ag:[F

    mul-int/lit8 v6, v3, 0x4

    add-int/lit8 v6, v6, 0x14

    aput v13, v5, v6

    .line 3035
    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/saterskog/cell_lab/CellWorld;->ag:[F

    mul-int/lit8 v6, v3, 0x4

    add-int/lit8 v6, v6, 0x15

    aput v14, v5, v6

    .line 3036
    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/saterskog/cell_lab/CellWorld;->ag:[F

    mul-int/lit8 v6, v3, 0x4

    add-int/lit8 v6, v6, 0x16

    aput v15, v5, v6

    .line 3037
    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/saterskog/cell_lab/CellWorld;->ag:[F

    mul-int/lit8 v6, v3, 0x4

    add-int/lit8 v6, v6, 0x17

    iget-wide v14, v12, Lcom/saterskog/cell_lab/Cell;->d:D

    double-to-float v13, v14

    aput v13, v5, v6

    .line 3038
    iget-wide v14, v12, Lcom/saterskog/cell_lab/Cell;->t:D

    double-to-float v5, v14

    .line 3039
    sget-object v6, Lcom/saterskog/cell_lab/h;->o:Lcom/saterskog/cell_lab/h;

    if-ne v11, v6, :cond_8

    iget v5, v12, Lcom/saterskog/cell_lab/Cell;->r:F

    .line 3041
    :cond_8
    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/saterskog/cell_lab/CellWorld;->af:[F

    mul-int/lit8 v13, v3, 0x4

    iget-wide v14, v12, Lcom/saterskog/cell_lab/Cell;->b:D

    double-to-float v14, v14

    aput v14, v6, v13

    .line 3042
    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/saterskog/cell_lab/CellWorld;->af:[F

    mul-int/lit8 v13, v3, 0x4

    add-int/lit8 v13, v13, 0x1

    iget-wide v14, v12, Lcom/saterskog/cell_lab/Cell;->c:D

    double-to-float v14, v14

    aput v14, v6, v13

    .line 3043
    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/saterskog/cell_lab/CellWorld;->af:[F

    mul-int/lit8 v13, v3, 0x4

    add-int/lit8 v13, v13, 0x2

    aput v5, v6, v13

    .line 3044
    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/saterskog/cell_lab/CellWorld;->af:[F

    mul-int/lit8 v13, v3, 0x4

    add-int/lit8 v13, v13, 0x3

    aput v4, v6, v13

    .line 3046
    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/saterskog/cell_lab/CellWorld;->af:[F

    mul-int/lit8 v13, v3, 0x4

    add-int/lit8 v13, v13, 0x4

    iget-wide v14, v12, Lcom/saterskog/cell_lab/Cell;->b:D

    double-to-float v14, v14

    aput v14, v6, v13

    .line 3047
    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/saterskog/cell_lab/CellWorld;->af:[F

    mul-int/lit8 v13, v3, 0x4

    add-int/lit8 v13, v13, 0x5

    iget-wide v14, v12, Lcom/saterskog/cell_lab/Cell;->c:D

    double-to-float v14, v14

    aput v14, v6, v13

    .line 3048
    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/saterskog/cell_lab/CellWorld;->af:[F

    mul-int/lit8 v13, v3, 0x4

    add-int/lit8 v13, v13, 0x6

    aput v5, v6, v13

    .line 3049
    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/saterskog/cell_lab/CellWorld;->af:[F

    mul-int/lit8 v13, v3, 0x4

    add-int/lit8 v13, v13, 0x7

    aput v4, v6, v13

    .line 3051
    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/saterskog/cell_lab/CellWorld;->af:[F

    mul-int/lit8 v13, v3, 0x4

    add-int/lit8 v13, v13, 0x8

    iget-wide v14, v12, Lcom/saterskog/cell_lab/Cell;->b:D

    double-to-float v14, v14

    aput v14, v6, v13

    .line 3052
    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/saterskog/cell_lab/CellWorld;->af:[F

    mul-int/lit8 v13, v3, 0x4

    add-int/lit8 v13, v13, 0x9

    iget-wide v14, v12, Lcom/saterskog/cell_lab/Cell;->c:D

    double-to-float v14, v14

    aput v14, v6, v13

    .line 3053
    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/saterskog/cell_lab/CellWorld;->af:[F

    mul-int/lit8 v13, v3, 0x4

    add-int/lit8 v13, v13, 0xa

    aput v5, v6, v13

    .line 3054
    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/saterskog/cell_lab/CellWorld;->af:[F

    mul-int/lit8 v13, v3, 0x4

    add-int/lit8 v13, v13, 0xb

    aput v4, v6, v13

    .line 3056
    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/saterskog/cell_lab/CellWorld;->af:[F

    mul-int/lit8 v13, v3, 0x4

    add-int/lit8 v13, v13, 0xc

    iget-wide v14, v12, Lcom/saterskog/cell_lab/Cell;->b:D

    double-to-float v14, v14

    aput v14, v6, v13

    .line 3057
    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/saterskog/cell_lab/CellWorld;->af:[F

    mul-int/lit8 v13, v3, 0x4

    add-int/lit8 v13, v13, 0xd

    iget-wide v14, v12, Lcom/saterskog/cell_lab/Cell;->c:D

    double-to-float v14, v14

    aput v14, v6, v13

    .line 3058
    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/saterskog/cell_lab/CellWorld;->af:[F

    mul-int/lit8 v13, v3, 0x4

    add-int/lit8 v13, v13, 0xe

    aput v5, v6, v13

    .line 3059
    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/saterskog/cell_lab/CellWorld;->af:[F

    mul-int/lit8 v13, v3, 0x4

    add-int/lit8 v13, v13, 0xf

    aput v4, v6, v13

    .line 3061
    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/saterskog/cell_lab/CellWorld;->af:[F

    mul-int/lit8 v13, v3, 0x4

    add-int/lit8 v13, v13, 0x10

    iget-wide v14, v12, Lcom/saterskog/cell_lab/Cell;->b:D

    double-to-float v14, v14

    aput v14, v6, v13

    .line 3062
    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/saterskog/cell_lab/CellWorld;->af:[F

    mul-int/lit8 v13, v3, 0x4

    add-int/lit8 v13, v13, 0x11

    iget-wide v14, v12, Lcom/saterskog/cell_lab/Cell;->c:D

    double-to-float v14, v14

    aput v14, v6, v13

    .line 3063
    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/saterskog/cell_lab/CellWorld;->af:[F

    mul-int/lit8 v13, v3, 0x4

    add-int/lit8 v13, v13, 0x12

    aput v5, v6, v13

    .line 3064
    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/saterskog/cell_lab/CellWorld;->af:[F

    mul-int/lit8 v13, v3, 0x4

    add-int/lit8 v13, v13, 0x13

    aput v4, v6, v13

    .line 3066
    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/saterskog/cell_lab/CellWorld;->af:[F

    mul-int/lit8 v13, v3, 0x4

    add-int/lit8 v13, v13, 0x14

    iget-wide v14, v12, Lcom/saterskog/cell_lab/Cell;->b:D

    double-to-float v14, v14

    aput v14, v6, v13

    .line 3067
    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/saterskog/cell_lab/CellWorld;->af:[F

    mul-int/lit8 v13, v3, 0x4

    add-int/lit8 v13, v13, 0x15

    iget-wide v14, v12, Lcom/saterskog/cell_lab/Cell;->c:D

    double-to-float v12, v14

    aput v12, v6, v13

    .line 3068
    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/saterskog/cell_lab/CellWorld;->af:[F

    mul-int/lit8 v12, v3, 0x4

    add-int/lit8 v12, v12, 0x16

    aput v5, v6, v12

    .line 3069
    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/saterskog/cell_lab/CellWorld;->af:[F

    mul-int/lit8 v6, v3, 0x4

    add-int/lit8 v6, v6, 0x17

    aput v4, v5, v6

    .line 3070
    add-int/lit8 v3, v3, 0x6

    .line 2928
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_4

    .line 2958
    :cond_9
    iget v5, v12, Lcom/saterskog/cell_lab/Cell;->r:F

    goto/16 :goto_5

    .line 2959
    :cond_a
    iget v6, v12, Lcom/saterskog/cell_lab/Cell;->s:F

    goto/16 :goto_6

    .line 3073
    :cond_b
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/CellWorld;->av:[I

    add-int v4, v9, v7

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/saterskog/cell_lab/CellWorld;->aw:[I

    add-int v6, v9, v7

    aget v5, v5, v6

    sub-int v5, v3, v5

    aput v5, v2, v4

    goto/16 :goto_2

    :cond_c
    move/from16 v28, v5

    move v5, v6

    move/from16 v6, v28

    goto/16 :goto_6
.end method


# virtual methods
.method public final a(DD)I
    .locals 11

    .prologue
    .line 821
    const-wide v2, 0x3f826e978d4fdf3bL    # 0.009

    .line 822
    const/4 v1, -0x1

    .line 823
    const/4 v0, 0x0

    :goto_0
    iget v4, p0, Lcom/saterskog/cell_lab/CellWorld;->z:I

    if-ge v0, v4, :cond_1

    .line 824
    iget-object v4, p0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    aget-object v4, v4, v0

    iget-wide v4, v4, Lcom/saterskog/cell_lab/Cell;->b:D

    sub-double v4, p1, v4

    iget-object v6, p0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    aget-object v6, v6, v0

    iget-wide v6, v6, Lcom/saterskog/cell_lab/Cell;->b:D

    sub-double v6, p1, v6

    mul-double/2addr v4, v6

    iget-object v6, p0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    aget-object v6, v6, v0

    iget-wide v6, v6, Lcom/saterskog/cell_lab/Cell;->c:D

    sub-double v6, p3, v6

    iget-object v8, p0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    aget-object v8, v8, v0

    iget-wide v8, v8, Lcom/saterskog/cell_lab/Cell;->c:D

    sub-double v8, p3, v8

    mul-double/2addr v6, v8

    add-double/2addr v4, v6

    .line 825
    iget-object v6, p0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    aget-object v6, v6, v0

    iget-wide v6, v6, Lcom/saterskog/cell_lab/Cell;->d:D

    iget-object v8, p0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    aget-object v8, v8, v0

    iget-wide v8, v8, Lcom/saterskog/cell_lab/Cell;->d:D

    mul-double/2addr v6, v8

    cmpg-double v6, v4, v6

    if-gtz v6, :cond_0

    cmpg-double v6, v4, v2

    if-gez v6, :cond_0

    move v1, v0

    move-wide v2, v4

    .line 823
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 831
    :cond_1
    return v1
.end method

.method public final a(I)I
    .locals 2

    .prologue
    .line 835
    const/4 v0, 0x0

    :goto_0
    iget v1, p0, Lcom/saterskog/cell_lab/CellWorld;->z:I

    if-ge v0, v1, :cond_1

    .line 836
    iget-object v1, p0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    aget-object v1, v1, v0

    iget v1, v1, Lcom/saterskog/cell_lab/Cell;->F:I

    if-ne v1, p1, :cond_0

    .line 838
    :goto_1
    return v0

    .line 835
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 838
    :cond_1
    const/4 v0, -0x1

    goto :goto_1
.end method

.method public final a(Ljava/io/InputStream;)I
    .locals 9

    .prologue
    const/4 v8, 0x0

    const/4 v1, 0x0

    .line 392
    new-instance v0, Ljava/io/ObjectInputStream;

    invoke-direct {v0, p1}, Ljava/io/ObjectInputStream;-><init>(Ljava/io/InputStream;)V

    .line 394
    invoke-virtual {v0}, Ljava/io/ObjectInputStream;->readInt()I

    move-result v3

    .line 395
    const/16 v2, 0xbee

    if-le v3, v2, :cond_0

    .line 396
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "bad cellworld format for load: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "!=95"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 397
    :cond_0
    invoke-virtual {v0}, Ljava/io/ObjectInputStream;->readDouble()D

    move-result-wide v4

    iput-wide v4, p0, Lcom/saterskog/cell_lab/CellWorld;->M:D

    .line 398
    invoke-virtual {v0}, Ljava/io/ObjectInputStream;->readInt()I

    move-result v2

    iput v2, p0, Lcom/saterskog/cell_lab/CellWorld;->z:I

    .line 400
    iget-object v2, p0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    invoke-virtual {v2, v0}, Lcom/saterskog/cell_lab/Environment;->a(Ljava/io/ObjectInputStream;)V

    .line 403
    const/16 v2, 0xc

    if-gt v3, v2, :cond_2

    move-object v2, v0

    .line 407
    :goto_0
    const/16 v0, 0x17

    if-le v3, v0, :cond_1

    .line 408
    invoke-virtual {v2}, Ljava/io/ObjectInputStream;->readDouble()D

    move-result-wide v4

    iput-wide v4, p0, Lcom/saterskog/cell_lab/CellWorld;->O:D

    :cond_1
    move v0, v1

    .line 410
    :goto_1
    iget v4, p0, Lcom/saterskog/cell_lab/CellWorld;->z:I

    if-ge v0, v4, :cond_3

    .line 411
    iget-object v4, p0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    aget-object v4, v4, v0

    invoke-virtual {v4, v2}, Lcom/saterskog/cell_lab/Cell;->a(Ljava/io/ObjectInputStream;)V

    .line 410
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 406
    :cond_2
    new-instance v0, Ljava/io/ObjectInputStream;

    new-instance v2, Ljava/util/zip/GZIPInputStream;

    const/high16 v4, 0x10000

    invoke-direct {v2, p1, v4}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;I)V

    invoke-direct {v0, v2}, Ljava/io/ObjectInputStream;-><init>(Ljava/io/InputStream;)V

    move-object v2, v0

    goto :goto_0

    .line 412
    :cond_3
    invoke-virtual {v2}, Ljava/io/ObjectInputStream;->readInt()I

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/CellWorld;->B:I

    move v0, v1

    .line 413
    :goto_2
    iget v4, p0, Lcom/saterskog/cell_lab/CellWorld;->B:I

    if-ge v0, v4, :cond_6

    .line 414
    iget-object v4, p0, Lcom/saterskog/cell_lab/CellWorld;->A:[Lcom/saterskog/cell_lab/Food;

    aget-object v4, v4, v0

    .line 6067
    const/16 v5, 0x8

    if-lt v3, v5, :cond_4

    .line 6068
    invoke-virtual {v2}, Ljava/io/ObjectInputStream;->readFloat()F

    move-result v5

    iput v5, v4, Lcom/saterskog/cell_lab/Food;->a:F

    .line 6069
    invoke-virtual {v2}, Ljava/io/ObjectInputStream;->readFloat()F

    move-result v5

    iput v5, v4, Lcom/saterskog/cell_lab/Food;->b:F

    .line 6070
    invoke-virtual {v2}, Ljava/io/ObjectInputStream;->readFloat()F

    move-result v5

    iput v5, v4, Lcom/saterskog/cell_lab/Food;->c:F

    .line 6077
    :goto_3
    const/16 v5, 0x16

    if-lt v3, v5, :cond_5

    .line 6078
    invoke-virtual {v2}, Ljava/io/ObjectInputStream;->readFloat()F

    move-result v5

    iput v5, v4, Lcom/saterskog/cell_lab/Food;->d:F

    .line 6079
    invoke-virtual {v2}, Ljava/io/ObjectInputStream;->readFloat()F

    move-result v5

    iput v5, v4, Lcom/saterskog/cell_lab/Food;->e:F

    .line 6080
    invoke-virtual {v2}, Ljava/io/ObjectInputStream;->readFloat()F

    move-result v5

    iput v5, v4, Lcom/saterskog/cell_lab/Food;->f:F

    .line 413
    :goto_4
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 6073
    :cond_4
    invoke-virtual {v2}, Ljava/io/ObjectInputStream;->readDouble()D

    move-result-wide v6

    double-to-float v5, v6

    iput v5, v4, Lcom/saterskog/cell_lab/Food;->a:F

    .line 6074
    invoke-virtual {v2}, Ljava/io/ObjectInputStream;->readDouble()D

    move-result-wide v6

    double-to-float v5, v6

    iput v5, v4, Lcom/saterskog/cell_lab/Food;->b:F

    .line 6075
    invoke-virtual {v2}, Ljava/io/ObjectInputStream;->readDouble()D

    move-result-wide v6

    double-to-float v5, v6

    iput v5, v4, Lcom/saterskog/cell_lab/Food;->c:F

    goto :goto_3

    .line 6084
    :cond_5
    iput v8, v4, Lcom/saterskog/cell_lab/Food;->d:F

    .line 6085
    iput v8, v4, Lcom/saterskog/cell_lab/Food;->e:F

    .line 6086
    iput v8, v4, Lcom/saterskog/cell_lab/Food;->f:F

    goto :goto_4

    .line 417
    :cond_6
    const/4 v0, 0x1

    const-wide/16 v4, 0x0

    invoke-virtual {p0, v0, v4, v5}, Lcom/saterskog/cell_lab/CellWorld;->a(ZD)V

    .line 418
    iput v1, p0, Lcom/saterskog/cell_lab/CellWorld;->C:I

    .line 419
    iput v1, p0, Lcom/saterskog/cell_lab/CellWorld;->V:I

    .line 420
    iput v1, p0, Lcom/saterskog/cell_lab/CellWorld;->W:I

    .line 421
    return v3
.end method

.method public final a()V
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 4365
    iput v0, p0, Lcom/saterskog/cell_lab/CellWorld;->z:I

    .line 4366
    iput v0, p0, Lcom/saterskog/cell_lab/CellWorld;->B:I

    .line 4367
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/saterskog/cell_lab/CellWorld;->M:D

    .line 4368
    const-wide v0, 0x3ff921fb54442d18L    # 1.5707963267948966

    iput-wide v0, p0, Lcom/saterskog/cell_lab/CellWorld;->O:D

    .line 4369
    return-void
.end method

.method public final a(D)V
    .locals 3

    .prologue
    .line 1017
    iget v0, p0, Lcom/saterskog/cell_lab/CellWorld;->X:I

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Tried to run update2 too early"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1019
    :cond_0
    const-wide v0, 0x3f947ae147ae147bL    # 0.02

    mul-double/2addr v0, p1

    .line 1022
    invoke-direct {p0, v0, v1}, Lcom/saterskog/cell_lab/CellWorld;->g(D)V

    .line 1024
    invoke-static {}, Lcom/saterskog/b/a;->b()V

    .line 1025
    invoke-direct {p0, v0, v1}, Lcom/saterskog/cell_lab/CellWorld;->b(D)V

    .line 1030
    const/4 v0, 0x0

    iput v0, p0, Lcom/saterskog/cell_lab/CellWorld;->X:I

    .line 1031
    return-void
.end method

.method public final a(DDDF)V
    .locals 7

    .prologue
    const/4 v6, 0x0

    .line 666
    iget v0, p0, Lcom/saterskog/cell_lab/CellWorld;->B:I

    iget v1, p0, Lcom/saterskog/cell_lab/CellWorld;->aa:I

    if-lt v0, v1, :cond_1

    .line 667
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "skit:Maximum number of foods reached ("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lcom/saterskog/cell_lab/CellWorld;->aa:I

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "). This was not supposed to happen, maybe increase CellWorld.MAX_FOODS?"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/saterskog/b/a;->a(Ljava/lang/String;)V

    .line 678
    :cond_0
    :goto_0
    return-void

    .line 669
    :cond_1
    mul-double v0, p1, p1

    mul-double v2, p3, p3

    add-double/2addr v0, v2

    iget-object v2, p0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v2, v2, Lcom/saterskog/cell_lab/Environment;->k:D

    iget-object v4, p0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v4, v4, Lcom/saterskog/cell_lab/Environment;->k:D

    mul-double/2addr v2, v4

    cmpg-double v0, v0, v2

    if-gez v0, :cond_0

    .line 670
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->A:[Lcom/saterskog/cell_lab/Food;

    iget v1, p0, Lcom/saterskog/cell_lab/CellWorld;->B:I

    aget-object v0, v0, v1

    double-to-float v1, p1

    iput v1, v0, Lcom/saterskog/cell_lab/Food;->a:F

    .line 671
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->A:[Lcom/saterskog/cell_lab/Food;

    iget v1, p0, Lcom/saterskog/cell_lab/CellWorld;->B:I

    aget-object v0, v0, v1

    double-to-float v1, p3

    iput v1, v0, Lcom/saterskog/cell_lab/Food;->b:F

    .line 672
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->A:[Lcom/saterskog/cell_lab/Food;

    iget v1, p0, Lcom/saterskog/cell_lab/CellWorld;->B:I

    aget-object v0, v0, v1

    double-to-float v1, p5

    iput v1, v0, Lcom/saterskog/cell_lab/Food;->c:F

    .line 673
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->A:[Lcom/saterskog/cell_lab/Food;

    iget v1, p0, Lcom/saterskog/cell_lab/CellWorld;->B:I

    aget-object v0, v0, v1

    iput v6, v0, Lcom/saterskog/cell_lab/Food;->d:F

    .line 674
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->A:[Lcom/saterskog/cell_lab/Food;

    iget v1, p0, Lcom/saterskog/cell_lab/CellWorld;->B:I

    aget-object v0, v0, v1

    iput v6, v0, Lcom/saterskog/cell_lab/Food;->e:F

    .line 675
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->A:[Lcom/saterskog/cell_lab/Food;

    iget v1, p0, Lcom/saterskog/cell_lab/CellWorld;->B:I

    aget-object v0, v0, v1

    iput p7, v0, Lcom/saterskog/cell_lab/Food;->f:F

    .line 676
    iget v0, p0, Lcom/saterskog/cell_lab/CellWorld;->B:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/saterskog/cell_lab/CellWorld;->B:I

    goto :goto_0
.end method

.method public final a(FFFF)V
    .locals 37

    .prologue
    .line 3077
    invoke-static {}, Lcom/saterskog/b/a;->b()V

    .line 3078
    move-object/from16 v0, p0

    iget-boolean v4, v0, Lcom/saterskog/cell_lab/CellWorld;->L:Z

    if-nez v4, :cond_0

    .line 3080
    const-string v4, "ctd:Tried to construct primitives for not yet calculated geometry"

    invoke-static {v4}, Lcom/saterskog/b/a;->b(Ljava/lang/String;)V

    .line 3121
    :goto_0
    return-void

    .line 3085
    :cond_0
    const v4, 0x3df5c28f    # 0.12f

    sub-float v5, p1, v4

    .line 3086
    const v4, 0x3df5c28f    # 0.12f

    add-float v6, p2, v4

    .line 3087
    const v4, 0x3df5c28f    # 0.12f

    sub-float v7, p3, v4

    .line 3088
    const v4, 0x3df5c28f    # 0.12f

    add-float v8, p4, v4

    .line 3089
    const/4 v4, 0x0

    :goto_1
    sget-object v9, Lcom/saterskog/cell_lab/h;->B:[Lcom/saterskog/cell_lab/h;

    array-length v9, v9

    add-int/lit8 v9, v9, 0x1

    if-ge v4, v9, :cond_1

    move-object/from16 v0, p0

    iget-object v9, v0, Lcom/saterskog/cell_lab/CellWorld;->E:[I

    const/4 v10, 0x0

    aput v10, v9, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 3091
    :cond_1
    const/4 v4, 0x0

    :goto_2
    move-object/from16 v0, p0

    iget v9, v0, Lcom/saterskog/cell_lab/CellWorld;->z:I

    if-ge v4, v9, :cond_3

    .line 3092
    move-object/from16 v0, p0

    iget-object v9, v0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    aget-object v9, v9, v4

    .line 3093
    iget-wide v10, v9, Lcom/saterskog/cell_lab/Cell;->b:D

    float-to-double v12, v5

    cmpg-double v10, v10, v12

    if-ltz v10, :cond_2

    iget-wide v10, v9, Lcom/saterskog/cell_lab/Cell;->b:D

    float-to-double v12, v6

    cmpl-double v10, v10, v12

    if-gtz v10, :cond_2

    iget-wide v10, v9, Lcom/saterskog/cell_lab/Cell;->c:D

    float-to-double v12, v7

    cmpg-double v10, v10, v12

    if-ltz v10, :cond_2

    iget-wide v10, v9, Lcom/saterskog/cell_lab/Cell;->c:D

    float-to-double v12, v8

    cmpl-double v10, v10, v12

    if-gtz v10, :cond_2

    .line 3096
    iget-boolean v10, v9, Lcom/saterskog/cell_lab/Cell;->x:Z

    if-nez v10, :cond_2

    .line 3098
    iget-object v10, v9, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    iget v9, v9, Lcom/saterskog/cell_lab/Cell;->D:I

    aget-object v9, v10, v9

    iget-object v9, v9, Lcom/saterskog/cell_lab/Gene;->s:Lcom/saterskog/cell_lab/h;

    invoke-virtual {v9}, Lcom/saterskog/cell_lab/h;->ordinal()I

    move-result v9

    .line 3099
    move-object/from16 v0, p0

    iget-object v10, v0, Lcom/saterskog/cell_lab/CellWorld;->D:[[I

    aget-object v10, v10, v9

    move-object/from16 v0, p0

    iget-object v11, v0, Lcom/saterskog/cell_lab/CellWorld;->E:[I

    aget v11, v11, v9

    aput v4, v10, v11

    .line 3100
    move-object/from16 v0, p0

    iget-object v10, v0, Lcom/saterskog/cell_lab/CellWorld;->E:[I

    aget v11, v10, v9

    add-int/lit8 v11, v11, 0x1

    aput v11, v10, v9

    .line 3091
    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    .line 3102
    :cond_3
    move-object/from16 v0, p0

    iget-boolean v4, v0, Lcom/saterskog/cell_lab/CellWorld;->bg:Z

    if-eqz v4, :cond_4

    .line 3104
    const/4 v4, 0x0

    :goto_3
    move-object/from16 v0, p0

    iget v5, v0, Lcom/saterskog/cell_lab/CellWorld;->z:I

    if-ge v4, v5, :cond_4

    .line 3105
    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/saterskog/cell_lab/CellWorld;->D:[[I

    sget-object v6, Lcom/saterskog/cell_lab/h;->B:[Lcom/saterskog/cell_lab/h;

    array-length v6, v6

    aget-object v5, v5, v6

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/saterskog/cell_lab/CellWorld;->E:[I

    sget-object v7, Lcom/saterskog/cell_lab/h;->B:[Lcom/saterskog/cell_lab/h;

    array-length v7, v7

    aget v6, v6, v7

    aput v4, v5, v6

    .line 3106
    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/saterskog/cell_lab/CellWorld;->E:[I

    sget-object v6, Lcom/saterskog/cell_lab/h;->B:[Lcom/saterskog/cell_lab/h;

    array-length v6, v6

    aget v7, v5, v6

    add-int/lit8 v7, v7, 0x1

    aput v7, v5, v6

    .line 3104
    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    .line 3109
    :cond_4
    invoke-static {}, Lcom/saterskog/b/a;->b()V

    .line 50032
    const/4 v7, 0x0

    .line 50033
    const/4 v6, 0x0

    .line 50037
    const/4 v4, 0x0

    move v13, v4

    :goto_4
    sget-object v4, Lcom/saterskog/cell_lab/h;->B:[Lcom/saterskog/cell_lab/h;

    array-length v5, v4

    move-object/from16 v0, p0

    iget-boolean v4, v0, Lcom/saterskog/cell_lab/CellWorld;->bg:Z

    if-eqz v4, :cond_5

    const/4 v4, 0x1

    :goto_5
    add-int/2addr v4, v5

    if-ge v13, v4, :cond_22

    .line 50040
    sget-object v4, Lcom/saterskog/cell_lab/h;->B:[Lcom/saterskog/cell_lab/h;

    array-length v4, v4

    if-ge v13, v4, :cond_6

    .line 50041
    sget-object v4, Lcom/saterskog/cell_lab/h;->B:[Lcom/saterskog/cell_lab/h;

    aget-object v4, v4, v13

    move-object v14, v4

    .line 50044
    :goto_6
    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/saterskog/cell_lab/CellWorld;->aw:[I

    aput v7, v4, v13

    .line 50045
    if-eqz v14, :cond_7

    iget v4, v14, Lcom/saterskog/cell_lab/h;->w:I

    const/4 v5, -0x1

    if-ne v4, v5, :cond_7

    .line 50047
    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/saterskog/cell_lab/CellWorld;->av:[I

    const/4 v5, 0x0

    aput v5, v4, v13

    .line 50037
    :goto_7
    add-int/lit8 v4, v13, 0x1

    move v13, v4

    goto :goto_4

    :cond_5
    const/4 v4, 0x0

    goto :goto_5

    .line 50042
    :cond_6
    const/4 v4, 0x0

    move-object v14, v4

    goto :goto_6

    .line 50056
    :cond_7
    const/4 v5, 0x0

    .line 50059
    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/saterskog/cell_lab/CellWorld;->q:[[I

    aget-object v4, v4, v13

    const/4 v8, 0x0

    aput v7, v4, v8

    .line 50060
    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/saterskog/cell_lab/CellWorld;->r:[[I

    aget-object v4, v4, v13

    const/4 v8, 0x0

    aput v6, v4, v8

    .line 50062
    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/saterskog/cell_lab/CellWorld;->D:[[I

    aget-object v16, v4, v13

    .line 50064
    const/4 v4, 0x0

    move v8, v7

    :goto_8
    move-object/from16 v0, p0

    iget-object v9, v0, Lcom/saterskog/cell_lab/CellWorld;->E:[I

    aget v9, v9, v13

    if-ge v4, v9, :cond_13

    .line 50066
    aget v9, v16, v4

    .line 50068
    move-object/from16 v0, p0

    iget-object v10, v0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    aget-object v17, v10, v9

    .line 50069
    invoke-virtual/range {v17 .. v17}, Lcom/saterskog/cell_lab/Cell;->b()Lcom/saterskog/cell_lab/Gene;

    move-result-object v11

    .line 50566
    const/4 v9, 0x0

    :goto_9
    move-object/from16 v0, v17

    iget v10, v0, Lcom/saterskog/cell_lab/Cell;->B:I

    if-ge v9, v10, :cond_c

    .line 50567
    const/4 v10, 0x1

    :goto_a
    move-object/from16 v0, v17

    iget v12, v0, Lcom/saterskog/cell_lab/Cell;->B:I

    if-ge v10, v12, :cond_b

    .line 50568
    add-int v12, v9, v10

    move-object/from16 v0, v17

    iget v15, v0, Lcom/saterskog/cell_lab/Cell;->B:I

    rem-int/2addr v12, v15

    .line 50569
    move-object/from16 v0, v17

    iget-object v15, v0, Lcom/saterskog/cell_lab/Cell;->A:[Lcom/saterskog/cell_lab/u;

    aget-object v15, v15, v12

    iget-boolean v15, v15, Lcom/saterskog/cell_lab/u;->e:Z

    if-nez v15, :cond_9

    .line 50574
    move-object/from16 v0, v17

    iget-object v15, v0, Lcom/saterskog/cell_lab/Cell;->A:[Lcom/saterskog/cell_lab/u;

    aget-object v15, v15, v9

    iget-wide v0, v15, Lcom/saterskog/cell_lab/u;->c:D

    move-wide/from16 v18, v0

    move-object/from16 v0, v17

    iget-object v15, v0, Lcom/saterskog/cell_lab/Cell;->A:[Lcom/saterskog/cell_lab/u;

    aget-object v15, v15, v9

    iget-wide v0, v15, Lcom/saterskog/cell_lab/u;->a:D

    move-wide/from16 v20, v0

    sub-double v18, v18, v20

    .line 50575
    move-object/from16 v0, v17

    iget-object v15, v0, Lcom/saterskog/cell_lab/Cell;->A:[Lcom/saterskog/cell_lab/u;

    aget-object v15, v15, v12

    iget-wide v0, v15, Lcom/saterskog/cell_lab/u;->a:D

    move-wide/from16 v20, v0

    move-object/from16 v0, v17

    iget-object v15, v0, Lcom/saterskog/cell_lab/Cell;->A:[Lcom/saterskog/cell_lab/u;

    aget-object v15, v15, v12

    iget-wide v0, v15, Lcom/saterskog/cell_lab/u;->c:D

    move-wide/from16 v22, v0

    sub-double v20, v20, v22

    .line 50576
    move-object/from16 v0, v17

    iget-object v15, v0, Lcom/saterskog/cell_lab/Cell;->A:[Lcom/saterskog/cell_lab/u;

    aget-object v15, v15, v9

    iget-wide v0, v15, Lcom/saterskog/cell_lab/u;->d:D

    move-wide/from16 v22, v0

    move-object/from16 v0, v17

    iget-object v15, v0, Lcom/saterskog/cell_lab/Cell;->A:[Lcom/saterskog/cell_lab/u;

    aget-object v15, v15, v9

    iget-wide v0, v15, Lcom/saterskog/cell_lab/u;->b:D

    move-wide/from16 v24, v0

    sub-double v22, v22, v24

    .line 50577
    move-object/from16 v0, v17

    iget-object v15, v0, Lcom/saterskog/cell_lab/Cell;->A:[Lcom/saterskog/cell_lab/u;

    aget-object v15, v15, v12

    iget-wide v0, v15, Lcom/saterskog/cell_lab/u;->b:D

    move-wide/from16 v24, v0

    move-object/from16 v0, v17

    iget-object v15, v0, Lcom/saterskog/cell_lab/Cell;->A:[Lcom/saterskog/cell_lab/u;

    aget-object v15, v15, v12

    iget-wide v0, v15, Lcom/saterskog/cell_lab/u;->d:D

    move-wide/from16 v26, v0

    sub-double v24, v24, v26

    .line 50579
    move-object/from16 v0, v17

    iget-object v15, v0, Lcom/saterskog/cell_lab/Cell;->A:[Lcom/saterskog/cell_lab/u;

    aget-object v15, v15, v12

    iget-wide v0, v15, Lcom/saterskog/cell_lab/u;->a:D

    move-wide/from16 v26, v0

    move-object/from16 v0, v17

    iget-object v15, v0, Lcom/saterskog/cell_lab/Cell;->A:[Lcom/saterskog/cell_lab/u;

    aget-object v15, v15, v9

    iget-wide v0, v15, Lcom/saterskog/cell_lab/u;->a:D

    move-wide/from16 v28, v0

    sub-double v26, v26, v28

    .line 50580
    move-object/from16 v0, v17

    iget-object v15, v0, Lcom/saterskog/cell_lab/Cell;->A:[Lcom/saterskog/cell_lab/u;

    aget-object v15, v15, v12

    iget-wide v0, v15, Lcom/saterskog/cell_lab/u;->b:D

    move-wide/from16 v28, v0

    move-object/from16 v0, v17

    iget-object v15, v0, Lcom/saterskog/cell_lab/Cell;->A:[Lcom/saterskog/cell_lab/u;

    aget-object v15, v15, v9

    iget-wide v0, v15, Lcom/saterskog/cell_lab/u;->b:D

    move-wide/from16 v30, v0

    sub-double v28, v28, v30

    .line 50582
    mul-double v30, v18, v24

    mul-double v32, v20, v22

    sub-double v30, v30, v32

    .line 50583
    mul-double v32, v24, v26

    mul-double v34, v20, v28

    sub-double v32, v32, v34

    div-double v32, v32, v30

    .line 50584
    move-wide/from16 v0, v22

    neg-double v0, v0

    move-wide/from16 v22, v0

    mul-double v22, v22, v26

    mul-double v18, v18, v28

    add-double v18, v18, v22

    div-double v18, v18, v30

    .line 50586
    move-object/from16 v0, v17

    iget-object v15, v0, Lcom/saterskog/cell_lab/Cell;->A:[Lcom/saterskog/cell_lab/u;

    aget-object v15, v15, v9

    iget-wide v0, v15, Lcom/saterskog/cell_lab/u;->c:D

    move-wide/from16 v22, v0

    move-object/from16 v0, v17

    iget-object v15, v0, Lcom/saterskog/cell_lab/Cell;->A:[Lcom/saterskog/cell_lab/u;

    aget-object v15, v15, v12

    iget-wide v0, v15, Lcom/saterskog/cell_lab/u;->a:D

    move-wide/from16 v26, v0

    sub-double v22, v22, v26

    mul-double v22, v22, v24

    move-object/from16 v0, v17

    iget-object v15, v0, Lcom/saterskog/cell_lab/Cell;->A:[Lcom/saterskog/cell_lab/u;

    aget-object v15, v15, v9

    iget-wide v0, v15, Lcom/saterskog/cell_lab/u;->d:D

    move-wide/from16 v24, v0

    move-object/from16 v0, v17

    iget-object v15, v0, Lcom/saterskog/cell_lab/Cell;->A:[Lcom/saterskog/cell_lab/u;

    aget-object v15, v15, v12

    iget-wide v0, v15, Lcom/saterskog/cell_lab/u;->b:D

    move-wide/from16 v26, v0

    sub-double v24, v24, v26

    mul-double v20, v20, v24

    sub-double v20, v22, v20

    .line 50589
    const-wide/16 v22, 0x0

    cmpg-double v15, v22, v32

    if-gez v15, :cond_9

    const-wide/high16 v22, 0x3ff0000000000000L    # 1.0

    cmpg-double v15, v32, v22

    if-gez v15, :cond_9

    const-wide/high16 v22, 0x3ff0000000000000L    # 1.0

    cmpl-double v15, v22, v18

    if-lez v15, :cond_9

    const-wide/16 v22, 0x0

    cmpl-double v15, v18, v22

    if-lez v15, :cond_9

    .line 50590
    const-wide/16 v18, 0x0

    cmpg-double v15, v20, v18

    if-gez v15, :cond_a

    .line 50591
    move-object/from16 v0, v17

    iget-object v15, v0, Lcom/saterskog/cell_lab/Cell;->A:[Lcom/saterskog/cell_lab/u;

    aget-object v15, v15, v12

    move-object/from16 v0, v17

    iget-object v0, v0, Lcom/saterskog/cell_lab/Cell;->A:[Lcom/saterskog/cell_lab/u;

    move-object/from16 v18, v0

    aget-object v18, v18, v9

    move-object/from16 v0, v17

    iget-object v0, v0, Lcom/saterskog/cell_lab/Cell;->A:[Lcom/saterskog/cell_lab/u;

    move-object/from16 v19, v0

    aget-object v19, v19, v9

    move-object/from16 v0, v19

    iget-wide v0, v0, Lcom/saterskog/cell_lab/u;->a:D

    move-wide/from16 v20, v0

    move-object/from16 v0, v17

    iget-object v0, v0, Lcom/saterskog/cell_lab/Cell;->A:[Lcom/saterskog/cell_lab/u;

    move-object/from16 v19, v0

    aget-object v19, v19, v9

    move-object/from16 v0, v19

    iget-wide v0, v0, Lcom/saterskog/cell_lab/u;->c:D

    move-wide/from16 v22, v0

    move-object/from16 v0, v17

    iget-object v0, v0, Lcom/saterskog/cell_lab/Cell;->A:[Lcom/saterskog/cell_lab/u;

    move-object/from16 v19, v0

    aget-object v19, v19, v9

    move-object/from16 v0, v19

    iget-wide v0, v0, Lcom/saterskog/cell_lab/u;->a:D

    move-wide/from16 v24, v0

    sub-double v22, v22, v24

    mul-double v22, v22, v32

    add-double v20, v20, v22

    move-wide/from16 v0, v20

    move-object/from16 v2, v18

    iput-wide v0, v2, Lcom/saterskog/cell_lab/u;->c:D

    move-wide/from16 v0, v20

    iput-wide v0, v15, Lcom/saterskog/cell_lab/u;->a:D

    .line 50593
    move-object/from16 v0, v17

    iget-object v15, v0, Lcom/saterskog/cell_lab/Cell;->A:[Lcom/saterskog/cell_lab/u;

    aget-object v15, v15, v12

    move-object/from16 v0, v17

    iget-object v0, v0, Lcom/saterskog/cell_lab/Cell;->A:[Lcom/saterskog/cell_lab/u;

    move-object/from16 v18, v0

    aget-object v18, v18, v9

    move-object/from16 v0, v17

    iget-object v0, v0, Lcom/saterskog/cell_lab/Cell;->A:[Lcom/saterskog/cell_lab/u;

    move-object/from16 v19, v0

    aget-object v19, v19, v9

    move-object/from16 v0, v19

    iget-wide v0, v0, Lcom/saterskog/cell_lab/u;->b:D

    move-wide/from16 v20, v0

    move-object/from16 v0, v17

    iget-object v0, v0, Lcom/saterskog/cell_lab/Cell;->A:[Lcom/saterskog/cell_lab/u;

    move-object/from16 v19, v0

    aget-object v19, v19, v9

    move-object/from16 v0, v19

    iget-wide v0, v0, Lcom/saterskog/cell_lab/u;->d:D

    move-wide/from16 v22, v0

    move-object/from16 v0, v17

    iget-object v0, v0, Lcom/saterskog/cell_lab/Cell;->A:[Lcom/saterskog/cell_lab/u;

    move-object/from16 v19, v0

    aget-object v19, v19, v9

    move-object/from16 v0, v19

    iget-wide v0, v0, Lcom/saterskog/cell_lab/u;->b:D

    move-wide/from16 v24, v0

    sub-double v22, v22, v24

    mul-double v22, v22, v32

    add-double v20, v20, v22

    move-wide/from16 v0, v20

    move-object/from16 v2, v18

    iput-wide v0, v2, Lcom/saterskog/cell_lab/u;->d:D

    move-wide/from16 v0, v20

    iput-wide v0, v15, Lcom/saterskog/cell_lab/u;->b:D

    .line 50597
    move-object/from16 v0, v17

    iget-object v15, v0, Lcom/saterskog/cell_lab/Cell;->A:[Lcom/saterskog/cell_lab/u;

    aget-object v15, v15, v9

    const/16 v18, 0x1

    move/from16 v0, v18

    iput-boolean v0, v15, Lcom/saterskog/cell_lab/u;->f:Z

    .line 50607
    :goto_b
    move-object/from16 v0, v17

    iget-object v15, v0, Lcom/saterskog/cell_lab/Cell;->A:[Lcom/saterskog/cell_lab/u;

    aget-object v15, v15, v9

    iget-wide v0, v15, Lcom/saterskog/cell_lab/u;->a:D

    move-wide/from16 v18, v0

    move-object/from16 v0, v17

    iget-object v15, v0, Lcom/saterskog/cell_lab/Cell;->A:[Lcom/saterskog/cell_lab/u;

    aget-object v15, v15, v9

    iget-wide v0, v15, Lcom/saterskog/cell_lab/u;->d:D

    move-wide/from16 v20, v0

    mul-double v18, v18, v20

    move-object/from16 v0, v17

    iget-object v15, v0, Lcom/saterskog/cell_lab/Cell;->A:[Lcom/saterskog/cell_lab/u;

    aget-object v15, v15, v9

    iget-wide v0, v15, Lcom/saterskog/cell_lab/u;->b:D

    move-wide/from16 v20, v0

    move-object/from16 v0, v17

    iget-object v15, v0, Lcom/saterskog/cell_lab/Cell;->A:[Lcom/saterskog/cell_lab/u;

    aget-object v15, v15, v9

    iget-wide v0, v15, Lcom/saterskog/cell_lab/u;->c:D

    move-wide/from16 v22, v0

    mul-double v20, v20, v22

    sub-double v18, v18, v20

    const-wide/16 v20, 0x0

    cmpg-double v15, v18, v20

    if-gez v15, :cond_8

    .line 50608
    move-object/from16 v0, v17

    iget-object v15, v0, Lcom/saterskog/cell_lab/Cell;->A:[Lcom/saterskog/cell_lab/u;

    aget-object v15, v15, v9

    const/16 v18, 0x1

    move/from16 v0, v18

    iput-boolean v0, v15, Lcom/saterskog/cell_lab/u;->e:Z

    .line 50609
    :cond_8
    move-object/from16 v0, v17

    iget-object v15, v0, Lcom/saterskog/cell_lab/Cell;->A:[Lcom/saterskog/cell_lab/u;

    aget-object v15, v15, v12

    iget-wide v0, v15, Lcom/saterskog/cell_lab/u;->a:D

    move-wide/from16 v18, v0

    move-object/from16 v0, v17

    iget-object v15, v0, Lcom/saterskog/cell_lab/Cell;->A:[Lcom/saterskog/cell_lab/u;

    aget-object v15, v15, v12

    iget-wide v0, v15, Lcom/saterskog/cell_lab/u;->d:D

    move-wide/from16 v20, v0

    mul-double v18, v18, v20

    move-object/from16 v0, v17

    iget-object v15, v0, Lcom/saterskog/cell_lab/Cell;->A:[Lcom/saterskog/cell_lab/u;

    aget-object v15, v15, v12

    iget-wide v0, v15, Lcom/saterskog/cell_lab/u;->b:D

    move-wide/from16 v20, v0

    move-object/from16 v0, v17

    iget-object v15, v0, Lcom/saterskog/cell_lab/Cell;->A:[Lcom/saterskog/cell_lab/u;

    aget-object v15, v15, v12

    iget-wide v0, v15, Lcom/saterskog/cell_lab/u;->c:D

    move-wide/from16 v22, v0

    mul-double v20, v20, v22

    sub-double v18, v18, v20

    const-wide/16 v20, 0x0

    cmpg-double v15, v18, v20

    if-gez v15, :cond_9

    .line 50610
    move-object/from16 v0, v17

    iget-object v15, v0, Lcom/saterskog/cell_lab/Cell;->A:[Lcom/saterskog/cell_lab/u;

    aget-object v12, v15, v12

    const/4 v15, 0x1

    iput-boolean v15, v12, Lcom/saterskog/cell_lab/u;->e:Z

    .line 50567
    :cond_9
    add-int/lit8 v10, v10, 0x1

    goto/16 :goto_a

    .line 50599
    :cond_a
    move-object/from16 v0, v17

    iget-object v15, v0, Lcom/saterskog/cell_lab/Cell;->A:[Lcom/saterskog/cell_lab/u;

    aget-object v15, v15, v12

    move-object/from16 v0, v17

    iget-object v0, v0, Lcom/saterskog/cell_lab/Cell;->A:[Lcom/saterskog/cell_lab/u;

    move-object/from16 v18, v0

    aget-object v18, v18, v9

    move-object/from16 v0, v17

    iget-object v0, v0, Lcom/saterskog/cell_lab/Cell;->A:[Lcom/saterskog/cell_lab/u;

    move-object/from16 v19, v0

    aget-object v19, v19, v9

    move-object/from16 v0, v19

    iget-wide v0, v0, Lcom/saterskog/cell_lab/u;->a:D

    move-wide/from16 v20, v0

    move-object/from16 v0, v17

    iget-object v0, v0, Lcom/saterskog/cell_lab/Cell;->A:[Lcom/saterskog/cell_lab/u;

    move-object/from16 v19, v0

    aget-object v19, v19, v9

    move-object/from16 v0, v19

    iget-wide v0, v0, Lcom/saterskog/cell_lab/u;->c:D

    move-wide/from16 v22, v0

    move-object/from16 v0, v17

    iget-object v0, v0, Lcom/saterskog/cell_lab/Cell;->A:[Lcom/saterskog/cell_lab/u;

    move-object/from16 v19, v0

    aget-object v19, v19, v9

    move-object/from16 v0, v19

    iget-wide v0, v0, Lcom/saterskog/cell_lab/u;->a:D

    move-wide/from16 v24, v0

    sub-double v22, v22, v24

    mul-double v22, v22, v32

    add-double v20, v20, v22

    move-wide/from16 v0, v20

    move-object/from16 v2, v18

    iput-wide v0, v2, Lcom/saterskog/cell_lab/u;->a:D

    move-wide/from16 v0, v20

    iput-wide v0, v15, Lcom/saterskog/cell_lab/u;->c:D

    .line 50601
    move-object/from16 v0, v17

    iget-object v15, v0, Lcom/saterskog/cell_lab/Cell;->A:[Lcom/saterskog/cell_lab/u;

    aget-object v15, v15, v12

    move-object/from16 v0, v17

    iget-object v0, v0, Lcom/saterskog/cell_lab/Cell;->A:[Lcom/saterskog/cell_lab/u;

    move-object/from16 v18, v0

    aget-object v18, v18, v9

    move-object/from16 v0, v17

    iget-object v0, v0, Lcom/saterskog/cell_lab/Cell;->A:[Lcom/saterskog/cell_lab/u;

    move-object/from16 v19, v0

    aget-object v19, v19, v9

    move-object/from16 v0, v19

    iget-wide v0, v0, Lcom/saterskog/cell_lab/u;->b:D

    move-wide/from16 v20, v0

    move-object/from16 v0, v17

    iget-object v0, v0, Lcom/saterskog/cell_lab/Cell;->A:[Lcom/saterskog/cell_lab/u;

    move-object/from16 v19, v0

    aget-object v19, v19, v9

    move-object/from16 v0, v19

    iget-wide v0, v0, Lcom/saterskog/cell_lab/u;->d:D

    move-wide/from16 v22, v0

    move-object/from16 v0, v17

    iget-object v0, v0, Lcom/saterskog/cell_lab/Cell;->A:[Lcom/saterskog/cell_lab/u;

    move-object/from16 v19, v0

    aget-object v19, v19, v9

    move-object/from16 v0, v19

    iget-wide v0, v0, Lcom/saterskog/cell_lab/u;->b:D

    move-wide/from16 v24, v0

    sub-double v22, v22, v24

    mul-double v22, v22, v32

    add-double v20, v20, v22

    move-wide/from16 v0, v20

    move-object/from16 v2, v18

    iput-wide v0, v2, Lcom/saterskog/cell_lab/u;->b:D

    move-wide/from16 v0, v20

    iput-wide v0, v15, Lcom/saterskog/cell_lab/u;->d:D

    .line 50605
    move-object/from16 v0, v17

    iget-object v15, v0, Lcom/saterskog/cell_lab/Cell;->A:[Lcom/saterskog/cell_lab/u;

    aget-object v15, v15, v12

    const/16 v18, 0x1

    move/from16 v0, v18

    iput-boolean v0, v15, Lcom/saterskog/cell_lab/u;->f:Z

    goto/16 :goto_b

    .line 50566
    :cond_b
    add-int/lit8 v9, v9, 0x1

    goto/16 :goto_9

    .line 50616
    :cond_c
    const/4 v9, 0x0

    :goto_c
    move-object/from16 v0, v17

    iget v10, v0, Lcom/saterskog/cell_lab/Cell;->B:I

    if-ge v9, v10, :cond_11

    .line 50617
    move-object/from16 v0, v17

    iget-object v10, v0, Lcom/saterskog/cell_lab/Cell;->A:[Lcom/saterskog/cell_lab/u;

    aget-object v10, v10, v9

    iget-boolean v10, v10, Lcom/saterskog/cell_lab/u;->e:Z

    if-nez v10, :cond_10

    .line 50619
    const/4 v10, 0x0

    :goto_d
    move-object/from16 v0, v17

    iget v12, v0, Lcom/saterskog/cell_lab/Cell;->B:I

    if-ge v10, v12, :cond_10

    .line 50620
    if-eq v10, v9, :cond_f

    .line 50622
    move-object/from16 v0, v17

    iget-object v12, v0, Lcom/saterskog/cell_lab/Cell;->A:[Lcom/saterskog/cell_lab/u;

    aget-object v12, v12, v9

    iget-wide v0, v12, Lcom/saterskog/cell_lab/u;->a:D

    move-wide/from16 v18, v0

    move-object/from16 v0, v17

    iget-object v12, v0, Lcom/saterskog/cell_lab/Cell;->A:[Lcom/saterskog/cell_lab/u;

    aget-object v12, v12, v10

    iget-wide v0, v12, Lcom/saterskog/cell_lab/u;->c:D

    move-wide/from16 v20, v0

    cmpl-double v12, v18, v20

    if-nez v12, :cond_d

    move-object/from16 v0, v17

    iget-object v12, v0, Lcom/saterskog/cell_lab/Cell;->A:[Lcom/saterskog/cell_lab/u;

    aget-object v12, v12, v9

    iget-wide v0, v12, Lcom/saterskog/cell_lab/u;->b:D

    move-wide/from16 v18, v0

    move-object/from16 v0, v17

    iget-object v12, v0, Lcom/saterskog/cell_lab/Cell;->A:[Lcom/saterskog/cell_lab/u;

    aget-object v12, v12, v10

    iget-wide v0, v12, Lcom/saterskog/cell_lab/u;->d:D

    move-wide/from16 v20, v0

    cmpl-double v12, v18, v20

    if-eqz v12, :cond_f

    .line 50624
    :cond_d
    move-object/from16 v0, v17

    iget-object v12, v0, Lcom/saterskog/cell_lab/Cell;->A:[Lcom/saterskog/cell_lab/u;

    aget-object v12, v12, v9

    iget-wide v0, v12, Lcom/saterskog/cell_lab/u;->c:D

    move-wide/from16 v18, v0

    move-object/from16 v0, v17

    iget-object v12, v0, Lcom/saterskog/cell_lab/Cell;->A:[Lcom/saterskog/cell_lab/u;

    aget-object v12, v12, v10

    iget-wide v0, v12, Lcom/saterskog/cell_lab/u;->a:D

    move-wide/from16 v20, v0

    cmpl-double v12, v18, v20

    if-nez v12, :cond_e

    move-object/from16 v0, v17

    iget-object v12, v0, Lcom/saterskog/cell_lab/Cell;->A:[Lcom/saterskog/cell_lab/u;

    aget-object v12, v12, v9

    iget-wide v0, v12, Lcom/saterskog/cell_lab/u;->d:D

    move-wide/from16 v18, v0

    move-object/from16 v0, v17

    iget-object v12, v0, Lcom/saterskog/cell_lab/Cell;->A:[Lcom/saterskog/cell_lab/u;

    aget-object v12, v12, v10

    iget-wide v0, v12, Lcom/saterskog/cell_lab/u;->b:D

    move-wide/from16 v20, v0

    cmpl-double v12, v18, v20

    if-eqz v12, :cond_f

    .line 50626
    :cond_e
    move-object/from16 v0, v17

    iget-object v12, v0, Lcom/saterskog/cell_lab/Cell;->A:[Lcom/saterskog/cell_lab/u;

    aget-object v12, v12, v9

    iget-wide v0, v12, Lcom/saterskog/cell_lab/u;->a:D

    move-wide/from16 v18, v0

    const-wide/16 v20, 0x0

    sub-double v18, v18, v20

    .line 50627
    move-object/from16 v0, v17

    iget-object v12, v0, Lcom/saterskog/cell_lab/Cell;->A:[Lcom/saterskog/cell_lab/u;

    aget-object v12, v12, v10

    iget-wide v0, v12, Lcom/saterskog/cell_lab/u;->a:D

    move-wide/from16 v20, v0

    move-object/from16 v0, v17

    iget-object v12, v0, Lcom/saterskog/cell_lab/Cell;->A:[Lcom/saterskog/cell_lab/u;

    aget-object v12, v12, v10

    iget-wide v0, v12, Lcom/saterskog/cell_lab/u;->c:D

    move-wide/from16 v22, v0

    sub-double v20, v20, v22

    .line 50628
    move-object/from16 v0, v17

    iget-object v12, v0, Lcom/saterskog/cell_lab/Cell;->A:[Lcom/saterskog/cell_lab/u;

    aget-object v12, v12, v9

    iget-wide v0, v12, Lcom/saterskog/cell_lab/u;->b:D

    move-wide/from16 v22, v0

    const-wide/16 v24, 0x0

    sub-double v22, v22, v24

    .line 50629
    move-object/from16 v0, v17

    iget-object v12, v0, Lcom/saterskog/cell_lab/Cell;->A:[Lcom/saterskog/cell_lab/u;

    aget-object v12, v12, v10

    iget-wide v0, v12, Lcom/saterskog/cell_lab/u;->b:D

    move-wide/from16 v24, v0

    move-object/from16 v0, v17

    iget-object v12, v0, Lcom/saterskog/cell_lab/Cell;->A:[Lcom/saterskog/cell_lab/u;

    aget-object v12, v12, v10

    iget-wide v0, v12, Lcom/saterskog/cell_lab/u;->d:D

    move-wide/from16 v26, v0

    sub-double v24, v24, v26

    .line 50631
    move-object/from16 v0, v17

    iget-object v12, v0, Lcom/saterskog/cell_lab/Cell;->A:[Lcom/saterskog/cell_lab/u;

    aget-object v12, v12, v10

    iget-wide v0, v12, Lcom/saterskog/cell_lab/u;->a:D

    move-wide/from16 v26, v0

    const-wide/16 v28, 0x0

    sub-double v26, v26, v28

    .line 50632
    move-object/from16 v0, v17

    iget-object v12, v0, Lcom/saterskog/cell_lab/Cell;->A:[Lcom/saterskog/cell_lab/u;

    aget-object v12, v12, v10

    iget-wide v0, v12, Lcom/saterskog/cell_lab/u;->b:D

    move-wide/from16 v28, v0

    const-wide/16 v30, 0x0

    sub-double v28, v28, v30

    .line 50634
    mul-double v18, v18, v24

    mul-double v22, v22, v20

    sub-double v18, v18, v22

    .line 50635
    mul-double v22, v24, v26

    mul-double v20, v20, v28

    sub-double v20, v22, v20

    div-double v18, v20, v18

    .line 50637
    const-wide/16 v20, 0x0

    cmpl-double v12, v18, v20

    if-lez v12, :cond_f

    const-wide/high16 v20, 0x3ff0000000000000L    # 1.0

    cmpl-double v12, v20, v18

    if-lez v12, :cond_f

    .line 50638
    move-object/from16 v0, v17

    iget-object v12, v0, Lcom/saterskog/cell_lab/Cell;->A:[Lcom/saterskog/cell_lab/u;

    aget-object v12, v12, v9

    const/4 v15, 0x1

    iput-boolean v15, v12, Lcom/saterskog/cell_lab/u;->e:Z

    .line 50619
    :cond_f
    add-int/lit8 v10, v10, 0x1

    goto/16 :goto_d

    .line 50616
    :cond_10
    add-int/lit8 v9, v9, 0x1

    goto/16 :goto_c

    .line 50644
    :cond_11
    move-object/from16 v0, v17

    iget v9, v0, Lcom/saterskog/cell_lab/Cell;->B:I

    const/4 v10, 0x1

    if-le v9, v10, :cond_12

    .line 50645
    move-object/from16 v0, v17

    iget v9, v0, Lcom/saterskog/cell_lab/Cell;->B:I

    const/4 v10, 0x2

    if-ne v9, v10, :cond_14

    .line 50646
    move-object/from16 v0, v17

    iget-object v9, v0, Lcom/saterskog/cell_lab/Cell;->A:[Lcom/saterskog/cell_lab/u;

    const/4 v10, 0x0

    aget-object v9, v9, v10

    move-object/from16 v0, v17

    iget-object v10, v0, Lcom/saterskog/cell_lab/Cell;->A:[Lcom/saterskog/cell_lab/u;

    const/4 v12, 0x1

    aget-object v10, v10, v12

    invoke-virtual {v9, v10}, Lcom/saterskog/cell_lab/u;->a(Lcom/saterskog/cell_lab/u;)I

    move-result v9

    const/4 v10, 0x1

    if-ne v9, v10, :cond_12

    .line 50647
    move-object/from16 v0, v17

    iget-object v9, v0, Lcom/saterskog/cell_lab/Cell;->A:[Lcom/saterskog/cell_lab/u;

    const/4 v10, 0x0

    aget-object v9, v9, v10

    .line 50648
    move-object/from16 v0, v17

    iget-object v10, v0, Lcom/saterskog/cell_lab/Cell;->A:[Lcom/saterskog/cell_lab/u;

    const/4 v12, 0x0

    move-object/from16 v0, v17

    iget-object v15, v0, Lcom/saterskog/cell_lab/Cell;->A:[Lcom/saterskog/cell_lab/u;

    const/16 v18, 0x1

    aget-object v15, v15, v18

    aput-object v15, v10, v12

    .line 50649
    move-object/from16 v0, v17

    iget-object v10, v0, Lcom/saterskog/cell_lab/Cell;->A:[Lcom/saterskog/cell_lab/u;

    const/4 v12, 0x1

    aput-object v9, v10, v12

    .line 50085
    :cond_12
    :goto_e
    move-object/from16 v0, v17

    iget-object v9, v0, Lcom/saterskog/cell_lab/Cell;->J:[F

    const/4 v10, 0x0

    aget v9, v9, v10

    move-object/from16 v0, v17

    iget v10, v0, Lcom/saterskog/cell_lab/Cell;->X:F

    const v12, 0x3dcccccd    # 0.1f

    mul-float/2addr v10, v12

    add-float v18, v9, v10

    .line 50086
    move-object/from16 v0, v17

    iget-object v9, v0, Lcom/saterskog/cell_lab/Cell;->J:[F

    const/4 v10, 0x1

    aget v9, v9, v10

    move-object/from16 v0, v17

    iget v10, v0, Lcom/saterskog/cell_lab/Cell;->Y:F

    add-float v19, v9, v10

    .line 50087
    move-object/from16 v0, v17

    iget-object v9, v0, Lcom/saterskog/cell_lab/Cell;->J:[F

    const/4 v10, 0x2

    aget v20, v9, v10

    .line 50089
    sub-int v9, v8, v7

    const/16 v10, 0x7f2d

    if-le v9, v10, :cond_16

    .line 50091
    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/saterskog/cell_lab/CellWorld;->s:[[I

    aget-object v7, v7, v13

    move-object/from16 v0, p0

    iget-object v9, v0, Lcom/saterskog/cell_lab/CellWorld;->q:[[I

    aget-object v9, v9, v13

    aget v9, v9, v5

    sub-int v9, v8, v9

    aput v9, v7, v5

    .line 50092
    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/saterskog/cell_lab/CellWorld;->t:[[I

    aget-object v7, v7, v13

    move-object/from16 v0, p0

    iget-object v9, v0, Lcom/saterskog/cell_lab/CellWorld;->r:[[I

    aget-object v9, v9, v13

    aget v9, v9, v5

    sub-int v9, v6, v9

    aput v9, v7, v5

    .line 50094
    const/16 v7, 0xc9

    if-lt v5, v7, :cond_15

    const-string v4, "Too many bunches.."

    invoke-static {v4}, Lcom/saterskog/b/a;->a(Ljava/lang/String;)V

    .line 50559
    :cond_13
    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/saterskog/cell_lab/CellWorld;->s:[[I

    aget-object v4, v4, v13

    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/saterskog/cell_lab/CellWorld;->q:[[I

    aget-object v7, v7, v13

    aget v7, v7, v5

    sub-int v7, v8, v7

    aput v7, v4, v5

    .line 50560
    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/saterskog/cell_lab/CellWorld;->t:[[I

    aget-object v4, v4, v13

    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/saterskog/cell_lab/CellWorld;->r:[[I

    aget-object v7, v7, v13

    aget v7, v7, v5

    sub-int v7, v6, v7

    aput v7, v4, v5

    .line 50561
    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/saterskog/cell_lab/CellWorld;->u:[I

    add-int/lit8 v5, v5, 0x1

    aput v5, v4, v13

    .line 50562
    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/saterskog/cell_lab/CellWorld;->av:[I

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/saterskog/cell_lab/CellWorld;->aw:[I

    aget v5, v5, v13

    sub-int v5, v8, v5

    aput v5, v4, v13

    move v7, v8

    goto/16 :goto_7

    .line 50653
    :cond_14
    move-object/from16 v0, v17

    iget-object v9, v0, Lcom/saterskog/cell_lab/Cell;->A:[Lcom/saterskog/cell_lab/u;

    const/4 v10, 0x0

    move-object/from16 v0, v17

    iget v12, v0, Lcom/saterskog/cell_lab/Cell;->B:I

    invoke-static {v9, v10, v12}, Ljava/util/Arrays;->sort([Ljava/lang/Object;II)V

    goto/16 :goto_e

    .line 50096
    :cond_15
    add-int/lit8 v5, v5, 0x1

    .line 50097
    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/saterskog/cell_lab/CellWorld;->q:[[I

    aget-object v7, v7, v13

    aput v8, v7, v5

    .line 50098
    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/saterskog/cell_lab/CellWorld;->r:[[I

    aget-object v7, v7, v13

    aput v6, v7, v5

    move v7, v8

    .line 50103
    :cond_16
    const/4 v10, 0x0

    .line 50104
    const/4 v9, 0x0

    .line 50105
    move-object/from16 v0, v17

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->k:D

    move-wide/from16 v22, v0

    move-wide/from16 v0, v22

    double-to-float v0, v0

    move/from16 v21, v0

    .line 50106
    if-nez v14, :cond_18

    .line 50108
    move-object/from16 v0, v17

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->k:D

    move-wide/from16 v22, v0

    iget v10, v11, Lcom/saterskog/cell_lab/Gene;->d:F

    move-object/from16 v0, v17

    iget-boolean v9, v0, Lcom/saterskog/cell_lab/Cell;->y:Z

    if-eqz v9, :cond_17

    const/4 v9, -0x1

    :goto_f
    int-to-float v9, v9

    mul-float/2addr v9, v10

    float-to-double v0, v9

    move-wide/from16 v24, v0

    add-double v22, v22, v24

    move-wide/from16 v0, v22

    double-to-float v10, v0

    .line 50109
    move-object/from16 v0, v17

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->d:D

    move-wide/from16 v22, v0

    const-wide/high16 v24, 0x4000000000000000L    # 2.0

    mul-double v22, v22, v24

    const-wide/high16 v24, 0x3fe0000000000000L    # 0.5

    iget v9, v11, Lcom/saterskog/cell_lab/Gene;->c:F

    float-to-double v0, v9

    move-wide/from16 v26, v0

    sub-double v24, v24, v26

    mul-double v22, v22, v24

    move-wide/from16 v0, v22

    double-to-float v9, v0

    .line 50140
    :goto_10
    move-object/from16 v0, v17

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->b:D

    move-wide/from16 v22, v0

    move-wide/from16 v0, v22

    double-to-float v0, v0

    move/from16 v22, v0

    .line 50141
    move-object/from16 v0, v17

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->c:D

    move-wide/from16 v24, v0

    move-wide/from16 v0, v24

    double-to-float v0, v0

    move/from16 v23, v0

    .line 50142
    move-object/from16 v0, v17

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->d:D

    move-wide/from16 v24, v0

    move-wide/from16 v0, v24

    double-to-float v0, v0

    move/from16 v24, v0

    .line 50144
    move-object/from16 v0, v17

    iget v11, v0, Lcom/saterskog/cell_lab/Cell;->B:I

    if-nez v11, :cond_19

    .line 50145
    move-object/from16 v0, p0

    iget-object v11, v0, Lcom/saterskog/cell_lab/CellWorld;->ad:[F

    mul-int/lit8 v12, v8, 0x2

    aput v24, v11, v12

    .line 50146
    move-object/from16 v0, p0

    iget-object v11, v0, Lcom/saterskog/cell_lab/CellWorld;->ad:[F

    mul-int/lit8 v12, v8, 0x2

    add-int/lit8 v12, v12, 0x1

    aput v24, v11, v12

    .line 50147
    move-object/from16 v0, p0

    iget-object v11, v0, Lcom/saterskog/cell_lab/CellWorld;->ad:[F

    mul-int/lit8 v12, v8, 0x2

    add-int/lit8 v12, v12, 0x2

    aput v24, v11, v12

    .line 50148
    move-object/from16 v0, p0

    iget-object v11, v0, Lcom/saterskog/cell_lab/CellWorld;->ad:[F

    mul-int/lit8 v12, v8, 0x2

    add-int/lit8 v12, v12, 0x3

    move/from16 v0, v24

    neg-float v15, v0

    aput v15, v11, v12

    .line 50149
    move-object/from16 v0, p0

    iget-object v11, v0, Lcom/saterskog/cell_lab/CellWorld;->ad:[F

    mul-int/lit8 v12, v8, 0x2

    add-int/lit8 v12, v12, 0x4

    move/from16 v0, v24

    neg-float v15, v0

    aput v15, v11, v12

    .line 50150
    move-object/from16 v0, p0

    iget-object v11, v0, Lcom/saterskog/cell_lab/CellWorld;->ad:[F

    mul-int/lit8 v12, v8, 0x2

    add-int/lit8 v12, v12, 0x5

    move/from16 v0, v24

    neg-float v15, v0

    aput v15, v11, v12

    .line 50152
    move-object/from16 v0, p0

    iget-object v11, v0, Lcom/saterskog/cell_lab/CellWorld;->ad:[F

    mul-int/lit8 v12, v8, 0x2

    add-int/lit8 v12, v12, 0x6

    move/from16 v0, v24

    neg-float v15, v0

    aput v15, v11, v12

    .line 50153
    move-object/from16 v0, p0

    iget-object v11, v0, Lcom/saterskog/cell_lab/CellWorld;->ad:[F

    mul-int/lit8 v12, v8, 0x2

    add-int/lit8 v12, v12, 0x7

    aput v24, v11, v12

    .line 50155
    move-object/from16 v0, p0

    iget-object v11, v0, Lcom/saterskog/cell_lab/CellWorld;->ae:[F

    mul-int/lit8 v12, v8, 0x4

    aput v10, v11, v12

    .line 50156
    move-object/from16 v0, p0

    iget-object v11, v0, Lcom/saterskog/cell_lab/CellWorld;->ae:[F

    mul-int/lit8 v12, v8, 0x4

    add-int/lit8 v12, v12, 0x1

    const/4 v15, 0x0

    aput v15, v11, v12

    .line 50157
    move-object/from16 v0, p0

    iget-object v11, v0, Lcom/saterskog/cell_lab/CellWorld;->ae:[F

    mul-int/lit8 v12, v8, 0x4

    add-int/lit8 v12, v12, 0x2

    aput v21, v11, v12

    .line 50158
    move-object/from16 v0, p0

    iget-object v11, v0, Lcom/saterskog/cell_lab/CellWorld;->ae:[F

    mul-int/lit8 v12, v8, 0x4

    add-int/lit8 v12, v12, 0x3

    aput v9, v11, v12

    .line 50160
    move-object/from16 v0, p0

    iget-object v11, v0, Lcom/saterskog/cell_lab/CellWorld;->ae:[F

    mul-int/lit8 v12, v8, 0x4

    add-int/lit8 v12, v12, 0x4

    aput v10, v11, v12

    .line 50161
    move-object/from16 v0, p0

    iget-object v11, v0, Lcom/saterskog/cell_lab/CellWorld;->ae:[F

    mul-int/lit8 v12, v8, 0x4

    add-int/lit8 v12, v12, 0x5

    const/4 v15, 0x0

    aput v15, v11, v12

    .line 50162
    move-object/from16 v0, p0

    iget-object v11, v0, Lcom/saterskog/cell_lab/CellWorld;->ae:[F

    mul-int/lit8 v12, v8, 0x4

    add-int/lit8 v12, v12, 0x6

    aput v21, v11, v12

    .line 50163
    move-object/from16 v0, p0

    iget-object v11, v0, Lcom/saterskog/cell_lab/CellWorld;->ae:[F

    mul-int/lit8 v12, v8, 0x4

    add-int/lit8 v12, v12, 0x7

    aput v9, v11, v12

    .line 50165
    move-object/from16 v0, p0

    iget-object v11, v0, Lcom/saterskog/cell_lab/CellWorld;->ae:[F

    mul-int/lit8 v12, v8, 0x4

    add-int/lit8 v12, v12, 0x8

    aput v10, v11, v12

    .line 50166
    move-object/from16 v0, p0

    iget-object v11, v0, Lcom/saterskog/cell_lab/CellWorld;->ae:[F

    mul-int/lit8 v12, v8, 0x4

    add-int/lit8 v12, v12, 0x9

    const/4 v15, 0x0

    aput v15, v11, v12

    .line 50167
    move-object/from16 v0, p0

    iget-object v11, v0, Lcom/saterskog/cell_lab/CellWorld;->ae:[F

    mul-int/lit8 v12, v8, 0x4

    add-int/lit8 v12, v12, 0xa

    aput v21, v11, v12

    .line 50168
    move-object/from16 v0, p0

    iget-object v11, v0, Lcom/saterskog/cell_lab/CellWorld;->ae:[F

    mul-int/lit8 v12, v8, 0x4

    add-int/lit8 v12, v12, 0xb

    aput v9, v11, v12

    .line 50170
    move-object/from16 v0, p0

    iget-object v11, v0, Lcom/saterskog/cell_lab/CellWorld;->ae:[F

    mul-int/lit8 v12, v8, 0x4

    add-int/lit8 v12, v12, 0xc

    aput v10, v11, v12

    .line 50171
    move-object/from16 v0, p0

    iget-object v10, v0, Lcom/saterskog/cell_lab/CellWorld;->ae:[F

    mul-int/lit8 v11, v8, 0x4

    add-int/lit8 v11, v11, 0xd

    const/4 v12, 0x0

    aput v12, v10, v11

    .line 50172
    move-object/from16 v0, p0

    iget-object v10, v0, Lcom/saterskog/cell_lab/CellWorld;->ae:[F

    mul-int/lit8 v11, v8, 0x4

    add-int/lit8 v11, v11, 0xe

    aput v21, v10, v11

    .line 50173
    move-object/from16 v0, p0

    iget-object v10, v0, Lcom/saterskog/cell_lab/CellWorld;->ae:[F

    mul-int/lit8 v11, v8, 0x4

    add-int/lit8 v11, v11, 0xf

    aput v9, v10, v11

    .line 50175
    move-object/from16 v0, p0

    iget-object v9, v0, Lcom/saterskog/cell_lab/CellWorld;->af:[F

    mul-int/lit8 v10, v8, 0x2

    add-int/lit8 v10, v10, 0x0

    aput v22, v9, v10

    .line 50176
    move-object/from16 v0, p0

    iget-object v9, v0, Lcom/saterskog/cell_lab/CellWorld;->af:[F

    mul-int/lit8 v10, v8, 0x2

    add-int/lit8 v10, v10, 0x1

    aput v23, v9, v10

    .line 50179
    move-object/from16 v0, p0

    iget-object v9, v0, Lcom/saterskog/cell_lab/CellWorld;->af:[F

    mul-int/lit8 v10, v8, 0x2

    add-int/lit8 v10, v10, 0x2

    aput v22, v9, v10

    .line 50180
    move-object/from16 v0, p0

    iget-object v9, v0, Lcom/saterskog/cell_lab/CellWorld;->af:[F

    mul-int/lit8 v10, v8, 0x2

    add-int/lit8 v10, v10, 0x3

    aput v23, v9, v10

    .line 50183
    move-object/from16 v0, p0

    iget-object v9, v0, Lcom/saterskog/cell_lab/CellWorld;->af:[F

    mul-int/lit8 v10, v8, 0x2

    add-int/lit8 v10, v10, 0x4

    aput v22, v9, v10

    .line 50184
    move-object/from16 v0, p0

    iget-object v9, v0, Lcom/saterskog/cell_lab/CellWorld;->af:[F

    mul-int/lit8 v10, v8, 0x2

    add-int/lit8 v10, v10, 0x5

    aput v23, v9, v10

    .line 50186
    move-object/from16 v0, p0

    iget-object v9, v0, Lcom/saterskog/cell_lab/CellWorld;->af:[F

    mul-int/lit8 v10, v8, 0x2

    add-int/lit8 v10, v10, 0x6

    aput v22, v9, v10

    .line 50187
    move-object/from16 v0, p0

    iget-object v9, v0, Lcom/saterskog/cell_lab/CellWorld;->af:[F

    mul-int/lit8 v10, v8, 0x2

    add-int/lit8 v10, v10, 0x7

    aput v23, v9, v10

    .line 50191
    move-object/from16 v0, p0

    iget-object v9, v0, Lcom/saterskog/cell_lab/CellWorld;->ag:[F

    mul-int/lit8 v10, v8, 0x4

    aput v18, v9, v10

    .line 50192
    move-object/from16 v0, p0

    iget-object v9, v0, Lcom/saterskog/cell_lab/CellWorld;->ag:[F

    mul-int/lit8 v10, v8, 0x4

    add-int/lit8 v10, v10, 0x1

    aput v19, v9, v10

    .line 50193
    move-object/from16 v0, p0

    iget-object v9, v0, Lcom/saterskog/cell_lab/CellWorld;->ag:[F

    mul-int/lit8 v10, v8, 0x4

    add-int/lit8 v10, v10, 0x2

    aput v20, v9, v10

    .line 50194
    move-object/from16 v0, p0

    iget-object v9, v0, Lcom/saterskog/cell_lab/CellWorld;->ag:[F

    mul-int/lit8 v10, v8, 0x4

    add-int/lit8 v10, v10, 0x3

    aput v24, v9, v10

    .line 50196
    move-object/from16 v0, p0

    iget-object v9, v0, Lcom/saterskog/cell_lab/CellWorld;->ag:[F

    mul-int/lit8 v10, v8, 0x4

    add-int/lit8 v10, v10, 0x4

    aput v18, v9, v10

    .line 50197
    move-object/from16 v0, p0

    iget-object v9, v0, Lcom/saterskog/cell_lab/CellWorld;->ag:[F

    mul-int/lit8 v10, v8, 0x4

    add-int/lit8 v10, v10, 0x5

    aput v19, v9, v10

    .line 50198
    move-object/from16 v0, p0

    iget-object v9, v0, Lcom/saterskog/cell_lab/CellWorld;->ag:[F

    mul-int/lit8 v10, v8, 0x4

    add-int/lit8 v10, v10, 0x6

    aput v20, v9, v10

    .line 50199
    move-object/from16 v0, p0

    iget-object v9, v0, Lcom/saterskog/cell_lab/CellWorld;->ag:[F

    mul-int/lit8 v10, v8, 0x4

    add-int/lit8 v10, v10, 0x7

    aput v24, v9, v10

    .line 50201
    move-object/from16 v0, p0

    iget-object v9, v0, Lcom/saterskog/cell_lab/CellWorld;->ag:[F

    mul-int/lit8 v10, v8, 0x4

    add-int/lit8 v10, v10, 0x8

    aput v18, v9, v10

    .line 50202
    move-object/from16 v0, p0

    iget-object v9, v0, Lcom/saterskog/cell_lab/CellWorld;->ag:[F

    mul-int/lit8 v10, v8, 0x4

    add-int/lit8 v10, v10, 0x9

    aput v19, v9, v10

    .line 50203
    move-object/from16 v0, p0

    iget-object v9, v0, Lcom/saterskog/cell_lab/CellWorld;->ag:[F

    mul-int/lit8 v10, v8, 0x4

    add-int/lit8 v10, v10, 0xa

    aput v20, v9, v10

    .line 50204
    move-object/from16 v0, p0

    iget-object v9, v0, Lcom/saterskog/cell_lab/CellWorld;->ag:[F

    mul-int/lit8 v10, v8, 0x4

    add-int/lit8 v10, v10, 0xb

    aput v24, v9, v10

    .line 50206
    move-object/from16 v0, p0

    iget-object v9, v0, Lcom/saterskog/cell_lab/CellWorld;->ag:[F

    mul-int/lit8 v10, v8, 0x4

    add-int/lit8 v10, v10, 0xc

    aput v18, v9, v10

    .line 50207
    move-object/from16 v0, p0

    iget-object v9, v0, Lcom/saterskog/cell_lab/CellWorld;->ag:[F

    mul-int/lit8 v10, v8, 0x4

    add-int/lit8 v10, v10, 0xd

    aput v19, v9, v10

    .line 50208
    move-object/from16 v0, p0

    iget-object v9, v0, Lcom/saterskog/cell_lab/CellWorld;->ag:[F

    mul-int/lit8 v10, v8, 0x4

    add-int/lit8 v10, v10, 0xe

    aput v20, v9, v10

    .line 50209
    move-object/from16 v0, p0

    iget-object v9, v0, Lcom/saterskog/cell_lab/CellWorld;->ag:[F

    mul-int/lit8 v10, v8, 0x4

    add-int/lit8 v10, v10, 0xf

    aput v24, v9, v10

    .line 50211
    move-object/from16 v0, p0

    iget-object v9, v0, Lcom/saterskog/cell_lab/CellWorld;->aq:[S

    add-int/lit8 v10, v6, 0x1

    sub-int v11, v8, v7

    add-int/lit8 v11, v11, 0x0

    int-to-short v11, v11

    aput-short v11, v9, v6

    .line 50212
    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/saterskog/cell_lab/CellWorld;->aq:[S

    add-int/lit8 v9, v10, 0x1

    sub-int v11, v8, v7

    add-int/lit8 v11, v11, 0x1

    int-to-short v11, v11

    aput-short v11, v6, v10

    .line 50213
    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/saterskog/cell_lab/CellWorld;->aq:[S

    add-int/lit8 v10, v9, 0x1

    sub-int v11, v8, v7

    add-int/lit8 v11, v11, 0x2

    int-to-short v11, v11

    aput-short v11, v6, v9

    .line 50215
    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/saterskog/cell_lab/CellWorld;->aq:[S

    add-int/lit8 v9, v10, 0x1

    sub-int v11, v8, v7

    add-int/lit8 v11, v11, 0x0

    int-to-short v11, v11

    aput-short v11, v6, v10

    .line 50216
    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/saterskog/cell_lab/CellWorld;->aq:[S

    add-int/lit8 v10, v9, 0x1

    sub-int v11, v8, v7

    add-int/lit8 v11, v11, 0x2

    int-to-short v11, v11

    aput-short v11, v6, v9

    .line 50217
    move-object/from16 v0, p0

    iget-object v9, v0, Lcom/saterskog/cell_lab/CellWorld;->aq:[S

    add-int/lit8 v6, v10, 0x1

    sub-int v11, v8, v7

    add-int/lit8 v11, v11, 0x3

    int-to-short v11, v11

    aput-short v11, v9, v10

    .line 50218
    add-int/lit8 v8, v8, 0x4

    .line 50064
    :goto_11
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_8

    .line 50108
    :cond_17
    const/4 v9, 0x1

    goto/16 :goto_f

    .line 50112
    :cond_18
    sget-object v11, Lcom/saterskog/cell_lab/CellWorld$2;->a:[I

    invoke-virtual {v14}, Lcom/saterskog/cell_lab/h;->ordinal()I

    move-result v12

    aget v11, v11, v12

    packed-switch v11, :pswitch_data_0

    goto/16 :goto_10

    .line 50114
    :pswitch_0
    move-object/from16 v0, v17

    iget v10, v0, Lcom/saterskog/cell_lab/Cell;->S:F

    const v11, 0x3fe66666    # 1.8f

    div-float/2addr v10, v11

    .line 50115
    goto/16 :goto_10

    .line 50117
    :pswitch_1
    move-object/from16 v0, v17

    iget v10, v0, Lcom/saterskog/cell_lab/Cell;->r:F

    goto/16 :goto_10

    .line 50121
    :pswitch_2
    move-object/from16 v0, v17

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->m:D

    move-wide/from16 v22, v0

    move-wide/from16 v0, v22

    double-to-float v9, v0

    .line 50122
    goto/16 :goto_10

    .line 50126
    :pswitch_3
    move-object/from16 v0, v17

    iget-object v9, v0, Lcom/saterskog/cell_lab/Cell;->V:[F

    const/4 v10, 0x0

    aget v9, v9, v10

    const v10, 0x3d4ccccd    # 0.05f

    mul-float/2addr v10, v9

    .line 50127
    move-object/from16 v0, v17

    iget-object v9, v0, Lcom/saterskog/cell_lab/Cell;->V:[F

    const/4 v11, 0x1

    aget v9, v9, v11

    const v11, 0x3d4ccccd    # 0.05f

    mul-float/2addr v9, v11

    .line 50128
    goto/16 :goto_10

    .line 50130
    :pswitch_4
    move-object/from16 v0, v17

    iget v9, v0, Lcom/saterskog/cell_lab/Cell;->aa:F

    neg-float v10, v9

    .line 50131
    move-object/from16 v0, v17

    iget v9, v0, Lcom/saterskog/cell_lab/Cell;->ab:F

    goto/16 :goto_10

    .line 50134
    :pswitch_5
    const/4 v9, 0x0

    const/4 v10, 0x5

    const/4 v11, 0x0

    move-object/from16 v0, v17

    invoke-virtual {v0, v10, v11}, Lcom/saterskog/cell_lab/Cell;->a(II)F

    move-result v10

    const/high16 v11, 0x3f000000    # 0.5f

    add-float/2addr v10, v11

    invoke-static {v9, v10}, Ljava/lang/Math;->max(FF)F

    move-result v9

    .line 50135
    const/4 v10, 0x0

    const/4 v11, 0x6

    const/4 v12, 0x0

    move-object/from16 v0, v17

    invoke-virtual {v0, v11, v12}, Lcom/saterskog/cell_lab/Cell;->a(II)F

    move-result v11

    const/high16 v12, 0x3f000000    # 0.5f

    add-float/2addr v11, v12

    invoke-static {v10, v11}, Ljava/lang/Math;->max(FF)F

    move-result v11

    .line 50136
    const/high16 v10, 0x3f800000    # 1.0f

    mul-float v12, v11, v11

    add-float/2addr v10, v12

    div-float v10, v9, v10

    const v12, 0x40490fdb    # (float)Math.PI

    mul-float/2addr v10, v12

    .line 50137
    const/high16 v12, 0x3f800000    # 1.0f

    mul-float/2addr v9, v9

    add-float/2addr v9, v12

    div-float v9, v11, v9

    const v11, 0x40490fdb    # (float)Math.PI

    mul-float/2addr v9, v11

    goto/16 :goto_10

    .line 50220
    :cond_19
    sub-int v11, v8, v7

    int-to-short v0, v11

    move/from16 v25, v0

    .line 50221
    move-object/from16 v0, p0

    iget-object v11, v0, Lcom/saterskog/cell_lab/CellWorld;->ad:[F

    mul-int/lit8 v12, v8, 0x2

    const/4 v15, 0x0

    aput v15, v11, v12

    .line 50222
    move-object/from16 v0, p0

    iget-object v11, v0, Lcom/saterskog/cell_lab/CellWorld;->ad:[F

    mul-int/lit8 v12, v8, 0x2

    add-int/lit8 v12, v12, 0x1

    const/4 v15, 0x0

    aput v15, v11, v12

    .line 50225
    move-object/from16 v0, p0

    iget-object v11, v0, Lcom/saterskog/cell_lab/CellWorld;->ae:[F

    mul-int/lit8 v12, v8, 0x4

    aput v10, v11, v12

    .line 50226
    move-object/from16 v0, p0

    iget-object v11, v0, Lcom/saterskog/cell_lab/CellWorld;->ae:[F

    mul-int/lit8 v12, v8, 0x4

    add-int/lit8 v12, v12, 0x1

    const/4 v15, 0x0

    aput v15, v11, v12

    .line 50227
    move-object/from16 v0, p0

    iget-object v11, v0, Lcom/saterskog/cell_lab/CellWorld;->ae:[F

    mul-int/lit8 v12, v8, 0x4

    add-int/lit8 v12, v12, 0x2

    aput v21, v11, v12

    .line 50228
    move-object/from16 v0, p0

    iget-object v11, v0, Lcom/saterskog/cell_lab/CellWorld;->ae:[F

    mul-int/lit8 v12, v8, 0x4

    add-int/lit8 v12, v12, 0x3

    aput v9, v11, v12

    .line 50231
    move-object/from16 v0, p0

    iget-object v11, v0, Lcom/saterskog/cell_lab/CellWorld;->af:[F

    mul-int/lit8 v12, v8, 0x2

    add-int/lit8 v12, v12, 0x0

    aput v22, v11, v12

    .line 50232
    move-object/from16 v0, p0

    iget-object v11, v0, Lcom/saterskog/cell_lab/CellWorld;->af:[F

    mul-int/lit8 v12, v8, 0x2

    add-int/lit8 v12, v12, 0x1

    aput v23, v11, v12

    .line 50234
    move-object/from16 v0, p0

    iget-object v11, v0, Lcom/saterskog/cell_lab/CellWorld;->ag:[F

    mul-int/lit8 v12, v8, 0x4

    aput v18, v11, v12

    .line 50235
    move-object/from16 v0, p0

    iget-object v11, v0, Lcom/saterskog/cell_lab/CellWorld;->ag:[F

    mul-int/lit8 v12, v8, 0x4

    add-int/lit8 v12, v12, 0x1

    aput v19, v11, v12

    .line 50236
    move-object/from16 v0, p0

    iget-object v11, v0, Lcom/saterskog/cell_lab/CellWorld;->ag:[F

    mul-int/lit8 v12, v8, 0x4

    add-int/lit8 v12, v12, 0x2

    aput v20, v11, v12

    .line 50237
    move-object/from16 v0, p0

    iget-object v11, v0, Lcom/saterskog/cell_lab/CellWorld;->ag:[F

    mul-int/lit8 v12, v8, 0x4

    add-int/lit8 v12, v12, 0x3

    aput v24, v11, v12

    .line 50239
    add-int/lit8 v11, v8, 0x1

    .line 50241
    const/4 v8, 0x0

    move/from16 v36, v8

    move v8, v11

    move/from16 v11, v36

    :goto_12
    move-object/from16 v0, v17

    iget v12, v0, Lcom/saterskog/cell_lab/Cell;->B:I

    if-ge v11, v12, :cond_20

    .line 50242
    move-object/from16 v0, v17

    iget-object v12, v0, Lcom/saterskog/cell_lab/Cell;->A:[Lcom/saterskog/cell_lab/u;

    aget-object v12, v12, v11

    iget-boolean v12, v12, Lcom/saterskog/cell_lab/u;->e:Z

    if-nez v12, :cond_1f

    .line 50245
    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/saterskog/cell_lab/CellWorld;->ad:[F

    mul-int/lit8 v15, v8, 0x2

    add-int/lit8 v15, v15, 0x0

    move-object/from16 v0, v17

    iget-object v0, v0, Lcom/saterskog/cell_lab/Cell;->A:[Lcom/saterskog/cell_lab/u;

    move-object/from16 v26, v0

    aget-object v26, v26, v11

    move-object/from16 v0, v26

    iget-wide v0, v0, Lcom/saterskog/cell_lab/u;->a:D

    move-wide/from16 v26, v0

    move-wide/from16 v0, v26

    double-to-float v0, v0

    move/from16 v26, v0

    aput v26, v12, v15

    .line 50246
    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/saterskog/cell_lab/CellWorld;->ad:[F

    mul-int/lit8 v15, v8, 0x2

    add-int/lit8 v15, v15, 0x1

    move-object/from16 v0, v17

    iget-object v0, v0, Lcom/saterskog/cell_lab/Cell;->A:[Lcom/saterskog/cell_lab/u;

    move-object/from16 v26, v0

    aget-object v26, v26, v11

    move-object/from16 v0, v26

    iget-wide v0, v0, Lcom/saterskog/cell_lab/u;->b:D

    move-wide/from16 v26, v0

    move-wide/from16 v0, v26

    double-to-float v0, v0

    move/from16 v26, v0

    aput v26, v12, v15

    .line 50251
    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/saterskog/cell_lab/CellWorld;->ae:[F

    mul-int/lit8 v15, v8, 0x4

    add-int/lit8 v15, v15, 0x0

    aput v10, v12, v15

    .line 50252
    if-nez v14, :cond_1b

    .line 50253
    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/saterskog/cell_lab/CellWorld;->ae:[F

    mul-int/lit8 v15, v8, 0x4

    add-int/lit8 v15, v15, 0x1

    const/16 v26, 0x0

    aput v26, v12, v15

    .line 50256
    :goto_13
    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/saterskog/cell_lab/CellWorld;->ae:[F

    mul-int/lit8 v15, v8, 0x4

    add-int/lit8 v15, v15, 0x2

    aput v21, v12, v15

    .line 50257
    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/saterskog/cell_lab/CellWorld;->ae:[F

    mul-int/lit8 v15, v8, 0x4

    add-int/lit8 v15, v15, 0x3

    aput v9, v12, v15

    .line 50266
    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/saterskog/cell_lab/CellWorld;->af:[F

    mul-int/lit8 v15, v8, 0x2

    add-int/lit8 v15, v15, 0x0

    aput v22, v12, v15

    .line 50267
    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/saterskog/cell_lab/CellWorld;->af:[F

    mul-int/lit8 v15, v8, 0x2

    add-int/lit8 v15, v15, 0x1

    aput v23, v12, v15

    .line 50277
    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/saterskog/cell_lab/CellWorld;->ag:[F

    mul-int/lit8 v15, v8, 0x4

    add-int/lit8 v15, v15, 0x0

    aput v18, v12, v15

    .line 50278
    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/saterskog/cell_lab/CellWorld;->ag:[F

    mul-int/lit8 v15, v8, 0x4

    add-int/lit8 v15, v15, 0x1

    aput v19, v12, v15

    .line 50279
    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/saterskog/cell_lab/CellWorld;->ag:[F

    mul-int/lit8 v15, v8, 0x4

    add-int/lit8 v15, v15, 0x2

    aput v20, v12, v15

    .line 50280
    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/saterskog/cell_lab/CellWorld;->ag:[F

    mul-int/lit8 v15, v8, 0x4

    add-int/lit8 v15, v15, 0x3

    aput v24, v12, v15

    .line 50287
    add-int/lit8 v8, v8, 0x1

    .line 50289
    move-object/from16 v0, v17

    iget-object v12, v0, Lcom/saterskog/cell_lab/Cell;->A:[Lcom/saterskog/cell_lab/u;

    aget-object v12, v12, v11

    iget-boolean v12, v12, Lcom/saterskog/cell_lab/u;->f:Z

    if-nez v12, :cond_1f

    .line 50294
    add-int/lit8 v12, v11, 0x1

    move-object/from16 v0, v17

    iget v15, v0, Lcom/saterskog/cell_lab/Cell;->B:I

    rem-int/2addr v12, v15

    .line 50295
    move-object/from16 v0, v17

    iget-object v15, v0, Lcom/saterskog/cell_lab/Cell;->A:[Lcom/saterskog/cell_lab/u;

    aget-object v15, v15, v12

    iget-boolean v15, v15, Lcom/saterskog/cell_lab/u;->e:Z

    if-eqz v15, :cond_1a

    .line 50296
    const/4 v12, 0x0

    .line 50297
    :cond_1a
    move-object/from16 v0, v17

    iget-object v15, v0, Lcom/saterskog/cell_lab/Cell;->A:[Lcom/saterskog/cell_lab/u;

    aget-object v15, v15, v11

    iget-wide v0, v15, Lcom/saterskog/cell_lab/u;->c:D

    move-wide/from16 v26, v0

    move-object/from16 v0, v17

    iget-object v15, v0, Lcom/saterskog/cell_lab/Cell;->A:[Lcom/saterskog/cell_lab/u;

    aget-object v15, v15, v12

    iget-wide v0, v15, Lcom/saterskog/cell_lab/u;->b:D

    move-wide/from16 v28, v0

    mul-double v26, v26, v28

    move-object/from16 v0, v17

    iget-object v15, v0, Lcom/saterskog/cell_lab/Cell;->A:[Lcom/saterskog/cell_lab/u;

    aget-object v15, v15, v12

    iget-wide v0, v15, Lcom/saterskog/cell_lab/u;->a:D

    move-wide/from16 v28, v0

    move-object/from16 v0, v17

    iget-object v15, v0, Lcom/saterskog/cell_lab/Cell;->A:[Lcom/saterskog/cell_lab/u;

    aget-object v15, v15, v11

    iget-wide v0, v15, Lcom/saterskog/cell_lab/u;->d:D

    move-wide/from16 v30, v0

    mul-double v28, v28, v30

    sub-double v26, v26, v28

    const-wide/16 v28, 0x0

    cmpl-double v15, v26, v28

    if-lez v15, :cond_1d

    .line 50298
    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/saterskog/cell_lab/CellWorld;->v:[D

    const/16 v26, 0x0

    move-object/from16 v0, v17

    iget-object v0, v0, Lcom/saterskog/cell_lab/Cell;->A:[Lcom/saterskog/cell_lab/u;

    move-object/from16 v27, v0

    aget-object v27, v27, v11

    move-object/from16 v0, v27

    iget-wide v0, v0, Lcom/saterskog/cell_lab/u;->c:D

    move-wide/from16 v28, v0

    aput-wide v28, v15, v26

    .line 50301
    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/saterskog/cell_lab/CellWorld;->v:[D

    const/16 v26, 0x3

    move-object/from16 v0, v17

    iget-object v0, v0, Lcom/saterskog/cell_lab/Cell;->A:[Lcom/saterskog/cell_lab/u;

    move-object/from16 v27, v0

    aget-object v27, v27, v12

    move-object/from16 v0, v27

    iget-wide v0, v0, Lcom/saterskog/cell_lab/u;->a:D

    move-wide/from16 v28, v0

    aput-wide v28, v15, v26

    .line 50302
    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/saterskog/cell_lab/CellWorld;->w:[D

    const/16 v26, 0x0

    move-object/from16 v0, v17

    iget-object v0, v0, Lcom/saterskog/cell_lab/Cell;->A:[Lcom/saterskog/cell_lab/u;

    move-object/from16 v27, v0

    aget-object v27, v27, v11

    move-object/from16 v0, v27

    iget-wide v0, v0, Lcom/saterskog/cell_lab/u;->d:D

    move-wide/from16 v28, v0

    aput-wide v28, v15, v26

    .line 50305
    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/saterskog/cell_lab/CellWorld;->w:[D

    const/16 v26, 0x3

    move-object/from16 v0, v17

    iget-object v0, v0, Lcom/saterskog/cell_lab/Cell;->A:[Lcom/saterskog/cell_lab/u;

    move-object/from16 v27, v0

    aget-object v12, v27, v12

    iget-wide v0, v12, Lcom/saterskog/cell_lab/u;->b:D

    move-wide/from16 v28, v0

    aput-wide v28, v15, v26

    .line 50306
    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/saterskog/cell_lab/CellWorld;->v:[D

    const/4 v15, 0x0

    aget-wide v26, v12, v15

    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/saterskog/cell_lab/CellWorld;->v:[D

    const/4 v15, 0x3

    aget-wide v28, v12, v15

    add-double v26, v26, v28

    .line 50307
    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/saterskog/cell_lab/CellWorld;->w:[D

    const/4 v15, 0x0

    aget-wide v28, v12, v15

    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/saterskog/cell_lab/CellWorld;->w:[D

    const/4 v15, 0x3

    aget-wide v30, v12, v15

    add-double v28, v28, v30

    .line 50308
    move-object/from16 v0, v17

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->d:D

    move-wide/from16 v30, v0

    mul-double v32, v26, v26

    mul-double v34, v28, v28

    add-double v32, v32, v34

    invoke-static/range {v32 .. v33}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v32

    div-double v30, v30, v32

    .line 50309
    mul-double v26, v26, v30

    .line 50310
    mul-double v28, v28, v30

    .line 50311
    move-object/from16 v0, v17

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->d:D

    move-wide/from16 v30, v0

    move-object/from16 v0, v17

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->d:D

    move-wide/from16 v32, v0

    mul-double v30, v30, v32

    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/saterskog/cell_lab/CellWorld;->w:[D

    const/4 v15, 0x0

    aget-wide v32, v12, v15

    mul-double v32, v32, v26

    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/saterskog/cell_lab/CellWorld;->v:[D

    const/4 v15, 0x0

    aget-wide v34, v12, v15

    mul-double v34, v34, v28

    sub-double v32, v32, v34

    div-double v30, v30, v32

    .line 50312
    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/saterskog/cell_lab/CellWorld;->v:[D

    const/4 v15, 0x1

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->w:[D

    move-object/from16 v32, v0

    const/16 v33, 0x0

    aget-wide v32, v32, v33

    sub-double v32, v32, v28

    mul-double v32, v32, v30

    aput-wide v32, v12, v15

    .line 50313
    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/saterskog/cell_lab/CellWorld;->w:[D

    const/4 v15, 0x1

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->v:[D

    move-object/from16 v32, v0

    const/16 v33, 0x0

    aget-wide v32, v32, v33

    sub-double v32, v32, v26

    move-wide/from16 v0, v32

    neg-double v0, v0

    move-wide/from16 v32, v0

    mul-double v32, v32, v30

    aput-wide v32, v12, v15

    .line 50314
    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/saterskog/cell_lab/CellWorld;->v:[D

    const/4 v15, 0x2

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->w:[D

    move-object/from16 v32, v0

    const/16 v33, 0x3

    aget-wide v32, v32, v33

    sub-double v28, v32, v28

    move-wide/from16 v0, v28

    neg-double v0, v0

    move-wide/from16 v28, v0

    mul-double v28, v28, v30

    aput-wide v28, v12, v15

    .line 50315
    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/saterskog/cell_lab/CellWorld;->w:[D

    const/4 v15, 0x2

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->v:[D

    move-object/from16 v28, v0

    const/16 v29, 0x3

    aget-wide v28, v28, v29

    sub-double v26, v28, v26

    mul-double v26, v26, v30

    aput-wide v26, v12, v15

    .line 50345
    const/4 v12, 0x0

    :goto_14
    const/4 v15, 0x3

    if-ge v12, v15, :cond_1f

    .line 50348
    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/saterskog/cell_lab/CellWorld;->ad:[F

    mul-int/lit8 v26, v8, 0x2

    add-int/lit8 v26, v26, 0x0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->v:[D

    move-object/from16 v27, v0

    aget-wide v28, v27, v12

    move-wide/from16 v0, v28

    double-to-float v0, v0

    move/from16 v27, v0

    aput v27, v15, v26

    .line 50349
    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/saterskog/cell_lab/CellWorld;->ad:[F

    mul-int/lit8 v26, v8, 0x2

    add-int/lit8 v26, v26, 0x1

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->w:[D

    move-object/from16 v27, v0

    aget-wide v28, v27, v12

    move-wide/from16 v0, v28

    double-to-float v0, v0

    move/from16 v27, v0

    aput v27, v15, v26

    .line 50357
    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/saterskog/cell_lab/CellWorld;->ae:[F

    mul-int/lit8 v26, v8, 0x4

    add-int/lit8 v26, v26, 0x0

    aput v10, v15, v26

    .line 50358
    if-nez v14, :cond_1c

    .line 50359
    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/saterskog/cell_lab/CellWorld;->ae:[F

    mul-int/lit8 v26, v8, 0x4

    add-int/lit8 v26, v26, 0x1

    const/16 v27, 0x0

    aput v27, v15, v26

    .line 50362
    :goto_15
    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/saterskog/cell_lab/CellWorld;->ae:[F

    mul-int/lit8 v26, v8, 0x4

    add-int/lit8 v26, v26, 0x2

    aput v21, v15, v26

    .line 50363
    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/saterskog/cell_lab/CellWorld;->ae:[F

    mul-int/lit8 v26, v8, 0x4

    add-int/lit8 v26, v26, 0x3

    aput v9, v15, v26

    .line 50374
    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/saterskog/cell_lab/CellWorld;->af:[F

    mul-int/lit8 v26, v8, 0x2

    add-int/lit8 v26, v26, 0x0

    aput v22, v15, v26

    .line 50375
    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/saterskog/cell_lab/CellWorld;->af:[F

    mul-int/lit8 v26, v8, 0x2

    add-int/lit8 v26, v26, 0x1

    aput v23, v15, v26

    .line 50388
    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/saterskog/cell_lab/CellWorld;->ag:[F

    mul-int/lit8 v26, v8, 0x4

    add-int/lit8 v26, v26, 0x0

    aput v18, v15, v26

    .line 50389
    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/saterskog/cell_lab/CellWorld;->ag:[F

    mul-int/lit8 v26, v8, 0x4

    add-int/lit8 v26, v26, 0x1

    aput v19, v15, v26

    .line 50390
    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/saterskog/cell_lab/CellWorld;->ag:[F

    mul-int/lit8 v26, v8, 0x4

    add-int/lit8 v26, v26, 0x2

    aput v20, v15, v26

    .line 50391
    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/saterskog/cell_lab/CellWorld;->ag:[F

    mul-int/lit8 v26, v8, 0x4

    add-int/lit8 v26, v26, 0x3

    aput v24, v15, v26

    .line 50397
    add-int/lit8 v15, v8, 0x1

    .line 50345
    add-int/lit8 v8, v12, 0x1

    move v12, v8

    move v8, v15

    goto/16 :goto_14

    .line 50255
    :cond_1b
    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/saterskog/cell_lab/CellWorld;->ae:[F

    mul-int/lit8 v15, v8, 0x4

    add-int/lit8 v15, v15, 0x1

    aput v24, v12, v15

    goto/16 :goto_13

    .line 50361
    :cond_1c
    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/saterskog/cell_lab/CellWorld;->ae:[F

    mul-int/lit8 v26, v8, 0x4

    add-int/lit8 v26, v26, 0x1

    aput v24, v15, v26

    goto :goto_15

    .line 50400
    :cond_1d
    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/saterskog/cell_lab/CellWorld;->v:[D

    const/16 v26, 0x0

    move-object/from16 v0, v17

    iget-object v0, v0, Lcom/saterskog/cell_lab/Cell;->A:[Lcom/saterskog/cell_lab/u;

    move-object/from16 v27, v0

    aget-object v27, v27, v11

    move-object/from16 v0, v27

    iget-wide v0, v0, Lcom/saterskog/cell_lab/u;->c:D

    move-wide/from16 v28, v0

    aput-wide v28, v15, v26

    .line 50401
    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/saterskog/cell_lab/CellWorld;->v:[D

    const/16 v26, 0x4

    move-object/from16 v0, v17

    iget-object v0, v0, Lcom/saterskog/cell_lab/Cell;->A:[Lcom/saterskog/cell_lab/u;

    move-object/from16 v27, v0

    aget-object v27, v27, v12

    move-object/from16 v0, v27

    iget-wide v0, v0, Lcom/saterskog/cell_lab/u;->a:D

    move-wide/from16 v28, v0

    aput-wide v28, v15, v26

    .line 50402
    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/saterskog/cell_lab/CellWorld;->w:[D

    const/16 v26, 0x0

    move-object/from16 v0, v17

    iget-object v0, v0, Lcom/saterskog/cell_lab/Cell;->A:[Lcom/saterskog/cell_lab/u;

    move-object/from16 v27, v0

    aget-object v27, v27, v11

    move-object/from16 v0, v27

    iget-wide v0, v0, Lcom/saterskog/cell_lab/u;->d:D

    move-wide/from16 v28, v0

    aput-wide v28, v15, v26

    .line 50403
    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/saterskog/cell_lab/CellWorld;->w:[D

    const/16 v26, 0x4

    move-object/from16 v0, v17

    iget-object v0, v0, Lcom/saterskog/cell_lab/Cell;->A:[Lcom/saterskog/cell_lab/u;

    move-object/from16 v27, v0

    aget-object v12, v27, v12

    iget-wide v0, v12, Lcom/saterskog/cell_lab/u;->b:D

    move-wide/from16 v28, v0

    aput-wide v28, v15, v26

    .line 50405
    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/saterskog/cell_lab/CellWorld;->v:[D

    const/4 v15, 0x2

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->v:[D

    move-object/from16 v26, v0

    const/16 v27, 0x0

    aget-wide v26, v26, v27

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->v:[D

    move-object/from16 v28, v0

    const/16 v29, 0x4

    aget-wide v28, v28, v29

    add-double v26, v26, v28

    aput-wide v26, v12, v15

    .line 50406
    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/saterskog/cell_lab/CellWorld;->w:[D

    const/4 v15, 0x2

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->w:[D

    move-object/from16 v26, v0

    const/16 v27, 0x0

    aget-wide v26, v26, v27

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->w:[D

    move-object/from16 v28, v0

    const/16 v29, 0x4

    aget-wide v28, v28, v29

    add-double v26, v26, v28

    aput-wide v26, v12, v15

    .line 50407
    const-wide/high16 v26, -0x4000000000000000L    # -2.0

    move-object/from16 v0, v17

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->d:D

    move-wide/from16 v28, v0

    mul-double v26, v26, v28

    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/saterskog/cell_lab/CellWorld;->v:[D

    const/4 v15, 0x2

    aget-wide v28, v12, v15

    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/saterskog/cell_lab/CellWorld;->v:[D

    const/4 v15, 0x2

    aget-wide v30, v12, v15

    mul-double v28, v28, v30

    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/saterskog/cell_lab/CellWorld;->w:[D

    const/4 v15, 0x2

    aget-wide v30, v12, v15

    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/saterskog/cell_lab/CellWorld;->w:[D

    const/4 v15, 0x2

    aget-wide v32, v12, v15

    mul-double v30, v30, v32

    add-double v28, v28, v30

    invoke-static/range {v28 .. v29}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v28

    div-double v26, v26, v28

    .line 50408
    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/saterskog/cell_lab/CellWorld;->v:[D

    const/4 v15, 0x2

    aget-wide v28, v12, v15

    mul-double v28, v28, v26

    aput-wide v28, v12, v15

    .line 50409
    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/saterskog/cell_lab/CellWorld;->w:[D

    const/4 v15, 0x2

    aget-wide v28, v12, v15

    mul-double v26, v26, v28

    aput-wide v26, v12, v15

    .line 50410
    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/saterskog/cell_lab/CellWorld;->v:[D

    const/4 v15, 0x2

    aget-wide v26, v12, v15

    const-wide/high16 v28, 0x3fd0000000000000L    # 0.25

    mul-double v26, v26, v28

    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/saterskog/cell_lab/CellWorld;->w:[D

    const/4 v15, 0x2

    aget-wide v28, v12, v15

    sget-wide v30, Lcom/saterskog/cell_lab/CellWorld;->b:D

    mul-double v28, v28, v30

    add-double v26, v26, v28

    .line 50411
    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/saterskog/cell_lab/CellWorld;->w:[D

    const/4 v15, 0x2

    aget-wide v28, v12, v15

    const-wide/high16 v30, 0x3fd0000000000000L    # 0.25

    mul-double v28, v28, v30

    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/saterskog/cell_lab/CellWorld;->v:[D

    const/4 v15, 0x2

    aget-wide v30, v12, v15

    sget-wide v32, Lcom/saterskog/cell_lab/CellWorld;->b:D

    mul-double v30, v30, v32

    sub-double v28, v28, v30

    .line 50413
    move-object/from16 v0, v17

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->d:D

    move-wide/from16 v30, v0

    move-object/from16 v0, v17

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->d:D

    move-wide/from16 v32, v0

    mul-double v30, v30, v32

    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/saterskog/cell_lab/CellWorld;->w:[D

    const/4 v15, 0x0

    aget-wide v32, v12, v15

    mul-double v32, v32, v26

    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/saterskog/cell_lab/CellWorld;->v:[D

    const/4 v15, 0x0

    aget-wide v34, v12, v15

    mul-double v34, v34, v28

    sub-double v32, v32, v34

    div-double v30, v30, v32

    .line 50415
    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/saterskog/cell_lab/CellWorld;->v:[D

    const/4 v15, 0x1

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->w:[D

    move-object/from16 v32, v0

    const/16 v33, 0x0

    aget-wide v32, v32, v33

    sub-double v28, v32, v28

    mul-double v28, v28, v30

    aput-wide v28, v12, v15

    .line 50416
    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/saterskog/cell_lab/CellWorld;->w:[D

    const/4 v15, 0x1

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->v:[D

    move-object/from16 v28, v0

    const/16 v29, 0x0

    aget-wide v28, v28, v29

    sub-double v26, v26, v28

    mul-double v26, v26, v30

    aput-wide v26, v12, v15

    .line 50418
    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/saterskog/cell_lab/CellWorld;->v:[D

    const/4 v15, 0x2

    aget-wide v26, v12, v15

    const-wide/high16 v28, 0x3fd0000000000000L    # 0.25

    mul-double v26, v26, v28

    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/saterskog/cell_lab/CellWorld;->w:[D

    const/4 v15, 0x2

    aget-wide v28, v12, v15

    sget-wide v30, Lcom/saterskog/cell_lab/CellWorld;->b:D

    mul-double v28, v28, v30

    sub-double v26, v26, v28

    .line 50419
    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/saterskog/cell_lab/CellWorld;->w:[D

    const/4 v15, 0x2

    aget-wide v28, v12, v15

    const-wide/high16 v30, 0x3fd0000000000000L    # 0.25

    mul-double v28, v28, v30

    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/saterskog/cell_lab/CellWorld;->v:[D

    const/4 v15, 0x2

    aget-wide v30, v12, v15

    sget-wide v32, Lcom/saterskog/cell_lab/CellWorld;->b:D

    mul-double v30, v30, v32

    add-double v28, v28, v30

    .line 50420
    move-object/from16 v0, v17

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->d:D

    move-wide/from16 v30, v0

    move-object/from16 v0, v17

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->d:D

    move-wide/from16 v32, v0

    mul-double v30, v30, v32

    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/saterskog/cell_lab/CellWorld;->w:[D

    const/4 v15, 0x4

    aget-wide v32, v12, v15

    mul-double v32, v32, v26

    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/saterskog/cell_lab/CellWorld;->v:[D

    const/4 v15, 0x4

    aget-wide v34, v12, v15

    mul-double v34, v34, v28

    sub-double v32, v32, v34

    div-double v30, v30, v32

    .line 50421
    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/saterskog/cell_lab/CellWorld;->v:[D

    const/4 v15, 0x3

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->w:[D

    move-object/from16 v32, v0

    const/16 v33, 0x4

    aget-wide v32, v32, v33

    sub-double v28, v32, v28

    mul-double v28, v28, v30

    aput-wide v28, v12, v15

    .line 50422
    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/saterskog/cell_lab/CellWorld;->w:[D

    const/4 v15, 0x3

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->v:[D

    move-object/from16 v28, v0

    const/16 v29, 0x4

    aget-wide v28, v28, v29

    sub-double v26, v26, v28

    mul-double v26, v26, v30

    aput-wide v26, v12, v15

    .line 50490
    const/4 v12, 0x0

    :goto_16
    const/4 v15, 0x4

    if-ge v12, v15, :cond_1f

    .line 50493
    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/saterskog/cell_lab/CellWorld;->ad:[F

    mul-int/lit8 v26, v8, 0x2

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->v:[D

    move-object/from16 v27, v0

    aget-wide v28, v27, v12

    move-wide/from16 v0, v28

    double-to-float v0, v0

    move/from16 v27, v0

    aput v27, v15, v26

    .line 50494
    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/saterskog/cell_lab/CellWorld;->ad:[F

    mul-int/lit8 v26, v8, 0x2

    add-int/lit8 v26, v26, 0x1

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->w:[D

    move-object/from16 v27, v0

    aget-wide v28, v27, v12

    move-wide/from16 v0, v28

    double-to-float v0, v0

    move/from16 v27, v0

    aput v27, v15, v26

    .line 50503
    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/saterskog/cell_lab/CellWorld;->ae:[F

    mul-int/lit8 v26, v8, 0x4

    aput v10, v15, v26

    .line 50504
    if-nez v14, :cond_1e

    .line 50505
    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/saterskog/cell_lab/CellWorld;->ae:[F

    mul-int/lit8 v26, v8, 0x4

    add-int/lit8 v26, v26, 0x1

    const/16 v27, 0x0

    aput v27, v15, v26

    .line 50508
    :goto_17
    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/saterskog/cell_lab/CellWorld;->ae:[F

    mul-int/lit8 v26, v8, 0x4

    add-int/lit8 v26, v26, 0x2

    aput v21, v15, v26

    .line 50509
    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/saterskog/cell_lab/CellWorld;->ae:[F

    mul-int/lit8 v26, v8, 0x4

    add-int/lit8 v26, v26, 0x3

    aput v9, v15, v26

    .line 50520
    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/saterskog/cell_lab/CellWorld;->af:[F

    mul-int/lit8 v26, v8, 0x2

    aput v22, v15, v26

    .line 50521
    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/saterskog/cell_lab/CellWorld;->af:[F

    mul-int/lit8 v26, v8, 0x2

    add-int/lit8 v26, v26, 0x1

    aput v23, v15, v26

    .line 50534
    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/saterskog/cell_lab/CellWorld;->ag:[F

    mul-int/lit8 v26, v8, 0x4

    aput v18, v15, v26

    .line 50535
    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/saterskog/cell_lab/CellWorld;->ag:[F

    mul-int/lit8 v26, v8, 0x4

    add-int/lit8 v26, v26, 0x1

    aput v19, v15, v26

    .line 50536
    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/saterskog/cell_lab/CellWorld;->ag:[F

    mul-int/lit8 v26, v8, 0x4

    add-int/lit8 v26, v26, 0x2

    aput v20, v15, v26

    .line 50537
    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/saterskog/cell_lab/CellWorld;->ag:[F

    mul-int/lit8 v26, v8, 0x4

    add-int/lit8 v26, v26, 0x3

    aput v24, v15, v26

    .line 50543
    add-int/lit8 v15, v8, 0x1

    .line 50490
    add-int/lit8 v8, v12, 0x1

    move v12, v8

    move v8, v15

    goto/16 :goto_16

    .line 50507
    :cond_1e
    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/saterskog/cell_lab/CellWorld;->ae:[F

    mul-int/lit8 v26, v8, 0x4

    add-int/lit8 v26, v26, 0x1

    aput v24, v15, v26

    goto :goto_17

    .line 50241
    :cond_1f
    add-int/lit8 v11, v11, 0x1

    goto/16 :goto_12

    .line 50548
    :cond_20
    add-int/lit8 v9, v25, 0x1

    int-to-short v9, v9

    move/from16 v36, v9

    move v9, v6

    move/from16 v6, v36

    :goto_18
    sub-int v10, v8, v7

    add-int/lit8 v10, v10, -0x1

    int-to-short v10, v10

    if-ge v6, v10, :cond_21

    .line 50549
    move-object/from16 v0, p0

    iget-object v10, v0, Lcom/saterskog/cell_lab/CellWorld;->aq:[S

    add-int/lit8 v11, v9, 0x1

    aput-short v25, v10, v9

    .line 50550
    move-object/from16 v0, p0

    iget-object v9, v0, Lcom/saterskog/cell_lab/CellWorld;->aq:[S

    add-int/lit8 v10, v11, 0x1

    aput-short v6, v9, v11

    .line 50551
    move-object/from16 v0, p0

    iget-object v11, v0, Lcom/saterskog/cell_lab/CellWorld;->aq:[S

    add-int/lit8 v9, v10, 0x1

    add-int/lit8 v12, v6, 0x1

    int-to-short v12, v12

    aput-short v12, v11, v10

    .line 50548
    add-int/lit8 v6, v6, 0x1

    int-to-short v6, v6

    goto :goto_18

    .line 50553
    :cond_21
    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/saterskog/cell_lab/CellWorld;->aq:[S

    add-int/lit8 v10, v9, 0x1

    aput-short v25, v6, v9

    .line 50554
    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/saterskog/cell_lab/CellWorld;->aq:[S

    add-int/lit8 v9, v10, 0x1

    sub-int v11, v8, v7

    add-int/lit8 v11, v11, -0x1

    int-to-short v11, v11

    aput-short v11, v6, v10

    .line 50555
    move-object/from16 v0, p0

    iget-object v10, v0, Lcom/saterskog/cell_lab/CellWorld;->aq:[S

    add-int/lit8 v6, v9, 0x1

    add-int/lit8 v11, v25, 0x1

    int-to-short v11, v11

    aput-short v11, v10, v9

    goto/16 :goto_11

    .line 3111
    :cond_22
    invoke-static {}, Lcom/saterskog/b/a;->b()V

    .line 50657
    const v4, 0x3d75c28f    # 0.06f

    sub-float v10, p1, v4

    .line 50658
    const v4, 0x3d75c28f    # 0.06f

    add-float v11, p2, v4

    .line 50659
    const v4, 0x3d75c28f    # 0.06f

    sub-float v12, p3, v4

    .line 50660
    const v4, 0x3d75c28f    # 0.06f

    add-float v13, p4, v4

    .line 50661
    const/4 v4, 0x0

    move-object/from16 v0, p0

    iput v4, v0, Lcom/saterskog/cell_lab/CellWorld;->ap:I

    .line 50662
    const/4 v4, 0x0

    :goto_19
    move-object/from16 v0, p0

    iget v5, v0, Lcom/saterskog/cell_lab/CellWorld;->z:I

    if-ge v4, v5, :cond_2a

    .line 50663
    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    aget-object v14, v5, v4

    .line 50664
    iget-wide v6, v14, Lcom/saterskog/cell_lab/Cell;->b:D

    float-to-double v8, v10

    cmpg-double v5, v6, v8

    if-ltz v5, :cond_29

    iget-wide v6, v14, Lcom/saterskog/cell_lab/Cell;->b:D

    float-to-double v8, v11

    cmpl-double v5, v6, v8

    if-gtz v5, :cond_29

    iget-wide v6, v14, Lcom/saterskog/cell_lab/Cell;->c:D

    float-to-double v8, v12

    cmpg-double v5, v6, v8

    if-ltz v5, :cond_29

    iget-wide v6, v14, Lcom/saterskog/cell_lab/Cell;->c:D

    float-to-double v8, v13

    cmpl-double v5, v6, v8

    if-gtz v5, :cond_29

    iget v5, v14, Lcom/saterskog/cell_lab/Cell;->C:I

    if-eqz v5, :cond_29

    .line 50666
    const/4 v5, 0x0

    :goto_1a
    iget v6, v14, Lcom/saterskog/cell_lab/Cell;->C:I

    if-ge v5, v6, :cond_29

    .line 50667
    iget-object v6, v14, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    aget-object v15, v6, v5

    .line 50669
    iget v6, v15, Lcom/saterskog/cell_lab/Link;->a:I

    if-gt v6, v4, :cond_25

    .line 50673
    const/4 v6, 0x0

    :goto_1b
    iget v7, v14, Lcom/saterskog/cell_lab/Cell;->B:I

    if-ge v6, v7, :cond_23

    .line 50674
    iget v7, v15, Lcom/saterskog/cell_lab/Link;->a:I

    iget-object v8, v14, Lcom/saterskog/cell_lab/Cell;->A:[Lcom/saterskog/cell_lab/u;

    aget-object v8, v8, v6

    iget v8, v8, Lcom/saterskog/cell_lab/u;->g:I

    if-eq v7, v8, :cond_23

    .line 50673
    add-int/lit8 v6, v6, 0x1

    goto :goto_1b

    .line 50678
    :cond_23
    sget-wide v8, Lcom/saterskog/cell_lab/Cell;->a:D

    double-to-float v7, v8

    const v8, 0x3f333333    # 0.7f

    mul-float v16, v7, v8

    .line 50679
    iget v7, v14, Lcom/saterskog/cell_lab/Cell;->B:I

    if-ne v6, v7, :cond_27

    .line 50680
    iget v6, v15, Lcom/saterskog/cell_lab/Link;->a:I

    const/4 v7, -0x1

    if-ne v6, v7, :cond_26

    .line 50682
    iget-wide v6, v14, Lcom/saterskog/cell_lab/Cell;->b:D

    iget-wide v8, v14, Lcom/saterskog/cell_lab/Cell;->b:D

    mul-double/2addr v6, v8

    iget-wide v8, v14, Lcom/saterskog/cell_lab/Cell;->c:D

    iget-wide v0, v14, Lcom/saterskog/cell_lab/Cell;->c:D

    move-wide/from16 v18, v0

    mul-double v8, v8, v18

    add-double/2addr v6, v8

    invoke-static {v6, v7}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v6

    .line 50684
    iget-wide v8, v14, Lcom/saterskog/cell_lab/Cell;->b:D

    const-wide/high16 v18, 0x3fe0000000000000L    # 0.5

    mul-double v8, v8, v18

    iget-wide v0, v15, Lcom/saterskog/cell_lab/Link;->e:D

    move-wide/from16 v18, v0

    const-wide/high16 v20, 0x3fe0000000000000L    # 0.5

    mul-double v18, v18, v20

    add-double v18, v18, v8

    .line 50685
    iget-wide v8, v14, Lcom/saterskog/cell_lab/Cell;->c:D

    const-wide/high16 v20, 0x3fe0000000000000L    # 0.5

    mul-double v8, v8, v20

    iget-wide v0, v15, Lcom/saterskog/cell_lab/Link;->f:D

    move-wide/from16 v20, v0

    const-wide/high16 v22, 0x3fe0000000000000L    # 0.5

    mul-double v20, v20, v22

    add-double v20, v20, v8

    .line 50686
    const/high16 v8, 0x3f000000    # 0.5f

    mul-float v8, v8, v16

    float-to-double v8, v8

    div-double v16, v8, v6

    .line 50687
    iget-wide v6, v14, Lcom/saterskog/cell_lab/Cell;->c:D

    mul-double v6, v6, v16

    add-double v6, v6, v18

    double-to-float v9, v6

    .line 50688
    iget-wide v6, v14, Lcom/saterskog/cell_lab/Cell;->c:D

    mul-double v6, v6, v16

    sub-double v6, v18, v6

    double-to-float v8, v6

    .line 50689
    iget-wide v6, v14, Lcom/saterskog/cell_lab/Cell;->b:D

    mul-double v6, v6, v16

    sub-double v6, v20, v6

    double-to-float v7, v6

    .line 50690
    iget-wide v0, v14, Lcom/saterskog/cell_lab/Cell;->b:D

    move-wide/from16 v18, v0

    mul-double v16, v16, v18

    add-double v16, v16, v20

    move-wide/from16 v0, v16

    double-to-float v6, v0

    .line 50730
    :cond_24
    :goto_1c
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->an:[F

    move-object/from16 v16, v0

    move-object/from16 v0, p0

    iget v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ap:I

    move/from16 v17, v0

    mul-int/lit8 v17, v17, 0x4

    iget v0, v15, Lcom/saterskog/cell_lab/Link;->g:F

    move/from16 v18, v0

    move/from16 v0, v18

    float-to-double v0, v0

    move-wide/from16 v18, v0

    iget-wide v0, v14, Lcom/saterskog/cell_lab/Cell;->b:D

    move-wide/from16 v20, v0

    add-double v18, v18, v20

    move-wide/from16 v0, v18

    double-to-float v0, v0

    move/from16 v18, v0

    aput v18, v16, v17

    .line 50731
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->an:[F

    move-object/from16 v16, v0

    move-object/from16 v0, p0

    iget v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ap:I

    move/from16 v17, v0

    mul-int/lit8 v17, v17, 0x4

    add-int/lit8 v17, v17, 0x1

    iget v0, v15, Lcom/saterskog/cell_lab/Link;->h:F

    move/from16 v18, v0

    move/from16 v0, v18

    float-to-double v0, v0

    move-wide/from16 v18, v0

    iget-wide v0, v14, Lcom/saterskog/cell_lab/Cell;->c:D

    move-wide/from16 v20, v0

    add-double v18, v18, v20

    move-wide/from16 v0, v18

    double-to-float v0, v0

    move/from16 v18, v0

    aput v18, v16, v17

    .line 50732
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->an:[F

    move-object/from16 v16, v0

    move-object/from16 v0, p0

    iget v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ap:I

    move/from16 v17, v0

    mul-int/lit8 v17, v17, 0x4

    add-int/lit8 v17, v17, 0x2

    const/16 v18, 0x0

    aput v18, v16, v17

    .line 50733
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->an:[F

    move-object/from16 v16, v0

    move-object/from16 v0, p0

    iget v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ap:I

    move/from16 v17, v0

    mul-int/lit8 v17, v17, 0x4

    add-int/lit8 v17, v17, 0x3

    const/high16 v18, 0x3f800000    # 1.0f

    aput v18, v16, v17

    .line 50735
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->an:[F

    move-object/from16 v16, v0

    move-object/from16 v0, p0

    iget v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ap:I

    move/from16 v17, v0

    mul-int/lit8 v17, v17, 0x4

    add-int/lit8 v17, v17, 0x4

    aput v9, v16, v17

    .line 50736
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->an:[F

    move-object/from16 v16, v0

    move-object/from16 v0, p0

    iget v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ap:I

    move/from16 v17, v0

    mul-int/lit8 v17, v17, 0x4

    add-int/lit8 v17, v17, 0x5

    aput v7, v16, v17

    .line 50737
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->an:[F

    move-object/from16 v16, v0

    move-object/from16 v0, p0

    iget v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ap:I

    move/from16 v17, v0

    mul-int/lit8 v17, v17, 0x4

    add-int/lit8 v17, v17, 0x6

    const/high16 v18, -0x40800000    # -1.0f

    aput v18, v16, v17

    .line 50738
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->an:[F

    move-object/from16 v16, v0

    move-object/from16 v0, p0

    iget v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ap:I

    move/from16 v17, v0

    mul-int/lit8 v17, v17, 0x4

    add-int/lit8 v17, v17, 0x7

    const/16 v18, 0x0

    aput v18, v16, v17

    .line 50740
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->an:[F

    move-object/from16 v16, v0

    move-object/from16 v0, p0

    iget v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ap:I

    move/from16 v17, v0

    mul-int/lit8 v17, v17, 0x4

    add-int/lit8 v17, v17, 0x8

    aput v8, v16, v17

    .line 50741
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->an:[F

    move-object/from16 v16, v0

    move-object/from16 v0, p0

    iget v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ap:I

    move/from16 v17, v0

    mul-int/lit8 v17, v17, 0x4

    add-int/lit8 v17, v17, 0x9

    aput v6, v16, v17

    .line 50742
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->an:[F

    move-object/from16 v16, v0

    move-object/from16 v0, p0

    iget v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ap:I

    move/from16 v17, v0

    mul-int/lit8 v17, v17, 0x4

    add-int/lit8 v17, v17, 0xa

    const/high16 v18, 0x3f800000    # 1.0f

    aput v18, v16, v17

    .line 50743
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->an:[F

    move-object/from16 v16, v0

    move-object/from16 v0, p0

    iget v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ap:I

    move/from16 v17, v0

    mul-int/lit8 v17, v17, 0x4

    add-int/lit8 v17, v17, 0xb

    const/16 v18, 0x0

    aput v18, v16, v17

    .line 50745
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ao:[F

    move-object/from16 v16, v0

    move-object/from16 v0, p0

    iget v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ap:I

    move/from16 v17, v0

    const-wide/high16 v18, -0x4010000000000000L    # -1.0

    const-wide/high16 v20, 0x4000000000000000L    # 2.0

    iget v0, v15, Lcom/saterskog/cell_lab/Link;->g:F

    move/from16 v22, v0

    move/from16 v0, v22

    float-to-double v0, v0

    move-wide/from16 v22, v0

    iget-wide v0, v14, Lcom/saterskog/cell_lab/Cell;->b:D

    move-wide/from16 v24, v0

    add-double v22, v22, v24

    float-to-double v0, v9

    move-wide/from16 v24, v0

    sub-double v22, v22, v24

    sub-float v24, v8, v9

    move/from16 v0, v24

    float-to-double v0, v0

    move-wide/from16 v24, v0

    mul-double v22, v22, v24

    iget v0, v15, Lcom/saterskog/cell_lab/Link;->h:F

    move/from16 v24, v0

    move/from16 v0, v24

    float-to-double v0, v0

    move-wide/from16 v24, v0

    iget-wide v0, v14, Lcom/saterskog/cell_lab/Cell;->c:D

    move-wide/from16 v26, v0

    add-double v24, v24, v26

    float-to-double v0, v7

    move-wide/from16 v26, v0

    sub-double v24, v24, v26

    sub-float v26, v6, v7

    move/from16 v0, v26

    float-to-double v0, v0

    move-wide/from16 v26, v0

    mul-double v24, v24, v26

    add-double v22, v22, v24

    mul-double v20, v20, v22

    sub-float v22, v8, v9

    sub-float v23, v8, v9

    mul-float v22, v22, v23

    sub-float v23, v6, v7

    sub-float v24, v6, v7

    mul-float v23, v23, v24

    add-float v22, v22, v23

    move/from16 v0, v22

    float-to-double v0, v0

    move-wide/from16 v22, v0

    div-double v20, v20, v22

    add-double v18, v18, v20

    move-wide/from16 v0, v18

    double-to-float v0, v0

    move/from16 v18, v0

    aput v18, v16, v17

    .line 50746
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ao:[F

    move-object/from16 v16, v0

    move-object/from16 v0, p0

    iget v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ap:I

    move/from16 v17, v0

    add-int/lit8 v17, v17, 0x1

    const/high16 v18, -0x40800000    # -1.0f

    aput v18, v16, v17

    .line 50747
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ao:[F

    move-object/from16 v16, v0

    move-object/from16 v0, p0

    iget v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ap:I

    move/from16 v17, v0

    add-int/lit8 v17, v17, 0x2

    const/high16 v18, 0x3f800000    # 1.0f

    aput v18, v16, v17

    .line 50749
    move-object/from16 v0, p0

    iget v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ap:I

    move/from16 v16, v0

    add-int/lit8 v16, v16, 0x3

    move/from16 v0, v16

    move-object/from16 v1, p0

    iput v0, v1, Lcom/saterskog/cell_lab/CellWorld;->ap:I

    .line 50751
    iget v0, v15, Lcom/saterskog/cell_lab/Link;->a:I

    move/from16 v16, v0

    const/16 v17, -0x1

    move/from16 v0, v16

    move/from16 v1, v17

    if-ne v0, v1, :cond_28

    .line 50753
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->an:[F

    move-object/from16 v16, v0

    move-object/from16 v0, p0

    iget v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ap:I

    move/from16 v17, v0

    mul-int/lit8 v17, v17, 0x4

    iget-wide v0, v15, Lcom/saterskog/cell_lab/Link;->e:D

    move-wide/from16 v18, v0

    move-wide/from16 v0, v18

    double-to-float v0, v0

    move/from16 v18, v0

    aput v18, v16, v17

    .line 50754
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->an:[F

    move-object/from16 v16, v0

    move-object/from16 v0, p0

    iget v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ap:I

    move/from16 v17, v0

    mul-int/lit8 v17, v17, 0x4

    add-int/lit8 v17, v17, 0x1

    iget-wide v0, v15, Lcom/saterskog/cell_lab/Link;->f:D

    move-wide/from16 v18, v0

    move-wide/from16 v0, v18

    double-to-float v0, v0

    move/from16 v18, v0

    aput v18, v16, v17

    .line 50755
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->an:[F

    move-object/from16 v16, v0

    move-object/from16 v0, p0

    iget v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ap:I

    move/from16 v17, v0

    mul-int/lit8 v17, v17, 0x4

    add-int/lit8 v17, v17, 0x2

    const/16 v18, 0x0

    aput v18, v16, v17

    .line 50756
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->an:[F

    move-object/from16 v16, v0

    move-object/from16 v0, p0

    iget v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ap:I

    move/from16 v17, v0

    mul-int/lit8 v17, v17, 0x4

    add-int/lit8 v17, v17, 0x3

    const/high16 v18, 0x3f800000    # 1.0f

    aput v18, v16, v17

    .line 50758
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->an:[F

    move-object/from16 v16, v0

    move-object/from16 v0, p0

    iget v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ap:I

    move/from16 v17, v0

    mul-int/lit8 v17, v17, 0x4

    add-int/lit8 v17, v17, 0x4

    aput v9, v16, v17

    .line 50759
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->an:[F

    move-object/from16 v16, v0

    move-object/from16 v0, p0

    iget v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ap:I

    move/from16 v17, v0

    mul-int/lit8 v17, v17, 0x4

    add-int/lit8 v17, v17, 0x5

    aput v7, v16, v17

    .line 50760
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->an:[F

    move-object/from16 v16, v0

    move-object/from16 v0, p0

    iget v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ap:I

    move/from16 v17, v0

    mul-int/lit8 v17, v17, 0x4

    add-int/lit8 v17, v17, 0x6

    const/high16 v18, -0x40800000    # -1.0f

    aput v18, v16, v17

    .line 50761
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->an:[F

    move-object/from16 v16, v0

    move-object/from16 v0, p0

    iget v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ap:I

    move/from16 v17, v0

    mul-int/lit8 v17, v17, 0x4

    add-int/lit8 v17, v17, 0x7

    const/16 v18, 0x0

    aput v18, v16, v17

    .line 50763
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->an:[F

    move-object/from16 v16, v0

    move-object/from16 v0, p0

    iget v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ap:I

    move/from16 v17, v0

    mul-int/lit8 v17, v17, 0x4

    add-int/lit8 v17, v17, 0x8

    aput v8, v16, v17

    .line 50764
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->an:[F

    move-object/from16 v16, v0

    move-object/from16 v0, p0

    iget v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ap:I

    move/from16 v17, v0

    mul-int/lit8 v17, v17, 0x4

    add-int/lit8 v17, v17, 0x9

    aput v6, v16, v17

    .line 50765
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->an:[F

    move-object/from16 v16, v0

    move-object/from16 v0, p0

    iget v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ap:I

    move/from16 v17, v0

    mul-int/lit8 v17, v17, 0x4

    add-int/lit8 v17, v17, 0xa

    const/high16 v18, 0x3f800000    # 1.0f

    aput v18, v16, v17

    .line 50766
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->an:[F

    move-object/from16 v16, v0

    move-object/from16 v0, p0

    iget v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ap:I

    move/from16 v17, v0

    mul-int/lit8 v17, v17, 0x4

    add-int/lit8 v17, v17, 0xb

    const/16 v18, 0x0

    aput v18, v16, v17

    .line 50768
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ao:[F

    move-object/from16 v16, v0

    move-object/from16 v0, p0

    iget v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ap:I

    move/from16 v17, v0

    const-wide/high16 v18, -0x4010000000000000L    # -1.0

    const-wide/high16 v20, 0x4000000000000000L    # 2.0

    iget-wide v0, v15, Lcom/saterskog/cell_lab/Link;->e:D

    move-wide/from16 v22, v0

    float-to-double v0, v9

    move-wide/from16 v24, v0

    sub-double v22, v22, v24

    sub-float v24, v8, v9

    move/from16 v0, v24

    float-to-double v0, v0

    move-wide/from16 v24, v0

    mul-double v22, v22, v24

    iget-wide v0, v15, Lcom/saterskog/cell_lab/Link;->f:D

    move-wide/from16 v24, v0

    float-to-double v0, v7

    move-wide/from16 v26, v0

    sub-double v24, v24, v26

    sub-float v15, v6, v7

    float-to-double v0, v15

    move-wide/from16 v26, v0

    mul-double v24, v24, v26

    add-double v22, v22, v24

    mul-double v20, v20, v22

    sub-float v15, v8, v9

    sub-float/2addr v8, v9

    mul-float/2addr v8, v15

    sub-float v9, v6, v7

    sub-float/2addr v6, v7

    mul-float/2addr v6, v9

    add-float/2addr v6, v8

    float-to-double v6, v6

    div-double v6, v20, v6

    add-double v6, v6, v18

    double-to-float v6, v6

    aput v6, v16, v17

    .line 50769
    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/saterskog/cell_lab/CellWorld;->ao:[F

    move-object/from16 v0, p0

    iget v7, v0, Lcom/saterskog/cell_lab/CellWorld;->ap:I

    add-int/lit8 v7, v7, 0x1

    const/high16 v8, -0x40800000    # -1.0f

    aput v8, v6, v7

    .line 50770
    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/saterskog/cell_lab/CellWorld;->ao:[F

    move-object/from16 v0, p0

    iget v7, v0, Lcom/saterskog/cell_lab/CellWorld;->ap:I

    add-int/lit8 v7, v7, 0x2

    const/high16 v8, 0x3f800000    # 1.0f

    aput v8, v6, v7

    .line 50793
    :goto_1d
    move-object/from16 v0, p0

    iget v6, v0, Lcom/saterskog/cell_lab/CellWorld;->ap:I

    add-int/lit8 v6, v6, 0x3

    move-object/from16 v0, p0

    iput v6, v0, Lcom/saterskog/cell_lab/CellWorld;->ap:I

    .line 50666
    :cond_25
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_1a

    .line 50694
    :cond_26
    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    iget v7, v15, Lcom/saterskog/cell_lab/Link;->a:I

    aget-object v6, v6, v7

    .line 50695
    iget-wide v8, v14, Lcom/saterskog/cell_lab/Cell;->b:D

    iget-wide v0, v6, Lcom/saterskog/cell_lab/Cell;->b:D

    move-wide/from16 v18, v0

    sub-double v8, v8, v18

    iget-wide v0, v14, Lcom/saterskog/cell_lab/Cell;->b:D

    move-wide/from16 v18, v0

    iget-wide v0, v6, Lcom/saterskog/cell_lab/Cell;->b:D

    move-wide/from16 v20, v0

    sub-double v18, v18, v20

    mul-double v8, v8, v18

    iget-wide v0, v14, Lcom/saterskog/cell_lab/Cell;->c:D

    move-wide/from16 v18, v0

    iget-wide v0, v6, Lcom/saterskog/cell_lab/Cell;->c:D

    move-wide/from16 v20, v0

    sub-double v18, v18, v20

    iget-wide v0, v14, Lcom/saterskog/cell_lab/Cell;->c:D

    move-wide/from16 v20, v0

    iget-wide v0, v6, Lcom/saterskog/cell_lab/Cell;->c:D

    move-wide/from16 v22, v0

    sub-double v20, v20, v22

    mul-double v18, v18, v20

    add-double v8, v8, v18

    invoke-static {v8, v9}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v8

    .line 50696
    iget-wide v0, v14, Lcom/saterskog/cell_lab/Cell;->d:D

    move-wide/from16 v18, v0

    const-wide/high16 v20, 0x3fe0000000000000L    # 0.5

    iget-wide v0, v14, Lcom/saterskog/cell_lab/Cell;->d:D

    move-wide/from16 v22, v0

    sub-double v22, v8, v22

    iget-wide v0, v6, Lcom/saterskog/cell_lab/Cell;->d:D

    move-wide/from16 v24, v0

    sub-double v22, v22, v24

    mul-double v20, v20, v22

    add-double v18, v18, v20

    div-double v18, v18, v8

    .line 50697
    iget-wide v0, v14, Lcom/saterskog/cell_lab/Cell;->b:D

    move-wide/from16 v20, v0

    mul-double v20, v20, v18

    iget-wide v0, v6, Lcom/saterskog/cell_lab/Cell;->b:D

    move-wide/from16 v22, v0

    const-wide/high16 v24, 0x3ff0000000000000L    # 1.0

    sub-double v24, v24, v18

    mul-double v22, v22, v24

    add-double v20, v20, v22

    .line 50698
    iget-wide v0, v14, Lcom/saterskog/cell_lab/Cell;->c:D

    move-wide/from16 v22, v0

    mul-double v22, v22, v18

    iget-wide v0, v6, Lcom/saterskog/cell_lab/Cell;->c:D

    move-wide/from16 v24, v0

    const-wide/high16 v26, 0x3ff0000000000000L    # 1.0

    sub-double v18, v26, v18

    mul-double v18, v18, v24

    add-double v18, v18, v22

    .line 50699
    const/high16 v7, 0x3f000000    # 0.5f

    mul-float v7, v7, v16

    float-to-double v0, v7

    move-wide/from16 v16, v0

    div-double v16, v16, v8

    .line 50700
    iget-wide v8, v6, Lcom/saterskog/cell_lab/Cell;->c:D

    iget-wide v0, v14, Lcom/saterskog/cell_lab/Cell;->c:D

    move-wide/from16 v22, v0

    sub-double v8, v8, v22

    mul-double v8, v8, v16

    sub-double v8, v20, v8

    double-to-float v9, v8

    .line 50701
    iget-wide v0, v6, Lcom/saterskog/cell_lab/Cell;->c:D

    move-wide/from16 v22, v0

    iget-wide v0, v14, Lcom/saterskog/cell_lab/Cell;->c:D

    move-wide/from16 v24, v0

    sub-double v22, v22, v24

    mul-double v22, v22, v16

    add-double v20, v20, v22

    move-wide/from16 v0, v20

    double-to-float v8, v0

    .line 50702
    iget-wide v0, v6, Lcom/saterskog/cell_lab/Cell;->b:D

    move-wide/from16 v20, v0

    iget-wide v0, v14, Lcom/saterskog/cell_lab/Cell;->b:D

    move-wide/from16 v22, v0

    sub-double v20, v20, v22

    mul-double v20, v20, v16

    add-double v20, v20, v18

    move-wide/from16 v0, v20

    double-to-float v7, v0

    .line 50703
    iget-wide v0, v6, Lcom/saterskog/cell_lab/Cell;->b:D

    move-wide/from16 v20, v0

    iget-wide v0, v14, Lcom/saterskog/cell_lab/Cell;->b:D

    move-wide/from16 v22, v0

    sub-double v20, v20, v22

    mul-double v16, v16, v20

    sub-double v16, v18, v16

    move-wide/from16 v0, v16

    double-to-float v6, v0

    .line 50704
    goto/16 :goto_1c

    .line 50707
    :cond_27
    iget-object v7, v14, Lcom/saterskog/cell_lab/Cell;->A:[Lcom/saterskog/cell_lab/u;

    aget-object v6, v7, v6

    .line 50708
    iget-boolean v7, v6, Lcom/saterskog/cell_lab/u;->e:Z

    if-nez v7, :cond_25

    .line 50711
    iget-wide v8, v6, Lcom/saterskog/cell_lab/u;->a:D

    iget-wide v0, v14, Lcom/saterskog/cell_lab/Cell;->b:D

    move-wide/from16 v18, v0

    add-double v8, v8, v18

    double-to-float v9, v8

    .line 50712
    iget-wide v0, v6, Lcom/saterskog/cell_lab/u;->c:D

    move-wide/from16 v18, v0

    iget-wide v0, v14, Lcom/saterskog/cell_lab/Cell;->b:D

    move-wide/from16 v20, v0

    add-double v18, v18, v20

    move-wide/from16 v0, v18

    double-to-float v8, v0

    .line 50713
    iget-wide v0, v6, Lcom/saterskog/cell_lab/u;->b:D

    move-wide/from16 v18, v0

    iget-wide v0, v14, Lcom/saterskog/cell_lab/Cell;->c:D

    move-wide/from16 v20, v0

    add-double v18, v18, v20

    move-wide/from16 v0, v18

    double-to-float v7, v0

    .line 50714
    iget-wide v0, v6, Lcom/saterskog/cell_lab/u;->d:D

    move-wide/from16 v18, v0

    iget-wide v0, v14, Lcom/saterskog/cell_lab/Cell;->c:D

    move-wide/from16 v20, v0

    add-double v18, v18, v20

    move-wide/from16 v0, v18

    double-to-float v6, v0

    .line 50716
    sub-float v17, v8, v9

    sub-float v18, v8, v9

    mul-float v17, v17, v18

    sub-float v18, v6, v7

    sub-float v19, v6, v7

    mul-float v18, v18, v19

    add-float v17, v17, v18

    .line 50717
    mul-float v18, v16, v16

    cmpg-float v18, v17, v18

    if-gez v18, :cond_24

    .line 50719
    move/from16 v0, v17

    float-to-double v0, v0

    move-wide/from16 v18, v0

    invoke-static/range {v18 .. v19}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v18

    move-wide/from16 v0, v18

    double-to-float v0, v0

    move/from16 v17, v0

    .line 50720
    const/high16 v18, 0x3f000000    # 0.5f

    add-float v19, v9, v8

    mul-float v18, v18, v19

    .line 50721
    const/high16 v19, 0x3f000000    # 0.5f

    add-float v20, v7, v6

    mul-float v19, v19, v20

    .line 50722
    div-float v16, v16, v17

    .line 50723
    sub-float v8, v8, v18

    mul-float v8, v8, v16

    add-float v8, v8, v18

    .line 50724
    sub-float v9, v9, v18

    mul-float v9, v9, v16

    add-float v9, v9, v18

    .line 50725
    sub-float v6, v6, v19

    mul-float v6, v6, v16

    add-float v6, v6, v19

    .line 50726
    sub-float v7, v7, v19

    mul-float v7, v7, v16

    add-float v7, v7, v19

    goto/16 :goto_1c

    .line 50773
    :cond_28
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    move-object/from16 v16, v0

    iget v0, v15, Lcom/saterskog/cell_lab/Link;->a:I

    move/from16 v17, v0

    aget-object v16, v16, v17

    .line 50774
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->an:[F

    move-object/from16 v17, v0

    move-object/from16 v0, p0

    iget v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ap:I

    move/from16 v18, v0

    mul-int/lit8 v18, v18, 0x4

    iget v0, v15, Lcom/saterskog/cell_lab/Link;->i:F

    move/from16 v19, v0

    move/from16 v0, v19

    float-to-double v0, v0

    move-wide/from16 v20, v0

    move-object/from16 v0, v16

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->b:D

    move-wide/from16 v22, v0

    add-double v20, v20, v22

    move-wide/from16 v0, v20

    double-to-float v0, v0

    move/from16 v19, v0

    aput v19, v17, v18

    .line 50775
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->an:[F

    move-object/from16 v17, v0

    move-object/from16 v0, p0

    iget v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ap:I

    move/from16 v18, v0

    mul-int/lit8 v18, v18, 0x4

    add-int/lit8 v18, v18, 0x1

    iget v0, v15, Lcom/saterskog/cell_lab/Link;->j:F

    move/from16 v19, v0

    move/from16 v0, v19

    float-to-double v0, v0

    move-wide/from16 v20, v0

    move-object/from16 v0, v16

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->c:D

    move-wide/from16 v22, v0

    add-double v20, v20, v22

    move-wide/from16 v0, v20

    double-to-float v0, v0

    move/from16 v19, v0

    aput v19, v17, v18

    .line 50776
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->an:[F

    move-object/from16 v17, v0

    move-object/from16 v0, p0

    iget v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ap:I

    move/from16 v18, v0

    mul-int/lit8 v18, v18, 0x4

    add-int/lit8 v18, v18, 0x2

    const/16 v19, 0x0

    aput v19, v17, v18

    .line 50777
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->an:[F

    move-object/from16 v17, v0

    move-object/from16 v0, p0

    iget v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ap:I

    move/from16 v18, v0

    mul-int/lit8 v18, v18, 0x4

    add-int/lit8 v18, v18, 0x3

    const/high16 v19, 0x3f800000    # 1.0f

    aput v19, v17, v18

    .line 50779
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->an:[F

    move-object/from16 v17, v0

    move-object/from16 v0, p0

    iget v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ap:I

    move/from16 v18, v0

    mul-int/lit8 v18, v18, 0x4

    add-int/lit8 v18, v18, 0x4

    aput v9, v17, v18

    .line 50780
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->an:[F

    move-object/from16 v17, v0

    move-object/from16 v0, p0

    iget v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ap:I

    move/from16 v18, v0

    mul-int/lit8 v18, v18, 0x4

    add-int/lit8 v18, v18, 0x5

    aput v7, v17, v18

    .line 50781
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->an:[F

    move-object/from16 v17, v0

    move-object/from16 v0, p0

    iget v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ap:I

    move/from16 v18, v0

    mul-int/lit8 v18, v18, 0x4

    add-int/lit8 v18, v18, 0x6

    const/high16 v19, -0x40800000    # -1.0f

    aput v19, v17, v18

    .line 50782
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->an:[F

    move-object/from16 v17, v0

    move-object/from16 v0, p0

    iget v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ap:I

    move/from16 v18, v0

    mul-int/lit8 v18, v18, 0x4

    add-int/lit8 v18, v18, 0x7

    const/16 v19, 0x0

    aput v19, v17, v18

    .line 50784
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->an:[F

    move-object/from16 v17, v0

    move-object/from16 v0, p0

    iget v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ap:I

    move/from16 v18, v0

    mul-int/lit8 v18, v18, 0x4

    add-int/lit8 v18, v18, 0x8

    aput v8, v17, v18

    .line 50785
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->an:[F

    move-object/from16 v17, v0

    move-object/from16 v0, p0

    iget v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ap:I

    move/from16 v18, v0

    mul-int/lit8 v18, v18, 0x4

    add-int/lit8 v18, v18, 0x9

    aput v6, v17, v18

    .line 50786
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->an:[F

    move-object/from16 v17, v0

    move-object/from16 v0, p0

    iget v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ap:I

    move/from16 v18, v0

    mul-int/lit8 v18, v18, 0x4

    add-int/lit8 v18, v18, 0xa

    const/high16 v19, 0x3f800000    # 1.0f

    aput v19, v17, v18

    .line 50787
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->an:[F

    move-object/from16 v17, v0

    move-object/from16 v0, p0

    iget v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ap:I

    move/from16 v18, v0

    mul-int/lit8 v18, v18, 0x4

    add-int/lit8 v18, v18, 0xb

    const/16 v19, 0x0

    aput v19, v17, v18

    .line 50789
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ao:[F

    move-object/from16 v17, v0

    move-object/from16 v0, p0

    iget v0, v0, Lcom/saterskog/cell_lab/CellWorld;->ap:I

    move/from16 v18, v0

    const-wide/high16 v20, -0x4010000000000000L    # -1.0

    const-wide/high16 v22, 0x4000000000000000L    # 2.0

    iget v0, v15, Lcom/saterskog/cell_lab/Link;->i:F

    move/from16 v19, v0

    move/from16 v0, v19

    float-to-double v0, v0

    move-wide/from16 v24, v0

    move-object/from16 v0, v16

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->b:D

    move-wide/from16 v26, v0

    add-double v24, v24, v26

    float-to-double v0, v9

    move-wide/from16 v26, v0

    sub-double v24, v24, v26

    sub-float v19, v8, v9

    move/from16 v0, v19

    float-to-double v0, v0

    move-wide/from16 v26, v0

    mul-double v24, v24, v26

    iget v15, v15, Lcom/saterskog/cell_lab/Link;->j:F

    float-to-double v0, v15

    move-wide/from16 v26, v0

    move-object/from16 v0, v16

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->c:D

    move-wide/from16 v28, v0

    add-double v26, v26, v28

    float-to-double v0, v7

    move-wide/from16 v28, v0

    sub-double v26, v26, v28

    sub-float v15, v6, v7

    float-to-double v0, v15

    move-wide/from16 v28, v0

    mul-double v26, v26, v28

    add-double v24, v24, v26

    mul-double v22, v22, v24

    sub-float v15, v8, v9

    sub-float/2addr v8, v9

    mul-float/2addr v8, v15

    sub-float v9, v6, v7

    sub-float/2addr v6, v7

    mul-float/2addr v6, v9

    add-float/2addr v6, v8

    float-to-double v6, v6

    div-double v6, v22, v6

    add-double v6, v6, v20

    double-to-float v6, v6

    aput v6, v17, v18

    .line 50790
    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/saterskog/cell_lab/CellWorld;->ao:[F

    move-object/from16 v0, p0

    iget v7, v0, Lcom/saterskog/cell_lab/CellWorld;->ap:I

    add-int/lit8 v7, v7, 0x1

    const/high16 v8, -0x40800000    # -1.0f

    aput v8, v6, v7

    .line 50791
    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/saterskog/cell_lab/CellWorld;->ao:[F

    move-object/from16 v0, p0

    iget v7, v0, Lcom/saterskog/cell_lab/CellWorld;->ap:I

    add-int/lit8 v7, v7, 0x2

    const/high16 v8, 0x3f800000    # 1.0f

    aput v8, v6, v7

    goto/16 :goto_1d

    .line 50662
    :cond_29
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_19

    .line 3113
    :cond_2a
    invoke-static {}, Lcom/saterskog/b/a;->b()V

    .line 3114
    invoke-direct/range {p0 .. p0}, Lcom/saterskog/cell_lab/CellWorld;->l()V

    .line 3115
    invoke-static {}, Lcom/saterskog/b/a;->b()V

    .line 3116
    invoke-direct/range {p0 .. p4}, Lcom/saterskog/cell_lab/CellWorld;->b(FFFF)V

    .line 3117
    invoke-static {}, Lcom/saterskog/b/a;->b()V

    .line 3118
    invoke-direct/range {p0 .. p4}, Lcom/saterskog/cell_lab/CellWorld;->c(FFFF)V

    .line 3120
    invoke-static {}, Lcom/saterskog/b/a;->b()V

    goto/16 :goto_0

    .line 50112
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_2
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method

.method public final a(IZ)V
    .locals 13

    .prologue
    const/4 v12, 0x3

    const/4 v11, 0x2

    const/4 v10, 0x1

    const/4 v5, -0x1

    const/4 v9, 0x0

    .line 771
    move v0, v9

    :goto_0
    iget-object v1, p0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    aget-object v1, v1, p1

    iget v1, v1, Lcom/saterskog/cell_lab/Cell;->C:I

    if-ge v0, v1, :cond_2

    .line 772
    iget-object v1, p0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    aget-object v1, v1, p1

    iget-object v1, v1, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    aget-object v1, v1, v0

    iget v1, v1, Lcom/saterskog/cell_lab/Link;->a:I

    if-eq v1, v5, :cond_0

    move v1, v9

    .line 773
    :goto_1
    iget-object v2, p0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    iget-object v3, p0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    aget-object v3, v3, p1

    iget-object v3, v3, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    aget-object v3, v3, v0

    iget v3, v3, Lcom/saterskog/cell_lab/Link;->a:I

    aget-object v2, v2, v3

    iget v2, v2, Lcom/saterskog/cell_lab/Cell;->C:I

    if-ge v1, v2, :cond_0

    .line 776
    iget-object v2, p0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    iget-object v3, p0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    aget-object v3, v3, p1

    iget-object v3, v3, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    aget-object v3, v3, v0

    iget v3, v3, Lcom/saterskog/cell_lab/Link;->a:I

    aget-object v2, v2, v3

    iget-object v2, v2, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    aget-object v2, v2, v1

    iget v2, v2, Lcom/saterskog/cell_lab/Link;->a:I

    if-ne v2, p1, :cond_1

    .line 777
    iget-object v2, p0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    iget-object v3, p0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    aget-object v3, v3, p1

    iget-object v3, v3, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    aget-object v3, v3, v0

    iget v3, v3, Lcom/saterskog/cell_lab/Link;->a:I

    aget-object v2, v2, v3

    iget-object v2, v2, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    aget-object v1, v2, v1

    iget-object v2, p0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    iget-object v3, p0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    aget-object v3, v3, p1

    iget-object v3, v3, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    aget-object v3, v3, v0

    iget v3, v3, Lcom/saterskog/cell_lab/Link;->a:I

    aget-object v2, v2, v3

    iget-object v2, v2, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    iget-object v3, p0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    iget-object v4, p0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    aget-object v4, v4, p1

    iget-object v4, v4, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    aget-object v4, v4, v0

    iget v4, v4, Lcom/saterskog/cell_lab/Link;->a:I

    aget-object v3, v3, v4

    iget v3, v3, Lcom/saterskog/cell_lab/Cell;->C:I

    add-int/lit8 v3, v3, -0x1

    aget-object v2, v2, v3

    .line 778
    invoke-virtual {v1, v2}, Lcom/saterskog/cell_lab/Link;->a(Lcom/saterskog/cell_lab/Link;)V

    .line 779
    iget-object v1, p0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    iget-object v2, p0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    aget-object v2, v2, p1

    iget-object v2, v2, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    aget-object v2, v2, v0

    iget v2, v2, Lcom/saterskog/cell_lab/Link;->a:I

    aget-object v1, v1, v2

    iget v2, v1, Lcom/saterskog/cell_lab/Cell;->C:I

    add-int/lit8 v2, v2, -0x1

    iput v2, v1, Lcom/saterskog/cell_lab/Cell;->C:I

    .line 771
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto/16 :goto_0

    .line 773
    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    move v0, v9

    .line 784
    :goto_2
    iget-object v1, p0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    iget v2, p0, Lcom/saterskog/cell_lab/CellWorld;->z:I

    add-int/lit8 v2, v2, -0x1

    aget-object v1, v1, v2

    iget v1, v1, Lcom/saterskog/cell_lab/Cell;->C:I

    if-ge v0, v1, :cond_5

    .line 785
    iget-object v1, p0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    iget v2, p0, Lcom/saterskog/cell_lab/CellWorld;->z:I

    add-int/lit8 v2, v2, -0x1

    aget-object v1, v1, v2

    iget-object v1, v1, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    aget-object v1, v1, v0

    iget v1, v1, Lcom/saterskog/cell_lab/Link;->a:I

    if-eq v1, v5, :cond_3

    move v1, v9

    .line 786
    :goto_3
    iget-object v2, p0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    iget-object v3, p0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    iget v4, p0, Lcom/saterskog/cell_lab/CellWorld;->z:I

    add-int/lit8 v4, v4, -0x1

    aget-object v3, v3, v4

    iget-object v3, v3, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    aget-object v3, v3, v0

    iget v3, v3, Lcom/saterskog/cell_lab/Link;->a:I

    aget-object v2, v2, v3

    iget v2, v2, Lcom/saterskog/cell_lab/Cell;->C:I

    if-ge v1, v2, :cond_3

    .line 787
    iget-object v2, p0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    iget-object v3, p0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    iget v4, p0, Lcom/saterskog/cell_lab/CellWorld;->z:I

    add-int/lit8 v4, v4, -0x1

    aget-object v3, v3, v4

    iget-object v3, v3, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    aget-object v3, v3, v0

    iget v3, v3, Lcom/saterskog/cell_lab/Link;->a:I

    aget-object v2, v2, v3

    iget-object v2, v2, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    aget-object v2, v2, v1

    iget v2, v2, Lcom/saterskog/cell_lab/Link;->a:I

    iget v3, p0, Lcom/saterskog/cell_lab/CellWorld;->z:I

    add-int/lit8 v3, v3, -0x1

    if-ne v2, v3, :cond_4

    .line 788
    iget-object v2, p0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    iget-object v3, p0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    iget v4, p0, Lcom/saterskog/cell_lab/CellWorld;->z:I

    add-int/lit8 v4, v4, -0x1

    aget-object v3, v3, v4

    iget-object v3, v3, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    aget-object v3, v3, v0

    iget v3, v3, Lcom/saterskog/cell_lab/Link;->a:I

    aget-object v2, v2, v3

    iget-object v2, v2, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    aget-object v1, v2, v1

    iput p1, v1, Lcom/saterskog/cell_lab/Link;->a:I

    .line 784
    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 786
    :cond_4
    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    .line 793
    :cond_5
    if-eqz p2, :cond_6

    .line 794
    iget v0, p0, Lcom/saterskog/cell_lab/CellWorld;->B:I

    iget v1, p0, Lcom/saterskog/cell_lab/CellWorld;->aa:I

    if-lt v0, v1, :cond_8

    .line 795
    const-string v0, "Too many pieces of food!!"

    invoke-static {v0}, Lcom/saterskog/b/a;->a(Ljava/lang/String;)V

    .line 800
    :cond_6
    :goto_4
    iget v0, p0, Lcom/saterskog/cell_lab/CellWorld;->C:I

    iget v1, p0, Lcom/saterskog/cell_lab/CellWorld;->ac:I

    if-ge v0, v1, :cond_7

    .line 802
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    aget-object v0, v0, p1

    .line 804
    iget-wide v2, v0, Lcom/saterskog/cell_lab/Cell;->b:D

    iget-wide v4, v0, Lcom/saterskog/cell_lab/Cell;->b:D

    mul-double/2addr v2, v4

    iget-wide v4, v0, Lcom/saterskog/cell_lab/Cell;->c:D

    iget-wide v6, v0, Lcom/saterskog/cell_lab/Cell;->c:D

    mul-double/2addr v4, v6

    add-double/2addr v2, v4

    iget-object v1, p0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v4, v1, Lcom/saterskog/cell_lab/Environment;->k:D

    iget-object v1, p0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v6, v1, Lcom/saterskog/cell_lab/Environment;->k:D

    mul-double/2addr v4, v6

    cmpg-double v1, v2, v4

    if-gtz v1, :cond_7

    .line 805
    iget-object v1, p0, Lcom/saterskog/cell_lab/CellWorld;->y:[Lcom/saterskog/cell_lab/e;

    iget v2, p0, Lcom/saterskog/cell_lab/CellWorld;->C:I

    aget-object v1, v1, v2

    iget-wide v2, v0, Lcom/saterskog/cell_lab/Cell;->b:D

    iput-wide v2, v1, Lcom/saterskog/cell_lab/e;->a:D

    .line 806
    iget-object v1, p0, Lcom/saterskog/cell_lab/CellWorld;->y:[Lcom/saterskog/cell_lab/e;

    iget v2, p0, Lcom/saterskog/cell_lab/CellWorld;->C:I

    aget-object v1, v1, v2

    iget-wide v2, v0, Lcom/saterskog/cell_lab/Cell;->c:D

    iput-wide v2, v1, Lcom/saterskog/cell_lab/e;->b:D

    .line 807
    iget-object v1, p0, Lcom/saterskog/cell_lab/CellWorld;->y:[Lcom/saterskog/cell_lab/e;

    iget v2, p0, Lcom/saterskog/cell_lab/CellWorld;->C:I

    aget-object v1, v1, v2

    iget-wide v2, v0, Lcom/saterskog/cell_lab/Cell;->d:D

    iput-wide v2, v1, Lcom/saterskog/cell_lab/e;->c:D

    .line 808
    iget-object v1, p0, Lcom/saterskog/cell_lab/CellWorld;->y:[Lcom/saterskog/cell_lab/e;

    iget v2, p0, Lcom/saterskog/cell_lab/CellWorld;->C:I

    aget-object v1, v1, v2

    const-wide/16 v2, 0x0

    iput-wide v2, v1, Lcom/saterskog/cell_lab/e;->d:D

    .line 809
    iget-object v1, p0, Lcom/saterskog/cell_lab/CellWorld;->y:[Lcom/saterskog/cell_lab/e;

    iget v2, p0, Lcom/saterskog/cell_lab/CellWorld;->C:I

    aget-object v1, v1, v2

    iget-object v1, v1, Lcom/saterskog/cell_lab/e;->e:[F

    iget-object v2, v0, Lcom/saterskog/cell_lab/Cell;->J:[F

    aget v2, v2, v9

    aput v2, v1, v9

    .line 810
    iget-object v1, p0, Lcom/saterskog/cell_lab/CellWorld;->y:[Lcom/saterskog/cell_lab/e;

    iget v2, p0, Lcom/saterskog/cell_lab/CellWorld;->C:I

    aget-object v1, v1, v2

    iget-object v1, v1, Lcom/saterskog/cell_lab/e;->e:[F

    iget-object v2, v0, Lcom/saterskog/cell_lab/Cell;->J:[F

    aget v2, v2, v10

    aput v2, v1, v10

    .line 811
    iget-object v1, p0, Lcom/saterskog/cell_lab/CellWorld;->y:[Lcom/saterskog/cell_lab/e;

    iget v2, p0, Lcom/saterskog/cell_lab/CellWorld;->C:I

    aget-object v1, v1, v2

    iget-object v1, v1, Lcom/saterskog/cell_lab/e;->e:[F

    iget-object v2, v0, Lcom/saterskog/cell_lab/Cell;->J:[F

    aget v2, v2, v11

    aput v2, v1, v11

    .line 812
    iget-object v1, p0, Lcom/saterskog/cell_lab/CellWorld;->y:[Lcom/saterskog/cell_lab/e;

    iget v2, p0, Lcom/saterskog/cell_lab/CellWorld;->C:I

    aget-object v1, v1, v2

    iget-object v1, v1, Lcom/saterskog/cell_lab/e;->e:[F

    iget-object v0, v0, Lcom/saterskog/cell_lab/Cell;->J:[F

    aget v0, v0, v12

    aput v0, v1, v12

    .line 813
    iget v0, p0, Lcom/saterskog/cell_lab/CellWorld;->C:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/saterskog/cell_lab/CellWorld;->C:I

    .line 816
    :cond_7
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    aget-object v0, v0, p1

    iget-object v1, p0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    iget v2, p0, Lcom/saterskog/cell_lab/CellWorld;->z:I

    add-int/lit8 v2, v2, -0x1

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Lcom/saterskog/cell_lab/Cell;->a(Lcom/saterskog/cell_lab/Cell;)V

    .line 817
    iget v0, p0, Lcom/saterskog/cell_lab/CellWorld;->z:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/saterskog/cell_lab/CellWorld;->z:I

    .line 818
    iget v0, p0, Lcom/saterskog/cell_lab/CellWorld;->R:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/saterskog/cell_lab/CellWorld;->R:I

    .line 819
    return-void

    .line 797
    :cond_8
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    aget-object v0, v0, p1

    iget-wide v2, v0, Lcom/saterskog/cell_lab/Cell;->b:D

    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    aget-object v0, v0, p1

    iget-wide v4, v0, Lcom/saterskog/cell_lab/Cell;->c:D

    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    aget-object v0, v0, p1

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->w:D

    const-wide v6, 0x3feccccccccccccdL    # 0.9

    mul-double/2addr v6, v0

    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    aget-object v0, v0, p1

    invoke-virtual {v0}, Lcom/saterskog/cell_lab/Cell;->b()Lcom/saterskog/cell_lab/Gene;

    move-result-object v0

    iget-object v0, v0, Lcom/saterskog/cell_lab/Gene;->s:Lcom/saterskog/cell_lab/h;

    sget-object v1, Lcom/saterskog/cell_lab/h;->e:Lcom/saterskog/cell_lab/h;

    if-ne v0, v1, :cond_9

    const/high16 v8, 0x3f000000    # 0.5f

    :goto_5
    move-object v1, p0

    invoke-virtual/range {v1 .. v8}, Lcom/saterskog/cell_lab/CellWorld;->a(DDDF)V

    goto/16 :goto_4

    :cond_9
    const/4 v8, 0x0

    goto :goto_5
.end method

.method public final a(Landroid/content/Context;)V
    .locals 9

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 680
    sget-object v0, Lcom/saterskog/cell_lab/h;->B:[Lcom/saterskog/cell_lab/h;

    array-length v0, v0

    mul-int/lit8 v3, v0, 0x2

    iget-boolean v0, p0, Lcom/saterskog/cell_lab/CellWorld;->bg:Z

    if-eqz v0, :cond_1

    move v0, v1

    :goto_0
    add-int/2addr v3, v0

    .line 681
    new-array v0, v3, [I

    iput-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->au:[I

    .line 682
    new-array v0, v3, [I

    iput-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->ax:[I

    .line 683
    new-array v0, v3, [I

    iput-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->ay:[I

    .line 684
    new-array v0, v3, [I

    iput-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->az:[I

    .line 685
    new-array v0, v3, [I

    iput-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->aA:[I

    .line 686
    new-array v0, v3, [I

    iput-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->aB:[I

    .line 687
    new-array v0, v3, [I

    iput-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->av:[I

    .line 688
    new-array v0, v3, [I

    iput-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->aw:[I

    .line 689
    new-array v0, v3, [I

    iput-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->aQ:[I

    .line 690
    sget-object v0, Lcom/saterskog/cell_lab/h;->B:[Lcom/saterskog/cell_lab/h;

    array-length v4, v0

    iget-boolean v0, p0, Lcom/saterskog/cell_lab/CellWorld;->bg:Z

    if-eqz v0, :cond_2

    move v0, v1

    :goto_1
    add-int/2addr v4, v0

    move v0, v2

    .line 691
    :goto_2
    if-ge v0, v3, :cond_5

    .line 693
    sget-object v5, Lcom/saterskog/cell_lab/h;->B:[Lcom/saterskog/cell_lab/h;

    array-length v5, v5

    if-ge v0, v5, :cond_3

    .line 694
    iget-object v5, p0, Lcom/saterskog/cell_lab/CellWorld;->au:[I

    sget-object v6, Lcom/saterskog/cell_lab/h;->B:[Lcom/saterskog/cell_lab/h;

    aget-object v6, v6, v0

    iget v6, v6, Lcom/saterskog/cell_lab/h;->w:I

    sget-object v7, Lcom/saterskog/cell_lab/h;->B:[Lcom/saterskog/cell_lab/h;

    aget-object v7, v7, v0

    iget v7, v7, Lcom/saterskog/cell_lab/h;->x:I

    invoke-static {p1, v6, v7}, Lcom/saterskog/b/c;->a(Landroid/content/Context;II)I

    move-result v6

    aput v6, v5, v0

    .line 709
    :goto_3
    iget-object v5, p0, Lcom/saterskog/cell_lab/CellWorld;->au:[I

    aget v5, v5, v0

    invoke-static {v5}, Landroid/opengl/GLES20;->glUseProgram(I)V

    .line 711
    iget-object v5, p0, Lcom/saterskog/cell_lab/CellWorld;->ax:[I

    iget-object v6, p0, Lcom/saterskog/cell_lab/CellWorld;->au:[I

    aget v6, v6, v0

    const-string v7, "vPosition"

    invoke-static {v6, v7}, Landroid/opengl/GLES20;->glGetAttribLocation(ILjava/lang/String;)I

    move-result v6

    aput v6, v5, v0

    .line 713
    iget-object v5, p0, Lcom/saterskog/cell_lab/CellWorld;->ay:[I

    iget-object v6, p0, Lcom/saterskog/cell_lab/CellWorld;->au:[I

    aget v6, v6, v0

    const-string v7, "vTPosition"

    invoke-static {v6, v7}, Landroid/opengl/GLES20;->glGetAttribLocation(ILjava/lang/String;)I

    move-result v6

    aput v6, v5, v0

    .line 715
    iget-object v5, p0, Lcom/saterskog/cell_lab/CellWorld;->az:[I

    iget-object v6, p0, Lcom/saterskog/cell_lab/CellWorld;->au:[I

    aget v6, v6, v0

    const-string v7, "vCenter"

    invoke-static {v6, v7}, Landroid/opengl/GLES20;->glGetAttribLocation(ILjava/lang/String;)I

    move-result v6

    aput v6, v5, v0

    .line 717
    iget-object v5, p0, Lcom/saterskog/cell_lab/CellWorld;->aA:[I

    iget-object v6, p0, Lcom/saterskog/cell_lab/CellWorld;->au:[I

    aget v6, v6, v0

    const-string v7, "vColor"

    invoke-static {v6, v7}, Landroid/opengl/GLES20;->glGetAttribLocation(ILjava/lang/String;)I

    move-result v6

    aput v6, v5, v0

    .line 719
    iget-object v5, p0, Lcom/saterskog/cell_lab/CellWorld;->aB:[I

    iget-object v6, p0, Lcom/saterskog/cell_lab/CellWorld;->au:[I

    aget v6, v6, v0

    const-string v7, "tex1"

    invoke-static {v6, v7}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v6

    aput v6, v5, v0

    .line 721
    iget-object v5, p0, Lcom/saterskog/cell_lab/CellWorld;->aQ:[I

    iget-object v6, p0, Lcom/saterskog/cell_lab/CellWorld;->au:[I

    aget v6, v6, v0

    const-string v7, "uMVPMatrix"

    invoke-static {v6, v7}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v6

    aput v6, v5, v0

    .line 691
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_1
    move v0, v2

    .line 680
    goto/16 :goto_0

    :cond_2
    move v0, v2

    .line 690
    goto :goto_1

    .line 698
    :cond_3
    iget-boolean v5, p0, Lcom/saterskog/cell_lab/CellWorld;->bg:Z

    if-eqz v5, :cond_4

    sget-object v5, Lcom/saterskog/cell_lab/h;->B:[Lcom/saterskog/cell_lab/h;

    array-length v5, v5

    if-ne v0, v5, :cond_4

    .line 699
    iget-object v5, p0, Lcom/saterskog/cell_lab/CellWorld;->au:[I

    const v6, 0x7f0d0003

    const v7, 0x7f0d0002

    invoke-static {p1, v6, v7}, Lcom/saterskog/b/c;->a(Landroid/content/Context;II)I

    move-result v6

    aput v6, v5, v0

    goto :goto_3

    .line 701
    :cond_4
    sget-object v5, Lcom/saterskog/cell_lab/h;->B:[Lcom/saterskog/cell_lab/h;

    sub-int v6, v0, v4

    aget-object v5, v5, v6

    iget v5, v5, Lcom/saterskog/cell_lab/h;->y:I

    const/4 v6, -0x1

    if-eq v5, v6, :cond_0

    .line 703
    iget-object v5, p0, Lcom/saterskog/cell_lab/CellWorld;->au:[I

    sget-object v6, Lcom/saterskog/cell_lab/h;->B:[Lcom/saterskog/cell_lab/h;

    sub-int v7, v0, v4

    aget-object v6, v6, v7

    iget v6, v6, Lcom/saterskog/cell_lab/h;->y:I

    sget-object v7, Lcom/saterskog/cell_lab/h;->B:[Lcom/saterskog/cell_lab/h;

    sub-int v8, v0, v4

    aget-object v7, v7, v8

    iget v7, v7, Lcom/saterskog/cell_lab/h;->z:I

    invoke-static {p1, v6, v7}, Lcom/saterskog/b/c;->a(Landroid/content/Context;II)I

    move-result v6

    aput v6, v5, v0

    goto/16 :goto_3

    .line 725
    :cond_5
    const v0, 0x7f0d0012

    const v3, 0x7f0d0011

    invoke-static {p1, v0, v3}, Lcom/saterskog/b/c;->a(Landroid/content/Context;II)I

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/CellWorld;->ar:I

    .line 726
    iget v0, p0, Lcom/saterskog/cell_lab/CellWorld;->ar:I

    const-string v3, "vPosition"

    invoke-static {v0, v3}, Landroid/opengl/GLES20;->glGetAttribLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/CellWorld;->aC:I

    .line 727
    iget v0, p0, Lcom/saterskog/cell_lab/CellWorld;->ar:I

    const-string v3, "vCenter"

    invoke-static {v0, v3}, Landroid/opengl/GLES20;->glGetAttribLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/CellWorld;->aD:I

    .line 728
    iget v0, p0, Lcom/saterskog/cell_lab/CellWorld;->ar:I

    const-string v3, "color"

    invoke-static {v0, v3}, Landroid/opengl/GLES20;->glGetAttribLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/CellWorld;->aE:I

    .line 729
    iget v0, p0, Lcom/saterskog/cell_lab/CellWorld;->ar:I

    const-string v3, "uMVPMatrix"

    invoke-static {v0, v3}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/CellWorld;->aF:I

    .line 732
    const v0, 0x7f0d000e

    const v3, 0x7f0d000d

    invoke-static {p1, v0, v3}, Lcom/saterskog/b/c;->a(Landroid/content/Context;II)I

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/CellWorld;->at:I

    .line 733
    iget v0, p0, Lcom/saterskog/cell_lab/CellWorld;->at:I

    const-string v3, "vPosition"

    invoke-static {v0, v3}, Landroid/opengl/GLES20;->glGetAttribLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/CellWorld;->aG:I

    .line 734
    iget v0, p0, Lcom/saterskog/cell_lab/CellWorld;->at:I

    const-string v3, "vCenter"

    invoke-static {v0, v3}, Landroid/opengl/GLES20;->glGetAttribLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/CellWorld;->aI:I

    .line 735
    iget v0, p0, Lcom/saterskog/cell_lab/CellWorld;->at:I

    const-string v3, "vColor"

    invoke-static {v0, v3}, Landroid/opengl/GLES20;->glGetAttribLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/CellWorld;->aH:I

    .line 736
    iget v0, p0, Lcom/saterskog/cell_lab/CellWorld;->at:I

    const-string v3, "uMVPMatrix"

    invoke-static {v0, v3}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/CellWorld;->aJ:I

    .line 737
    iget v0, p0, Lcom/saterskog/cell_lab/CellWorld;->at:I

    const-string v3, "tex1"

    invoke-static {v0, v3}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/CellWorld;->aT:I

    .line 740
    const v0, 0x7f0d001e

    const v3, 0x7f0d001d

    invoke-static {p1, v0, v3}, Lcom/saterskog/b/c;->a(Landroid/content/Context;II)I

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/CellWorld;->aM:I

    .line 741
    iget v0, p0, Lcom/saterskog/cell_lab/CellWorld;->aM:I

    const-string v3, "vPosition"

    invoke-static {v0, v3}, Landroid/opengl/GLES20;->glGetAttribLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/CellWorld;->aN:I

    .line 742
    iget v0, p0, Lcom/saterskog/cell_lab/CellWorld;->aM:I

    const-string v3, "vTP"

    invoke-static {v0, v3}, Landroid/opengl/GLES20;->glGetAttribLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/CellWorld;->aO:I

    .line 743
    iget v0, p0, Lcom/saterskog/cell_lab/CellWorld;->aM:I

    const-string v3, "uMVPMatrix"

    invoke-static {v0, v3}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/CellWorld;->aP:I

    .line 754
    const v0, 0x7f0d0005

    const v3, 0x7f0d0004

    invoke-static {p1, v0, v3}, Lcom/saterskog/b/c;->a(Landroid/content/Context;II)I

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/CellWorld;->as:I

    .line 755
    iget v0, p0, Lcom/saterskog/cell_lab/CellWorld;->as:I

    const-string v3, "vPosition"

    invoke-static {v0, v3}, Landroid/opengl/GLES20;->glGetAttribLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/CellWorld;->aK:I

    .line 756
    iget v0, p0, Lcom/saterskog/cell_lab/CellWorld;->as:I

    const-string v3, "radius"

    invoke-static {v0, v3}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/CellWorld;->bi:I

    .line 757
    iget v0, p0, Lcom/saterskog/cell_lab/CellWorld;->as:I

    const-string v3, "dir"

    invoke-static {v0, v3}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/CellWorld;->bh:I

    .line 758
    iget v0, p0, Lcom/saterskog/cell_lab/CellWorld;->as:I

    const-string v3, "uMVPMatrix"

    invoke-static {v0, v3}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/CellWorld;->aL:I

    .line 762
    const v0, 0x7f070066

    invoke-static {p1, v0, v2}, Lcom/saterskog/b/c;->a(Landroid/content/Context;IZ)I

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/CellWorld;->aR:I

    .line 763
    const v0, 0x7f070055

    invoke-static {p1, v0, v1}, Lcom/saterskog/b/c;->a(Landroid/content/Context;IZ)I

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/CellWorld;->aS:I

    .line 765
    return-void
.end method

.method public final a(ZD)V
    .locals 0

    .prologue
    .line 882
    invoke-virtual {p0, p1, p2, p3}, Lcom/saterskog/cell_lab/CellWorld;->b(ZD)V

    .line 883
    invoke-virtual {p0, p2, p3}, Lcom/saterskog/cell_lab/CellWorld;->a(D)V

    .line 884
    return-void
.end method

.method public final a([F)V
    .locals 14

    .prologue
    const/4 v13, 0x4

    const/4 v1, 0x2

    const/16 v2, 0x1406

    const/4 v12, 0x1

    const/4 v3, 0x0

    .line 3998
    const/16 v0, 0xb71

    invoke-static {v0}, Landroid/opengl/GLES20;->glDisable(I)V

    .line 3999
    invoke-static {v3}, Landroid/opengl/GLES20;->glDepthMask(Z)V

    .line 4001
    const/16 v0, 0x302

    invoke-static {v12, v0}, Landroid/opengl/GLES20;->glBlendFunc(II)V

    .line 4002
    const/16 v0, 0xbe2

    invoke-static {v0}, Landroid/opengl/GLES20;->glEnable(I)V

    .line 50798
    iget v0, p0, Lcom/saterskog/cell_lab/CellWorld;->as:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glUseProgram(I)V

    .line 50801
    iget v0, p0, Lcom/saterskog/cell_lab/CellWorld;->aK:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    .line 50807
    iget v0, p0, Lcom/saterskog/cell_lab/CellWorld;->aK:I

    const/16 v4, 0x8

    iget-object v5, p0, Lcom/saterskog/cell_lab/CellWorld;->k:Ljava/nio/FloatBuffer;

    invoke-static/range {v0 .. v5}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZILjava/nio/Buffer;)V

    .line 50809
    iget v0, p0, Lcom/saterskog/cell_lab/CellWorld;->aL:I

    invoke-static {v0, v12, v3, p1, v3}, Landroid/opengl/GLES20;->glUniformMatrix4fv(IIZ[FI)V

    .line 50810
    iget v0, p0, Lcom/saterskog/cell_lab/CellWorld;->bh:I

    iget-wide v4, p0, Lcom/saterskog/cell_lab/CellWorld;->O:D

    invoke-static {v4, v5}, Ljava/lang/Math;->cos(D)D

    move-result-wide v4

    double-to-float v4, v4

    iget-wide v6, p0, Lcom/saterskog/cell_lab/CellWorld;->O:D

    invoke-static {v6, v7}, Ljava/lang/Math;->sin(D)D

    move-result-wide v6

    double-to-float v5, v6

    iget-object v6, p0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v6, v6, Lcom/saterskog/cell_lab/Environment;->f:D

    double-to-float v6, v6

    iget-object v7, p0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v8, v7, Lcom/saterskog/cell_lab/Environment;->d:D

    double-to-float v7, v8

    invoke-static {v0, v4, v5, v6, v7}, Landroid/opengl/GLES20;->glUniform4f(IFFFF)V

    .line 50812
    iget v0, p0, Lcom/saterskog/cell_lab/CellWorld;->bi:I

    iget-object v4, p0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v4, v4, Lcom/saterskog/cell_lab/Environment;->k:D

    double-to-float v4, v4

    invoke-static {v0, v4}, Landroid/opengl/GLES20;->glUniform1f(IF)V

    .line 50814
    const/4 v0, 0x6

    invoke-static {v13, v3, v0}, Landroid/opengl/GLES20;->glDrawArrays(III)V

    .line 50816
    iget v0, p0, Lcom/saterskog/cell_lab/CellWorld;->aK:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glDisableVertexAttribArray(I)V

    .line 4005
    const/16 v0, 0x302

    const/16 v4, 0x303

    invoke-static {v0, v4}, Landroid/opengl/GLES20;->glBlendFunc(II)V

    .line 50820
    iget v0, p0, Lcom/saterskog/cell_lab/CellWorld;->ar:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glUseProgram(I)V

    .line 50822
    iget v0, p0, Lcom/saterskog/cell_lab/CellWorld;->aC:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    .line 50824
    iget v0, p0, Lcom/saterskog/cell_lab/CellWorld;->aD:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    .line 50826
    iget v0, p0, Lcom/saterskog/cell_lab/CellWorld;->aE:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    move v10, v3

    .line 50832
    :goto_0
    iget v0, p0, Lcom/saterskog/cell_lab/CellWorld;->be:I

    mul-int/lit16 v4, v10, 0x7ffe

    if-le v0, v4, :cond_0

    .line 50833
    mul-int/lit16 v0, v10, 0x7ffe

    .line 50834
    iget v4, p0, Lcom/saterskog/cell_lab/CellWorld;->be:I

    sub-int/2addr v4, v0

    const/16 v5, 0x7ffe

    invoke-static {v4, v5}, Ljava/lang/Math;->min(II)I

    move-result v11

    .line 50835
    iget-object v4, p0, Lcom/saterskog/cell_lab/CellWorld;->l:Ljava/nio/FloatBuffer;

    iget-object v5, p0, Lcom/saterskog/cell_lab/CellWorld;->ah:[F

    mul-int/lit8 v6, v0, 0x2

    mul-int/lit8 v7, v11, 0x2

    invoke-virtual {v4, v5, v6, v7}, Ljava/nio/FloatBuffer;->put([FII)Ljava/nio/FloatBuffer;

    .line 50836
    iget-object v4, p0, Lcom/saterskog/cell_lab/CellWorld;->l:Ljava/nio/FloatBuffer;

    invoke-virtual {v4, v3}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    .line 50837
    iget-object v4, p0, Lcom/saterskog/cell_lab/CellWorld;->m:Ljava/nio/FloatBuffer;

    iget-object v5, p0, Lcom/saterskog/cell_lab/CellWorld;->ai:[F

    mul-int/lit8 v6, v0, 0x2

    mul-int/lit8 v7, v11, 0x2

    invoke-virtual {v4, v5, v6, v7}, Ljava/nio/FloatBuffer;->put([FII)Ljava/nio/FloatBuffer;

    .line 50838
    iget-object v4, p0, Lcom/saterskog/cell_lab/CellWorld;->m:Ljava/nio/FloatBuffer;

    invoke-virtual {v4, v3}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    .line 50839
    iget-object v4, p0, Lcom/saterskog/cell_lab/CellWorld;->o:Ljava/nio/FloatBuffer;

    iget-object v5, p0, Lcom/saterskog/cell_lab/CellWorld;->aj:[F

    mul-int/lit8 v0, v0, 0x4

    mul-int/lit8 v6, v11, 0x4

    invoke-virtual {v4, v5, v0, v6}, Ljava/nio/FloatBuffer;->put([FII)Ljava/nio/FloatBuffer;

    .line 50840
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->o:Ljava/nio/FloatBuffer;

    invoke-virtual {v0, v3}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    .line 50842
    iget v0, p0, Lcom/saterskog/cell_lab/CellWorld;->aC:I

    const/16 v4, 0x8

    iget-object v5, p0, Lcom/saterskog/cell_lab/CellWorld;->l:Ljava/nio/FloatBuffer;

    invoke-static/range {v0 .. v5}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZILjava/nio/Buffer;)V

    .line 50844
    iget v0, p0, Lcom/saterskog/cell_lab/CellWorld;->aD:I

    const/16 v4, 0x8

    iget-object v5, p0, Lcom/saterskog/cell_lab/CellWorld;->m:Ljava/nio/FloatBuffer;

    invoke-static/range {v0 .. v5}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZILjava/nio/Buffer;)V

    .line 50846
    iget v4, p0, Lcom/saterskog/cell_lab/CellWorld;->aE:I

    const/16 v8, 0x10

    iget-object v9, p0, Lcom/saterskog/cell_lab/CellWorld;->o:Ljava/nio/FloatBuffer;

    move v5, v13

    move v6, v2

    move v7, v3

    invoke-static/range {v4 .. v9}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZILjava/nio/Buffer;)V

    .line 50848
    iget v0, p0, Lcom/saterskog/cell_lab/CellWorld;->aF:I

    invoke-static {v0, v12, v3, p1, v3}, Landroid/opengl/GLES20;->glUniformMatrix4fv(IIZ[FI)V

    .line 50850
    invoke-static {v13, v3, v11}, Landroid/opengl/GLES20;->glDrawArrays(III)V

    .line 50851
    add-int/lit8 v0, v10, 0x1

    move v10, v0

    .line 50852
    goto :goto_0

    .line 50853
    :cond_0
    iget v0, p0, Lcom/saterskog/cell_lab/CellWorld;->aC:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glDisableVertexAttribArray(I)V

    .line 50854
    iget v0, p0, Lcom/saterskog/cell_lab/CellWorld;->aD:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glDisableVertexAttribArray(I)V

    .line 50855
    iget v0, p0, Lcom/saterskog/cell_lab/CellWorld;->aE:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glDisableVertexAttribArray(I)V

    .line 4008
    invoke-virtual {p0, p1}, Lcom/saterskog/cell_lab/CellWorld;->c([F)V

    .line 4009
    const/16 v0, 0xb71

    invoke-static {v0}, Landroid/opengl/GLES20;->glEnable(I)V

    .line 4010
    const/16 v0, 0x207

    invoke-static {v0}, Landroid/opengl/GLES20;->glDepthFunc(I)V

    .line 4011
    invoke-virtual {p0, p1}, Lcom/saterskog/cell_lab/CellWorld;->b([F)V

    .line 4012
    invoke-static {v12}, Landroid/opengl/GLES20;->glDepthMask(Z)V

    .line 4013
    invoke-virtual {p0, p1}, Lcom/saterskog/cell_lab/CellWorld;->d([F)V

    .line 4014
    const/16 v0, 0xb71

    invoke-static {v0}, Landroid/opengl/GLES20;->glEnable(I)V

    .line 4015
    const/16 v0, 0x201

    invoke-static {v0}, Landroid/opengl/GLES20;->glDepthFunc(I)V

    .line 4016
    invoke-static {v3}, Landroid/opengl/GLES20;->glDepthMask(Z)V

    .line 4017
    invoke-virtual {p0, p1}, Lcom/saterskog/cell_lab/CellWorld;->e([F)V

    .line 4018
    const/16 v0, 0xbe2

    invoke-static {v0}, Landroid/opengl/GLES20;->glDisable(I)V

    .line 4020
    return-void
.end method

.method public final a(Lcom/saterskog/cell_lab/Cell;)Z
    .locals 6

    .prologue
    .line 559
    iget v0, p0, Lcom/saterskog/cell_lab/CellWorld;->z:I

    iget v1, p0, Lcom/saterskog/cell_lab/CellWorld;->d:I

    if-ge v0, v1, :cond_2

    .line 561
    if-eqz p1, :cond_0

    iget-wide v0, p1, Lcom/saterskog/cell_lab/Cell;->b:D

    iget-wide v2, p1, Lcom/saterskog/cell_lab/Cell;->b:D

    mul-double/2addr v0, v2

    iget-wide v2, p1, Lcom/saterskog/cell_lab/Cell;->c:D

    iget-wide v4, p1, Lcom/saterskog/cell_lab/Cell;->c:D

    mul-double/2addr v2, v4

    add-double/2addr v0, v2

    iget-object v2, p0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v2, v2, Lcom/saterskog/cell_lab/Environment;->k:D

    iget-object v4, p0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v4, v4, Lcom/saterskog/cell_lab/Environment;->k:D

    mul-double/2addr v2, v4

    cmpg-double v0, v0, v2

    if-gez v0, :cond_2

    .line 563
    :cond_0
    if-eqz p1, :cond_1

    .line 564
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    iget v1, p0, Lcom/saterskog/cell_lab/CellWorld;->z:I

    aget-object v0, v0, v1

    invoke-virtual {v0, p1}, Lcom/saterskog/cell_lab/Cell;->a(Lcom/saterskog/cell_lab/Cell;)V

    .line 566
    :cond_1
    iget v0, p0, Lcom/saterskog/cell_lab/CellWorld;->z:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/saterskog/cell_lab/CellWorld;->z:I

    .line 568
    const/4 v0, 0x1

    .line 571
    :goto_0
    return v0

    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final b(I)I
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 4375
    move v1, v0

    .line 4376
    :goto_0
    iget v2, p0, Lcom/saterskog/cell_lab/CellWorld;->z:I

    if-ge v0, v2, :cond_1

    .line 4377
    iget-object v2, p0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    aget-object v2, v2, v0

    iget v2, v2, Lcom/saterskog/cell_lab/Cell;->E:I

    if-ne v2, p1, :cond_0

    .line 4378
    add-int/lit8 v1, v1, 0x1

    .line 4376
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 4380
    :cond_1
    return v1
.end method

.method public final b()V
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 4371
    move v0, v1

    :goto_0
    iget v2, p0, Lcom/saterskog/cell_lab/CellWorld;->z:I

    if-ge v0, v2, :cond_0

    .line 4372
    iget-object v2, p0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    aget-object v2, v2, v0

    iput v1, v2, Lcom/saterskog/cell_lab/Cell;->F:I

    .line 4371
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 4373
    :cond_0
    return-void
.end method

.method public final b(ZD)V
    .locals 6

    .prologue
    .line 886
    iget v0, p0, Lcom/saterskog/cell_lab/CellWorld;->X:I

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Tried to run update1 too early"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 887
    :cond_0
    iget v0, p0, Lcom/saterskog/cell_lab/CellWorld;->X:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/saterskog/cell_lab/CellWorld;->X:I

    .line 888
    const-wide v0, 0x3f947ae147ae147bL    # 0.02

    mul-double/2addr v0, p2

    .line 890
    iget-wide v2, p0, Lcom/saterskog/cell_lab/CellWorld;->M:D

    add-double/2addr v2, v0

    iput-wide v2, p0, Lcom/saterskog/cell_lab/CellWorld;->M:D

    .line 892
    iget-wide v2, p0, Lcom/saterskog/cell_lab/CellWorld;->O:D

    iget-object v4, p0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v4, v4, Lcom/saterskog/cell_lab/Environment;->e:D

    mul-double/2addr v4, v0

    add-double/2addr v2, v4

    iput-wide v2, p0, Lcom/saterskog/cell_lab/CellWorld;->O:D

    .line 893
    iget-wide v2, p0, Lcom/saterskog/cell_lab/CellWorld;->O:D

    invoke-static {v2, v3}, Ljava/lang/Math;->cos(D)D

    move-result-wide v2

    iput-wide v2, p0, Lcom/saterskog/cell_lab/CellWorld;->P:D

    .line 894
    iget-wide v2, p0, Lcom/saterskog/cell_lab/CellWorld;->O:D

    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    move-result-wide v2

    iput-wide v2, p0, Lcom/saterskog/cell_lab/CellWorld;->Q:D

    .line 896
    invoke-static {}, Lcom/saterskog/b/a;->b()V

    .line 897
    iget-boolean v2, p0, Lcom/saterskog/cell_lab/CellWorld;->bg:Z

    if-nez v2, :cond_1

    .line 898
    invoke-direct {p0, v0, v1}, Lcom/saterskog/cell_lab/CellWorld;->i(D)V

    .line 899
    invoke-direct {p0}, Lcom/saterskog/cell_lab/CellWorld;->k()V

    .line 904
    :cond_1
    invoke-static {}, Lcom/saterskog/b/a;->b()V

    .line 905
    invoke-direct {p0, v0, v1}, Lcom/saterskog/cell_lab/CellWorld;->f(D)V

    .line 906
    invoke-static {}, Lcom/saterskog/b/a;->b()V

    .line 907
    invoke-direct {p0, v0, v1}, Lcom/saterskog/cell_lab/CellWorld;->e(D)V

    .line 908
    invoke-static {}, Lcom/saterskog/b/a;->b()V

    .line 911
    invoke-direct {p0}, Lcom/saterskog/cell_lab/CellWorld;->j()V

    .line 913
    invoke-static {}, Lcom/saterskog/b/a;->b()V

    .line 914
    invoke-direct {p0}, Lcom/saterskog/cell_lab/CellWorld;->g()V

    .line 915
    invoke-static {}, Lcom/saterskog/b/a;->b()V

    .line 916
    iget-boolean v2, p0, Lcom/saterskog/cell_lab/CellWorld;->bg:Z

    if-nez v2, :cond_2

    .line 917
    invoke-direct {p0, v0, v1}, Lcom/saterskog/cell_lab/CellWorld;->d(D)V

    .line 918
    :cond_2
    invoke-static {}, Lcom/saterskog/b/a;->b()V

    .line 919
    invoke-direct {p0, v0, v1}, Lcom/saterskog/cell_lab/CellWorld;->h(D)V

    .line 920
    invoke-static {}, Lcom/saterskog/b/a;->b()V

    .line 921
    invoke-direct {p0}, Lcom/saterskog/cell_lab/CellWorld;->i()V

    .line 923
    invoke-static {}, Lcom/saterskog/b/a;->b()V

    .line 924
    invoke-direct {p0, p1, v0, v1}, Lcom/saterskog/cell_lab/CellWorld;->c(ZD)V

    .line 928
    invoke-static {}, Lcom/saterskog/b/a;->b()V

    .line 929
    invoke-direct {p0, v0, v1}, Lcom/saterskog/cell_lab/CellWorld;->c(D)V

    .line 930
    invoke-direct {p0}, Lcom/saterskog/cell_lab/CellWorld;->h()V

    .line 931
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/saterskog/cell_lab/CellWorld;->L:Z

    .line 932
    invoke-static {}, Lcom/saterskog/b/a;->b()V

    .line 934
    invoke-static {}, Lcom/saterskog/b/a;->a()V

    .line 938
    iget v0, p0, Lcom/saterskog/cell_lab/CellWorld;->X:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/saterskog/cell_lab/CellWorld;->X:I

    .line 939
    return-void
.end method

.method final b([F)V
    .locals 13

    .prologue
    const/16 v4, 0x10

    const/16 v2, 0x1406

    const/4 v1, 0x4

    const/4 v3, 0x0

    .line 4049
    iget v0, p0, Lcom/saterskog/cell_lab/CellWorld;->at:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glUseProgram(I)V

    .line 4051
    iget v0, p0, Lcom/saterskog/cell_lab/CellWorld;->aG:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    .line 4053
    iget v0, p0, Lcom/saterskog/cell_lab/CellWorld;->aI:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    .line 4055
    iget v0, p0, Lcom/saterskog/cell_lab/CellWorld;->aH:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    .line 4059
    const v0, 0x84c0

    invoke-static {v0}, Landroid/opengl/GLES20;->glActiveTexture(I)V

    .line 4060
    const/16 v0, 0xde1

    iget v5, p0, Lcom/saterskog/cell_lab/CellWorld;->aS:I

    invoke-static {v0, v5}, Landroid/opengl/GLES20;->glBindTexture(II)V

    .line 4061
    iget v0, p0, Lcom/saterskog/cell_lab/CellWorld;->aT:I

    invoke-static {v0, v3}, Landroid/opengl/GLES20;->glUniform1i(II)V

    move v11, v3

    .line 4066
    :goto_0
    iget v0, p0, Lcom/saterskog/cell_lab/CellWorld;->bf:I

    mul-int/lit16 v5, v11, 0x7ffe

    if-le v0, v5, :cond_0

    .line 4067
    mul-int/lit16 v0, v11, 0x7ffe

    .line 4068
    iget v5, p0, Lcom/saterskog/cell_lab/CellWorld;->bf:I

    sub-int/2addr v5, v0

    const/16 v6, 0x7ffe

    invoke-static {v5, v6}, Ljava/lang/Math;->min(II)I

    move-result v12

    .line 4069
    iget-object v5, p0, Lcom/saterskog/cell_lab/CellWorld;->l:Ljava/nio/FloatBuffer;

    iget-object v6, p0, Lcom/saterskog/cell_lab/CellWorld;->ak:[F

    mul-int/lit8 v7, v0, 0x4

    mul-int/lit8 v8, v12, 0x4

    invoke-virtual {v5, v6, v7, v8}, Ljava/nio/FloatBuffer;->put([FII)Ljava/nio/FloatBuffer;

    .line 4070
    iget-object v5, p0, Lcom/saterskog/cell_lab/CellWorld;->l:Ljava/nio/FloatBuffer;

    invoke-virtual {v5, v3}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    .line 4071
    iget-object v5, p0, Lcom/saterskog/cell_lab/CellWorld;->m:Ljava/nio/FloatBuffer;

    iget-object v6, p0, Lcom/saterskog/cell_lab/CellWorld;->al:[F

    mul-int/lit8 v7, v0, 0x2

    mul-int/lit8 v8, v12, 0x2

    invoke-virtual {v5, v6, v7, v8}, Ljava/nio/FloatBuffer;->put([FII)Ljava/nio/FloatBuffer;

    .line 4072
    iget-object v5, p0, Lcom/saterskog/cell_lab/CellWorld;->m:Ljava/nio/FloatBuffer;

    invoke-virtual {v5, v3}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    .line 4073
    iget-object v5, p0, Lcom/saterskog/cell_lab/CellWorld;->o:Ljava/nio/FloatBuffer;

    iget-object v6, p0, Lcom/saterskog/cell_lab/CellWorld;->am:[F

    mul-int/lit8 v0, v0, 0x4

    mul-int/lit8 v7, v12, 0x4

    invoke-virtual {v5, v6, v0, v7}, Ljava/nio/FloatBuffer;->put([FII)Ljava/nio/FloatBuffer;

    .line 4074
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->o:Ljava/nio/FloatBuffer;

    invoke-virtual {v0, v3}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    .line 4076
    iget v0, p0, Lcom/saterskog/cell_lab/CellWorld;->aG:I

    iget-object v5, p0, Lcom/saterskog/cell_lab/CellWorld;->l:Ljava/nio/FloatBuffer;

    invoke-static/range {v0 .. v5}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZILjava/nio/Buffer;)V

    .line 4078
    iget v5, p0, Lcom/saterskog/cell_lab/CellWorld;->aI:I

    const/4 v6, 0x2

    const/16 v9, 0x8

    iget-object v10, p0, Lcom/saterskog/cell_lab/CellWorld;->m:Ljava/nio/FloatBuffer;

    move v7, v2

    move v8, v3

    invoke-static/range {v5 .. v10}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZILjava/nio/Buffer;)V

    .line 4080
    iget v0, p0, Lcom/saterskog/cell_lab/CellWorld;->aH:I

    iget-object v5, p0, Lcom/saterskog/cell_lab/CellWorld;->o:Ljava/nio/FloatBuffer;

    invoke-static/range {v0 .. v5}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZILjava/nio/Buffer;)V

    .line 4082
    iget v0, p0, Lcom/saterskog/cell_lab/CellWorld;->aJ:I

    const/4 v5, 0x1

    invoke-static {v0, v5, v3, p1, v3}, Landroid/opengl/GLES20;->glUniformMatrix4fv(IIZ[FI)V

    .line 4084
    invoke-static {v1, v3, v12}, Landroid/opengl/GLES20;->glDrawArrays(III)V

    .line 4085
    add-int/lit8 v0, v11, 0x1

    move v11, v0

    .line 4086
    goto :goto_0

    .line 4087
    :cond_0
    iget v0, p0, Lcom/saterskog/cell_lab/CellWorld;->aG:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glDisableVertexAttribArray(I)V

    .line 4088
    iget v0, p0, Lcom/saterskog/cell_lab/CellWorld;->aI:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glDisableVertexAttribArray(I)V

    .line 4089
    iget v0, p0, Lcom/saterskog/cell_lab/CellWorld;->aH:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glDisableVertexAttribArray(I)V

    .line 4090
    return-void
.end method

.method public final c()I
    .locals 7

    .prologue
    const/4 v1, 0x0

    const/4 v6, 0x0

    .line 4383
    move v0, v1

    move v2, v1

    .line 4384
    :goto_0
    iget v3, p0, Lcom/saterskog/cell_lab/CellWorld;->z:I

    if-ge v0, v3, :cond_1

    .line 4385
    iget-object v3, p0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    aget-object v3, v3, v0

    iget v3, v3, Lcom/saterskog/cell_lab/Cell;->E:I

    if-nez v3, :cond_0

    iget-object v3, p0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    aget-object v3, v3, v0

    iget-object v3, v3, Lcom/saterskog/cell_lab/Cell;->J:[F

    aget v3, v3, v1

    sub-float/2addr v3, v6

    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    move-result v3

    iget-object v4, p0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    aget-object v4, v4, v0

    iget-object v4, v4, Lcom/saterskog/cell_lab/Cell;->J:[F

    const/4 v5, 0x1

    aget v4, v4, v5

    sub-float/2addr v4, v6

    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    move-result v4

    add-float/2addr v3, v4

    iget-object v4, p0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    aget-object v4, v4, v0

    iget-object v4, v4, Lcom/saterskog/cell_lab/Cell;->J:[F

    const/4 v5, 0x2

    aget v4, v4, v5

    sub-float/2addr v4, v6

    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    move-result v4

    add-float/2addr v3, v4

    const v4, 0x3dcccccd    # 0.1f

    cmpg-float v3, v3, v4

    if-gez v3, :cond_0

    .line 4386
    add-int/lit8 v2, v2, 0x1

    .line 4384
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 4388
    :cond_1
    return v2
.end method

.method public final c(I)V
    .locals 2

    .prologue
    .line 4407
    const/4 v0, 0x0

    :goto_0
    iget v1, p0, Lcom/saterskog/cell_lab/CellWorld;->z:I

    if-ge v0, v1, :cond_0

    .line 4408
    iget-object v1, p0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    aget-object v1, v1, v0

    iput p1, v1, Lcom/saterskog/cell_lab/Cell;->E:I

    .line 4407
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 4409
    :cond_0
    return-void
.end method

.method final c([F)V
    .locals 13

    .prologue
    const/16 v2, 0x1406

    const/4 v12, 0x1

    const/4 v1, 0x4

    const/4 v3, 0x0

    .line 4092
    iget v0, p0, Lcom/saterskog/cell_lab/CellWorld;->aM:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glUseProgram(I)V

    .line 4094
    iget v0, p0, Lcom/saterskog/cell_lab/CellWorld;->aN:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    .line 4095
    iget v0, p0, Lcom/saterskog/cell_lab/CellWorld;->aO:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    move v10, v3

    .line 4100
    :goto_0
    iget v0, p0, Lcom/saterskog/cell_lab/CellWorld;->ap:I

    mul-int/lit16 v4, v10, 0x7ffe

    if-le v0, v4, :cond_0

    .line 4101
    mul-int/lit16 v0, v10, 0x7ffe

    .line 4102
    iget v4, p0, Lcom/saterskog/cell_lab/CellWorld;->ap:I

    sub-int/2addr v4, v0

    const/16 v5, 0x7ffe

    invoke-static {v4, v5}, Ljava/lang/Math;->min(II)I

    move-result v11

    .line 4103
    iget-object v4, p0, Lcom/saterskog/cell_lab/CellWorld;->l:Ljava/nio/FloatBuffer;

    iget-object v5, p0, Lcom/saterskog/cell_lab/CellWorld;->an:[F

    mul-int/lit8 v6, v0, 0x4

    mul-int/lit8 v7, v11, 0x4

    invoke-virtual {v4, v5, v6, v7}, Ljava/nio/FloatBuffer;->put([FII)Ljava/nio/FloatBuffer;

    .line 4104
    iget-object v4, p0, Lcom/saterskog/cell_lab/CellWorld;->l:Ljava/nio/FloatBuffer;

    invoke-virtual {v4, v3}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    .line 4106
    iget-object v4, p0, Lcom/saterskog/cell_lab/CellWorld;->n:Ljava/nio/FloatBuffer;

    iget-object v5, p0, Lcom/saterskog/cell_lab/CellWorld;->ao:[F

    invoke-virtual {v4, v5, v0, v11}, Ljava/nio/FloatBuffer;->put([FII)Ljava/nio/FloatBuffer;

    .line 4107
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->n:Ljava/nio/FloatBuffer;

    invoke-virtual {v0, v3}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    .line 4109
    iget v0, p0, Lcom/saterskog/cell_lab/CellWorld;->aN:I

    const/16 v4, 0x10

    iget-object v5, p0, Lcom/saterskog/cell_lab/CellWorld;->l:Ljava/nio/FloatBuffer;

    invoke-static/range {v0 .. v5}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZILjava/nio/Buffer;)V

    .line 4110
    iget v4, p0, Lcom/saterskog/cell_lab/CellWorld;->aO:I

    iget-object v9, p0, Lcom/saterskog/cell_lab/CellWorld;->n:Ljava/nio/FloatBuffer;

    move v5, v12

    move v6, v2

    move v7, v3

    move v8, v1

    invoke-static/range {v4 .. v9}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZILjava/nio/Buffer;)V

    .line 4112
    iget v0, p0, Lcom/saterskog/cell_lab/CellWorld;->aP:I

    invoke-static {v0, v12, v3, p1, v3}, Landroid/opengl/GLES20;->glUniformMatrix4fv(IIZ[FI)V

    .line 4114
    invoke-static {v1, v3, v11}, Landroid/opengl/GLES20;->glDrawArrays(III)V

    .line 4115
    add-int/lit8 v0, v10, 0x1

    move v10, v0

    .line 4116
    goto :goto_0

    .line 4117
    :cond_0
    iget v0, p0, Lcom/saterskog/cell_lab/CellWorld;->aN:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glDisableVertexAttribArray(I)V

    .line 4118
    iget v0, p0, Lcom/saterskog/cell_lab/CellWorld;->aO:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glDisableVertexAttribArray(I)V

    .line 4119
    return-void
.end method

.method public final d()I
    .locals 6

    .prologue
    const v5, 0x3eb33333    # 0.35f

    const/4 v1, 0x0

    .line 4391
    move v0, v1

    move v2, v1

    .line 4392
    :goto_0
    iget v3, p0, Lcom/saterskog/cell_lab/CellWorld;->z:I

    if-ge v0, v3, :cond_1

    .line 4393
    iget-object v3, p0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    aget-object v3, v3, v0

    iget v3, v3, Lcom/saterskog/cell_lab/Cell;->E:I

    if-nez v3, :cond_0

    iget-object v3, p0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    aget-object v3, v3, v0

    iget-object v3, v3, Lcom/saterskog/cell_lab/Cell;->J:[F

    aget v3, v3, v1

    const v4, 0x3f266666    # 0.65f

    cmpl-float v3, v3, v4

    if-lez v3, :cond_0

    iget-object v3, p0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    aget-object v3, v3, v0

    iget-object v3, v3, Lcom/saterskog/cell_lab/Cell;->J:[F

    const/4 v4, 0x1

    aget v3, v3, v4

    cmpg-float v3, v3, v5

    if-gez v3, :cond_0

    iget-object v3, p0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    aget-object v3, v3, v0

    iget-object v3, v3, Lcom/saterskog/cell_lab/Cell;->J:[F

    const/4 v4, 0x2

    aget v3, v3, v4

    cmpg-float v3, v3, v5

    if-gez v3, :cond_0

    .line 4394
    add-int/lit8 v2, v2, 0x1

    .line 4392
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 4396
    :cond_1
    return v2
.end method

.method final d([F)V
    .locals 11

    .prologue
    .line 4159
    sget-object v0, Lcom/saterskog/cell_lab/h;->B:[Lcom/saterskog/cell_lab/h;

    array-length v0, v0

    .line 4160
    iget-boolean v1, p0, Lcom/saterskog/cell_lab/CellWorld;->bg:Z

    if-eqz v1, :cond_10

    add-int/lit8 v0, v0, 0x1

    move v6, v0

    .line 4161
    :goto_0
    const/4 v0, 0x0

    move v8, v0

    :goto_1
    if-ge v8, v6, :cond_f

    .line 4163
    sget-object v0, Lcom/saterskog/cell_lab/h;->B:[Lcom/saterskog/cell_lab/h;

    array-length v0, v0

    if-ge v8, v0, :cond_9

    .line 4165
    sget-object v0, Lcom/saterskog/cell_lab/h;->B:[Lcom/saterskog/cell_lab/h;

    aget-object v0, v0, v8

    .line 4166
    iget v0, v0, Lcom/saterskog/cell_lab/h;->w:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_e

    .line 4173
    :goto_2
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->au:[I

    aget v0, v0, v8

    invoke-static {v0}, Landroid/opengl/GLES20;->glUseProgram(I)V

    .line 4176
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->ax:[I

    aget v0, v0, v8

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 4177
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->ax:[I

    aget v0, v0, v8

    invoke-static {v0}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    .line 4180
    :cond_0
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->ay:[I

    aget v0, v0, v8

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    .line 4181
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->ay:[I

    aget v0, v0, v8

    invoke-static {v0}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    .line 4184
    :cond_1
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->aA:[I

    aget v0, v0, v8

    const/4 v1, -0x1

    if-eq v0, v1, :cond_2

    .line 4185
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->aA:[I

    aget v0, v0, v8

    invoke-static {v0}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    .line 4188
    :cond_2
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->az:[I

    aget v0, v0, v8

    const/4 v1, -0x1

    if-eq v0, v1, :cond_3

    .line 4189
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->az:[I

    aget v0, v0, v8

    invoke-static {v0}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    .line 4192
    :cond_3
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->aB:[I

    aget v0, v0, v8

    const/4 v1, -0x1

    if-eq v0, v1, :cond_4

    .line 4193
    const v0, 0x84c0

    invoke-static {v0}, Landroid/opengl/GLES20;->glActiveTexture(I)V

    .line 4194
    const/16 v0, 0xde1

    iget v1, p0, Lcom/saterskog/cell_lab/CellWorld;->aR:I

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glBindTexture(II)V

    .line 4195
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->aB:[I

    aget v0, v0, v8

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glUniform1i(II)V

    .line 4201
    :cond_4
    const/4 v0, 0x0

    move v7, v0

    :goto_3
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->u:[I

    aget v0, v0, v8

    if-ge v7, v0, :cond_a

    .line 4203
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->q:[[I

    aget-object v0, v0, v8

    aget v9, v0, v7

    .line 4204
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->s:[[I

    aget-object v0, v0, v8

    aget v10, v0, v7

    .line 4206
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->ax:[I

    aget v0, v0, v8

    const/4 v1, -0x1

    if-eq v0, v1, :cond_5

    .line 4207
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->l:Ljava/nio/FloatBuffer;

    iget-object v1, p0, Lcom/saterskog/cell_lab/CellWorld;->ad:[F

    mul-int/lit8 v2, v9, 0x2

    mul-int/lit8 v3, v10, 0x2

    invoke-virtual {v0, v1, v2, v3}, Ljava/nio/FloatBuffer;->put([FII)Ljava/nio/FloatBuffer;

    .line 4208
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->l:Ljava/nio/FloatBuffer;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    .line 4209
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->ax:[I

    aget v0, v0, v8

    const/4 v1, 0x2

    const/16 v2, 0x1406

    const/4 v3, 0x0

    const/16 v4, 0x8

    iget-object v5, p0, Lcom/saterskog/cell_lab/CellWorld;->l:Ljava/nio/FloatBuffer;

    invoke-static/range {v0 .. v5}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZILjava/nio/Buffer;)V

    .line 4211
    :cond_5
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->az:[I

    aget v0, v0, v8

    const/4 v1, -0x1

    if-eq v0, v1, :cond_6

    .line 4212
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->m:Ljava/nio/FloatBuffer;

    iget-object v1, p0, Lcom/saterskog/cell_lab/CellWorld;->af:[F

    mul-int/lit8 v2, v9, 0x2

    mul-int/lit8 v3, v10, 0x2

    invoke-virtual {v0, v1, v2, v3}, Ljava/nio/FloatBuffer;->put([FII)Ljava/nio/FloatBuffer;

    .line 4213
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->m:Ljava/nio/FloatBuffer;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    .line 4214
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->az:[I

    aget v0, v0, v8

    const/4 v1, 0x2

    const/16 v2, 0x1406

    const/4 v3, 0x0

    const/16 v4, 0x8

    iget-object v5, p0, Lcom/saterskog/cell_lab/CellWorld;->m:Ljava/nio/FloatBuffer;

    invoke-static/range {v0 .. v5}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZILjava/nio/Buffer;)V

    .line 4216
    :cond_6
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->ay:[I

    aget v0, v0, v8

    const/4 v1, -0x1

    if-eq v0, v1, :cond_7

    .line 4217
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->n:Ljava/nio/FloatBuffer;

    iget-object v1, p0, Lcom/saterskog/cell_lab/CellWorld;->ae:[F

    mul-int/lit8 v2, v9, 0x4

    mul-int/lit8 v3, v10, 0x4

    invoke-virtual {v0, v1, v2, v3}, Ljava/nio/FloatBuffer;->put([FII)Ljava/nio/FloatBuffer;

    .line 4218
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->n:Ljava/nio/FloatBuffer;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    .line 4219
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->ay:[I

    aget v0, v0, v8

    const/4 v1, 0x4

    const/16 v2, 0x1406

    const/4 v3, 0x0

    const/16 v4, 0x10

    iget-object v5, p0, Lcom/saterskog/cell_lab/CellWorld;->n:Ljava/nio/FloatBuffer;

    invoke-static/range {v0 .. v5}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZILjava/nio/Buffer;)V

    .line 4221
    :cond_7
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->aA:[I

    aget v0, v0, v8

    const/4 v1, -0x1

    if-eq v0, v1, :cond_8

    .line 4222
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->o:Ljava/nio/FloatBuffer;

    iget-object v1, p0, Lcom/saterskog/cell_lab/CellWorld;->ag:[F

    mul-int/lit8 v2, v9, 0x4

    mul-int/lit8 v3, v10, 0x4

    invoke-virtual {v0, v1, v2, v3}, Ljava/nio/FloatBuffer;->put([FII)Ljava/nio/FloatBuffer;

    .line 4223
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->o:Ljava/nio/FloatBuffer;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    .line 4224
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->aA:[I

    aget v0, v0, v8

    const/4 v1, 0x4

    const/16 v2, 0x1406

    const/4 v3, 0x0

    const/16 v4, 0x10

    iget-object v5, p0, Lcom/saterskog/cell_lab/CellWorld;->o:Ljava/nio/FloatBuffer;

    invoke-static/range {v0 .. v5}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZILjava/nio/Buffer;)V

    .line 4227
    :cond_8
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->aQ:[I

    aget v0, v0, v8

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, p1, v3}, Landroid/opengl/GLES20;->glUniformMatrix4fv(IIZ[FI)V

    .line 4229
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->p:Ljava/nio/ShortBuffer;

    iget-object v1, p0, Lcom/saterskog/cell_lab/CellWorld;->aq:[S

    iget-object v2, p0, Lcom/saterskog/cell_lab/CellWorld;->r:[[I

    aget-object v2, v2, v8

    aget v2, v2, v7

    iget-object v3, p0, Lcom/saterskog/cell_lab/CellWorld;->t:[[I

    aget-object v3, v3, v8

    aget v3, v3, v7

    invoke-virtual {v0, v1, v2, v3}, Ljava/nio/ShortBuffer;->put([SII)Ljava/nio/ShortBuffer;

    .line 4230
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->p:Ljava/nio/ShortBuffer;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/nio/ShortBuffer;->position(I)Ljava/nio/Buffer;

    .line 4231
    const/4 v0, 0x4

    iget-object v1, p0, Lcom/saterskog/cell_lab/CellWorld;->t:[[I

    aget-object v1, v1, v8

    aget v1, v1, v7

    const/16 v2, 0x1403

    iget-object v3, p0, Lcom/saterskog/cell_lab/CellWorld;->p:Ljava/nio/ShortBuffer;

    invoke-static {v0, v1, v2, v3}, Landroid/opengl/GLES20;->glDrawElements(IIILjava/nio/Buffer;)V

    .line 4201
    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_3

    .line 4170
    :cond_9
    const/16 v0, 0xbe2

    invoke-static {v0}, Landroid/opengl/GLES20;->glEnable(I)V

    goto/16 :goto_2

    .line 4235
    :cond_a
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->ax:[I

    aget v0, v0, v8

    const/4 v1, -0x1

    if-eq v0, v1, :cond_b

    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->ax:[I

    aget v0, v0, v8

    invoke-static {v0}, Landroid/opengl/GLES20;->glDisableVertexAttribArray(I)V

    .line 4236
    :cond_b
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->az:[I

    aget v0, v0, v8

    const/4 v1, -0x1

    if-eq v0, v1, :cond_c

    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->az:[I

    aget v0, v0, v8

    invoke-static {v0}, Landroid/opengl/GLES20;->glDisableVertexAttribArray(I)V

    .line 4237
    :cond_c
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->ay:[I

    aget v0, v0, v8

    const/4 v1, -0x1

    if-eq v0, v1, :cond_d

    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->ay:[I

    aget v0, v0, v8

    invoke-static {v0}, Landroid/opengl/GLES20;->glDisableVertexAttribArray(I)V

    .line 4238
    :cond_d
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->aA:[I

    aget v0, v0, v8

    const/4 v1, -0x1

    if-eq v0, v1, :cond_e

    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->aA:[I

    aget v0, v0, v8

    invoke-static {v0}, Landroid/opengl/GLES20;->glDisableVertexAttribArray(I)V

    .line 4161
    :cond_e
    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_1

    .line 4241
    :cond_f
    return-void

    :cond_10
    move v6, v0

    goto/16 :goto_0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 4335
    const/4 v0, 0x0

    return v0
.end method

.method public final e()I
    .locals 6

    .prologue
    const v5, 0x3f266666    # 0.65f

    const/4 v1, 0x0

    .line 4399
    move v0, v1

    move v2, v1

    .line 4400
    :goto_0
    iget v3, p0, Lcom/saterskog/cell_lab/CellWorld;->z:I

    if-ge v0, v3, :cond_1

    .line 4401
    iget-object v3, p0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    aget-object v3, v3, v0

    iget v3, v3, Lcom/saterskog/cell_lab/Cell;->E:I

    if-nez v3, :cond_0

    iget-object v3, p0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    aget-object v3, v3, v0

    iget-object v3, v3, Lcom/saterskog/cell_lab/Cell;->J:[F

    aget v3, v3, v1

    cmpl-float v3, v3, v5

    if-lez v3, :cond_0

    iget-object v3, p0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    aget-object v3, v3, v0

    iget-object v3, v3, Lcom/saterskog/cell_lab/Cell;->J:[F

    const/4 v4, 0x1

    aget v3, v3, v4

    cmpl-float v3, v3, v5

    if-lez v3, :cond_0

    iget-object v3, p0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    aget-object v3, v3, v0

    iget-object v3, v3, Lcom/saterskog/cell_lab/Cell;->J:[F

    const/4 v4, 0x2

    aget v3, v3, v4

    const v4, 0x3eb33333    # 0.35f

    cmpg-float v3, v3, v4

    if-gez v3, :cond_0

    .line 4402
    add-int/lit8 v2, v2, 0x1

    .line 4400
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 4404
    :cond_1
    return v2
.end method

.method final e([F)V
    .locals 12

    .prologue
    .line 4244
    sget-object v0, Lcom/saterskog/cell_lab/h;->B:[Lcom/saterskog/cell_lab/h;

    array-length v8, v0

    .line 4245
    iget-boolean v0, p0, Lcom/saterskog/cell_lab/CellWorld;->bg:Z

    if-eqz v0, :cond_8

    const/4 v0, 0x1

    :goto_0
    add-int v9, v8, v0

    .line 4246
    const/4 v0, 0x0

    move v7, v0

    :goto_1
    if-ge v7, v8, :cond_e

    .line 4248
    sget-object v0, Lcom/saterskog/cell_lab/h;->B:[Lcom/saterskog/cell_lab/h;

    aget-object v0, v0, v7

    .line 4249
    iget v0, v0, Lcom/saterskog/cell_lab/h;->y:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_d

    .line 4251
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->au:[I

    add-int v1, v9, v7

    aget v0, v0, v1

    invoke-static {v0}, Landroid/opengl/GLES20;->glUseProgram(I)V

    .line 4254
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->ax:[I

    add-int v1, v9, v7

    aget v0, v0, v1

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 4255
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->ax:[I

    add-int v1, v9, v7

    aget v0, v0, v1

    invoke-static {v0}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    .line 4258
    :cond_0
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->ay:[I

    add-int v1, v9, v7

    aget v0, v0, v1

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    .line 4259
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->ay:[I

    add-int v1, v9, v7

    aget v0, v0, v1

    invoke-static {v0}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    .line 4262
    :cond_1
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->aA:[I

    add-int v1, v9, v7

    aget v0, v0, v1

    const/4 v1, -0x1

    if-eq v0, v1, :cond_2

    .line 4263
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->aA:[I

    add-int v1, v9, v7

    aget v0, v0, v1

    invoke-static {v0}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    .line 4266
    :cond_2
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->az:[I

    add-int v1, v9, v7

    aget v0, v0, v1

    const/4 v1, -0x1

    if-eq v0, v1, :cond_3

    .line 4267
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->az:[I

    add-int v1, v9, v7

    aget v0, v0, v1

    invoke-static {v0}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    .line 4272
    :cond_3
    const/4 v0, 0x0

    move v6, v0

    .line 4273
    :goto_2
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->av:[I

    add-int v1, v9, v7

    aget v0, v0, v1

    mul-int/lit16 v1, v6, 0x7ffe

    if-le v0, v1, :cond_9

    .line 4274
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->aw:[I

    add-int v1, v9, v7

    aget v0, v0, v1

    mul-int/lit16 v1, v6, 0x7ffe

    add-int v10, v0, v1

    .line 4275
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->av:[I

    add-int v1, v9, v7

    aget v0, v0, v1

    mul-int/lit16 v1, v6, 0x7ffe

    sub-int/2addr v0, v1

    const/16 v1, 0x7ffe

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v11

    .line 4277
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->ax:[I

    add-int v1, v9, v7

    aget v0, v0, v1

    const/4 v1, -0x1

    if-eq v0, v1, :cond_4

    .line 4278
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->l:Ljava/nio/FloatBuffer;

    iget-object v1, p0, Lcom/saterskog/cell_lab/CellWorld;->ad:[F

    mul-int/lit8 v2, v10, 0x2

    mul-int/lit8 v3, v11, 0x2

    invoke-virtual {v0, v1, v2, v3}, Ljava/nio/FloatBuffer;->put([FII)Ljava/nio/FloatBuffer;

    .line 4279
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->l:Ljava/nio/FloatBuffer;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    .line 4280
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->ax:[I

    add-int v1, v9, v7

    aget v0, v0, v1

    const/4 v1, 0x2

    const/16 v2, 0x1406

    const/4 v3, 0x0

    const/16 v4, 0x8

    iget-object v5, p0, Lcom/saterskog/cell_lab/CellWorld;->l:Ljava/nio/FloatBuffer;

    invoke-static/range {v0 .. v5}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZILjava/nio/Buffer;)V

    .line 4282
    :cond_4
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->az:[I

    add-int v1, v9, v7

    aget v0, v0, v1

    const/4 v1, -0x1

    if-eq v0, v1, :cond_5

    .line 4283
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->m:Ljava/nio/FloatBuffer;

    iget-object v1, p0, Lcom/saterskog/cell_lab/CellWorld;->af:[F

    mul-int/lit8 v2, v10, 0x4

    mul-int/lit8 v3, v11, 0x4

    invoke-virtual {v0, v1, v2, v3}, Ljava/nio/FloatBuffer;->put([FII)Ljava/nio/FloatBuffer;

    .line 4284
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->m:Ljava/nio/FloatBuffer;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    .line 4285
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->az:[I

    add-int v1, v9, v7

    aget v0, v0, v1

    const/4 v1, 0x4

    const/16 v2, 0x1406

    const/4 v3, 0x0

    const/16 v4, 0x10

    iget-object v5, p0, Lcom/saterskog/cell_lab/CellWorld;->m:Ljava/nio/FloatBuffer;

    invoke-static/range {v0 .. v5}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZILjava/nio/Buffer;)V

    .line 4287
    :cond_5
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->ay:[I

    add-int v1, v9, v7

    aget v0, v0, v1

    const/4 v1, -0x1

    if-eq v0, v1, :cond_6

    .line 4288
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->n:Ljava/nio/FloatBuffer;

    iget-object v1, p0, Lcom/saterskog/cell_lab/CellWorld;->ae:[F

    mul-int/lit8 v2, v10, 0x4

    mul-int/lit8 v3, v11, 0x4

    invoke-virtual {v0, v1, v2, v3}, Ljava/nio/FloatBuffer;->put([FII)Ljava/nio/FloatBuffer;

    .line 4289
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->n:Ljava/nio/FloatBuffer;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    .line 4290
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->ay:[I

    add-int v1, v9, v7

    aget v0, v0, v1

    const/4 v1, 0x4

    const/16 v2, 0x1406

    const/4 v3, 0x0

    const/16 v4, 0x10

    iget-object v5, p0, Lcom/saterskog/cell_lab/CellWorld;->n:Ljava/nio/FloatBuffer;

    invoke-static/range {v0 .. v5}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZILjava/nio/Buffer;)V

    .line 4292
    :cond_6
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->aA:[I

    add-int v1, v9, v7

    aget v0, v0, v1

    const/4 v1, -0x1

    if-eq v0, v1, :cond_7

    .line 4293
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->o:Ljava/nio/FloatBuffer;

    iget-object v1, p0, Lcom/saterskog/cell_lab/CellWorld;->ag:[F

    mul-int/lit8 v2, v10, 0x4

    mul-int/lit8 v3, v11, 0x4

    invoke-virtual {v0, v1, v2, v3}, Ljava/nio/FloatBuffer;->put([FII)Ljava/nio/FloatBuffer;

    .line 4294
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->o:Ljava/nio/FloatBuffer;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    .line 4295
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->aA:[I

    add-int v1, v9, v7

    aget v0, v0, v1

    const/4 v1, 0x4

    const/16 v2, 0x1406

    const/4 v3, 0x0

    const/16 v4, 0x10

    iget-object v5, p0, Lcom/saterskog/cell_lab/CellWorld;->o:Ljava/nio/FloatBuffer;

    invoke-static/range {v0 .. v5}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZILjava/nio/Buffer;)V

    .line 4298
    :cond_7
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->aQ:[I

    add-int v1, v9, v7

    aget v0, v0, v1

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, p1, v3}, Landroid/opengl/GLES20;->glUniformMatrix4fv(IIZ[FI)V

    .line 4300
    const/4 v0, 0x4

    const/4 v1, 0x0

    invoke-static {v0, v1, v11}, Landroid/opengl/GLES20;->glDrawArrays(III)V

    .line 4301
    add-int/lit8 v0, v6, 0x1

    move v6, v0

    .line 4302
    goto/16 :goto_2

    .line 4245
    :cond_8
    const/4 v0, 0x0

    goto/16 :goto_0

    .line 4303
    :cond_9
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->ax:[I

    add-int v1, v9, v7

    aget v0, v0, v1

    const/4 v1, -0x1

    if-eq v0, v1, :cond_a

    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->ax:[I

    add-int v1, v9, v7

    aget v0, v0, v1

    invoke-static {v0}, Landroid/opengl/GLES20;->glDisableVertexAttribArray(I)V

    .line 4304
    :cond_a
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->az:[I

    add-int v1, v9, v7

    aget v0, v0, v1

    const/4 v1, -0x1

    if-eq v0, v1, :cond_b

    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->az:[I

    add-int v1, v9, v7

    aget v0, v0, v1

    invoke-static {v0}, Landroid/opengl/GLES20;->glDisableVertexAttribArray(I)V

    .line 4305
    :cond_b
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->ay:[I

    add-int v1, v9, v7

    aget v0, v0, v1

    const/4 v1, -0x1

    if-eq v0, v1, :cond_c

    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->ay:[I

    add-int v1, v9, v7

    aget v0, v0, v1

    invoke-static {v0}, Landroid/opengl/GLES20;->glDisableVertexAttribArray(I)V

    .line 4306
    :cond_c
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->aA:[I

    add-int v1, v9, v7

    aget v0, v0, v1

    const/4 v1, -0x1

    if-eq v0, v1, :cond_d

    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->aA:[I

    add-int v1, v9, v7

    aget v0, v0, v1

    invoke-static {v0}, Landroid/opengl/GLES20;->glDisableVertexAttribArray(I)V

    .line 4246
    :cond_d
    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_1

    .line 4309
    :cond_e
    return-void
.end method

.method public final f()D
    .locals 6

    .prologue
    .line 4412
    const-wide/16 v2, 0x0

    .line 4413
    const/4 v0, 0x0

    :goto_0
    iget v1, p0, Lcom/saterskog/cell_lab/CellWorld;->B:I

    if-ge v0, v1, :cond_0

    .line 4414
    iget-object v1, p0, Lcom/saterskog/cell_lab/CellWorld;->A:[Lcom/saterskog/cell_lab/Food;

    aget-object v1, v1, v0

    iget v1, v1, Lcom/saterskog/cell_lab/Food;->c:F

    float-to-double v4, v1

    add-double/2addr v2, v4

    .line 4413
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 4415
    :cond_0
    return-wide v2
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .prologue
    .line 4339
    iget-boolean v0, p0, Lcom/saterskog/cell_lab/CellWorld;->bg:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 4340
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 4341
    iget v0, p0, Lcom/saterskog/cell_lab/CellWorld;->z:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 4342
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeArray([Ljava/lang/Object;)V

    .line 4343
    iget v0, p0, Lcom/saterskog/cell_lab/CellWorld;->B:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 4344
    iget-object v0, p0, Lcom/saterskog/cell_lab/CellWorld;->A:[Lcom/saterskog/cell_lab/Food;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeArray([Ljava/lang/Object;)V

    .line 4345
    iget-wide v0, p0, Lcom/saterskog/cell_lab/CellWorld;->M:D

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeDouble(D)V

    .line 4346
    iget-wide v0, p0, Lcom/saterskog/cell_lab/CellWorld;->O:D

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeDouble(D)V

    .line 4348
    iget v0, p0, Lcom/saterskog/cell_lab/CellWorld;->V:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 4349
    iget v0, p0, Lcom/saterskog/cell_lab/CellWorld;->W:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 4350
    iget v0, p0, Lcom/saterskog/cell_lab/CellWorld;->S:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 4351
    iget v0, p0, Lcom/saterskog/cell_lab/CellWorld;->R:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 4352
    return-void

    .line 4339
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
