.class final Landroid/support/v7/widget/a$e;
.super Landroid/support/v7/internal/view/menu/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/widget/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "e"
.end annotation


# instance fields
.field final synthetic g:Landroid/support/v7/widget/a;


# direct methods
.method public constructor <init>(Landroid/support/v7/widget/a;Landroid/content/Context;Landroid/support/v7/internal/view/menu/e;Landroid/view/View;)V
    .locals 6

    .prologue
    .line 669
    iput-object p1, p0, Landroid/support/v7/widget/a$e;->g:Landroid/support/v7/widget/a;

    .line 670
    const/4 v4, 0x1

    sget v5, Landroid/support/v7/b/a$a;->actionOverflowMenuStyle:I

    move-object v0, p0

    move-object v1, p2

    move-object v2, p3

    move-object v3, p4

    invoke-direct/range {v0 .. v5}, Landroid/support/v7/internal/view/menu/i;-><init>(Landroid/content/Context;Landroid/support/v7/internal/view/menu/e;Landroid/view/View;ZI)V

    .line 1121
    const v0, 0x800005

    iput v0, p0, Landroid/support/v7/internal/view/menu/i;->f:I

    .line 672
    iget-object v0, p1, Landroid/support/v7/widget/a;->t:Landroid/support/v7/widget/a$f;

    .line 1267
    iput-object v0, p0, Landroid/support/v7/internal/view/menu/i;->d:Landroid/support/v7/internal/view/menu/j$a;

    .line 673
    return-void
.end method


# virtual methods
.method public final onDismiss()V
    .locals 2

    .prologue
    .line 677
    invoke-super {p0}, Landroid/support/v7/internal/view/menu/i;->onDismiss()V

    .line 678
    iget-object v0, p0, Landroid/support/v7/widget/a$e;->g:Landroid/support/v7/widget/a;

    invoke-static {v0}, Landroid/support/v7/widget/a;->a(Landroid/support/v7/widget/a;)Landroid/support/v7/internal/view/menu/e;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/internal/view/menu/e;->close()V

    .line 679
    iget-object v0, p0, Landroid/support/v7/widget/a$e;->g:Landroid/support/v7/widget/a;

    .line 2053
    const/4 v1, 0x0

    iput-object v1, v0, Landroid/support/v7/widget/a;->q:Landroid/support/v7/widget/a$e;

    .line 680
    return-void
.end method
