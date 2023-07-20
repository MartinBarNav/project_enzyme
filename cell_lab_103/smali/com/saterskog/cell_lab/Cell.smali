.class public Lcom/saterskog/cell_lab/Cell;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final a:D

.field static final ad:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/saterskog/cell_lab/Cell;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final transient A:[Lcom/saterskog/cell_lab/u;

.field public B:I

.field public C:I

.field public D:I

.field public E:I

.field public F:I

.field public G:I

.field public final H:[Lcom/saterskog/cell_lab/Link;

.field public I:[Lcom/saterskog/cell_lab/Gene;

.field public final J:[F

.field public K:I

.field public L:I

.field public M:I

.field public N:I

.field public transient O:I

.field public transient P:I

.field public transient Q:D

.field public transient R:D

.field public S:F

.field public T:I

.field public final U:[F

.field public final V:[F

.field public final W:[F

.field public X:F

.field public Y:F

.field public Z:F

.field public aa:F

.field public ab:F

.field public ac:F

.field public b:D

.field public c:D

.field public d:D

.field public e:D

.field public f:D

.field public g:D

.field public h:D

.field public i:D

.field public j:D

.field public k:D

.field public l:D

.field public m:D

.field public n:D

.field public o:D

.field public p:D

.field public q:D

.field public r:F

.field public s:F

.field public t:D

.field public u:D

.field public v:D

.field public w:D

.field x:Z

.field y:Z

.field z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 29
    const-wide v0, 0x3f2797cc39ffd60eL    # 1.7999999999999998E-4

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    sput-wide v0, Lcom/saterskog/cell_lab/Cell;->a:D

    .line 663
    new-instance v0, Lcom/saterskog/cell_lab/Cell$1;

    invoke-direct {v0}, Lcom/saterskog/cell_lab/Cell$1;-><init>()V

    sput-object v0, Lcom/saterskog/cell_lab/Cell;->ad:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 7

    .prologue
    const/4 v3, 0x0

    const/16 v6, 0x14

    const/4 v2, 0x4

    const-wide/16 v4, 0x0

    const/4 v1, 0x0

    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    new-array v0, v6, [Lcom/saterskog/cell_lab/u;

    iput-object v0, p0, Lcom/saterskog/cell_lab/Cell;->A:[Lcom/saterskog/cell_lab/u;

    .line 46
    new-array v0, v6, [Lcom/saterskog/cell_lab/Link;

    iput-object v0, p0, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    .line 47
    const/16 v0, 0x28

    new-array v0, v0, [Lcom/saterskog/cell_lab/Gene;

    iput-object v0, p0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    .line 48
    new-array v0, v2, [F

    iput-object v0, p0, Lcom/saterskog/cell_lab/Cell;->J:[F

    .line 55
    const/16 v0, 0x8

    new-array v0, v0, [F

    iput-object v0, p0, Lcom/saterskog/cell_lab/Cell;->U:[F

    .line 56
    new-array v0, v2, [F

    iput-object v0, p0, Lcom/saterskog/cell_lab/Cell;->V:[F

    .line 57
    new-array v0, v2, [F

    iput-object v0, p0, Lcom/saterskog/cell_lab/Cell;->W:[F

    .line 64
    iput v3, p0, Lcom/saterskog/cell_lab/Cell;->r:F

    .line 65
    iput v3, p0, Lcom/saterskog/cell_lab/Cell;->s:F

    .line 66
    iput v1, p0, Lcom/saterskog/cell_lab/Cell;->O:I

    .line 67
    iput v1, p0, Lcom/saterskog/cell_lab/Cell;->C:I

    move v0, v1

    .line 68
    :goto_0
    const/16 v2, 0x28

    if-ge v0, v2, :cond_0

    .line 69
    iget-object v2, p0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    new-instance v3, Lcom/saterskog/cell_lab/Gene;

    invoke-direct {v3}, Lcom/saterskog/cell_lab/Gene;-><init>()V

    aput-object v3, v2, v0

    .line 68
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v1

    .line 70
    :goto_1
    if-ge v0, v6, :cond_1

    .line 71
    iget-object v2, p0, Lcom/saterskog/cell_lab/Cell;->A:[Lcom/saterskog/cell_lab/u;

    new-instance v3, Lcom/saterskog/cell_lab/u;

    invoke-direct {v3}, Lcom/saterskog/cell_lab/u;-><init>()V

    aput-object v3, v2, v0

    .line 72
    iget-object v2, p0, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    new-instance v3, Lcom/saterskog/cell_lab/Link;

    invoke-direct {v3}, Lcom/saterskog/cell_lab/Link;-><init>()V

    aput-object v3, v2, v0

    .line 70
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 74
    :cond_1
    iput-wide v4, p0, Lcom/saterskog/cell_lab/Cell;->t:D

    .line 75
    iput-wide v4, p0, Lcom/saterskog/cell_lab/Cell;->u:D

    .line 76
    iput-wide v4, p0, Lcom/saterskog/cell_lab/Cell;->v:D

    .line 77
    iput v1, p0, Lcom/saterskog/cell_lab/Cell;->G:I

    .line 78
    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 9

    .prologue
    const/16 v8, 0x28

    const/4 v1, 0x1

    const/16 v7, 0x14

    const/4 v6, 0x4

    const/4 v2, 0x0

    .line 334
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    new-array v0, v7, [Lcom/saterskog/cell_lab/u;

    iput-object v0, p0, Lcom/saterskog/cell_lab/Cell;->A:[Lcom/saterskog/cell_lab/u;

    .line 46
    new-array v0, v7, [Lcom/saterskog/cell_lab/Link;

    iput-object v0, p0, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    .line 47
    new-array v0, v8, [Lcom/saterskog/cell_lab/Gene;

    iput-object v0, p0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    .line 48
    new-array v0, v6, [F

    iput-object v0, p0, Lcom/saterskog/cell_lab/Cell;->J:[F

    .line 55
    const/16 v0, 0x8

    new-array v0, v0, [F

    iput-object v0, p0, Lcom/saterskog/cell_lab/Cell;->U:[F

    .line 56
    new-array v0, v6, [F

    iput-object v0, p0, Lcom/saterskog/cell_lab/Cell;->V:[F

    .line 57
    new-array v0, v6, [F

    iput-object v0, p0, Lcom/saterskog/cell_lab/Cell;->W:[F

    move v0, v2

    .line 335
    :goto_0
    if-ge v0, v7, :cond_0

    .line 336
    iget-object v3, p0, Lcom/saterskog/cell_lab/Cell;->A:[Lcom/saterskog/cell_lab/u;

    new-instance v4, Lcom/saterskog/cell_lab/u;

    invoke-direct {v4}, Lcom/saterskog/cell_lab/u;-><init>()V

    aput-object v4, v3, v0

    .line 335
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 337
    :cond_0
    invoke-virtual {p1}, Landroid/os/Parcel;->readDouble()D

    move-result-wide v4

    iput-wide v4, p0, Lcom/saterskog/cell_lab/Cell;->b:D

    .line 338
    invoke-virtual {p1}, Landroid/os/Parcel;->readDouble()D

    move-result-wide v4

    iput-wide v4, p0, Lcom/saterskog/cell_lab/Cell;->c:D

    .line 339
    invoke-virtual {p1}, Landroid/os/Parcel;->readDouble()D

    move-result-wide v4

    iput-wide v4, p0, Lcom/saterskog/cell_lab/Cell;->k:D

    .line 340
    invoke-virtual {p1}, Landroid/os/Parcel;->readDouble()D

    move-result-wide v4

    iput-wide v4, p0, Lcom/saterskog/cell_lab/Cell;->m:D

    .line 341
    invoke-virtual {p1}, Landroid/os/Parcel;->readDouble()D

    move-result-wide v4

    iput-wide v4, p0, Lcom/saterskog/cell_lab/Cell;->e:D

    .line 342
    invoke-virtual {p1}, Landroid/os/Parcel;->readDouble()D

    move-result-wide v4

    iput-wide v4, p0, Lcom/saterskog/cell_lab/Cell;->f:D

    .line 343
    invoke-virtual {p1}, Landroid/os/Parcel;->readDouble()D

    move-result-wide v4

    iput-wide v4, p0, Lcom/saterskog/cell_lab/Cell;->l:D

    .line 344
    invoke-virtual {p1}, Landroid/os/Parcel;->readDouble()D

    move-result-wide v4

    iput-wide v4, p0, Lcom/saterskog/cell_lab/Cell;->n:D

    .line 345
    invoke-virtual {p1}, Landroid/os/Parcel;->readDouble()D

    move-result-wide v4

    iput-wide v4, p0, Lcom/saterskog/cell_lab/Cell;->d:D

    .line 346
    invoke-virtual {p1}, Landroid/os/Parcel;->readDouble()D

    move-result-wide v4

    iput-wide v4, p0, Lcom/saterskog/cell_lab/Cell;->w:D

    .line 347
    invoke-virtual {p1}, Landroid/os/Parcel;->readDouble()D

    move-result-wide v4

    iput-wide v4, p0, Lcom/saterskog/cell_lab/Cell;->o:D

    move v3, v2

    .line 348
    :goto_1
    if-ge v3, v7, :cond_1

    .line 349
    iget-object v4, p0, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    const-class v0, Lcom/saterskog/cell_lab/Link;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/saterskog/cell_lab/Link;

    aput-object v0, v4, v3

    .line 348
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_1

    .line 350
    :cond_1
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/Cell;->C:I

    .line 351
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_2

    move v0, v1

    :goto_2
    iput-boolean v0, p0, Lcom/saterskog/cell_lab/Cell;->x:Z

    .line 352
    iget-object v0, p0, Lcom/saterskog/cell_lab/Cell;->J:[F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readFloatArray([F)V

    move v3, v2

    .line 353
    :goto_3
    if-ge v3, v8, :cond_3

    .line 354
    iget-object v4, p0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    const-class v0, Lcom/saterskog/cell_lab/Gene;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/saterskog/cell_lab/Gene;

    aput-object v0, v4, v3

    .line 353
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_3

    :cond_2
    move v0, v2

    .line 351
    goto :goto_2

    .line 355
    :cond_3
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/Cell;->D:I

    .line 356
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/Cell;->E:I

    .line 357
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/Cell;->F:I

    .line 358
    invoke-virtual {p1}, Landroid/os/Parcel;->readDouble()D

    move-result-wide v4

    iput-wide v4, p0, Lcom/saterskog/cell_lab/Cell;->t:D

    .line 359
    invoke-virtual {p1}, Landroid/os/Parcel;->readDouble()D

    move-result-wide v4

    iput-wide v4, p0, Lcom/saterskog/cell_lab/Cell;->u:D

    .line 360
    invoke-virtual {p1}, Landroid/os/Parcel;->readDouble()D

    move-result-wide v4

    iput-wide v4, p0, Lcom/saterskog/cell_lab/Cell;->v:D

    .line 361
    invoke-virtual {p1}, Landroid/os/Parcel;->readDouble()D

    move-result-wide v4

    iput-wide v4, p0, Lcom/saterskog/cell_lab/Cell;->p:D

    .line 362
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_4

    :goto_4
    iput-boolean v1, p0, Lcom/saterskog/cell_lab/Cell;->y:Z

    .line 363
    :goto_5
    if-ge v2, v6, :cond_5

    .line 364
    iget-object v0, p0, Lcom/saterskog/cell_lab/Cell;->U:[F

    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v1

    aput v1, v0, v2

    .line 365
    iget-object v0, p0, Lcom/saterskog/cell_lab/Cell;->W:[F

    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v1

    aput v1, v0, v2

    .line 363
    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    :cond_4
    move v1, v2

    .line 362
    goto :goto_4

    .line 367
    :cond_5
    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/Cell;->X:F

    .line 368
    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/Cell;->Y:F

    .line 369
    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/Cell;->aa:F

    .line 370
    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/Cell;->ab:F

    .line 371
    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/Cell;->ac:F

    .line 372
    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/Cell;->S:F

    .line 373
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/Cell;->G:I

    .line 374
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/Cell;->T:I

    .line 375
    invoke-virtual {p1}, Landroid/os/Parcel;->readDouble()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/saterskog/cell_lab/Cell;->q:D

    .line 376
    return-void
.end method

.method private c()V
    .locals 5

    .prologue
    const/4 v1, 0x1

    const/4 v3, 0x0

    .line 563
    move v2, v3

    move v0, v3

    .line 564
    :goto_0
    const/16 v4, 0x28

    if-ge v2, v4, :cond_2

    .line 565
    if-eqz v0, :cond_0

    iget-object v4, p0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    aget-object v4, v4, v2

    iput-boolean v3, v4, Lcom/saterskog/cell_lab/Gene;->p:Z

    .line 566
    :cond_0
    iget-object v4, p0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    aget-object v4, v4, v2

    iget-boolean v4, v4, Lcom/saterskog/cell_lab/Gene;->p:Z

    if-eqz v4, :cond_1

    move v0, v1

    .line 564
    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 568
    :cond_2
    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    aget-object v0, v0, v3

    iput-boolean v1, v0, Lcom/saterskog/cell_lab/Gene;->p:Z

    .line 569
    :cond_3
    return-void
.end method


# virtual methods
.method public final a()D
    .locals 4

    .prologue
    .line 81
    iget-object v0, p0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    iget v1, p0, Lcom/saterskog/cell_lab/Cell;->D:I

    aget-object v0, v0, v1

    iget-object v0, v0, Lcom/saterskog/cell_lab/Gene;->s:Lcom/saterskog/cell_lab/h;

    sget-object v1, Lcom/saterskog/cell_lab/h;->e:Lcom/saterskog/cell_lab/h;

    if-ne v0, v1, :cond_0

    .line 82
    iget-wide v0, p0, Lcom/saterskog/cell_lab/Cell;->w:D

    iget v2, p0, Lcom/saterskog/cell_lab/Cell;->S:F

    float-to-double v2, v2

    add-double/2addr v0, v2

    const-wide v2, 0x3fd70a3d70a3d70aL    # 0.36

    mul-double/2addr v0, v2

    const-wide v2, 0x400147ae147ae148L    # 2.16

    div-double/2addr v0, v2

    .line 84
    :goto_0
    return-wide v0

    :cond_0
    iget-wide v0, p0, Lcom/saterskog/cell_lab/Cell;->w:D

    goto :goto_0
.end method

.method public final a(I)F
    .locals 2

    .prologue
    .line 132
    iget-object v0, p0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    iget v1, p0, Lcom/saterskog/cell_lab/Cell;->D:I

    aget-object v0, v0, v1

    iget-object v0, v0, Lcom/saterskog/cell_lab/Gene;->v:[F

    aget v0, v0, p1

    return v0
.end method

.method public final a(II)F
    .locals 8

    .prologue
    const/high16 v2, -0x40800000    # -1.0f

    const/high16 v1, 0x3f800000    # 1.0f

    .line 88
    iget-object v0, p0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    iget v3, p0, Lcom/saterskog/cell_lab/Cell;->D:I

    aget-object v0, v0, v3

    iget-object v0, v0, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    aget-object v3, v0, p1

    .line 90
    iget-short v0, v3, Lcom/saterskog/cell_lab/Gene$a;->e:S

    if-eqz v0, :cond_4

    .line 94
    const/4 v0, 0x0

    .line 95
    iget-short v4, v3, Lcom/saterskog/cell_lab/Gene$a;->d:S

    const/4 v5, 0x4

    if-ge v4, v5, :cond_2

    .line 96
    iget-object v0, p0, Lcom/saterskog/cell_lab/Cell;->U:[F

    iget-short v4, v3, Lcom/saterskog/cell_lab/Gene$a;->d:S

    add-int/2addr v4, p2

    aget v0, v0, v4

    .line 113
    :goto_0
    iget-short v4, v3, Lcom/saterskog/cell_lab/Gene$a;->e:S

    const/4 v5, 0x1

    if-ne v4, v5, :cond_3

    .line 114
    iget v4, v3, Lcom/saterskog/cell_lab/Gene$a;->a:F

    mul-float/2addr v0, v4

    iget v3, v3, Lcom/saterskog/cell_lab/Gene$a;->b:F

    add-float/2addr v0, v3

    .line 124
    :goto_1
    cmpg-float v3, v0, v2

    if-gez v3, :cond_0

    move v0, v2

    .line 125
    :cond_0
    cmpl-float v2, v0, v1

    if-lez v2, :cond_1

    move v0, v1

    .line 126
    :cond_1
    sget-object v2, Lcom/saterskog/cell_lab/Gene;->x:[F

    aget v2, v2, p1

    sget-object v3, Lcom/saterskog/cell_lab/Gene;->y:[F

    aget v3, v3, p1

    sget-object v4, Lcom/saterskog/cell_lab/Gene;->x:[F

    aget v4, v4, p1

    sub-float/2addr v3, v4

    const/high16 v4, 0x3f000000    # 0.5f

    mul-float/2addr v3, v4

    add-float/2addr v0, v1

    mul-float/2addr v0, v3

    add-float/2addr v0, v2

    return v0

    .line 98
    :cond_2
    iget-short v4, v3, Lcom/saterskog/cell_lab/Gene$a;->d:S

    packed-switch v4, :pswitch_data_0

    goto :goto_0

    .line 100
    :pswitch_0
    iget-wide v4, p0, Lcom/saterskog/cell_lab/Cell;->w:D

    const-wide v6, 0x3fd70a3d70a3d70aL    # 0.36

    div-double/2addr v4, v6

    double-to-float v0, v4

    .line 101
    goto :goto_0

    .line 103
    :pswitch_1
    iget-wide v4, p0, Lcom/saterskog/cell_lab/Cell;->o:D

    const-wide v6, 0x3f71111111111111L    # 0.004166666666666667

    mul-double/2addr v4, v6

    double-to-float v0, v4

    .line 104
    goto :goto_0

    .line 106
    :pswitch_2
    iget-wide v4, p0, Lcom/saterskog/cell_lab/Cell;->p:D

    double-to-float v0, v4

    .line 107
    goto :goto_0

    .line 109
    :pswitch_3
    iget v0, p0, Lcom/saterskog/cell_lab/Cell;->C:I

    int-to-float v0, v0

    const/high16 v4, 0x41a00000    # 20.0f

    div-float/2addr v0, v4

    goto :goto_0

    .line 118
    :cond_3
    iget v4, v3, Lcom/saterskog/cell_lab/Gene$a;->c:F

    cmpg-float v0, v0, v4

    if-gez v0, :cond_4

    .line 119
    iget v0, v3, Lcom/saterskog/cell_lab/Gene$a;->a:F

    goto :goto_1

    .line 121
    :cond_4
    iget v0, v3, Lcom/saterskog/cell_lab/Gene$a;->b:F

    goto :goto_1

    .line 98
    nop

    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public final a(Lcom/saterskog/cell_lab/Cell;)V
    .locals 7

    .prologue
    const/4 v6, 0x4

    const/4 v1, 0x0

    .line 685
    iget-wide v2, p1, Lcom/saterskog/cell_lab/Cell;->b:D

    iput-wide v2, p0, Lcom/saterskog/cell_lab/Cell;->b:D

    .line 686
    iget-wide v2, p1, Lcom/saterskog/cell_lab/Cell;->c:D

    iput-wide v2, p0, Lcom/saterskog/cell_lab/Cell;->c:D

    .line 687
    iget-wide v2, p1, Lcom/saterskog/cell_lab/Cell;->e:D

    iput-wide v2, p0, Lcom/saterskog/cell_lab/Cell;->e:D

    .line 688
    iget-wide v2, p1, Lcom/saterskog/cell_lab/Cell;->f:D

    iput-wide v2, p0, Lcom/saterskog/cell_lab/Cell;->f:D

    .line 689
    iget-wide v2, p1, Lcom/saterskog/cell_lab/Cell;->k:D

    iput-wide v2, p0, Lcom/saterskog/cell_lab/Cell;->k:D

    .line 690
    iget-wide v2, p1, Lcom/saterskog/cell_lab/Cell;->l:D

    iput-wide v2, p0, Lcom/saterskog/cell_lab/Cell;->l:D

    .line 691
    iget-wide v2, p1, Lcom/saterskog/cell_lab/Cell;->m:D

    iput-wide v2, p0, Lcom/saterskog/cell_lab/Cell;->m:D

    .line 692
    iget-wide v2, p1, Lcom/saterskog/cell_lab/Cell;->n:D

    iput-wide v2, p0, Lcom/saterskog/cell_lab/Cell;->n:D

    .line 693
    iget-wide v2, p1, Lcom/saterskog/cell_lab/Cell;->d:D

    iput-wide v2, p0, Lcom/saterskog/cell_lab/Cell;->d:D

    .line 694
    iget-wide v2, p1, Lcom/saterskog/cell_lab/Cell;->w:D

    iput-wide v2, p0, Lcom/saterskog/cell_lab/Cell;->w:D

    .line 695
    iget-wide v2, p1, Lcom/saterskog/cell_lab/Cell;->o:D

    iput-wide v2, p0, Lcom/saterskog/cell_lab/Cell;->o:D

    move v0, v1

    .line 696
    :goto_0
    const/16 v2, 0x14

    if-ge v0, v2, :cond_0

    .line 697
    iget-object v2, p0, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    aget-object v2, v2, v0

    iget-object v3, p1, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    aget-object v3, v3, v0

    invoke-virtual {v2, v3}, Lcom/saterskog/cell_lab/Link;->a(Lcom/saterskog/cell_lab/Link;)V

    .line 696
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 698
    :cond_0
    iget v0, p1, Lcom/saterskog/cell_lab/Cell;->C:I

    iput v0, p0, Lcom/saterskog/cell_lab/Cell;->C:I

    move v0, v1

    .line 699
    :goto_1
    if-ge v0, v6, :cond_1

    .line 700
    iget-object v2, p0, Lcom/saterskog/cell_lab/Cell;->J:[F

    iget-object v3, p1, Lcom/saterskog/cell_lab/Cell;->J:[F

    aget v3, v3, v0

    aput v3, v2, v0

    .line 699
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 701
    :cond_1
    iget-boolean v0, p1, Lcom/saterskog/cell_lab/Cell;->x:Z

    iput-boolean v0, p0, Lcom/saterskog/cell_lab/Cell;->x:Z

    move v0, v1

    .line 702
    :goto_2
    const/16 v2, 0x28

    if-ge v0, v2, :cond_2

    .line 703
    iget-object v2, p0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    aget-object v2, v2, v0

    iget-object v3, p1, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    aget-object v3, v3, v0

    invoke-virtual {v2, v3}, Lcom/saterskog/cell_lab/Gene;->a(Lcom/saterskog/cell_lab/Gene;)V

    .line 702
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 704
    :cond_2
    iget v0, p1, Lcom/saterskog/cell_lab/Cell;->D:I

    iput v0, p0, Lcom/saterskog/cell_lab/Cell;->D:I

    .line 705
    iget v0, p1, Lcom/saterskog/cell_lab/Cell;->E:I

    iput v0, p0, Lcom/saterskog/cell_lab/Cell;->E:I

    .line 706
    iget v0, p1, Lcom/saterskog/cell_lab/Cell;->F:I

    iput v0, p0, Lcom/saterskog/cell_lab/Cell;->F:I

    .line 707
    iget v0, p1, Lcom/saterskog/cell_lab/Cell;->O:I

    iput v0, p0, Lcom/saterskog/cell_lab/Cell;->O:I

    .line 708
    iget-wide v2, p1, Lcom/saterskog/cell_lab/Cell;->t:D

    iput-wide v2, p0, Lcom/saterskog/cell_lab/Cell;->t:D

    .line 709
    iget-wide v2, p1, Lcom/saterskog/cell_lab/Cell;->u:D

    iput-wide v2, p0, Lcom/saterskog/cell_lab/Cell;->u:D

    .line 710
    iget-wide v2, p1, Lcom/saterskog/cell_lab/Cell;->v:D

    iput-wide v2, p0, Lcom/saterskog/cell_lab/Cell;->v:D

    .line 711
    iget-wide v2, p1, Lcom/saterskog/cell_lab/Cell;->p:D

    iput-wide v2, p0, Lcom/saterskog/cell_lab/Cell;->p:D

    .line 714
    iget v0, p1, Lcom/saterskog/cell_lab/Cell;->B:I

    iput v0, p0, Lcom/saterskog/cell_lab/Cell;->B:I

    move v0, v1

    .line 715
    :goto_3
    iget v2, p0, Lcom/saterskog/cell_lab/Cell;->B:I

    if-ge v0, v2, :cond_3

    .line 716
    iget-object v2, p0, Lcom/saterskog/cell_lab/Cell;->A:[Lcom/saterskog/cell_lab/u;

    aget-object v2, v2, v0

    iget-object v3, p1, Lcom/saterskog/cell_lab/Cell;->A:[Lcom/saterskog/cell_lab/u;

    aget-object v3, v3, v0

    .line 2021
    iget-wide v4, v3, Lcom/saterskog/cell_lab/u;->a:D

    iput-wide v4, v2, Lcom/saterskog/cell_lab/u;->a:D

    .line 2022
    iget-wide v4, v3, Lcom/saterskog/cell_lab/u;->c:D

    iput-wide v4, v2, Lcom/saterskog/cell_lab/u;->c:D

    .line 2023
    iget-wide v4, v3, Lcom/saterskog/cell_lab/u;->b:D

    iput-wide v4, v2, Lcom/saterskog/cell_lab/u;->b:D

    .line 2024
    iget-wide v4, v3, Lcom/saterskog/cell_lab/u;->d:D

    iput-wide v4, v2, Lcom/saterskog/cell_lab/u;->d:D

    .line 2025
    iget v4, v3, Lcom/saterskog/cell_lab/u;->g:I

    iput v4, v2, Lcom/saterskog/cell_lab/u;->g:I

    .line 2027
    iget-boolean v4, v3, Lcom/saterskog/cell_lab/u;->e:Z

    iput-boolean v4, v2, Lcom/saterskog/cell_lab/u;->e:Z

    .line 2028
    iget-boolean v3, v3, Lcom/saterskog/cell_lab/u;->f:Z

    iput-boolean v3, v2, Lcom/saterskog/cell_lab/u;->f:Z

    .line 715
    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    .line 717
    :cond_3
    iget-boolean v0, p1, Lcom/saterskog/cell_lab/Cell;->y:Z

    iput-boolean v0, p0, Lcom/saterskog/cell_lab/Cell;->y:Z

    .line 719
    :goto_4
    if-ge v1, v6, :cond_4

    .line 720
    iget-object v0, p0, Lcom/saterskog/cell_lab/Cell;->U:[F

    iget-object v2, p1, Lcom/saterskog/cell_lab/Cell;->U:[F

    aget v2, v2, v1

    aput v2, v0, v1

    .line 721
    iget-object v0, p0, Lcom/saterskog/cell_lab/Cell;->W:[F

    iget-object v2, p1, Lcom/saterskog/cell_lab/Cell;->W:[F

    aget v2, v2, v1

    aput v2, v0, v1

    .line 719
    add-int/lit8 v1, v1, 0x1

    goto :goto_4

    .line 724
    :cond_4
    iget-boolean v0, p1, Lcom/saterskog/cell_lab/Cell;->z:Z

    iput-boolean v0, p0, Lcom/saterskog/cell_lab/Cell;->z:Z

    .line 725
    iget v0, p1, Lcom/saterskog/cell_lab/Cell;->X:F

    iput v0, p0, Lcom/saterskog/cell_lab/Cell;->X:F

    .line 726
    iget v0, p1, Lcom/saterskog/cell_lab/Cell;->Y:F

    iput v0, p0, Lcom/saterskog/cell_lab/Cell;->Y:F

    .line 727
    iget v0, p1, Lcom/saterskog/cell_lab/Cell;->aa:F

    iput v0, p0, Lcom/saterskog/cell_lab/Cell;->aa:F

    .line 728
    iget v0, p1, Lcom/saterskog/cell_lab/Cell;->ab:F

    iput v0, p0, Lcom/saterskog/cell_lab/Cell;->ab:F

    .line 729
    iget v0, p1, Lcom/saterskog/cell_lab/Cell;->ac:F

    iput v0, p0, Lcom/saterskog/cell_lab/Cell;->ac:F

    .line 730
    iget v0, p1, Lcom/saterskog/cell_lab/Cell;->S:F

    iput v0, p0, Lcom/saterskog/cell_lab/Cell;->S:F

    .line 731
    iget v0, p1, Lcom/saterskog/cell_lab/Cell;->r:F

    iput v0, p0, Lcom/saterskog/cell_lab/Cell;->r:F

    .line 732
    iget v0, p1, Lcom/saterskog/cell_lab/Cell;->s:F

    iput v0, p0, Lcom/saterskog/cell_lab/Cell;->s:F

    .line 734
    iget-wide v0, p1, Lcom/saterskog/cell_lab/Cell;->g:D

    iput-wide v0, p0, Lcom/saterskog/cell_lab/Cell;->g:D

    .line 735
    iget-wide v0, p1, Lcom/saterskog/cell_lab/Cell;->h:D

    iput-wide v0, p0, Lcom/saterskog/cell_lab/Cell;->h:D

    .line 736
    iget-wide v0, p1, Lcom/saterskog/cell_lab/Cell;->i:D

    iput-wide v0, p0, Lcom/saterskog/cell_lab/Cell;->i:D

    .line 738
    iget v0, p1, Lcom/saterskog/cell_lab/Cell;->G:I

    iput v0, p0, Lcom/saterskog/cell_lab/Cell;->G:I

    .line 739
    iget v0, p1, Lcom/saterskog/cell_lab/Cell;->T:I

    iput v0, p0, Lcom/saterskog/cell_lab/Cell;->T:I

    .line 741
    iget-wide v0, p1, Lcom/saterskog/cell_lab/Cell;->q:D

    iput-wide v0, p0, Lcom/saterskog/cell_lab/Cell;->q:D

    .line 742
    return-void
.end method

.method public final a(Ljava/io/ObjectInputStream;)V
    .locals 10

    .prologue
    const v9, 0x3c23d70a    # 0.01f

    const/4 v8, 0x0

    const/16 v7, 0x28

    const/4 v6, 0x4

    const/4 v1, 0x0

    .line 474
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readInt()I

    move-result v2

    .line 475
    const/4 v0, 0x2

    if-lt v2, v0, :cond_0

    const/16 v0, 0x5f

    if-le v2, v0, :cond_1

    .line 476
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "bad cell format version "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 477
    :cond_1
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readDouble()D

    move-result-wide v4

    iput-wide v4, p0, Lcom/saterskog/cell_lab/Cell;->b:D

    .line 478
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readDouble()D

    move-result-wide v4

    iput-wide v4, p0, Lcom/saterskog/cell_lab/Cell;->c:D

    .line 479
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readDouble()D

    move-result-wide v4

    iput-wide v4, p0, Lcom/saterskog/cell_lab/Cell;->k:D

    .line 480
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readDouble()D

    move-result-wide v4

    iput-wide v4, p0, Lcom/saterskog/cell_lab/Cell;->m:D

    .line 481
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readDouble()D

    move-result-wide v4

    iput-wide v4, p0, Lcom/saterskog/cell_lab/Cell;->e:D

    .line 482
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readDouble()D

    move-result-wide v4

    iput-wide v4, p0, Lcom/saterskog/cell_lab/Cell;->f:D

    .line 483
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readDouble()D

    move-result-wide v4

    iput-wide v4, p0, Lcom/saterskog/cell_lab/Cell;->l:D

    .line 484
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readDouble()D

    move-result-wide v4

    iput-wide v4, p0, Lcom/saterskog/cell_lab/Cell;->n:D

    .line 485
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readDouble()D

    move-result-wide v4

    iput-wide v4, p0, Lcom/saterskog/cell_lab/Cell;->d:D

    .line 486
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readDouble()D

    move-result-wide v4

    iput-wide v4, p0, Lcom/saterskog/cell_lab/Cell;->w:D

    .line 487
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readDouble()D

    move-result-wide v4

    iput-wide v4, p0, Lcom/saterskog/cell_lab/Cell;->o:D

    .line 488
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readInt()I

    move-result v3

    move v0, v1

    .line 489
    :goto_0
    const/16 v4, 0x14

    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    move-result v4

    if-ge v0, v4, :cond_2

    .line 490
    iget-object v4, p0, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    aget-object v4, v4, v0

    invoke-virtual {v4, p1, v2}, Lcom/saterskog/cell_lab/Link;->a(Ljava/io/ObjectInputStream;I)V

    .line 489
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    move v0, v1

    .line 491
    :goto_1
    const/16 v4, 0x14

    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    move-result v4

    sub-int v4, v3, v4

    if-ge v0, v4, :cond_3

    .line 492
    new-instance v4, Lcom/saterskog/cell_lab/Link;

    invoke-direct {v4}, Lcom/saterskog/cell_lab/Link;-><init>()V

    invoke-virtual {v4, p1, v2}, Lcom/saterskog/cell_lab/Link;->a(Ljava/io/ObjectInputStream;I)V

    .line 491
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 495
    :cond_3
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readInt()I

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/Cell;->C:I

    .line 496
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readBoolean()Z

    move-result v0

    iput-boolean v0, p0, Lcom/saterskog/cell_lab/Cell;->x:Z

    .line 497
    iget-object v0, p0, Lcom/saterskog/cell_lab/Cell;->J:[F

    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readFloat()F

    move-result v3

    aput v3, v0, v1

    .line 498
    iget-object v0, p0, Lcom/saterskog/cell_lab/Cell;->J:[F

    const/4 v3, 0x1

    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readFloat()F

    move-result v4

    aput v4, v0, v3

    .line 499
    iget-object v0, p0, Lcom/saterskog/cell_lab/Cell;->J:[F

    const/4 v3, 0x2

    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readFloat()F

    move-result v4

    aput v4, v0, v3

    .line 500
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readInt()I

    move-result v3

    move v0, v1

    .line 501
    :goto_2
    invoke-static {v3, v7}, Ljava/lang/Math;->min(II)I

    move-result v4

    if-ge v0, v4, :cond_4

    .line 502
    iget-object v4, p0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    aget-object v4, v4, v0

    invoke-virtual {v4, p1, v2}, Lcom/saterskog/cell_lab/Gene;->a(Ljava/io/ObjectInputStream;I)V

    .line 501
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_4
    move v0, v1

    .line 503
    :goto_3
    invoke-static {v3, v7}, Ljava/lang/Math;->min(II)I

    move-result v4

    sub-int v4, v3, v4

    if-ge v0, v4, :cond_5

    .line 504
    new-instance v4, Lcom/saterskog/cell_lab/Gene;

    invoke-direct {v4}, Lcom/saterskog/cell_lab/Gene;-><init>()V

    invoke-virtual {v4, p1, v2}, Lcom/saterskog/cell_lab/Gene;->a(Ljava/io/ObjectInputStream;I)V

    .line 503
    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    :cond_5
    move v0, v1

    .line 505
    :goto_4
    invoke-static {v3, v7}, Ljava/lang/Math;->max(II)I

    move-result v4

    sub-int/2addr v4, v3

    if-ge v0, v4, :cond_6

    .line 506
    iget-object v4, p0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    add-int v5, v3, v0

    aget-object v4, v4, v5

    iget-object v5, p0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    aget-object v5, v5, v1

    invoke-virtual {v4, v5}, Lcom/saterskog/cell_lab/Gene;->a(Lcom/saterskog/cell_lab/Gene;)V

    .line 507
    iget-object v4, p0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    add-int v5, v3, v0

    aget-object v4, v4, v5

    iput-boolean v1, v4, Lcom/saterskog/cell_lab/Gene;->p:Z

    .line 505
    add-int/lit8 v0, v0, 0x1

    goto :goto_4

    .line 511
    :cond_6
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readInt()I

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/Cell;->D:I

    .line 512
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readInt()I

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/Cell;->E:I

    .line 513
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readInt()I

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/Cell;->F:I

    .line 514
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readDouble()D

    move-result-wide v4

    iput-wide v4, p0, Lcom/saterskog/cell_lab/Cell;->t:D

    .line 515
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readDouble()D

    move-result-wide v4

    iput-wide v4, p0, Lcom/saterskog/cell_lab/Cell;->u:D

    .line 516
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readDouble()D

    move-result-wide v4

    iput-wide v4, p0, Lcom/saterskog/cell_lab/Cell;->v:D

    .line 517
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readDouble()D

    move-result-wide v4

    iput-wide v4, p0, Lcom/saterskog/cell_lab/Cell;->p:D

    .line 518
    if-lt v2, v6, :cond_7

    .line 519
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readBoolean()Z

    move-result v0

    iput-boolean v0, p0, Lcom/saterskog/cell_lab/Cell;->y:Z

    .line 520
    :cond_7
    sget-object v0, Lcom/saterskog/b/d;->a:Lcom/saterskog/b/d;

    .line 2017
    const/16 v3, 0xf

    invoke-virtual {v0, v3}, Lcom/saterskog/b/d;->nextInt(I)I

    move-result v0

    .line 520
    iput v0, p0, Lcom/saterskog/cell_lab/Cell;->O:I

    .line 521
    const/16 v0, 0x9

    if-lt v2, v0, :cond_b

    .line 522
    :goto_5
    if-ge v1, v6, :cond_8

    .line 523
    iget-object v0, p0, Lcom/saterskog/cell_lab/Cell;->U:[F

    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readFloat()F

    move-result v3

    aput v3, v0, v1

    .line 524
    iget-object v0, p0, Lcom/saterskog/cell_lab/Cell;->W:[F

    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readFloat()F

    move-result v3

    aput v3, v0, v1

    .line 522
    add-int/lit8 v1, v1, 0x1

    goto :goto_5

    .line 526
    :cond_8
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readFloat()F

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/Cell;->X:F

    .line 527
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readFloat()F

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/Cell;->Y:F

    .line 528
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readFloat()F

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/Cell;->aa:F

    .line 529
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readFloat()F

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/Cell;->ab:F

    .line 530
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readFloat()F

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/Cell;->ac:F

    .line 531
    const/16 v0, 0xb

    if-le v2, v0, :cond_a

    .line 532
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readFloat()F

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/Cell;->S:F

    .line 544
    :goto_6
    const/16 v0, 0xf

    if-lt v2, v0, :cond_9

    .line 546
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readInt()I

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/Cell;->G:I

    .line 548
    :cond_9
    const/16 v0, 0x13

    if-lt v2, v0, :cond_d

    .line 550
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readInt()I

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/Cell;->T:I

    .line 554
    :goto_7
    const/16 v0, 0x17

    if-lt v2, v0, :cond_e

    .line 555
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readDouble()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/saterskog/cell_lab/Cell;->q:D

    .line 558
    :goto_8
    invoke-direct {p0}, Lcom/saterskog/cell_lab/Cell;->c()V

    .line 560
    return-void

    .line 534
    :cond_a
    iput v8, p0, Lcom/saterskog/cell_lab/Cell;->S:F

    goto :goto_6

    .line 538
    :cond_b
    :goto_9
    if-ge v1, v6, :cond_c

    .line 539
    iget-object v0, p0, Lcom/saterskog/cell_lab/Cell;->U:[F

    aput v9, v0, v1

    .line 540
    iget-object v0, p0, Lcom/saterskog/cell_lab/Cell;->W:[F

    aput v9, v0, v1

    .line 538
    add-int/lit8 v1, v1, 0x1

    goto :goto_9

    .line 542
    :cond_c
    iput v8, p0, Lcom/saterskog/cell_lab/Cell;->S:F

    goto :goto_6

    .line 553
    :cond_d
    const/4 v0, -0x1

    iput v0, p0, Lcom/saterskog/cell_lab/Cell;->T:I

    goto :goto_7

    .line 557
    :cond_e
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/saterskog/cell_lab/Cell;->q:D

    goto :goto_8
.end method

.method public final a(Ljava/io/ObjectOutputStream;)V
    .locals 8

    .prologue
    const/16 v7, 0x28

    const/16 v6, 0x14

    const/4 v0, 0x0

    .line 427
    const/16 v1, 0x5f

    invoke-virtual {p1, v1}, Ljava/io/ObjectOutputStream;->writeInt(I)V

    .line 428
    iget-wide v2, p0, Lcom/saterskog/cell_lab/Cell;->b:D

    invoke-virtual {p1, v2, v3}, Ljava/io/ObjectOutputStream;->writeDouble(D)V

    .line 429
    iget-wide v2, p0, Lcom/saterskog/cell_lab/Cell;->c:D

    invoke-virtual {p1, v2, v3}, Ljava/io/ObjectOutputStream;->writeDouble(D)V

    .line 430
    iget-wide v2, p0, Lcom/saterskog/cell_lab/Cell;->k:D

    invoke-virtual {p1, v2, v3}, Ljava/io/ObjectOutputStream;->writeDouble(D)V

    .line 431
    iget-wide v2, p0, Lcom/saterskog/cell_lab/Cell;->m:D

    invoke-virtual {p1, v2, v3}, Ljava/io/ObjectOutputStream;->writeDouble(D)V

    .line 432
    iget-wide v2, p0, Lcom/saterskog/cell_lab/Cell;->e:D

    invoke-virtual {p1, v2, v3}, Ljava/io/ObjectOutputStream;->writeDouble(D)V

    .line 433
    iget-wide v2, p0, Lcom/saterskog/cell_lab/Cell;->f:D

    invoke-virtual {p1, v2, v3}, Ljava/io/ObjectOutputStream;->writeDouble(D)V

    .line 434
    iget-wide v2, p0, Lcom/saterskog/cell_lab/Cell;->l:D

    invoke-virtual {p1, v2, v3}, Ljava/io/ObjectOutputStream;->writeDouble(D)V

    .line 435
    iget-wide v2, p0, Lcom/saterskog/cell_lab/Cell;->n:D

    invoke-virtual {p1, v2, v3}, Ljava/io/ObjectOutputStream;->writeDouble(D)V

    .line 436
    iget-wide v2, p0, Lcom/saterskog/cell_lab/Cell;->d:D

    invoke-virtual {p1, v2, v3}, Ljava/io/ObjectOutputStream;->writeDouble(D)V

    .line 437
    iget-wide v2, p0, Lcom/saterskog/cell_lab/Cell;->w:D

    invoke-virtual {p1, v2, v3}, Ljava/io/ObjectOutputStream;->writeDouble(D)V

    .line 438
    iget-wide v2, p0, Lcom/saterskog/cell_lab/Cell;->o:D

    invoke-virtual {p1, v2, v3}, Ljava/io/ObjectOutputStream;->writeDouble(D)V

    .line 439
    invoke-virtual {p1, v6}, Ljava/io/ObjectOutputStream;->writeInt(I)V

    move v1, v0

    .line 440
    :goto_0
    if-ge v1, v6, :cond_0

    .line 441
    iget-object v2, p0, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    aget-object v2, v2, v1

    .line 1097
    iget v3, v2, Lcom/saterskog/cell_lab/Link;->a:I

    invoke-virtual {p1, v3}, Ljava/io/ObjectOutputStream;->writeInt(I)V

    .line 1098
    iget-wide v4, v2, Lcom/saterskog/cell_lab/Link;->c:D

    invoke-virtual {p1, v4, v5}, Ljava/io/ObjectOutputStream;->writeDouble(D)V

    .line 1099
    iget-wide v4, v2, Lcom/saterskog/cell_lab/Link;->d:D

    invoke-virtual {p1, v4, v5}, Ljava/io/ObjectOutputStream;->writeDouble(D)V

    .line 1100
    iget-boolean v3, v2, Lcom/saterskog/cell_lab/Link;->b:Z

    invoke-virtual {p1, v3}, Ljava/io/ObjectOutputStream;->writeBoolean(Z)V

    .line 1101
    iget-wide v4, v2, Lcom/saterskog/cell_lab/Link;->e:D

    invoke-virtual {p1, v4, v5}, Ljava/io/ObjectOutputStream;->writeDouble(D)V

    .line 1102
    iget-wide v4, v2, Lcom/saterskog/cell_lab/Link;->f:D

    invoke-virtual {p1, v4, v5}, Ljava/io/ObjectOutputStream;->writeDouble(D)V

    .line 1103
    iget v3, v2, Lcom/saterskog/cell_lab/Link;->k:F

    invoke-virtual {p1, v3}, Ljava/io/ObjectOutputStream;->writeFloat(F)V

    .line 1104
    iget v2, v2, Lcom/saterskog/cell_lab/Link;->l:F

    invoke-virtual {p1, v2}, Ljava/io/ObjectOutputStream;->writeFloat(F)V

    .line 440
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 442
    :cond_0
    iget v1, p0, Lcom/saterskog/cell_lab/Cell;->C:I

    invoke-virtual {p1, v1}, Ljava/io/ObjectOutputStream;->writeInt(I)V

    .line 443
    iget-boolean v1, p0, Lcom/saterskog/cell_lab/Cell;->x:Z

    invoke-virtual {p1, v1}, Ljava/io/ObjectOutputStream;->writeBoolean(Z)V

    .line 444
    iget-object v1, p0, Lcom/saterskog/cell_lab/Cell;->J:[F

    aget v1, v1, v0

    invoke-virtual {p1, v1}, Ljava/io/ObjectOutputStream;->writeFloat(F)V

    .line 445
    iget-object v1, p0, Lcom/saterskog/cell_lab/Cell;->J:[F

    const/4 v2, 0x1

    aget v1, v1, v2

    invoke-virtual {p1, v1}, Ljava/io/ObjectOutputStream;->writeFloat(F)V

    .line 446
    iget-object v1, p0, Lcom/saterskog/cell_lab/Cell;->J:[F

    const/4 v2, 0x2

    aget v1, v1, v2

    invoke-virtual {p1, v1}, Ljava/io/ObjectOutputStream;->writeFloat(F)V

    .line 447
    invoke-virtual {p1, v7}, Ljava/io/ObjectOutputStream;->writeInt(I)V

    move v1, v0

    .line 448
    :goto_1
    if-ge v1, v7, :cond_1

    .line 449
    iget-object v2, p0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    aget-object v2, v2, v1

    invoke-virtual {v2, p1}, Lcom/saterskog/cell_lab/Gene;->a(Ljava/io/ObjectOutputStream;)V

    .line 448
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 450
    :cond_1
    iget v1, p0, Lcom/saterskog/cell_lab/Cell;->D:I

    invoke-virtual {p1, v1}, Ljava/io/ObjectOutputStream;->writeInt(I)V

    .line 451
    iget v1, p0, Lcom/saterskog/cell_lab/Cell;->E:I

    invoke-virtual {p1, v1}, Ljava/io/ObjectOutputStream;->writeInt(I)V

    .line 452
    iget v1, p0, Lcom/saterskog/cell_lab/Cell;->F:I

    invoke-virtual {p1, v1}, Ljava/io/ObjectOutputStream;->writeInt(I)V

    .line 453
    iget-wide v2, p0, Lcom/saterskog/cell_lab/Cell;->t:D

    invoke-virtual {p1, v2, v3}, Ljava/io/ObjectOutputStream;->writeDouble(D)V

    .line 454
    iget-wide v2, p0, Lcom/saterskog/cell_lab/Cell;->u:D

    invoke-virtual {p1, v2, v3}, Ljava/io/ObjectOutputStream;->writeDouble(D)V

    .line 455
    iget-wide v2, p0, Lcom/saterskog/cell_lab/Cell;->v:D

    invoke-virtual {p1, v2, v3}, Ljava/io/ObjectOutputStream;->writeDouble(D)V

    .line 456
    iget-wide v2, p0, Lcom/saterskog/cell_lab/Cell;->p:D

    invoke-virtual {p1, v2, v3}, Ljava/io/ObjectOutputStream;->writeDouble(D)V

    .line 457
    iget-boolean v1, p0, Lcom/saterskog/cell_lab/Cell;->y:Z

    invoke-virtual {p1, v1}, Ljava/io/ObjectOutputStream;->writeBoolean(Z)V

    .line 458
    :goto_2
    const/4 v1, 0x4

    if-ge v0, v1, :cond_2

    .line 459
    iget-object v1, p0, Lcom/saterskog/cell_lab/Cell;->U:[F

    aget v1, v1, v0

    invoke-virtual {p1, v1}, Ljava/io/ObjectOutputStream;->writeFloat(F)V

    .line 460
    iget-object v1, p0, Lcom/saterskog/cell_lab/Cell;->W:[F

    aget v1, v1, v0

    invoke-virtual {p1, v1}, Ljava/io/ObjectOutputStream;->writeFloat(F)V

    .line 458
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 462
    :cond_2
    iget v0, p0, Lcom/saterskog/cell_lab/Cell;->X:F

    invoke-virtual {p1, v0}, Ljava/io/ObjectOutputStream;->writeFloat(F)V

    .line 463
    iget v0, p0, Lcom/saterskog/cell_lab/Cell;->Y:F

    invoke-virtual {p1, v0}, Ljava/io/ObjectOutputStream;->writeFloat(F)V

    .line 464
    iget v0, p0, Lcom/saterskog/cell_lab/Cell;->aa:F

    invoke-virtual {p1, v0}, Ljava/io/ObjectOutputStream;->writeFloat(F)V

    .line 465
    iget v0, p0, Lcom/saterskog/cell_lab/Cell;->ab:F

    invoke-virtual {p1, v0}, Ljava/io/ObjectOutputStream;->writeFloat(F)V

    .line 466
    iget v0, p0, Lcom/saterskog/cell_lab/Cell;->ac:F

    invoke-virtual {p1, v0}, Ljava/io/ObjectOutputStream;->writeFloat(F)V

    .line 467
    iget v0, p0, Lcom/saterskog/cell_lab/Cell;->S:F

    invoke-virtual {p1, v0}, Ljava/io/ObjectOutputStream;->writeFloat(F)V

    .line 468
    iget v0, p0, Lcom/saterskog/cell_lab/Cell;->G:I

    invoke-virtual {p1, v0}, Ljava/io/ObjectOutputStream;->writeInt(I)V

    .line 469
    iget v0, p0, Lcom/saterskog/cell_lab/Cell;->T:I

    invoke-virtual {p1, v0}, Ljava/io/ObjectOutputStream;->writeInt(I)V

    .line 470
    iget-wide v0, p0, Lcom/saterskog/cell_lab/Cell;->q:D

    invoke-virtual {p1, v0, v1}, Ljava/io/ObjectOutputStream;->writeDouble(D)V

    .line 471
    return-void
.end method

.method public final b(I)I
    .locals 2

    .prologue
    .line 136
    iget-object v0, p0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    iget v1, p0, Lcom/saterskog/cell_lab/Cell;->D:I

    aget-object v0, v0, v1

    iget-object v0, v0, Lcom/saterskog/cell_lab/Gene;->u:[I

    aget v0, v0, p1

    return v0
.end method

.method public final b()Lcom/saterskog/cell_lab/Gene;
    .locals 2

    .prologue
    .line 744
    iget-object v0, p0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    iget v1, p0, Lcom/saterskog/cell_lab/Cell;->D:I

    aget-object v0, v0, v1

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 381
    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 6

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 385
    iget-wide v4, p0, Lcom/saterskog/cell_lab/Cell;->b:D

    invoke-virtual {p1, v4, v5}, Landroid/os/Parcel;->writeDouble(D)V

    .line 386
    iget-wide v4, p0, Lcom/saterskog/cell_lab/Cell;->c:D

    invoke-virtual {p1, v4, v5}, Landroid/os/Parcel;->writeDouble(D)V

    .line 387
    iget-wide v4, p0, Lcom/saterskog/cell_lab/Cell;->k:D

    invoke-virtual {p1, v4, v5}, Landroid/os/Parcel;->writeDouble(D)V

    .line 388
    iget-wide v4, p0, Lcom/saterskog/cell_lab/Cell;->m:D

    invoke-virtual {p1, v4, v5}, Landroid/os/Parcel;->writeDouble(D)V

    .line 389
    iget-wide v4, p0, Lcom/saterskog/cell_lab/Cell;->e:D

    invoke-virtual {p1, v4, v5}, Landroid/os/Parcel;->writeDouble(D)V

    .line 390
    iget-wide v4, p0, Lcom/saterskog/cell_lab/Cell;->f:D

    invoke-virtual {p1, v4, v5}, Landroid/os/Parcel;->writeDouble(D)V

    .line 391
    iget-wide v4, p0, Lcom/saterskog/cell_lab/Cell;->l:D

    invoke-virtual {p1, v4, v5}, Landroid/os/Parcel;->writeDouble(D)V

    .line 392
    iget-wide v4, p0, Lcom/saterskog/cell_lab/Cell;->n:D

    invoke-virtual {p1, v4, v5}, Landroid/os/Parcel;->writeDouble(D)V

    .line 393
    iget-wide v4, p0, Lcom/saterskog/cell_lab/Cell;->d:D

    invoke-virtual {p1, v4, v5}, Landroid/os/Parcel;->writeDouble(D)V

    .line 394
    iget-wide v4, p0, Lcom/saterskog/cell_lab/Cell;->w:D

    invoke-virtual {p1, v4, v5}, Landroid/os/Parcel;->writeDouble(D)V

    .line 395
    iget-wide v4, p0, Lcom/saterskog/cell_lab/Cell;->o:D

    invoke-virtual {p1, v4, v5}, Landroid/os/Parcel;->writeDouble(D)V

    move v0, v2

    .line 396
    :goto_0
    const/16 v3, 0x14

    if-ge v0, v3, :cond_0

    .line 397
    iget-object v3, p0, Lcom/saterskog/cell_lab/Cell;->H:[Lcom/saterskog/cell_lab/Link;

    aget-object v3, v3, v0

    invoke-virtual {p1, v3, v2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 396
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 398
    :cond_0
    iget v0, p0, Lcom/saterskog/cell_lab/Cell;->C:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 399
    iget-boolean v0, p0, Lcom/saterskog/cell_lab/Cell;->x:Z

    if-eqz v0, :cond_1

    move v0, v1

    :goto_1
    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 400
    iget-object v0, p0, Lcom/saterskog/cell_lab/Cell;->J:[F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloatArray([F)V

    move v0, v2

    .line 401
    :goto_2
    const/16 v3, 0x28

    if-ge v0, v3, :cond_2

    .line 402
    iget-object v3, p0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    aget-object v3, v3, v0

    invoke-virtual {p1, v3, v2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 401
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_1
    move v0, v2

    .line 399
    goto :goto_1

    .line 403
    :cond_2
    iget v0, p0, Lcom/saterskog/cell_lab/Cell;->D:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 404
    iget v0, p0, Lcom/saterskog/cell_lab/Cell;->E:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 405
    iget v0, p0, Lcom/saterskog/cell_lab/Cell;->F:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 406
    iget-wide v4, p0, Lcom/saterskog/cell_lab/Cell;->t:D

    invoke-virtual {p1, v4, v5}, Landroid/os/Parcel;->writeDouble(D)V

    .line 407
    iget-wide v4, p0, Lcom/saterskog/cell_lab/Cell;->u:D

    invoke-virtual {p1, v4, v5}, Landroid/os/Parcel;->writeDouble(D)V

    .line 408
    iget-wide v4, p0, Lcom/saterskog/cell_lab/Cell;->v:D

    invoke-virtual {p1, v4, v5}, Landroid/os/Parcel;->writeDouble(D)V

    .line 409
    iget-wide v4, p0, Lcom/saterskog/cell_lab/Cell;->p:D

    invoke-virtual {p1, v4, v5}, Landroid/os/Parcel;->writeDouble(D)V

    .line 410
    iget-boolean v0, p0, Lcom/saterskog/cell_lab/Cell;->y:Z

    if-eqz v0, :cond_3

    :goto_3
    int-to-byte v0, v1

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 411
    :goto_4
    const/4 v0, 0x4

    if-ge v2, v0, :cond_4

    .line 412
    iget-object v0, p0, Lcom/saterskog/cell_lab/Cell;->U:[F

    aget v0, v0, v2

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    .line 413
    iget-object v0, p0, Lcom/saterskog/cell_lab/Cell;->W:[F

    aget v0, v0, v2

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    .line 411
    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_3
    move v1, v2

    .line 410
    goto :goto_3

    .line 415
    :cond_4
    iget v0, p0, Lcom/saterskog/cell_lab/Cell;->X:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    .line 416
    iget v0, p0, Lcom/saterskog/cell_lab/Cell;->Y:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    .line 417
    iget v0, p0, Lcom/saterskog/cell_lab/Cell;->aa:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    .line 418
    iget v0, p0, Lcom/saterskog/cell_lab/Cell;->ab:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    .line 419
    iget v0, p0, Lcom/saterskog/cell_lab/Cell;->ac:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    .line 420
    iget v0, p0, Lcom/saterskog/cell_lab/Cell;->S:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    .line 421
    iget v0, p0, Lcom/saterskog/cell_lab/Cell;->G:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 422
    iget v0, p0, Lcom/saterskog/cell_lab/Cell;->T:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 423
    iget-wide v0, p0, Lcom/saterskog/cell_lab/Cell;->q:D

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeDouble(D)V

    .line 424
    return-void
.end method
