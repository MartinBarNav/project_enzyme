.class final Landroid/support/v7/widget/Toolbar$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/support/v7/internal/view/menu/j;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/widget/Toolbar;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field a:Landroid/support/v7/internal/view/menu/e;

.field b:Landroid/support/v7/internal/view/menu/f;

.field final synthetic c:Landroid/support/v7/widget/Toolbar;


# direct methods
.method private constructor <init>(Landroid/support/v7/widget/Toolbar;)V
    .locals 0

    .prologue
    .line 1879
    iput-object p1, p0, Landroid/support/v7/widget/Toolbar$a;->c:Landroid/support/v7/widget/Toolbar;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Landroid/support/v7/widget/Toolbar;B)V
    .locals 0

    .prologue
    .line 1879
    invoke-direct {p0, p1}, Landroid/support/v7/widget/Toolbar$a;-><init>(Landroid/support/v7/widget/Toolbar;)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;Landroid/support/v7/internal/view/menu/e;)V
    .locals 2

    .prologue
    .line 1886
    iget-object v0, p0, Landroid/support/v7/widget/Toolbar$a;->a:Landroid/support/v7/internal/view/menu/e;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/Toolbar$a;->b:Landroid/support/v7/internal/view/menu/f;

    if-eqz v0, :cond_0

    .line 1887
    iget-object v0, p0, Landroid/support/v7/widget/Toolbar$a;->a:Landroid/support/v7/internal/view/menu/e;

    iget-object v1, p0, Landroid/support/v7/widget/Toolbar$a;->b:Landroid/support/v7/internal/view/menu/f;

    invoke-virtual {v0, v1}, Landroid/support/v7/internal/view/menu/e;->b(Landroid/support/v7/internal/view/menu/f;)Z

    .line 1889
    :cond_0
    iput-object p2, p0, Landroid/support/v7/widget/Toolbar$a;->a:Landroid/support/v7/internal/view/menu/e;

    .line 1890
    return-void
.end method

.method public final a(Landroid/support/v7/internal/view/menu/e;Z)V
    .locals 0

    .prologue
    .line 1932
    return-void
.end method

.method public final a(Z)V
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 1900
    iget-object v1, p0, Landroid/support/v7/widget/Toolbar$a;->b:Landroid/support/v7/internal/view/menu/f;

    if-eqz v1, :cond_1

    .line 1903
    iget-object v1, p0, Landroid/support/v7/widget/Toolbar$a;->a:Landroid/support/v7/internal/view/menu/e;

    if-eqz v1, :cond_0

    .line 1904
    iget-object v1, p0, Landroid/support/v7/widget/Toolbar$a;->a:Landroid/support/v7/internal/view/menu/e;

    invoke-virtual {v1}, Landroid/support/v7/internal/view/menu/e;->size()I

    move-result v2

    move v1, v0

    .line 1905
    :goto_0
    if-ge v1, v2, :cond_0

    .line 1906
    iget-object v3, p0, Landroid/support/v7/widget/Toolbar$a;->a:Landroid/support/v7/internal/view/menu/e;

    invoke-virtual {v3, v1}, Landroid/support/v7/internal/view/menu/e;->getItem(I)Landroid/view/MenuItem;

    move-result-object v3

    .line 1907
    iget-object v4, p0, Landroid/support/v7/widget/Toolbar$a;->b:Landroid/support/v7/internal/view/menu/f;

    if-ne v3, v4, :cond_2

    .line 1908
    const/4 v0, 0x1

    .line 1914
    :cond_0
    if-nez v0, :cond_1

    .line 1916
    iget-object v0, p0, Landroid/support/v7/widget/Toolbar$a;->b:Landroid/support/v7/internal/view/menu/f;

    invoke-virtual {p0, v0}, Landroid/support/v7/widget/Toolbar$a;->c(Landroid/support/v7/internal/view/menu/f;)Z

    .line 1919
    :cond_1
    return-void

    .line 1905
    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0
.end method

.method public final a()Z
    .locals 1

    .prologue
    .line 1936
    const/4 v0, 0x0

    return v0
.end method

.method public final a(Landroid/support/v7/internal/view/menu/m;)Z
    .locals 1

    .prologue
    .line 1927
    const/4 v0, 0x0

    return v0
.end method

.method public final b(Landroid/support/v7/internal/view/menu/f;)Z
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 1941
    iget-object v0, p0, Landroid/support/v7/widget/Toolbar$a;->c:Landroid/support/v7/widget/Toolbar;

    invoke-static {v0}, Landroid/support/v7/widget/Toolbar;->b(Landroid/support/v7/widget/Toolbar;)V

    .line 1942
    iget-object v0, p0, Landroid/support/v7/widget/Toolbar$a;->c:Landroid/support/v7/widget/Toolbar;

    invoke-static {v0}, Landroid/support/v7/widget/Toolbar;->c(Landroid/support/v7/widget/Toolbar;)Landroid/widget/ImageButton;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ImageButton;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    iget-object v1, p0, Landroid/support/v7/widget/Toolbar$a;->c:Landroid/support/v7/widget/Toolbar;

    if-eq v0, v1, :cond_0

    .line 1943
    iget-object v0, p0, Landroid/support/v7/widget/Toolbar$a;->c:Landroid/support/v7/widget/Toolbar;

    iget-object v1, p0, Landroid/support/v7/widget/Toolbar$a;->c:Landroid/support/v7/widget/Toolbar;

    invoke-static {v1}, Landroid/support/v7/widget/Toolbar;->c(Landroid/support/v7/widget/Toolbar;)Landroid/widget/ImageButton;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/Toolbar;->addView(Landroid/view/View;)V

    .line 1945
    :cond_0
    iget-object v0, p0, Landroid/support/v7/widget/Toolbar$a;->c:Landroid/support/v7/widget/Toolbar;

    invoke-virtual {p1}, Landroid/support/v7/internal/view/menu/f;->getActionView()Landroid/view/View;

    move-result-object v1

    iput-object v1, v0, Landroid/support/v7/widget/Toolbar;->d:Landroid/view/View;

    .line 1946
    iput-object p1, p0, Landroid/support/v7/widget/Toolbar$a;->b:Landroid/support/v7/internal/view/menu/f;

    .line 1947
    iget-object v0, p0, Landroid/support/v7/widget/Toolbar$a;->c:Landroid/support/v7/widget/Toolbar;

    iget-object v0, v0, Landroid/support/v7/widget/Toolbar;->d:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    iget-object v1, p0, Landroid/support/v7/widget/Toolbar$a;->c:Landroid/support/v7/widget/Toolbar;

    if-eq v0, v1, :cond_1

    .line 1948
    invoke-static {}, Landroid/support/v7/widget/Toolbar;->a()Landroid/support/v7/widget/Toolbar$b;

    move-result-object v0

    .line 1949
    const v1, 0x800003

    iget-object v2, p0, Landroid/support/v7/widget/Toolbar$a;->c:Landroid/support/v7/widget/Toolbar;

    invoke-static {v2}, Landroid/support/v7/widget/Toolbar;->d(Landroid/support/v7/widget/Toolbar;)I

    move-result v2

    and-int/lit8 v2, v2, 0x70

    or-int/2addr v1, v2

    iput v1, v0, Landroid/support/v7/widget/Toolbar$b;->a:I

    .line 1950
    const/4 v1, 0x2

    iput v1, v0, Landroid/support/v7/widget/Toolbar$b;->b:I

    .line 1951
    iget-object v1, p0, Landroid/support/v7/widget/Toolbar$a;->c:Landroid/support/v7/widget/Toolbar;

    iget-object v1, v1, Landroid/support/v7/widget/Toolbar;->d:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1952
    iget-object v0, p0, Landroid/support/v7/widget/Toolbar$a;->c:Landroid/support/v7/widget/Toolbar;

    iget-object v1, p0, Landroid/support/v7/widget/Toolbar$a;->c:Landroid/support/v7/widget/Toolbar;

    iget-object v1, v1, Landroid/support/v7/widget/Toolbar;->d:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/Toolbar;->addView(Landroid/view/View;)V

    .line 1955
    :cond_1
    iget-object v0, p0, Landroid/support/v7/widget/Toolbar$a;->c:Landroid/support/v7/widget/Toolbar;

    invoke-static {v0, v3}, Landroid/support/v7/widget/Toolbar;->a(Landroid/support/v7/widget/Toolbar;Z)V

    .line 1956
    iget-object v0, p0, Landroid/support/v7/widget/Toolbar$a;->c:Landroid/support/v7/widget/Toolbar;

    invoke-virtual {v0}, Landroid/support/v7/widget/Toolbar;->requestLayout()V

    .line 1957
    invoke-virtual {p1, v3}, Landroid/support/v7/internal/view/menu/f;->d(Z)V

    .line 1959
    iget-object v0, p0, Landroid/support/v7/widget/Toolbar$a;->c:Landroid/support/v7/widget/Toolbar;

    iget-object v0, v0, Landroid/support/v7/widget/Toolbar;->d:Landroid/view/View;

    instance-of v0, v0, Landroid/support/v7/c/a;

    if-eqz v0, :cond_2

    .line 1960
    iget-object v0, p0, Landroid/support/v7/widget/Toolbar$a;->c:Landroid/support/v7/widget/Toolbar;

    iget-object v0, v0, Landroid/support/v7/widget/Toolbar;->d:Landroid/view/View;

    check-cast v0, Landroid/support/v7/c/a;

    invoke-interface {v0}, Landroid/support/v7/c/a;->a()V

    .line 1963
    :cond_2
    return v3
.end method

.method public final c(Landroid/support/v7/internal/view/menu/f;)Z
    .locals 4

    .prologue
    const/4 v3, 0x0

    const/4 v2, 0x0

    .line 1970
    iget-object v0, p0, Landroid/support/v7/widget/Toolbar$a;->c:Landroid/support/v7/widget/Toolbar;

    iget-object v0, v0, Landroid/support/v7/widget/Toolbar;->d:Landroid/view/View;

    instance-of v0, v0, Landroid/support/v7/c/a;

    if-eqz v0, :cond_0

    .line 1971
    iget-object v0, p0, Landroid/support/v7/widget/Toolbar$a;->c:Landroid/support/v7/widget/Toolbar;

    iget-object v0, v0, Landroid/support/v7/widget/Toolbar;->d:Landroid/view/View;

    check-cast v0, Landroid/support/v7/c/a;

    invoke-interface {v0}, Landroid/support/v7/c/a;->a_()V

    .line 1974
    :cond_0
    iget-object v0, p0, Landroid/support/v7/widget/Toolbar$a;->c:Landroid/support/v7/widget/Toolbar;

    iget-object v1, p0, Landroid/support/v7/widget/Toolbar$a;->c:Landroid/support/v7/widget/Toolbar;

    iget-object v1, v1, Landroid/support/v7/widget/Toolbar;->d:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/Toolbar;->removeView(Landroid/view/View;)V

    .line 1975
    iget-object v0, p0, Landroid/support/v7/widget/Toolbar$a;->c:Landroid/support/v7/widget/Toolbar;

    iget-object v1, p0, Landroid/support/v7/widget/Toolbar$a;->c:Landroid/support/v7/widget/Toolbar;

    invoke-static {v1}, Landroid/support/v7/widget/Toolbar;->c(Landroid/support/v7/widget/Toolbar;)Landroid/widget/ImageButton;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/Toolbar;->removeView(Landroid/view/View;)V

    .line 1976
    iget-object v0, p0, Landroid/support/v7/widget/Toolbar$a;->c:Landroid/support/v7/widget/Toolbar;

    iput-object v3, v0, Landroid/support/v7/widget/Toolbar;->d:Landroid/view/View;

    .line 1978
    iget-object v0, p0, Landroid/support/v7/widget/Toolbar$a;->c:Landroid/support/v7/widget/Toolbar;

    invoke-static {v0, v2}, Landroid/support/v7/widget/Toolbar;->a(Landroid/support/v7/widget/Toolbar;Z)V

    .line 1979
    iput-object v3, p0, Landroid/support/v7/widget/Toolbar$a;->b:Landroid/support/v7/internal/view/menu/f;

    .line 1980
    iget-object v0, p0, Landroid/support/v7/widget/Toolbar$a;->c:Landroid/support/v7/widget/Toolbar;

    invoke-virtual {v0}, Landroid/support/v7/widget/Toolbar;->requestLayout()V

    .line 1981
    invoke-virtual {p1, v2}, Landroid/support/v7/internal/view/menu/f;->d(Z)V

    .line 1983
    const/4 v0, 0x1

    return v0
.end method
