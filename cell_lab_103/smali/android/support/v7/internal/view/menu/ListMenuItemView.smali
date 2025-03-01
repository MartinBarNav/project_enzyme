.class public Landroid/support/v7/internal/view/menu/ListMenuItemView;
.super Landroid/widget/LinearLayout;
.source "SourceFile"

# interfaces
.implements Landroid/support/v7/internal/view/menu/k$a;


# instance fields
.field private a:Landroid/support/v7/internal/view/menu/f;

.field private b:Landroid/widget/ImageView;

.field private c:Landroid/widget/RadioButton;

.field private d:Landroid/widget/TextView;

.field private e:Landroid/widget/CheckBox;

.field private f:Landroid/widget/TextView;

.field private g:Landroid/graphics/drawable/Drawable;

.field private h:I

.field private i:Landroid/content/Context;

.field private j:Z

.field private k:I

.field private l:Landroid/content/Context;

.field private m:Landroid/view/LayoutInflater;

.field private n:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 80
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Landroid/support/v7/internal/view/menu/ListMenuItemView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 81
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 63
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 64
    iput-object p1, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->l:Landroid/content/Context;

    .line 66
    sget-object v0, Landroid/support/v7/b/a$i;->MenuView:[I

    invoke-virtual {p1, p2, v0, p3, v3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 69
    sget v1, Landroid/support/v7/b/a$i;->MenuView_android_itemBackground:I

    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iput-object v1, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->g:Landroid/graphics/drawable/Drawable;

    .line 70
    sget v1, Landroid/support/v7/b/a$i;->MenuView_android_itemTextAppearance:I

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    iput v1, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->h:I

    .line 72
    sget v1, Landroid/support/v7/b/a$i;->MenuView_preserveIconSpacing:I

    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    iput-boolean v1, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->j:Z

    .line 74
    iput-object p1, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->i:Landroid/content/Context;

    .line 76
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 77
    return-void
.end method

.method private b()V
    .locals 3

    .prologue
    .line 252
    invoke-direct {p0}, Landroid/support/v7/internal/view/menu/ListMenuItemView;->getInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    .line 253
    sget v1, Landroid/support/v7/b/a$g;->abc_list_menu_item_radio:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioButton;

    iput-object v0, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->c:Landroid/widget/RadioButton;

    .line 256
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->c:Landroid/widget/RadioButton;

    invoke-virtual {p0, v0}, Landroid/support/v7/internal/view/menu/ListMenuItemView;->addView(Landroid/view/View;)V

    .line 257
    return-void
.end method

.method private c()V
    .locals 3

    .prologue
    .line 260
    invoke-direct {p0}, Landroid/support/v7/internal/view/menu/ListMenuItemView;->getInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    .line 261
    sget v1, Landroid/support/v7/b/a$g;->abc_list_menu_item_checkbox:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    iput-object v0, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->e:Landroid/widget/CheckBox;

    .line 264
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->e:Landroid/widget/CheckBox;

    invoke-virtual {p0, v0}, Landroid/support/v7/internal/view/menu/ListMenuItemView;->addView(Landroid/view/View;)V

    .line 265
    return-void
.end method

.method private getInflater()Landroid/view/LayoutInflater;
    .locals 1

    .prologue
    .line 276
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->m:Landroid/view/LayoutInflater;

    if-nez v0, :cond_0

    .line 277
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->l:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->m:Landroid/view/LayoutInflater;

    .line 279
    :cond_0
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->m:Landroid/view/LayoutInflater;

    return-object v0
.end method

.method private setShortcut$25d965e(Z)V
    .locals 5

    .prologue
    .line 194
    if-eqz p1, :cond_2

    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->a:Landroid/support/v7/internal/view/menu/f;

    invoke-virtual {v0}, Landroid/support/v7/internal/view/menu/f;->d()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    move v1, v0

    .line 197
    :goto_0
    if-nez v1, :cond_0

    .line 198
    iget-object v2, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->f:Landroid/widget/TextView;

    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->a:Landroid/support/v7/internal/view/menu/f;

    .line 3296
    invoke-virtual {v0}, Landroid/support/v7/internal/view/menu/f;->c()C

    move-result v0

    .line 3297
    if-nez v0, :cond_3

    .line 3298
    const-string v0, ""

    .line 198
    :goto_1
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 201
    :cond_0
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->f:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getVisibility()I

    move-result v0

    if-eq v0, v1, :cond_1

    .line 202
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->f:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 204
    :cond_1
    return-void

    .line 194
    :cond_2
    const/16 v0, 0x8

    move v1, v0

    goto :goto_0

    .line 3301
    :cond_3
    new-instance v3, Ljava/lang/StringBuilder;

    sget-object v4, Landroid/support/v7/internal/view/menu/f;->f:Ljava/lang/String;

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 3302
    sparse-switch v0, :sswitch_data_0

    .line 3317
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 3321
    :goto_2
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    .line 3305
    :sswitch_0
    sget-object v0, Landroid/support/v7/internal/view/menu/f;->g:Ljava/lang/String;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    .line 3309
    :sswitch_1
    sget-object v0, Landroid/support/v7/internal/view/menu/f;->h:Ljava/lang/String;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    .line 3313
    :sswitch_2
    sget-object v0, Landroid/support/v7/internal/view/menu/f;->i:Ljava/lang/String;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    .line 3302
    nop

    :sswitch_data_0
    .sparse-switch
        0x8 -> :sswitch_1
        0xa -> :sswitch_0
        0x20 -> :sswitch_2
    .end sparse-switch
.end method


# virtual methods
.method public final a(Landroid/support/v7/internal/view/menu/f;)V
    .locals 5

    .prologue
    const/16 v2, 0x8

    const/4 v1, 0x0

    .line 99
    iput-object p1, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->a:Landroid/support/v7/internal/view/menu/f;

    .line 100
    iput v1, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->k:I

    .line 102
    invoke-virtual {p1}, Landroid/support/v7/internal/view/menu/f;->isVisible()Z

    move-result v0

    if-eqz v0, :cond_2

    move v0, v1

    :goto_0
    invoke-virtual {p0, v0}, Landroid/support/v7/internal/view/menu/ListMenuItemView;->setVisibility(I)V

    .line 104
    invoke-virtual {p1, p0}, Landroid/support/v7/internal/view/menu/f;->a(Landroid/support/v7/internal/view/menu/k$a;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/support/v7/internal/view/menu/ListMenuItemView;->setTitle(Ljava/lang/CharSequence;)V

    .line 105
    invoke-virtual {p1}, Landroid/support/v7/internal/view/menu/f;->isCheckable()Z

    move-result v0

    invoke-virtual {p0, v0}, Landroid/support/v7/internal/view/menu/ListMenuItemView;->setCheckable(Z)V

    .line 106
    invoke-virtual {p1}, Landroid/support/v7/internal/view/menu/f;->d()Z

    move-result v0

    invoke-virtual {p1}, Landroid/support/v7/internal/view/menu/f;->c()C

    .line 2194
    if-eqz v0, :cond_3

    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->a:Landroid/support/v7/internal/view/menu/f;

    invoke-virtual {v0}, Landroid/support/v7/internal/view/menu/f;->d()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 2197
    :goto_1
    if-nez v1, :cond_0

    .line 2198
    iget-object v2, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->f:Landroid/widget/TextView;

    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->a:Landroid/support/v7/internal/view/menu/f;

    .line 2296
    invoke-virtual {v0}, Landroid/support/v7/internal/view/menu/f;->c()C

    move-result v0

    .line 2297
    if-nez v0, :cond_4

    .line 2298
    const-string v0, ""

    .line 2198
    :goto_2
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2201
    :cond_0
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->f:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getVisibility()I

    move-result v0

    if-eq v0, v1, :cond_1

    .line 2202
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->f:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 107
    :cond_1
    invoke-virtual {p1}, Landroid/support/v7/internal/view/menu/f;->getIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/support/v7/internal/view/menu/ListMenuItemView;->setIcon(Landroid/graphics/drawable/Drawable;)V

    .line 108
    invoke-virtual {p1}, Landroid/support/v7/internal/view/menu/f;->isEnabled()Z

    move-result v0

    invoke-virtual {p0, v0}, Landroid/support/v7/internal/view/menu/ListMenuItemView;->setEnabled(Z)V

    .line 109
    return-void

    :cond_2
    move v0, v2

    .line 102
    goto :goto_0

    :cond_3
    move v1, v2

    .line 2194
    goto :goto_1

    .line 2301
    :cond_4
    new-instance v3, Ljava/lang/StringBuilder;

    sget-object v4, Landroid/support/v7/internal/view/menu/f;->f:Ljava/lang/String;

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2302
    sparse-switch v0, :sswitch_data_0

    .line 2317
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 2321
    :goto_3
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    .line 2305
    :sswitch_0
    sget-object v0, Landroid/support/v7/internal/view/menu/f;->g:Ljava/lang/String;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    .line 2309
    :sswitch_1
    sget-object v0, Landroid/support/v7/internal/view/menu/f;->h:Ljava/lang/String;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    .line 2313
    :sswitch_2
    sget-object v0, Landroid/support/v7/internal/view/menu/f;->i:Ljava/lang/String;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    .line 2302
    nop

    :sswitch_data_0
    .sparse-switch
        0x8 -> :sswitch_1
        0xa -> :sswitch_0
        0x20 -> :sswitch_2
    .end sparse-switch
.end method

.method public final a()Z
    .locals 1

    .prologue
    .line 268
    const/4 v0, 0x0

    return v0
.end method

.method public getItemData()Landroid/support/v7/internal/view/menu/f;
    .locals 1

    .prologue
    .line 126
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->a:Landroid/support/v7/internal/view/menu/f;

    return-object v0
.end method

.method protected onFinishInflate()V
    .locals 3

    .prologue
    .line 85
    invoke-super {p0}, Landroid/widget/LinearLayout;->onFinishInflate()V

    .line 87
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->g:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0, v0}, Landroid/support/v7/internal/view/menu/ListMenuItemView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 89
    sget v0, Landroid/support/v7/b/a$e;->title:I

    invoke-virtual {p0, v0}, Landroid/support/v7/internal/view/menu/ListMenuItemView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->d:Landroid/widget/TextView;

    .line 90
    iget v0, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->h:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 91
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->d:Landroid/widget/TextView;

    iget-object v1, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->i:Landroid/content/Context;

    iget v2, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->h:I

    invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V

    .line 95
    :cond_0
    sget v0, Landroid/support/v7/b/a$e;->shortcut:I

    invoke-virtual {p0, v0}, Landroid/support/v7/internal/view/menu/ListMenuItemView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->f:Landroid/widget/TextView;

    .line 96
    return-void
.end method

.method protected onMeasure(II)V
    .locals 3

    .prologue
    .line 233
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->b:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->j:Z

    if-eqz v0, :cond_0

    .line 235
    invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/ListMenuItemView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    .line 236
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->b:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 237
    iget v2, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    if-lez v2, :cond_0

    iget v2, v0, Landroid/widget/LinearLayout$LayoutParams;->width:I

    if-gtz v2, :cond_0

    .line 238
    iget v1, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    iput v1, v0, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 241
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/widget/LinearLayout;->onMeasure(II)V

    .line 242
    return-void
.end method

.method public setCheckable(Z)V
    .locals 5

    .prologue
    const/16 v1, 0x8

    .line 130
    if-nez p1, :cond_1

    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->c:Landroid/widget/RadioButton;

    if-nez v0, :cond_1

    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->e:Landroid/widget/CheckBox;

    if-nez v0, :cond_1

    .line 173
    :cond_0
    :goto_0
    return-void

    .line 139
    :cond_1
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->a:Landroid/support/v7/internal/view/menu/f;

    invoke-virtual {v0}, Landroid/support/v7/internal/view/menu/f;->e()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 140
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->c:Landroid/widget/RadioButton;

    if-nez v0, :cond_2

    .line 141
    invoke-direct {p0}, Landroid/support/v7/internal/view/menu/ListMenuItemView;->b()V

    .line 143
    :cond_2
    iget-object v2, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->c:Landroid/widget/RadioButton;

    .line 144
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->e:Landroid/widget/CheckBox;

    move-object v3, v2

    move-object v2, v0

    .line 153
    :goto_1
    if-eqz p1, :cond_7

    .line 154
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->a:Landroid/support/v7/internal/view/menu/f;

    invoke-virtual {v0}, Landroid/support/v7/internal/view/menu/f;->isChecked()Z

    move-result v0

    invoke-virtual {v3, v0}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 156
    if-eqz p1, :cond_6

    const/4 v0, 0x0

    .line 157
    :goto_2
    invoke-virtual {v3}, Landroid/widget/CompoundButton;->getVisibility()I

    move-result v4

    if-eq v4, v0, :cond_3

    .line 158
    invoke-virtual {v3, v0}, Landroid/widget/CompoundButton;->setVisibility(I)V

    .line 162
    :cond_3
    if-eqz v2, :cond_0

    invoke-virtual {v2}, Landroid/widget/CompoundButton;->getVisibility()I

    move-result v0

    if-eq v0, v1, :cond_0

    .line 163
    invoke-virtual {v2, v1}, Landroid/widget/CompoundButton;->setVisibility(I)V

    goto :goto_0

    .line 146
    :cond_4
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->e:Landroid/widget/CheckBox;

    if-nez v0, :cond_5

    .line 147
    invoke-direct {p0}, Landroid/support/v7/internal/view/menu/ListMenuItemView;->c()V

    .line 149
    :cond_5
    iget-object v2, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->e:Landroid/widget/CheckBox;

    .line 150
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->c:Landroid/widget/RadioButton;

    move-object v3, v2

    move-object v2, v0

    goto :goto_1

    :cond_6
    move v0, v1

    .line 156
    goto :goto_2

    .line 166
    :cond_7
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->e:Landroid/widget/CheckBox;

    if-eqz v0, :cond_8

    .line 167
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->e:Landroid/widget/CheckBox;

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setVisibility(I)V

    .line 169
    :cond_8
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->c:Landroid/widget/RadioButton;

    if-eqz v0, :cond_0

    .line 170
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->c:Landroid/widget/RadioButton;

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setVisibility(I)V

    goto :goto_0
.end method

.method public setChecked(Z)V
    .locals 1

    .prologue
    .line 178
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->a:Landroid/support/v7/internal/view/menu/f;

    invoke-virtual {v0}, Landroid/support/v7/internal/view/menu/f;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 179
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->c:Landroid/widget/RadioButton;

    if-nez v0, :cond_0

    .line 180
    invoke-direct {p0}, Landroid/support/v7/internal/view/menu/ListMenuItemView;->b()V

    .line 182
    :cond_0
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->c:Landroid/widget/RadioButton;

    .line 190
    :goto_0
    invoke-virtual {v0, p1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 191
    return-void

    .line 184
    :cond_1
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->e:Landroid/widget/CheckBox;

    if-nez v0, :cond_2

    .line 185
    invoke-direct {p0}, Landroid/support/v7/internal/view/menu/ListMenuItemView;->c()V

    .line 187
    :cond_2
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->e:Landroid/widget/CheckBox;

    goto :goto_0
.end method

.method public setForceShowIcon(Z)V
    .locals 0

    .prologue
    .line 112
    iput-boolean p1, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->n:Z

    iput-boolean p1, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->j:Z

    .line 113
    return-void
.end method

.method public setIcon(Landroid/graphics/drawable/Drawable;)V
    .locals 4

    .prologue
    const/4 v2, 0x0

    .line 207
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->a:Landroid/support/v7/internal/view/menu/f;

    .line 3561
    iget-object v0, v0, Landroid/support/v7/internal/view/menu/f;->b:Landroid/support/v7/internal/view/menu/e;

    .line 4301
    iget-boolean v0, v0, Landroid/support/v7/internal/view/menu/e;->g:Z

    .line 207
    if-nez v0, :cond_0

    iget-boolean v0, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->n:Z

    if-eqz v0, :cond_2

    :cond_0
    const/4 v0, 0x1

    move v1, v0

    .line 208
    :goto_0
    if-nez v1, :cond_3

    iget-boolean v0, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->j:Z

    if-nez v0, :cond_3

    .line 229
    :cond_1
    :goto_1
    return-void

    :cond_2
    move v1, v2

    .line 207
    goto :goto_0

    .line 212
    :cond_3
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->b:Landroid/widget/ImageView;

    if-nez v0, :cond_4

    if-nez p1, :cond_4

    iget-boolean v0, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->j:Z

    if-eqz v0, :cond_1

    .line 216
    :cond_4
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->b:Landroid/widget/ImageView;

    if-nez v0, :cond_5

    .line 5245
    invoke-direct {p0}, Landroid/support/v7/internal/view/menu/ListMenuItemView;->getInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    .line 5246
    sget v3, Landroid/support/v7/b/a$g;->abc_list_menu_item_icon:I

    invoke-virtual {v0, v3, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->b:Landroid/widget/ImageView;

    .line 5248
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->b:Landroid/widget/ImageView;

    invoke-virtual {p0, v0, v2}, Landroid/support/v7/internal/view/menu/ListMenuItemView;->addView(Landroid/view/View;I)V

    .line 220
    :cond_5
    if-nez p1, :cond_6

    iget-boolean v0, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->j:Z

    if-eqz v0, :cond_8

    .line 221
    :cond_6
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->b:Landroid/widget/ImageView;

    if-eqz v1, :cond_7

    :goto_2
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 223
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->b:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_1

    .line 224
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_1

    .line 221
    :cond_7
    const/4 p1, 0x0

    goto :goto_2

    .line 227
    :cond_8
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->b:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_1
.end method

.method public setTitle(Ljava/lang/CharSequence;)V
    .locals 2

    .prologue
    const/16 v1, 0x8

    .line 116
    if-eqz p1, :cond_1

    .line 117
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->d:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 119
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->d:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->d:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 123
    :cond_0
    :goto_0
    return-void

    .line 121
    :cond_1
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->d:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getVisibility()I

    move-result v0

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->d:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0
.end method
