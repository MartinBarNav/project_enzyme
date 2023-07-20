.class public final Lcom/google/android/gms/b/k;
.super Ljava/lang/Object;


# instance fields
.field a:Ljava/lang/String;

.field final b:J

.field final c:J

.field d:Ljava/lang/String;

.field e:Ljava/lang/String;

.field private final f:Ljava/lang/String;


# direct methods
.method public constructor <init>(JJLjava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "https:"

    iput-object v0, p0, Lcom/google/android/gms/b/k;->e:Ljava/lang/String;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/b/k;->a:Ljava/lang/String;

    iput-wide p1, p0, Lcom/google/android/gms/b/k;->b:J

    iput-wide p3, p0, Lcom/google/android/gms/b/k;->c:J

    iput-object p5, p0, Lcom/google/android/gms/b/k;->f:Ljava/lang/String;

    return-void
.end method
