.class public final Lcom/google/android/gms/b/af;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/b/ak;


# instance fields
.field private final a:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/b/af;->a:Ljava/util/Set;

    iget-object v0, p0, Lcom/google/android/gms/b/af;->a:Ljava/util/Set;

    const/16 v1, 0x12e

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/b/af;->a:Ljava/util/Set;

    const/16 v1, 0x194

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/b/af;->a:Ljava/util/Set;

    const/16 v1, 0x1f6

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    const-string v0, "/collect"

    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    const-string v0, "/batch"

    return-object v0
.end method

.method public final c()Lcom/google/android/gms/b/ae;
    .locals 1

    sget-object v0, Lcom/google/android/gms/b/ae;->b:Lcom/google/android/gms/b/ae;

    return-object v0
.end method

.method public final d()Lcom/google/android/gms/b/ah;
    .locals 1

    sget-object v0, Lcom/google/android/gms/b/ah;->b:Lcom/google/android/gms/b/ah;

    return-object v0
.end method

.method public final e()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/b/af;->a:Ljava/util/Set;

    return-object v0
.end method
