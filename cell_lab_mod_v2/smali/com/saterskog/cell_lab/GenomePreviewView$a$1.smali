.class final Lcom/saterskog/cell_lab/GenomePreviewView$a$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/saterskog/cell_lab/GenomePreviewView$a;->onSingleTapUp(Landroid/view/MotionEvent;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:F

.field final synthetic b:F

.field final synthetic c:Lcom/saterskog/cell_lab/GenomePreviewView$a;


# direct methods
.method constructor <init>(Lcom/saterskog/cell_lab/GenomePreviewView$a;FF)V
    .locals 0

    .prologue
    .line 177
    iput-object p1, p0, Lcom/saterskog/cell_lab/GenomePreviewView$a$1;->c:Lcom/saterskog/cell_lab/GenomePreviewView$a;

    iput p2, p0, Lcom/saterskog/cell_lab/GenomePreviewView$a$1;->a:F

    iput p3, p0, Lcom/saterskog/cell_lab/GenomePreviewView$a$1;->b:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .prologue
    .line 181
    iget-object v0, p0, Lcom/saterskog/cell_lab/GenomePreviewView$a$1;->c:Lcom/saterskog/cell_lab/GenomePreviewView$a;

    iget-object v0, v0, Lcom/saterskog/cell_lab/GenomePreviewView$a;->a:Lcom/saterskog/cell_lab/GenomePreviewView;

    iget-object v0, v0, Lcom/saterskog/cell_lab/GenomePreviewView;->a:Lcom/saterskog/cell_lab/n;

    iget v1, p0, Lcom/saterskog/cell_lab/GenomePreviewView$a$1;->a:F

    iget v2, p0, Lcom/saterskog/cell_lab/GenomePreviewView$a$1;->b:F

    .line 1221
    invoke-virtual {v0, v1}, Lcom/saterskog/cell_lab/n;->a(F)D

    move-result-wide v4

    iput-wide v4, v0, Lcom/saterskog/cell_lab/n;->q:D

    .line 1222
    invoke-virtual {v0, v2}, Lcom/saterskog/cell_lab/n;->b(F)D

    move-result-wide v2

    iput-wide v2, v0, Lcom/saterskog/cell_lab/n;->r:D

    .line 1223
    iget-object v1, v0, Lcom/saterskog/cell_lab/n;->p:Lcom/saterskog/cell_lab/CellWorld;

    iget-wide v2, v0, Lcom/saterskog/cell_lab/n;->q:D

    iget-wide v4, v0, Lcom/saterskog/cell_lab/n;->r:D

    invoke-virtual {v1, v2, v3, v4, v5}, Lcom/saterskog/cell_lab/CellWorld;->a(DD)I

    move-result v1

    .line 1224
    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    .line 1226
    iget-object v2, v0, Lcom/saterskog/cell_lab/n;->x:Lcom/saterskog/cell_lab/c;

    iget-object v0, v0, Lcom/saterskog/cell_lab/n;->p:Lcom/saterskog/cell_lab/CellWorld;

    iget-object v0, v0, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    aget-object v0, v0, v1

    iget v0, v0, Lcom/saterskog/cell_lab/Cell;->D:I

    invoke-interface {v2, v0}, Lcom/saterskog/cell_lab/c;->a(I)V

    .line 182
    :cond_0
    return-void
.end method
