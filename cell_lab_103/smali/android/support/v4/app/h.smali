.class final Landroid/support/v4/app/h;
.super Landroid/support/v4/app/g;
.source "SourceFile"

# interfaces
.implements Landroid/view/LayoutInflater$Factory;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/app/h$a;
    }
.end annotation


# static fields
.field static final A:Landroid/view/animation/Interpolator;

.field static final B:Landroid/view/animation/Interpolator;

.field static final C:Landroid/view/animation/Interpolator;

.field static a:Z

.field static final b:Z

.field static final z:Landroid/view/animation/Interpolator;


# instance fields
.field c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field

.field d:[Ljava/lang/Runnable;

.field e:Z

.field f:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Landroid/support/v4/app/d;",
            ">;"
        }
    .end annotation
.end field

.field g:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Landroid/support/v4/app/d;",
            ">;"
        }
    .end annotation
.end field

.field h:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field i:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Landroid/support/v4/app/c;",
            ">;"
        }
    .end annotation
.end field

.field j:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Landroid/support/v4/app/d;",
            ">;"
        }
    .end annotation
.end field

.field k:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Landroid/support/v4/app/c;",
            ">;"
        }
    .end annotation
.end field

.field l:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field m:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field n:I

.field o:Landroid/support/v4/app/e;

.field p:Landroid/support/v4/app/f;

.field q:Landroid/support/v4/app/d;

.field r:Z

.field s:Z

.field t:Z

.field u:Ljava/lang/String;

.field v:Z

.field w:Landroid/os/Bundle;

.field x:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray",
            "<",
            "Landroid/os/Parcelable;",
            ">;"
        }
    .end annotation
.end field

.field y:Ljava/lang/Runnable;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v0, 0x0

    const/high16 v4, 0x40200000    # 2.5f

    const/high16 v3, 0x3fc00000    # 1.5f

    .line 410
    sput-boolean v0, Landroid/support/v4/app/h;->a:Z

    .line 413
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0xb

    if-lt v1, v2, :cond_0

    const/4 v0, 0x1

    :cond_0
    sput-boolean v0, Landroid/support/v4/app/h;->b:Z

    .line 746
    new-instance v0, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v0, v4}, Landroid/view/animation/DecelerateInterpolator;-><init>(F)V

    sput-object v0, Landroid/support/v4/app/h;->z:Landroid/view/animation/Interpolator;

    .line 747
    new-instance v0, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v0, v3}, Landroid/view/animation/DecelerateInterpolator;-><init>(F)V

    sput-object v0, Landroid/support/v4/app/h;->A:Landroid/view/animation/Interpolator;

    .line 748
    new-instance v0, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v0, v4}, Landroid/view/animation/AccelerateInterpolator;-><init>(F)V

    sput-object v0, Landroid/support/v4/app/h;->B:Landroid/view/animation/Interpolator;

    .line 749
    new-instance v0, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v0, v3}, Landroid/view/animation/AccelerateInterpolator;-><init>(F)V

    sput-object v0, Landroid/support/v4/app/h;->C:Landroid/view/animation/Interpolator;

    return-void
.end method

.method constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 409
    invoke-direct {p0}, Landroid/support/v4/app/g;-><init>()V

    .line 436
    const/4 v0, 0x0

    iput v0, p0, Landroid/support/v4/app/h;->n:I

    .line 448
    iput-object v1, p0, Landroid/support/v4/app/h;->w:Landroid/os/Bundle;

    .line 449
    iput-object v1, p0, Landroid/support/v4/app/h;->x:Landroid/util/SparseArray;

    .line 451
    new-instance v0, Landroid/support/v4/app/h$1;

    invoke-direct {v0, p0}, Landroid/support/v4/app/h$1;-><init>(Landroid/support/v4/app/h;)V

    iput-object v0, p0, Landroid/support/v4/app/h;->y:Ljava/lang/Runnable;

    .line 2205
    return-void
.end method

.method private a(Landroid/os/Bundle;Ljava/lang/String;)Landroid/support/v4/app/d;
    .locals 5

    .prologue
    const/4 v0, -0x1

    .line 579
    invoke-virtual {p1, p2, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v1

    .line 580
    if-ne v1, v0, :cond_1

    .line 581
    const/4 v0, 0x0

    .line 592
    :cond_0
    :goto_0
    return-object v0

    .line 583
    :cond_1
    iget-object v0, p0, Landroid/support/v4/app/h;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lt v1, v0, :cond_2

    .line 584
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Fragment no longer exists for key "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ": index "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0}, Landroid/support/v4/app/h;->a(Ljava/lang/RuntimeException;)V

    .line 587
    :cond_2
    iget-object v0, p0, Landroid/support/v4/app/h;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/d;

    .line 588
    if-nez v0, :cond_0

    .line 589
    new-instance v2, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Fragment no longer exists for key "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ": index "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v2}, Landroid/support/v4/app/h;->a(Ljava/lang/RuntimeException;)V

    goto :goto_0
.end method

.method private static a(FF)Landroid/view/animation/Animation;
    .locals 4

    .prologue
    .line 769
    new-instance v0, Landroid/view/animation/AlphaAnimation;

    invoke-direct {v0, p0, p1}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    .line 770
    sget-object v1, Landroid/support/v4/app/h;->A:Landroid/view/animation/Interpolator;

    invoke-virtual {v0, v1}, Landroid/view/animation/AlphaAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 771
    const-wide/16 v2, 0xdc

    invoke-virtual {v0, v2, v3}, Landroid/view/animation/AlphaAnimation;->setDuration(J)V

    .line 772
    return-object v0
.end method

.method private static a(FFFF)Landroid/view/animation/Animation;
    .locals 12

    .prologue
    const-wide/16 v10, 0xdc

    const/4 v5, 0x1

    const/high16 v6, 0x3f000000    # 0.5f

    .line 755
    new-instance v9, Landroid/view/animation/AnimationSet;

    const/4 v0, 0x0

    invoke-direct {v9, v0}, Landroid/view/animation/AnimationSet;-><init>(Z)V

    .line 756
    new-instance v0, Landroid/view/animation/ScaleAnimation;

    move v1, p0

    move v2, p1

    move v3, p0

    move v4, p1

    move v7, v5

    move v8, v6

    invoke-direct/range {v0 .. v8}, Landroid/view/animation/ScaleAnimation;-><init>(FFFFIFIF)V

    .line 758
    sget-object v1, Landroid/support/v4/app/h;->z:Landroid/view/animation/Interpolator;

    invoke-virtual {v0, v1}, Landroid/view/animation/ScaleAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 759
    invoke-virtual {v0, v10, v11}, Landroid/view/animation/ScaleAnimation;->setDuration(J)V

    .line 760
    invoke-virtual {v9, v0}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V

    .line 761
    new-instance v0, Landroid/view/animation/AlphaAnimation;

    invoke-direct {v0, p2, p3}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    .line 762
    sget-object v1, Landroid/support/v4/app/h;->A:Landroid/view/animation/Interpolator;

    invoke-virtual {v0, v1}, Landroid/view/animation/AlphaAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 763
    invoke-virtual {v0, v10, v11}, Landroid/view/animation/AlphaAnimation;->setDuration(J)V

    .line 764
    invoke-virtual {v9, v0}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V

    .line 765
    return-object v9
.end method

.method private a(Landroid/support/v4/app/d;IZI)Landroid/view/animation/Animation;
    .locals 6

    .prologue
    const v5, 0x3f79999a    # 0.975f

    const/4 v1, 0x0

    const/4 v4, 0x0

    const/high16 v3, 0x3f800000    # 1.0f

    .line 777
    iget v0, p1, Landroid/support/v4/app/d;->H:I

    invoke-static {}, Landroid/support/v4/app/d;->d()Landroid/view/animation/Animation;

    .line 783
    iget v0, p1, Landroid/support/v4/app/d;->H:I

    if-eqz v0, :cond_0

    .line 784
    iget-object v0, p0, Landroid/support/v4/app/h;->o:Landroid/support/v4/app/e;

    iget v2, p1, Landroid/support/v4/app/d;->H:I

    invoke-static {v0, v2}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v0

    .line 785
    if-eqz v0, :cond_0

    .line 831
    :goto_0
    return-object v0

    .line 790
    :cond_0
    if-nez p2, :cond_1

    move-object v0, v1

    .line 791
    goto :goto_0

    .line 3093
    :cond_1
    const/4 v0, -0x1

    .line 3094
    sparse-switch p2, :sswitch_data_0

    .line 795
    :goto_1
    if-gez v0, :cond_5

    move-object v0, v1

    .line 796
    goto :goto_0

    .line 3096
    :sswitch_0
    if-eqz p3, :cond_2

    const/4 v0, 0x1

    goto :goto_1

    :cond_2
    const/4 v0, 0x2

    goto :goto_1

    .line 3099
    :sswitch_1
    if-eqz p3, :cond_3

    const/4 v0, 0x3

    goto :goto_1

    :cond_3
    const/4 v0, 0x4

    goto :goto_1

    .line 3102
    :sswitch_2
    if-eqz p3, :cond_4

    const/4 v0, 0x5

    goto :goto_1

    :cond_4
    const/4 v0, 0x6

    goto :goto_1

    .line 799
    :cond_5
    packed-switch v0, :pswitch_data_0

    .line 814
    if-nez p4, :cond_6

    iget-object v0, p0, Landroid/support/v4/app/h;->o:Landroid/support/v4/app/e;

    invoke-virtual {v0}, Landroid/support/v4/app/e;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 815
    iget-object v0, p0, Landroid/support/v4/app/h;->o:Landroid/support/v4/app/e;

    invoke-virtual {v0}, Landroid/support/v4/app/e;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v0

    iget p4, v0, Landroid/view/WindowManager$LayoutParams;->windowAnimations:I

    .line 817
    :cond_6
    if-nez p4, :cond_7

    move-object v0, v1

    .line 818
    goto :goto_0

    .line 801
    :pswitch_0
    const/high16 v0, 0x3f900000    # 1.125f

    invoke-static {v0, v3, v4, v3}, Landroid/support/v4/app/h;->a(FFFF)Landroid/view/animation/Animation;

    move-result-object v0

    goto :goto_0

    .line 803
    :pswitch_1
    invoke-static {v3, v5, v3, v4}, Landroid/support/v4/app/h;->a(FFFF)Landroid/view/animation/Animation;

    move-result-object v0

    goto :goto_0

    .line 805
    :pswitch_2
    invoke-static {v5, v3, v4, v3}, Landroid/support/v4/app/h;->a(FFFF)Landroid/view/animation/Animation;

    move-result-object v0

    goto :goto_0

    .line 807
    :pswitch_3
    const v0, 0x3f89999a    # 1.075f

    invoke-static {v3, v0, v3, v4}, Landroid/support/v4/app/h;->a(FFFF)Landroid/view/animation/Animation;

    move-result-object v0

    goto :goto_0

    .line 809
    :pswitch_4
    invoke-static {v4, v3}, Landroid/support/v4/app/h;->a(FF)Landroid/view/animation/Animation;

    move-result-object v0

    goto :goto_0

    .line 811
    :pswitch_5
    invoke-static {v3, v4}, Landroid/support/v4/app/h;->a(FF)Landroid/view/animation/Animation;

    move-result-object v0

    goto :goto_0

    :cond_7
    move-object v0, v1

    .line 831
    goto :goto_0

    .line 3094
    nop

    :sswitch_data_0
    .sparse-switch
        0x1001 -> :sswitch_0
        0x1003 -> :sswitch_2
        0x2002 -> :sswitch_1
    .end sparse-switch

    .line 799
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method

.method private a(ILandroid/support/v4/app/c;)V
    .locals 4

    .prologue
    .line 1421
    monitor-enter p0

    .line 1422
    :try_start_0
    iget-object v0, p0, Landroid/support/v4/app/h;->k:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 1423
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroid/support/v4/app/h;->k:Ljava/util/ArrayList;

    .line 1425
    :cond_0
    iget-object v0, p0, Landroid/support/v4/app/h;->k:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 1426
    if-ge p1, v0, :cond_2

    .line 1427
    sget-boolean v0, Landroid/support/v4/app/h;->a:Z

    if-eqz v0, :cond_1

    const-string v0, "FragmentManager"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Setting back stack index "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " to "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1428
    :cond_1
    iget-object v0, p0, Landroid/support/v4/app/h;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, p1, p2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 1442
    :goto_0
    monitor-exit p0

    return-void

    .line 1430
    :cond_2
    :goto_1
    if-ge v0, p1, :cond_5

    .line 1431
    iget-object v1, p0, Landroid/support/v4/app/h;->k:Ljava/util/ArrayList;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1432
    iget-object v1, p0, Landroid/support/v4/app/h;->l:Ljava/util/ArrayList;

    if-nez v1, :cond_3

    .line 1433
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Landroid/support/v4/app/h;->l:Ljava/util/ArrayList;

    .line 1435
    :cond_3
    sget-boolean v1, Landroid/support/v4/app/h;->a:Z

    if-eqz v1, :cond_4

    const-string v1, "FragmentManager"

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Adding available back stack index "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1436
    :cond_4
    iget-object v1, p0, Landroid/support/v4/app/h;->l:Ljava/util/ArrayList;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1437
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 1439
    :cond_5
    sget-boolean v0, Landroid/support/v4/app/h;->a:Z

    if-eqz v0, :cond_6

    const-string v0, "FragmentManager"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Adding back stack index "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " with "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1440
    :cond_6
    iget-object v0, p0, Landroid/support/v4/app/h;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 1442
    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method private a(Landroid/support/v4/app/d;)V
    .locals 6

    .prologue
    const/4 v3, 0x0

    .line 1104
    iget v2, p0, Landroid/support/v4/app/h;->n:I

    move-object v0, p0

    move-object v1, p1

    move v4, v3

    move v5, v3

    invoke-virtual/range {v0 .. v5}, Landroid/support/v4/app/h;->a(Landroid/support/v4/app/d;IIIZ)V

    .line 1105
    return-void
.end method

.method private a(Ljava/lang/RuntimeException;)V
    .locals 5

    .prologue
    .line 459
    const-string v0, "FragmentManager"

    invoke-virtual {p1}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 460
    const-string v0, "FragmentManager"

    const-string v1, "Activity state:"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 461
    new-instance v0, Landroid/support/v4/e/d;

    const-string v1, "FragmentManager"

    invoke-direct {v0, v1}, Landroid/support/v4/e/d;-><init>(Ljava/lang/String;)V

    .line 462
    new-instance v1, Ljava/io/PrintWriter;

    invoke-direct {v1, v0}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    .line 463
    iget-object v0, p0, Landroid/support/v4/app/h;->o:Landroid/support/v4/app/e;

    if-eqz v0, :cond_0

    .line 465
    :try_start_0
    iget-object v0, p0, Landroid/support/v4/app/h;->o:Landroid/support/v4/app/e;

    const-string v2, "  "

    const/4 v3, 0x0

    const/4 v4, 0x0

    new-array v4, v4, [Ljava/lang/String;

    invoke-virtual {v0, v2, v3, v1, v4}, Landroid/support/v4/app/e;->dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 476
    :goto_0
    throw p1

    .line 466
    :catch_0
    move-exception v0

    .line 467
    const-string v1, "FragmentManager"

    const-string v2, "Failed dumping state"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    .line 471
    :cond_0
    :try_start_1
    const-string v0, "  "

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/String;

    invoke-virtual {p0, v0, v2, v1, v3}, Landroid/support/v4/app/h;->a(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    .line 472
    :catch_1
    move-exception v0

    .line 473
    const-string v1, "FragmentManager"

    const-string v2, "Failed dumping state"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method

.method public static b(I)I
    .locals 1

    .prologue
    .line 2069
    const/4 v0, 0x0

    .line 2070
    sparse-switch p0, :sswitch_data_0

    .line 2081
    :goto_0
    return v0

    .line 2072
    :sswitch_0
    const/16 v0, 0x2002

    .line 2073
    goto :goto_0

    .line 2075
    :sswitch_1
    const/16 v0, 0x1001

    .line 2076
    goto :goto_0

    .line 2078
    :sswitch_2
    const/16 v0, 0x1003

    goto :goto_0

    .line 2070
    :sswitch_data_0
    .sparse-switch
        0x1001 -> :sswitch_0
        0x1003 -> :sswitch_2
        0x2002 -> :sswitch_1
    .end sparse-switch
.end method

.method private b(Landroid/support/v4/app/d;)V
    .locals 2

    .prologue
    .line 1621
    iget-object v0, p1, Landroid/support/v4/app/d;->K:Landroid/view/View;

    if-nez v0, :cond_1

    .line 1634
    :cond_0
    :goto_0
    return-void

    .line 1624
    :cond_1
    iget-object v0, p0, Landroid/support/v4/app/h;->x:Landroid/util/SparseArray;

    if-nez v0, :cond_2

    .line 1625
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Landroid/support/v4/app/h;->x:Landroid/util/SparseArray;

    .line 1629
    :goto_1
    iget-object v0, p1, Landroid/support/v4/app/d;->K:Landroid/view/View;

    iget-object v1, p0, Landroid/support/v4/app/h;->x:Landroid/util/SparseArray;

    invoke-virtual {v0, v1}, Landroid/view/View;->saveHierarchyState(Landroid/util/SparseArray;)V

    .line 1630
    iget-object v0, p0, Landroid/support/v4/app/h;->x:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 1631
    iget-object v0, p0, Landroid/support/v4/app/h;->x:Landroid/util/SparseArray;

    iput-object v0, p1, Landroid/support/v4/app/d;->f:Landroid/util/SparseArray;

    .line 1632
    const/4 v0, 0x0

    iput-object v0, p0, Landroid/support/v4/app/h;->x:Landroid/util/SparseArray;

    goto :goto_0

    .line 1627
    :cond_2
    iget-object v0, p0, Landroid/support/v4/app/h;->x:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->clear()V

    goto :goto_1
.end method

.method private c(I)Landroid/support/v4/app/d;
    .locals 3

    .prologue
    .line 1308
    iget-object v0, p0, Landroid/support/v4/app/h;->g:Ljava/util/ArrayList;

    if-eqz v0, :cond_2

    .line 1310
    iget-object v0, p0, Landroid/support/v4/app/h;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v1, v0

    :goto_0
    if-ltz v1, :cond_2

    .line 1311
    iget-object v0, p0, Landroid/support/v4/app/h;->g:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/d;

    .line 1312
    if-eqz v0, :cond_1

    iget v2, v0, Landroid/support/v4/app/d;->x:I

    if-ne v2, p1, :cond_1

    .line 1326
    :cond_0
    :goto_1
    return-object v0

    .line 1310
    :cond_1
    add-int/lit8 v0, v1, -0x1

    move v1, v0

    goto :goto_0

    .line 1317
    :cond_2
    iget-object v0, p0, Landroid/support/v4/app/h;->f:Ljava/util/ArrayList;

    if-eqz v0, :cond_4

    .line 1319
    iget-object v0, p0, Landroid/support/v4/app/h;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v1, v0

    :goto_2
    if-ltz v1, :cond_4

    .line 1320
    iget-object v0, p0, Landroid/support/v4/app/h;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/d;

    .line 1321
    if-eqz v0, :cond_3

    iget v2, v0, Landroid/support/v4/app/d;->x:I

    if-eq v2, p1, :cond_0

    .line 1319
    :cond_3
    add-int/lit8 v0, v1, -0x1

    move v1, v0

    goto :goto_2

    .line 1326
    :cond_4
    const/4 v0, 0x0

    goto :goto_1
.end method

.method private k()V
    .locals 7

    .prologue
    const/4 v3, 0x0

    .line 1145
    iget-object v0, p0, Landroid/support/v4/app/h;->f:Ljava/util/ArrayList;

    if-nez v0, :cond_1

    .line 1153
    :cond_0
    return-void

    :cond_1
    move v6, v3

    .line 1147
    :goto_0
    iget-object v0, p0, Landroid/support/v4/app/h;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v6, v0, :cond_0

    .line 1148
    iget-object v0, p0, Landroid/support/v4/app/h;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/support/v4/app/d;

    .line 1149
    if-eqz v1, :cond_2

    .line 14835
    iget-boolean v0, v1, Landroid/support/v4/app/d;->L:Z

    if-eqz v0, :cond_2

    .line 14836
    iget-boolean v0, p0, Landroid/support/v4/app/h;->e:Z

    if-eqz v0, :cond_3

    .line 14838
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v4/app/h;->v:Z

    .line 1147
    :cond_2
    :goto_1
    add-int/lit8 v0, v6, 0x1

    move v6, v0

    goto :goto_0

    .line 14841
    :cond_3
    iput-boolean v3, v1, Landroid/support/v4/app/d;->L:Z

    .line 14842
    iget v2, p0, Landroid/support/v4/app/h;->n:I

    move-object v0, p0

    move v4, v3

    move v5, v3

    invoke-virtual/range {v0 .. v5}, Landroid/support/v4/app/h;->a(Landroid/support/v4/app/d;IIIZ)V

    goto :goto_1
.end method


# virtual methods
.method final a(I)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 1108
    invoke-virtual {p0, p1, v0, v0, v0}, Landroid/support/v4/app/h;->a(IIIZ)V

    .line 1109
    return-void
.end method

.method final a(IIIZ)V
    .locals 8

    .prologue
    const/4 v5, 0x0

    .line 1112
    iget-object v0, p0, Landroid/support/v4/app/h;->o:Landroid/support/v4/app/e;

    if-nez v0, :cond_0

    if-eqz p1, :cond_0

    .line 1113
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No activity"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1116
    :cond_0
    if-nez p4, :cond_2

    iget v0, p0, Landroid/support/v4/app/h;->n:I

    if-ne v0, p1, :cond_2

    .line 1142
    :cond_1
    :goto_0
    return-void

    .line 1120
    :cond_2
    iput p1, p0, Landroid/support/v4/app/h;->n:I

    .line 1121
    iget-object v0, p0, Landroid/support/v4/app/h;->f:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    move v6, v5

    move v7, v5

    .line 1123
    :goto_1
    iget-object v0, p0, Landroid/support/v4/app/h;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v6, v0, :cond_3

    .line 1124
    iget-object v0, p0, Landroid/support/v4/app/h;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/support/v4/app/d;

    .line 1125
    if-eqz v1, :cond_6

    move-object v0, p0

    move v2, p1

    move v3, p2

    move v4, p3

    .line 1126
    invoke-virtual/range {v0 .. v5}, Landroid/support/v4/app/h;->a(Landroid/support/v4/app/d;IIIZ)V

    .line 1127
    iget-object v0, v1, Landroid/support/v4/app/d;->N:Landroid/support/v4/app/l;

    if-eqz v0, :cond_6

    .line 1128
    iget-object v0, v1, Landroid/support/v4/app/d;->N:Landroid/support/v4/app/l;

    invoke-virtual {v0}, Landroid/support/v4/app/l;->a()Z

    move-result v0

    or-int/2addr v7, v0

    move v1, v7

    .line 1123
    :goto_2
    add-int/lit8 v0, v6, 0x1

    move v6, v0

    move v7, v1

    goto :goto_1

    .line 1133
    :cond_3
    if-nez v7, :cond_4

    .line 1134
    invoke-direct {p0}, Landroid/support/v4/app/h;->k()V

    .line 1137
    :cond_4
    iget-boolean v0, p0, Landroid/support/v4/app/h;->r:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroid/support/v4/app/h;->o:Landroid/support/v4/app/e;

    if-eqz v0, :cond_1

    iget v0, p0, Landroid/support/v4/app/h;->n:I

    const/4 v1, 0x5

    if-ne v0, v1, :cond_1

    .line 1138
    iget-object v0, p0, Landroid/support/v4/app/h;->o:Landroid/support/v4/app/e;

    .line 14623
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0xb

    if-lt v1, v2, :cond_5

    .line 14626
    invoke-static {v0}, Landroid/support/v4/app/b;->a(Landroid/app/Activity;)V

    .line 1139
    :goto_3
    iput-boolean v5, p0, Landroid/support/v4/app/h;->r:Z

    goto :goto_0

    .line 14632
    :cond_5
    const/4 v1, 0x1

    iput-boolean v1, v0, Landroid/support/v4/app/e;->i:Z

    goto :goto_3

    :cond_6
    move v1, v7

    goto :goto_2
.end method

.method public final a(Landroid/content/res/Configuration;)V
    .locals 3

    .prologue
    .line 1961
    iget-object v0, p0, Landroid/support/v4/app/h;->g:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    .line 1962
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v0, p0, Landroid/support/v4/app/h;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 1963
    iget-object v0, p0, Landroid/support/v4/app/h;->g:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/d;

    .line 1964
    if-eqz v0, :cond_0

    .line 17841
    invoke-virtual {v0, p1}, Landroid/support/v4/app/d;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 17842
    iget-object v2, v0, Landroid/support/v4/app/d;->v:Landroid/support/v4/app/h;

    if-eqz v2, :cond_0

    .line 17843
    iget-object v0, v0, Landroid/support/v4/app/d;->v:Landroid/support/v4/app/h;

    invoke-virtual {v0, p1}, Landroid/support/v4/app/h;->a(Landroid/content/res/Configuration;)V

    .line 1962
    :cond_0
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 1969
    :cond_1
    return-void
.end method

.method final a(Landroid/os/Parcelable;Ljava/util/ArrayList;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/Parcelable;",
            "Ljava/util/ArrayList",
            "<",
            "Landroid/support/v4/app/d;",
            ">;)V"
        }
    .end annotation

    .prologue
    const/4 v8, 0x1

    const/4 v7, 0x0

    const/4 v2, 0x0

    .line 1788
    if-nez p1, :cond_1

    .line 1896
    :cond_0
    :goto_0
    return-void

    .line 1789
    :cond_1
    check-cast p1, Landroid/support/v4/app/FragmentManagerState;

    .line 1790
    iget-object v0, p1, Landroid/support/v4/app/FragmentManagerState;->a:[Landroid/support/v4/app/FragmentState;

    if-eqz v0, :cond_0

    .line 1794
    if-eqz p2, :cond_4

    move v1, v2

    .line 1795
    :goto_1
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_4

    .line 1796
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/d;

    .line 1797
    sget-boolean v3, Landroid/support/v4/app/h;->a:Z

    if-eqz v3, :cond_2

    const-string v3, "FragmentManager"

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "restoreAllState: re-attaching retained "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1798
    :cond_2
    iget-object v3, p1, Landroid/support/v4/app/FragmentManagerState;->a:[Landroid/support/v4/app/FragmentState;

    iget v4, v0, Landroid/support/v4/app/d;->g:I

    aget-object v3, v3, v4

    .line 1799
    iput-object v0, v3, Landroid/support/v4/app/FragmentState;->k:Landroid/support/v4/app/d;

    .line 1800
    iput-object v7, v0, Landroid/support/v4/app/d;->f:Landroid/util/SparseArray;

    .line 1801
    iput v2, v0, Landroid/support/v4/app/d;->s:I

    .line 1802
    iput-boolean v2, v0, Landroid/support/v4/app/d;->q:Z

    .line 1803
    iput-boolean v2, v0, Landroid/support/v4/app/d;->m:Z

    .line 1804
    iput-object v7, v0, Landroid/support/v4/app/d;->j:Landroid/support/v4/app/d;

    .line 1805
    iget-object v4, v3, Landroid/support/v4/app/FragmentState;->j:Landroid/os/Bundle;

    if-eqz v4, :cond_3

    .line 1806
    iget-object v4, v3, Landroid/support/v4/app/FragmentState;->j:Landroid/os/Bundle;

    iget-object v5, p0, Landroid/support/v4/app/h;->o:Landroid/support/v4/app/e;

    invoke-virtual {v5}, Landroid/support/v4/app/e;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 1807
    iget-object v4, v3, Landroid/support/v4/app/FragmentState;->j:Landroid/os/Bundle;

    const-string v5, "android:view_state"

    invoke-virtual {v4, v5}, Landroid/os/Bundle;->getSparseParcelableArray(Ljava/lang/String;)Landroid/util/SparseArray;

    move-result-object v4

    iput-object v4, v0, Landroid/support/v4/app/d;->f:Landroid/util/SparseArray;

    .line 1809
    iget-object v3, v3, Landroid/support/v4/app/FragmentState;->j:Landroid/os/Bundle;

    iput-object v3, v0, Landroid/support/v4/app/d;->e:Landroid/os/Bundle;

    .line 1795
    :cond_3
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    .line 1816
    :cond_4
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p1, Landroid/support/v4/app/FragmentManagerState;->a:[Landroid/support/v4/app/FragmentState;

    array-length v1, v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Landroid/support/v4/app/h;->f:Ljava/util/ArrayList;

    .line 1817
    iget-object v0, p0, Landroid/support/v4/app/h;->h:Ljava/util/ArrayList;

    if-eqz v0, :cond_5

    .line 1818
    iget-object v0, p0, Landroid/support/v4/app/h;->h:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    :cond_5
    move v0, v2

    .line 1820
    :goto_2
    iget-object v1, p1, Landroid/support/v4/app/FragmentManagerState;->a:[Landroid/support/v4/app/FragmentState;

    array-length v1, v1

    if-ge v0, v1, :cond_d

    .line 1821
    iget-object v1, p1, Landroid/support/v4/app/FragmentManagerState;->a:[Landroid/support/v4/app/FragmentState;

    aget-object v1, v1, v0

    .line 1822
    if-eqz v1, :cond_a

    .line 1823
    iget-object v3, p0, Landroid/support/v4/app/h;->o:Landroid/support/v4/app/e;

    iget-object v4, p0, Landroid/support/v4/app/h;->q:Landroid/support/v4/app/d;

    .line 17093
    iget-object v5, v1, Landroid/support/v4/app/FragmentState;->k:Landroid/support/v4/app/d;

    if-nez v5, :cond_8

    .line 17097
    iget-object v5, v1, Landroid/support/v4/app/FragmentState;->i:Landroid/os/Bundle;

    if-eqz v5, :cond_6

    .line 17098
    iget-object v5, v1, Landroid/support/v4/app/FragmentState;->i:Landroid/os/Bundle;

    invoke-virtual {v3}, Landroid/support/v4/app/e;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 17101
    :cond_6
    iget-object v5, v1, Landroid/support/v4/app/FragmentState;->a:Ljava/lang/String;

    iget-object v6, v1, Landroid/support/v4/app/FragmentState;->i:Landroid/os/Bundle;

    invoke-static {v3, v5, v6}, Landroid/support/v4/app/d;->a(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)Landroid/support/v4/app/d;

    move-result-object v5

    iput-object v5, v1, Landroid/support/v4/app/FragmentState;->k:Landroid/support/v4/app/d;

    .line 17103
    iget-object v5, v1, Landroid/support/v4/app/FragmentState;->j:Landroid/os/Bundle;

    if-eqz v5, :cond_7

    .line 17104
    iget-object v5, v1, Landroid/support/v4/app/FragmentState;->j:Landroid/os/Bundle;

    invoke-virtual {v3}, Landroid/support/v4/app/e;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 17105
    iget-object v5, v1, Landroid/support/v4/app/FragmentState;->k:Landroid/support/v4/app/d;

    iget-object v6, v1, Landroid/support/v4/app/FragmentState;->j:Landroid/os/Bundle;

    iput-object v6, v5, Landroid/support/v4/app/d;->e:Landroid/os/Bundle;

    .line 17107
    :cond_7
    iget-object v5, v1, Landroid/support/v4/app/FragmentState;->k:Landroid/support/v4/app/d;

    iget v6, v1, Landroid/support/v4/app/FragmentState;->b:I

    invoke-virtual {v5, v6, v4}, Landroid/support/v4/app/d;->a(ILandroid/support/v4/app/d;)V

    .line 17108
    iget-object v4, v1, Landroid/support/v4/app/FragmentState;->k:Landroid/support/v4/app/d;

    iget-boolean v5, v1, Landroid/support/v4/app/FragmentState;->c:Z

    iput-boolean v5, v4, Landroid/support/v4/app/d;->p:Z

    .line 17109
    iget-object v4, v1, Landroid/support/v4/app/FragmentState;->k:Landroid/support/v4/app/d;

    iput-boolean v8, v4, Landroid/support/v4/app/d;->r:Z

    .line 17110
    iget-object v4, v1, Landroid/support/v4/app/FragmentState;->k:Landroid/support/v4/app/d;

    iget v5, v1, Landroid/support/v4/app/FragmentState;->d:I

    iput v5, v4, Landroid/support/v4/app/d;->x:I

    .line 17111
    iget-object v4, v1, Landroid/support/v4/app/FragmentState;->k:Landroid/support/v4/app/d;

    iget v5, v1, Landroid/support/v4/app/FragmentState;->e:I

    iput v5, v4, Landroid/support/v4/app/d;->y:I

    .line 17112
    iget-object v4, v1, Landroid/support/v4/app/FragmentState;->k:Landroid/support/v4/app/d;

    iget-object v5, v1, Landroid/support/v4/app/FragmentState;->f:Ljava/lang/String;

    iput-object v5, v4, Landroid/support/v4/app/d;->z:Ljava/lang/String;

    .line 17113
    iget-object v4, v1, Landroid/support/v4/app/FragmentState;->k:Landroid/support/v4/app/d;

    iget-boolean v5, v1, Landroid/support/v4/app/FragmentState;->g:Z

    iput-boolean v5, v4, Landroid/support/v4/app/d;->C:Z

    .line 17114
    iget-object v4, v1, Landroid/support/v4/app/FragmentState;->k:Landroid/support/v4/app/d;

    iget-boolean v5, v1, Landroid/support/v4/app/FragmentState;->h:Z

    iput-boolean v5, v4, Landroid/support/v4/app/d;->B:Z

    .line 17115
    iget-object v4, v1, Landroid/support/v4/app/FragmentState;->k:Landroid/support/v4/app/d;

    iget-object v3, v3, Landroid/support/v4/app/e;->b:Landroid/support/v4/app/h;

    iput-object v3, v4, Landroid/support/v4/app/d;->t:Landroid/support/v4/app/h;

    .line 17117
    sget-boolean v3, Landroid/support/v4/app/h;->a:Z

    if-eqz v3, :cond_8

    const-string v3, "FragmentManager"

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Instantiated fragment "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v5, v1, Landroid/support/v4/app/FragmentState;->k:Landroid/support/v4/app/d;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 17120
    :cond_8
    iget-object v3, v1, Landroid/support/v4/app/FragmentState;->k:Landroid/support/v4/app/d;

    .line 1824
    sget-boolean v4, Landroid/support/v4/app/h;->a:Z

    if-eqz v4, :cond_9

    const-string v4, "FragmentManager"

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "restoreAllState: active #"

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, ": "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1825
    :cond_9
    iget-object v4, p0, Landroid/support/v4/app/h;->f:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1829
    iput-object v7, v1, Landroid/support/v4/app/FragmentState;->k:Landroid/support/v4/app/d;

    .line 1820
    :goto_3
    add-int/lit8 v0, v0, 0x1

    goto/16 :goto_2

    .line 1831
    :cond_a
    iget-object v1, p0, Landroid/support/v4/app/h;->f:Ljava/util/ArrayList;

    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1832
    iget-object v1, p0, Landroid/support/v4/app/h;->h:Ljava/util/ArrayList;

    if-nez v1, :cond_b

    .line 1833
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Landroid/support/v4/app/h;->h:Ljava/util/ArrayList;

    .line 1835
    :cond_b
    sget-boolean v1, Landroid/support/v4/app/h;->a:Z

    if-eqz v1, :cond_c

    const-string v1, "FragmentManager"

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "restoreAllState: avail #"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1836
    :cond_c
    iget-object v1, p0, Landroid/support/v4/app/h;->h:Ljava/util/ArrayList;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 1841
    :cond_d
    if-eqz p2, :cond_10

    move v3, v2

    .line 1842
    :goto_4
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v3, v0, :cond_10

    .line 1843
    invoke-virtual {p2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/d;

    .line 1844
    iget v1, v0, Landroid/support/v4/app/d;->k:I

    if-ltz v1, :cond_e

    .line 1845
    iget v1, v0, Landroid/support/v4/app/d;->k:I

    iget-object v4, p0, Landroid/support/v4/app/h;->f:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v1, v4, :cond_f

    .line 1846
    iget-object v1, p0, Landroid/support/v4/app/h;->f:Ljava/util/ArrayList;

    iget v4, v0, Landroid/support/v4/app/d;->k:I

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/support/v4/app/d;

    iput-object v1, v0, Landroid/support/v4/app/d;->j:Landroid/support/v4/app/d;

    .line 1842
    :cond_e
    :goto_5
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_4

    .line 1848
    :cond_f
    const-string v1, "FragmentManager"

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Re-attaching retained fragment "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, " target no longer exists: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    iget v5, v0, Landroid/support/v4/app/d;->k:I

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 1850
    iput-object v7, v0, Landroid/support/v4/app/d;->j:Landroid/support/v4/app/d;

    goto :goto_5

    .line 1857
    :cond_10
    iget-object v0, p1, Landroid/support/v4/app/FragmentManagerState;->b:[I

    if-eqz v0, :cond_14

    .line 1858
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p1, Landroid/support/v4/app/FragmentManagerState;->b:[I

    array-length v1, v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Landroid/support/v4/app/h;->g:Ljava/util/ArrayList;

    move v1, v2

    .line 1859
    :goto_6
    iget-object v0, p1, Landroid/support/v4/app/FragmentManagerState;->b:[I

    array-length v0, v0

    if-ge v1, v0, :cond_15

    .line 1860
    iget-object v0, p0, Landroid/support/v4/app/h;->f:Ljava/util/ArrayList;

    iget-object v3, p1, Landroid/support/v4/app/FragmentManagerState;->b:[I

    aget v3, v3, v1

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/d;

    .line 1861
    if-nez v0, :cond_11

    .line 1862
    new-instance v3, Ljava/lang/IllegalStateException;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "No instantiated fragment for index #"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v5, p1, Landroid/support/v4/app/FragmentManagerState;->b:[I

    aget v5, v5, v1

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v3}, Landroid/support/v4/app/h;->a(Ljava/lang/RuntimeException;)V

    .line 1865
    :cond_11
    iput-boolean v8, v0, Landroid/support/v4/app/d;->m:Z

    .line 1866
    sget-boolean v3, Landroid/support/v4/app/h;->a:Z

    if-eqz v3, :cond_12

    const-string v3, "FragmentManager"

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "restoreAllState: added #"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ": "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1867
    :cond_12
    iget-object v3, p0, Landroid/support/v4/app/h;->g:Ljava/util/ArrayList;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_13

    .line 1868
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Already added!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1870
    :cond_13
    iget-object v3, p0, Landroid/support/v4/app/h;->g:Ljava/util/ArrayList;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1859
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_6

    .line 1873
    :cond_14
    iput-object v7, p0, Landroid/support/v4/app/h;->g:Ljava/util/ArrayList;

    .line 1877
    :cond_15
    iget-object v0, p1, Landroid/support/v4/app/FragmentManagerState;->c:[Landroid/support/v4/app/BackStackState;

    if-eqz v0, :cond_18

    .line 1878
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p1, Landroid/support/v4/app/FragmentManagerState;->c:[Landroid/support/v4/app/BackStackState;

    array-length v1, v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Landroid/support/v4/app/h;->i:Ljava/util/ArrayList;

    move v0, v2

    .line 1879
    :goto_7
    iget-object v1, p1, Landroid/support/v4/app/FragmentManagerState;->c:[Landroid/support/v4/app/BackStackState;

    array-length v1, v1

    if-ge v0, v1, :cond_0

    .line 1880
    iget-object v1, p1, Landroid/support/v4/app/FragmentManagerState;->c:[Landroid/support/v4/app/BackStackState;

    aget-object v1, v1, v0

    invoke-virtual {v1, p0}, Landroid/support/v4/app/BackStackState;->a(Landroid/support/v4/app/h;)Landroid/support/v4/app/c;

    move-result-object v1

    .line 1881
    sget-boolean v3, Landroid/support/v4/app/h;->a:Z

    if-eqz v3, :cond_16

    .line 1882
    const-string v3, "FragmentManager"

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "restoreAllState: back stack #"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, " (index "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    iget v5, v1, Landroid/support/v4/app/c;->o:I

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "): "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1884
    new-instance v3, Landroid/support/v4/e/d;

    const-string v4, "FragmentManager"

    invoke-direct {v3, v4}, Landroid/support/v4/e/d;-><init>(Ljava/lang/String;)V

    .line 1885
    new-instance v4, Ljava/io/PrintWriter;

    invoke-direct {v4, v3}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    .line 1886
    const-string v3, "  "

    invoke-virtual {v1, v3, v4, v2}, Landroid/support/v4/app/c;->a(Ljava/lang/String;Ljava/io/PrintWriter;Z)V

    .line 1888
    :cond_16
    iget-object v3, p0, Landroid/support/v4/app/h;->i:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1889
    iget v3, v1, Landroid/support/v4/app/c;->o:I

    if-ltz v3, :cond_17

    .line 1890
    iget v3, v1, Landroid/support/v4/app/c;->o:I

    invoke-direct {p0, v3, v1}, Landroid/support/v4/app/h;->a(ILandroid/support/v4/app/c;)V

    .line 1879
    :cond_17
    add-int/lit8 v0, v0, 0x1

    goto :goto_7

    .line 1894
    :cond_18
    iput-object v7, p0, Landroid/support/v4/app/h;->i:Ljava/util/ArrayList;

    goto/16 :goto_0
.end method

.method public final a(Landroid/support/v4/app/d;II)V
    .locals 6

    .prologue
    const/4 v1, 0x1

    const/4 v5, 0x0

    .line 1212
    sget-boolean v0, Landroid/support/v4/app/h;->a:Z

    if-eqz v0, :cond_0

    const-string v0, "FragmentManager"

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "remove: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " nesting="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p1, Landroid/support/v4/app/d;->s:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 15486
    :cond_0
    iget v0, p1, Landroid/support/v4/app/d;->s:I

    if-lez v0, :cond_5

    move v0, v1

    .line 1213
    :goto_0
    if-nez v0, :cond_6

    move v0, v1

    .line 1214
    :goto_1
    iget-boolean v2, p1, Landroid/support/v4/app/d;->B:Z

    if-eqz v2, :cond_1

    if-eqz v0, :cond_4

    .line 1215
    :cond_1
    iget-object v2, p0, Landroid/support/v4/app/h;->g:Ljava/util/ArrayList;

    if-eqz v2, :cond_2

    .line 1216
    iget-object v2, p0, Landroid/support/v4/app/h;->g:Ljava/util/ArrayList;

    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 1218
    :cond_2
    iget-boolean v2, p1, Landroid/support/v4/app/d;->E:Z

    if-eqz v2, :cond_3

    iget-boolean v2, p1, Landroid/support/v4/app/d;->F:Z

    if-eqz v2, :cond_3

    .line 1219
    iput-boolean v1, p0, Landroid/support/v4/app/h;->r:Z

    .line 1221
    :cond_3
    iput-boolean v5, p1, Landroid/support/v4/app/d;->m:Z

    .line 1222
    iput-boolean v1, p1, Landroid/support/v4/app/d;->n:Z

    .line 1223
    if-eqz v0, :cond_7

    move v2, v5

    :goto_2
    move-object v0, p0

    move-object v1, p1

    move v3, p2

    move v4, p3

    invoke-virtual/range {v0 .. v5}, Landroid/support/v4/app/h;->a(Landroid/support/v4/app/d;IIIZ)V

    .line 1226
    :cond_4
    return-void

    :cond_5
    move v0, v5

    .line 15486
    goto :goto_0

    :cond_6
    move v0, v5

    .line 1213
    goto :goto_1

    :cond_7
    move v2, v1

    .line 1223
    goto :goto_2
.end method

.method final a(Landroid/support/v4/app/d;IIIZ)V
    .locals 10

    .prologue
    const/4 v9, 0x4

    const/4 v6, 0x3

    const/4 v5, 0x1

    const/4 v7, 0x0

    const/4 v3, 0x0

    .line 849
    iget-boolean v0, p1, Landroid/support/v4/app/d;->m:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p1, Landroid/support/v4/app/d;->B:Z

    if-eqz v0, :cond_1

    :cond_0
    if-le p2, v5, :cond_1

    move p2, v5

    .line 852
    :cond_1
    iget-boolean v0, p1, Landroid/support/v4/app/d;->n:Z

    if-eqz v0, :cond_2

    iget v0, p1, Landroid/support/v4/app/d;->b:I

    if-le p2, v0, :cond_2

    .line 854
    iget p2, p1, Landroid/support/v4/app/d;->b:I

    .line 858
    :cond_2
    iget-boolean v0, p1, Landroid/support/v4/app/d;->L:Z

    if-eqz v0, :cond_3

    iget v0, p1, Landroid/support/v4/app/d;->b:I

    if-ge v0, v9, :cond_3

    if-le p2, v6, :cond_3

    move p2, v6

    .line 861
    :cond_3
    iget v0, p1, Landroid/support/v4/app/d;->b:I

    if-ge v0, p2, :cond_27

    .line 865
    iget-boolean v0, p1, Landroid/support/v4/app/d;->p:Z

    if-eqz v0, :cond_4

    iget-boolean v0, p1, Landroid/support/v4/app/d;->q:Z

    if-nez v0, :cond_4

    .line 1101
    :goto_0
    return-void

    .line 868
    :cond_4
    iget-object v0, p1, Landroid/support/v4/app/d;->c:Landroid/view/View;

    if-eqz v0, :cond_5

    .line 873
    iput-object v7, p1, Landroid/support/v4/app/d;->c:Landroid/view/View;

    .line 874
    iget v2, p1, Landroid/support/v4/app/d;->d:I

    move-object v0, p0

    move-object v1, p1

    move v4, v3

    invoke-virtual/range {v0 .. v5}, Landroid/support/v4/app/h;->a(Landroid/support/v4/app/d;IIIZ)V

    .line 876
    :cond_5
    iget v0, p1, Landroid/support/v4/app/d;->b:I

    packed-switch v0, :pswitch_data_0

    .line 1100
    :cond_6
    :goto_1
    iput p2, p1, Landroid/support/v4/app/d;->b:I

    goto :goto_0

    .line 878
    :pswitch_0
    sget-boolean v0, Landroid/support/v4/app/h;->a:Z

    if-eqz v0, :cond_7

    const-string v0, "FragmentManager"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "moveto CREATED: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 879
    :cond_7
    iget-object v0, p1, Landroid/support/v4/app/d;->e:Landroid/os/Bundle;

    if-eqz v0, :cond_9

    .line 880
    iget-object v0, p1, Landroid/support/v4/app/d;->e:Landroid/os/Bundle;

    iget-object v1, p0, Landroid/support/v4/app/h;->o:Landroid/support/v4/app/e;

    invoke-virtual {v1}, Landroid/support/v4/app/e;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 881
    iget-object v0, p1, Landroid/support/v4/app/d;->e:Landroid/os/Bundle;

    const-string v1, "android:view_state"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getSparseParcelableArray(Ljava/lang/String;)Landroid/util/SparseArray;

    move-result-object v0

    iput-object v0, p1, Landroid/support/v4/app/d;->f:Landroid/util/SparseArray;

    .line 883
    iget-object v0, p1, Landroid/support/v4/app/d;->e:Landroid/os/Bundle;

    const-string v1, "android:target_state"

    invoke-direct {p0, v0, v1}, Landroid/support/v4/app/h;->a(Landroid/os/Bundle;Ljava/lang/String;)Landroid/support/v4/app/d;

    move-result-object v0

    iput-object v0, p1, Landroid/support/v4/app/d;->j:Landroid/support/v4/app/d;

    .line 885
    iget-object v0, p1, Landroid/support/v4/app/d;->j:Landroid/support/v4/app/d;

    if-eqz v0, :cond_8

    .line 886
    iget-object v0, p1, Landroid/support/v4/app/d;->e:Landroid/os/Bundle;

    const-string v1, "android:target_req_state"

    invoke-virtual {v0, v1, v3}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p1, Landroid/support/v4/app/d;->l:I

    .line 889
    :cond_8
    iget-object v0, p1, Landroid/support/v4/app/d;->e:Landroid/os/Bundle;

    const-string v1, "android:user_visible_hint"

    invoke-virtual {v0, v1, v5}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p1, Landroid/support/v4/app/d;->M:Z

    .line 891
    iget-boolean v0, p1, Landroid/support/v4/app/d;->M:Z

    if-nez v0, :cond_9

    .line 892
    iput-boolean v5, p1, Landroid/support/v4/app/d;->L:Z

    .line 893
    if-le p2, v6, :cond_9

    move p2, v6

    .line 898
    :cond_9
    iget-object v0, p0, Landroid/support/v4/app/h;->o:Landroid/support/v4/app/e;

    iput-object v0, p1, Landroid/support/v4/app/d;->u:Landroid/support/v4/app/e;

    .line 899
    iget-object v0, p0, Landroid/support/v4/app/h;->q:Landroid/support/v4/app/d;

    iput-object v0, p1, Landroid/support/v4/app/d;->w:Landroid/support/v4/app/d;

    .line 900
    iget-object v0, p0, Landroid/support/v4/app/h;->q:Landroid/support/v4/app/d;

    if-eqz v0, :cond_a

    iget-object v0, p0, Landroid/support/v4/app/h;->q:Landroid/support/v4/app/d;

    iget-object v0, v0, Landroid/support/v4/app/d;->v:Landroid/support/v4/app/h;

    :goto_2
    iput-object v0, p1, Landroid/support/v4/app/d;->t:Landroid/support/v4/app/h;

    .line 902
    iput-boolean v3, p1, Landroid/support/v4/app/d;->G:Z

    .line 3990
    iput-boolean v5, p1, Landroid/support/v4/app/d;->G:Z

    .line 904
    iget-boolean v0, p1, Landroid/support/v4/app/d;->G:Z

    if-nez v0, :cond_b

    .line 905
    new-instance v0, Landroid/support/v4/app/o;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " did not call through to super.onAttach()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/support/v4/app/o;-><init>(Ljava/lang/String;)V

    throw v0

    .line 900
    :cond_a
    iget-object v0, p0, Landroid/support/v4/app/h;->o:Landroid/support/v4/app/e;

    iget-object v0, v0, Landroid/support/v4/app/e;->b:Landroid/support/v4/app/h;

    goto :goto_2

    .line 908
    :cond_b
    iget-object v0, p1, Landroid/support/v4/app/d;->w:Landroid/support/v4/app/d;

    .line 912
    iget-boolean v0, p1, Landroid/support/v4/app/d;->D:Z

    if-nez v0, :cond_f

    .line 913
    iget-object v0, p1, Landroid/support/v4/app/d;->e:Landroid/os/Bundle;

    .line 4759
    iget-object v1, p1, Landroid/support/v4/app/d;->v:Landroid/support/v4/app/h;

    if-eqz v1, :cond_c

    .line 4760
    iget-object v1, p1, Landroid/support/v4/app/d;->v:Landroid/support/v4/app/h;

    .line 4907
    iput-boolean v3, v1, Landroid/support/v4/app/h;->s:Z

    .line 4762
    :cond_c
    iput-boolean v3, p1, Landroid/support/v4/app/d;->G:Z

    .line 5015
    iput-boolean v5, p1, Landroid/support/v4/app/d;->G:Z

    .line 4764
    iget-boolean v1, p1, Landroid/support/v4/app/d;->G:Z

    if-nez v1, :cond_d

    .line 4765
    new-instance v0, Landroid/support/v4/app/o;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " did not call through to super.onCreate()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/support/v4/app/o;-><init>(Ljava/lang/String;)V

    throw v0

    .line 4768
    :cond_d
    if-eqz v0, :cond_f

    .line 4769
    const-string v1, "android:support:fragments"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    .line 4771
    if-eqz v0, :cond_f

    .line 4772
    iget-object v1, p1, Landroid/support/v4/app/d;->v:Landroid/support/v4/app/h;

    if-nez v1, :cond_e

    .line 4773
    invoke-virtual {p1}, Landroid/support/v4/app/d;->g()V

    .line 4775
    :cond_e
    iget-object v1, p1, Landroid/support/v4/app/d;->v:Landroid/support/v4/app/h;

    invoke-virtual {v1, v0, v7}, Landroid/support/v4/app/h;->a(Landroid/os/Parcelable;Ljava/util/ArrayList;)V

    .line 4776
    iget-object v0, p1, Landroid/support/v4/app/d;->v:Landroid/support/v4/app/h;

    invoke-virtual {v0}, Landroid/support/v4/app/h;->d()V

    .line 915
    :cond_f
    iput-boolean v3, p1, Landroid/support/v4/app/d;->D:Z

    .line 916
    iget-boolean v0, p1, Landroid/support/v4/app/d;->p:Z

    if-eqz v0, :cond_11

    .line 920
    iget-object v0, p1, Landroid/support/v4/app/d;->e:Landroid/os/Bundle;

    invoke-virtual {p1}, Landroid/support/v4/app/d;->c()Landroid/view/LayoutInflater;

    iget-object v0, p1, Landroid/support/v4/app/d;->e:Landroid/os/Bundle;

    invoke-virtual {p1}, Landroid/support/v4/app/d;->h()Landroid/view/View;

    move-result-object v0

    iput-object v0, p1, Landroid/support/v4/app/d;->J:Landroid/view/View;

    .line 922
    iget-object v0, p1, Landroid/support/v4/app/d;->J:Landroid/view/View;

    if-eqz v0, :cond_13

    .line 923
    iget-object v0, p1, Landroid/support/v4/app/d;->J:Landroid/view/View;

    iput-object v0, p1, Landroid/support/v4/app/d;->K:Landroid/view/View;

    .line 924
    iget-object v0, p1, Landroid/support/v4/app/d;->J:Landroid/view/View;

    invoke-static {v0}, Landroid/support/v4/app/m;->a(Landroid/view/View;)Landroid/view/ViewGroup;

    move-result-object v0

    iput-object v0, p1, Landroid/support/v4/app/d;->J:Landroid/view/View;

    .line 925
    iget-boolean v0, p1, Landroid/support/v4/app/d;->A:Z

    if-eqz v0, :cond_10

    iget-object v0, p1, Landroid/support/v4/app/d;->J:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 926
    :cond_10
    iget-object v0, p1, Landroid/support/v4/app/d;->J:Landroid/view/View;

    iget-object v0, p1, Landroid/support/v4/app/d;->e:Landroid/os/Bundle;

    invoke-static {}, Landroid/support/v4/app/d;->e()V

    .line 932
    :cond_11
    :goto_3
    :pswitch_1
    if-le p2, v5, :cond_20

    .line 933
    sget-boolean v0, Landroid/support/v4/app/h;->a:Z

    if-eqz v0, :cond_12

    const-string v0, "FragmentManager"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "moveto ACTIVITY_CREATED: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 934
    :cond_12
    iget-boolean v0, p1, Landroid/support/v4/app/d;->p:Z

    if-nez v0, :cond_19

    .line 936
    iget v0, p1, Landroid/support/v4/app/d;->y:I

    if-eqz v0, :cond_42

    .line 937
    iget-object v0, p0, Landroid/support/v4/app/h;->p:Landroid/support/v4/app/f;

    iget v1, p1, Landroid/support/v4/app/d;->y:I

    invoke-interface {v0, v1}, Landroid/support/v4/app/f;->a(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 938
    if-nez v0, :cond_15

    iget-boolean v1, p1, Landroid/support/v4/app/d;->r:Z

    if-nez v1, :cond_15

    .line 939
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "No view found for id 0x"

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v4, p1, Landroid/support/v4/app/d;->y:I

    invoke-static {v4}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, " ("

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 5618
    iget-object v4, p1, Landroid/support/v4/app/d;->u:Landroid/support/v4/app/e;

    if-nez v4, :cond_14

    .line 5619
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " not attached to Activity"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 928
    :cond_13
    iput-object v7, p1, Landroid/support/v4/app/d;->K:Landroid/view/View;

    goto :goto_3

    .line 5621
    :cond_14
    iget-object v4, p1, Landroid/support/v4/app/d;->u:Landroid/support/v4/app/e;

    invoke-virtual {v4}, Landroid/support/v4/app/e;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    .line 939
    iget v8, p1, Landroid/support/v4/app/d;->y:I

    invoke-virtual {v4, v8}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, ") for fragment "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v1}, Landroid/support/v4/app/h;->a(Ljava/lang/RuntimeException;)V

    .line 946
    :cond_15
    :goto_4
    iput-object v0, p1, Landroid/support/v4/app/d;->I:Landroid/view/ViewGroup;

    .line 947
    iget-object v1, p1, Landroid/support/v4/app/d;->e:Landroid/os/Bundle;

    invoke-virtual {p1}, Landroid/support/v4/app/d;->c()Landroid/view/LayoutInflater;

    iget-object v1, p1, Landroid/support/v4/app/d;->e:Landroid/os/Bundle;

    invoke-virtual {p1}, Landroid/support/v4/app/d;->h()Landroid/view/View;

    move-result-object v1

    iput-object v1, p1, Landroid/support/v4/app/d;->J:Landroid/view/View;

    .line 949
    iget-object v1, p1, Landroid/support/v4/app/d;->J:Landroid/view/View;

    if-eqz v1, :cond_1b

    .line 950
    iget-object v1, p1, Landroid/support/v4/app/d;->J:Landroid/view/View;

    iput-object v1, p1, Landroid/support/v4/app/d;->K:Landroid/view/View;

    .line 951
    iget-object v1, p1, Landroid/support/v4/app/d;->J:Landroid/view/View;

    invoke-static {v1}, Landroid/support/v4/app/m;->a(Landroid/view/View;)Landroid/view/ViewGroup;

    move-result-object v1

    iput-object v1, p1, Landroid/support/v4/app/d;->J:Landroid/view/View;

    .line 952
    if-eqz v0, :cond_17

    .line 953
    invoke-direct {p0, p1, p3, v5, p4}, Landroid/support/v4/app/h;->a(Landroid/support/v4/app/d;IZI)Landroid/view/animation/Animation;

    move-result-object v1

    .line 955
    if-eqz v1, :cond_16

    .line 956
    iget-object v2, p1, Landroid/support/v4/app/d;->J:Landroid/view/View;

    invoke-virtual {v2, v1}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 958
    :cond_16
    iget-object v1, p1, Landroid/support/v4/app/d;->J:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 960
    :cond_17
    iget-boolean v0, p1, Landroid/support/v4/app/d;->A:Z

    if-eqz v0, :cond_18

    iget-object v0, p1, Landroid/support/v4/app/d;->J:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 961
    :cond_18
    iget-object v0, p1, Landroid/support/v4/app/d;->J:Landroid/view/View;

    iget-object v0, p1, Landroid/support/v4/app/d;->e:Landroid/os/Bundle;

    invoke-static {}, Landroid/support/v4/app/d;->e()V

    .line 967
    :cond_19
    :goto_5
    iget-object v0, p1, Landroid/support/v4/app/d;->e:Landroid/os/Bundle;

    .line 5790
    iget-object v0, p1, Landroid/support/v4/app/d;->v:Landroid/support/v4/app/h;

    if-eqz v0, :cond_1a

    .line 5791
    iget-object v0, p1, Landroid/support/v4/app/d;->v:Landroid/support/v4/app/h;

    .line 5907
    iput-boolean v3, v0, Landroid/support/v4/app/h;->s:Z

    .line 5793
    :cond_1a
    iput-boolean v3, p1, Landroid/support/v4/app/d;->G:Z

    .line 6080
    iput-boolean v5, p1, Landroid/support/v4/app/d;->G:Z

    .line 5795
    iget-boolean v0, p1, Landroid/support/v4/app/d;->G:Z

    if-nez v0, :cond_1c

    .line 5796
    new-instance v0, Landroid/support/v4/app/o;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " did not call through to super.onActivityCreated()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/support/v4/app/o;-><init>(Ljava/lang/String;)V

    throw v0

    .line 963
    :cond_1b
    iput-object v7, p1, Landroid/support/v4/app/d;->K:Landroid/view/View;

    goto :goto_5

    .line 5799
    :cond_1c
    iget-object v0, p1, Landroid/support/v4/app/d;->v:Landroid/support/v4/app/h;

    if-eqz v0, :cond_1d

    .line 5800
    iget-object v0, p1, Landroid/support/v4/app/d;->v:Landroid/support/v4/app/h;

    invoke-virtual {v0}, Landroid/support/v4/app/h;->e()V

    .line 968
    :cond_1d
    iget-object v0, p1, Landroid/support/v4/app/d;->J:Landroid/view/View;

    if-eqz v0, :cond_1f

    .line 969
    iget-object v0, p1, Landroid/support/v4/app/d;->e:Landroid/os/Bundle;

    .line 6464
    iget-object v0, p1, Landroid/support/v4/app/d;->f:Landroid/util/SparseArray;

    if-eqz v0, :cond_1e

    .line 6465
    iget-object v0, p1, Landroid/support/v4/app/d;->K:Landroid/view/View;

    iget-object v1, p1, Landroid/support/v4/app/d;->f:Landroid/util/SparseArray;

    invoke-virtual {v0, v1}, Landroid/view/View;->restoreHierarchyState(Landroid/util/SparseArray;)V

    .line 6466
    iput-object v7, p1, Landroid/support/v4/app/d;->f:Landroid/util/SparseArray;

    .line 6468
    :cond_1e
    iput-boolean v3, p1, Landroid/support/v4/app/d;->G:Z

    .line 7095
    iput-boolean v5, p1, Landroid/support/v4/app/d;->G:Z

    .line 6470
    iget-boolean v0, p1, Landroid/support/v4/app/d;->G:Z

    if-nez v0, :cond_1f

    .line 6471
    new-instance v0, Landroid/support/v4/app/o;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " did not call through to super.onViewStateRestored()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/support/v4/app/o;-><init>(Ljava/lang/String;)V

    throw v0

    .line 971
    :cond_1f
    iput-object v7, p1, Landroid/support/v4/app/d;->e:Landroid/os/Bundle;

    .line 975
    :cond_20
    :pswitch_2
    if-le p2, v6, :cond_22

    .line 976
    sget-boolean v0, Landroid/support/v4/app/h;->a:Z

    if-eqz v0, :cond_21

    const-string v0, "FragmentManager"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "moveto STARTED: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 977
    :cond_21
    invoke-virtual {p1}, Landroid/support/v4/app/d;->i()V

    .line 980
    :cond_22
    :pswitch_3
    if-le p2, v9, :cond_6

    .line 981
    sget-boolean v0, Landroid/support/v4/app/h;->a:Z

    if-eqz v0, :cond_23

    const-string v0, "FragmentManager"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "moveto RESUMED: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 982
    :cond_23
    iput-boolean v5, p1, Landroid/support/v4/app/d;->o:Z

    .line 7824
    iget-object v0, p1, Landroid/support/v4/app/d;->v:Landroid/support/v4/app/h;

    if-eqz v0, :cond_24

    .line 7825
    iget-object v0, p1, Landroid/support/v4/app/d;->v:Landroid/support/v4/app/h;

    .line 7907
    iput-boolean v3, v0, Landroid/support/v4/app/h;->s:Z

    .line 7826
    iget-object v0, p1, Landroid/support/v4/app/d;->v:Landroid/support/v4/app/h;

    invoke-virtual {v0}, Landroid/support/v4/app/h;->a()Z

    .line 7828
    :cond_24
    iput-boolean v3, p1, Landroid/support/v4/app/d;->G:Z

    .line 8125
    iput-boolean v5, p1, Landroid/support/v4/app/d;->G:Z

    .line 7830
    iget-boolean v0, p1, Landroid/support/v4/app/d;->G:Z

    if-nez v0, :cond_25

    .line 7831
    new-instance v0, Landroid/support/v4/app/o;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " did not call through to super.onResume()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/support/v4/app/o;-><init>(Ljava/lang/String;)V

    throw v0

    .line 7834
    :cond_25
    iget-object v0, p1, Landroid/support/v4/app/d;->v:Landroid/support/v4/app/h;

    if-eqz v0, :cond_26

    .line 7835
    iget-object v0, p1, Landroid/support/v4/app/d;->v:Landroid/support/v4/app/h;

    invoke-virtual {v0}, Landroid/support/v4/app/h;->g()V

    .line 7836
    iget-object v0, p1, Landroid/support/v4/app/d;->v:Landroid/support/v4/app/h;

    invoke-virtual {v0}, Landroid/support/v4/app/h;->a()Z

    .line 984
    :cond_26
    iput-object v7, p1, Landroid/support/v4/app/d;->e:Landroid/os/Bundle;

    .line 985
    iput-object v7, p1, Landroid/support/v4/app/d;->f:Landroid/util/SparseArray;

    goto/16 :goto_1

    .line 988
    :cond_27
    iget v0, p1, Landroid/support/v4/app/d;->b:I

    if-le v0, p2, :cond_6

    .line 989
    iget v0, p1, Landroid/support/v4/app/d;->b:I

    packed-switch v0, :pswitch_data_1

    goto/16 :goto_1

    .line 1052
    :cond_28
    :goto_6
    :pswitch_4
    if-gtz p2, :cond_6

    .line 1053
    iget-boolean v0, p0, Landroid/support/v4/app/h;->t:Z

    if-eqz v0, :cond_29

    .line 1054
    iget-object v0, p1, Landroid/support/v4/app/d;->c:Landroid/view/View;

    if-eqz v0, :cond_29

    .line 1061
    iget-object v0, p1, Landroid/support/v4/app/d;->c:Landroid/view/View;

    .line 1062
    iput-object v7, p1, Landroid/support/v4/app/d;->c:Landroid/view/View;

    .line 1063
    invoke-virtual {v0}, Landroid/view/View;->clearAnimation()V

    .line 1066
    :cond_29
    iget-object v0, p1, Landroid/support/v4/app/d;->c:Landroid/view/View;

    if-eqz v0, :cond_3a

    .line 1071
    iput p2, p1, Landroid/support/v4/app/d;->d:I

    move p2, v5

    .line 1072
    goto/16 :goto_1

    .line 991
    :pswitch_5
    const/4 v0, 0x5

    if-ge p2, v0, :cond_2d

    .line 992
    sget-boolean v0, Landroid/support/v4/app/h;->a:Z

    if-eqz v0, :cond_2a

    const-string v0, "FragmentManager"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "movefrom RESUMED: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 8943
    :cond_2a
    iget-object v0, p1, Landroid/support/v4/app/d;->v:Landroid/support/v4/app/h;

    if-eqz v0, :cond_2b

    .line 8944
    iget-object v0, p1, Landroid/support/v4/app/d;->v:Landroid/support/v4/app/h;

    .line 9931
    invoke-virtual {v0, v9}, Landroid/support/v4/app/h;->a(I)V

    .line 8946
    :cond_2b
    iput-boolean v3, p1, Landroid/support/v4/app/d;->G:Z

    .line 10160
    iput-boolean v5, p1, Landroid/support/v4/app/d;->G:Z

    .line 8948
    iget-boolean v0, p1, Landroid/support/v4/app/d;->G:Z

    if-nez v0, :cond_2c

    .line 8949
    new-instance v0, Landroid/support/v4/app/o;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " did not call through to super.onPause()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/support/v4/app/o;-><init>(Ljava/lang/String;)V

    throw v0

    .line 994
    :cond_2c
    iput-boolean v3, p1, Landroid/support/v4/app/d;->o:Z

    .line 997
    :cond_2d
    :pswitch_6
    if-ge p2, v9, :cond_30

    .line 998
    sget-boolean v0, Landroid/support/v4/app/h;->a:Z

    if-eqz v0, :cond_2e

    const-string v0, "FragmentManager"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "movefrom STARTED: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 10955
    :cond_2e
    iget-object v0, p1, Landroid/support/v4/app/d;->v:Landroid/support/v4/app/h;

    if-eqz v0, :cond_2f

    .line 10956
    iget-object v0, p1, Landroid/support/v4/app/d;->v:Landroid/support/v4/app/h;

    invoke-virtual {v0}, Landroid/support/v4/app/h;->h()V

    .line 10958
    :cond_2f
    iput-boolean v3, p1, Landroid/support/v4/app/d;->G:Z

    .line 11169
    iput-boolean v5, p1, Landroid/support/v4/app/d;->G:Z

    .line 10960
    iget-boolean v0, p1, Landroid/support/v4/app/d;->G:Z

    if-nez v0, :cond_30

    .line 10961
    new-instance v0, Landroid/support/v4/app/o;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " did not call through to super.onStop()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/support/v4/app/o;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1002
    :cond_30
    :pswitch_7
    if-ge p2, v6, :cond_32

    .line 1003
    sget-boolean v0, Landroid/support/v4/app/h;->a:Z

    if-eqz v0, :cond_31

    const-string v0, "FragmentManager"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "movefrom STOPPED: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1004
    :cond_31
    invoke-virtual {p1}, Landroid/support/v4/app/d;->j()V

    .line 1007
    :cond_32
    :pswitch_8
    const/4 v0, 0x2

    if-ge p2, v0, :cond_28

    .line 1008
    sget-boolean v0, Landroid/support/v4/app/h;->a:Z

    if-eqz v0, :cond_33

    const-string v0, "FragmentManager"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "movefrom ACTIVITY_CREATED: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1009
    :cond_33
    iget-object v0, p1, Landroid/support/v4/app/d;->J:Landroid/view/View;

    if-eqz v0, :cond_34

    .line 1012
    iget-object v0, p0, Landroid/support/v4/app/h;->o:Landroid/support/v4/app/e;

    invoke-virtual {v0}, Landroid/support/v4/app/e;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_34

    iget-object v0, p1, Landroid/support/v4/app/d;->f:Landroid/util/SparseArray;

    if-nez v0, :cond_34

    .line 1013
    invoke-direct {p0, p1}, Landroid/support/v4/app/h;->b(Landroid/support/v4/app/d;)V

    .line 11987
    :cond_34
    iget-object v0, p1, Landroid/support/v4/app/d;->v:Landroid/support/v4/app/h;

    if-eqz v0, :cond_35

    .line 11988
    iget-object v0, p1, Landroid/support/v4/app/d;->v:Landroid/support/v4/app/h;

    .line 12948
    invoke-virtual {v0, v5}, Landroid/support/v4/app/h;->a(I)V

    .line 11990
    :cond_35
    iput-boolean v3, p1, Landroid/support/v4/app/d;->G:Z

    .line 13186
    iput-boolean v5, p1, Landroid/support/v4/app/d;->G:Z

    .line 11992
    iget-boolean v0, p1, Landroid/support/v4/app/d;->G:Z

    if-nez v0, :cond_36

    .line 11993
    new-instance v0, Landroid/support/v4/app/o;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " did not call through to super.onDestroyView()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/support/v4/app/o;-><init>(Ljava/lang/String;)V

    throw v0

    .line 11996
    :cond_36
    iget-object v0, p1, Landroid/support/v4/app/d;->N:Landroid/support/v4/app/l;

    if-eqz v0, :cond_37

    .line 11997
    iget-object v0, p1, Landroid/support/v4/app/d;->N:Landroid/support/v4/app/l;

    invoke-virtual {v0}, Landroid/support/v4/app/l;->e()V

    .line 1017
    :cond_37
    iget-object v0, p1, Landroid/support/v4/app/d;->J:Landroid/view/View;

    if-eqz v0, :cond_39

    iget-object v0, p1, Landroid/support/v4/app/d;->I:Landroid/view/ViewGroup;

    if-eqz v0, :cond_39

    .line 1019
    iget v0, p0, Landroid/support/v4/app/h;->n:I

    if-lez v0, :cond_41

    iget-boolean v0, p0, Landroid/support/v4/app/h;->t:Z

    if-nez v0, :cond_41

    .line 1020
    invoke-direct {p0, p1, p3, v3, p4}, Landroid/support/v4/app/h;->a(Landroid/support/v4/app/d;IZI)Landroid/view/animation/Animation;

    move-result-object v0

    .line 1023
    :goto_7
    if-eqz v0, :cond_38

    .line 1025
    iget-object v1, p1, Landroid/support/v4/app/d;->J:Landroid/view/View;

    iput-object v1, p1, Landroid/support/v4/app/d;->c:Landroid/view/View;

    .line 1026
    iput p2, p1, Landroid/support/v4/app/d;->d:I

    .line 1027
    new-instance v1, Landroid/support/v4/app/h$2;

    invoke-direct {v1, p0, p1}, Landroid/support/v4/app/h$2;-><init>(Landroid/support/v4/app/h;Landroid/support/v4/app/d;)V

    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 1043
    iget-object v1, p1, Landroid/support/v4/app/d;->J:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 1045
    :cond_38
    iget-object v0, p1, Landroid/support/v4/app/d;->I:Landroid/view/ViewGroup;

    iget-object v1, p1, Landroid/support/v4/app/d;->J:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 1047
    :cond_39
    iput-object v7, p1, Landroid/support/v4/app/d;->I:Landroid/view/ViewGroup;

    .line 1048
    iput-object v7, p1, Landroid/support/v4/app/d;->J:Landroid/view/View;

    .line 1049
    iput-object v7, p1, Landroid/support/v4/app/d;->K:Landroid/view/View;

    goto/16 :goto_6

    .line 1074
    :cond_3a
    sget-boolean v0, Landroid/support/v4/app/h;->a:Z

    if-eqz v0, :cond_3b

    const-string v0, "FragmentManager"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "movefrom CREATED: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1075
    :cond_3b
    iget-boolean v0, p1, Landroid/support/v4/app/d;->D:Z

    if-nez v0, :cond_3c

    .line 1076
    invoke-virtual {p1}, Landroid/support/v4/app/d;->k()V

    .line 1079
    :cond_3c
    iput-boolean v3, p1, Landroid/support/v4/app/d;->G:Z

    .line 13241
    iput-boolean v5, p1, Landroid/support/v4/app/d;->G:Z

    .line 1081
    iget-boolean v0, p1, Landroid/support/v4/app/d;->G:Z

    if-nez v0, :cond_3d

    .line 1082
    new-instance v0, Landroid/support/v4/app/o;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " did not call through to super.onDetach()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/support/v4/app/o;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1085
    :cond_3d
    if-nez p5, :cond_6

    .line 1086
    iget-boolean v0, p1, Landroid/support/v4/app/d;->D:Z

    if-nez v0, :cond_40

    .line 14175
    iget v0, p1, Landroid/support/v4/app/d;->g:I

    if-ltz v0, :cond_6

    .line 14179
    sget-boolean v0, Landroid/support/v4/app/h;->a:Z

    if-eqz v0, :cond_3e

    const-string v0, "FragmentManager"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Freeing fragment index "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 14180
    :cond_3e
    iget-object v0, p0, Landroid/support/v4/app/h;->f:Ljava/util/ArrayList;

    iget v1, p1, Landroid/support/v4/app/d;->g:I

    invoke-virtual {v0, v1, v7}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 14181
    iget-object v0, p0, Landroid/support/v4/app/h;->h:Ljava/util/ArrayList;

    if-nez v0, :cond_3f

    .line 14182
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroid/support/v4/app/h;->h:Ljava/util/ArrayList;

    .line 14184
    :cond_3f
    iget-object v0, p0, Landroid/support/v4/app/h;->h:Ljava/util/ArrayList;

    iget v1, p1, Landroid/support/v4/app/d;->g:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 14185
    iget-object v0, p0, Landroid/support/v4/app/h;->o:Landroid/support/v4/app/e;

    iget-object v1, p1, Landroid/support/v4/app/d;->h:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/support/v4/app/e;->a(Ljava/lang/String;)V

    .line 14213
    const/4 v0, -0x1

    iput v0, p1, Landroid/support/v4/app/d;->g:I

    .line 14214
    iput-object v7, p1, Landroid/support/v4/app/d;->h:Ljava/lang/String;

    .line 14215
    iput-boolean v3, p1, Landroid/support/v4/app/d;->m:Z

    .line 14216
    iput-boolean v3, p1, Landroid/support/v4/app/d;->n:Z

    .line 14217
    iput-boolean v3, p1, Landroid/support/v4/app/d;->o:Z

    .line 14218
    iput-boolean v3, p1, Landroid/support/v4/app/d;->p:Z

    .line 14219
    iput-boolean v3, p1, Landroid/support/v4/app/d;->q:Z

    .line 14220
    iput-boolean v3, p1, Landroid/support/v4/app/d;->r:Z

    .line 14221
    iput v3, p1, Landroid/support/v4/app/d;->s:I

    .line 14222
    iput-object v7, p1, Landroid/support/v4/app/d;->t:Landroid/support/v4/app/h;

    .line 14223
    iput-object v7, p1, Landroid/support/v4/app/d;->v:Landroid/support/v4/app/h;

    .line 14224
    iput-object v7, p1, Landroid/support/v4/app/d;->u:Landroid/support/v4/app/e;

    .line 14225
    iput v3, p1, Landroid/support/v4/app/d;->x:I

    .line 14226
    iput v3, p1, Landroid/support/v4/app/d;->y:I

    .line 14227
    iput-object v7, p1, Landroid/support/v4/app/d;->z:Ljava/lang/String;

    .line 14228
    iput-boolean v3, p1, Landroid/support/v4/app/d;->A:Z

    .line 14229
    iput-boolean v3, p1, Landroid/support/v4/app/d;->B:Z

    .line 14230
    iput-boolean v3, p1, Landroid/support/v4/app/d;->D:Z

    .line 14231
    iput-object v7, p1, Landroid/support/v4/app/d;->N:Landroid/support/v4/app/l;

    .line 14232
    iput-boolean v3, p1, Landroid/support/v4/app/d;->O:Z

    .line 14233
    iput-boolean v3, p1, Landroid/support/v4/app/d;->P:Z

    goto/16 :goto_1

    .line 1089
    :cond_40
    iput-object v7, p1, Landroid/support/v4/app/d;->u:Landroid/support/v4/app/e;

    .line 1090
    iput-object v7, p1, Landroid/support/v4/app/d;->w:Landroid/support/v4/app/d;

    .line 1091
    iput-object v7, p1, Landroid/support/v4/app/d;->t:Landroid/support/v4/app/h;

    .line 1092
    iput-object v7, p1, Landroid/support/v4/app/d;->v:Landroid/support/v4/app/h;

    goto/16 :goto_1

    :cond_41
    move-object v0, v7

    goto/16 :goto_7

    :cond_42
    move-object v0, v7

    goto/16 :goto_4

    .line 876
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_2
        :pswitch_3
    .end packed-switch

    .line 989
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_4
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
    .end packed-switch
.end method

.method public final a(Landroid/support/v4/app/d;Z)V
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 1190
    iget-object v0, p0, Landroid/support/v4/app/h;->g:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 1191
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroid/support/v4/app/h;->g:Ljava/util/ArrayList;

    .line 1193
    :cond_0
    sget-boolean v0, Landroid/support/v4/app/h;->a:Z

    if-eqz v0, :cond_1

    const-string v0, "FragmentManager"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "add: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 15156
    :cond_1
    iget v0, p1, Landroid/support/v4/app/d;->g:I

    if-gez v0, :cond_4

    .line 15160
    iget-object v0, p0, Landroid/support/v4/app/h;->h:Ljava/util/ArrayList;

    if-eqz v0, :cond_2

    iget-object v0, p0, Landroid/support/v4/app/h;->h:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gtz v0, :cond_5

    .line 15161
    :cond_2
    iget-object v0, p0, Landroid/support/v4/app/h;->f:Ljava/util/ArrayList;

    if-nez v0, :cond_3

    .line 15162
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroid/support/v4/app/h;->f:Ljava/util/ArrayList;

    .line 15164
    :cond_3
    iget-object v0, p0, Landroid/support/v4/app/h;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iget-object v1, p0, Landroid/support/v4/app/h;->q:Landroid/support/v4/app/d;

    invoke-virtual {p1, v0, v1}, Landroid/support/v4/app/d;->a(ILandroid/support/v4/app/d;)V

    .line 15165
    iget-object v0, p0, Landroid/support/v4/app/h;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 15171
    :goto_0
    sget-boolean v0, Landroid/support/v4/app/h;->a:Z

    if-eqz v0, :cond_4

    const-string v0, "FragmentManager"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Allocated fragment index "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1195
    :cond_4
    iget-boolean v0, p1, Landroid/support/v4/app/d;->B:Z

    if-nez v0, :cond_8

    .line 1196
    iget-object v0, p0, Landroid/support/v4/app/h;->g:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 1197
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Fragment already added: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 15168
    :cond_5
    iget-object v0, p0, Landroid/support/v4/app/h;->h:Ljava/util/ArrayList;

    iget-object v1, p0, Landroid/support/v4/app/h;->h:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v1, p0, Landroid/support/v4/app/h;->q:Landroid/support/v4/app/d;

    invoke-virtual {p1, v0, v1}, Landroid/support/v4/app/d;->a(ILandroid/support/v4/app/d;)V

    .line 15169
    iget-object v0, p0, Landroid/support/v4/app/h;->f:Ljava/util/ArrayList;

    iget v1, p1, Landroid/support/v4/app/d;->g:I

    invoke-virtual {v0, v1, p1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 1199
    :cond_6
    iget-object v0, p0, Landroid/support/v4/app/h;->g:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1200
    iput-boolean v3, p1, Landroid/support/v4/app/d;->m:Z

    .line 1201
    const/4 v0, 0x0

    iput-boolean v0, p1, Landroid/support/v4/app/d;->n:Z

    .line 1202
    iget-boolean v0, p1, Landroid/support/v4/app/d;->E:Z

    if-eqz v0, :cond_7

    iget-boolean v0, p1, Landroid/support/v4/app/d;->F:Z

    if-eqz v0, :cond_7

    .line 1203
    iput-boolean v3, p0, Landroid/support/v4/app/h;->r:Z

    .line 1205
    :cond_7
    if-eqz p2, :cond_8

    .line 1206
    invoke-direct {p0, p1}, Landroid/support/v4/app/h;->a(Landroid/support/v4/app/d;)V

    .line 1209
    :cond_8
    return-void
.end method

.method public final a(Landroid/support/v4/app/e;Landroid/support/v4/app/f;Landroid/support/v4/app/d;)V
    .locals 2

    .prologue
    .line 1900
    iget-object v0, p0, Landroid/support/v4/app/h;->o:Landroid/support/v4/app/e;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Already attached"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1901
    :cond_0
    iput-object p1, p0, Landroid/support/v4/app/h;->o:Landroid/support/v4/app/e;

    .line 1902
    iput-object p2, p0, Landroid/support/v4/app/h;->p:Landroid/support/v4/app/f;

    .line 1903
    iput-object p3, p0, Landroid/support/v4/app/h;->q:Landroid/support/v4/app/d;

    .line 1904
    return-void
.end method

.method public final a(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 8

    .prologue
    const/4 v1, 0x0

    .line 635
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "    "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 638
    iget-object v0, p0, Landroid/support/v4/app/h;->f:Ljava/util/ArrayList;

    if-eqz v0, :cond_e

    .line 639
    iget-object v0, p0, Landroid/support/v4/app/h;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v4

    .line 640
    if-lez v4, :cond_e

    .line 641
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "Active Fragments in "

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 642
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 643
    const-string v0, ":"

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    move v2, v1

    .line 644
    :goto_0
    if-ge v2, v4, :cond_e

    .line 645
    iget-object v0, p0, Landroid/support/v4/app/h;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/d;

    .line 646
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v5, "  #"

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(I)V

    .line 647
    const-string v5, ": "

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 648
    if-eqz v0, :cond_d

    .line 2654
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v5, "mFragmentId=#"

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 2655
    iget v5, v0, Landroid/support/v4/app/d;->x:I

    invoke-static {v5}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 2656
    const-string v5, " mContainerId=#"

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 2657
    iget v5, v0, Landroid/support/v4/app/d;->y:I

    invoke-static {v5}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 2658
    const-string v5, " mTag="

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v5, v0, Landroid/support/v4/app/d;->z:Ljava/lang/String;

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 2659
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v5, "mState="

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v5, v0, Landroid/support/v4/app/d;->b:I

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(I)V

    .line 2660
    const-string v5, " mIndex="

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v5, v0, Landroid/support/v4/app/d;->g:I

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(I)V

    .line 2661
    const-string v5, " mWho="

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v5, v0, Landroid/support/v4/app/d;->h:Ljava/lang/String;

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 2662
    const-string v5, " mBackStackNesting="

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v5, v0, Landroid/support/v4/app/d;->s:I

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->println(I)V

    .line 2663
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v5, "mAdded="

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v5, v0, Landroid/support/v4/app/d;->m:Z

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Z)V

    .line 2664
    const-string v5, " mRemoving="

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v5, v0, Landroid/support/v4/app/d;->n:Z

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Z)V

    .line 2665
    const-string v5, " mResumed="

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v5, v0, Landroid/support/v4/app/d;->o:Z

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Z)V

    .line 2666
    const-string v5, " mFromLayout="

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v5, v0, Landroid/support/v4/app/d;->p:Z

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Z)V

    .line 2667
    const-string v5, " mInLayout="

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v5, v0, Landroid/support/v4/app/d;->q:Z

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->println(Z)V

    .line 2668
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v5, "mHidden="

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v5, v0, Landroid/support/v4/app/d;->A:Z

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Z)V

    .line 2669
    const-string v5, " mDetached="

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v5, v0, Landroid/support/v4/app/d;->B:Z

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Z)V

    .line 2670
    const-string v5, " mMenuVisible="

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v5, v0, Landroid/support/v4/app/d;->F:Z

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Z)V

    .line 2671
    const-string v5, " mHasMenu="

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v5, v0, Landroid/support/v4/app/d;->E:Z

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->println(Z)V

    .line 2672
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v5, "mRetainInstance="

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v5, v0, Landroid/support/v4/app/d;->C:Z

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Z)V

    .line 2673
    const-string v5, " mRetaining="

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v5, v0, Landroid/support/v4/app/d;->D:Z

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Z)V

    .line 2674
    const-string v5, " mUserVisibleHint="

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v5, v0, Landroid/support/v4/app/d;->M:Z

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->println(Z)V

    .line 2675
    iget-object v5, v0, Landroid/support/v4/app/d;->t:Landroid/support/v4/app/h;

    if-eqz v5, :cond_0

    .line 2676
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v5, "mFragmentManager="

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 2677
    iget-object v5, v0, Landroid/support/v4/app/d;->t:Landroid/support/v4/app/h;

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 2679
    :cond_0
    iget-object v5, v0, Landroid/support/v4/app/d;->u:Landroid/support/v4/app/e;

    if-eqz v5, :cond_1

    .line 2680
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v5, "mActivity="

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 2681
    iget-object v5, v0, Landroid/support/v4/app/d;->u:Landroid/support/v4/app/e;

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 2683
    :cond_1
    iget-object v5, v0, Landroid/support/v4/app/d;->w:Landroid/support/v4/app/d;

    if-eqz v5, :cond_2

    .line 2684
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v5, "mParentFragment="

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 2685
    iget-object v5, v0, Landroid/support/v4/app/d;->w:Landroid/support/v4/app/d;

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 2687
    :cond_2
    iget-object v5, v0, Landroid/support/v4/app/d;->i:Landroid/os/Bundle;

    if-eqz v5, :cond_3

    .line 2688
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v5, "mArguments="

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v5, v0, Landroid/support/v4/app/d;->i:Landroid/os/Bundle;

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 2690
    :cond_3
    iget-object v5, v0, Landroid/support/v4/app/d;->e:Landroid/os/Bundle;

    if-eqz v5, :cond_4

    .line 2691
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v5, "mSavedFragmentState="

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 2692
    iget-object v5, v0, Landroid/support/v4/app/d;->e:Landroid/os/Bundle;

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 2694
    :cond_4
    iget-object v5, v0, Landroid/support/v4/app/d;->f:Landroid/util/SparseArray;

    if-eqz v5, :cond_5

    .line 2695
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v5, "mSavedViewState="

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 2696
    iget-object v5, v0, Landroid/support/v4/app/d;->f:Landroid/util/SparseArray;

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 2698
    :cond_5
    iget-object v5, v0, Landroid/support/v4/app/d;->j:Landroid/support/v4/app/d;

    if-eqz v5, :cond_6

    .line 2699
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v5, "mTarget="

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v5, v0, Landroid/support/v4/app/d;->j:Landroid/support/v4/app/d;

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/Object;)V

    .line 2700
    const-string v5, " mTargetRequestCode="

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 2701
    iget v5, v0, Landroid/support/v4/app/d;->l:I

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->println(I)V

    .line 2703
    :cond_6
    iget v5, v0, Landroid/support/v4/app/d;->H:I

    if-eqz v5, :cond_7

    .line 2704
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v5, "mNextAnim="

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v5, v0, Landroid/support/v4/app/d;->H:I

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->println(I)V

    .line 2706
    :cond_7
    iget-object v5, v0, Landroid/support/v4/app/d;->I:Landroid/view/ViewGroup;

    if-eqz v5, :cond_8

    .line 2707
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v5, "mContainer="

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v5, v0, Landroid/support/v4/app/d;->I:Landroid/view/ViewGroup;

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 2709
    :cond_8
    iget-object v5, v0, Landroid/support/v4/app/d;->J:Landroid/view/View;

    if-eqz v5, :cond_9

    .line 2710
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v5, "mView="

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v5, v0, Landroid/support/v4/app/d;->J:Landroid/view/View;

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 2712
    :cond_9
    iget-object v5, v0, Landroid/support/v4/app/d;->K:Landroid/view/View;

    if-eqz v5, :cond_a

    .line 2713
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v5, "mInnerView="

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v5, v0, Landroid/support/v4/app/d;->J:Landroid/view/View;

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 2715
    :cond_a
    iget-object v5, v0, Landroid/support/v4/app/d;->c:Landroid/view/View;

    if-eqz v5, :cond_b

    .line 2716
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v5, "mAnimatingAway="

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v5, v0, Landroid/support/v4/app/d;->c:Landroid/view/View;

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 2717
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v5, "mStateAfterAnimating="

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 2718
    iget v5, v0, Landroid/support/v4/app/d;->d:I

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->println(I)V

    .line 2720
    :cond_b
    iget-object v5, v0, Landroid/support/v4/app/d;->N:Landroid/support/v4/app/l;

    if-eqz v5, :cond_c

    .line 2721
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v5, "Loader Manager:"

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 2722
    iget-object v5, v0, Landroid/support/v4/app/d;->N:Landroid/support/v4/app/l;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, "  "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6, p3}, Landroid/support/v4/app/l;->a(Ljava/lang/String;Ljava/io/PrintWriter;)V

    .line 2724
    :cond_c
    iget-object v5, v0, Landroid/support/v4/app/d;->v:Landroid/support/v4/app/h;

    if-eqz v5, :cond_d

    .line 2725
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Child "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v6, v0, Landroid/support/v4/app/d;->v:Landroid/support/v4/app/h;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, ":"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 2726
    iget-object v0, v0, Landroid/support/v4/app/d;->v:Landroid/support/v4/app/h;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, "  "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5, p2, p3, p4}, Landroid/support/v4/app/h;->a(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    .line 644
    :cond_d
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto/16 :goto_0

    .line 655
    :cond_e
    iget-object v0, p0, Landroid/support/v4/app/h;->g:Ljava/util/ArrayList;

    if-eqz v0, :cond_f

    .line 656
    iget-object v0, p0, Landroid/support/v4/app/h;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v4

    .line 657
    if-lez v4, :cond_f

    .line 658
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "Added Fragments:"

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    move v2, v1

    .line 659
    :goto_1
    if-ge v2, v4, :cond_f

    .line 660
    iget-object v0, p0, Landroid/support/v4/app/h;->g:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/d;

    .line 661
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v5, "  #"

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(I)V

    .line 662
    const-string v5, ": "

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/support/v4/app/d;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 659
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_1

    .line 667
    :cond_f
    iget-object v0, p0, Landroid/support/v4/app/h;->j:Ljava/util/ArrayList;

    if-eqz v0, :cond_10

    .line 668
    iget-object v0, p0, Landroid/support/v4/app/h;->j:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v4

    .line 669
    if-lez v4, :cond_10

    .line 670
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "Fragments Created Menus:"

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    move v2, v1

    .line 671
    :goto_2
    if-ge v2, v4, :cond_10

    .line 672
    iget-object v0, p0, Landroid/support/v4/app/h;->j:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/d;

    .line 673
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v5, "  #"

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(I)V

    .line 674
    const-string v5, ": "

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/support/v4/app/d;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 671
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_2

    .line 679
    :cond_10
    iget-object v0, p0, Landroid/support/v4/app/h;->i:Ljava/util/ArrayList;

    if-eqz v0, :cond_11

    .line 680
    iget-object v0, p0, Landroid/support/v4/app/h;->i:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v4

    .line 681
    if-lez v4, :cond_11

    .line 682
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "Back Stack:"

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    move v2, v1

    .line 683
    :goto_3
    if-ge v2, v4, :cond_11

    .line 684
    iget-object v0, p0, Landroid/support/v4/app/h;->i:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/c;

    .line 685
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v5, "  #"

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(I)V

    .line 686
    const-string v5, ": "

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/support/v4/app/c;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 687
    invoke-virtual {v0, v3, p3}, Landroid/support/v4/app/c;->a(Ljava/lang/String;Ljava/io/PrintWriter;)V

    .line 683
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_3

    .line 692
    :cond_11
    monitor-enter p0

    .line 693
    :try_start_0
    iget-object v0, p0, Landroid/support/v4/app/h;->k:Ljava/util/ArrayList;

    if-eqz v0, :cond_12

    .line 694
    iget-object v0, p0, Landroid/support/v4/app/h;->k:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    .line 695
    if-lez v3, :cond_12

    .line 696
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "Back Stack Indices:"

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    move v2, v1

    .line 697
    :goto_4
    if-ge v2, v3, :cond_12

    .line 698
    iget-object v0, p0, Landroid/support/v4/app/h;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/c;

    .line 699
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v4, "  #"

    invoke-virtual {p3, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(I)V

    .line 700
    const-string v4, ": "

    invoke-virtual {p3, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 697
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_4

    .line 705
    :cond_12
    iget-object v0, p0, Landroid/support/v4/app/h;->l:Ljava/util/ArrayList;

    if-eqz v0, :cond_13

    iget-object v0, p0, Landroid/support/v4/app/h;->l:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_13

    .line 706
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mAvailBackStackIndices: "

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 707
    iget-object v0, p0, Landroid/support/v4/app/h;->l:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->toArray()[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 709
    :cond_13
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 711
    iget-object v0, p0, Landroid/support/v4/app/h;->c:Ljava/util/ArrayList;

    if-eqz v0, :cond_14

    .line 712
    iget-object v0, p0, Landroid/support/v4/app/h;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    .line 713
    if-lez v2, :cond_14

    .line 714
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "Pending Actions:"

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 715
    :goto_5
    if-ge v1, v2, :cond_14

    .line 716
    iget-object v0, p0, Landroid/support/v4/app/h;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Runnable;

    .line 717
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v3, "  #"

    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(I)V

    .line 718
    const-string v3, ": "

    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 715
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_5

    .line 709
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    .line 723
    :cond_14
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "FragmentManager misc state:"

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 724
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "  mActivity="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroid/support/v4/app/h;->o:Landroid/support/v4/app/e;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 725
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "  mContainer="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroid/support/v4/app/h;->p:Landroid/support/v4/app/f;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 726
    iget-object v0, p0, Landroid/support/v4/app/h;->q:Landroid/support/v4/app/d;

    if-eqz v0, :cond_15

    .line 727
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "  mParent="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroid/support/v4/app/h;->q:Landroid/support/v4/app/d;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 729
    :cond_15
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "  mCurState="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v0, p0, Landroid/support/v4/app/h;->n:I

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(I)V

    .line 730
    const-string v0, " mStateSaved="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroid/support/v4/app/h;->s:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V

    .line 731
    const-string v0, " mDestroyed="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroid/support/v4/app/h;->t:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Z)V

    .line 732
    iget-boolean v0, p0, Landroid/support/v4/app/h;->r:Z

    if-eqz v0, :cond_16

    .line 733
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "  mNeedMenuInvalidate="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 734
    iget-boolean v0, p0, Landroid/support/v4/app/h;->r:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Z)V

    .line 736
    :cond_16
    iget-object v0, p0, Landroid/support/v4/app/h;->u:Ljava/lang/String;

    if-eqz v0, :cond_17

    .line 737
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "  mNoTransactionsBecause="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 738
    iget-object v0, p0, Landroid/support/v4/app/h;->u:Ljava/lang/String;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 740
    :cond_17
    iget-object v0, p0, Landroid/support/v4/app/h;->h:Ljava/util/ArrayList;

    if-eqz v0, :cond_18

    iget-object v0, p0, Landroid/support/v4/app/h;->h:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_18

    .line 741
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "  mAvailIndices: "

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 742
    iget-object v0, p0, Landroid/support/v4/app/h;->h:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->toArray()[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 744
    :cond_18
    return-void
.end method

.method public final a()Z
    .locals 6

    .prologue
    const/4 v0, 0x1

    const/4 v2, 0x0

    .line 1460
    iget-boolean v1, p0, Landroid/support/v4/app/h;->e:Z

    if-eqz v1, :cond_0

    .line 1461
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Recursive entry to executePendingTransactions"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1464
    :cond_0
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    iget-object v3, p0, Landroid/support/v4/app/h;->o:Landroid/support/v4/app/e;

    iget-object v3, v3, Landroid/support/v4/app/e;->a:Landroid/os/Handler;

    invoke-virtual {v3}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v3

    if-eq v1, v3, :cond_1

    .line 1465
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Must be called from main thread of process"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    move v1, v2

    .line 1473
    :goto_0
    monitor-enter p0

    .line 1474
    :try_start_0
    iget-object v3, p0, Landroid/support/v4/app/h;->c:Ljava/util/ArrayList;

    if-eqz v3, :cond_2

    iget-object v3, p0, Landroid/support/v4/app/h;->c:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-nez v3, :cond_4

    .line 1475
    :cond_2
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1496
    iget-boolean v0, p0, Landroid/support/v4/app/h;->v:Z

    if-eqz v0, :cond_9

    move v3, v2

    move v4, v2

    .line 1498
    :goto_1
    iget-object v0, p0, Landroid/support/v4/app/h;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v3, v0, :cond_8

    .line 1499
    iget-object v0, p0, Landroid/support/v4/app/h;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/d;

    .line 1500
    if-eqz v0, :cond_3

    iget-object v5, v0, Landroid/support/v4/app/d;->N:Landroid/support/v4/app/l;

    if-eqz v5, :cond_3

    .line 1501
    iget-object v0, v0, Landroid/support/v4/app/d;->N:Landroid/support/v4/app/l;

    invoke-virtual {v0}, Landroid/support/v4/app/l;->a()Z

    move-result v0

    or-int/2addr v4, v0

    .line 1498
    :cond_3
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_1

    .line 1478
    :cond_4
    :try_start_1
    iget-object v1, p0, Landroid/support/v4/app/h;->c:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v3

    .line 1479
    iget-object v1, p0, Landroid/support/v4/app/h;->d:[Ljava/lang/Runnable;

    if-eqz v1, :cond_5

    iget-object v1, p0, Landroid/support/v4/app/h;->d:[Ljava/lang/Runnable;

    array-length v1, v1

    if-ge v1, v3, :cond_6

    .line 1480
    :cond_5
    new-array v1, v3, [Ljava/lang/Runnable;

    iput-object v1, p0, Landroid/support/v4/app/h;->d:[Ljava/lang/Runnable;

    .line 1482
    :cond_6
    iget-object v1, p0, Landroid/support/v4/app/h;->c:Ljava/util/ArrayList;

    iget-object v4, p0, Landroid/support/v4/app/h;->d:[Ljava/lang/Runnable;

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 1483
    iget-object v1, p0, Landroid/support/v4/app/h;->c:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 1484
    iget-object v1, p0, Landroid/support/v4/app/h;->o:Landroid/support/v4/app/e;

    iget-object v1, v1, Landroid/support/v4/app/e;->a:Landroid/os/Handler;

    iget-object v4, p0, Landroid/support/v4/app/h;->y:Ljava/lang/Runnable;

    invoke-virtual {v1, v4}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 1485
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1487
    iput-boolean v0, p0, Landroid/support/v4/app/h;->e:Z

    move v1, v2

    .line 1488
    :goto_2
    if-ge v1, v3, :cond_7

    .line 1489
    iget-object v4, p0, Landroid/support/v4/app/h;->d:[Ljava/lang/Runnable;

    aget-object v4, v4, v1

    invoke-interface {v4}, Ljava/lang/Runnable;->run()V

    .line 1490
    iget-object v4, p0, Landroid/support/v4/app/h;->d:[Ljava/lang/Runnable;

    const/4 v5, 0x0

    aput-object v5, v4, v1

    .line 1488
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 1485
    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    .line 1492
    :cond_7
    iput-boolean v2, p0, Landroid/support/v4/app/h;->e:Z

    move v1, v0

    .line 1494
    goto :goto_0

    .line 1504
    :cond_8
    if-nez v4, :cond_9

    .line 1505
    iput-boolean v2, p0, Landroid/support/v4/app/h;->v:Z

    .line 1506
    invoke-direct {p0}, Landroid/support/v4/app/h;->k()V

    .line 1509
    :cond_9
    return v1
.end method

.method public final a(Landroid/view/Menu;)Z
    .locals 7

    .prologue
    const/4 v5, 0x1

    const/4 v2, 0x0

    .line 2015
    .line 2016
    iget-object v0, p0, Landroid/support/v4/app/h;->g:Ljava/util/ArrayList;

    if-eqz v0, :cond_2

    move v1, v2

    move v3, v2

    .line 2017
    :goto_0
    iget-object v0, p0, Landroid/support/v4/app/h;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_3

    .line 2018
    iget-object v0, p0, Landroid/support/v4/app/h;->g:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/d;

    .line 2019
    if-eqz v0, :cond_1

    .line 17879
    iget-boolean v4, v0, Landroid/support/v4/app/d;->A:Z

    if-nez v4, :cond_5

    .line 17880
    iget-boolean v4, v0, Landroid/support/v4/app/d;->E:Z

    if-eqz v4, :cond_4

    iget-boolean v4, v0, Landroid/support/v4/app/d;->F:Z

    if-eqz v4, :cond_4

    move v4, v5

    .line 17884
    :goto_1
    iget-object v6, v0, Landroid/support/v4/app/d;->v:Landroid/support/v4/app/h;

    if-eqz v6, :cond_0

    .line 17885
    iget-object v0, v0, Landroid/support/v4/app/d;->v:Landroid/support/v4/app/h;

    invoke-virtual {v0, p1}, Landroid/support/v4/app/h;->a(Landroid/view/Menu;)Z

    move-result v0

    or-int/2addr v4, v0

    .line 2020
    :cond_0
    :goto_2
    if-eqz v4, :cond_1

    move v3, v5

    .line 2017
    :cond_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :cond_2
    move v3, v2

    .line 2026
    :cond_3
    return v3

    :cond_4
    move v4, v2

    goto :goto_1

    :cond_5
    move v4, v2

    goto :goto_2
.end method

.method public final a(Landroid/view/Menu;Landroid/view/MenuInflater;)Z
    .locals 8

    .prologue
    const/4 v2, 0x1

    const/4 v5, 0x0

    .line 1983
    .line 1984
    const/4 v1, 0x0

    .line 1985
    iget-object v0, p0, Landroid/support/v4/app/h;->g:Ljava/util/ArrayList;

    if-eqz v0, :cond_2

    move v4, v5

    move v3, v5

    .line 1986
    :goto_0
    iget-object v0, p0, Landroid/support/v4/app/h;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v4, v0, :cond_3

    .line 1987
    iget-object v0, p0, Landroid/support/v4/app/h;->g:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/d;

    .line 1988
    if-eqz v0, :cond_7

    .line 17865
    iget-boolean v6, v0, Landroid/support/v4/app/d;->A:Z

    if-nez v6, :cond_9

    .line 17866
    iget-boolean v6, v0, Landroid/support/v4/app/d;->E:Z

    if-eqz v6, :cond_8

    iget-boolean v6, v0, Landroid/support/v4/app/d;->F:Z

    if-eqz v6, :cond_8

    move v6, v2

    .line 17870
    :goto_1
    iget-object v7, v0, Landroid/support/v4/app/d;->v:Landroid/support/v4/app/h;

    if-eqz v7, :cond_0

    .line 17871
    iget-object v7, v0, Landroid/support/v4/app/d;->v:Landroid/support/v4/app/h;

    invoke-virtual {v7, p1, p2}, Landroid/support/v4/app/h;->a(Landroid/view/Menu;Landroid/view/MenuInflater;)Z

    move-result v7

    or-int/2addr v6, v7

    .line 1989
    :cond_0
    :goto_2
    if-eqz v6, :cond_7

    .line 1991
    if-nez v1, :cond_1

    .line 1992
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 1994
    :cond_1
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v0, v2

    .line 1986
    :goto_3
    add-int/lit8 v3, v4, 0x1

    move v4, v3

    move v3, v0

    goto :goto_0

    :cond_2
    move v3, v5

    .line 2000
    :cond_3
    iget-object v0, p0, Landroid/support/v4/app/h;->j:Ljava/util/ArrayList;

    if-eqz v0, :cond_6

    .line 2001
    :goto_4
    iget-object v0, p0, Landroid/support/v4/app/h;->j:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v5, v0, :cond_6

    .line 2002
    iget-object v0, p0, Landroid/support/v4/app/h;->j:Ljava/util/ArrayList;

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/d;

    .line 2003
    if-eqz v1, :cond_4

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 2004
    :cond_4
    invoke-static {}, Landroid/support/v4/app/d;->f()V

    .line 2001
    :cond_5
    add-int/lit8 v5, v5, 0x1

    goto :goto_4

    .line 2009
    :cond_6
    iput-object v1, p0, Landroid/support/v4/app/h;->j:Ljava/util/ArrayList;

    .line 2011
    return v3

    :cond_7
    move v0, v3

    goto :goto_3

    :cond_8
    move v6, v5

    goto :goto_1

    :cond_9
    move v6, v5

    goto :goto_2
.end method

.method public final a(Landroid/view/MenuItem;)Z
    .locals 5

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 2030
    iget-object v0, p0, Landroid/support/v4/app/h;->g:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    move v1, v2

    .line 2031
    :goto_0
    iget-object v0, p0, Landroid/support/v4/app/h;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_0

    .line 2032
    iget-object v0, p0, Landroid/support/v4/app/h;->g:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/d;

    .line 2033
    if-eqz v0, :cond_2

    .line 17892
    iget-boolean v4, v0, Landroid/support/v4/app/d;->A:Z

    if-nez v4, :cond_1

    .line 17898
    iget-object v4, v0, Landroid/support/v4/app/d;->v:Landroid/support/v4/app/h;

    if-eqz v4, :cond_1

    .line 17899
    iget-object v0, v0, Landroid/support/v4/app/d;->v:Landroid/support/v4/app/h;

    invoke-virtual {v0, p1}, Landroid/support/v4/app/h;->a(Landroid/view/MenuItem;)Z

    move-result v0

    if-eqz v0, :cond_1

    move v0, v3

    .line 2034
    :goto_1
    if-eqz v0, :cond_2

    move v2, v3

    .line 2040
    :cond_0
    return v2

    :cond_1
    move v0, v2

    .line 17904
    goto :goto_1

    .line 2031
    :cond_2
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0
.end method

.method final b()V
    .locals 2

    .prologue
    .line 1513
    iget-object v0, p0, Landroid/support/v4/app/h;->m:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    .line 1514
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Landroid/support/v4/app/h;->m:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 1515
    iget-object v1, p0, Landroid/support/v4/app/h;->m:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1514
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 1518
    :cond_0
    return-void
.end method

.method public final b(Landroid/support/v4/app/d;II)V
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 1229
    sget-boolean v0, Landroid/support/v4/app/h;->a:Z

    if-eqz v0, :cond_0

    const-string v0, "FragmentManager"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "hide: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1230
    :cond_0
    iget-boolean v0, p1, Landroid/support/v4/app/d;->A:Z

    if-nez v0, :cond_4

    .line 1231
    iput-boolean v3, p1, Landroid/support/v4/app/d;->A:Z

    .line 1232
    iget-object v0, p1, Landroid/support/v4/app/d;->J:Landroid/view/View;

    if-eqz v0, :cond_2

    .line 1233
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0, p3}, Landroid/support/v4/app/h;->a(Landroid/support/v4/app/d;IZI)Landroid/view/animation/Animation;

    move-result-object v0

    .line 1235
    if-eqz v0, :cond_1

    .line 1236
    iget-object v1, p1, Landroid/support/v4/app/d;->J:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 1238
    :cond_1
    iget-object v0, p1, Landroid/support/v4/app/d;->J:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 1240
    :cond_2
    iget-boolean v0, p1, Landroid/support/v4/app/d;->m:Z

    if-eqz v0, :cond_3

    iget-boolean v0, p1, Landroid/support/v4/app/d;->E:Z

    if-eqz v0, :cond_3

    iget-boolean v0, p1, Landroid/support/v4/app/d;->F:Z

    if-eqz v0, :cond_3

    .line 1241
    iput-boolean v3, p0, Landroid/support/v4/app/h;->r:Z

    .line 1243
    :cond_3
    invoke-static {}, Landroid/support/v4/app/d;->a()V

    .line 1245
    :cond_4
    return-void
.end method

.method public final b(Landroid/view/Menu;)V
    .locals 3

    .prologue
    .line 2058
    iget-object v0, p0, Landroid/support/v4/app/h;->g:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    .line 2059
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v0, p0, Landroid/support/v4/app/h;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 2060
    iget-object v0, p0, Landroid/support/v4/app/h;->g:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/d;

    .line 2061
    if-eqz v0, :cond_0

    .line 17922
    iget-boolean v2, v0, Landroid/support/v4/app/d;->A:Z

    if-nez v2, :cond_0

    .line 17926
    iget-object v2, v0, Landroid/support/v4/app/d;->v:Landroid/support/v4/app/h;

    if-eqz v2, :cond_0

    .line 17927
    iget-object v0, v0, Landroid/support/v4/app/d;->v:Landroid/support/v4/app/h;

    invoke-virtual {v0, p1}, Landroid/support/v4/app/h;->b(Landroid/view/Menu;)V

    .line 2059
    :cond_0
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 2066
    :cond_1
    return-void
.end method

.method public final b(Landroid/view/MenuItem;)Z
    .locals 5

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 2044
    iget-object v0, p0, Landroid/support/v4/app/h;->g:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    move v1, v2

    .line 2045
    :goto_0
    iget-object v0, p0, Landroid/support/v4/app/h;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_0

    .line 2046
    iget-object v0, p0, Landroid/support/v4/app/h;->g:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/d;

    .line 2047
    if-eqz v0, :cond_2

    .line 17908
    iget-boolean v4, v0, Landroid/support/v4/app/d;->A:Z

    if-nez v4, :cond_1

    .line 17912
    iget-object v4, v0, Landroid/support/v4/app/d;->v:Landroid/support/v4/app/h;

    if-eqz v4, :cond_1

    .line 17913
    iget-object v0, v0, Landroid/support/v4/app/d;->v:Landroid/support/v4/app/h;

    invoke-virtual {v0, p1}, Landroid/support/v4/app/h;->b(Landroid/view/MenuItem;)Z

    move-result v0

    if-eqz v0, :cond_1

    move v0, v3

    .line 2048
    :goto_1
    if-eqz v0, :cond_2

    move v2, v3

    .line 2054
    :cond_0
    return v2

    :cond_1
    move v0, v2

    .line 17918
    goto :goto_1

    .line 2045
    :cond_2
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0
.end method

.method final c()Landroid/os/Parcelable;
    .locals 14

    .prologue
    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v2, 0x0

    .line 1672
    invoke-virtual {p0}, Landroid/support/v4/app/h;->a()Z

    .line 1674
    sget-boolean v0, Landroid/support/v4/app/h;->b:Z

    if-eqz v0, :cond_0

    .line 1684
    iput-boolean v3, p0, Landroid/support/v4/app/h;->s:Z

    .line 1687
    :cond_0
    iget-object v0, p0, Landroid/support/v4/app/h;->f:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroid/support/v4/app/h;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gtz v0, :cond_2

    .line 1782
    :cond_1
    :goto_0
    return-object v2

    .line 1692
    :cond_2
    iget-object v0, p0, Landroid/support/v4/app/h;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v6

    .line 1693
    new-array v7, v6, [Landroid/support/v4/app/FragmentState;

    move v5, v4

    move v1, v4

    .line 1695
    :goto_1
    if-ge v5, v6, :cond_10

    .line 1696
    iget-object v0, p0, Landroid/support/v4/app/h;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/d;

    .line 1697
    if-eqz v0, :cond_19

    .line 1698
    iget v1, v0, Landroid/support/v4/app/d;->g:I

    if-gez v1, :cond_3

    .line 1699
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "Failure saving state: active "

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v9, " has cleared index: "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    iget v9, v0, Landroid/support/v4/app/d;->g:I

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-direct {v1, v8}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v1}, Landroid/support/v4/app/h;->a(Ljava/lang/RuntimeException;)V

    .line 1706
    :cond_3
    new-instance v8, Landroid/support/v4/app/FragmentState;

    invoke-direct {v8, v0}, Landroid/support/v4/app/FragmentState;-><init>(Landroid/support/v4/app/d;)V

    .line 1707
    aput-object v8, v7, v5

    .line 1709
    iget v1, v0, Landroid/support/v4/app/d;->b:I

    if-lez v1, :cond_f

    iget-object v1, v8, Landroid/support/v4/app/FragmentState;->j:Landroid/os/Bundle;

    if-nez v1, :cond_f

    .line 15639
    iget-object v1, p0, Landroid/support/v4/app/h;->w:Landroid/os/Bundle;

    if-nez v1, :cond_4

    .line 15640
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    iput-object v1, p0, Landroid/support/v4/app/h;->w:Landroid/os/Bundle;

    .line 15642
    :cond_4
    iget-object v1, p0, Landroid/support/v4/app/h;->w:Landroid/os/Bundle;

    invoke-virtual {v0, v1}, Landroid/support/v4/app/d;->a(Landroid/os/Bundle;)V

    .line 15643
    iget-object v1, p0, Landroid/support/v4/app/h;->w:Landroid/os/Bundle;

    invoke-virtual {v1}, Landroid/os/Bundle;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_18

    .line 15644
    iget-object v1, p0, Landroid/support/v4/app/h;->w:Landroid/os/Bundle;

    .line 15645
    iput-object v2, p0, Landroid/support/v4/app/h;->w:Landroid/os/Bundle;

    .line 15648
    :goto_2
    iget-object v9, v0, Landroid/support/v4/app/d;->J:Landroid/view/View;

    if-eqz v9, :cond_5

    .line 15649
    invoke-direct {p0, v0}, Landroid/support/v4/app/h;->b(Landroid/support/v4/app/d;)V

    .line 15651
    :cond_5
    iget-object v9, v0, Landroid/support/v4/app/d;->f:Landroid/util/SparseArray;

    if-eqz v9, :cond_7

    .line 15652
    if-nez v1, :cond_6

    .line 15653
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 15655
    :cond_6
    const-string v9, "android:view_state"

    iget-object v10, v0, Landroid/support/v4/app/d;->f:Landroid/util/SparseArray;

    invoke-virtual {v1, v9, v10}, Landroid/os/Bundle;->putSparseParcelableArray(Ljava/lang/String;Landroid/util/SparseArray;)V

    .line 15658
    :cond_7
    iget-boolean v9, v0, Landroid/support/v4/app/d;->M:Z

    if-nez v9, :cond_9

    .line 15659
    if-nez v1, :cond_8

    .line 15660
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 15663
    :cond_8
    const-string v9, "android:user_visible_hint"

    iget-boolean v10, v0, Landroid/support/v4/app/d;->M:Z

    invoke-virtual {v1, v9, v10}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 1710
    :cond_9
    iput-object v1, v8, Landroid/support/v4/app/FragmentState;->j:Landroid/os/Bundle;

    .line 1712
    iget-object v1, v0, Landroid/support/v4/app/d;->j:Landroid/support/v4/app/d;

    if-eqz v1, :cond_d

    .line 1713
    iget-object v1, v0, Landroid/support/v4/app/d;->j:Landroid/support/v4/app/d;

    iget v1, v1, Landroid/support/v4/app/d;->g:I

    if-gez v1, :cond_a

    .line 1714
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "Failure saving state: "

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v9

    const-string v10, " has target not in fragment manager: "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    iget-object v10, v0, Landroid/support/v4/app/d;->j:Landroid/support/v4/app/d;

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-direct {v1, v9}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v1}, Landroid/support/v4/app/h;->a(Ljava/lang/RuntimeException;)V

    .line 1718
    :cond_a
    iget-object v1, v8, Landroid/support/v4/app/FragmentState;->j:Landroid/os/Bundle;

    if-nez v1, :cond_b

    .line 1719
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    iput-object v1, v8, Landroid/support/v4/app/FragmentState;->j:Landroid/os/Bundle;

    .line 1721
    :cond_b
    iget-object v1, v8, Landroid/support/v4/app/FragmentState;->j:Landroid/os/Bundle;

    const-string v9, "android:target_state"

    iget-object v10, v0, Landroid/support/v4/app/d;->j:Landroid/support/v4/app/d;

    .line 16570
    iget v11, v10, Landroid/support/v4/app/d;->g:I

    if-gez v11, :cond_c

    .line 16571
    new-instance v11, Ljava/lang/IllegalStateException;

    new-instance v12, Ljava/lang/StringBuilder;

    const-string v13, "Fragment "

    invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v12

    const-string v13, " is not currently in the FragmentManager"

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-direct {v11, v12}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v11}, Landroid/support/v4/app/h;->a(Ljava/lang/RuntimeException;)V

    .line 16574
    :cond_c
    iget v10, v10, Landroid/support/v4/app/d;->g:I

    invoke-virtual {v1, v9, v10}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 1723
    iget v1, v0, Landroid/support/v4/app/d;->l:I

    if-eqz v1, :cond_d

    .line 1724
    iget-object v1, v8, Landroid/support/v4/app/FragmentState;->j:Landroid/os/Bundle;

    const-string v9, "android:target_req_state"

    iget v10, v0, Landroid/support/v4/app/d;->l:I

    invoke-virtual {v1, v9, v10}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 1734
    :cond_d
    :goto_3
    sget-boolean v1, Landroid/support/v4/app/h;->a:Z

    if-eqz v1, :cond_e

    const-string v1, "FragmentManager"

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "Saved state of "

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v9, ": "

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v8, v8, Landroid/support/v4/app/FragmentState;->j:Landroid/os/Bundle;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_e
    move v0, v3

    .line 1695
    :goto_4
    add-int/lit8 v1, v5, 0x1

    move v5, v1

    move v1, v0

    goto/16 :goto_1

    .line 1731
    :cond_f
    iget-object v1, v0, Landroid/support/v4/app/d;->e:Landroid/os/Bundle;

    iput-object v1, v8, Landroid/support/v4/app/FragmentState;->j:Landroid/os/Bundle;

    goto :goto_3

    .line 1739
    :cond_10
    if-nez v1, :cond_11

    .line 1740
    sget-boolean v0, Landroid/support/v4/app/h;->a:Z

    if-eqz v0, :cond_1

    const-string v0, "FragmentManager"

    const-string v1, "saveAllState: no fragments!"

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_0

    .line 1748
    :cond_11
    iget-object v0, p0, Landroid/support/v4/app/h;->g:Ljava/util/ArrayList;

    if-eqz v0, :cond_14

    .line 1749
    iget-object v0, p0, Landroid/support/v4/app/h;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v5

    .line 1750
    if-lez v5, :cond_14

    .line 1751
    new-array v1, v5, [I

    move v3, v4

    .line 1752
    :goto_5
    if-ge v3, v5, :cond_15

    .line 1753
    iget-object v0, p0, Landroid/support/v4/app/h;->g:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/d;

    iget v0, v0, Landroid/support/v4/app/d;->g:I

    aput v0, v1, v3

    .line 1754
    aget v0, v1, v3

    if-gez v0, :cond_12

    .line 1755
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v8, "Failure saving state: active "

    invoke-direct {v6, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v8, p0, Landroid/support/v4/app/h;->g:Ljava/util/ArrayList;

    invoke-virtual {v8, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v8, " has cleared index: "

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    aget v8, v1, v3

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v0, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0}, Landroid/support/v4/app/h;->a(Ljava/lang/RuntimeException;)V

    .line 1759
    :cond_12
    sget-boolean v0, Landroid/support/v4/app/h;->a:Z

    if-eqz v0, :cond_13

    const-string v0, "FragmentManager"

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v8, "saveAllState: adding fragment #"

    invoke-direct {v6, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v8, ": "

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    iget-object v8, p0, Landroid/support/v4/app/h;->g:Ljava/util/ArrayList;

    invoke-virtual {v8, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v0, v6}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1752
    :cond_13
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_5

    :cond_14
    move-object v1, v2

    .line 1766
    :cond_15
    iget-object v0, p0, Landroid/support/v4/app/h;->i:Ljava/util/ArrayList;

    if-eqz v0, :cond_17

    .line 1767
    iget-object v0, p0, Landroid/support/v4/app/h;->i:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v5

    .line 1768
    if-lez v5, :cond_17

    .line 1769
    new-array v2, v5, [Landroid/support/v4/app/BackStackState;

    move v3, v4

    .line 1770
    :goto_6
    if-ge v3, v5, :cond_17

    .line 1771
    new-instance v4, Landroid/support/v4/app/BackStackState;

    iget-object v0, p0, Landroid/support/v4/app/h;->i:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/c;

    invoke-direct {v4, v0}, Landroid/support/v4/app/BackStackState;-><init>(Landroid/support/v4/app/c;)V

    aput-object v4, v2, v3

    .line 1772
    sget-boolean v0, Landroid/support/v4/app/h;->a:Z

    if-eqz v0, :cond_16

    const-string v0, "FragmentManager"

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v6, "saveAllState: adding back stack #"

    invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v6, ": "

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    iget-object v6, p0, Landroid/support/v4/app/h;->i:Ljava/util/ArrayList;

    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1770
    :cond_16
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_6

    .line 1778
    :cond_17
    new-instance v0, Landroid/support/v4/app/FragmentManagerState;

    invoke-direct {v0}, Landroid/support/v4/app/FragmentManagerState;-><init>()V

    .line 1779
    iput-object v7, v0, Landroid/support/v4/app/FragmentManagerState;->a:[Landroid/support/v4/app/FragmentState;

    .line 1780
    iput-object v1, v0, Landroid/support/v4/app/FragmentManagerState;->b:[I

    .line 1781
    iput-object v2, v0, Landroid/support/v4/app/FragmentManagerState;->c:[Landroid/support/v4/app/BackStackState;

    move-object v2, v0

    .line 1782
    goto/16 :goto_0

    :cond_18
    move-object v1, v2

    goto/16 :goto_2

    :cond_19
    move v0, v1

    goto/16 :goto_4
.end method

.method public final c(Landroid/support/v4/app/d;II)V
    .locals 5

    .prologue
    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 1248
    sget-boolean v0, Landroid/support/v4/app/h;->a:Z

    if-eqz v0, :cond_0

    const-string v0, "FragmentManager"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "show: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1249
    :cond_0
    iget-boolean v0, p1, Landroid/support/v4/app/d;->A:Z

    if-eqz v0, :cond_4

    .line 1250
    iput-boolean v3, p1, Landroid/support/v4/app/d;->A:Z

    .line 1251
    iget-object v0, p1, Landroid/support/v4/app/d;->J:Landroid/view/View;

    if-eqz v0, :cond_2

    .line 1252
    invoke-direct {p0, p1, p2, v4, p3}, Landroid/support/v4/app/h;->a(Landroid/support/v4/app/d;IZI)Landroid/view/animation/Animation;

    move-result-object v0

    .line 1254
    if-eqz v0, :cond_1

    .line 1255
    iget-object v1, p1, Landroid/support/v4/app/d;->J:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 1257
    :cond_1
    iget-object v0, p1, Landroid/support/v4/app/d;->J:Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 1259
    :cond_2
    iget-boolean v0, p1, Landroid/support/v4/app/d;->m:Z

    if-eqz v0, :cond_3

    iget-boolean v0, p1, Landroid/support/v4/app/d;->E:Z

    if-eqz v0, :cond_3

    iget-boolean v0, p1, Landroid/support/v4/app/d;->F:Z

    if-eqz v0, :cond_3

    .line 1260
    iput-boolean v4, p0, Landroid/support/v4/app/h;->r:Z

    .line 1262
    :cond_3
    invoke-static {}, Landroid/support/v4/app/d;->a()V

    .line 1264
    :cond_4
    return-void
.end method

.method public final d()V
    .locals 1

    .prologue
    .line 1911
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/v4/app/h;->s:Z

    .line 1912
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroid/support/v4/app/h;->a(I)V

    .line 1913
    return-void
.end method

.method public final d(Landroid/support/v4/app/d;II)V
    .locals 6

    .prologue
    const/4 v5, 0x0

    const/4 v2, 0x1

    .line 1267
    sget-boolean v0, Landroid/support/v4/app/h;->a:Z

    if-eqz v0, :cond_0

    const-string v0, "FragmentManager"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "detach: "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1268
    :cond_0
    iget-boolean v0, p1, Landroid/support/v4/app/d;->B:Z

    if-nez v0, :cond_4

    .line 1269
    iput-boolean v2, p1, Landroid/support/v4/app/d;->B:Z

    .line 1270
    iget-boolean v0, p1, Landroid/support/v4/app/d;->m:Z

    if-eqz v0, :cond_4

    .line 1272
    iget-object v0, p0, Landroid/support/v4/app/h;->g:Ljava/util/ArrayList;

    if-eqz v0, :cond_2

    .line 1273
    sget-boolean v0, Landroid/support/v4/app/h;->a:Z

    if-eqz v0, :cond_1

    const-string v0, "FragmentManager"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "remove from detach: "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1274
    :cond_1
    iget-object v0, p0, Landroid/support/v4/app/h;->g:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 1276
    :cond_2
    iget-boolean v0, p1, Landroid/support/v4/app/d;->E:Z

    if-eqz v0, :cond_3

    iget-boolean v0, p1, Landroid/support/v4/app/d;->F:Z

    if-eqz v0, :cond_3

    .line 1277
    iput-boolean v2, p0, Landroid/support/v4/app/h;->r:Z

    .line 1279
    :cond_3
    iput-boolean v5, p1, Landroid/support/v4/app/d;->m:Z

    move-object v0, p0

    move-object v1, p1

    move v3, p2

    move v4, p3

    .line 1280
    invoke-virtual/range {v0 .. v5}, Landroid/support/v4/app/h;->a(Landroid/support/v4/app/d;IIIZ)V

    .line 1283
    :cond_4
    return-void
.end method

.method public final e()V
    .locals 1

    .prologue
    .line 1916
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/v4/app/h;->s:Z

    .line 1917
    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Landroid/support/v4/app/h;->a(I)V

    .line 1918
    return-void
.end method

.method public final e(Landroid/support/v4/app/d;II)V
    .locals 6

    .prologue
    const/4 v3, 0x1

    const/4 v5, 0x0

    .line 1286
    sget-boolean v0, Landroid/support/v4/app/h;->a:Z

    if-eqz v0, :cond_0

    const-string v0, "FragmentManager"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "attach: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1287
    :cond_0
    iget-boolean v0, p1, Landroid/support/v4/app/d;->B:Z

    if-eqz v0, :cond_5

    .line 1288
    iput-boolean v5, p1, Landroid/support/v4/app/d;->B:Z

    .line 1289
    iget-boolean v0, p1, Landroid/support/v4/app/d;->m:Z

    if-nez v0, :cond_5

    .line 1290
    iget-object v0, p0, Landroid/support/v4/app/h;->g:Ljava/util/ArrayList;

    if-nez v0, :cond_1

    .line 1291
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroid/support/v4/app/h;->g:Ljava/util/ArrayList;

    .line 1293
    :cond_1
    iget-object v0, p0, Landroid/support/v4/app/h;->g:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1294
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Fragment already added: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1296
    :cond_2
    sget-boolean v0, Landroid/support/v4/app/h;->a:Z

    if-eqz v0, :cond_3

    const-string v0, "FragmentManager"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "add from attach: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1297
    :cond_3
    iget-object v0, p0, Landroid/support/v4/app/h;->g:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1298
    iput-boolean v3, p1, Landroid/support/v4/app/d;->m:Z

    .line 1299
    iget-boolean v0, p1, Landroid/support/v4/app/d;->E:Z

    if-eqz v0, :cond_4

    iget-boolean v0, p1, Landroid/support/v4/app/d;->F:Z

    if-eqz v0, :cond_4

    .line 1300
    iput-boolean v3, p0, Landroid/support/v4/app/h;->r:Z

    .line 1302
    :cond_4
    iget v2, p0, Landroid/support/v4/app/h;->n:I

    move-object v0, p0

    move-object v1, p1

    move v3, p2

    move v4, p3

    invoke-virtual/range {v0 .. v5}, Landroid/support/v4/app/h;->a(Landroid/support/v4/app/d;IIIZ)V

    .line 1305
    :cond_5
    return-void
.end method

.method public final f()V
    .locals 1

    .prologue
    .line 1921
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/v4/app/h;->s:Z

    .line 1922
    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Landroid/support/v4/app/h;->a(I)V

    .line 1923
    return-void
.end method

.method public final g()V
    .locals 1

    .prologue
    .line 1926
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/v4/app/h;->s:Z

    .line 1927
    const/4 v0, 0x5

    invoke-virtual {p0, v0}, Landroid/support/v4/app/h;->a(I)V

    .line 1928
    return-void
.end method

.method public final h()V
    .locals 1

    .prologue
    .line 1938
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v4/app/h;->s:Z

    .line 1940
    const/4 v0, 0x3

    invoke-virtual {p0, v0}, Landroid/support/v4/app/h;->a(I)V

    .line 1941
    return-void
.end method

.method public final i()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 1952
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v4/app/h;->t:Z

    .line 1953
    invoke-virtual {p0}, Landroid/support/v4/app/h;->a()Z

    .line 1954
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/support/v4/app/h;->a(I)V

    .line 1955
    iput-object v1, p0, Landroid/support/v4/app/h;->o:Landroid/support/v4/app/e;

    .line 1956
    iput-object v1, p0, Landroid/support/v4/app/h;->p:Landroid/support/v4/app/f;

    .line 1957
    iput-object v1, p0, Landroid/support/v4/app/h;->q:Landroid/support/v4/app/d;

    .line 1958
    return-void
.end method

.method public final j()V
    .locals 3

    .prologue
    .line 1972
    iget-object v0, p0, Landroid/support/v4/app/h;->g:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    .line 1973
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v0, p0, Landroid/support/v4/app/h;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 1974
    iget-object v0, p0, Landroid/support/v4/app/h;->g:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/d;

    .line 1975
    if-eqz v0, :cond_0

    .line 17848
    invoke-virtual {v0}, Landroid/support/v4/app/d;->onLowMemory()V

    .line 17849
    iget-object v2, v0, Landroid/support/v4/app/d;->v:Landroid/support/v4/app/h;

    if-eqz v2, :cond_0

    .line 17850
    iget-object v0, v0, Landroid/support/v4/app/d;->v:Landroid/support/v4/app/h;

    invoke-virtual {v0}, Landroid/support/v4/app/h;->j()V

    .line 1973
    :cond_0
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 1980
    :cond_1
    return-void
.end method

.method public final onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 9

    .prologue
    const/4 v5, -0x1

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 2110
    const-string v0, "fragment"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 2198
    :cond_0
    :goto_0
    return-object v1

    .line 2114
    :cond_1
    const-string v0, "class"

    invoke-interface {p3, v1, v0}, Landroid/util/AttributeSet;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 2115
    sget-object v4, Landroid/support/v4/app/h$a;->a:[I

    invoke-virtual {p2, p3, v4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v4

    .line 2116
    if-nez v0, :cond_12

    .line 2117
    invoke-virtual {v4, v3}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object v6, v0

    .line 2119
    :goto_1
    invoke-virtual {v4, v2, v5}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v7

    .line 2120
    const/4 v0, 0x2

    invoke-virtual {v4, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v8

    .line 2121
    invoke-virtual {v4}, Landroid/content/res/TypedArray;->recycle()V

    .line 2123
    iget-object v0, p0, Landroid/support/v4/app/h;->o:Landroid/support/v4/app/e;

    invoke-static {v0, v6}, Landroid/support/v4/app/d;->b(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2139
    if-eq v7, v5, :cond_5

    invoke-direct {p0, v7}, Landroid/support/v4/app/h;->c(I)Landroid/support/v4/app/d;

    move-result-object v0

    .line 2140
    :goto_2
    if-nez v0, :cond_2

    if-eqz v8, :cond_2

    .line 18330
    iget-object v0, p0, Landroid/support/v4/app/h;->g:Ljava/util/ArrayList;

    if-eqz v0, :cond_7

    if-eqz v8, :cond_7

    .line 18332
    iget-object v0, p0, Landroid/support/v4/app/h;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v4, v0

    :goto_3
    if-ltz v4, :cond_7

    .line 18333
    iget-object v0, p0, Landroid/support/v4/app/h;->g:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/d;

    .line 18334
    if-eqz v0, :cond_6

    iget-object v5, v0, Landroid/support/v4/app/d;->z:Ljava/lang/String;

    invoke-virtual {v8, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_6

    .line 2143
    :cond_2
    :goto_4
    if-nez v0, :cond_3

    .line 2144
    invoke-direct {p0, v3}, Landroid/support/v4/app/h;->c(I)Landroid/support/v4/app/d;

    move-result-object v0

    .line 2147
    :cond_3
    sget-boolean v1, Landroid/support/v4/app/h;->a:Z

    if-eqz v1, :cond_4

    const-string v1, "FragmentManager"

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "onCreateView: id=0x"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v7}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, " fname="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, " existing="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 2150
    :cond_4
    if-nez v0, :cond_b

    .line 2151
    invoke-static {p2, v6}, Landroid/support/v4/app/d;->a(Landroid/content/Context;Ljava/lang/String;)Landroid/support/v4/app/d;

    move-result-object v1

    .line 2152
    iput-boolean v2, v1, Landroid/support/v4/app/d;->p:Z

    .line 2153
    if-eqz v7, :cond_a

    move v0, v7

    :goto_5
    iput v0, v1, Landroid/support/v4/app/d;->x:I

    .line 2154
    iput v3, v1, Landroid/support/v4/app/d;->y:I

    .line 2155
    iput-object v8, v1, Landroid/support/v4/app/d;->z:Ljava/lang/String;

    .line 2156
    iput-boolean v2, v1, Landroid/support/v4/app/d;->q:Z

    .line 2157
    iput-object p0, v1, Landroid/support/v4/app/d;->t:Landroid/support/v4/app/h;

    .line 2158
    iget-object v0, v1, Landroid/support/v4/app/d;->e:Landroid/os/Bundle;

    .line 18982
    iput-boolean v2, v1, Landroid/support/v4/app/d;->G:Z

    .line 2159
    invoke-virtual {p0, v1, v2}, Landroid/support/v4/app/h;->a(Landroid/support/v4/app/d;Z)V

    .line 2182
    :goto_6
    iget v0, p0, Landroid/support/v4/app/h;->n:I

    if-gtz v0, :cond_e

    iget-boolean v0, v1, Landroid/support/v4/app/d;->p:Z

    if-eqz v0, :cond_e

    move-object v0, p0

    move v4, v3

    move v5, v3

    .line 2183
    invoke-virtual/range {v0 .. v5}, Landroid/support/v4/app/h;->a(Landroid/support/v4/app/d;IIIZ)V

    .line 2188
    :goto_7
    iget-object v0, v1, Landroid/support/v4/app/d;->J:Landroid/view/View;

    if-nez v0, :cond_f

    .line 2189
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " did not create a view."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    move-object v0, v1

    .line 2139
    goto/16 :goto_2

    .line 18332
    :cond_6
    add-int/lit8 v0, v4, -0x1

    move v4, v0

    goto/16 :goto_3

    .line 18339
    :cond_7
    iget-object v0, p0, Landroid/support/v4/app/h;->f:Ljava/util/ArrayList;

    if-eqz v0, :cond_9

    if-eqz v8, :cond_9

    .line 18341
    iget-object v0, p0, Landroid/support/v4/app/h;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v4, v0

    :goto_8
    if-ltz v4, :cond_9

    .line 18342
    iget-object v0, p0, Landroid/support/v4/app/h;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/d;

    .line 18343
    if-eqz v0, :cond_8

    iget-object v5, v0, Landroid/support/v4/app/d;->z:Ljava/lang/String;

    invoke-virtual {v8, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_2

    .line 18341
    :cond_8
    add-int/lit8 v0, v4, -0x1

    move v4, v0

    goto :goto_8

    :cond_9
    move-object v0, v1

    .line 18348
    goto/16 :goto_4

    :cond_a
    move v0, v3

    .line 2153
    goto :goto_5

    .line 2161
    :cond_b
    iget-boolean v1, v0, Landroid/support/v4/app/d;->q:Z

    if-eqz v1, :cond_c

    .line 2164
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p3}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ": Duplicate id 0x"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v7}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", tag "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", or parent id 0x"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " with another fragment for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 2171
    :cond_c
    iput-boolean v2, v0, Landroid/support/v4/app/d;->q:Z

    .line 2175
    iget-boolean v1, v0, Landroid/support/v4/app/d;->D:Z

    if-nez v1, :cond_d

    .line 2176
    iget-object v1, v0, Landroid/support/v4/app/d;->e:Landroid/os/Bundle;

    .line 19982
    iput-boolean v2, v0, Landroid/support/v4/app/d;->G:Z

    :cond_d
    move-object v1, v0

    goto/16 :goto_6

    .line 2185
    :cond_e
    invoke-direct {p0, v1}, Landroid/support/v4/app/h;->a(Landroid/support/v4/app/d;)V

    goto/16 :goto_7

    .line 2192
    :cond_f
    if-eqz v7, :cond_10

    .line 2193
    iget-object v0, v1, Landroid/support/v4/app/d;->J:Landroid/view/View;

    invoke-virtual {v0, v7}, Landroid/view/View;->setId(I)V

    .line 2195
    :cond_10
    iget-object v0, v1, Landroid/support/v4/app/d;->J:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_11

    .line 2196
    iget-object v0, v1, Landroid/support/v4/app/d;->J:Landroid/view/View;

    invoke-virtual {v0, v8}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 2198
    :cond_11
    iget-object v1, v1, Landroid/support/v4/app/d;->J:Landroid/view/View;

    goto/16 :goto_0

    :cond_12
    move-object v6, v0

    goto/16 :goto_1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 620
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x80

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 621
    const-string v1, "FragmentManager{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 622
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 623
    const-string v1, " in "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 624
    iget-object v1, p0, Landroid/support/v4/app/h;->q:Landroid/support/v4/app/d;

    if-eqz v1, :cond_0

    .line 625
    iget-object v1, p0, Landroid/support/v4/app/h;->q:Landroid/support/v4/app/d;

    invoke-static {v1, v0}, Landroid/support/v4/e/c;->a(Ljava/lang/Object;Ljava/lang/StringBuilder;)V

    .line 629
    :goto_0
    const-string v1, "}}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 630
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 627
    :cond_0
    iget-object v1, p0, Landroid/support/v4/app/h;->o:Landroid/support/v4/app/e;

    invoke-static {v1, v0}, Landroid/support/v4/e/c;->a(Ljava/lang/Object;Ljava/lang/StringBuilder;)V

    goto :goto_0
.end method
