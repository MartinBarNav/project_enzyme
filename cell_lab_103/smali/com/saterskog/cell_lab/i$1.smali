.class final Lcom/saterskog/cell_lab/i$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/saterskog/cell_lab/i;->a(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Lcom/saterskog/cell_lab/i;


# direct methods
.method constructor <init>(Lcom/saterskog/cell_lab/i;I)V
    .locals 0

    .prologue
    .line 891
    iput-object p1, p0, Lcom/saterskog/cell_lab/i$1;->b:Lcom/saterskog/cell_lab/i;

    iput p2, p0, Lcom/saterskog/cell_lab/i$1;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 895
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$1;->b:Lcom/saterskog/cell_lab/i;

    iget v1, p0, Lcom/saterskog/cell_lab/i$1;->a:I

    iput v1, v0, Lcom/saterskog/cell_lab/i;->c:I

    .line 896
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$1;->b:Lcom/saterskog/cell_lab/i;

    invoke-virtual {v0, v2, v2}, Lcom/saterskog/cell_lab/i;->a(ZZ)V

    .line 897
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$1;->b:Lcom/saterskog/cell_lab/i;

    invoke-virtual {v0}, Lcom/saterskog/cell_lab/i;->a()V

    .line 898
    return-void
.end method
