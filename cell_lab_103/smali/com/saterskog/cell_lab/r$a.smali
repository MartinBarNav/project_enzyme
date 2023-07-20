.class final Lcom/saterskog/cell_lab/r$a;
.super Landroid/view/GestureDetector$SimpleOnGestureListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/saterskog/cell_lab/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/saterskog/cell_lab/r;


# direct methods
.method private constructor <init>(Lcom/saterskog/cell_lab/r;)V
    .locals 0

    .prologue
    .line 184
    iput-object p1, p0, Lcom/saterskog/cell_lab/r$a;->a:Lcom/saterskog/cell_lab/r;

    invoke-direct {p0}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/saterskog/cell_lab/r;B)V
    .locals 0

    .prologue
    .line 184
    invoke-direct {p0, p1}, Lcom/saterskog/cell_lab/r$a;-><init>(Lcom/saterskog/cell_lab/r;)V

    return-void
.end method


# virtual methods
.method public final onDoubleTap(Landroid/view/MotionEvent;)Z
    .locals 1

    .prologue
    .line 203
    const/4 v0, 0x1

    return v0
.end method

.method public final onDown(Landroid/view/MotionEvent;)Z
    .locals 1

    .prologue
    .line 188
    const/4 v0, 0x1

    return v0
.end method

.method public final onFling(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 5

    .prologue
    const/4 v4, 0x1

    .line 221
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-object v2, p0, Lcom/saterskog/cell_lab/r$a;->a:Lcom/saterskog/cell_lab/r;

    iget-wide v2, v2, Lcom/saterskog/cell_lab/r;->j:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0xc8

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    .line 222
    iget-object v0, p0, Lcom/saterskog/cell_lab/r$a;->a:Lcom/saterskog/cell_lab/r;

    iget-object v1, v0, Lcom/saterskog/cell_lab/r;->a:Lcom/saterskog/cell_lab/q;

    .line 2099
    iget v0, v1, Lcom/saterskog/cell_lab/q;->A:I

    if-ne v0, v4, :cond_0

    .line 2100
    const/4 v0, 0x0

    :goto_0
    const/16 v2, 0x14

    if-ge v0, v2, :cond_0

    .line 2101
    iget-object v2, v1, Lcom/saterskog/cell_lab/q;->Z:[Z

    aget-boolean v2, v2, v0

    if-nez v2, :cond_1

    .line 2100
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 2103
    :cond_0
    iput p3, v1, Lcom/saterskog/cell_lab/q;->S:F

    .line 2104
    iput p4, v1, Lcom/saterskog/cell_lab/q;->T:F

    .line 224
    :cond_1
    return v4
.end method

.method public final onSingleTapUp(Landroid/view/MotionEvent;)Z
    .locals 4

    .prologue
    .line 207
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    .line 208
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    .line 209
    iget-object v2, p0, Lcom/saterskog/cell_lab/r$a;->a:Lcom/saterskog/cell_lab/r;

    new-instance v3, Lcom/saterskog/cell_lab/r$a$1;

    invoke-direct {v3, p0, v0, v1}, Lcom/saterskog/cell_lab/r$a$1;-><init>(Lcom/saterskog/cell_lab/r$a;FF)V

    invoke-virtual {v2, v3}, Lcom/saterskog/cell_lab/r;->queueEvent(Ljava/lang/Runnable;)V

    .line 217
    const/4 v0, 0x1

    return v0
.end method
