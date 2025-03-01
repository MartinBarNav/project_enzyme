.class final Lcom/saterskog/cell_lab/r$a$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/saterskog/cell_lab/r$a;->onSingleTapUp(Landroid/view/MotionEvent;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:F

.field final synthetic b:F

.field final synthetic c:Lcom/saterskog/cell_lab/r$a;


# direct methods
.method constructor <init>(Lcom/saterskog/cell_lab/r$a;FF)V
    .locals 0

    .prologue
    .line 210
    iput-object p1, p0, Lcom/saterskog/cell_lab/r$a$1;->c:Lcom/saterskog/cell_lab/r$a;

    iput p2, p0, Lcom/saterskog/cell_lab/r$a$1;->a:F

    iput p3, p0, Lcom/saterskog/cell_lab/r$a$1;->b:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .prologue
    .line 214
    iget-object v0, p0, Lcom/saterskog/cell_lab/r$a$1;->c:Lcom/saterskog/cell_lab/r$a;

    iget-object v0, v0, Lcom/saterskog/cell_lab/r$a;->a:Lcom/saterskog/cell_lab/r;

    iget-object v0, v0, Lcom/saterskog/cell_lab/r;->a:Lcom/saterskog/cell_lab/q;

    iget v1, p0, Lcom/saterskog/cell_lab/r$a$1;->a:F

    iget v2, p0, Lcom/saterskog/cell_lab/r$a$1;->b:F

    .line 2061
    invoke-virtual {v0, v1}, Lcom/saterskog/cell_lab/q;->a(F)D

    move-result-wide v4

    iput-wide v4, v0, Lcom/saterskog/cell_lab/q;->v:D

    .line 2062
    invoke-virtual {v0, v2}, Lcom/saterskog/cell_lab/q;->b(F)D

    move-result-wide v2

    iput-wide v2, v0, Lcom/saterskog/cell_lab/q;->w:D

    .line 2063
    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/saterskog/cell_lab/q;->u:Z

    .line 215
    return-void
.end method
