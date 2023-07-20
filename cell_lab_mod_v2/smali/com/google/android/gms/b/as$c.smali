.class final Lcom/google/android/gms/b/as$c;
.super Ljava/util/TimerTask;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/b/as;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "c"
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/b/as;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/b/as;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/b/as$c;->a:Lcom/google/android/gms/b/as;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/b/as;B)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/b/as$c;-><init>(Lcom/google/android/gms/b/as;)V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 0
    iget-object v0, p0, Lcom/google/android/gms/b/as$c;->a:Lcom/google/android/gms/b/as;

    .line 1000
    iget v0, v0, Lcom/google/android/gms/b/as;->b:I

    .line 0
    sget v1, Lcom/google/android/gms/b/as$a;->a:I

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/b/as$c;->a:Lcom/google/android/gms/b/as;

    .line 2000
    invoke-virtual {v0}, Lcom/google/android/gms/b/as;->g()V

    .line 0
    :cond_0
    return-void
.end method
