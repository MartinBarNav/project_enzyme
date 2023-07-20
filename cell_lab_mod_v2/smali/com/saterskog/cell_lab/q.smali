.class public final Lcom/saterskog/cell_lab/q;
.super Lcom/saterskog/cell_lab/d;
.source "SourceFile"

# interfaces
.implements Landroid/opengl/GLSurfaceView$Renderer;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/saterskog/cell_lab/q$a;
    }
.end annotation


# static fields
.field private static am:I


# instance fields
.field public A:I

.field public B:I

.field C:F

.field D:[F

.field E:Ljava/util/concurrent/Future;

.field F:Ljava/util/concurrent/Future;

.field public G:Z

.field public H:[F

.field public I:[F

.field final J:[F

.field final K:[F

.field final L:[F

.field public M:Z

.field protected N:Ljava/io/OutputStream;

.field public O:I

.field P:Z

.field Q:[Lcom/saterskog/cell_lab/Gene;

.field final R:Ljava/lang/Object;

.field S:F

.field T:F

.field U:[F

.field V:[F

.field W:[F

.field X:[F

.field Y:[I

.field Z:[Z

.field aa:I

.field ab:I

.field ac:I

.field ad:I

.field ae:I

.field af:[F

.field ag:[F

.field ah:[F

.field ai:[F

.field aj:[I

.field ak:[I

.field al:[I

.field private final an:Ljava/util/concurrent/ThreadPoolExecutor;

.field private ao:Ljava/util/concurrent/BlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/BlockingQueue",
            "<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field

.field private ap:Lcom/saterskog/cell_lab/p$a;

.field private aq:Z

.field private ar:J

.field private as:Ljava/io/InputStream;

.field private at:I

.field private au:Z

.field private av:Z

.field private aw:Landroid/app/Activity;

.field p:D

.field q:Lcom/saterskog/cell_lab/q$a;

.field r:Lcom/saterskog/cell_lab/CellWorld;

.field s:Lcom/saterskog/cell_lab/Environment;

.field t:Z

.field u:Z

.field v:D

.field w:D

.field x:D

.field y:D

.field public z:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 39
    const/4 v0, 0x1

    sput v0, Lcom/saterskog/cell_lab/q;->am:I

    return-void
.end method

.method public constructor <init>(Lcom/saterskog/cell_lab/CellWorld;Landroid/app/Activity;Lcom/saterskog/cell_lab/p$a;Lcom/saterskog/cell_lab/q$a;ID)V
    .locals 8

    .prologue
    .line 113
    const-wide v0, 0x3ff199999999999aL    # 1.1

    mul-double/2addr v0, p6

    double-to-float v0, v0

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1, p2}, Lcom/saterskog/cell_lab/d;-><init>(FZLandroid/content/Context;)V

    .line 49
    new-instance v0, Lcom/saterskog/cell_lab/Environment;

    invoke-direct {v0}, Lcom/saterskog/cell_lab/Environment;-><init>()V

    iput-object v0, p0, Lcom/saterskog/cell_lab/q;->s:Lcom/saterskog/cell_lab/Environment;

    .line 50
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/saterskog/cell_lab/q;->t:Z

    .line 54
    const v0, 0x3d4ccccd    # 0.05f

    iput v0, p0, Lcom/saterskog/cell_lab/q;->C:F

    .line 55
    const/4 v0, 0x3

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    iput-object v0, p0, Lcom/saterskog/cell_lab/q;->D:[F

    .line 61
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/saterskog/cell_lab/q;->G:Z

    .line 62
    const/4 v0, 0x4

    new-array v0, v0, [F

    iput-object v0, p0, Lcom/saterskog/cell_lab/q;->H:[F

    .line 63
    const/4 v0, 0x4

    new-array v0, v0, [F

    iput-object v0, p0, Lcom/saterskog/cell_lab/q;->I:[F

    .line 67
    const/4 v0, 0x3

    new-array v0, v0, [F

    fill-array-data v0, :array_1

    iput-object v0, p0, Lcom/saterskog/cell_lab/q;->J:[F

    .line 68
    const/16 v0, 0x10

    new-array v0, v0, [F

    iput-object v0, p0, Lcom/saterskog/cell_lab/q;->K:[F

    .line 69
    const/16 v0, 0x10

    new-array v0, v0, [F

    iput-object v0, p0, Lcom/saterskog/cell_lab/q;->L:[F

    .line 72
    const-wide/32 v0, -0x3b9aca00

    iput-wide v0, p0, Lcom/saterskog/cell_lab/q;->ar:J

    .line 73
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/saterskog/cell_lab/q;->N:Ljava/io/OutputStream;

    .line 79
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/saterskog/cell_lab/q;->R:Ljava/lang/Object;

    .line 87
    const/16 v0, 0x14

    new-array v0, v0, [F

    iput-object v0, p0, Lcom/saterskog/cell_lab/q;->U:[F

    .line 88
    const/16 v0, 0x14

    new-array v0, v0, [F

    iput-object v0, p0, Lcom/saterskog/cell_lab/q;->V:[F

    .line 89
    const/16 v0, 0x14

    new-array v0, v0, [F

    iput-object v0, p0, Lcom/saterskog/cell_lab/q;->W:[F

    .line 90
    const/16 v0, 0x14

    new-array v0, v0, [F

    iput-object v0, p0, Lcom/saterskog/cell_lab/q;->X:[F

    .line 91
    const/16 v0, 0x14

    new-array v0, v0, [I

    iput-object v0, p0, Lcom/saterskog/cell_lab/q;->Y:[I

    .line 95
    const/16 v0, 0x14

    new-array v0, v0, [Z

    iput-object v0, p0, Lcom/saterskog/cell_lab/q;->Z:[Z

    .line 103
    const/16 v0, 0xc8

    new-array v0, v0, [F

    iput-object v0, p0, Lcom/saterskog/cell_lab/q;->af:[F

    const/16 v0, 0xc8

    new-array v0, v0, [F

    iput-object v0, p0, Lcom/saterskog/cell_lab/q;->ag:[F

    .line 104
    const/16 v0, 0xc8

    new-array v0, v0, [F

    iput-object v0, p0, Lcom/saterskog/cell_lab/q;->ah:[F

    const/16 v0, 0xc8

    new-array v0, v0, [F

    iput-object v0, p0, Lcom/saterskog/cell_lab/q;->ai:[F

    .line 105
    const/16 v0, 0xc8

    new-array v0, v0, [I

    iput-object v0, p0, Lcom/saterskog/cell_lab/q;->aj:[I

    const/16 v0, 0xc8

    new-array v0, v0, [I

    iput-object v0, p0, Lcom/saterskog/cell_lab/q;->ak:[I

    const/16 v0, 0xc8

    new-array v0, v0, [I

    iput-object v0, p0, Lcom/saterskog/cell_lab/q;->al:[I

    .line 114
    iput-object p2, p0, Lcom/saterskog/cell_lab/q;->aw:Landroid/app/Activity;

    .line 119
    iput-object p3, p0, Lcom/saterskog/cell_lab/q;->ap:Lcom/saterskog/cell_lab/p$a;

    .line 120
    iput-object p4, p0, Lcom/saterskog/cell_lab/q;->q:Lcom/saterskog/cell_lab/q$a;

    .line 121
    const/4 v0, -0x1

    if-eq p5, v0, :cond_0

    .line 122
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/saterskog/cell_lab/q;->M:Z

    .line 124
    :cond_0
    if-nez p1, :cond_1

    .line 125
    const-string v0, "skit"

    invoke-static {v0}, Lcom/saterskog/b/a;->a(Ljava/lang/String;)V

    .line 126
    :cond_1
    iput-object p1, p0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    .line 128
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/saterskog/cell_lab/q;->F:Ljava/util/concurrent/Future;

    .line 129
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/saterskog/cell_lab/q;->E:Ljava/util/concurrent/Future;

    .line 130
    iput p5, p0, Lcom/saterskog/cell_lab/q;->B:I

    .line 131
    new-instance v0, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v0}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    iput-object v0, p0, Lcom/saterskog/cell_lab/q;->ao:Ljava/util/concurrent/BlockingQueue;

    .line 133
    new-instance v1, Ljava/util/concurrent/ThreadPoolExecutor;

    const/4 v2, 0x1

    const/4 v3, 0x1

    const-wide/16 v4, 0x1

    sget-object v6, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    iget-object v7, p0, Lcom/saterskog/cell_lab/q;->ao:Ljava/util/concurrent/BlockingQueue;

    invoke-direct/range {v1 .. v7}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;)V

    iput-object v1, p0, Lcom/saterskog/cell_lab/q;->an:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 135
    iget-object v1, p0, Lcom/saterskog/cell_lab/q;->R:Ljava/lang/Object;

    monitor-enter v1

    .line 136
    const/16 v0, 0x50

    :try_start_0
    new-array v0, v0, [Lcom/saterskog/cell_lab/Gene;

    iput-object v0, p0, Lcom/saterskog/cell_lab/q;->Q:[Lcom/saterskog/cell_lab/Gene;

    .line 137
    const/4 v0, 0x0

    :goto_0
    const/16 v2, 0x50

    if-ge v0, v2, :cond_2

    .line 138
    iget-object v2, p0, Lcom/saterskog/cell_lab/q;->Q:[Lcom/saterskog/cell_lab/Gene;

    new-instance v3, Lcom/saterskog/cell_lab/Gene;

    invoke-direct {v3}, Lcom/saterskog/cell_lab/Gene;-><init>()V

    aput-object v3, v2, v0

    .line 137
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 139
    :cond_2
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/saterskog/cell_lab/q;->au:Z

    .line 140
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 142
    const/4 v0, 0x0

    iput v0, p0, Lcom/saterskog/cell_lab/q;->b:F

    .line 143
    const/4 v0, 0x0

    iput v0, p0, Lcom/saterskog/cell_lab/q;->c:F

    .line 144
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/saterskog/cell_lab/q;->aq:Z

    .line 145
    const/high16 v0, 0x3f800000    # 1.0f

    double-to-float v1, p6

    div-float/2addr v0, v1

    iput v0, p0, Lcom/saterskog/cell_lab/q;->d:F

    .line 146
    const/4 v0, 0x0

    iput v0, p0, Lcom/saterskog/cell_lab/q;->z:I

    .line 147
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/saterskog/cell_lab/q;->e:F

    .line 148
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/saterskog/cell_lab/q;->u:Z

    .line 149
    const/4 v0, -0x1

    iput v0, p0, Lcom/saterskog/cell_lab/q;->O:I

    .line 150
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/saterskog/cell_lab/q;->as:Ljava/io/InputStream;

    .line 151
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/saterskog/cell_lab/q;->P:Z

    .line 152
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/saterskog/cell_lab/q;->av:Z

    .line 155
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->aw:Landroid/app/Activity;

    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "log_stats"

    const-string v2, "none"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 156
    const-wide/high16 v2, -0x4010000000000000L    # -1.0

    iput-wide v2, p0, Lcom/saterskog/cell_lab/q;->p:D

    .line 157
    const-string v1, "12m"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    const-wide v2, 0x3fc999999999999aL    # 0.2

    iput-wide v2, p0, Lcom/saterskog/cell_lab/q;->p:D

    .line 158
    :cond_3
    const-string v1, "1h"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    iput-wide v2, p0, Lcom/saterskog/cell_lab/q;->p:D

    .line 159
    :cond_4
    const-string v1, "5h"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    const-wide/high16 v2, 0x4014000000000000L    # 5.0

    iput-wide v2, p0, Lcom/saterskog/cell_lab/q;->p:D

    .line 160
    :cond_5
    const-string v1, "25h"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    const-wide/high16 v2, 0x4039000000000000L    # 25.0

    iput-wide v2, p0, Lcom/saterskog/cell_lab/q;->p:D

    .line 161
    :cond_6
    const-string v1, "125h"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    const-wide v2, 0x405f400000000000L    # 125.0

    iput-wide v2, p0, Lcom/saterskog/cell_lab/q;->p:D

    .line 162
    :cond_7
    const-string v1, "625h"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    const-wide v0, 0x4083880000000000L    # 625.0

    iput-wide v0, p0, Lcom/saterskog/cell_lab/q;->p:D

    .line 167
    :cond_8
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/q;->b()V

    .line 170
    return-void

    .line 140
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    .line 55
    :array_0
    .array-data 4
        0x3f4ccccd    # 0.8f
        0x3f4ccccd    # 0.8f
        0x3f800000    # 1.0f
    .end array-data

    .line 67
    :array_1
    .array-data 4
        0x0
        0x0
        0x0
    .end array-data
.end method

.method static synthetic a(Lcom/saterskog/cell_lab/q;)Landroid/app/Activity;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->aw:Landroid/app/Activity;

    return-object v0
.end method

.method private a(DD)V
    .locals 7

    .prologue
    .line 181
    new-instance v1, Lcom/saterskog/cell_lab/Cell;

    invoke-direct {v1}, Lcom/saterskog/cell_lab/Cell;-><init>()V

    .line 182
    iput-wide p1, v1, Lcom/saterskog/cell_lab/Cell;->b:D

    .line 183
    iput-wide p3, v1, Lcom/saterskog/cell_lab/Cell;->c:D

    .line 185
    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    iput-wide v2, v1, Lcom/saterskog/cell_lab/Cell;->p:D

    .line 186
    const/4 v0, -0x1

    iput v0, v1, Lcom/saterskog/cell_lab/Cell;->T:I

    .line 187
    const/4 v0, 0x0

    :goto_0
    const/4 v2, 0x4

    if-ge v0, v2, :cond_0

    iget-object v2, v1, Lcom/saterskog/cell_lab/Cell;->U:[F

    const v3, 0x3c23d70a    # 0.01f

    aput v3, v2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 189
    :cond_0
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->ap:Lcom/saterskog/cell_lab/p$a;

    invoke-interface {v0}, Lcom/saterskog/cell_lab/p$a;->f()[Lcom/saterskog/cell_lab/Gene;

    move-result-object v2

    .line 190
    const/4 v0, 0x0

    iput v0, v1, Lcom/saterskog/cell_lab/Cell;->D:I

    .line 191
    const/4 v0, 0x0

    :goto_1
    const/16 v3, 0x50

    if-ge v0, v3, :cond_2

    .line 192
    iget-object v3, v1, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    new-instance v4, Lcom/saterskog/cell_lab/Gene;

    aget-object v5, v2, v0

    invoke-direct {v4, v5}, Lcom/saterskog/cell_lab/Gene;-><init>(Lcom/saterskog/cell_lab/Gene;)V

    aput-object v4, v3, v0

    .line 193
    iget-object v3, v1, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    aget-object v3, v3, v0

    iget-boolean v3, v3, Lcom/saterskog/cell_lab/Gene;->p:Z

    if-eqz v3, :cond_1

    iput v0, v1, Lcom/saterskog/cell_lab/Cell;->D:I

    .line 191
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 195
    :cond_2
    iget-object v0, v1, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    iget v2, v1, Lcom/saterskog/cell_lab/Cell;->D:I

    aget-object v0, v0, v2

    iget-object v0, v0, Lcom/saterskog/cell_lab/Gene;->s:Lcom/saterskog/cell_lab/h;

    sget-object v2, Lcom/saterskog/cell_lab/h;->e:Lcom/saterskog/cell_lab/h;

    if-ne v0, v2, :cond_6

    .line 196
    const-wide v2, 0x3ffba5e353f7ced9L    # 1.728

    iput-wide v2, v1, Lcom/saterskog/cell_lab/Cell;->w:D

    .line 199
    :goto_2
    iget-wide v2, v1, Lcom/saterskog/cell_lab/Cell;->w:D

    const-wide/high16 v4, 0x4079000000000000L    # 400.0

    div-double/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v2

    const-wide v4, 0x3f9e69ad42c3c9eeL    # 0.029699999999999997

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->min(DD)D

    move-result-wide v2

    iput-wide v2, v1, Lcom/saterskog/cell_lab/Cell;->d:D

    .line 200
    iget-object v0, v1, Lcom/saterskog/cell_lab/Cell;->J:[F

    const/4 v2, 0x0

    iget-object v3, v1, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    iget v4, v1, Lcom/saterskog/cell_lab/Cell;->D:I

    aget-object v3, v3, v4

    iget-object v3, v3, Lcom/saterskog/cell_lab/Gene;->a:[F

    const/4 v4, 0x0

    aget v3, v3, v4

    aput v3, v0, v2

    .line 201
    iget-object v0, v1, Lcom/saterskog/cell_lab/Cell;->J:[F

    const/4 v2, 0x1

    iget-object v3, v1, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    iget v4, v1, Lcom/saterskog/cell_lab/Cell;->D:I

    aget-object v3, v3, v4

    iget-object v3, v3, Lcom/saterskog/cell_lab/Gene;->a:[F

    const/4 v4, 0x1

    aget v3, v3, v4

    aput v3, v0, v2

    .line 202
    iget-object v0, v1, Lcom/saterskog/cell_lab/Cell;->J:[F

    const/4 v2, 0x2

    iget-object v3, v1, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    iget v4, v1, Lcom/saterskog/cell_lab/Cell;->D:I

    aget-object v3, v3, v4

    iget-object v3, v3, Lcom/saterskog/cell_lab/Gene;->a:[F

    const/4 v4, 0x2

    aget v3, v3, v4

    aput v3, v0, v2

    .line 203
    iget-object v0, v1, Lcom/saterskog/cell_lab/Cell;->J:[F

    const/4 v2, 0x3

    const/high16 v3, 0x3f800000    # 1.0f

    aput v3, v0, v2

    .line 204
    const-wide/16 v2, 0x0

    iput-wide v2, v1, Lcom/saterskog/cell_lab/Cell;->e:D

    .line 205
    const-wide/16 v2, 0x0

    iput-wide v2, v1, Lcom/saterskog/cell_lab/Cell;->f:D

    .line 206
    const-wide/16 v2, 0x0

    iput-wide v2, v1, Lcom/saterskog/cell_lab/Cell;->l:D

    .line 207
    const-wide/16 v2, 0x0

    iput-wide v2, v1, Lcom/saterskog/cell_lab/Cell;->n:D

    .line 208
    const-wide/16 v2, 0x0

    iput-wide v2, v1, Lcom/saterskog/cell_lab/Cell;->k:D

    .line 209
    sget-object v0, Lcom/saterskog/b/d;->a:Lcom/saterskog/b/d;

    invoke-virtual {v0}, Lcom/saterskog/b/d;->b()D

    move-result-wide v2

    const-wide v4, 0x400921fb54442d18L    # Math.PI

    mul-double/2addr v2, v4

    iput-wide v2, v1, Lcom/saterskog/cell_lab/Cell;->m:D

    .line 210
    const/4 v0, 0x0

    iput v0, v1, Lcom/saterskog/cell_lab/Cell;->C:I

    .line 211
    const/4 v0, 0x1

    iput v0, v1, Lcom/saterskog/cell_lab/Cell;->E:I

    .line 212
    const/4 v0, 0x0

    iput v0, v1, Lcom/saterskog/cell_lab/Cell;->F:I

    .line 213
    const/4 v0, 0x0

    iput-boolean v0, v1, Lcom/saterskog/cell_lab/Cell;->y:Z

    .line 214
    const-wide v2, 0x3fb999999999999aL    # 0.1

    iput-wide v2, v1, Lcom/saterskog/cell_lab/Cell;->o:D

    .line 215
    const/4 v0, 0x0

    iput v0, v1, Lcom/saterskog/cell_lab/Cell;->G:I

    .line 216
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    iget v0, v0, Lcom/saterskog/cell_lab/CellWorld;->z:I

    iget-object v2, p0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    iget-object v2, v2, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget v2, v2, Lcom/saterskog/cell_lab/Environment;->r:I

    if-ne v0, v2, :cond_3

    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    iget v0, v0, Lcom/saterskog/cell_lab/CellWorld;->z:I

    if-lez v0, :cond_3

    .line 218
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    sget-object v2, Lcom/saterskog/b/d;->a:Lcom/saterskog/b/d;

    iget-object v3, p0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    iget v3, v3, Lcom/saterskog/cell_lab/CellWorld;->z:I

    .line 2017
    invoke-virtual {v2, v3}, Lcom/saterskog/b/d;->nextInt(I)I

    move-result v2

    .line 218
    aget-object v0, v0, v2

    iget-object v2, p0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    iget-object v2, v2, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    iget-object v3, p0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    iget v3, v3, Lcom/saterskog/cell_lab/CellWorld;->z:I

    add-int/lit8 v3, v3, -0x1

    aget-object v2, v2, v3

    invoke-virtual {v0, v2}, Lcom/saterskog/cell_lab/Cell;->a(Lcom/saterskog/cell_lab/Cell;)V

    .line 219
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    iget v2, v0, Lcom/saterskog/cell_lab/CellWorld;->z:I

    add-int/lit8 v2, v2, -0x1

    iput v2, v0, Lcom/saterskog/cell_lab/CellWorld;->z:I

    .line 221
    :cond_3
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    invoke-virtual {v0, v1}, Lcom/saterskog/cell_lab/CellWorld;->a(Lcom/saterskog/cell_lab/Cell;)Z

    .line 223
    iget-object v0, v1, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    const/4 v2, 0x0

    aget-object v0, v0, v2

    iget-object v0, v0, Lcom/saterskog/cell_lab/Gene;->u:[I

    const/4 v2, 0x5

    aget v0, v0, v2

    if-nez v0, :cond_4

    iget-object v0, v1, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    const/4 v2, 0x0

    aget-object v0, v0, v2

    iget-object v0, v0, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    const/4 v2, 0x7

    aget-object v0, v0, v2

    iget-short v0, v0, Lcom/saterskog/cell_lab/Gene$a;->e:S

    if-nez v0, :cond_4

    iget-object v0, v1, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    const/4 v2, 0x0

    aget-object v0, v0, v2

    iget-object v0, v0, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    const/4 v2, 0x7

    aget-object v0, v0, v2

    iget v0, v0, Lcom/saterskog/cell_lab/Gene$a;->b:F

    float-to-double v2, v0

    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    sub-double/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Math;->abs(D)D

    move-result-wide v2

    const-wide v4, 0x3fb999999999999aL    # 0.1

    cmpg-double v0, v2, v4

    if-gez v0, :cond_4

    .line 224
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->aw:Landroid/app/Activity;

    const/4 v2, 0x3

    const/4 v3, 0x4

    const/16 v4, 0x9c4

    invoke-static {v0, v2, v3, v4}, Lcom/saterskog/cell_lab/t;->a(Landroid/app/Activity;III)V

    .line 226
    :cond_4
    iget-object v0, v1, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    const/4 v2, 0x2

    aget-object v0, v0, v2

    iget-object v0, v0, Lcom/saterskog/cell_lab/Gene;->u:[I

    const/4 v2, 0x5

    aget v0, v0, v2

    if-nez v0, :cond_5

    iget-object v0, v1, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    const/4 v2, 0x2

    aget-object v0, v0, v2

    iget-object v0, v0, Lcom/saterskog/cell_lab/Gene;->u:[I

    const/4 v2, 0x6

    aget v0, v0, v2

    const/4 v2, 0x1

    if-ne v0, v2, :cond_5

    iget-object v0, v1, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    const/4 v2, 0x2

    aget-object v0, v0, v2

    iget-object v0, v0, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    const/4 v2, 0x7

    aget-object v0, v0, v2

    iget-short v0, v0, Lcom/saterskog/cell_lab/Gene$a;->d:S

    const/4 v2, 0x1

    if-ne v0, v2, :cond_5

    iget-object v0, v1, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    const/4 v2, 0x2

    aget-object v0, v0, v2

    iget-object v0, v0, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    const/16 v2, 0x8

    aget-object v0, v0, v2

    iget-short v0, v0, Lcom/saterskog/cell_lab/Gene$a;->d:S

    if-nez v0, :cond_5

    iget-object v0, v1, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    const/4 v2, 0x2

    aget-object v0, v0, v2

    iget-object v0, v0, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    const/4 v2, 0x7

    aget-object v0, v0, v2

    iget v0, v0, Lcom/saterskog/cell_lab/Gene$a;->a:F

    const v2, 0x3edef9db    # 0.4355f

    sub-float/2addr v0, v2

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const v2, 0x3e4ccccd    # 0.2f

    cmpg-float v0, v0, v2

    if-gez v0, :cond_5

    iget-object v0, v1, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    const/4 v1, 0x2

    aget-object v0, v0, v1

    iget-object v0, v0, Lcom/saterskog/cell_lab/Gene;->t:[Lcom/saterskog/cell_lab/Gene$a;

    const/16 v1, 0x8

    aget-object v0, v0, v1

    iget v0, v0, Lcom/saterskog/cell_lab/Gene$a;->a:F

    const v1, 0x3edef9db    # 0.4355f

    add-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const v1, 0x3e4ccccd    # 0.2f

    cmpg-float v0, v0, v1

    if-gez v0, :cond_5

    .line 227
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->aw:Landroid/app/Activity;

    const/4 v1, 0x3

    const/4 v2, 0x6

    const/16 v3, 0x9c4

    invoke-static {v0, v1, v2, v3}, Lcom/saterskog/cell_lab/t;->a(Landroid/app/Activity;III)V

    .line 228
    :cond_5
    return-void

    .line 198
    :cond_6
    const-wide v2, 0x3fd26e978d4fdf3bL    # 0.288

    iput-wide v2, v1, Lcom/saterskog/cell_lab/Cell;->w:D

    goto/16 :goto_2
.end method

.method static synthetic a(Lcom/saterskog/cell_lab/q;Z)V
    .locals 8

    .prologue
    const-wide/high16 v6, 0x3ff0000000000000L    # 1.0

    const-wide/16 v4, 0x0

    .line 4784
    const-wide/16 v0, 0x0

    .line 4785
    iget-wide v2, p0, Lcom/saterskog/cell_lab/q;->p:D

    cmpl-double v2, v2, v4

    if-lez v2, :cond_0

    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    iget-wide v0, v0, Lcom/saterskog/cell_lab/CellWorld;->M:D

    iget-wide v2, p0, Lcom/saterskog/cell_lab/q;->p:D

    div-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    .line 4787
    :cond_0
    iget-object v2, p0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    invoke-virtual {v2, p1, v6, v7}, Lcom/saterskog/cell_lab/CellWorld;->b(ZD)V

    .line 4788
    iget-object v2, p0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    invoke-virtual {v2, v6, v7}, Lcom/saterskog/cell_lab/CellWorld;->a(D)V

    .line 4789
    iget-wide v2, p0, Lcom/saterskog/cell_lab/q;->p:D

    cmpl-double v2, v2, v4

    if-lez v2, :cond_1

    .line 4790
    iget-object v2, p0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    iget-wide v2, v2, Lcom/saterskog/cell_lab/CellWorld;->M:D

    iget-wide v4, p0, Lcom/saterskog/cell_lab/q;->p:D

    div-double/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Math;->round(D)J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-eqz v0, :cond_1

    .line 4791
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->q:Lcom/saterskog/cell_lab/q$a;

    iget-object v1, p0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    invoke-interface {v0, v1}, Lcom/saterskog/cell_lab/q$a;->a(Lcom/saterskog/cell_lab/CellWorld;)V

    .line 27
    :cond_1
    return-void
.end method

.method static synthetic b(Lcom/saterskog/cell_lab/q;)Lcom/saterskog/cell_lab/p$a;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->ap:Lcom/saterskog/cell_lab/p$a;

    return-object v0
.end method

.method private d()V
    .locals 24

    .prologue
    .line 905
    move-object/from16 v0, p0

    iget v4, v0, Lcom/saterskog/cell_lab/q;->A:I

    const/4 v5, 0x1

    if-ne v4, v5, :cond_b

    .line 906
    const/4 v4, 0x0

    :goto_0
    move-object/from16 v0, p0

    iget v5, v0, Lcom/saterskog/cell_lab/q;->ac:I

    if-ge v4, v5, :cond_2

    .line 908
    move-object/from16 v0, p0

    iget v5, v0, Lcom/saterskog/cell_lab/q;->ab:I

    move-object/from16 v0, p0

    iget v6, v0, Lcom/saterskog/cell_lab/q;->aa:I

    if-ne v5, v6, :cond_0

    .line 909
    const/4 v5, 0x0

    :goto_1
    const/16 v6, 0x14

    if-ge v5, v6, :cond_0

    .line 910
    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/saterskog/cell_lab/q;->Z:[Z

    aget-boolean v6, v6, v5

    if-nez v6, :cond_1

    .line 911
    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/saterskog/cell_lab/q;->af:[F

    aget v7, v7, v4

    float-to-double v8, v7

    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/saterskog/cell_lab/q;->ag:[F

    aget v7, v7, v4

    float-to-double v10, v7

    invoke-virtual {v6, v8, v9, v10, v11}, Lcom/saterskog/cell_lab/CellWorld;->a(DD)I

    move-result v6

    .line 912
    const/4 v7, -0x1

    if-eq v6, v7, :cond_0

    .line 913
    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/saterskog/cell_lab/q;->Y:[I

    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/saterskog/cell_lab/q;->aj:[I

    aget v8, v8, v4

    aput v8, v7, v5

    .line 914
    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/saterskog/cell_lab/q;->U:[F

    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/saterskog/cell_lab/q;->af:[F

    aget v8, v8, v4

    aput v8, v7, v5

    .line 915
    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/saterskog/cell_lab/q;->V:[F

    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/saterskog/cell_lab/q;->ag:[F

    aget v8, v8, v4

    aput v8, v7, v5

    .line 916
    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    iget-object v7, v7, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    aget-object v7, v7, v6

    add-int/lit8 v8, v5, 0x64

    iput v8, v7, Lcom/saterskog/cell_lab/Cell;->F:I

    .line 917
    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/saterskog/cell_lab/q;->W:[F

    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/saterskog/cell_lab/q;->af:[F

    aget v8, v8, v4

    move-object/from16 v0, p0

    iget-object v9, v0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    iget-object v9, v9, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    aget-object v9, v9, v6

    iget-wide v10, v9, Lcom/saterskog/cell_lab/Cell;->b:D

    double-to-float v9, v10

    sub-float/2addr v8, v9

    aput v8, v7, v5

    .line 918
    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/saterskog/cell_lab/q;->X:[F

    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/saterskog/cell_lab/q;->ag:[F

    aget v8, v8, v4

    move-object/from16 v0, p0

    iget-object v9, v0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    iget-object v9, v9, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    aget-object v6, v9, v6

    iget-wide v10, v6, Lcom/saterskog/cell_lab/Cell;->c:D

    double-to-float v6, v10

    sub-float v6, v8, v6

    aput v6, v7, v5

    .line 919
    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/saterskog/cell_lab/q;->Z:[Z

    const/4 v7, 0x1

    aput-boolean v7, v6, v5

    .line 920
    move-object/from16 v0, p0

    iget v5, v0, Lcom/saterskog/cell_lab/q;->ab:I

    add-int/lit8 v5, v5, 0x1

    move-object/from16 v0, p0

    iput v5, v0, Lcom/saterskog/cell_lab/q;->ab:I

    .line 924
    :cond_0
    move-object/from16 v0, p0

    iget v5, v0, Lcom/saterskog/cell_lab/q;->aa:I

    add-int/lit8 v5, v5, 0x1

    move-object/from16 v0, p0

    iput v5, v0, Lcom/saterskog/cell_lab/q;->aa:I

    .line 906
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_0

    .line 909
    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_1

    .line 926
    :cond_2
    const/4 v4, 0x0

    move-object/from16 v0, p0

    iput v4, v0, Lcom/saterskog/cell_lab/q;->ac:I

    .line 928
    const/4 v4, 0x0

    :goto_2
    move-object/from16 v0, p0

    iget v5, v0, Lcom/saterskog/cell_lab/q;->ae:I

    if-ge v4, v5, :cond_6

    .line 929
    move-object/from16 v0, p0

    iget v5, v0, Lcom/saterskog/cell_lab/q;->ab:I

    move-object/from16 v0, p0

    iget v6, v0, Lcom/saterskog/cell_lab/q;->aa:I

    if-ne v5, v6, :cond_3

    .line 930
    const/4 v5, 0x0

    :goto_3
    const/16 v6, 0x14

    if-ge v5, v6, :cond_3

    .line 931
    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/saterskog/cell_lab/q;->Z:[Z

    aget-boolean v6, v6, v5

    if-eqz v6, :cond_5

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/saterskog/cell_lab/q;->Y:[I

    aget v6, v6, v5

    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/saterskog/cell_lab/q;->al:[I

    aget v7, v7, v4

    if-ne v6, v7, :cond_5

    .line 932
    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    add-int/lit8 v7, v5, 0x64

    invoke-virtual {v6, v7}, Lcom/saterskog/cell_lab/CellWorld;->a(I)I

    move-result v6

    .line 933
    const/4 v7, -0x1

    if-ne v6, v7, :cond_4

    .line 934
    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/saterskog/cell_lab/q;->Z:[Z

    const/4 v7, 0x0

    aput-boolean v7, v6, v5

    .line 935
    move-object/from16 v0, p0

    iget v5, v0, Lcom/saterskog/cell_lab/q;->ab:I

    add-int/lit8 v5, v5, -0x1

    move-object/from16 v0, p0

    iput v5, v0, Lcom/saterskog/cell_lab/q;->ab:I

    .line 928
    :cond_3
    :goto_4
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    .line 939
    :cond_4
    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/saterskog/cell_lab/q;->U:[F

    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/saterskog/cell_lab/q;->ah:[F

    aget v7, v7, v4

    aput v7, v6, v5

    .line 940
    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/saterskog/cell_lab/q;->V:[F

    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/saterskog/cell_lab/q;->ai:[F

    aget v7, v7, v4

    aput v7, v6, v5

    goto :goto_4

    .line 930
    :cond_5
    add-int/lit8 v5, v5, 0x1

    goto :goto_3

    .line 946
    :cond_6
    const/4 v4, 0x0

    move-object/from16 v0, p0

    iput v4, v0, Lcom/saterskog/cell_lab/q;->ae:I

    .line 948
    const/4 v4, 0x0

    :goto_5
    move-object/from16 v0, p0

    iget v5, v0, Lcom/saterskog/cell_lab/q;->ad:I

    if-ge v4, v5, :cond_a

    .line 950
    const/4 v5, 0x0

    :goto_6
    const/16 v6, 0x14

    if-ge v5, v6, :cond_9

    .line 951
    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/saterskog/cell_lab/q;->Z:[Z

    aget-boolean v6, v6, v5

    if-eqz v6, :cond_8

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/saterskog/cell_lab/q;->Y:[I

    aget v6, v6, v5

    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/saterskog/cell_lab/q;->ak:[I

    aget v7, v7, v4

    if-ne v6, v7, :cond_8

    .line 952
    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    add-int/lit8 v7, v5, 0x64

    invoke-virtual {v6, v7}, Lcom/saterskog/cell_lab/CellWorld;->a(I)I

    move-result v6

    .line 953
    const/4 v7, -0x1

    if-eq v6, v7, :cond_7

    .line 962
    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    iget-object v7, v7, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    aget-object v6, v7, v6

    const/4 v7, 0x0

    iput v7, v6, Lcom/saterskog/cell_lab/Cell;->F:I

    .line 964
    :cond_7
    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/saterskog/cell_lab/q;->Z:[Z

    const/4 v7, 0x0

    aput-boolean v7, v6, v5

    .line 965
    move-object/from16 v0, p0

    iget v6, v0, Lcom/saterskog/cell_lab/q;->ab:I

    add-int/lit8 v6, v6, -0x1

    move-object/from16 v0, p0

    iput v6, v0, Lcom/saterskog/cell_lab/q;->ab:I

    .line 950
    :cond_8
    add-int/lit8 v5, v5, 0x1

    goto :goto_6

    .line 969
    :cond_9
    move-object/from16 v0, p0

    iget v5, v0, Lcom/saterskog/cell_lab/q;->aa:I

    add-int/lit8 v5, v5, -0x1

    move-object/from16 v0, p0

    iput v5, v0, Lcom/saterskog/cell_lab/q;->aa:I

    .line 948
    add-int/lit8 v4, v4, 0x1

    goto :goto_5

    .line 971
    :cond_a
    const/4 v4, 0x0

    move-object/from16 v0, p0

    iput v4, v0, Lcom/saterskog/cell_lab/q;->ad:I

    .line 974
    :cond_b
    const/4 v4, 0x0

    move v6, v4

    :goto_7
    const/16 v4, 0x14

    if-ge v6, v4, :cond_11

    .line 975
    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/saterskog/cell_lab/q;->Z:[Z

    aget-boolean v4, v4, v6

    if-eqz v4, :cond_10

    .line 976
    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    add-int/lit8 v5, v6, 0x64

    invoke-virtual {v4, v5}, Lcom/saterskog/cell_lab/CellWorld;->a(I)I

    move-result v7

    .line 977
    const/4 v4, -0x1

    if-eq v7, v4, :cond_10

    .line 979
    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/saterskog/cell_lab/q;->W:[F

    aget v4, v4, v6

    float-to-double v4, v4

    .line 980
    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/saterskog/cell_lab/q;->X:[F

    aget v8, v8, v6

    float-to-double v8, v8

    .line 981
    move-object/from16 v0, p0

    iget-object v10, v0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    iget-object v10, v10, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    aget-object v10, v10, v7

    iget-wide v10, v10, Lcom/saterskog/cell_lab/Cell;->b:D

    add-double/2addr v10, v4

    .line 982
    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    iget-object v12, v12, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    aget-object v12, v12, v7

    iget-wide v12, v12, Lcom/saterskog/cell_lab/Cell;->c:D

    add-double/2addr v12, v8

    .line 983
    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/saterskog/cell_lab/q;->U:[F

    aget v14, v14, v6

    float-to-double v14, v14

    sub-double v10, v14, v10

    .line 984
    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/saterskog/cell_lab/q;->V:[F

    aget v14, v14, v6

    float-to-double v14, v14

    sub-double v12, v14, v12

    .line 985
    const-wide/high16 v14, 0x3fe0000000000000L    # 0.5

    mul-double/2addr v12, v4

    mul-double/2addr v10, v8

    sub-double v10, v12, v10

    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    iget-object v12, v12, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    aget-object v12, v12, v7

    iget-wide v12, v12, Lcom/saterskog/cell_lab/Cell;->d:D

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    move-object/from16 v16, v0

    move-object/from16 v0, v16

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    move-object/from16 v16, v0

    aget-object v16, v16, v7

    move-object/from16 v0, v16

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->d:D

    move-wide/from16 v16, v0

    mul-double v12, v12, v16

    div-double/2addr v10, v12

    mul-double/2addr v10, v14

    .line 986
    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    iget-object v12, v12, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    aget-object v12, v12, v7

    iget-wide v12, v12, Lcom/saterskog/cell_lab/Cell;->b:D

    .line 987
    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    iget-object v14, v14, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    aget-object v14, v14, v7

    iget-wide v14, v14, Lcom/saterskog/cell_lab/Cell;->c:D

    .line 988
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    move-object/from16 v16, v0

    move-object/from16 v0, v16

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    move-object/from16 v16, v0

    aget-object v16, v16, v7

    move-object/from16 v0, v16

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->k:D

    move-wide/from16 v16, v0

    .line 989
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    move-object/from16 v18, v0

    move-object/from16 v0, v18

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    move-object/from16 v18, v0

    aget-object v18, v18, v7

    move-object/from16 v0, v18

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Cell;->k:D

    move-wide/from16 v20, v0

    add-double v20, v20, v10

    move-wide/from16 v0, v20

    move-object/from16 v2, v18

    iput-wide v0, v2, Lcom/saterskog/cell_lab/Cell;->k:D

    .line 990
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/q;->W:[F

    move-object/from16 v18, v0

    invoke-static {v10, v11}, Ljava/lang/Math;->cos(D)D

    move-result-wide v20

    mul-double v20, v20, v4

    invoke-static {v10, v11}, Ljava/lang/Math;->sin(D)D

    move-result-wide v22

    mul-double v22, v22, v8

    sub-double v20, v20, v22

    move-wide/from16 v0, v20

    double-to-float v0, v0

    move/from16 v19, v0

    aput v19, v18, v6

    .line 991
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/q;->X:[F

    move-object/from16 v18, v0

    invoke-static {v10, v11}, Ljava/lang/Math;->cos(D)D

    move-result-wide v20

    mul-double v8, v8, v20

    invoke-static {v10, v11}, Ljava/lang/Math;->sin(D)D

    move-result-wide v10

    mul-double/2addr v4, v10

    add-double/2addr v4, v8

    double-to-float v4, v4

    aput v4, v18, v6

    .line 992
    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    iget-object v4, v4, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    aget-object v4, v4, v7

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/saterskog/cell_lab/q;->U:[F

    aget v5, v5, v6

    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/saterskog/cell_lab/q;->W:[F

    aget v8, v8, v6

    sub-float/2addr v5, v8

    float-to-double v8, v5

    iput-wide v8, v4, Lcom/saterskog/cell_lab/Cell;->b:D

    .line 993
    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    iget-object v4, v4, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    aget-object v4, v4, v7

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/saterskog/cell_lab/q;->V:[F

    aget v5, v5, v6

    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/saterskog/cell_lab/q;->X:[F

    aget v8, v8, v6

    sub-float/2addr v5, v8

    float-to-double v8, v5

    iput-wide v8, v4, Lcom/saterskog/cell_lab/Cell;->c:D

    .line 995
    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    .line 996
    move-object/from16 v0, p0

    iget v8, v0, Lcom/saterskog/cell_lab/q;->z:I

    const/4 v9, 0x1

    if-ne v8, v9, :cond_c

    .line 997
    const-wide v4, 0x3f947ae147ae147bL    # 0.02

    .line 998
    :cond_c
    move-object/from16 v0, p0

    iget v8, v0, Lcom/saterskog/cell_lab/q;->z:I

    const/4 v9, 0x3

    if-ne v8, v9, :cond_d

    .line 999
    const-wide v4, 0x3f947ae147ae147bL    # 0.02

    move-object/from16 v0, p0

    iget v8, v0, Lcom/saterskog/cell_lab/q;->C:F

    float-to-double v8, v8

    mul-double/2addr v4, v8

    .line 1000
    :cond_d
    move-object/from16 v0, p0

    iget v8, v0, Lcom/saterskog/cell_lab/q;->z:I

    const/4 v9, 0x1

    if-eq v8, v9, :cond_e

    move-object/from16 v0, p0

    iget v8, v0, Lcom/saterskog/cell_lab/q;->z:I

    const/4 v9, 0x3

    if-ne v8, v9, :cond_f

    .line 1002
    :cond_e
    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    iget-object v8, v8, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    aget-object v8, v8, v7

    const/4 v9, 0x0

    iput-boolean v9, v8, Lcom/saterskog/cell_lab/Cell;->z:Z

    .line 1003
    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    iget-object v8, v8, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    aget-object v8, v8, v7

    move-object/from16 v0, p0

    iget-object v9, v0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    iget-object v9, v9, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    aget-object v9, v9, v7

    iget-wide v10, v9, Lcom/saterskog/cell_lab/Cell;->b:D

    sub-double/2addr v10, v12

    div-double/2addr v10, v4

    iput-wide v10, v8, Lcom/saterskog/cell_lab/Cell;->e:D

    .line 1004
    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    iget-object v8, v8, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    aget-object v8, v8, v7

    move-object/from16 v0, p0

    iget-object v9, v0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    iget-object v9, v9, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    aget-object v9, v9, v7

    iget-wide v10, v9, Lcom/saterskog/cell_lab/Cell;->c:D

    sub-double/2addr v10, v14

    div-double/2addr v10, v4

    iput-wide v10, v8, Lcom/saterskog/cell_lab/Cell;->f:D

    .line 1005
    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    iget-object v8, v8, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    aget-object v8, v8, v7

    move-object/from16 v0, p0

    iget-object v9, v0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    iget-object v9, v9, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    aget-object v7, v9, v7

    iget-wide v10, v7, Lcom/saterskog/cell_lab/Cell;->k:D

    sub-double v10, v10, v16

    div-double v4, v10, v4

    iput-wide v4, v8, Lcom/saterskog/cell_lab/Cell;->l:D

    .line 1007
    :cond_f
    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    const/4 v5, 0x0

    iput-boolean v5, v4, Lcom/saterskog/cell_lab/CellWorld;->L:Z

    .line 974
    :cond_10
    add-int/lit8 v4, v6, 0x1

    move v6, v4

    goto/16 :goto_7

    .line 1058
    :cond_11
    return-void
.end method


# virtual methods
.method public final a(FF)V
    .locals 6

    .prologue
    const/4 v3, 0x1

    const/4 v1, 0x0

    .line 812
    iget v0, p0, Lcom/saterskog/cell_lab/q;->A:I

    if-ne v0, v3, :cond_2

    move v0, v1

    .line 813
    :goto_0
    const/16 v2, 0x14

    if-ge v0, v2, :cond_2

    .line 814
    iget-object v2, p0, Lcom/saterskog/cell_lab/q;->Z:[Z

    aget-boolean v2, v2, v0

    if-eqz v2, :cond_1

    .line 839
    :cond_0
    :goto_1
    return-void

    .line 813
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 816
    :cond_2
    iget-boolean v0, p0, Lcom/saterskog/cell_lab/q;->aq:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/saterskog/cell_lab/q;->l:Z

    if-eqz v0, :cond_0

    .line 817
    mul-float v0, p1, p1

    mul-float v2, p2, p2

    add-float/2addr v0, v2

    const/high16 v2, 0x3f800000    # 1.0f

    cmpl-float v0, v0, v2

    if-lez v0, :cond_3

    .line 818
    iput-boolean v3, p0, Lcom/saterskog/cell_lab/q;->av:Z

    .line 821
    :cond_3
    iget v0, p0, Lcom/saterskog/cell_lab/q;->b:F

    iget v2, p0, Lcom/saterskog/cell_lab/q;->a:F

    div-float v2, p1, v2

    sub-float/2addr v0, v2

    iput v0, p0, Lcom/saterskog/cell_lab/q;->b:F

    .line 822
    iget v0, p0, Lcom/saterskog/cell_lab/q;->c:F

    iget v2, p0, Lcom/saterskog/cell_lab/q;->a:F

    div-float v2, p2, v2

    add-float/2addr v0, v2

    iput v0, p0, Lcom/saterskog/cell_lab/q;->c:F

    .line 824
    iget v0, p0, Lcom/saterskog/cell_lab/q;->c:F

    float-to-double v2, v0

    const-wide v4, 0x3fe6666666666666L    # 0.7

    cmpl-double v0, v2, v4

    if-lez v0, :cond_4

    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->h:Landroid/content/Context;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->h:Landroid/content/Context;

    instance-of v0, v0, Landroid/app/Activity;

    if-eqz v0, :cond_4

    .line 825
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->h:Landroid/content/Context;

    check-cast v0, Landroid/app/Activity;

    const/4 v2, 0x2

    invoke-static {v0, v1, v2}, Lcom/saterskog/cell_lab/t;->b(Landroid/app/Activity;II)V

    .line 827
    :cond_4
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/q;->b()V

    goto :goto_1
.end method

.method public final a(FFF)V
    .locals 7

    .prologue
    const/4 v4, 0x1

    const/high16 v6, 0x3f800000    # 1.0f

    .line 841
    iget v0, p0, Lcom/saterskog/cell_lab/q;->A:I

    if-ne v0, v4, :cond_2

    .line 842
    const/4 v0, 0x0

    :goto_0
    const/16 v1, 0x14

    if-ge v0, v1, :cond_2

    .line 843
    iget-object v1, p0, Lcom/saterskog/cell_lab/q;->Z:[Z

    aget-boolean v1, v1, v0

    if-eqz v1, :cond_1

    .line 878
    :cond_0
    :goto_1
    return-void

    .line 842
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 845
    :cond_2
    iget-boolean v0, p0, Lcom/saterskog/cell_lab/q;->l:Z

    if-eqz v0, :cond_0

    .line 846
    iget v0, p0, Lcom/saterskog/cell_lab/q;->d:F

    mul-float/2addr v0, p1

    iput v0, p0, Lcom/saterskog/cell_lab/q;->d:F

    .line 849
    iget-boolean v0, p0, Lcom/saterskog/cell_lab/q;->aq:Z

    if-nez v0, :cond_4

    .line 850
    sub-float v0, v6, p1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    float-to-double v0, v0

    const-wide v2, 0x3f1a36e2eb1c432dL    # 1.0E-4

    cmpl-double v0, v0, v2

    if-lez v0, :cond_3

    .line 851
    iput-boolean v4, p0, Lcom/saterskog/cell_lab/q;->av:Z

    .line 852
    :cond_3
    iget v0, p0, Lcom/saterskog/cell_lab/q;->b:F

    float-to-double v0, v0

    invoke-virtual {p0, p2}, Lcom/saterskog/cell_lab/q;->a(F)D

    move-result-wide v2

    iget v4, p0, Lcom/saterskog/cell_lab/q;->b:F

    float-to-double v4, v4

    sub-double/2addr v2, v4

    sub-float v4, p1, v6

    float-to-double v4, v4

    mul-double/2addr v2, v4

    add-double/2addr v0, v2

    double-to-float v0, v0

    iput v0, p0, Lcom/saterskog/cell_lab/q;->b:F

    .line 853
    iget v0, p0, Lcom/saterskog/cell_lab/q;->c:F

    float-to-double v0, v0

    invoke-virtual {p0, p3}, Lcom/saterskog/cell_lab/q;->b(F)D

    move-result-wide v2

    iget v4, p0, Lcom/saterskog/cell_lab/q;->c:F

    float-to-double v4, v4

    sub-double/2addr v2, v4

    sub-float v4, p1, v6

    float-to-double v4, v4

    mul-double/2addr v2, v4

    add-double/2addr v0, v2

    double-to-float v0, v0

    iput v0, p0, Lcom/saterskog/cell_lab/q;->c:F

    .line 856
    :cond_4
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/q;->b()V

    .line 863
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->q:Lcom/saterskog/cell_lab/q$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->q:Lcom/saterskog/cell_lab/q$a;

    iget v1, p0, Lcom/saterskog/cell_lab/q;->f:F

    const v2, 0x3a03126f    # 5.0E-4f

    mul-float/2addr v1, v2

    invoke-interface {v0, v1}, Lcom/saterskog/cell_lab/q$a;->a(F)V

    goto :goto_1
.end method

.method public final a(I)V
    .locals 2

    .prologue
    .line 897
    iget v0, p0, Lcom/saterskog/cell_lab/q;->ad:I

    const/16 v1, 0xc8

    if-ge v0, v1, :cond_0

    .line 898
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->ak:[I

    iget v1, p0, Lcom/saterskog/cell_lab/q;->ad:I

    aput p1, v0, v1

    .line 899
    iget v0, p0, Lcom/saterskog/cell_lab/q;->ad:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/saterskog/cell_lab/q;->ad:I

    .line 901
    :cond_0
    return-void
.end method

.method public final a(Ljava/io/InputStream;I)V
    .locals 0

    .prologue
    .line 1069
    iput p2, p0, Lcom/saterskog/cell_lab/q;->at:I

    .line 1070
    iput-object p1, p0, Lcom/saterskog/cell_lab/q;->as:Ljava/io/InputStream;

    .line 1071
    return-void
.end method

.method public final a([F)V
    .locals 11

    .prologue
    .line 233
    iget v0, p0, Lcom/saterskog/cell_lab/q;->z:I

    if-nez v0, :cond_0

    .line 234
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->J:[F

    const/4 v1, 0x0

    const v2, 0x3f59999a    # 0.85f

    aput v2, v0, v1

    .line 235
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->J:[F

    const/4 v1, 0x1

    const v2, 0x3f59999a    # 0.85f

    aput v2, v0, v1

    .line 236
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->J:[F

    const/4 v1, 0x2

    const/high16 v2, 0x3f800000    # 1.0f

    aput v2, v0, v1

    .line 238
    :cond_0
    iget v0, p0, Lcom/saterskog/cell_lab/q;->z:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 239
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->J:[F

    const/4 v1, 0x0

    const v2, 0x3f3ae148    # 0.73f

    aput v2, v0, v1

    .line 240
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->J:[F

    const/4 v1, 0x1

    const v2, 0x3f333333    # 0.7f

    aput v2, v0, v1

    .line 241
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->J:[F

    const/4 v1, 0x2

    const v2, 0x3f733333    # 0.95f

    aput v2, v0, v1

    .line 243
    :cond_1
    iget v0, p0, Lcom/saterskog/cell_lab/q;->z:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    .line 244
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->J:[F

    const/4 v1, 0x0

    const v2, 0x3f666666    # 0.9f

    aput v2, v0, v1

    .line 245
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->J:[F

    const/4 v1, 0x1

    const/high16 v2, 0x3f400000    # 0.75f

    aput v2, v0, v1

    .line 246
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->J:[F

    const/4 v1, 0x2

    const v2, 0x3f266666    # 0.65f

    aput v2, v0, v1

    .line 248
    :cond_2
    iget v0, p0, Lcom/saterskog/cell_lab/q;->z:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_3

    .line 249
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->J:[F

    const/4 v1, 0x0

    const v2, 0x3f59999a    # 0.85f

    aput v2, v0, v1

    .line 250
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->J:[F

    const/4 v1, 0x1

    const/high16 v2, 0x3f800000    # 1.0f

    aput v2, v0, v1

    .line 251
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->J:[F

    const/4 v1, 0x2

    const v2, 0x3f59999a    # 0.85f

    aput v2, v0, v1

    .line 253
    :cond_3
    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x3

    if-ge v0, v1, :cond_4

    .line 254
    iget-object v1, p0, Lcom/saterskog/cell_lab/q;->D:[F

    aget v2, v1, v0

    float-to-double v2, v2

    iget-object v4, p0, Lcom/saterskog/cell_lab/q;->J:[F

    aget v4, v4, v0

    iget-object v5, p0, Lcom/saterskog/cell_lab/q;->D:[F

    aget v5, v5, v0

    sub-float/2addr v4, v5

    float-to-double v4, v4

    const-wide v6, 0x3fb999999999999aL    # 0.1

    mul-double/2addr v4, v6

    add-double/2addr v2, v4

    double-to-float v2, v2

    aput v2, v1, v0

    .line 253
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 257
    :cond_4
    iget v0, p0, Lcom/saterskog/cell_lab/q;->S:F

    const v1, 0x3c23d70a    # 0.01f

    mul-float/2addr v0, v1

    iget v1, p0, Lcom/saterskog/cell_lab/q;->T:F

    const v2, 0x3c23d70a    # 0.01f

    mul-float/2addr v1, v2

    invoke-virtual {p0, v0, v1}, Lcom/saterskog/cell_lab/q;->a(FF)V

    .line 258
    iget v0, p0, Lcom/saterskog/cell_lab/q;->S:F

    float-to-double v0, v0

    const-wide v2, 0x3fed70a3d70a3d71L    # 0.92

    mul-double/2addr v0, v2

    double-to-float v0, v0

    iput v0, p0, Lcom/saterskog/cell_lab/q;->S:F

    .line 259
    iget v0, p0, Lcom/saterskog/cell_lab/q;->T:F

    float-to-double v0, v0

    const-wide v2, 0x3fed70a3d70a3d71L    # 0.92

    mul-double/2addr v0, v2

    double-to-float v0, v0

    iput v0, p0, Lcom/saterskog/cell_lab/q;->T:F

    .line 260
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->D:[F

    const/4 v1, 0x0

    aget v0, v0, v1

    iget-object v1, p0, Lcom/saterskog/cell_lab/q;->D:[F

    const/4 v2, 0x1

    aget v1, v1, v2

    iget-object v2, p0, Lcom/saterskog/cell_lab/q;->D:[F

    const/4 v3, 0x2

    aget v2, v2, v3

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v0, v1, v2, v3}, Landroid/opengl/GLES20;->glClearColor(FFFF)V

    .line 264
    const/4 v0, 0x1

    invoke-static {v0}, Landroid/opengl/GLES20;->glDepthMask(Z)V

    .line 271
    const/16 v0, 0x4100

    invoke-static {v0}, Landroid/opengl/GLES20;->glClear(I)V

    .line 272
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/saterskog/cell_lab/q;->av:Z

    .line 273
    iget v0, p0, Lcom/saterskog/cell_lab/q;->z:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_5

    iget v0, p0, Lcom/saterskog/cell_lab/q;->z:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_8

    .line 274
    :cond_5
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->E:Ljava/util/concurrent/Future;

    if-eqz v0, :cond_6

    .line 276
    :try_start_0
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->E:Ljava/util/concurrent/Future;

    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1

    .line 287
    :cond_6
    :goto_1
    iget v0, p0, Lcom/saterskog/cell_lab/q;->z:I

    if-eqz v0, :cond_c

    iget v0, p0, Lcom/saterskog/cell_lab/q;->z:I

    const/4 v1, 0x2

    if-eq v0, v1, :cond_7

    .line 290
    :cond_7
    iget v0, p0, Lcom/saterskog/cell_lab/q;->f:F

    iget v1, p0, Lcom/saterskog/cell_lab/q;->g:F

    invoke-static {v0, v1}, Ljava/lang/Math;->max(FF)F

    move-result v0

    const v1, 0x3dcccccd    # 0.1f

    mul-float/2addr v0, v1

    .line 291
    :goto_2
    iget v1, p0, Lcom/saterskog/cell_lab/q;->f:F

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    add-float/2addr v1, v0

    .line 292
    iget v2, p0, Lcom/saterskog/cell_lab/q;->g:F

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    add-float/2addr v0, v2

    .line 293
    iget-object v2, p0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    iget v3, p0, Lcom/saterskog/cell_lab/q;->b:F

    sub-float/2addr v3, v1

    iget v4, p0, Lcom/saterskog/cell_lab/q;->b:F

    add-float/2addr v1, v4

    iget v4, p0, Lcom/saterskog/cell_lab/q;->c:F

    sub-float/2addr v4, v0

    iget v5, p0, Lcom/saterskog/cell_lab/q;->c:F

    add-float/2addr v0, v5

    invoke-virtual {v2, v3, v1, v4, v0}, Lcom/saterskog/cell_lab/CellWorld;->a(FFFF)V

    .line 296
    :cond_8
    iget v0, p0, Lcom/saterskog/cell_lab/q;->z:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_9

    iget v0, p0, Lcom/saterskog/cell_lab/q;->z:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_a

    :cond_9
    iget-boolean v0, p0, Lcom/saterskog/cell_lab/q;->av:Z

    if-nez v0, :cond_a

    .line 297
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->F:Ljava/util/concurrent/Future;

    if-eqz v0, :cond_a

    .line 300
    :try_start_1
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->F:Ljava/util/concurrent/Future;

    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_7

    .line 307
    :cond_a
    :goto_3
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->F:Ljava/util/concurrent/Future;

    if-eqz v0, :cond_b

    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->F:Ljava/util/concurrent/Future;

    invoke-interface {v0}, Ljava/util/concurrent/Future;->isDone()Z

    move-result v0

    if-eqz v0, :cond_3c

    .line 308
    :cond_b
    iget v0, p0, Lcom/saterskog/cell_lab/q;->O:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_e

    .line 310
    iget v0, p0, Lcom/saterskog/cell_lab/q;->O:I

    iput v0, p0, Lcom/saterskog/cell_lab/q;->z:I

    .line 311
    const/4 v0, 0x0

    :goto_4
    const/16 v1, 0x14

    if-ge v0, v1, :cond_d

    .line 312
    iget-object v1, p0, Lcom/saterskog/cell_lab/q;->Z:[Z

    const/4 v2, 0x0

    aput-boolean v2, v1, v0

    .line 311
    add-int/lit8 v0, v0, 0x1

    goto :goto_4

    .line 279
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/InterruptedException;->printStackTrace()V

    goto :goto_1

    .line 282
    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/util/concurrent/ExecutionException;->printStackTrace()V

    goto :goto_1

    .line 288
    :cond_c
    const/4 v0, 0x0

    goto :goto_2

    .line 303
    :catch_2
    move-exception v0

    :goto_5
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_3

    .line 313
    :cond_d
    const/4 v0, 0x0

    iput v0, p0, Lcom/saterskog/cell_lab/q;->aa:I

    .line 314
    const/4 v0, 0x0

    iput v0, p0, Lcom/saterskog/cell_lab/q;->ab:I

    .line 315
    const/4 v0, -0x1

    iput v0, p0, Lcom/saterskog/cell_lab/q;->O:I

    .line 321
    :cond_e
    iget v0, p0, Lcom/saterskog/cell_lab/q;->z:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_10

    iget v0, p0, Lcom/saterskog/cell_lab/q;->z:I

    const/4 v1, 0x3

    if-eq v0, v1, :cond_10

    .line 323
    iget v0, p0, Lcom/saterskog/cell_lab/q;->z:I

    if-eqz v0, :cond_11

    iget v0, p0, Lcom/saterskog/cell_lab/q;->z:I

    const/4 v1, 0x2

    if-eq v0, v1, :cond_f

    .line 326
    :cond_f
    iget v0, p0, Lcom/saterskog/cell_lab/q;->f:F

    iget v1, p0, Lcom/saterskog/cell_lab/q;->g:F

    invoke-static {v0, v1}, Ljava/lang/Math;->max(FF)F

    move-result v0

    const v1, 0x3dcccccd    # 0.1f

    mul-float/2addr v0, v1

    .line 327
    :goto_6
    iget v1, p0, Lcom/saterskog/cell_lab/q;->f:F

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    add-float/2addr v1, v0

    .line 328
    iget v2, p0, Lcom/saterskog/cell_lab/q;->g:F

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    add-float/2addr v0, v2

    .line 329
    iget-object v2, p0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    iget v3, p0, Lcom/saterskog/cell_lab/q;->b:F

    sub-float/2addr v3, v1

    iget v4, p0, Lcom/saterskog/cell_lab/q;->b:F

    add-float/2addr v1, v4

    iget v4, p0, Lcom/saterskog/cell_lab/q;->c:F

    sub-float/2addr v4, v0

    iget v5, p0, Lcom/saterskog/cell_lab/q;->c:F

    add-float/2addr v0, v5

    invoke-virtual {v2, v3, v1, v4, v0}, Lcom/saterskog/cell_lab/CellWorld;->a(FFFF)V

    .line 2432
    :cond_10
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    .line 3034
    iget v0, v0, Lcom/saterskog/cell_lab/CellWorld;->X:I

    .line 2432
    if-nez v0, :cond_3a

    .line 2438
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->N:Ljava/io/OutputStream;

    if-eqz v0, :cond_14

    .line 2441
    :try_start_2
    iget-object v1, p0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->N:Ljava/io/OutputStream;

    .line 3427
    new-instance v2, Ljava/io/ObjectOutputStream;

    invoke-direct {v2, v0}, Ljava/io/ObjectOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 3428
    const/16 v3, 0xbee

    invoke-virtual {v2, v3}, Ljava/io/ObjectOutputStream;->writeInt(I)V

    .line 3429
    iget-wide v4, v1, Lcom/saterskog/cell_lab/CellWorld;->M:D

    invoke-virtual {v2, v4, v5}, Ljava/io/ObjectOutputStream;->writeDouble(D)V

    .line 3430
    iget v3, v1, Lcom/saterskog/cell_lab/CellWorld;->z:I

    invoke-virtual {v2, v3}, Ljava/io/ObjectOutputStream;->writeInt(I)V

    .line 3431
    iget-object v3, v1, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    invoke-virtual {v3, v2}, Lcom/saterskog/cell_lab/Environment;->a(Ljava/io/ObjectOutputStream;)V

    .line 3432
    invoke-virtual {v2}, Ljava/io/ObjectOutputStream;->flush()V

    .line 3433
    new-instance v2, Ljava/util/zip/GZIPOutputStream;

    invoke-direct {v2, v0}, Ljava/util/zip/GZIPOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 3434
    new-instance v3, Ljava/io/ObjectOutputStream;

    invoke-direct {v3, v2}, Ljava/io/ObjectOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 3435
    iget-wide v4, v1, Lcom/saterskog/cell_lab/CellWorld;->O:D

    invoke-virtual {v3, v4, v5}, Ljava/io/ObjectOutputStream;->writeDouble(D)V

    .line 3437
    const/4 v0, 0x0

    :goto_7
    iget v4, v1, Lcom/saterskog/cell_lab/CellWorld;->z:I

    if-ge v0, v4, :cond_12

    .line 3438
    iget-object v4, v1, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    aget-object v4, v4, v0

    invoke-virtual {v4, v3}, Lcom/saterskog/cell_lab/Cell;->a(Ljava/io/ObjectOutputStream;)V

    .line 3437
    add-int/lit8 v0, v0, 0x1

    goto :goto_7

    .line 324
    :cond_11
    const/4 v0, 0x0

    goto :goto_6

    .line 3439
    :cond_12
    iget v0, v1, Lcom/saterskog/cell_lab/CellWorld;->B:I

    invoke-virtual {v3, v0}, Ljava/io/ObjectOutputStream;->writeInt(I)V

    .line 3440
    const/4 v0, 0x0

    :goto_8
    iget v4, v1, Lcom/saterskog/cell_lab/CellWorld;->B:I

    if-ge v0, v4, :cond_13

    .line 3441
    iget-object v4, v1, Lcom/saterskog/cell_lab/CellWorld;->A:[Lcom/saterskog/cell_lab/Food;

    aget-object v4, v4, v0

    .line 4091
    iget v5, v4, Lcom/saterskog/cell_lab/Food;->a:F

    invoke-virtual {v3, v5}, Ljava/io/ObjectOutputStream;->writeFloat(F)V

    .line 4092
    iget v5, v4, Lcom/saterskog/cell_lab/Food;->b:F

    invoke-virtual {v3, v5}, Ljava/io/ObjectOutputStream;->writeFloat(F)V

    .line 4093
    iget v5, v4, Lcom/saterskog/cell_lab/Food;->c:F

    invoke-virtual {v3, v5}, Ljava/io/ObjectOutputStream;->writeFloat(F)V

    .line 4094
    iget v5, v4, Lcom/saterskog/cell_lab/Food;->d:F

    invoke-virtual {v3, v5}, Ljava/io/ObjectOutputStream;->writeFloat(F)V

    .line 4095
    iget v5, v4, Lcom/saterskog/cell_lab/Food;->e:F

    invoke-virtual {v3, v5}, Ljava/io/ObjectOutputStream;->writeFloat(F)V

    .line 4096
    iget v4, v4, Lcom/saterskog/cell_lab/Food;->f:F

    invoke-virtual {v3, v4}, Ljava/io/ObjectOutputStream;->writeFloat(F)V

    .line 3440
    add-int/lit8 v0, v0, 0x1

    goto :goto_8

    .line 3442
    :cond_13
    invoke-virtual {v3}, Ljava/io/ObjectOutputStream;->flush()V

    .line 3443
    invoke-virtual {v3}, Ljava/io/ObjectOutputStream;->close()V

    .line 3444
    invoke-virtual {v2}, Ljava/util/zip/GZIPOutputStream;->close()V

    .line 2442
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->ap:Lcom/saterskog/cell_lab/p$a;

    const/4 v1, 0x7

    invoke-interface {v0, v1}, Lcom/saterskog/cell_lab/p$a;->a(S)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_3

    .line 2448
    :goto_9
    :try_start_3
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->N:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_4

    .line 2453
    :goto_a
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/saterskog/cell_lab/q;->N:Ljava/io/OutputStream;

    .line 2455
    :cond_14
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->as:Ljava/io/InputStream;

    if-eqz v0, :cond_17

    .line 2457
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->D:[F

    const/4 v1, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    aput v2, v0, v1

    .line 2458
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->D:[F

    const/4 v1, 0x1

    const/high16 v2, 0x3f800000    # 1.0f

    aput v2, v0, v1

    .line 2459
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->D:[F

    const/4 v1, 0x2

    const/high16 v2, 0x3f800000    # 1.0f

    aput v2, v0, v1

    .line 2461
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    invoke-virtual {v0}, Lcom/saterskog/cell_lab/CellWorld;->a()V

    .line 2464
    :try_start_4
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    iget-object v1, p0, Lcom/saterskog/cell_lab/q;->as:Ljava/io/InputStream;

    invoke-virtual {v0, v1}, Lcom/saterskog/cell_lab/CellWorld;->a(Ljava/io/InputStream;)I

    .line 2465
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->as:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_5

    .line 2470
    :goto_b
    iget v0, p0, Lcom/saterskog/cell_lab/q;->at:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_15

    .line 2471
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    iget v1, p0, Lcom/saterskog/cell_lab/q;->at:I

    invoke-virtual {v0, v1}, Lcom/saterskog/cell_lab/CellWorld;->c(I)V

    .line 2472
    :cond_15
    iget v0, p0, Lcom/saterskog/cell_lab/q;->B:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_16

    .line 2473
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    const-wide/16 v2, 0x0

    iput-wide v2, v0, Lcom/saterskog/cell_lab/CellWorld;->M:D

    .line 2475
    :cond_16
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/saterskog/cell_lab/q;->as:Ljava/io/InputStream;

    .line 2476
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/saterskog/cell_lab/CellWorld;->L:Z

    .line 2478
    :cond_17
    iget-boolean v0, p0, Lcom/saterskog/cell_lab/q;->P:Z

    if-eqz v0, :cond_18

    .line 2480
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->ap:Lcom/saterskog/cell_lab/p$a;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/saterskog/cell_lab/p$a;->a(S)V

    .line 2481
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    invoke-virtual {v0}, Lcom/saterskog/cell_lab/CellWorld;->a()V

    .line 2482
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/saterskog/cell_lab/q;->P:Z

    .line 2483
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/saterskog/cell_lab/CellWorld;->L:Z

    .line 2489
    :cond_18
    iget-boolean v0, p0, Lcom/saterskog/cell_lab/q;->aq:Z

    if-eqz v0, :cond_1a

    iget v0, p0, Lcom/saterskog/cell_lab/q;->A:I

    const/4 v1, 0x2

    if-eq v0, v1, :cond_19

    iget v0, p0, Lcom/saterskog/cell_lab/q;->A:I

    const/4 v1, 0x3

    if-eq v0, v1, :cond_19

    iget v0, p0, Lcom/saterskog/cell_lab/q;->A:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1a

    .line 2490
    :cond_19
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    invoke-virtual {v0}, Lcom/saterskog/cell_lab/CellWorld;->b()V

    .line 2491
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->ap:Lcom/saterskog/cell_lab/p$a;

    const/4 v1, 0x2

    invoke-interface {v0, v1}, Lcom/saterskog/cell_lab/p$a;->a(S)V

    .line 2492
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/saterskog/cell_lab/q;->aq:Z

    .line 2495
    :cond_1a
    iget-boolean v0, p0, Lcom/saterskog/cell_lab/q;->u:Z

    if-eqz v0, :cond_20

    .line 2496
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    iget-wide v2, p0, Lcom/saterskog/cell_lab/q;->v:D

    iget-wide v4, p0, Lcom/saterskog/cell_lab/q;->w:D

    invoke-virtual {v0, v2, v3, v4, v5}, Lcom/saterskog/cell_lab/CellWorld;->a(DD)I

    move-result v1

    .line 2497
    const/4 v0, -0x1

    if-ne v1, v0, :cond_2c

    .line 2498
    iget-boolean v0, p0, Lcom/saterskog/cell_lab/q;->aq:Z

    if-nez v0, :cond_2b

    .line 2500
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v0, v0, Lcom/saterskog/cell_lab/Environment;->k:D

    iget-object v2, p0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    iget-object v2, v2, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-wide v2, v2, Lcom/saterskog/cell_lab/Environment;->k:D

    mul-double/2addr v0, v2

    iget-wide v2, p0, Lcom/saterskog/cell_lab/q;->v:D

    iget-wide v4, p0, Lcom/saterskog/cell_lab/q;->v:D

    mul-double/2addr v2, v4

    iget-wide v4, p0, Lcom/saterskog/cell_lab/q;->w:D

    iget-wide v6, p0, Lcom/saterskog/cell_lab/q;->w:D

    mul-double/2addr v4, v6

    add-double/2addr v2, v4

    cmpl-double v0, v0, v2

    if-lez v0, :cond_1c

    .line 2501
    iget v0, p0, Lcom/saterskog/cell_lab/q;->A:I

    if-nez v0, :cond_1c

    .line 2502
    iget v0, p0, Lcom/saterskog/cell_lab/q;->B:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_2a

    .line 2503
    const/4 v1, 0x1

    .line 2505
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->aw:Landroid/app/Activity;

    invoke-static {v0}, Lcom/saterskog/cell_lab/j;->a(Landroid/content/Context;)Ljava/util/ArrayList;

    move-result-object v0

    iget v2, p0, Lcom/saterskog/cell_lab/q;->B:I

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/saterskog/cell_lab/j$a;

    iget v2, v0, Lcom/saterskog/cell_lab/j$a;->q:I

    .line 2506
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    iget v0, v0, Lcom/saterskog/cell_lab/CellWorld;->V:I

    if-lt v0, v2, :cond_4a

    .line 2507
    const/4 v0, 0x0

    .line 2508
    iget-object v1, p0, Lcom/saterskog/cell_lab/q;->D:[F

    const/4 v3, 0x0

    const/high16 v4, 0x3f800000    # 1.0f

    aput v4, v1, v3

    .line 2509
    iget-object v1, p0, Lcom/saterskog/cell_lab/q;->D:[F

    const/4 v3, 0x1

    const v4, 0x3e99999a    # 0.3f

    aput v4, v1, v3

    .line 2510
    iget-object v1, p0, Lcom/saterskog/cell_lab/q;->D:[F

    const/4 v3, 0x2

    const v4, 0x3e99999a    # 0.3f

    aput v4, v1, v3

    .line 2511
    iget-object v1, p0, Lcom/saterskog/cell_lab/q;->aw:Landroid/app/Activity;

    new-instance v3, Lcom/saterskog/cell_lab/q$4;

    invoke-direct {v3, p0, v2}, Lcom/saterskog/cell_lab/q$4;-><init>(Lcom/saterskog/cell_lab/q;I)V

    invoke-virtual {v1, v3}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 2523
    :goto_c
    iget v1, p0, Lcom/saterskog/cell_lab/q;->B:I

    iget-object v2, p0, Lcom/saterskog/cell_lab/q;->ap:Lcom/saterskog/cell_lab/p$a;

    invoke-interface {v2}, Lcom/saterskog/cell_lab/p$a;->f()[Lcom/saterskog/cell_lab/Gene;

    move-result-object v2

    iget-object v3, p0, Lcom/saterskog/cell_lab/q;->aw:Landroid/app/Activity;

    invoke-static {v1, v2, v3}, Lcom/saterskog/cell_lab/j;->a(I[Lcom/saterskog/cell_lab/Gene;Landroid/content/Context;)Z

    move-result v1

    if-nez v1, :cond_1b

    .line 2524
    const/4 v0, 0x0

    .line 2525
    iget-object v1, p0, Lcom/saterskog/cell_lab/q;->aw:Landroid/app/Activity;

    new-instance v2, Lcom/saterskog/cell_lab/q$5;

    invoke-direct {v2, p0}, Lcom/saterskog/cell_lab/q$5;-><init>(Lcom/saterskog/cell_lab/q;)V

    invoke-virtual {v1, v2}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 2536
    :cond_1b
    if-eqz v0, :cond_29

    .line 2537
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->ap:Lcom/saterskog/cell_lab/p$a;

    const/4 v1, 0x3

    invoke-interface {v0, v1}, Lcom/saterskog/cell_lab/p$a;->a(S)V

    .line 2538
    iget-wide v0, p0, Lcom/saterskog/cell_lab/q;->v:D

    iget-wide v2, p0, Lcom/saterskog/cell_lab/q;->w:D

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/saterskog/cell_lab/q;->a(DD)V

    .line 2539
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    iget v1, v0, Lcom/saterskog/cell_lab/CellWorld;->V:I

    add-int/lit8 v1, v1, 0x1

    iput v1, v0, Lcom/saterskog/cell_lab/CellWorld;->V:I

    .line 2540
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->aw:Landroid/app/Activity;

    const/4 v1, 0x0

    const/4 v2, 0x3

    const/16 v3, 0x5dc

    invoke-static {v0, v1, v2, v3}, Lcom/saterskog/cell_lab/t;->a(Landroid/app/Activity;III)V

    .line 2541
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->aw:Landroid/app/Activity;

    const/4 v1, 0x1

    const/16 v2, 0x9

    const/16 v3, 0x5dc

    invoke-static {v0, v1, v2, v3}, Lcom/saterskog/cell_lab/t;->a(Landroid/app/Activity;III)V

    .line 2542
    iget v0, p0, Lcom/saterskog/cell_lab/q;->z:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1c

    .line 2543
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->aw:Landroid/app/Activity;

    const/4 v1, 0x3

    const/4 v2, 0x3

    const/16 v3, 0x5dc

    invoke-static {v0, v1, v2, v3}, Lcom/saterskog/cell_lab/t;->a(Landroid/app/Activity;III)V

    .line 2568
    :cond_1c
    :goto_d
    iget v0, p0, Lcom/saterskog/cell_lab/q;->A:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1d

    .line 2569
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->ap:Lcom/saterskog/cell_lab/p$a;

    const/4 v1, 0x3

    invoke-interface {v0, v1}, Lcom/saterskog/cell_lab/p$a;->a(S)V

    .line 2570
    iget-object v1, p0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    iget-wide v2, p0, Lcom/saterskog/cell_lab/q;->v:D

    iget-wide v4, p0, Lcom/saterskog/cell_lab/q;->w:D

    const-wide v6, 0x3ff26e978d4fdf3bL    # 1.152

    const/4 v8, 0x0

    invoke-virtual/range {v1 .. v8}, Lcom/saterskog/cell_lab/CellWorld;->a(DDDF)V

    .line 2572
    :cond_1d
    iget v0, p0, Lcom/saterskog/cell_lab/q;->A:I

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1e

    iget v0, p0, Lcom/saterskog/cell_lab/q;->A:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_1f

    .line 2573
    :cond_1e
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->ap:Lcom/saterskog/cell_lab/p$a;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/saterskog/cell_lab/p$a;->a(S)V

    .line 2639
    :cond_1f
    :goto_e
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/saterskog/cell_lab/q;->u:Z

    .line 2641
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/saterskog/cell_lab/CellWorld;->L:Z

    .line 2644
    :cond_20
    invoke-direct {p0}, Lcom/saterskog/cell_lab/q;->d()V

    .line 2645
    iget-boolean v0, p0, Lcom/saterskog/cell_lab/q;->t:Z

    if-eqz v0, :cond_21

    .line 2647
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->e:Lcom/saterskog/cell_lab/Environment;

    iget-object v1, p0, Lcom/saterskog/cell_lab/q;->s:Lcom/saterskog/cell_lab/Environment;

    invoke-virtual {v0, v1}, Lcom/saterskog/cell_lab/Environment;->a(Lcom/saterskog/cell_lab/Environment;)V

    .line 2648
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/saterskog/cell_lab/CellWorld;->L:Z

    .line 2649
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/saterskog/cell_lab/q;->t:Z

    .line 2651
    :cond_21
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    iget-boolean v0, v0, Lcom/saterskog/cell_lab/CellWorld;->L:Z

    if-nez v0, :cond_22

    iget v0, p0, Lcom/saterskog/cell_lab/q;->z:I

    if-nez v0, :cond_22

    .line 2652
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    const/4 v1, 0x1

    const-wide/16 v2, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lcom/saterskog/cell_lab/CellWorld;->a(ZD)V

    .line 2656
    :cond_22
    iget v0, p0, Lcom/saterskog/cell_lab/q;->z:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_23

    iget v0, p0, Lcom/saterskog/cell_lab/q;->z:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_25

    :cond_23
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    iget v0, v0, Lcom/saterskog/cell_lab/CellWorld;->H:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_25

    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    iget v0, v0, Lcom/saterskog/cell_lab/CellWorld;->H:F

    const v1, 0x4038f5c3    # 2.89f

    cmpg-float v0, v0, v1

    if-gez v0, :cond_25

    .line 2658
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    iget v0, v0, Lcom/saterskog/cell_lab/CellWorld;->H:F

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    double-to-float v0, v0

    .line 2659
    iget v1, p0, Lcom/saterskog/cell_lab/q;->f:F

    iget v2, p0, Lcom/saterskog/cell_lab/q;->g:F

    invoke-static {v1, v2}, Ljava/lang/Math;->max(FF)F

    move-result v1

    .line 2660
    const/high16 v2, 0x3f800000    # 1.0f

    const v3, 0x3dae147b    # 0.085f

    div-float/2addr v3, v1

    const v4, 0x3d4ccccd    # 0.05f

    sub-float/2addr v3, v4

    invoke-static {v2, v3}, Ljava/lang/Math;->min(FF)F

    move-result v2

    .line 2661
    const/4 v3, 0x0

    cmpl-float v3, v2, v3

    if-lez v3, :cond_24

    .line 2662
    const/high16 v3, 0x3fc00000    # 1.5f

    const/high16 v4, 0x40400000    # 3.0f

    mul-float/2addr v0, v4

    div-float/2addr v0, v1

    sub-float v0, v3, v0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    move-result v0

    mul-float/2addr v0, v2

    .line 2664
    const v1, 0x3b449ba6    # 0.003f

    cmpl-float v1, v0, v1

    if-lez v1, :cond_24

    .line 2665
    iget-object v1, p0, Lcom/saterskog/cell_lab/q;->ap:Lcom/saterskog/cell_lab/p$a;

    invoke-interface {v1, v0}, Lcom/saterskog/cell_lab/p$a;->a(F)V

    .line 2667
    :cond_24
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    const/high16 v1, -0x40800000    # -1.0f

    iput v1, v0, Lcom/saterskog/cell_lab/CellWorld;->H:F

    .line 2679
    :cond_25
    iget v0, p0, Lcom/saterskog/cell_lab/q;->B:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_27

    iget v0, p0, Lcom/saterskog/cell_lab/q;->B:I

    iget-object v1, p0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    invoke-static {v0, v1}, Lcom/saterskog/cell_lab/j;->a(ILcom/saterskog/cell_lab/CellWorld;)Z

    move-result v0

    if-eqz v0, :cond_27

    iget-boolean v0, p0, Lcom/saterskog/cell_lab/q;->M:Z

    if-nez v0, :cond_27

    .line 2680
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/saterskog/cell_lab/q;->M:Z

    .line 2681
    iget v0, p0, Lcom/saterskog/cell_lab/q;->B:I

    iget-object v1, p0, Lcom/saterskog/cell_lab/q;->aw:Landroid/app/Activity;

    invoke-static {v0, v1}, Lcom/saterskog/cell_lab/j;->b(ILandroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_35

    const/4 v0, 0x1

    move v1, v0

    .line 2682
    :goto_f
    if-eqz v1, :cond_26

    .line 2683
    iget v0, p0, Lcom/saterskog/cell_lab/q;->B:I

    iget-object v2, p0, Lcom/saterskog/cell_lab/q;->aw:Landroid/app/Activity;

    invoke-static {v0, v2}, Lcom/saterskog/cell_lab/j;->c(ILandroid/content/Context;)V

    .line 2684
    :cond_26
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->D:[F

    const/4 v2, 0x0

    const v3, 0x3e99999a    # 0.3f

    aput v3, v0, v2

    .line 2685
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->D:[F

    const/4 v2, 0x1

    const/high16 v3, 0x3f800000    # 1.0f

    aput v3, v0, v2

    .line 2686
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->D:[F

    const/4 v2, 0x2

    const v3, 0x3e99999a    # 0.3f

    aput v3, v0, v2

    .line 2687
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->aw:Landroid/app/Activity;

    check-cast v0, Lcom/saterskog/cell_lab/PlayActivity;

    .line 2688
    iget-object v2, p0, Lcom/saterskog/cell_lab/q;->aw:Landroid/app/Activity;

    new-instance v3, Lcom/saterskog/cell_lab/q$7;

    invoke-direct {v3, p0, v1, v0}, Lcom/saterskog/cell_lab/q$7;-><init>(Lcom/saterskog/cell_lab/q;ZLcom/saterskog/cell_lab/PlayActivity;)V

    invoke-virtual {v2, v3}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 2701
    :cond_27
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->ap:Lcom/saterskog/cell_lab/p$a;

    iget-object v1, p0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    iget-boolean v2, p0, Lcom/saterskog/cell_lab/q;->M:Z

    invoke-interface {v0, v1, v2}, Lcom/saterskog/cell_lab/p$a;->a(Lcom/saterskog/cell_lab/CellWorld;Z)V

    .line 2702
    iget-boolean v0, p0, Lcom/saterskog/cell_lab/q;->aq:Z

    if-eqz v0, :cond_3f

    .line 2703
    const-wide/16 v6, 0x0

    const-wide/16 v4, 0x0

    const-wide/16 v2, 0x0

    .line 2704
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/saterskog/cell_lab/q;->aq:Z

    .line 2705
    const/4 v0, 0x0

    :goto_10
    iget-object v1, p0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    iget v1, v1, Lcom/saterskog/cell_lab/CellWorld;->z:I

    if-ge v0, v1, :cond_49

    .line 2706
    iget-object v1, p0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    iget-object v1, v1, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    aget-object v1, v1, v0

    iget v1, v1, Lcom/saterskog/cell_lab/Cell;->F:I

    const/4 v8, 0x1

    if-ne v1, v8, :cond_3d

    .line 2707
    iget-object v1, p0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    iget-object v1, v1, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    aget-object v1, v1, v0

    iget-wide v6, v1, Lcom/saterskog/cell_lab/Cell;->b:D

    .line 2708
    iget-object v1, p0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    iget-object v1, v1, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    aget-object v1, v1, v0

    iget-wide v4, v1, Lcom/saterskog/cell_lab/Cell;->c:D

    .line 2709
    iget-object v1, p0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    iget-object v1, v1, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    aget-object v1, v1, v0

    iget-wide v2, v1, Lcom/saterskog/cell_lab/Cell;->d:D

    .line 2710
    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/saterskog/cell_lab/q;->aq:Z

    .line 2712
    iget v1, p0, Lcom/saterskog/cell_lab/q;->A:I

    const/4 v8, 0x4

    if-ne v1, v8, :cond_28

    .line 2714
    iget-object v1, p0, Lcom/saterskog/cell_lab/q;->q:Lcom/saterskog/cell_lab/q$a;

    iget-object v8, p0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    invoke-interface {v1, v8, v0}, Lcom/saterskog/cell_lab/q$a;->a(Lcom/saterskog/cell_lab/CellWorld;I)V

    .line 2724
    :cond_28
    iget-object v9, p0, Lcom/saterskog/cell_lab/q;->R:Ljava/lang/Object;

    monitor-enter v9

    .line 2726
    const/4 v1, 0x1

    :try_start_5
    iput-boolean v1, p0, Lcom/saterskog/cell_lab/q;->au:Z

    .line 2727
    const/4 v1, 0x0

    move v8, v1

    :goto_11
    const/16 v1, 0x50

    if-ge v8, v1, :cond_37

    .line 2728
    iget-object v1, p0, Lcom/saterskog/cell_lab/q;->Q:[Lcom/saterskog/cell_lab/Gene;

    aget-object v1, v1, v8

    iget-object v10, p0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    iget-object v10, v10, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    aget-object v10, v10, v0

    iget-object v10, v10, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    aget-object v10, v10, v8

    invoke-virtual {v1, v10}, Lcom/saterskog/cell_lab/Gene;->a(Lcom/saterskog/cell_lab/Gene;)V

    .line 2729
    iget-object v1, p0, Lcom/saterskog/cell_lab/q;->Q:[Lcom/saterskog/cell_lab/Gene;

    aget-object v10, v1, v8

    iget-object v1, p0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    iget-object v1, v1, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    aget-object v1, v1, v0

    iget v1, v1, Lcom/saterskog/cell_lab/Cell;->D:I

    if-ne v1, v8, :cond_36

    const/4 v1, 0x1

    :goto_12
    iput-boolean v1, v10, Lcom/saterskog/cell_lab/Gene;->p:Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 2727
    add-int/lit8 v1, v8, 0x1

    move v8, v1

    goto :goto_11

    .line 2445
    :catch_3
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    goto/16 :goto_9

    .line 2451
    :catch_4
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    goto/16 :goto_a

    .line 2468
    :catch_5
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    goto/16 :goto_b

    .line 2548
    :cond_29
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->ap:Lcom/saterskog/cell_lab/p$a;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/saterskog/cell_lab/p$a;->a(S)V

    goto/16 :goto_d

    .line 2552
    :cond_2a
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->ap:Lcom/saterskog/cell_lab/p$a;

    const/4 v1, 0x3

    invoke-interface {v0, v1}, Lcom/saterskog/cell_lab/p$a;->a(S)V

    .line 2553
    iget-wide v0, p0, Lcom/saterskog/cell_lab/q;->v:D

    iget-wide v2, p0, Lcom/saterskog/cell_lab/q;->w:D

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/saterskog/cell_lab/q;->a(DD)V

    .line 2554
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    iget v1, v0, Lcom/saterskog/cell_lab/CellWorld;->V:I

    add-int/lit8 v1, v1, 0x1

    iput v1, v0, Lcom/saterskog/cell_lab/CellWorld;->V:I

    goto/16 :goto_d

    .line 2560
    :cond_2b
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->ap:Lcom/saterskog/cell_lab/p$a;

    const/4 v1, 0x2

    invoke-interface {v0, v1}, Lcom/saterskog/cell_lab/p$a;->a(S)V

    .line 2561
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/saterskog/cell_lab/q;->aq:Z

    .line 2562
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    invoke-virtual {v0}, Lcom/saterskog/cell_lab/CellWorld;->b()V

    .line 2563
    iget-object v1, p0, Lcom/saterskog/cell_lab/q;->R:Ljava/lang/Object;

    monitor-enter v1

    .line 2565
    const/4 v0, 0x0

    :try_start_6
    iput-boolean v0, p0, Lcom/saterskog/cell_lab/q;->au:Z

    .line 2566
    monitor-exit v1

    goto/16 :goto_d

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    throw v0

    .line 2576
    :cond_2c
    iget v0, p0, Lcom/saterskog/cell_lab/q;->A:I

    const/4 v2, 0x4

    if-eq v0, v2, :cond_2d

    iget v0, p0, Lcom/saterskog/cell_lab/q;->A:I

    if-nez v0, :cond_2e

    .line 2577
    :cond_2d
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/saterskog/cell_lab/q;->aq:Z

    .line 2578
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    aget-object v0, v0, v1

    iget v0, v0, Lcom/saterskog/cell_lab/Cell;->F:I

    const/4 v2, 0x1

    if-eq v0, v2, :cond_33

    .line 2579
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->ap:Lcom/saterskog/cell_lab/p$a;

    const/16 v2, 0x8

    invoke-interface {v0, v2}, Lcom/saterskog/cell_lab/p$a;->a(S)V

    .line 2580
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/saterskog/cell_lab/q;->aq:Z

    .line 2581
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    invoke-virtual {v0}, Lcom/saterskog/cell_lab/CellWorld;->b()V

    .line 2582
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    aget-object v0, v0, v1

    const/4 v2, 0x1

    iput v2, v0, Lcom/saterskog/cell_lab/Cell;->F:I

    .line 2596
    :goto_13
    iget v0, p0, Lcom/saterskog/cell_lab/q;->b:F

    float-to-double v2, v0

    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    aget-object v0, v0, v1

    iget-wide v4, v0, Lcom/saterskog/cell_lab/Cell;->b:D

    sub-double/2addr v2, v4

    iput-wide v2, p0, Lcom/saterskog/cell_lab/q;->x:D

    .line 2597
    iget v0, p0, Lcom/saterskog/cell_lab/q;->c:F

    float-to-double v2, v0

    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    aget-object v0, v0, v1

    iget-wide v4, v0, Lcom/saterskog/cell_lab/Cell;->c:D

    sub-double/2addr v2, v4

    iput-wide v2, p0, Lcom/saterskog/cell_lab/q;->y:D

    .line 2598
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->aw:Landroid/app/Activity;

    new-instance v2, Lcom/saterskog/cell_lab/q$6;

    invoke-direct {v2, p0}, Lcom/saterskog/cell_lab/q$6;-><init>(Lcom/saterskog/cell_lab/q;)V

    invoke-virtual {v0, v2}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 2609
    :cond_2e
    iget v0, p0, Lcom/saterskog/cell_lab/q;->A:I

    const/4 v2, 0x2

    if-ne v0, v2, :cond_30

    .line 2610
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    aget-object v0, v0, v1

    const-wide v2, 0x3fd70a3d70a3d70aL    # 0.36

    iput-wide v2, v0, Lcom/saterskog/cell_lab/Cell;->w:D

    .line 2611
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    aget-object v0, v0, v1

    iget-object v0, v0, Lcom/saterskog/cell_lab/Cell;->J:[F

    const/4 v2, 0x0

    const/high16 v3, 0x3f800000    # 1.0f

    aput v3, v0, v2

    .line 2612
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    aget-object v0, v0, v1

    iget-object v0, v0, Lcom/saterskog/cell_lab/Cell;->J:[F

    const/4 v2, 0x1

    const/4 v3, 0x0

    aput v3, v0, v2

    .line 2613
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    aget-object v0, v0, v1

    iget-object v0, v0, Lcom/saterskog/cell_lab/Cell;->J:[F

    const/4 v2, 0x2

    const/high16 v3, 0x3f800000    # 1.0f

    aput v3, v0, v2

    .line 2614
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    aget-object v0, v0, v1

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    iput-wide v2, v0, Lcom/saterskog/cell_lab/Cell;->p:D

    .line 2615
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    aget-object v0, v0, v1

    const-wide/16 v2, 0x0

    iput-wide v2, v0, Lcom/saterskog/cell_lab/Cell;->o:D

    .line 2616
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    aget-object v0, v0, v1

    iget-object v0, v0, Lcom/saterskog/cell_lab/Cell;->I:[Lcom/saterskog/cell_lab/Gene;

    iget-object v2, p0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    iget-object v2, v2, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    aget-object v2, v2, v1

    iget v2, v2, Lcom/saterskog/cell_lab/Cell;->D:I

    aget-object v0, v0, v2

    iget-object v0, v0, Lcom/saterskog/cell_lab/Gene;->s:Lcom/saterskog/cell_lab/h;

    sget-object v2, Lcom/saterskog/cell_lab/h;->e:Lcom/saterskog/cell_lab/h;

    if-ne v0, v2, :cond_2f

    .line 2617
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    aget-object v0, v0, v1

    const v2, 0x3fe66666    # 1.8f

    iput v2, v0, Lcom/saterskog/cell_lab/Cell;->S:F

    .line 2618
    :cond_2f
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->ap:Lcom/saterskog/cell_lab/p$a;

    const/16 v2, 0xa

    invoke-interface {v0, v2}, Lcom/saterskog/cell_lab/p$a;->a(S)V

    .line 2620
    :cond_30
    iget v0, p0, Lcom/saterskog/cell_lab/q;->A:I

    const/4 v2, 0x3

    if-ne v0, v2, :cond_1f

    .line 2623
    const/4 v0, -0x1

    .line 2624
    iget v2, p0, Lcom/saterskog/cell_lab/q;->B:I

    const/4 v3, -0x1

    if-eq v2, v3, :cond_31

    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->aw:Landroid/app/Activity;

    invoke-static {v0}, Lcom/saterskog/cell_lab/j;->a(Landroid/content/Context;)Ljava/util/ArrayList;

    move-result-object v0

    iget v2, p0, Lcom/saterskog/cell_lab/q;->B:I

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/saterskog/cell_lab/j$a;

    iget v0, v0, Lcom/saterskog/cell_lab/j$a;->A:I

    .line 2625
    :cond_31
    iget-object v2, p0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    iget v2, v2, Lcom/saterskog/cell_lab/CellWorld;->W:I

    if-lt v2, v0, :cond_32

    const/4 v2, -0x1

    if-ne v0, v2, :cond_34

    .line 2627
    :cond_32
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/saterskog/cell_lab/CellWorld;->a(IZ)V

    .line 2628
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    iget v1, v0, Lcom/saterskog/cell_lab/CellWorld;->W:I

    add-int/lit8 v1, v1, 0x1

    iput v1, v0, Lcom/saterskog/cell_lab/CellWorld;->W:I

    .line 2629
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->ap:Lcom/saterskog/cell_lab/p$a;

    const/16 v1, 0xa

    invoke-interface {v0, v1}, Lcom/saterskog/cell_lab/p$a;->a(S)V

    goto/16 :goto_e

    .line 2585
    :cond_33
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->ap:Lcom/saterskog/cell_lab/p$a;

    const/4 v2, 0x2

    invoke-interface {v0, v2}, Lcom/saterskog/cell_lab/p$a;->a(S)V

    .line 2586
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/saterskog/cell_lab/q;->aq:Z

    .line 2587
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    invoke-virtual {v0}, Lcom/saterskog/cell_lab/CellWorld;->b()V

    goto/16 :goto_13

    .line 2632
    :cond_34
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->D:[F

    const/4 v1, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    aput v2, v0, v1

    .line 2633
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->D:[F

    const/4 v1, 0x1

    const v2, 0x3e99999a    # 0.3f

    aput v2, v0, v1

    .line 2634
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->D:[F

    const/4 v1, 0x2

    const v2, 0x3e99999a    # 0.3f

    aput v2, v0, v1

    .line 2635
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->ap:Lcom/saterskog/cell_lab/p$a;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/saterskog/cell_lab/p$a;->a(S)V

    goto/16 :goto_e

    .line 2681
    :cond_35
    const/4 v0, 0x0

    move v1, v0

    goto/16 :goto_f

    .line 2729
    :cond_36
    const/4 v1, 0x0

    goto/16 :goto_12

    .line 2731
    :cond_37
    :try_start_7
    monitor-exit v9
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    move-wide v0, v2

    move-wide v2, v4

    move-wide v4, v6

    .line 2736
    :goto_14
    iget-boolean v6, p0, Lcom/saterskog/cell_lab/q;->aq:Z

    if-eqz v6, :cond_3e

    .line 2737
    iget-wide v6, p0, Lcom/saterskog/cell_lab/q;->x:D

    const-wide v8, 0x3fe999999999999aL    # 0.8

    mul-double/2addr v6, v8

    iput-wide v6, p0, Lcom/saterskog/cell_lab/q;->x:D

    .line 2738
    iget-wide v6, p0, Lcom/saterskog/cell_lab/q;->y:D

    const-wide v8, 0x3fe999999999999aL    # 0.8

    mul-double/2addr v6, v8

    iput-wide v6, p0, Lcom/saterskog/cell_lab/q;->y:D

    .line 2739
    iget-wide v6, p0, Lcom/saterskog/cell_lab/q;->x:D

    add-double/2addr v6, v4

    double-to-float v6, v6

    iput v6, p0, Lcom/saterskog/cell_lab/q;->b:F

    .line 2740
    iget-wide v6, p0, Lcom/saterskog/cell_lab/q;->y:D

    add-double/2addr v6, v2

    double-to-float v6, v6

    iput v6, p0, Lcom/saterskog/cell_lab/q;->c:F

    .line 2741
    iget-object v6, p0, Lcom/saterskog/cell_lab/q;->H:[F

    const/4 v7, 0x0

    double-to-float v4, v4

    aput v4, v6, v7

    .line 2742
    iget-object v4, p0, Lcom/saterskog/cell_lab/q;->H:[F

    const/4 v5, 0x1

    double-to-float v2, v2

    aput v2, v4, v5

    .line 2743
    iget-object v2, p0, Lcom/saterskog/cell_lab/q;->H:[F

    const/4 v3, 0x2

    const-wide v4, 0x3f847ae147ae147bL    # 0.01

    add-double/2addr v0, v4

    double-to-float v0, v0

    aput v0, v2, v3

    .line 2744
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/q;->b()V

    .line 2753
    :goto_15
    iget-boolean v0, p0, Lcom/saterskog/cell_lab/q;->aq:Z

    if-nez v0, :cond_38

    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->ap:Lcom/saterskog/cell_lab/p$a;

    const/4 v1, 0x2

    invoke-interface {v0, v1}, Lcom/saterskog/cell_lab/p$a;->a(S)V

    .line 2771
    :cond_38
    :goto_16
    iget v0, p0, Lcom/saterskog/cell_lab/q;->z:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_39

    iget v0, p0, Lcom/saterskog/cell_lab/q;->z:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_40

    :cond_39
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->ap:Lcom/saterskog/cell_lab/p$a;

    invoke-interface {v0}, Lcom/saterskog/cell_lab/p$a;->g()Z

    move-result v0

    if-eqz v0, :cond_40

    .line 2773
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/saterskog/cell_lab/CellWorld;->I:Z

    .line 2774
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    iget v1, p0, Lcom/saterskog/cell_lab/q;->b:F

    iput v1, v0, Lcom/saterskog/cell_lab/CellWorld;->F:F

    .line 2775
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    iget v1, p0, Lcom/saterskog/cell_lab/q;->c:F

    iput v1, v0, Lcom/saterskog/cell_lab/CellWorld;->G:F

    .line 335
    :cond_3a
    :goto_17
    iget v0, p0, Lcom/saterskog/cell_lab/q;->z:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3b

    iget v0, p0, Lcom/saterskog/cell_lab/q;->z:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_42

    .line 336
    :cond_3b
    iget v0, p0, Lcom/saterskog/cell_lab/q;->z:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_41

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    .line 339
    :goto_18
    iget-object v2, p0, Lcom/saterskog/cell_lab/q;->an:Ljava/util/concurrent/ThreadPoolExecutor;

    new-instance v3, Lcom/saterskog/cell_lab/q$1;

    invoke-direct {v3, p0, v0, v1}, Lcom/saterskog/cell_lab/q$1;-><init>(Lcom/saterskog/cell_lab/q;D)V

    invoke-virtual {v2, v3}, Ljava/util/concurrent/ThreadPoolExecutor;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    move-result-object v2

    iput-object v2, p0, Lcom/saterskog/cell_lab/q;->E:Ljava/util/concurrent/Future;

    .line 346
    iget-object v2, p0, Lcom/saterskog/cell_lab/q;->an:Ljava/util/concurrent/ThreadPoolExecutor;

    new-instance v3, Lcom/saterskog/cell_lab/q$2;

    invoke-direct {v3, p0, v0, v1}, Lcom/saterskog/cell_lab/q$2;-><init>(Lcom/saterskog/cell_lab/q;D)V

    invoke-virtual {v2, v3}, Ljava/util/concurrent/ThreadPoolExecutor;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    move-result-object v0

    iput-object v0, p0, Lcom/saterskog/cell_lab/q;->F:Ljava/util/concurrent/Future;

    .line 385
    :cond_3c
    :goto_19
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->L:[F

    const/4 v1, 0x0

    const/high16 v2, 0x40000000    # 2.0f

    iget v3, p0, Lcom/saterskog/cell_lab/q;->f:F

    div-float/2addr v2, v3

    aput v2, v0, v1

    .line 386
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->L:[F

    const/4 v1, 0x1

    const/4 v2, 0x0

    aput v2, v0, v1

    .line 387
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->L:[F

    const/4 v1, 0x2

    const/4 v2, 0x0

    aput v2, v0, v1

    .line 388
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->L:[F

    const/4 v1, 0x3

    const/4 v2, 0x0

    aput v2, v0, v1

    .line 389
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->L:[F

    const/4 v1, 0x4

    const/4 v2, 0x0

    aput v2, v0, v1

    .line 390
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->L:[F

    const/4 v1, 0x5

    const/high16 v2, 0x40000000    # 2.0f

    iget v3, p0, Lcom/saterskog/cell_lab/q;->g:F

    div-float/2addr v2, v3

    aput v2, v0, v1

    .line 391
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->L:[F

    const/4 v1, 0x6

    const/4 v2, 0x0

    aput v2, v0, v1

    .line 392
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->L:[F

    const/4 v1, 0x7

    const/4 v2, 0x0

    aput v2, v0, v1

    .line 393
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->L:[F

    const/16 v1, 0x8

    const/4 v2, 0x0

    aput v2, v0, v1

    .line 394
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->L:[F

    const/16 v1, 0x9

    const/4 v2, 0x0

    aput v2, v0, v1

    .line 395
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->L:[F

    const/16 v1, 0xa

    const/high16 v2, 0x3f800000    # 1.0f

    aput v2, v0, v1

    .line 396
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->L:[F

    const/16 v1, 0xb

    const/4 v2, 0x0

    aput v2, v0, v1

    .line 397
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->L:[F

    const/16 v1, 0xc

    const/high16 v2, -0x40000000    # -2.0f

    iget v3, p0, Lcom/saterskog/cell_lab/q;->b:F

    mul-float/2addr v2, v3

    iget v3, p0, Lcom/saterskog/cell_lab/q;->f:F

    div-float/2addr v2, v3

    aput v2, v0, v1

    .line 398
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->L:[F

    const/16 v1, 0xd

    const/high16 v2, -0x40000000    # -2.0f

    iget v3, p0, Lcom/saterskog/cell_lab/q;->c:F

    mul-float/2addr v2, v3

    iget v3, p0, Lcom/saterskog/cell_lab/q;->g:F

    div-float/2addr v2, v3

    aput v2, v0, v1

    .line 399
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->L:[F

    const/16 v1, 0xe

    const/4 v2, 0x0

    aput v2, v0, v1

    .line 400
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->L:[F

    const/16 v1, 0xf

    const/high16 v2, 0x3f800000    # 1.0f

    aput v2, v0, v1

    .line 401
    const/4 v0, 0x0

    move v2, v0

    :goto_1a
    const/4 v0, 0x4

    if-ge v2, v0, :cond_45

    .line 402
    const/4 v0, 0x0

    move v1, v0

    :goto_1b
    const/4 v0, 0x4

    if-ge v1, v0, :cond_44

    .line 403
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->K:[F

    mul-int/lit8 v3, v1, 0x4

    add-int/2addr v3, v2

    const/4 v4, 0x0

    aput v4, v0, v3

    .line 404
    const/4 v0, 0x0

    :goto_1c
    const/4 v3, 0x4

    if-ge v0, v3, :cond_43

    .line 405
    iget-object v3, p0, Lcom/saterskog/cell_lab/q;->K:[F

    mul-int/lit8 v4, v1, 0x4

    add-int/2addr v4, v2

    aget v5, v3, v4

    iget-object v6, p0, Lcom/saterskog/cell_lab/q;->L:[F

    mul-int/lit8 v7, v1, 0x4

    add-int/2addr v7, v0

    aget v6, v6, v7

    mul-int/lit8 v7, v0, 0x4

    add-int/2addr v7, v2

    aget v7, p1, v7

    mul-float/2addr v6, v7

    add-float/2addr v5, v6

    aput v5, v3, v4

    .line 404
    add-int/lit8 v0, v0, 0x1

    goto :goto_1c

    .line 2731
    :catchall_1
    move-exception v0

    :try_start_8
    monitor-exit v9
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    throw v0

    .line 2705
    :cond_3d
    add-int/lit8 v0, v0, 0x1

    goto/16 :goto_10

    .line 2748
    :cond_3e
    iget-object v1, p0, Lcom/saterskog/cell_lab/q;->R:Ljava/lang/Object;

    monitor-enter v1

    .line 2750
    const/4 v0, 0x0

    :try_start_9
    iput-boolean v0, p0, Lcom/saterskog/cell_lab/q;->au:Z

    .line 2751
    monitor-exit v1

    goto/16 :goto_15

    :catchall_2
    move-exception v0

    monitor-exit v1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    throw v0

    .line 2757
    :cond_3f
    iget v0, p0, Lcom/saterskog/cell_lab/q;->A:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_38

    .line 2759
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->q:Lcom/saterskog/cell_lab/q$a;

    iget-object v1, p0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    const/4 v2, -0x1

    invoke-interface {v0, v1, v2}, Lcom/saterskog/cell_lab/q$a;->a(Lcom/saterskog/cell_lab/CellWorld;I)V

    goto/16 :goto_16

    .line 2778
    :cond_40
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/saterskog/cell_lab/CellWorld;->I:Z

    goto/16 :goto_17

    .line 336
    :cond_41
    iget v0, p0, Lcom/saterskog/cell_lab/q;->C:F

    float-to-double v0, v0

    goto/16 :goto_18

    .line 354
    :cond_42
    iget v0, p0, Lcom/saterskog/cell_lab/q;->z:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_3c

    .line 355
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->an:Ljava/util/concurrent/ThreadPoolExecutor;

    new-instance v1, Lcom/saterskog/cell_lab/q$3;

    invoke-direct {v1, p0}, Lcom/saterskog/cell_lab/q$3;-><init>(Lcom/saterskog/cell_lab/q;)V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    move-result-object v0

    iput-object v0, p0, Lcom/saterskog/cell_lab/q;->F:Ljava/util/concurrent/Future;

    goto/16 :goto_19

    .line 402
    :cond_43
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1b

    .line 401
    :cond_44
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_1a

    .line 407
    :cond_45
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    iget-object v1, p0, Lcom/saterskog/cell_lab/q;->K:[F

    invoke-virtual {v0, v1}, Lcom/saterskog/cell_lab/CellWorld;->a([F)V

    .line 408
    const/16 v0, 0xb71

    invoke-static {v0}, Landroid/opengl/GLES20;->glDisable(I)V

    .line 409
    const/16 v0, 0xbe2

    invoke-static {v0}, Landroid/opengl/GLES20;->glEnable(I)V

    .line 413
    const/4 v0, 0x1

    const/16 v1, 0x302

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glBlendFunc(II)V

    .line 415
    iget-boolean v0, p0, Lcom/saterskog/cell_lab/q;->G:Z

    if-nez v0, :cond_46

    iget-boolean v0, p0, Lcom/saterskog/cell_lab/q;->aq:Z

    if-eqz v0, :cond_47

    .line 416
    :cond_46
    iget-object v1, p0, Lcom/saterskog/cell_lab/q;->K:[F

    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->H:[F

    const/4 v2, 0x0

    aget v2, v0, v2

    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->H:[F

    const/4 v3, 0x1

    aget v3, v0, v3

    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->H:[F

    const/4 v4, 0x2

    aget v4, v0, v4

    const/high16 v5, 0x3f800000    # 1.0f

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Lcom/saterskog/cell_lab/q;->a([FFFFF)V

    .line 418
    :cond_47
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/saterskog/cell_lab/q;->ar:J

    sub-long/2addr v0, v2

    .line 419
    const-wide/32 v2, 0xfe502a

    cmp-long v2, v0, v2

    if-gez v2, :cond_48

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-lez v2, :cond_48

    .line 421
    const-wide/32 v2, 0xfe502a

    sub-long v0, v2, v0

    const-wide/32 v2, 0xf4240

    :try_start_a
    div-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_a
    .catch Ljava/lang/InterruptedException; {:try_start_a .. :try_end_a} :catch_6

    .line 426
    :cond_48
    :goto_1d
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/saterskog/cell_lab/q;->ar:J

    .line 427
    return-void

    .line 424
    :catch_6
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/InterruptedException;->printStackTrace()V

    goto :goto_1d

    .line 303
    :catch_7
    move-exception v0

    goto/16 :goto_5

    :cond_49
    move-wide v0, v2

    move-wide v2, v4

    move-wide v4, v6

    goto/16 :goto_14

    :cond_4a
    move v0, v1

    goto/16 :goto_c
.end method

.method public final c()[Lcom/saterskog/cell_lab/Gene;
    .locals 6

    .prologue
    const/16 v5, 0x50

    .line 1085
    iget-object v2, p0, Lcom/saterskog/cell_lab/q;->R:Ljava/lang/Object;

    monitor-enter v2

    .line 1086
    :try_start_0
    iget-boolean v0, p0, Lcom/saterskog/cell_lab/q;->au:Z

    if-eqz v0, :cond_1

    .line 1088
    const/16 v0, 0x50

    new-array v0, v0, [Lcom/saterskog/cell_lab/Gene;

    .line 1089
    const/4 v1, 0x0

    :goto_0
    if-ge v1, v5, :cond_0

    .line 1090
    new-instance v3, Lcom/saterskog/cell_lab/Gene;

    iget-object v4, p0, Lcom/saterskog/cell_lab/q;->Q:[Lcom/saterskog/cell_lab/Gene;

    aget-object v4, v4, v1

    invoke-direct {v3, v4}, Lcom/saterskog/cell_lab/Gene;-><init>(Lcom/saterskog/cell_lab/Gene;)V

    aput-object v3, v0, v1

    .line 1089
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 1091
    :cond_0
    monitor-exit v2

    .line 1094
    :goto_1
    return-object v0

    :cond_1
    const/4 v0, 0x0

    monitor-exit v2

    goto :goto_1

    .line 1095
    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final onSurfaceCreated(Ljavax/microedition/khronos/opengles/GL10;Ljavax/microedition/khronos/egl/EGLConfig;)V
    .locals 2

    .prologue
    const/high16 v1, 0x3f800000    # 1.0f

    const v0, 0x3f4ccccd    # 0.8f

    .line 174
    invoke-static {v0, v0, v1, v1}, Landroid/opengl/GLES20;->glClearColor(FFFF)V

    .line 176
    iget-object v0, p0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    iget-object v1, p0, Lcom/saterskog/cell_lab/q;->aw:Landroid/app/Activity;

    invoke-virtual {v0, v1}, Lcom/saterskog/cell_lab/CellWorld;->a(Landroid/content/Context;)V

    .line 177
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/q;->a()V

    .line 178
    return-void
.end method
