.class final Landroid/support/v7/widget/b$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/widget/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/support/v7/widget/b;


# direct methods
.method constructor <init>(Landroid/support/v7/widget/b;)V
    .locals 0

    .prologue
    .line 1060
    iput-object p1, p0, Landroid/support/v7/widget/b$1;->a:Landroid/support/v7/widget/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .prologue
    .line 1063
    iget-object v0, p0, Landroid/support/v7/widget/b$1;->a:Landroid/support/v7/widget/b;

    .line 1425
    iget-object v0, v0, Landroid/support/v7/widget/b;->h:Landroid/view/View;

    .line 1064
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1065
    iget-object v0, p0, Landroid/support/v7/widget/b$1;->a:Landroid/support/v7/widget/b;

    invoke-virtual {v0}, Landroid/support/v7/widget/b;->c()V

    .line 1067
    :cond_0
    return-void
.end method
