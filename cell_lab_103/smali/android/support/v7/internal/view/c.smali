.class public final Landroid/support/v7/internal/view/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Landroid/support/v4/view/ae;",
            ">;"
        }
    .end annotation
.end field

.field b:Landroid/support/v4/view/ah;

.field public c:Z

.field private d:J

.field private e:Landroid/view/animation/Interpolator;

.field private final f:Landroid/support/v4/view/ai;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Landroid/support/v7/internal/view/c;->d:J

    .line 107
    new-instance v0, Landroid/support/v7/internal/view/c$1;

    invoke-direct {v0, p0}, Landroid/support/v7/internal/view/c$1;-><init>(Landroid/support/v7/internal/view/c;)V

    iput-object v0, p0, Landroid/support/v7/internal/view/c;->f:Landroid/support/v4/view/ai;

    .line 44
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroid/support/v7/internal/view/c;->a:Ljava/util/ArrayList;

    .line 45
    return-void
.end method


# virtual methods
.method public final a(Landroid/support/v4/view/ae;)Landroid/support/v7/internal/view/c;
    .locals 1

    .prologue
    .line 48
    iget-boolean v0, p0, Landroid/support/v7/internal/view/c;->c:Z

    if-nez v0, :cond_0

    .line 49
    iget-object v0, p0, Landroid/support/v7/internal/view/c;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 51
    :cond_0
    return-object p0
.end method

.method public final a()V
    .locals 8

    .prologue
    .line 55
    iget-boolean v0, p0, Landroid/support/v7/internal/view/c;->c:Z

    if-eqz v0, :cond_0

    .line 70
    :goto_0
    return-void

    .line 56
    :cond_0
    iget-object v0, p0, Landroid/support/v7/internal/view/c;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/view/ae;

    .line 57
    iget-wide v4, p0, Landroid/support/v7/internal/view/c;->d:J

    const-wide/16 v6, 0x0

    cmp-long v1, v4, v6

    if-ltz v1, :cond_2

    .line 58
    iget-wide v4, p0, Landroid/support/v7/internal/view/c;->d:J

    invoke-virtual {v0, v4, v5}, Landroid/support/v4/view/ae;->a(J)Landroid/support/v4/view/ae;

    .line 60
    :cond_2
    iget-object v1, p0, Landroid/support/v7/internal/view/c;->e:Landroid/view/animation/Interpolator;

    if-eqz v1, :cond_3

    .line 61
    iget-object v1, p0, Landroid/support/v7/internal/view/c;->e:Landroid/view/animation/Interpolator;

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ae;->a(Landroid/view/animation/Interpolator;)Landroid/support/v4/view/ae;

    .line 63
    :cond_3
    iget-object v1, p0, Landroid/support/v7/internal/view/c;->b:Landroid/support/v4/view/ah;

    if-eqz v1, :cond_4

    .line 64
    iget-object v1, p0, Landroid/support/v7/internal/view/c;->f:Landroid/support/v4/view/ai;

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ae;->a(Landroid/support/v4/view/ah;)Landroid/support/v4/view/ae;

    .line 2115
    :cond_4
    iget-object v1, v0, Landroid/support/v4/view/ae;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    if-eqz v1, :cond_1

    .line 2116
    sget-object v3, Landroid/support/v4/view/ae;->b:Landroid/support/v4/view/ae$f;

    invoke-interface {v3, v0, v1}, Landroid/support/v4/view/ae$f;->d(Landroid/support/v4/view/ae;Landroid/view/View;)V

    goto :goto_1

    .line 69
    :cond_5
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v7/internal/view/c;->c:Z

    goto :goto_0
.end method
