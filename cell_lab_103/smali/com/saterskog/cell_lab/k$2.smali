.class final Lcom/saterskog/cell_lab/k$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/saterskog/cell_lab/k;->onItemLongClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Lcom/saterskog/cell_lab/k;


# direct methods
.method constructor <init>(Lcom/saterskog/cell_lab/k;I)V
    .locals 0

    .prologue
    .line 187
    iput-object p1, p0, Lcom/saterskog/cell_lab/k$2;->b:Lcom/saterskog/cell_lab/k;

    iput p2, p0, Lcom/saterskog/cell_lab/k$2;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .prologue
    .line 190
    iget-object v0, p0, Lcom/saterskog/cell_lab/k$2;->b:Lcom/saterskog/cell_lab/k;

    iget v1, p0, Lcom/saterskog/cell_lab/k$2;->a:I

    invoke-static {v0, v1}, Lcom/saterskog/cell_lab/k;->a(Lcom/saterskog/cell_lab/k;I)V

    .line 191
    return-void
.end method
