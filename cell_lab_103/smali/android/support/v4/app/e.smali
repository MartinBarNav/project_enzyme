.class public Landroid/support/v4/app/e;
.super Landroid/app/Activity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/app/e$a;
    }
.end annotation


# instance fields
.field final a:Landroid/os/Handler;

.field final b:Landroid/support/v4/app/h;

.field final c:Landroid/support/v4/app/f;

.field d:Z

.field e:Z

.field f:Z

.field g:Z

.field h:Z

.field i:Z

.field j:Z

.field k:Z

.field l:Landroid/support/v4/e/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/support/v4/e/g",
            "<",
            "Ljava/lang/String;",
            "Landroid/support/v4/app/l;",
            ">;"
        }
    .end annotation
.end field

.field m:Landroid/support/v4/app/l;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 75
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 86
    new-instance v0, Landroid/support/v4/app/e$1;

    invoke-direct {v0, p0}, Landroid/support/v4/app/e$1;-><init>(Landroid/support/v4/app/e;)V

    iput-object v0, p0, Landroid/support/v4/app/e;->a:Landroid/os/Handler;

    .line 105
    new-instance v0, Landroid/support/v4/app/h;

    invoke-direct {v0}, Landroid/support/v4/app/h;-><init>()V

    iput-object v0, p0, Landroid/support/v4/app/e;->b:Landroid/support/v4/app/h;

    .line 106
    new-instance v0, Landroid/support/v4/app/e$2;

    invoke-direct {v0, p0}, Landroid/support/v4/app/e$2;-><init>(Landroid/support/v4/app/e;)V

    iput-object v0, p0, Landroid/support/v4/app/e;->c:Landroid/support/v4/app/f;

    .line 132
    return-void
.end method

.method private static a(Landroid/view/View;)Ljava/lang/String;
    .locals 7

    .prologue
    const/16 v3, 0x56

    const/16 v1, 0x46

    const/16 v6, 0x2c

    const/16 v5, 0x20

    const/16 v2, 0x2e

    .line 673
    new-instance v4, Ljava/lang/StringBuilder;

    const/16 v0, 0x80

    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 674
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 675
    const/16 v0, 0x7b

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 676
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 677
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 678
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    .line 682
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 684
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->isFocusable()Z

    move-result v0

    if-eqz v0, :cond_2

    move v0, v1

    :goto_1
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 685
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    move-result v0

    if-eqz v0, :cond_3

    const/16 v0, 0x45

    :goto_2
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 686
    invoke-virtual {p0}, Landroid/view/View;->willNotDraw()Z

    move-result v0

    if-eqz v0, :cond_4

    move v0, v2

    :goto_3
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 687
    invoke-virtual {p0}, Landroid/view/View;->isHorizontalScrollBarEnabled()Z

    move-result v0

    if-eqz v0, :cond_5

    const/16 v0, 0x48

    :goto_4
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 688
    invoke-virtual {p0}, Landroid/view/View;->isVerticalScrollBarEnabled()Z

    move-result v0

    if-eqz v0, :cond_6

    move v0, v3

    :goto_5
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 689
    invoke-virtual {p0}, Landroid/view/View;->isClickable()Z

    move-result v0

    if-eqz v0, :cond_7

    const/16 v0, 0x43

    :goto_6
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 690
    invoke-virtual {p0}, Landroid/view/View;->isLongClickable()Z

    move-result v0

    if-eqz v0, :cond_8

    const/16 v0, 0x4c

    :goto_7
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 691
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 692
    invoke-virtual {p0}, Landroid/view/View;->isFocused()Z

    move-result v0

    if-eqz v0, :cond_9

    :goto_8
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 693
    invoke-virtual {p0}, Landroid/view/View;->isSelected()Z

    move-result v0

    if-eqz v0, :cond_a

    const/16 v0, 0x53

    :goto_9
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 694
    invoke-virtual {p0}, Landroid/view/View;->isPressed()Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v2, 0x50

    :cond_0
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 695
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 696
    invoke-virtual {p0}, Landroid/view/View;->getLeft()I

    move-result v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 697
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 698
    invoke-virtual {p0}, Landroid/view/View;->getTop()I

    move-result v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 699
    const/16 v0, 0x2d

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 700
    invoke-virtual {p0}, Landroid/view/View;->getRight()I

    move-result v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 701
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 702
    invoke-virtual {p0}, Landroid/view/View;->getBottom()I

    move-result v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 703
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result v1

    .line 704
    const/4 v0, -0x1

    if-eq v1, v0, :cond_1

    .line 705
    const-string v0, " #"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 706
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 707
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    .line 708
    if-eqz v1, :cond_1

    if-eqz v2, :cond_1

    .line 711
    const/high16 v0, -0x1000000

    and-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_1

    .line 719
    :try_start_0
    invoke-virtual {v2, v1}, Landroid/content/res/Resources;->getResourcePackageName(I)Ljava/lang/String;

    move-result-object v0

    .line 722
    :goto_a
    invoke-virtual {v2, v1}, Landroid/content/res/Resources;->getResourceTypeName(I)Ljava/lang/String;

    move-result-object v3

    .line 723
    invoke-virtual {v2, v1}, Landroid/content/res/Resources;->getResourceEntryName(I)Ljava/lang/String;

    move-result-object v1

    .line 724
    const-string v2, " "

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 725
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 726
    const-string v0, ":"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 727
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 728
    const-string v0, "/"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 729
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 734
    :cond_1
    :goto_b
    const-string v0, "}"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 735
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 679
    :sswitch_0
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto/16 :goto_0

    .line 680
    :sswitch_1
    const/16 v0, 0x49

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto/16 :goto_0

    .line 681
    :sswitch_2
    const/16 v0, 0x47

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto/16 :goto_0

    :cond_2
    move v0, v2

    .line 684
    goto/16 :goto_1

    :cond_3
    move v0, v2

    .line 685
    goto/16 :goto_2

    .line 686
    :cond_4
    const/16 v0, 0x44

    goto/16 :goto_3

    :cond_5
    move v0, v2

    .line 687
    goto/16 :goto_4

    :cond_6
    move v0, v2

    .line 688
    goto/16 :goto_5

    :cond_7
    move v0, v2

    .line 689
    goto/16 :goto_6

    :cond_8
    move v0, v2

    .line 690
    goto/16 :goto_7

    :cond_9
    move v1, v2

    .line 692
    goto/16 :goto_8

    :cond_a
    move v0, v2

    .line 693
    goto/16 :goto_9

    .line 713
    :sswitch_3
    :try_start_1
    const-string v0, "app"

    goto :goto_a

    .line 716
    :sswitch_4
    const-string v0, "android"
    :try_end_1
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_a

    :catch_0
    move-exception v0

    goto :goto_b

    .line 678
    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x4 -> :sswitch_1
        0x8 -> :sswitch_2
    .end sparse-switch

    .line 711
    :sswitch_data_1
    .sparse-switch
        0x1000000 -> :sswitch_4
        0x7f000000 -> :sswitch_3
    .end sparse-switch
.end method

.method private a(Ljava/lang/String;Ljava/io/PrintWriter;Landroid/view/View;)V
    .locals 4

    .prologue
    .line 739
    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 740
    if-nez p3, :cond_1

    .line 741
    const-string v0, "null"

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 757
    :cond_0
    return-void

    .line 744
    :cond_1
    invoke-static {p3}, Landroid/support/v4/app/e;->a(Landroid/view/View;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 745
    instance-of v0, p3, Landroid/view/ViewGroup;

    if-eqz v0, :cond_0

    .line 748
    check-cast p3, Landroid/view/ViewGroup;

    .line 749
    invoke-virtual {p3}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    .line 750
    if-lez v1, :cond_0

    .line 753
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "  "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 754
    const/4 v0, 0x0

    :goto_0
    if-ge v0, v1, :cond_0

    .line 755
    invoke-virtual {p3, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    invoke-direct {p0, v2, p2, v3}, Landroid/support/v4/app/e;->a(Ljava/lang/String;Ljava/io/PrintWriter;Landroid/view/View;)V

    .line 754
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method


# virtual methods
.method final a(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 837
    iget-object v0, p0, Landroid/support/v4/app/e;->l:Landroid/support/v4/e/g;

    if-eqz v0, :cond_0

    .line 838
    iget-object v0, p0, Landroid/support/v4/app/e;->l:Landroid/support/v4/e/g;

    invoke-virtual {v0, p1}, Landroid/support/v4/e/g;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/l;

    .line 839
    if-eqz v0, :cond_0

    iget-boolean v1, v0, Landroid/support/v4/app/l;->g:Z

    if-nez v1, :cond_0

    .line 840
    invoke-virtual {v0}, Landroid/support/v4/app/l;->g()V

    .line 841
    iget-object v0, p0, Landroid/support/v4/app/e;->l:Landroid/support/v4/e/g;

    invoke-virtual {v0, p1}, Landroid/support/v4/e/g;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 844
    :cond_0
    return-void
.end method

.method final a(Z)V
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 760
    iget-boolean v0, p0, Landroid/support/v4/app/e;->g:Z

    if-nez v0, :cond_1

    .line 761
    iput-boolean v1, p0, Landroid/support/v4/app/e;->g:Z

    .line 762
    iput-boolean p1, p0, Landroid/support/v4/app/e;->h:Z

    .line 763
    iget-object v0, p0, Landroid/support/v4/app/e;->a:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 10776
    iget-boolean v0, p0, Landroid/support/v4/app/e;->k:Z

    if-eqz v0, :cond_0

    .line 10777
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/v4/app/e;->k:Z

    .line 10778
    iget-object v0, p0, Landroid/support/v4/app/e;->m:Landroid/support/v4/app/l;

    if-eqz v0, :cond_0

    .line 10779
    iget-boolean v0, p0, Landroid/support/v4/app/e;->h:Z

    if-nez v0, :cond_2

    .line 10780
    iget-object v0, p0, Landroid/support/v4/app/e;->m:Landroid/support/v4/app/l;

    invoke-virtual {v0}, Landroid/support/v4/app/l;->c()V

    .line 10787
    :cond_0
    :goto_0
    iget-object v0, p0, Landroid/support/v4/app/e;->b:Landroid/support/v4/app/h;

    .line 10944
    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/support/v4/app/h;->a(I)V

    .line 766
    :cond_1
    return-void

    .line 10782
    :cond_2
    iget-object v0, p0, Landroid/support/v4/app/e;->m:Landroid/support/v4/app/l;

    invoke-virtual {v0}, Landroid/support/v4/app/l;->d()V

    goto :goto_0
.end method

.method final b(Ljava/lang/String;)Landroid/support/v4/app/l;
    .locals 1

    .prologue
    .line 863
    iget-object v0, p0, Landroid/support/v4/app/e;->l:Landroid/support/v4/e/g;

    if-nez v0, :cond_0

    .line 864
    new-instance v0, Landroid/support/v4/e/g;

    invoke-direct {v0}, Landroid/support/v4/e/g;-><init>()V

    iput-object v0, p0, Landroid/support/v4/app/e;->l:Landroid/support/v4/e/g;

    .line 866
    :cond_0
    iget-object v0, p0, Landroid/support/v4/app/e;->l:Landroid/support/v4/e/g;

    invoke-virtual {v0, p1}, Landroid/support/v4/e/g;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/l;

    .line 867
    if-eqz v0, :cond_1

    .line 11484
    iput-object p0, v0, Landroid/support/v4/app/l;->e:Landroid/support/v4/app/e;

    .line 875
    :cond_1
    return-object v0
.end method

.method public dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 646
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 650
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "Local FragmentActivity "

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 651
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 652
    const-string v0, " State:"

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 653
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "  "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 654
    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v1, "mCreated="

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 655
    iget-boolean v1, p0, Landroid/support/v4/app/e;->d:Z

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Z)V

    const-string v1, "mResumed="

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 656
    iget-boolean v1, p0, Landroid/support/v4/app/e;->e:Z

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Z)V

    const-string v1, " mStopped="

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 657
    iget-boolean v1, p0, Landroid/support/v4/app/e;->f:Z

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Z)V

    const-string v1, " mReallyStopped="

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 658
    iget-boolean v1, p0, Landroid/support/v4/app/e;->g:Z

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Z)V

    .line 659
    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mLoadersStarted="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 660
    iget-boolean v0, p0, Landroid/support/v4/app/e;->k:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Z)V

    .line 661
    iget-object v0, p0, Landroid/support/v4/app/e;->m:Landroid/support/v4/app/l;

    if-eqz v0, :cond_0

    .line 662
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "Loader Manager "

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 663
    iget-object v0, p0, Landroid/support/v4/app/e;->m:Landroid/support/v4/app/l;

    invoke-static {v0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 664
    const-string v0, ":"

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 665
    iget-object v0, p0, Landroid/support/v4/app/e;->m:Landroid/support/v4/app/l;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "  "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p3}, Landroid/support/v4/app/l;->a(Ljava/lang/String;Ljava/io/PrintWriter;)V

    .line 667
    :cond_0
    iget-object v0, p0, Landroid/support/v4/app/e;->b:Landroid/support/v4/app/h;

    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/support/v4/app/h;->a(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    .line 668
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "View Hierarchy:"

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 669
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "  "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Landroid/support/v4/app/e;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    invoke-direct {p0, v0, p3, v1}, Landroid/support/v4/app/e;->a(Ljava/lang/String;Ljava/io/PrintWriter;Landroid/view/View;)V

    .line 670
    return-void
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 3

    .prologue
    .line 149
    iget-object v0, p0, Landroid/support/v4/app/e;->b:Landroid/support/v4/app/h;

    .line 2907
    const/4 v1, 0x0

    iput-boolean v1, v0, Landroid/support/v4/app/h;->s:Z

    .line 150
    shr-int/lit8 v0, p1, 0x10

    .line 151
    if-eqz v0, :cond_3

    .line 152
    add-int/lit8 v0, v0, -0x1

    .line 153
    iget-object v1, p0, Landroid/support/v4/app/e;->b:Landroid/support/v4/app/h;

    iget-object v1, v1, Landroid/support/v4/app/h;->f:Ljava/util/ArrayList;

    if-eqz v1, :cond_0

    if-ltz v0, :cond_0

    iget-object v1, p0, Landroid/support/v4/app/e;->b:Landroid/support/v4/app/h;

    iget-object v1, v1, Landroid/support/v4/app/h;->f:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lt v0, v1, :cond_1

    .line 154
    :cond_0
    const-string v0, "FragmentActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Activity result fragment index out of range: 0x"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 169
    :goto_0
    return-void

    .line 158
    :cond_1
    iget-object v1, p0, Landroid/support/v4/app/e;->b:Landroid/support/v4/app/h;

    iget-object v1, v1, Landroid/support/v4/app/h;->f:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/d;

    .line 159
    if-nez v0, :cond_2

    .line 160
    const-string v0, "FragmentActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Activity result no fragment exists for index: 0x"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 163
    :cond_2
    invoke-static {}, Landroid/support/v4/app/d;->b()V

    goto :goto_0

    .line 168
    :cond_3
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onActivityResult(IILandroid/content/Intent;)V

    goto :goto_0
.end method

.method public onBackPressed()V
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 176
    iget-object v1, p0, Landroid/support/v4/app/e;->b:Landroid/support/v4/app/h;

    .line 4364
    iget-boolean v2, v1, Landroid/support/v4/app/h;->s:Z

    if-eqz v2, :cond_0

    .line 4365
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Can not perform this action after onSaveInstanceState"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 4368
    :cond_0
    iget-object v2, v1, Landroid/support/v4/app/h;->u:Ljava/lang/String;

    if-eqz v2, :cond_1

    .line 4369
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Can not perform this action inside of "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, v1, Landroid/support/v4/app/h;->u:Ljava/lang/String;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 4486
    :cond_1
    invoke-virtual {v1}, Landroid/support/v4/app/h;->a()Z

    .line 4529
    iget-object v2, v1, Landroid/support/v4/app/h;->i:Ljava/util/ArrayList;

    if-nez v2, :cond_4

    .line 176
    :cond_2
    :goto_0
    if-nez v0, :cond_3

    .line 6158
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_5

    .line 6159
    invoke-static {p0}, Landroid/support/v4/app/a;->a(Landroid/app/Activity;)V

    :cond_3
    :goto_1
    return-void

    .line 4533
    :cond_4
    iget-object v2, v1, Landroid/support/v4/app/h;->i:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    .line 4534
    if-ltz v2, :cond_2

    .line 4537
    iget-object v0, v1, Landroid/support/v4/app/h;->i:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/c;

    .line 4538
    new-instance v2, Landroid/util/SparseArray;

    invoke-direct {v2}, Landroid/util/SparseArray;-><init>()V

    .line 4539
    new-instance v3, Landroid/util/SparseArray;

    invoke-direct {v3}, Landroid/util/SparseArray;-><init>()V

    .line 4540
    invoke-virtual {v0, v2, v3}, Landroid/support/v4/app/c;->a(Landroid/util/SparseArray;Landroid/util/SparseArray;)V

    .line 4541
    const/4 v4, 0x0

    invoke-virtual {v0, v4, v2, v3}, Landroid/support/v4/app/c;->a(Landroid/support/v4/app/c$b;Landroid/util/SparseArray;Landroid/util/SparseArray;)Landroid/support/v4/app/c$b;

    .line 4542
    invoke-virtual {v1}, Landroid/support/v4/app/h;->b()V

    .line 4598
    const/4 v0, 0x1

    goto :goto_0

    .line 6161
    :cond_5
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    goto :goto_1
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1

    .prologue
    .line 240
    invoke-super {p0, p1}, Landroid/app/Activity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 241
    iget-object v0, p0, Landroid/support/v4/app/e;->b:Landroid/support/v4/app/h;

    invoke-virtual {v0, p1}, Landroid/support/v4/app/h;->a(Landroid/content/res/Configuration;)V

    .line 242
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 249
    iget-object v0, p0, Landroid/support/v4/app/e;->b:Landroid/support/v4/app/h;

    iget-object v2, p0, Landroid/support/v4/app/e;->c:Landroid/support/v4/app/f;

    invoke-virtual {v0, p0, v2, v1}, Landroid/support/v4/app/h;->a(Landroid/support/v4/app/e;Landroid/support/v4/app/f;Landroid/support/v4/app/d;)V

    .line 251
    invoke-virtual {p0}, Landroid/support/v4/app/e;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/LayoutInflater;->getFactory()Landroid/view/LayoutInflater$Factory;

    move-result-object v0

    if-nez v0, :cond_0

    .line 252
    invoke-virtual {p0}, Landroid/support/v4/app/e;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/LayoutInflater;->setFactory(Landroid/view/LayoutInflater$Factory;)V

    .line 255
    :cond_0
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 257
    invoke-virtual {p0}, Landroid/support/v4/app/e;->getLastNonConfigurationInstance()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/e$a;

    .line 259
    if-eqz v0, :cond_1

    .line 260
    iget-object v2, v0, Landroid/support/v4/app/e$a;->e:Landroid/support/v4/e/g;

    iput-object v2, p0, Landroid/support/v4/app/e;->l:Landroid/support/v4/e/g;

    .line 262
    :cond_1
    if-eqz p1, :cond_2

    .line 263
    const-string v2, "android:support:fragments"

    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v2

    .line 264
    iget-object v3, p0, Landroid/support/v4/app/e;->b:Landroid/support/v4/app/h;

    if-eqz v0, :cond_3

    iget-object v0, v0, Landroid/support/v4/app/e$a;->d:Ljava/util/ArrayList;

    :goto_0
    invoke-virtual {v3, v2, v0}, Landroid/support/v4/app/h;->a(Landroid/os/Parcelable;Ljava/util/ArrayList;)V

    .line 266
    :cond_2
    iget-object v0, p0, Landroid/support/v4/app/e;->b:Landroid/support/v4/app/h;

    invoke-virtual {v0}, Landroid/support/v4/app/h;->d()V

    .line 267
    return-void

    :cond_3
    move-object v0, v1

    .line 264
    goto :goto_0
.end method

.method public onCreatePanelMenu(ILandroid/view/Menu;)Z
    .locals 3

    .prologue
    .line 274
    if-nez p1, :cond_1

    .line 275
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onCreatePanelMenu(ILandroid/view/Menu;)Z

    move-result v0

    .line 276
    iget-object v1, p0, Landroid/support/v4/app/e;->b:Landroid/support/v4/app/h;

    invoke-virtual {p0}, Landroid/support/v4/app/e;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v2

    invoke-virtual {v1, p2, v2}, Landroid/support/v4/app/h;->a(Landroid/view/Menu;Landroid/view/MenuInflater;)Z

    move-result v1

    or-int/2addr v0, v1

    .line 277
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0xb

    if-lt v1, v2, :cond_0

    .line 285
    :goto_0
    return v0

    .line 283
    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    .line 285
    :cond_1
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onCreatePanelMenu(ILandroid/view/Menu;)Z

    move-result v0

    goto :goto_0
.end method

.method public onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1

    .prologue
    .line 293
    const-string v0, "fragment"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 294
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object v0

    .line 301
    :cond_0
    :goto_0
    return-object v0

    .line 297
    :cond_1
    iget-object v0, p0, Landroid/support/v4/app/e;->b:Landroid/support/v4/app/h;

    invoke-virtual {v0, p1, p2, p3}, Landroid/support/v4/app/h;->onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object v0

    .line 298
    if-nez v0, :cond_0

    .line 299
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object v0

    goto :goto_0
.end method

.method public onDestroy()V
    .locals 1

    .prologue
    .line 309
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    .line 311
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/support/v4/app/e;->a(Z)V

    .line 313
    iget-object v0, p0, Landroid/support/v4/app/e;->b:Landroid/support/v4/app/h;

    invoke-virtual {v0}, Landroid/support/v4/app/h;->i()V

    .line 314
    iget-object v0, p0, Landroid/support/v4/app/e;->m:Landroid/support/v4/app/l;

    if-eqz v0, :cond_0

    .line 315
    iget-object v0, p0, Landroid/support/v4/app/e;->m:Landroid/support/v4/app/l;

    invoke-virtual {v0}, Landroid/support/v4/app/l;->g()V

    .line 317
    :cond_0
    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 2

    .prologue
    .line 324
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x5

    if-ge v0, v1, :cond_0

    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    invoke-virtual {p2}, Landroid/view/KeyEvent;->getRepeatCount()I

    move-result v0

    if-nez v0, :cond_0

    .line 329
    invoke-virtual {p0}, Landroid/support/v4/app/e;->onBackPressed()V

    .line 330
    const/4 v0, 0x1

    .line 333
    :goto_0
    return v0

    :cond_0
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    goto :goto_0
.end method

.method public onLowMemory()V
    .locals 1

    .prologue
    .line 341
    invoke-super {p0}, Landroid/app/Activity;->onLowMemory()V

    .line 342
    iget-object v0, p0, Landroid/support/v4/app/e;->b:Landroid/support/v4/app/h;

    invoke-virtual {v0}, Landroid/support/v4/app/h;->j()V

    .line 343
    return-void
.end method

.method public onMenuItemSelected(ILandroid/view/MenuItem;)Z
    .locals 1

    .prologue
    .line 350
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 351
    const/4 v0, 0x1

    .line 362
    :goto_0
    return v0

    .line 354
    :cond_0
    sparse-switch p1, :sswitch_data_0

    .line 362
    const/4 v0, 0x0

    goto :goto_0

    .line 356
    :sswitch_0
    iget-object v0, p0, Landroid/support/v4/app/e;->b:Landroid/support/v4/app/h;

    invoke-virtual {v0, p2}, Landroid/support/v4/app/h;->a(Landroid/view/MenuItem;)Z

    move-result v0

    goto :goto_0

    .line 359
    :sswitch_1
    iget-object v0, p0, Landroid/support/v4/app/e;->b:Landroid/support/v4/app/h;

    invoke-virtual {v0, p2}, Landroid/support/v4/app/h;->b(Landroid/view/MenuItem;)Z

    move-result v0

    goto :goto_0

    .line 354
    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x6 -> :sswitch_1
    .end sparse-switch
.end method

.method protected onNewIntent(Landroid/content/Intent;)V
    .locals 2

    .prologue
    .line 405
    invoke-super {p0, p1}, Landroid/app/Activity;->onNewIntent(Landroid/content/Intent;)V

    .line 406
    iget-object v0, p0, Landroid/support/v4/app/e;->b:Landroid/support/v4/app/h;

    .line 7907
    const/4 v1, 0x0

    iput-boolean v1, v0, Landroid/support/v4/app/h;->s:Z

    .line 407
    return-void
.end method

.method public onPanelClosed(ILandroid/view/Menu;)V
    .locals 1

    .prologue
    .line 371
    packed-switch p1, :pswitch_data_0

    .line 376
    :goto_0
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onPanelClosed(ILandroid/view/Menu;)V

    .line 377
    return-void

    .line 373
    :pswitch_0
    iget-object v0, p0, Landroid/support/v4/app/e;->b:Landroid/support/v4/app/h;

    invoke-virtual {v0, p2}, Landroid/support/v4/app/h;->b(Landroid/view/Menu;)V

    goto :goto_0

    .line 371
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public onPause()V
    .locals 2

    .prologue
    const/4 v1, 0x2

    .line 384
    invoke-super {p0}, Landroid/app/Activity;->onPause()V

    .line 385
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/v4/app/e;->e:Z

    .line 386
    iget-object v0, p0, Landroid/support/v4/app/e;->a:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 387
    iget-object v0, p0, Landroid/support/v4/app/e;->a:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 6444
    iget-object v0, p0, Landroid/support/v4/app/e;->b:Landroid/support/v4/app/h;

    invoke-virtual {v0}, Landroid/support/v4/app/h;->g()V

    .line 390
    :cond_0
    iget-object v0, p0, Landroid/support/v4/app/e;->b:Landroid/support/v4/app/h;

    .line 6931
    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/support/v4/app/h;->a(I)V

    .line 391
    return-void
.end method

.method protected onPostResume()V
    .locals 2

    .prologue
    .line 431
    invoke-super {p0}, Landroid/app/Activity;->onPostResume()V

    .line 432
    iget-object v0, p0, Landroid/support/v4/app/e;->a:Landroid/os/Handler;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 8444
    iget-object v0, p0, Landroid/support/v4/app/e;->b:Landroid/support/v4/app/h;

    invoke-virtual {v0}, Landroid/support/v4/app/h;->g()V

    .line 434
    iget-object v0, p0, Landroid/support/v4/app/e;->b:Landroid/support/v4/app/h;

    invoke-virtual {v0}, Landroid/support/v4/app/h;->a()Z

    .line 435
    return-void
.end method

.method public onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 452
    if-nez p1, :cond_1

    if-eqz p3, :cond_1

    .line 453
    iget-boolean v0, p0, Landroid/support/v4/app/e;->i:Z

    if-eqz v0, :cond_0

    .line 454
    iput-boolean v1, p0, Landroid/support/v4/app/e;->i:Z

    .line 455
    invoke-interface {p3}, Landroid/view/Menu;->clear()V

    .line 456
    invoke-virtual {p0, p1, p3}, Landroid/support/v4/app/e;->onCreatePanelMenu(ILandroid/view/Menu;)Z

    .line 8469
    :cond_0
    invoke-super {p0, v1, p2, p3}, Landroid/app/Activity;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    move-result v0

    .line 459
    iget-object v1, p0, Landroid/support/v4/app/e;->b:Landroid/support/v4/app/h;

    invoke-virtual {v1, p3}, Landroid/support/v4/app/h;->a(Landroid/view/Menu;)Z

    move-result v1

    or-int/2addr v0, v1

    .line 462
    :goto_0
    return v0

    :cond_1
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    move-result v0

    goto :goto_0
.end method

.method public onResume()V
    .locals 2

    .prologue
    .line 420
    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    .line 421
    iget-object v0, p0, Landroid/support/v4/app/e;->a:Landroid/os/Handler;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 422
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v4/app/e;->e:Z

    .line 423
    iget-object v0, p0, Landroid/support/v4/app/e;->b:Landroid/support/v4/app/h;

    invoke-virtual {v0}, Landroid/support/v4/app/h;->a()Z

    .line 424
    return-void
.end method

.method public final onRetainNonConfigurationInstance()Ljava/lang/Object;
    .locals 10

    .prologue
    const/4 v6, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    .line 479
    iget-boolean v0, p0, Landroid/support/v4/app/e;->f:Z

    if-eqz v0, :cond_0

    .line 480
    invoke-virtual {p0, v6}, Landroid/support/v4/app/e;->a(Z)V

    .line 485
    :cond_0
    iget-object v7, p0, Landroid/support/v4/app/e;->b:Landroid/support/v4/app/h;

    .line 8603
    iget-object v0, v7, Landroid/support/v4/app/h;->f:Ljava/util/ArrayList;

    if-eqz v0, :cond_4

    move v3, v4

    move-object v1, v5

    .line 8604
    :goto_0
    iget-object v0, v7, Landroid/support/v4/app/h;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v3, v0, :cond_5

    .line 8605
    iget-object v0, v7, Landroid/support/v4/app/h;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/d;

    .line 8606
    if-eqz v0, :cond_2

    iget-boolean v2, v0, Landroid/support/v4/app/d;->C:Z

    if-eqz v2, :cond_2

    .line 8607
    if-nez v1, :cond_1

    .line 8608
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 8610
    :cond_1
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 8611
    iput-boolean v6, v0, Landroid/support/v4/app/d;->D:Z

    .line 8612
    iget-object v2, v0, Landroid/support/v4/app/d;->j:Landroid/support/v4/app/d;

    if-eqz v2, :cond_3

    iget-object v2, v0, Landroid/support/v4/app/d;->j:Landroid/support/v4/app/d;

    iget v2, v2, Landroid/support/v4/app/d;->g:I

    :goto_1
    iput v2, v0, Landroid/support/v4/app/d;->k:I

    .line 8613
    sget-boolean v2, Landroid/support/v4/app/h;->a:Z

    if-eqz v2, :cond_2

    const-string v2, "FragmentManager"

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "retainNonConfig: keeping retained "

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 8604
    :cond_2
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_0

    .line 8612
    :cond_3
    const/4 v2, -0x1

    goto :goto_1

    :cond_4
    move-object v1, v5

    .line 487
    :cond_5
    iget-object v0, p0, Landroid/support/v4/app/e;->l:Landroid/support/v4/e/g;

    if-eqz v0, :cond_8

    .line 490
    iget-object v0, p0, Landroid/support/v4/app/e;->l:Landroid/support/v4/e/g;

    invoke-virtual {v0}, Landroid/support/v4/e/g;->size()I

    move-result v3

    .line 491
    new-array v7, v3, [Landroid/support/v4/app/l;

    .line 492
    add-int/lit8 v0, v3, -0x1

    move v2, v0

    :goto_2
    if-ltz v2, :cond_6

    .line 493
    iget-object v0, p0, Landroid/support/v4/app/e;->l:Landroid/support/v4/e/g;

    invoke-virtual {v0, v2}, Landroid/support/v4/e/g;->c(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/l;

    aput-object v0, v7, v2

    .line 492
    add-int/lit8 v0, v2, -0x1

    move v2, v0

    goto :goto_2

    :cond_6
    move v0, v4

    .line 495
    :goto_3
    if-ge v4, v3, :cond_9

    .line 496
    aget-object v2, v7, v4

    .line 497
    iget-boolean v8, v2, Landroid/support/v4/app/l;->g:Z

    if-eqz v8, :cond_7

    move v0, v6

    .line 495
    :goto_4
    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    .line 500
    :cond_7
    invoke-virtual {v2}, Landroid/support/v4/app/l;->g()V

    .line 501
    iget-object v8, p0, Landroid/support/v4/app/e;->l:Landroid/support/v4/e/g;

    iget-object v2, v2, Landroid/support/v4/app/l;->d:Ljava/lang/String;

    invoke-virtual {v8, v2}, Landroid/support/v4/e/g;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    :cond_8
    move v0, v4

    .line 505
    :cond_9
    if-nez v1, :cond_a

    if-nez v0, :cond_a

    .line 515
    :goto_5
    return-object v5

    .line 509
    :cond_a
    new-instance v0, Landroid/support/v4/app/e$a;

    invoke-direct {v0}, Landroid/support/v4/app/e$a;-><init>()V

    .line 510
    iput-object v5, v0, Landroid/support/v4/app/e$a;->a:Ljava/lang/Object;

    .line 511
    iput-object v5, v0, Landroid/support/v4/app/e$a;->b:Ljava/lang/Object;

    .line 512
    iput-object v5, v0, Landroid/support/v4/app/e$a;->c:Landroid/support/v4/e/g;

    .line 513
    iput-object v1, v0, Landroid/support/v4/app/e$a;->d:Ljava/util/ArrayList;

    .line 514
    iget-object v1, p0, Landroid/support/v4/app/e;->l:Landroid/support/v4/e/g;

    iput-object v1, v0, Landroid/support/v4/app/e$a;->e:Landroid/support/v4/e/g;

    move-object v5, v0

    .line 515
    goto :goto_5
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 523
    invoke-super {p0, p1}, Landroid/app/Activity;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 524
    iget-object v0, p0, Landroid/support/v4/app/e;->b:Landroid/support/v4/app/h;

    invoke-virtual {v0}, Landroid/support/v4/app/h;->c()Landroid/os/Parcelable;

    move-result-object v0

    .line 525
    if-eqz v0, :cond_0

    .line 526
    const-string v1, "android:support:fragments"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 528
    :cond_0
    return-void
.end method

.method protected onStart()V
    .locals 10

    .prologue
    const/4 v1, 0x1

    const/4 v3, 0x0

    .line 536
    invoke-super {p0}, Landroid/app/Activity;->onStart()V

    .line 538
    iput-boolean v3, p0, Landroid/support/v4/app/e;->f:Z

    .line 539
    iput-boolean v3, p0, Landroid/support/v4/app/e;->g:Z

    .line 540
    iget-object v0, p0, Landroid/support/v4/app/e;->a:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 542
    iget-boolean v0, p0, Landroid/support/v4/app/e;->d:Z

    if-nez v0, :cond_0

    .line 543
    iput-boolean v1, p0, Landroid/support/v4/app/e;->d:Z

    .line 544
    iget-object v0, p0, Landroid/support/v4/app/e;->b:Landroid/support/v4/app/h;

    invoke-virtual {v0}, Landroid/support/v4/app/h;->e()V

    .line 547
    :cond_0
    iget-object v0, p0, Landroid/support/v4/app/e;->b:Landroid/support/v4/app/h;

    .line 8907
    iput-boolean v3, v0, Landroid/support/v4/app/h;->s:Z

    .line 548
    iget-object v0, p0, Landroid/support/v4/app/e;->b:Landroid/support/v4/app/h;

    invoke-virtual {v0}, Landroid/support/v4/app/h;->a()Z

    .line 550
    iget-boolean v0, p0, Landroid/support/v4/app/e;->k:Z

    if-nez v0, :cond_2

    .line 551
    iput-boolean v1, p0, Landroid/support/v4/app/e;->k:Z

    .line 552
    iget-object v0, p0, Landroid/support/v4/app/e;->m:Landroid/support/v4/app/l;

    if-eqz v0, :cond_3

    .line 553
    iget-object v0, p0, Landroid/support/v4/app/e;->m:Landroid/support/v4/app/l;

    invoke-virtual {v0}, Landroid/support/v4/app/l;->b()V

    .line 561
    :cond_1
    :goto_0
    iput-boolean v1, p0, Landroid/support/v4/app/e;->j:Z

    .line 565
    :cond_2
    iget-object v0, p0, Landroid/support/v4/app/e;->b:Landroid/support/v4/app/h;

    invoke-virtual {v0}, Landroid/support/v4/app/h;->f()V

    .line 566
    iget-object v0, p0, Landroid/support/v4/app/e;->l:Landroid/support/v4/e/g;

    if-eqz v0, :cond_a

    .line 567
    iget-object v0, p0, Landroid/support/v4/app/e;->l:Landroid/support/v4/e/g;

    invoke-virtual {v0}, Landroid/support/v4/e/g;->size()I

    move-result v4

    .line 568
    new-array v5, v4, [Landroid/support/v4/app/l;

    .line 569
    add-int/lit8 v0, v4, -0x1

    move v1, v0

    :goto_1
    if-ltz v1, :cond_4

    .line 570
    iget-object v0, p0, Landroid/support/v4/app/e;->l:Landroid/support/v4/e/g;

    invoke-virtual {v0, v1}, Landroid/support/v4/e/g;->c(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/l;

    aput-object v0, v5, v1

    .line 569
    add-int/lit8 v0, v1, -0x1

    move v1, v0

    goto :goto_1

    .line 554
    :cond_3
    iget-boolean v0, p0, Landroid/support/v4/app/e;->j:Z

    if-nez v0, :cond_1

    .line 555
    const-string v0, "(root)"

    invoke-virtual {p0, v0}, Landroid/support/v4/app/e;->b(Ljava/lang/String;)Landroid/support/v4/app/l;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v4/app/e;->m:Landroid/support/v4/app/l;

    .line 557
    iget-object v0, p0, Landroid/support/v4/app/e;->m:Landroid/support/v4/app/l;

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroid/support/v4/app/e;->m:Landroid/support/v4/app/l;

    iget-boolean v0, v0, Landroid/support/v4/app/l;->f:Z

    if-nez v0, :cond_1

    .line 558
    iget-object v0, p0, Landroid/support/v4/app/e;->m:Landroid/support/v4/app/l;

    invoke-virtual {v0}, Landroid/support/v4/app/l;->b()V

    goto :goto_0

    :cond_4
    move v2, v3

    .line 572
    :goto_2
    if-ge v2, v4, :cond_a

    .line 573
    aget-object v6, v5, v2

    .line 9750
    iget-boolean v0, v6, Landroid/support/v4/app/l;->g:Z

    if-eqz v0, :cond_9

    .line 9751
    sget-boolean v0, Landroid/support/v4/app/l;->a:Z

    if-eqz v0, :cond_5

    const-string v0, "LoaderManager"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v7, "Finished Retaining in "

    invoke-direct {v1, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 9753
    :cond_5
    iput-boolean v3, v6, Landroid/support/v4/app/l;->g:Z

    .line 9754
    iget-object v0, v6, Landroid/support/v4/app/l;->b:Landroid/support/v4/e/h;

    invoke-virtual {v0}, Landroid/support/v4/e/h;->a()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v1, v0

    :goto_3
    if-ltz v1, :cond_9

    .line 9755
    iget-object v0, v6, Landroid/support/v4/app/l;->b:Landroid/support/v4/e/h;

    invoke-virtual {v0, v1}, Landroid/support/v4/e/h;->b(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/l$a;

    .line 10278
    iget-boolean v7, v0, Landroid/support/v4/app/l$a;->i:Z

    if-eqz v7, :cond_7

    .line 10279
    sget-boolean v7, Landroid/support/v4/app/l;->a:Z

    if-eqz v7, :cond_6

    const-string v7, "LoaderManager"

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "  Finished Retaining: "

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v8}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 10280
    :cond_6
    iput-boolean v3, v0, Landroid/support/v4/app/l$a;->i:Z

    .line 10281
    iget-boolean v7, v0, Landroid/support/v4/app/l$a;->h:Z

    iget-boolean v8, v0, Landroid/support/v4/app/l$a;->j:Z

    if-eq v7, v8, :cond_7

    .line 10282
    iget-boolean v7, v0, Landroid/support/v4/app/l$a;->h:Z

    if-nez v7, :cond_7

    .line 10286
    invoke-virtual {v0}, Landroid/support/v4/app/l$a;->a()V

    .line 10291
    :cond_7
    iget-boolean v7, v0, Landroid/support/v4/app/l$a;->h:Z

    if-eqz v7, :cond_8

    iget-boolean v7, v0, Landroid/support/v4/app/l$a;->e:Z

    if-eqz v7, :cond_8

    iget-boolean v7, v0, Landroid/support/v4/app/l$a;->k:Z

    if-nez v7, :cond_8

    .line 10298
    iget-object v7, v0, Landroid/support/v4/app/l$a;->d:Landroid/support/v4/content/c;

    iget-object v8, v0, Landroid/support/v4/app/l$a;->g:Ljava/lang/Object;

    invoke-virtual {v0, v7, v8}, Landroid/support/v4/app/l$a;->a(Landroid/support/v4/content/c;Ljava/lang/Object;)V

    .line 9754
    :cond_8
    add-int/lit8 v0, v1, -0x1

    move v1, v0

    goto :goto_3

    .line 575
    :cond_9
    invoke-virtual {v6}, Landroid/support/v4/app/l;->f()V

    .line 572
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_2

    .line 578
    :cond_a
    return-void
.end method

.method protected onStop()V
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 585
    invoke-super {p0}, Landroid/app/Activity;->onStop()V

    .line 587
    iput-boolean v1, p0, Landroid/support/v4/app/e;->f:Z

    .line 588
    iget-object v0, p0, Landroid/support/v4/app/e;->a:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 590
    iget-object v0, p0, Landroid/support/v4/app/e;->b:Landroid/support/v4/app/h;

    invoke-virtual {v0}, Landroid/support/v4/app/h;->h()V

    .line 591
    return-void
.end method

.method public startActivityForResult(Landroid/content/Intent;I)V
    .locals 2

    .prologue
    .line 814
    const/4 v0, -0x1

    if-eq p2, v0, :cond_0

    const/high16 v0, -0x10000

    and-int/2addr v0, p2

    if-eqz v0, :cond_0

    .line 815
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Can only use lower 16 bits for requestCode"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 817
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 818
    return-void
.end method
