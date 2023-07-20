.class public Landroid/support/v4/app/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ComponentCallbacks;
.implements Landroid/view/View$OnCreateContextMenuListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/app/d$a;
    }
.end annotation


# static fields
.field static final a:Ljava/lang/Object;

.field private static final aa:Landroid/support/v4/e/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/support/v4/e/g",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Class",
            "<*>;>;"
        }
    .end annotation
.end field


# instance fields
.field A:Z

.field B:Z

.field C:Z

.field D:Z

.field E:Z

.field F:Z

.field G:Z

.field H:I

.field I:Landroid/view/ViewGroup;

.field J:Landroid/view/View;

.field K:Landroid/view/View;

.field L:Z

.field M:Z

.field N:Landroid/support/v4/app/l;

.field O:Z

.field P:Z

.field Q:Ljava/lang/Object;

.field R:Ljava/lang/Object;

.field S:Ljava/lang/Object;

.field T:Ljava/lang/Object;

.field U:Ljava/lang/Object;

.field V:Ljava/lang/Object;

.field W:Ljava/lang/Boolean;

.field X:Ljava/lang/Boolean;

.field Y:Landroid/support/v4/app/n;

.field Z:Landroid/support/v4/app/n;

.field b:I

.field c:Landroid/view/View;

.field d:I

.field e:Landroid/os/Bundle;

.field f:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray",
            "<",
            "Landroid/os/Parcelable;",
            ">;"
        }
    .end annotation
.end field

.field g:I

.field h:Ljava/lang/String;

.field i:Landroid/os/Bundle;

.field j:Landroid/support/v4/app/d;

.field k:I

.field l:I

.field m:Z

.field n:Z

.field o:Z

.field p:Z

.field q:Z

.field r:Z

.field s:I

.field t:Landroid/support/v4/app/h;

.field u:Landroid/support/v4/app/e;

.field v:Landroid/support/v4/app/h;

.field w:Landroid/support/v4/app/d;

.field x:I

.field y:I

.field z:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 168
    new-instance v0, Landroid/support/v4/e/g;

    invoke-direct {v0}, Landroid/support/v4/e/g;-><init>()V

    sput-object v0, Landroid/support/v4/app/d;->aa:Landroid/support/v4/e/g;

    .line 171
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Landroid/support/v4/app/d;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, -0x1

    const/4 v1, 0x0

    .line 387
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 180
    const/4 v0, 0x0

    iput v0, p0, Landroid/support/v4/app/d;->b:I

    .line 196
    iput v2, p0, Landroid/support/v4/app/d;->g:I

    .line 208
    iput v2, p0, Landroid/support/v4/app/d;->k:I

    .line 279
    iput-boolean v3, p0, Landroid/support/v4/app/d;->F:Z

    .line 301
    iput-boolean v3, p0, Landroid/support/v4/app/d;->M:Z

    .line 307
    iput-object v1, p0, Landroid/support/v4/app/d;->Q:Ljava/lang/Object;

    .line 308
    sget-object v0, Landroid/support/v4/app/d;->a:Ljava/lang/Object;

    iput-object v0, p0, Landroid/support/v4/app/d;->R:Ljava/lang/Object;

    .line 309
    iput-object v1, p0, Landroid/support/v4/app/d;->S:Ljava/lang/Object;

    .line 310
    sget-object v0, Landroid/support/v4/app/d;->a:Ljava/lang/Object;

    iput-object v0, p0, Landroid/support/v4/app/d;->T:Ljava/lang/Object;

    .line 311
    iput-object v1, p0, Landroid/support/v4/app/d;->U:Ljava/lang/Object;

    .line 312
    sget-object v0, Landroid/support/v4/app/d;->a:Ljava/lang/Object;

    iput-object v0, p0, Landroid/support/v4/app/d;->V:Ljava/lang/Object;

    .line 316
    iput-object v1, p0, Landroid/support/v4/app/d;->Y:Landroid/support/v4/app/n;

    .line 317
    iput-object v1, p0, Landroid/support/v4/app/d;->Z:Landroid/support/v4/app/n;

    .line 388
    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;)Landroid/support/v4/app/d;
    .locals 1

    .prologue
    .line 395
    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Landroid/support/v4/app/d;->a(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)Landroid/support/v4/app/d;

    move-result-object v0

    return-object v0
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)Landroid/support/v4/app/d;
    .locals 4

    .prologue
    .line 414
    :try_start_0
    sget-object v0, Landroid/support/v4/app/d;->aa:Landroid/support/v4/e/g;

    invoke-virtual {v0, p1}, Landroid/support/v4/e/g;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Class;

    .line 415
    if-nez v0, :cond_0

    .line 417
    invoke-virtual {p0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    .line 418
    sget-object v1, Landroid/support/v4/app/d;->aa:Landroid/support/v4/e/g;

    invoke-virtual {v1, p1, v0}, Landroid/support/v4/e/g;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 420
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/d;

    .line 421
    if-eqz p2, :cond_1

    .line 422
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p2, v1}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 423
    iput-object p2, v0, Landroid/support/v4/app/d;->i:Landroid/os/Bundle;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2

    .line 425
    :cond_1
    return-object v0

    .line 426
    :catch_0
    move-exception v0

    .line 427
    new-instance v1, Landroid/support/v4/app/d$a;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Unable to instantiate fragment "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ": make sure class name exists, is public, and has an empty constructor that is public"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Landroid/support/v4/app/d$a;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw v1

    .line 430
    :catch_1
    move-exception v0

    .line 431
    new-instance v1, Landroid/support/v4/app/d$a;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Unable to instantiate fragment "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ": make sure class name exists, is public, and has an empty constructor that is public"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Landroid/support/v4/app/d$a;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw v1

    .line 434
    :catch_2
    move-exception v0

    .line 435
    new-instance v1, Landroid/support/v4/app/d$a;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Unable to instantiate fragment "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ": make sure class name exists, is public, and has an empty constructor that is public"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Landroid/support/v4/app/d$a;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw v1
.end method

.method public static a()V
    .locals 0

    .prologue
    .line 782
    return-void
.end method

.method public static b()V
    .locals 0

    .prologue
    .line 925
    return-void
.end method

.method static b(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 2

    .prologue
    .line 451
    :try_start_0
    sget-object v0, Landroid/support/v4/app/d;->aa:Landroid/support/v4/e/g;

    invoke-virtual {v0, p1}, Landroid/support/v4/e/g;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Class;

    .line 452
    if-nez v0, :cond_0

    .line 454
    invoke-virtual {p0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    .line 455
    sget-object v1, Landroid/support/v4/app/d;->aa:Landroid/support/v4/e/g;

    invoke-virtual {v1, p1, v0}, Landroid/support/v4/e/g;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 457
    :cond_0
    const-class v1, Landroid/support/v4/app/d;

    invoke-virtual {v1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    .line 459
    :goto_0
    return v0

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static d()Landroid/view/animation/Animation;
    .locals 1

    .prologue
    .line 997
    const/4 v0, 0x0

    return-object v0
.end method

.method public static e()V
    .locals 0

    .prologue
    .line 1053
    return-void
.end method

.method public static f()V
    .locals 0

    .prologue
    .line 1285
    return-void
.end method


# virtual methods
.method final a(ILandroid/support/v4/app/d;)V
    .locals 2

    .prologue
    .line 477
    iput p1, p0, Landroid/support/v4/app/d;->g:I

    .line 478
    if-eqz p2, :cond_0

    .line 479
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p2, Landroid/support/v4/app/d;->h:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Landroid/support/v4/app/d;->g:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v4/app/d;->h:Ljava/lang/String;

    .line 483
    :goto_0
    return-void

    .line 481
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "android:fragment:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Landroid/support/v4/app/d;->g:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v4/app/d;->h:Ljava/lang/String;

    goto :goto_0
.end method

.method final a(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 1934
    iget-object v0, p0, Landroid/support/v4/app/d;->v:Landroid/support/v4/app/h;

    if-eqz v0, :cond_0

    .line 1935
    iget-object v0, p0, Landroid/support/v4/app/d;->v:Landroid/support/v4/app/h;

    invoke-virtual {v0}, Landroid/support/v4/app/h;->c()Landroid/os/Parcelable;

    move-result-object v0

    .line 1936
    if-eqz v0, :cond_0

    .line 1937
    const-string v1, "android:support:fragments"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 1940
    :cond_0
    return-void
.end method

.method public final c()Landroid/view/LayoutInflater;
    .locals 3

    .prologue
    .line 933
    iget-object v0, p0, Landroid/support/v4/app/d;->u:Landroid/support/v4/app/e;

    invoke-virtual {v0}, Landroid/support/v4/app/e;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    iget-object v1, p0, Landroid/support/v4/app/d;->u:Landroid/support/v4/app/e;

    invoke-virtual {v0, v1}, Landroid/view/LayoutInflater;->cloneInContext(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    .line 2676
    iget-object v1, p0, Landroid/support/v4/app/d;->v:Landroid/support/v4/app/h;

    if-nez v1, :cond_0

    .line 2677
    invoke-virtual {p0}, Landroid/support/v4/app/d;->g()V

    .line 2678
    iget v1, p0, Landroid/support/v4/app/d;->b:I

    const/4 v2, 0x5

    if-lt v1, v2, :cond_1

    .line 2679
    iget-object v1, p0, Landroid/support/v4/app/d;->v:Landroid/support/v4/app/h;

    invoke-virtual {v1}, Landroid/support/v4/app/h;->g()V

    .line 935
    :cond_0
    :goto_0
    iget-object v1, p0, Landroid/support/v4/app/d;->v:Landroid/support/v4/app/h;

    invoke-virtual {v0, v1}, Landroid/view/LayoutInflater;->setFactory(Landroid/view/LayoutInflater$Factory;)V

    .line 936
    return-object v0

    .line 2680
    :cond_1
    iget v1, p0, Landroid/support/v4/app/d;->b:I

    const/4 v2, 0x4

    if-lt v1, v2, :cond_2

    .line 2681
    iget-object v1, p0, Landroid/support/v4/app/d;->v:Landroid/support/v4/app/h;

    invoke-virtual {v1}, Landroid/support/v4/app/h;->f()V

    goto :goto_0

    .line 2682
    :cond_2
    iget v1, p0, Landroid/support/v4/app/d;->b:I

    const/4 v2, 0x2

    if-lt v1, v2, :cond_3

    .line 2683
    iget-object v1, p0, Landroid/support/v4/app/d;->v:Landroid/support/v4/app/h;

    invoke-virtual {v1}, Landroid/support/v4/app/h;->e()V

    goto :goto_0

    .line 2684
    :cond_3
    iget v1, p0, Landroid/support/v4/app/d;->b:I

    if-lez v1, :cond_0

    .line 2685
    iget-object v1, p0, Landroid/support/v4/app/d;->v:Landroid/support/v4/app/h;

    invoke-virtual {v1}, Landroid/support/v4/app/h;->d()V

    goto :goto_0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 493
    invoke-super {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method final g()V
    .locals 3

    .prologue
    .line 1741
    new-instance v0, Landroid/support/v4/app/h;

    invoke-direct {v0}, Landroid/support/v4/app/h;-><init>()V

    iput-object v0, p0, Landroid/support/v4/app/d;->v:Landroid/support/v4/app/h;

    .line 1742
    iget-object v0, p0, Landroid/support/v4/app/d;->v:Landroid/support/v4/app/h;

    iget-object v1, p0, Landroid/support/v4/app/d;->u:Landroid/support/v4/app/e;

    new-instance v2, Landroid/support/v4/app/d$1;

    invoke-direct {v2, p0}, Landroid/support/v4/app/d$1;-><init>(Landroid/support/v4/app/d;)V

    invoke-virtual {v0, v1, v2, p0}, Landroid/support/v4/app/h;->a(Landroid/support/v4/app/e;Landroid/support/v4/app/f;Landroid/support/v4/app/d;)V

    .line 1756
    return-void
.end method

.method final h()Landroid/view/View;
    .locals 2

    .prologue
    .line 1783
    iget-object v0, p0, Landroid/support/v4/app/d;->v:Landroid/support/v4/app/h;

    if-eqz v0, :cond_0

    .line 1784
    iget-object v0, p0, Landroid/support/v4/app/d;->v:Landroid/support/v4/app/h;

    .line 3907
    const/4 v1, 0x0

    iput-boolean v1, v0, Landroid/support/v4/app/h;->s:Z

    .line 1786
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    .prologue
    .line 500
    invoke-super {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method final i()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x1

    .line 1805
    iget-object v0, p0, Landroid/support/v4/app/d;->v:Landroid/support/v4/app/h;

    if-eqz v0, :cond_0

    .line 1806
    iget-object v0, p0, Landroid/support/v4/app/d;->v:Landroid/support/v4/app/h;

    .line 4907
    iput-boolean v2, v0, Landroid/support/v4/app/h;->s:Z

    .line 1807
    iget-object v0, p0, Landroid/support/v4/app/d;->v:Landroid/support/v4/app/h;

    invoke-virtual {v0}, Landroid/support/v4/app/h;->a()Z

    .line 1809
    :cond_0
    iput-boolean v2, p0, Landroid/support/v4/app/d;->G:Z

    .line 5104
    iput-boolean v1, p0, Landroid/support/v4/app/d;->G:Z

    .line 5106
    iget-boolean v0, p0, Landroid/support/v4/app/d;->O:Z

    if-nez v0, :cond_2

    .line 5107
    iput-boolean v1, p0, Landroid/support/v4/app/d;->O:Z

    .line 5108
    iget-boolean v0, p0, Landroid/support/v4/app/d;->P:Z

    if-nez v0, :cond_1

    .line 5109
    iput-boolean v1, p0, Landroid/support/v4/app/d;->P:Z

    .line 5110
    iget-object v0, p0, Landroid/support/v4/app/d;->u:Landroid/support/v4/app/e;

    iget-object v1, p0, Landroid/support/v4/app/d;->h:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/support/v4/app/e;->b(Ljava/lang/String;)Landroid/support/v4/app/l;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v4/app/d;->N:Landroid/support/v4/app/l;

    .line 5112
    :cond_1
    iget-object v0, p0, Landroid/support/v4/app/d;->N:Landroid/support/v4/app/l;

    if-eqz v0, :cond_2

    .line 5113
    iget-object v0, p0, Landroid/support/v4/app/d;->N:Landroid/support/v4/app/l;

    invoke-virtual {v0}, Landroid/support/v4/app/l;->b()V

    .line 1811
    :cond_2
    iget-boolean v0, p0, Landroid/support/v4/app/d;->G:Z

    if-nez v0, :cond_3

    .line 1812
    new-instance v0, Landroid/support/v4/app/o;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " did not call through to super.onStart()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/support/v4/app/o;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1815
    :cond_3
    iget-object v0, p0, Landroid/support/v4/app/d;->v:Landroid/support/v4/app/h;

    if-eqz v0, :cond_4

    .line 1816
    iget-object v0, p0, Landroid/support/v4/app/d;->v:Landroid/support/v4/app/h;

    invoke-virtual {v0}, Landroid/support/v4/app/h;->f()V

    .line 1818
    :cond_4
    iget-object v0, p0, Landroid/support/v4/app/d;->N:Landroid/support/v4/app/l;

    if-eqz v0, :cond_5

    .line 1819
    iget-object v0, p0, Landroid/support/v4/app/d;->N:Landroid/support/v4/app/l;

    invoke-virtual {v0}, Landroid/support/v4/app/l;->f()V

    .line 1821
    :cond_5
    return-void
.end method

.method final j()V
    .locals 2

    .prologue
    .line 1967
    iget-object v0, p0, Landroid/support/v4/app/d;->v:Landroid/support/v4/app/h;

    if-eqz v0, :cond_0

    .line 1968
    iget-object v0, p0, Landroid/support/v4/app/d;->v:Landroid/support/v4/app/h;

    .line 5944
    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/support/v4/app/h;->a(I)V

    .line 1970
    :cond_0
    iget-boolean v0, p0, Landroid/support/v4/app/d;->O:Z

    if-eqz v0, :cond_2

    .line 1971
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/v4/app/d;->O:Z

    .line 1972
    iget-boolean v0, p0, Landroid/support/v4/app/d;->P:Z

    if-nez v0, :cond_1

    .line 1973
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v4/app/d;->P:Z

    .line 1974
    iget-object v0, p0, Landroid/support/v4/app/d;->u:Landroid/support/v4/app/e;

    iget-object v1, p0, Landroid/support/v4/app/d;->h:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/support/v4/app/e;->b(Ljava/lang/String;)Landroid/support/v4/app/l;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v4/app/d;->N:Landroid/support/v4/app/l;

    .line 1976
    :cond_1
    iget-object v0, p0, Landroid/support/v4/app/d;->N:Landroid/support/v4/app/l;

    if-eqz v0, :cond_2

    .line 1977
    iget-object v0, p0, Landroid/support/v4/app/d;->u:Landroid/support/v4/app/e;

    iget-boolean v0, v0, Landroid/support/v4/app/e;->h:Z

    if-nez v0, :cond_3

    .line 1978
    iget-object v0, p0, Landroid/support/v4/app/d;->N:Landroid/support/v4/app/l;

    invoke-virtual {v0}, Landroid/support/v4/app/l;->c()V

    .line 1984
    :cond_2
    :goto_0
    return-void

    .line 1980
    :cond_3
    iget-object v0, p0, Landroid/support/v4/app/d;->N:Landroid/support/v4/app/l;

    invoke-virtual {v0}, Landroid/support/v4/app/l;->d()V

    goto :goto_0
.end method

.method final k()V
    .locals 3

    .prologue
    const/4 v1, 0x1

    .line 2002
    iget-object v0, p0, Landroid/support/v4/app/d;->v:Landroid/support/v4/app/h;

    if-eqz v0, :cond_0

    .line 2003
    iget-object v0, p0, Landroid/support/v4/app/d;->v:Landroid/support/v4/app/h;

    invoke-virtual {v0}, Landroid/support/v4/app/h;->i()V

    .line 2005
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/v4/app/d;->G:Z

    .line 6194
    iput-boolean v1, p0, Landroid/support/v4/app/d;->G:Z

    .line 6197
    iget-boolean v0, p0, Landroid/support/v4/app/d;->P:Z

    if-nez v0, :cond_1

    .line 6198
    iput-boolean v1, p0, Landroid/support/v4/app/d;->P:Z

    .line 6199
    iget-object v0, p0, Landroid/support/v4/app/d;->u:Landroid/support/v4/app/e;

    iget-object v1, p0, Landroid/support/v4/app/d;->h:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/support/v4/app/e;->b(Ljava/lang/String;)Landroid/support/v4/app/l;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v4/app/d;->N:Landroid/support/v4/app/l;

    .line 6201
    :cond_1
    iget-object v0, p0, Landroid/support/v4/app/d;->N:Landroid/support/v4/app/l;

    if-eqz v0, :cond_2

    .line 6202
    iget-object v0, p0, Landroid/support/v4/app/d;->N:Landroid/support/v4/app/l;

    invoke-virtual {v0}, Landroid/support/v4/app/l;->g()V

    .line 2007
    :cond_2
    iget-boolean v0, p0, Landroid/support/v4/app/d;->G:Z

    if-nez v0, :cond_3

    .line 2008
    new-instance v0, Landroid/support/v4/app/o;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " did not call through to super.onDestroy()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/support/v4/app/o;-><init>(Ljava/lang/String;)V

    throw v0

    .line 2011
    :cond_3
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1

    .prologue
    .line 1151
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v4/app/d;->G:Z

    .line 1152
    return-void
.end method

.method public onCreateContextMenu(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V
    .locals 1

    .prologue
    .line 1337
    .line 3611
    iget-object v0, p0, Landroid/support/v4/app/d;->u:Landroid/support/v4/app/e;

    .line 1337
    invoke-virtual {v0, p1, p2, p3}, Landroid/support/v4/app/e;->onCreateContextMenu(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V

    .line 1338
    return-void
.end method

.method public onLowMemory()V
    .locals 1

    .prologue
    .line 1173
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v4/app/d;->G:Z

    .line 1174
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 505
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x80

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 506
    invoke-static {p0, v0}, Landroid/support/v4/e/c;->a(Ljava/lang/Object;Ljava/lang/StringBuilder;)V

    .line 507
    iget v1, p0, Landroid/support/v4/app/d;->g:I

    if-ltz v1, :cond_0

    .line 508
    const-string v1, " #"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 509
    iget v1, p0, Landroid/support/v4/app/d;->g:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 511
    :cond_0
    iget v1, p0, Landroid/support/v4/app/d;->x:I

    if-eqz v1, :cond_1

    .line 512
    const-string v1, " id=0x"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 513
    iget v1, p0, Landroid/support/v4/app/d;->x:I

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 515
    :cond_1
    iget-object v1, p0, Landroid/support/v4/app/d;->z:Ljava/lang/String;

    if-eqz v1, :cond_2

    .line 516
    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 517
    iget-object v1, p0, Landroid/support/v4/app/d;->z:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 519
    :cond_2
    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 520
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
