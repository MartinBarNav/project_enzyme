.class public final Lcom/google/android/gms/b/g;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/b/g$a;
    }
.end annotation


# instance fields
.field a:Landroid/content/Context;

.field final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field c:Z

.field d:Lcom/google/android/gms/b/g$a;

.field e:Lcom/google/android/gms/b/v;

.field f:Lcom/google/android/gms/b/b;

.field private final g:Lcom/google/android/gms/b/h;

.field private final h:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private i:Lcom/google/android/gms/b/q;

.field private final j:Lcom/google/android/gms/b/ag;

.field private final k:Lcom/google/android/gms/b/r;

.field private final l:Lcom/google/android/gms/b/ac;


# direct methods
.method constructor <init>(Lcom/google/android/gms/b/h;Landroid/content/Context;)V
    .locals 7

    invoke-static {}, Lcom/google/android/gms/b/ag;->a()Lcom/google/android/gms/b/ag;

    move-result-object v2

    invoke-static {}, Lcom/google/android/gms/b/r;->a()Lcom/google/android/gms/b/r;

    move-result-object v3

    invoke-static {}, Lcom/google/android/gms/b/ac;->a()Lcom/google/android/gms/b/ac;

    move-result-object v4

    new-instance v5, Lcom/google/android/gms/b/m;

    const-string v0, "tracking"

    const/4 v1, 0x0

    invoke-direct {v5, v0, v1}, Lcom/google/android/gms/b/m;-><init>(Ljava/lang/String;B)V

    move-object v0, p0

    move-object v1, p1

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/b/g;-><init>(Lcom/google/android/gms/b/h;Lcom/google/android/gms/b/ag;Lcom/google/android/gms/b/r;Lcom/google/android/gms/b/ac;Lcom/google/android/gms/b/q;Landroid/content/Context;)V

    return-void
.end method

.method private constructor <init>(Lcom/google/android/gms/b/h;Lcom/google/android/gms/b/ag;Lcom/google/android/gms/b/r;Lcom/google/android/gms/b/ac;Lcom/google/android/gms/b/q;Landroid/content/Context;)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/b/g;->h:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/b/g;->b:Ljava/util/Map;

    iput-object p1, p0, Lcom/google/android/gms/b/g;->g:Lcom/google/android/gms/b/h;

    if-eqz p6, :cond_0

    invoke-virtual {p6}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/b/g;->a:Landroid/content/Context;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/b/g;->h:Ljava/util/Map;

    const-string v1, "useSecure"

    const-string v2, "1"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p2, p0, Lcom/google/android/gms/b/g;->j:Lcom/google/android/gms/b/ag;

    iput-object p3, p0, Lcom/google/android/gms/b/g;->k:Lcom/google/android/gms/b/r;

    iput-object p4, p0, Lcom/google/android/gms/b/g;->l:Lcom/google/android/gms/b/ac;

    iget-object v0, p0, Lcom/google/android/gms/b/g;->h:Ljava/util/Map;

    const-string v1, "&a"

    new-instance v2, Ljava/util/Random;

    invoke-direct {v2}, Ljava/util/Random;-><init>()V

    const v3, 0x7fffffff

    invoke-virtual {v2, v3}, Ljava/util/Random;->nextInt(I)I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p5, p0, Lcom/google/android/gms/b/g;->i:Lcom/google/android/gms/b/q;

    new-instance v0, Lcom/google/android/gms/b/g$a;

    invoke-direct {v0, p0}, Lcom/google/android/gms/b/g$a;-><init>(Lcom/google/android/gms/b/g;)V

    iput-object v0, p0, Lcom/google/android/gms/b/g;->d:Lcom/google/android/gms/b/g$a;

    .line 1000
    iget-object v0, p0, Lcom/google/android/gms/b/g;->h:Ljava/util/Map;

    const-string v1, "&ate"

    invoke-interface {v0, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/b/g;->h:Ljava/util/Map;

    const-string v1, "&adid"

    invoke-interface {v0, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 0
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 0
    invoke-static {}, Lcom/google/android/gms/b/au;->a()Lcom/google/android/gms/b/au;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/b/au$a;->k:Lcom/google/android/gms/b/au$a;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/au;->a(Lcom/google/android/gms/b/au$a;)V

    iget-object v0, p0, Lcom/google/android/gms/b/g;->h:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final a(Ljava/util/Map;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    const/4 v1, 0x1

    const/4 v5, 0x0

    .line 0
    invoke-static {}, Lcom/google/android/gms/b/au;->a()Lcom/google/android/gms/b/au;

    move-result-object v0

    sget-object v2, Lcom/google/android/gms/b/au$a;->l:Lcom/google/android/gms/b/au$a;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/b/au;->a(Lcom/google/android/gms/b/au$a;)V

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    iget-object v0, p0, Lcom/google/android/gms/b/g;->h:Ljava/util/Map;

    invoke-interface {v2, v0}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    if-eqz p1, :cond_0

    invoke-interface {v2, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/b/g;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-interface {v2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    iget-object v4, p0, Lcom/google/android/gms/b/g;->b:Ljava/util/Map;

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v2, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/b/g;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    const-string v0, "&tid"

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "Missing tracking id (%s) parameter."

    new-array v3, v1, [Ljava/lang/Object;

    const-string v4, "&tid"

    aput-object v4, v3, v5

    invoke-static {v0, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/b/n;->d(Ljava/lang/String;)V

    :cond_3
    const-string v0, "&t"

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_4

    const-string v0, "Missing hit type (%s) parameter."

    new-array v3, v1, [Ljava/lang/Object;

    const-string v4, "&t"

    aput-object v4, v3, v5

    invoke-static {v0, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/b/n;->d(Ljava/lang/String;)V

    const-string v0, ""

    :cond_4
    iget-object v3, p0, Lcom/google/android/gms/b/g;->d:Lcom/google/android/gms/b/g$a;

    .line 2000
    iget-boolean v4, v3, Lcom/google/android/gms/b/g$a;->c:Z

    iput-boolean v5, v3, Lcom/google/android/gms/b/g$a;->c:Z

    .line 0
    if-eqz v4, :cond_5

    const-string v3, "&sc"

    const-string v4, "start"

    invoke-interface {v2, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v3

    const-string v0, "screenview"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    const-string v0, "pageview"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    const-string v0, "appview"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_8

    :cond_6
    iget-object v0, p0, Lcom/google/android/gms/b/g;->h:Ljava/util/Map;

    const-string v4, "&a"

    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    const v4, 0x7fffffff

    if-lt v0, v4, :cond_7

    move v0, v1

    :cond_7
    iget-object v1, p0, Lcom/google/android/gms/b/g;->h:Ljava/util/Map;

    const-string v4, "&a"

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v4, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_8
    const-string v0, "transaction"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    const-string v0, "item"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    iget-object v0, p0, Lcom/google/android/gms/b/g;->i:Lcom/google/android/gms/b/q;

    invoke-interface {v0}, Lcom/google/android/gms/b/q;->a()Z

    move-result v0

    if-nez v0, :cond_9

    const-string v0, "Too many hits sent too quickly, rate limiting invoked."

    invoke-static {v0}, Lcom/google/android/gms/b/n;->d(Ljava/lang/String;)V

    :goto_1
    return-void

    :cond_9
    iget-object v0, p0, Lcom/google/android/gms/b/g;->g:Lcom/google/android/gms/b/h;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/b/h;->a(Ljava/util/Map;)V

    goto :goto_1
.end method
