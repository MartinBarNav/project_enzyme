.class final Lcom/google/android/gms/b/as;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/b/t;
.implements Lcom/google/android/gms/b/y$b;
.implements Lcom/google/android/gms/b/y$c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/b/as$2;,
        Lcom/google/android/gms/b/as$d;,
        Lcom/google/android/gms/b/as$b;,
        Lcom/google/android/gms/b/as$e;,
        Lcom/google/android/gms/b/as$c;,
        Lcom/google/android/gms/b/as$a;
    }
.end annotation


# instance fields
.field volatile a:J

.field volatile b:I

.field final c:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue",
            "<",
            "Lcom/google/android/gms/b/as$d;",
            ">;"
        }
    .end annotation
.end field

.field volatile d:Ljava/util/Timer;

.field e:Lcom/google/android/gms/internal/f;

.field f:J

.field private volatile g:Lcom/google/android/gms/b/x;

.field private h:Lcom/google/android/gms/b/z;

.field private i:Lcom/google/android/gms/b/z;

.field private final j:Lcom/google/android/gms/b/c;

.field private final k:Lcom/google/android/gms/b/ab;

.field private final l:Landroid/content/Context;

.field private volatile m:I

.field private volatile n:Ljava/util/Timer;

.field private volatile o:Ljava/util/Timer;

.field private p:Z

.field private q:Z

.field private r:Z

.field private s:Z


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/google/android/gms/b/ab;)V
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/b/c;->a(Landroid/content/Context;)Lcom/google/android/gms/b/c;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/gms/b/as;-><init>(Landroid/content/Context;Lcom/google/android/gms/b/ab;Lcom/google/android/gms/b/c;)V

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Lcom/google/android/gms/b/ab;Lcom/google/android/gms/b/c;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/b/as;->c:Ljava/util/Queue;

    const-wide/32 v0, 0x493e0

    iput-wide v0, p0, Lcom/google/android/gms/b/as;->f:J

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/b/as;->i:Lcom/google/android/gms/b/z;

    iput-object p1, p0, Lcom/google/android/gms/b/as;->l:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/b/as;->k:Lcom/google/android/gms/b/ab;

    iput-object p3, p0, Lcom/google/android/gms/b/as;->j:Lcom/google/android/gms/b/c;

    invoke-static {}, Lcom/google/android/gms/internal/g;->c()Lcom/google/android/gms/internal/f;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/b/as;->e:Lcom/google/android/gms/internal/f;

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/b/as;->m:I

    sget v0, Lcom/google/android/gms/b/as$a;->g:I

    iput v0, p0, Lcom/google/android/gms/b/as;->b:I

    return-void
.end method

.method private static a(Ljava/util/Timer;)Ljava/util/Timer;
    .locals 1

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/util/Timer;->cancel()V

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method private j()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/as;->n:Ljava/util/Timer;

    invoke-static {v0}, Lcom/google/android/gms/b/as;->a(Ljava/util/Timer;)Ljava/util/Timer;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/b/as;->n:Ljava/util/Timer;

    iget-object v0, p0, Lcom/google/android/gms/b/as;->o:Ljava/util/Timer;

    invoke-static {v0}, Lcom/google/android/gms/b/as;->a(Ljava/util/Timer;)Ljava/util/Timer;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/b/as;->o:Ljava/util/Timer;

    iget-object v0, p0, Lcom/google/android/gms/b/as;->d:Ljava/util/Timer;

    invoke-static {v0}, Lcom/google/android/gms/b/as;->a(Ljava/util/Timer;)Ljava/util/Timer;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/b/as;->d:Ljava/util/Timer;

    return-void
.end method

.method private k()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/as;->h:Lcom/google/android/gms/b/z;

    invoke-interface {v0}, Lcom/google/android/gms/b/z;->b()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/b/as;->p:Z

    return-void
.end method

.method private l()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/b/as;->n:Ljava/util/Timer;

    invoke-static {v0}, Lcom/google/android/gms/b/as;->a(Ljava/util/Timer;)Ljava/util/Timer;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/b/as;->n:Ljava/util/Timer;

    new-instance v0, Ljava/util/Timer;

    const-string v1, "Service Reconnect"

    invoke-direct {v0, v1}, Ljava/util/Timer;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/google/android/gms/b/as;->n:Ljava/util/Timer;

    iget-object v0, p0, Lcom/google/android/gms/b/as;->n:Ljava/util/Timer;

    new-instance v1, Lcom/google/android/gms/b/as$e;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/google/android/gms/b/as$e;-><init>(Lcom/google/android/gms/b/as;B)V

    const-wide/16 v2, 0x1388

    invoke-virtual {v0, v1, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    return-void
.end method


# virtual methods
.method public final declared-synchronized a()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/b/as;->s:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    :goto_0
    :pswitch_0
    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    const-string v0, "setForceLocalDispatch called."

    invoke-static {v0}, Lcom/google/android/gms/b/n;->c(Ljava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/b/as;->s:Z

    sget-object v0, Lcom/google/android/gms/b/as$2;->a:[I

    iget v1, p0, Lcom/google/android/gms/b/as;->b:I

    add-int/lit8 v1, v1, -0x1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_1
    invoke-virtual {p0}, Lcom/google/android/gms/b/as;->i()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    :pswitch_2
    const/4 v0, 0x1

    :try_start_2
    iput-boolean v0, p0, Lcom/google/android/gms/b/as;->r:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public final declared-synchronized a(I)V
    .locals 2

    monitor-enter p0

    :try_start_0
    sget v0, Lcom/google/android/gms/b/as$a;->e:I

    iput v0, p0, Lcom/google/android/gms/b/as;->b:I

    iget v0, p0, Lcom/google/android/gms/b/as;->m:I

    const/4 v1, 0x2

    if-ge v0, v1, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Service unavailable (code="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "), will retry."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/b/n;->d(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/google/android/gms/b/as;->l()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Service unavailable (code="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "), using local store."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/b/n;->d(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/android/gms/b/as;->g()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final a(Ljava/util/Map;JLjava/lang/String;Ljava/util/List;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;J",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/ha;",
            ">;)V"
        }
    .end annotation

    const-string v0, "putHit called"

    invoke-static {v0}, Lcom/google/android/gms/b/n;->c(Ljava/lang/String;)V

    iget-object v6, p0, Lcom/google/android/gms/b/as;->c:Ljava/util/Queue;

    new-instance v0, Lcom/google/android/gms/b/as$d;

    move-object v1, p1

    move-wide v2, p2

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/b/as$d;-><init>(Ljava/util/Map;JLjava/lang/String;Ljava/util/List;)V

    invoke-interface {v6, v0}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Lcom/google/android/gms/b/as;->f()V

    return-void
.end method

.method public final b()V
    .locals 2

    sget-object v0, Lcom/google/android/gms/b/as$2;->a:[I

    iget v1, p0, Lcom/google/android/gms/b/as;->b:I

    add-int/lit8 v1, v1, -0x1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/b/as;->p:Z

    :goto_0
    :pswitch_0
    return-void

    :pswitch_1
    invoke-direct {p0}, Lcom/google/android/gms/b/as;->k()V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final c()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/b/as;->g:Lcom/google/android/gms/b/x;

    if-eqz v0, :cond_0

    :goto_0
    return-void

    :cond_0
    new-instance v0, Lcom/google/android/gms/b/y;

    iget-object v1, p0, Lcom/google/android/gms/b/as;->l:Landroid/content/Context;

    invoke-direct {v0, v1, p0, p0}, Lcom/google/android/gms/b/y;-><init>(Landroid/content/Context;Lcom/google/android/gms/b/y$b;Lcom/google/android/gms/b/y$c;)V

    iput-object v0, p0, Lcom/google/android/gms/b/as;->g:Lcom/google/android/gms/b/x;

    invoke-virtual {p0}, Lcom/google/android/gms/b/as;->h()V

    goto :goto_0
.end method

.method public final declared-synchronized d()V
    .locals 4

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/b/as;->o:Ljava/util/Timer;

    invoke-static {v0}, Lcom/google/android/gms/b/as;->a(Ljava/util/Timer;)Ljava/util/Timer;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/b/as;->o:Ljava/util/Timer;

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/b/as;->m:I

    const-string v0, "Connected to service"

    invoke-static {v0}, Lcom/google/android/gms/b/n;->c(Ljava/lang/String;)V

    sget v0, Lcom/google/android/gms/b/as$a;->b:I

    iput v0, p0, Lcom/google/android/gms/b/as;->b:I

    iget-boolean v0, p0, Lcom/google/android/gms/b/as;->r:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/b/as;->i()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/b/as;->r:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    invoke-virtual {p0}, Lcom/google/android/gms/b/as;->f()V

    iget-object v0, p0, Lcom/google/android/gms/b/as;->d:Ljava/util/Timer;

    invoke-static {v0}, Lcom/google/android/gms/b/as;->a(Ljava/util/Timer;)Ljava/util/Timer;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/b/as;->d:Ljava/util/Timer;

    new-instance v0, Ljava/util/Timer;

    const-string v1, "disconnect check"

    invoke-direct {v0, v1}, Ljava/util/Timer;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/google/android/gms/b/as;->d:Ljava/util/Timer;

    iget-object v0, p0, Lcom/google/android/gms/b/as;->d:Ljava/util/Timer;

    new-instance v1, Lcom/google/android/gms/b/as$b;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/google/android/gms/b/as$b;-><init>(Lcom/google/android/gms/b/as;B)V

    iget-wide v2, p0, Lcom/google/android/gms/b/as;->f:J

    invoke-virtual {v0, v1, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized e()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget v0, p0, Lcom/google/android/gms/b/as;->b:I

    sget v1, Lcom/google/android/gms/b/as$a;->d:I

    if-ne v0, v1, :cond_0

    const-string v0, "Service blocked."

    invoke-static {v0}, Lcom/google/android/gms/b/n;->c(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/google/android/gms/b/as;->j()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    iget v0, p0, Lcom/google/android/gms/b/as;->b:I

    sget v1, Lcom/google/android/gms/b/as$a;->f:I

    if-ne v0, v1, :cond_1

    const-string v0, "Disconnected from service"

    invoke-static {v0}, Lcom/google/android/gms/b/n;->c(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/google/android/gms/b/as;->j()V

    sget v0, Lcom/google/android/gms/b/as$a;->g:I

    iput v0, p0, Lcom/google/android/gms/b/as;->b:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    :cond_1
    :try_start_2
    const-string v0, "Unexpected disconnect."

    invoke-static {v0}, Lcom/google/android/gms/b/n;->c(Ljava/lang/String;)V

    sget v0, Lcom/google/android/gms/b/as$a;->e:I

    iput v0, p0, Lcom/google/android/gms/b/as;->b:I

    iget v0, p0, Lcom/google/android/gms/b/as;->m:I

    const/4 v1, 0x2

    if-ge v0, v1, :cond_2

    invoke-direct {p0}, Lcom/google/android/gms/b/as;->l()V

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Lcom/google/android/gms/b/as;->g()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0
.end method

.method final declared-synchronized f()V
    .locals 8

    .prologue
    .line 0
    monitor-enter p0

    :try_start_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/b/as;->k:Lcom/google/android/gms/b/ab;

    invoke-interface {v3}, Lcom/google/android/gms/b/ab;->d()Ljava/lang/Thread;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    iget-object v2, p0, Lcom/google/android/gms/b/as;->k:Lcom/google/android/gms/b/ab;

    invoke-interface {v2}, Lcom/google/android/gms/b/ab;->c()Ljava/util/concurrent/LinkedBlockingQueue;

    move-result-object v2

    new-instance v3, Lcom/google/android/gms/b/as$1;

    invoke-direct {v3, p0}, Lcom/google/android/gms/b/as$1;-><init>(Lcom/google/android/gms/b/as;)V

    invoke-virtual {v2, v3}, Ljava/util/concurrent/LinkedBlockingQueue;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    :cond_1
    :try_start_1
    iget-boolean v2, p0, Lcom/google/android/gms/b/as;->q:Z

    if-eqz v2, :cond_2

    .line 1000
    const-string v2, "clearHits called"

    invoke-static {v2}, Lcom/google/android/gms/b/n;->c(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/google/android/gms/b/as;->c:Ljava/util/Queue;

    invoke-interface {v2}, Ljava/util/Queue;->clear()V

    sget-object v2, Lcom/google/android/gms/b/as$2;->a:[I

    iget v3, p0, Lcom/google/android/gms/b/as;->b:I

    add-int/lit8 v3, v3, -0x1

    aget v2, v2, v3

    packed-switch v2, :pswitch_data_0

    const/4 v2, 0x1

    iput-boolean v2, p0, Lcom/google/android/gms/b/as;->q:Z

    .line 0
    :cond_2
    :goto_1
    sget-object v2, Lcom/google/android/gms/b/as$2;->a:[I

    iget v3, p0, Lcom/google/android/gms/b/as;->b:I

    add-int/lit8 v3, v3, -0x1

    aget v2, v2, v3

    packed-switch v2, :pswitch_data_1

    :pswitch_0
    goto :goto_0

    :goto_2
    :pswitch_1
    iget-object v2, p0, Lcom/google/android/gms/b/as;->c:Ljava/util/Queue;

    invoke-interface {v2}, Ljava/util/Queue;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_3

    iget-object v2, p0, Lcom/google/android/gms/b/as;->c:Ljava/util/Queue;

    invoke-interface {v2}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    move-result-object v2

    move-object v0, v2

    check-cast v0, Lcom/google/android/gms/b/as$d;

    move-object v7, v0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Sending hit to store  "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/google/android/gms/b/n;->c(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/google/android/gms/b/as;->h:Lcom/google/android/gms/b/z;

    .line 2000
    iget-object v3, v7, Lcom/google/android/gms/b/as$d;->a:Ljava/util/Map;

    .line 3000
    iget-wide v4, v7, Lcom/google/android/gms/b/as$d;->b:J

    .line 4000
    iget-object v6, v7, Lcom/google/android/gms/b/as$d;->c:Ljava/lang/String;

    .line 5000
    iget-object v7, v7, Lcom/google/android/gms/b/as$d;->d:Ljava/util/List;

    .line 0
    invoke-interface/range {v2 .. v7}, Lcom/google/android/gms/b/z;->a(Ljava/util/Map;JLjava/lang/String;Ljava/util/Collection;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v2

    monitor-exit p0

    throw v2

    .line 1000
    :pswitch_2
    :try_start_2
    iget-object v2, p0, Lcom/google/android/gms/b/as;->h:Lcom/google/android/gms/b/z;

    invoke-interface {v2}, Lcom/google/android/gms/b/z;->a()V

    const/4 v2, 0x0

    iput-boolean v2, p0, Lcom/google/android/gms/b/as;->q:Z

    goto :goto_1

    :pswitch_3
    iget-object v2, p0, Lcom/google/android/gms/b/as;->g:Lcom/google/android/gms/b/x;

    invoke-interface {v2}, Lcom/google/android/gms/b/x;->a()V

    const/4 v2, 0x0

    iput-boolean v2, p0, Lcom/google/android/gms/b/as;->q:Z

    goto :goto_1

    .line 0
    :pswitch_4
    const-string v2, "Blocked. Dropping hits."

    invoke-static {v2}, Lcom/google/android/gms/b/n;->c(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/google/android/gms/b/as;->c:Ljava/util/Queue;

    invoke-interface {v2}, Ljava/util/Queue;->clear()V

    goto :goto_0

    :cond_3
    iget-boolean v2, p0, Lcom/google/android/gms/b/as;->p:Z

    if-eqz v2, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/b/as;->k()V

    goto/16 :goto_0

    :goto_3
    :pswitch_5
    iget-object v2, p0, Lcom/google/android/gms/b/as;->c:Ljava/util/Queue;

    invoke-interface {v2}, Ljava/util/Queue;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_5

    iget-object v2, p0, Lcom/google/android/gms/b/as;->c:Ljava/util/Queue;

    invoke-interface {v2}, Ljava/util/Queue;->peek()Ljava/lang/Object;

    move-result-object v2

    move-object v0, v2

    check-cast v0, Lcom/google/android/gms/b/as$d;

    move-object v7, v0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Sending hit to service   "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/google/android/gms/b/n;->c(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/google/android/gms/b/as;->j:Lcom/google/android/gms/b/c;

    .line 6000
    invoke-static {}, Lcom/google/android/gms/b/au;->a()Lcom/google/android/gms/b/au;

    move-result-object v3

    sget-object v4, Lcom/google/android/gms/b/au$a;->ad:Lcom/google/android/gms/b/au$a;

    invoke-virtual {v3, v4}, Lcom/google/android/gms/b/au;->a(Lcom/google/android/gms/b/au$a;)V

    iget-boolean v2, v2, Lcom/google/android/gms/b/c;->a:Z

    .line 0
    if-nez v2, :cond_4

    iget-object v2, p0, Lcom/google/android/gms/b/as;->g:Lcom/google/android/gms/b/x;

    .line 7000
    iget-object v3, v7, Lcom/google/android/gms/b/as$d;->a:Ljava/util/Map;

    .line 8000
    iget-wide v4, v7, Lcom/google/android/gms/b/as$d;->b:J

    .line 9000
    iget-object v6, v7, Lcom/google/android/gms/b/as$d;->c:Ljava/lang/String;

    .line 10000
    iget-object v7, v7, Lcom/google/android/gms/b/as$d;->d:Ljava/util/List;

    .line 0
    invoke-interface/range {v2 .. v7}, Lcom/google/android/gms/b/x;->a(Ljava/util/Map;JLjava/lang/String;Ljava/util/List;)V

    :goto_4
    iget-object v2, p0, Lcom/google/android/gms/b/as;->c:Ljava/util/Queue;

    invoke-interface {v2}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    goto :goto_3

    :cond_4
    const-string v2, "Dry run enabled. Hit not actually sent to service."

    invoke-static {v2}, Lcom/google/android/gms/b/n;->c(Ljava/lang/String;)V

    goto :goto_4

    :cond_5
    iget-object v2, p0, Lcom/google/android/gms/b/as;->e:Lcom/google/android/gms/internal/f;

    invoke-interface {v2}, Lcom/google/android/gms/internal/f;->b()J

    move-result-wide v2

    iput-wide v2, p0, Lcom/google/android/gms/b/as;->a:J

    goto/16 :goto_0

    :pswitch_6
    const-string v2, "Need to reconnect"

    invoke-static {v2}, Lcom/google/android/gms/b/n;->c(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/google/android/gms/b/as;->c:Ljava/util/Queue;

    invoke-interface {v2}, Ljava/util/Queue;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/b/as;->h()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto/16 :goto_0

    .line 1000
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_3
    .end packed-switch

    .line 0
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_1
        :pswitch_5
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_6
        :pswitch_4
    .end packed-switch
.end method

.method final declared-synchronized g()V
    .locals 3

    monitor-enter p0

    :try_start_0
    iget v0, p0, Lcom/google/android/gms/b/as;->b:I

    sget v1, Lcom/google/android/gms/b/as$a;->c:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne v0, v1, :cond_0

    :goto_0
    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/b/as;->l:Landroid/content/Context;

    if-eqz v0, :cond_1

    const-string v0, "com.google.android.gms"

    iget-object v1, p0, Lcom/google/android/gms/b/as;->l:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget v0, Lcom/google/android/gms/b/as$a;->d:I

    iput v0, p0, Lcom/google/android/gms/b/as;->b:I

    iget-object v0, p0, Lcom/google/android/gms/b/as;->g:Lcom/google/android/gms/b/x;

    invoke-interface {v0}, Lcom/google/android/gms/b/x;->c()V

    const-string v0, "Attempted to fall back to local store from service."

    invoke-static {v0}, Lcom/google/android/gms/b/n;->d(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    :cond_1
    :try_start_2
    invoke-direct {p0}, Lcom/google/android/gms/b/as;->j()V

    const-string v0, "falling back to local store"

    invoke-static {v0}, Lcom/google/android/gms/b/n;->c(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/b/as;->i:Lcom/google/android/gms/b/z;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/b/as;->i:Lcom/google/android/gms/b/z;

    iput-object v0, p0, Lcom/google/android/gms/b/as;->h:Lcom/google/android/gms/b/z;

    :goto_1
    sget v0, Lcom/google/android/gms/b/as$a;->c:I

    iput v0, p0, Lcom/google/android/gms/b/as;->b:I

    invoke-virtual {p0}, Lcom/google/android/gms/b/as;->f()V

    goto :goto_0

    :cond_2
    invoke-static {}, Lcom/google/android/gms/b/ar;->c()Lcom/google/android/gms/b/ar;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/b/as;->l:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/b/as;->k:Lcom/google/android/gms/b/ab;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/b/ar;->a(Landroid/content/Context;Lcom/google/android/gms/b/ab;)V

    invoke-virtual {v0}, Lcom/google/android/gms/b/ar;->d()Lcom/google/android/gms/b/z;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/b/as;->h:Lcom/google/android/gms/b/z;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1
.end method

.method final declared-synchronized h()V
    .locals 4

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/b/as;->s:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/b/as;->g:Lcom/google/android/gms/b/x;

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/google/android/gms/b/as;->b:I

    sget v1, Lcom/google/android/gms/b/as$a;->c:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eq v0, v1, :cond_0

    :try_start_1
    iget v0, p0, Lcom/google/android/gms/b/as;->m:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/android/gms/b/as;->m:I

    iget-object v0, p0, Lcom/google/android/gms/b/as;->o:Ljava/util/Timer;

    invoke-static {v0}, Lcom/google/android/gms/b/as;->a(Ljava/util/Timer;)Ljava/util/Timer;

    sget v0, Lcom/google/android/gms/b/as$a;->a:I

    iput v0, p0, Lcom/google/android/gms/b/as;->b:I

    new-instance v0, Ljava/util/Timer;

    const-string v1, "Failed Connect"

    invoke-direct {v0, v1}, Ljava/util/Timer;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/google/android/gms/b/as;->o:Ljava/util/Timer;

    iget-object v0, p0, Lcom/google/android/gms/b/as;->o:Ljava/util/Timer;

    new-instance v1, Lcom/google/android/gms/b/as$c;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/google/android/gms/b/as$c;-><init>(Lcom/google/android/gms/b/as;B)V

    const-wide/16 v2, 0xbb8

    invoke-virtual {v0, v1, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    const-string v0, "connecting to Analytics service"

    invoke-static {v0}, Lcom/google/android/gms/b/n;->c(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/b/as;->g:Lcom/google/android/gms/b/x;

    invoke-interface {v0}, Lcom/google/android/gms/b/x;->b()V
    :try_end_1
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    monitor-exit p0

    return-void

    :catch_0
    move-exception v0

    :try_start_2
    const-string v0, "security exception on connectToService"

    invoke-static {v0}, Lcom/google/android/gms/b/n;->d(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/android/gms/b/as;->g()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    :cond_0
    :try_start_3
    const-string v0, "client not initialized."

    invoke-static {v0}, Lcom/google/android/gms/b/n;->d(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/android/gms/b/as;->g()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_0
.end method

.method final declared-synchronized i()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/b/as;->g:Lcom/google/android/gms/b/x;

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/google/android/gms/b/as;->b:I

    sget v1, Lcom/google/android/gms/b/as$a;->b:I

    if-ne v0, v1, :cond_0

    sget v0, Lcom/google/android/gms/b/as$a;->f:I

    iput v0, p0, Lcom/google/android/gms/b/as;->b:I

    iget-object v0, p0, Lcom/google/android/gms/b/as;->g:Lcom/google/android/gms/b/x;

    invoke-interface {v0}, Lcom/google/android/gms/b/x;->c()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
