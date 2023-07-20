.class public final Lcom/google/android/gms/b/b;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Thread$UncaughtExceptionHandler;


# instance fields
.field final a:Ljava/lang/Thread$UncaughtExceptionHandler;

.field private final b:Lcom/google/android/gms/b/g;

.field private final c:Landroid/content/Context;

.field private d:Lcom/google/android/gms/b/a;

.field private e:Lcom/google/android/gms/b/c;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/b/g;Ljava/lang/Thread$UncaughtExceptionHandler;Landroid/content/Context;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-nez p3, :cond_0

    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "context cannot be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iput-object p2, p0, Lcom/google/android/gms/b/b;->a:Ljava/lang/Thread$UncaughtExceptionHandler;

    iput-object p1, p0, Lcom/google/android/gms/b/b;->b:Lcom/google/android/gms/b/g;

    new-instance v0, Lcom/google/android/gms/b/f;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-direct {v0, p3, v1}, Lcom/google/android/gms/b/f;-><init>(Landroid/content/Context;Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/google/android/gms/b/b;->d:Lcom/google/android/gms/b/a;

    invoke-virtual {p3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/b/b;->c:Landroid/content/Context;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v0, "ExceptionReporter created, original handler is "

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    if-nez p2, :cond_1

    const-string v0, "null"

    :goto_0
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/b/n;->c(Ljava/lang/String;)V

    return-void

    :cond_1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method


# virtual methods
.method public final uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V
    .locals 4

    .prologue
    .line 0
    const-string v0, "UncaughtException"

    iget-object v1, p0, Lcom/google/android/gms/b/b;->d:Lcom/google/android/gms/b/a;

    if-eqz v1, :cond_0

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v0

    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/b/b;->d:Lcom/google/android/gms/b/a;

    invoke-interface {v1, v0, p2}, Lcom/google/android/gms/b/a;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v0

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Tracking Exception: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/b/n;->c(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/google/android/gms/b/b;->b:Lcom/google/android/gms/b/g;

    new-instance v2, Lcom/google/android/gms/b/d$c;

    invoke-direct {v2}, Lcom/google/android/gms/b/d$c;-><init>()V

    .line 1000
    const-string v3, "&exd"

    invoke-virtual {v2, v3, v0}, Lcom/google/android/gms/b/d$c;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/b/d$d;

    .line 2000
    const-string v0, "&exf"

    invoke-static {}, Lcom/google/android/gms/b/w;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v0, v3}, Lcom/google/android/gms/b/d$c;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/b/d$d;

    .line 0
    invoke-virtual {v2}, Lcom/google/android/gms/b/d$c;->a()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/google/android/gms/b/g;->a(Ljava/util/Map;)V

    .line 3000
    iget-object v0, p0, Lcom/google/android/gms/b/b;->e:Lcom/google/android/gms/b/c;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/b/b;->c:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/b/c;->a(Landroid/content/Context;)Lcom/google/android/gms/b/c;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/b/b;->e:Lcom/google/android/gms/b/c;

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/b/b;->e:Lcom/google/android/gms/b/c;

    .line 4000
    iget-object v1, v0, Lcom/google/android/gms/b/c;->c:Lcom/google/android/gms/b/s;

    invoke-virtual {v1}, Lcom/google/android/gms/b/s;->a()V

    .line 5000
    iget-object v0, v0, Lcom/google/android/gms/b/c;->b:Lcom/google/android/gms/b/ab;

    invoke-interface {v0}, Lcom/google/android/gms/b/ab;->e()V

    .line 0
    iget-object v0, p0, Lcom/google/android/gms/b/b;->a:Ljava/lang/Thread$UncaughtExceptionHandler;

    if-eqz v0, :cond_2

    const-string v0, "Passing exception to original handler."

    invoke-static {v0}, Lcom/google/android/gms/b/n;->c(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/b/b;->a:Ljava/lang/Thread$UncaughtExceptionHandler;

    invoke-interface {v0, p1, p2}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    :cond_2
    return-void

    :cond_3
    const/4 v0, 0x0

    goto :goto_0
.end method
