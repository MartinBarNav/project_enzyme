.class final Landroid/support/v7/widget/a$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/widget/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "c"
.end annotation


# instance fields
.field final synthetic a:Landroid/support/v7/widget/a;

.field private b:Landroid/support/v7/widget/a$e;


# direct methods
.method public constructor <init>(Landroid/support/v7/widget/a;Landroid/support/v7/widget/a$e;)V
    .locals 0

    .prologue
    .line 745
    iput-object p1, p0, Landroid/support/v7/widget/a$c;->a:Landroid/support/v7/widget/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 746
    iput-object p2, p0, Landroid/support/v7/widget/a$c;->b:Landroid/support/v7/widget/a$e;

    .line 747
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 751
    iget-object v0, p0, Landroid/support/v7/widget/a$c;->a:Landroid/support/v7/widget/a;

    invoke-static {v0}, Landroid/support/v7/widget/a;->c(Landroid/support/v7/widget/a;)Landroid/support/v7/internal/view/menu/k;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 752
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/a$c;->b:Landroid/support/v7/widget/a$e;

    invoke-virtual {v0}, Landroid/support/v7/widget/a$e;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 753
    iget-object v0, p0, Landroid/support/v7/widget/a$c;->a:Landroid/support/v7/widget/a;

    iget-object v1, p0, Landroid/support/v7/widget/a$c;->b:Landroid/support/v7/widget/a$e;

    .line 2053
    iput-object v1, v0, Landroid/support/v7/widget/a;->q:Landroid/support/v7/widget/a$e;

    .line 755
    :cond_0
    iget-object v0, p0, Landroid/support/v7/widget/a$c;->a:Landroid/support/v7/widget/a;

    .line 3053
    const/4 v1, 0x0

    iput-object v1, v0, Landroid/support/v7/widget/a;->s:Landroid/support/v7/widget/a$c;

    .line 756
    return-void
.end method
