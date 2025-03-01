.class final Lcom/google/android/gms/b/ar;
.super Lcom/google/android/gms/b/s;


# static fields
.field private static final a:Ljava/lang/Object;

.field private static p:Lcom/google/android/gms/b/ar;


# instance fields
.field private b:Landroid/content/Context;

.field private c:Lcom/google/android/gms/b/z;

.field private volatile d:Lcom/google/android/gms/b/ab;

.field private e:I

.field private f:Z

.field private g:Z

.field private h:Ljava/lang/String;

.field private i:Z

.field private j:Z

.field private k:Lcom/google/android/gms/b/aa;

.field private l:Landroid/os/Handler;

.field private m:Lcom/google/android/gms/b/aq;

.field private n:Z

.field private o:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/google/android/gms/b/ar;->a:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>()V
    .locals 3

    const/4 v2, 0x0

    const/4 v1, 0x1

    invoke-direct {p0}, Lcom/google/android/gms/b/s;-><init>()V

    const/16 v0, 0x708

    iput v0, p0, Lcom/google/android/gms/b/ar;->e:I

    iput-boolean v1, p0, Lcom/google/android/gms/b/ar;->f:Z

    iput-boolean v1, p0, Lcom/google/android/gms/b/ar;->i:Z

    iput-boolean v1, p0, Lcom/google/android/gms/b/ar;->j:Z

    new-instance v0, Lcom/google/android/gms/b/ar$1;

    invoke-direct {v0, p0}, Lcom/google/android/gms/b/ar$1;-><init>(Lcom/google/android/gms/b/ar;)V

    iput-object v0, p0, Lcom/google/android/gms/b/ar;->k:Lcom/google/android/gms/b/aa;

    iput-boolean v2, p0, Lcom/google/android/gms/b/ar;->n:Z

    iput-boolean v2, p0, Lcom/google/android/gms/b/ar;->o:Z

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/b/ar;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/b/ar;->i:Z

    return v0
.end method

.method static synthetic b(Lcom/google/android/gms/b/ar;)I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/b/ar;->e:I

    return v0
.end method

.method public static c()Lcom/google/android/gms/b/ar;
    .locals 1

    sget-object v0, Lcom/google/android/gms/b/ar;->p:Lcom/google/android/gms/b/ar;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/b/ar;

    invoke-direct {v0}, Lcom/google/android/gms/b/ar;-><init>()V

    sput-object v0, Lcom/google/android/gms/b/ar;->p:Lcom/google/android/gms/b/ar;

    :cond_0
    sget-object v0, Lcom/google/android/gms/b/ar;->p:Lcom/google/android/gms/b/ar;

    return-object v0
.end method

.method static synthetic c(Lcom/google/android/gms/b/ar;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/b/ar;->n:Z

    return v0
.end method

.method static synthetic d(Lcom/google/android/gms/b/ar;)Landroid/os/Handler;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/ar;->l:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic e()Ljava/lang/Object;
    .locals 1

    sget-object v0, Lcom/google/android/gms/b/ar;->a:Ljava/lang/Object;

    return-object v0
.end method


# virtual methods
.method final declared-synchronized a()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/b/ar;->d:Lcom/google/android/gms/b/ab;

    if-nez v0, :cond_0

    const-string v0, "Dispatch call queued. Dispatch will run once initialization is complete."

    invoke-static {v0}, Lcom/google/android/gms/b/n;->c(Ljava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/b/ar;->f:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    invoke-static {}, Lcom/google/android/gms/b/au;->a()Lcom/google/android/gms/b/au;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/b/au$a;->S:Lcom/google/android/gms/b/au$a;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/au;->a(Lcom/google/android/gms/b/au$a;)V

    iget-object v0, p0, Lcom/google/android/gms/b/ar;->d:Lcom/google/android/gms/b/ab;

    invoke-interface {v0}, Lcom/google/android/gms/b/ab;->a()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method final declared-synchronized a(I)V
    .locals 4

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/b/ar;->l:Landroid/os/Handler;

    if-nez v0, :cond_1

    const-string v0, "Dispatch period set with null handler. Dispatch will run once initialization is complete."

    invoke-static {v0}, Lcom/google/android/gms/b/n;->c(Ljava/lang/String;)V

    iput p1, p0, Lcom/google/android/gms/b/ar;->e:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    :cond_1
    :try_start_1
    invoke-static {}, Lcom/google/android/gms/b/au;->a()Lcom/google/android/gms/b/au;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/b/au$a;->T:Lcom/google/android/gms/b/au$a;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/au;->a(Lcom/google/android/gms/b/au$a;)V

    iget-boolean v0, p0, Lcom/google/android/gms/b/ar;->n:Z

    if-nez v0, :cond_2

    iget-boolean v0, p0, Lcom/google/android/gms/b/ar;->i:Z

    if-eqz v0, :cond_2

    iget v0, p0, Lcom/google/android/gms/b/ar;->e:I

    if-lez v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/b/ar;->l:Landroid/os/Handler;

    const/4 v1, 0x1

    sget-object v2, Lcom/google/android/gms/b/ar;->a:Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    :cond_2
    iput p1, p0, Lcom/google/android/gms/b/ar;->e:I

    if-lez p1, :cond_0

    iget-boolean v0, p0, Lcom/google/android/gms/b/ar;->n:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/google/android/gms/b/ar;->i:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/b/ar;->l:Landroid/os/Handler;

    iget-object v1, p0, Lcom/google/android/gms/b/ar;->l:Landroid/os/Handler;

    const/4 v2, 0x1

    sget-object v3, Lcom/google/android/gms/b/ar;->a:Ljava/lang/Object;

    invoke-virtual {v1, v2, v3}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    mul-int/lit16 v2, p1, 0x3e8

    int-to-long v2, v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method final declared-synchronized a(Landroid/content/Context;Lcom/google/android/gms/b/ab;)V
    .locals 2

    .prologue
    .line 0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/b/ar;->b:Landroid/content/Context;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_1

    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    :cond_1
    :try_start_1
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/b/ar;->b:Landroid/content/Context;

    iget-object v0, p0, Lcom/google/android/gms/b/ar;->d:Lcom/google/android/gms/b/ab;

    if-nez v0, :cond_0

    iput-object p2, p0, Lcom/google/android/gms/b/ar;->d:Lcom/google/android/gms/b/ab;

    iget-boolean v0, p0, Lcom/google/android/gms/b/ar;->f:Z

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/google/android/gms/b/ar;->a()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/b/ar;->f:Z

    :cond_2
    iget-boolean v0, p0, Lcom/google/android/gms/b/ar;->g:Z

    if-eqz v0, :cond_0

    .line 1000
    iget-object v0, p0, Lcom/google/android/gms/b/ar;->d:Lcom/google/android/gms/b/ab;

    if-nez v0, :cond_3

    const-string v0, "setForceLocalDispatch() queued. It will be called once initialization is complete."

    invoke-static {v0}, Lcom/google/android/gms/b/n;->c(Ljava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/b/ar;->g:Z

    .line 0
    :goto_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/b/ar;->g:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 1000
    :cond_3
    :try_start_2
    invoke-static {}, Lcom/google/android/gms/b/au;->a()Lcom/google/android/gms/b/au;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/b/au$a;->af:Lcom/google/android/gms/b/au$a;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/au;->a(Lcom/google/android/gms/b/au$a;)V

    iget-object v0, p0, Lcom/google/android/gms/b/ar;->d:Lcom/google/android/gms/b/ab;

    invoke-interface {v0}, Lcom/google/android/gms/b/ab;->b()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1
.end method

.method final declared-synchronized a(Z)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/b/ar;->n:Z

    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/b/ar;->a(ZZ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method final declared-synchronized a(ZZ)V
    .locals 4

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/b/ar;->n:Z

    if-ne v0, p1, :cond_0

    iget-boolean v0, p0, Lcom/google/android/gms/b/ar;->i:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne v0, p2, :cond_0

    :goto_0
    monitor-exit p0

    return-void

    :cond_0
    if-nez p1, :cond_1

    if-nez p2, :cond_2

    :cond_1
    :try_start_1
    iget v0, p0, Lcom/google/android/gms/b/ar;->e:I

    if-lez v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/b/ar;->l:Landroid/os/Handler;

    const/4 v1, 0x1

    sget-object v2, Lcom/google/android/gms/b/ar;->a:Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    :cond_2
    if-nez p1, :cond_3

    if-eqz p2, :cond_3

    iget v0, p0, Lcom/google/android/gms/b/ar;->e:I

    if-lez v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/b/ar;->l:Landroid/os/Handler;

    iget-object v1, p0, Lcom/google/android/gms/b/ar;->l:Landroid/os/Handler;

    const/4 v2, 0x1

    sget-object v3, Lcom/google/android/gms/b/ar;->a:Ljava/lang/Object;

    invoke-virtual {v1, v2, v3}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    iget v2, p0, Lcom/google/android/gms/b/ar;->e:I

    mul-int/lit16 v2, v2, 0x3e8

    int-to-long v2, v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    :cond_3
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v0, "PowerSaveMode "

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    if-nez p1, :cond_4

    if-nez p2, :cond_5

    :cond_4
    const-string v0, "initiated."

    :goto_1
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/b/n;->c(Ljava/lang/String;)V

    iput-boolean p1, p0, Lcom/google/android/gms/b/ar;->n:Z

    iput-boolean p2, p0, Lcom/google/android/gms/b/ar;->i:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    :cond_5
    :try_start_2
    const-string v0, "terminated."
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1
.end method

.method final declared-synchronized b()V
    .locals 4

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/b/ar;->n:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/google/android/gms/b/ar;->i:Z

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/google/android/gms/b/ar;->e:I

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/b/ar;->l:Landroid/os/Handler;

    const/4 v1, 0x1

    sget-object v2, Lcom/google/android/gms/b/ar;->a:Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/b/ar;->l:Landroid/os/Handler;

    iget-object v1, p0, Lcom/google/android/gms/b/ar;->l:Landroid/os/Handler;

    const/4 v2, 0x1

    sget-object v3, Lcom/google/android/gms/b/ar;->a:Ljava/lang/Object;

    invoke-virtual {v1, v2, v3}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
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

.method final declared-synchronized d()Lcom/google/android/gms/b/z;
    .locals 4

    .prologue
    .line 0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/b/ar;->c:Lcom/google/android/gms/b/z;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/b/ar;->b:Landroid/content/Context;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cant get a store unless we have a context"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    :cond_0
    :try_start_1
    new-instance v0, Lcom/google/android/gms/b/p;

    iget-object v1, p0, Lcom/google/android/gms/b/ar;->k:Lcom/google/android/gms/b/aa;

    iget-object v2, p0, Lcom/google/android/gms/b/ar;->b:Landroid/content/Context;

    new-instance v3, Lcom/google/android/gms/b/af;

    invoke-direct {v3}, Lcom/google/android/gms/b/af;-><init>()V

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/b/p;-><init>(Lcom/google/android/gms/b/aa;Landroid/content/Context;Lcom/google/android/gms/b/ak;)V

    iput-object v0, p0, Lcom/google/android/gms/b/ar;->c:Lcom/google/android/gms/b/z;

    iget-object v0, p0, Lcom/google/android/gms/b/ar;->c:Lcom/google/android/gms/b/z;

    iget-boolean v1, p0, Lcom/google/android/gms/b/ar;->o:Z

    invoke-interface {v0, v1}, Lcom/google/android/gms/b/z;->a(Z)V

    iget-object v0, p0, Lcom/google/android/gms/b/ar;->h:Ljava/lang/String;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/b/ar;->c:Lcom/google/android/gms/b/z;

    invoke-interface {v0}, Lcom/google/android/gms/b/z;->c()Lcom/google/android/gms/b/an;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/b/ar;->h:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/google/android/gms/b/an;->a(Ljava/lang/String;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/b/ar;->h:Ljava/lang/String;

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/b/ar;->l:Landroid/os/Handler;

    if-nez v0, :cond_2

    .line 2000
    new-instance v0, Landroid/os/Handler;

    iget-object v1, p0, Lcom/google/android/gms/b/ar;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/b/ar$2;

    invoke-direct {v2, p0}, Lcom/google/android/gms/b/ar$2;-><init>(Lcom/google/android/gms/b/ar;)V

    invoke-direct {v0, v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    iput-object v0, p0, Lcom/google/android/gms/b/ar;->l:Landroid/os/Handler;

    iget v0, p0, Lcom/google/android/gms/b/ar;->e:I

    if-lez v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/b/ar;->l:Landroid/os/Handler;

    iget-object v1, p0, Lcom/google/android/gms/b/ar;->l:Landroid/os/Handler;

    const/4 v2, 0x1

    sget-object v3, Lcom/google/android/gms/b/ar;->a:Ljava/lang/Object;

    invoke-virtual {v1, v2, v3}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    iget v2, p0, Lcom/google/android/gms/b/ar;->e:I

    mul-int/lit16 v2, v2, 0x3e8

    int-to-long v2, v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 0
    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/b/ar;->m:Lcom/google/android/gms/b/aq;

    if-nez v0, :cond_3

    iget-boolean v0, p0, Lcom/google/android/gms/b/ar;->j:Z

    if-eqz v0, :cond_3

    .line 3000
    new-instance v0, Lcom/google/android/gms/b/aq;

    invoke-direct {v0, p0}, Lcom/google/android/gms/b/aq;-><init>(Lcom/google/android/gms/b/s;)V

    iput-object v0, p0, Lcom/google/android/gms/b/ar;->m:Lcom/google/android/gms/b/aq;

    iget-object v0, p0, Lcom/google/android/gms/b/ar;->m:Lcom/google/android/gms/b/aq;

    iget-object v1, p0, Lcom/google/android/gms/b/ar;->b:Landroid/content/Context;

    .line 4000
    new-instance v2, Landroid/content/IntentFilter;

    invoke-direct {v2}, Landroid/content/IntentFilter;-><init>()V

    const-string v3, "android.net.conn.CONNECTIVITY_CHANGE"

    invoke-virtual {v2, v3}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    invoke-virtual {v1, v0, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    new-instance v2, Landroid/content/IntentFilter;

    invoke-direct {v2}, Landroid/content/IntentFilter;-><init>()V

    const-string v3, "com.google.analytics.RADIO_POWERED"

    invoke-virtual {v2, v3}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/content/IntentFilter;->addCategory(Ljava/lang/String;)V

    invoke-virtual {v1, v0, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 0
    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/b/ar;->c:Lcom/google/android/gms/b/z;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object v0
.end method
