.class final Lcom/saterskog/cell_lab/i$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/saterskog/cell_lab/i;->onClick(Landroid/view/View;)V
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
    .line 1953
    iput-object p1, p0, Lcom/saterskog/cell_lab/i$5;->a:Lcom/saterskog/cell_lab/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .prologue
    .line 1955
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$5;->a:Lcom/saterskog/cell_lab/i;

    invoke-virtual {v0, p2}, Lcom/saterskog/cell_lab/i;->b(I)Z

    .line 1956
    return-void
.end method
