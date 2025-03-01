.class final Lcom/saterskog/cell_lab/PlayActivity$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/saterskog/cell_lab/PlayActivity;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/saterskog/cell_lab/p;

.field final synthetic b:Lcom/saterskog/cell_lab/PlayActivity;


# direct methods
.method constructor <init>(Lcom/saterskog/cell_lab/PlayActivity;Lcom/saterskog/cell_lab/p;)V
    .locals 0

    .prologue
    .line 1076
    iput-object p1, p0, Lcom/saterskog/cell_lab/PlayActivity$3;->b:Lcom/saterskog/cell_lab/PlayActivity;

    iput-object p2, p0, Lcom/saterskog/cell_lab/PlayActivity$3;->a:Lcom/saterskog/cell_lab/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .prologue
    .line 1079
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity$3;->a:Lcom/saterskog/cell_lab/p;

    iget-object v0, v0, Lcom/saterskog/cell_lab/p;->a:Lcom/saterskog/cell_lab/r;

    new-instance v1, Lcom/saterskog/cell_lab/PlayActivity$3$1;

    invoke-direct {v1, p0}, Lcom/saterskog/cell_lab/PlayActivity$3$1;-><init>(Lcom/saterskog/cell_lab/PlayActivity$3;)V

    invoke-virtual {v0, v1}, Lcom/saterskog/cell_lab/r;->queueEvent(Ljava/lang/Runnable;)V

    .line 1086
    return-void
.end method
