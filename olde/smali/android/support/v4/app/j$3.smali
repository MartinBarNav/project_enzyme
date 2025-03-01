.class final Landroid/support/v4/app/j$3;
.super Landroid/transition/Transition$EpicenterCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/app/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/support/v4/app/j$a;

.field private b:Landroid/graphics/Rect;


# direct methods
.method constructor <init>(Landroid/support/v4/app/j$a;)V
    .locals 0

    .prologue
    .line 207
    iput-object p1, p0, Landroid/support/v4/app/j$3;->a:Landroid/support/v4/app/j$a;

    invoke-direct {p0}, Landroid/transition/Transition$EpicenterCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public final onGetEpicenter(Landroid/transition/Transition;)Landroid/graphics/Rect;
    .locals 1

    .prologue
    .line 212
    iget-object v0, p0, Landroid/support/v4/app/j$3;->b:Landroid/graphics/Rect;

    if-nez v0, :cond_0

    iget-object v0, p0, Landroid/support/v4/app/j$3;->a:Landroid/support/v4/app/j$a;

    iget-object v0, v0, Landroid/support/v4/app/j$a;->a:Landroid/view/View;

    if-eqz v0, :cond_0

    .line 213
    iget-object v0, p0, Landroid/support/v4/app/j$3;->a:Landroid/support/v4/app/j$a;

    iget-object v0, v0, Landroid/support/v4/app/j$a;->a:Landroid/view/View;

    .line 1034
    invoke-static {v0}, Landroid/support/v4/app/j;->b(Landroid/view/View;)Landroid/graphics/Rect;

    move-result-object v0

    .line 213
    iput-object v0, p0, Landroid/support/v4/app/j$3;->b:Landroid/graphics/Rect;

    .line 215
    :cond_0
    iget-object v0, p0, Landroid/support/v4/app/j$3;->b:Landroid/graphics/Rect;

    return-object v0
.end method
