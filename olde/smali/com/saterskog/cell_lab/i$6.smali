.class final Lcom/saterskog/cell_lab/i$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/saterskog/cell_lab/i;->a(Ljava/lang/String;Ljava/lang/CharSequence;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/saterskog/cell_lab/i;


# direct methods
.method constructor <init>(Lcom/saterskog/cell_lab/i;)V
    .locals 0

    .prologue
    .line 2064
    iput-object p1, p0, Lcom/saterskog/cell_lab/i$6;->a:Lcom/saterskog/cell_lab/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    .prologue
    .line 2069
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$6;->a:Lcom/saterskog/cell_lab/i;

    invoke-static {v0}, Lcom/saterskog/cell_lab/i;->e(Lcom/saterskog/cell_lab/i;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2070
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$6;->a:Lcom/saterskog/cell_lab/i;

    invoke-virtual {v0}, Lcom/saterskog/cell_lab/i;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x4

    invoke-static {v0, v1, v2}, Lcom/saterskog/cell_lab/t;->b(Landroid/app/Activity;II)V

    .line 2071
    :cond_0
    invoke-interface {p1}, Landroid/content/DialogInterface;->cancel()V

    .line 2072
    return-void
.end method
