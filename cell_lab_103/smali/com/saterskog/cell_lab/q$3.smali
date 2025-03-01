.class final Lcom/saterskog/cell_lab/q$3;
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
.field final synthetic a:Lcom/saterskog/cell_lab/q;


# direct methods
.method constructor <init>(Lcom/saterskog/cell_lab/q;)V
    .locals 0

    .prologue
    .line 355
    iput-object p1, p0, Lcom/saterskog/cell_lab/q$3;->a:Lcom/saterskog/cell_lab/q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .prologue
    const/4 v1, 0x0

    .line 358
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    :cond_0
    move v0, v1

    .line 360
    :goto_0
    const/16 v4, 0xf

    if-ge v0, v4, :cond_1

    .line 361
    iget-object v4, p0, Lcom/saterskog/cell_lab/q$3;->a:Lcom/saterskog/cell_lab/q;

    invoke-static {v4, v1}, Lcom/saterskog/cell_lab/q;->a(Lcom/saterskog/cell_lab/q;Z)V

    .line 360
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 362
    :cond_1
    iget-object v0, p0, Lcom/saterskog/cell_lab/q$3;->a:Lcom/saterskog/cell_lab/q;

    iget v0, v0, Lcom/saterskog/cell_lab/q;->B:I

    const/4 v4, -0x1

    if-eq v0, v4, :cond_2

    iget-object v0, p0, Lcom/saterskog/cell_lab/q$3;->a:Lcom/saterskog/cell_lab/q;

    iget v0, v0, Lcom/saterskog/cell_lab/q;->B:I

    iget-object v4, p0, Lcom/saterskog/cell_lab/q$3;->a:Lcom/saterskog/cell_lab/q;

    iget-object v4, v4, Lcom/saterskog/cell_lab/q;->r:Lcom/saterskog/cell_lab/CellWorld;

    invoke-static {v0, v4}, Lcom/saterskog/cell_lab/j;->a(ILcom/saterskog/cell_lab/CellWorld;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/saterskog/cell_lab/q$3;->a:Lcom/saterskog/cell_lab/q;

    iget-boolean v0, v0, Lcom/saterskog/cell_lab/q;->M:Z

    if-eqz v0, :cond_3

    .line 366
    :cond_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sub-long/2addr v4, v2

    const-wide/16 v6, 0x32

    cmp-long v0, v4, v6

    if-ltz v0, :cond_0

    .line 368
    :cond_3
    iget-object v0, p0, Lcom/saterskog/cell_lab/q$3;->a:Lcom/saterskog/cell_lab/q;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/saterskog/cell_lab/q;->a(Lcom/saterskog/cell_lab/q;Z)V

    .line 369
    return-void
.end method
