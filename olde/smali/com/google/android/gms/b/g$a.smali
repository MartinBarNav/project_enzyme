.class final Lcom/google/android/gms/b/g$a;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/b/c$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/b/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field a:Z

.field b:J

.field c:Z

.field final synthetic d:Lcom/google/android/gms/b/g;

.field private e:I

.field private f:J

.field private g:Lcom/google/android/gms/internal/f;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/b/g;)V
    .locals 3

    const/4 v2, 0x0

    iput-object p1, p0, Lcom/google/android/gms/b/g$a;->d:Lcom/google/android/gms/b/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean v2, p0, Lcom/google/android/gms/b/g$a;->a:Z

    iput v2, p0, Lcom/google/android/gms/b/g$a;->e:I

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/google/android/gms/b/g$a;->b:J

    iput-boolean v2, p0, Lcom/google/android/gms/b/g$a;->c:Z

    invoke-static {}, Lcom/google/android/gms/internal/g;->c()Lcom/google/android/gms/internal/f;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/b/g$a;->g:Lcom/google/android/gms/internal/f;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    invoke-static {}, Lcom/google/android/gms/b/au;->a()Lcom/google/android/gms/b/au;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/b/au$a;->aj:Lcom/google/android/gms/b/au$a;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/au;->a(Lcom/google/android/gms/b/au$a;)V

    iget v0, p0, Lcom/google/android/gms/b/g$a;->e:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/google/android/gms/b/g$a;->e:I

    const/4 v0, 0x0

    iget v1, p0, Lcom/google/android/gms/b/g$a;->e:I

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/b/g$a;->e:I

    iget v0, p0, Lcom/google/android/gms/b/g$a;->e:I

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/b/g$a;->g:Lcom/google/android/gms/internal/f;

    invoke-interface {v0}, Lcom/google/android/gms/internal/f;->b()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/b/g$a;->f:J

    :cond_0
    return-void
.end method

.method public final a(Landroid/app/Activity;)V
    .locals 12

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x1

    .line 0
    invoke-static {}, Lcom/google/android/gms/b/au;->a()Lcom/google/android/gms/b/au;

    move-result-object v0

    sget-object v3, Lcom/google/android/gms/b/au$a;->ai:Lcom/google/android/gms/b/au$a;

    invoke-virtual {v0, v3}, Lcom/google/android/gms/b/au;->a(Lcom/google/android/gms/b/au$a;)V

    iget v0, p0, Lcom/google/android/gms/b/g$a;->e:I

    if-nez v0, :cond_0

    .line 6000
    iget-object v0, p0, Lcom/google/android/gms/b/g$a;->g:Lcom/google/android/gms/internal/f;

    invoke-interface {v0}, Lcom/google/android/gms/internal/f;->b()J

    move-result-wide v4

    iget-wide v6, p0, Lcom/google/android/gms/b/g$a;->f:J

    const-wide/16 v8, 0x3e8

    iget-wide v10, p0, Lcom/google/android/gms/b/g$a;->b:J

    invoke-static {v8, v9, v10, v11}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v8

    add-long/2addr v6, v8

    cmp-long v0, v4, v6

    if-ltz v0, :cond_a

    move v0, v1

    .line 0
    :goto_0
    if-eqz v0, :cond_0

    iput-boolean v1, p0, Lcom/google/android/gms/b/g$a;->c:Z

    :cond_0
    iget v0, p0, Lcom/google/android/gms/b/g$a;->e:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/android/gms/b/g$a;->e:I

    iget-boolean v0, p0, Lcom/google/android/gms/b/g$a;->a:Z

    if-eqz v0, :cond_9

    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    if-eqz v0, :cond_8

    iget-object v3, p0, Lcom/google/android/gms/b/g$a;->d:Lcom/google/android/gms/b/g;

    invoke-virtual {v0}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v0

    .line 7000
    if-eqz v0, :cond_8

    const-string v4, "referrer"

    invoke-virtual {v0, v4}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_8

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "http://hostname/?"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    const-string v4, "utm_id"

    invoke-virtual {v0, v4}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_1

    iget-object v5, v3, Lcom/google/android/gms/b/g;->b:Ljava/util/Map;

    const-string v6, "&ci"

    invoke-interface {v5, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    const-string v4, "utm_campaign"

    invoke-virtual {v0, v4}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_2

    iget-object v5, v3, Lcom/google/android/gms/b/g;->b:Ljava/util/Map;

    const-string v6, "&cn"

    invoke-interface {v5, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    const-string v4, "utm_content"

    invoke-virtual {v0, v4}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_3

    iget-object v5, v3, Lcom/google/android/gms/b/g;->b:Ljava/util/Map;

    const-string v6, "&cc"

    invoke-interface {v5, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    const-string v4, "utm_medium"

    invoke-virtual {v0, v4}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_4

    iget-object v5, v3, Lcom/google/android/gms/b/g;->b:Ljava/util/Map;

    const-string v6, "&cm"

    invoke-interface {v5, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    const-string v4, "utm_source"

    invoke-virtual {v0, v4}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_5

    iget-object v5, v3, Lcom/google/android/gms/b/g;->b:Ljava/util/Map;

    const-string v6, "&cs"

    invoke-interface {v5, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    const-string v4, "utm_term"

    invoke-virtual {v0, v4}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_6

    iget-object v5, v3, Lcom/google/android/gms/b/g;->b:Ljava/util/Map;

    const-string v6, "&ck"

    invoke-interface {v5, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_6
    const-string v4, "dclid"

    invoke-virtual {v0, v4}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_7

    iget-object v5, v3, Lcom/google/android/gms/b/g;->b:Ljava/util/Map;

    const-string v6, "&dclid"

    invoke-interface {v5, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_7
    const-string v4, "gclid"

    invoke-virtual {v0, v4}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_8

    iget-object v3, v3, Lcom/google/android/gms/b/g;->b:Ljava/util/Map;

    const-string v4, "&gclid"

    invoke-interface {v3, v4, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 0
    :cond_8
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    const-string v0, "&t"

    const-string v4, "screenview"

    invoke-interface {v3, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/google/android/gms/b/au;->a()Lcom/google/android/gms/b/au;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/au;->a(Z)V

    iget-object v4, p0, Lcom/google/android/gms/b/g$a;->d:Lcom/google/android/gms/b/g;

    const-string v5, "&cd"

    iget-object v0, p0, Lcom/google/android/gms/b/g$a;->d:Lcom/google/android/gms/b/g;

    .line 8000
    iget-object v0, v0, Lcom/google/android/gms/b/g;->e:Lcom/google/android/gms/b/v;

    .line 0
    if-eqz v0, :cond_c

    iget-object v0, p0, Lcom/google/android/gms/b/g$a;->d:Lcom/google/android/gms/b/g;

    .line 9000
    iget-object v0, v0, Lcom/google/android/gms/b/g;->e:Lcom/google/android/gms/b/v;

    .line 10000
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v1

    .line 11000
    iget-object v0, v0, Lcom/google/android/gms/b/v;->g:Ljava/util/Map;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_b

    .line 0
    :goto_1
    invoke-virtual {v4, v5, v0}, Lcom/google/android/gms/b/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/b/g$a;->d:Lcom/google/android/gms/b/g;

    invoke-virtual {v0, v3}, Lcom/google/android/gms/b/g;->a(Ljava/util/Map;)V

    invoke-static {}, Lcom/google/android/gms/b/au;->a()Lcom/google/android/gms/b/au;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/google/android/gms/b/au;->a(Z)V

    :cond_9
    return-void

    :cond_a
    move v0, v2

    .line 6000
    goto/16 :goto_0

    :cond_b
    move-object v0, v1

    .line 0
    goto :goto_1

    :cond_c
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    goto :goto_1
.end method

.method final b()V
    .locals 6

    .prologue
    .line 0
    invoke-static {}, Lcom/google/android/gms/b/c;->a()Lcom/google/android/gms/b/c;

    move-result-object v1

    if-nez v1, :cond_1

    const-string v0, "GoogleAnalytics isn\'t initialized for the Tracker!"

    invoke-static {v0}, Lcom/google/android/gms/b/n;->a(Ljava/lang/String;)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-wide v2, p0, Lcom/google/android/gms/b/g$a;->b:J

    const-wide/16 v4, 0x0

    cmp-long v0, v2, v4

    if-gez v0, :cond_2

    iget-boolean v0, p0, Lcom/google/android/gms/b/g$a;->a:Z

    if-eqz v0, :cond_3

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/b/g$a;->d:Lcom/google/android/gms/b/g;

    .line 1000
    iget-object v0, v0, Lcom/google/android/gms/b/g;->d:Lcom/google/android/gms/b/g$a;

    .line 2000
    iget-object v2, v1, Lcom/google/android/gms/b/c;->g:Ljava/util/Set;

    invoke-interface {v2, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    iget-object v0, v1, Lcom/google/android/gms/b/c;->d:Landroid/content/Context;

    instance-of v0, v0, Landroid/app/Application;

    if-eqz v0, :cond_0

    iget-object v0, v1, Lcom/google/android/gms/b/c;->d:Landroid/content/Context;

    check-cast v0, Landroid/app/Application;

    .line 3000
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0xe

    if-lt v2, v3, :cond_0

    iget-boolean v2, v1, Lcom/google/android/gms/b/c;->h:Z

    if-nez v2, :cond_0

    new-instance v2, Lcom/google/android/gms/b/c$b;

    invoke-direct {v2, v1}, Lcom/google/android/gms/b/c$b;-><init>(Lcom/google/android/gms/b/c;)V

    invoke-virtual {v0, v2}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    const/4 v0, 0x1

    iput-boolean v0, v1, Lcom/google/android/gms/b/c;->h:Z

    goto :goto_0

    .line 0
    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/b/g$a;->d:Lcom/google/android/gms/b/g;

    .line 4000
    iget-object v0, v0, Lcom/google/android/gms/b/g;->d:Lcom/google/android/gms/b/g$a;

    .line 5000
    iget-object v1, v1, Lcom/google/android/gms/b/c;->g:Ljava/util/Set;

    invoke-interface {v1, v0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    goto :goto_0
.end method
