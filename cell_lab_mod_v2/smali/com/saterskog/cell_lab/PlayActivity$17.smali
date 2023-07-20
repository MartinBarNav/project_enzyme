.class final Lcom/saterskog/cell_lab/PlayActivity$17;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/saterskog/cell_lab/PlayActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/saterskog/cell_lab/PlayActivity;


# direct methods
.method constructor <init>(Lcom/saterskog/cell_lab/PlayActivity;)V
    .locals 0

    .prologue
    .line 1691
    iput-object p1, p0, Lcom/saterskog/cell_lab/PlayActivity$17;->a:Lcom/saterskog/cell_lab/PlayActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 5

    .prologue
    const/4 v4, 0x3

    const/4 v3, 0x0

    const/4 v2, 0x2

    const/4 v1, 0x1

    .line 1693
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity$17;->a:Lcom/saterskog/cell_lab/PlayActivity;

    iget-boolean v0, v0, Lcom/saterskog/cell_lab/PlayActivity;->x:Z

    if-eqz v0, :cond_4

    .line 1694
    if-nez p2, :cond_0

    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity$17;->a:Lcom/saterskog/cell_lab/PlayActivity;

    invoke-virtual {v0, v3}, Lcom/saterskog/cell_lab/PlayActivity;->a(I)Z

    .line 1695
    :cond_0
    if-ne p2, v1, :cond_1

    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity$17;->a:Lcom/saterskog/cell_lab/PlayActivity;

    invoke-virtual {v0, v4}, Lcom/saterskog/cell_lab/PlayActivity;->a(I)Z

    .line 1696
    :cond_1
    if-ne p2, v2, :cond_2

    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity$17;->a:Lcom/saterskog/cell_lab/PlayActivity;

    invoke-virtual {v0, v1}, Lcom/saterskog/cell_lab/PlayActivity;->a(I)Z

    .line 1697
    :cond_2
    if-ne p2, v4, :cond_3

    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity$17;->a:Lcom/saterskog/cell_lab/PlayActivity;

    invoke-virtual {v0, v2}, Lcom/saterskog/cell_lab/PlayActivity;->a(I)Z

    .line 1705
    :cond_3
    :goto_0
    return-void

    .line 1700
    :cond_4
    if-nez p2, :cond_5

    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity$17;->a:Lcom/saterskog/cell_lab/PlayActivity;

    invoke-virtual {v0, v3}, Lcom/saterskog/cell_lab/PlayActivity;->a(I)Z

    .line 1701
    :cond_5
    if-ne p2, v1, :cond_6

    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity$17;->a:Lcom/saterskog/cell_lab/PlayActivity;

    invoke-virtual {v0, v1}, Lcom/saterskog/cell_lab/PlayActivity;->a(I)Z

    .line 1702
    :cond_6
    if-ne p2, v2, :cond_3

    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity$17;->a:Lcom/saterskog/cell_lab/PlayActivity;

    invoke-virtual {v0, v2}, Lcom/saterskog/cell_lab/PlayActivity;->a(I)Z

    goto :goto_0
.end method
