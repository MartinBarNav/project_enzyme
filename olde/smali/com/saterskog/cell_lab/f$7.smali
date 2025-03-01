.class final Lcom/saterskog/cell_lab/f$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/saterskog/cell_lab/f;->onItemLongClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/saterskog/cell_lab/f;


# direct methods
.method constructor <init>(Lcom/saterskog/cell_lab/f;)V
    .locals 0

    .prologue
    .line 436
    iput-object p1, p0, Lcom/saterskog/cell_lab/f$7;->a:Lcom/saterskog/cell_lab/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .prologue
    .line 439
    invoke-interface {p1}, Landroid/content/DialogInterface;->cancel()V

    .line 440
    return-void
.end method
