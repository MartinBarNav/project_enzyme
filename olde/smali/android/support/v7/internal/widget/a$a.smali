.class public final Landroid/support/v7/internal/widget/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/support/v4/view/ah;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/internal/widget/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4
    name = "a"
.end annotation


# instance fields
.field a:I

.field final synthetic b:Landroid/support/v7/internal/widget/a;

.field private c:Z


# direct methods
.method protected constructor <init>(Landroid/support/v7/internal/widget/a;)V
    .locals 1

    .prologue
    .line 255
    iput-object p1, p0, Landroid/support/v7/internal/widget/a$a;->b:Landroid/support/v7/internal/widget/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 256
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/v7/internal/widget/a$a;->c:Z

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 268
    iget-object v0, p0, Landroid/support/v7/internal/widget/a$a;->b:Landroid/support/v7/internal/widget/a;

    invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/a;->setVisibility(I)V

    .line 269
    iput-boolean v1, p0, Landroid/support/v7/internal/widget/a$a;->c:Z

    .line 270
    return-void
.end method

.method public final b(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 274
    iget-boolean v0, p0, Landroid/support/v7/internal/widget/a$a;->c:Z

    if-eqz v0, :cond_1

    .line 281
    :cond_0
    :goto_0
    return-void

    .line 276
    :cond_1
    iget-object v0, p0, Landroid/support/v7/internal/widget/a$a;->b:Landroid/support/v7/internal/widget/a;

    const/4 v1, 0x0

    iput-object v1, v0, Landroid/support/v7/internal/widget/a;->i:Landroid/support/v4/view/ae;

    .line 277
    iget-object v0, p0, Landroid/support/v7/internal/widget/a$a;->b:Landroid/support/v7/internal/widget/a;

    iget v1, p0, Landroid/support/v7/internal/widget/a$a;->a:I

    invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/a;->setVisibility(I)V

    .line 278
    iget-object v0, p0, Landroid/support/v7/internal/widget/a$a;->b:Landroid/support/v7/internal/widget/a;

    iget-object v0, v0, Landroid/support/v7/internal/widget/a;->e:Landroid/view/ViewGroup;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/internal/widget/a$a;->b:Landroid/support/v7/internal/widget/a;

    iget-object v0, v0, Landroid/support/v7/internal/widget/a;->c:Landroid/support/v7/widget/ActionMenuView;

    if-eqz v0, :cond_0

    .line 279
    iget-object v0, p0, Landroid/support/v7/internal/widget/a$a;->b:Landroid/support/v7/internal/widget/a;

    iget-object v0, v0, Landroid/support/v7/internal/widget/a;->c:Landroid/support/v7/widget/ActionMenuView;

    iget v1, p0, Landroid/support/v7/internal/widget/a$a;->a:I

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/ActionMenuView;->setVisibility(I)V

    goto :goto_0
.end method

.method public final c(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 285
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v7/internal/widget/a$a;->c:Z

    .line 286
    return-void
.end method
