.class final Lcom/saterskog/cell_lab/i$2$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/saterskog/cell_lab/i$2;->getDropDownView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/widget/TextView;

.field final synthetic b:Landroid/view/ViewGroup;

.field final synthetic c:Lcom/saterskog/cell_lab/i$2;


# direct methods
.method constructor <init>(Lcom/saterskog/cell_lab/i$2;Landroid/widget/TextView;Landroid/view/ViewGroup;)V
    .locals 0

    .prologue
    .line 1075
    iput-object p1, p0, Lcom/saterskog/cell_lab/i$2$2;->c:Lcom/saterskog/cell_lab/i$2;

    iput-object p2, p0, Lcom/saterskog/cell_lab/i$2$2;->a:Landroid/widget/TextView;

    iput-object p3, p0, Lcom/saterskog/cell_lab/i$2$2;->b:Landroid/view/ViewGroup;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 7

    .prologue
    const/4 v6, 0x4

    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 1079
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$2$2;->a:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1080
    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v1

    .line 1081
    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    .line 1082
    invoke-virtual {v0, v4, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 1084
    :cond_0
    invoke-virtual {v0, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    .line 1086
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "name="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/saterskog/b/a;->b(Ljava/lang/String;)V

    .line 1087
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "pos="

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/saterskog/b/a;->b(Ljava/lang/String;)V

    .line 1093
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$2$2;->c:Lcom/saterskog/cell_lab/i$2;

    iget-object v0, v0, Lcom/saterskog/cell_lab/i$2;->b:Lcom/saterskog/cell_lab/i;

    invoke-static {v0}, Lcom/saterskog/cell_lab/i;->d(Lcom/saterskog/cell_lab/i;)Landroid/view/View;

    move-result-object v0

    const v2, 0x7f0800bf

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Spinner;

    invoke-virtual {v0, v1}, Landroid/widget/Spinner;->setSelection(I)V

    .line 1094
    iget-object v0, p0, Lcom/saterskog/cell_lab/i$2$2;->b:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getRootView()Landroid/view/View;

    move-result-object v0

    .line 1095
    new-instance v1, Landroid/view/KeyEvent;

    invoke-direct {v1, v4, v6}, Landroid/view/KeyEvent;-><init>(II)V

    invoke-virtual {v0, v1}, Landroid/view/View;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 1096
    new-instance v1, Landroid/view/KeyEvent;

    invoke-direct {v1, v5, v6}, Landroid/view/KeyEvent;-><init>(II)V

    invoke-virtual {v0, v1}, Landroid/view/View;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 1100
    return-void
.end method
