.class final Lcom/google/android/gms/b/as$b;
.super Ljava/util/TimerTask;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/b/as;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/b/as;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/b/as;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/b/as$b;->a:Lcom/google/android/gms/b/as;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/b/as;B)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/b/as$b;-><init>(Lcom/google/android/gms/b/as;)V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .prologue
    .line 0
    iget-object v0, p0, Lcom/google/android/gms/b/as$b;->a:Lcom/google/android/gms/b/as;

    .line 1000
    iget v0, v0, Lcom/google/android/gms/b/as;->b:I

    .line 0
    sget v1, Lcom/google/android/gms/b/as$a;->b:I

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/b/as$b;->a:Lcom/google/android/gms/b/as;

    .line 2000
    iget-object v0, v0, Lcom/google/android/gms/b/as;->c:Ljava/util/Queue;

    .line 0
    invoke-interface {v0}, Ljava/util/Queue;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/b/as$b;->a:Lcom/google/android/gms/b/as;

    .line 3000
    iget-wide v0, v0, Lcom/google/android/gms/b/as;->a:J

    .line 0
    iget-object v2, p0, Lcom/google/android/gms/b/as$b;->a:Lcom/google/android/gms/b/as;

    .line 4000
    iget-wide v2, v2, Lcom/google/android/gms/b/as;->f:J

    .line 0
    add-long/2addr v0, v2

    iget-object v2, p0, Lcom/google/android/gms/b/as$b;->a:Lcom/google/android/gms/b/as;

    .line 5000
    iget-object v2, v2, Lcom/google/android/gms/b/as;->e:Lcom/google/android/gms/internal/f;

    .line 0
    invoke-interface {v2}, Lcom/google/android/gms/internal/f;->b()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    const-string v0, "Disconnecting due to inactivity"

    invoke-static {v0}, Lcom/google/android/gms/b/n;->c(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/b/as$b;->a:Lcom/google/android/gms/b/as;

    .line 6000
    invoke-virtual {v0}, Lcom/google/android/gms/b/as;->i()V

    .line 0
    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/b/as$b;->a:Lcom/google/android/gms/b/as;

    .line 7000
    iget-object v0, v0, Lcom/google/android/gms/b/as;->d:Ljava/util/Timer;

    .line 0
    new-instance v1, Lcom/google/android/gms/b/as$b;

    iget-object v2, p0, Lcom/google/android/gms/b/as$b;->a:Lcom/google/android/gms/b/as;

    invoke-direct {v1, v2}, Lcom/google/android/gms/b/as$b;-><init>(Lcom/google/android/gms/b/as;)V

    iget-object v2, p0, Lcom/google/android/gms/b/as$b;->a:Lcom/google/android/gms/b/as;

    .line 8000
    iget-wide v2, v2, Lcom/google/android/gms/b/as;->f:J

    .line 0
    invoke-virtual {v0, v1, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    goto :goto_0
.end method
