.class final Landroid/support/v4/app/h$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroid/support/v4/app/h;->a(Landroid/support/v4/app/d;IIIZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/support/v4/app/d;

.field final synthetic b:Landroid/support/v4/app/h;


# direct methods
.method constructor <init>(Landroid/support/v4/app/h;Landroid/support/v4/app/d;)V
    .locals 0

    .prologue
    .line 1027
    iput-object p1, p0, Landroid/support/v4/app/h$2;->b:Landroid/support/v4/app/h;

    iput-object p2, p0, Landroid/support/v4/app/h$2;->a:Landroid/support/v4/app/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 6

    .prologue
    const/4 v3, 0x0

    .line 1030
    iget-object v0, p0, Landroid/support/v4/app/h$2;->a:Landroid/support/v4/app/d;

    iget-object v0, v0, Landroid/support/v4/app/d;->c:Landroid/view/View;

    if-eqz v0, :cond_0

    .line 1031
    iget-object v0, p0, Landroid/support/v4/app/h$2;->a:Landroid/support/v4/app/d;

    const/4 v1, 0x0

    iput-object v1, v0, Landroid/support/v4/app/d;->c:Landroid/view/View;

    .line 1032
    iget-object v0, p0, Landroid/support/v4/app/h$2;->b:Landroid/support/v4/app/h;

    iget-object v1, p0, Landroid/support/v4/app/h$2;->a:Landroid/support/v4/app/d;

    iget-object v2, p0, Landroid/support/v4/app/h$2;->a:Landroid/support/v4/app/d;

    iget v2, v2, Landroid/support/v4/app/d;->d:I

    move v4, v3

    move v5, v3

    invoke-virtual/range {v0 .. v5}, Landroid/support/v4/app/h;->a(Landroid/support/v4/app/d;IIIZ)V

    .line 1035
    :cond_0
    return-void
.end method

.method public final onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    .prologue
    .line 1038
    return-void
.end method

.method public final onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 0

    .prologue
    .line 1041
    return-void
.end method
