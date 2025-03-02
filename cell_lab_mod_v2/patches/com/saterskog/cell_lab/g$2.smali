.class final Lcom/saterskog/cell_lab/g$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/saterskog/cell_lab/g;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator",
        "<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/saterskog/cell_lab/g;


# direct methods
.method constructor <init>(Lcom/saterskog/cell_lab/g;)V
    .locals 0

    .prologue
    .line 103
    iput-object p1, p0, Lcom/saterskog/cell_lab/g$2;->a:Lcom/saterskog/cell_lab/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    .prologue
    .line 103
    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/String;

    .line 1106
    invoke-virtual {p1, p2}, Ljava/lang/String;->compareToIgnoreCase(Ljava/lang/String;)I

    move-result v0

    .line 103
    return v0
.end method
