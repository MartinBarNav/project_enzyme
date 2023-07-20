.class public Lcom/google/android/gms/b/c;
.super Lcom/google/android/gms/b/h;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/b/c$b;,
        Lcom/google/android/gms/b/c$a;
    }
.end annotation


# static fields
.field private static i:Z

.field private static l:Lcom/google/android/gms/b/c;


# instance fields
.field a:Z

.field b:Lcom/google/android/gms/b/ab;

.field c:Lcom/google/android/gms/b/s;

.field d:Landroid/content/Context;

.field volatile e:Ljava/lang/Boolean;

.field f:Lcom/google/android/gms/b/e;

.field g:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/google/android/gms/b/c$a;",
            ">;"
        }
    .end annotation
.end field

.field h:Z

.field private j:Ljava/lang/String;

.field private k:Ljava/lang/String;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 2

    invoke-static {p1}, Lcom/google/android/gms/b/at;->a(Landroid/content/Context;)Lcom/google/android/gms/b/at;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/b/ar;->c()Lcom/google/android/gms/b/ar;

    move-result-object v1

    invoke-direct {p0, p1, v0, v1}, Lcom/google/android/gms/b/c;-><init>(Landroid/content/Context;Lcom/google/android/gms/b/ab;Lcom/google/android/gms/b/s;)V

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Lcom/google/android/gms/b/ab;Lcom/google/android/gms/b/s;)V
    .locals 7

    .prologue
    const/4 v4, -0x1

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 0
    invoke-direct {p0}, Lcom/google/android/gms/b/h;-><init>()V

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/b/c;->e:Ljava/lang/Boolean;

    iput-boolean v2, p0, Lcom/google/android/gms/b/c;->h:Z

    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "context cannot be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/b/c;->d:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/b/c;->b:Lcom/google/android/gms/b/ab;

    iput-object p3, p0, Lcom/google/android/gms/b/c;->c:Lcom/google/android/gms/b/s;

    iget-object v0, p0, Lcom/google/android/gms/b/c;->d:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/b/ac;->a(Landroid/content/Context;)V

    iget-object v0, p0, Lcom/google/android/gms/b/c;->d:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/b/r;->a(Landroid/content/Context;)V

    iget-object v0, p0, Lcom/google/android/gms/b/c;->d:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/b/ag;->a(Landroid/content/Context;)V

    new-instance v0, Lcom/google/android/gms/b/al;

    invoke-direct {v0}, Lcom/google/android/gms/b/al;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/b/c;->f:Lcom/google/android/gms/b/e;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/b/c;->g:Ljava/util/Set;

    .line 1000
    sget-boolean v0, Lcom/google/android/gms/b/c;->i:Z

    if-nez v0, :cond_1

    const/4 v3, 0x0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/b/c;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    iget-object v5, p0, Lcom/google/android/gms/b/c;->d:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v5

    const/16 v6, 0x81

    invoke-virtual {v0, v5, v6}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    if-nez v0, :cond_2

    const-string v0, "Couldn\'t get ApplicationInfo to load gloabl config."

    invoke-static {v0}, Lcom/google/android/gms/b/n;->d(Ljava/lang/String;)V

    :cond_1
    :goto_1
    return-void

    :catch_0
    move-exception v0

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "PackageManager doesn\'t know about package: "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/b/n;->c(Ljava/lang/String;)V

    move-object v0, v3

    goto :goto_0

    :cond_2
    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    if-eqz v0, :cond_1

    const-string v3, "com.google.android.gms.analytics.globalConfigResource"

    invoke-virtual {v0, v3}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    if-lez v0, :cond_1

    new-instance v3, Lcom/google/android/gms/b/av;

    iget-object v5, p0, Lcom/google/android/gms/b/c;->d:Landroid/content/Context;

    invoke-direct {v3, v5}, Lcom/google/android/gms/b/av;-><init>(Landroid/content/Context;)V

    invoke-virtual {v3, v0}, Lcom/google/android/gms/b/av;->a(I)Lcom/google/android/gms/b/ai;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/j;

    if-eqz v0, :cond_1

    .line 2000
    const-string v3, "Loading global config values."

    invoke-static {v3}, Lcom/google/android/gms/b/n;->c(Ljava/lang/String;)V

    .line 3000
    iget-object v3, v0, Lcom/google/android/gms/b/j;->a:Ljava/lang/String;

    if-eqz v3, :cond_7

    move v3, v1

    .line 2000
    :goto_2
    if-eqz v3, :cond_3

    .line 4000
    iget-object v3, v0, Lcom/google/android/gms/b/j;->a:Ljava/lang/String;

    .line 2000
    iput-object v3, p0, Lcom/google/android/gms/b/c;->k:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v5, "app name loaded: "

    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v5, p0, Lcom/google/android/gms/b/c;->k:Ljava/lang/String;

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/google/android/gms/b/n;->c(Ljava/lang/String;)V

    .line 5000
    :cond_3
    iget-object v3, v0, Lcom/google/android/gms/b/j;->b:Ljava/lang/String;

    if-eqz v3, :cond_8

    move v3, v1

    .line 2000
    :goto_3
    if-eqz v3, :cond_4

    .line 6000
    iget-object v3, v0, Lcom/google/android/gms/b/j;->b:Ljava/lang/String;

    .line 2000
    iput-object v3, p0, Lcom/google/android/gms/b/c;->j:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v5, "app version loaded: "

    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v5, p0, Lcom/google/android/gms/b/c;->j:Ljava/lang/String;

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/google/android/gms/b/n;->c(Ljava/lang/String;)V

    .line 7000
    :cond_4
    iget-object v3, v0, Lcom/google/android/gms/b/j;->c:Ljava/lang/String;

    if-eqz v3, :cond_9

    move v3, v1

    .line 2000
    :goto_4
    if-eqz v3, :cond_5

    .line 8000
    iget-object v3, v0, Lcom/google/android/gms/b/j;->c:Ljava/lang/String;

    .line 9000
    invoke-virtual {v3}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v3

    const-string v5, "verbose"

    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_a

    move v3, v2

    .line 2000
    :goto_5
    if-ltz v3, :cond_5

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "log level loaded: "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/google/android/gms/b/n;->c(Ljava/lang/String;)V

    .line 10000
    iget-object v5, p0, Lcom/google/android/gms/b/c;->f:Lcom/google/android/gms/b/e;

    .line 2000
    invoke-interface {v5, v3}, Lcom/google/android/gms/b/e;->a(I)V

    .line 11000
    :cond_5
    iget v3, v0, Lcom/google/android/gms/b/j;->d:I

    if-ltz v3, :cond_e

    move v3, v1

    .line 2000
    :goto_6
    if-eqz v3, :cond_6

    iget-object v3, p0, Lcom/google/android/gms/b/c;->c:Lcom/google/android/gms/b/s;

    .line 12000
    iget v5, v0, Lcom/google/android/gms/b/j;->d:I

    .line 2000
    invoke-virtual {v3, v5}, Lcom/google/android/gms/b/s;->a(I)V

    .line 13000
    :cond_6
    iget v3, v0, Lcom/google/android/gms/b/j;->e:I

    if-eq v3, v4, :cond_f

    move v3, v1

    .line 2000
    :goto_7
    if-eqz v3, :cond_1

    .line 14000
    iget v0, v0, Lcom/google/android/gms/b/j;->e:I

    if-ne v0, v1, :cond_10

    move v0, v1

    .line 15000
    :goto_8
    invoke-static {}, Lcom/google/android/gms/b/au;->a()Lcom/google/android/gms/b/au;

    move-result-object v1

    sget-object v2, Lcom/google/android/gms/b/au$a;->ac:Lcom/google/android/gms/b/au$a;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/b/au;->a(Lcom/google/android/gms/b/au$a;)V

    iput-boolean v0, p0, Lcom/google/android/gms/b/c;->a:Z

    goto/16 :goto_1

    :cond_7
    move v3, v2

    .line 3000
    goto/16 :goto_2

    :cond_8
    move v3, v2

    .line 5000
    goto :goto_3

    :cond_9
    move v3, v2

    .line 7000
    goto :goto_4

    .line 9000
    :cond_a
    const-string v5, "info"

    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_b

    move v3, v1

    goto :goto_5

    :cond_b
    const-string v5, "warning"

    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_c

    const/4 v3, 0x2

    goto :goto_5

    :cond_c
    const-string v5, "error"

    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_d

    const/4 v3, 0x3

    goto :goto_5

    :cond_d
    move v3, v4

    goto :goto_5

    :cond_e
    move v3, v2

    .line 11000
    goto :goto_6

    :cond_f
    move v3, v2

    .line 13000
    goto :goto_7

    :cond_10
    move v0, v2

    .line 14000
    goto :goto_8
.end method

.method static a()Lcom/google/android/gms/b/c;
    .locals 2

    const-class v1, Lcom/google/android/gms/b/c;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/google/android/gms/b/c;->l:Lcom/google/android/gms/b/c;

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public static a(Landroid/content/Context;)Lcom/google/android/gms/b/c;
    .locals 2

    const-class v1, Lcom/google/android/gms/b/c;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/google/android/gms/b/c;->l:Lcom/google/android/gms/b/c;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/b/c;

    invoke-direct {v0, p0}, Lcom/google/android/gms/b/c;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/google/android/gms/b/c;->l:Lcom/google/android/gms/b/c;

    :cond_0
    sget-object v0, Lcom/google/android/gms/b/c;->l:Lcom/google/android/gms/b/c;

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method


# virtual methods
.method final a(Ljava/util/Map;)V
    .locals 2
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

    monitor-enter p0

    :try_start_0
    const-string v0, "&ul"

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/b/w;->a(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/b/w;->a(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "&sr"

    invoke-static {}, Lcom/google/android/gms/b/r;->a()Lcom/google/android/gms/b/r;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/b/w;->a(Ljava/util/Map;Ljava/lang/String;Lcom/google/android/gms/b/am;)V

    const-string v0, "&_u"

    invoke-static {}, Lcom/google/android/gms/b/au;->a()Lcom/google/android/gms/b/au;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/b/au;->c()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/google/android/gms/b/au;->a()Lcom/google/android/gms/b/au;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/au;->b()Ljava/lang/String;

    iget-object v0, p0, Lcom/google/android/gms/b/c;->b:Lcom/google/android/gms/b/ab;

    invoke-interface {v0, p1}, Lcom/google/android/gms/b/ab;->a(Ljava/util/Map;)V

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final b()Lcom/google/android/gms/b/g;
    .locals 9

    .prologue
    const/4 v8, -0x1

    const/4 v2, 0x0

    const/4 v1, 0x1

    .line 0
    monitor-enter p0

    :try_start_0
    invoke-static {}, Lcom/google/android/gms/b/au;->a()Lcom/google/android/gms/b/au;

    move-result-object v0

    sget-object v3, Lcom/google/android/gms/b/au$a;->N:Lcom/google/android/gms/b/au$a;

    invoke-virtual {v0, v3}, Lcom/google/android/gms/b/au;->a(Lcom/google/android/gms/b/au$a;)V

    new-instance v3, Lcom/google/android/gms/b/g;

    iget-object v0, p0, Lcom/google/android/gms/b/c;->d:Landroid/content/Context;

    invoke-direct {v3, p0, v0}, Lcom/google/android/gms/b/g;-><init>(Lcom/google/android/gms/b/h;Landroid/content/Context;)V

    new-instance v0, Lcom/google/android/gms/b/u;

    iget-object v4, p0, Lcom/google/android/gms/b/c;->d:Landroid/content/Context;

    invoke-direct {v0, v4}, Lcom/google/android/gms/b/u;-><init>(Landroid/content/Context;)V

    const v4, 0x7f110002

    invoke-virtual {v0, v4}, Lcom/google/android/gms/b/u;->a(I)Lcom/google/android/gms/b/ai;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/v;

    if-eqz v0, :cond_6

    .line 16000
    const-string v4, "Loading Tracker config values."

    invoke-static {v4}, Lcom/google/android/gms/b/n;->c(Ljava/lang/String;)V

    iput-object v0, v3, Lcom/google/android/gms/b/g;->e:Lcom/google/android/gms/b/v;

    iget-object v0, v3, Lcom/google/android/gms/b/g;->e:Lcom/google/android/gms/b/v;

    .line 17000
    iget-object v0, v0, Lcom/google/android/gms/b/v;->a:Ljava/lang/String;

    if-eqz v0, :cond_9

    move v0, v1

    .line 16000
    :goto_0
    if-eqz v0, :cond_0

    iget-object v0, v3, Lcom/google/android/gms/b/g;->e:Lcom/google/android/gms/b/v;

    .line 18000
    iget-object v0, v0, Lcom/google/android/gms/b/v;->a:Ljava/lang/String;

    .line 16000
    const-string v4, "&tid"

    invoke-virtual {v3, v4, v0}, Lcom/google/android/gms/b/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "[Tracker] trackingId loaded: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/b/n;->c(Ljava/lang/String;)V

    :cond_0
    iget-object v0, v3, Lcom/google/android/gms/b/g;->e:Lcom/google/android/gms/b/v;

    .line 19000
    iget-wide v4, v0, Lcom/google/android/gms/b/v;->b:D

    const-wide/16 v6, 0x0

    cmpl-double v0, v4, v6

    if-ltz v0, :cond_a

    move v0, v1

    .line 16000
    :goto_1
    if-eqz v0, :cond_1

    iget-object v0, v3, Lcom/google/android/gms/b/g;->e:Lcom/google/android/gms/b/v;

    .line 20000
    iget-wide v4, v0, Lcom/google/android/gms/b/v;->b:D

    .line 16000
    invoke-static {v4, v5}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    move-result-object v0

    const-string v4, "&sf"

    invoke-virtual {v3, v4, v0}, Lcom/google/android/gms/b/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "[Tracker] sample frequency loaded: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/b/n;->c(Ljava/lang/String;)V

    :cond_1
    iget-object v0, v3, Lcom/google/android/gms/b/g;->e:Lcom/google/android/gms/b/v;

    .line 21000
    iget v0, v0, Lcom/google/android/gms/b/v;->c:I

    if-ltz v0, :cond_b

    move v0, v1

    .line 16000
    :goto_2
    if-eqz v0, :cond_2

    iget-object v0, v3, Lcom/google/android/gms/b/g;->e:Lcom/google/android/gms/b/v;

    .line 22000
    iget v0, v0, Lcom/google/android/gms/b/v;->c:I

    .line 16000
    int-to-long v4, v0

    .line 23000
    iget-object v0, v3, Lcom/google/android/gms/b/g;->d:Lcom/google/android/gms/b/g$a;

    const-wide/16 v6, 0x3e8

    mul-long/2addr v4, v6

    .line 24000
    iput-wide v4, v0, Lcom/google/android/gms/b/g$a;->b:J

    invoke-virtual {v0}, Lcom/google/android/gms/b/g$a;->b()V

    .line 16000
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v4, "[Tracker] session timeout loaded: "

    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 25000
    iget-object v4, v3, Lcom/google/android/gms/b/g;->d:Lcom/google/android/gms/b/g$a;

    .line 26000
    iget-wide v4, v4, Lcom/google/android/gms/b/g$a;->b:J

    .line 16000
    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/b/n;->c(Ljava/lang/String;)V

    :cond_2
    iget-object v0, v3, Lcom/google/android/gms/b/g;->e:Lcom/google/android/gms/b/v;

    .line 27000
    iget v0, v0, Lcom/google/android/gms/b/v;->d:I

    if-eq v0, v8, :cond_c

    move v0, v1

    .line 16000
    :goto_3
    if-eqz v0, :cond_3

    iget-object v0, v3, Lcom/google/android/gms/b/g;->e:Lcom/google/android/gms/b/v;

    .line 28000
    iget v0, v0, Lcom/google/android/gms/b/v;->d:I

    if-ne v0, v1, :cond_d

    move v0, v1

    .line 29000
    :goto_4
    iget-object v4, v3, Lcom/google/android/gms/b/g;->d:Lcom/google/android/gms/b/g$a;

    .line 30000
    iput-boolean v0, v4, Lcom/google/android/gms/b/g$a;->a:Z

    invoke-virtual {v4}, Lcom/google/android/gms/b/g$a;->b()V

    .line 16000
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v4, "[Tracker] auto activity tracking loaded: "

    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 31000
    iget-object v4, v3, Lcom/google/android/gms/b/g;->d:Lcom/google/android/gms/b/g$a;

    .line 32000
    iget-boolean v4, v4, Lcom/google/android/gms/b/g$a;->a:Z

    .line 16000
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/b/n;->c(Ljava/lang/String;)V

    :cond_3
    iget-object v0, v3, Lcom/google/android/gms/b/g;->e:Lcom/google/android/gms/b/v;

    .line 33000
    iget v0, v0, Lcom/google/android/gms/b/v;->e:I

    if-eq v0, v8, :cond_e

    move v0, v1

    .line 16000
    :goto_5
    if-eqz v0, :cond_5

    iget-object v0, v3, Lcom/google/android/gms/b/g;->e:Lcom/google/android/gms/b/v;

    .line 34000
    iget v0, v0, Lcom/google/android/gms/b/v;->e:I

    if-ne v0, v1, :cond_f

    move v0, v1

    .line 16000
    :goto_6
    if-eqz v0, :cond_4

    const-string v0, "&aip"

    const-string v4, "1"

    invoke-virtual {v3, v0, v4}, Lcom/google/android/gms/b/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "[Tracker] anonymize ip loaded: true"

    invoke-static {v0}, Lcom/google/android/gms/b/n;->c(Ljava/lang/String;)V

    :cond_4
    const-string v0, "[Tracker] anonymize ip loaded: false"

    invoke-static {v0}, Lcom/google/android/gms/b/n;->c(Ljava/lang/String;)V

    :cond_5
    iget-object v0, v3, Lcom/google/android/gms/b/g;->e:Lcom/google/android/gms/b/v;

    .line 35000
    iget v0, v0, Lcom/google/android/gms/b/v;->f:I

    if-ne v0, v1, :cond_10

    move v0, v1

    .line 36000
    :goto_7
    iget-boolean v1, v3, Lcom/google/android/gms/b/g;->c:Z

    if-eq v1, v0, :cond_6

    iput-boolean v0, v3, Lcom/google/android/gms/b/g;->c:Z

    if-eqz v0, :cond_11

    new-instance v0, Lcom/google/android/gms/b/b;

    invoke-static {}, Ljava/lang/Thread;->getDefaultUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    move-result-object v1

    iget-object v2, v3, Lcom/google/android/gms/b/g;->a:Landroid/content/Context;

    invoke-direct {v0, v3, v1, v2}, Lcom/google/android/gms/b/b;-><init>(Lcom/google/android/gms/b/g;Ljava/lang/Thread$UncaughtExceptionHandler;Landroid/content/Context;)V

    iput-object v0, v3, Lcom/google/android/gms/b/g;->f:Lcom/google/android/gms/b/b;

    iget-object v0, v3, Lcom/google/android/gms/b/g;->f:Lcom/google/android/gms/b/b;

    invoke-static {v0}, Ljava/lang/Thread;->setDefaultUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    const-string v0, "Uncaught exceptions will be reported to Google Analytics."

    invoke-static {v0}, Lcom/google/android/gms/b/n;->c(Ljava/lang/String;)V

    .line 38000
    :cond_6
    :goto_8
    iget-object v0, p0, Lcom/google/android/gms/b/c;->k:Ljava/lang/String;

    if-eqz v0, :cond_7

    const-string v0, "&an"

    iget-object v1, p0, Lcom/google/android/gms/b/c;->k:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Lcom/google/android/gms/b/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/b/c;->j:Ljava/lang/String;

    if-eqz v0, :cond_8

    const-string v0, "&av"

    iget-object v1, p0, Lcom/google/android/gms/b/c;->j:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Lcom/google/android/gms/b/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 0
    :cond_8
    monitor-exit p0

    return-object v3

    :cond_9
    move v0, v2

    .line 17000
    goto/16 :goto_0

    :cond_a
    move v0, v2

    .line 19000
    goto/16 :goto_1

    :cond_b
    move v0, v2

    .line 21000
    goto/16 :goto_2

    :cond_c
    move v0, v2

    .line 27000
    goto/16 :goto_3

    :cond_d
    move v0, v2

    .line 28000
    goto/16 :goto_4

    :cond_e
    move v0, v2

    .line 33000
    goto :goto_5

    :cond_f
    move v0, v2

    .line 34000
    goto :goto_6

    :cond_10
    move v0, v2

    .line 35000
    goto :goto_7

    .line 36000
    :cond_11
    iget-object v0, v3, Lcom/google/android/gms/b/g;->f:Lcom/google/android/gms/b/b;

    if-eqz v0, :cond_12

    iget-object v0, v3, Lcom/google/android/gms/b/g;->f:Lcom/google/android/gms/b/b;

    .line 37000
    iget-object v0, v0, Lcom/google/android/gms/b/b;->a:Ljava/lang/Thread$UncaughtExceptionHandler;

    .line 36000
    invoke-static {v0}, Ljava/lang/Thread;->setDefaultUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    :goto_9
    const-string v0, "Uncaught exceptions will not be reported to Google Analytics."

    invoke-static {v0}, Lcom/google/android/gms/b/n;->c(Ljava/lang/String;)V

    goto :goto_8

    .line 0
    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 36000
    :cond_12
    const/4 v0, 0x0

    :try_start_1
    invoke-static {v0}, Ljava/lang/Thread;->setDefaultUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_9
.end method
