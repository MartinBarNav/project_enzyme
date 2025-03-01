.class final Landroid/support/v4/f/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/f/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Landroid/support/v4/f/a;


# direct methods
.method private constructor <init>(Landroid/support/v4/f/a;)V
    .locals 0

    .prologue
    .line 684
    iput-object p1, p0, Landroid/support/v4/f/a$b;->a:Landroid/support/v4/f/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Landroid/support/v4/f/a;B)V
    .locals 0

    .prologue
    .line 684
    invoke-direct {p0, p1}, Landroid/support/v4/f/a$b;-><init>(Landroid/support/v4/f/a;)V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    .prologue
    const-wide/16 v8, 0x0

    const/4 v0, 0x0

    .line 687
    iget-object v1, p0, Landroid/support/v4/f/a$b;->a:Landroid/support/v4/f/a;

    invoke-static {v1}, Landroid/support/v4/f/a;->a(Landroid/support/v4/f/a;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 715
    :goto_0
    return-void

    .line 691
    :cond_0
    iget-object v1, p0, Landroid/support/v4/f/a$b;->a:Landroid/support/v4/f/a;

    invoke-static {v1}, Landroid/support/v4/f/a;->b(Landroid/support/v4/f/a;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 692
    iget-object v1, p0, Landroid/support/v4/f/a$b;->a:Landroid/support/v4/f/a;

    invoke-static {v1}, Landroid/support/v4/f/a;->c(Landroid/support/v4/f/a;)Z

    .line 693
    iget-object v1, p0, Landroid/support/v4/f/a$b;->a:Landroid/support/v4/f/a;

    invoke-static {v1}, Landroid/support/v4/f/a;->d(Landroid/support/v4/f/a;)Landroid/support/v4/f/a$a;

    move-result-object v1

    .line 1763
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v2

    iput-wide v2, v1, Landroid/support/v4/f/a$a;->e:J

    .line 1764
    const-wide/16 v2, -0x1

    iput-wide v2, v1, Landroid/support/v4/f/a$a;->i:J

    .line 1765
    iget-wide v2, v1, Landroid/support/v4/f/a$a;->e:J

    iput-wide v2, v1, Landroid/support/v4/f/a$a;->f:J

    .line 1766
    const/high16 v2, 0x3f000000    # 0.5f

    iput v2, v1, Landroid/support/v4/f/a$a;->j:F

    .line 1767
    iput v0, v1, Landroid/support/v4/f/a$a;->g:I

    .line 1768
    iput v0, v1, Landroid/support/v4/f/a$a;->h:I

    .line 696
    :cond_1
    iget-object v1, p0, Landroid/support/v4/f/a$b;->a:Landroid/support/v4/f/a;

    invoke-static {v1}, Landroid/support/v4/f/a;->d(Landroid/support/v4/f/a;)Landroid/support/v4/f/a$a;

    move-result-object v1

    .line 1782
    iget-wide v2, v1, Landroid/support/v4/f/a$a;->i:J

    cmp-long v2, v2, v8

    if-lez v2, :cond_2

    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v2

    iget-wide v4, v1, Landroid/support/v4/f/a$a;->i:J

    iget v6, v1, Landroid/support/v4/f/a$a;->k:I

    int-to-long v6, v6

    add-long/2addr v4, v6

    cmp-long v2, v2, v4

    if-lez v2, :cond_2

    const/4 v0, 0x1

    .line 697
    :cond_2
    if-nez v0, :cond_3

    iget-object v0, p0, Landroid/support/v4/f/a$b;->a:Landroid/support/v4/f/a;

    invoke-static {v0}, Landroid/support/v4/f/a;->e(Landroid/support/v4/f/a;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 698
    :cond_3
    iget-object v0, p0, Landroid/support/v4/f/a$b;->a:Landroid/support/v4/f/a;

    invoke-static {v0}, Landroid/support/v4/f/a;->f(Landroid/support/v4/f/a;)Z

    goto :goto_0

    .line 702
    :cond_4
    iget-object v0, p0, Landroid/support/v4/f/a$b;->a:Landroid/support/v4/f/a;

    invoke-static {v0}, Landroid/support/v4/f/a;->g(Landroid/support/v4/f/a;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 703
    iget-object v0, p0, Landroid/support/v4/f/a$b;->a:Landroid/support/v4/f/a;

    invoke-static {v0}, Landroid/support/v4/f/a;->h(Landroid/support/v4/f/a;)Z

    .line 704
    iget-object v0, p0, Landroid/support/v4/f/a$b;->a:Landroid/support/v4/f/a;

    invoke-static {v0}, Landroid/support/v4/f/a;->i(Landroid/support/v4/f/a;)V

    .line 1818
    :cond_5
    iget-wide v2, v1, Landroid/support/v4/f/a$a;->f:J

    cmp-long v0, v2, v8

    if-nez v0, :cond_6

    .line 1819
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Cannot compute scroll delta before calling start()"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1822
    :cond_6
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v2

    .line 1823
    invoke-virtual {v1, v2, v3}, Landroid/support/v4/f/a$a;->a(J)F

    move-result v0

    .line 2807
    const/high16 v4, -0x3f800000    # -4.0f

    mul-float/2addr v4, v0

    mul-float/2addr v4, v0

    const/high16 v5, 0x40800000    # 4.0f

    mul-float/2addr v0, v5

    add-float/2addr v0, v4

    .line 1825
    iget-wide v4, v1, Landroid/support/v4/f/a$a;->f:J

    sub-long v4, v2, v4

    .line 1827
    iput-wide v2, v1, Landroid/support/v4/f/a$a;->f:J

    .line 1828
    long-to-float v2, v4

    mul-float/2addr v2, v0

    iget v3, v1, Landroid/support/v4/f/a$a;->c:F

    mul-float/2addr v2, v3

    float-to-int v2, v2

    iput v2, v1, Landroid/support/v4/f/a$a;->g:I

    .line 1829
    long-to-float v2, v4

    mul-float/2addr v0, v2

    iget v2, v1, Landroid/support/v4/f/a$a;->d:F

    mul-float/2addr v0, v2

    float-to-int v0, v0

    iput v0, v1, Landroid/support/v4/f/a$a;->h:I

    .line 2864
    iget v0, v1, Landroid/support/v4/f/a$a;->h:I

    .line 711
    iget-object v1, p0, Landroid/support/v4/f/a$b;->a:Landroid/support/v4/f/a;

    invoke-virtual {v1, v0}, Landroid/support/v4/f/a;->a(I)V

    .line 714
    iget-object v0, p0, Landroid/support/v4/f/a$b;->a:Landroid/support/v4/f/a;

    invoke-static {v0}, Landroid/support/v4/f/a;->j(Landroid/support/v4/f/a;)Landroid/view/View;

    move-result-object v0

    invoke-static {v0, p0}, Landroid/support/v4/view/u;->a(Landroid/view/View;Ljava/lang/Runnable;)V

    goto/16 :goto_0
.end method
