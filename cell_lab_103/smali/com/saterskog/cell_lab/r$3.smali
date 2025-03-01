.class final Lcom/saterskog/cell_lab/r$3;
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

.field final synthetic b:Lcom/saterskog/cell_lab/r;


# direct methods
.method constructor <init>(Lcom/saterskog/cell_lab/r;I)V
    .locals 0

    .prologue
    .line 93
    iput-object p1, p0, Lcom/saterskog/cell_lab/r$3;->b:Lcom/saterskog/cell_lab/r;

    iput p2, p0, Lcom/saterskog/cell_lab/r$3;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 96
    iget-object v0, p0, Lcom/saterskog/cell_lab/r$3;->b:Lcom/saterskog/cell_lab/r;

    iget-object v0, v0, Lcom/saterskog/cell_lab/r;->a:Lcom/saterskog/cell_lab/q;

    iget v1, p0, Lcom/saterskog/cell_lab/r$3;->a:I

    invoke-virtual {v0, v1}, Lcom/saterskog/cell_lab/q;->a(I)V

    return-void
.end method
