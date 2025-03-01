.class final Lcom/saterskog/cell_lab/PlayActivity$14;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/saterskog/cell_lab/PlayActivity;->k()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:[Ljava/lang/Integer;

.field final synthetic b:Lcom/saterskog/cell_lab/PlayActivity;


# direct methods
.method constructor <init>(Lcom/saterskog/cell_lab/PlayActivity;[Ljava/lang/Integer;)V
    .locals 0

    .prologue
    .line 1462
    iput-object p1, p0, Lcom/saterskog/cell_lab/PlayActivity$14;->b:Lcom/saterskog/cell_lab/PlayActivity;

    iput-object p2, p0, Lcom/saterskog/cell_lab/PlayActivity$14;->a:[Ljava/lang/Integer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 1464
    const/4 v0, 0x0

    .line 1465
    iget-object v1, p0, Lcom/saterskog/cell_lab/PlayActivity$14;->a:[Ljava/lang/Integer;

    aget-object v1, v1, p2

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-nez v1, :cond_0

    const v0, 0x7f07006f

    .line 1466
    :cond_0
    iget-object v1, p0, Lcom/saterskog/cell_lab/PlayActivity$14;->a:[Ljava/lang/Integer;

    aget-object v1, v1, p2

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ne v1, v3, :cond_1

    const v0, 0x7f070071

    .line 1467
    :cond_1
    iget-object v1, p0, Lcom/saterskog/cell_lab/PlayActivity$14;->a:[Ljava/lang/Integer;

    aget-object v1, v1, p2

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/4 v2, 0x2

    if-ne v1, v2, :cond_2

    const v0, 0x7f07006e

    .line 1468
    :cond_2
    iget-object v1, p0, Lcom/saterskog/cell_lab/PlayActivity$14;->a:[Ljava/lang/Integer;

    aget-object v1, v1, p2

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/4 v2, 0x3

    if-ne v1, v2, :cond_3

    const v0, 0x7f070072

    .line 1469
    :cond_3
    iget-object v1, p0, Lcom/saterskog/cell_lab/PlayActivity$14;->a:[Ljava/lang/Integer;

    aget-object v1, v1, p2

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/4 v2, 0x4

    if-ne v1, v2, :cond_4

    const v0, 0x7f070070

    .line 1470
    :cond_4
    iget-object v1, p0, Lcom/saterskog/cell_lab/PlayActivity$14;->b:Lcom/saterskog/cell_lab/PlayActivity;

    invoke-static {v1}, Lcom/saterskog/cell_lab/PlayActivity;->e(Lcom/saterskog/cell_lab/PlayActivity;)Landroid/widget/ImageButton;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/widget/ImageButton;->setImageResource(I)V

    .line 1471
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity$14;->b:Lcom/saterskog/cell_lab/PlayActivity;

    iget-object v1, p0, Lcom/saterskog/cell_lab/PlayActivity$14;->a:[Ljava/lang/Integer;

    aget-object v1, v1, p2

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v0, v1}, Lcom/saterskog/cell_lab/PlayActivity;->a(Lcom/saterskog/cell_lab/PlayActivity;I)I

    .line 1476
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity$14;->b:Lcom/saterskog/cell_lab/PlayActivity;

    invoke-static {v0}, Lcom/saterskog/cell_lab/PlayActivity;->c(Lcom/saterskog/cell_lab/PlayActivity;)I

    move-result v1

    .line 1477
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity$14;->b:Lcom/saterskog/cell_lab/PlayActivity;

    invoke-virtual {v0, v3}, Lcom/saterskog/cell_lab/PlayActivity;->b(I)Landroid/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/saterskog/cell_lab/p;

    .line 1480
    if-eqz v0, :cond_5

    .line 1481
    iget-object v2, v0, Lcom/saterskog/cell_lab/p;->a:Lcom/saterskog/cell_lab/r;

    new-instance v3, Lcom/saterskog/cell_lab/PlayActivity$14$1;

    invoke-direct {v3, p0, v0, v1}, Lcom/saterskog/cell_lab/PlayActivity$14$1;-><init>(Lcom/saterskog/cell_lab/PlayActivity$14;Lcom/saterskog/cell_lab/p;I)V

    invoke-virtual {v2, v3}, Lcom/saterskog/cell_lab/r;->queueEvent(Ljava/lang/Runnable;)V

    .line 1487
    iget-object v1, p0, Lcom/saterskog/cell_lab/PlayActivity$14;->b:Lcom/saterskog/cell_lab/PlayActivity;

    invoke-static {v1}, Lcom/saterskog/cell_lab/PlayActivity;->c(Lcom/saterskog/cell_lab/PlayActivity;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/saterskog/cell_lab/p;->a(I)V

    .line 1492
    :cond_5
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity$14;->b:Lcom/saterskog/cell_lab/PlayActivity;

    const/16 v1, 0xb

    invoke-virtual {v0, v1}, Lcom/saterskog/cell_lab/PlayActivity;->a(S)V

    .line 1493
    return-void
.end method
