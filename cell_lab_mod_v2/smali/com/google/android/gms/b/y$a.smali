.class final Lcom/google/android/gms/b/y$a;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/b/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/b/y;


# direct methods
.method constructor <init>(Lcom/google/android/gms/b/y;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/b/y$a;->a:Lcom/google/android/gms/b/y;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 2

    .prologue
    .line 0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "service connected, binder: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/b/n;->c(Ljava/lang/String;)V

    :try_start_0
    invoke-interface {p2}, Landroid/os/IBinder;->getInterfaceDescriptor()Ljava/lang/String;

    move-result-object v0

    const-string v1, "com.google.android.gms.analytics.internal.IAnalyticsService"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "bound to service"

    invoke-static {v0}, Lcom/google/android/gms/b/n;->c(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/b/y$a;->a:Lcom/google/android/gms/b/y;

    invoke-static {p2}, Lcom/google/android/gms/internal/a$a;->a(Landroid/os/IBinder;)Lcom/google/android/gms/internal/a;

    move-result-object v1

    .line 1000
    iput-object v1, v0, Lcom/google/android/gms/b/y;->e:Lcom/google/android/gms/internal/a;

    .line 0
    iget-object v0, p0, Lcom/google/android/gms/b/y$a;->a:Lcom/google/android/gms/b/y;

    .line 4000
    iget-object v0, v0, Lcom/google/android/gms/b/y;->b:Lcom/google/android/gms/b/y$b;

    invoke-interface {v0}, Lcom/google/android/gms/b/y$b;->d()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/b/y$a;->a:Lcom/google/android/gms/b/y;

    .line 5000
    iget-object v0, v0, Lcom/google/android/gms/b/y;->d:Landroid/content/Context;

    .line 0
    invoke-virtual {v0, p0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1

    :goto_1
    iget-object v0, p0, Lcom/google/android/gms/b/y$a;->a:Lcom/google/android/gms/b/y;

    .line 6000
    const/4 v1, 0x0

    iput-object v1, v0, Lcom/google/android/gms/b/y;->a:Landroid/content/ServiceConnection;

    .line 0
    iget-object v0, p0, Lcom/google/android/gms/b/y$a;->a:Lcom/google/android/gms/b/y;

    .line 7000
    iget-object v0, v0, Lcom/google/android/gms/b/y;->c:Lcom/google/android/gms/b/y$c;

    .line 0
    const/4 v1, 0x2

    invoke-interface {v0, v1}, Lcom/google/android/gms/b/y$c;->a(I)V

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_1
.end method

.method public final onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 2

    .prologue
    .line 0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "service disconnected: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/b/n;->c(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/b/y$a;->a:Lcom/google/android/gms/b/y;

    .line 8000
    const/4 v1, 0x0

    iput-object v1, v0, Lcom/google/android/gms/b/y;->a:Landroid/content/ServiceConnection;

    .line 0
    iget-object v0, p0, Lcom/google/android/gms/b/y$a;->a:Lcom/google/android/gms/b/y;

    .line 9000
    iget-object v0, v0, Lcom/google/android/gms/b/y;->b:Lcom/google/android/gms/b/y$b;

    .line 0
    invoke-interface {v0}, Lcom/google/android/gms/b/y$b;->e()V

    return-void
.end method
