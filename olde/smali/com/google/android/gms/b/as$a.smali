.class final Lcom/google/android/gms/b/as$a;
.super Ljava/lang/Enum;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/b/as;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/google/android/gms/b/as$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:I

.field public static final b:I

.field public static final c:I

.field public static final d:I

.field public static final e:I

.field public static final f:I

.field public static final g:I

.field private static final synthetic h:[I


# direct methods
.method static constructor <clinit>()V
    .locals 8

    const/4 v7, 0x5

    const/4 v6, 0x4

    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x1

    sput v3, Lcom/google/android/gms/b/as$a;->a:I

    sput v4, Lcom/google/android/gms/b/as$a;->b:I

    sput v5, Lcom/google/android/gms/b/as$a;->c:I

    sput v6, Lcom/google/android/gms/b/as$a;->d:I

    sput v7, Lcom/google/android/gms/b/as$a;->e:I

    const/4 v0, 0x6

    sput v0, Lcom/google/android/gms/b/as$a;->f:I

    const/4 v0, 0x7

    sput v0, Lcom/google/android/gms/b/as$a;->g:I

    const/4 v0, 0x7

    new-array v0, v0, [I

    const/4 v1, 0x0

    sget v2, Lcom/google/android/gms/b/as$a;->a:I

    aput v2, v0, v1

    sget v1, Lcom/google/android/gms/b/as$a;->b:I

    aput v1, v0, v3

    sget v1, Lcom/google/android/gms/b/as$a;->c:I

    aput v1, v0, v4

    sget v1, Lcom/google/android/gms/b/as$a;->d:I

    aput v1, v0, v5

    sget v1, Lcom/google/android/gms/b/as$a;->e:I

    aput v1, v0, v6

    sget v1, Lcom/google/android/gms/b/as$a;->f:I

    aput v1, v0, v7

    const/4 v1, 0x6

    sget v2, Lcom/google/android/gms/b/as$a;->g:I

    aput v2, v0, v1

    sput-object v0, Lcom/google/android/gms/b/as$a;->h:[I

    return-void
.end method

.method public static a()[I
    .locals 1

    sget-object v0, Lcom/google/android/gms/b/as$a;->h:[I

    invoke-virtual {v0}, [I->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    return-object v0
.end method
