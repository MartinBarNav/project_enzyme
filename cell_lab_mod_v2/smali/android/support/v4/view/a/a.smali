.class public final Landroid/support/v4/view/a/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/view/a/a$a;,
        Landroid/support/v4/view/a/a$f;,
        Landroid/support/v4/view/a/a$e;,
        Landroid/support/v4/view/a/a$d;,
        Landroid/support/v4/view/a/a$b;,
        Landroid/support/v4/view/a/a$g;,
        Landroid/support/v4/view/a/a$c;
    }
.end annotation


# static fields
.field public static final a:Landroid/support/v4/view/a/a$c;


# instance fields
.field public final b:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 1123
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    .line 1124
    new-instance v0, Landroid/support/v4/view/a/a$a;

    invoke-direct {v0}, Landroid/support/v4/view/a/a$a;-><init>()V

    sput-object v0, Landroid/support/v4/view/a/a;->a:Landroid/support/v4/view/a/a$c;

    .line 1136
    :goto_0
    return-void

    .line 1125
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x13

    if-lt v0, v1, :cond_1

    .line 1126
    new-instance v0, Landroid/support/v4/view/a/a$f;

    invoke-direct {v0}, Landroid/support/v4/view/a/a$f;-><init>()V

    sput-object v0, Landroid/support/v4/view/a/a;->a:Landroid/support/v4/view/a/a$c;

    goto :goto_0

    .line 1127
    :cond_1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x12

    if-lt v0, v1, :cond_2

    .line 1128
    new-instance v0, Landroid/support/v4/view/a/a$e;

    invoke-direct {v0}, Landroid/support/v4/view/a/a$e;-><init>()V

    sput-object v0, Landroid/support/v4/view/a/a;->a:Landroid/support/v4/view/a/a$c;

    goto :goto_0

    .line 1129
    :cond_2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-lt v0, v1, :cond_3

    .line 1130
    new-instance v0, Landroid/support/v4/view/a/a$d;

    invoke-direct {v0}, Landroid/support/v4/view/a/a$d;-><init>()V

    sput-object v0, Landroid/support/v4/view/a/a;->a:Landroid/support/v4/view/a/a$c;

    goto :goto_0

    .line 1131
    :cond_3
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xe

    if-lt v0, v1, :cond_4

    .line 1132
    new-instance v0, Landroid/support/v4/view/a/a$b;

    invoke-direct {v0}, Landroid/support/v4/view/a/a$b;-><init>()V

    sput-object v0, Landroid/support/v4/view/a/a;->a:Landroid/support/v4/view/a/a$c;

    goto :goto_0

    .line 1134
    :cond_4
    new-instance v0, Landroid/support/v4/view/a/a$g;

    invoke-direct {v0}, Landroid/support/v4/view/a/a$g;-><init>()V

    sput-object v0, Landroid/support/v4/view/a/a;->a:Landroid/support/v4/view/a/a$c;

    goto :goto_0
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 1477
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1478
    iput-object p1, p0, Landroid/support/v4/view/a/a;->b:Ljava/lang/Object;

    .line 1479
    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 2

    .prologue
    .line 1692
    sget-object v0, Landroid/support/v4/view/a/a;->a:Landroid/support/v4/view/a/a$c;

    iget-object v1, p0, Landroid/support/v4/view/a/a;->b:Ljava/lang/Object;

    invoke-interface {v0, v1, p1}, Landroid/support/v4/view/a/a$c;->a(Ljava/lang/Object;I)V

    .line 1693
    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 2410
    if-ne p0, p1, :cond_1

    .line 2427
    :cond_0
    :goto_0
    return v0

    .line 2413
    :cond_1
    if-nez p1, :cond_2

    move v0, v1

    .line 2414
    goto :goto_0

    .line 2416
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_3

    move v0, v1

    .line 2417
    goto :goto_0

    .line 2419
    :cond_3
    check-cast p1, Landroid/support/v4/view/a/a;

    .line 2420
    iget-object v2, p0, Landroid/support/v4/view/a/a;->b:Ljava/lang/Object;

    if-nez v2, :cond_4

    .line 2421
    iget-object v2, p1, Landroid/support/v4/view/a/a;->b:Ljava/lang/Object;

    if-eqz v2, :cond_0

    move v0, v1

    .line 2422
    goto :goto_0

    .line 2424
    :cond_4
    iget-object v2, p0, Landroid/support/v4/view/a/a;->b:Ljava/lang/Object;

    iget-object v3, p1, Landroid/support/v4/view/a/a;->b:Ljava/lang/Object;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    move v0, v1

    .line 2425
    goto :goto_0
.end method

.method public final hashCode()I
    .locals 1

    .prologue
    .line 2405
    iget-object v0, p0, Landroid/support/v4/view/a/a;->b:Ljava/lang/Object;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Landroid/support/v4/view/a/a;->b:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    goto :goto_0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .prologue
    .line 2432
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 2433
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2435
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 2835
    sget-object v1, Landroid/support/v4/view/a/a;->a:Landroid/support/v4/view/a/a$c;

    iget-object v3, p0, Landroid/support/v4/view/a/a;->b:Ljava/lang/Object;

    invoke-interface {v1, v3, v0}, Landroid/support/v4/view/a/a$c;->a(Ljava/lang/Object;Landroid/graphics/Rect;)V

    .line 2438
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "; boundsInParent: "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2859
    sget-object v1, Landroid/support/v4/view/a/a;->a:Landroid/support/v4/view/a/a$c;

    iget-object v3, p0, Landroid/support/v4/view/a/a;->b:Ljava/lang/Object;

    invoke-interface {v1, v3, v0}, Landroid/support/v4/view/a/a$c;->b(Ljava/lang/Object;Landroid/graphics/Rect;)V

    .line 2441
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "; boundsInScreen: "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2443
    const-string v0, "; packageName: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 3173
    sget-object v1, Landroid/support/v4/view/a/a;->a:Landroid/support/v4/view/a/a$c;

    iget-object v3, p0, Landroid/support/v4/view/a/a;->b:Ljava/lang/Object;

    invoke-interface {v1, v3}, Landroid/support/v4/view/a/a$c;->d(Ljava/lang/Object;)Ljava/lang/CharSequence;

    move-result-object v1

    .line 2443
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 2444
    const-string v0, "; className: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 3197
    sget-object v1, Landroid/support/v4/view/a/a;->a:Landroid/support/v4/view/a/a$c;

    iget-object v3, p0, Landroid/support/v4/view/a/a;->b:Ljava/lang/Object;

    invoke-interface {v1, v3}, Landroid/support/v4/view/a/a$c;->b(Ljava/lang/Object;)Ljava/lang/CharSequence;

    move-result-object v1

    .line 2444
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 2445
    const-string v0, "; text: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 3221
    sget-object v1, Landroid/support/v4/view/a/a;->a:Landroid/support/v4/view/a/a$c;

    iget-object v3, p0, Landroid/support/v4/view/a/a;->b:Ljava/lang/Object;

    invoke-interface {v1, v3}, Landroid/support/v4/view/a/a$c;->e(Ljava/lang/Object;)Ljava/lang/CharSequence;

    move-result-object v1

    .line 2445
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 2446
    const-string v0, "; contentDescription: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 3245
    sget-object v1, Landroid/support/v4/view/a/a;->a:Landroid/support/v4/view/a/a$c;

    iget-object v3, p0, Landroid/support/v4/view/a/a;->b:Ljava/lang/Object;

    invoke-interface {v1, v3}, Landroid/support/v4/view/a/a$c;->c(Ljava/lang/Object;)Ljava/lang/CharSequence;

    move-result-object v1

    .line 2446
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 2447
    const-string v0, "; viewId: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 3302
    sget-object v1, Landroid/support/v4/view/a/a;->a:Landroid/support/v4/view/a/a$c;

    iget-object v3, p0, Landroid/support/v4/view/a/a;->b:Ljava/lang/Object;

    invoke-interface {v1, v3}, Landroid/support/v4/view/a/a$c;->p(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 2447
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2449
    const-string v0, "; checkable: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 3883
    sget-object v1, Landroid/support/v4/view/a/a;->a:Landroid/support/v4/view/a/a$c;

    iget-object v3, p0, Landroid/support/v4/view/a/a;->b:Ljava/lang/Object;

    invoke-interface {v1, v3}, Landroid/support/v4/view/a/a$c;->f(Ljava/lang/Object;)Z

    move-result v1

    .line 2449
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 2450
    const-string v0, "; checked: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 3907
    sget-object v1, Landroid/support/v4/view/a/a;->a:Landroid/support/v4/view/a/a$c;

    iget-object v3, p0, Landroid/support/v4/view/a/a;->b:Ljava/lang/Object;

    invoke-interface {v1, v3}, Landroid/support/v4/view/a/a$c;->g(Ljava/lang/Object;)Z

    move-result v1

    .line 2450
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 2451
    const-string v0, "; focusable: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 3931
    sget-object v1, Landroid/support/v4/view/a/a;->a:Landroid/support/v4/view/a/a$c;

    iget-object v3, p0, Landroid/support/v4/view/a/a;->b:Ljava/lang/Object;

    invoke-interface {v1, v3}, Landroid/support/v4/view/a/a$c;->j(Ljava/lang/Object;)Z

    move-result v1

    .line 2451
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 2452
    const-string v0, "; focused: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 3955
    sget-object v1, Landroid/support/v4/view/a/a;->a:Landroid/support/v4/view/a/a$c;

    iget-object v3, p0, Landroid/support/v4/view/a/a;->b:Ljava/lang/Object;

    invoke-interface {v1, v3}, Landroid/support/v4/view/a/a$c;->k(Ljava/lang/Object;)Z

    move-result v1

    .line 2452
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 2453
    const-string v0, "; selected: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 4029
    sget-object v1, Landroid/support/v4/view/a/a;->a:Landroid/support/v4/view/a/a$c;

    iget-object v3, p0, Landroid/support/v4/view/a/a;->b:Ljava/lang/Object;

    invoke-interface {v1, v3}, Landroid/support/v4/view/a/a$c;->o(Ljava/lang/Object;)Z

    move-result v1

    .line 2453
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 2454
    const-string v0, "; clickable: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 4053
    sget-object v1, Landroid/support/v4/view/a/a;->a:Landroid/support/v4/view/a/a$c;

    iget-object v3, p0, Landroid/support/v4/view/a/a;->b:Ljava/lang/Object;

    invoke-interface {v1, v3}, Landroid/support/v4/view/a/a$c;->h(Ljava/lang/Object;)Z

    move-result v1

    .line 2454
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 2455
    const-string v0, "; longClickable: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 4077
    sget-object v1, Landroid/support/v4/view/a/a;->a:Landroid/support/v4/view/a/a$c;

    iget-object v3, p0, Landroid/support/v4/view/a/a;->b:Ljava/lang/Object;

    invoke-interface {v1, v3}, Landroid/support/v4/view/a/a$c;->l(Ljava/lang/Object;)Z

    move-result v1

    .line 2455
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 2456
    const-string v0, "; enabled: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 4101
    sget-object v1, Landroid/support/v4/view/a/a;->a:Landroid/support/v4/view/a/a$c;

    iget-object v3, p0, Landroid/support/v4/view/a/a;->b:Ljava/lang/Object;

    invoke-interface {v1, v3}, Landroid/support/v4/view/a/a$c;->i(Ljava/lang/Object;)Z

    move-result v1

    .line 2456
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 2457
    const-string v0, "; password: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 4125
    sget-object v1, Landroid/support/v4/view/a/a;->a:Landroid/support/v4/view/a/a$c;

    iget-object v3, p0, Landroid/support/v4/view/a/a;->b:Ljava/lang/Object;

    invoke-interface {v1, v3}, Landroid/support/v4/view/a/a$c;->m(Ljava/lang/Object;)Z

    move-result v1

    .line 2457
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 2458
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "; scrollable: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 4149
    sget-object v1, Landroid/support/v4/view/a/a;->a:Landroid/support/v4/view/a/a$c;

    iget-object v3, p0, Landroid/support/v4/view/a/a;->b:Ljava/lang/Object;

    invoke-interface {v1, v3}, Landroid/support/v4/view/a/a$c;->n(Ljava/lang/Object;)Z

    move-result v1

    .line 2458
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2460
    const-string v0, "; ["

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4677
    sget-object v0, Landroid/support/v4/view/a/a;->a:Landroid/support/v4/view/a/a$c;

    iget-object v1, p0, Landroid/support/v4/view/a/a;->b:Ljava/lang/Object;

    invoke-interface {v0, v1}, Landroid/support/v4/view/a/a$c;->a(Ljava/lang/Object;)I

    move-result v0

    .line 2461
    :goto_0
    if-eqz v0, :cond_1

    .line 2462
    const/4 v1, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->numberOfTrailingZeros(I)I

    move-result v3

    shl-int v3, v1, v3

    .line 2463
    xor-int/lit8 v1, v3, -0x1

    and-int/2addr v1, v0

    .line 5475
    sparse-switch v3, :sswitch_data_0

    .line 5513
    const-string v0, "ACTION_UNKNOWN"

    .line 2464
    :goto_1
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2465
    if-eqz v1, :cond_0

    .line 2466
    const-string v0, ", "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    move v0, v1

    .line 2468
    goto :goto_0

    .line 5477
    :sswitch_0
    const-string v0, "ACTION_FOCUS"

    goto :goto_1

    .line 5479
    :sswitch_1
    const-string v0, "ACTION_CLEAR_FOCUS"

    goto :goto_1

    .line 5481
    :sswitch_2
    const-string v0, "ACTION_SELECT"

    goto :goto_1

    .line 5483
    :sswitch_3
    const-string v0, "ACTION_CLEAR_SELECTION"

    goto :goto_1

    .line 5485
    :sswitch_4
    const-string v0, "ACTION_CLICK"

    goto :goto_1

    .line 5487
    :sswitch_5
    const-string v0, "ACTION_LONG_CLICK"

    goto :goto_1

    .line 5489
    :sswitch_6
    const-string v0, "ACTION_ACCESSIBILITY_FOCUS"

    goto :goto_1

    .line 5491
    :sswitch_7
    const-string v0, "ACTION_CLEAR_ACCESSIBILITY_FOCUS"

    goto :goto_1

    .line 5493
    :sswitch_8
    const-string v0, "ACTION_NEXT_AT_MOVEMENT_GRANULARITY"

    goto :goto_1

    .line 5495
    :sswitch_9
    const-string v0, "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY"

    goto :goto_1

    .line 5497
    :sswitch_a
    const-string v0, "ACTION_NEXT_HTML_ELEMENT"

    goto :goto_1

    .line 5499
    :sswitch_b
    const-string v0, "ACTION_PREVIOUS_HTML_ELEMENT"

    goto :goto_1

    .line 5501
    :sswitch_c
    const-string v0, "ACTION_SCROLL_FORWARD"

    goto :goto_1

    .line 5503
    :sswitch_d
    const-string v0, "ACTION_SCROLL_BACKWARD"

    goto :goto_1

    .line 5505
    :sswitch_e
    const-string v0, "ACTION_CUT"

    goto :goto_1

    .line 5507
    :sswitch_f
    const-string v0, "ACTION_COPY"

    goto :goto_1

    .line 5509
    :sswitch_10
    const-string v0, "ACTION_PASTE"

    goto :goto_1

    .line 5511
    :sswitch_11
    const-string v0, "ACTION_SET_SELECTION"

    goto :goto_1

    .line 2469
    :cond_1
    const-string v0, "]"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2471
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 5475
    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
        0x4 -> :sswitch_2
        0x8 -> :sswitch_3
        0x10 -> :sswitch_4
        0x20 -> :sswitch_5
        0x40 -> :sswitch_6
        0x80 -> :sswitch_7
        0x100 -> :sswitch_8
        0x200 -> :sswitch_9
        0x400 -> :sswitch_a
        0x800 -> :sswitch_b
        0x1000 -> :sswitch_c
        0x2000 -> :sswitch_d
        0x4000 -> :sswitch_f
        0x8000 -> :sswitch_10
        0x10000 -> :sswitch_e
        0x20000 -> :sswitch_11
    .end sparse-switch
.end method
