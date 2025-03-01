.class Landroid/support/v4/view/u$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/support/v4/view/u$j;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/view/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field a:Ljava/util/WeakHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/WeakHashMap",
            "<",
            "Landroid/view/View;",
            "Landroid/support/v4/view/ae;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>()V
    .locals 1

    .prologue
    .line 337
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 341
    const/4 v0, 0x0

    iput-object v0, p0, Landroid/support/v4/view/u$b;->a:Ljava/util/WeakHashMap;

    return-void
.end method


# virtual methods
.method public a(III)I
    .locals 1

    .prologue
    .line 452
    invoke-static {p1, p2}, Landroid/view/View;->resolveSize(II)I

    move-result v0

    return v0
.end method

.method a()J
    .locals 2

    .prologue
    .line 394
    const-wide/16 v0, 0xa

    return-wide v0
.end method

.method public a(Landroid/view/View;)V
    .locals 0

    .prologue
    .line 687
    return-void
.end method

.method public a(Landroid/view/View;F)V
    .locals 0

    .prologue
    .line 609
    return-void
.end method

.method public a(Landroid/view/View;Landroid/support/v4/view/a;)V
    .locals 0

    .prologue
    .line 358
    return-void
.end method

.method public a(Landroid/view/View;Ljava/lang/Runnable;)V
    .locals 2

    .prologue
    .line 388
    invoke-virtual {p0}, Landroid/support/v4/view/u$b;->a()J

    move-result-wide v0

    invoke-virtual {p1, p2, v0, v1}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 389
    return-void
.end method

.method public a(Landroid/view/View;Ljava/lang/Runnable;J)V
    .locals 3

    .prologue
    .line 391
    invoke-virtual {p0}, Landroid/support/v4/view/u$b;->a()J

    move-result-wide v0

    add-long/2addr v0, p3

    invoke-virtual {p1, p2, v0, v1}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 392
    return-void
.end method

.method public a(Landroid/view/View;I)Z
    .locals 1

    .prologue
    .line 345
    const/4 v0, 0x0

    return v0
.end method

.method public b(Landroid/view/View;)I
    .locals 1

    .prologue
    .line 351
    const/4 v0, 0x2

    return v0
.end method

.method public b(Landroid/view/View;F)V
    .locals 0

    .prologue
    .line 614
    return-void
.end method

.method public b(Landroid/view/View;I)V
    .locals 0

    .prologue
    .line 413
    return-void
.end method

.method public c(Landroid/view/View;)V
    .locals 0

    .prologue
    .line 382
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 383
    return-void
.end method

.method public d(Landroid/view/View;)I
    .locals 1

    .prologue
    .line 397
    const/4 v0, 0x0

    return v0
.end method

.method public e(Landroid/view/View;)V
    .locals 0

    .prologue
    .line 401
    return-void
.end method

.method public f(Landroid/view/View;)I
    .locals 1

    .prologue
    .line 429
    const/4 v0, 0x0

    return v0
.end method

.method public g(Landroid/view/View;)I
    .locals 1

    .prologue
    .line 467
    const/4 v0, 0x0

    return v0
.end method

.method public h(Landroid/view/View;)F
    .locals 1

    .prologue
    .line 548
    const/4 v0, 0x0

    return v0
.end method

.method public i(Landroid/view/View;)I
    .locals 1

    .prologue
    .line 593
    const/4 v0, 0x0

    return v0
.end method

.method public j(Landroid/view/View;)Landroid/support/v4/view/ae;
    .locals 1

    .prologue
    .line 598
    new-instance v0, Landroid/support/v4/view/ae;

    invoke-direct {v0, p1}, Landroid/support/v4/view/ae;-><init>(Landroid/view/View;)V

    return-object v0
.end method

.method public k(Landroid/view/View;)V
    .locals 0

    .prologue
    .line 639
    return-void
.end method

.method public l(Landroid/view/View;)I
    .locals 1

    .prologue
    .line 682
    const/4 v0, 0x0

    return v0
.end method

.method public m(Landroid/view/View;)V
    .locals 0

    .prologue
    .line 720
    return-void
.end method
