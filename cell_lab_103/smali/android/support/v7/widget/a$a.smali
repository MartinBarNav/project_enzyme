.class final Landroid/support/v7/widget/a$a;
.super Landroid/support/v7/internal/view/menu/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/widget/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final synthetic g:Landroid/support/v7/widget/a;

.field private h:Landroid/support/v7/internal/view/menu/m;


# direct methods
.method public constructor <init>(Landroid/support/v7/widget/a;Landroid/content/Context;Landroid/support/v7/internal/view/menu/m;)V
    .locals 6

    .prologue
    const/4 v4, 0x0

    .line 686
    iput-object p1, p0, Landroid/support/v7/widget/a$a;->g:Landroid/support/v7/widget/a;

    .line 687
    const/4 v3, 0x0

    sget v5, Landroid/support/v7/b/a$a;->actionOverflowMenuStyle:I

    move-object v0, p0

    move-object v1, p2

    move-object v2, p3

    invoke-direct/range {v0 .. v5}, Landroid/support/v7/internal/view/menu/i;-><init>(Landroid/content/Context;Landroid/support/v7/internal/view/menu/e;Landroid/view/View;ZI)V

    .line 689
    iput-object p3, p0, Landroid/support/v7/widget/a$a;->h:Landroid/support/v7/internal/view/menu/m;

    .line 691
    invoke-virtual {p3}, Landroid/support/v7/internal/view/menu/m;->getItem()Landroid/view/MenuItem;

    move-result-object v0

    check-cast v0, Landroid/support/v7/internal/view/menu/f;

    .line 692
    invoke-virtual {v0}, Landroid/support/v7/internal/view/menu/f;->f()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1053
    iget-object v0, p1, Landroid/support/v7/widget/a;->h:Landroid/view/View;

    .line 694
    if-nez v0, :cond_2

    invoke-static {p1}, Landroid/support/v7/widget/a;->b(Landroid/support/v7/widget/a;)Landroid/support/v7/internal/view/menu/k;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 2113
    :goto_0
    iput-object v0, p0, Landroid/support/v7/internal/view/menu/i;->b:Landroid/view/View;

    .line 697
    :cond_0
    iget-object v0, p1, Landroid/support/v7/widget/a;->t:Landroid/support/v7/widget/a$f;

    .line 2267
    iput-object v0, p0, Landroid/support/v7/internal/view/menu/i;->d:Landroid/support/v7/internal/view/menu/j$a;

    .line 700
    invoke-virtual {p3}, Landroid/support/v7/internal/view/menu/m;->size()I

    move-result v1

    move v0, v4

    .line 701
    :goto_1
    if-ge v0, v1, :cond_1

    .line 702
    invoke-virtual {p3, v0}, Landroid/support/v7/internal/view/menu/m;->getItem(I)Landroid/view/MenuItem;

    move-result-object v2

    .line 703
    invoke-interface {v2}, Landroid/view/MenuItem;->isVisible()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v2}, Landroid/view/MenuItem;->getIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    if-eqz v2, :cond_3

    .line 704
    const/4 v4, 0x1

    .line 3117
    :cond_1
    iput-boolean v4, p0, Landroid/support/v7/internal/view/menu/i;->e:Z

    .line 709
    return-void

    .line 2053
    :cond_2
    iget-object v0, p1, Landroid/support/v7/widget/a;->h:Landroid/view/View;

    goto :goto_0

    .line 701
    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_1
.end method


# virtual methods
.method public final onDismiss()V
    .locals 2

    .prologue
    .line 713
    invoke-super {p0}, Landroid/support/v7/internal/view/menu/i;->onDismiss()V

    .line 714
    iget-object v0, p0, Landroid/support/v7/widget/a$a;->g:Landroid/support/v7/widget/a;

    .line 4053
    const/4 v1, 0x0

    iput-object v1, v0, Landroid/support/v7/widget/a;->r:Landroid/support/v7/widget/a$a;

    .line 715
    iget-object v0, p0, Landroid/support/v7/widget/a$a;->g:Landroid/support/v7/widget/a;

    const/4 v1, 0x0

    iput v1, v0, Landroid/support/v7/widget/a;->u:I

    .line 716
    return-void
.end method
