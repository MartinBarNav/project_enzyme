.class public abstract Landroid/support/v4/f/i;
.super Landroid/support/v4/f/b;
.source "SourceFile"


# instance fields
.field private j:I

.field private k:I

.field private l:Landroid/view/LayoutInflater;


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 1

    .prologue
    .line 76
    invoke-direct {p0, p1}, Landroid/support/v4/f/b;-><init>(Landroid/content/Context;)V

    .line 77
    iput p2, p0, Landroid/support/v4/f/i;->k:I

    iput p2, p0, Landroid/support/v4/f/i;->j:I

    .line 78
    const-string v0, "layout_inflater"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/LayoutInflater;

    iput-object v0, p0, Landroid/support/v4/f/i;->l:Landroid/view/LayoutInflater;

    .line 79
    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Landroid/database/Cursor;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 3

    .prologue
    .line 106
    iget-object v0, p0, Landroid/support/v4/f/i;->l:Landroid/view/LayoutInflater;

    iget v1, p0, Landroid/support/v4/f/i;->j:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p3, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public final b(Landroid/content/Context;Landroid/database/Cursor;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 3

    .prologue
    .line 111
    iget-object v0, p0, Landroid/support/v4/f/i;->l:Landroid/view/LayoutInflater;

    iget v1, p0, Landroid/support/v4/f/i;->k:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p3, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method
