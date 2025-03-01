.class public final Landroid/support/v7/widget/SearchView;
.super Landroid/support/v7/widget/LinearLayoutCompat;
.source "SourceFile"

# interfaces
.implements Landroid/support/v7/c/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v7/widget/SearchView$a;,
        Landroid/support/v7/widget/SearchView$SearchAutoComplete;,
        Landroid/support/v7/widget/SearchView$d;,
        Landroid/support/v7/widget/SearchView$b;,
        Landroid/support/v7/widget/SearchView$c;
    }
.end annotation


# static fields
.field static final a:Landroid/support/v7/widget/SearchView$a;

.field private static final b:Z


# instance fields
.field private A:Z

.field private B:I

.field private C:Z

.field private D:Ljava/lang/CharSequence;

.field private E:Z

.field private F:I

.field private G:Landroid/app/SearchableInfo;

.field private H:Landroid/os/Bundle;

.field private final I:Landroid/support/v7/internal/widget/o;

.field private J:Ljava/lang/Runnable;

.field private final K:Ljava/lang/Runnable;

.field private L:Ljava/lang/Runnable;

.field private final M:Ljava/util/WeakHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/WeakHashMap",
            "<",
            "Ljava/lang/String;",
            "Landroid/graphics/drawable/Drawable$ConstantState;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

.field private final d:Landroid/view/View;

.field private final e:Landroid/view/View;

.field private final f:Landroid/widget/ImageView;

.field private final g:Landroid/widget/ImageView;

.field private final h:Landroid/widget/ImageView;

.field private final i:Landroid/widget/ImageView;

.field private final j:Landroid/widget/ImageView;

.field private final k:I

.field private final l:I

.field private final m:I

.field private final n:Landroid/content/Intent;

.field private final o:Landroid/content/Intent;

.field private p:Landroid/support/v7/widget/SearchView$c;

.field private q:Landroid/support/v7/widget/SearchView$b;

.field private r:Landroid/view/View$OnFocusChangeListener;

.field private s:Landroid/support/v7/widget/SearchView$d;

.field private t:Landroid/view/View$OnClickListener;

.field private u:Z

.field private v:Z

.field private w:Landroid/support/v4/f/b;

.field private x:Z

.field private y:Ljava/lang/CharSequence;

.field private z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 109
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x8

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Landroid/support/v7/widget/SearchView;->b:Z

    .line 160
    new-instance v0, Landroid/support/v7/widget/SearchView$a;

    invoke-direct {v0}, Landroid/support/v7/widget/SearchView$a;-><init>()V

    sput-object v0, Landroid/support/v7/widget/SearchView;->a:Landroid/support/v7/widget/SearchView$a;

    return-void

    .line 109
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private a(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
    .locals 7

    .prologue
    const/4 v6, 0x0

    .line 1016
    iget-boolean v0, p0, Landroid/support/v7/widget/SearchView;->u:Z

    if-nez v0, :cond_0

    .line 1027
    :goto_0
    return-object p1

    .line 1020
    :cond_0
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->I:Landroid/support/v7/internal/widget/o;

    iget v1, p0, Landroid/support/v7/widget/SearchView;->k:I

    invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/o;->a(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 1021
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->c:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->getTextSize()F

    move-result v0

    float-to-double v2, v0

    const-wide/high16 v4, 0x3ff4000000000000L    # 1.25

    mul-double/2addr v2, v4

    double-to-int v0, v2

    .line 1022
    invoke-virtual {v1, v6, v6, v0, v0}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 1024
    new-instance v0, Landroid/text/SpannableStringBuilder;

    const-string v2, "   "

    invoke-direct {v0, v2}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 1025
    invoke-virtual {v0, p1}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 1026
    new-instance v2, Landroid/text/style/ImageSpan;

    invoke-direct {v2, v1}, Landroid/text/style/ImageSpan;-><init>(Landroid/graphics/drawable/Drawable;)V

    const/4 v1, 0x1

    const/4 v3, 0x2

    const/16 v4, 0x21

    invoke-virtual {v0, v2, v1, v3, v4}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    move-object p1, v0

    .line 1027
    goto :goto_0
.end method

.method static synthetic a(Landroid/support/v7/widget/SearchView;)V
    .locals 1

    .prologue
    .line 104
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Landroid/support/v7/widget/SearchView;->setImeVisibility(Z)V

    return-void
.end method

.method private a(Z)V
    .locals 7

    .prologue
    const/4 v4, 0x1

    const/16 v2, 0x8

    const/4 v1, 0x0

    .line 798
    iput-boolean p1, p0, Landroid/support/v7/widget/SearchView;->v:Z

    .line 800
    if-eqz p1, :cond_4

    move v0, v1

    .line 802
    :goto_0
    iget-object v3, p0, Landroid/support/v7/widget/SearchView;->c:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v3}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->getText()Landroid/text/Editable;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_5

    move v3, v4

    .line 804
    :goto_1
    iget-object v5, p0, Landroid/support/v7/widget/SearchView;->f:Landroid/widget/ImageView;

    invoke-virtual {v5, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 6838
    iget-boolean v0, p0, Landroid/support/v7/widget/SearchView;->x:Z

    if-eqz v0, :cond_e

    invoke-direct {p0}, Landroid/support/v7/widget/SearchView;->d()Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-virtual {p0}, Landroid/support/v7/widget/SearchView;->hasFocus()Z

    move-result v0

    if-eqz v0, :cond_e

    if-nez v3, :cond_0

    iget-boolean v0, p0, Landroid/support/v7/widget/SearchView;->C:Z

    if-nez v0, :cond_e

    :cond_0
    move v0, v1

    .line 6842
    :goto_2
    iget-object v5, p0, Landroid/support/v7/widget/SearchView;->g:Landroid/widget/ImageView;

    invoke-virtual {v5, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 806
    iget-object v5, p0, Landroid/support/v7/widget/SearchView;->d:Landroid/view/View;

    if-eqz p1, :cond_6

    move v0, v2

    :goto_3
    invoke-virtual {v5, v0}, Landroid/view/View;->setVisibility(I)V

    .line 807
    iget-object v5, p0, Landroid/support/v7/widget/SearchView;->j:Landroid/widget/ImageView;

    iget-boolean v0, p0, Landroid/support/v7/widget/SearchView;->u:Z

    if-eqz v0, :cond_7

    move v0, v2

    :goto_4
    invoke-virtual {v5, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 6856
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->c:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_8

    move v5, v4

    .line 6859
    :goto_5
    if-nez v5, :cond_1

    iget-boolean v0, p0, Landroid/support/v7/widget/SearchView;->u:Z

    if-eqz v0, :cond_9

    iget-boolean v0, p0, Landroid/support/v7/widget/SearchView;->E:Z

    if-nez v0, :cond_9

    :cond_1
    move v0, v4

    .line 6860
    :goto_6
    iget-object v6, p0, Landroid/support/v7/widget/SearchView;->h:Landroid/widget/ImageView;

    if-eqz v0, :cond_a

    move v0, v1

    :goto_7
    invoke-virtual {v6, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 6861
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->h:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v6

    if-eqz v5, :cond_b

    sget-object v0, Landroid/support/v7/widget/SearchView;->ENABLED_STATE_SET:[I

    :goto_8
    invoke-virtual {v6, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 809
    if-nez v3, :cond_c

    .line 7096
    :goto_9
    iget-boolean v0, p0, Landroid/support/v7/widget/SearchView;->C:Z

    if-eqz v0, :cond_d

    .line 7664
    iget-boolean v0, p0, Landroid/support/v7/widget/SearchView;->v:Z

    .line 7096
    if-nez v0, :cond_d

    if-eqz v4, :cond_d

    .line 7098
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->g:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    move v0, v1

    .line 7100
    :goto_a
    iget-object v3, p0, Landroid/support/v7/widget/SearchView;->i:Landroid/widget/ImageView;

    invoke-virtual {v3, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 7847
    invoke-direct {p0}, Landroid/support/v7/widget/SearchView;->d()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->g:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->i:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getVisibility()I

    move-result v0

    if-nez v0, :cond_3

    :cond_2
    move v2, v1

    .line 7852
    :cond_3
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->e:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 811
    return-void

    :cond_4
    move v0, v2

    .line 800
    goto/16 :goto_0

    :cond_5
    move v3, v1

    .line 802
    goto/16 :goto_1

    :cond_6
    move v0, v1

    .line 806
    goto :goto_3

    :cond_7
    move v0, v1

    .line 807
    goto :goto_4

    :cond_8
    move v5, v1

    .line 6856
    goto :goto_5

    :cond_9
    move v0, v1

    .line 6859
    goto :goto_6

    :cond_a
    move v0, v2

    .line 6860
    goto :goto_7

    .line 6861
    :cond_b
    sget-object v0, Landroid/support/v7/widget/SearchView;->EMPTY_STATE_SET:[I

    goto :goto_8

    :cond_c
    move v4, v1

    .line 809
    goto :goto_9

    :cond_d
    move v0, v2

    goto :goto_a

    :cond_e
    move v0, v2

    goto/16 :goto_2
.end method

.method static a(Landroid/content/Context;)Z
    .locals 2

    .prologue
    .line 1584
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private d()Z
    .locals 1

    .prologue
    .line 833
    iget-boolean v0, p0, Landroid/support/v7/widget/SearchView;->x:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Landroid/support/v7/widget/SearchView;->C:Z

    if-eqz v0, :cond_1

    .line 8664
    :cond_0
    iget-boolean v0, p0, Landroid/support/v7/widget/SearchView;->v:Z

    .line 833
    if-nez v0, :cond_1

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private e()V
    .locals 1

    .prologue
    .line 865
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->K:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Landroid/support/v7/widget/SearchView;->post(Ljava/lang/Runnable;)Z

    .line 866
    return-void
.end method

.method private f()V
    .locals 2

    .prologue
    .line 1031
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->y:Ljava/lang/CharSequence;

    if-eqz v0, :cond_1

    .line 1032
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->c:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    iget-object v1, p0, Landroid/support/v7/widget/SearchView;->y:Ljava/lang/CharSequence;

    invoke-direct {p0, v1}, Landroid/support/v7/widget/SearchView;->a(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->setHint(Ljava/lang/CharSequence;)V

    .line 1045
    :cond_0
    :goto_0
    return-void

    .line 1033
    :cond_1
    sget-boolean v0, Landroid/support/v7/widget/SearchView;->b:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->G:Landroid/app/SearchableInfo;

    if-eqz v0, :cond_3

    .line 1034
    const/4 v0, 0x0

    .line 1035
    iget-object v1, p0, Landroid/support/v7/widget/SearchView;->G:Landroid/app/SearchableInfo;

    invoke-virtual {v1}, Landroid/app/SearchableInfo;->getHintId()I

    move-result v1

    .line 1036
    if-eqz v1, :cond_2

    .line 1037
    invoke-virtual {p0}, Landroid/support/v7/widget/SearchView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 1039
    :cond_2
    if-eqz v0, :cond_0

    .line 1040
    iget-object v1, p0, Landroid/support/v7/widget/SearchView;->c:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    invoke-direct {p0, v0}, Landroid/support/v7/widget/SearchView;->a(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->setHint(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 1043
    :cond_3
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->c:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    const-string v1, ""

    invoke-direct {p0, v1}, Landroid/support/v7/widget/SearchView;->a(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->setHint(Ljava/lang/CharSequence;)V

    goto :goto_0
.end method

.method private getPreferredWidth()I
    .locals 2

    .prologue
    .line 793
    invoke-virtual {p0}, Landroid/support/v7/widget/SearchView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Landroid/support/v7/b/a$c;->abc_search_view_preferred_width:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    return v0
.end method

.method private setImeVisibility(Z)V
    .locals 3

    .prologue
    .line 883
    if-eqz p1, :cond_1

    .line 884
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->J:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Landroid/support/v7/widget/SearchView;->post(Ljava/lang/Runnable;)Z

    .line 894
    :cond_0
    :goto_0
    return-void

    .line 886
    :cond_1
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->J:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Landroid/support/v7/widget/SearchView;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 887
    invoke-virtual {p0}, Landroid/support/v7/widget/SearchView;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "input_method"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 890
    if-eqz v0, :cond_0

    .line 891
    invoke-virtual {p0}, Landroid/support/v7/widget/SearchView;->getWindowToken()Landroid/os/IBinder;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    goto :goto_0
.end method


# virtual methods
.method public final a()V
    .locals 3

    .prologue
    .line 1233
    iget-boolean v0, p0, Landroid/support/v7/widget/SearchView;->E:Z

    if-eqz v0, :cond_0

    .line 1240
    :goto_0
    return-void

    .line 1235
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v7/widget/SearchView;->E:Z

    .line 1236
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->c:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->getImeOptions()I

    move-result v0

    iput v0, p0, Landroid/support/v7/widget/SearchView;->F:I

    .line 1237
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->c:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    iget v1, p0, Landroid/support/v7/widget/SearchView;->F:I

    const/high16 v2, 0x2000000

    or-int/2addr v1, v2

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->setImeOptions(I)V

    .line 1238
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->c:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->setText(Ljava/lang/CharSequence;)V

    .line 1239
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/support/v7/widget/SearchView;->setIconified(Z)V

    goto :goto_0
.end method

.method public final a_()V
    .locals 3

    .prologue
    .line 1221
    const-string v0, ""

    .line 11573
    iget-object v1, p0, Landroid/support/v7/widget/SearchView;->c:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v1, v0}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->setText(Ljava/lang/CharSequence;)V

    .line 11575
    iget-object v1, p0, Landroid/support/v7/widget/SearchView;->c:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    iget-object v2, p0, Landroid/support/v7/widget/SearchView;->c:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v2}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->length()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->setSelection(I)V

    .line 11576
    iput-object v0, p0, Landroid/support/v7/widget/SearchView;->D:Ljava/lang/CharSequence;

    .line 1222
    invoke-virtual {p0}, Landroid/support/v7/widget/SearchView;->clearFocus()V

    .line 1223
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Landroid/support/v7/widget/SearchView;->a(Z)V

    .line 1224
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->c:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    iget v1, p0, Landroid/support/v7/widget/SearchView;->F:I

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->setImeOptions(I)V

    .line 1225
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/v7/widget/SearchView;->E:Z

    .line 1226
    return-void
.end method

.method final c()V
    .locals 3

    .prologue
    .line 1200
    .line 9664
    iget-boolean v0, p0, Landroid/support/v7/widget/SearchView;->v:Z

    .line 1200
    invoke-direct {p0, v0}, Landroid/support/v7/widget/SearchView;->a(Z)V

    .line 1203
    invoke-direct {p0}, Landroid/support/v7/widget/SearchView;->e()V

    .line 1204
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->c:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->hasFocus()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 10579
    sget-object v0, Landroid/support/v7/widget/SearchView;->a:Landroid/support/v7/widget/SearchView$a;

    iget-object v1, p0, Landroid/support/v7/widget/SearchView;->c:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    .line 10781
    iget-object v2, v0, Landroid/support/v7/widget/SearchView$a;->a:Ljava/lang/reflect/Method;

    if-eqz v2, :cond_0

    .line 10783
    :try_start_0
    iget-object v0, v0, Landroid/support/v7/widget/SearchView$a;->a:Ljava/lang/reflect/Method;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 10580
    :cond_0
    :goto_0
    sget-object v0, Landroid/support/v7/widget/SearchView;->a:Landroid/support/v7/widget/SearchView$a;

    iget-object v1, p0, Landroid/support/v7/widget/SearchView;->c:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    .line 10790
    iget-object v2, v0, Landroid/support/v7/widget/SearchView$a;->b:Ljava/lang/reflect/Method;

    if-eqz v2, :cond_1

    .line 10792
    :try_start_1
    iget-object v0, v0, Landroid/support/v7/widget/SearchView$a;->b:Ljava/lang/reflect/Method;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 10794
    :cond_1
    :goto_1
    return-void

    :catch_0
    move-exception v0

    goto :goto_1

    :catch_1
    move-exception v0

    goto :goto_0
.end method

.method public final clearFocus()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 499
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v7/widget/SearchView;->A:Z

    .line 500
    invoke-direct {p0, v1}, Landroid/support/v7/widget/SearchView;->setImeVisibility(Z)V

    .line 501
    invoke-super {p0}, Landroid/support/v7/widget/LinearLayoutCompat;->clearFocus()V

    .line 502
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->c:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->clearFocus()V

    .line 503
    iput-boolean v1, p0, Landroid/support/v7/widget/SearchView;->A:Z

    .line 504
    return-void
.end method

.method public final getImeOptions()I
    .locals 1

    .prologue
    .line 456
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->c:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->getImeOptions()I

    move-result v0

    return v0
.end method

.method public final getInputType()I
    .locals 1

    .prologue
    .line 474
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->c:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->getInputType()I

    move-result v0

    return v0
.end method

.method public final getMaxWidth()I
    .locals 1

    .prologue
    .line 754
    iget v0, p0, Landroid/support/v7/widget/SearchView;->B:I

    return v0
.end method

.method public final getQuery()Ljava/lang/CharSequence;
    .locals 1

    .prologue
    .line 561
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->c:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->getText()Landroid/text/Editable;

    move-result-object v0

    return-object v0
.end method

.method public final getQueryHint()Ljava/lang/CharSequence;
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 601
    iget-object v1, p0, Landroid/support/v7/widget/SearchView;->y:Ljava/lang/CharSequence;

    if-eqz v1, :cond_1

    .line 602
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->y:Ljava/lang/CharSequence;

    .line 611
    :cond_0
    :goto_0
    return-object v0

    .line 603
    :cond_1
    sget-boolean v1, Landroid/support/v7/widget/SearchView;->b:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, Landroid/support/v7/widget/SearchView;->G:Landroid/app/SearchableInfo;

    if-eqz v1, :cond_0

    .line 605
    iget-object v1, p0, Landroid/support/v7/widget/SearchView;->G:Landroid/app/SearchableInfo;

    invoke-virtual {v1}, Landroid/app/SearchableInfo;->getHintId()I

    move-result v1

    .line 606
    if-eqz v1, :cond_0

    .line 607
    invoke-virtual {p0}, Landroid/support/v7/widget/SearchView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method final getSuggestionCommitIconResId()I
    .locals 1

    .prologue
    .line 401
    iget v0, p0, Landroid/support/v7/widget/SearchView;->m:I

    return v0
.end method

.method final getSuggestionRowLayout()I
    .locals 1

    .prologue
    .line 397
    iget v0, p0, Landroid/support/v7/widget/SearchView;->l:I

    return v0
.end method

.method public final getSuggestionsAdapter()Landroid/support/v4/f/b;
    .locals 1

    .prologue
    .line 736
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->w:Landroid/support/v4/f/b;

    return-object v0
.end method

.method protected final onDetachedFromWindow()V
    .locals 1

    .prologue
    .line 877
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->K:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Landroid/support/v7/widget/SearchView;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 878
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->L:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Landroid/support/v7/widget/SearchView;->post(Ljava/lang/Runnable;)Z

    .line 879
    invoke-super {p0}, Landroid/support/v7/widget/LinearLayoutCompat;->onDetachedFromWindow()V

    .line 880
    return-void
.end method

.method protected final onMeasure(II)V
    .locals 2

    .prologue
    .line 760
    .line 6664
    iget-boolean v0, p0, Landroid/support/v7/widget/SearchView;->v:Z

    .line 760
    if-eqz v0, :cond_0

    .line 761
    invoke-super {p0, p1, p2}, Landroid/support/v7/widget/LinearLayoutCompat;->onMeasure(II)V

    .line 790
    :goto_0
    return-void

    .line 765
    :cond_0
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v1

    .line 766
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    .line 768
    sparse-switch v1, :sswitch_data_0

    .line 789
    :cond_1
    :goto_1
    const/high16 v1, 0x40000000    # 2.0f

    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    invoke-super {p0, v0, p2}, Landroid/support/v7/widget/LinearLayoutCompat;->onMeasure(II)V

    goto :goto_0

    .line 771
    :sswitch_0
    iget v1, p0, Landroid/support/v7/widget/SearchView;->B:I

    if-lez v1, :cond_2

    .line 772
    iget v1, p0, Landroid/support/v7/widget/SearchView;->B:I

    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    goto :goto_1

    .line 774
    :cond_2
    invoke-direct {p0}, Landroid/support/v7/widget/SearchView;->getPreferredWidth()I

    move-result v1

    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    goto :goto_1

    .line 779
    :sswitch_1
    iget v1, p0, Landroid/support/v7/widget/SearchView;->B:I

    if-lez v1, :cond_1

    .line 780
    iget v1, p0, Landroid/support/v7/widget/SearchView;->B:I

    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    goto :goto_1

    .line 785
    :sswitch_2
    iget v0, p0, Landroid/support/v7/widget/SearchView;->B:I

    if-lez v0, :cond_3

    iget v0, p0, Landroid/support/v7/widget/SearchView;->B:I

    goto :goto_1

    :cond_3
    invoke-direct {p0}, Landroid/support/v7/widget/SearchView;->getPreferredWidth()I

    move-result v0

    goto :goto_1

    .line 768
    :sswitch_data_0
    .sparse-switch
        -0x80000000 -> :sswitch_0
        0x0 -> :sswitch_2
        0x40000000 -> :sswitch_1
    .end sparse-switch
.end method

.method public final onWindowFocusChanged(Z)V
    .locals 0

    .prologue
    .line 1211
    invoke-super {p0, p1}, Landroid/support/v7/widget/LinearLayoutCompat;->onWindowFocusChanged(Z)V

    .line 1213
    invoke-direct {p0}, Landroid/support/v7/widget/SearchView;->e()V

    .line 1214
    return-void
.end method

.method public final requestFocus(ILandroid/graphics/Rect;)Z
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 481
    iget-boolean v1, p0, Landroid/support/v7/widget/SearchView;->A:Z

    if-eqz v1, :cond_1

    .line 492
    :cond_0
    :goto_0
    return v0

    .line 483
    :cond_1
    invoke-virtual {p0}, Landroid/support/v7/widget/SearchView;->isFocusable()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 4664
    iget-boolean v1, p0, Landroid/support/v7/widget/SearchView;->v:Z

    .line 485
    if-nez v1, :cond_3

    .line 486
    iget-object v1, p0, Landroid/support/v7/widget/SearchView;->c:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v1, p1, p2}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->requestFocus(ILandroid/graphics/Rect;)Z

    move-result v1

    .line 487
    if-eqz v1, :cond_2

    .line 488
    invoke-direct {p0, v0}, Landroid/support/v7/widget/SearchView;->a(Z)V

    :cond_2
    move v0, v1

    .line 490
    goto :goto_0

    .line 492
    :cond_3
    invoke-super {p0, p1, p2}, Landroid/support/v7/widget/LinearLayoutCompat;->requestFocus(ILandroid/graphics/Rect;)Z

    move-result v0

    goto :goto_0
.end method

.method public final setAppSearchData(Landroid/os/Bundle;)V
    .locals 0

    .prologue
    .line 437
    iput-object p1, p0, Landroid/support/v7/widget/SearchView;->H:Landroid/os/Bundle;

    .line 438
    return-void
.end method

.method public final setIconified(Z)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 650
    if-eqz p1, :cond_3

    .line 5147
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->c:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->getText()Landroid/text/Editable;

    move-result-object v0

    .line 5148
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 5149
    iget-boolean v0, p0, Landroid/support/v7/widget/SearchView;->u:Z

    if-eqz v0, :cond_1

    .line 5151
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->q:Landroid/support/v7/widget/SearchView$b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->q:Landroid/support/v7/widget/SearchView$b;

    invoke-interface {v0}, Landroid/support/v7/widget/SearchView$b;->a()Z

    move-result v0

    if-nez v0, :cond_1

    .line 5153
    :cond_0
    invoke-virtual {p0}, Landroid/support/v7/widget/SearchView;->clearFocus()V

    .line 5155
    invoke-direct {p0, v2}, Landroid/support/v7/widget/SearchView;->a(Z)V

    :cond_1
    :goto_0
    return-void

    .line 5159
    :cond_2
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->c:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->setText(Ljava/lang/CharSequence;)V

    .line 5160
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->c:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->requestFocus()Z

    .line 5161
    invoke-direct {p0, v2}, Landroid/support/v7/widget/SearchView;->setImeVisibility(Z)V

    goto :goto_0

    .line 5167
    :cond_3
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Landroid/support/v7/widget/SearchView;->a(Z)V

    .line 5168
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->c:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->requestFocus()Z

    .line 5169
    invoke-direct {p0, v2}, Landroid/support/v7/widget/SearchView;->setImeVisibility(Z)V

    .line 5170
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->t:Landroid/view/View$OnClickListener;

    if-eqz v0, :cond_1

    .line 5171
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->t:Landroid/view/View$OnClickListener;

    invoke-interface {v0, p0}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    goto :goto_0
.end method

.method public final setIconifiedByDefault(Z)V
    .locals 1

    .prologue
    .line 625
    iget-boolean v0, p0, Landroid/support/v7/widget/SearchView;->u:Z

    if-ne v0, p1, :cond_0

    .line 629
    :goto_0
    return-void

    .line 626
    :cond_0
    iput-boolean p1, p0, Landroid/support/v7/widget/SearchView;->u:Z

    .line 627
    invoke-direct {p0, p1}, Landroid/support/v7/widget/SearchView;->a(Z)V

    .line 628
    invoke-direct {p0}, Landroid/support/v7/widget/SearchView;->f()V

    goto :goto_0
.end method

.method public final setImeOptions(I)V
    .locals 1

    .prologue
    .line 447
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->c:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0, p1}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->setImeOptions(I)V

    .line 448
    return-void
.end method

.method public final setInputType(I)V
    .locals 1

    .prologue
    .line 466
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->c:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0, p1}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->setInputType(I)V

    .line 467
    return-void
.end method

.method public final setMaxWidth(I)V
    .locals 0

    .prologue
    .line 743
    iput p1, p0, Landroid/support/v7/widget/SearchView;->B:I

    .line 745
    invoke-virtual {p0}, Landroid/support/v7/widget/SearchView;->requestLayout()V

    .line 746
    return-void
.end method

.method public final setOnCloseListener(Landroid/support/v7/widget/SearchView$b;)V
    .locals 0

    .prologue
    .line 522
    iput-object p1, p0, Landroid/support/v7/widget/SearchView;->q:Landroid/support/v7/widget/SearchView$b;

    .line 523
    return-void
.end method

.method public final setOnQueryTextFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V
    .locals 0

    .prologue
    .line 531
    iput-object p1, p0, Landroid/support/v7/widget/SearchView;->r:Landroid/view/View$OnFocusChangeListener;

    .line 532
    return-void
.end method

.method public final setOnQueryTextListener(Landroid/support/v7/widget/SearchView$c;)V
    .locals 0

    .prologue
    .line 513
    iput-object p1, p0, Landroid/support/v7/widget/SearchView;->p:Landroid/support/v7/widget/SearchView$c;

    .line 514
    return-void
.end method

.method public final setOnSearchClickListener(Landroid/view/View$OnClickListener;)V
    .locals 0

    .prologue
    .line 552
    iput-object p1, p0, Landroid/support/v7/widget/SearchView;->t:Landroid/view/View$OnClickListener;

    .line 553
    return-void
.end method

.method public final setOnSuggestionListener(Landroid/support/v7/widget/SearchView$d;)V
    .locals 0

    .prologue
    .line 540
    iput-object p1, p0, Landroid/support/v7/widget/SearchView;->s:Landroid/support/v7/widget/SearchView$d;

    .line 541
    return-void
.end method

.method final setQuery(Ljava/lang/CharSequence;)V
    .locals 2

    .prologue
    .line 1387
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->c:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0, p1}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->setText(Ljava/lang/CharSequence;)V

    .line 1389
    iget-object v1, p0, Landroid/support/v7/widget/SearchView;->c:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v1, v0}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->setSelection(I)V

    .line 1390
    return-void

    .line 1389
    :cond_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    goto :goto_0
.end method

.method public final setQueryHint(Ljava/lang/CharSequence;)V
    .locals 0

    .prologue
    .line 592
    iput-object p1, p0, Landroid/support/v7/widget/SearchView;->y:Ljava/lang/CharSequence;

    .line 593
    invoke-direct {p0}, Landroid/support/v7/widget/SearchView;->f()V

    .line 594
    return-void
.end method

.method public final setQueryRefinementEnabled(Z)V
    .locals 2

    .prologue
    .line 704
    iput-boolean p1, p0, Landroid/support/v7/widget/SearchView;->z:Z

    .line 705
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->w:Landroid/support/v4/f/b;

    instance-of v0, v0, Landroid/support/v7/widget/c;

    if-eqz v0, :cond_0

    .line 706
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->w:Landroid/support/v4/f/b;

    check-cast v0, Landroid/support/v7/widget/c;

    if-eqz p1, :cond_1

    const/4 v1, 0x2

    .line 6118
    :goto_0
    iput v1, v0, Landroid/support/v7/widget/c;->j:I

    .line 709
    :cond_0
    return-void

    .line 706
    :cond_1
    const/4 v1, 0x1

    goto :goto_0
.end method

.method public final setSearchableInfo(Landroid/app/SearchableInfo;)V
    .locals 8

    .prologue
    const/4 v4, 0x0

    const/high16 v7, 0x10000

    const/4 v3, 0x0

    const/4 v2, 0x1

    .line 413
    iput-object p1, p0, Landroid/support/v7/widget/SearchView;->G:Landroid/app/SearchableInfo;

    .line 414
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->G:Landroid/app/SearchableInfo;

    if-eqz v0, :cond_3

    .line 415
    sget-boolean v0, Landroid/support/v7/widget/SearchView;->b:Z

    if-eqz v0, :cond_2

    .line 2052
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->c:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    iget-object v1, p0, Landroid/support/v7/widget/SearchView;->G:Landroid/app/SearchableInfo;

    invoke-virtual {v1}, Landroid/app/SearchableInfo;->getSuggestThreshold()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->setThreshold(I)V

    .line 2053
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->c:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    iget-object v1, p0, Landroid/support/v7/widget/SearchView;->G:Landroid/app/SearchableInfo;

    invoke-virtual {v1}, Landroid/app/SearchableInfo;->getImeOptions()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->setImeOptions(I)V

    .line 2054
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->G:Landroid/app/SearchableInfo;

    invoke-virtual {v0}, Landroid/app/SearchableInfo;->getInputType()I

    move-result v0

    .line 2057
    and-int/lit8 v1, v0, 0xf

    if-ne v1, v2, :cond_0

    .line 2060
    const v1, -0x10001

    and-int/2addr v0, v1

    .line 2061
    iget-object v1, p0, Landroid/support/v7/widget/SearchView;->G:Landroid/app/SearchableInfo;

    invoke-virtual {v1}, Landroid/app/SearchableInfo;->getSuggestAuthority()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 2062
    or-int/2addr v0, v7

    .line 2069
    const/high16 v1, 0x80000

    or-int/2addr v0, v1

    .line 2072
    :cond_0
    iget-object v1, p0, Landroid/support/v7/widget/SearchView;->c:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v1, v0}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->setInputType(I)V

    .line 2073
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->w:Landroid/support/v4/f/b;

    if-eqz v0, :cond_1

    .line 2074
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->w:Landroid/support/v4/f/b;

    invoke-virtual {v0, v4}, Landroid/support/v4/f/b;->a(Landroid/database/Cursor;)V

    .line 2078
    :cond_1
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->G:Landroid/app/SearchableInfo;

    invoke-virtual {v0}, Landroid/app/SearchableInfo;->getSuggestAuthority()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 2079
    new-instance v0, Landroid/support/v7/widget/c;

    invoke-virtual {p0}, Landroid/support/v7/widget/SearchView;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v5, p0, Landroid/support/v7/widget/SearchView;->G:Landroid/app/SearchableInfo;

    iget-object v6, p0, Landroid/support/v7/widget/SearchView;->M:Ljava/util/WeakHashMap;

    invoke-direct {v0, v1, p0, v5, v6}, Landroid/support/v7/widget/c;-><init>(Landroid/content/Context;Landroid/support/v7/widget/SearchView;Landroid/app/SearchableInfo;Ljava/util/WeakHashMap;)V

    iput-object v0, p0, Landroid/support/v7/widget/SearchView;->w:Landroid/support/v4/f/b;

    .line 2081
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->c:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    iget-object v1, p0, Landroid/support/v7/widget/SearchView;->w:Landroid/support/v4/f/b;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 2082
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->w:Landroid/support/v4/f/b;

    check-cast v0, Landroid/support/v7/widget/c;

    iget-boolean v1, p0, Landroid/support/v7/widget/SearchView;->z:Z

    if-eqz v1, :cond_5

    const/4 v1, 0x2

    .line 2118
    :goto_0
    iput v1, v0, Landroid/support/v7/widget/c;->j:I

    .line 418
    :cond_2
    invoke-direct {p0}, Landroid/support/v7/widget/SearchView;->f()V

    .line 421
    :cond_3
    sget-boolean v0, Landroid/support/v7/widget/SearchView;->b:Z

    if-eqz v0, :cond_9

    .line 2815
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->G:Landroid/app/SearchableInfo;

    if-eqz v0, :cond_8

    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->G:Landroid/app/SearchableInfo;

    invoke-virtual {v0}, Landroid/app/SearchableInfo;->getVoiceSearchEnabled()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 2818
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->G:Landroid/app/SearchableInfo;

    invoke-virtual {v0}, Landroid/app/SearchableInfo;->getVoiceSearchLaunchWebSearch()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 2819
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->n:Landroid/content/Intent;

    .line 2823
    :goto_1
    if-eqz v0, :cond_8

    .line 2824
    invoke-virtual {p0}, Landroid/support/v7/widget/SearchView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-virtual {v1, v0, v7}, Landroid/content/pm/PackageManager;->resolveActivity(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;

    move-result-object v0

    .line 2826
    if-eqz v0, :cond_7

    move v0, v2

    .line 421
    :goto_2
    if-eqz v0, :cond_9

    :goto_3
    iput-boolean v2, p0, Landroid/support/v7/widget/SearchView;->C:Z

    .line 423
    iget-boolean v0, p0, Landroid/support/v7/widget/SearchView;->C:Z

    if-eqz v0, :cond_4

    .line 426
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->c:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    const-string v1, "nm"

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->setPrivateImeOptions(Ljava/lang/String;)V

    .line 3664
    :cond_4
    iget-boolean v0, p0, Landroid/support/v7/widget/SearchView;->v:Z

    .line 428
    invoke-direct {p0, v0}, Landroid/support/v7/widget/SearchView;->a(Z)V

    .line 429
    return-void

    :cond_5
    move v1, v2

    .line 2082
    goto :goto_0

    .line 2820
    :cond_6
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->G:Landroid/app/SearchableInfo;

    invoke-virtual {v0}, Landroid/app/SearchableInfo;->getVoiceSearchLaunchRecognizer()Z

    move-result v0

    if-eqz v0, :cond_a

    .line 2821
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->o:Landroid/content/Intent;

    goto :goto_1

    :cond_7
    move v0, v3

    .line 2826
    goto :goto_2

    :cond_8
    move v0, v3

    .line 2829
    goto :goto_2

    :cond_9
    move v2, v3

    .line 421
    goto :goto_3

    :cond_a
    move-object v0, v4

    goto :goto_1
.end method

.method public final setSubmitButtonEnabled(Z)V
    .locals 1

    .prologue
    .line 676
    iput-boolean p1, p0, Landroid/support/v7/widget/SearchView;->x:Z

    .line 5664
    iget-boolean v0, p0, Landroid/support/v7/widget/SearchView;->v:Z

    .line 677
    invoke-direct {p0, v0}, Landroid/support/v7/widget/SearchView;->a(Z)V

    .line 678
    return-void
.end method

.method public final setSuggestionsAdapter(Landroid/support/v4/f/b;)V
    .locals 2

    .prologue
    .line 726
    iput-object p1, p0, Landroid/support/v7/widget/SearchView;->w:Landroid/support/v4/f/b;

    .line 728
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->c:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    iget-object v1, p0, Landroid/support/v7/widget/SearchView;->w:Landroid/support/v4/f/b;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 729
    return-void
.end method
