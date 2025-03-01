.class public final Lcom/saterskog/cell_lab/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:D

.field public b:D

.field public c:D

.field public d:D

.field public final e:[F


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    const/4 v0, 0x4

    new-array v0, v0, [F

    iput-object v0, p0, Lcom/saterskog/cell_lab/e;->e:[F

    return-void
.end method
