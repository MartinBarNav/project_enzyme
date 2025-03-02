.class public final Lcom/saterskog/cell_lab/l$a;
.super Landroid/support/a/a/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/saterskog/cell_lab/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/saterskog/cell_lab/l;


# direct methods
.method public constructor <init>(Lcom/saterskog/cell_lab/l;Landroid/app/FragmentManager;)V
    .locals 0

    .prologue
    .line 489
    iput-object p1, p0, Lcom/saterskog/cell_lab/l$a;->a:Lcom/saterskog/cell_lab/l;

    .line 491
    invoke-direct {p0, p2}, Landroid/support/a/a/d;-><init>(Landroid/app/FragmentManager;)V

    .line 492
    return-void
.end method


# virtual methods
.method public final a(I)Landroid/app/Fragment;
    .locals 1

    .prologue
    .line 497
    iget-object v0, p0, Lcom/saterskog/cell_lab/l$a;->a:Lcom/saterskog/cell_lab/l;

    invoke-virtual {v0, p1}, Lcom/saterskog/cell_lab/l;->a(I)Landroid/app/Fragment;

    move-result-object v0

    return-object v0
.end method

.method public final b()I
    .locals 1

    .prologue
    .line 506
    const/4 v0, 0x5

    return v0
.end method

.method public final b(I)Ljava/lang/CharSequence;
    .locals 1

    .prologue
    .line 512
    iget-object v0, p0, Lcom/saterskog/cell_lab/l$a;->a:Lcom/saterskog/cell_lab/l;

    invoke-virtual {v0, p1}, Lcom/saterskog/cell_lab/l;->b(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
