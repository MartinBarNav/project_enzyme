.class final Lcom/saterskog/cell_lab/PlayActivity$3$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/saterskog/cell_lab/PlayActivity$3;->onClick(Landroid/content/DialogInterface;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/saterskog/cell_lab/PlayActivity$3;


# direct methods
.method constructor <init>(Lcom/saterskog/cell_lab/PlayActivity$3;)V
    .locals 0

    .prologue
    .line 1079
    iput-object p1, p0, Lcom/saterskog/cell_lab/PlayActivity$3$1;->a:Lcom/saterskog/cell_lab/PlayActivity$3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 1082
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity$3$1;->a:Lcom/saterskog/cell_lab/PlayActivity$3;

    iget-object v0, v0, Lcom/saterskog/cell_lab/PlayActivity$3;->a:Lcom/saterskog/cell_lab/p;

    iget-object v0, v0, Lcom/saterskog/cell_lab/p;->a:Lcom/saterskog/cell_lab/r;

    iget-object v0, v0, Lcom/saterskog/cell_lab/r;->a:Lcom/saterskog/cell_lab/q;

    .line 2080
    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/saterskog/cell_lab/q;->P:Z

    .line 1084
    return-void
.end method
