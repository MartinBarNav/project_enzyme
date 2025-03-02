.class final Lcom/saterskog/cell_lab/m$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/saterskog/cell_lab/m$1;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/saterskog/cell_lab/m$1;


# direct methods
.method constructor <init>(Lcom/saterskog/cell_lab/m$1;)V
    .locals 0

    .prologue
    .line 66
    iput-object p1, p0, Lcom/saterskog/cell_lab/m$1$1;->a:Lcom/saterskog/cell_lab/m$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .prologue
    .line 69
    invoke-interface {p1}, Landroid/content/DialogInterface;->cancel()V

    .line 70
    return-void
.end method
