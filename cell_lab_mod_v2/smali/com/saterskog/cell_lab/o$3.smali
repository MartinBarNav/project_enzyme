.class final Lcom/saterskog/cell_lab/o$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/saterskog/cell_lab/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:D

.field final synthetic c:D

.field final synthetic d:Lcom/saterskog/cell_lab/o;


# direct methods
.method constructor <init>(Lcom/saterskog/cell_lab/o;IDD)V
    .locals 1

    .prologue
    .line 374
    iput-object p1, p0, Lcom/saterskog/cell_lab/o$3;->d:Lcom/saterskog/cell_lab/o;

    iput p2, p0, Lcom/saterskog/cell_lab/o$3;->a:I

    iput-wide p3, p0, Lcom/saterskog/cell_lab/o$3;->b:D

    iput-wide p5, p0, Lcom/saterskog/cell_lab/o$3;->c:D

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .prologue
    .line 377
    iget-object v0, p0, Lcom/saterskog/cell_lab/o$3;->d:Lcom/saterskog/cell_lab/o;

    invoke-static {v0}, Lcom/saterskog/cell_lab/o;->a(Lcom/saterskog/cell_lab/o;)Landroid/widget/TextView;

    move-result-object v6

    iget-object v0, p0, Lcom/saterskog/cell_lab/o$3;->d:Lcom/saterskog/cell_lab/o;

    iget v1, p0, Lcom/saterskog/cell_lab/o$3;->a:I

    iget-wide v2, p0, Lcom/saterskog/cell_lab/o$3;->b:D

    iget-wide v4, p0, Lcom/saterskog/cell_lab/o$3;->c:D

    invoke-static/range {v0 .. v5}, Lcom/saterskog/cell_lab/o;->a(Lcom/saterskog/cell_lab/o;IDD)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 378
    return-void
.end method
