.class public Landroid/support/v4/e/a;
.super Landroid/support/v4/e/g;
.source "SourceFile"

# interfaces
.implements Ljava/util/Map;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Landroid/support/v4/e/g",
        "<TK;TV;>;",
        "Ljava/util/Map",
        "<TK;TV;>;"
    }
.end annotation


# instance fields
.field a:Landroid/support/v4/e/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/support/v4/e/f",
            "<TK;TV;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 54
    invoke-direct {p0}, Landroid/support/v4/e/g;-><init>()V

    .line 55
    return-void
.end method

.method private a()Landroid/support/v4/e/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroid/support/v4/e/f",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 72
    iget-object v0, p0, Landroid/support/v4/e/a;->a:Landroid/support/v4/e/f;

    if-nez v0, :cond_0

    .line 73
    new-instance v0, Landroid/support/v4/e/a$1;

    invoke-direct {v0, p0}, Landroid/support/v4/e/a$1;-><init>(Landroid/support/v4/e/a;)V

    iput-object v0, p0, Landroid/support/v4/e/a;->a:Landroid/support/v4/e/f;

    .line 120
    :cond_0
    iget-object v0, p0, Landroid/support/v4/e/a;->a:Landroid/support/v4/e/f;

    return-object v0
.end method


# virtual methods
.method public entrySet()Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Ljava/util/Map$Entry",
            "<TK;TV;>;>;"
        }
    .end annotation

    .prologue
    .line 179
    invoke-direct {p0}, Landroid/support/v4/e/a;->a()Landroid/support/v4/e/f;

    move-result-object v0

    .line 1529
    iget-object v1, v0, Landroid/support/v4/e/f;->b:Landroid/support/v4/e/f$b;

    if-nez v1, :cond_0

    .line 1530
    new-instance v1, Landroid/support/v4/e/f$b;

    invoke-direct {v1, v0}, Landroid/support/v4/e/f$b;-><init>(Landroid/support/v4/e/f;)V

    iput-object v1, v0, Landroid/support/v4/e/f;->b:Landroid/support/v4/e/f$b;

    .line 1532
    :cond_0
    iget-object v0, v0, Landroid/support/v4/e/f;->b:Landroid/support/v4/e/f$b;

    .line 179
    return-object v0
.end method

.method public keySet()Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<TK;>;"
        }
    .end annotation

    .prologue
    .line 191
    invoke-direct {p0}, Landroid/support/v4/e/a;->a()Landroid/support/v4/e/f;

    move-result-object v0

    .line 1536
    iget-object v1, v0, Landroid/support/v4/e/f;->c:Landroid/support/v4/e/f$c;

    if-nez v1, :cond_0

    .line 1537
    new-instance v1, Landroid/support/v4/e/f$c;

    invoke-direct {v1, v0}, Landroid/support/v4/e/f$c;-><init>(Landroid/support/v4/e/f;)V

    iput-object v1, v0, Landroid/support/v4/e/f;->c:Landroid/support/v4/e/f$c;

    .line 1539
    :cond_0
    iget-object v0, v0, Landroid/support/v4/e/f;->c:Landroid/support/v4/e/f$c;

    .line 191
    return-object v0
.end method

.method public putAll(Ljava/util/Map;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<+TK;+TV;>;)V"
        }
    .end annotation

    .prologue
    const/4 v4, 0x0

    .line 139
    iget v0, p0, Landroid/support/v4/e/a;->h:I

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v1

    add-int/2addr v0, v1

    .line 1254
    iget-object v1, p0, Landroid/support/v4/e/g;->f:[I

    array-length v1, v1

    if-ge v1, v0, :cond_1

    .line 1255
    iget-object v1, p0, Landroid/support/v4/e/g;->f:[I

    .line 1256
    iget-object v2, p0, Landroid/support/v4/e/g;->g:[Ljava/lang/Object;

    .line 1257
    invoke-super {p0, v0}, Landroid/support/v4/e/g;->a(I)V

    .line 1258
    iget v0, p0, Landroid/support/v4/e/g;->h:I

    if-lez v0, :cond_0

    .line 1259
    iget-object v0, p0, Landroid/support/v4/e/g;->f:[I

    iget v3, p0, Landroid/support/v4/e/g;->h:I

    invoke-static {v1, v4, v0, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1260
    iget-object v0, p0, Landroid/support/v4/e/g;->g:[Ljava/lang/Object;

    iget v3, p0, Landroid/support/v4/e/g;->h:I

    shl-int/lit8 v3, v3, 0x1

    invoke-static {v2, v4, v0, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1262
    :cond_0
    iget v0, p0, Landroid/support/v4/e/g;->h:I

    invoke-static {v1, v2, v0}, Landroid/support/v4/e/g;->a([I[Ljava/lang/Object;I)V

    .line 140
    :cond_1
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 141
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v2, v0}, Landroid/support/v4/e/a;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 143
    :cond_2
    return-void
.end method

.method public values()Ljava/util/Collection;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection",
            "<TV;>;"
        }
    .end annotation

    .prologue
    .line 203
    invoke-direct {p0}, Landroid/support/v4/e/a;->a()Landroid/support/v4/e/f;

    move-result-object v0

    .line 1543
    iget-object v1, v0, Landroid/support/v4/e/f;->d:Landroid/support/v4/e/f$e;

    if-nez v1, :cond_0

    .line 1544
    new-instance v1, Landroid/support/v4/e/f$e;

    invoke-direct {v1, v0}, Landroid/support/v4/e/f$e;-><init>(Landroid/support/v4/e/f;)V

    iput-object v1, v0, Landroid/support/v4/e/f;->d:Landroid/support/v4/e/f$e;

    .line 1546
    :cond_0
    iget-object v0, v0, Landroid/support/v4/e/f;->d:Landroid/support/v4/e/f$e;

    .line 203
    return-object v0
.end method
