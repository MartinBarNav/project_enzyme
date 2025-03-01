.class public final Landroid/support/v7/internal/view/b;
.super Landroid/view/MenuInflater;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v7/internal/view/b$b;,
        Landroid/support/v7/internal/view/b$a;
    }
.end annotation


# static fields
.field private static final a:[Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field

.field private static final b:[Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private final c:[Ljava/lang/Object;

.field private final d:[Ljava/lang/Object;

.field private e:Landroid/content/Context;

.field private f:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 72
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Class;

    const/4 v1, 0x0

    const-class v2, Landroid/content/Context;

    aput-object v2, v0, v1

    .line 74
    sput-object v0, Landroid/support/v7/internal/view/b;->a:[Ljava/lang/Class;

    sput-object v0, Landroid/support/v7/internal/view/b;->b:[Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 90
    invoke-direct {p0, p1}, Landroid/view/MenuInflater;-><init>(Landroid/content/Context;)V

    .line 91
    iput-object p1, p0, Landroid/support/v7/internal/view/b;->e:Landroid/content/Context;

    .line 92
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    iput-object v0, p0, Landroid/support/v7/internal/view/b;->c:[Ljava/lang/Object;

    .line 93
    iget-object v0, p0, Landroid/support/v7/internal/view/b;->c:[Ljava/lang/Object;

    iput-object v0, p0, Landroid/support/v7/internal/view/b;->d:[Ljava/lang/Object;

    .line 94
    return-void
.end method

.method static synthetic a(Landroid/support/v7/internal/view/b;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 58
    iget-object v0, p0, Landroid/support/v7/internal/view/b;->e:Landroid/content/Context;

    return-object v0
.end method

.method private a(Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/view/Menu;)V
    .locals 10

    .prologue
    .line 134
    new-instance v4, Landroid/support/v7/internal/view/b$b;

    invoke-direct {v4, p0, p3}, Landroid/support/v7/internal/view/b$b;-><init>(Landroid/support/v7/internal/view/b;Landroid/view/Menu;)V

    .line 136
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v0

    .line 138
    const/4 v3, 0x0

    .line 139
    const/4 v2, 0x0

    .line 143
    :cond_0
    const/4 v1, 0x2

    if-ne v0, v1, :cond_3

    .line 144
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v0

    .line 145
    const-string v1, "menu"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 147
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v0

    .line 156
    :goto_0
    const/4 v1, 0x0

    .line 157
    :goto_1
    if-nez v1, :cond_10

    .line 158
    packed-switch v0, :pswitch_data_0

    :cond_1
    move v0, v1

    move-object v1, v2

    move v2, v3

    .line 208
    :goto_2
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v3

    move v9, v0

    move v0, v3

    move v3, v2

    move-object v2, v1

    move v1, v9

    goto :goto_1

    .line 151
    :cond_2
    new-instance v1, Ljava/lang/RuntimeException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Expecting menu, got "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 153
    :cond_3
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v0

    .line 154
    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 160
    :pswitch_0
    if-nez v3, :cond_1

    .line 164
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v0

    .line 165
    const-string v5, "group"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    .line 1348
    iget-object v0, v4, Landroid/support/v7/internal/view/b$b;->z:Landroid/support/v7/internal/view/b;

    .line 2058
    iget-object v0, v0, Landroid/support/v7/internal/view/b;->e:Landroid/content/Context;

    .line 1348
    sget-object v5, Landroid/support/v7/b/a$i;->MenuGroup:[I

    invoke-virtual {v0, p2, v5}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 1350
    sget v5, Landroid/support/v7/b/a$i;->MenuGroup_android_id:I

    const/4 v6, 0x0

    invoke-virtual {v0, v5, v6}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v5

    iput v5, v4, Landroid/support/v7/internal/view/b$b;->b:I

    .line 1351
    sget v5, Landroid/support/v7/b/a$i;->MenuGroup_android_menuCategory:I

    const/4 v6, 0x0

    invoke-virtual {v0, v5, v6}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v5

    iput v5, v4, Landroid/support/v7/internal/view/b$b;->c:I

    .line 1353
    sget v5, Landroid/support/v7/b/a$i;->MenuGroup_android_orderInCategory:I

    const/4 v6, 0x0

    invoke-virtual {v0, v5, v6}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v5

    iput v5, v4, Landroid/support/v7/internal/view/b$b;->d:I

    .line 1354
    sget v5, Landroid/support/v7/b/a$i;->MenuGroup_android_checkableBehavior:I

    const/4 v6, 0x0

    invoke-virtual {v0, v5, v6}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v5

    iput v5, v4, Landroid/support/v7/internal/view/b$b;->e:I

    .line 1356
    sget v5, Landroid/support/v7/b/a$i;->MenuGroup_android_visible:I

    const/4 v6, 0x1

    invoke-virtual {v0, v5, v6}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v5

    iput-boolean v5, v4, Landroid/support/v7/internal/view/b$b;->f:Z

    .line 1357
    sget v5, Landroid/support/v7/b/a$i;->MenuGroup_android_enabled:I

    const/4 v6, 0x1

    invoke-virtual {v0, v5, v6}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v5

    iput-boolean v5, v4, Landroid/support/v7/internal/view/b$b;->g:Z

    .line 1359
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    move v0, v1

    move-object v1, v2

    move v2, v3

    .line 166
    goto :goto_2

    .line 167
    :cond_4
    const-string v5, "item"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_a

    .line 2366
    iget-object v0, v4, Landroid/support/v7/internal/view/b$b;->z:Landroid/support/v7/internal/view/b;

    .line 3058
    iget-object v0, v0, Landroid/support/v7/internal/view/b;->e:Landroid/content/Context;

    .line 2366
    sget-object v5, Landroid/support/v7/b/a$i;->MenuItem:[I

    invoke-virtual {v0, p2, v5}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v5

    .line 2369
    sget v0, Landroid/support/v7/b/a$i;->MenuItem_android_id:I

    const/4 v6, 0x0

    invoke-virtual {v5, v0, v6}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    iput v0, v4, Landroid/support/v7/internal/view/b$b;->i:I

    .line 2370
    sget v0, Landroid/support/v7/b/a$i;->MenuItem_android_menuCategory:I

    iget v6, v4, Landroid/support/v7/internal/view/b$b;->c:I

    invoke-virtual {v5, v0, v6}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    .line 2371
    sget v6, Landroid/support/v7/b/a$i;->MenuItem_android_orderInCategory:I

    iget v7, v4, Landroid/support/v7/internal/view/b$b;->d:I

    invoke-virtual {v5, v6, v7}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v6

    .line 2372
    const/high16 v7, -0x10000

    and-int/2addr v0, v7

    const v7, 0xffff

    and-int/2addr v6, v7

    or-int/2addr v0, v6

    iput v0, v4, Landroid/support/v7/internal/view/b$b;->j:I

    .line 2374
    sget v0, Landroid/support/v7/b/a$i;->MenuItem_android_title:I

    invoke-virtual {v5, v0}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    move-result-object v0

    iput-object v0, v4, Landroid/support/v7/internal/view/b$b;->k:Ljava/lang/CharSequence;

    .line 2375
    sget v0, Landroid/support/v7/b/a$i;->MenuItem_android_titleCondensed:I

    invoke-virtual {v5, v0}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    move-result-object v0

    iput-object v0, v4, Landroid/support/v7/internal/view/b$b;->l:Ljava/lang/CharSequence;

    .line 2376
    sget v0, Landroid/support/v7/b/a$i;->MenuItem_android_icon:I

    const/4 v6, 0x0

    invoke-virtual {v5, v0, v6}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    iput v0, v4, Landroid/support/v7/internal/view/b$b;->m:I

    .line 2377
    sget v0, Landroid/support/v7/b/a$i;->MenuItem_android_alphabeticShortcut:I

    invoke-virtual {v5, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/support/v7/internal/view/b$b;->a(Ljava/lang/String;)C

    move-result v0

    iput-char v0, v4, Landroid/support/v7/internal/view/b$b;->n:C

    .line 2379
    sget v0, Landroid/support/v7/b/a$i;->MenuItem_android_numericShortcut:I

    invoke-virtual {v5, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/support/v7/internal/view/b$b;->a(Ljava/lang/String;)C

    move-result v0

    iput-char v0, v4, Landroid/support/v7/internal/view/b$b;->o:C

    .line 2381
    sget v0, Landroid/support/v7/b/a$i;->MenuItem_android_checkable:I

    invoke-virtual {v5, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 2383
    sget v0, Landroid/support/v7/b/a$i;->MenuItem_android_checkable:I

    const/4 v6, 0x0

    invoke-virtual {v5, v0, v6}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    if-eqz v0, :cond_5

    const/4 v0, 0x1

    :goto_3
    iput v0, v4, Landroid/support/v7/internal/view/b$b;->p:I

    .line 2389
    :goto_4
    sget v0, Landroid/support/v7/b/a$i;->MenuItem_android_checked:I

    const/4 v6, 0x0

    invoke-virtual {v5, v0, v6}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, v4, Landroid/support/v7/internal/view/b$b;->q:Z

    .line 2390
    sget v0, Landroid/support/v7/b/a$i;->MenuItem_android_visible:I

    iget-boolean v6, v4, Landroid/support/v7/internal/view/b$b;->f:Z

    invoke-virtual {v5, v0, v6}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, v4, Landroid/support/v7/internal/view/b$b;->r:Z

    .line 2391
    sget v0, Landroid/support/v7/b/a$i;->MenuItem_android_enabled:I

    iget-boolean v6, v4, Landroid/support/v7/internal/view/b$b;->g:Z

    invoke-virtual {v5, v0, v6}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, v4, Landroid/support/v7/internal/view/b$b;->s:Z

    .line 2392
    sget v0, Landroid/support/v7/b/a$i;->MenuItem_showAsAction:I

    const/4 v6, -0x1

    invoke-virtual {v5, v0, v6}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    iput v0, v4, Landroid/support/v7/internal/view/b$b;->t:I

    .line 2393
    sget v0, Landroid/support/v7/b/a$i;->MenuItem_android_onClick:I

    invoke-virtual {v5, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Landroid/support/v7/internal/view/b$b;->x:Ljava/lang/String;

    .line 2394
    sget v0, Landroid/support/v7/b/a$i;->MenuItem_actionLayout:I

    const/4 v6, 0x0

    invoke-virtual {v5, v0, v6}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    iput v0, v4, Landroid/support/v7/internal/view/b$b;->u:I

    .line 2395
    sget v0, Landroid/support/v7/b/a$i;->MenuItem_actionViewClass:I

    invoke-virtual {v5, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Landroid/support/v7/internal/view/b$b;->v:Ljava/lang/String;

    .line 2396
    sget v0, Landroid/support/v7/b/a$i;->MenuItem_actionProviderClass:I

    invoke-virtual {v5, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Landroid/support/v7/internal/view/b$b;->w:Ljava/lang/String;

    .line 2398
    iget-object v0, v4, Landroid/support/v7/internal/view/b$b;->w:Ljava/lang/String;

    if-eqz v0, :cond_7

    const/4 v0, 0x1

    .line 2399
    :goto_5
    if-eqz v0, :cond_8

    iget v6, v4, Landroid/support/v7/internal/view/b$b;->u:I

    if-nez v6, :cond_8

    iget-object v6, v4, Landroid/support/v7/internal/view/b$b;->v:Ljava/lang/String;

    if-nez v6, :cond_8

    .line 2400
    iget-object v0, v4, Landroid/support/v7/internal/view/b$b;->w:Ljava/lang/String;

    .line 4058
    sget-object v6, Landroid/support/v7/internal/view/b;->b:[Ljava/lang/Class;

    .line 2400
    iget-object v7, v4, Landroid/support/v7/internal/view/b$b;->z:Landroid/support/v7/internal/view/b;

    .line 5058
    iget-object v7, v7, Landroid/support/v7/internal/view/b;->d:[Ljava/lang/Object;

    .line 2400
    invoke-virtual {v4, v0, v6, v7}, Landroid/support/v7/internal/view/b$b;->a(Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/view/d;

    iput-object v0, v4, Landroid/support/v7/internal/view/b$b;->y:Landroid/support/v4/view/d;

    .line 2411
    :goto_6
    invoke-virtual {v5}, Landroid/content/res/TypedArray;->recycle()V

    .line 2413
    const/4 v0, 0x0

    iput-boolean v0, v4, Landroid/support/v7/internal/view/b$b;->h:Z

    move v0, v1

    move-object v1, v2

    move v2, v3

    .line 168
    goto/16 :goto_2

    .line 2383
    :cond_5
    const/4 v0, 0x0

    goto :goto_3

    .line 2387
    :cond_6
    iget v0, v4, Landroid/support/v7/internal/view/b$b;->e:I

    iput v0, v4, Landroid/support/v7/internal/view/b$b;->p:I

    goto :goto_4

    .line 2398
    :cond_7
    const/4 v0, 0x0

    goto :goto_5

    .line 2404
    :cond_8
    if-eqz v0, :cond_9

    .line 2405
    const-string v0, "SupportMenuInflater"

    const-string v6, "Ignoring attribute \'actionProviderClass\'. Action view already specified."

    invoke-static {v0, v6}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 2408
    :cond_9
    const/4 v0, 0x0

    iput-object v0, v4, Landroid/support/v7/internal/view/b$b;->y:Landroid/support/v4/view/d;

    goto :goto_6

    .line 169
    :cond_a
    const-string v5, "menu"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_b

    .line 171
    invoke-virtual {v4}, Landroid/support/v7/internal/view/b$b;->b()Landroid/view/SubMenu;

    move-result-object v0

    .line 174
    invoke-direct {p0, p1, p2, v0}, Landroid/support/v7/internal/view/b;->a(Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/view/Menu;)V

    move v0, v1

    move-object v1, v2

    move v2, v3

    .line 175
    goto/16 :goto_2

    .line 176
    :cond_b
    const/4 v2, 0x1

    move v9, v1

    move-object v1, v0

    move v0, v9

    .line 179
    goto/16 :goto_2

    .line 182
    :pswitch_1
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v0

    .line 183
    if-eqz v3, :cond_c

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_c

    .line 184
    const/4 v2, 0x0

    .line 185
    const/4 v0, 0x0

    move v9, v1

    move-object v1, v0

    move v0, v9

    goto/16 :goto_2

    .line 186
    :cond_c
    const-string v5, "group"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_d

    .line 187
    invoke-virtual {v4}, Landroid/support/v7/internal/view/b$b;->a()V

    move v0, v1

    move-object v1, v2

    move v2, v3

    goto/16 :goto_2

    .line 188
    :cond_d
    const-string v5, "item"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_f

    .line 5490
    iget-boolean v0, v4, Landroid/support/v7/internal/view/b$b;->h:Z

    .line 191
    if-nez v0, :cond_1

    .line 6270
    iget-object v0, v4, Landroid/support/v7/internal/view/b$b;->y:Landroid/support/v4/view/d;

    .line 192
    if-eqz v0, :cond_e

    .line 7270
    iget-object v0, v4, Landroid/support/v7/internal/view/b$b;->y:Landroid/support/v4/view/d;

    .line 192
    invoke-virtual {v0}, Landroid/support/v4/view/d;->e()Z

    move-result v0

    if-eqz v0, :cond_e

    .line 194
    invoke-virtual {v4}, Landroid/support/v7/internal/view/b$b;->b()Landroid/view/SubMenu;

    move v0, v1

    move-object v1, v2

    move v2, v3

    goto/16 :goto_2

    .line 7478
    :cond_e
    const/4 v0, 0x1

    iput-boolean v0, v4, Landroid/support/v7/internal/view/b$b;->h:Z

    .line 7479
    iget-object v0, v4, Landroid/support/v7/internal/view/b$b;->a:Landroid/view/Menu;

    iget v5, v4, Landroid/support/v7/internal/view/b$b;->b:I

    iget v6, v4, Landroid/support/v7/internal/view/b$b;->i:I

    iget v7, v4, Landroid/support/v7/internal/view/b$b;->j:I

    iget-object v8, v4, Landroid/support/v7/internal/view/b$b;->k:Ljava/lang/CharSequence;

    invoke-interface {v0, v5, v6, v7, v8}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/support/v7/internal/view/b$b;->a(Landroid/view/MenuItem;)V

    move v0, v1

    move-object v1, v2

    move v2, v3

    .line 196
    goto/16 :goto_2

    .line 199
    :cond_f
    const-string v5, "menu"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 200
    const/4 v0, 0x1

    move-object v1, v2

    move v2, v3

    goto/16 :goto_2

    .line 205
    :pswitch_2
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Unexpected end of document"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 210
    :cond_10
    return-void

    .line 158
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method static synthetic a()[Ljava/lang/Class;
    .locals 1

    .prologue
    .line 58
    sget-object v0, Landroid/support/v7/internal/view/b;->a:[Ljava/lang/Class;

    return-object v0
.end method

.method static synthetic b(Landroid/support/v7/internal/view/b;)Ljava/lang/Object;
    .locals 2

    .prologue
    .line 58
    .line 8213
    iget-object v0, p0, Landroid/support/v7/internal/view/b;->f:Ljava/lang/Object;

    if-nez v0, :cond_1

    .line 8214
    iget-object v0, p0, Landroid/support/v7/internal/view/b;->e:Landroid/content/Context;

    .line 8220
    :goto_0
    instance-of v1, v0, Landroid/app/Activity;

    if-nez v1, :cond_0

    .line 8223
    instance-of v1, v0, Landroid/content/ContextWrapper;

    if-eqz v1, :cond_0

    .line 8224
    check-cast v0, Landroid/content/ContextWrapper;

    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    goto :goto_0

    .line 8214
    :cond_0
    iput-object v0, p0, Landroid/support/v7/internal/view/b;->f:Ljava/lang/Object;

    .line 8216
    :cond_1
    iget-object v0, p0, Landroid/support/v7/internal/view/b;->f:Ljava/lang/Object;

    .line 58
    return-object v0
.end method

.method static synthetic c(Landroid/support/v7/internal/view/b;)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 58
    iget-object v0, p0, Landroid/support/v7/internal/view/b;->c:[Ljava/lang/Object;

    return-object v0
.end method


# virtual methods
.method public final inflate(ILandroid/view/Menu;)V
    .locals 4

    .prologue
    .line 108
    instance-of v0, p2, Landroid/support/v4/b/a/a;

    if-nez v0, :cond_1

    .line 109
    invoke-super {p0, p1, p2}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 126
    :cond_0
    :goto_0
    return-void

    .line 113
    :cond_1
    const/4 v1, 0x0

    .line 115
    :try_start_0
    iget-object v0, p0, Landroid/support/v7/internal/view/b;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getLayout(I)Landroid/content/res/XmlResourceParser;

    move-result-object v1

    .line 116
    invoke-static {v1}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    move-result-object v0

    .line 118
    invoke-direct {p0, v1, v0, p2}, Landroid/support/v7/internal/view/b;->a(Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/view/Menu;)V
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 124
    if-eqz v1, :cond_0

    invoke-interface {v1}, Landroid/content/res/XmlResourceParser;->close()V

    goto :goto_0

    .line 119
    :catch_0
    move-exception v0

    .line 120
    :try_start_1
    new-instance v2, Landroid/view/InflateException;

    const-string v3, "Error inflating menu XML"

    invoke-direct {v2, v3, v0}, Landroid/view/InflateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 124
    :catchall_0
    move-exception v0

    if-eqz v1, :cond_2

    invoke-interface {v1}, Landroid/content/res/XmlResourceParser;->close()V

    :cond_2
    throw v0

    .line 121
    :catch_1
    move-exception v0

    .line 122
    :try_start_2
    new-instance v2, Landroid/view/InflateException;

    const-string v3, "Error inflating menu XML"

    invoke-direct {v2, v3, v0}, Landroid/view/InflateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0
.end method
