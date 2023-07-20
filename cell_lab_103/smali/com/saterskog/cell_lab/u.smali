.class public final Lcom/saterskog/cell_lab/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable",
        "<",
        "Lcom/saterskog/cell_lab/u;",
        ">;"
    }
.end annotation


# instance fields
.field a:D

.field b:D

.field c:D

.field d:D

.field e:Z

.field f:Z

.field g:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/saterskog/cell_lab/u;)I
    .locals 8

    .prologue
    const-wide/16 v6, 0x0

    const/4 v0, 0x1

    const/4 v1, -0x1

    .line 11
    iget-boolean v2, p0, Lcom/saterskog/cell_lab/u;->e:Z

    if-eqz v2, :cond_1

    iget-boolean v2, p1, Lcom/saterskog/cell_lab/u;->e:Z

    if-eqz v2, :cond_1

    const/4 v0, 0x0

    .line 16
    :cond_0
    :goto_0
    return v0

    .line 12
    :cond_1
    iget-boolean v2, p0, Lcom/saterskog/cell_lab/u;->e:Z

    if-nez v2, :cond_0

    .line 13
    iget-boolean v2, p1, Lcom/saterskog/cell_lab/u;->e:Z

    if-eqz v2, :cond_2

    move v0, v1

    goto :goto_0

    .line 14
    :cond_2
    iget-wide v2, p1, Lcom/saterskog/cell_lab/u;->b:D

    iget-wide v4, p0, Lcom/saterskog/cell_lab/u;->b:D

    mul-double/2addr v2, v4

    cmpg-double v2, v2, v6

    if-gez v2, :cond_3

    iget-wide v2, p0, Lcom/saterskog/cell_lab/u;->b:D

    cmpl-double v2, v2, v6

    if-lez v2, :cond_0

    move v0, v1

    goto :goto_0

    .line 16
    :cond_3
    iget-wide v2, p1, Lcom/saterskog/cell_lab/u;->b:D

    iget-wide v4, p0, Lcom/saterskog/cell_lab/u;->a:D

    mul-double/2addr v2, v4

    iget-wide v4, p0, Lcom/saterskog/cell_lab/u;->b:D

    iget-wide v6, p1, Lcom/saterskog/cell_lab/u;->a:D

    mul-double/2addr v4, v6

    cmpl-double v2, v2, v4

    if-lez v2, :cond_0

    move v0, v1

    goto :goto_0
.end method

.method public final synthetic compareTo(Ljava/lang/Object;)I
    .locals 1

    .prologue
    .line 3
    check-cast p1, Lcom/saterskog/cell_lab/u;

    invoke-virtual {p0, p1}, Lcom/saterskog/cell_lab/u;->a(Lcom/saterskog/cell_lab/u;)I

    move-result v0

    return v0
.end method
