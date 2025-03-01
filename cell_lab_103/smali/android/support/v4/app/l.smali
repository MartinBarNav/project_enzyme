.class final Landroid/support/v4/app/l;
.super Landroid/support/v4/app/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/app/l$a;
    }
.end annotation


# static fields
.field static a:Z


# instance fields
.field final b:Landroid/support/v4/e/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/support/v4/e/h",
            "<",
            "Landroid/support/v4/app/l$a;",
            ">;"
        }
    .end annotation
.end field

.field final c:Landroid/support/v4/e/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/support/v4/e/h",
            "<",
            "Landroid/support/v4/app/l$a;",
            ">;"
        }
    .end annotation
.end field

.field final d:Ljava/lang/String;

.field e:Landroid/support/v4/app/e;

.field f:Z

.field g:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 189
    const/4 v0, 0x0

    sput-boolean v0, Landroid/support/v4/app/l;->a:Z

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/io/PrintWriter;)V
    .locals 5

    .prologue
    const/4 v2, 0x0

    .line 801
    iget-object v0, p0, Landroid/support/v4/app/l;->b:Landroid/support/v4/e/h;

    invoke-virtual {v0}, Landroid/support/v4/e/h;->a()I

    move-result v0

    if-lez v0, :cond_0

    .line 802
    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "Active Loaders:"

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 803
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "    "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    move v1, v2

    .line 804
    :goto_0
    iget-object v0, p0, Landroid/support/v4/app/l;->b:Landroid/support/v4/e/h;

    invoke-virtual {v0}, Landroid/support/v4/e/h;->a()I

    move-result v0

    if-ge v1, v0, :cond_0

    .line 805
    iget-object v0, p0, Landroid/support/v4/app/l;->b:Landroid/support/v4/e/h;

    invoke-virtual {v0, v1}, Landroid/support/v4/e/h;->b(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/l$a;

    .line 806
    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v4, "  #"

    invoke-virtual {p2, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v4, p0, Landroid/support/v4/app/l;->b:Landroid/support/v4/e/h;

    invoke-virtual {v4, v1}, Landroid/support/v4/e/h;->a(I)I

    move-result v4

    invoke-virtual {p2, v4}, Ljava/io/PrintWriter;->print(I)V

    .line 807
    const-string v4, ": "

    invoke-virtual {p2, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/support/v4/app/l$a;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p2, v4}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 808
    invoke-virtual {v0, v3, p2}, Landroid/support/v4/app/l$a;->a(Ljava/lang/String;Ljava/io/PrintWriter;)V

    .line 804
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 811
    :cond_0
    iget-object v0, p0, Landroid/support/v4/app/l;->c:Landroid/support/v4/e/h;

    invoke-virtual {v0}, Landroid/support/v4/e/h;->a()I

    move-result v0

    if-lez v0, :cond_1

    .line 812
    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "Inactive Loaders:"

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 813
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "    "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 814
    :goto_1
    iget-object v0, p0, Landroid/support/v4/app/l;->c:Landroid/support/v4/e/h;

    invoke-virtual {v0}, Landroid/support/v4/e/h;->a()I

    move-result v0

    if-ge v2, v0, :cond_1

    .line 815
    iget-object v0, p0, Landroid/support/v4/app/l;->c:Landroid/support/v4/e/h;

    invoke-virtual {v0, v2}, Landroid/support/v4/e/h;->b(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/l$a;

    .line 816
    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v3, "  #"

    invoke-virtual {p2, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v3, p0, Landroid/support/v4/app/l;->c:Landroid/support/v4/e/h;

    invoke-virtual {v3, v2}, Landroid/support/v4/e/h;->a(I)I

    move-result v3

    invoke-virtual {p2, v3}, Ljava/io/PrintWriter;->print(I)V

    .line 817
    const-string v3, ": "

    invoke-virtual {p2, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/support/v4/app/l$a;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2, v3}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 818
    invoke-virtual {v0, v1, p2}, Landroid/support/v4/app/l$a;->a(Ljava/lang/String;Ljava/io/PrintWriter;)V

    .line 814
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 821
    :cond_1
    return-void
.end method

.method public final a()Z
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 825
    .line 826
    iget-object v0, p0, Landroid/support/v4/app/l;->b:Landroid/support/v4/e/h;

    invoke-virtual {v0}, Landroid/support/v4/e/h;->a()I

    move-result v4

    move v2, v1

    move v3, v1

    .line 827
    :goto_0
    if-ge v2, v4, :cond_1

    .line 828
    iget-object v0, p0, Landroid/support/v4/app/l;->b:Landroid/support/v4/e/h;

    invoke-virtual {v0, v2}, Landroid/support/v4/e/h;->b(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/l$a;

    .line 829
    iget-boolean v5, v0, Landroid/support/v4/app/l$a;->h:Z

    if-eqz v5, :cond_0

    iget-boolean v0, v0, Landroid/support/v4/app/l$a;->f:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_1
    or-int/2addr v3, v0

    .line 827
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_0

    :cond_0
    move v0, v1

    .line 829
    goto :goto_1

    .line 831
    :cond_1
    return v3
.end method

.method final b()V
    .locals 7

    .prologue
    const/4 v6, 0x0

    const/4 v5, 0x1

    .line 701
    sget-boolean v0, Landroid/support/v4/app/l;->a:Z

    if-eqz v0, :cond_0

    const-string v0, "LoaderManager"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Starting in "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 702
    :cond_0
    iget-boolean v0, p0, Landroid/support/v4/app/l;->f:Z

    if-eqz v0, :cond_2

    .line 703
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "here"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 704
    invoke-virtual {v0}, Ljava/lang/RuntimeException;->fillInStackTrace()Ljava/lang/Throwable;

    .line 705
    const-string v1, "LoaderManager"

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Called doStart when already started: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 716
    :cond_1
    return-void

    .line 709
    :cond_2
    iput-boolean v5, p0, Landroid/support/v4/app/l;->f:Z

    .line 713
    iget-object v0, p0, Landroid/support/v4/app/l;->b:Landroid/support/v4/e/h;

    invoke-virtual {v0}, Landroid/support/v4/e/h;->a()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v1, v0

    :goto_0
    if-ltz v1, :cond_1

    .line 714
    iget-object v0, p0, Landroid/support/v4/app/l;->b:Landroid/support/v4/e/h;

    invoke-virtual {v0, v1}, Landroid/support/v4/e/h;->b(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/l$a;

    .line 1235
    iget-boolean v2, v0, Landroid/support/v4/app/l$a;->i:Z

    if-eqz v2, :cond_4

    iget-boolean v2, v0, Landroid/support/v4/app/l$a;->j:Z

    if-eqz v2, :cond_4

    .line 1239
    iput-boolean v5, v0, Landroid/support/v4/app/l$a;->h:Z

    .line 713
    :cond_3
    :goto_1
    add-int/lit8 v0, v1, -0x1

    move v1, v0

    goto :goto_0

    .line 1243
    :cond_4
    iget-boolean v2, v0, Landroid/support/v4/app/l$a;->h:Z

    if-nez v2, :cond_3

    .line 1248
    iput-boolean v5, v0, Landroid/support/v4/app/l$a;->h:Z

    .line 1250
    sget-boolean v2, Landroid/support/v4/app/l;->a:Z

    if-eqz v2, :cond_5

    const-string v2, "LoaderManager"

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "  Starting: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1251
    :cond_5
    iget-object v2, v0, Landroid/support/v4/app/l$a;->d:Landroid/support/v4/content/c;

    if-nez v2, :cond_6

    iget-object v2, v0, Landroid/support/v4/app/l$a;->c:Landroid/support/v4/app/k$a;

    if-eqz v2, :cond_6

    .line 1252
    iget-object v2, v0, Landroid/support/v4/app/l$a;->c:Landroid/support/v4/app/k$a;

    invoke-interface {v2}, Landroid/support/v4/app/k$a;->a()Landroid/support/v4/content/c;

    move-result-object v2

    iput-object v2, v0, Landroid/support/v4/app/l$a;->d:Landroid/support/v4/content/c;

    .line 1254
    :cond_6
    iget-object v2, v0, Landroid/support/v4/app/l$a;->d:Landroid/support/v4/content/c;

    if-eqz v2, :cond_3

    .line 1255
    iget-object v2, v0, Landroid/support/v4/app/l$a;->d:Landroid/support/v4/content/c;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->isMemberClass()Z

    move-result v2

    if-eqz v2, :cond_7

    iget-object v2, v0, Landroid/support/v4/app/l$a;->d:Landroid/support/v4/content/c;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getModifiers()I

    move-result v2

    invoke-static {v2}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v2

    if-nez v2, :cond_7

    .line 1257
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Object returned from onCreateLoader must not be a non-static inner member class: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, v0, Landroid/support/v4/app/l$a;->d:Landroid/support/v4/content/c;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 1261
    :cond_7
    iget-boolean v2, v0, Landroid/support/v4/app/l$a;->m:Z

    if-nez v2, :cond_9

    .line 1262
    iget-object v2, v0, Landroid/support/v4/app/l$a;->d:Landroid/support/v4/content/c;

    iget v3, v0, Landroid/support/v4/app/l$a;->a:I

    .line 2130
    iget-object v4, v2, Landroid/support/v4/content/c;->b:Landroid/support/v4/content/c$a;

    if-eqz v4, :cond_8

    .line 2131
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "There is already a listener registered"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 2133
    :cond_8
    iput-object v0, v2, Landroid/support/v4/content/c;->b:Landroid/support/v4/content/c$a;

    .line 2134
    iput v3, v2, Landroid/support/v4/content/c;->a:I

    .line 1263
    iput-boolean v5, v0, Landroid/support/v4/app/l$a;->m:Z

    .line 1265
    :cond_9
    iget-object v0, v0, Landroid/support/v4/app/l$a;->d:Landroid/support/v4/content/c;

    .line 2195
    iput-boolean v5, v0, Landroid/support/v4/content/c;->c:Z

    .line 2196
    iput-boolean v6, v0, Landroid/support/v4/content/c;->e:Z

    .line 2197
    iput-boolean v6, v0, Landroid/support/v4/content/c;->d:Z

    goto/16 :goto_1
.end method

.method final c()V
    .locals 4

    .prologue
    .line 719
    sget-boolean v0, Landroid/support/v4/app/l;->a:Z

    if-eqz v0, :cond_0

    const-string v0, "LoaderManager"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Stopping in "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 720
    :cond_0
    iget-boolean v0, p0, Landroid/support/v4/app/l;->f:Z

    if-nez v0, :cond_1

    .line 721
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "here"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 722
    invoke-virtual {v0}, Ljava/lang/RuntimeException;->fillInStackTrace()Ljava/lang/Throwable;

    .line 723
    const-string v1, "LoaderManager"

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Called doStop when not started: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 731
    :goto_0
    return-void

    .line 727
    :cond_1
    iget-object v0, p0, Landroid/support/v4/app/l;->b:Landroid/support/v4/e/h;

    invoke-virtual {v0}, Landroid/support/v4/e/h;->a()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v1, v0

    :goto_1
    if-ltz v1, :cond_2

    .line 728
    iget-object v0, p0, Landroid/support/v4/app/l;->b:Landroid/support/v4/e/h;

    invoke-virtual {v0, v1}, Landroid/support/v4/e/h;->b(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/l$a;

    invoke-virtual {v0}, Landroid/support/v4/app/l$a;->a()V

    .line 727
    add-int/lit8 v0, v1, -0x1

    move v1, v0

    goto :goto_1

    .line 730
    :cond_2
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/v4/app/l;->f:Z

    goto :goto_0
.end method

.method final d()V
    .locals 7

    .prologue
    const/4 v6, 0x1

    const/4 v5, 0x0

    .line 734
    sget-boolean v0, Landroid/support/v4/app/l;->a:Z

    if-eqz v0, :cond_0

    const-string v0, "LoaderManager"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Retaining in "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 735
    :cond_0
    iget-boolean v0, p0, Landroid/support/v4/app/l;->f:Z

    if-nez v0, :cond_2

    .line 736
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "here"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 737
    invoke-virtual {v0}, Ljava/lang/RuntimeException;->fillInStackTrace()Ljava/lang/Throwable;

    .line 738
    const-string v1, "LoaderManager"

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Called doRetain when not started: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 747
    :cond_1
    return-void

    .line 742
    :cond_2
    iput-boolean v6, p0, Landroid/support/v4/app/l;->g:Z

    .line 743
    iput-boolean v5, p0, Landroid/support/v4/app/l;->f:Z

    .line 744
    iget-object v0, p0, Landroid/support/v4/app/l;->b:Landroid/support/v4/e/h;

    invoke-virtual {v0}, Landroid/support/v4/e/h;->a()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v1, v0

    :goto_0
    if-ltz v1, :cond_1

    .line 745
    iget-object v0, p0, Landroid/support/v4/app/l;->b:Landroid/support/v4/e/h;

    invoke-virtual {v0, v1}, Landroid/support/v4/e/h;->b(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/l$a;

    .line 2270
    sget-boolean v2, Landroid/support/v4/app/l;->a:Z

    if-eqz v2, :cond_3

    const-string v2, "LoaderManager"

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "  Retaining: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 2271
    :cond_3
    iput-boolean v6, v0, Landroid/support/v4/app/l$a;->i:Z

    .line 2272
    iget-boolean v2, v0, Landroid/support/v4/app/l$a;->h:Z

    iput-boolean v2, v0, Landroid/support/v4/app/l$a;->j:Z

    .line 2273
    iput-boolean v5, v0, Landroid/support/v4/app/l$a;->h:Z

    .line 2274
    const/4 v2, 0x0

    iput-object v2, v0, Landroid/support/v4/app/l$a;->c:Landroid/support/v4/app/k$a;

    .line 744
    add-int/lit8 v0, v1, -0x1

    move v1, v0

    goto :goto_0
.end method

.method final e()V
    .locals 3

    .prologue
    .line 761
    iget-object v0, p0, Landroid/support/v4/app/l;->b:Landroid/support/v4/e/h;

    invoke-virtual {v0}, Landroid/support/v4/e/h;->a()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v1, v0

    :goto_0
    if-ltz v1, :cond_0

    .line 762
    iget-object v0, p0, Landroid/support/v4/app/l;->b:Landroid/support/v4/e/h;

    invoke-virtual {v0, v1}, Landroid/support/v4/e/h;->b(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/l$a;

    const/4 v2, 0x1

    iput-boolean v2, v0, Landroid/support/v4/app/l$a;->k:Z

    .line 761
    add-int/lit8 v0, v1, -0x1

    move v1, v0

    goto :goto_0

    .line 764
    :cond_0
    return-void
.end method

.method final f()V
    .locals 4

    .prologue
    .line 767
    iget-object v0, p0, Landroid/support/v4/app/l;->b:Landroid/support/v4/e/h;

    invoke-virtual {v0}, Landroid/support/v4/e/h;->a()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v1, v0

    :goto_0
    if-ltz v1, :cond_1

    .line 768
    iget-object v0, p0, Landroid/support/v4/app/l;->b:Landroid/support/v4/e/h;

    invoke-virtual {v0, v1}, Landroid/support/v4/e/h;->b(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/l$a;

    .line 2303
    iget-boolean v2, v0, Landroid/support/v4/app/l$a;->h:Z

    if-eqz v2, :cond_0

    .line 2304
    iget-boolean v2, v0, Landroid/support/v4/app/l$a;->k:Z

    if-eqz v2, :cond_0

    .line 2305
    const/4 v2, 0x0

    iput-boolean v2, v0, Landroid/support/v4/app/l$a;->k:Z

    .line 2306
    iget-boolean v2, v0, Landroid/support/v4/app/l$a;->e:Z

    if-eqz v2, :cond_0

    .line 2307
    iget-object v2, v0, Landroid/support/v4/app/l$a;->d:Landroid/support/v4/content/c;

    iget-object v3, v0, Landroid/support/v4/app/l$a;->g:Ljava/lang/Object;

    invoke-virtual {v0, v2, v3}, Landroid/support/v4/app/l$a;->a(Landroid/support/v4/content/c;Ljava/lang/Object;)V

    .line 767
    :cond_0
    add-int/lit8 v0, v1, -0x1

    move v1, v0

    goto :goto_0

    .line 770
    :cond_1
    return-void
.end method

.method final g()V
    .locals 3

    .prologue
    .line 773
    iget-boolean v0, p0, Landroid/support/v4/app/l;->g:Z

    if-nez v0, :cond_2

    .line 774
    sget-boolean v0, Landroid/support/v4/app/l;->a:Z

    if-eqz v0, :cond_0

    const-string v0, "LoaderManager"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Destroying Active in "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 775
    :cond_0
    iget-object v0, p0, Landroid/support/v4/app/l;->b:Landroid/support/v4/e/h;

    invoke-virtual {v0}, Landroid/support/v4/e/h;->a()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v1, v0

    :goto_0
    if-ltz v1, :cond_1

    .line 776
    iget-object v0, p0, Landroid/support/v4/app/l;->b:Landroid/support/v4/e/h;

    invoke-virtual {v0, v1}, Landroid/support/v4/e/h;->b(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/l$a;

    invoke-virtual {v0}, Landroid/support/v4/app/l$a;->b()V

    .line 775
    add-int/lit8 v0, v1, -0x1

    move v1, v0

    goto :goto_0

    .line 778
    :cond_1
    iget-object v0, p0, Landroid/support/v4/app/l;->b:Landroid/support/v4/e/h;

    invoke-virtual {v0}, Landroid/support/v4/e/h;->b()V

    .line 781
    :cond_2
    sget-boolean v0, Landroid/support/v4/app/l;->a:Z

    if-eqz v0, :cond_3

    const-string v0, "LoaderManager"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Destroying Inactive in "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 782
    :cond_3
    iget-object v0, p0, Landroid/support/v4/app/l;->c:Landroid/support/v4/e/h;

    invoke-virtual {v0}, Landroid/support/v4/e/h;->a()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v1, v0

    :goto_1
    if-ltz v1, :cond_4

    .line 783
    iget-object v0, p0, Landroid/support/v4/app/l;->c:Landroid/support/v4/e/h;

    invoke-virtual {v0, v1}, Landroid/support/v4/e/h;->b(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/l$a;

    invoke-virtual {v0}, Landroid/support/v4/app/l$a;->b()V

    .line 782
    add-int/lit8 v0, v1, -0x1

    move v1, v0

    goto :goto_1

    .line 785
    :cond_4
    iget-object v0, p0, Landroid/support/v4/app/l;->c:Landroid/support/v4/e/h;

    invoke-virtual {v0}, Landroid/support/v4/e/h;->b()V

    .line 786
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 790
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x80

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 791
    const-string v1, "LoaderManager{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 792
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 793
    const-string v1, " in "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 794
    iget-object v1, p0, Landroid/support/v4/app/l;->e:Landroid/support/v4/app/e;

    invoke-static {v1, v0}, Landroid/support/v4/e/c;->a(Ljava/lang/Object;Ljava/lang/StringBuilder;)V

    .line 795
    const-string v1, "}}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 796
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
