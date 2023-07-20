.class public final Lcom/google/android/gms/b/d$e;
.super Lcom/google/android/gms/b/d$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/b/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/b/d$d",
        "<",
        "Lcom/google/android/gms/b/d$e;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/b/d$d;-><init>()V

    invoke-static {}, Lcom/google/android/gms/b/au;->a()Lcom/google/android/gms/b/au;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/b/au$a;->J:Lcom/google/android/gms/b/au$a;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/au;->a(Lcom/google/android/gms/b/au$a;)V

    const-string v0, "&t"

    const-string v1, "timing"

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/b/d$e;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/b/d$d;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a()Ljava/util/Map;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/b/d$d;->a()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method
