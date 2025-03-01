.class public LTest;
.super Ljava/lang/Object;
.source "Test.java"


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static Test(FZ)F
    .registers 2

    .line 7
    nop

    .line 8
    nop

    .line 10
    if-eqz p1, :cond_9

    .line 11
    const/high16 p1, 0x41a00000    # 20.0f

    mul-float p0, p0, p1

    return p0

    .line 13
    :cond_9
    const p1, 0x3d4ccccd    # 0.05f

    mul-float p0, p0, p1

    return p0
.end method

.method public static main([Ljava/lang/String;)V
    .registers 1

    .line 3
    return-void
.end method
