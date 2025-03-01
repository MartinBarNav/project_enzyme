.class public final Lcom/saterskog/cell_lab/r;
.super Landroid/opengl/GLSurfaceView;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/saterskog/cell_lab/r$a;
    }
.end annotation


# instance fields
.field public final a:Lcom/saterskog/cell_lab/q;

.field b:F

.field c:F

.field d:F

.field e:F

.field f:F

.field g:Z

.field h:I

.field i:Landroid/view/GestureDetector;

.field j:J

.field k:Lcom/saterskog/cell_lab/q$a;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Lcom/saterskog/cell_lab/CellWorld;Lcom/saterskog/cell_lab/p$a;Lcom/saterskog/cell_lab/q$a;ID)V
    .locals 8

    .prologue
    .line 21
    invoke-direct {p0, p1}, Landroid/opengl/GLSurfaceView;-><init>(Landroid/content/Context;)V

    .line 23
    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lcom/saterskog/cell_lab/r;->setEGLContextClientVersion(I)V

    .line 27
    const/16 v1, 0x8

    const/16 v2, 0x8

    const/16 v3, 0x8

    const/4 v4, 0x0

    const/16 v5, 0x10

    const/4 v6, 0x0

    move-object v0, p0

    invoke-virtual/range {v0 .. v6}, Lcom/saterskog/cell_lab/r;->setEGLConfigChooser(IIIIII)V

    .line 30
    new-instance v0, Lcom/saterskog/cell_lab/q;

    move-object v1, p2

    move-object v2, p1

    move-object v3, p3

    move-object v4, p4

    move v5, p5

    move-wide v6, p6

    invoke-direct/range {v0 .. v7}, Lcom/saterskog/cell_lab/q;-><init>(Lcom/saterskog/cell_lab/CellWorld;Landroid/app/Activity;Lcom/saterskog/cell_lab/p$a;Lcom/saterskog/cell_lab/q$a;ID)V

    iput-object v0, p0, Lcom/saterskog/cell_lab/r;->a:Lcom/saterskog/cell_lab/q;

    .line 31
    iget-object v0, p0, Lcom/saterskog/cell_lab/r;->a:Lcom/saterskog/cell_lab/q;

    invoke-virtual {p0, v0}, Lcom/saterskog/cell_lab/r;->setRenderer(Landroid/opengl/GLSurfaceView$Renderer;)V

    .line 32
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/saterskog/cell_lab/r;->setRenderMode(I)V

    .line 34
    iput-object p4, p0, Lcom/saterskog/cell_lab/r;->k:Lcom/saterskog/cell_lab/q$a;

    .line 35
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/saterskog/cell_lab/r;->g:Z

    .line 36
    const/4 v0, -0x1

    iput v0, p0, Lcom/saterskog/cell_lab/r;->h:I

    .line 37
    new-instance v0, Landroid/view/GestureDetector;

    new-instance v1, Lcom/saterskog/cell_lab/r$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/saterskog/cell_lab/r$a;-><init>(Lcom/saterskog/cell_lab/r;B)V

    invoke-direct {v0, p1, v1}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    iput-object v0, p0, Lcom/saterskog/cell_lab/r;->i:Landroid/view/GestureDetector;

    .line 39
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/saterskog/cell_lab/r;->j:J

    .line 40
    return-void
.end method


# virtual methods
.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 12

    .prologue
    const/4 v0, 0x0

    const/high16 v8, 0x40000000    # 2.0f

    const/4 v11, 0x2

    const/high16 v1, -0x40800000    # -1.0f

    const/4 v10, 0x1

    .line 59
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v2

    .line 60
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v3

    .line 63
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v4

    packed-switch v4, :pswitch_data_0

    .line 116
    :cond_0
    :goto_0
    :pswitch_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v4

    .line 117
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v5

    .line 119
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v0

    if-eq v0, v11, :cond_1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v0

    const/4 v2, 0x3

    if-ne v0, v2, :cond_5

    .line 121
    :cond_1
    invoke-virtual {p1, v10}, Landroid/view/MotionEvent;->getX(I)F

    move-result v0

    .line 122
    invoke-virtual {p1, v10}, Landroid/view/MotionEvent;->getY(I)F

    move-result v6

    .line 123
    sub-float v2, v0, v4

    sub-float v3, v0, v4

    mul-float/2addr v2, v3

    sub-float v3, v6, v5

    sub-float v7, v6, v5

    mul-float/2addr v3, v7

    add-float/2addr v2, v3

    float-to-double v2, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v2

    double-to-float v3, v2

    .line 124
    add-float/2addr v0, v4

    div-float v2, v0, v8

    .line 125
    add-float v0, v5, v6

    div-float/2addr v0, v8

    .line 137
    :goto_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v6

    packed-switch v6, :pswitch_data_1

    .line 171
    :cond_2
    :goto_2
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v1

    if-ne v1, v11, :cond_3

    .line 172
    iput v2, p0, Lcom/saterskog/cell_lab/r;->d:F

    .line 173
    iput v0, p0, Lcom/saterskog/cell_lab/r;->e:F

    .line 174
    iput v3, p0, Lcom/saterskog/cell_lab/r;->f:F

    .line 176
    :cond_3
    iput v4, p0, Lcom/saterskog/cell_lab/r;->b:F

    .line 177
    iput v5, p0, Lcom/saterskog/cell_lab/r;->c:F

    .line 178
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/r;->h:I

    .line 181
    iget-object v0, p0, Lcom/saterskog/cell_lab/r;->i:Landroid/view/GestureDetector;

    invoke-virtual {v0, p1}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 182
    return v10

    .line 65
    :goto_3
    :pswitch_1
    if-ge v0, v2, :cond_0

    .line 66
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v3

    .line 67
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getX(I)F

    move-result v4

    .line 68
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F

    move-result v5

    .line 69
    new-instance v6, Lcom/saterskog/cell_lab/r$1;

    invoke-direct {v6, p0, v3, v4, v5}, Lcom/saterskog/cell_lab/r$1;-><init>(Lcom/saterskog/cell_lab/r;IFF)V

    invoke-virtual {p0, v6}, Lcom/saterskog/cell_lab/r;->queueEvent(Ljava/lang/Runnable;)V

    .line 65
    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    .line 80
    :pswitch_2
    invoke-virtual {p1, v3}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v0

    .line 81
    invoke-virtual {p1, v3}, Landroid/view/MotionEvent;->getX(I)F

    move-result v2

    .line 82
    invoke-virtual {p1, v3}, Landroid/view/MotionEvent;->getY(I)F

    move-result v3

    .line 83
    new-instance v4, Lcom/saterskog/cell_lab/r$2;

    invoke-direct {v4, p0, v0, v2, v3}, Lcom/saterskog/cell_lab/r$2;-><init>(Lcom/saterskog/cell_lab/r;IFF)V

    invoke-virtual {p0, v4}, Lcom/saterskog/cell_lab/r;->queueEvent(Ljava/lang/Runnable;)V

    goto/16 :goto_0

    .line 92
    :pswitch_3
    invoke-virtual {p1, v3}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v0

    .line 93
    new-instance v2, Lcom/saterskog/cell_lab/r$3;

    invoke-direct {v2, p0, v0}, Lcom/saterskog/cell_lab/r$3;-><init>(Lcom/saterskog/cell_lab/r;I)V

    invoke-virtual {p0, v2}, Lcom/saterskog/cell_lab/r;->queueEvent(Ljava/lang/Runnable;)V

    goto/16 :goto_0

    .line 99
    :goto_4
    :pswitch_4
    if-ge v0, v2, :cond_0

    .line 100
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v3

    .line 101
    new-instance v4, Lcom/saterskog/cell_lab/r$4;

    invoke-direct {v4, p0, v3}, Lcom/saterskog/cell_lab/r$4;-><init>(Lcom/saterskog/cell_lab/r;I)V

    invoke-virtual {p0, v4}, Lcom/saterskog/cell_lab/r;->queueEvent(Ljava/lang/Runnable;)V

    .line 99
    add-int/lit8 v0, v0, 0x1

    goto :goto_4

    .line 139
    :pswitch_5
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v1

    if-ne v1, v10, :cond_4

    iget v1, p0, Lcom/saterskog/cell_lab/r;->h:I

    if-ne v1, v10, :cond_4

    .line 140
    iget v1, p0, Lcom/saterskog/cell_lab/r;->b:F

    sub-float v1, v4, v1

    .line 141
    iget v6, p0, Lcom/saterskog/cell_lab/r;->c:F

    sub-float v6, v5, v6

    .line 142
    iget-object v7, p0, Lcom/saterskog/cell_lab/r;->a:Lcom/saterskog/cell_lab/q;

    invoke-virtual {v7, v1, v6}, Lcom/saterskog/cell_lab/q;->a(FF)V

    .line 145
    :cond_4
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v1

    if-ne v1, v11, :cond_2

    iget v1, p0, Lcom/saterskog/cell_lab/r;->h:I

    if-ne v1, v11, :cond_2

    .line 146
    iget v1, p0, Lcom/saterskog/cell_lab/r;->d:F

    sub-float v1, v2, v1

    .line 147
    iget v6, p0, Lcom/saterskog/cell_lab/r;->e:F

    sub-float v6, v0, v6

    .line 148
    iget-object v7, p0, Lcom/saterskog/cell_lab/r;->a:Lcom/saterskog/cell_lab/q;

    invoke-virtual {v7, v1, v6}, Lcom/saterskog/cell_lab/q;->a(FF)V

    .line 149
    iput v2, p0, Lcom/saterskog/cell_lab/r;->d:F

    .line 150
    iput v0, p0, Lcom/saterskog/cell_lab/r;->e:F

    .line 152
    iget v1, p0, Lcom/saterskog/cell_lab/r;->f:F

    div-float v1, v3, v1

    .line 154
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    iput-wide v6, p0, Lcom/saterskog/cell_lab/r;->j:J

    .line 155
    float-to-double v6, v1

    invoke-static {v6, v7}, Ljava/lang/Math;->log(D)D

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Math;->abs(D)D

    move-result-wide v6

    const-wide v8, 0x3fd3333333333333L    # 0.3

    cmpg-double v6, v6, v8

    if-gez v6, :cond_2

    .line 156
    iget-object v6, p0, Lcom/saterskog/cell_lab/r;->a:Lcom/saterskog/cell_lab/q;

    invoke-virtual {v6, v1, v2, v0}, Lcom/saterskog/cell_lab/q;->a(FFF)V

    goto/16 :goto_2

    .line 162
    :pswitch_6
    iget-object v6, p0, Lcom/saterskog/cell_lab/r;->k:Lcom/saterskog/cell_lab/q$a;

    invoke-interface {v6, v1}, Lcom/saterskog/cell_lab/q$a;->a(F)V

    goto/16 :goto_2

    :cond_5
    move v0, v1

    move v2, v1

    move v3, v1

    goto/16 :goto_1

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_3
        :pswitch_1
        :pswitch_4
        :pswitch_0
        :pswitch_2
        :pswitch_3
    .end packed-switch

    .line 137
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
    .end packed-switch
.end method
