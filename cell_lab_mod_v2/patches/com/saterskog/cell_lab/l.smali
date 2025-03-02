.class public abstract Lcom/saterskog/cell_lab/l;
.super Landroid/app/Activity;
.source "SourceFile"

# interfaces
.implements Lcom/saterskog/a/b$b;
.implements Lcom/saterskog/a/b$d;
.implements Lcom/saterskog/a/b$f;
.implements Lcom/saterskog/cell_lab/s$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/saterskog/cell_lab/l$a;
    }
.end annotation


# instance fields
.field a:Lcom/saterskog/cell_lab/l$a;

.field b:Lcom/saterskog/a/b;

.field c:Landroid/support/v4/view/ViewPager;

.field d:Landroid/media/MediaPlayer;

.field e:Z

.field f:Landroid/media/SoundPool;

.field g:[I

.field protected h:Lcom/saterskog/cell_lab/a;

.field i:[Ljava/lang/String;

.field public j:[Z

.field public k:[Ljava/lang/String;

.field private l:I


# direct methods
.method public constructor <init>()V
    .locals 3

    .prologue
    .line 43
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 58
    const/4 v0, 0x5

    new-array v0, v0, [I

    iput-object v0, p0, Lcom/saterskog/cell_lab/l;->g:[I

    .line 62
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "donate_small"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "donation_medium"

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const-string v2, "donation_large"

    aput-object v2, v0, v1

    iput-object v0, p0, Lcom/saterskog/cell_lab/l;->i:[Ljava/lang/String;

    return-void
.end method

.method private b()V
    .locals 6

    .prologue
    const/4 v3, 0x0

    const/4 v5, 0x3

    const/4 v4, 0x1

    .line 362
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_1

    .line 363
    new-instance v0, Landroid/media/SoundPool$Builder;

    invoke-direct {v0}, Landroid/media/SoundPool$Builder;-><init>()V

    .line 364
    invoke-virtual {v0, v5}, Landroid/media/SoundPool$Builder;->setMaxStreams(I)Landroid/media/SoundPool$Builder;

    move-result-object v0

    .line 365
    invoke-virtual {v0}, Landroid/media/SoundPool$Builder;->build()Landroid/media/SoundPool;

    move-result-object v0

    iput-object v0, p0, Lcom/saterskog/cell_lab/l;->f:Landroid/media/SoundPool;

    .line 370
    :goto_0
    iget-boolean v0, p0, Lcom/saterskog/cell_lab/l;->e:Z

    if-eqz v0, :cond_0

    .line 371
    iget-object v0, p0, Lcom/saterskog/cell_lab/l;->g:[I

    iget-object v1, p0, Lcom/saterskog/cell_lab/l;->f:Landroid/media/SoundPool;

    const v2, 0x7f0d002e

    invoke-virtual {v1, p0, v2, v4}, Landroid/media/SoundPool;->load(Landroid/content/Context;II)I

    move-result v1

    aput v1, v0, v4

    .line 372
    iget-object v0, p0, Lcom/saterskog/cell_lab/l;->g:[I

    iget-object v1, p0, Lcom/saterskog/cell_lab/l;->f:Landroid/media/SoundPool;

    const v2, 0x7f0d0008

    invoke-virtual {v1, p0, v2, v4}, Landroid/media/SoundPool;->load(Landroid/content/Context;II)I

    move-result v1

    aput v1, v0, v3

    .line 373
    iget-object v0, p0, Lcom/saterskog/cell_lab/l;->g:[I

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/saterskog/cell_lab/l;->f:Landroid/media/SoundPool;

    const v3, 0x7f0d002d

    invoke-virtual {v2, p0, v3, v4}, Landroid/media/SoundPool;->load(Landroid/content/Context;II)I

    move-result v2

    aput v2, v0, v1

    .line 374
    iget-object v0, p0, Lcom/saterskog/cell_lab/l;->g:[I

    const/4 v1, 0x4

    iget-object v2, p0, Lcom/saterskog/cell_lab/l;->f:Landroid/media/SoundPool;

    const v3, 0x7f0d0009

    invoke-virtual {v2, p0, v3, v4}, Landroid/media/SoundPool;->load(Landroid/content/Context;II)I

    move-result v2

    aput v2, v0, v1

    .line 375
    iget-object v0, p0, Lcom/saterskog/cell_lab/l;->g:[I

    iget-object v1, p0, Lcom/saterskog/cell_lab/l;->f:Landroid/media/SoundPool;

    const v2, 0x7f0d0018

    invoke-virtual {v1, p0, v2, v4}, Landroid/media/SoundPool;->load(Landroid/content/Context;II)I

    move-result v1

    aput v1, v0, v5

    .line 377
    :cond_0
    return-void

    .line 367
    :cond_1
    new-instance v0, Landroid/media/SoundPool;

    invoke-direct {v0, v5, v5, v3}, Landroid/media/SoundPool;-><init>(III)V

    iput-object v0, p0, Lcom/saterskog/cell_lab/l;->f:Landroid/media/SoundPool;

    goto :goto_0
.end method


# virtual methods
.method abstract a(I)Landroid/app/Fragment;
.end method

.method public final a()V
    .locals 5

    .prologue
    .line 307
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 308
    iget-object v2, p0, Lcom/saterskog/cell_lab/l;->i:[Ljava/lang/String;

    array-length v3, v2

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v3, :cond_0

    aget-object v4, v2, v0

    .line 309
    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 308
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 312
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/saterskog/cell_lab/l;->b:Lcom/saterskog/a/b;

    .line 3689
    new-instance v2, Landroid/os/Handler;

    invoke-direct {v2}, Landroid/os/Handler;-><init>()V

    .line 3690
    invoke-virtual {v0}, Lcom/saterskog/a/b;->b()V

    .line 3691
    const-string v3, "queryInventory"

    invoke-virtual {v0, v3}, Lcom/saterskog/a/b;->a(Ljava/lang/String;)V

    .line 3692
    const-string v3, "refresh inventory"

    invoke-virtual {v0, v3}, Lcom/saterskog/a/b;->b(Ljava/lang/String;)V

    .line 3693
    new-instance v3, Ljava/lang/Thread;

    new-instance v4, Lcom/saterskog/a/b$2;

    invoke-direct {v4, v0, v1, p0, v2}, Lcom/saterskog/a/b$2;-><init>(Lcom/saterskog/a/b;Ljava/util/List;Lcom/saterskog/a/b$f;Landroid/os/Handler;)V

    invoke-direct {v3, v4}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 3716
    invoke-virtual {v3}, Ljava/lang/Thread;->start()V
    :try_end_0
    .catch Lcom/saterskog/a/b$a; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_2

    .line 320
    :goto_1
    return-void

    .line 313
    :catch_0
    move-exception v0

    .line 314
    const-string v1, "Couldn\'t query IAB"

    invoke-static {v1, v0}, Lcom/saterskog/b/a;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1

    .line 315
    :catch_1
    move-exception v0

    .line 316
    const-string v1, "Couldn\'t query IAB, Illegal state"

    invoke-static {v1, v0}, Lcom/saterskog/b/a;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1

    .line 317
    :catch_2
    move-exception v0

    .line 318
    const-string v1, "Nullpointer"

    invoke-static {v1, v0}, Lcom/saterskog/b/a;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1
.end method

.method public final a(Lcom/saterskog/a/c;Lcom/saterskog/a/d;)V
    .locals 4

    .prologue
    .line 334
    invoke-virtual {p1}, Lcom/saterskog/a/c;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 335
    const-string v0, "IAP failed, 271."

    invoke-static {v0}, Lcom/saterskog/b/a;->b(Ljava/lang/String;)V

    .line 360
    :cond_0
    :goto_0
    return-void

    .line 338
    :cond_1
    iget-object v0, p0, Lcom/saterskog/cell_lab/l;->i:[Ljava/lang/String;

    array-length v0, v0

    new-array v0, v0, [Z

    iput-object v0, p0, Lcom/saterskog/cell_lab/l;->j:[Z

    .line 339
    iget-object v0, p0, Lcom/saterskog/cell_lab/l;->i:[Ljava/lang/String;

    array-length v0, v0

    new-array v0, v0, [Ljava/lang/String;

    iput-object v0, p0, Lcom/saterskog/cell_lab/l;->k:[Ljava/lang/String;

    .line 340
    const/4 v0, 0x0

    move v1, v0

    :goto_1
    iget-object v0, p0, Lcom/saterskog/cell_lab/l;->i:[Ljava/lang/String;

    array-length v0, v0

    if-ge v1, v0, :cond_4

    .line 341
    iget-object v0, p0, Lcom/saterskog/cell_lab/l;->j:[Z

    iget-object v2, p0, Lcom/saterskog/cell_lab/l;->i:[Ljava/lang/String;

    aget-object v2, v2, v1

    invoke-virtual {p2, v2}, Lcom/saterskog/a/d;->b(Ljava/lang/String;)Z

    move-result v2

    aput-boolean v2, v0, v1

    .line 342
    iget-object v0, p0, Lcom/saterskog/cell_lab/l;->i:[Ljava/lang/String;

    aget-object v0, v0, v1

    invoke-virtual {p2, v0}, Lcom/saterskog/a/d;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 344
    :try_start_0
    iget-object v2, p0, Lcom/saterskog/cell_lab/l;->b:Lcom/saterskog/a/b;

    iget-object v0, p0, Lcom/saterskog/cell_lab/l;->i:[Ljava/lang/String;

    aget-object v0, v0, v1

    .line 4040
    iget-object v3, p2, Lcom/saterskog/a/d;->b:Ljava/util/Map;

    invoke-interface {v3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/saterskog/a/e;

    .line 344
    invoke-virtual {v2, v0, p0}, Lcom/saterskog/a/b;->a(Lcom/saterskog/a/e;Lcom/saterskog/a/b$b;)V
    :try_end_0
    .catch Lcom/saterskog/a/b$a; {:try_start_0 .. :try_end_0} :catch_0

    .line 349
    :cond_2
    :goto_2
    iget-object v0, p0, Lcom/saterskog/cell_lab/l;->i:[Ljava/lang/String;

    aget-object v0, v0, v1

    invoke-virtual {p2, v0}, Lcom/saterskog/a/d;->a(Ljava/lang/String;)Lcom/saterskog/a/g;

    move-result-object v0

    if-nez v0, :cond_3

    .line 350
    iget-object v0, p0, Lcom/saterskog/cell_lab/l;->k:[Ljava/lang/String;

    const-string v2, "no connection"

    aput-object v2, v0, v1

    .line 340
    :goto_3
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    .line 345
    :catch_0
    move-exception v0

    .line 346
    const-string v2, "couldn\'t consume donation 2"

    invoke-static {v2, v0}, Lcom/saterskog/b/a;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_2

    .line 352
    :cond_3
    iget-object v0, p0, Lcom/saterskog/cell_lab/l;->k:[Ljava/lang/String;

    iget-object v2, p0, Lcom/saterskog/cell_lab/l;->i:[Ljava/lang/String;

    aget-object v2, v2, v1

    invoke-virtual {p2, v2}, Lcom/saterskog/a/d;->a(Ljava/lang/String;)Lcom/saterskog/a/g;

    move-result-object v2

    .line 4054
    iget-object v2, v2, Lcom/saterskog/a/g;->b:Ljava/lang/String;

    .line 352
    aput-object v2, v0, v1

    goto :goto_3

    .line 354
    :cond_4
    const-string v0, "calling af.updateDonation(0);..."

    invoke-static {v0}, Lcom/saterskog/b/a;->b(Ljava/lang/String;)V

    .line 356
    iget-object v0, p0, Lcom/saterskog/cell_lab/l;->h:Lcom/saterskog/cell_lab/a;

    if-eqz v0, :cond_0

    .line 357
    iget-object v0, p0, Lcom/saterskog/cell_lab/l;->h:Lcom/saterskog/cell_lab/a;

    invoke-virtual {v0}, Lcom/saterskog/cell_lab/a;->a()V

    goto :goto_0
.end method

.method public final a(Lcom/saterskog/a/c;Lcom/saterskog/a/e;)V
    .locals 5

    .prologue
    .line 409
    const-string v0, "onIabPurchaseFinished called"

    invoke-static {v0}, Lcom/saterskog/b/a;->b(Ljava/lang/String;)V

    .line 410
    invoke-virtual {p1}, Lcom/saterskog/a/c;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 411
    const-string v0, "IAP failed, 271."

    invoke-static {v0}, Lcom/saterskog/b/a;->b(Ljava/lang/String;)V

    .line 426
    :cond_0
    return-void

    .line 414
    :cond_1
    iget-object v2, p0, Lcom/saterskog/cell_lab/l;->i:[Ljava/lang/String;

    array-length v3, v2

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, v3, :cond_0

    aget-object v0, v2, v1

    .line 4055
    iget-object v4, p2, Lcom/saterskog/a/e;->d:Ljava/lang/String;

    .line 415
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 418
    :try_start_0
    const-string v0, "launching consume"

    invoke-static {v0}, Lcom/saterskog/b/a;->b(Ljava/lang/String;)V

    .line 419
    iget-object v0, p0, Lcom/saterskog/cell_lab/l;->b:Lcom/saterskog/a/b;

    invoke-virtual {v0, p2, p0}, Lcom/saterskog/a/b;->a(Lcom/saterskog/a/e;Lcom/saterskog/a/b$b;)V
    :try_end_0
    .catch Lcom/saterskog/a/b$a; {:try_start_0 .. :try_end_0} :catch_0

    .line 414
    :cond_2
    :goto_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 420
    :catch_0
    move-exception v0

    .line 421
    const-string v4, "couldn\'t consume donation"

    invoke-static {v4, v0}, Lcom/saterskog/b/a;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1
.end method

.method public final a(Lcom/saterskog/a/e;Lcom/saterskog/a/c;)V
    .locals 4

    .prologue
    .line 456
    const-string v0, "onConsumeFinished called"

    invoke-static {v0}, Lcom/saterskog/b/a;->b(Ljava/lang/String;)V

    .line 457
    invoke-virtual {p2}, Lcom/saterskog/a/c;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 458
    const-string v0, "cosnume is success"

    invoke-static {v0}, Lcom/saterskog/b/a;->b(Ljava/lang/String;)V

    .line 459
    const/4 v0, 0x0

    .line 461
    :try_start_0
    const-string v1, "consumptions"

    const v2, 0x8000

    invoke-virtual {p0, v1, v2}, Lcom/saterskog/cell_lab/l;->openFileOutput(Ljava/lang/String;I)Ljava/io/FileOutputStream;
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 466
    :goto_0
    new-instance v1, Ljava/io/BufferedWriter;

    new-instance v2, Ljava/io/OutputStreamWriter;

    invoke-direct {v2, v0}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;)V

    invoke-direct {v1, v2}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V

    .line 469
    :try_start_1
    invoke-virtual {v1}, Ljava/io/BufferedWriter;->newLine()V

    .line 4058
    iget-object v2, p1, Lcom/saterskog/a/e;->g:Ljava/lang/String;

    .line 470
    invoke-virtual {v1, v2}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V

    .line 471
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "wrote payload: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 5058
    iget-object v3, p1, Lcom/saterskog/a/e;->g:Ljava/lang/String;

    .line 471
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/saterskog/b/a;->b(Ljava/lang/String;)V

    .line 472
    invoke-virtual {v1}, Ljava/io/BufferedWriter;->close()V

    .line 473
    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 484
    :goto_1
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/l;->a()V

    .line 485
    return-void

    .line 462
    :catch_0
    move-exception v1

    .line 463
    const-string v2, "onConsumeFinished"

    invoke-static {v2, v1}, Lcom/saterskog/b/a;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    .line 474
    :catch_1
    move-exception v0

    .line 475
    const-string v1, "onConsumeFinished2"

    invoke-static {v1, v0}, Lcom/saterskog/b/a;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1

    .line 482
    :cond_0
    const-string v0, "received erroneous consumption"

    invoke-static {v0}, Lcom/saterskog/b/a;->b(Ljava/lang/String;)V

    goto :goto_1
.end method

.method public final a(S)V
    .locals 7

    .prologue
    const/high16 v2, 0x3f800000    # 1.0f

    .line 526
    iget-boolean v0, p0, Lcom/saterskog/cell_lab/l;->e:Z

    if-eqz v0, :cond_1

    .line 527
    iget-object v0, p0, Lcom/saterskog/cell_lab/l;->f:Landroid/media/SoundPool;

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/saterskog/cell_lab/l;->b()V

    .line 528
    :cond_0
    iget-object v0, p0, Lcom/saterskog/cell_lab/l;->f:Landroid/media/SoundPool;

    iget-object v1, p0, Lcom/saterskog/cell_lab/l;->g:[I

    aget v1, v1, p1

    const/4 v4, 0x1

    const/4 v5, 0x0

    move v3, v2

    move v6, v2

    invoke-virtual/range {v0 .. v6}, Landroid/media/SoundPool;->play(IFFIIF)I

    .line 529
    :cond_1
    return-void
.end method

.method public final a(Z)V
    .locals 3

    .prologue
    const/high16 v2, 0x3f000000    # 0.5f

    .line 381
    if-eqz p1, :cond_2

    .line 382
    iget-object v0, p0, Lcom/saterskog/cell_lab/l;->d:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_1

    .line 383
    iget-object v0, p0, Lcom/saterskog/cell_lab/l;->d:Landroid/media/MediaPlayer;

    iget v1, p0, Lcom/saterskog/cell_lab/l;->l:I

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->seekTo(I)V

    .line 384
    iget-object v0, p0, Lcom/saterskog/cell_lab/l;->d:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V

    .line 400
    :cond_0
    :goto_0
    return-void

    .line 387
    :cond_1
    const v0, 0x7f0d0023

    invoke-static {p0, v0}, Landroid/media/MediaPlayer;->create(Landroid/content/Context;I)Landroid/media/MediaPlayer;

    move-result-object v0

    iput-object v0, p0, Lcom/saterskog/cell_lab/l;->d:Landroid/media/MediaPlayer;

    .line 388
    iget-object v0, p0, Lcom/saterskog/cell_lab/l;->d:Landroid/media/MediaPlayer;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setLooping(Z)V

    .line 389
    iget-object v0, p0, Lcom/saterskog/cell_lab/l;->d:Landroid/media/MediaPlayer;

    invoke-virtual {v0, v2, v2}, Landroid/media/MediaPlayer;->setVolume(FF)V

    .line 390
    iget-object v0, p0, Lcom/saterskog/cell_lab/l;->d:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V

    goto :goto_0

    .line 395
    :cond_2
    iget-object v0, p0, Lcom/saterskog/cell_lab/l;->d:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_0

    .line 396
    iget-object v0, p0, Lcom/saterskog/cell_lab/l;->d:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->pause()V

    .line 397
    iget-object v0, p0, Lcom/saterskog/cell_lab/l;->d:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->getCurrentPosition()I

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/l;->l:I

    goto :goto_0
.end method

.method abstract b(I)Ljava/lang/String;
.end method

.method public final b(Z)V
    .locals 0

    .prologue
    .line 404
    iput-boolean p1, p0, Lcom/saterskog/cell_lab/l;->e:Z

    .line 405
    return-void
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 2

    .prologue
    .line 430
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "onActivityResult("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/saterskog/b/a;->b(Ljava/lang/String;)V

    .line 433
    iget-object v0, p0, Lcom/saterskog/cell_lab/l;->b:Lcom/saterskog/a/b;

    invoke-virtual {v0, p1, p2, p3}, Lcom/saterskog/a/b;->a(IILandroid/content/Intent;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 437
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onActivityResult(IILandroid/content/Intent;)V

    .line 439
    packed-switch p1, :pswitch_data_0

    .line 452
    :cond_0
    :goto_0
    return-void

    .line 441
    :pswitch_0
    const/4 v0, -0x1

    if-ne p2, v0, :cond_0

    .line 442
    const-string v0, "go_to_donate"

    const/4 v1, 0x0

    invoke-virtual {p3, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    .line 443
    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/saterskog/cell_lab/l;->c:Landroid/support/v4/view/ViewPager;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setCurrentItem(I)V

    goto :goto_0

    .line 450
    :cond_1
    const-string v0, "onActivityResult handled by IABUtil."

    invoke-static {v0}, Lcom/saterskog/b/a;->b(Ljava/lang/String;)V

    goto :goto_0

    .line 439
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 10

    .prologue
    const/16 v9, 0x400

    const/4 v8, -0x1

    const/high16 v7, 0x3f000000    # 0.5f

    const/4 v0, 0x0

    const/4 v2, 0x1

    .line 123
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 125
    invoke-static {p0}, Lcom/saterskog/cell_lab/CellLabApplication;->a(Landroid/app/Activity;)V

    .line 128
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/l;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1, v9}, Landroid/view/Window;->addFlags(I)V

    .line 129
    const v1, 0x7f0a001b

    invoke-virtual {p0, v1}, Lcom/saterskog/cell_lab/l;->setContentView(I)V

    .line 131
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    .line 133
    const-string v3, "sound_effects"

    invoke-interface {v1, v3, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v3

    iput-boolean v3, p0, Lcom/saterskog/cell_lab/l;->e:Z

    .line 1289
    const-string v3, "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAhQlFw2sfDBGp4kmVU3x8xZOD3xp9wKzCsChUMUZUjr9HLgEmBZl8yXJ8K8NDL3WH+B657+1ABfHm4+J6OcwZU/a0h38Sb6GCsO8Fr4ToWMpbhoQAr8GKJZkWtygOwzACIk5QHAiAiCXnbb90ufK4wmpXlQfP2DQCCihRhIuU2Z1vcqeMTRd+oyC76ltRnCntW4WI8YH09SZYJfOwfTYHR01C9TeSoM2TWBAfn+mdMcRHVkssGrPaZjtmW7x86u3v/bAqbIE4ZP72/IG7VL4isFP0jlFqnkXV3zd/zJuOngZELR9/lgPPgR580daGWctbLcDBEao4cld/4MCly4utfwIDAQAB"

    .line 1291
    new-instance v4, Lcom/saterskog/a/b;

    invoke-direct {v4, p0, v3}, Lcom/saterskog/a/b;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iput-object v4, p0, Lcom/saterskog/cell_lab/l;->b:Lcom/saterskog/a/b;

    .line 1292
    iget-object v3, p0, Lcom/saterskog/cell_lab/l;->b:Lcom/saterskog/a/b;

    new-instance v4, Lcom/saterskog/cell_lab/l$2;

    invoke-direct {v4, p0}, Lcom/saterskog/cell_lab/l$2;-><init>(Lcom/saterskog/cell_lab/l;)V

    .line 2218
    invoke-virtual {v3}, Lcom/saterskog/a/b;->b()V

    .line 2219
    iget-boolean v5, v3, Lcom/saterskog/a/b;->c:Z

    if-eqz v5, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "IAB helper is already set up."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 2222
    :cond_0
    const-string v5, "Starting in-app billing setup."

    invoke-virtual {v3, v5}, Lcom/saterskog/a/b;->c(Ljava/lang/String;)V

    .line 2223
    new-instance v5, Lcom/saterskog/a/b$1;

    invoke-direct {v5, v3, v4}, Lcom/saterskog/a/b$1;-><init>(Lcom/saterskog/a/b;Lcom/saterskog/a/b$e;)V

    iput-object v5, v3, Lcom/saterskog/a/b;->l:Landroid/content/ServiceConnection;

    .line 2296
    new-instance v5, Landroid/content/Intent;

    const-string v6, "com.android.vending.billing.InAppBillingService.BIND"

    invoke-direct {v5, v6}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 2297
    const-string v6, "com.android.vending"

    invoke-virtual {v5, v6}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 2298
    iget-object v6, v3, Lcom/saterskog/a/b;->j:Landroid/content/Context;

    invoke-virtual {v6}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v6

    invoke-virtual {v6, v5, v0}, Landroid/content/pm/PackageManager;->queryIntentServices(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v6

    .line 2299
    if-eqz v6, :cond_5

    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_5

    .line 2301
    iget-object v4, v3, Lcom/saterskog/a/b;->j:Landroid/content/Context;

    iget-object v3, v3, Lcom/saterskog/a/b;->l:Landroid/content/ServiceConnection;

    invoke-virtual {v4, v5, v3, v2}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    .line 137
    :goto_0
    iget-boolean v3, p0, Lcom/saterskog/cell_lab/l;->e:Z

    if-eqz v3, :cond_1

    .line 138
    invoke-direct {p0}, Lcom/saterskog/cell_lab/l;->b()V

    .line 141
    :cond_1
    const-string v3, "music"

    invoke-interface {v1, v3, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 142
    const v1, 0x7f0d0023

    invoke-static {p0, v1}, Landroid/media/MediaPlayer;->create(Landroid/content/Context;I)Landroid/media/MediaPlayer;

    move-result-object v1

    iput-object v1, p0, Lcom/saterskog/cell_lab/l;->d:Landroid/media/MediaPlayer;

    .line 143
    iget-object v1, p0, Lcom/saterskog/cell_lab/l;->d:Landroid/media/MediaPlayer;

    invoke-virtual {v1, v2}, Landroid/media/MediaPlayer;->setLooping(Z)V

    .line 145
    iget-object v1, p0, Lcom/saterskog/cell_lab/l;->d:Landroid/media/MediaPlayer;

    invoke-virtual {v1, v7, v7}, Landroid/media/MediaPlayer;->setVolume(FF)V

    .line 148
    if-eqz p1, :cond_2

    .line 149
    const-string v1, "song_pos"

    invoke-virtual {p1, v1, v8}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v1

    .line 150
    if-eq v1, v8, :cond_2

    iput v1, p0, Lcom/saterskog/cell_lab/l;->l:I

    .line 151
    iget-object v1, p0, Lcom/saterskog/cell_lab/l;->d:Landroid/media/MediaPlayer;

    iget v3, p0, Lcom/saterskog/cell_lab/l;->l:I

    invoke-virtual {v1, v3}, Landroid/media/MediaPlayer;->seekTo(I)V

    .line 152
    :cond_2
    iget-object v1, p0, Lcom/saterskog/cell_lab/l;->d:Landroid/media/MediaPlayer;

    invoke-virtual {v1}, Landroid/media/MediaPlayer;->start()V

    .line 156
    :cond_3
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/l;->getIntent()Landroid/content/Intent;

    move-result-object v1

    .line 157
    invoke-virtual {v1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v1

    .line 159
    if-eqz v1, :cond_a

    .line 160
    const-string v3, "uri received"

    invoke-static {v3}, Lcom/saterskog/b/a;->b(Ljava/lang/String;)V

    .line 166
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/l;->fileList()[Ljava/lang/String;

    move-result-object v3

    array-length v4, v3

    :goto_1
    if-ge v0, v4, :cond_6

    aget-object v5, v3, v0

    .line 167
    invoke-virtual {v1}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    .line 169
    const v5, 0x7f0e0199

    invoke-virtual {p0, v5}, Lcom/saterskog/cell_lab/l;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {p0, v5, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v5

    invoke-virtual {v5}, Landroid/widget/Toast;->show()V

    .line 170
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/l;->finish()V

    .line 166
    :cond_4
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 2306
    :cond_5
    new-instance v3, Lcom/saterskog/a/c;

    const/4 v5, 0x3

    const-string v6, "Billing service unavailable on device."

    invoke-direct {v3, v5, v6}, Lcom/saterskog/a/c;-><init>(ILjava/lang/String;)V

    invoke-interface {v4, v3}, Lcom/saterskog/a/b$e;->a(Lcom/saterskog/a/c;)V

    goto :goto_0

    .line 174
    :cond_6
    new-array v0, v9, [B

    .line 177
    :try_start_0
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/l;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v3

    invoke-virtual {v3, v1}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object v3

    .line 178
    invoke-virtual {v1}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    invoke-virtual {p0, v4, v5}, Lcom/saterskog/cell_lab/l;->openFileOutput(Ljava/lang/String;I)Ljava/io/FileOutputStream;

    move-result-object v4

    .line 181
    :goto_2
    invoke-virtual {v3, v0}, Ljava/io/InputStream;->read([B)I

    move-result v5

    if-lez v5, :cond_9

    .line 182
    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static {v7, v5}, Ljava/lang/Math;->max(II)I

    move-result v5

    invoke-static {v0, v6, v5}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/io/OutputStream;->write([B)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    .line 189
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    move v1, v2

    .line 233
    :goto_3
    new-instance v0, Lcom/saterskog/cell_lab/l$a;

    invoke-virtual {p0}, Lcom/saterskog/cell_lab/l;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v3

    invoke-direct {v0, p0, v3}, Lcom/saterskog/cell_lab/l$a;-><init>(Lcom/saterskog/cell_lab/l;Landroid/app/FragmentManager;)V

    iput-object v0, p0, Lcom/saterskog/cell_lab/l;->a:Lcom/saterskog/cell_lab/l$a;

    .line 236
    const v0, 0x7f08005d

    invoke-virtual {p0, v0}, Lcom/saterskog/cell_lab/l;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v4/view/ViewPager;

    iput-object v0, p0, Lcom/saterskog/cell_lab/l;->c:Landroid/support/v4/view/ViewPager;

    .line 237
    iget-object v0, p0, Lcom/saterskog/cell_lab/l;->c:Landroid/support/v4/view/ViewPager;

    iget-object v3, p0, Lcom/saterskog/cell_lab/l;->a:Lcom/saterskog/cell_lab/l$a;

    invoke-virtual {v0, v3}, Landroid/support/v4/view/ViewPager;->setAdapter(Landroid/support/v4/view/p;)V

    .line 238
    iget-object v0, p0, Lcom/saterskog/cell_lab/l;->c:Landroid/support/v4/view/ViewPager;

    new-instance v3, Lcom/saterskog/cell_lab/l$1;

    invoke-direct {v3, p0}, Lcom/saterskog/cell_lab/l$1;-><init>(Lcom/saterskog/cell_lab/l;)V

    invoke-virtual {v0, v3}, Landroid/support/v4/view/ViewPager;->setOnPageChangeListener(Landroid/support/v4/view/ViewPager$f;)V

    .line 260
    const v0, 0x7f08005e

    invoke-virtual {p0, v0}, Lcom/saterskog/cell_lab/l;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v4/view/PagerTabStrip;

    .line 261
    invoke-virtual {v0, v2}, Landroid/support/v4/view/PagerTabStrip;->setDrawFullUnderline(Z)V

    .line 262
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/l;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f050030

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/support/v4/view/PagerTabStrip;->setTabIndicatorColor(I)V

    .line 263
    if-eqz v1, :cond_7

    .line 264
    iget-object v0, p0, Lcom/saterskog/cell_lab/l;->c:Landroid/support/v4/view/ViewPager;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setCurrentItem(I)V

    .line 266
    :cond_7
    iget-object v0, p0, Lcom/saterskog/cell_lab/l;->c:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->getCurrentItem()I

    move-result v0

    .line 267
    packed-switch v0, :pswitch_data_0

    .line 283
    :goto_4
    if-nez p1, :cond_8

    .line 3033
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/saterskog/cell_lab/b$1;

    invoke-direct {v1, p0}, Lcom/saterskog/cell_lab/b$1;-><init>(Landroid/app/Activity;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 3085
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 286
    :cond_8
    return-void

    .line 184
    :cond_9
    :try_start_1
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V

    .line 185
    invoke-virtual {v4}, Ljava/io/OutputStream;->close()V

    .line 186
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, "uri written to "

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/saterskog/b/a;->b(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    move v1, v2

    .line 190
    goto :goto_3

    .line 270
    :pswitch_0
    const-string v0, "main/challenge_tab"

    invoke-static {v0, p0}, Lcom/saterskog/b/a;->a(Ljava/lang/String;Landroid/app/Activity;)V

    goto :goto_4

    .line 273
    :pswitch_1
    const-string v0, "main/experiment_tab"

    invoke-static {v0, p0}, Lcom/saterskog/b/a;->a(Ljava/lang/String;Landroid/app/Activity;)V

    goto :goto_4

    .line 276
    :pswitch_2
    const-string v0, "main/gene_bank_tab"

    invoke-static {v0, p0}, Lcom/saterskog/b/a;->a(Ljava/lang/String;Landroid/app/Activity;)V

    goto :goto_4

    .line 279
    :pswitch_3
    const-string v0, "main/about_tab"

    invoke-static {v0, p0}, Lcom/saterskog/b/a;->a(Ljava/lang/String;Landroid/app/Activity;)V

    goto :goto_4

    :cond_a
    move v1, v0

    goto/16 :goto_3

    .line 267
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public onDestroy()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 91
    iget-object v0, p0, Lcom/saterskog/cell_lab/l;->f:Landroid/media/SoundPool;

    if-eqz v0, :cond_0

    .line 92
    iget-object v0, p0, Lcom/saterskog/cell_lab/l;->f:Landroid/media/SoundPool;

    invoke-virtual {v0}, Landroid/media/SoundPool;->release()V

    .line 93
    iput-object v2, p0, Lcom/saterskog/cell_lab/l;->f:Landroid/media/SoundPool;

    .line 95
    :cond_0
    iget-object v0, p0, Lcom/saterskog/cell_lab/l;->d:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_1

    .line 96
    iget-object v0, p0, Lcom/saterskog/cell_lab/l;->d:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->release()V

    .line 97
    iput-object v2, p0, Lcom/saterskog/cell_lab/l;->d:Landroid/media/MediaPlayer;

    .line 100
    :cond_1
    iget-object v0, p0, Lcom/saterskog/cell_lab/l;->b:Lcom/saterskog/a/b;

    if-eqz v0, :cond_2

    .line 101
    :try_start_0
    iget-object v0, p0, Lcom/saterskog/cell_lab/l;->b:Lcom/saterskog/a/b;

    invoke-virtual {v0}, Lcom/saterskog/a/b;->a()V
    :try_end_0
    .catch Lcom/saterskog/a/b$a; {:try_start_0 .. :try_end_0} :catch_0

    .line 105
    :cond_2
    :goto_0
    iput-object v2, p0, Lcom/saterskog/cell_lab/l;->b:Lcom/saterskog/a/b;

    .line 107
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    .line 108
    return-void

    .line 102
    :catch_0
    move-exception v0

    .line 103
    const-string v1, "couldn\'t dispose IAP Helper.."

    invoke-static {v1, v0}, Lcom/saterskog/b/a;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public onPause()V
    .locals 1

    .prologue
    .line 69
    iget-object v0, p0, Lcom/saterskog/cell_lab/l;->d:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_0

    .line 70
    iget-object v0, p0, Lcom/saterskog/cell_lab/l;->d:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->pause()V

    .line 71
    iget-object v0, p0, Lcom/saterskog/cell_lab/l;->d:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->getCurrentPosition()I

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/l;->l:I

    .line 74
    :cond_0
    invoke-super {p0}, Landroid/app/Activity;->onPause()V

    .line 75
    return-void
.end method

.method public onResume()V
    .locals 3

    .prologue
    .line 80
    iget-object v0, p0, Lcom/saterskog/cell_lab/l;->d:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_0

    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "music"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 81
    iget-object v0, p0, Lcom/saterskog/cell_lab/l;->d:Landroid/media/MediaPlayer;

    iget v1, p0, Lcom/saterskog/cell_lab/l;->l:I

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->seekTo(I)V

    .line 82
    iget-object v0, p0, Lcom/saterskog/cell_lab/l;->d:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V

    .line 84
    :cond_0
    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    .line 85
    return-void
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 113
    iget-object v0, p0, Lcom/saterskog/cell_lab/l;->d:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_0

    .line 114
    const-string v0, "song_pos"

    iget-object v1, p0, Lcom/saterskog/cell_lab/l;->d:Landroid/media/MediaPlayer;

    invoke-virtual {v1}, Landroid/media/MediaPlayer;->getCurrentPosition()I

    move-result v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 116
    iget-object v0, p0, Lcom/saterskog/cell_lab/l;->d:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->pause()V

    .line 117
    :cond_0
    invoke-super {p0, p1}, Landroid/app/Activity;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 118
    return-void
.end method
