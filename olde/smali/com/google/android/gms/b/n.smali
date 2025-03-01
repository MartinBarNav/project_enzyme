.class public Lcom/google/android/gms/b/n;
.super Ljava/lang/Object;


# static fields
.field private static a:Lcom/google/android/gms/b/c;

.field private static volatile b:Z

.field private static c:Lcom/google/android/gms/b/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    sput-boolean v0, Lcom/google/android/gms/b/n;->b:Z

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/String;)V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/b/n;->b()Lcom/google/android/gms/b/e;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0, p0}, Lcom/google/android/gms/b/e;->d(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static a()Z
    .locals 2

    const/4 v0, 0x0

    invoke-static {}, Lcom/google/android/gms/b/n;->b()Lcom/google/android/gms/b/e;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {}, Lcom/google/android/gms/b/n;->b()Lcom/google/android/gms/b/e;

    move-result-object v1

    invoke-interface {v1}, Lcom/google/android/gms/b/e;->a()I

    move-result v1

    if-nez v1, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0
.end method

.method private static b()Lcom/google/android/gms/b/e;
    .locals 2

    .prologue
    .line 0
    const-class v1, Lcom/google/android/gms/b/n;

    monitor-enter v1

    :try_start_0
    sget-boolean v0, Lcom/google/android/gms/b/n;->b:Z

    if-eqz v0, :cond_1

    sget-object v0, Lcom/google/android/gms/b/n;->c:Lcom/google/android/gms/b/e;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/b/al;

    invoke-direct {v0}, Lcom/google/android/gms/b/al;-><init>()V

    sput-object v0, Lcom/google/android/gms/b/n;->c:Lcom/google/android/gms/b/e;

    :cond_0
    sget-object v0, Lcom/google/android/gms/b/n;->c:Lcom/google/android/gms/b/e;

    monitor-exit v1

    :goto_0
    return-object v0

    :cond_1
    sget-object v0, Lcom/google/android/gms/b/n;->a:Lcom/google/android/gms/b/c;

    if-nez v0, :cond_2

    invoke-static {}, Lcom/google/android/gms/b/c;->a()Lcom/google/android/gms/b/c;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/b/n;->a:Lcom/google/android/gms/b/c;

    :cond_2
    sget-object v0, Lcom/google/android/gms/b/n;->a:Lcom/google/android/gms/b/c;

    if-eqz v0, :cond_3

    sget-object v0, Lcom/google/android/gms/b/n;->a:Lcom/google/android/gms/b/c;

    .line 1000
    iget-object v0, v0, Lcom/google/android/gms/b/c;->f:Lcom/google/android/gms/b/e;

    .line 0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_3
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static b(Ljava/lang/String;)V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/b/n;->b()Lcom/google/android/gms/b/e;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0, p0}, Lcom/google/android/gms/b/e;->b(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static c(Ljava/lang/String;)V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/b/n;->b()Lcom/google/android/gms/b/e;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0, p0}, Lcom/google/android/gms/b/e;->a(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static d(Ljava/lang/String;)V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/b/n;->b()Lcom/google/android/gms/b/e;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0, p0}, Lcom/google/android/gms/b/e;->c(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
