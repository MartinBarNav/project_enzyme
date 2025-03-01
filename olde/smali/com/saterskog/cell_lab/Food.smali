.class public Lcom/saterskog/cell_lab/Food;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;
.implements Ljava/io/Serializable;


# static fields
.field static final g:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/saterskog/cell_lab/Food;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field a:F

.field b:F

.field c:F

.field d:F

.field e:F

.field f:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 44
    new-instance v0, Lcom/saterskog/cell_lab/Food$1;

    invoke-direct {v0}, Lcom/saterskog/cell_lab/Food$1;-><init>()V

    sput-object v0, Lcom/saterskog/cell_lab/Food;->g:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    return-void
.end method

.method constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .prologue
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/Food;->a:F

    .line 18
    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/Food;->b:F

    .line 19
    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/Food;->c:F

    .line 20
    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/Food;->d:F

    .line 21
    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/Food;->e:F

    .line 22
    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/Food;->f:F

    .line 23
    return-void
.end method


# virtual methods
.method public final a(Lcom/saterskog/cell_lab/Food;)V
    .locals 1

    .prologue
    .line 58
    iget v0, p1, Lcom/saterskog/cell_lab/Food;->a:F

    iput v0, p0, Lcom/saterskog/cell_lab/Food;->a:F

    .line 59
    iget v0, p1, Lcom/saterskog/cell_lab/Food;->b:F

    iput v0, p0, Lcom/saterskog/cell_lab/Food;->b:F

    .line 60
    iget v0, p1, Lcom/saterskog/cell_lab/Food;->c:F

    iput v0, p0, Lcom/saterskog/cell_lab/Food;->c:F

    .line 61
    iget v0, p1, Lcom/saterskog/cell_lab/Food;->d:F

    iput v0, p0, Lcom/saterskog/cell_lab/Food;->d:F

    .line 62
    iget v0, p1, Lcom/saterskog/cell_lab/Food;->e:F

    iput v0, p0, Lcom/saterskog/cell_lab/Food;->e:F

    .line 63
    iget v0, p1, Lcom/saterskog/cell_lab/Food;->f:F

    iput v0, p0, Lcom/saterskog/cell_lab/Food;->f:F

    .line 64
    return-void
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 31
    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .prologue
    .line 36
    iget v0, p0, Lcom/saterskog/cell_lab/Food;->a:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    .line 37
    iget v0, p0, Lcom/saterskog/cell_lab/Food;->b:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    .line 38
    iget v0, p0, Lcom/saterskog/cell_lab/Food;->c:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    .line 39
    iget v0, p0, Lcom/saterskog/cell_lab/Food;->d:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    .line 40
    iget v0, p0, Lcom/saterskog/cell_lab/Food;->e:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    .line 41
    iget v0, p0, Lcom/saterskog/cell_lab/Food;->f:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    .line 42
    return-void
.end method
