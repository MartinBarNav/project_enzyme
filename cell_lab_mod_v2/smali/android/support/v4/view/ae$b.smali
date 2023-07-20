.class Landroid/support/v4/view/ae$b;
.super Landroid/support/v4/view/ae$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/view/ae;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/view/ae$b$a;
    }
.end annotation


# instance fields
.field b:Ljava/util/WeakHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/WeakHashMap",
            "<",
            "Landroid/view/View;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>()V
    .locals 1

    .prologue
    .line 335
    invoke-direct {p0}, Landroid/support/v4/view/ae$a;-><init>()V

    .line 336
    const/4 v0, 0x0

    iput-object v0, p0, Landroid/support/v4/view/ae$b;->b:Ljava/util/WeakHashMap;

    .line 497
    return-void
.end method


# virtual methods
.method public final a(Landroid/support/v4/view/ae;Landroid/view/View;)V
    .locals 0

    .prologue
    .line 350
    invoke-static {p2}, Landroid/support/v4/view/af;->a(Landroid/view/View;)V

    .line 351
    return-void
.end method

.method public final a(Landroid/support/v4/view/ae;Landroid/view/View;F)V
    .locals 0

    .prologue
    .line 355
    invoke-static {p2, p3}, Landroid/support/v4/view/af;->a(Landroid/view/View;F)V

    .line 356
    return-void
.end method

.method public a(Landroid/support/v4/view/ae;Landroid/view/View;Landroid/support/v4/view/ah;)V
    .locals 1

    .prologue
    .line 475
    const/high16 v0, 0x7e000000

    invoke-virtual {p2, v0, p3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 476
    new-instance v0, Landroid/support/v4/view/ae$b$a;

    invoke-direct {v0, p1}, Landroid/support/v4/view/ae$b$a;-><init>(Landroid/support/v4/view/ae;)V

    invoke-static {p2, v0}, Landroid/support/v4/view/af;->a(Landroid/view/View;Landroid/support/v4/view/ah;)V

    .line 477
    return-void
.end method

.method public final a(Landroid/view/View;J)V
    .locals 0

    .prologue
    .line 340
    invoke-static {p1, p2, p3}, Landroid/support/v4/view/af;->a(Landroid/view/View;J)V

    .line 341
    return-void
.end method

.method public final a(Landroid/view/View;Landroid/view/animation/Interpolator;)V
    .locals 0

    .prologue
    .line 365
    invoke-static {p1, p2}, Landroid/support/v4/view/af;->a(Landroid/view/View;Landroid/view/animation/Interpolator;)V

    .line 366
    return-void
.end method

.method public final b(Landroid/support/v4/view/ae;Landroid/view/View;)V
    .locals 0

    .prologue
    .line 425
    invoke-static {p2}, Landroid/support/v4/view/af;->b(Landroid/view/View;)V

    .line 426
    return-void
.end method

.method public final c(Landroid/support/v4/view/ae;Landroid/view/View;)V
    .locals 0

    .prologue
    .line 435
    invoke-static {p2}, Landroid/support/v4/view/af;->c(Landroid/view/View;)V

    .line 436
    return-void
.end method

.method public final d(Landroid/support/v4/view/ae;Landroid/view/View;)V
    .locals 0

    .prologue
    .line 470
    invoke-static {p2}, Landroid/support/v4/view/af;->d(Landroid/view/View;)V

    .line 471
    return-void
.end method
