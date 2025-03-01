.class final Landroid/support/v4/app/l$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/support/v4/content/c$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/app/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/support/v4/content/c$a",
        "<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field final a:I

.field final b:Landroid/os/Bundle;

.field c:Landroid/support/v4/app/k$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/support/v4/app/k$a",
            "<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field d:Landroid/support/v4/content/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/support/v4/content/c",
            "<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field e:Z

.field f:Z

.field g:Ljava/lang/Object;

.field h:Z

.field i:Z

.field j:Z

.field k:Z

.field l:Z

.field m:Z

.field n:Landroid/support/v4/app/l$a;

.field final synthetic o:Landroid/support/v4/app/l;


# virtual methods
.method final a()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 314
    sget-boolean v0, Landroid/support/v4/app/l;->a:Z

    if-eqz v0, :cond_0

    const-string v0, "LoaderManager"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "  Stopping: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 315
    :cond_0
    iput-boolean v3, p0, Landroid/support/v4/app/l$a;->h:Z

    .line 316
    iget-boolean v0, p0, Landroid/support/v4/app/l$a;->i:Z

    if-nez v0, :cond_1

    .line 317
    iget-object v0, p0, Landroid/support/v4/app/l$a;->d:Landroid/support/v4/content/c;

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Landroid/support/v4/app/l$a;->m:Z

    if-eqz v0, :cond_1

    .line 319
    iput-boolean v3, p0, Landroid/support/v4/app/l$a;->m:Z

    .line 320
    iget-object v0, p0, Landroid/support/v4/app/l$a;->d:Landroid/support/v4/content/c;

    invoke-virtual {v0, p0}, Landroid/support/v4/content/c;->a(Landroid/support/v4/content/c$a;)V

    .line 321
    iget-object v0, p0, Landroid/support/v4/app/l$a;->d:Landroid/support/v4/content/c;

    .line 1243
    iput-boolean v3, v0, Landroid/support/v4/content/c;->c:Z

    .line 324
    :cond_1
    return-void
.end method

.method final a(Landroid/support/v4/content/c;Ljava/lang/Object;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/support/v4/content/c",
            "<",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    .prologue
    .line 418
    iget-object v0, p0, Landroid/support/v4/app/l$a;->c:Landroid/support/v4/app/k$a;

    if-eqz v0, :cond_2

    .line 419
    const/4 v0, 0x0

    .line 420
    iget-object v1, p0, Landroid/support/v4/app/l$a;->o:Landroid/support/v4/app/l;

    iget-object v1, v1, Landroid/support/v4/app/l;->e:Landroid/support/v4/app/e;

    if-eqz v1, :cond_4

    .line 421
    iget-object v0, p0, Landroid/support/v4/app/l$a;->o:Landroid/support/v4/app/l;

    iget-object v0, v0, Landroid/support/v4/app/l;->e:Landroid/support/v4/app/e;

    iget-object v0, v0, Landroid/support/v4/app/e;->b:Landroid/support/v4/app/h;

    iget-object v0, v0, Landroid/support/v4/app/h;->u:Ljava/lang/String;

    .line 422
    iget-object v1, p0, Landroid/support/v4/app/l$a;->o:Landroid/support/v4/app/l;

    iget-object v1, v1, Landroid/support/v4/app/l;->e:Landroid/support/v4/app/e;

    iget-object v1, v1, Landroid/support/v4/app/e;->b:Landroid/support/v4/app/h;

    const-string v2, "onLoadFinished"

    iput-object v2, v1, Landroid/support/v4/app/h;->u:Ljava/lang/String;

    move-object v1, v0

    .line 425
    :goto_0
    :try_start_0
    sget-boolean v0, Landroid/support/v4/app/l;->a:Z

    if-eqz v0, :cond_0

    const-string v0, "LoaderManager"

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "  onLoadFinished in "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ": "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 1368
    new-instance v3, Ljava/lang/StringBuilder;

    const/16 v4, 0x40

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 1369
    invoke-static {p2, v3}, Landroid/support/v4/e/c;->a(Ljava/lang/Object;Ljava/lang/StringBuilder;)V

    .line 1370
    const-string v4, "}"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1371
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 425
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 429
    :cond_0
    iget-object v0, p0, Landroid/support/v4/app/l$a;->o:Landroid/support/v4/app/l;

    iget-object v0, v0, Landroid/support/v4/app/l;->e:Landroid/support/v4/app/e;

    if-eqz v0, :cond_1

    .line 430
    iget-object v0, p0, Landroid/support/v4/app/l$a;->o:Landroid/support/v4/app/l;

    iget-object v0, v0, Landroid/support/v4/app/l;->e:Landroid/support/v4/app/e;

    iget-object v0, v0, Landroid/support/v4/app/e;->b:Landroid/support/v4/app/h;

    iput-object v1, v0, Landroid/support/v4/app/h;->u:Ljava/lang/String;

    .line 433
    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v4/app/l$a;->f:Z

    .line 435
    :cond_2
    return-void

    .line 429
    :catchall_0
    move-exception v0

    iget-object v2, p0, Landroid/support/v4/app/l$a;->o:Landroid/support/v4/app/l;

    iget-object v2, v2, Landroid/support/v4/app/l;->e:Landroid/support/v4/app/e;

    if-eqz v2, :cond_3

    .line 430
    iget-object v2, p0, Landroid/support/v4/app/l$a;->o:Landroid/support/v4/app/l;

    iget-object v2, v2, Landroid/support/v4/app/l;->e:Landroid/support/v4/app/e;

    iget-object v2, v2, Landroid/support/v4/app/e;->b:Landroid/support/v4/app/h;

    iput-object v1, v2, Landroid/support/v4/app/h;->u:Ljava/lang/String;

    :cond_3
    throw v0

    :cond_4
    move-object v1, v0

    goto :goto_0
.end method

.method public final a(Ljava/lang/String;Ljava/io/PrintWriter;)V
    .locals 3

    .prologue
    .line 451
    :goto_0
    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mId="

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v0, p0, Landroid/support/v4/app/l$a;->a:I

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(I)V

    .line 452
    const-string v0, " mArgs="

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroid/support/v4/app/l$a;->b:Landroid/os/Bundle;

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 453
    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mCallbacks="

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroid/support/v4/app/l$a;->c:Landroid/support/v4/app/k$a;

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 454
    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mLoader="

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroid/support/v4/app/l$a;->d:Landroid/support/v4/content/c;

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 455
    iget-object v0, p0, Landroid/support/v4/app/l$a;->d:Landroid/support/v4/content/c;

    if-eqz v0, :cond_3

    .line 456
    iget-object v0, p0, Landroid/support/v4/app/l$a;->d:Landroid/support/v4/content/c;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "  "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 1393
    invoke-virtual {p2, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v2, "mId="

    invoke-virtual {p2, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v2, v0, Landroid/support/v4/content/c;->a:I

    invoke-virtual {p2, v2}, Ljava/io/PrintWriter;->print(I)V

    .line 1394
    const-string v2, " mListener="

    invoke-virtual {p2, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v2, v0, Landroid/support/v4/content/c;->b:Landroid/support/v4/content/c$a;

    invoke-virtual {p2, v2}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 1395
    iget-boolean v2, v0, Landroid/support/v4/content/c;->c:Z

    if-nez v2, :cond_0

    iget-boolean v2, v0, Landroid/support/v4/content/c;->f:Z

    if-nez v2, :cond_0

    iget-boolean v2, v0, Landroid/support/v4/content/c;->g:Z

    if-eqz v2, :cond_1

    .line 1396
    :cond_0
    invoke-virtual {p2, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v2, "mStarted="

    invoke-virtual {p2, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v2, v0, Landroid/support/v4/content/c;->c:Z

    invoke-virtual {p2, v2}, Ljava/io/PrintWriter;->print(Z)V

    .line 1397
    const-string v2, " mContentChanged="

    invoke-virtual {p2, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v2, v0, Landroid/support/v4/content/c;->f:Z

    invoke-virtual {p2, v2}, Ljava/io/PrintWriter;->print(Z)V

    .line 1398
    const-string v2, " mProcessingChange="

    invoke-virtual {p2, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v2, v0, Landroid/support/v4/content/c;->g:Z

    invoke-virtual {p2, v2}, Ljava/io/PrintWriter;->println(Z)V

    .line 1400
    :cond_1
    iget-boolean v2, v0, Landroid/support/v4/content/c;->d:Z

    if-nez v2, :cond_2

    iget-boolean v2, v0, Landroid/support/v4/content/c;->e:Z

    if-eqz v2, :cond_3

    .line 1401
    :cond_2
    invoke-virtual {p2, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v1, "mAbandoned="

    invoke-virtual {p2, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v1, v0, Landroid/support/v4/content/c;->d:Z

    invoke-virtual {p2, v1}, Ljava/io/PrintWriter;->print(Z)V

    .line 1402
    const-string v1, " mReset="

    invoke-virtual {p2, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, v0, Landroid/support/v4/content/c;->e:Z

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->println(Z)V

    .line 458
    :cond_3
    iget-boolean v0, p0, Landroid/support/v4/app/l$a;->e:Z

    if-nez v0, :cond_4

    iget-boolean v0, p0, Landroid/support/v4/app/l$a;->f:Z

    if-eqz v0, :cond_5

    .line 459
    :cond_4
    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mHaveData="

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroid/support/v4/app/l$a;->e:Z

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Z)V

    .line 460
    const-string v0, "  mDeliveredData="

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroid/support/v4/app/l$a;->f:Z

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->println(Z)V

    .line 461
    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mData="

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroid/support/v4/app/l$a;->g:Ljava/lang/Object;

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 463
    :cond_5
    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mStarted="

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroid/support/v4/app/l$a;->h:Z

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Z)V

    .line 464
    const-string v0, " mReportNextStart="

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroid/support/v4/app/l$a;->k:Z

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Z)V

    .line 465
    const-string v0, " mDestroyed="

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroid/support/v4/app/l$a;->l:Z

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->println(Z)V

    .line 466
    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mRetaining="

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroid/support/v4/app/l$a;->i:Z

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Z)V

    .line 467
    const-string v0, " mRetainingStarted="

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroid/support/v4/app/l$a;->j:Z

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Z)V

    .line 468
    const-string v0, " mListenerRegistered="

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroid/support/v4/app/l$a;->m:Z

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->println(Z)V

    .line 469
    iget-object v0, p0, Landroid/support/v4/app/l$a;->n:Landroid/support/v4/app/l$a;

    if-eqz v0, :cond_6

    .line 470
    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "Pending Loader "

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 471
    iget-object v0, p0, Landroid/support/v4/app/l$a;->n:Landroid/support/v4/app/l$a;

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/Object;)V

    const-string v0, ":"

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 472
    iget-object p0, p0, Landroid/support/v4/app/l$a;->n:Landroid/support/v4/app/l$a;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "  "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto/16 :goto_0

    .line 474
    :cond_6
    return-void
.end method

.method final b()V
    .locals 6

    .prologue
    const/4 v5, 0x1

    const/4 v1, 0x0

    const/4 v4, 0x0

    .line 327
    :goto_0
    sget-boolean v0, Landroid/support/v4/app/l;->a:Z

    if-eqz v0, :cond_0

    const-string v0, "LoaderManager"

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "  Destroying: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 328
    :cond_0
    iput-boolean v5, p0, Landroid/support/v4/app/l$a;->l:Z

    .line 329
    iget-boolean v0, p0, Landroid/support/v4/app/l$a;->f:Z

    .line 330
    iput-boolean v4, p0, Landroid/support/v4/app/l$a;->f:Z

    .line 331
    iget-object v2, p0, Landroid/support/v4/app/l$a;->c:Landroid/support/v4/app/k$a;

    if-eqz v2, :cond_2

    iget-object v2, p0, Landroid/support/v4/app/l$a;->d:Landroid/support/v4/content/c;

    if-eqz v2, :cond_2

    iget-boolean v2, p0, Landroid/support/v4/app/l$a;->e:Z

    if-eqz v2, :cond_2

    if-eqz v0, :cond_2

    .line 332
    sget-boolean v0, Landroid/support/v4/app/l;->a:Z

    if-eqz v0, :cond_1

    const-string v0, "LoaderManager"

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "  Reseting: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 334
    :cond_1
    iget-object v0, p0, Landroid/support/v4/app/l$a;->o:Landroid/support/v4/app/l;

    iget-object v0, v0, Landroid/support/v4/app/l;->e:Landroid/support/v4/app/e;

    if-eqz v0, :cond_6

    .line 335
    iget-object v0, p0, Landroid/support/v4/app/l$a;->o:Landroid/support/v4/app/l;

    iget-object v0, v0, Landroid/support/v4/app/l;->e:Landroid/support/v4/app/e;

    iget-object v0, v0, Landroid/support/v4/app/e;->b:Landroid/support/v4/app/h;

    iget-object v0, v0, Landroid/support/v4/app/h;->u:Ljava/lang/String;

    .line 336
    iget-object v2, p0, Landroid/support/v4/app/l$a;->o:Landroid/support/v4/app/l;

    iget-object v2, v2, Landroid/support/v4/app/l;->e:Landroid/support/v4/app/e;

    iget-object v2, v2, Landroid/support/v4/app/e;->b:Landroid/support/v4/app/h;

    const-string v3, "onLoaderReset"

    iput-object v3, v2, Landroid/support/v4/app/h;->u:Ljava/lang/String;

    .line 341
    :goto_1
    iget-object v2, p0, Landroid/support/v4/app/l$a;->o:Landroid/support/v4/app/l;

    iget-object v2, v2, Landroid/support/v4/app/l;->e:Landroid/support/v4/app/e;

    if-eqz v2, :cond_2

    .line 342
    iget-object v2, p0, Landroid/support/v4/app/l$a;->o:Landroid/support/v4/app/l;

    iget-object v2, v2, Landroid/support/v4/app/l;->e:Landroid/support/v4/app/e;

    iget-object v2, v2, Landroid/support/v4/app/e;->b:Landroid/support/v4/app/h;

    iput-object v0, v2, Landroid/support/v4/app/h;->u:Ljava/lang/String;

    .line 346
    :cond_2
    iput-object v1, p0, Landroid/support/v4/app/l$a;->c:Landroid/support/v4/app/k$a;

    .line 347
    iput-object v1, p0, Landroid/support/v4/app/l$a;->g:Ljava/lang/Object;

    .line 348
    iput-boolean v4, p0, Landroid/support/v4/app/l$a;->e:Z

    .line 349
    iget-object v0, p0, Landroid/support/v4/app/l$a;->d:Landroid/support/v4/content/c;

    if-eqz v0, :cond_4

    .line 350
    iget-boolean v0, p0, Landroid/support/v4/app/l$a;->m:Z

    if-eqz v0, :cond_3

    .line 351
    iput-boolean v4, p0, Landroid/support/v4/app/l$a;->m:Z

    .line 352
    iget-object v0, p0, Landroid/support/v4/app/l$a;->d:Landroid/support/v4/content/c;

    invoke-virtual {v0, p0}, Landroid/support/v4/content/c;->a(Landroid/support/v4/content/c$a;)V

    .line 354
    :cond_3
    iget-object v0, p0, Landroid/support/v4/app/l$a;->d:Landroid/support/v4/content/c;

    .line 1292
    iput-boolean v5, v0, Landroid/support/v4/content/c;->e:Z

    .line 1293
    iput-boolean v4, v0, Landroid/support/v4/content/c;->c:Z

    .line 1294
    iput-boolean v4, v0, Landroid/support/v4/content/c;->d:Z

    .line 1295
    iput-boolean v4, v0, Landroid/support/v4/content/c;->f:Z

    .line 1296
    iput-boolean v4, v0, Landroid/support/v4/content/c;->g:Z

    .line 356
    :cond_4
    iget-object v0, p0, Landroid/support/v4/app/l$a;->n:Landroid/support/v4/app/l$a;

    if-eqz v0, :cond_5

    .line 357
    iget-object p0, p0, Landroid/support/v4/app/l$a;->n:Landroid/support/v4/app/l$a;

    goto/16 :goto_0

    .line 359
    :cond_5
    return-void

    :cond_6
    move-object v0, v1

    goto :goto_1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 439
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x40

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 440
    const-string v1, "LoaderInfo{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 441
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 442
    const-string v1, " #"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 443
    iget v1, p0, Landroid/support/v4/app/l$a;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 444
    const-string v1, " : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 445
    iget-object v1, p0, Landroid/support/v4/app/l$a;->d:Landroid/support/v4/content/c;

    invoke-static {v1, v0}, Landroid/support/v4/e/c;->a(Ljava/lang/Object;Ljava/lang/StringBuilder;)V

    .line 446
    const-string v1, "}}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 447
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
