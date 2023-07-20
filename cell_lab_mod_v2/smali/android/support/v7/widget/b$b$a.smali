.class final Landroid/support/v7/widget/b$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/widget/b$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Landroid/support/v7/widget/b$b;


# direct methods
.method private constructor <init>(Landroid/support/v7/widget/b$b;)V
    .locals 0

    .prologue
    .line 1474
    iput-object p1, p0, Landroid/support/v7/widget/b$b$a;->a:Landroid/support/v7/widget/b$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Landroid/support/v7/widget/b$b;B)V
    .locals 0

    .prologue
    .line 1474
    invoke-direct {p0, p1}, Landroid/support/v7/widget/b$b$a;-><init>(Landroid/support/v7/widget/b$b;)V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 1477
    iget-object v0, p0, Landroid/support/v7/widget/b$b$a;->a:Landroid/support/v7/widget/b$b;

    invoke-static {v0}, Landroid/support/v7/widget/b$b;->a(Landroid/support/v7/widget/b$b;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    .line 1478
    const/4 v1, 0x1

    invoke-interface {v0, v1}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 1479
    return-void
.end method
