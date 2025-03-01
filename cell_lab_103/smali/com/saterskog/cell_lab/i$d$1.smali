.class final Lcom/saterskog/cell_lab/i$d$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/saterskog/cell_lab/i$d;-><init>(Lcom/saterskog/cell_lab/i;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/saterskog/cell_lab/i;

.field final synthetic b:Lcom/saterskog/cell_lab/i$d;


# direct methods
.method constructor <init>(Lcom/saterskog/cell_lab/i$d;Lcom/saterskog/cell_lab/i;)V
    .locals 0

    .prologue
    .line 742
    iput-object p1, p0, Lcom/saterskog/cell_lab/i$d$1;->b:Lcom/saterskog/cell_lab/i$d;

    iput-object p2, p0, Lcom/saterskog/cell_lab/i$d$1;->a:Lcom/saterskog/cell_lab/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .prologue
    .line 745
    invoke-interface {p1}, Landroid/content/DialogInterface;->cancel()V

    .line 746
    return-void
.end method
