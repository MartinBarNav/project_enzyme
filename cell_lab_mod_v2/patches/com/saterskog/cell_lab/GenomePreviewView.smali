.class public Lcom/saterskog/cell_lab/GenomePreviewView;
.super Landroid/opengl/GLSurfaceView;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/saterskog/cell_lab/GenomePreviewView$a;
    }
.end annotation


# instance fields
.field public final a:Lcom/saterskog/cell_lab/n;

.field b:F

.field c:F

.field d:F

.field e:F

.field f:F

.field g:I

.field h:Z

.field i:Landroid/view/GestureDetector;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 7

    .prologue
    const/16 v1, 0x8

    const/4 v4, 0x0

    .line 20
    invoke-direct {p0, p1, p2}, Landroid/opengl/GLSurfaceView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 22
    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lcom/saterskog/cell_lab/GenomePreviewView;->setEGLContextClientVersion(I)V

    .line 24
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/GenomePreviewView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 25
    const-string v2, "lock_preview"

    const/4 v3, 0x1

    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/saterskog/cell_lab/GenomePreviewView;->h:Z

    .line 29
    const/16 v5, 0x10

    move-object v0, p0

    move v2, v1

    move v3, v1

    move v6, v4

    invoke-virtual/range {v0 .. v6}, Lcom/saterskog/cell_lab/GenomePreviewView;->setEGLConfigChooser(IIIIII)V

    .line 34
    new-instance v0, Lcom/saterskog/cell_lab/n;

    invoke-direct {v0, p1}, Lcom/saterskog/cell_lab/n;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/saterskog/cell_lab/GenomePreviewView;->a:Lcom/saterskog/cell_lab/n;

    .line 35
    iget-object v0, p0, Lcom/saterskog/cell_lab/GenomePreviewView;->a:Lcom/saterskog/cell_lab/n;

    invoke-virtual {p0, v0}, Lcom/saterskog/cell_lab/GenomePreviewView;->setRenderer(Landroid/opengl/GLSurfaceView$Renderer;)V

    .line 36
    invoke-virtual {p0, v4}, Lcom/saterskog/cell_lab/GenomePreviewView;->setRenderMode(I)V

    .line 39
    const/4 v0, -0x1

    iput v0, p0, Lcom/saterskog/cell_lab/GenomePreviewView;->g:I

    .line 41
    new-instance v0, Landroid/view/GestureDetector;

    new-instance v1, Lcom/saterskog/cell_lab/GenomePreviewView$a;

    invoke-direct {v1, p0, v4}, Lcom/saterskog/cell_lab/GenomePreviewView$a;-><init>(Lcom/saterskog/cell_lab/GenomePreviewView;B)V

    invoke-direct {v0, p1, v1}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    iput-object v0, p0, Lcom/saterskog/cell_lab/GenomePreviewView;->i:Landroid/view/GestureDetector;

    .line 42
    return-void
.end method


# virtual methods
.method protected onMeasure(II)V
    .locals 7

    .prologue
    const/high16 v6, 0x40000000    # 2.0f

    const/16 v1, 0x190

    const/high16 v5, -0x80000000

    .line 53
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v3

    .line 54
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    .line 55
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v4

    .line 56
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v2

    .line 62
    if-ne v3, v6, :cond_1

    .line 72
    :goto_0
    div-int/lit8 v1, v0, 0x2

    .line 74
    if-ne v4, v6, :cond_3

    move v1, v2

    .line 86
    :cond_0
    :goto_1
    invoke-virtual {p0, v0, v1}, Lcom/saterskog/cell_lab/GenomePreviewView;->setMeasuredDimension(II)V

    .line 87
    return-void

    .line 65
    :cond_1
    if-ne v3, v5, :cond_2

    .line 67
    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    goto :goto_0

    :cond_2
    move v0, v1

    .line 70
    goto :goto_0

    .line 77
    :cond_3
    if-ne v4, v5, :cond_0

    .line 79
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    goto :goto_1
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 11

    .prologue
    const/high16 v9, 0x40000000    # 2.0f

    const/high16 v0, -0x40800000    # -1.0f

    const/4 v10, 0x2

    const/4 v8, 0x1

    .line 108
    iget-boolean v1, p0, Lcom/saterskog/cell_lab/GenomePreviewView;->h:Z

    if-nez v1, :cond_2

    .line 110
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v3

    .line 111
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v4

    .line 113
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v1

    if-ne v1, v10, :cond_4

    .line 114
    invoke-virtual {p1, v8}, Landroid/view/MotionEvent;->getX(I)F

    move-result v1

    .line 115
    invoke-virtual {p1, v8}, Landroid/view/MotionEvent;->getY(I)F

    move-result v5

    .line 116
    sub-float v0, v1, v3

    sub-float v2, v1, v3

    mul-float/2addr v0, v2

    sub-float v2, v5, v4

    sub-float v6, v5, v4

    mul-float/2addr v2, v6

    add-float/2addr v0, v2

    float-to-double v6, v0

    invoke-static {v6, v7}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v6

    double-to-float v0, v6

    .line 117
    add-float/2addr v1, v3

    div-float v2, v1, v9

    .line 118
    add-float v1, v4, v5

    div-float/2addr v1, v9

    .line 120
    :goto_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v5

    packed-switch v5, :pswitch_data_0

    .line 141
    :cond_0
    :goto_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v5

    if-ne v5, v10, :cond_1

    .line 142
    iput v2, p0, Lcom/saterskog/cell_lab/GenomePreviewView;->d:F

    .line 143
    iput v1, p0, Lcom/saterskog/cell_lab/GenomePreviewView;->e:F

    .line 144
    iput v0, p0, Lcom/saterskog/cell_lab/GenomePreviewView;->f:F

    .line 146
    :cond_1
    iput v3, p0, Lcom/saterskog/cell_lab/GenomePreviewView;->b:F

    .line 147
    iput v4, p0, Lcom/saterskog/cell_lab/GenomePreviewView;->c:F

    .line 148
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/GenomePreviewView;->g:I

    .line 150
    :cond_2
    iget-object v0, p0, Lcom/saterskog/cell_lab/GenomePreviewView;->i:Landroid/view/GestureDetector;

    invoke-virtual {v0, p1}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0

    .line 122
    :pswitch_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v5

    if-ne v5, v8, :cond_3

    iget v5, p0, Lcom/saterskog/cell_lab/GenomePreviewView;->g:I

    if-ne v5, v8, :cond_3

    .line 123
    iget v5, p0, Lcom/saterskog/cell_lab/GenomePreviewView;->b:F

    sub-float v5, v3, v5

    .line 124
    iget v6, p0, Lcom/saterskog/cell_lab/GenomePreviewView;->c:F

    sub-float v6, v4, v6

    .line 125
    iget-object v7, p0, Lcom/saterskog/cell_lab/GenomePreviewView;->a:Lcom/saterskog/cell_lab/n;

    invoke-virtual {v7, v5, v6}, Lcom/saterskog/cell_lab/n;->a(FF)V

    .line 126
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/GenomePreviewView;->requestRender()V

    .line 128
    :cond_3
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v5

    if-ne v5, v10, :cond_0

    iget v5, p0, Lcom/saterskog/cell_lab/GenomePreviewView;->g:I

    if-ne v5, v10, :cond_0

    .line 129
    iget v5, p0, Lcom/saterskog/cell_lab/GenomePreviewView;->d:F

    sub-float v5, v2, v5

    .line 130
    iget v6, p0, Lcom/saterskog/cell_lab/GenomePreviewView;->e:F

    sub-float v6, v1, v6

    .line 131
    iget-object v7, p0, Lcom/saterskog/cell_lab/GenomePreviewView;->a:Lcom/saterskog/cell_lab/n;

    invoke-virtual {v7, v5, v6}, Lcom/saterskog/cell_lab/n;->a(FF)V

    .line 132
    iput v2, p0, Lcom/saterskog/cell_lab/GenomePreviewView;->d:F

    .line 133
    iput v1, p0, Lcom/saterskog/cell_lab/GenomePreviewView;->e:F

    .line 134
    iget v5, p0, Lcom/saterskog/cell_lab/GenomePreviewView;->f:F

    div-float v5, v0, v5

    .line 135
    float-to-double v6, v5

    invoke-static {v6, v7}, Ljava/lang/Math;->log(D)D

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Math;->abs(D)D

    move-result-wide v6

    const-wide v8, 0x3fd3333333333333L    # 0.3

    cmpg-double v5, v6, v8

    if-gez v5, :cond_0

    .line 136
    iget-object v5, p0, Lcom/saterskog/cell_lab/GenomePreviewView;->a:Lcom/saterskog/cell_lab/n;

    iget v6, p0, Lcom/saterskog/cell_lab/GenomePreviewView;->f:F

    div-float v6, v0, v6

    invoke-virtual {v5, v6, v2, v1}, Lcom/saterskog/cell_lab/n;->a(FFF)V

    .line 137
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/GenomePreviewView;->requestRender()V

    goto :goto_1

    :cond_4
    move v1, v0

    move v2, v0

    goto :goto_0

    .line 120
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public setCallback(Lcom/saterskog/cell_lab/c;)V
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/saterskog/cell_lab/GenomePreviewView;->a:Lcom/saterskog/cell_lab/n;

    .line 1053
    iput-object p1, v0, Lcom/saterskog/cell_lab/n;->x:Lcom/saterskog/cell_lab/c;

    .line 46
    return-void
.end method
