.class public final Lcom/saterskog/cell_lab/PlayActivity$a;
.super Landroid/support/a/a/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/saterskog/cell_lab/PlayActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/saterskog/cell_lab/PlayActivity;


# direct methods
.method public constructor <init>(Lcom/saterskog/cell_lab/PlayActivity;Landroid/app/FragmentManager;)V
    .locals 0

    .prologue
    .line 884
    iput-object p1, p0, Lcom/saterskog/cell_lab/PlayActivity$a;->a:Lcom/saterskog/cell_lab/PlayActivity;

    .line 885
    invoke-direct {p0, p2}, Landroid/support/a/a/d;-><init>(Landroid/app/FragmentManager;)V

    .line 886
    return-void
.end method


# virtual methods
.method public final a(I)Landroid/app/Fragment;
    .locals 5

    .prologue
    const/4 v0, 0x0

    const/4 v3, -0x1

    .line 890
    packed-switch p1, :pswitch_data_0

    .line 922
    const-string v0, "skit:navigated past end"

    invoke-static {v0}, Lcom/saterskog/b/a;->a(Ljava/lang/String;)V

    .line 923
    const/4 v0, 0x0

    :goto_0
    return-object v0

    .line 892
    :pswitch_0
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity$a;->a:Lcom/saterskog/cell_lab/PlayActivity;

    iget v0, v0, Lcom/saterskog/cell_lab/PlayActivity;->q:I

    if-ne v0, v3, :cond_0

    .line 893
    new-instance v0, Lcom/saterskog/cell_lab/o;

    invoke-direct {v0}, Lcom/saterskog/cell_lab/o;-><init>()V

    goto :goto_0

    .line 896
    :cond_0
    new-instance v0, Lcom/saterskog/cell_lab/m;

    invoke-direct {v0}, Lcom/saterskog/cell_lab/m;-><init>()V

    .line 897
    iget-object v1, p0, Lcom/saterskog/cell_lab/PlayActivity$a;->a:Lcom/saterskog/cell_lab/PlayActivity;

    iget v1, v1, Lcom/saterskog/cell_lab/PlayActivity;->q:I

    iput v1, v0, Lcom/saterskog/cell_lab/m;->b:I

    goto :goto_0

    .line 901
    :pswitch_1
    new-instance v1, Lcom/saterskog/cell_lab/p;

    invoke-direct {v1}, Lcom/saterskog/cell_lab/p;-><init>()V

    .line 902
    iget-object v2, p0, Lcom/saterskog/cell_lab/PlayActivity$a;->a:Lcom/saterskog/cell_lab/PlayActivity;

    invoke-virtual {v2}, Lcom/saterskog/cell_lab/PlayActivity;->b()Ljava/io/InputStream;

    move-result-object v2

    iput-object v2, v1, Lcom/saterskog/cell_lab/p;->j:Ljava/io/InputStream;

    .line 903
    iget-object v2, p0, Lcom/saterskog/cell_lab/PlayActivity$a;->a:Lcom/saterskog/cell_lab/PlayActivity;

    iget-boolean v2, v2, Lcom/saterskog/cell_lab/PlayActivity;->o:Z

    iput-boolean v2, v1, Lcom/saterskog/cell_lab/p;->h:Z

    .line 904
    iget-object v2, p0, Lcom/saterskog/cell_lab/PlayActivity$a;->a:Lcom/saterskog/cell_lab/PlayActivity;

    iget-object v2, v2, Lcom/saterskog/cell_lab/PlayActivity;->t:Ljava/lang/String;

    iput-object v2, v1, Lcom/saterskog/cell_lab/p;->i:Ljava/lang/String;

    .line 905
    iget-object v2, p0, Lcom/saterskog/cell_lab/PlayActivity$a;->a:Lcom/saterskog/cell_lab/PlayActivity;

    iget-boolean v2, v2, Lcom/saterskog/cell_lab/PlayActivity;->p:Z

    iput-boolean v2, v1, Lcom/saterskog/cell_lab/p;->k:Z

    .line 906
    iget-object v2, p0, Lcom/saterskog/cell_lab/PlayActivity$a;->a:Lcom/saterskog/cell_lab/PlayActivity;

    iget v2, v2, Lcom/saterskog/cell_lab/PlayActivity;->q:I

    if-eq v2, v3, :cond_1

    const/4 v0, 0x1

    :cond_1
    iput-boolean v0, v1, Lcom/saterskog/cell_lab/p;->l:Z

    .line 907
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity$a;->a:Lcom/saterskog/cell_lab/PlayActivity;

    iget v0, v0, Lcom/saterskog/cell_lab/PlayActivity;->q:I

    iput v0, v1, Lcom/saterskog/cell_lab/p;->c:I

    .line 908
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity$a;->a:Lcom/saterskog/cell_lab/PlayActivity;

    iget v0, v0, Lcom/saterskog/cell_lab/PlayActivity;->s:I

    iput v0, v1, Lcom/saterskog/cell_lab/p;->d:I

    .line 909
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity$a;->a:Lcom/saterskog/cell_lab/PlayActivity;

    invoke-static {v0}, Lcom/saterskog/cell_lab/PlayActivity;->b(Lcom/saterskog/cell_lab/PlayActivity;)Lcom/saterskog/cell_lab/Environment;

    move-result-object v0

    iget-wide v2, v0, Lcom/saterskog/cell_lab/Environment;->k:D

    iput-wide v2, v1, Lcom/saterskog/cell_lab/p;->f:D

    .line 910
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity$a;->a:Lcom/saterskog/cell_lab/PlayActivity;

    invoke-static {v0}, Lcom/saterskog/cell_lab/PlayActivity;->c(Lcom/saterskog/cell_lab/PlayActivity;)I

    move-result v0

    iput v0, v1, Lcom/saterskog/cell_lab/p;->e:I

    move-object v0, v1

    .line 911
    goto :goto_0

    .line 916
    :pswitch_2
    new-instance v1, Lcom/saterskog/cell_lab/i;

    invoke-direct {v1}, Lcom/saterskog/cell_lab/i;-><init>()V

    .line 917
    iget-object v2, p0, Lcom/saterskog/cell_lab/PlayActivity$a;->a:Lcom/saterskog/cell_lab/PlayActivity;

    iget v2, v2, Lcom/saterskog/cell_lab/PlayActivity;->q:I

    iget-object v3, p0, Lcom/saterskog/cell_lab/PlayActivity$a;->a:Lcom/saterskog/cell_lab/PlayActivity;

    invoke-static {v2, v3}, Lcom/saterskog/cell_lab/j;->i(ILandroid/content/Context;)[Z

    move-result-object v2

    .line 1885
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iput-object v3, v1, Lcom/saterskog/cell_lab/i;->e:Ljava/util/ArrayList;

    .line 1886
    :goto_1
    sget-object v3, Lcom/saterskog/cell_lab/h;->B:[Lcom/saterskog/cell_lab/h;

    array-length v3, v3

    if-ge v0, v3, :cond_3

    .line 1887
    aget-boolean v3, v2, v0

    if-eqz v3, :cond_2

    iget-object v3, v1, Lcom/saterskog/cell_lab/i;->e:Ljava/util/ArrayList;

    sget-object v4, Lcom/saterskog/cell_lab/h;->B:[Lcom/saterskog/cell_lab/h;

    aget-object v4, v4, v0

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1886
    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_3
    move-object v0, v1

    .line 918
    goto/16 :goto_0

    .line 890
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public final b()I
    .locals 1

    .prologue
    .line 928
    const/4 v0, 0x3

    return v0
.end method
