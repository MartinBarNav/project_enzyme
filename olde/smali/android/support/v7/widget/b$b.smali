.class public abstract Landroid/support/v7/widget/b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/widget/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v7/widget/b$b$b;,
        Landroid/support/v7/widget/b$b$a;
    }
.end annotation


# instance fields
.field private final a:F

.field private final b:I

.field private final c:I

.field private final d:Landroid/view/View;

.field private e:Ljava/lang/Runnable;

.field private f:Ljava/lang/Runnable;

.field private g:Z

.field private h:Z

.field private i:I

.field private final j:[I


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 1247
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1245
    const/4 v0, 0x2

    new-array v0, v0, [I

    iput-object v0, p0, Landroid/support/v7/widget/b$b;->j:[I

    .line 1248
    iput-object p1, p0, Landroid/support/v7/widget/b$b;->d:Landroid/view/View;

    .line 1249
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Landroid/support/v7/widget/b$b;->a:F

    .line 1250
    invoke-static {}, Landroid/view/ViewConfiguration;->getTapTimeout()I

    move-result v0

    iput v0, p0, Landroid/support/v7/widget/b$b;->b:I

    .line 1252
    iget v0, p0, Landroid/support/v7/widget/b$b;->b:I

    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    move-result v1

    add-int/2addr v0, v1

    div-int/lit8 v0, v0, 0x2

    iput v0, p0, Landroid/support/v7/widget/b$b;->c:I

    .line 1253
    return-void
.end method

.method static synthetic a(Landroid/support/v7/widget/b$b;)Landroid/view/View;
    .locals 1

    .prologue
    .line 1214
    iget-object v0, p0, Landroid/support/v7/widget/b$b;->d:Landroid/view/View;

    return-object v0
.end method

.method private a(Landroid/view/MotionEvent;)Z
    .locals 6

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 1418
    iget-object v2, p0, Landroid/support/v7/widget/b$b;->d:Landroid/view/View;

    .line 1419
    invoke-virtual {p0}, Landroid/support/v7/widget/b$b;->a()Landroid/support/v7/widget/b;

    move-result-object v3

    .line 1420
    if-eqz v3, :cond_0

    .line 4760
    iget-object v4, v3, Landroid/support/v7/widget/b;->b:Landroid/widget/PopupWindow;

    invoke-virtual {v4}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v4

    .line 1420
    if-nez v4, :cond_2

    :cond_0
    move v0, v1

    .line 1443
    :cond_1
    :goto_0
    return v0

    .line 1424
    :cond_2
    invoke-static {v3}, Landroid/support/v7/widget/b;->a(Landroid/support/v7/widget/b;)Landroid/support/v7/widget/b$a;

    move-result-object v3

    .line 1425
    if-eqz v3, :cond_3

    invoke-virtual {v3}, Landroid/support/v7/widget/b$a;->isShown()Z

    move-result v4

    if-nez v4, :cond_4

    :cond_3
    move v0, v1

    .line 1426
    goto :goto_0

    .line 1430
    :cond_4
    invoke-static {p1}, Landroid/view/MotionEvent;->obtainNoHistory(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    move-result-object v4

    .line 5468
    iget-object v5, p0, Landroid/support/v7/widget/b$b;->j:[I

    .line 5469
    invoke-virtual {v2, v5}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 5470
    aget v2, v5, v1

    int-to-float v2, v2

    aget v5, v5, v0

    int-to-float v5, v5

    invoke-virtual {v4, v2, v5}, Landroid/view/MotionEvent;->offsetLocation(FF)V

    .line 6457
    iget-object v2, p0, Landroid/support/v7/widget/b$b;->j:[I

    .line 6458
    invoke-virtual {v3, v2}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 6459
    aget v5, v2, v1

    neg-int v5, v5

    int-to-float v5, v5

    aget v2, v2, v0

    neg-int v2, v2

    int-to-float v2, v2

    invoke-virtual {v4, v5, v2}, Landroid/view/MotionEvent;->offsetLocation(FF)V

    .line 1435
    iget v2, p0, Landroid/support/v7/widget/b$b;->i:I

    invoke-virtual {v3, v4, v2}, Landroid/support/v7/widget/b$a;->a(Landroid/view/MotionEvent;I)Z

    move-result v3

    .line 1436
    invoke-virtual {v4}, Landroid/view/MotionEvent;->recycle()V

    .line 1439
    invoke-static {p1}, Landroid/support/v4/view/n;->a(Landroid/view/MotionEvent;)I

    move-result v2

    .line 1440
    if-eq v2, v0, :cond_6

    const/4 v4, 0x3

    if-eq v2, v4, :cond_6

    move v2, v0

    .line 1443
    :goto_1
    if-eqz v3, :cond_5

    if-nez v2, :cond_1

    :cond_5
    move v0, v1

    goto :goto_0

    :cond_6
    move v2, v1

    .line 1440
    goto :goto_1
.end method

.method static synthetic b(Landroid/support/v7/widget/b$b;)V
    .locals 9

    .prologue
    const/4 v5, 0x0

    const/4 v8, 0x1

    .line 1214
    .line 7387
    invoke-direct {p0}, Landroid/support/v7/widget/b$b;->d()V

    .line 7389
    iget-object v0, p0, Landroid/support/v7/widget/b$b;->d:Landroid/view/View;

    .line 7390
    invoke-virtual {v0}, Landroid/view/View;->isEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 7394
    invoke-virtual {p0}, Landroid/support/v7/widget/b$b;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 7399
    iget-object v0, p0, Landroid/support/v7/widget/b$b;->d:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    invoke-interface {v0, v8}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 7402
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    .line 7403
    const/4 v4, 0x3

    const/4 v7, 0x0

    move-wide v2, v0

    move v6, v5

    invoke-static/range {v0 .. v7}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    move-result-object v0

    .line 7404
    iget-object v1, p0, Landroid/support/v7/widget/b$b;->d:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 7405
    invoke-virtual {v0}, Landroid/view/MotionEvent;->recycle()V

    .line 7407
    iput-boolean v8, p0, Landroid/support/v7/widget/b$b;->g:Z

    .line 7408
    iput-boolean v8, p0, Landroid/support/v7/widget/b$b;->h:Z

    .line 1214
    :cond_0
    return-void
.end method

.method private d()V
    .locals 2

    .prologue
    .line 1377
    iget-object v0, p0, Landroid/support/v7/widget/b$b;->f:Ljava/lang/Runnable;

    if-eqz v0, :cond_0

    .line 1378
    iget-object v0, p0, Landroid/support/v7/widget/b$b;->d:Landroid/view/View;

    iget-object v1, p0, Landroid/support/v7/widget/b$b;->f:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 1381
    :cond_0
    iget-object v0, p0, Landroid/support/v7/widget/b$b;->e:Ljava/lang/Runnable;

    if-eqz v0, :cond_1

    .line 1382
    iget-object v0, p0, Landroid/support/v7/widget/b$b;->d:Landroid/view/View;

    iget-object v1, p0, Landroid/support/v7/widget/b$b;->e:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 1384
    :cond_1
    return-void
.end method


# virtual methods
.method public abstract a()Landroid/support/v7/widget/b;
.end method

.method public b()Z
    .locals 2

    .prologue
    .line 1305
    invoke-virtual {p0}, Landroid/support/v7/widget/b$b;->a()Landroid/support/v7/widget/b;

    move-result-object v0

    .line 1306
    if-eqz v0, :cond_0

    .line 2760
    iget-object v1, v0, Landroid/support/v7/widget/b;->b:Landroid/widget/PopupWindow;

    invoke-virtual {v1}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v1

    .line 1306
    if-nez v1, :cond_0

    .line 1307
    invoke-virtual {v0}, Landroid/support/v7/widget/b;->c()V

    .line 1309
    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public c()Z
    .locals 2

    .prologue
    .line 1319
    invoke-virtual {p0}, Landroid/support/v7/widget/b$b;->a()Landroid/support/v7/widget/b;

    move-result-object v0

    .line 1320
    if-eqz v0, :cond_0

    .line 3760
    iget-object v1, v0, Landroid/support/v7/widget/b;->b:Landroid/widget/PopupWindow;

    invoke-virtual {v1}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v1

    .line 1320
    if-eqz v1, :cond_0

    .line 1321
    invoke-virtual {v0}, Landroid/support/v7/widget/b;->a()V

    .line 1323
    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 11

    .prologue
    const/4 v5, 0x0

    const/4 v8, 0x1

    const/4 v7, 0x0

    .line 1269
    iget-boolean v10, p0, Landroid/support/v7/widget/b$b;->g:Z

    .line 1271
    if-eqz v10, :cond_5

    .line 1272
    iget-boolean v0, p0, Landroid/support/v7/widget/b$b;->h:Z

    if-eqz v0, :cond_2

    .line 1276
    invoke-direct {p0, p2}, Landroid/support/v7/widget/b$b;->a(Landroid/view/MotionEvent;)Z

    move-result v0

    .line 1293
    :goto_0
    iput-boolean v0, p0, Landroid/support/v7/widget/b$b;->g:Z

    .line 1294
    if-nez v0, :cond_0

    if-eqz v10, :cond_1

    :cond_0
    move v7, v8

    :cond_1
    return v7

    .line 1278
    :cond_2
    invoke-direct {p0, p2}, Landroid/support/v7/widget/b$b;->a(Landroid/view/MotionEvent;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p0}, Landroid/support/v7/widget/b$b;->c()Z

    move-result v0

    if-nez v0, :cond_4

    :cond_3
    move v0, v8

    goto :goto_0

    :cond_4
    move v0, v7

    goto :goto_0

    .line 2333
    :cond_5
    iget-object v1, p0, Landroid/support/v7/widget/b$b;->d:Landroid/view/View;

    .line 2334
    invoke-virtual {v1}, Landroid/view/View;->isEnabled()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 2338
    invoke-static {p2}, Landroid/support/v4/view/n;->a(Landroid/view/MotionEvent;)I

    move-result v0

    .line 2339
    packed-switch v0, :pswitch_data_0

    :cond_6
    :goto_1
    move v0, v7

    .line 1281
    :goto_2
    if-eqz v0, :cond_b

    invoke-virtual {p0}, Landroid/support/v7/widget/b$b;->b()Z

    move-result v0

    if-eqz v0, :cond_b

    move v9, v8

    .line 1283
    :goto_3
    if-eqz v9, :cond_7

    .line 1285
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    .line 1286
    const/4 v4, 0x3

    move-wide v2, v0

    move v6, v5

    invoke-static/range {v0 .. v7}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    move-result-object v0

    .line 1288
    iget-object v1, p0, Landroid/support/v7/widget/b$b;->d:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 1289
    invoke-virtual {v0}, Landroid/view/MotionEvent;->recycle()V

    :cond_7
    move v0, v9

    goto :goto_0

    .line 2341
    :pswitch_0
    invoke-virtual {p2, v7}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v0

    iput v0, p0, Landroid/support/v7/widget/b$b;->i:I

    .line 2342
    iput-boolean v7, p0, Landroid/support/v7/widget/b$b;->h:Z

    .line 2344
    iget-object v0, p0, Landroid/support/v7/widget/b$b;->e:Ljava/lang/Runnable;

    if-nez v0, :cond_8

    .line 2345
    new-instance v0, Landroid/support/v7/widget/b$b$a;

    invoke-direct {v0, p0, v7}, Landroid/support/v7/widget/b$b$a;-><init>(Landroid/support/v7/widget/b$b;B)V

    iput-object v0, p0, Landroid/support/v7/widget/b$b;->e:Ljava/lang/Runnable;

    .line 2347
    :cond_8
    iget-object v0, p0, Landroid/support/v7/widget/b$b;->e:Ljava/lang/Runnable;

    iget v2, p0, Landroid/support/v7/widget/b$b;->b:I

    int-to-long v2, v2

    invoke-virtual {v1, v0, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 2348
    iget-object v0, p0, Landroid/support/v7/widget/b$b;->f:Ljava/lang/Runnable;

    if-nez v0, :cond_9

    .line 2349
    new-instance v0, Landroid/support/v7/widget/b$b$b;

    invoke-direct {v0, p0, v7}, Landroid/support/v7/widget/b$b$b;-><init>(Landroid/support/v7/widget/b$b;B)V

    iput-object v0, p0, Landroid/support/v7/widget/b$b;->f:Ljava/lang/Runnable;

    .line 2351
    :cond_9
    iget-object v0, p0, Landroid/support/v7/widget/b$b;->f:Ljava/lang/Runnable;

    iget v2, p0, Landroid/support/v7/widget/b$b;->c:I

    int-to-long v2, v2

    invoke-virtual {v1, v0, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_1

    .line 2354
    :pswitch_1
    iget v0, p0, Landroid/support/v7/widget/b$b;->i:I

    invoke-virtual {p2, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v0

    .line 2355
    if-ltz v0, :cond_6

    .line 2356
    invoke-virtual {p2, v0}, Landroid/view/MotionEvent;->getX(I)F

    move-result v2

    .line 2357
    invoke-virtual {p2, v0}, Landroid/view/MotionEvent;->getY(I)F

    move-result v0

    .line 2358
    iget v3, p0, Landroid/support/v7/widget/b$b;->a:F

    .line 2447
    neg-float v4, v3

    cmpl-float v4, v2, v4

    if-ltz v4, :cond_a

    neg-float v4, v3

    cmpl-float v4, v0, v4

    if-ltz v4, :cond_a

    invoke-virtual {v1}, Landroid/view/View;->getRight()I

    move-result v4

    invoke-virtual {v1}, Landroid/view/View;->getLeft()I

    move-result v6

    sub-int/2addr v4, v6

    int-to-float v4, v4

    add-float/2addr v4, v3

    cmpg-float v2, v2, v4

    if-gez v2, :cond_a

    invoke-virtual {v1}, Landroid/view/View;->getBottom()I

    move-result v2

    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    move-result v4

    sub-int/2addr v2, v4

    int-to-float v2, v2

    add-float/2addr v2, v3

    cmpg-float v0, v0, v2

    if-gez v0, :cond_a

    move v0, v8

    .line 2358
    :goto_4
    if-nez v0, :cond_6

    .line 2359
    invoke-direct {p0}, Landroid/support/v7/widget/b$b;->d()V

    .line 2362
    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    invoke-interface {v0, v8}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    move v0, v8

    .line 2363
    goto/16 :goto_2

    :cond_a
    move v0, v7

    .line 2447
    goto :goto_4

    .line 2369
    :pswitch_2
    invoke-direct {p0}, Landroid/support/v7/widget/b$b;->d()V

    goto/16 :goto_1

    :cond_b
    move v9, v7

    .line 1281
    goto/16 :goto_3

    .line 2339
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_2
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method
