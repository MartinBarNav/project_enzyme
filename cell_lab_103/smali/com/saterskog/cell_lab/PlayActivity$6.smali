.class final Lcom/saterskog/cell_lab/PlayActivity$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/saterskog/cell_lab/PlayActivity;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/saterskog/cell_lab/p;

.field final synthetic b:I

.field final synthetic c:Lcom/saterskog/cell_lab/PlayActivity;


# direct methods
.method constructor <init>(Lcom/saterskog/cell_lab/PlayActivity;Lcom/saterskog/cell_lab/p;I)V
    .locals 0

    .prologue
    .line 1115
    iput-object p1, p0, Lcom/saterskog/cell_lab/PlayActivity$6;->c:Lcom/saterskog/cell_lab/PlayActivity;

    iput-object p2, p0, Lcom/saterskog/cell_lab/PlayActivity$6;->a:Lcom/saterskog/cell_lab/p;

    iput p3, p0, Lcom/saterskog/cell_lab/PlayActivity$6;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .prologue
    .line 1120
    :try_start_0
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity$6;->a:Lcom/saterskog/cell_lab/p;

    iget-object v0, v0, Lcom/saterskog/cell_lab/p;->a:Lcom/saterskog/cell_lab/r;

    iget-object v0, v0, Lcom/saterskog/cell_lab/r;->a:Lcom/saterskog/cell_lab/q;

    iget-object v1, p0, Lcom/saterskog/cell_lab/PlayActivity$6;->c:Lcom/saterskog/cell_lab/PlayActivity;

    invoke-virtual {v1}, Lcom/saterskog/cell_lab/PlayActivity;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v1

    iget v2, p0, Lcom/saterskog/cell_lab/PlayActivity$6;->b:I

    iget-object v3, p0, Lcom/saterskog/cell_lab/PlayActivity$6;->c:Lcom/saterskog/cell_lab/PlayActivity;

    .line 1121
    invoke-static {v2, v3}, Lcom/saterskog/cell_lab/j;->h(ILandroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    .line 1120
    invoke-virtual {v1, v2}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/saterskog/cell_lab/q;->a(Ljava/io/InputStream;I)V
    :try_end_0
    .catch Ljava/io/StreamCorruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    .line 1133
    :goto_0
    return-void

    .line 1127
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/io/StreamCorruptedException;->printStackTrace()V

    goto :goto_0

    .line 1130
    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_0
.end method
