.class public LGene;
.super Ljava/lang/Object;
.source "Gene.java"


# instance fields
.field public u:[I


# direct methods
.method public constructor <init>()V
    .registers 2

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    const/16 v0, 0xb

    new-array v0, v0, [I

    iput-object v0, p0, LGene;->u:[I

    .line 7
    return-void
.end method

.method public static main([Ljava/lang/String;)V
    .registers 1

    .line 10
    return-void
.end method


# virtual methods
.method public writeToParcel()V
    .registers 5

    .line 15
    const/16 v0, 0xc

    const/16 v1, 0xb

    :try_start_4
    iget-object v2, p0, LGene;->u:[I

    const/16 v3, 0xbee

    aput v3, v2, v1

    .line 16
    aput v3, v2, v0
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_c} :catch_d

    .line 21
    goto :goto_15

    .line 18
    :catch_d
    move-exception v2

    .line 19
    iget-object v2, p0, LGene;->u:[I

    const/4 v3, 0x0

    aput v3, v2, v1

    .line 20
    aput v3, v2, v0

    .line 22
    :goto_15
    return-void
.end method
