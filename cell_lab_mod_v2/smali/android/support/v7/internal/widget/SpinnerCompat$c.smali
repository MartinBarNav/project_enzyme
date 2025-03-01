.class final Landroid/support/v7/internal/widget/SpinnerCompat$c;
.super Landroid/support/v7/widget/b;
.source "SourceFile"

# interfaces
.implements Landroid/support/v7/internal/widget/SpinnerCompat$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/internal/widget/SpinnerCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "c"
.end annotation


# instance fields
.field final synthetic a:Landroid/support/v7/internal/widget/SpinnerCompat;

.field private k:Ljava/lang/CharSequence;

.field private l:Landroid/widget/ListAdapter;


# direct methods
.method public constructor <init>(Landroid/support/v7/internal/widget/SpinnerCompat;Landroid/content/Context;I)V
    .locals 1

    .prologue
    .line 981
    iput-object p1, p0, Landroid/support/v7/internal/widget/SpinnerCompat$c;->a:Landroid/support/v7/internal/widget/SpinnerCompat;

    .line 982
    invoke-direct {p0, p2, p3}, Landroid/support/v7/widget/b;-><init>(Landroid/content/Context;I)V

    .line 1435
    iput-object p1, p0, Landroid/support/v7/widget/b;->h:Landroid/view/View;

    .line 985
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/SpinnerCompat$c;->d()V

    .line 2281
    const/4 v0, 0x0

    iput v0, p0, Landroid/support/v7/widget/b;->g:I

    .line 988
    new-instance v0, Landroid/support/v7/internal/widget/SpinnerCompat$c$1;

    invoke-direct {v0, p0, p1}, Landroid/support/v7/internal/widget/SpinnerCompat$c$1;-><init>(Landroid/support/v7/internal/widget/SpinnerCompat$c;Landroid/support/v7/internal/widget/SpinnerCompat;)V

    .line 2541
    iput-object v0, p0, Landroid/support/v7/widget/b;->i:Landroid/widget/AdapterView$OnItemClickListener;

    .line 999
    return-void
.end method

.method static synthetic a(Landroid/support/v7/internal/widget/SpinnerCompat$c;)Landroid/widget/ListAdapter;
    .locals 1

    .prologue
    .line 974
    iget-object v0, p0, Landroid/support/v7/internal/widget/SpinnerCompat$c;->l:Landroid/widget/ListAdapter;

    return-object v0
.end method


# virtual methods
.method public final a(Landroid/widget/ListAdapter;)V
    .locals 0

    .prologue
    .line 1003
    invoke-super {p0, p1}, Landroid/support/v7/widget/b;->a(Landroid/widget/ListAdapter;)V

    .line 1004
    iput-object p1, p0, Landroid/support/v7/internal/widget/SpinnerCompat$c;->l:Landroid/widget/ListAdapter;

    .line 1005
    return-void
.end method

.method public final a(Ljava/lang/CharSequence;)V
    .locals 0

    .prologue
    .line 1013
    iput-object p1, p0, Landroid/support/v7/internal/widget/SpinnerCompat$c;->k:Ljava/lang/CharSequence;

    .line 1014
    return-void
.end method
