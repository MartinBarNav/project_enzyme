.class public abstract Landroid/support/a/a/d;
.super Landroid/support/v4/view/p;
.source "SourceFile"


# instance fields
.field private final a:Landroid/app/FragmentManager;

.field private b:Landroid/app/FragmentTransaction;

.field private c:Landroid/app/Fragment;


# direct methods
.method public constructor <init>(Landroid/app/FragmentManager;)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 73
    invoke-direct {p0}, Landroid/support/v4/view/p;-><init>()V

    .line 70
    iput-object v0, p0, Landroid/support/a/a/d;->b:Landroid/app/FragmentTransaction;

    .line 71
    iput-object v0, p0, Landroid/support/a/a/d;->c:Landroid/app/Fragment;

    .line 74
    iput-object p1, p0, Landroid/support/a/a/d;->a:Landroid/app/FragmentManager;

    .line 75
    return-void
.end method

.method private static a(IJ)Ljava/lang/String;
    .locals 3

    .prologue
    .line 177
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "android:switcher:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public abstract a(I)Landroid/app/Fragment;
.end method

.method public final a(Landroid/view/ViewGroup;I)Ljava/lang/Object;
    .locals 7

    .prologue
    const/4 v6, 0x0

    .line 88
    iget-object v0, p0, Landroid/support/a/a/d;->b:Landroid/app/FragmentTransaction;

    if-nez v0, :cond_0

    .line 89
    iget-object v0, p0, Landroid/support/a/a/d;->a:Landroid/app/FragmentManager;

    invoke-virtual {v0}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    move-result-object v0

    iput-object v0, p0, Landroid/support/a/a/d;->b:Landroid/app/FragmentTransaction;

    .line 1173
    :cond_0
    int-to-long v2, p2

    .line 95
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getId()I

    move-result v0

    invoke-static {v0, v2, v3}, Landroid/support/a/a/d;->a(IJ)Ljava/lang/String;

    move-result-object v0

    .line 96
    iget-object v1, p0, Landroid/support/a/a/d;->a:Landroid/app/FragmentManager;

    invoke-virtual {v1, v0}, Landroid/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/app/Fragment;

    move-result-object v0

    .line 97
    if-eqz v0, :cond_2

    .line 99
    iget-object v1, p0, Landroid/support/a/a/d;->b:Landroid/app/FragmentTransaction;

    invoke-virtual {v1, v0}, Landroid/app/FragmentTransaction;->attach(Landroid/app/Fragment;)Landroid/app/FragmentTransaction;

    .line 106
    :goto_0
    iget-object v1, p0, Landroid/support/a/a/d;->c:Landroid/app/Fragment;

    if-eq v0, v1, :cond_1

    .line 107
    invoke-static {v0, v6}, Landroid/support/a/a/a;->a(Landroid/app/Fragment;Z)V

    .line 108
    invoke-static {v0, v6}, Landroid/support/a/a/a;->b(Landroid/app/Fragment;Z)V

    .line 111
    :cond_1
    return-object v0

    .line 101
    :cond_2
    invoke-virtual {p0, p2}, Landroid/support/a/a/d;->a(I)Landroid/app/Fragment;

    move-result-object v0

    .line 103
    iget-object v1, p0, Landroid/support/a/a/d;->b:Landroid/app/FragmentTransaction;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getId()I

    move-result v4

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getId()I

    move-result v5

    invoke-static {v5, v2, v3}, Landroid/support/a/a/d;->a(IJ)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v4, v0, v2}, Landroid/app/FragmentTransaction;->add(ILandroid/app/Fragment;Ljava/lang/String;)Landroid/app/FragmentTransaction;

    goto :goto_0
.end method

.method public final a()V
    .locals 1

    .prologue
    .line 142
    iget-object v0, p0, Landroid/support/a/a/d;->b:Landroid/app/FragmentTransaction;

    if-eqz v0, :cond_0

    .line 143
    iget-object v0, p0, Landroid/support/a/a/d;->b:Landroid/app/FragmentTransaction;

    invoke-virtual {v0}, Landroid/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 144
    const/4 v0, 0x0

    iput-object v0, p0, Landroid/support/a/a/d;->b:Landroid/app/FragmentTransaction;

    .line 145
    iget-object v0, p0, Landroid/support/a/a/d;->a:Landroid/app/FragmentManager;

    invoke-virtual {v0}, Landroid/app/FragmentManager;->executePendingTransactions()Z

    .line 147
    :cond_0
    return-void
.end method

.method public final a(Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 116
    iget-object v0, p0, Landroid/support/a/a/d;->b:Landroid/app/FragmentTransaction;

    if-nez v0, :cond_0

    .line 117
    iget-object v0, p0, Landroid/support/a/a/d;->a:Landroid/app/FragmentManager;

    invoke-virtual {v0}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    move-result-object v0

    iput-object v0, p0, Landroid/support/a/a/d;->b:Landroid/app/FragmentTransaction;

    .line 121
    :cond_0
    iget-object v0, p0, Landroid/support/a/a/d;->b:Landroid/app/FragmentTransaction;

    check-cast p1, Landroid/app/Fragment;

    invoke-virtual {v0, p1}, Landroid/app/FragmentTransaction;->detach(Landroid/app/Fragment;)Landroid/app/FragmentTransaction;

    .line 122
    return-void
.end method

.method public final a(Landroid/view/View;Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 151
    check-cast p2, Landroid/app/Fragment;

    invoke-virtual {p2}, Landroid/app/Fragment;->getView()Landroid/view/View;

    move-result-object v0

    if-ne v0, p1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final b(Ljava/lang/Object;)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 126
    check-cast p1, Landroid/app/Fragment;

    .line 127
    iget-object v0, p0, Landroid/support/a/a/d;->c:Landroid/app/Fragment;

    if-eq p1, v0, :cond_2

    .line 128
    iget-object v0, p0, Landroid/support/a/a/d;->c:Landroid/app/Fragment;

    if-eqz v0, :cond_0

    .line 129
    iget-object v0, p0, Landroid/support/a/a/d;->c:Landroid/app/Fragment;

    invoke-static {v0, v1}, Landroid/support/a/a/a;->a(Landroid/app/Fragment;Z)V

    .line 130
    iget-object v0, p0, Landroid/support/a/a/d;->c:Landroid/app/Fragment;

    invoke-static {v0, v1}, Landroid/support/a/a/a;->b(Landroid/app/Fragment;Z)V

    .line 132
    :cond_0
    if-eqz p1, :cond_1

    .line 133
    invoke-static {p1, v2}, Landroid/support/a/a/a;->a(Landroid/app/Fragment;Z)V

    .line 134
    invoke-static {p1, v2}, Landroid/support/a/a/a;->b(Landroid/app/Fragment;Z)V

    .line 136
    :cond_1
    iput-object p1, p0, Landroid/support/a/a/d;->c:Landroid/app/Fragment;

    .line 138
    :cond_2
    return-void
.end method
