.class final Lcom/saterskog/cell_lab/GenomePreviewView$a;
.super Landroid/view/GestureDetector$SimpleOnGestureListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/saterskog/cell_lab/GenomePreviewView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/saterskog/cell_lab/GenomePreviewView;


# direct methods
.method private constructor <init>(Lcom/saterskog/cell_lab/GenomePreviewView;)V
    .locals 0

    .prologue
    .line 152
    iput-object p1, p0, Lcom/saterskog/cell_lab/GenomePreviewView$a;->a:Lcom/saterskog/cell_lab/GenomePreviewView;

    invoke-direct {p0}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/saterskog/cell_lab/GenomePreviewView;B)V
    .locals 0

    .prologue
    .line 152
    invoke-direct {p0, p1}, Lcom/saterskog/cell_lab/GenomePreviewView$a;-><init>(Lcom/saterskog/cell_lab/GenomePreviewView;)V

    return-void
.end method


# virtual methods
.method public final onDoubleTap(Landroid/view/MotionEvent;)Z
    .locals 1

    .prologue
    .line 170
    const/4 v0, 0x1

    return v0
.end method

.method public final onDown(Landroid/view/MotionEvent;)Z
    .locals 1

    .prologue
    .line 155
    const/4 v0, 0x1

    return v0
.end method

.method public final onSingleTapUp(Landroid/view/MotionEvent;)Z
    .locals 4

    .prologue
    .line 174
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    .line 175
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    .line 176
    iget-object v2, p0, Lcom/saterskog/cell_lab/GenomePreviewView$a;->a:Lcom/saterskog/cell_lab/GenomePreviewView;

    new-instance v3, Lcom/saterskog/cell_lab/GenomePreviewView$a$1;

    invoke-direct {v3, p0, v0, v1}, Lcom/saterskog/cell_lab/GenomePreviewView$a$1;-><init>(Lcom/saterskog/cell_lab/GenomePreviewView$a;FF)V

    invoke-virtual {v2, v3}, Lcom/saterskog/cell_lab/GenomePreviewView;->queueEvent(Ljava/lang/Runnable;)V

    .line 184
    const/4 v0, 0x1

    return v0
.end method
