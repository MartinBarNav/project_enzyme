.class public final Lcom/saterskog/cell_lab/a;
.super Landroid/app/Fragment;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 31
    invoke-direct {p0}, Landroid/app/Fragment;-><init>()V

    return-void
.end method

.method private a(Landroid/view/View;I)V
    .locals 1

    .prologue
    .line 165
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 166
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 87
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/a;->getActivity()Landroid/app/Activity;

    move-result-object v0

    if-nez v0, :cond_0

    .line 163
    :goto_0
    return-void

    .line 88
    :cond_0
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/saterskog/cell_lab/a$1;

    invoke-direct {v1, p0}, Lcom/saterskog/cell_lab/a$1;-><init>(Lcom/saterskog/cell_lab/a;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 162
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    goto :goto_0
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 7

    .prologue
    const v4, 0x7f0800d5

    .line 169
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 210
    :goto_0
    :pswitch_0
    return-void

    .line 171
    :pswitch_1
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/a;->a()V

    .line 172
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/a;->getActivity()Landroid/app/Activity;

    move-result-object v0

    check-cast v0, Lcom/saterskog/cell_lab/l;

    .line 173
    invoke-virtual {v0}, Lcom/saterskog/cell_lab/l;->a()V

    goto :goto_0

    .line 176
    :pswitch_2
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/a;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Lcom/saterskog/b/a;->b(Landroid/content/Context;)J

    move-result-wide v4

    .line 177
    const-string v1, "button"

    const-string v2, "rate"

    invoke-static {v4, v5}, Lcom/saterskog/b/a;->a(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lcom/saterskog/cell_lab/a;->getActivity()Landroid/app/Activity;

    move-result-object v6

    invoke-static/range {v1 .. v6}, Lcom/saterskog/b/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLandroid/app/Activity;)V

    .line 178
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 179
    const-string v1, "market://details?id=com.saterskog.cell_lab"

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 182
    invoke-virtual {p0, v0}, Lcom/saterskog/cell_lab/a;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    .line 185
    :pswitch_3
    new-instance v1, Landroid/app/AlertDialog$Builder;

    invoke-virtual {p0}, Lcom/saterskog/cell_lab/a;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-direct {v1, v0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 187
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/a;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    .line 188
    const v2, 0x7f0a0017

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    .line 189
    const v0, 0x7f0800e9

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v3, 0x7f0e0010

    invoke-virtual {p0, v3}, Lcom/saterskog/cell_lab/a;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 190
    invoke-virtual {v2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v3, 0x7f0e0015

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(I)V

    .line 196
    invoke-virtual {v2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-static {}, Landroid/text/method/LinkMovementMethod;->getInstance()Landroid/text/method/MovementMethod;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    .line 199
    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 202
    const v0, 0x7f0e005d

    invoke-virtual {p0, v0}, Lcom/saterskog/cell_lab/a;->getString(I)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Lcom/saterskog/cell_lab/a$2;

    invoke-direct {v2, p0}, Lcom/saterskog/cell_lab/a$2;-><init>(Lcom/saterskog/cell_lab/a;)V

    invoke-virtual {v1, v0, v2}, Landroid/app/AlertDialog$Builder;->setNeutralButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 208
    invoke-virtual {v1}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    goto/16 :goto_0

    .line 169
    nop

    :pswitch_data_0
    .packed-switch 0x7f080016
        :pswitch_3
        :pswitch_0
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public final onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 7

    .prologue
    const v6, 0x7f080019

    const/4 v1, 0x0

    .line 36
    const v0, 0x7f0a001f

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    .line 38
    const v0, 0x7f0800ce

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 39
    if-eqz v0, :cond_0

    .line 42
    :try_start_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/saterskog/cell_lab/a;->getActivity()Landroid/app/Activity;

    move-result-object v3

    const v4, 0x7f0e0013

    invoke-virtual {v3, v4}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 43
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/a;->getActivity()Landroid/app/Activity;

    move-result-object v3

    invoke-virtual {v3}, Landroid/app/Activity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v3

    invoke-virtual {p0}, Lcom/saterskog/cell_lab/a;->getActivity()Landroid/app/Activity;

    move-result-object v4

    invoke-virtual {v4}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    invoke-virtual {v3, v4, v5}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v3

    iget-object v3, v3, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 42
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_1

    .line 55
    :cond_0
    :goto_0
    const v0, 0x7f0800e5

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 56
    const v2, 0x7f0e0087

    invoke-virtual {p0, v2}, Lcom/saterskog/cell_lab/a;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 57
    invoke-static {}, Landroid/text/method/LinkMovementMethod;->getInstance()Landroid/text/method/MovementMethod;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    .line 59
    const v0, 0x7f0800e6

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 60
    const v2, 0x7f0e01b5

    invoke-virtual {p0, v2}, Lcom/saterskog/cell_lab/a;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 61
    invoke-static {}, Landroid/text/method/LinkMovementMethod;->getInstance()Landroid/text/method/MovementMethod;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    .line 63
    const v0, 0x7f0800e7

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 64
    const v2, 0x7f0e01b2

    invoke-virtual {p0, v2}, Lcom/saterskog/cell_lab/a;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 65
    invoke-static {}, Landroid/text/method/LinkMovementMethod;->getInstance()Landroid/text/method/MovementMethod;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    .line 67
    const-string v0, "4"

    invoke-virtual {p0}, Lcom/saterskog/cell_lab/a;->getActivity()Landroid/app/Activity;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/saterskog/cell_lab/j;->b(Ljava/lang/String;Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 68
    invoke-virtual {v1, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Landroid/widget/Button;->setVisibility(I)V

    .line 72
    :goto_1
    const v0, 0x7f080016

    invoke-direct {p0, v1, v0}, Lcom/saterskog/cell_lab/a;->a(Landroid/view/View;I)V

    .line 73
    const v0, 0x7f08001a

    invoke-direct {p0, v1, v0}, Lcom/saterskog/cell_lab/a;->a(Landroid/view/View;I)V

    .line 77
    return-object v1

    .line 47
    :catch_0
    move-exception v0

    invoke-static {v0}, Lcom/saterskog/b/a;->a(Ljava/lang/Throwable;)V

    goto/16 :goto_0

    .line 50
    :catch_1
    move-exception v0

    invoke-static {v0}, Lcom/saterskog/b/a;->a(Ljava/lang/Throwable;)V

    goto/16 :goto_0

    .line 70
    :cond_1
    invoke-direct {p0, v1, v6}, Lcom/saterskog/cell_lab/a;->a(Landroid/view/View;I)V

    goto :goto_1
.end method

.method public final onResume()V
    .locals 0

    .prologue
    .line 83
    invoke-super {p0}, Landroid/app/Fragment;->onResume()V

    .line 84
    invoke-virtual {p0}, Lcom/saterskog/cell_lab/a;->a()V

    .line 85
    return-void
.end method
