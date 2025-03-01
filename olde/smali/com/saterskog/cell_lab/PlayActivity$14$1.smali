.class final Lcom/saterskog/cell_lab/PlayActivity$14$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/saterskog/cell_lab/PlayActivity$14;->onClick(Landroid/content/DialogInterface;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/saterskog/cell_lab/p;

.field final synthetic b:I

.field final synthetic c:Lcom/saterskog/cell_lab/PlayActivity$14;


# direct methods
.method constructor <init>(Lcom/saterskog/cell_lab/PlayActivity$14;Lcom/saterskog/cell_lab/p;I)V
    .locals 0

    .prologue
    .line 1481
    iput-object p1, p0, Lcom/saterskog/cell_lab/PlayActivity$14$1;->c:Lcom/saterskog/cell_lab/PlayActivity$14;

    iput-object p2, p0, Lcom/saterskog/cell_lab/PlayActivity$14$1;->a:Lcom/saterskog/cell_lab/p;

    iput p3, p0, Lcom/saterskog/cell_lab/PlayActivity$14$1;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 1484
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity$14$1;->a:Lcom/saterskog/cell_lab/p;

    iget-object v0, v0, Lcom/saterskog/cell_lab/p;->a:Lcom/saterskog/cell_lab/r;

    iget-object v0, v0, Lcom/saterskog/cell_lab/r;->a:Lcom/saterskog/cell_lab/q;

    iget v1, p0, Lcom/saterskog/cell_lab/PlayActivity$14$1;->b:I

    iput v1, v0, Lcom/saterskog/cell_lab/q;->A:I

    .line 1485
    return-void
.end method
