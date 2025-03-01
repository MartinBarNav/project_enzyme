.class final Landroid/support/v7/widget/a$b;
.super Landroid/support/v7/internal/view/menu/ActionMenuItemView$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/widget/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Landroid/support/v7/widget/a;


# direct methods
.method private constructor <init>(Landroid/support/v7/widget/a;)V
    .locals 0

    .prologue
    .line 759
    iput-object p1, p0, Landroid/support/v7/widget/a$b;->a:Landroid/support/v7/widget/a;

    invoke-direct {p0}, Landroid/support/v7/internal/view/menu/ActionMenuItemView$b;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Landroid/support/v7/widget/a;B)V
    .locals 0

    .prologue
    .line 759
    invoke-direct {p0, p1}, Landroid/support/v7/widget/a$b;-><init>(Landroid/support/v7/widget/a;)V

    return-void
.end method


# virtual methods
.method public final a()Landroid/support/v7/widget/b;
    .locals 1

    .prologue
    .line 762
    iget-object v0, p0, Landroid/support/v7/widget/a$b;->a:Landroid/support/v7/widget/a;

    .line 1053
    iget-object v0, v0, Landroid/support/v7/widget/a;->r:Landroid/support/v7/widget/a$a;

    .line 762
    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/a$b;->a:Landroid/support/v7/widget/a;

    .line 2053
    iget-object v0, v0, Landroid/support/v7/widget/a;->r:Landroid/support/v7/widget/a$a;

    .line 2131
    iget-object v0, v0, Landroid/support/v7/internal/view/menu/i;->c:Landroid/support/v7/widget/b;

    .line 762
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
