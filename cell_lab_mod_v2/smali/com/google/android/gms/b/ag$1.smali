.class final Lcom/google/android/gms/b/ag$1;
.super Ljava/lang/Thread;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/b/ag;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/b/ag;


# direct methods
.method constructor <init>(Lcom/google/android/gms/b/ag;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/b/ag$1;->a:Lcom/google/android/gms/b/ag;

    invoke-direct {p0, p2}, Ljava/lang/Thread;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/b/ag$1;->a:Lcom/google/android/gms/b/ag;

    invoke-static {v0}, Lcom/google/android/gms/b/ag;->a(Lcom/google/android/gms/b/ag;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/b/ag$1;->a:Lcom/google/android/gms/b/ag;

    iget-object v2, p0, Lcom/google/android/gms/b/ag$1;->a:Lcom/google/android/gms/b/ag;

    invoke-virtual {v2}, Lcom/google/android/gms/b/ag;->c()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/google/android/gms/b/ag;->a(Lcom/google/android/gms/b/ag;Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p0, Lcom/google/android/gms/b/ag$1;->a:Lcom/google/android/gms/b/ag;

    invoke-static {v0}, Lcom/google/android/gms/b/ag;->b(Lcom/google/android/gms/b/ag;)Z

    iget-object v0, p0, Lcom/google/android/gms/b/ag$1;->a:Lcom/google/android/gms/b/ag;

    invoke-static {v0}, Lcom/google/android/gms/b/ag;->a(Lcom/google/android/gms/b/ag;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
