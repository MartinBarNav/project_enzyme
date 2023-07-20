.class final Landroid/support/v4/view/ViewPager$d;
.super Landroid/support/v4/view/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/view/ViewPager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "d"
.end annotation


# instance fields
.field final synthetic b:Landroid/support/v4/view/ViewPager;


# direct methods
.method constructor <init>(Landroid/support/v4/view/ViewPager;)V
    .locals 0

    .prologue
    .line 2765
    iput-object p1, p0, Landroid/support/v4/view/ViewPager$d;->b:Landroid/support/v4/view/ViewPager;

    invoke-direct {p0}, Landroid/support/v4/view/a;-><init>()V

    return-void
.end method

.method private a()Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 2817
    iget-object v1, p0, Landroid/support/v4/view/ViewPager$d;->b:Landroid/support/v4/view/ViewPager;

    invoke-static {v1}, Landroid/support/v4/view/ViewPager;->b(Landroid/support/v4/view/ViewPager;)Landroid/support/v4/view/p;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Landroid/support/v4/view/ViewPager$d;->b:Landroid/support/v4/view/ViewPager;

    invoke-static {v1}, Landroid/support/v4/view/ViewPager;->b(Landroid/support/v4/view/ViewPager;)Landroid/support/v4/view/p;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/view/p;->b()I

    move-result v1

    if-le v1, v0, :cond_0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public final a(Landroid/view/View;Landroid/support/v4/view/a/a;)V
    .locals 3

    .prologue
    .line 2783
    invoke-super {p0, p1, p2}, Landroid/support/v4/view/a;->a(Landroid/view/View;Landroid/support/v4/view/a/a;)V

    .line 2784
    const-class v0, Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    .line 4212
    sget-object v1, Landroid/support/v4/view/a/a;->a:Landroid/support/v4/view/a/a$c;

    iget-object v2, p2, Landroid/support/v4/view/a/a;->b:Ljava/lang/Object;

    invoke-interface {v1, v2, v0}, Landroid/support/v4/view/a/a$c;->a(Ljava/lang/Object;Ljava/lang/CharSequence;)V

    .line 2785
    invoke-direct {p0}, Landroid/support/v4/view/ViewPager$d;->a()Z

    move-result v0

    .line 5164
    sget-object v1, Landroid/support/v4/view/a/a;->a:Landroid/support/v4/view/a/a$c;

    iget-object v2, p2, Landroid/support/v4/view/a/a;->b:Ljava/lang/Object;

    invoke-interface {v1, v2, v0}, Landroid/support/v4/view/a/a$c;->a(Ljava/lang/Object;Z)V

    .line 2786
    iget-object v0, p0, Landroid/support/v4/view/ViewPager$d;->b:Landroid/support/v4/view/ViewPager;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->canScrollHorizontally(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2787
    const/16 v0, 0x1000

    invoke-virtual {p2, v0}, Landroid/support/v4/view/a/a;->a(I)V

    .line 2789
    :cond_0
    iget-object v0, p0, Landroid/support/v4/view/ViewPager$d;->b:Landroid/support/v4/view/ViewPager;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->canScrollHorizontally(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2790
    const/16 v0, 0x2000

    invoke-virtual {p2, v0}, Landroid/support/v4/view/a/a;->a(I)V

    .line 2792
    :cond_1
    return-void
.end method

.method public final a(Landroid/view/View;ILandroid/os/Bundle;)Z
    .locals 4

    .prologue
    const/4 v1, 0x0

    const/4 v0, 0x1

    .line 2796
    invoke-super {p0, p1, p2, p3}, Landroid/support/v4/view/a;->a(Landroid/view/View;ILandroid/os/Bundle;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 2813
    :goto_0
    return v0

    .line 2799
    :cond_0
    sparse-switch p2, :sswitch_data_0

    move v0, v1

    .line 2813
    goto :goto_0

    .line 2801
    :sswitch_0
    iget-object v2, p0, Landroid/support/v4/view/ViewPager$d;->b:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v2, v0}, Landroid/support/v4/view/ViewPager;->canScrollHorizontally(I)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 2802
    iget-object v1, p0, Landroid/support/v4/view/ViewPager$d;->b:Landroid/support/v4/view/ViewPager;

    iget-object v2, p0, Landroid/support/v4/view/ViewPager$d;->b:Landroid/support/v4/view/ViewPager;

    invoke-static {v2}, Landroid/support/v4/view/ViewPager;->c(Landroid/support/v4/view/ViewPager;)I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    invoke-virtual {v1, v2}, Landroid/support/v4/view/ViewPager;->setCurrentItem(I)V

    goto :goto_0

    :cond_1
    move v0, v1

    .line 2805
    goto :goto_0

    .line 2807
    :sswitch_1
    iget-object v2, p0, Landroid/support/v4/view/ViewPager$d;->b:Landroid/support/v4/view/ViewPager;

    const/4 v3, -0x1

    invoke-virtual {v2, v3}, Landroid/support/v4/view/ViewPager;->canScrollHorizontally(I)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 2808
    iget-object v1, p0, Landroid/support/v4/view/ViewPager$d;->b:Landroid/support/v4/view/ViewPager;

    iget-object v2, p0, Landroid/support/v4/view/ViewPager$d;->b:Landroid/support/v4/view/ViewPager;

    invoke-static {v2}, Landroid/support/v4/view/ViewPager;->c(Landroid/support/v4/view/ViewPager;)I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-virtual {v1, v2}, Landroid/support/v4/view/ViewPager;->setCurrentItem(I)V

    goto :goto_0

    :cond_2
    move v0, v1

    .line 2811
    goto :goto_0

    .line 2799
    nop

    :sswitch_data_0
    .sparse-switch
        0x1000 -> :sswitch_0
        0x2000 -> :sswitch_1
    .end sparse-switch
.end method

.method public final d(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 4

    .prologue
    .line 2769
    invoke-super {p0, p1, p2}, Landroid/support/v4/view/a;->d(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    .line 2770
    const-class v0, Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/view/accessibility/AccessibilityEvent;->setClassName(Ljava/lang/CharSequence;)V

    .line 2771
    invoke-static {}, Landroid/support/v4/view/a/g;->a()Landroid/support/v4/view/a/g;

    move-result-object v0

    .line 2772
    invoke-direct {p0}, Landroid/support/v4/view/ViewPager$d;->a()Z

    move-result v1

    .line 3714
    sget-object v2, Landroid/support/v4/view/a/g;->a:Landroid/support/v4/view/a/g$c;

    iget-object v3, v0, Landroid/support/v4/view/a/g;->b:Ljava/lang/Object;

    invoke-interface {v2, v3, v1}, Landroid/support/v4/view/a/g$c;->a(Ljava/lang/Object;Z)V

    .line 2773
    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityEvent;->getEventType()I

    move-result v1

    const/16 v2, 0x1000

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Landroid/support/v4/view/ViewPager$d;->b:Landroid/support/v4/view/ViewPager;

    invoke-static {v1}, Landroid/support/v4/view/ViewPager;->b(Landroid/support/v4/view/ViewPager;)Landroid/support/v4/view/p;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 2775
    iget-object v1, p0, Landroid/support/v4/view/ViewPager$d;->b:Landroid/support/v4/view/ViewPager;

    invoke-static {v1}, Landroid/support/v4/view/ViewPager;->b(Landroid/support/v4/view/ViewPager;)Landroid/support/v4/view/p;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/view/p;->b()I

    move-result v1

    .line 3734
    sget-object v2, Landroid/support/v4/view/a/g;->a:Landroid/support/v4/view/a/g$c;

    iget-object v3, v0, Landroid/support/v4/view/a/g;->b:Ljava/lang/Object;

    invoke-interface {v2, v3, v1}, Landroid/support/v4/view/a/g$c;->b(Ljava/lang/Object;I)V

    .line 2776
    iget-object v1, p0, Landroid/support/v4/view/ViewPager$d;->b:Landroid/support/v4/view/ViewPager;

    invoke-static {v1}, Landroid/support/v4/view/ViewPager;->c(Landroid/support/v4/view/ViewPager;)I

    move-result v1

    .line 3780
    sget-object v2, Landroid/support/v4/view/a/g;->a:Landroid/support/v4/view/a/g$c;

    iget-object v3, v0, Landroid/support/v4/view/a/g;->b:Ljava/lang/Object;

    invoke-interface {v2, v3, v1}, Landroid/support/v4/view/a/g$c;->a(Ljava/lang/Object;I)V

    .line 2777
    iget-object v1, p0, Landroid/support/v4/view/ViewPager$d;->b:Landroid/support/v4/view/ViewPager;

    invoke-static {v1}, Landroid/support/v4/view/ViewPager;->c(Landroid/support/v4/view/ViewPager;)I

    move-result v1

    .line 3800
    sget-object v2, Landroid/support/v4/view/a/g;->a:Landroid/support/v4/view/a/g$c;

    iget-object v0, v0, Landroid/support/v4/view/a/g;->b:Ljava/lang/Object;

    invoke-interface {v2, v0, v1}, Landroid/support/v4/view/a/g$c;->c(Ljava/lang/Object;I)V

    .line 2779
    :cond_0
    return-void
.end method
