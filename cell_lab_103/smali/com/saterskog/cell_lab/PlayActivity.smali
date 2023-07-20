.class public Lcom/saterskog/cell_lab/PlayActivity;
.super Landroid/support/v4/app/e;
.source "SourceFile"

# interfaces
.implements Landroid/app/ActionBar$TabListener;
.implements Landroid/view/View$OnClickListener;
.implements Lcom/saterskog/cell_lab/i$b;
.implements Lcom/saterskog/cell_lab/o$a;
.implements Lcom/saterskog/cell_lab/p$a;
.implements Lcom/saterskog/cell_lab/t$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/saterskog/cell_lab/PlayActivity$a;
    }
.end annotation


# instance fields
.field A:I

.field B:[I

.field C:[I

.field D:Ljava/io/File;

.field E:Z

.field private F:[I

.field private G:Lcom/saterskog/cell_lab/Environment;

.field private H:I

.field private I:I

.field private J:Landroid/widget/ImageButton;

.field private K:J

.field private L:Landroid/net/Uri;

.field private M:Landroid/widget/ImageButton;

.field private N:Landroid/widget/ImageButton;

.field private O:Ljava/lang/String;

.field n:Lcom/saterskog/cell_lab/PlayActivity$a;

.field o:Z

.field p:Z

.field q:I

.field r:I

.field s:I

.field t:Ljava/lang/String;

.field u:Lcom/saterskog/cell_lab/CustomViewPager;

.field v:Lcom/saterskog/cell_lab/CellWorld;

.field w:Z

.field x:Z

.field y:Landroid/media/SoundPool;

.field z:Landroid/media/MediaPlayer;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 60
    invoke-direct {p0}, Landroid/support/v4/app/e;-><init>()V

    .line 67
    iput-object v1, p0, Lcom/saterskog/cell_lab/PlayActivity;->u:Lcom/saterskog/cell_lab/CustomViewPager;

    .line 68
    invoke-static {}, Lcom/saterskog/cell_lab/h;->values()[Lcom/saterskog/cell_lab/h;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    iput-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->F:[I

    .line 71
    new-instance v0, Lcom/saterskog/cell_lab/Environment;

    invoke-direct {v0}, Lcom/saterskog/cell_lab/Environment;-><init>()V

    iput-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->G:Lcom/saterskog/cell_lab/Environment;

    .line 73
    iput-object v1, p0, Lcom/saterskog/cell_lab/PlayActivity;->J:Landroid/widget/ImageButton;

    .line 74
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->K:J

    .line 84
    const/16 v0, 0xc

    new-array v0, v0, [I

    iput-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->B:[I

    .line 85
    const/16 v0, 0x1b

    new-array v0, v0, [I

    iput-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->C:[I

    .line 91
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->E:Z

    return-void
.end method

.method static synthetic a(Lcom/saterskog/cell_lab/PlayActivity;I)I
    .locals 0

    .prologue
    .line 60
    iput p1, p0, Lcom/saterskog/cell_lab/PlayActivity;->I:I

    return p1
.end method

.method static synthetic a(Lcom/saterskog/cell_lab/PlayActivity;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .prologue
    .line 60
    iput-object p1, p0, Lcom/saterskog/cell_lab/PlayActivity;->O:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic a(Lcom/saterskog/cell_lab/PlayActivity;)V
    .locals 0

    .prologue
    .line 60
    invoke-direct {p0}, Lcom/saterskog/cell_lab/PlayActivity;->j()V

    return-void
.end method

.method private a(Ljava/io/InputStream;)V
    .locals 8

    .prologue
    const/4 v4, -0x1

    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 556
    if-nez p1, :cond_0

    .line 612
    :goto_0
    return-void

    .line 559
    :cond_0
    :try_start_0
    new-instance v5, Ljava/io/ObjectInputStream;

    invoke-direct {v5, p1}, Ljava/io/ObjectInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 566
    :try_start_1
    invoke-virtual {v5}, Ljava/io/ObjectInputStream;->readInt()I
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    move-result v0

    .line 570
    const/16 v3, 0x5f

    if-le v0, v3, :cond_1

    .line 571
    const v0, 0x7f0e0196

    invoke-virtual {p0, v0}, Lcom/saterskog/cell_lab/PlayActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 573
    :try_start_2
    invoke-virtual {v5}, Ljava/io/ObjectInputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    .line 577
    const-string v0, "tried Opening file from newer version"

    invoke-static {v0}, Lcom/saterskog/b/a;->a(Ljava/lang/String;)V

    .line 578
    invoke-virtual {p0, v4}, Lcom/saterskog/cell_lab/PlayActivity;->setResult(I)V

    .line 579
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/PlayActivity;->finish()V

    goto :goto_0

    .line 561
    :catch_0
    move-exception v0

    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "can\'t load env 1"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 568
    :catch_1
    move-exception v0

    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "io40"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 575
    :catch_2
    move-exception v0

    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "io38"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 583
    :cond_1
    :try_start_3
    invoke-virtual {v5}, Ljava/io/ObjectInputStream;->readDouble()D
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3

    .line 588
    :try_start_4
    invoke-virtual {v5}, Ljava/io/ObjectInputStream;->readInt()I
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_4

    .line 593
    :try_start_5
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->G:Lcom/saterskog/cell_lab/Environment;

    invoke-virtual {v0, v5}, Lcom/saterskog/cell_lab/Environment;->a(Ljava/io/ObjectInputStream;)V

    .line 595
    const/4 v0, -0x1

    invoke-static {v0, p0}, Lcom/saterskog/cell_lab/j;->i(ILandroid/content/Context;)[Z

    move-result-object v6

    move v3, v1

    move v4, v1

    .line 596
    :goto_1
    sget-object v0, Lcom/saterskog/cell_lab/h;->B:[Lcom/saterskog/cell_lab/h;

    array-length v0, v0

    if-ge v3, v0, :cond_5

    .line 598
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->G:Lcom/saterskog/cell_lab/Environment;

    iget-object v7, v0, Lcom/saterskog/cell_lab/Environment;->t:[Z

    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->G:Lcom/saterskog/cell_lab/Environment;

    iget-object v0, v0, Lcom/saterskog/cell_lab/Environment;->t:[Z

    aget-boolean v0, v0, v3

    if-eqz v0, :cond_3

    aget-boolean v0, v6, v3

    if-eqz v0, :cond_3

    move v0, v2

    :goto_2
    aput-boolean v0, v7, v3

    .line 599
    if-nez v4, :cond_2

    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->G:Lcom/saterskog/cell_lab/Environment;

    iget-object v0, v0, Lcom/saterskog/cell_lab/Environment;->t:[Z

    aget-boolean v0, v0, v3
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_6

    if-eqz v0, :cond_4

    :cond_2
    move v0, v2

    .line 596
    :goto_3
    add-int/lit8 v3, v3, 0x1

    move v4, v0

    goto :goto_1

    .line 585
    :catch_3
    move-exception v0

    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "io37"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 590
    :catch_4
    move-exception v0

    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "io36"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    move v0, v1

    .line 598
    goto :goto_2

    :cond_4
    move v0, v1

    .line 599
    goto :goto_3

    .line 602
    :cond_5
    if-nez v4, :cond_6

    .line 603
    :try_start_6
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->G:Lcom/saterskog/cell_lab/Environment;

    iget-object v0, v0, Lcom/saterskog/cell_lab/Environment;->t:[Z

    sget-object v1, Lcom/saterskog/cell_lab/h;->c:Lcom/saterskog/cell_lab/h;

    invoke-virtual {v1}, Lcom/saterskog/cell_lab/h;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput-boolean v2, v0, v1
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_6

    .line 609
    :cond_6
    :try_start_7
    invoke-virtual {v5}, Ljava/io/ObjectInputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_5

    goto/16 :goto_0

    .line 611
    :catch_5
    move-exception v0

    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "io34"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 606
    :catch_6
    move-exception v0

    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "io35"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method static synthetic b(Lcom/saterskog/cell_lab/PlayActivity;)Lcom/saterskog/cell_lab/Environment;
    .locals 1

    .prologue
    .line 60
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->G:Lcom/saterskog/cell_lab/Environment;

    return-object v0
.end method

.method static synthetic c(Lcom/saterskog/cell_lab/PlayActivity;)I
    .locals 1

    .prologue
    .line 60
    iget v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->I:I

    return v0
.end method

.method private c(I)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 945
    const v0, 0x7f08005d

    invoke-virtual {p0, v0}, Lcom/saterskog/cell_lab/PlayActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v4/view/ViewPager;

    .line 946
    invoke-virtual {v0, p1, v1}, Landroid/support/v4/view/ViewPager;->a(IZ)V

    .line 947
    if-ne p1, v2, :cond_0

    .line 948
    invoke-static {p0, v1, v1}, Lcom/saterskog/cell_lab/t;->b(Landroid/app/Activity;II)V

    .line 949
    :cond_0
    const/4 v0, 0x2

    if-ne p1, v0, :cond_1

    .line 950
    invoke-static {p0, v2, v1}, Lcom/saterskog/cell_lab/t;->b(Landroid/app/Activity;II)V

    .line 951
    :cond_1
    return-void
.end method

.method private c(Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 1253
    const/4 v2, 0x0

    .line 1255
    :try_start_0
    new-instance v1, Ljava/io/FileOutputStream;

    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->D:Ljava/io/File;

    const/4 v3, 0x1

    invoke-direct {v1, v0, v3}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1257
    :try_start_1
    const-string v0, "UTF-8"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/io/FileOutputStream;->write([B)V
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_7
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_6
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 1267
    :try_start_2
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 1272
    :cond_0
    :goto_0
    return-void

    .line 1270
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_0

    .line 1259
    :catch_1
    move-exception v0

    move-object v1, v2

    :goto_1
    :try_start_3
    invoke-virtual {v0}, Ljava/io/FileNotFoundException;->printStackTrace()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 1266
    if-eqz v1, :cond_0

    .line 1267
    :try_start_4
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2

    goto :goto_0

    .line 1270
    :catch_2
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_0

    .line 1262
    :catch_3
    move-exception v0

    move-object v1, v2

    :goto_2
    :try_start_5
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 1266
    if-eqz v1, :cond_0

    .line 1267
    :try_start_6
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_4

    goto :goto_0

    .line 1270
    :catch_4
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_0

    .line 1265
    :catchall_0
    move-exception v0

    move-object v1, v2

    .line 1266
    :goto_3
    if-eqz v1, :cond_1

    .line 1267
    :try_start_7
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_5

    .line 1271
    :cond_1
    :goto_4
    throw v0

    .line 1270
    :catch_5
    move-exception v1

    invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_4

    .line 1265
    :catchall_1
    move-exception v0

    goto :goto_3

    .line 1262
    :catch_6
    move-exception v0

    goto :goto_2

    .line 1259
    :catch_7
    move-exception v0

    goto :goto_1
.end method

.method static synthetic d(Lcom/saterskog/cell_lab/PlayActivity;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 60
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->O:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic e(Lcom/saterskog/cell_lab/PlayActivity;)Landroid/widget/ImageButton;
    .locals 1

    .prologue
    .line 60
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->N:Landroid/widget/ImageButton;

    return-object v0
.end method

.method static synthetic f(Lcom/saterskog/cell_lab/PlayActivity;)V
    .locals 4

    .prologue
    .line 6985
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 6987
    const v1, 0x7f0e0107

    invoke-virtual {p0, v1}, Lcom/saterskog/cell_lab/PlayActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 6990
    new-instance v1, Landroid/widget/EditText;

    invoke-direct {v1, p0}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    .line 6992
    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/widget/EditText;->setInputType(I)V

    .line 6993
    iget-boolean v2, p0, Lcom/saterskog/cell_lab/PlayActivity;->p:Z

    if-nez v2, :cond_0

    .line 6994
    iget-object v2, p0, Lcom/saterskog/cell_lab/PlayActivity;->t:Ljava/lang/String;

    invoke-virtual {v1, v2}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 6997
    :cond_0
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 7000
    const v2, 0x7f0e005d

    invoke-virtual {p0, v2}, Lcom/saterskog/cell_lab/PlayActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/saterskog/cell_lab/PlayActivity$24;

    invoke-direct {v3, p0, v1}, Lcom/saterskog/cell_lab/PlayActivity$24;-><init>(Lcom/saterskog/cell_lab/PlayActivity;Landroid/widget/EditText;)V

    invoke-virtual {v0, v2, v3}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 7048
    const v1, 0x7f0e0061

    invoke-virtual {p0, v1}, Lcom/saterskog/cell_lab/PlayActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/saterskog/cell_lab/PlayActivity$2;

    invoke-direct {v2, p0}, Lcom/saterskog/cell_lab/PlayActivity$2;-><init>(Lcom/saterskog/cell_lab/PlayActivity;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 7055
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 60
    return-void
.end method

.method static synthetic g(Lcom/saterskog/cell_lab/PlayActivity;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 60
    .line 7141
    iget v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->q:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 7142
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/PlayActivity;->b()Ljava/io/InputStream;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/saterskog/cell_lab/PlayActivity;->a(Ljava/io/InputStream;)V

    .line 7143
    invoke-virtual {p0, v3}, Lcom/saterskog/cell_lab/PlayActivity;->b(I)Landroid/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/saterskog/cell_lab/o;

    .line 7144
    if-eqz v0, :cond_0

    .line 7145
    iget-object v1, p0, Lcom/saterskog/cell_lab/PlayActivity;->G:Lcom/saterskog/cell_lab/Environment;

    .line 7263
    iget-object v2, v0, Lcom/saterskog/cell_lab/o;->a:Lcom/saterskog/cell_lab/Environment;

    invoke-virtual {v2, v1}, Lcom/saterskog/cell_lab/Environment;->a(Lcom/saterskog/cell_lab/Environment;)V

    .line 7264
    invoke-virtual {v0}, Lcom/saterskog/cell_lab/o;->a()V

    .line 7147
    :cond_0
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/PlayActivity;->b()Ljava/io/InputStream;

    move-result-object v1

    .line 7149
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/saterskog/cell_lab/PlayActivity;->b(I)Landroid/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/saterskog/cell_lab/p;

    .line 7150
    invoke-virtual {p0, v3}, Lcom/saterskog/cell_lab/PlayActivity;->a(S)V

    .line 7151
    iget-object v2, v0, Lcom/saterskog/cell_lab/p;->a:Lcom/saterskog/cell_lab/r;

    new-instance v3, Lcom/saterskog/cell_lab/PlayActivity$7;

    invoke-direct {v3, p0, v0, v1}, Lcom/saterskog/cell_lab/PlayActivity$7;-><init>(Lcom/saterskog/cell_lab/PlayActivity;Lcom/saterskog/cell_lab/p;Ljava/io/InputStream;)V

    invoke-virtual {v2, v3}, Lcom/saterskog/cell_lab/r;->queueEvent(Ljava/lang/Runnable;)V

    .line 60
    return-void
.end method

.method private i()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 741
    const/16 v0, 0xb

    invoke-virtual {p0, v0}, Lcom/saterskog/cell_lab/PlayActivity;->a(S)V

    .line 742
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 743
    const-string v1, "ask_discard_sample"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 745
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 747
    const v1, 0x7f0e0063

    invoke-virtual {p0, v1}, Lcom/saterskog/cell_lab/PlayActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 749
    const v1, 0x7f0e0062

    invoke-virtual {p0, v1}, Lcom/saterskog/cell_lab/PlayActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 751
    const v1, 0x7f0e005c

    invoke-virtual {p0, v1}, Lcom/saterskog/cell_lab/PlayActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/saterskog/cell_lab/PlayActivity$18;

    invoke-direct {v2, p0}, Lcom/saterskog/cell_lab/PlayActivity$18;-><init>(Lcom/saterskog/cell_lab/PlayActivity;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 757
    const v1, 0x7f0e005b

    invoke-virtual {p0, v1}, Lcom/saterskog/cell_lab/PlayActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/saterskog/cell_lab/PlayActivity$19;

    invoke-direct {v2, p0}, Lcom/saterskog/cell_lab/PlayActivity$19;-><init>(Lcom/saterskog/cell_lab/PlayActivity;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 764
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    .line 765
    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    .line 766
    invoke-virtual {v0}, Landroid/app/AlertDialog;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const-string v2, "android:id/titleDivider"

    invoke-virtual {v1, v2, v3, v3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    .line 767
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 768
    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/saterskog/cell_lab/PlayActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f050014

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 772
    :cond_0
    :goto_0
    return-void

    .line 771
    :cond_1
    invoke-direct {p0}, Lcom/saterskog/cell_lab/PlayActivity;->j()V

    goto :goto_0
.end method

.method private j()V
    .locals 6

    .prologue
    .line 776
    iget v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->q:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    iget v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->q:I

    invoke-static {v0, p0}, Lcom/saterskog/cell_lab/j;->b(ILandroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 777
    iget v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->q:I

    invoke-static {p0, v0}, Lcom/saterskog/cell_lab/j;->b(Landroid/content/Context;I)J

    move-result-wide v0

    invoke-static {}, Lcom/saterskog/b/a;->c()J

    move-result-wide v2

    iget-wide v4, p0, Lcom/saterskog/cell_lab/PlayActivity;->K:J

    sub-long/2addr v2, v4

    add-long/2addr v0, v2

    .line 779
    const-wide/32 v2, 0x927c0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    .line 781
    const v0, 0x7f0e0100

    invoke-virtual {p0, v0}, Lcom/saterskog/cell_lab/PlayActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const v2, 0x7f0e00fe

    invoke-virtual {p0, v2}, Lcom/saterskog/cell_lab/PlayActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const v2, 0x7f0e0087

    invoke-virtual {p0, v2}, Lcom/saterskog/cell_lab/PlayActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "<br><br>"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const v2, 0x7f0e01b3

    invoke-virtual {p0, v2}, Lcom/saterskog/cell_lab/PlayActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "need_help"

    const/4 v4, 0x0

    new-instance v5, Lcom/saterskog/cell_lab/PlayActivity$20;

    invoke-direct {v5, p0}, Lcom/saterskog/cell_lab/PlayActivity$20;-><init>(Lcom/saterskog/cell_lab/PlayActivity;)V

    move-object v0, p0

    invoke-static/range {v0 .. v5}, Lcom/saterskog/cell_lab/b;->a(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;Landroid/content/DialogInterface$OnClickListener;)V

    .line 813
    :goto_0
    return-void

    .line 791
    :cond_0
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/PlayActivity;->finish()V

    goto :goto_0

    .line 795
    :cond_1
    iget-boolean v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->E:Z

    if-eqz v0, :cond_2

    iget v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->q:I

    const-string v1, "26.6"

    invoke-static {v1, p0}, Lcom/saterskog/cell_lab/j;->a(Ljava/lang/String;Landroid/content/Context;)I

    move-result v1

    if-lt v0, v1, :cond_2

    .line 796
    const v0, 0x7f0e0070

    invoke-virtual {p0, v0}, Lcom/saterskog/cell_lab/PlayActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const v0, 0x7f0e006f

    invoke-virtual {p0, v0}, Lcom/saterskog/cell_lab/PlayActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    const-string v3, "donation_appeal"

    new-instance v4, Lcom/saterskog/cell_lab/PlayActivity$21;

    invoke-direct {v4, p0}, Lcom/saterskog/cell_lab/PlayActivity$21;-><init>(Lcom/saterskog/cell_lab/PlayActivity;)V

    new-instance v5, Lcom/saterskog/cell_lab/PlayActivity$22;

    invoke-direct {v5, p0}, Lcom/saterskog/cell_lab/PlayActivity$22;-><init>(Lcom/saterskog/cell_lab/PlayActivity;)V

    move-object v0, p0

    invoke-static/range {v0 .. v5}, Lcom/saterskog/cell_lab/b;->a(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;Landroid/content/DialogInterface$OnClickListener;)V

    goto :goto_0

    .line 812
    :cond_2
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/PlayActivity;->finish()V

    goto :goto_0
.end method

.method private k()V
    .locals 7

    .prologue
    const/4 v6, 0x0

    const/4 v1, 0x0

    .line 1414
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/PlayActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v2, 0x7f02000b

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    .line 1417
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 1420
    iget v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->q:I

    invoke-static {v0}, Lcom/saterskog/cell_lab/j;->a(I)[Z

    move-result-object v3

    .line 1422
    array-length v4, v3

    move v2, v1

    move v0, v1

    :goto_0
    if-ge v2, v4, :cond_1

    aget-boolean v5, v3, v2

    if-eqz v5, :cond_0

    add-int/lit8 v0, v0, 0x1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 1424
    :cond_1
    new-array v2, v0, [Ljava/lang/Integer;

    move v0, v1

    .line 1426
    :goto_1
    const/4 v4, 0x5

    if-ge v1, v4, :cond_3

    .line 1427
    aget-boolean v4, v3, v1

    if-eqz v4, :cond_2

    .line 1428
    new-instance v4, Ljava/lang/Integer;

    invoke-direct {v4, v1}, Ljava/lang/Integer;-><init>(I)V

    aput-object v4, v2, v0

    .line 1429
    add-int/lit8 v0, v0, 0x1

    .line 1426
    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 1433
    :cond_3
    new-instance v0, Lcom/saterskog/cell_lab/PlayActivity$13;

    invoke-direct {v0, p0, p0, v2, v2}, Lcom/saterskog/cell_lab/PlayActivity$13;-><init>(Lcom/saterskog/cell_lab/PlayActivity;Landroid/content/Context;[Ljava/lang/Integer;[Ljava/lang/Integer;)V

    .line 1461
    new-instance v1, Landroid/app/AlertDialog$Builder;

    invoke-direct {v1, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    new-instance v3, Lcom/saterskog/cell_lab/PlayActivity$14;

    invoke-direct {v3, p0, v2}, Lcom/saterskog/cell_lab/PlayActivity$14;-><init>(Lcom/saterskog/cell_lab/PlayActivity;[Ljava/lang/Integer;)V

    .line 1462
    invoke-virtual {v1, v0, v3}, Landroid/app/AlertDialog$Builder;->setAdapter(Landroid/widget/ListAdapter;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x7f0e0101

    .line 1494
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    move-result-object v0

    .line 1496
    invoke-virtual {v0}, Landroid/app/AlertDialog;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const-string v2, "android:id/titleDivider"

    invoke-virtual {v1, v2, v6, v6}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    .line 1497
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 1498
    if-eqz v0, :cond_4

    .line 1499
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/PlayActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f050014

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 1531
    :cond_4
    return-void
.end method


# virtual methods
.method public final a(F)V
    .locals 7

    .prologue
    const/4 v4, 0x0

    .line 1739
    iget-boolean v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->w:Z

    if-eqz v0, :cond_0

    .line 1740
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->y:Landroid/media/SoundPool;

    iget-object v1, p0, Lcom/saterskog/cell_lab/PlayActivity;->B:[I

    const/16 v2, 0xa

    aget v1, v1, v2

    const/high16 v6, 0x3f800000    # 1.0f

    move v2, p1

    move v3, p1

    move v5, v4

    invoke-virtual/range {v0 .. v6}, Landroid/media/SoundPool;->play(IFFIIF)I

    .line 1741
    :cond_0
    return-void
.end method

.method public final a(Lcom/saterskog/cell_lab/CellWorld;)V
    .locals 11

    .prologue
    const/16 v10, 0x1b

    const/4 v9, 0x3

    const/high16 v8, 0x40400000    # 3.0f

    const/4 v3, 0x2

    const/4 v1, 0x0

    .line 1229
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->D:Ljava/io/File;

    if-eqz v0, :cond_9

    .line 1231
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "\n"

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v4, p1, Lcom/saterskog/cell_lab/CellWorld;->M:D

    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ", "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Lcom/saterskog/cell_lab/CellWorld;->f()D

    move-result-wide v4

    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ", "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v2, p1, Lcom/saterskog/cell_lab/CellWorld;->S:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ", "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v2, p1, Lcom/saterskog/cell_lab/CellWorld;->R:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 1232
    iput v1, p1, Lcom/saterskog/cell_lab/CellWorld;->S:I

    .line 1233
    iput v1, p1, Lcom/saterskog/cell_lab/CellWorld;->R:I

    move v0, v1

    .line 1234
    :goto_0
    if-ge v0, v10, :cond_0

    iget-object v2, p0, Lcom/saterskog/cell_lab/PlayActivity;->C:[I

    aput v1, v2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v1

    .line 1235
    :goto_1
    iget v2, p1, Lcom/saterskog/cell_lab/CellWorld;->z:I

    if-ge v0, v2, :cond_7

    .line 1236
    iget-object v2, p1, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    aget-object v2, v2, v0

    iget-object v2, v2, Lcom/saterskog/cell_lab/Cell;->J:[F

    aget v2, v2, v1

    mul-float/2addr v2, v8

    float-to-int v2, v2

    .line 1237
    if-gez v2, :cond_1

    move v2, v1

    .line 1238
    :cond_1
    if-lt v2, v9, :cond_2

    move v2, v3

    .line 1239
    :cond_2
    iget-object v4, p1, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    aget-object v4, v4, v0

    iget-object v4, v4, Lcom/saterskog/cell_lab/Cell;->J:[F

    const/4 v5, 0x1

    aget v4, v4, v5

    mul-float/2addr v4, v8

    float-to-int v4, v4

    .line 1240
    if-gez v4, :cond_3

    move v4, v1

    .line 1241
    :cond_3
    if-lt v4, v9, :cond_4

    move v4, v3

    .line 1242
    :cond_4
    iget-object v5, p1, Lcom/saterskog/cell_lab/CellWorld;->x:[Lcom/saterskog/cell_lab/Cell;

    aget-object v5, v5, v0

    iget-object v5, v5, Lcom/saterskog/cell_lab/Cell;->J:[F

    aget v5, v5, v3

    mul-float/2addr v5, v8

    float-to-int v5, v5

    .line 1243
    if-gez v5, :cond_5

    move v5, v1

    .line 1244
    :cond_5
    if-lt v5, v9, :cond_6

    move v5, v3

    .line 1245
    :cond_6
    iget-object v7, p0, Lcom/saterskog/cell_lab/PlayActivity;->C:[I

    mul-int/lit8 v2, v2, 0x3

    mul-int/lit8 v2, v2, 0x3

    mul-int/lit8 v4, v4, 0x3

    add-int/2addr v2, v4

    add-int/2addr v2, v5

    aget v4, v7, v2

    add-int/lit8 v4, v4, 0x1

    aput v4, v7, v2

    .line 1235
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_7
    move-object v0, v6

    .line 1247
    :goto_2
    if-ge v1, v10, :cond_8

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ", "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v2, p0, Lcom/saterskog/cell_lab/PlayActivity;->C:[I

    aget v2, v2, v1

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 1248
    :cond_8
    invoke-direct {p0, v0}, Lcom/saterskog/cell_lab/PlayActivity;->c(Ljava/lang/String;)V

    .line 1250
    :cond_9
    return-void
.end method

.method public final a(Lcom/saterskog/cell_lab/CellWorld;Z)V
    .locals 27

    .prologue
    .line 1185
    move-object/from16 v0, p0

    iget v2, v0, Lcom/saterskog/cell_lab/PlayActivity;->q:I

    const/4 v3, -0x1

    if-ne v2, v3, :cond_1

    .line 1186
    move-object/from16 v0, p1

    iget v5, v0, Lcom/saterskog/cell_lab/CellWorld;->z:I

    .line 1188
    invoke-virtual/range {p1 .. p1}, Lcom/saterskog/cell_lab/CellWorld;->f()D

    move-result-wide v6

    .line 1189
    move-object/from16 v0, p1

    iget-wide v8, v0, Lcom/saterskog/cell_lab/CellWorld;->M:D

    .line 1191
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/PlayActivity;->u:Lcom/saterskog/cell_lab/CustomViewPager;

    invoke-virtual {v2}, Lcom/saterskog/cell_lab/CustomViewPager;->getCurrentItem()I

    move-result v2

    if-nez v2, :cond_0

    .line 1192
    const/4 v2, 0x0

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/saterskog/cell_lab/PlayActivity;->b(I)Landroid/app/Fragment;

    move-result-object v4

    check-cast v4, Lcom/saterskog/cell_lab/o;

    .line 1193
    if-eqz v4, :cond_0

    .line 4373
    iget-object v2, v4, Lcom/saterskog/cell_lab/o;->b:Landroid/widget/TextView;

    if-eqz v2, :cond_0

    .line 4374
    iget-object v2, v4, Lcom/saterskog/cell_lab/o;->b:Landroid/widget/TextView;

    new-instance v3, Lcom/saterskog/cell_lab/o$3;

    invoke-direct/range {v3 .. v9}, Lcom/saterskog/cell_lab/o$3;-><init>(Lcom/saterskog/cell_lab/o;IDD)V

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->post(Ljava/lang/Runnable;)Z

    .line 6150
    :cond_0
    :goto_0
    return-void

    .line 1198
    :cond_1
    move-object/from16 v0, p1

    iget v13, v0, Lcom/saterskog/cell_lab/CellWorld;->z:I

    .line 1199
    const/4 v2, 0x0

    move-object/from16 v0, p1

    invoke-virtual {v0, v2}, Lcom/saterskog/cell_lab/CellWorld;->b(I)I

    move-result v6

    .line 1200
    const/4 v2, 0x3

    move-object/from16 v0, p1

    invoke-virtual {v0, v2}, Lcom/saterskog/cell_lab/CellWorld;->b(I)I

    move-result v7

    .line 1201
    const/4 v2, 0x6

    move-object/from16 v0, p1

    invoke-virtual {v0, v2}, Lcom/saterskog/cell_lab/CellWorld;->b(I)I

    move-result v8

    .line 1202
    const/4 v2, 0x1

    move-object/from16 v0, p1

    invoke-virtual {v0, v2}, Lcom/saterskog/cell_lab/CellWorld;->b(I)I

    move-result v12

    .line 1203
    invoke-virtual/range {p1 .. p1}, Lcom/saterskog/cell_lab/CellWorld;->d()I

    move-result v9

    .line 1204
    invoke-virtual/range {p1 .. p1}, Lcom/saterskog/cell_lab/CellWorld;->e()I

    move-result v10

    .line 1205
    invoke-virtual/range {p1 .. p1}, Lcom/saterskog/cell_lab/CellWorld;->c()I

    move-result v11

    .line 1206
    move-object/from16 v0, p1

    iget v0, v0, Lcom/saterskog/cell_lab/CellWorld;->V:I

    move/from16 v19, v0

    .line 1207
    move-object/from16 v0, p1

    iget v0, v0, Lcom/saterskog/cell_lab/CellWorld;->W:I

    move/from16 v20, v0

    .line 1208
    move-object/from16 v0, p1

    iget-wide v0, v0, Lcom/saterskog/cell_lab/CellWorld;->N:D

    move-wide/from16 v21, v0

    .line 1209
    move-object/from16 v0, p1

    iget-wide v0, v0, Lcom/saterskog/cell_lab/CellWorld;->M:D

    move-wide/from16 v23, v0

    .line 1210
    const-wide/16 v14, 0x0

    .line 1211
    const/4 v2, 0x0

    :goto_1
    move-object/from16 v0, p1

    iget v3, v0, Lcom/saterskog/cell_lab/CellWorld;->B:I

    if-ge v2, v3, :cond_2

    .line 1212
    move-object/from16 v0, p1

    iget-object v3, v0, Lcom/saterskog/cell_lab/CellWorld;->A:[Lcom/saterskog/cell_lab/Food;

    aget-object v3, v3, v2

    iget v3, v3, Lcom/saterskog/cell_lab/Food;->c:F

    float-to-double v4, v3

    add-double/2addr v14, v4

    .line 1211
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 1214
    :cond_2
    move-object/from16 v0, p1

    iget-wide v0, v0, Lcom/saterskog/cell_lab/CellWorld;->M:D

    move-wide/from16 v16, v0

    .line 1216
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/saterskog/cell_lab/PlayActivity;->u:Lcom/saterskog/cell_lab/CustomViewPager;

    invoke-virtual {v2}, Lcom/saterskog/cell_lab/CustomViewPager;->getCurrentItem()I

    move-result v2

    if-nez v2, :cond_0

    .line 1217
    const/4 v2, 0x0

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/saterskog/cell_lab/PlayActivity;->b(I)Landroid/app/Fragment;

    move-result-object v3

    check-cast v3, Lcom/saterskog/cell_lab/m;

    .line 1218
    if-eqz v3, :cond_0

    .line 1219
    const/4 v2, 0x2

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/saterskog/cell_lab/PlayActivity;->b(I)Landroid/app/Fragment;

    move-result-object v2

    check-cast v2, Lcom/saterskog/cell_lab/i;

    .line 1220
    if-eqz v2, :cond_4

    .line 1221
    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/saterskog/cell_lab/PlayActivity;->F:[I

    .line 5284
    const/4 v4, 0x0

    :goto_2
    sget-object v18, Lcom/saterskog/cell_lab/h;->B:[Lcom/saterskog/cell_lab/h;

    move-object/from16 v0, v18

    array-length v0, v0

    move/from16 v18, v0

    move/from16 v0, v18

    if-ge v4, v0, :cond_3

    .line 5285
    const/16 v18, 0x0

    aput v18, v5, v4

    .line 5284
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    .line 5286
    :cond_3
    iget-object v4, v2, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    if-eqz v4, :cond_4

    .line 5287
    const/4 v4, 0x0

    :goto_3
    const/16 v18, 0x28

    move/from16 v0, v18

    if-ge v4, v0, :cond_4

    .line 5288
    iget-object v0, v2, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    move-object/from16 v18, v0

    aget-object v18, v18, v4

    move-object/from16 v0, v18

    iget-object v0, v0, Lcom/saterskog/cell_lab/Gene;->s:Lcom/saterskog/cell_lab/h;

    move-object/from16 v18, v0

    invoke-virtual/range {v18 .. v18}, Lcom/saterskog/cell_lab/h;->ordinal()I

    move-result v18

    aget v25, v5, v18

    add-int/lit8 v25, v25, 0x1

    aput v25, v5, v18

    .line 5287
    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    .line 1222
    :cond_4
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/saterskog/cell_lab/PlayActivity;->F:[I

    move-object/from16 v25, v0

    .line 6150
    iget v2, v3, Lcom/saterskog/cell_lab/m;->b:I

    if-eqz v2, :cond_0

    iget v2, v3, Lcom/saterskog/cell_lab/m;->b:I

    const/4 v4, 0x1

    if-eq v2, v4, :cond_0

    .line 6151
    iget v0, v3, Lcom/saterskog/cell_lab/m;->b:I

    move/from16 v18, v0

    .line 6152
    iget-boolean v2, v3, Lcom/saterskog/cell_lab/m;->d:Z

    if-nez v2, :cond_5

    if-eqz p2, :cond_6

    :cond_5
    const/4 v2, 0x1

    :goto_4
    iput-boolean v2, v3, Lcom/saterskog/cell_lab/m;->d:Z

    .line 6153
    iget-boolean v4, v3, Lcom/saterskog/cell_lab/m;->d:Z

    .line 6154
    iget-boolean v5, v3, Lcom/saterskog/cell_lab/m;->e:Z

    .line 6155
    iget-object v2, v3, Lcom/saterskog/cell_lab/m;->a:Landroid/widget/TextView;

    if-eqz v2, :cond_0

    .line 6156
    iget-object v0, v3, Lcom/saterskog/cell_lab/m;->a:Landroid/widget/TextView;

    move-object/from16 v26, v0

    new-instance v2, Lcom/saterskog/cell_lab/m$3;

    invoke-direct/range {v2 .. v25}, Lcom/saterskog/cell_lab/m$3;-><init>(Lcom/saterskog/cell_lab/m;ZZIIIIIIIIDDIIIDD[I)V

    move-object/from16 v0, v26

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->post(Ljava/lang/Runnable;)Z

    goto/16 :goto_0

    .line 6152
    :cond_6
    const/4 v2, 0x0

    goto :goto_4
.end method

.method public final a(Lcom/saterskog/cell_lab/Environment;)V
    .locals 3

    .prologue
    .line 1174
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/saterskog/cell_lab/PlayActivity;->b(I)Landroid/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/saterskog/cell_lab/p;

    .line 1175
    if-eqz v0, :cond_0

    iget-object v1, v0, Lcom/saterskog/cell_lab/p;->a:Lcom/saterskog/cell_lab/r;

    if-eqz v1, :cond_0

    .line 1176
    iget-object v1, v0, Lcom/saterskog/cell_lab/p;->a:Lcom/saterskog/cell_lab/r;

    new-instance v2, Lcom/saterskog/cell_lab/PlayActivity$8;

    invoke-direct {v2, p0, v0, p1}, Lcom/saterskog/cell_lab/PlayActivity$8;-><init>(Lcom/saterskog/cell_lab/PlayActivity;Lcom/saterskog/cell_lab/p;Lcom/saterskog/cell_lab/Environment;)V

    invoke-virtual {v1, v2}, Lcom/saterskog/cell_lab/r;->queueEvent(Ljava/lang/Runnable;)V

    .line 1182
    :cond_0
    return-void
.end method

.method public final a(S)V
    .locals 7

    .prologue
    const/high16 v2, 0x3f800000    # 1.0f

    .line 1727
    iget-boolean v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->w:Z

    if-eqz v0, :cond_0

    .line 1728
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->y:Landroid/media/SoundPool;

    iget-object v1, p0, Lcom/saterskog/cell_lab/PlayActivity;->B:[I

    aget v1, v1, p1

    const/4 v4, 0x1

    const/4 v5, 0x0

    move v3, v2

    move v6, v2

    invoke-virtual/range {v0 .. v6}, Landroid/media/SoundPool;->play(IFFIIF)I

    .line 1729
    :cond_0
    return-void
.end method

.method public final a(I)Z
    .locals 7

    .prologue
    const/4 v6, 0x2

    const/4 v5, 0x0

    const/16 v2, 0xb

    const/4 v4, 0x1

    .line 822
    packed-switch p1, :pswitch_data_0

    .line 848
    :goto_0
    iget v1, p0, Lcom/saterskog/cell_lab/PlayActivity;->H:I

    .line 849
    invoke-virtual {p0, v4}, Lcom/saterskog/cell_lab/PlayActivity;->b(I)Landroid/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/saterskog/cell_lab/p;

    .line 851
    if-ne v1, v4, :cond_0

    const/4 v2, 0x4

    const/16 v3, 0xbb8

    invoke-static {p0, v5, v2, v3}, Lcom/saterskog/cell_lab/t;->a(Landroid/app/Activity;III)V

    .line 852
    :cond_0
    if-ne v1, v6, :cond_1

    const/4 v2, 0x5

    const/16 v3, 0x7d0

    invoke-static {p0, v5, v2, v3}, Lcom/saterskog/cell_lab/t;->a(Landroid/app/Activity;III)V

    .line 853
    :cond_1
    if-eqz v0, :cond_2

    .line 854
    iget-object v2, v0, Lcom/saterskog/cell_lab/p;->a:Lcom/saterskog/cell_lab/r;

    new-instance v3, Lcom/saterskog/cell_lab/PlayActivity$23;

    invoke-direct {v3, p0, v0, v1}, Lcom/saterskog/cell_lab/PlayActivity$23;-><init>(Lcom/saterskog/cell_lab/PlayActivity;Lcom/saterskog/cell_lab/p;I)V

    invoke-virtual {v2, v3}, Lcom/saterskog/cell_lab/r;->queueEvent(Ljava/lang/Runnable;)V

    .line 864
    :cond_2
    return v4

    .line 824
    :pswitch_0
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->M:Landroid/widget/ImageButton;

    const v1, 0x7f07006a

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setImageResource(I)V

    .line 825
    iput v5, p0, Lcom/saterskog/cell_lab/PlayActivity;->H:I

    .line 826
    invoke-virtual {p0, v2}, Lcom/saterskog/cell_lab/PlayActivity;->a(S)V

    goto :goto_0

    .line 829
    :pswitch_1
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->M:Landroid/widget/ImageButton;

    const v1, 0x7f07006b

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setImageResource(I)V

    .line 830
    iput v4, p0, Lcom/saterskog/cell_lab/PlayActivity;->H:I

    .line 832
    invoke-virtual {p0, v2}, Lcom/saterskog/cell_lab/PlayActivity;->a(S)V

    goto :goto_0

    .line 835
    :pswitch_2
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->M:Landroid/widget/ImageButton;

    const v1, 0x7f070069

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setImageResource(I)V

    .line 836
    iput v6, p0, Lcom/saterskog/cell_lab/PlayActivity;->H:I

    .line 839
    invoke-virtual {p0, v2}, Lcom/saterskog/cell_lab/PlayActivity;->a(S)V

    goto :goto_0

    .line 842
    :pswitch_3
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->M:Landroid/widget/ImageButton;

    const v1, 0x7f07006c

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setImageResource(I)V

    .line 843
    const/4 v0, 0x3

    iput v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->H:I

    .line 845
    invoke-virtual {p0, v2}, Lcom/saterskog/cell_lab/PlayActivity;->a(S)V

    goto :goto_0

    .line 822
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public final a()[Lcom/saterskog/cell_lab/Gene;
    .locals 2

    .prologue
    .line 1718
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/saterskog/cell_lab/PlayActivity;->b(I)Landroid/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/saterskog/cell_lab/p;

    .line 1719
    if-eqz v0, :cond_0

    iget-object v1, v0, Lcom/saterskog/cell_lab/p;->a:Lcom/saterskog/cell_lab/r;

    if-eqz v1, :cond_0

    .line 1720
    iget-object v0, v0, Lcom/saterskog/cell_lab/p;->a:Lcom/saterskog/cell_lab/r;

    iget-object v0, v0, Lcom/saterskog/cell_lab/r;->a:Lcom/saterskog/cell_lab/q;

    invoke-virtual {v0}, Lcom/saterskog/cell_lab/q;->c()[Lcom/saterskog/cell_lab/Gene;

    move-result-object v0

    .line 1721
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final b(I)Landroid/app/Fragment;
    .locals 4

    .prologue
    .line 979
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/PlayActivity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "android:switcher:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/saterskog/cell_lab/PlayActivity;->u:Lcom/saterskog/cell_lab/CustomViewPager;

    .line 980
    invoke-virtual {v2}, Lcom/saterskog/cell_lab/CustomViewPager;->getId()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ":"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 3173
    int-to-long v2, p1

    .line 980
    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 979
    invoke-virtual {v0, v1}, Landroid/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/app/Fragment;

    move-result-object v0

    return-object v0
.end method

.method final b()Ljava/io/InputStream;
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 507
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "old: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v2, p0, Lcom/saterskog/cell_lab/PlayActivity;->o:Z

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/saterskog/b/a;->b(Ljava/lang/String;)V

    .line 508
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "external: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v2, p0, Lcom/saterskog/cell_lab/PlayActivity;->p:Z

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/saterskog/b/a;->b(Ljava/lang/String;)V

    .line 509
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "mUri: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/saterskog/cell_lab/PlayActivity;->L:Landroid/net/Uri;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/saterskog/b/a;->b(Ljava/lang/String;)V

    .line 510
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "loadChallenge: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Lcom/saterskog/cell_lab/PlayActivity;->s:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/saterskog/b/a;->b(Ljava/lang/String;)V

    .line 511
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "name: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/saterskog/cell_lab/PlayActivity;->t:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/saterskog/b/a;->b(Ljava/lang/String;)V

    .line 513
    iget-boolean v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->o:Z

    if-nez v0, :cond_0

    .line 552
    :goto_0
    return-object v1

    .line 515
    :cond_0
    iget-boolean v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->p:Z

    if-eqz v0, :cond_1

    .line 527
    :try_start_0
    new-instance v0, Ljava/io/BufferedInputStream;

    invoke-virtual {p0}, Lcom/saterskog/cell_lab/PlayActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v2

    iget-object v3, p0, Lcom/saterskog/cell_lab/PlayActivity;->L:Landroid/net/Uri;

    invoke-virtual {v2, v3}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    move-object v1, v0

    .line 552
    goto :goto_0

    .line 529
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/io/FileNotFoundException;->printStackTrace()V

    move-object v0, v1

    .line 530
    goto :goto_1

    .line 533
    :cond_1
    iget v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->s:I

    const/4 v2, -0x1

    if-ne v0, v2, :cond_2

    .line 536
    :try_start_1
    new-instance v0, Ljava/io/BufferedInputStream;

    iget-object v1, p0, Lcom/saterskog/cell_lab/PlayActivity;->t:Ljava/lang/String;

    .line 537
    invoke-static {v1}, Lcom/saterskog/cell_lab/f;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/saterskog/cell_lab/PlayActivity;->openFileInput(Ljava/lang/String;)Ljava/io/FileInputStream;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    .line 539
    :catch_1
    move-exception v0

    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "file not found"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 543
    :cond_2
    :try_start_2
    new-instance v0, Ljava/io/BufferedInputStream;

    invoke-virtual {p0}, Lcom/saterskog/cell_lab/PlayActivity;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v2

    iget v3, p0, Lcom/saterskog/cell_lab/PlayActivity;->s:I

    .line 544
    invoke-static {v3, p0}, Lcom/saterskog/cell_lab/j;->h(ILandroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    .line 543
    invoke-virtual {v2, v3}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_2
    .catch Ljava/io/StreamCorruptedException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_3

    goto :goto_1

    .line 547
    :catch_2
    move-exception v0

    invoke-virtual {v0}, Ljava/io/StreamCorruptedException;->printStackTrace()V

    move-object v0, v1

    .line 550
    goto :goto_1

    .line 549
    :catch_3
    move-exception v0

    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "io41"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final c()Lcom/saterskog/cell_lab/Environment;
    .locals 1

    .prologue
    .line 654
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->G:Lcom/saterskog/cell_lab/Environment;

    return-object v0
.end method

.method public final d()V
    .locals 1

    .prologue
    .line 817
    const/4 v0, 0x5

    invoke-virtual {p0, v0}, Lcom/saterskog/cell_lab/PlayActivity;->a(S)V

    .line 818
    return-void
.end method

.method public final e()V
    .locals 6

    .prologue
    const/4 v5, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    .line 1064
    invoke-virtual {p0, v3}, Lcom/saterskog/cell_lab/PlayActivity;->b(I)Landroid/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/saterskog/cell_lab/p;

    .line 1065
    iget v1, p0, Lcom/saterskog/cell_lab/PlayActivity;->q:I

    const/4 v2, -0x1

    if-ne v1, v2, :cond_2

    .line 1066
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    .line 1067
    const-string v2, "ask_sterilize_sample"

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 1069
    const/16 v1, 0xb

    invoke-virtual {p0, v1}, Lcom/saterskog/cell_lab/PlayActivity;->a(S)V

    .line 1070
    new-instance v1, Landroid/app/AlertDialog$Builder;

    invoke-direct {v1, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 1072
    const v2, 0x7f0e0067

    invoke-virtual {p0, v2}, Lcom/saterskog/cell_lab/PlayActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 1074
    const v2, 0x7f0e0066

    invoke-virtual {p0, v2}, Lcom/saterskog/cell_lab/PlayActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 1076
    const v2, 0x7f0e005c

    invoke-virtual {p0, v2}, Lcom/saterskog/cell_lab/PlayActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/saterskog/cell_lab/PlayActivity$3;

    invoke-direct {v3, p0, v0}, Lcom/saterskog/cell_lab/PlayActivity$3;-><init>(Lcom/saterskog/cell_lab/PlayActivity;Lcom/saterskog/cell_lab/p;)V

    invoke-virtual {v1, v2, v3}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 1088
    const v0, 0x7f0e005b

    invoke-virtual {p0, v0}, Lcom/saterskog/cell_lab/PlayActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Lcom/saterskog/cell_lab/PlayActivity$4;

    invoke-direct {v2, p0}, Lcom/saterskog/cell_lab/PlayActivity$4;-><init>(Lcom/saterskog/cell_lab/PlayActivity;)V

    invoke-virtual {v1, v0, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 1096
    invoke-virtual {v1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    .line 1097
    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    .line 1098
    invoke-virtual {v0}, Landroid/app/AlertDialog;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const-string v2, "android:id/titleDivider"

    invoke-virtual {v1, v2, v5, v5}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    .line 1099
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 1100
    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/saterskog/cell_lab/PlayActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f050014

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 1136
    :cond_0
    :goto_0
    const/16 v0, 0x9

    invoke-static {p0, v4, v0}, Lcom/saterskog/cell_lab/t;->b(Landroid/app/Activity;II)V

    .line 1137
    return-void

    .line 1103
    :cond_1
    iget-object v1, v0, Lcom/saterskog/cell_lab/p;->a:Lcom/saterskog/cell_lab/r;

    new-instance v2, Lcom/saterskog/cell_lab/PlayActivity$5;

    invoke-direct {v2, p0, v0}, Lcom/saterskog/cell_lab/PlayActivity$5;-><init>(Lcom/saterskog/cell_lab/PlayActivity;Lcom/saterskog/cell_lab/p;)V

    invoke-virtual {v1, v2}, Lcom/saterskog/cell_lab/r;->queueEvent(Ljava/lang/Runnable;)V

    goto :goto_0

    .line 1113
    :cond_2
    invoke-virtual {p0, v4}, Lcom/saterskog/cell_lab/PlayActivity;->a(S)V

    .line 1114
    iget v1, p0, Lcom/saterskog/cell_lab/PlayActivity;->q:I

    .line 1115
    iget-object v2, v0, Lcom/saterskog/cell_lab/p;->a:Lcom/saterskog/cell_lab/r;

    new-instance v3, Lcom/saterskog/cell_lab/PlayActivity$6;

    invoke-direct {v3, p0, v0, v1}, Lcom/saterskog/cell_lab/PlayActivity$6;-><init>(Lcom/saterskog/cell_lab/PlayActivity;Lcom/saterskog/cell_lab/p;I)V

    invoke-virtual {v2, v3}, Lcom/saterskog/cell_lab/r;->queueEvent(Ljava/lang/Runnable;)V

    goto :goto_0
.end method

.method public final f()[Lcom/saterskog/cell_lab/Gene;
    .locals 1

    .prologue
    .line 1168
    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lcom/saterskog/cell_lab/PlayActivity;->b(I)Landroid/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/saterskog/cell_lab/i;

    .line 3759
    iget-object v0, v0, Lcom/saterskog/cell_lab/i;->a:[Lcom/saterskog/cell_lab/Gene;

    .line 1169
    return-object v0
.end method

.method public final g()Z
    .locals 1

    .prologue
    .line 1743
    iget-boolean v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->w:Z

    return v0
.end method

.method public final h()V
    .locals 13

    .prologue
    .line 1747
    iget v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->q:I

    invoke-static {p0, v0}, Lcom/saterskog/cell_lab/j;->b(Landroid/content/Context;I)J

    move-result-wide v0

    invoke-static {}, Lcom/saterskog/b/a;->c()J

    move-result-wide v2

    iget-wide v4, p0, Lcom/saterskog/cell_lab/PlayActivity;->K:J

    sub-long/2addr v2, v4

    add-long v4, v0, v2

    .line 1748
    const-string v1, "win:playTime"

    sget-object v0, Lcom/saterskog/cell_lab/j;->a:Ljava/util/ArrayList;

    iget v2, p0, Lcom/saterskog/cell_lab/PlayActivity;->q:I

    .line 1749
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/saterskog/cell_lab/j$a;

    iget-object v2, v0, Lcom/saterskog/cell_lab/j$a;->b:Ljava/lang/String;

    .line 1750
    invoke-static {v4, v5}, Lcom/saterskog/b/a;->a(J)Ljava/lang/String;

    move-result-object v3

    move-object v6, p0

    .line 1748
    invoke-static/range {v1 .. v6}, Lcom/saterskog/b/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLandroid/app/Activity;)V

    .line 1753
    invoke-static {p0}, Lcom/saterskog/b/a;->b(Landroid/content/Context;)J

    move-result-wide v10

    .line 1754
    const-string v7, "win:installTime"

    sget-object v0, Lcom/saterskog/cell_lab/j;->a:Ljava/util/ArrayList;

    iget v1, p0, Lcom/saterskog/cell_lab/PlayActivity;->q:I

    .line 1755
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/saterskog/cell_lab/j$a;

    iget-object v8, v0, Lcom/saterskog/cell_lab/j$a;->b:Ljava/lang/String;

    .line 1756
    invoke-static {v10, v11}, Lcom/saterskog/b/a;->a(J)Ljava/lang/String;

    move-result-object v9

    move-object v12, p0

    .line 1754
    invoke-static/range {v7 .. v12}, Lcom/saterskog/b/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLandroid/app/Activity;)V

    .line 1759
    const-string v7, "win:id_play_now_install"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v0, Lcom/saterskog/cell_lab/j;->a:Ljava/util/ArrayList;

    iget v2, p0, Lcom/saterskog/cell_lab/PlayActivity;->q:I

    .line 1760
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/saterskog/cell_lab/j$a;

    iget-object v0, v0, Lcom/saterskog/cell_lab/j$a;->b:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Lcom/saterskog/b/a;->c()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p0}, Lcom/saterskog/b/a;->a(Landroid/content/Context;)J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    const-string v9, ""

    move-object v12, p0

    .line 1759
    invoke-static/range {v7 .. v12}, Lcom/saterskog/b/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLandroid/app/Activity;)V

    .line 1765
    return-void
.end method

.method public onBackPressed()V
    .locals 0

    .prologue
    .line 737
    invoke-direct {p0}, Lcom/saterskog/cell_lab/PlayActivity;->i()V

    .line 738
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 9

    .prologue
    const/4 v2, 0x0

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v8, 0x0

    const/4 v5, 0x1

    .line 1302
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const v1, 0x7f080068

    if-ne v0, v1, :cond_2

    .line 1304
    iget v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->q:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_9

    .line 6540
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->O:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 6541
    new-array v0, v4, [Ljava/lang/Integer;

    :goto_0
    move v1, v2

    .line 6546
    :goto_1
    array-length v6, v0

    if-ge v1, v6, :cond_1

    .line 6547
    new-instance v6, Ljava/lang/Integer;

    invoke-direct {v6, v1}, Ljava/lang/Integer;-><init>(I)V

    aput-object v6, v0, v1

    .line 6546
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 6543
    :cond_0
    new-array v0, v3, [Ljava/lang/Integer;

    goto :goto_0

    .line 6550
    :cond_1
    new-instance v1, Lcom/saterskog/cell_lab/PlayActivity$15;

    invoke-direct {v1, p0, p0, v0, v0}, Lcom/saterskog/cell_lab/PlayActivity$15;-><init>(Lcom/saterskog/cell_lab/PlayActivity;Landroid/content/Context;[Ljava/lang/Integer;[Ljava/lang/Integer;)V

    .line 6582
    new-instance v6, Landroid/app/AlertDialog$Builder;

    invoke-direct {v6, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    new-instance v7, Lcom/saterskog/cell_lab/PlayActivity$16;

    invoke-direct {v7, p0, v0}, Lcom/saterskog/cell_lab/PlayActivity$16;-><init>(Lcom/saterskog/cell_lab/PlayActivity;[Ljava/lang/Integer;)V

    .line 6583
    invoke-virtual {v6, v1, v7}, Landroid/app/AlertDialog$Builder;->setAdapter(Landroid/widget/ListAdapter;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x7f0e0113

    .line 6630
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    move-result-object v0

    .line 6632
    invoke-virtual {v0}, Landroid/app/AlertDialog;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const-string v6, "android:id/titleDivider"

    invoke-virtual {v1, v6, v8, v8}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    .line 6633
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 6634
    if-eqz v0, :cond_2

    .line 6635
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/PlayActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v6, 0x7f050014

    invoke-virtual {v1, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 1342
    :cond_2
    :goto_2
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const v1, 0x7f0800cc

    if-ne v0, v1, :cond_7

    .line 1343
    const/16 v0, 0x9

    invoke-virtual {p0, v0}, Lcom/saterskog/cell_lab/PlayActivity;->a(S)V

    .line 6669
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/PlayActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f02000b

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v1

    .line 6671
    iget-boolean v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->x:Z

    if-eqz v0, :cond_b

    const/4 v0, 0x4

    :goto_3
    new-array v6, v0, [Ljava/lang/CharSequence;

    .line 6674
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/PlayActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v7, 0x7f050030

    invoke-virtual {v0, v7}, Landroid/content/res/Resources;->getColor(I)I

    .line 6676
    aget-object v0, v1, v2

    aput-object v0, v6, v2

    .line 6677
    iget-boolean v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->x:Z

    if-eqz v0, :cond_c

    .line 6678
    aget-object v0, v1, v3

    aput-object v0, v6, v5

    move v0, v4

    .line 6679
    :goto_4
    add-int/lit8 v2, v0, 0x1

    aget-object v7, v1, v5

    aput-object v7, v6, v0

    .line 6680
    aget-object v0, v1, v4

    aput-object v0, v6, v2

    .line 6682
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 6684
    const v1, 0x7f0e0159

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    .line 6685
    iget v1, p0, Lcom/saterskog/cell_lab/PlayActivity;->H:I

    if-nez v1, :cond_3

    const v1, 0x7f07006a

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setIcon(I)Landroid/app/AlertDialog$Builder;

    .line 6686
    :cond_3
    iget v1, p0, Lcom/saterskog/cell_lab/PlayActivity;->H:I

    if-ne v1, v5, :cond_4

    const v1, 0x7f07006b

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setIcon(I)Landroid/app/AlertDialog$Builder;

    .line 6687
    :cond_4
    iget v1, p0, Lcom/saterskog/cell_lab/PlayActivity;->H:I

    if-ne v1, v4, :cond_5

    const v1, 0x7f070069

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setIcon(I)Landroid/app/AlertDialog$Builder;

    .line 6688
    :cond_5
    iget v1, p0, Lcom/saterskog/cell_lab/PlayActivity;->H:I

    if-ne v1, v3, :cond_6

    const v1, 0x7f07006c

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setIcon(I)Landroid/app/AlertDialog$Builder;

    .line 6691
    :cond_6
    new-instance v1, Lcom/saterskog/cell_lab/PlayActivity$17;

    invoke-direct {v1, p0}, Lcom/saterskog/cell_lab/PlayActivity$17;-><init>(Lcom/saterskog/cell_lab/PlayActivity;)V

    invoke-virtual {v0, v6, v1}, Landroid/app/AlertDialog$Builder;->setItems([Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 6708
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    .line 6709
    invoke-virtual {v0, v5}, Landroid/app/AlertDialog;->setCanceledOnTouchOutside(Z)V

    .line 6710
    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    .line 6711
    invoke-virtual {v0}, Landroid/app/AlertDialog;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const-string v2, "android:id/titleDivider"

    invoke-virtual {v1, v2, v8, v8}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    .line 6712
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 6713
    if-eqz v0, :cond_7

    .line 6714
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/PlayActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f050014

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 1346
    :cond_7
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const v1, 0x7f0800f2

    if-ne v0, v1, :cond_8

    .line 1347
    const/16 v0, 0x9

    invoke-virtual {p0, v0}, Lcom/saterskog/cell_lab/PlayActivity;->a(S)V

    .line 1348
    invoke-direct {p0}, Lcom/saterskog/cell_lab/PlayActivity;->k()V

    .line 1350
    :cond_8
    return-void

    .line 1308
    :cond_9
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 1309
    const-string v1, "ask_sterilize_sample"

    invoke-interface {v0, v1, v5}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 1311
    const/16 v0, 0xb

    invoke-virtual {p0, v0}, Lcom/saterskog/cell_lab/PlayActivity;->a(S)V

    .line 1312
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 1314
    const v1, 0x7f0e0064

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    .line 1316
    const v1, 0x7f0e0066

    invoke-virtual {p0, v1}, Lcom/saterskog/cell_lab/PlayActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 1318
    const v1, 0x7f0e005e

    new-instance v6, Lcom/saterskog/cell_lab/PlayActivity$10;

    invoke-direct {v6, p0}, Lcom/saterskog/cell_lab/PlayActivity$10;-><init>(Lcom/saterskog/cell_lab/PlayActivity;)V

    invoke-virtual {v0, v1, v6}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 1324
    const v1, 0x7f0e005b

    invoke-virtual {p0, v1}, Lcom/saterskog/cell_lab/PlayActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v6, Lcom/saterskog/cell_lab/PlayActivity$11;

    invoke-direct {v6, p0}, Lcom/saterskog/cell_lab/PlayActivity$11;-><init>(Lcom/saterskog/cell_lab/PlayActivity;)V

    invoke-virtual {v0, v1, v6}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 1332
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    .line 1333
    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    .line 1334
    invoke-virtual {v0}, Landroid/app/AlertDialog;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const-string v6, "android:id/titleDivider"

    invoke-virtual {v1, v6, v8, v8}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    .line 1335
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 1336
    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/saterskog/cell_lab/PlayActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v6, 0x7f050014

    invoke-virtual {v1, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    goto/16 :goto_2

    .line 1338
    :cond_a
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/PlayActivity;->e()V

    goto/16 :goto_2

    :cond_b
    move v0, v3

    .line 6671
    goto/16 :goto_3

    :cond_c
    move v0, v5

    goto/16 :goto_4
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 14

    .prologue
    const-wide/16 v12, 0x0

    const/4 v8, 0x3

    const/4 v10, -0x1

    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 139
    invoke-super {p0, p1}, Landroid/support/v4/app/e;->onCreate(Landroid/os/Bundle;)V

    .line 142
    invoke-static {p0}, Lcom/saterskog/cell_lab/CellLabApplication;->a(Landroid/app/Activity;)V

    .line 144
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v6

    .line 145
    const-string v0, "keep_on"

    invoke-interface {v6, v0, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 146
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/PlayActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v3, 0x80

    invoke-virtual {v0, v3}, Landroid/view/Window;->addFlags(I)V

    .line 148
    :cond_0
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/PlayActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v3, 0x400

    invoke-virtual {v0, v3}, Landroid/view/Window;->addFlags(I)V

    .line 154
    const-string v0, "sound_effects"

    invoke-interface {v6, v0, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->w:Z

    .line 157
    iget-boolean v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->w:Z

    if-eqz v0, :cond_1

    .line 158
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x15

    if-lt v0, v3, :cond_6

    .line 159
    new-instance v0, Landroid/media/SoundPool$Builder;

    invoke-direct {v0}, Landroid/media/SoundPool$Builder;-><init>()V

    .line 160
    invoke-virtual {v0, v8}, Landroid/media/SoundPool$Builder;->setMaxStreams(I)Landroid/media/SoundPool$Builder;

    move-result-object v0

    .line 161
    invoke-virtual {v0}, Landroid/media/SoundPool$Builder;->build()Landroid/media/SoundPool;

    move-result-object v0

    iput-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->y:Landroid/media/SoundPool;

    .line 166
    :goto_0
    iget-boolean v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->w:Z

    if-eqz v0, :cond_1

    .line 167
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->B:[I

    const/16 v3, 0x8

    iget-object v4, p0, Lcom/saterskog/cell_lab/PlayActivity;->y:Landroid/media/SoundPool;

    const v5, 0x7f0d002e

    invoke-virtual {v4, p0, v5, v2}, Landroid/media/SoundPool;->load(Landroid/content/Context;II)I

    move-result v4

    aput v4, v0, v3

    .line 168
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->B:[I

    const/4 v3, 0x2

    iget-object v4, p0, Lcom/saterskog/cell_lab/PlayActivity;->y:Landroid/media/SoundPool;

    const v5, 0x7f0d000f

    invoke-virtual {v4, p0, v5, v2}, Landroid/media/SoundPool;->load(Landroid/content/Context;II)I

    move-result v4

    aput v4, v0, v3

    .line 169
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->B:[I

    iget-object v3, p0, Lcom/saterskog/cell_lab/PlayActivity;->y:Landroid/media/SoundPool;

    const v4, 0x7f0d0018

    invoke-virtual {v3, p0, v4, v2}, Landroid/media/SoundPool;->load(Landroid/content/Context;II)I

    move-result v3

    aput v3, v0, v2

    .line 170
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->B:[I

    iget-object v3, p0, Lcom/saterskog/cell_lab/PlayActivity;->y:Landroid/media/SoundPool;

    const v4, 0x7f0d0035

    invoke-virtual {v3, p0, v4, v2}, Landroid/media/SoundPool;->load(Landroid/content/Context;II)I

    move-result v3

    aput v3, v0, v1

    .line 171
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->B:[I

    iget-object v3, p0, Lcom/saterskog/cell_lab/PlayActivity;->y:Landroid/media/SoundPool;

    const v4, 0x7f0d002c

    invoke-virtual {v3, p0, v4, v2}, Landroid/media/SoundPool;->load(Landroid/content/Context;II)I

    move-result v3

    aput v3, v0, v8

    .line 172
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->B:[I

    const/4 v3, 0x4

    iget-object v4, p0, Lcom/saterskog/cell_lab/PlayActivity;->y:Landroid/media/SoundPool;

    const v5, 0x7f0d003f

    invoke-virtual {v4, p0, v5, v2}, Landroid/media/SoundPool;->load(Landroid/content/Context;II)I

    move-result v4

    aput v4, v0, v3

    .line 173
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->B:[I

    const/4 v3, 0x5

    iget-object v4, p0, Lcom/saterskog/cell_lab/PlayActivity;->y:Landroid/media/SoundPool;

    const v5, 0x7f0d003a

    invoke-virtual {v4, p0, v5, v2}, Landroid/media/SoundPool;->load(Landroid/content/Context;II)I

    move-result v4

    aput v4, v0, v3

    .line 174
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->B:[I

    const/4 v3, 0x6

    iget-object v4, p0, Lcom/saterskog/cell_lab/PlayActivity;->y:Landroid/media/SoundPool;

    const v5, 0x7f0d0008

    invoke-virtual {v4, p0, v5, v2}, Landroid/media/SoundPool;->load(Landroid/content/Context;II)I

    move-result v4

    aput v4, v0, v3

    .line 175
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->B:[I

    const/4 v3, 0x7

    iget-object v4, p0, Lcom/saterskog/cell_lab/PlayActivity;->y:Landroid/media/SoundPool;

    const v5, 0x7f0d002d

    invoke-virtual {v4, p0, v5, v2}, Landroid/media/SoundPool;->load(Landroid/content/Context;II)I

    move-result v4

    aput v4, v0, v3

    .line 176
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->B:[I

    const/16 v3, 0x9

    iget-object v4, p0, Lcom/saterskog/cell_lab/PlayActivity;->y:Landroid/media/SoundPool;

    const v5, 0x7f0d0008

    invoke-virtual {v4, p0, v5, v2}, Landroid/media/SoundPool;->load(Landroid/content/Context;II)I

    move-result v4

    aput v4, v0, v3

    .line 177
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->B:[I

    const/16 v3, 0xa

    iget-object v4, p0, Lcom/saterskog/cell_lab/PlayActivity;->y:Landroid/media/SoundPool;

    const v5, 0x7f0d0030

    invoke-virtual {v4, p0, v5, v2}, Landroid/media/SoundPool;->load(Landroid/content/Context;II)I

    move-result v4

    aput v4, v0, v3

    .line 178
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->B:[I

    const/16 v3, 0xb

    iget-object v4, p0, Lcom/saterskog/cell_lab/PlayActivity;->y:Landroid/media/SoundPool;

    const v5, 0x7f0d0009

    invoke-virtual {v4, p0, v5, v2}, Landroid/media/SoundPool;->load(Landroid/content/Context;II)I

    move-result v4

    aput v4, v0, v3

    .line 182
    :cond_1
    const-string v0, "log_stats"

    const-string v3, "none"

    invoke-interface {v6, v0, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v3, "none"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    .line 184
    if-eqz p1, :cond_2

    .line 186
    const-string v0, "logFile"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Ljava/io/File;

    iput-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->D:Ljava/io/File;

    .line 188
    :cond_2
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->D:Ljava/io/File;

    if-nez v0, :cond_a

    .line 189
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/saterskog/cell_lab/PlayActivity;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object v3

    .line 192
    if-eqz v3, :cond_3

    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_4

    :cond_3
    invoke-virtual {v3}, Ljava/io/File;->mkdirs()Z

    move-result v0

    if-eqz v0, :cond_e

    :cond_4
    move v0, v1

    .line 196
    :cond_5
    add-int/lit8 v0, v0, 0x1

    .line 197
    new-instance v4, Ljava/io/File;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v5

    sget-object v7, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v7, "stats"

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v7, ".csv"

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    iput-object v4, p0, Lcom/saterskog/cell_lab/PlayActivity;->D:Ljava/io/File;

    .line 198
    iget-object v4, p0, Lcom/saterskog/cell_lab/PlayActivity;->D:Ljava/io/File;

    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v4

    if-nez v4, :cond_5

    .line 200
    const-string v0, "time, food mass, number of cell splits, number of cell deaths, "

    move-object v3, v0

    move v0, v1

    .line 201
    :goto_1
    if-ge v0, v8, :cond_9

    move v4, v1

    .line 202
    :goto_2
    if-ge v4, v8, :cond_8

    move-object v5, v3

    move v3, v1

    .line 203
    :goto_3
    if-ge v3, v8, :cond_7

    .line 204
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v7, ", r"

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v7, "g"

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v7, "b"

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 203
    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    .line 163
    :cond_6
    new-instance v0, Landroid/media/SoundPool;

    invoke-direct {v0, v8, v8, v1}, Landroid/media/SoundPool;-><init>(III)V

    iput-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->y:Landroid/media/SoundPool;

    goto/16 :goto_0

    .line 202
    :cond_7
    add-int/lit8 v3, v4, 0x1

    move v4, v3

    move-object v3, v5

    goto :goto_2

    .line 201
    :cond_8
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 207
    :cond_9
    invoke-direct {p0, v3}, Lcom/saterskog/cell_lab/PlayActivity;->c(Ljava/lang/String;)V

    .line 217
    :cond_a
    :goto_4
    const v0, 0x7f0a001c

    invoke-virtual {p0, v0}, Lcom/saterskog/cell_lab/PlayActivity;->setContentView(I)V

    .line 219
    if-eqz p1, :cond_f

    .line 220
    const-string v0, "ienv"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/saterskog/cell_lab/Environment;

    iput-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->G:Lcom/saterskog/cell_lab/Environment;

    .line 221
    const-string v0, "mUri"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/net/Uri;

    iput-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->L:Landroid/net/Uri;

    .line 222
    const-string v0, "challenge"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->q:I

    .line 223
    const-string v0, "tutorial"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->r:I

    .line 224
    const-string v0, "plateName"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->O:Ljava/lang/String;

    .line 225
    const-string v0, "name"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->t:Ljava/lang/String;

    .line 226
    const-string v0, "loadChallenge"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->s:I

    .line 227
    const-string v0, "old"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->o:Z

    .line 228
    const-string v0, "external"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->p:Z

    .line 331
    :cond_b
    :goto_5
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/PlayActivity;->getActionBar()Landroid/app/ActionBar;

    move-result-object v3

    .line 337
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->O:Ljava/lang/String;

    if-nez v0, :cond_1e

    const v0, 0x7f0e008b

    invoke-virtual {p0, v0}, Lcom/saterskog/cell_lab/PlayActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_6
    invoke-virtual {v3, v0}, Landroid/app/ActionBar;->setTitle(Ljava/lang/CharSequence;)V

    .line 339
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/PlayActivity;->getActionBar()Landroid/app/ActionBar;

    move-result-object v0

    new-instance v4, Landroid/graphics/drawable/ColorDrawable;

    .line 340
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/PlayActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v7, 0x106000d

    invoke-virtual {v5, v7}, Landroid/content/res/Resources;->getColor(I)I

    move-result v5

    invoke-direct {v4, v5}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 339
    invoke-virtual {v0, v4}, Landroid/app/ActionBar;->setIcon(Landroid/graphics/drawable/Drawable;)V

    .line 342
    const-string v0, "music"

    invoke-interface {v6, v0, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 343
    iget v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->q:I

    if-ne v0, v10, :cond_1f

    .line 344
    const v0, 0x7f0d0010

    invoke-static {p0, v0}, Landroid/media/MediaPlayer;->create(Landroid/content/Context;I)Landroid/media/MediaPlayer;

    move-result-object v0

    iput-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->z:Landroid/media/MediaPlayer;

    .line 347
    :goto_7
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->z:Landroid/media/MediaPlayer;

    invoke-virtual {v0, v2}, Landroid/media/MediaPlayer;->setLooping(Z)V

    .line 348
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->z:Landroid/media/MediaPlayer;

    const/high16 v4, 0x3f000000    # 0.5f

    const/high16 v5, 0x3f000000    # 0.5f

    invoke-virtual {v0, v4, v5}, Landroid/media/MediaPlayer;->setVolume(FF)V

    .line 351
    if-eqz p1, :cond_c

    .line 352
    const-string v0, "song_pos"

    invoke-virtual {p1, v0, v10}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    .line 353
    if-eq v0, v10, :cond_c

    iput v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->A:I

    .line 354
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->z:Landroid/media/MediaPlayer;

    iget v4, p0, Lcom/saterskog/cell_lab/PlayActivity;->A:I

    invoke-virtual {v0, v4}, Landroid/media/MediaPlayer;->seekTo(I)V

    .line 355
    :cond_c
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->z:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V

    .line 358
    :cond_d
    const-string v0, "slow_motion"

    invoke-interface {v6, v0, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_20

    iget v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->q:I

    if-ne v0, v10, :cond_20

    move v0, v2

    :goto_8
    iput-boolean v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->x:Z

    .line 362
    new-instance v0, Lcom/saterskog/cell_lab/PlayActivity$a;

    invoke-virtual {p0}, Lcom/saterskog/cell_lab/PlayActivity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v4

    invoke-direct {v0, p0, v4}, Lcom/saterskog/cell_lab/PlayActivity$a;-><init>(Lcom/saterskog/cell_lab/PlayActivity;Landroid/app/FragmentManager;)V

    iput-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->n:Lcom/saterskog/cell_lab/PlayActivity$a;

    .line 365
    const v0, 0x7f08005d

    invoke-virtual {p0, v0}, Lcom/saterskog/cell_lab/PlayActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/saterskog/cell_lab/CustomViewPager;

    iput-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->u:Lcom/saterskog/cell_lab/CustomViewPager;

    .line 366
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->u:Lcom/saterskog/cell_lab/CustomViewPager;

    iget-object v4, p0, Lcom/saterskog/cell_lab/PlayActivity;->n:Lcom/saterskog/cell_lab/PlayActivity$a;

    invoke-virtual {v0, v4}, Lcom/saterskog/cell_lab/CustomViewPager;->setAdapter(Landroid/support/v4/view/p;)V

    .line 368
    const/4 v0, 0x2

    invoke-virtual {v3, v0}, Landroid/app/ActionBar;->setNavigationMode(I)V

    .line 369
    invoke-virtual {v3, v2}, Landroid/app/ActionBar;->setDisplayShowTitleEnabled(Z)V

    .line 370
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/PlayActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    iget v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->q:I

    if-ne v0, v10, :cond_21

    const v0, 0x7f02000c

    :goto_9
    invoke-virtual {v2, v0}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v2

    array-length v4, v2

    move v0, v1

    :goto_a
    if-ge v0, v4, :cond_22

    aget-object v5, v2, v0

    .line 371
    invoke-virtual {v3}, Landroid/app/ActionBar;->newTab()Landroid/app/ActionBar$Tab;

    move-result-object v6

    invoke-virtual {v6, v5}, Landroid/app/ActionBar$Tab;->setText(Ljava/lang/CharSequence;)Landroid/app/ActionBar$Tab;

    move-result-object v5

    invoke-virtual {v5, p0}, Landroid/app/ActionBar$Tab;->setTabListener(Landroid/app/ActionBar$TabListener;)Landroid/app/ActionBar$Tab;

    move-result-object v5

    invoke-virtual {v3, v5}, Landroid/app/ActionBar;->addTab(Landroid/app/ActionBar$Tab;)V

    .line 370
    add-int/lit8 v0, v0, 0x1

    goto :goto_a

    .line 211
    :cond_e
    const-string v0, "couldn\'t create cell_lab folder"

    invoke-static {v0}, Lcom/saterskog/b/a;->a(Ljava/lang/String;)V

    .line 212
    const-string v0, "Couldn\'t create log file"

    invoke-static {p0, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto/16 :goto_4

    .line 230
    :cond_f
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/PlayActivity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    .line 231
    invoke-virtual {v4}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v5

    .line 232
    if-nez v5, :cond_17

    .line 233
    const-string v0, "name"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->t:Ljava/lang/String;

    .line 234
    const-string v0, "old"

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    if-eqz v0, :cond_13

    move v0, v2

    :goto_b
    iput-boolean v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->o:Z

    .line 235
    const-string v0, "experimentOnChallenge"

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    if-eqz v0, :cond_14

    move v0, v2

    .line 236
    :goto_c
    const-string v3, "challenge"

    invoke-virtual {v4, v3, v10}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v3

    iput v3, p0, Lcom/saterskog/cell_lab/PlayActivity;->q:I

    .line 237
    iget v3, p0, Lcom/saterskog/cell_lab/PlayActivity;->q:I

    if-eq v3, v10, :cond_15

    .line 238
    invoke-static {p0}, Lcom/saterskog/cell_lab/j;->b(Landroid/content/Context;)[Ljava/lang/String;

    move-result-object v3

    iget v5, p0, Lcom/saterskog/cell_lab/PlayActivity;->q:I

    aget-object v3, v3, v5

    iput-object v3, p0, Lcom/saterskog/cell_lab/PlayActivity;->O:Ljava/lang/String;

    .line 239
    iput-boolean v2, p0, Lcom/saterskog/cell_lab/PlayActivity;->o:Z

    .line 240
    const/4 v3, 0x0

    iput-object v3, p0, Lcom/saterskog/cell_lab/PlayActivity;->t:Ljava/lang/String;

    .line 248
    :goto_d
    iput-boolean v1, p0, Lcom/saterskog/cell_lab/PlayActivity;->p:Z

    .line 290
    :goto_e
    iget v3, p0, Lcom/saterskog/cell_lab/PlayActivity;->q:I

    iput v3, p0, Lcom/saterskog/cell_lab/PlayActivity;->s:I

    .line 291
    if-eqz v0, :cond_10

    .line 292
    iput v10, p0, Lcom/saterskog/cell_lab/PlayActivity;->q:I

    .line 293
    :cond_10
    iget-boolean v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->o:Z

    if-nez v0, :cond_1d

    .line 294
    const-string v0, "aha"

    invoke-static {v0}, Lcom/saterskog/b/a;->b(Ljava/lang/String;)V

    .line 295
    const-string v0, "preloadedCW"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/saterskog/cell_lab/CellWorld;

    iput-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->v:Lcom/saterskog/cell_lab/CellWorld;

    .line 296
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->G:Lcom/saterskog/cell_lab/Environment;

    const-wide/high16 v8, 0x404e000000000000L    # 60.0

    iput-wide v8, v0, Lcom/saterskog/cell_lab/Environment;->g:D

    .line 297
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->G:Lcom/saterskog/cell_lab/Environment;

    const-wide v8, 0x4024ffffffffffffL    # 10.499999999999998

    iput-wide v8, v0, Lcom/saterskog/cell_lab/Environment;->a:D

    .line 298
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->G:Lcom/saterskog/cell_lab/Environment;

    const-wide/high16 v8, 0x3fd0000000000000L    # 0.25

    iput-wide v8, v0, Lcom/saterskog/cell_lab/Environment;->b:D

    .line 299
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->G:Lcom/saterskog/cell_lab/Environment;

    iput-wide v12, v0, Lcom/saterskog/cell_lab/Environment;->p:D

    .line 300
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->G:Lcom/saterskog/cell_lab/Environment;

    const-wide v8, 0x3f9eb851eb851eb8L    # 0.03

    iput-wide v8, v0, Lcom/saterskog/cell_lab/Environment;->q:D

    .line 301
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->G:Lcom/saterskog/cell_lab/Environment;

    iput-wide v12, v0, Lcom/saterskog/cell_lab/Environment;->f:D

    .line 302
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->G:Lcom/saterskog/cell_lab/Environment;

    iput-wide v12, v0, Lcom/saterskog/cell_lab/Environment;->c:D

    .line 304
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->G:Lcom/saterskog/cell_lab/Environment;

    const v3, 0x3e99999a    # 0.3f

    iput v3, v0, Lcom/saterskog/cell_lab/Environment;->n:F

    .line 305
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->G:Lcom/saterskog/cell_lab/Environment;

    iput-wide v12, v0, Lcom/saterskog/cell_lab/Environment;->h:D

    .line 306
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->G:Lcom/saterskog/cell_lab/Environment;

    iput-wide v12, v0, Lcom/saterskog/cell_lab/Environment;->i:D

    .line 307
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->G:Lcom/saterskog/cell_lab/Environment;

    iput-wide v12, v0, Lcom/saterskog/cell_lab/Environment;->j:D

    .line 308
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->G:Lcom/saterskog/cell_lab/Environment;

    const-wide/high16 v8, 0x3ff0000000000000L    # 1.0

    iput-wide v8, v0, Lcom/saterskog/cell_lab/Environment;->z:D

    .line 309
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->G:Lcom/saterskog/cell_lab/Environment;

    iput-boolean v1, v0, Lcom/saterskog/cell_lab/Environment;->w:Z

    .line 310
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->G:Lcom/saterskog/cell_lab/Environment;

    iput-boolean v1, v0, Lcom/saterskog/cell_lab/Environment;->x:Z

    .line 311
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->G:Lcom/saterskog/cell_lab/Environment;

    iput-boolean v1, v0, Lcom/saterskog/cell_lab/Environment;->u:Z

    .line 312
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->G:Lcom/saterskog/cell_lab/Environment;

    iput-boolean v2, v0, Lcom/saterskog/cell_lab/Environment;->v:Z

    .line 313
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->G:Lcom/saterskog/cell_lab/Environment;

    const-string v3, "maxCells"

    const/16 v5, 0x3e8

    invoke-virtual {v4, v3, v5}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v3

    iput v3, v0, Lcom/saterskog/cell_lab/Environment;->r:I

    .line 314
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->G:Lcom/saterskog/cell_lab/Environment;

    const-string v3, "maxFoods"

    const/16 v5, 0xdac

    invoke-virtual {v4, v3, v5}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v3

    iput v3, v0, Lcom/saterskog/cell_lab/Environment;->s:I

    .line 315
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->G:Lcom/saterskog/cell_lab/Environment;

    const-string v3, "radius"

    const-wide/high16 v8, 0x3ff0000000000000L    # 1.0

    invoke-virtual {v4, v3, v8, v9}, Landroid/content/Intent;->getDoubleExtra(Ljava/lang/String;D)D

    move-result-wide v4

    iput-wide v4, v0, Lcom/saterskog/cell_lab/Environment;->k:D

    .line 316
    iget v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->q:I

    invoke-static {v0, p0}, Lcom/saterskog/cell_lab/j;->i(ILandroid/content/Context;)[Z

    move-result-object v5

    move v0, v1

    move v3, v1

    .line 318
    :goto_f
    sget-object v4, Lcom/saterskog/cell_lab/h;->B:[Lcom/saterskog/cell_lab/h;

    array-length v4, v4

    if-ge v3, v4, :cond_1c

    .line 319
    iget-object v4, p0, Lcom/saterskog/cell_lab/PlayActivity;->G:Lcom/saterskog/cell_lab/Environment;

    iget-object v7, v4, Lcom/saterskog/cell_lab/Environment;->t:[Z

    aget-boolean v4, v5, v3

    if-eqz v4, :cond_1b

    sget-object v4, Lcom/saterskog/cell_lab/h;->a:Lcom/saterskog/cell_lab/h;

    invoke-virtual {v4}, Lcom/saterskog/cell_lab/h;->ordinal()I

    move-result v4

    if-eq v3, v4, :cond_11

    sget-object v4, Lcom/saterskog/cell_lab/h;->b:Lcom/saterskog/cell_lab/h;

    invoke-virtual {v4}, Lcom/saterskog/cell_lab/h;->ordinal()I

    move-result v4

    if-ne v3, v4, :cond_1b

    :cond_11
    move v4, v2

    :goto_10
    aput-boolean v4, v7, v3

    .line 320
    iget-object v4, p0, Lcom/saterskog/cell_lab/PlayActivity;->G:Lcom/saterskog/cell_lab/Environment;

    iget-object v4, v4, Lcom/saterskog/cell_lab/Environment;->t:[Z

    aget-boolean v4, v4, v3

    if-eqz v4, :cond_12

    move v0, v2

    .line 318
    :cond_12
    add-int/lit8 v3, v3, 0x1

    goto :goto_f

    :cond_13
    move v0, v1

    .line 234
    goto/16 :goto_b

    :cond_14
    move v0, v1

    .line 235
    goto/16 :goto_c

    .line 243
    :cond_15
    iget-boolean v3, p0, Lcom/saterskog/cell_lab/PlayActivity;->o:Z

    if-eqz v3, :cond_16

    .line 244
    iget-object v3, p0, Lcom/saterskog/cell_lab/PlayActivity;->t:Ljava/lang/String;

    iput-object v3, p0, Lcom/saterskog/cell_lab/PlayActivity;->O:Ljava/lang/String;

    goto/16 :goto_d

    .line 246
    :cond_16
    const/4 v3, 0x0

    iput-object v3, p0, Lcom/saterskog/cell_lab/PlayActivity;->O:Ljava/lang/String;

    goto/16 :goto_d

    .line 250
    :cond_17
    iput v10, p0, Lcom/saterskog/cell_lab/PlayActivity;->q:I

    .line 251
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, "scheme: "

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Landroid/content/Intent;->getScheme()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/saterskog/b/a;->b(Ljava/lang/String;)V

    .line 253
    invoke-virtual {v5}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->t:Ljava/lang/String;

    .line 258
    :try_start_0
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/PlayActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    .line 259
    if-eqz v0, :cond_2a

    move v3, v2

    .line 261
    :goto_11
    :try_start_1
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2

    move v0, v3

    .line 267
    :goto_12
    if-eqz v0, :cond_18

    .line 269
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v7, "exists: "

    invoke-direct {v3, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v7, p0, Lcom/saterskog/cell_lab/PlayActivity;->t:Ljava/lang/String;

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/saterskog/b/a;->b(Ljava/lang/String;)V

    .line 271
    iput-object v5, p0, Lcom/saterskog/cell_lab/PlayActivity;->L:Landroid/net/Uri;

    .line 272
    iget-object v3, p0, Lcom/saterskog/cell_lab/PlayActivity;->t:Ljava/lang/String;

    iget-object v5, p0, Lcom/saterskog/cell_lab/PlayActivity;->t:Ljava/lang/String;

    const-string v7, "/"

    invoke-virtual {v5, v7}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v5

    add-int/lit8 v5, v5, 0x1

    invoke-virtual {v3, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lcom/saterskog/cell_lab/PlayActivity;->O:Ljava/lang/String;

    .line 273
    iget-object v3, p0, Lcom/saterskog/cell_lab/PlayActivity;->O:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    const/16 v5, 0xa

    if-le v3, v5, :cond_1a

    iget-object v3, p0, Lcom/saterskog/cell_lab/PlayActivity;->O:Ljava/lang/String;

    iget-object v5, p0, Lcom/saterskog/cell_lab/PlayActivity;->O:Ljava/lang/String;

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    add-int/lit8 v5, v5, -0xa

    iget-object v7, p0, Lcom/saterskog/cell_lab/PlayActivity;->O:Ljava/lang/String;

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v7

    invoke-virtual {v3, v5, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    const-string v5, ".substrate"

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1a

    move v0, v1

    .line 281
    :cond_18
    :goto_13
    if-nez v0, :cond_19

    .line 282
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, "doesn\'t exists: "

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lcom/saterskog/cell_lab/PlayActivity;->t:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/saterskog/b/a;->b(Ljava/lang/String;)V

    .line 283
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->L:Landroid/net/Uri;

    .line 284
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->O:Ljava/lang/String;

    .line 285
    const-string v0, ""

    iput-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->t:Ljava/lang/String;

    .line 286
    iput-boolean v1, p0, Lcom/saterskog/cell_lab/PlayActivity;->o:Z

    .line 287
    iput-boolean v1, p0, Lcom/saterskog/cell_lab/PlayActivity;->p:Z

    :cond_19
    move v0, v1

    goto/16 :goto_e

    .line 263
    :catch_0
    move-exception v0

    move v3, v1

    :goto_14
    invoke-virtual {v0}, Ljava/io/FileNotFoundException;->printStackTrace()V

    move v0, v3

    .line 266
    goto :goto_12

    .line 265
    :catch_1
    move-exception v0

    move v3, v1

    :goto_15
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    move v0, v3

    goto/16 :goto_12

    .line 276
    :cond_1a
    iget-object v3, p0, Lcom/saterskog/cell_lab/PlayActivity;->O:Ljava/lang/String;

    iget-object v5, p0, Lcom/saterskog/cell_lab/PlayActivity;->O:Ljava/lang/String;

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    add-int/lit8 v5, v5, -0xa

    invoke-virtual {v3, v1, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lcom/saterskog/cell_lab/PlayActivity;->O:Ljava/lang/String;

    .line 277
    iput-boolean v2, p0, Lcom/saterskog/cell_lab/PlayActivity;->o:Z

    .line 278
    iput-boolean v2, p0, Lcom/saterskog/cell_lab/PlayActivity;->p:Z

    goto :goto_13

    :cond_1b
    move v4, v1

    .line 319
    goto/16 :goto_10

    .line 322
    :cond_1c
    if-nez v0, :cond_b

    .line 323
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->G:Lcom/saterskog/cell_lab/Environment;

    iget-object v0, v0, Lcom/saterskog/cell_lab/Environment;->t:[Z

    sget-object v3, Lcom/saterskog/cell_lab/h;->c:Lcom/saterskog/cell_lab/h;

    invoke-virtual {v3}, Lcom/saterskog/cell_lab/h;->ordinal()I

    move-result v3

    aput-boolean v2, v0, v3

    goto/16 :goto_5

    .line 326
    :cond_1d
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/PlayActivity;->b()Ljava/io/InputStream;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/saterskog/cell_lab/PlayActivity;->a(Ljava/io/InputStream;)V

    goto/16 :goto_5

    .line 337
    :cond_1e
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->O:Ljava/lang/String;

    goto/16 :goto_6

    .line 346
    :cond_1f
    const v0, 0x7f0d000c

    invoke-static {p0, v0}, Landroid/media/MediaPlayer;->create(Landroid/content/Context;I)Landroid/media/MediaPlayer;

    move-result-object v0

    iput-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->z:Landroid/media/MediaPlayer;

    goto/16 :goto_7

    :cond_20
    move v0, v1

    .line 358
    goto/16 :goto_8

    .line 370
    :cond_21
    const v0, 0x7f020005

    goto/16 :goto_9

    .line 378
    :cond_22
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->u:Lcom/saterskog/cell_lab/CustomViewPager;

    new-instance v2, Lcom/saterskog/cell_lab/PlayActivity$1;

    invoke-direct {v2, p0}, Lcom/saterskog/cell_lab/PlayActivity$1;-><init>(Lcom/saterskog/cell_lab/PlayActivity;)V

    invoke-virtual {v0, v2}, Lcom/saterskog/cell_lab/CustomViewPager;->setOnPageChangeListener(Landroid/support/v4/view/ViewPager$f;)V

    .line 432
    if-eqz p1, :cond_25

    .line 433
    const-string v0, "tab"

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v3, v0}, Landroid/app/ActionBar;->setSelectedNavigationItem(I)V

    .line 434
    const-string v0, "modeSpinner"

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->H:I

    .line 435
    const-string v0, "toolSpinner"

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->I:I

    .line 436
    invoke-static {p0, p0, p1}, Lcom/saterskog/cell_lab/t;->a(Lcom/saterskog/cell_lab/PlayActivity;Lcom/saterskog/cell_lab/t$a;Landroid/os/Bundle;)V

    .line 463
    :cond_23
    :goto_16
    invoke-virtual {v3}, Landroid/app/ActionBar;->getSelectedNavigationIndex()I

    move-result v1

    .line 464
    iget v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->q:I

    if-ne v0, v10, :cond_29

    .line 466
    packed-switch v1, :pswitch_data_0

    .line 496
    :goto_17
    iget v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->q:I

    if-eq v0, v10, :cond_24

    iget v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->q:I

    invoke-static {p0, v0}, Lcom/saterskog/cell_lab/j;->b(Landroid/content/Context;I)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_24

    .line 498
    invoke-static {p0}, Lcom/saterskog/b/a;->b(Landroid/content/Context;)J

    move-result-wide v4

    .line 499
    const-string v1, "start:installTime"

    sget-object v0, Lcom/saterskog/cell_lab/j;->a:Ljava/util/ArrayList;

    iget v2, p0, Lcom/saterskog/cell_lab/PlayActivity;->q:I

    .line 500
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/saterskog/cell_lab/j$a;

    iget-object v2, v0, Lcom/saterskog/cell_lab/j$a;->b:Ljava/lang/String;

    .line 501
    invoke-static {v4, v5}, Lcom/saterskog/b/a;->a(J)Ljava/lang/String;

    move-result-object v3

    move-object v6, p0

    .line 499
    invoke-static/range {v1 .. v6}, Lcom/saterskog/b/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLandroid/app/Activity;)V

    .line 505
    :cond_24
    return-void

    .line 438
    :cond_25
    iput v1, p0, Lcom/saterskog/cell_lab/PlayActivity;->H:I

    .line 439
    iget v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->q:I

    if-eq v0, v10, :cond_26

    .line 440
    invoke-static {p0}, Lcom/saterskog/cell_lab/j;->a(Landroid/content/Context;)Ljava/util/ArrayList;

    move-result-object v0

    iget v2, p0, Lcom/saterskog/cell_lab/PlayActivity;->q:I

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/saterskog/cell_lab/j$a;

    iget v0, v0, Lcom/saterskog/cell_lab/j$a;->i:I

    iput v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->r:I

    .line 443
    :goto_18
    iget v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->r:I

    if-eq v0, v10, :cond_27

    .line 444
    iget v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->r:I

    invoke-static {p0, v0, p0}, Lcom/saterskog/cell_lab/t;->a(Lcom/saterskog/cell_lab/PlayActivity;ILcom/saterskog/cell_lab/t$a;)V

    .line 445
    invoke-static {p0}, Lcom/saterskog/cell_lab/t;->a(Landroid/app/Activity;)V

    .line 449
    :goto_19
    iget v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->q:I

    invoke-static {v0}, Lcom/saterskog/cell_lab/j;->a(I)[Z

    move-result-object v0

    .line 451
    :goto_1a
    const/4 v2, 0x5

    if-ge v1, v2, :cond_23

    .line 454
    aget-boolean v2, v0, v1

    if-eqz v2, :cond_28

    .line 456
    iput v1, p0, Lcom/saterskog/cell_lab/PlayActivity;->I:I

    goto :goto_16

    .line 442
    :cond_26
    iput v10, p0, Lcom/saterskog/cell_lab/PlayActivity;->r:I

    goto :goto_18

    .line 447
    :cond_27
    invoke-static {}, Lcom/saterskog/cell_lab/t;->a()V

    goto :goto_19

    .line 451
    :cond_28
    add-int/lit8 v1, v1, 0x1

    goto :goto_1a

    .line 469
    :pswitch_0
    const-string v0, "experiment/sample_info"

    invoke-static {v0, p0}, Lcom/saterskog/b/a;->a(Ljava/lang/String;Landroid/app/Activity;)V

    goto :goto_17

    .line 472
    :pswitch_1
    const-string v0, "experiment/microscope"

    invoke-static {v0, p0}, Lcom/saterskog/b/a;->a(Ljava/lang/String;Landroid/app/Activity;)V

    goto :goto_17

    .line 475
    :pswitch_2
    const-string v0, "experiment/genome_editor"

    invoke-static {v0, p0}, Lcom/saterskog/b/a;->a(Ljava/lang/String;Landroid/app/Activity;)V

    goto :goto_17

    .line 481
    :cond_29
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v0, "level:"

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p0}, Lcom/saterskog/cell_lab/j;->a(Landroid/content/Context;)Ljava/util/ArrayList;

    move-result-object v0

    iget v3, p0, Lcom/saterskog/cell_lab/PlayActivity;->q:I

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/saterskog/cell_lab/j$a;

    iget-object v0, v0, Lcom/saterskog/cell_lab/j$a;->b:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 482
    packed-switch v1, :pswitch_data_1

    goto/16 :goto_17

    .line 485
    :pswitch_3
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/objective"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p0}, Lcom/saterskog/b/a;->a(Ljava/lang/String;Landroid/app/Activity;)V

    goto/16 :goto_17

    .line 488
    :pswitch_4
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/microscope"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p0}, Lcom/saterskog/b/a;->a(Ljava/lang/String;Landroid/app/Activity;)V

    goto/16 :goto_17

    .line 491
    :pswitch_5
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/genome_editor"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p0}, Lcom/saterskog/b/a;->a(Ljava/lang/String;Landroid/app/Activity;)V

    goto/16 :goto_17

    .line 265
    :catch_2
    move-exception v0

    goto/16 :goto_15

    .line 263
    :catch_3
    move-exception v0

    goto/16 :goto_14

    :cond_2a
    move v3, v1

    goto/16 :goto_11

    .line 466
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch

    .line 482
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 7

    .prologue
    const/4 v6, 0x3

    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, -0x1

    const v2, 0x7f080052

    .line 662
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/PlayActivity;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    .line 664
    iget v1, p0, Lcom/saterskog/cell_lab/PlayActivity;->q:I

    if-ne v1, v3, :cond_a

    .line 665
    const/high16 v1, 0x7f0b0000

    invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 688
    :goto_0
    invoke-interface {p1, v2}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/MenuItem;->getActionView()Landroid/view/View;

    move-result-object v0

    const v1, 0x7f0800cc

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->M:Landroid/widget/ImageButton;

    .line 689
    invoke-interface {p1, v2}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/MenuItem;->getActionView()Landroid/view/View;

    move-result-object v0

    const v1, 0x7f0800f2

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->N:Landroid/widget/ImageButton;

    .line 691
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->M:Landroid/widget/ImageButton;

    invoke-virtual {v0, p0}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 695
    iget v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->H:I

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->M:Landroid/widget/ImageButton;

    const v1, 0x7f07006a

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setImageResource(I)V

    .line 696
    :cond_0
    iget v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->H:I

    if-ne v0, v4, :cond_1

    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->M:Landroid/widget/ImageButton;

    const v1, 0x7f07006b

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setImageResource(I)V

    .line 697
    :cond_1
    iget v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->H:I

    if-ne v0, v5, :cond_2

    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->M:Landroid/widget/ImageButton;

    const v1, 0x7f070069

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setImageResource(I)V

    .line 698
    :cond_2
    iget v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->H:I

    if-ne v0, v6, :cond_3

    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->M:Landroid/widget/ImageButton;

    const v1, 0x7f07006c

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setImageResource(I)V

    .line 700
    :cond_3
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->N:Landroid/widget/ImageButton;

    if-eqz v0, :cond_8

    .line 701
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->N:Landroid/widget/ImageButton;

    invoke-virtual {v0, p0}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 702
    iget v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->I:I

    if-nez v0, :cond_4

    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->N:Landroid/widget/ImageButton;

    const v1, 0x7f07006f

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setImageResource(I)V

    .line 703
    :cond_4
    iget v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->I:I

    if-ne v0, v4, :cond_5

    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->N:Landroid/widget/ImageButton;

    const v1, 0x7f070071

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setImageResource(I)V

    .line 704
    :cond_5
    iget v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->I:I

    if-ne v0, v5, :cond_6

    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->N:Landroid/widget/ImageButton;

    const v1, 0x7f07006e

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setImageResource(I)V

    .line 705
    :cond_6
    iget v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->I:I

    if-ne v0, v6, :cond_7

    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->N:Landroid/widget/ImageButton;

    const v1, 0x7f070072

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setImageResource(I)V

    .line 706
    :cond_7
    iget v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->I:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_8

    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->N:Landroid/widget/ImageButton;

    const v1, 0x7f070070

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setImageResource(I)V

    .line 711
    :cond_8
    invoke-interface {p1, v2}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    .line 712
    invoke-interface {v0}, Landroid/view/MenuItem;->getActionView()Landroid/view/View;

    move-result-object v0

    const v1, 0x7f080068

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 713
    if-nez v0, :cond_9

    const-string v1, "wefwef222"

    invoke-static {v1}, Lcom/saterskog/b/a;->a(Ljava/lang/String;)V

    .line 714
    :cond_9
    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->J:Landroid/widget/ImageButton;

    .line 715
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->J:Landroid/widget/ImageButton;

    invoke-virtual {v0, p0}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 723
    invoke-super {p0, p1}, Landroid/support/v4/app/e;->onCreateOptionsMenu(Landroid/view/Menu;)Z

    move-result v0

    return v0

    .line 669
    :cond_a
    iget v1, p0, Lcom/saterskog/cell_lab/PlayActivity;->r:I

    if-ne v1, v3, :cond_b

    .line 670
    const v1, 0x7f0b0001

    invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    goto/16 :goto_0

    .line 672
    :cond_b
    const v1, 0x7f0b0002

    invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 673
    invoke-interface {p1, v2}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/MenuItem;->getActionView()Landroid/view/View;

    move-result-object v0

    const v1, 0x7f0800bd

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    .line 674
    new-instance v1, Lcom/saterskog/cell_lab/PlayActivity$12;

    invoke-direct {v1, p0}, Lcom/saterskog/cell_lab/PlayActivity$12;-><init>(Lcom/saterskog/cell_lab/PlayActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto/16 :goto_0
.end method

.method public onDestroy()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 123
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->y:Landroid/media/SoundPool;

    if-eqz v0, :cond_0

    .line 124
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->y:Landroid/media/SoundPool;

    invoke-virtual {v0}, Landroid/media/SoundPool;->release()V

    .line 125
    iput-object v1, p0, Lcom/saterskog/cell_lab/PlayActivity;->y:Landroid/media/SoundPool;

    .line 127
    :cond_0
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->z:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_1

    .line 128
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->z:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->release()V

    .line 129
    iput-object v1, p0, Lcom/saterskog/cell_lab/PlayActivity;->z:Landroid/media/MediaPlayer;

    .line 131
    :cond_1
    invoke-super {p0}, Landroid/support/v4/app/e;->onDestroy()V

    .line 132
    return-void
.end method

.method public final onMenuItemSelected(ILandroid/view/MenuItem;)Z
    .locals 2

    .prologue
    .line 873
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x12

    if-ge v0, v1, :cond_0

    .line 874
    invoke-interface {p2}, Landroid/view/MenuItem;->getTitleCondensed()Ljava/lang/CharSequence;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 875
    invoke-interface {p2}, Landroid/view/MenuItem;->getTitleCondensed()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, v0}, Landroid/view/MenuItem;->setTitleCondensed(Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    .line 878
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/support/v4/app/e;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    move-result v0

    return v0
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 1

    .prologue
    .line 727
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 733
    invoke-super {p0, p1}, Landroid/support/v4/app/e;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result v0

    :goto_0
    return v0

    .line 730
    :pswitch_0
    invoke-direct {p0}, Lcom/saterskog/cell_lab/PlayActivity;->i()V

    .line 731
    const/4 v0, 0x1

    goto :goto_0

    .line 727
    nop

    :pswitch_data_0
    .packed-switch 0x102002c
        :pswitch_0
    .end packed-switch
.end method

.method public onPause()V
    .locals 4

    .prologue
    .line 96
    iget v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->q:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    iget-wide v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->K:J

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    .line 97
    iget v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->q:I

    iget-wide v2, p0, Lcom/saterskog/cell_lab/PlayActivity;->K:J

    invoke-static {p0, v0, v2, v3}, Lcom/saterskog/cell_lab/j;->a(Landroid/content/Context;IJ)V

    .line 99
    :cond_0
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->z:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_1

    .line 100
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->z:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->pause()V

    .line 101
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->z:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->getCurrentPosition()I

    move-result v0

    iput v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->A:I

    .line 104
    :cond_1
    invoke-super {p0}, Landroid/support/v4/app/e;->onPause()V

    .line 105
    return-void
.end method

.method public onResume()V
    .locals 3

    .prologue
    .line 110
    iget v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->q:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 111
    invoke-static {}, Lcom/saterskog/b/a;->c()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->K:J

    .line 112
    :cond_0
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->z:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_1

    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "music"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 113
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->z:Landroid/media/MediaPlayer;

    iget v1, p0, Lcom/saterskog/cell_lab/PlayActivity;->A:I

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->seekTo(I)V

    .line 114
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->z:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V

    .line 116
    :cond_1
    invoke-super {p0}, Landroid/support/v4/app/e;->onResume()V

    .line 117
    return-void
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 618
    invoke-super {p0, p1}, Landroid/support/v4/app/e;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 619
    const-string v0, "tab"

    invoke-virtual {p0}, Lcom/saterskog/cell_lab/PlayActivity;->getActionBar()Landroid/app/ActionBar;

    move-result-object v1

    invoke-virtual {v1}, Landroid/app/ActionBar;->getSelectedNavigationIndex()I

    move-result v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 620
    const-string v0, "modeSpinner"

    iget v1, p0, Lcom/saterskog/cell_lab/PlayActivity;->H:I

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 621
    const-string v0, "toolSpinner"

    iget v1, p0, Lcom/saterskog/cell_lab/PlayActivity;->I:I

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 622
    const-string v0, "challenge"

    iget v1, p0, Lcom/saterskog/cell_lab/PlayActivity;->q:I

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 623
    const-string v0, "tutorial"

    iget v1, p0, Lcom/saterskog/cell_lab/PlayActivity;->r:I

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 624
    const-string v0, "loadChallenge"

    iget v1, p0, Lcom/saterskog/cell_lab/PlayActivity;->s:I

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 625
    const-string v0, "old"

    iget-boolean v1, p0, Lcom/saterskog/cell_lab/PlayActivity;->o:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 626
    const-string v0, "external"

    iget-boolean v1, p0, Lcom/saterskog/cell_lab/PlayActivity;->p:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 627
    const-string v0, "plateName"

    iget-object v1, p0, Lcom/saterskog/cell_lab/PlayActivity;->O:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 628
    const-string v0, "name"

    iget-object v1, p0, Lcom/saterskog/cell_lab/PlayActivity;->t:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 629
    const-string v0, "ienv"

    iget-object v1, p0, Lcom/saterskog/cell_lab/PlayActivity;->G:Lcom/saterskog/cell_lab/Environment;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 630
    const-string v0, "mUri"

    iget-object v1, p0, Lcom/saterskog/cell_lab/PlayActivity;->L:Landroid/net/Uri;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 631
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->z:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_0

    .line 632
    const-string v0, "song_pos"

    iget-object v1, p0, Lcom/saterskog/cell_lab/PlayActivity;->z:Landroid/media/MediaPlayer;

    invoke-virtual {v1}, Landroid/media/MediaPlayer;->getCurrentPosition()I

    move-result v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 633
    :cond_0
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity;->D:Ljava/io/File;

    if-eqz v0, :cond_1

    .line 634
    const-string v0, "logFile"

    iget-object v1, p0, Lcom/saterskog/cell_lab/PlayActivity;->D:Ljava/io/File;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 635
    :cond_1
    invoke-static {p1}, Lcom/saterskog/cell_lab/t;->a(Landroid/os/Bundle;)V

    .line 636
    return-void
.end method

.method public onTabReselected(Landroid/app/ActionBar$Tab;Landroid/app/FragmentTransaction;)V
    .locals 1

    .prologue
    .line 933
    invoke-virtual {p1}, Landroid/app/ActionBar$Tab;->getPosition()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/saterskog/cell_lab/PlayActivity;->c(I)V

    .line 934
    return-void
.end method

.method public onTabSelected(Landroid/app/ActionBar$Tab;Landroid/app/FragmentTransaction;)V
    .locals 1

    .prologue
    .line 937
    invoke-virtual {p1}, Landroid/app/ActionBar$Tab;->getPosition()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/saterskog/cell_lab/PlayActivity;->c(I)V

    .line 938
    return-void
.end method

.method public onTabUnselected(Landroid/app/ActionBar$Tab;Landroid/app/FragmentTransaction;)V
    .locals 1

    .prologue
    .line 941
    const/4 v0, 0x6

    invoke-virtual {p0, v0}, Lcom/saterskog/cell_lab/PlayActivity;->a(S)V

    .line 942
    return-void
.end method
