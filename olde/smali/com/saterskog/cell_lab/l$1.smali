.class final Lcom/saterskog/cell_lab/l$1;
.super Landroid/support/v4/view/ViewPager$i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/saterskog/cell_lab/l;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/saterskog/cell_lab/l;


# direct methods
.method constructor <init>(Lcom/saterskog/cell_lab/l;)V
    .locals 0

    .prologue
    .line 238
    iput-object p1, p0, Lcom/saterskog/cell_lab/l$1;->a:Lcom/saterskog/cell_lab/l;

    invoke-direct {p0}, Landroid/support/v4/view/ViewPager$i;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 2

    .prologue
    .line 242
    packed-switch p1, :pswitch_data_0

    .line 257
    :goto_0
    iget-object v0, p0, Lcom/saterskog/cell_lab/l$1;->a:Lcom/saterskog/cell_lab/l;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/saterskog/cell_lab/l;->a(S)V

    .line 258
    return-void

    .line 245
    :pswitch_0
    const-string v0, "main/challenge_tab"

    iget-object v1, p0, Lcom/saterskog/cell_lab/l$1;->a:Lcom/saterskog/cell_lab/l;

    invoke-static {v0, v1}, Lcom/saterskog/b/a;->a(Ljava/lang/String;Landroid/app/Activity;)V

    goto :goto_0

    .line 248
    :pswitch_1
    const-string v0, "main/experiment_tab"

    iget-object v1, p0, Lcom/saterskog/cell_lab/l$1;->a:Lcom/saterskog/cell_lab/l;

    invoke-static {v0, v1}, Lcom/saterskog/b/a;->a(Ljava/lang/String;Landroid/app/Activity;)V

    goto :goto_0

    .line 251
    :pswitch_2
    const-string v0, "main/gene_bank_tab"

    iget-object v1, p0, Lcom/saterskog/cell_lab/l$1;->a:Lcom/saterskog/cell_lab/l;

    invoke-static {v0, v1}, Lcom/saterskog/b/a;->a(Ljava/lang/String;Landroid/app/Activity;)V

    goto :goto_0

    .line 254
    :pswitch_3
    const-string v0, "main/about_tab"

    iget-object v1, p0, Lcom/saterskog/cell_lab/l$1;->a:Lcom/saterskog/cell_lab/l;

    invoke-static {v0, v1}, Lcom/saterskog/b/a;->a(Ljava/lang/String;Landroid/app/Activity;)V

    goto :goto_0

    .line 242
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method
