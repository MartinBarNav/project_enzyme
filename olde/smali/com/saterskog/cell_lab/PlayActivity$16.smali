.class final Lcom/saterskog/cell_lab/PlayActivity$16;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/saterskog/cell_lab/PlayActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:[Ljava/lang/Integer;

.field final synthetic b:Lcom/saterskog/cell_lab/PlayActivity;


# direct methods
.method constructor <init>(Lcom/saterskog/cell_lab/PlayActivity;[Ljava/lang/Integer;)V
    .locals 0

    .prologue
    .line 1583
    iput-object p1, p0, Lcom/saterskog/cell_lab/PlayActivity$16;->b:Lcom/saterskog/cell_lab/PlayActivity;

    iput-object p2, p0, Lcom/saterskog/cell_lab/PlayActivity$16;->a:[Ljava/lang/Integer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    const/16 v3, 0xb

    .line 1586
    if-nez p2, :cond_0

    .line 1587
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity$16;->b:Lcom/saterskog/cell_lab/PlayActivity;

    invoke-static {v0}, Lcom/saterskog/cell_lab/PlayActivity;->f(Lcom/saterskog/cell_lab/PlayActivity;)V

    .line 1589
    :cond_0
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity$16;->a:[Ljava/lang/Integer;

    array-length v0, v0

    add-int/lit8 v0, v0, -0x2

    if-ne p2, v0, :cond_1

    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity$16;->b:Lcom/saterskog/cell_lab/PlayActivity;

    invoke-static {v0}, Lcom/saterskog/cell_lab/PlayActivity;->d(Lcom/saterskog/cell_lab/PlayActivity;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 1592
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity$16;->b:Lcom/saterskog/cell_lab/PlayActivity;

    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 1593
    const-string v1, "ask_sterilize_sample"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1595
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity$16;->b:Lcom/saterskog/cell_lab/PlayActivity;

    invoke-virtual {v0, v3}, Lcom/saterskog/cell_lab/PlayActivity;->a(S)V

    .line 1596
    new-instance v0, Landroid/app/AlertDialog$Builder;

    iget-object v1, p0, Lcom/saterskog/cell_lab/PlayActivity$16;->b:Lcom/saterskog/cell_lab/PlayActivity;

    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 1598
    const v1, 0x7f0e0064

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    .line 1600
    iget-object v1, p0, Lcom/saterskog/cell_lab/PlayActivity$16;->b:Lcom/saterskog/cell_lab/PlayActivity;

    const v2, 0x7f0e0066

    invoke-virtual {v1, v2}, Lcom/saterskog/cell_lab/PlayActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 1602
    iget-object v1, p0, Lcom/saterskog/cell_lab/PlayActivity$16;->b:Lcom/saterskog/cell_lab/PlayActivity;

    const v2, 0x7f0e005c

    invoke-virtual {v1, v2}, Lcom/saterskog/cell_lab/PlayActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/saterskog/cell_lab/PlayActivity$16$1;

    invoke-direct {v2, p0}, Lcom/saterskog/cell_lab/PlayActivity$16$1;-><init>(Lcom/saterskog/cell_lab/PlayActivity$16;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 1608
    iget-object v1, p0, Lcom/saterskog/cell_lab/PlayActivity$16;->b:Lcom/saterskog/cell_lab/PlayActivity;

    const v2, 0x7f0e005b

    invoke-virtual {v1, v2}, Lcom/saterskog/cell_lab/PlayActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/saterskog/cell_lab/PlayActivity$16$2;

    invoke-direct {v2, p0}, Lcom/saterskog/cell_lab/PlayActivity$16$2;-><init>(Lcom/saterskog/cell_lab/PlayActivity$16;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 1616
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    .line 1617
    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    .line 1618
    invoke-virtual {v0}, Landroid/app/AlertDialog;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const-string v2, "android:id/titleDivider"

    invoke-virtual {v1, v2, v4, v4}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    .line 1619
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 1620
    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/saterskog/cell_lab/PlayActivity$16;->b:Lcom/saterskog/cell_lab/PlayActivity;

    invoke-virtual {v1}, Lcom/saterskog/cell_lab/PlayActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f050014

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 1624
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity$16;->a:[Ljava/lang/Integer;

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    if-ne p2, v0, :cond_2

    .line 1625
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity$16;->b:Lcom/saterskog/cell_lab/PlayActivity;

    invoke-virtual {v0}, Lcom/saterskog/cell_lab/PlayActivity;->e()V

    .line 1628
    :cond_2
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity$16;->b:Lcom/saterskog/cell_lab/PlayActivity;

    invoke-virtual {v0, v3}, Lcom/saterskog/cell_lab/PlayActivity;->a(S)V

    .line 1629
    return-void

    .line 1622
    :cond_3
    iget-object v0, p0, Lcom/saterskog/cell_lab/PlayActivity$16;->b:Lcom/saterskog/cell_lab/PlayActivity;

    invoke-static {v0}, Lcom/saterskog/cell_lab/PlayActivity;->g(Lcom/saterskog/cell_lab/PlayActivity;)V

    goto :goto_0
.end method
