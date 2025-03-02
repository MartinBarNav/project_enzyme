.class final Lcom/saterskog/cell_lab/q$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/saterskog/cell_lab/q;->a([F)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:D

.field final synthetic b:Lcom/saterskog/cell_lab/q;


# direct methods
.method constructor <init>(Lcom/saterskog/cell_lab/q;D)V
    .locals 0

    .prologue
    .line 339
    iput-object p1, p0, Lcom/saterskog/cell_lab/q$1;->b:Lcom/saterskog/cell_lab/q;

    iput-wide p2, p0, Lcom/saterskog/cell_lab/q$1;->a:D

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .prologue
    .line 342
    iget-object v0, p0, Lcom/saterskog/cell_lab/q$1;->b:Lcom/saterskog/cell_lab/q;

    iget-object v0, v0, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    const/4 v1, 0x1

    iget-wide v2, p0, Lcom/saterskog/cell_lab/q$1;->a:D

    invoke-virtual {v0, v1, v2, v3}, Lcom/saterskog/cell_lab/CellWorld;->b(ZD)V

    .line 343
    return-void
.end method
