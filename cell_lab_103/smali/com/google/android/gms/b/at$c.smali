.class final Lcom/google/android/gms/b/at$c;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/b/at;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "c"
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/b/at;

.field private final b:Ljava/util/Map;
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


# direct methods
.method constructor <init>(Lcom/google/android/gms/b/at;Ljava/util/Map;)V
    .locals 4
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

    iput-object p1, p0, Lcom/google/android/gms/b/at$c;->a:Lcom/google/android/gms/b/at;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0, p2}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    iput-object v0, p0, Lcom/google/android/gms/b/at$c;->b:Ljava/util/Map;

    const-string v0, "&ht"

    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_0

    :try_start_0
    invoke-static {v0}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    if-nez v0, :cond_1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-object v2, p0, Lcom/google/android/gms/b/at$c;->b:Ljava/util/Map;

    const-string v3, "&ht"

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-void

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public final run()V
    .locals 10

    .prologue
    const-wide/high16 v8, 0x4059000000000000L    # 100.0

    const/4 v2, 0x0

    const/4 v3, 0x1

    .line 0
    iget-object v0, p0, Lcom/google/android/gms/b/at$c;->b:Ljava/util/Map;

    .line 1000
    iget-object v1, p0, Lcom/google/android/gms/b/at$c;->a:Lcom/google/android/gms/b/at;

    invoke-static {v1}, Lcom/google/android/gms/b/at;->a(Lcom/google/android/gms/b/at;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/b/i;->a(Landroid/content/Context;)Lcom/google/android/gms/b/am;

    move-result-object v1

    const-string v4, "&adid"

    invoke-static {v0, v4, v1}, Lcom/google/android/gms/b/w;->a(Ljava/util/Map;Ljava/lang/String;Lcom/google/android/gms/b/am;)V

    const-string v4, "&ate"

    invoke-static {v0, v4, v1}, Lcom/google/android/gms/b/w;->a(Ljava/util/Map;Ljava/lang/String;Lcom/google/android/gms/b/am;)V

    .line 0
    iget-object v0, p0, Lcom/google/android/gms/b/at$c;->b:Ljava/util/Map;

    const-string v1, "&cid"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/b/at$c;->b:Ljava/util/Map;

    const-string v1, "&cid"

    invoke-static {}, Lcom/google/android/gms/b/ag;->a()Lcom/google/android/gms/b/ag;

    move-result-object v4

    const-string v5, "&cid"

    invoke-virtual {v4, v5}, Lcom/google/android/gms/b/ag;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/b/at$c;->a:Lcom/google/android/gms/b/at;

    invoke-static {v0}, Lcom/google/android/gms/b/at;->a(Lcom/google/android/gms/b/at;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/b/c;->a(Landroid/content/Context;)Lcom/google/android/gms/b/c;

    move-result-object v0

    .line 2000
    invoke-static {}, Lcom/google/android/gms/b/au;->a()Lcom/google/android/gms/b/au;

    move-result-object v1

    sget-object v4, Lcom/google/android/gms/b/au$a;->R:Lcom/google/android/gms/b/au$a;

    invoke-virtual {v1, v4}, Lcom/google/android/gms/b/au;->a(Lcom/google/android/gms/b/au$a;)V

    iget-object v0, v0, Lcom/google/android/gms/b/c;->e:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 0
    if-nez v0, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/b/at$c;->b:Ljava/util/Map;

    .line 3000
    const-string v0, "&sf"

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_3

    const-string v0, "&sf"

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lcom/google/android/gms/b/w;->b(Ljava/lang/String;)D

    move-result-wide v4

    cmpl-double v0, v4, v8

    if-gez v0, :cond_3

    const-string v0, "&cid"

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lcom/google/android/gms/b/at;->a(Ljava/lang/String;)I

    move-result v0

    rem-int/lit16 v0, v0, 0x2710

    int-to-double v6, v0

    mul-double/2addr v4, v8

    cmpl-double v0, v6, v4

    if-ltz v0, :cond_3

    const-string v0, "&t"

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_2

    const-string v0, "unknown"

    :goto_0
    const-string v1, "%s hit sampled out"

    new-array v4, v3, [Ljava/lang/Object;

    aput-object v0, v4, v2

    invoke-static {v1, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/b/n;->c(Ljava/lang/String;)V

    move v0, v3

    .line 0
    :goto_1
    if-eqz v0, :cond_4

    :cond_1
    :goto_2
    return-void

    .line 3000
    :cond_2
    const-string v0, "&t"

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    goto :goto_0

    :cond_3
    move v0, v2

    goto :goto_1

    .line 0
    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/b/at$c;->a:Lcom/google/android/gms/b/at;

    invoke-static {v0}, Lcom/google/android/gms/b/at;->b(Lcom/google/android/gms/b/at;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    invoke-static {}, Lcom/google/android/gms/b/au;->a()Lcom/google/android/gms/b/au;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/google/android/gms/b/au;->a(Z)V

    iget-object v4, p0, Lcom/google/android/gms/b/at$c;->b:Ljava/util/Map;

    new-instance v1, Lcom/google/android/gms/b/d$d;

    invoke-direct {v1}, Lcom/google/android/gms/b/d$d;-><init>()V

    iget-object v0, p0, Lcom/google/android/gms/b/at$c;->a:Lcom/google/android/gms/b/at;

    invoke-static {v0}, Lcom/google/android/gms/b/at;->b(Lcom/google/android/gms/b/at;)Ljava/lang/String;

    move-result-object v0

    .line 4000
    invoke-static {}, Lcom/google/android/gms/b/au;->a()Lcom/google/android/gms/b/au;

    move-result-object v5

    sget-object v6, Lcom/google/android/gms/b/au$a;->d:Lcom/google/android/gms/b/au$a;

    invoke-virtual {v5, v6}, Lcom/google/android/gms/b/au;->a(Lcom/google/android/gms/b/au$a;)V

    invoke-static {v0}, Lcom/google/android/gms/b/w;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_7

    move-object v0, v1

    .line 0
    :goto_3
    invoke-virtual {v0}, Lcom/google/android/gms/b/d$d;->a()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    invoke-static {}, Lcom/google/android/gms/b/au;->a()Lcom/google/android/gms/b/au;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/google/android/gms/b/au;->a(Z)V

    iget-object v0, p0, Lcom/google/android/gms/b/at$c;->a:Lcom/google/android/gms/b/at;

    invoke-static {v0}, Lcom/google/android/gms/b/at;->c(Lcom/google/android/gms/b/at;)Ljava/lang/String;

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/b/at$c;->b:Ljava/util/Map;

    .line 5000
    invoke-static {}, Lcom/google/android/gms/b/ac;->a()Lcom/google/android/gms/b/ac;

    move-result-object v1

    const-string v2, "&an"

    invoke-static {v0, v2, v1}, Lcom/google/android/gms/b/w;->a(Ljava/util/Map;Ljava/lang/String;Lcom/google/android/gms/b/am;)V

    const-string v2, "&av"

    invoke-static {v0, v2, v1}, Lcom/google/android/gms/b/w;->a(Ljava/util/Map;Ljava/lang/String;Lcom/google/android/gms/b/am;)V

    const-string v2, "&aid"

    invoke-static {v0, v2, v1}, Lcom/google/android/gms/b/w;->a(Ljava/util/Map;Ljava/lang/String;Lcom/google/android/gms/b/am;)V

    const-string v2, "&aiid"

    invoke-static {v0, v2, v1}, Lcom/google/android/gms/b/w;->a(Ljava/util/Map;Ljava/lang/String;Lcom/google/android/gms/b/am;)V

    const-string v1, "&v"

    const-string v2, "1"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 0
    iget-object v0, p0, Lcom/google/android/gms/b/at$c;->b:Ljava/util/Map;

    .line 6000
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_6
    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const-string v5, "&"

    invoke-virtual {v2, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_6

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_6

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    .line 4000
    :cond_7
    invoke-static {v0}, Lcom/google/android/gms/b/w;->a(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v5

    const-string v6, "&cc"

    const-string v0, "utm_content"

    invoke-interface {v5, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v1, v6, v0}, Lcom/google/android/gms/b/d$d;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/b/d$d;

    const-string v6, "&cm"

    const-string v0, "utm_medium"

    invoke-interface {v5, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v1, v6, v0}, Lcom/google/android/gms/b/d$d;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/b/d$d;

    const-string v6, "&cn"

    const-string v0, "utm_campaign"

    invoke-interface {v5, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v1, v6, v0}, Lcom/google/android/gms/b/d$d;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/b/d$d;

    const-string v6, "&cs"

    const-string v0, "utm_source"

    invoke-interface {v5, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v1, v6, v0}, Lcom/google/android/gms/b/d$d;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/b/d$d;

    const-string v6, "&ck"

    const-string v0, "utm_term"

    invoke-interface {v5, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v1, v6, v0}, Lcom/google/android/gms/b/d$d;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/b/d$d;

    const-string v6, "&ci"

    const-string v0, "utm_id"

    invoke-interface {v5, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v1, v6, v0}, Lcom/google/android/gms/b/d$d;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/b/d$d;

    const-string v6, "&gclid"

    const-string v0, "gclid"

    invoke-interface {v5, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v1, v6, v0}, Lcom/google/android/gms/b/d$d;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/b/d$d;

    const-string v6, "&dclid"

    const-string v0, "dclid"

    invoke-interface {v5, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v1, v6, v0}, Lcom/google/android/gms/b/d$d;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/b/d$d;

    const-string v6, "&gmob_t"

    const-string v0, "gmob_t"

    invoke-interface {v5, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v1, v6, v0}, Lcom/google/android/gms/b/d$d;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/b/d$d;

    move-object v0, v1

    goto/16 :goto_3

    .line 0
    :cond_8
    iget-object v0, p0, Lcom/google/android/gms/b/at$c;->a:Lcom/google/android/gms/b/at;

    invoke-static {v0}, Lcom/google/android/gms/b/at;->e(Lcom/google/android/gms/b/at;)Lcom/google/android/gms/b/t;

    move-result-object v0

    iget-object v2, p0, Lcom/google/android/gms/b/at$c;->b:Ljava/util/Map;

    const-string v3, "&ht"

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    iget-object v4, p0, Lcom/google/android/gms/b/at$c;->b:Ljava/util/Map;

    .line 7000
    const-string v5, "useSecure"

    invoke-interface {v4, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_9

    const-string v5, "useSecure"

    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-static {v4}, Lcom/google/android/gms/b/w;->c(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_9

    const-string v4, "http:"

    .line 0
    :goto_5
    iget-object v5, p0, Lcom/google/android/gms/b/at$c;->a:Lcom/google/android/gms/b/at;

    invoke-static {v5}, Lcom/google/android/gms/b/at;->d(Lcom/google/android/gms/b/at;)Ljava/util/List;

    move-result-object v5

    invoke-interface/range {v0 .. v5}, Lcom/google/android/gms/b/t;->a(Ljava/util/Map;JLjava/lang/String;Ljava/util/List;)V

    goto/16 :goto_2

    .line 7000
    :cond_9
    const-string v4, "https:"

    goto :goto_5
.end method
