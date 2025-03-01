.class public Lcom/saterskog/cell_lab/Link;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field static final m:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/saterskog/cell_lab/Link;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field a:I

.field b:Z

.field c:D

.field d:D

.field e:D

.field f:D

.field g:F

.field h:F

.field i:F

.field j:F

.field public k:F

.field public l:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 65
    new-instance v0, Lcom/saterskog/cell_lab/Link$1;

    invoke-direct {v0}, Lcom/saterskog/cell_lab/Link$1;-><init>()V

    sput-object v0, Lcom/saterskog/cell_lab/Link;->m:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    const/4 v0, -0x1

    iput v0, p0, Lcom/saterskog/cell_lab/Link;->a:I

    .line 43
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/saterskog/cell_lab/Link;->b:Z

    .line 44
    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .prologue
    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/Link;->a:I

    .line 30
    invoke-virtual {p1}, Landroid/os/Parcel;->readDouble()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/saterskog/cell_lab/Link;->c:D

    .line 31
    invoke-virtual {p1}, Landroid/os/Parcel;->readDouble()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/saterskog/cell_lab/Link;->d:D

    .line 32
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    iput-boolean v0, p0, Lcom/saterskog/cell_lab/Link;->b:Z

    .line 33
    invoke-virtual {p1}, Landroid/os/Parcel;->readDouble()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/saterskog/cell_lab/Link;->e:D

    .line 34
    invoke-virtual {p1}, Landroid/os/Parcel;->readDouble()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/saterskog/cell_lab/Link;->f:D

    .line 35
    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/Link;->k:F

    .line 36
    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/Link;->l:F

    .line 39
    return-void

    .line 32
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public final a(Lcom/saterskog/cell_lab/Link;)V
    .locals 2

    .prologue
    .line 80
    iget v0, p1, Lcom/saterskog/cell_lab/Link;->a:I

    iput v0, p0, Lcom/saterskog/cell_lab/Link;->a:I

    .line 81
    iget-wide v0, p1, Lcom/saterskog/cell_lab/Link;->c:D

    iput-wide v0, p0, Lcom/saterskog/cell_lab/Link;->c:D

    .line 82
    iget-wide v0, p1, Lcom/saterskog/cell_lab/Link;->d:D

    iput-wide v0, p0, Lcom/saterskog/cell_lab/Link;->d:D

    .line 83
    iget-boolean v0, p1, Lcom/saterskog/cell_lab/Link;->b:Z

    iput-boolean v0, p0, Lcom/saterskog/cell_lab/Link;->b:Z

    .line 84
    iget-wide v0, p1, Lcom/saterskog/cell_lab/Link;->e:D

    iput-wide v0, p0, Lcom/saterskog/cell_lab/Link;->e:D

    .line 85
    iget-wide v0, p1, Lcom/saterskog/cell_lab/Link;->f:D

    iput-wide v0, p0, Lcom/saterskog/cell_lab/Link;->f:D

    .line 86
    iget v0, p1, Lcom/saterskog/cell_lab/Link;->g:F

    iput v0, p0, Lcom/saterskog/cell_lab/Link;->g:F

    .line 87
    iget v0, p1, Lcom/saterskog/cell_lab/Link;->h:F

    iput v0, p0, Lcom/saterskog/cell_lab/Link;->h:F

    .line 88
    iget v0, p1, Lcom/saterskog/cell_lab/Link;->i:F

    iput v0, p0, Lcom/saterskog/cell_lab/Link;->i:F

    .line 89
    iget v0, p1, Lcom/saterskog/cell_lab/Link;->j:F

    iput v0, p0, Lcom/saterskog/cell_lab/Link;->j:F

    .line 90
    iget v0, p1, Lcom/saterskog/cell_lab/Link;->k:F

    iput v0, p0, Lcom/saterskog/cell_lab/Link;->k:F

    .line 91
    iget v0, p1, Lcom/saterskog/cell_lab/Link;->l:F

    iput v0, p0, Lcom/saterskog/cell_lab/Link;->l:F

    .line 94
    return-void
.end method

.method public final a(Ljava/io/ObjectInputStream;I)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 108
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readInt()I

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/Link;->a:I

    .line 109
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readDouble()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/saterskog/cell_lab/Link;->c:D

    .line 110
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readDouble()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/saterskog/cell_lab/Link;->d:D

    .line 111
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readBoolean()Z

    move-result v0

    iput-boolean v0, p0, Lcom/saterskog/cell_lab/Link;->b:Z

    .line 112
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readDouble()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/saterskog/cell_lab/Link;->e:D

    .line 113
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readDouble()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/saterskog/cell_lab/Link;->f:D

    .line 114
    const/4 v0, 0x4

    if-lt p2, v0, :cond_1

    .line 115
    const/4 v0, 0x7

    if-lt p2, v0, :cond_0

    .line 116
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readFloat()F

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/Link;->k:F

    .line 122
    :goto_0
    const/16 v0, 0x10

    if-lt p2, v0, :cond_2

    .line 123
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readFloat()F

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/Link;->l:F

    .line 126
    :goto_1
    return-void

    .line 118
    :cond_0
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readDouble()D

    move-result-wide v0

    double-to-float v0, v0

    iput v0, p0, Lcom/saterskog/cell_lab/Link;->k:F

    goto :goto_0

    .line 121
    :cond_1
    iput v2, p0, Lcom/saterskog/cell_lab/Link;->k:F

    goto :goto_0

    .line 125
    :cond_2
    iput v2, p0, Lcom/saterskog/cell_lab/Link;->l:F

    goto :goto_1
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 48
    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .prologue
    .line 53
    iget v0, p0, Lcom/saterskog/cell_lab/Link;->a:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 54
    iget-wide v0, p0, Lcom/saterskog/cell_lab/Link;->c:D

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeDouble(D)V

    .line 55
    iget-wide v0, p0, Lcom/saterskog/cell_lab/Link;->d:D

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeDouble(D)V

    .line 56
    iget-boolean v0, p0, Lcom/saterskog/cell_lab/Link;->b:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 57
    iget-wide v0, p0, Lcom/saterskog/cell_lab/Link;->e:D

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeDouble(D)V

    .line 58
    iget-wide v0, p0, Lcom/saterskog/cell_lab/Link;->f:D

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeDouble(D)V

    .line 59
    iget v0, p0, Lcom/saterskog/cell_lab/Link;->k:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    .line 60
    iget v0, p0, Lcom/saterskog/cell_lab/Link;->l:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    .line 63
    return-void

    .line 56
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
