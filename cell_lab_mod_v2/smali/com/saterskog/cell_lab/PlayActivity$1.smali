.class final Lcom/saterskog/cell_lab/PlayActivity$1;
.super Landroid/support/v4/view/ViewPager$i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/saterskog/cell_lab/PlayActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/saterskog/cell_lab/PlayActivity;


# direct methods
.method constructor <init>(Lcom/saterskog/cell_lab/PlayActivity;)V
    .locals 0

    .prologue
    .line 378
    iput-object p1, p0, Lcom/saterskog/cell_lab/PlayActivity$1;->a:Lcom/saterskog/cell_lab/PlayActivity;

    invoke-direct {p0}, Landroid/support/v4/view/ViewPager$i;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 3

    .prologue
    .line 382
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity$1;->a:Lcom/saterskog/cell_lab/PlayActivity;

    iget v0, v0, Lcom/saterskog/cell_lab/PlayActivity;->q:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 384
    packed-switch p1, :pswitch_data_0

    .line 413
    :goto_0
    return-void

    .line 387
    :pswitch_0
    const-string v0, "experiment/sample_info"

    iget-object v1, p0, Lcom/saterskog/cell_lab/PlayActivity$1;->a:Lcom/saterskog/cell_lab/PlayActivity;

    invoke-static {v0, v1}, Lcom/saterskog/b/a;->a(Ljava/lang/String;Landroid/app/Activity;)V

    goto :goto_0

    .line 390
    :pswitch_1
    const-string v0, "experiment/microscope"

    iget-object v1, p0, Lcom/saterskog/cell_lab/PlayActivity$1;->a:Lcom/saterskog/cell_lab/PlayActivity;

    invoke-static {v0, v1}, Lcom/saterskog/b/a;->a(Ljava/lang/String;Landroid/app/Activity;)V

    goto :goto_0

    .line 393
    :pswitch_2
    const-string v0, "experiment/genome_editor"

    iget-object v1, p0, Lcom/saterskog/cell_lab/PlayActivity$1;->a:Lcom/saterskog/cell_lab/PlayActivity;

    invoke-static {v0, v1}, Lcom/saterskog/b/a;->a(Ljava/lang/String;Landroid/app/Activity;)V

    goto :goto_0

    .line 399
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v0, "level:"

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity$1;->a:Lcom/saterskog/cell_lab/PlayActivity;

    invoke-static {v0}, Lcom/saterskog/cell_lab/j;->a(Landroid/content/Context;)Ljava/util/ArrayList;

    move-result-object v0

    iget-object v2, p0, Lcom/saterskog/cell_lab/PlayActivity$1;->a:Lcom/saterskog/cell_lab/PlayActivity;

    iget v2, v2, Lcom/saterskog/cell_lab/PlayActivity;->q:I

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/saterskog/cell_lab/j$a;

    iget-object v0, v0, Lcom/saterskog/cell_lab/j$a;->b:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 400
    packed-switch p1, :pswitch_data_1

    goto :goto_0

    .line 403
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

    iget-object v1, p0, Lcom/saterskog/cell_lab/PlayActivity$1;->a:Lcom/saterskog/cell_lab/PlayActivity;

    invoke-static {v0, v1}, Lcom/saterskog/b/a;->a(Ljava/lang/String;Landroid/app/Activity;)V

    goto :goto_0

    .line 406
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

    iget-object v1, p0, Lcom/saterskog/cell_lab/PlayActivity$1;->a:Lcom/saterskog/cell_lab/PlayActivity;

    invoke-static {v0, v1}, Lcom/saterskog/b/a;->a(Ljava/lang/String;Landroid/app/Activity;)V

    goto :goto_0

    .line 409
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

    iget-object v1, p0, Lcom/saterskog/cell_lab/PlayActivity$1;->a:Lcom/saterskog/cell_lab/PlayActivity;

    invoke-static {v0, v1}, Lcom/saterskog/b/a;->a(Ljava/lang/String;Landroid/app/Activity;)V

    goto/16 :goto_0

    .line 384
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch

    .line 400
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method
