.class public abstract Landroid/support/v4/f/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/f/a$a;,
        Landroid/support/v4/f/a$b;
    }
.end annotation


# static fields
.field private static final r:I


# instance fields
.field private final a:Landroid/support/v4/f/a$a;

.field private final b:Landroid/view/animation/Interpolator;

.field private final c:Landroid/view/View;

.field private d:Ljava/lang/Runnable;

.field private e:[F

.field private f:[F

.field private g:I

.field private h:I

.field private i:[F

.field private j:[F

.field private k:[F

.field private l:Z

.field private m:Z

.field private n:Z

.field private o:Z

.field private p:Z

.field private q:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 194
    invoke-static {}, Landroid/view/ViewConfiguration;->getTapTimeout()I

    move-result v0

    sput v0, Landroid/support/v4/f/a;->r:I

    return-void
.end method

.method public constructor <init>(Landroid/view/View;)V
    .locals 8

    .prologue
    const v7, 0x3a83126f    # 0.001f

    const/high16 v6, 0x447a0000    # 1000.0f

    const/4 v1, 0x2

    const/4 v5, 0x0

    const/4 v4, 0x1

    .line 209
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 137
    new-instance v0, Landroid/support/v4/f/a$a;

    invoke-direct {v0}, Landroid/support/v4/f/a$a;-><init>()V

    iput-object v0, p0, Landroid/support/v4/f/a;->a:Landroid/support/v4/f/a$a;

    .line 140
    new-instance v0, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    iput-object v0, p0, Landroid/support/v4/f/a;->b:Landroid/view/animation/Interpolator;

    .line 149
    new-array v0, v1, [F

    fill-array-data v0, :array_0

    iput-object v0, p0, Landroid/support/v4/f/a;->e:[F

    .line 152
    new-array v0, v1, [F

    fill-array-data v0, :array_1

    iput-object v0, p0, Landroid/support/v4/f/a;->f:[F

    .line 161
    new-array v0, v1, [F

    fill-array-data v0, :array_2

    iput-object v0, p0, Landroid/support/v4/f/a;->i:[F

    .line 164
    new-array v0, v1, [F

    fill-array-data v0, :array_3

    iput-object v0, p0, Landroid/support/v4/f/a;->j:[F

    .line 167
    new-array v0, v1, [F

    fill-array-data v0, :array_4

    iput-object v0, p0, Landroid/support/v4/f/a;->k:[F

    .line 210
    iput-object p1, p0, Landroid/support/v4/f/a;->c:Landroid/view/View;

    .line 212
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    .line 213
    const v1, 0x44c4e000    # 1575.0f

    iget v2, v0, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr v1, v2

    const/high16 v2, 0x3f000000    # 0.5f

    add-float/2addr v1, v2

    float-to-int v1, v1

    .line 214
    const v2, 0x439d8000    # 315.0f

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr v0, v2

    const/high16 v2, 0x3f000000    # 0.5f

    add-float/2addr v0, v2

    float-to-int v0, v0

    .line 215
    int-to-float v1, v1

    .line 1294
    iget-object v2, p0, Landroid/support/v4/f/a;->k:[F

    div-float v3, v1, v6

    aput v3, v2, v5

    .line 1295
    iget-object v2, p0, Landroid/support/v4/f/a;->k:[F

    div-float/2addr v1, v6

    aput v1, v2, v4

    .line 216
    int-to-float v0, v0

    .line 1312
    iget-object v1, p0, Landroid/support/v4/f/a;->j:[F

    div-float v2, v0, v6

    aput v2, v1, v5

    .line 1313
    iget-object v1, p0, Landroid/support/v4/f/a;->j:[F

    div-float/2addr v0, v6

    aput v0, v1, v4

    .line 1354
    iput v4, p0, Landroid/support/v4/f/a;->g:I

    .line 1395
    iget-object v0, p0, Landroid/support/v4/f/a;->f:[F

    const v1, 0x7f7fffff    # Float.MAX_VALUE

    aput v1, v0, v5

    .line 1396
    iget-object v0, p0, Landroid/support/v4/f/a;->f:[F

    const v1, 0x7f7fffff    # Float.MAX_VALUE

    aput v1, v0, v4

    .line 2373
    iget-object v0, p0, Landroid/support/v4/f/a;->e:[F

    const v1, 0x3e4ccccd    # 0.2f

    aput v1, v0, v5

    .line 2374
    iget-object v0, p0, Landroid/support/v4/f/a;->e:[F

    const v1, 0x3e4ccccd    # 0.2f

    aput v1, v0, v4

    .line 3333
    iget-object v0, p0, Landroid/support/v4/f/a;->i:[F

    aput v7, v0, v5

    .line 3334
    iget-object v0, p0, Landroid/support/v4/f/a;->i:[F

    aput v7, v0, v4

    .line 222
    sget v0, Landroid/support/v4/f/a;->r:I

    .line 3412
    iput v0, p0, Landroid/support/v4/f/a;->h:I

    .line 3427
    iget-object v0, p0, Landroid/support/v4/f/a;->a:Landroid/support/v4/f/a$a;

    .line 3752
    const/16 v1, 0x1f4

    iput v1, v0, Landroid/support/v4/f/a$a;->a:I

    .line 4442
    iget-object v0, p0, Landroid/support/v4/f/a;->a:Landroid/support/v4/f/a$a;

    .line 4756
    const/16 v1, 0x1f4

    iput v1, v0, Landroid/support/v4/f/a$a;->b:I

    .line 225
    return-void

    .line 149
    nop

    :array_0
    .array-data 4
        0x0
        0x0
    .end array-data

    .line 152
    :array_1
    .array-data 4
        0x7f7fffff    # Float.MAX_VALUE
        0x7f7fffff    # Float.MAX_VALUE
    .end array-data

    .line 161
    :array_2
    .array-data 4
        0x0
        0x0
    .end array-data

    .line 164
    :array_3
    .array-data 4
        0x0
        0x0
    .end array-data

    .line 167
    :array_4
    .array-data 4
        0x7f7fffff    # Float.MAX_VALUE
        0x7f7fffff    # Float.MAX_VALUE
    .end array-data
.end method

.method static synthetic a(F)F
    .locals 2

    .prologue
    .line 84
    const/4 v0, 0x0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {p0, v0, v1}, Landroid/support/v4/f/a;->a(FFF)F

    move-result v0

    return v0
.end method

.method private a(FF)F
    .locals 4

    .prologue
    const/high16 v1, 0x3f800000    # 1.0f

    const/4 v0, 0x0

    .line 624
    cmpl-float v2, p2, v0

    if-nez v2, :cond_1

    .line 649
    :cond_0
    :goto_0
    return v0

    .line 628
    :cond_1
    iget v2, p0, Landroid/support/v4/f/a;->g:I

    packed-switch v2, :pswitch_data_0

    goto :goto_0

    .line 631
    :pswitch_0
    cmpg-float v2, p1, p2

    if-gez v2, :cond_0

    .line 632
    cmpl-float v2, p1, v0

    if-ltz v2, :cond_2

    .line 634
    div-float v0, p1, p2

    sub-float v0, v1, v0

    goto :goto_0

    .line 635
    :cond_2
    iget-boolean v2, p0, Landroid/support/v4/f/a;->o:Z

    if-eqz v2, :cond_0

    iget v2, p0, Landroid/support/v4/f/a;->g:I

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    move v0, v1

    .line 637
    goto :goto_0

    .line 642
    :pswitch_1
    cmpg-float v1, p1, v0

    if-gez v1, :cond_0

    .line 644
    neg-float v0, p2

    div-float v0, p1, v0

    goto :goto_0

    .line 628
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method private static a(FFF)F
    .locals 1

    .prologue
    .line 663
    cmpl-float v0, p0, p2

    if-lez v0, :cond_0

    .line 668
    :goto_0
    return p2

    .line 665
    :cond_0
    cmpg-float v0, p0, p1

    if-gez v0, :cond_1

    move p2, p1

    .line 666
    goto :goto_0

    :cond_1
    move p2, p0

    .line 668
    goto :goto_0
.end method

.method private a(IFFF)F
    .locals 5

    .prologue
    const/4 v1, 0x0

    .line 539
    iget-object v0, p0, Landroid/support/v4/f/a;->e:[F

    aget v0, v0, p1

    .line 540
    iget-object v2, p0, Landroid/support/v4/f/a;->f:[F

    aget v2, v2, p1

    .line 9607
    mul-float/2addr v0, p3

    invoke-static {v0, v1, v2}, Landroid/support/v4/f/a;->a(FFF)F

    move-result v0

    .line 9608
    invoke-direct {p0, p2, v0}, Landroid/support/v4/f/a;->a(FF)F

    move-result v2

    .line 9609
    sub-float v3, p3, p2

    invoke-direct {p0, v3, v0}, Landroid/support/v4/f/a;->a(FF)F

    move-result v0

    .line 9610
    sub-float/2addr v0, v2

    .line 9612
    cmpg-float v2, v0, v1

    if-gez v2, :cond_0

    .line 9613
    iget-object v2, p0, Landroid/support/v4/f/a;->b:Landroid/view/animation/Interpolator;

    neg-float v0, v0

    invoke-interface {v2, v0}, Landroid/view/animation/Interpolator;->getInterpolation(F)F

    move-result v0

    neg-float v0, v0

    .line 9620
    :goto_0
    const/high16 v2, -0x40800000    # -1.0f

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v0, v2, v3}, Landroid/support/v4/f/a;->a(FFF)F

    move-result v0

    .line 542
    :goto_1
    cmpl-float v2, v0, v1

    if-nez v2, :cond_2

    move v0, v1

    .line 558
    :goto_2
    return v0

    .line 9614
    :cond_0
    cmpl-float v2, v0, v1

    if-lez v2, :cond_1

    .line 9615
    iget-object v2, p0, Landroid/support/v4/f/a;->b:Landroid/view/animation/Interpolator;

    invoke-interface {v2, v0}, Landroid/view/animation/Interpolator;->getInterpolation(F)F

    move-result v0

    goto :goto_0

    :cond_1
    move v0, v1

    .line 9617
    goto :goto_1

    .line 547
    :cond_2
    iget-object v2, p0, Landroid/support/v4/f/a;->i:[F

    aget v2, v2, p1

    .line 548
    iget-object v3, p0, Landroid/support/v4/f/a;->j:[F

    aget v3, v3, p1

    .line 549
    iget-object v4, p0, Landroid/support/v4/f/a;->k:[F

    aget v4, v4, p1

    .line 550
    mul-float/2addr v2, p4

    .line 555
    cmpl-float v1, v0, v1

    if-lez v1, :cond_3

    .line 556
    mul-float/2addr v0, v2

    invoke-static {v0, v3, v4}, Landroid/support/v4/f/a;->a(FFF)F

    move-result v0

    goto :goto_2

    .line 558
    :cond_3
    neg-float v0, v0

    mul-float/2addr v0, v2

    invoke-static {v0, v3, v4}, Landroid/support/v4/f/a;->a(FFF)F

    move-result v0

    neg-float v0, v0

    goto :goto_2
.end method

.method private a()Z
    .locals 3

    .prologue
    .line 492
    iget-object v0, p0, Landroid/support/v4/f/a;->a:Landroid/support/v4/f/a$a;

    .line 5848
    iget v1, v0, Landroid/support/v4/f/a$a;->d:F

    iget v2, v0, Landroid/support/v4/f/a$a;->d:F

    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v2

    div-float/2addr v1, v2

    float-to-int v1, v1

    .line 6844
    iget v2, v0, Landroid/support/v4/f/a$a;->c:F

    iget v0, v0, Landroid/support/v4/f/a$a;->c:F

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    div-float v0, v2, v0

    float-to-int v0, v0

    .line 496
    if-eqz v1, :cond_0

    invoke-virtual {p0, v1}, Landroid/support/v4/f/a;->b(I)Z

    move-result v1

    if-nez v1, :cond_2

    :cond_0
    if-eqz v0, :cond_1

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_2
    const/4 v0, 0x1

    goto :goto_0
.end method

.method static synthetic a(Landroid/support/v4/f/a;)Z
    .locals 1

    .prologue
    .line 84
    iget-boolean v0, p0, Landroid/support/v4/f/a;->o:Z

    return v0
.end method

.method private b()V
    .locals 8

    .prologue
    const/4 v1, 0x0

    .line 528
    iget-boolean v0, p0, Landroid/support/v4/f/a;->m:Z

    if-eqz v0, :cond_0

    .line 531
    iput-boolean v1, p0, Landroid/support/v4/f/a;->o:Z

    .line 535
    :goto_0
    return-void

    .line 533
    :cond_0
    iget-object v3, p0, Landroid/support/v4/f/a;->a:Landroid/support/v4/f/a$a;

    .line 7775
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v4

    .line 7776
    iget-wide v6, v3, Landroid/support/v4/f/a$a;->e:J

    sub-long v6, v4, v6

    long-to-int v2, v6

    iget v0, v3, Landroid/support/v4/f/a$a;->b:I

    .line 8653
    if-le v2, v0, :cond_1

    .line 7776
    :goto_1
    iput v0, v3, Landroid/support/v4/f/a$a;->k:I

    .line 7777
    invoke-virtual {v3, v4, v5}, Landroid/support/v4/f/a$a;->a(J)F

    move-result v0

    iput v0, v3, Landroid/support/v4/f/a$a;->j:F

    .line 7778
    iput-wide v4, v3, Landroid/support/v4/f/a$a;->i:J

    goto :goto_0

    .line 8655
    :cond_1
    if-gez v2, :cond_2

    move v0, v1

    .line 8656
    goto :goto_1

    :cond_2
    move v0, v2

    .line 8658
    goto :goto_1
.end method

.method static synthetic b(Landroid/support/v4/f/a;)Z
    .locals 1

    .prologue
    .line 84
    iget-boolean v0, p0, Landroid/support/v4/f/a;->m:Z

    return v0
.end method

.method static synthetic c(Landroid/support/v4/f/a;)Z
    .locals 1

    .prologue
    .line 84
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/v4/f/a;->m:Z

    return v0
.end method

.method static synthetic d(Landroid/support/v4/f/a;)Landroid/support/v4/f/a$a;
    .locals 1

    .prologue
    .line 84
    iget-object v0, p0, Landroid/support/v4/f/a;->a:Landroid/support/v4/f/a$a;

    return-object v0
.end method

.method static synthetic e(Landroid/support/v4/f/a;)Z
    .locals 1

    .prologue
    .line 84
    invoke-direct {p0}, Landroid/support/v4/f/a;->a()Z

    move-result v0

    return v0
.end method

.method static synthetic f(Landroid/support/v4/f/a;)Z
    .locals 1

    .prologue
    .line 84
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/v4/f/a;->o:Z

    return v0
.end method

.method static synthetic g(Landroid/support/v4/f/a;)Z
    .locals 1

    .prologue
    .line 84
    iget-boolean v0, p0, Landroid/support/v4/f/a;->n:Z

    return v0
.end method

.method static synthetic h(Landroid/support/v4/f/a;)Z
    .locals 1

    .prologue
    .line 84
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/v4/f/a;->n:Z

    return v0
.end method

.method static synthetic i(Landroid/support/v4/f/a;)V
    .locals 8

    .prologue
    const/4 v5, 0x0

    .line 9677
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    .line 9678
    const/4 v4, 0x3

    const/4 v7, 0x0

    move-wide v2, v0

    move v6, v5

    invoke-static/range {v0 .. v7}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    move-result-object v0

    .line 9680
    iget-object v1, p0, Landroid/support/v4/f/a;->c:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 9681
    invoke-virtual {v0}, Landroid/view/MotionEvent;->recycle()V

    .line 84
    return-void
.end method

.method static synthetic j(Landroid/support/v4/f/a;)Landroid/view/View;
    .locals 1

    .prologue
    .line 84
    iget-object v0, p0, Landroid/support/v4/f/a;->c:Landroid/view/View;

    return-object v0
.end method


# virtual methods
.method public final a(Z)Landroid/support/v4/f/a;
    .locals 1

    .prologue
    .line 235
    iget-boolean v0, p0, Landroid/support/v4/f/a;->p:Z

    if-eqz v0, :cond_0

    if-nez p1, :cond_0

    .line 236
    invoke-direct {p0}, Landroid/support/v4/f/a;->b()V

    .line 239
    :cond_0
    iput-boolean p1, p0, Landroid/support/v4/f/a;->p:Z

    .line 240
    return-object p0
.end method

.method public abstract a(I)V
.end method

.method public abstract b(I)Z
.end method

.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 6

    .prologue
    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 456
    iget-boolean v2, p0, Landroid/support/v4/f/a;->p:Z

    if-nez v2, :cond_1

    .line 485
    :cond_0
    :goto_0
    return v0

    .line 460
    :cond_1
    invoke-static {p2}, Landroid/support/v4/view/n;->a(Landroid/view/MotionEvent;)I

    move-result v2

    .line 461
    packed-switch v2, :pswitch_data_0

    .line 485
    :cond_2
    :goto_1
    iget-boolean v2, p0, Landroid/support/v4/f/a;->q:Z

    if-eqz v2, :cond_0

    iget-boolean v2, p0, Landroid/support/v4/f/a;->o:Z

    if-eqz v2, :cond_0

    move v0, v1

    goto :goto_0

    .line 463
    :pswitch_0
    iput-boolean v1, p0, Landroid/support/v4/f/a;->n:Z

    .line 464
    iput-boolean v0, p0, Landroid/support/v4/f/a;->l:Z

    .line 467
    :pswitch_1
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v3

    int-to-float v3, v3

    iget-object v4, p0, Landroid/support/v4/f/a;->c:Landroid/view/View;

    invoke-virtual {v4}, Landroid/view/View;->getWidth()I

    move-result v4

    int-to-float v4, v4

    invoke-direct {p0, v0, v2, v3, v4}, Landroid/support/v4/f/a;->a(IFFF)F

    move-result v2

    .line 469
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v4

    int-to-float v4, v4

    iget-object v5, p0, Landroid/support/v4/f/a;->c:Landroid/view/View;

    invoke-virtual {v5}, Landroid/view/View;->getHeight()I

    move-result v5

    int-to-float v5, v5

    invoke-direct {p0, v1, v3, v4, v5}, Landroid/support/v4/f/a;->a(IFFF)F

    move-result v3

    .line 471
    iget-object v4, p0, Landroid/support/v4/f/a;->a:Landroid/support/v4/f/a$a;

    .line 4839
    iput v2, v4, Landroid/support/v4/f/a$a;->c:F

    .line 4840
    iput v3, v4, Landroid/support/v4/f/a$a;->d:F

    .line 475
    iget-boolean v2, p0, Landroid/support/v4/f/a;->o:Z

    if-nez v2, :cond_2

    invoke-direct {p0}, Landroid/support/v4/f/a;->a()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 5504
    iget-object v2, p0, Landroid/support/v4/f/a;->d:Ljava/lang/Runnable;

    if-nez v2, :cond_3

    .line 5505
    new-instance v2, Landroid/support/v4/f/a$b;

    invoke-direct {v2, p0, v0}, Landroid/support/v4/f/a$b;-><init>(Landroid/support/v4/f/a;B)V

    iput-object v2, p0, Landroid/support/v4/f/a;->d:Ljava/lang/Runnable;

    .line 5508
    :cond_3
    iput-boolean v1, p0, Landroid/support/v4/f/a;->o:Z

    .line 5509
    iput-boolean v1, p0, Landroid/support/v4/f/a;->m:Z

    .line 5511
    iget-boolean v2, p0, Landroid/support/v4/f/a;->l:Z

    if-nez v2, :cond_4

    iget v2, p0, Landroid/support/v4/f/a;->h:I

    if-lez v2, :cond_4

    .line 5512
    iget-object v2, p0, Landroid/support/v4/f/a;->c:Landroid/view/View;

    iget-object v3, p0, Landroid/support/v4/f/a;->d:Ljava/lang/Runnable;

    iget v4, p0, Landroid/support/v4/f/a;->h:I

    int-to-long v4, v4

    invoke-static {v2, v3, v4, v5}, Landroid/support/v4/view/u;->a(Landroid/view/View;Ljava/lang/Runnable;J)V

    .line 5519
    :goto_2
    iput-boolean v1, p0, Landroid/support/v4/f/a;->l:Z

    goto :goto_1

    .line 5514
    :cond_4
    iget-object v2, p0, Landroid/support/v4/f/a;->d:Ljava/lang/Runnable;

    invoke-interface {v2}, Ljava/lang/Runnable;->run()V

    goto :goto_2

    .line 481
    :pswitch_2
    invoke-direct {p0}, Landroid/support/v4/f/a;->b()V

    goto :goto_1

    .line 461
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_2
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method
