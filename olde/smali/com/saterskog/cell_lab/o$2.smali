.class final Lcom/saterskog/cell_lab/o$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/saterskog/cell_lab/o;->onStopTrackingTouch(Landroid/widget/SeekBar;)V
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
    .line 359
    iput-object p1, p0, Lcom/saterskog/cell_lab/o$2;->a:Lcom/saterskog/cell_lab/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 362
    iget-object v0, p0, Lcom/saterskog/cell_lab/o$2;->a:Lcom/saterskog/cell_lab/o;

    invoke-virtual {v0}, Lcom/saterskog/cell_lab/o;->getActivity()Landroid/app/Activity;

    move-result-object v0

    .line 363
    if-eqz v0, :cond_0

    .line 364
    const v1, 0x7f0800e1

    invoke-virtual {v0, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 365
    if-eqz v0, :cond_0

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 367
    :cond_0
    return-void
.end method
