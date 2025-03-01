.class public Landroid/support/v7/internal/widget/o;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v7/internal/widget/o$a;
    }
.end annotation


# static fields
.field static final a:Landroid/graphics/PorterDuff$Mode;

.field private static final b:Ljava/lang/String;

.field private static final c:Landroid/support/v7/internal/widget/o$a;

.field private static final d:[I

.field private static final e:[I

.field private static final f:[I

.field private static final g:[I

.field private static final h:[I


# instance fields
.field private final i:Landroid/content/Context;

.field private final j:Landroid/content/res/Resources;

.field private final k:Landroid/util/TypedValue;

.field private l:Landroid/content/res/ColorStateList;

.field private m:Landroid/content/res/ColorStateList;

.field private n:Landroid/content/res/ColorStateList;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .prologue
    const/4 v7, 0x4

    const/4 v6, 0x3

    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 37
    const-class v0, Landroid/support/v7/internal/widget/o;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Landroid/support/v7/internal/widget/o;->b:Ljava/lang/String;

    .line 40
    sget-object v0, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    sput-object v0, Landroid/support/v7/internal/widget/o;->a:Landroid/graphics/PorterDuff$Mode;

    .line 42
    new-instance v0, Landroid/support/v7/internal/widget/o$a;

    invoke-direct {v0}, Landroid/support/v7/internal/widget/o$a;-><init>()V

    sput-object v0, Landroid/support/v7/internal/widget/o;->c:Landroid/support/v7/internal/widget/o$a;

    .line 48
    const/16 v0, 0xe

    new-array v0, v0, [I

    sget v1, Landroid/support/v7/b/a$d;->abc_ic_ab_back_mtrl_am_alpha:I

    aput v1, v0, v3

    sget v1, Landroid/support/v7/b/a$d;->abc_ic_go_search_api_mtrl_alpha:I

    aput v1, v0, v4

    sget v1, Landroid/support/v7/b/a$d;->abc_ic_search_api_mtrl_alpha:I

    aput v1, v0, v5

    sget v1, Landroid/support/v7/b/a$d;->abc_ic_commit_search_api_mtrl_alpha:I

    aput v1, v0, v6

    sget v1, Landroid/support/v7/b/a$d;->abc_ic_clear_mtrl_alpha:I

    aput v1, v0, v7

    const/4 v1, 0x5

    sget v2, Landroid/support/v7/b/a$d;->abc_ic_menu_share_mtrl_alpha:I

    aput v2, v0, v1

    const/4 v1, 0x6

    sget v2, Landroid/support/v7/b/a$d;->abc_ic_menu_copy_mtrl_am_alpha:I

    aput v2, v0, v1

    const/4 v1, 0x7

    sget v2, Landroid/support/v7/b/a$d;->abc_ic_menu_cut_mtrl_alpha:I

    aput v2, v0, v1

    const/16 v1, 0x8

    sget v2, Landroid/support/v7/b/a$d;->abc_ic_menu_selectall_mtrl_alpha:I

    aput v2, v0, v1

    const/16 v1, 0x9

    sget v2, Landroid/support/v7/b/a$d;->abc_ic_menu_paste_mtrl_am_alpha:I

    aput v2, v0, v1

    const/16 v1, 0xa

    sget v2, Landroid/support/v7/b/a$d;->abc_ic_menu_moreoverflow_mtrl_alpha:I

    aput v2, v0, v1

    const/16 v1, 0xb

    sget v2, Landroid/support/v7/b/a$d;->abc_ic_voice_search_api_mtrl_alpha:I

    aput v2, v0, v1

    const/16 v1, 0xc

    sget v2, Landroid/support/v7/b/a$d;->abc_textfield_search_default_mtrl_alpha:I

    aput v2, v0, v1

    const/16 v1, 0xd

    sget v2, Landroid/support/v7/b/a$d;->abc_textfield_default_mtrl_alpha:I

    aput v2, v0, v1

    sput-object v0, Landroid/support/v7/internal/widget/o;->d:[I

    .line 69
    new-array v0, v6, [I

    sget v1, Landroid/support/v7/b/a$d;->abc_textfield_activated_mtrl_alpha:I

    aput v1, v0, v3

    sget v1, Landroid/support/v7/b/a$d;->abc_textfield_search_activated_mtrl_alpha:I

    aput v1, v0, v4

    sget v1, Landroid/support/v7/b/a$d;->abc_cab_background_top_mtrl_alpha:I

    aput v1, v0, v5

    sput-object v0, Landroid/support/v7/internal/widget/o;->e:[I

    .line 79
    new-array v0, v6, [I

    sget v1, Landroid/support/v7/b/a$d;->abc_popup_background_mtrl_mult:I

    aput v1, v0, v3

    sget v1, Landroid/support/v7/b/a$d;->abc_cab_background_internal_bg:I

    aput v1, v0, v4

    sget v1, Landroid/support/v7/b/a$d;->abc_menu_hardkey_panel_mtrl_mult:I

    aput v1, v0, v5

    sput-object v0, Landroid/support/v7/internal/widget/o;->f:[I

    .line 89
    const/4 v0, 0x6

    new-array v0, v0, [I

    sget v1, Landroid/support/v7/b/a$d;->abc_edit_text_material:I

    aput v1, v0, v3

    sget v1, Landroid/support/v7/b/a$d;->abc_tab_indicator_material:I

    aput v1, v0, v4

    sget v1, Landroid/support/v7/b/a$d;->abc_textfield_search_material:I

    aput v1, v0, v5

    sget v1, Landroid/support/v7/b/a$d;->abc_spinner_mtrl_am_alpha:I

    aput v1, v0, v6

    sget v1, Landroid/support/v7/b/a$d;->abc_btn_check_material:I

    aput v1, v0, v7

    const/4 v1, 0x5

    sget v2, Landroid/support/v7/b/a$d;->abc_btn_radio_material:I

    aput v2, v0, v1

    sput-object v0, Landroid/support/v7/internal/widget/o;->g:[I

    .line 102
    new-array v0, v4, [I

    sget v1, Landroid/support/v7/b/a$d;->abc_cab_background_top_material:I

    aput v1, v0, v3

    sput-object v0, Landroid/support/v7/internal/widget/o;->h:[I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 126
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 127
    iput-object p1, p0, Landroid/support/v7/internal/widget/o;->i:Landroid/content/Context;

    .line 128
    new-instance v0, Landroid/support/v7/internal/widget/p;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Landroid/support/v7/internal/widget/p;-><init>(Landroid/content/res/Resources;Landroid/support/v7/internal/widget/o;)V

    iput-object v0, p0, Landroid/support/v7/internal/widget/o;->j:Landroid/content/res/Resources;

    .line 129
    new-instance v0, Landroid/util/TypedValue;

    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    iput-object v0, p0, Landroid/support/v7/internal/widget/o;->k:Landroid/util/TypedValue;

    .line 130
    return-void
.end method

.method private a(IF)I
    .locals 3

    .prologue
    .line 332
    invoke-direct {p0, p1}, Landroid/support/v7/internal/widget/o;->b(I)I

    move-result v0

    .line 333
    invoke-static {v0}, Landroid/graphics/Color;->alpha(I)I

    move-result v1

    .line 336
    const v2, 0xffffff

    and-int/2addr v0, v2

    int-to-float v1, v1

    mul-float/2addr v1, p2

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    shl-int/lit8 v1, v1, 0x18

    or-int/2addr v0, v1

    return v0
.end method

.method public static a(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    .locals 1

    .prologue
    .line 119
    .line 1213
    sget-object v0, Landroid/support/v7/internal/widget/o;->f:[I

    invoke-static {v0, p1}, Landroid/support/v7/internal/widget/o;->a([II)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Landroid/support/v7/internal/widget/o;->d:[I

    invoke-static {v0, p1}, Landroid/support/v7/internal/widget/o;->a([II)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Landroid/support/v7/internal/widget/o;->e:[I

    invoke-static {v0, p1}, Landroid/support/v7/internal/widget/o;->a([II)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Landroid/support/v7/internal/widget/o;->g:[I

    invoke-static {v0, p1}, Landroid/support/v7/internal/widget/o;->a([II)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Landroid/support/v7/internal/widget/o;->h:[I

    invoke-static {v0, p1}, Landroid/support/v7/internal/widget/o;->a([II)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    .line 119
    :goto_0
    if-eqz v0, :cond_2

    .line 120
    new-instance v0, Landroid/support/v7/internal/widget/o;

    invoke-direct {v0, p0}, Landroid/support/v7/internal/widget/o;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, p1}, Landroid/support/v7/internal/widget/o;->a(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 122
    :goto_1
    return-object v0

    .line 1213
    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    .line 122
    :cond_2
    invoke-static {p0, p1}, Landroid/support/v4/content/a;->a(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    goto :goto_1
.end method

.method private static a([II)Z
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 204
    array-length v2, p0

    move v1, v0

    :goto_0
    if-ge v1, v2, :cond_0

    aget v3, p0, v1

    .line 205
    if-ne v3, p1, :cond_1

    .line 206
    const/4 v0, 0x1

    .line 209
    :cond_0
    return v0

    .line 204
    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0
.end method

.method private b(I)I
    .locals 3

    .prologue
    .line 320
    iget-object v0, p0, Landroid/support/v7/internal/widget/o;->i:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    iget-object v1, p0, Landroid/support/v7/internal/widget/o;->k:Landroid/util/TypedValue;

    const/4 v2, 0x1

    invoke-virtual {v0, p1, v1, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 321
    iget-object v0, p0, Landroid/support/v7/internal/widget/o;->k:Landroid/util/TypedValue;

    iget v0, v0, Landroid/util/TypedValue;->type:I

    const/16 v1, 0x10

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Landroid/support/v7/internal/widget/o;->k:Landroid/util/TypedValue;

    iget v0, v0, Landroid/util/TypedValue;->type:I

    const/16 v1, 0x1f

    if-gt v0, v1, :cond_0

    .line 323
    iget-object v0, p0, Landroid/support/v7/internal/widget/o;->k:Landroid/util/TypedValue;

    iget v0, v0, Landroid/util/TypedValue;->data:I

    .line 328
    :goto_0
    return v0

    .line 324
    :cond_0
    iget-object v0, p0, Landroid/support/v7/internal/widget/o;->k:Landroid/util/TypedValue;

    iget v0, v0, Landroid/util/TypedValue;->type:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    .line 325
    iget-object v0, p0, Landroid/support/v7/internal/widget/o;->j:Landroid/content/res/Resources;

    iget-object v1, p0, Landroid/support/v7/internal/widget/o;->k:Landroid/util/TypedValue;

    iget v1, v1, Landroid/util/TypedValue;->resourceId:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    goto :goto_0

    .line 328
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private c(I)I
    .locals 4

    .prologue
    .line 341
    iget-object v0, p0, Landroid/support/v7/internal/widget/o;->i:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    const v1, 0x1010033

    iget-object v2, p0, Landroid/support/v7/internal/widget/o;->k:Landroid/util/TypedValue;

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 342
    iget-object v0, p0, Landroid/support/v7/internal/widget/o;->k:Landroid/util/TypedValue;

    invoke-virtual {v0}, Landroid/util/TypedValue;->getFloat()F

    move-result v0

    .line 344
    invoke-direct {p0, p1, v0}, Landroid/support/v7/internal/widget/o;->a(IF)I

    move-result v0

    return v0
.end method


# virtual methods
.method public final a(I)Landroid/graphics/drawable/Drawable;
    .locals 12

    .prologue
    const v7, -0x101009e

    const/4 v11, 0x3

    const/4 v8, 0x2

    const/4 v10, 0x1

    const/4 v9, 0x0

    .line 133
    iget-object v0, p0, Landroid/support/v7/internal/widget/o;->i:Landroid/content/Context;

    invoke-static {v0, p1}, Landroid/support/v4/content/a;->a(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 135
    if-eqz v1, :cond_7

    .line 136
    sget-object v0, Landroid/support/v7/internal/widget/o;->g:[I

    invoke-static {v0, p1}, Landroid/support/v7/internal/widget/o;->a([II)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 137
    new-instance v0, Landroid/support/v7/internal/widget/n;

    .line 1221
    iget-object v2, p0, Landroid/support/v7/internal/widget/o;->l:Landroid/content/res/ColorStateList;

    if-nez v2, :cond_0

    .line 1227
    sget v2, Landroid/support/v7/b/a$a;->colorControlNormal:I

    invoke-direct {p0, v2}, Landroid/support/v7/internal/widget/o;->b(I)I

    move-result v2

    .line 1228
    sget v3, Landroid/support/v7/b/a$a;->colorControlActivated:I

    invoke-direct {p0, v3}, Landroid/support/v7/internal/widget/o;->b(I)I

    move-result v3

    .line 1230
    const/4 v4, 0x7

    new-array v4, v4, [[I

    .line 1231
    const/4 v5, 0x7

    new-array v5, v5, [I

    .line 1235
    new-array v6, v10, [I

    aput v7, v6, v9

    aput-object v6, v4, v9

    .line 1236
    sget v6, Landroid/support/v7/b/a$a;->colorControlNormal:I

    invoke-direct {p0, v6}, Landroid/support/v7/internal/widget/o;->c(I)I

    move-result v6

    aput v6, v5, v9

    .line 1239
    new-array v6, v10, [I

    const v7, 0x101009c

    aput v7, v6, v9

    aput-object v6, v4, v10

    .line 1240
    aput v3, v5, v10

    .line 1243
    new-array v6, v10, [I

    const v7, 0x10102fe

    aput v7, v6, v9

    aput-object v6, v4, v8

    .line 1244
    aput v3, v5, v8

    .line 1247
    new-array v6, v10, [I

    const v7, 0x10100a7

    aput v7, v6, v9

    aput-object v6, v4, v11

    .line 1248
    aput v3, v5, v11

    .line 1251
    const/4 v6, 0x4

    new-array v7, v10, [I

    const v8, 0x10100a0

    aput v8, v7, v9

    aput-object v7, v4, v6

    .line 1252
    const/4 v6, 0x4

    aput v3, v5, v6

    .line 1255
    const/4 v6, 0x5

    new-array v7, v10, [I

    const v8, 0x10100a1

    aput v8, v7, v9

    aput-object v7, v4, v6

    .line 1256
    const/4 v6, 0x5

    aput v3, v5, v6

    .line 1260
    const/4 v3, 0x6

    new-array v6, v9, [I

    aput-object v6, v4, v3

    .line 1261
    const/4 v3, 0x6

    aput v2, v5, v3

    .line 1264
    new-instance v2, Landroid/content/res/ColorStateList;

    invoke-direct {v2, v4, v5}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    iput-object v2, p0, Landroid/support/v7/internal/widget/o;->l:Landroid/content/res/ColorStateList;

    .line 1266
    :cond_0
    iget-object v2, p0, Landroid/support/v7/internal/widget/o;->l:Landroid/content/res/ColorStateList;

    .line 137
    invoke-direct {v0, v1, v2}, Landroid/support/v7/internal/widget/n;-><init>(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V

    .line 149
    :goto_0
    return-object v0

    .line 138
    :cond_1
    sget v0, Landroid/support/v7/b/a$d;->abc_switch_track_mtrl_alpha:I

    if-ne p1, v0, :cond_3

    .line 139
    new-instance v0, Landroid/support/v7/internal/widget/n;

    .line 1270
    iget-object v2, p0, Landroid/support/v7/internal/widget/o;->n:Landroid/content/res/ColorStateList;

    if-nez v2, :cond_2

    .line 1271
    new-array v2, v11, [[I

    .line 1272
    new-array v3, v11, [I

    .line 1276
    new-array v4, v10, [I

    aput v7, v4, v9

    aput-object v4, v2, v9

    .line 1277
    const v4, 0x1010030

    const v5, 0x3dcccccd    # 0.1f

    invoke-direct {p0, v4, v5}, Landroid/support/v7/internal/widget/o;->a(IF)I

    move-result v4

    aput v4, v3, v9

    .line 1280
    new-array v4, v10, [I

    const v5, 0x10100a0

    aput v5, v4, v9

    aput-object v4, v2, v10

    .line 1281
    sget v4, Landroid/support/v7/b/a$a;->colorControlActivated:I

    const v5, 0x3e99999a    # 0.3f

    invoke-direct {p0, v4, v5}, Landroid/support/v7/internal/widget/o;->a(IF)I

    move-result v4

    aput v4, v3, v10

    .line 1285
    new-array v4, v9, [I

    aput-object v4, v2, v8

    .line 1286
    const v4, 0x1010030

    const v5, 0x3e99999a    # 0.3f

    invoke-direct {p0, v4, v5}, Landroid/support/v7/internal/widget/o;->a(IF)I

    move-result v4

    aput v4, v3, v8

    .line 1289
    new-instance v4, Landroid/content/res/ColorStateList;

    invoke-direct {v4, v2, v3}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    iput-object v4, p0, Landroid/support/v7/internal/widget/o;->n:Landroid/content/res/ColorStateList;

    .line 1291
    :cond_2
    iget-object v2, p0, Landroid/support/v7/internal/widget/o;->n:Landroid/content/res/ColorStateList;

    .line 139
    invoke-direct {v0, v1, v2}, Landroid/support/v7/internal/widget/n;-><init>(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V

    goto :goto_0

    .line 140
    :cond_3
    sget v0, Landroid/support/v7/b/a$d;->abc_switch_thumb_material:I

    if-ne p1, v0, :cond_5

    .line 141
    new-instance v0, Landroid/support/v7/internal/widget/n;

    .line 1295
    iget-object v2, p0, Landroid/support/v7/internal/widget/o;->m:Landroid/content/res/ColorStateList;

    if-nez v2, :cond_4

    .line 1296
    new-array v2, v11, [[I

    .line 1297
    new-array v3, v11, [I

    .line 1301
    new-array v4, v10, [I

    aput v7, v4, v9

    aput-object v4, v2, v9

    .line 1302
    sget v4, Landroid/support/v7/b/a$a;->colorSwitchThumbNormal:I

    invoke-direct {p0, v4}, Landroid/support/v7/internal/widget/o;->c(I)I

    move-result v4

    aput v4, v3, v9

    .line 1305
    new-array v4, v10, [I

    const v5, 0x10100a0

    aput v5, v4, v9

    aput-object v4, v2, v10

    .line 1306
    sget v4, Landroid/support/v7/b/a$a;->colorControlActivated:I

    invoke-direct {p0, v4}, Landroid/support/v7/internal/widget/o;->b(I)I

    move-result v4

    aput v4, v3, v10

    .line 1310
    new-array v4, v9, [I

    aput-object v4, v2, v8

    .line 1311
    sget v4, Landroid/support/v7/b/a$a;->colorSwitchThumbNormal:I

    invoke-direct {p0, v4}, Landroid/support/v7/internal/widget/o;->b(I)I

    move-result v4

    aput v4, v3, v8

    .line 1314
    new-instance v4, Landroid/content/res/ColorStateList;

    invoke-direct {v4, v2, v3}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    iput-object v4, p0, Landroid/support/v7/internal/widget/o;->m:Landroid/content/res/ColorStateList;

    .line 1316
    :cond_4
    iget-object v2, p0, Landroid/support/v7/internal/widget/o;->m:Landroid/content/res/ColorStateList;

    .line 141
    sget-object v3, Landroid/graphics/PorterDuff$Mode;->MULTIPLY:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v0, v1, v2, v3}, Landroid/support/v7/internal/widget/n;-><init>(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)V

    goto/16 :goto_0

    .line 143
    :cond_5
    sget-object v0, Landroid/support/v7/internal/widget/o;->h:[I

    invoke-static {v0, p1}, Landroid/support/v7/internal/widget/o;->a([II)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 144
    iget-object v0, p0, Landroid/support/v7/internal/widget/o;->j:Landroid/content/res/Resources;

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    goto/16 :goto_0

    .line 146
    :cond_6
    invoke-virtual {p0, p1, v1}, Landroid/support/v7/internal/widget/o;->a(ILandroid/graphics/drawable/Drawable;)V

    :cond_7
    move-object v0, v1

    goto/16 :goto_0
.end method

.method final a(ILandroid/graphics/drawable/Drawable;)V
    .locals 7

    .prologue
    const/4 v0, 0x0

    const/4 v3, -0x1

    const/4 v2, 0x1

    .line 153
    const/4 v4, 0x0

    .line 158
    sget-object v1, Landroid/support/v7/internal/widget/o;->d:[I

    invoke-static {v1, p1}, Landroid/support/v7/internal/widget/o;->a([II)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 159
    sget v0, Landroid/support/v7/b/a$a;->colorControlNormal:I

    move v1, v2

    move v2, v3

    move v6, v0

    move-object v0, v4

    move v4, v6

    .line 174
    :goto_0
    if-eqz v1, :cond_1

    .line 175
    if-nez v0, :cond_5

    .line 176
    sget-object v0, Landroid/support/v7/internal/widget/o;->a:Landroid/graphics/PorterDuff$Mode;

    move-object v1, v0

    .line 178
    :goto_1
    invoke-direct {p0, v4}, Landroid/support/v7/internal/widget/o;->b(I)I

    move-result v4

    .line 181
    sget-object v0, Landroid/support/v7/internal/widget/o;->c:Landroid/support/v7/internal/widget/o$a;

    .line 1354
    invoke-static {v4, v1}, Landroid/support/v7/internal/widget/o$a;->a(ILandroid/graphics/PorterDuff$Mode;)I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v0, v5}, Landroid/support/v7/internal/widget/o$a;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/PorterDuffColorFilter;

    .line 183
    if-nez v0, :cond_0

    .line 185
    new-instance v0, Landroid/graphics/PorterDuffColorFilter;

    invoke-direct {v0, v4, v1}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    .line 186
    sget-object v5, Landroid/support/v7/internal/widget/o;->c:Landroid/support/v7/internal/widget/o$a;

    .line 1358
    invoke-static {v4, v1}, Landroid/support/v7/internal/widget/o$a;->a(ILandroid/graphics/PorterDuff$Mode;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v5, v1, v0}, Landroid/support/v7/internal/widget/o$a;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 190
    :cond_0
    invoke-virtual {p2, v0}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 192
    if-eq v2, v3, :cond_1

    .line 193
    invoke-virtual {p2, v2}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 201
    :cond_1
    return-void

    .line 161
    :cond_2
    sget-object v1, Landroid/support/v7/internal/widget/o;->e:[I

    invoke-static {v1, p1}, Landroid/support/v7/internal/widget/o;->a([II)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 162
    sget v0, Landroid/support/v7/b/a$a;->colorControlActivated:I

    move v1, v2

    move v2, v3

    move v6, v0

    move-object v0, v4

    move v4, v6

    .line 163
    goto :goto_0

    .line 164
    :cond_3
    sget-object v1, Landroid/support/v7/internal/widget/o;->f:[I

    invoke-static {v1, p1}, Landroid/support/v7/internal/widget/o;->a([II)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 165
    const v0, 0x1010031

    .line 167
    sget-object v1, Landroid/graphics/PorterDuff$Mode;->MULTIPLY:Landroid/graphics/PorterDuff$Mode;

    move v4, v0

    move-object v0, v1

    move v1, v2

    move v2, v3

    goto :goto_0

    .line 168
    :cond_4
    sget v1, Landroid/support/v7/b/a$d;->abc_list_divider_mtrl_alpha:I

    if-ne p1, v1, :cond_6

    .line 169
    const v1, 0x1010030

    .line 171
    const v0, 0x42233333    # 40.8f

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    move v6, v0

    move-object v0, v4

    move v4, v1

    move v1, v2

    move v2, v6

    goto :goto_0

    :cond_5
    move-object v1, v0

    goto :goto_1

    :cond_6
    move v2, v3

    move v1, v0

    move v6, v0

    move-object v0, v4

    move v4, v6

    goto :goto_0
.end method
