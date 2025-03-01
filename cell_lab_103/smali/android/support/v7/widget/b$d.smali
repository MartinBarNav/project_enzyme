.class final Landroid/support/v7/widget/b$d;
.super Landroid/database/DataSetObserver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/widget/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "d"
.end annotation


# instance fields
.field final synthetic a:Landroid/support/v7/widget/b;


# direct methods
.method private constructor <init>(Landroid/support/v7/widget/b;)V
    .locals 0

    .prologue
    .line 1701
    iput-object p1, p0, Landroid/support/v7/widget/b$d;->a:Landroid/support/v7/widget/b;

    invoke-direct {p0}, Landroid/database/DataSetObserver;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Landroid/support/v7/widget/b;B)V
    .locals 0

    .prologue
    .line 1701
    invoke-direct {p0, p1}, Landroid/support/v7/widget/b$d;-><init>(Landroid/support/v7/widget/b;)V

    return-void
.end method


# virtual methods
.method public final onChanged()V
    .locals 1

    .prologue
    .line 1704
    iget-object v0, p0, Landroid/support/v7/widget/b$d;->a:Landroid/support/v7/widget/b;

    .line 1760
    iget-object v0, v0, Landroid/support/v7/widget/b;->b:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    .line 1704
    if-eqz v0, :cond_0

    .line 1706
    iget-object v0, p0, Landroid/support/v7/widget/b$d;->a:Landroid/support/v7/widget/b;

    invoke-virtual {v0}, Landroid/support/v7/widget/b;->c()V

    .line 1708
    :cond_0
    return-void
.end method

.method public final onInvalidated()V
    .locals 1

    .prologue
    .line 1712
    iget-object v0, p0, Landroid/support/v7/widget/b$d;->a:Landroid/support/v7/widget/b;

    invoke-virtual {v0}, Landroid/support/v7/widget/b;->a()V

    .line 1713
    return-void
.end method
