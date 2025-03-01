.class public final Lcom/saterskog/b/d;
.super Ljava/util/Random;
.source "SourceFile"


# static fields
.field public static a:Lcom/saterskog/b/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 5
    new-instance v0, Lcom/saterskog/b/d;

    invoke-direct {v0}, Lcom/saterskog/b/d;-><init>()V

    sput-object v0, Lcom/saterskog/b/d;->a:Lcom/saterskog/b/d;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 4
    invoke-direct {p0}, Ljava/util/Random;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()D
    .locals 2

    .prologue
    .line 8
    invoke-virtual {p0}, Lcom/saterskog/b/d;->nextDouble()D

    move-result-wide v0

    return-wide v0
.end method

.method public final a(D)I
    .locals 9

    .prologue
    .line 20
    neg-double v0, p1

    invoke-static {v0, v1}, Ljava/lang/Math;->exp(D)D

    move-result-wide v4

    .line 21
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    .line 22
    const/4 v2, 0x0

    .line 25
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 26
    invoke-virtual {p0}, Lcom/saterskog/b/d;->nextDouble()D

    move-result-wide v6

    mul-double/2addr v0, v6

    .line 27
    cmpl-double v3, v0, v4

    if-gtz v3, :cond_0

    .line 29
    add-int/lit8 v0, v2, -0x1

    return v0
.end method

.method public final b()D
    .locals 4

    .prologue
    .line 11
    const-wide/high16 v0, 0x4000000000000000L    # 2.0

    invoke-virtual {p0}, Lcom/saterskog/b/d;->nextDouble()D

    move-result-wide v2

    mul-double/2addr v0, v2

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    sub-double/2addr v0, v2

    return-wide v0
.end method
