.class final Landroid/support/v7/widget/a$d$1;
.super Landroid/support/v7/widget/b$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroid/support/v7/widget/a$d;-><init>(Landroid/support/v7/widget/a;Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/support/v7/widget/a;

.field final synthetic b:Landroid/support/v7/widget/a$d;


# direct methods
.method constructor <init>(Landroid/support/v7/widget/a$d;Landroid/view/View;Landroid/support/v7/widget/a;)V
    .locals 0

    .prologue
    .line 595
    iput-object p1, p0, Landroid/support/v7/widget/a$d$1;->b:Landroid/support/v7/widget/a$d;

    iput-object p3, p0, Landroid/support/v7/widget/a$d$1;->a:Landroid/support/v7/widget/a;

    invoke-direct {p0, p2}, Landroid/support/v7/widget/b$b;-><init>(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public final a()Landroid/support/v7/widget/b;
    .locals 1

    .prologue
    .line 598
    iget-object v0, p0, Landroid/support/v7/widget/a$d$1;->b:Landroid/support/v7/widget/a$d;

    iget-object v0, v0, Landroid/support/v7/widget/a$d;->a:Landroid/support/v7/widget/a;

    .line 1053
    iget-object v0, v0, Landroid/support/v7/widget/a;->q:Landroid/support/v7/widget/a$e;

    .line 598
    if-nez v0, :cond_0

    .line 599
    const/4 v0, 0x0

    .line 602
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Landroid/support/v7/widget/a$d$1;->b:Landroid/support/v7/widget/a$d;

    iget-object v0, v0, Landroid/support/v7/widget/a$d;->a:Landroid/support/v7/widget/a;

    .line 2053
    iget-object v0, v0, Landroid/support/v7/widget/a;->q:Landroid/support/v7/widget/a$e;

    .line 2131
    iget-object v0, v0, Landroid/support/v7/internal/view/menu/i;->c:Landroid/support/v7/widget/b;

    goto :goto_0
.end method

.method public final b()Z
    .locals 1

    .prologue
    .line 607
    iget-object v0, p0, Landroid/support/v7/widget/a$d$1;->b:Landroid/support/v7/widget/a$d;

    iget-object v0, v0, Landroid/support/v7/widget/a$d;->a:Landroid/support/v7/widget/a;

    invoke-virtual {v0}, Landroid/support/v7/widget/a;->c()Z

    .line 608
    const/4 v0, 0x1

    return v0
.end method

.method public final c()Z
    .locals 1

    .prologue
    .line 616
    iget-object v0, p0, Landroid/support/v7/widget/a$d$1;->b:Landroid/support/v7/widget/a$d;

    iget-object v0, v0, Landroid/support/v7/widget/a$d;->a:Landroid/support/v7/widget/a;

    .line 3053
    iget-object v0, v0, Landroid/support/v7/widget/a;->s:Landroid/support/v7/widget/a$c;

    .line 616
    if-eqz v0, :cond_0

    .line 617
    const/4 v0, 0x0

    .line 621
    :goto_0
    return v0

    .line 620
    :cond_0
    iget-object v0, p0, Landroid/support/v7/widget/a$d$1;->b:Landroid/support/v7/widget/a$d;

    iget-object v0, v0, Landroid/support/v7/widget/a$d;->a:Landroid/support/v7/widget/a;

    invoke-virtual {v0}, Landroid/support/v7/widget/a;->d()Z

    .line 621
    const/4 v0, 0x1

    goto :goto_0
.end method
