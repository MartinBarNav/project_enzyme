.class final Lcom/google/android/gms/b/at$a;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/b/at;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/b/at;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/b/at;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/b/at$a;->a:Lcom/google/android/gms/b/at;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/b/at;B)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/b/at$a;-><init>(Lcom/google/android/gms/b/at;)V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/at$a;->a:Lcom/google/android/gms/b/at;

    invoke-static {v0}, Lcom/google/android/gms/b/at;->e(Lcom/google/android/gms/b/at;)Lcom/google/android/gms/b/t;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/b/t;->b()V

    return-void
.end method
