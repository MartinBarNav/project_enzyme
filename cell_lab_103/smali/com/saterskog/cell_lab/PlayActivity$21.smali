.class final Lcom/saterskog/cell_lab/PlayActivity$21;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/saterskog/cell_lab/PlayActivity;->j()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/saterskog/cell_lab/PlayActivity;


# direct methods
.method constructor <init>(Lcom/saterskog/cell_lab/PlayActivity;)V
    .locals 0

    .prologue
    .line 797
    iput-object p1, p0, Lcom/saterskog/cell_lab/PlayActivity$21;->a:Lcom/saterskog/cell_lab/PlayActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    .prologue
    .line 800
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 801
    const-string v1, "go_to_donate"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 802
    iget-object v1, p0, Lcom/saterskog/cell_lab/PlayActivity$21;->a:Lcom/saterskog/cell_lab/PlayActivity;

    const/4 v2, -0x1

    invoke-virtual {v1, v2, v0}, Lcom/saterskog/cell_lab/PlayActivity;->setResult(ILandroid/content/Intent;)V

    .line 803
    return-void
.end method
