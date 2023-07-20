.class public final Landroid/support/v4/view/ae;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/view/ae$e;,
        Landroid/support/v4/view/ae$c;,
        Landroid/support/v4/view/ae$d;,
        Landroid/support/v4/view/ae$b;,
        Landroid/support/v4/view/ae$a;,
        Landroid/support/v4/view/ae$f;
    }
.end annotation


# static fields
.field public static final b:Landroid/support/v4/view/ae$f;


# instance fields
.field public a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field private c:Ljava/lang/Runnable;

.field private d:Ljava/lang/Runnable;

.field private e:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 596
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 597
    const/16 v1, 0x13

    if-lt v0, v1, :cond_0

    .line 598
    new-instance v0, Landroid/support/v4/view/ae$e;

    invoke-direct {v0}, Landroid/support/v4/view/ae$e;-><init>()V

    sput-object v0, Landroid/support/v4/view/ae;->b:Landroid/support/v4/view/ae$f;

    .line 608
    :goto_0
    return-void

    .line 599
    :cond_0
    const/16 v1, 0x12

    if-lt v0, v1, :cond_1

    .line 600
    new-instance v0, Landroid/support/v4/view/ae$c;

    invoke-direct {v0}, Landroid/support/v4/view/ae$c;-><init>()V

    sput-object v0, Landroid/support/v4/view/ae;->b:Landroid/support/v4/view/ae$f;

    goto :goto_0

    .line 601
    :cond_1
    const/16 v1, 0x10

    if-lt v0, v1, :cond_2

    .line 602
    new-instance v0, Landroid/support/v4/view/ae$d;

    invoke-direct {v0}, Landroid/support/v4/view/ae$d;-><init>()V

    sput-object v0, Landroid/support/v4/view/ae;->b:Landroid/support/v4/view/ae$f;

    goto :goto_0

    .line 603
    :cond_2
    const/16 v1, 0xe

    if-lt v0, v1, :cond_3

    .line 604
    new-instance v0, Landroid/support/v4/view/ae$b;

    invoke-direct {v0}, Landroid/support/v4/view/ae$b;-><init>()V

    sput-object v0, Landroid/support/v4/view/ae;->b:Landroid/support/v4/view/ae$f;

    goto :goto_0

    .line 606
    :cond_3
    new-instance v0, Landroid/support/v4/view/ae$a;

    invoke-direct {v0}, Landroid/support/v4/view/ae$a;-><init>()V

    sput-object v0, Landroid/support/v4/view/ae;->b:Landroid/support/v4/view/ae$f;

    goto :goto_0
.end method

.method constructor <init>(Landroid/view/View;)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object v0, p0, Landroid/support/v4/view/ae;->c:Ljava/lang/Runnable;

    .line 28
    iput-object v0, p0, Landroid/support/v4/view/ae;->d:Ljava/lang/Runnable;

    .line 29
    const/4 v0, -0x1

    iput v0, p0, Landroid/support/v4/view/ae;->e:I

    .line 36
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Landroid/support/v4/view/ae;->a:Ljava/lang/ref/WeakReference;

    .line 37
    return-void
.end method

.method static synthetic a(Landroid/support/v4/view/ae;)Ljava/lang/Runnable;
    .locals 1

    .prologue
    .line 24
    iget-object v0, p0, Landroid/support/v4/view/ae;->c:Ljava/lang/Runnable;

    return-object v0
.end method

.method static synthetic b(Landroid/support/v4/view/ae;)Ljava/lang/Runnable;
    .locals 1

    .prologue
    .line 24
    iget-object v0, p0, Landroid/support/v4/view/ae;->d:Ljava/lang/Runnable;

    return-object v0
.end method

.method static synthetic c(Landroid/support/v4/view/ae;)I
    .locals 1

    .prologue
    .line 24
    const/4 v0, -0x1

    iput v0, p0, Landroid/support/v4/view/ae;->e:I

    return v0
.end method

.method static synthetic d(Landroid/support/v4/view/ae;)I
    .locals 1

    .prologue
    .line 24
    iget v0, p0, Landroid/support/v4/view/ae;->e:I

    return v0
.end method


# virtual methods
.method public final a(F)Landroid/support/v4/view/ae;
    .locals 2

    .prologue
    .line 691
    iget-object v0, p0, Landroid/support/v4/view/ae;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-eqz v0, :cond_0

    .line 692
    sget-object v1, Landroid/support/v4/view/ae;->b:Landroid/support/v4/view/ae$f;

    invoke-interface {v1, p0, v0, p1}, Landroid/support/v4/view/ae$f;->a(Landroid/support/v4/view/ae;Landroid/view/View;F)V

    .line 694
    :cond_0
    return-object p0
.end method

.method public final a(J)Landroid/support/v4/view/ae;
    .locals 3

    .prologue
    .line 623
    iget-object v0, p0, Landroid/support/v4/view/ae;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-eqz v0, :cond_0

    .line 624
    sget-object v1, Landroid/support/v4/view/ae;->b:Landroid/support/v4/view/ae$f;

    invoke-interface {v1, v0, p1, p2}, Landroid/support/v4/view/ae$f;->a(Landroid/view/View;J)V

    .line 626
    :cond_0
    return-object p0
.end method

.method public final a(Landroid/support/v4/view/ah;)Landroid/support/v4/view/ae;
    .locals 2

    .prologue
    .line 1195
    iget-object v0, p0, Landroid/support/v4/view/ae;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-eqz v0, :cond_0

    .line 1196
    sget-object v1, Landroid/support/v4/view/ae;->b:Landroid/support/v4/view/ae$f;

    invoke-interface {v1, p0, v0, p1}, Landroid/support/v4/view/ae$f;->a(Landroid/support/v4/view/ae;Landroid/view/View;Landroid/support/v4/view/ah;)V

    .line 1198
    :cond_0
    return-object p0
.end method

.method public final a(Landroid/view/animation/Interpolator;)Landroid/support/v4/view/ae;
    .locals 2

    .prologue
    .line 763
    iget-object v0, p0, Landroid/support/v4/view/ae;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-eqz v0, :cond_0

    .line 764
    sget-object v1, Landroid/support/v4/view/ae;->b:Landroid/support/v4/view/ae$f;

    invoke-interface {v1, v0, p1}, Landroid/support/v4/view/ae$f;->a(Landroid/view/View;Landroid/view/animation/Interpolator;)V

    .line 766
    :cond_0
    return-object p0
.end method

.method public final a()V
    .locals 2

    .prologue
    .line 997
    iget-object v0, p0, Landroid/support/v4/view/ae;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-eqz v0, :cond_0

    .line 998
    sget-object v1, Landroid/support/v4/view/ae;->b:Landroid/support/v4/view/ae$f;

    invoke-interface {v1, p0, v0}, Landroid/support/v4/view/ae$f;->c(Landroid/support/v4/view/ae;Landroid/view/View;)V

    .line 1000
    :cond_0
    return-void
.end method
