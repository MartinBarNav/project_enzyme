.class final Lcom/saterskog/cell_lab/m$2$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/saterskog/cell_lab/m$2;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/saterskog/cell_lab/m$2;


# direct methods
.method constructor <init>(Lcom/saterskog/cell_lab/m$2;)V
    .locals 0

    .prologue
    .line 91
    iput-object p1, p0, Lcom/saterskog/cell_lab/m$2$1;->a:Lcom/saterskog/cell_lab/m$2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .prologue
    .line 94
    invoke-interface {p1}, Landroid/content/DialogInterface;->cancel()V

    .line 95
    return-void
.end method
