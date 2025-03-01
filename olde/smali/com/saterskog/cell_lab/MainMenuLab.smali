.class public Lcom/saterskog/cell_lab/MainMenuLab;
.super Lcom/saterskog/cell_lab/l;
.source "SourceFile"

# interfaces
.implements Lcom/saterskog/cell_lab/s$a;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 10
    invoke-direct {p0}, Lcom/saterskog/cell_lab/l;-><init>()V

    return-void
.end method


# virtual methods
.method final a(I)Landroid/app/Fragment;
    .locals 1

    .prologue
    .line 17
    packed-switch p1, :pswitch_data_0

    .line 32
    const-string v0, "skit:navigated past end"

    invoke-static {v0}, Lcom/saterskog/b/a;->a(Ljava/lang/String;)V

    .line 33
    const/4 v0, 0x0

    :goto_0
    return-object v0

    .line 19
    :pswitch_0
    new-instance v0, Lcom/saterskog/cell_lab/k;

    invoke-direct {v0}, Lcom/saterskog/cell_lab/k;-><init>()V

    goto :goto_0

    .line 21
    :pswitch_1
    new-instance v0, Lcom/saterskog/cell_lab/f;

    invoke-direct {v0}, Lcom/saterskog/cell_lab/f;-><init>()V

    goto :goto_0

    .line 23
    :pswitch_2
    new-instance v0, Lcom/saterskog/cell_lab/g;

    invoke-direct {v0}, Lcom/saterskog/cell_lab/g;-><init>()V

    goto :goto_0

    .line 25
    :pswitch_3
    new-instance v0, Lcom/saterskog/cell_lab/a;

    invoke-direct {v0}, Lcom/saterskog/cell_lab/a;-><init>()V

    iput-object v0, p0, Lcom/saterskog/cell_lab/MainMenuLab;->h:Lcom/saterskog/cell_lab/a;

    .line 26
    iget-object v0, p0, Lcom/saterskog/cell_lab/MainMenuLab;->h:Lcom/saterskog/cell_lab/a;

    goto :goto_0

    .line 28
    :pswitch_4
    new-instance v0, Lcom/saterskog/cell_lab/s;

    invoke-direct {v0}, Lcom/saterskog/cell_lab/s;-><init>()V

    goto :goto_0

    .line 17
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_4
        :pswitch_3
    .end packed-switch
.end method

.method final b(I)Ljava/lang/String;
    .locals 1

    .prologue
    .line 44
    packed-switch p1, :pswitch_data_0

    .line 56
    const/4 v0, 0x0

    :goto_0
    return-object v0

    .line 46
    :pswitch_0
    const v0, 0x7f0e00d8

    invoke-virtual {p0, v0}, Lcom/saterskog/cell_lab/MainMenuLab;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 48
    :pswitch_1
    const v0, 0x7f0e00d9

    invoke-virtual {p0, v0}, Lcom/saterskog/cell_lab/MainMenuLab;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 50
    :pswitch_2
    const v0, 0x7f0e00da

    invoke-virtual {p0, v0}, Lcom/saterskog/cell_lab/MainMenuLab;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 52
    :pswitch_3
    const v0, 0x7f0e00d7

    invoke-virtual {p0, v0}, Lcom/saterskog/cell_lab/MainMenuLab;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 54
    :pswitch_4
    const v0, 0x7f0e00db

    invoke-virtual {p0, v0}, Lcom/saterskog/cell_lab/MainMenuLab;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 44
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_4
        :pswitch_3
    .end packed-switch
.end method
