.class final Lcom/saterskog/cell_lab/r$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/saterskog/cell_lab/r;->onTouchEvent(Landroid/view/MotionEvent;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:F

.field final synthetic c:F

.field final synthetic d:Lcom/saterskog/cell_lab/r;


# direct methods
.method constructor <init>(Lcom/saterskog/cell_lab/r;IFF)V
    .locals 0

    .prologue
    .line 69
    iput-object p1, p0, Lcom/saterskog/cell_lab/r$1;->d:Lcom/saterskog/cell_lab/r;

    iput p2, p0, Lcom/saterskog/cell_lab/r$1;->a:I

    iput p3, p0, Lcom/saterskog/cell_lab/r$1;->b:F

    iput p4, p0, Lcom/saterskog/cell_lab/r$1;->c:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .prologue
    .line 72
    iget-object v0, p0, Lcom/saterskog/cell_lab/r$1;->d:Lcom/saterskog/cell_lab/r;

    iget-object v0, v0, Lcom/saterskog/cell_lab/r;->a:Lcom/saterskog/cell_lab/q;

    iget v1, p0, Lcom/saterskog/cell_lab/r$1;->a:I

    iget v2, p0, Lcom/saterskog/cell_lab/r$1;->b:F

    iget v3, p0, Lcom/saterskog/cell_lab/r$1;->c:F

    .line 1889
    iget v4, v0, Lcom/saterskog/cell_lab/q;->ae:I

    const/16 v5, 0xc8

    if-ge v4, v5, :cond_0

    .line 1890
    iget-object v4, v0, Lcom/saterskog/cell_lab/q;->ah:[F

    iget v5, v0, Lcom/saterskog/cell_lab/q;->ae:I

    invoke-virtual {v0, v2}, Lcom/saterskog/cell_lab/q;->a(F)D

    move-result-wide v6

    double-to-float v2, v6

    aput v2, v4, v5

    .line 1891
    iget-object v2, v0, Lcom/saterskog/cell_lab/q;->ai:[F

    iget v4, v0, Lcom/saterskog/cell_lab/q;->ae:I

    invoke-virtual {v0, v3}, Lcom/saterskog/cell_lab/q;->b(F)D

    move-result-wide v6

    double-to-float v3, v6

    aput v3, v2, v4

    .line 1892
    iget-object v2, v0, Lcom/saterskog/cell_lab/q;->al:[I

    iget v3, v0, Lcom/saterskog/cell_lab/q;->ae:I

    aput v1, v2, v3

    .line 1893
    iget v1, v0, Lcom/saterskog/cell_lab/q;->ae:I

    add-int/lit8 v1, v1, 0x1

    iput v1, v0, Lcom/saterskog/cell_lab/q;->ae:I

    .line 73
    :cond_0
    return-void
.end method
