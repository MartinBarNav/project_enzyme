.class final Lcom/saterskog/cell_lab/i$2$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/saterskog/cell_lab/i$2$1;->onLongClick(Landroid/view/View;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Lcom/saterskog/cell_lab/i$2$1;


# direct methods
.method constructor <init>(Lcom/saterskog/cell_lab/i$2$1;I)V
    .locals 0

    .prologue
    .line 1049
    iput-object p1, p0, Lcom/saterskog/cell_lab/i$2$1$1;->b:Lcom/saterskog/cell_lab/i$2$1;

    iput p2, p0, Lcom/saterskog/cell_lab/i$2$1$1;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 6

    .prologue
    const/4 v5, 0x4

    const/4 v4, 0x1

    .line 1051
    if-nez p2, :cond_0

    .line 1052
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$2$1$1;->b:Lcom/saterskog/cell_lab/i$2$1;

    iget-object v0, v0, Lcom/saterskog/cell_lab/i$2$1;->c:Lcom/saterskog/cell_lab/i$2;

    iget-object v0, v0, Lcom/saterskog/cell_lab/i$2;->b:Lcom/saterskog/cell_lab/i;

    iget v1, p0, Lcom/saterskog/cell_lab/i$2$1$1;->a:I

    invoke-static {v0, v1}, Lcom/saterskog/cell_lab/i;->a(Lcom/saterskog/cell_lab/i;I)V

    .line 1058
    :goto_0
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$2$1$1;->b:Lcom/saterskog/cell_lab/i$2$1;

    iget-object v0, v0, Lcom/saterskog/cell_lab/i$2$1;->c:Lcom/saterskog/cell_lab/i$2;

    iget-object v0, v0, Lcom/saterskog/cell_lab/i$2;->b:Lcom/saterskog/cell_lab/i;

    invoke-virtual {v0, v4, v4}, Lcom/saterskog/cell_lab/i;->a(ZZ)V

    .line 1059
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$2$1$1;->b:Lcom/saterskog/cell_lab/i$2$1;

    iget-object v0, v0, Lcom/saterskog/cell_lab/i$2$1;->c:Lcom/saterskog/cell_lab/i$2;

    iget-object v0, v0, Lcom/saterskog/cell_lab/i$2;->b:Lcom/saterskog/cell_lab/i;

    invoke-virtual {v0}, Lcom/saterskog/cell_lab/i;->a()V

    .line 1060
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$2$1$1;->b:Lcom/saterskog/cell_lab/i$2$1;

    iget-object v0, v0, Lcom/saterskog/cell_lab/i$2$1;->b:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getRootView()Landroid/view/View;

    move-result-object v0

    .line 1061
    new-instance v1, Landroid/view/KeyEvent;

    const/4 v2, 0x0

    invoke-direct {v1, v2, v5}, Landroid/view/KeyEvent;-><init>(II)V

    invoke-virtual {v0, v1}, Landroid/view/View;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 1062
    new-instance v1, Landroid/view/KeyEvent;

    invoke-direct {v1, v4, v5}, Landroid/view/KeyEvent;-><init>(II)V

    invoke-virtual {v0, v1}, Landroid/view/View;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 1063
    return-void

    .line 1054
    :cond_0
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$2$1$1;->b:Lcom/saterskog/cell_lab/i$2$1;

    iget-object v0, v0, Lcom/saterskog/cell_lab/i$2$1;->c:Lcom/saterskog/cell_lab/i$2;

    iget-object v0, v0, Lcom/saterskog/cell_lab/i$2;->b:Lcom/saterskog/cell_lab/i;

    iget-object v0, v0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget v1, p0, Lcom/saterskog/cell_lab/i$2$1$1;->a:I

    aget-object v0, v0, v1

    iget-boolean v0, v0, Lcom/saterskog/cell_lab/Gene;->p:Z

    .line 1055
    iget-object v1, p0, Lcom/saterskog/cell_lab/i$2$1$1;->b:Lcom/saterskog/cell_lab/i$2$1;

    iget-object v1, v1, Lcom/saterskog/cell_lab/i$2$1;->c:Lcom/saterskog/cell_lab/i$2;

    iget-object v1, v1, Lcom/saterskog/cell_lab/i$2;->b:Lcom/saterskog/cell_lab/i;

    iget-object v1, v1, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget v2, p0, Lcom/saterskog/cell_lab/i$2$1$1;->a:I

    aget-object v1, v1, v2

    iget-object v2, p0, Lcom/saterskog/cell_lab/i$2$1$1;->b:Lcom/saterskog/cell_lab/i$2$1;

    iget-object v2, v2, Lcom/saterskog/cell_lab/i$2$1;->c:Lcom/saterskog/cell_lab/i$2;

    iget-object v2, v2, Lcom/saterskog/cell_lab/i$2;->b:Lcom/saterskog/cell_lab/i;

    iget-object v2, v2, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget-object v3, p0, Lcom/saterskog/cell_lab/i$2$1$1;->b:Lcom/saterskog/cell_lab/i$2$1;

    iget-object v3, v3, Lcom/saterskog/cell_lab/i$2$1;->c:Lcom/saterskog/cell_lab/i$2;

    iget-object v3, v3, Lcom/saterskog/cell_lab/i$2;->b:Lcom/saterskog/cell_lab/i;

    iget v3, v3, Lcom/saterskog/cell_lab/i;->c:I

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Lcom/saterskog/cell_lab/Gene;->a(Lcom/saterskog/cell_lab/Gene;)V

    .line 1056
    iget-object v1, p0, Lcom/saterskog/cell_lab/i$2$1$1;->b:Lcom/saterskog/cell_lab/i$2$1;

    iget-object v1, v1, Lcom/saterskog/cell_lab/i$2$1;->c:Lcom/saterskog/cell_lab/i$2;

    iget-object v1, v1, Lcom/saterskog/cell_lab/i$2;->b:Lcom/saterskog/cell_lab/i;

    iget-object v1, v1, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    iget v2, p0, Lcom/saterskog/cell_lab/i$2$1$1;->a:I

    aget-object v1, v1, v2

    iput-boolean v0, v1, Lcom/saterskog/cell_lab/Gene;->p:Z

    goto :goto_0
.end method
