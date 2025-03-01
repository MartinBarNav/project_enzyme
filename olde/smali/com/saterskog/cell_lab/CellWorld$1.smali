.class final Lcom/saterskog/cell_lab/CellWorld$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/saterskog/cell_lab/CellWorld;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator",
        "<",
        "Lcom/saterskog/cell_lab/CellWorld;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 4353
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 6356
    new-instance v0, Lcom/saterskog/cell_lab/CellWorld;

    invoke-direct {v0, p1}, Lcom/saterskog/cell_lab/CellWorld;-><init>(Landroid/os/Parcel;)V

    .line 4353
    return-object v0
.end method

.method public final bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 4353
    .line 5360
    new-array v0, p1, [Lcom/saterskog/cell_lab/CellWorld;

    .line 4353
    return-object v0
.end method
