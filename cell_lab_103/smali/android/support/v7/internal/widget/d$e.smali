.class final Landroid/support/v7/internal/widget/d$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/internal/widget/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "e"
.end annotation


# instance fields
.field final synthetic a:Landroid/support/v7/internal/widget/d;


# direct methods
.method private constructor <init>(Landroid/support/v7/internal/widget/d;)V
    .locals 0

    .prologue
    .line 855
    iput-object p1, p0, Landroid/support/v7/internal/widget/d$e;->a:Landroid/support/v7/internal/widget/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Landroid/support/v7/internal/widget/d;B)V
    .locals 0

    .prologue
    .line 855
    invoke-direct {p0, p1}, Landroid/support/v7/internal/widget/d$e;-><init>(Landroid/support/v7/internal/widget/d;)V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .prologue
    .line 857
    iget-object v0, p0, Landroid/support/v7/internal/widget/d$e;->a:Landroid/support/v7/internal/widget/d;

    iget-boolean v0, v0, Landroid/support/v7/internal/widget/d;->v:Z

    if-eqz v0, :cond_1

    .line 861
    iget-object v0, p0, Landroid/support/v7/internal/widget/d$e;->a:Landroid/support/v7/internal/widget/d;

    invoke-virtual {v0}, Landroid/support/v7/internal/widget/d;->getAdapter()Landroid/widget/Adapter;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 862
    iget-object v0, p0, Landroid/support/v7/internal/widget/d$e;->a:Landroid/support/v7/internal/widget/d;

    invoke-virtual {v0, p0}, Landroid/support/v7/internal/widget/d;->post(Ljava/lang/Runnable;)Z

    .line 867
    :cond_0
    :goto_0
    return-void

    .line 865
    :cond_1
    iget-object v0, p0, Landroid/support/v7/internal/widget/d$e;->a:Landroid/support/v7/internal/widget/d;

    invoke-static {v0}, Landroid/support/v7/internal/widget/d;->b(Landroid/support/v7/internal/widget/d;)V

    goto :goto_0
.end method
