.class final Landroid/support/v4/f/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/f/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# instance fields
.field a:I

.field b:I

.field c:F

.field d:F

.field e:J

.field f:J

.field g:I

.field h:I

.field i:J

.field j:F

.field k:I


# direct methods
.method public constructor <init>()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 743
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 744
    const-wide/high16 v0, -0x8000000000000000L

    iput-wide v0, p0, Landroid/support/v4/f/a$a;->e:J

    .line 745
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Landroid/support/v4/f/a$a;->i:J

    .line 746
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Landroid/support/v4/f/a$a;->f:J

    .line 747
    iput v2, p0, Landroid/support/v4/f/a$a;->g:I

    .line 748
    iput v2, p0, Landroid/support/v4/f/a$a;->h:I

    .line 749
    return-void
.end method


# virtual methods
.method final a(J)F
    .locals 5

    .prologue
    .line 787
    iget-wide v0, p0, Landroid/support/v4/f/a$a;->e:J

    cmp-long v0, p1, v0

    if-gez v0, :cond_0

    .line 788
    const/4 v0, 0x0

    .line 794
    :goto_0
    return v0

    .line 789
    :cond_0
    iget-wide v0, p0, Landroid/support/v4/f/a$a;->i:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-ltz v0, :cond_1

    iget-wide v0, p0, Landroid/support/v4/f/a$a;->i:J

    cmp-long v0, p1, v0

    if-gez v0, :cond_2

    .line 790
    :cond_1
    iget-wide v0, p0, Landroid/support/v4/f/a$a;->e:J

    sub-long v0, p1, v0

    .line 791
    const/high16 v2, 0x3f000000    # 0.5f

    long-to-float v0, v0

    iget v1, p0, Landroid/support/v4/f/a$a;->a:I

    int-to-float v1, v1

    div-float/2addr v0, v1

    invoke-static {v0}, Landroid/support/v4/f/a;->a(F)F

    move-result v0

    mul-float/2addr v0, v2

    goto :goto_0

    .line 793
    :cond_2
    iget-wide v0, p0, Landroid/support/v4/f/a$a;->i:J

    sub-long v0, p1, v0

    .line 794
    const/high16 v2, 0x3f800000    # 1.0f

    iget v3, p0, Landroid/support/v4/f/a$a;->j:F

    sub-float/2addr v2, v3

    iget v3, p0, Landroid/support/v4/f/a$a;->j:F

    long-to-float v0, v0

    iget v1, p0, Landroid/support/v4/f/a$a;->k:I

    int-to-float v1, v1

    div-float/2addr v0, v1

    invoke-static {v0}, Landroid/support/v4/f/a;->a(F)F

    move-result v0

    mul-float/2addr v0, v3

    add-float/2addr v0, v2

    goto :goto_0
.end method
