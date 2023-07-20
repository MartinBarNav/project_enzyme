.class final Landroid/support/v7/widget/b$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/widget/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "g"
.end annotation


# instance fields
.field final synthetic a:Landroid/support/v7/widget/b;


# direct methods
.method private constructor <init>(Landroid/support/v7/widget/b;)V
    .locals 0

    .prologue
    .line 1722
    iput-object p1, p0, Landroid/support/v7/widget/b$g;->a:Landroid/support/v7/widget/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Landroid/support/v7/widget/b;B)V
    .locals 0

    .prologue
    .line 1722
    invoke-direct {p0, p1}, Landroid/support/v7/widget/b$g;-><init>(Landroid/support/v7/widget/b;)V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 1724
    iget-object v0, p0, Landroid/support/v7/widget/b$g;->a:Landroid/support/v7/widget/b;

    invoke-static {v0}, Landroid/support/v7/widget/b;->a(Landroid/support/v7/widget/b;)Landroid/support/v7/widget/b$a;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/b$g;->a:Landroid/support/v7/widget/b;

    invoke-static {v0}, Landroid/support/v7/widget/b;->a(Landroid/support/v7/widget/b;)Landroid/support/v7/widget/b$a;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/widget/b$a;->getCount()I

    move-result v0

    iget-object v1, p0, Landroid/support/v7/widget/b$g;->a:Landroid/support/v7/widget/b;

    invoke-static {v1}, Landroid/support/v7/widget/b;->a(Landroid/support/v7/widget/b;)Landroid/support/v7/widget/b$a;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v7/widget/b$a;->getChildCount()I

    move-result v1

    if-le v0, v1, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/b$g;->a:Landroid/support/v7/widget/b;

    invoke-static {v0}, Landroid/support/v7/widget/b;->a(Landroid/support/v7/widget/b;)Landroid/support/v7/widget/b$a;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/widget/b$a;->getChildCount()I

    move-result v0

    iget-object v1, p0, Landroid/support/v7/widget/b$g;->a:Landroid/support/v7/widget/b;

    iget v1, v1, Landroid/support/v7/widget/b;->f:I

    if-gt v0, v1, :cond_0

    .line 1726
    iget-object v0, p0, Landroid/support/v7/widget/b$g;->a:Landroid/support/v7/widget/b;

    invoke-static {v0}, Landroid/support/v7/widget/b;->b(Landroid/support/v7/widget/b;)Landroid/widget/PopupWindow;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setInputMethodMode(I)V

    .line 1727
    iget-object v0, p0, Landroid/support/v7/widget/b$g;->a:Landroid/support/v7/widget/b;

    invoke-virtual {v0}, Landroid/support/v7/widget/b;->c()V

    .line 1729
    :cond_0
    return-void
.end method
