.class final Lcom/saterskog/cell_lab/p$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/saterskog/cell_lab/p;->a(Lcom/saterskog/cell_lab/CellWorld;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lcom/saterskog/cell_lab/p;


# direct methods
.method constructor <init>(Lcom/saterskog/cell_lab/p;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 411
    iput-object p1, p0, Lcom/saterskog/cell_lab/p$2;->c:Lcom/saterskog/cell_lab/p;

    iput-object p2, p0, Lcom/saterskog/cell_lab/p$2;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/saterskog/cell_lab/p$2;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 414
    iget-object v0, p0, Lcom/saterskog/cell_lab/p$2;->c:Lcom/saterskog/cell_lab/p;

    iget-object v0, v0, Lcom/saterskog/cell_lab/p;->m:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/saterskog/cell_lab/p$2;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 415
    iget-object v0, p0, Lcom/saterskog/cell_lab/p$2;->c:Lcom/saterskog/cell_lab/p;

    iget-object v0, v0, Lcom/saterskog/cell_lab/p;->n:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/saterskog/cell_lab/p$2;->b:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 416
    return-void
.end method
