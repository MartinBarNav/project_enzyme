.class public final Landroid/support/v7/internal/widget/l;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public d:I

.field public e:I

.field public f:I

.field public g:Z

.field public h:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    const/high16 v1, -0x80000000

    const/4 v0, 0x0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput v0, p0, Landroid/support/v7/internal/widget/l;->a:I

    .line 31
    iput v0, p0, Landroid/support/v7/internal/widget/l;->b:I

    .line 32
    iput v1, p0, Landroid/support/v7/internal/widget/l;->c:I

    .line 33
    iput v1, p0, Landroid/support/v7/internal/widget/l;->d:I

    .line 34
    iput v0, p0, Landroid/support/v7/internal/widget/l;->e:I

    .line 35
    iput v0, p0, Landroid/support/v7/internal/widget/l;->f:I

    .line 37
    iput-boolean v0, p0, Landroid/support/v7/internal/widget/l;->g:Z

    .line 38
    iput-boolean v0, p0, Landroid/support/v7/internal/widget/l;->h:Z

    return-void
.end method


# virtual methods
.method public final a(II)V
    .locals 2

    .prologue
    const/high16 v1, -0x80000000

    .line 57
    iput p1, p0, Landroid/support/v7/internal/widget/l;->c:I

    .line 58
    iput p2, p0, Landroid/support/v7/internal/widget/l;->d:I

    .line 59
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v7/internal/widget/l;->h:Z

    .line 60
    iget-boolean v0, p0, Landroid/support/v7/internal/widget/l;->g:Z

    if-eqz v0, :cond_2

    .line 61
    if-eq p2, v1, :cond_0

    iput p2, p0, Landroid/support/v7/internal/widget/l;->a:I

    .line 62
    :cond_0
    if-eq p1, v1, :cond_1

    iput p1, p0, Landroid/support/v7/internal/widget/l;->b:I

    .line 67
    :cond_1
    :goto_0
    return-void

    .line 64
    :cond_2
    if-eq p1, v1, :cond_3

    iput p1, p0, Landroid/support/v7/internal/widget/l;->a:I

    .line 65
    :cond_3
    if-eq p2, v1, :cond_1

    iput p2, p0, Landroid/support/v7/internal/widget/l;->b:I

    goto :goto_0
.end method
