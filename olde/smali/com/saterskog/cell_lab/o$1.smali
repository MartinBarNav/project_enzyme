.class final Lcom/saterskog/cell_lab/o$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/saterskog/cell_lab/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/saterskog/cell_lab/o;


# direct methods
.method constructor <init>(Lcom/saterskog/cell_lab/o;)V
    .locals 0

    .prologue
    .line 345
    iput-object p1, p0, Lcom/saterskog/cell_lab/o$1;->a:Lcom/saterskog/cell_lab/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .prologue
    .line 350
    invoke-interface {p1}, Landroid/content/DialogInterface;->cancel()V

    .line 351
    return-void
.end method
