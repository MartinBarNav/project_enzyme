.class final Lcom/google/android/gms/b/as$e;
.super Ljava/util/TimerTask;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/b/as;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "e"
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/b/as;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/b/as;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/b/as$e;->a:Lcom/google/android/gms/b/as;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/b/as;B)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/b/as$e;-><init>(Lcom/google/android/gms/b/as;)V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .prologue
    .line 0
    iget-object v0, p0, Lcom/google/android/gms/b/as$e;->a:Lcom/google/android/gms/b/as;

    .line 1000
    invoke-virtual {v0}, Lcom/google/android/gms/b/as;->h()V

    .line 0
    return-void
.end method
